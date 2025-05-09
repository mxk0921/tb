package anet.channel;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import anet.channel.SessionParamStat;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.detect.Ipv6Detector;
import anet.channel.detect.WifiDetector;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ConnType;
import anet.channel.entity.Event;
import anet.channel.entity.EventCb;
import anet.channel.entity.EventType;
import anet.channel.entity.ProtocolType;
import anet.channel.entity.SessionType;
import anet.channel.flow.INetworkAnalysis;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.quic.Http3ConnectionDetector;
import anet.channel.session.HttpSession;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.SessionConnStat;
import anet.channel.statist.SessionStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyInstance;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.Utils;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ComplexUtils;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.Inet64Util;
import anet.channel.util.SessionSeq;
import anet.channel.util.StringUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.gl4;
import tb.hxj;
import tb.pg1;
import tb.t2o;
import tb.v4s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SessionRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.SessionRequest";
    public volatile Future complexFuture;
    public volatile Session connectingComplexSession;
    public volatile Session connectingMultiSession;
    public volatile Session connectingSession;
    private boolean isContainHttp3;
    private String mHost;
    private String mRealHost;
    private SessionPool retryReqSessionPool;
    private SessionCenter sessionCenter;
    public volatile SessionComplexTask sessionComplexTask;
    private SessionInfo sessionInfo;
    private SessionPool sessionPool;
    private volatile Future timeoutTask;
    public volatile boolean isToClose = false;
    public volatile boolean isForceCellular = false;
    private AtomicBoolean mOneCreating = new AtomicBoolean(false);
    private HashMap<SessionGetCallback, SessionGetWaitTimeoutTask> callbackTaskMap = new HashMap<>();
    public SessionConnStat connStat = null;
    private Object locked = new Object();
    private AtomicBoolean isSuccess = new AtomicBoolean(false);
    private AtomicBoolean mConnecting = new AtomicBoolean(false);
    private AtomicBoolean isGetPubKeyFail = new AtomicBoolean(false);
    private int hashCode = hashCode();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class ConnectTimeoutTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String seq;

        static {
            t2o.a(607125547);
        }

        public ConnectTimeoutTask(String str) {
            this.seq = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (SessionRequest.access$000(SessionRequest.this).get()) {
                ALog.e(SessionRequest.TAG, "Connecting timeout!!! reset status!", this.seq, new Object[0]);
                SessionConnStat sessionConnStat = SessionRequest.this.connStat;
                sessionConnStat.ret = 2;
                sessionConnStat.totalTime = System.currentTimeMillis() - SessionRequest.this.connStat.start;
                if (SessionRequest.this.connectingSession != null) {
                    SessionRequest.this.connectingSession.tryNextWhenFail = false;
                    SessionRequest.this.connectingSession.close("Connecting timeout");
                    SessionRequest sessionRequest = SessionRequest.this;
                    sessionRequest.connStat.syncValueFromSession(sessionRequest.connectingSession);
                }
                if (SessionRequest.this.connectingComplexSession != null) {
                    SessionRequest.this.connectingComplexSession.tryNextWhenFail = false;
                    SessionRequest.this.connectingComplexSession.close("Connecting timeout");
                }
                AppMonitor.getInstance().commitStat(SessionRequest.this.connStat);
                SessionRequest.this.setConnecting(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface IConnCb {
        void onDisConnect(Session session, long j, int i, int i2);

        void onFailed(Session session, long j, int i, int i2);

        void onSuccess(Session session, long j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface IOneSessionConnCb {
        void onCreateSessionFinish();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class SessionComplexTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private List<ConnInfo> connInfoList;
        private Context context;
        private int protocolType;
        private SessionRequest sessionRequest;
        private int sessionType;
        private SessionParamStat stat;

        static {
            t2o.a(607125550);
        }

        public SessionComplexTask(SessionRequest sessionRequest, Context context, SessionRequest sessionRequest2, int i, List<ConnInfo> list, SessionParamStat sessionParamStat) {
            this(context, sessionRequest2, i, ProtocolType.ALL, list, sessionParamStat);
        }

        public SessionComplexTask(Context context, SessionRequest sessionRequest, int i, int i2, List<ConnInfo> list, SessionParamStat sessionParamStat) {
            new ArrayList();
            this.context = context;
            this.sessionRequest = sessionRequest;
            this.sessionType = i;
            this.protocolType = i2;
            this.connInfoList = list;
            this.stat = sessionParamStat;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SessionParamStat sessionParamStat = this.stat;
            if (sessionParamStat == null) {
                str = "";
            } else {
                str = sessionParamStat.req;
            }
            if (SessionRequest.access$500(SessionRequest.this).getSession(this.sessionRequest, this.sessionType, this.protocolType, this.stat) != null) {
                ALog.e(SessionRequest.TAG, "SessionComplexTask cancel,  already connect successfully", null, "host", SessionRequest.access$200(SessionRequest.this), "reqSeq", str);
                return;
            }
            List<ConnInfo> list = this.connInfoList;
            if (list == null || list.size() <= 0) {
                ALog.e(SessionRequest.TAG, "SessionComplexTask cancel,  conn list is null", null, "host", SessionRequest.access$200(SessionRequest.this), "reqSeq", str);
                return;
            }
            ConnInfo remove = this.connInfoList.remove(0);
            ALog.e(SessionRequest.TAG, "SessionComplexTask run :" + remove.toString(), remove.getSeq(), "host", SessionRequest.access$200(SessionRequest.this), "reqSeq", str);
            SessionRequest.this.createComplexSession(this.context, remove, new ConnCb(this.context, this.connInfoList, remove, this.stat), remove.getSeq(), true, this.stat);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class SessionGetWaitTimeoutTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public SessionGetCallback cb;
        public AtomicBoolean isFinish = new AtomicBoolean(false);

        static {
            t2o.a(607125551);
        }

        public SessionGetWaitTimeoutTask(SessionGetCallback sessionGetCallback) {
            this.cb = null;
            this.cb = sessionGetCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.isFinish.compareAndSet(false, true)) {
                ALog.e(SessionRequest.TAG, "get session timeout", null, new Object[0]);
                synchronized (SessionRequest.access$100(SessionRequest.this)) {
                    SessionRequest.access$100(SessionRequest.this).remove(this.cb);
                }
                this.cb.onSessionGetFail();
            }
        }
    }

    static {
        t2o.a(607125541);
    }

    public SessionRequest(String str, SessionCenter sessionCenter) {
        this.mHost = str;
        String substring = str.substring(str.indexOf(HttpConstant.SCHEME_SPLIT) + 3);
        this.mRealHost = substring;
        this.sessionCenter = sessionCenter;
        this.sessionInfo = sessionCenter.attributeManager.getSessionInfo(substring);
        this.sessionPool = sessionCenter.sessionPool;
        this.retryReqSessionPool = sessionCenter.retryReqSessionPool;
    }

    public static /* synthetic */ AtomicBoolean access$000(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("69ea452", new Object[]{sessionRequest});
        }
        return sessionRequest.mConnecting;
    }

    public static /* synthetic */ HashMap access$100(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("29777914", new Object[]{sessionRequest});
        }
        return sessionRequest.callbackTaskMap;
    }

    public static /* synthetic */ void access$1000(SessionRequest sessionRequest, String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d72f6b17", new Object[]{sessionRequest, str, str2, new Boolean(z), new Boolean(z2)});
        } else {
            sessionRequest.updateForceCell(str, str2, z, z2);
        }
    }

    public static /* synthetic */ void access$1100(SessionRequest sessionRequest, Context context, ConnInfo connInfo, IConnCb iConnCb, String str, boolean z, int i, IOneSessionConnCb iOneSessionConnCb, SessionParamStat sessionParamStat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10506d2", new Object[]{sessionRequest, context, connInfo, iConnCb, str, new Boolean(z), new Integer(i), iOneSessionConnCb, sessionParamStat});
        } else {
            sessionRequest.createSession(context, connInfo, iConnCb, str, z, i, iOneSessionConnCb, sessionParamStat);
        }
    }

    public static /* synthetic */ AtomicBoolean access$1200(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("c636ef81", new Object[]{sessionRequest});
        }
        return sessionRequest.isSuccess;
    }

    public static /* synthetic */ void access$1300(SessionRequest sessionRequest, Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf3f0cf8", new Object[]{sessionRequest, session});
        } else {
            sessionRequest.commitSuccess(session);
        }
    }

    public static /* synthetic */ SessionInfo access$1400(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionInfo) ipChange.ipc$dispatch("d044f601", new Object[]{sessionRequest});
        }
        return sessionRequest.sessionInfo;
    }

    public static /* synthetic */ SessionCenter access$1600(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionCenter) ipChange.ipc$dispatch("6db12ebc", new Object[]{sessionRequest});
        }
        return sessionRequest.sessionCenter;
    }

    public static /* synthetic */ AtomicBoolean access$1700(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("433d879c", new Object[]{sessionRequest});
        }
        return sessionRequest.mOneCreating;
    }

    public static /* synthetic */ String access$1800(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb640445", new Object[]{sessionRequest});
        }
        return sessionRequest.mHost;
    }

    public static /* synthetic */ void access$1900(SessionRequest sessionRequest, Session session, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba191b", new Object[]{sessionRequest, session, new Integer(i), str});
        } else {
            sessionRequest.sendConnectInfoToAccs(session, i, str);
        }
    }

    public static /* synthetic */ String access$200(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f18a850", new Object[]{sessionRequest});
        }
        return sessionRequest.mRealHost;
    }

    public static /* synthetic */ AtomicBoolean access$300(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("51a2992f", new Object[]{sessionRequest});
        }
        return sessionRequest.isGetPubKeyFail;
    }

    public static /* synthetic */ SessionPool access$400(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionPool) ipChange.ipc$dispatch("b52b5c64", new Object[]{sessionRequest});
        }
        return sessionRequest.retryReqSessionPool;
    }

    public static /* synthetic */ SessionPool access$500(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionPool) ipChange.ipc$dispatch("6fa0fce5", new Object[]{sessionRequest});
        }
        return sessionRequest.sessionPool;
    }

    public static /* synthetic */ void access$600(SessionRequest sessionRequest, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc3c1488", new Object[]{sessionRequest, new Boolean(z)});
        } else {
            sessionRequest.finish(z);
        }
    }

    public static /* synthetic */ void access$700(SessionRequest sessionRequest, Session session, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91bcaa3", new Object[]{sessionRequest, session, new Integer(i), new Integer(i2)});
        } else {
            sessionRequest.commitFail(session, i, i2);
        }
    }

    public static /* synthetic */ List access$800(SessionRequest sessionRequest, int i, int i2, String str, boolean z, SessionParamStat sessionParamStat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7e5b7290", new Object[]{sessionRequest, new Integer(i), new Integer(i2), str, new Boolean(z), sessionParamStat});
        }
        return sessionRequest.getAvailStrategy(i, i2, str, z, sessionParamStat);
    }

    public static /* synthetic */ List access$900(SessionRequest sessionRequest, List list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9bd822a3", new Object[]{sessionRequest, list, str});
        }
        return sessionRequest.getConnInfoList(list, str);
    }

    private void createMultiSession(Context context, List<ConnInfo> list, SessionParamStat sessionParamStat) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4d60de", new Object[]{this, context, list, sessionParamStat});
            return;
        }
        try {
            if (GlobalAppRuntimeInfo.getSessionIndex(this.mRealHost) == 1) {
                i = 2;
            } else {
                i = 1;
            }
            if (list != null && !list.isEmpty()) {
                ConnInfo remove = list.remove(0);
                createSession(context, remove, new ConnCb(context, list, remove, sessionParamStat), remove.getSeq(), true, i, null, sessionParamStat);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[multiConnect] [createMultiSession] fail = " + th.toString(), null, new Object[0]);
        }
    }

    private TnetSpdySession createTnetSpdySession(Context context, ConnInfo connInfo, String str, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TnetSpdySession) ipChange.ipc$dispatch("3947a6ff", new Object[]{this, context, connInfo, str, new Boolean(z), new Integer(i)});
        }
        ConnType connType = connInfo.getConnType();
        if (context == null || connType.isHttpType()) {
            return null;
        }
        TnetSpdySession tnetSpdySession = new TnetSpdySession(context, connInfo);
        tnetSpdySession.setForceCellular(this.isForceCellular);
        tnetSpdySession.initConfig(this.sessionCenter.config);
        SessionInfo sessionInfo = this.sessionCenter.attributeManager.getSessionInfo(this.mRealHost);
        this.sessionInfo = sessionInfo;
        tnetSpdySession.initSessionInfo(sessionInfo);
        tnetSpdySession.setTnetPublicKey(this.sessionCenter.attributeManager.getPublicKey(this.mRealHost));
        if (this.isGetPubKeyFail.get()) {
            tnetSpdySession.forcePubKeyMode.set(1);
        }
        IStrategyInstance instance = StrategyCenter.getInstance();
        SessionStatistic sessionStatistic = tnetSpdySession.mSessionStat;
        sessionStatistic.xqcConnEnv += "-isStrategyExistHttp3=" + instance.isContainHttp3() + "-isContainHttp3=" + this.isContainHttp3;
        if (z) {
            GlobalAppRuntimeInfo.updateSessionIndex(str, this.mRealHost);
        }
        if (i > 0) {
            tnetSpdySession.mSeq += "_" + i;
            tnetSpdySession.countIndex.set(i);
        }
        if (!connType.isHTTP3()) {
            return tnetSpdySession;
        }
        tnetSpdySession.detectHttp3Status = instance.getDetectHttp3Status();
        return tnetSpdySession;
    }

    private void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else {
            finish(false);
        }
    }

    private List<ConnInfo> getConnInfoList(List<IConnStrategy> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c62dcb57", new Object[]{this, list, str});
        }
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.isContainHttp3 = false;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            IConnStrategy iConnStrategy = list.get(i2);
            int retryTimes = iConnStrategy.getRetryTimes();
            for (int i3 = 0; i3 <= retryTimes; i3++) {
                i++;
                String host = getHost();
                ConnInfo connInfo = new ConnInfo(host, str + "_" + i, iConnStrategy);
                connInfo.retryTime = i3;
                connInfo.maxRetryTime = retryTimes;
                arrayList.add(connInfo);
                if (connInfo.getConnType().isHTTP3()) {
                    this.isContainHttp3 = true;
                }
            }
        }
        return arrayList;
    }

    private void registerEvent(final Session session, final IConnCb iConnCb, final long j, String str, final IOneSessionConnCb iOneSessionConnCb, final SessionParamStat sessionParamStat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8ad8d9", new Object[]{this, session, iConnCb, new Long(j), str, iOneSessionConnCb, sessionParamStat});
        } else if (iConnCb != null) {
            session.registerEventcb(EventType.ALL, new EventCb() { // from class: anet.channel.SessionRequest.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.entity.EventCb
                public void onEvent(Session session2, int i, Event event) {
                    String str2;
                    int i2;
                    String str3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("786c54ab", new Object[]{this, session2, new Integer(i), event});
                    } else if (session2 != null) {
                        SessionParamStat sessionParamStat2 = sessionParamStat;
                        String str4 = "";
                        String str5 = sessionParamStat2 == null ? str4 : sessionParamStat2.req;
                        boolean z = sessionParamStat2 != null && sessionParamStat2.isRetry;
                        int i3 = event == null ? 0 : event.errorCode;
                        if (event != null) {
                            str4 = event.errorDetail;
                        }
                        if (i == 2) {
                            ALog.e(SessionRequest.TAG, null, session2.mSeq, "Session", session2, "EventType", Integer.valueOf(i), pg1.ATOM_EXT_Event, event, "reqSeq", str5, v4s.PARAM_IS_RETRY, Boolean.valueOf(z));
                            if ((!z || !SessionRequest.access$400(SessionRequest.this).containsValue(SessionRequest.this, session2)) && (z || !SessionRequest.access$500(SessionRequest.this).containsValue(SessionRequest.this, session2))) {
                                str2 = str4;
                                i2 = 0;
                                iConnCb.onFailed(session2, j, i, i3);
                                str3 = "[multiConnect] onFailed -->";
                            } else {
                                i2 = 0;
                                str2 = str4;
                                iConnCb.onDisConnect(session2, j, i, i3);
                                str3 = "[multiConnect] DISCONNECTED -->";
                            }
                            if (iOneSessionConnCb != null) {
                                ALog.e(SessionRequest.TAG, str3.concat(" onCreateSessionFinish"), session2.mSeq, new Object[i2]);
                                iOneSessionConnCb.onCreateSessionFinish();
                            }
                            if (SessionRequest.access$1400(SessionRequest.this) != null && SessionRequest.access$1400(SessionRequest.this).isAccs && SessionRequest.access$500(SessionRequest.this).getSession(SessionRequest.access$1600(SessionRequest.this).getSessionRequest(StringUtils.concatString("https", HttpConstant.SCHEME_SPLIT, SessionRequest.access$1400(SessionRequest.this).host))) == null) {
                                SessionRequest.access$1900(SessionRequest.this, session2, i3, str2);
                            } else if (SessionRequest.access$1400(SessionRequest.this) != null && SessionRequest.access$1400(SessionRequest.this).isAccs) {
                                String str6 = session2.mSeq;
                                Object[] objArr = new Object[2];
                                objArr[i2] = "reqSeq";
                                objArr[1] = str5;
                                ALog.e(SessionRequest.TAG, "[disconnected] sessionPool has accs session, will not send msg to accs!", str6, objArr);
                            }
                        } else if (i == 256) {
                            ALog.d(SessionRequest.TAG, null, session2.mSeq, "Session", session2, "EventType", Integer.valueOf(i), pg1.ATOM_EXT_Event, event, "reqSeq", str5);
                            iConnCb.onFailed(session2, j, i, i3);
                            if (iOneSessionConnCb != null) {
                                ALog.e(SessionRequest.TAG, "[multiConnect] CONNECT_FAIL --> onCreateSessionFinish", session2.mSeq, "reqSeq", str5);
                                iOneSessionConnCb.onCreateSessionFinish();
                            }
                        } else if (i == 512) {
                            ALog.d(SessionRequest.TAG, null, session2.mSeq, "Session", session2, "EventType", Integer.valueOf(i), pg1.ATOM_EXT_Event, event, "reqSeq", str5);
                            if (SessionRequest.access$1400(SessionRequest.this) != null && SessionRequest.access$1400(SessionRequest.this).isAccs) {
                                List<Session> availableSessions = SessionRequest.access$500(SessionRequest.this).getAvailableSessions(SessionRequest.this);
                                if (availableSessions == null || availableSessions.isEmpty()) {
                                    SessionRequest.access$1900(SessionRequest.this, session2, 0, null);
                                } else {
                                    ALog.e(SessionRequest.TAG, "[connected]sessionPool has accs session, will not send msg to accs!", session2.mSeq, "size", Integer.valueOf(availableSessions.size()), "reqSeq", str5);
                                }
                            }
                            iConnCb.onSuccess(session2, j);
                            if (iOneSessionConnCb != null) {
                                ALog.e(SessionRequest.TAG, "[multiConnect] AUTH_SUCC --> onCreateSessionFinish", session2.mSeq, "reqSeq", str5);
                                iOneSessionConnCb.onCreateSessionFinish();
                            }
                        }
                    }
                }
            });
            session.registerEventcb(1792, new EventCb() { // from class: anet.channel.SessionRequest.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.entity.EventCb
                public void onEvent(Session session2, int i, Event event) {
                    int i2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("786c54ab", new Object[]{this, session2, new Integer(i), event});
                        return;
                    }
                    ALog.d(SessionRequest.TAG, "Receive session event", null, "eventType", Integer.valueOf(i));
                    ConnEvent connEvent = new ConnEvent();
                    if (i == 512) {
                        connEvent.isSuccess = true;
                    }
                    if (SessionRequest.access$1400(SessionRequest.this) != null) {
                        connEvent.isAccs = SessionRequest.access$1400(SessionRequest.this).isAccs;
                    }
                    Session session3 = session;
                    connEvent.isTunnel = session3.isTunnel;
                    connEvent.isForceCell = session3.forceCellular;
                    if (!session2.mSessionStat.isReported) {
                        ALog.e(SessionRequest.TAG, "isReported is false!,we will not report to StrategyCenter", session3.mSeq, new Object[0]);
                    } else if (!AwcnConfig.isBgSocketEnable() || !GlobalAppRuntimeInfo.isAppBackground() || event == null || !((i2 = event.errorCode) == -2301 || i2 == -2611)) {
                        connEvent.useProxyStrategy = session.useProxyStrategy;
                        StrategyCenter.getInstance().notifyConnEvent(session.getRealHost(), session.getConnStrategy(), connEvent);
                    } else {
                        ALog.e(SessionRequest.TAG, "[bg_socket_opt]no socket read and write permissions in the background！not update strategyCenter", session.mSeq, "errorCode", Integer.valueOf(i2));
                    }
                }
            });
        }
    }

    private void sendConnectInfoToAccs(Session session, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492a5711", new Object[]{this, session, new Integer(i), str});
        } else {
            sendConnectInfoToAccsByCallBack(session, i, str, true, AwcnConfig.isSendConnectInfoByService());
        }
    }

    private void updateForceCell(String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c26e8ff", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2)});
        } else if (z2) {
            this.isForceCellular = false;
            ALog.e(TAG, "[updateForceCell] session set force cur net!", str, "reqSeq", str2, "isForceCurNetwork", Boolean.valueOf(z2), "isForceCell", Boolean.valueOf(z));
        } else if (AwcnConfig.isBgNotForceCellOptOpened() && GlobalAppRuntimeInfo.isAppBackground()) {
            this.isForceCellular = false;
            ALog.e(TAG, "[updateForceCell] isBgNotForceCellOptOpened is true, session bg not allow set force cell!", str, "reqSeq", str2);
        } else if (z || WifiDetector.isForceCell(this.mRealHost, str)) {
            this.isForceCellular = true;
            ALog.e(TAG, "[updateForceCell] session set force cell!", str, "reqSeq", str2, "isForceCell", Boolean.valueOf(z));
        } else {
            this.isForceCellular = false;
        }
    }

    public int getConnectingProtocolType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80c9203a", new Object[]{this})).intValue();
        }
        Session session = this.connectingSession;
        if (session != null) {
            return session.mConnType.getProtocolType();
        }
        return -1;
    }

    public int getConnectingType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc6af382", new Object[]{this})).intValue();
        }
        Session session = this.connectingSession;
        if (session != null) {
            return session.mConnType.getType();
        }
        return -1;
    }

    public String getHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9fd6f9b", new Object[]{this});
        }
        return this.mHost;
    }

    public String getRealHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89622e9d", new Object[]{this});
        }
        return this.mRealHost;
    }

    public void setConnecting(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a1eb3", new Object[]{this, new Boolean(z)});
        } else {
            setConnecting(z, false);
        }
    }

    public synchronized void setForceCellular(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d16da", new Object[]{this, new Boolean(z)});
        } else {
            this.isForceCellular = z;
        }
    }

    public synchronized void start(Context context, int i, int i2, String str, SessionGetCallback sessionGetCallback, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea301d0", new Object[]{this, context, new Integer(i), new Integer(i2), str, sessionGetCallback, new Long(j)});
        } else {
            start(context, i, i2, str, sessionGetCallback, j, null);
        }
    }

    public synchronized void startAsync(Context context, int i, String str, SessionGetCallback sessionGetCallback, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b33d086d", new Object[]{this, context, new Integer(i), str, sessionGetCallback, new Long(j)});
        } else {
            startAsync(context, i, str, sessionGetCallback, j, false, null);
        }
    }

    private void finish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d82167a", new Object[]{this, new Boolean(z)});
            return;
        }
        setConnecting(false, z);
        synchronized (this.locked) {
            this.locked.notifyAll();
        }
    }

    private boolean isStrategyInvalid(IConnStrategy iConnStrategy, String str) {
        boolean z;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44594d23", new Object[]{this, iConnStrategy, str})).booleanValue();
        }
        try {
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        if (iConnStrategy == null) {
            ALog.e(TAG, "[retry opt] strategy is null, isStrategyInvalid = false ", str, new Object[0]);
            return false;
        }
        Map<String, Object> commonInfo = iConnStrategy.getCommonInfo();
        if (commonInfo != null) {
            boolean equalsIgnoreCase = "true".equalsIgnoreCase((String) commonInfo.get("isStrategyInvalid"));
            try {
                ALog.e(TAG, "[retry opt] isStrategyInvalid = " + equalsIgnoreCase, str, new Object[0]);
                return equalsIgnoreCase;
            } catch (Throwable th3) {
                th = th3;
                z = equalsIgnoreCase;
                ALog.e(TAG, "[retry opt] isStrategyInvalid error = " + th.toString(), str, new Object[0]);
                ALog.e(TAG, "[retry opt] final isStrategyInvalid = " + z, str, new Object[0]);
                return z;
            }
        } else {
            z = false;
            ALog.e(TAG, "[retry opt] final isStrategyInvalid = " + z, str, new Object[0]);
            return z;
        }
    }

    private void sessionConnect(TnetSpdySession tnetSpdySession, ConnInfo connInfo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7aecf14", new Object[]{this, tnetSpdySession, connInfo, new Integer(i)});
            return;
        }
        if (i == 1) {
            this.connectingMultiSession.connect();
        } else {
            this.connectingSession.connect();
        }
        SessionConnStat sessionConnStat = this.connStat;
        sessionConnStat.retryTimes++;
        sessionConnStat.startConnect = System.currentTimeMillis();
        if (tnetSpdySession != null) {
            this.connStat.xquicErrorCode = tnetSpdySession.getErrorCode();
            this.connStat.putExtra("tnetExternStat", tnetSpdySession.getTnetExternStatMsg());
        }
        SessionConnStat sessionConnStat2 = this.connStat;
        if (sessionConnStat2.retryTimes == 0) {
            sessionConnStat2.putExtra("firstIp", connInfo.getIp());
            IConnStrategy iConnStrategy = connInfo.strategy;
            if (iConnStrategy != null) {
                this.connStat.firstIpType = iConnStrategy.getIpType();
            }
        }
    }

    public void checkSessionsAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e4e90b", new Object[]{this});
            return;
        }
        List<Session> sessions = this.sessionPool.getSessions(this);
        if (sessions != null) {
            String buildKey = StringUtils.buildKey("https", this.mRealHost);
            for (Session session : sessions) {
                if (AwcnConfig.isSessionOptEnable() && session != null && session.isAvailable() && NetworkStatusHelper.getStatus().isWifi() && session.getForceCellular()) {
                    this.sessionCenter.handleSession(this.mRealHost, buildKey, session, SessionParamStat.UseConnectType.DEF_NIC, null, "bg_to_fg_cell");
                }
                if (session != null && session.isAvailable() && (session.getConnType().isHTTP3() || session.getConnType().isQuic())) {
                    session.ping(true, 1500);
                }
            }
        }
    }

    public void setConnecting(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621a6a81", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.mConnecting.set(z);
        if (!z) {
            if (this.timeoutTask != null) {
                this.timeoutTask.cancel(true);
                this.timeoutTask = null;
            }
            this.connectingSession = null;
            this.connectingComplexSession = null;
            if (this.complexFuture != null) {
                this.complexFuture.cancel(true);
                this.complexFuture = null;
            }
            this.sessionComplexTask = null;
            this.isSuccess.set(false);
        }
        if (z2) {
            this.connectingMultiSession = null;
        }
    }

    private void commitFail(Session session, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af5ada74", new Object[]{this, session, new Integer(i), new Integer(i2)});
        } else if (256 == i) {
            AlarmObject alarmObject = new AlarmObject();
            alarmObject.module = "networkPrefer";
            alarmObject.modulePoint = gl4.CONFIG_POLICY;
            alarmObject.arg = this.mHost;
            alarmObject.errorCode = String.valueOf(i2);
            alarmObject.isSuccess = false;
            AppMonitor.getInstance().commitAlarm(alarmObject);
            SessionConnStat sessionConnStat = this.connStat;
            sessionConnStat.ret = 0;
            sessionConnStat.appendErrorTrace(i2);
            this.connStat.errorCode = String.valueOf(i2);
            this.connStat.totalTime = System.currentTimeMillis() - this.connStat.start;
            this.connStat.syncValueFromSession(session);
            SessionConnStat sessionConnStat2 = this.connStat;
            SessionStatistic sessionStatistic = session.mSessionStat;
            sessionConnStat2.isComplex = sessionStatistic.isComplex;
            if (!sessionStatistic.isReported) {
                sessionConnStat2.ret = 2;
            }
            AppMonitor.getInstance().commitStat(this.connStat);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0193 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0016, B:6:0x001c, B:10:0x0049, B:12:0x004f, B:17:0x005e, B:19:0x0063, B:23:0x006a, B:25:0x00ce, B:27:0x00d6, B:29:0x00ea, B:30:0x00ed, B:34:0x00f3, B:36:0x0118, B:38:0x011f, B:39:0x0142, B:40:0x014d, B:44:0x0155, B:46:0x0159, B:52:0x0164, B:56:0x0171, B:58:0x0193, B:72:0x01c3, B:73:0x0202, B:74:0x0203, B:76:0x0228, B:78:0x022e, B:80:0x0234, B:81:0x023b, B:84:0x0242, B:85:0x024b, B:82:0x023c, B:83:0x0241, B:60:0x01a2, B:62:0x01a7, B:63:0x01ae, B:66:0x01b5, B:69:0x01bd), top: B:90:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c3 A[Catch: all -> 0x0046, TRY_ENTER, TryCatch #4 {, blocks: (B:4:0x0016, B:6:0x001c, B:10:0x0049, B:12:0x004f, B:17:0x005e, B:19:0x0063, B:23:0x006a, B:25:0x00ce, B:27:0x00d6, B:29:0x00ea, B:30:0x00ed, B:34:0x00f3, B:36:0x0118, B:38:0x011f, B:39:0x0142, B:40:0x014d, B:44:0x0155, B:46:0x0159, B:52:0x0164, B:56:0x0171, B:58:0x0193, B:72:0x01c3, B:73:0x0202, B:74:0x0203, B:76:0x0228, B:78:0x022e, B:80:0x0234, B:81:0x023b, B:84:0x0242, B:85:0x024b, B:82:0x023c, B:83:0x0241, B:60:0x01a2, B:62:0x01a7, B:63:0x01ae, B:66:0x01b5, B:69:0x01bd), top: B:90:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void start(android.content.Context r26, int r27, int r28, java.lang.String r29, anet.channel.SessionGetCallback r30, long r31, anet.channel.SessionParamStat r33) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.SessionRequest.start(android.content.Context, int, int, java.lang.String, anet.channel.SessionGetCallback, long, anet.channel.SessionParamStat):void");
    }

    public synchronized void startAsync(Context context, int i, String str, SessionGetCallback sessionGetCallback, long j, boolean z, SessionParamStat sessionParamStat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81764990", new Object[]{this, context, new Integer(i), str, sessionGetCallback, new Long(j), new Boolean(z), sessionParamStat});
            return;
        }
        String str2 = sessionParamStat == null ? "" : sessionParamStat.req;
        boolean z2 = sessionParamStat != null && sessionParamStat.isRetry;
        Session session = null;
        String createSequenceNo = TextUtils.isEmpty(str) ? SessionSeq.createSequenceNo(null) : str;
        ALog.e(TAG, "SessionRequest startAsync", createSequenceNo, "host", this.mHost, "type", Integer.valueOf(i), "reqSeq", str2, v4s.PARAM_IS_RETRY, Boolean.valueOf(z2));
        if (this.mConnecting.compareAndSet(false, true)) {
            if (sessionParamStat != null && sessionParamStat.sessionFlag == SessionParamStat.UseConnectType.DEFAULT.ordinal()) {
                session = this.sessionPool.getSession(this, i, ProtocolType.ALL, sessionParamStat);
            }
            if (session != null) {
                ALog.d(TAG, "Available Session exist!!!", createSequenceNo, "reqSeq", str2);
                if (sessionGetCallback != null) {
                    sessionGetCallback.onSessionGetSuccess(session);
                }
                finish();
                return;
            }
            setConnecting(true);
            this.timeoutTask = ThreadPoolExecutorFactory.submitScheduledTask(new ConnectTimeoutTask(createSequenceNo), 45L, TimeUnit.SECONDS);
            SessionConnStat sessionConnStat = new SessionConnStat();
            this.connStat = sessionConnStat;
            sessionConnStat.start = System.currentTimeMillis();
            if (!NetworkStatusHelper.isConnected()) {
                if (ALog.isPrintLog(1)) {
                    ALog.d(TAG, "network is not available, can't create session", createSequenceNo, "isConnected", Boolean.valueOf(NetworkStatusHelper.isConnected()), "reqSeq", str2);
                }
                finish();
                throw new RuntimeException("no network");
            }
            updateForceCell(createSequenceNo, sessionParamStat == null ? "" : sessionParamStat.req, sessionParamStat != null && sessionParamStat.forceCellType == 1, sessionParamStat != null && sessionParamStat.sessionFlag == SessionParamStat.UseConnectType.DEF_NIC.ordinal());
            List<IConnStrategy> availStrategy = getAvailStrategy(i, ProtocolType.ALL, createSequenceNo, z, sessionParamStat);
            if (!availStrategy.isEmpty()) {
                connectingSession(getConnInfoList(availStrategy, createSequenceNo), context, sessionParamStat, i, ProtocolType.ALL, createSequenceNo);
                SessionGetWaitTimeoutTask sessionGetWaitTimeoutTask = new SessionGetWaitTimeoutTask(sessionGetCallback);
                synchronized (this.callbackTaskMap) {
                    this.callbackTaskMap.put(sessionGetCallback, sessionGetWaitTimeoutTask);
                }
                ThreadPoolExecutorFactory.submitScheduledTask(sessionGetWaitTimeoutTask, j, TimeUnit.MILLISECONDS);
                return;
            }
            ALog.i(TAG, "no avalible strategy, can't create session", createSequenceNo, "host", this.mHost, "type", Integer.valueOf(i), "reqSeq", str2);
            finish();
            throw new NoAvailStrategyException("no avalible strategy");
        }
        ALog.e(TAG, "session connecting", createSequenceNo, "host", getHost(), "reqSeq", str2);
        if (sessionGetCallback != null) {
            if (getConnectingType() == i) {
                SessionGetWaitTimeoutTask sessionGetWaitTimeoutTask2 = new SessionGetWaitTimeoutTask(sessionGetCallback);
                synchronized (this.callbackTaskMap) {
                    this.callbackTaskMap.put(sessionGetCallback, sessionGetWaitTimeoutTask2);
                }
                ThreadPoolExecutorFactory.submitScheduledTask(sessionGetWaitTimeoutTask2, j, TimeUnit.MILLISECONDS);
            } else {
                sessionGetCallback.onSessionGetFail();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class ConnCb implements IConnCb {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ConnInfo connInfo;
        private Context context;
        private SessionParamStat stat;
        private List<ConnInfo> strategys;
        private List<ConnInfo> usedFailStrategyList = new ArrayList();
        public boolean isHandleFinish = false;

        static {
            t2o.a(607125545);
            t2o.a(607125548);
        }

        public ConnCb(Context context, List<ConnInfo> list, ConnInfo connInfo, SessionParamStat sessionParamStat) {
            this.context = context;
            this.strategys = list;
            this.connInfo = connInfo;
            this.stat = sessionParamStat;
        }

        public static /* synthetic */ Context access$1500(ConnCb connCb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("49b861db", new Object[]{connCb});
            }
            return connCb.context;
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onFailed(Session session, long j, int i, int i2) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f785e9", new Object[]{this, session, new Long(j), new Integer(i), new Integer(i2)});
                return;
            }
            SessionParamStat sessionParamStat = this.stat;
            String str = sessionParamStat == null ? "" : sessionParamStat.req;
            boolean z2 = sessionParamStat != null && sessionParamStat.isRetry;
            boolean z3 = AwcnConfig.isStrategyTimelyUpdateEnable() && AwcnConfig.isHostInStrategyTimelyUpdateHostWhiteList(SessionRequest.access$200(SessionRequest.this));
            ALog.e(SessionRequest.TAG, "Connect failed", this.connInfo.getSeq(), MspGlobalDefine.SESSION, session, "host", SessionRequest.this.getHost(), "isHandleFinish", Boolean.valueOf(this.isHandleFinish), "reqSeq", str, v4s.PARAM_IS_RETRY, Boolean.valueOf(z2), "isStrategyTimelyUpdateEnable", Boolean.valueOf(z3));
            if (SessionRequest.this.isToClose) {
                SessionRequest.this.isToClose = false;
            } else if (!this.isHandleFinish) {
                this.isHandleFinish = true;
                if (SessionRequest.access$000(SessionRequest.this).get()) {
                    if (i2 == -3530) {
                        SessionRequest.access$300(SessionRequest.this).set(true);
                        ALog.e(SessionRequest.TAG, "[pubKey] isGetPubKeyFail true！" + session.toString(), "errorCode", Integer.valueOf(i2), "reqSeq", str);
                    }
                    if (z3) {
                        if (this.usedFailStrategyList == null) {
                            this.usedFailStrategyList = new ArrayList();
                        }
                        this.usedFailStrategyList.add(this.connInfo);
                    }
                    if (z2) {
                        SessionRequest.access$400(SessionRequest.this).remove(SessionRequest.this, session);
                    } else {
                        SessionRequest.access$500(SessionRequest.this).remove(SessionRequest.this, session);
                    }
                    boolean z4 = AwcnConfig.isBgSocketEnable() && GlobalAppRuntimeInfo.isAppBackground() && (i2 == -2301 || i2 == -2611);
                    if (!session.tryNextWhenFail || !NetworkStatusHelper.isConnected() || this.strategys.isEmpty() || (!AwcnConfig.isSessionOptEnable() && z4)) {
                        SessionRequest.access$600(SessionRequest.this, session.isMultiSession);
                        SessionRequest.access$700(SessionRequest.this, session, i, i2);
                        synchronized (SessionRequest.access$100(SessionRequest.this)) {
                            try {
                                for (Map.Entry entry : SessionRequest.access$100(SessionRequest.this).entrySet()) {
                                    SessionGetWaitTimeoutTask sessionGetWaitTimeoutTask = (SessionGetWaitTimeoutTask) entry.getValue();
                                    if (sessionGetWaitTimeoutTask.isFinish.compareAndSet(false, true)) {
                                        ThreadPoolExecutorFactory.removeScheduleTask(sessionGetWaitTimeoutTask);
                                        ((SessionGetCallback) entry.getKey()).onSessionGetFail();
                                    }
                                }
                                SessionRequest.access$100(SessionRequest.this).clear();
                            } finally {
                            }
                        }
                        if (z4) {
                            ALog.e(SessionRequest.TAG, "[bg_to_fg_cell] [bg_socket_opt] no socket read and write permissions in the background！" + session.toString(), "errorCode", Integer.valueOf(i2), "reqSeq", str);
                            throw new NoSocketPermissionInBgException("no socket permissions in background");
                        }
                        return;
                    }
                    if (ALog.isPrintLog(1)) {
                        ALog.d(SessionRequest.TAG, "use next connInfo to create session", this.connInfo.getSeq(), "host", SessionRequest.this.getHost(), "reqSeq", str);
                    }
                    if (z3) {
                        ArrayList arrayList = new ArrayList();
                        SessionRequest sessionRequest = SessionRequest.this;
                        SessionParamStat sessionParamStat2 = this.stat;
                        int type = sessionParamStat2 != null ? sessionParamStat2.sessionType : session.getConnType().getType();
                        SessionParamStat sessionParamStat3 = this.stat;
                        List access$800 = SessionRequest.access$800(sessionRequest, type, sessionParamStat3 != null ? sessionParamStat3.protocolType : session.getConnType().getProtocolType(), this.connInfo.getSeq(), SessionRequest.this.isForceCellular, this.stat);
                        if (access$800 == null || access$800.isEmpty()) {
                            ALog.e(SessionRequest.TAG, "[amdc] onFailed! not need strategys update!", this.connInfo.getSeq(), "host", SessionRequest.this.getHost(), "strategys", this.strategys, "reqSeq", str);
                        } else {
                            List access$900 = SessionRequest.access$900(SessionRequest.this, access$800, this.connInfo.getSeq());
                            ConnInfo connInfo = this.connInfo;
                            boolean z5 = connInfo.retryTime == connInfo.maxRetryTime && (i2 == -2003 || i2 == -2410);
                            boolean z6 = Utils.isIPV6Address(session.getIp()) && (Ipv6Detector.detectIpv6Status() == 0 || Inet64Util.isIPv4OnlyNetwork());
                            boolean z7 = (GlobalAppRuntimeInfo.isAppBackground() && this.connInfo.getConnType().isHTTP3()) || !AwcnConfig.isHttp3Enable() || Http3ConnectionDetector.detectHttp3Status() == 0;
                            ListIterator listIterator = access$900.listIterator();
                            while (true) {
                                if (!listIterator.hasNext()) {
                                    break;
                                }
                                ConnInfo connInfo2 = (ConnInfo) listIterator.next();
                                ConnType connType = connInfo2.getConnType();
                                if ((!z5 || !session.getIp().equals(connInfo2.getIp())) && ((!z6 || !Utils.isIPV6Address(connInfo2.getIp())) && (!z7 || !connInfo2.getConnType().isHTTP3()))) {
                                    z = false;
                                } else {
                                    listIterator.remove();
                                    z = true;
                                }
                                boolean z8 = z;
                                if (!z) {
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= this.usedFailStrategyList.size()) {
                                            break;
                                        }
                                        ConnInfo connInfo3 = this.usedFailStrategyList.get(i3);
                                        if (connInfo3.getConnType().equals(connType)) {
                                            connType = connType;
                                            if (connInfo3.getPort() == connInfo2.getPort() && connInfo3.getIp().equalsIgnoreCase(connInfo2.getIp()) && connInfo3.retryTime == connInfo2.retryTime) {
                                                listIterator.remove();
                                                z8 = true;
                                                break;
                                            }
                                        } else {
                                            connType = connType;
                                        }
                                        i3++;
                                    }
                                }
                                if (!z8) {
                                    arrayList.add(connInfo2);
                                    break;
                                }
                            }
                            this.strategys = arrayList;
                            ALog.e(SessionRequest.TAG, "[amdc] onFailed! strategys update end!", this.connInfo.getSeq(), "host", SessionRequest.this.getHost(), "strategys", this.strategys, "reqSeq", str, "removeIpError", Boolean.valueOf(z5), "removeIpv6Error", Boolean.valueOf(z6), "removeH3Error", Boolean.valueOf(z7));
                        }
                    }
                    if (!z3) {
                        ConnInfo connInfo4 = this.connInfo;
                        if (connInfo4.retryTime == connInfo4.maxRetryTime && (i2 == -2003 || i2 == -2410)) {
                            ListIterator<ConnInfo> listIterator2 = this.strategys.listIterator();
                            while (listIterator2.hasNext()) {
                                if (session.getIp().equals(listIterator2.next().strategy.getIp())) {
                                    listIterator2.remove();
                                }
                            }
                        }
                    }
                    if (Utils.isIPV6Address(session.getIp()) && (Ipv6Detector.detectIpv6Status() == 0 || Inet64Util.isIPv4OnlyNetwork())) {
                        ALog.e(SessionRequest.TAG, "ipv6 failed, remove all ipv6 strategys! strategy=" + this.strategys.toString(), session.mSeq, "detectIpv6Status", Integer.valueOf(Ipv6Detector.detectIpv6Status()), "isIPv4OnlyNetwork", Boolean.valueOf(Inet64Util.isIPv4OnlyNetwork()), "reqSeq", str);
                        if (!z3) {
                            ListIterator<ConnInfo> listIterator3 = this.strategys.listIterator();
                            while (listIterator3.hasNext()) {
                                if (Utils.isIPV6Address(listIterator3.next().strategy.getIp())) {
                                    listIterator3.remove();
                                }
                            }
                        }
                        if (SessionRequest.this.complexFuture == null) {
                            List<ConnInfo> list = this.strategys;
                            if ((list == null || list.isEmpty()) && Inet64Util.getStackType() == 3) {
                                this.strategys = SessionRequest.access$900(SessionRequest.this, StrategyCenter.getInstance().getIpv4ConnStrategyListByHost(session.getRealHost(), SessionRequest.this.getHost().startsWith("https"), SessionRequest.this.getConnectingType()), session.mSeq);
                                ALog.e(SessionRequest.TAG, "ipv6 failed will retry with local dns ipv4 " + this.strategys.toString(), session.mSeq, "reqSeq", str);
                            }
                        } else if (!SessionRequest.this.complexFuture.isDone()) {
                            ALog.d(SessionRequest.TAG, "it already failed , so start complex task!", session.mSeq, "reqSeq", str);
                            SessionRequest.this.complexFuture.cancel(false);
                            ThreadPoolExecutorFactory.submitPriorityTask(SessionRequest.this.sessionComplexTask, ThreadPoolExecutorFactory.Priority.NORMAL);
                            return;
                        } else {
                            ALog.d(SessionRequest.TAG, "we already start complex!", session.mSeq, "reqSeq", str);
                            return;
                        }
                    }
                    if (!z3 && GlobalAppRuntimeInfo.isAppBackground() && this.connInfo.getConnType().isHTTP3()) {
                        ListIterator<ConnInfo> listIterator4 = this.strategys.listIterator();
                        while (listIterator4.hasNext()) {
                            if (listIterator4.next().getConnType().isHTTP3()) {
                                listIterator4.remove();
                            }
                        }
                    }
                    ALog.e(SessionRequest.TAG, "[bg_to_fg_cell][SessionOpt] Connect failed!!! start", this.connInfo.getSeq(), "host", SessionRequest.this.getHost(), "isSessionOptEnable", Boolean.valueOf(AwcnConfig.isSessionOptEnable()), "isBgSocketFail", Boolean.valueOf(z4), "strategys", this.strategys, "isComplex", Boolean.valueOf(session.isComplex), "errorcode", Integer.valueOf(i2), "reqSeq", str);
                    if (!z3) {
                        ListIterator<ConnInfo> listIterator5 = this.strategys.listIterator();
                        int detectHttp3Status = Http3ConnectionDetector.detectHttp3Status();
                        String uniqueId = NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus());
                        boolean isHttp3Enable = AwcnConfig.isHttp3Enable();
                        while (listIterator5.hasNext()) {
                            ConnInfo next = listIterator5.next();
                            if ((next.getConnType().equals(this.connInfo.getConnType()) && next.getPort() == this.connInfo.getPort() && next.getIp().equalsIgnoreCase(this.connInfo.getIp())) || (next.getConnType().isHTTP3() && (!isHttp3Enable || detectHttp3Status == 0))) {
                                listIterator5.remove();
                                listIterator5 = listIterator5;
                                ALog.e(SessionRequest.TAG, "[SessionOpt] Connect failed!!! remove connInfo!!", this.connInfo.getSeq(), "host", SessionRequest.this.getHost(), "connInfo", this.connInfo, "detectHttp3Status", Integer.valueOf(detectHttp3Status), hxj.UNIQID, uniqueId, "isHttp3Enable", Boolean.valueOf(isHttp3Enable), "reqSeq", str);
                            } else {
                                listIterator5 = listIterator5;
                            }
                        }
                        ALog.e(SessionRequest.TAG, "[SessionOpt] Connect failed!!! end", this.connInfo.getSeq(), "host", SessionRequest.this.getHost(), "strategys", this.strategys, "isComplex", Boolean.valueOf(session.isComplex), "reqSeq", str);
                        if (session.isNetworkStatusChangeDeprecated) {
                            this.strategys = SessionRequest.access$900(SessionRequest.this, SessionRequest.access$800(SessionRequest.this, session.getConnType().getType(), session.getConnType().getProtocolType(), this.connInfo.getSeq(), SessionRequest.this.isForceCellular, this.stat), this.connInfo.getSeq());
                            ALog.e(SessionRequest.TAG, "[network status opt] onFailed! strategys update!", this.connInfo.getSeq(), "host", SessionRequest.this.getHost(), "strategys", this.strategys, "reqSeq", str);
                        }
                    }
                    if (this.strategys.isEmpty()) {
                        SessionRequest.access$600(SessionRequest.this, session.isMultiSession);
                        SessionRequest.access$700(SessionRequest.this, session, i, i2);
                        synchronized (SessionRequest.access$100(SessionRequest.this)) {
                            try {
                                for (Map.Entry entry2 : SessionRequest.access$100(SessionRequest.this).entrySet()) {
                                    SessionGetWaitTimeoutTask sessionGetWaitTimeoutTask2 = (SessionGetWaitTimeoutTask) entry2.getValue();
                                    if (sessionGetWaitTimeoutTask2.isFinish.compareAndSet(false, true)) {
                                        ThreadPoolExecutorFactory.removeScheduleTask(sessionGetWaitTimeoutTask2);
                                        ((SessionGetCallback) entry2.getKey()).onSessionGetFail();
                                    }
                                }
                                SessionRequest.access$100(SessionRequest.this).clear();
                            } finally {
                            }
                        }
                        return;
                    }
                    ConnInfo remove = this.strategys.remove(0);
                    boolean z9 = AwcnConfig.isMultiConnectOpened() && AwcnConfig.isHostInMultiConnectWhiteList(SessionRequest.access$200(SessionRequest.this));
                    SessionRequest sessionRequest2 = SessionRequest.this;
                    String str2 = session.mSeq;
                    SessionParamStat sessionParamStat4 = this.stat;
                    SessionRequest.access$1000(sessionRequest2, str2, sessionParamStat4 == null ? "" : sessionParamStat4.req, sessionParamStat4 != null && sessionParamStat4.forceCellType == 1, false);
                    if (session.isComplex) {
                        SessionRequest sessionRequest3 = SessionRequest.this;
                        Context context = this.context;
                        sessionRequest3.createComplexSession(context, remove, new ConnCb(context, this.strategys, remove, this.stat), remove.getSeq(), z9, this.stat);
                        return;
                    }
                    SessionRequest sessionRequest4 = SessionRequest.this;
                    Context context2 = this.context;
                    SessionRequest.access$1100(sessionRequest4, context2, remove, new ConnCb(context2, this.strategys, remove, this.stat), remove.getSeq(), z9, 0, null, this.stat);
                }
            }
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onDisConnect(final Session session, long j, int i, int i2) {
            String str;
            int i3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b59e2d8a", new Object[]{this, session, new Long(j), new Integer(i), new Integer(i2)});
                return;
            }
            SessionParamStat sessionParamStat = this.stat;
            if (sessionParamStat == null) {
                str = "";
            } else {
                str = sessionParamStat.req;
            }
            boolean z = sessionParamStat != null && sessionParamStat.isRetry;
            boolean isAppBackground = GlobalAppRuntimeInfo.isAppBackground();
            boolean z2 = session.isNetworkStatusChangeDeprecated;
            ALog.e(SessionRequest.TAG, "Connect Disconnect", this.connInfo.getSeq(), MspGlobalDefine.SESSION, session, "host", SessionRequest.this.getHost(), "appIsBg", Boolean.valueOf(isAppBackground), "isHandleFinish", Boolean.valueOf(this.isHandleFinish), "isNetworkStatusSession", Boolean.valueOf(z2), "autoReCreate", Boolean.valueOf(session.autoReCreate), "reqSeq", str, v4s.PARAM_IS_RETRY, Boolean.valueOf(z));
            if (z) {
                SessionRequest.access$400(SessionRequest.this).remove(SessionRequest.this, session);
            } else {
                SessionRequest.access$500(SessionRequest.this).remove(SessionRequest.this, session);
            }
            if (!this.isHandleFinish) {
                this.isHandleFinish = true;
                if (session.autoReCreate) {
                    if (isAppBackground && (SessionRequest.access$1400(SessionRequest.this) == null || !SessionRequest.access$1400(SessionRequest.this).isAccs || AwcnConfig.isAccsSessionCreateForbiddenInBg())) {
                        ALog.e(SessionRequest.TAG, "[onDisConnect]app background, don't Recreate", this.connInfo.getSeq(), MspGlobalDefine.SESSION, session, "reqSeq", str);
                    } else if (!NetworkStatusHelper.isConnected()) {
                        ALog.e(SessionRequest.TAG, "[onDisConnect]no network, don't Recreate", this.connInfo.getSeq(), MspGlobalDefine.SESSION, session, "reqSeq", str);
                    } else {
                        try {
                            if (SessionRequest.access$500(SessionRequest.this).getSession(SessionRequest.this, SessionType.LONG_LINK, ProtocolType.ALL, this.stat) != null) {
                                ALog.e(SessionRequest.TAG, "[onDisConnect]already have other session.", this.connInfo.getSeq(), "reqSeq", str);
                                return;
                            }
                            if (SessionRequest.access$1400(SessionRequest.this) == null || !SessionRequest.access$1400(SessionRequest.this).isAccs) {
                                i3 = z2 ? 0 : 10000;
                            } else {
                                i3 = AwcnConfig.getAccsReconnectionDelayPeriod();
                            }
                            ALog.e(SessionRequest.TAG, "[bg_to_fg_cell] session disconnected, try to recreate session.", this.connInfo.getSeq(), "delay period ", Integer.valueOf(i3), "isNetworkStatusSession", Boolean.valueOf(z2), "reqSeq", str, "errorcode", Integer.valueOf(i2), "isSessionOptEnable", Boolean.valueOf(AwcnConfig.isSessionOptEnable()));
                            final SessionParamStat sessionParamStat2 = this.stat;
                            ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.SessionRequest.ConnCb.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    try {
                                        ConnCb connCb = ConnCb.this;
                                        SessionRequest.this.start(ConnCb.access$1500(connCb), session.getConnType().getType(), session.getConnType().getProtocolType(), SessionSeq.createSequenceNo(SessionRequest.access$1600(SessionRequest.this).seqNum), null, 0L, sessionParamStat2);
                                    } catch (Exception unused) {
                                    }
                                }
                            }, (long) (Math.random() * i3), TimeUnit.MILLISECONDS);
                        } catch (Exception e) {
                            ALog.e(SessionRequest.TAG, "session disconnected, fail=" + e.toString(), this.connInfo.getSeq(), "reqSeq", str);
                        }
                    }
                }
            }
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onSuccess(Session session, long j) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("357a84a1", new Object[]{this, session, new Long(j)});
                return;
            }
            SessionParamStat sessionParamStat = this.stat;
            if (sessionParamStat == null) {
                str = "";
            } else {
                str = sessionParamStat.req;
            }
            boolean z = sessionParamStat != null && sessionParamStat.isRetry;
            ALog.d(SessionRequest.TAG, "Connect Success", this.connInfo.getSeq(), MspGlobalDefine.SESSION, session, "host", SessionRequest.this.getHost(), "reqSeq", str, v4s.PARAM_IS_RETRY, Boolean.valueOf(z));
            try {
                try {
                } catch (Exception e) {
                    ALog.e(SessionRequest.TAG, "[onSuccess]:", this.connInfo.getSeq(), e, new Object[0]);
                }
                if (SessionRequest.this.isToClose) {
                    SessionRequest.this.isToClose = false;
                    session.close(false, "isToClose");
                    return;
                }
                if (AwcnConfig.isComplexConnectEnable() && ((!SessionRequest.access$1200(SessionRequest.this).compareAndSet(false, true) || !SessionRequest.access$000(SessionRequest.this).get()) && !session.isCreated && (!AwcnConfig.isMultiConnectOpened() || !AwcnConfig.isHostInMultiConnectWhiteList(SessionRequest.access$200(SessionRequest.this))))) {
                    ALog.e(SessionRequest.TAG, "session connect already finish", session.mSeq, "reqSeq", str);
                    session.close(false, "session_already_finish");
                }
                ALog.e(SessionRequest.TAG, "session connect Success", session.mSeq, "reqSeq", str, v4s.PARAM_IS_RETRY, Boolean.valueOf(z));
                if (z) {
                    SessionRequest.access$400(SessionRequest.this).add(SessionRequest.this, session);
                } else {
                    SessionRequest.access$500(SessionRequest.this).add(SessionRequest.this, session);
                }
                if (session.pubKeyMode == 0) {
                    SessionRequest.access$300(SessionRequest.this).set(false);
                    ALog.e(SessionRequest.TAG, "[pubKey] session isGetPubKeyFail Success", session.mSeq, "reqSeq", str);
                }
                SessionRequest.access$1300(SessionRequest.this, session);
                synchronized (SessionRequest.access$100(SessionRequest.this)) {
                    try {
                        for (Map.Entry entry : SessionRequest.access$100(SessionRequest.this).entrySet()) {
                            SessionGetWaitTimeoutTask sessionGetWaitTimeoutTask = (SessionGetWaitTimeoutTask) entry.getValue();
                            if (sessionGetWaitTimeoutTask.isFinish.compareAndSet(false, true)) {
                                ThreadPoolExecutorFactory.removeScheduleTask(sessionGetWaitTimeoutTask);
                                ((SessionGetCallback) entry.getKey()).onSessionGetSuccess(session);
                            }
                        }
                        SessionRequest.access$100(SessionRequest.this).clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (session.isComplex) {
                    if (SessionRequest.this.connectingSession != null && !SessionRequest.this.connectingSession.isAvailable()) {
                        SessionRequest.this.connectingSession.mSessionStat.isReported = false;
                        SessionRequest.this.connectingSession.close(false, "session_already_true");
                        ALog.e(SessionRequest.TAG, "Complex session is success, cancel connectingSession !", session.mSeq, "host", SessionRequest.access$200(SessionRequest.this), "reqSeq", str);
                    }
                } else if (SessionRequest.this.complexFuture != null && !SessionRequest.this.complexFuture.isDone()) {
                    SessionRequest.this.complexFuture.cancel(true);
                    SessionRequest.this.complexFuture = null;
                    ALog.e(SessionRequest.TAG, " session is success, remove complex task !", session.mSeq, "host", SessionRequest.access$200(SessionRequest.this), "reqSeq", str);
                } else if (SessionRequest.this.connectingComplexSession != null && !SessionRequest.this.connectingComplexSession.isAvailable()) {
                    SessionRequest.this.connectingComplexSession.mSessionStat.isReported = false;
                    SessionRequest.this.connectingComplexSession.close(false, "session_already_true");
                    ALog.e(SessionRequest.TAG, " session is success, cancel complex session !", session.mSeq, "host", SessionRequest.access$200(SessionRequest.this), "reqSeq", str);
                }
            } finally {
                SessionRequest.access$600(SessionRequest.this, session.isMultiSession);
            }
        }
    }

    private void commitSuccess(Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2589f22b", new Object[]{this, session});
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = gl4.CONFIG_POLICY;
        alarmObject.arg = this.mHost;
        alarmObject.isSuccess = true;
        AppMonitor.getInstance().commitAlarm(alarmObject);
        this.connStat.syncValueFromSession(session);
        SessionConnStat sessionConnStat = this.connStat;
        sessionConnStat.ret = 1;
        sessionConnStat.totalTime = System.currentTimeMillis() - this.connStat.start;
        SessionConnStat sessionConnStat2 = this.connStat;
        sessionConnStat2.isComplex = session.mSessionStat.isComplex;
        sessionConnStat2.isCreated = session.isCreated;
        SessionInfo sessionInfo = this.sessionInfo;
        if (sessionInfo != null && sessionInfo.isAccs) {
            List<Session> availableSessions = this.sessionPool.getAvailableSessions(this);
            this.connStat.sessionCount = availableSessions != null ? availableSessions.size() : 0;
            ALog.e(TAG, "[commitSuccess]", session.mSeq, "count", Integer.valueOf(this.connStat.sessionCount));
        }
        INetworkAnalysis instance = NetworkAnalysis.getInstance();
        SessionConnStat sessionConnStat3 = this.connStat;
        instance.createConnectCount(sessionConnStat3.host, sessionConnStat3.ip, sessionConnStat3.protocolType);
        AppMonitor.getInstance().commitStat(this.connStat);
    }

    private void sendConnectInfoToAccsByCallBack(Session session, int i, String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c4a815", new Object[]{this, session, new Integer(i), str, new Boolean(z), new Boolean(z2)});
            return;
        }
        SessionInfo sessionInfo = this.sessionInfo;
        if (sessionInfo != null && sessionInfo.isAccs) {
            ALog.e(TAG, "sendConnectInfoToAccsByCallBack", null, new Object[0]);
            Intent intent = new Intent("com.taobao.ACCS_CONNECT_INFO");
            intent.putExtra("command", 103);
            intent.putExtra("host", session.getHost());
            intent.putExtra(Constants.KEY_CENTER_HOST, true);
            boolean isAvailable = session.isAvailable();
            if (!isAvailable) {
                intent.putExtra("errorCode", i);
                intent.putExtra(Constants.KEY_ERROR_DETAIL, str);
            }
            intent.putExtra(Constants.KEY_CONNECT_AVAILABLE, isAvailable);
            intent.putExtra(Constants.KEY_TYPE_INAPP, true);
            if (z) {
                intent.putExtra("isSendConnectInfoByService", z2);
                ALog.e(TAG, "sendConnectInfoToAccsByCallBack, isAccsServiceOptOpend=true", null, "isSendConnectInfoByService", Boolean.valueOf(z2));
            }
            this.sessionCenter.accsSessionManager.notifyListener(intent);
        }
    }

    public void await(long j) throws InterruptedException, TimeoutException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f16f87", new Object[]{this, new Long(j)});
            return;
        }
        ALog.d(TAG, "[await]", null, "timeoutMs", Long.valueOf(j));
        if (j > 0) {
            synchronized (this.locked) {
                try {
                    long currentTimeMillis = System.currentTimeMillis() + j;
                    while (this.mConnecting.get()) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (currentTimeMillis2 >= currentTimeMillis) {
                            break;
                        }
                        this.locked.wait(currentTimeMillis - currentTimeMillis2);
                    }
                    if (this.mConnecting.get()) {
                        throw new TimeoutException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void checkSession(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ab6f1f8", new Object[]{this, new Integer(i), str});
            return;
        }
        List<Session> sessions = this.sessionPool.getSessions(this);
        if (sessions != null) {
            for (Session session : sessions) {
                if (session != null && session.isAvailable()) {
                    session.ping(true, i);
                    ALog.e(TAG, "[ap] checkSession session=" + session.mSeq, str, "host", session.getRealHost());
                }
            }
        }
    }

    public void reCreateSession(String str, NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d8acfd", new Object[]{this, str, networkStatus});
            return;
        }
        ALog.d(TAG, "reCreateSession", str, "host", this.mHost);
        ALog.e(TAG, "[handleNetworkStatusSessions]smooth ", this.sessionCenter.seqNum, "host", this.mHost);
        this.sessionCenter.handleSessionNetworkStatus(this.sessionPool.getSessions(this), AwcnConfig.isHttp3NetworkChangeWhiteList(this.mRealHost), networkStatus);
    }

    public void closeSessions(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af708162", new Object[]{this, new Boolean(z), str});
            return;
        }
        ALog.d(TAG, "closeSessions", this.sessionCenter.seqNum, "host", this.mHost, "autoCreate", Boolean.valueOf(z));
        if (!z && this.connectingSession != null) {
            this.connectingSession.tryNextWhenFail = false;
            this.connectingSession.close(false, str);
            if (this.connectingComplexSession != null) {
                this.connectingComplexSession.tryNextWhenFail = false;
                this.connectingComplexSession.close(false, str);
            }
        }
        List<Session> sessions = this.sessionPool.getSessions(this);
        if (sessions != null) {
            for (Session session : sessions) {
                if (session != null) {
                    session.close(z, str);
                }
            }
        }
    }

    public boolean vpnRacing(List<ConnInfo> list, String str, String str2, SessionParamStat sessionParamStat, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a73e1f23", new Object[]{this, list, str, str2, sessionParamStat, context})).booleanValue();
        }
        if (AwcnConfig.isVpnDetectRacingOpened() && NetworkStatusHelper.isVpn()) {
            if (list == null || list.isEmpty()) {
                ALog.e(TAG, "[vpn complex] connInfoList is null", str, "reqSeq", str2);
            } else if (context == null) {
                ALog.e(TAG, "[vpn complex] context is null", str, "reqSeq", str2);
                return false;
            } else {
                List<ConnInfo> vpnRacingList = ComplexUtils.getVpnRacingList(this.connectingSession, list, str);
                if (vpnRacingList != null && vpnRacingList.size() > 0) {
                    ALog.e(TAG, "[vpn complex] sessionComplexTask will start", str, "reqSeq", str2);
                    this.sessionComplexTask = new SessionComplexTask(context, this, SessionType.LONG_LINK, ProtocolType.TCP, vpnRacingList, sessionParamStat);
                    this.complexFuture = ThreadPoolExecutorFactory.submitScheduledTask(this.sessionComplexTask, 0L, TimeUnit.MILLISECONDS);
                    return true;
                }
            }
        }
        return false;
    }

    public void createOneSession(Session session, int i, int i2, final String str) {
        String str2;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f511575", new Object[]{this, session, new Integer(i), new Integer(i2), str});
        } else if (AwcnConfig.isMultiConnectOpened() && AwcnConfig.isHostInMultiConnectWhiteList(this.mRealHost)) {
            try {
                try {
                    if (!this.mOneCreating.get()) {
                        try {
                            this.mOneCreating.set(true);
                            ALog.e(TAG, "[multiConnect] only one session [" + session.toString() + "], to createOneSession", str, new Object[0]);
                            updateForceCell(str, "", session.forceCellular, false);
                            List<IConnStrategy> availStrategy = getAvailStrategy(i, i2, str, this.isForceCellular, null);
                            if (availStrategy.isEmpty()) {
                                this.mOneCreating.set(false);
                                ALog.e(TAG, "[multiConnect] [createOneSession] no avalible strategy, can't create session", str, "host", this.mHost);
                                return;
                            }
                            List<ConnInfo> connInfoList = getConnInfoList(availStrategy, str);
                            ConnInfo remove = connInfoList.remove(0);
                            Context context = GlobalAppRuntimeInfo.getContext();
                            int i3 = session.countIndex.get() == 1 ? 2 : 1;
                            IOneSessionConnCb iOneSessionConnCb = new IOneSessionConnCb() { // from class: anet.channel.SessionRequest.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // anet.channel.SessionRequest.IOneSessionConnCb
                                public void onCreateSessionFinish() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("40d00055", new Object[]{this});
                                        return;
                                    }
                                    SessionRequest.access$1700(SessionRequest.this).set(false);
                                    ALog.e(SessionRequest.TAG, "[multiConnect] [createOneSession] onCreateSessionFinish", str, "host", SessionRequest.access$1800(SessionRequest.this), "sessionModel");
                                }
                            };
                            ConnCb connCb = new ConnCb(context, connInfoList, remove, null);
                            String seq = remove.getSeq();
                            str2 = TAG;
                            createSession(context, remove, connCb, seq, true, i3, iOneSessionConnCb, null);
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = TAG;
                            this.mOneCreating.set(false);
                            ALog.e(str2, "[multiConnect] [createOneSession] fail = " + th.toString(), str, "host", this.mHost);
                        }
                    } else {
                        str2 = TAG;
                        str2 = str2;
                        try {
                            ALog.e(str2, "[multiConnect] [createOneSession] creating session", str, "host", this.mHost);
                        } catch (Throwable th3) {
                            th = th3;
                            this.mOneCreating.set(false);
                            ALog.e(str2, "[multiConnect] [createOneSession] fail = " + th.toString(), str, "host", this.mHost);
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                str2 = TAG;
            }
        }
    }

    private List<IConnStrategy> getAvailStrategy(int i, int i2, String str, boolean z, SessionParamStat sessionParamStat) {
        Throwable th;
        HttpUrl parse;
        boolean isIpv6DowngradeWhiteList;
        boolean z2;
        SessionRequest sessionRequest = this;
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("84f11a27", new Object[]{sessionRequest, new Integer(i), new Integer(i2), str, new Boolean(z), sessionParamStat});
        }
        List<IConnStrategy> list = Collections.EMPTY_LIST;
        try {
            parse = HttpUrl.parse(getHost());
        } catch (Throwable th2) {
            th = th2;
        }
        if (parse == null) {
            return list;
        }
        list = StrategyCenter.getInstance().getConnStrategyListByHost(parse.host(), z);
        if (!list.isEmpty()) {
            try {
                boolean equalsIgnoreCase = "https".equalsIgnoreCase(parse.scheme());
                boolean z3 = Inet64Util.isIPv4OnlyNetwork() || Ipv6Detector.detectIpv6Status() == 0;
                boolean z4 = Inet64Util.isIPv6OnlyNetwork() && Ipv6Detector.detectIpv6Status() == 1;
                ListIterator<IConnStrategy> listIterator = list.listIterator();
                isIpv6DowngradeWhiteList = AwcnConfig.isIpv6DowngradeWhiteList(getRealHost());
                z2 = false;
                while (listIterator.hasNext()) {
                    IConnStrategy next = listIterator.next();
                    ConnType valueOf = ConnType.valueOf(next.getProtocol());
                    if (valueOf != null) {
                        if (valueOf.isSSL() != equalsIgnoreCase) {
                            listIterator.remove();
                        } else if (z3 && Utils.isIPV6Address(next.getIp())) {
                            listIterator.remove();
                        } else if (!z4 || !Utils.isIPV4Address(next.getIp())) {
                            if (!isIpv6DowngradeWhiteList || i != SessionType.SHORT_LINK) {
                                equalsIgnoreCase = equalsIgnoreCase;
                            } else {
                                equalsIgnoreCase = equalsIgnoreCase;
                                if (next.getIpSource() == 1 && Utils.isIPV6Address(next.getIp())) {
                                    z3 = z3;
                                    z4 = z4;
                                    ALog.e(TAG, "[Ipv6_H3] [getAvailStrategy] isIpv6Downgrade true, host=" + parse.host(), str, "strategy", next, "reqSeq", sessionParamStat == null ? str2 : sessionParamStat.req);
                                    listIterator.remove();
                                    str2 = str2;
                                    sessionRequest = this;
                                }
                            }
                            z3 = z3;
                            z4 = z4;
                            if (sessionParamStat == null || !sessionParamStat.isRetry) {
                                str2 = str2;
                                if (!((i == SessionType.ALL || valueOf.getType() == i) && (i2 == ProtocolType.ALL || valueOf.getProtocolType() == i2))) {
                                    listIterator.remove();
                                    z2 = true;
                                }
                            } else {
                                SessionParamStat.UseRetryType useRetryType = sessionParamStat.retryType;
                                if ((useRetryType == SessionParamStat.UseRetryType.SHORT_LINK && i != SessionType.SHORT_LINK) || ((useRetryType == SessionParamStat.UseRetryType.LONG_LINK && i != SessionType.LONG_LINK) || ((useRetryType == SessionParamStat.UseRetryType.AMDC_LONG_LINK && !(i == SessionType.LONG_LINK && next.getIpSource() == 0)) || (sessionParamStat.retryType == SessionParamStat.UseRetryType.VALID_AMDC_LONG_LINK && !(i == SessionType.LONG_LINK && next.getIpSource() == 0 && !sessionRequest.isStrategyInvalid(next, str)))))) {
                                    listIterator.remove();
                                    str2 = str2;
                                    try {
                                        ALog.e(TAG, "[retry opt] [getAvailStrategy]  retryType not match, host=" + parse.host(), str, "strategy", next, "reqSeq", sessionParamStat.req, "retryType", Integer.valueOf(sessionParamStat.retryType.ordinal()), "sessionType", Integer.valueOf(i));
                                    } catch (Throwable th3) {
                                        th = th3;
                                        ALog.e(TAG, str2, str, th, new Object[0]);
                                        return list;
                                    }
                                }
                                str2 = str2;
                            }
                            sessionRequest = this;
                        } else {
                            listIterator.remove();
                        }
                        equalsIgnoreCase = equalsIgnoreCase;
                        str2 = str2;
                        z3 = z3;
                        z4 = z4;
                        sessionRequest = this;
                    }
                }
                str2 = str2;
            } catch (Throwable th4) {
                th = th4;
                ALog.e(TAG, str2, str, th, new Object[0]);
                return list;
            }
        } else {
            str2 = str2;
            isIpv6DowngradeWhiteList = false;
            z2 = false;
        }
        if (AwcnConfig.isShortLinkConnectEnable() && sessionParamStat != null) {
            if (!list.isEmpty() || z2) {
                sessionParamStat.isNoStrategy = false;
            } else {
                sessionParamStat.isNoStrategy = true;
            }
        }
        try {
            ALog.e(TAG, "[Ipv6_H3] [getAvailStrategy] host=" + parse.host(), str, "strategies", list, "sessionRequest", Integer.valueOf(this.hashCode), "reqSeq", sessionParamStat == null ? str2 : sessionParamStat.req, v4s.PARAM_IS_RETRY, Boolean.valueOf(sessionParamStat != null && sessionParamStat.isRetry), "isNoStrategy", Boolean.valueOf(sessionParamStat != null && sessionParamStat.isNoStrategy), "isShortLinkConnectEnable", Boolean.valueOf(AwcnConfig.isShortLinkConnectEnable()), "isIpv6Downgrade", Boolean.valueOf(isIpv6DowngradeWhiteList));
        } catch (Throwable th5) {
            th = th5;
            ALog.e(TAG, str2, str, th, new Object[0]);
            return list;
        }
        return list;
    }

    private int getCreateTnetSpdySessionType(TnetSpdySession tnetSpdySession, Context context, ConnInfo connInfo, String str, boolean z, IConnCb iConnCb, IOneSessionConnCb iOneSessionConnCb, SessionParamStat sessionParamStat) {
        int i;
        String str2;
        int i2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92440e0a", new Object[]{this, tnetSpdySession, context, connInfo, str, new Boolean(z), iConnCb, iOneSessionConnCb, sessionParamStat})).intValue();
        }
        Session httpSession = tnetSpdySession == null ? new HttpSession(context, connInfo) : tnetSpdySession;
        httpSession.setForceCellular(this.isForceCellular);
        if (!z || this.connectingSession == null) {
            this.connectingSession = httpSession;
            String host = getHost();
            ConnType connType = connInfo.getConnType();
            String ip = connInfo.getIp();
            Integer valueOf = Integer.valueOf(connInfo.getPort());
            Integer valueOf2 = Integer.valueOf(connInfo.getHeartbeat());
            Session session = this.connectingSession;
            Boolean valueOf3 = Boolean.valueOf(z);
            if (this.connectingSession != null) {
                i = this.connectingSession.forcePubKeyMode;
            } else {
                i = -2;
            }
            if (sessionParamStat == null) {
                str2 = "";
            } else {
                str2 = sessionParamStat.req;
            }
            ALog.e(TAG, "[pubKey] [SessionOpt][connectingSession] create connection...", str, HttpConstant.HOST, host, "Type", connType, "IP", ip, "Port", valueOf, "heartbeat", valueOf2, MspGlobalDefine.SESSION, session, "enableMultiConn", valueOf3, "forcePubKeyMode", i, "reqSeq", str2);
            registerEvent(this.connectingSession, iConnCb, System.currentTimeMillis(), str, iOneSessionConnCb, sessionParamStat);
            return 2;
        }
        this.connectingMultiSession = httpSession;
        this.connectingMultiSession.isMultiSession = true;
        String host2 = getHost();
        ConnType connType2 = connInfo.getConnType();
        String ip2 = connInfo.getIp();
        Integer valueOf4 = Integer.valueOf(connInfo.getPort());
        Integer valueOf5 = Integer.valueOf(connInfo.getHeartbeat());
        Session session2 = this.connectingMultiSession;
        Boolean valueOf6 = Boolean.valueOf(z);
        if (this.connectingMultiSession != null) {
            i2 = this.connectingMultiSession.forcePubKeyMode;
        } else {
            i2 = -2;
        }
        if (sessionParamStat == null) {
            str3 = "";
        } else {
            str3 = sessionParamStat.req;
        }
        ALog.e(TAG, "[pubKey] [SessionOpt][connectingMutilSession] create connection...", str, HttpConstant.HOST, host2, "Type", connType2, "IP", ip2, "Port", valueOf4, "heartbeat", valueOf5, MspGlobalDefine.SESSION, session2, "enableMultiConn", valueOf6, "forcePubKeyMode", i2, "reqSeq", str3);
        registerEvent(this.connectingMultiSession, iConnCb, System.currentTimeMillis(), str, iOneSessionConnCb, sessionParamStat);
        return 1;
    }

    private void createSession(Context context, ConnInfo connInfo, IConnCb iConnCb, String str, boolean z, int i, IOneSessionConnCb iOneSessionConnCb, SessionParamStat sessionParamStat) {
        Object obj;
        HttpSession httpSession;
        TnetSpdySession tnetSpdySession;
        TnetSpdySession tnetSpdySession2;
        int i2;
        String str2;
        int i3;
        String str3;
        SessionRequest sessionRequest = this;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("108114f1", new Object[]{sessionRequest, context, connInfo, iConnCb, str, new Boolean(z), new Integer(i), iOneSessionConnCb, sessionParamStat});
            return;
        }
        ConnType connType = connInfo.getConnType();
        if (context == null || connType.isHttpType()) {
            obj = "enableMultiConn";
            tnetSpdySession = null;
            httpSession = new HttpSession(context, connInfo);
        } else {
            TnetSpdySession tnetSpdySession3 = new TnetSpdySession(context, connInfo);
            tnetSpdySession3.setForceCellular(sessionRequest.isForceCellular);
            tnetSpdySession3.initConfig(sessionRequest.sessionCenter.config);
            SessionInfo sessionInfo = sessionRequest.sessionCenter.attributeManager.getSessionInfo(sessionRequest.mRealHost);
            sessionRequest.sessionInfo = sessionInfo;
            tnetSpdySession3.initSessionInfo(sessionInfo);
            tnetSpdySession3.setTnetPublicKey(sessionRequest.sessionCenter.attributeManager.getPublicKey(sessionRequest.mRealHost));
            if (sessionRequest.isGetPubKeyFail.get()) {
                tnetSpdySession3.forcePubKeyMode.set(1);
            }
            IStrategyInstance instance = StrategyCenter.getInstance();
            SessionStatistic sessionStatistic = tnetSpdySession3.mSessionStat;
            obj = "enableMultiConn";
            sessionStatistic.xqcConnEnv += "-isStrategyExistHttp3=" + instance.isContainHttp3() + "-isContainHttp3=" + sessionRequest.isContainHttp3;
            if (z) {
                GlobalAppRuntimeInfo.updateSessionIndex(str, sessionRequest.mRealHost);
            }
            if (i > 0) {
                tnetSpdySession3.mSeq += "_" + i;
                tnetSpdySession3.countIndex.set(i);
            }
            if (connType.isHTTP3()) {
                tnetSpdySession3.detectHttp3Status = instance.getDetectHttp3Status();
            }
            tnetSpdySession = tnetSpdySession3;
            httpSession = tnetSpdySession3;
        }
        httpSession.setForceCellular(sessionRequest.isForceCellular);
        if (!z || sessionRequest.connectingSession == null) {
            tnetSpdySession2 = tnetSpdySession;
            sessionRequest.connectingSession = httpSession;
            String host = getHost();
            ConnType connType2 = connInfo.getConnType();
            String ip = connInfo.getIp();
            Integer valueOf = Integer.valueOf(connInfo.getPort());
            Integer valueOf2 = Integer.valueOf(connInfo.getHeartbeat());
            Session session = sessionRequest.connectingSession;
            Boolean valueOf3 = Boolean.valueOf(z);
            if (sessionRequest.connectingSession != null) {
                i2 = sessionRequest.connectingSession.forcePubKeyMode;
            } else {
                i2 = -2;
            }
            if (sessionParamStat == null) {
                str2 = "";
            } else {
                str2 = sessionParamStat.req;
            }
            ALog.e(TAG, "[pubKey] [SessionOpt][connectingSession] create connection...", str, HttpConstant.HOST, host, "Type", connType2, "IP", ip, "Port", valueOf, "heartbeat", valueOf2, MspGlobalDefine.SESSION, session, obj, valueOf3, "forcePubKeyMode", i2, "reqSeq", str2);
            sessionRequest = this;
            registerEvent(sessionRequest.connectingSession, iConnCb, System.currentTimeMillis(), str, iOneSessionConnCb, sessionParamStat);
            sessionRequest.connectingSession.connect();
        } else {
            sessionRequest.connectingMultiSession = httpSession;
            sessionRequest.connectingMultiSession.isMultiSession = true;
            String host2 = getHost();
            ConnType connType3 = connInfo.getConnType();
            String ip2 = connInfo.getIp();
            Integer valueOf4 = Integer.valueOf(connInfo.getPort());
            Integer valueOf5 = Integer.valueOf(connInfo.getHeartbeat());
            Session session2 = sessionRequest.connectingMultiSession;
            Boolean valueOf6 = Boolean.valueOf(z);
            if (sessionRequest.connectingMultiSession != null) {
                i3 = sessionRequest.connectingMultiSession.forcePubKeyMode;
            } else {
                i3 = -2;
            }
            if (sessionParamStat == null) {
                str3 = "";
            } else {
                str3 = sessionParamStat.req;
            }
            tnetSpdySession2 = tnetSpdySession;
            ALog.e(TAG, "[pubKey] [SessionOpt][connectingMutilSession] create connection...", str, HttpConstant.HOST, host2, "Type", connType3, "IP", ip2, "Port", valueOf4, "heartbeat", valueOf5, MspGlobalDefine.SESSION, session2, obj, valueOf6, "forcePubKeyMode", i3, "reqSeq", str3);
            registerEvent(sessionRequest.connectingMultiSession, iConnCb, System.currentTimeMillis(), str, iOneSessionConnCb, sessionParamStat);
            sessionRequest.connectingMultiSession.connect();
        }
        SessionConnStat sessionConnStat = sessionRequest.connStat;
        sessionConnStat.retryTimes++;
        sessionConnStat.startConnect = System.currentTimeMillis();
        if (tnetSpdySession2 != null) {
            sessionRequest.connStat.xquicErrorCode = tnetSpdySession2.getErrorCode();
            sessionRequest.connStat.putExtra("tnetExternStat", tnetSpdySession2.getTnetExternStatMsg());
        }
        SessionConnStat sessionConnStat2 = sessionRequest.connStat;
        if (sessionConnStat2.retryTimes == 0) {
            sessionConnStat2.putExtra("firstIp", connInfo.getIp());
            IConnStrategy iConnStrategy = connInfo.strategy;
            if (iConnStrategy != null) {
                sessionRequest.connStat.firstIpType = iConnStrategy.getIpType();
            }
        }
    }

    public void connectingSession(List<ConnInfo> list, Context context, SessionParamStat sessionParamStat, int i, int i2, String str) {
        String str2;
        char c;
        ConnInfo connInfo;
        int i3;
        boolean z;
        List<ConnInfo> complexIpList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e304668f", new Object[]{this, list, context, sessionParamStat, new Integer(i), new Integer(i2), str});
            return;
        }
        ConnInfo connInfo2 = list.get(0);
        if (connInfo2 != null) {
            if (sessionParamStat == null) {
                str2 = "";
            } else {
                str2 = sessionParamStat.req;
            }
            if (sessionParamStat != null) {
                sessionParamStat.sessionType = i;
                sessionParamStat.protocolType = i2;
            }
            if (!AwcnConfig.isVpnDetectRacingOpened() || !NetworkStatusHelper.isVpn()) {
                connInfo = connInfo2;
                i3 = 1;
                if (!AwcnConfig.isMultiConnectOpened() || !AwcnConfig.isHostInMultiConnectWhiteList(this.mRealHost)) {
                    list.remove(0);
                    c = 0;
                    createSession(context, connInfo, new ConnCb(context, list, connInfo, sessionParamStat), connInfo.getSeq(), false, 0, null, sessionParamStat);
                } else {
                    createMultiSession(context, list, sessionParamStat);
                    c = 0;
                }
                z = false;
            } else {
                list.remove(0);
                TnetSpdySession createTnetSpdySession = createTnetSpdySession(context, connInfo2, str, false, 0);
                connInfo = connInfo2;
                i3 = 1;
                int createTnetSpdySessionType = getCreateTnetSpdySessionType(createTnetSpdySession, context, connInfo2, connInfo2.getSeq(), false, new ConnCb(context, list, connInfo2, sessionParamStat), null, sessionParamStat);
                z = vpnRacing(list, str, str2, sessionParamStat, context);
                sessionConnect(createTnetSpdySession, connInfo, createTnetSpdySessionType);
                c = 0;
            }
            if (!z && ComplexUtils.isAllowComplexConnect(this.mRealHost, connInfo.getIp()) && (complexIpList = ComplexUtils.getComplexIpList(this.connectingSession, list, i3)) != null && complexIpList.size() > 0) {
                long complexConnectDelayTime = ComplexUtils.getComplexConnectDelayTime();
                Long valueOf = Long.valueOf(complexConnectDelayTime);
                Object[] objArr = new Object[4];
                objArr[c] = "delay";
                objArr[i3] = valueOf;
                objArr[2] = "reqSeq";
                objArr[3] = str2;
                ALog.d(TAG, "sessionComplexTask will start", null, objArr);
                this.sessionComplexTask = new SessionComplexTask(context, this, i, i2, complexIpList, sessionParamStat);
                this.complexFuture = ThreadPoolExecutorFactory.submitScheduledTask(this.sessionComplexTask, complexConnectDelayTime, TimeUnit.MILLISECONDS);
            }
        }
    }

    public void createComplexSession(Context context, ConnInfo connInfo, IConnCb iConnCb, String str, boolean z, SessionParamStat sessionParamStat) {
        int i;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be40fabf", new Object[]{this, context, connInfo, iConnCb, str, new Boolean(z), sessionParamStat});
            return;
        }
        ConnType connType = connInfo.getConnType();
        if (context == null || connType.isHttpType()) {
            this.connectingComplexSession = new HttpSession(context, connInfo);
        } else {
            TnetSpdySession tnetSpdySession = new TnetSpdySession(context, connInfo);
            tnetSpdySession.initConfig(this.sessionCenter.config);
            tnetSpdySession.initSessionInfo(this.sessionInfo);
            if (this.isGetPubKeyFail.get()) {
                tnetSpdySession.forcePubKeyMode.set(1);
            }
            tnetSpdySession.setTnetPublicKey(this.sessionCenter.attributeManager.getPublicKey(this.mRealHost));
            if (z) {
                GlobalAppRuntimeInfo.updateSessionIndex(str, this.mRealHost);
            }
            this.connectingComplexSession = tnetSpdySession;
            if (connType.isHTTP3()) {
                this.connectingSession.detectHttp3Status = StrategyCenter.getInstance().getDetectHttp3Status();
            }
        }
        this.connectingComplexSession.isComplex = true;
        String host = getHost();
        ConnType connType2 = connInfo.getConnType();
        String ip = connInfo.getIp();
        Integer valueOf = Integer.valueOf(connInfo.getPort());
        Integer valueOf2 = Integer.valueOf(connInfo.getHeartbeat());
        Session session = this.connectingComplexSession;
        Boolean valueOf3 = Boolean.valueOf(z);
        if (this.connectingComplexSession != null) {
            i = this.connectingComplexSession.forcePubKeyMode;
        } else {
            i = -2;
        }
        if (sessionParamStat == null) {
            str2 = "";
        } else {
            str2 = sessionParamStat.req;
        }
        ALog.e(TAG, "[vpn complex] [SessionOpt] create complex connection...", str, HttpConstant.HOST, host, "Type", connType2, "IP", ip, "Port", valueOf, "heartbeat", valueOf2, MspGlobalDefine.SESSION, session, "enableMultiConn", valueOf3, "forcePubKeyMode", i, "reqSeq", str2);
        registerEvent(this.connectingComplexSession, iConnCb, System.currentTimeMillis(), str, null, sessionParamStat);
        this.connectingComplexSession.mSessionStat.isComplex = true;
        this.connectingComplexSession.connect();
    }
}
