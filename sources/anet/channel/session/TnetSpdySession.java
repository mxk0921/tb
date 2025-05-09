package anet.channel.session;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.Config;
import anet.channel.CustomDataFrameCb;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.IAuth;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.SessionInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.assist.ICapability;
import anet.channel.assist.ISocketBoostCapability;
import anet.channel.assist.NetworkAssist;
import anet.channel.bytes.ByteArray;
import anet.channel.bytes.ByteArrayPool;
import anet.channel.encode.EncodingHelper;
import anet.channel.encode.ZstdDictHelper;
import anet.channel.encode.ZstdResponseHelper;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ConnType;
import anet.channel.entity.Event;
import anet.channel.flow.FlowStat;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.heartbeat.HeartbeatManager;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.heartbeat.SelfKillHeartbeatImpl;
import anet.channel.monitor.SRttMonitor;
import anet.channel.quic.Http3ConnectionDetector;
import anet.channel.request.Request;
import anet.channel.security.ISecurity;
import anet.channel.security.SecurityHelper;
import anet.channel.statist.CustomFrameStat;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.statist.SessionMonitor;
import anet.channel.statist.SessionStatistic;
import anet.channel.statist.ZstdErrorStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.DispatchZstdDictEvent;
import anet.channel.strategy.utils.Utils;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.zstd.ZstdStreamInflater;
import com.android.taobao.zstd.dict.ZstdDecompressDict;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.spdy.AccsSSLCallback;
import org.android.spdy.SessionCb;
import org.android.spdy.SessionExtraCb;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyByteArray;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdyProtocol;
import org.android.spdy.SpdySession;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.android.spdy.StrategyInfo;
import org.android.spdy.SuperviseConnectInfo;
import org.android.spdy.SuperviseData;
import org.json.JSONObject;
import tb.aj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TnetSpdySession extends Session implements SessionCb, SessionExtraCb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SSL_TIKET_KEY2 = "accs_ssl_key2_";
    private static final String TAG = "awcn.TnetSpdySession";
    private static final String TUNNEL_0RTT_STATUS = "0RTTStatus";
    private static final String TUNNEL_CID = "cid";
    private static final String TUNNEL_CONNECT_TIME = "connectTime";
    private static final String TUNNEL_DEGRADED = "degraded";
    private static final String TUNNEL_ERROR_CODE = "errorCode";
    private static final String TUNNEL_IP = "ip";
    private static final String TUNNEL_LOSS_RATE = "lossRate";
    private static final String TUNNEL_PORT = "port";
    private static final String TUNNEL_RETRANSMISSION_RATE = "retransmissionRate";
    private static final String TUNNEL_RETRY_TIMES = "retryTimes";
    private static final String TUNNEL_SRTT = "srtt";
    private static final String TUNNEL_TYPE = "tunnelType";
    private static Map<String, SessionSslTicket> mSslTicketMap = new ConcurrentHashMap();
    private static SharedPreferences sp = null;
    private boolean isQuicTry0RTT;
    public SpdyAgent mAgent;
    public long mLastPingTime;
    public SpdySession mSession;
    private JSONObject tunnelInfo;
    public volatile boolean mHasUnrevPing = false;
    public long mConnectedTime = 0;
    private int requestTimeoutCount = 0;
    private boolean forceCellular = false;
    public int tnetPublicKey = -1;
    public CustomDataFrameCb dataFrameCb = null;
    public IHeartbeat heartbeat = null;
    public IAuth auth = null;
    public String mAppkey = null;
    public ISecurity iSecurity = null;
    private boolean isAccs = false;
    private volatile boolean isRequestSuccess = false;
    private boolean isUseMPQuic = false;
    private List<WaitingFrameData> waitingFrameDataList = new ArrayList();
    private AtomicBoolean eagainStatus = new AtomicBoolean(false);
    private int errorCode = -1;
    private String tnetExternStatMsg = null;
    private Config mConfig = null;
    private boolean isSecondRefreshEnable = false;
    private boolean isSslSpOptEnable = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class SessionSslTicket {
        public String secretKey;
        public String ticket;

        static {
            t2o.a(607125727);
        }

        public SessionSslTicket(String str, String str2) {
            this.ticket = str2;
            this.secretKey = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class WaitingFrameData {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int channel;
        public byte[] data;
        public int dataId;
        public int qos;
        public int type;

        static {
            t2o.a(607125728);
        }

        public WaitingFrameData(int i, byte[] bArr, int i2, int i3, int i4) {
            this.dataId = i;
            this.data = bArr;
            this.type = i2;
            this.channel = i3;
            this.qos = i4;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WaitingFrameData)) {
                return false;
            }
            WaitingFrameData waitingFrameData = (WaitingFrameData) obj;
            if (this.dataId == waitingFrameData.dataId && this.type == waitingFrameData.type && this.channel == waitingFrameData.channel && this.qos == waitingFrameData.qos && Arrays.equals(this.data, waitingFrameData.data)) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(607125717);
    }

    public TnetSpdySession(Context context, ConnInfo connInfo) {
        super(context, connInfo);
    }

    public static /* synthetic */ List access$000(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("668da24", new Object[]{tnetSpdySession});
        }
        return tnetSpdySession.waitingFrameDataList;
    }

    public static /* synthetic */ AtomicBoolean access$100(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("bca27c84", new Object[]{tnetSpdySession});
        }
        return tnetSpdySession.eagainStatus;
    }

    public static /* synthetic */ Context access$1000(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a1e554aa", new Object[]{tnetSpdySession});
        }
        return tnetSpdySession.mContext;
    }

    public static /* synthetic */ Context access$1100(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9336e42b", new Object[]{tnetSpdySession});
        }
        return tnetSpdySession.mContext;
    }

    public static /* synthetic */ ConnType access$1200(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnType) ipChange.ipc$dispatch("2492995e", new Object[]{tnetSpdySession});
        }
        return tnetSpdySession.mConnType;
    }

    public static /* synthetic */ boolean access$1300(TnetSpdySession tnetSpdySession, Context context, String str, String str2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48c4e4d2", new Object[]{tnetSpdySession, context, str, str2, bArr})).booleanValue();
        }
        return tnetSpdySession.putSSLMetaVal(context, str, str2, bArr);
    }

    public static /* synthetic */ void access$1400(TnetSpdySession tnetSpdySession, int i, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0616dc7", new Object[]{tnetSpdySession, new Integer(i), event});
        } else {
            tnetSpdySession.handleCallbacks(i, event);
        }
    }

    public static /* synthetic */ int access$1502(TnetSpdySession tnetSpdySession, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a8145d", new Object[]{tnetSpdySession, new Integer(i)})).intValue();
        }
        tnetSpdySession.requestTimeoutCount = i;
        return i;
    }

    public static /* synthetic */ int access$1504(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e3df32e", new Object[]{tnetSpdySession})).intValue();
        }
        int i = tnetSpdySession.requestTimeoutCount + 1;
        tnetSpdySession.requestTimeoutCount = i;
        return i;
    }

    public static /* synthetic */ String access$1600(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f00ec0e8", new Object[]{tnetSpdySession});
        }
        return tnetSpdySession.mRealHost;
    }

    public static /* synthetic */ IConnStrategy access$1700(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IConnStrategy) ipChange.ipc$dispatch("108921df", new Object[]{tnetSpdySession});
        }
        return tnetSpdySession.mConnStrategy;
    }

    public static /* synthetic */ boolean access$1802(TnetSpdySession tnetSpdySession, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("300efd1c", new Object[]{tnetSpdySession, new Boolean(z)})).booleanValue();
        }
        tnetSpdySession.isRequestSuccess = z;
        return z;
    }

    public static /* synthetic */ ConnType access$1900(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnType) ipChange.ipc$dispatch("dda96937", new Object[]{tnetSpdySession});
        }
        return tnetSpdySession.mConnType;
    }

    public static /* synthetic */ void access$200(TnetSpdySession tnetSpdySession, int i, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f61e3a56", new Object[]{tnetSpdySession, new Integer(i), event});
        } else {
            tnetSpdySession.handleCallbacks(i, event);
        }
    }

    public static /* synthetic */ JSONObject access$2000(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("992b97bf", new Object[]{tnetSpdySession});
        }
        return tnetSpdySession.tunnelInfo;
    }

    public static /* synthetic */ ConnType access$2100(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnType) ipChange.ipc$dispatch("3dcfcb00", new Object[]{tnetSpdySession});
        }
        return tnetSpdySession.mConnType;
    }

    public static /* synthetic */ boolean access$2200(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92cd7e57", new Object[]{tnetSpdySession})).booleanValue();
        }
        return tnetSpdySession.isUseMPQuic;
    }

    public static /* synthetic */ boolean access$2202(TnetSpdySession tnetSpdySession, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cbbd1a3", new Object[]{tnetSpdySession, new Boolean(z)})).booleanValue();
        }
        tnetSpdySession.isUseMPQuic = z;
        return z;
    }

    public static /* synthetic */ void access$2300(TnetSpdySession tnetSpdySession, int i, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43c67fe5", new Object[]{tnetSpdySession, new Integer(i), event});
        } else {
            tnetSpdySession.handleCallbacks(i, event);
        }
    }

    public static /* synthetic */ void access$2400(TnetSpdySession tnetSpdySession, Request request, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f639b8ef", new Object[]{tnetSpdySession, request, new Integer(i)});
        } else {
            tnetSpdySession.handleResponseCode(request, i);
        }
    }

    public static /* synthetic */ void access$2500(TnetSpdySession tnetSpdySession, Request request, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a52f90", new Object[]{tnetSpdySession, request, map});
        } else {
            tnetSpdySession.handleResponseHeaders(request, map);
        }
    }

    public static /* synthetic */ boolean access$300(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8dce214a", new Object[]{tnetSpdySession})).booleanValue();
        }
        return tnetSpdySession.isAccs;
    }

    public static /* synthetic */ boolean access$400(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("286ee3cb", new Object[]{tnetSpdySession})).booleanValue();
        }
        return tnetSpdySession.forceCellular;
    }

    public static /* synthetic */ String access$500(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b2a758", new Object[]{tnetSpdySession});
        }
        return tnetSpdySession.mRealHost;
    }

    public static /* synthetic */ IConnStrategy access$600(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IConnStrategy) ipChange.ipc$dispatch("d56d456f", new Object[]{tnetSpdySession});
        }
        return tnetSpdySession.mConnStrategy;
    }

    public static /* synthetic */ void access$700(TnetSpdySession tnetSpdySession, int i, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d959bd5b", new Object[]{tnetSpdySession, new Integer(i), event});
        } else {
            tnetSpdySession.notifyStatus(i, event);
        }
    }

    public static /* synthetic */ void access$800(TnetSpdySession tnetSpdySession, int i, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a065a45c", new Object[]{tnetSpdySession, new Integer(i), event});
        } else {
            tnetSpdySession.notifyStatus(i, event);
        }
    }

    public static /* synthetic */ Config access$900(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("86ed44dc", new Object[]{tnetSpdySession});
        }
        return tnetSpdySession.mConfig;
    }

    private void addWaitingFrameData(final WaitingFrameData waitingFrameData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d03b1fa4", new Object[]{this, waitingFrameData});
        } else {
            ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anet.channel.session.TnetSpdySession.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (TnetSpdySession.access$000(TnetSpdySession.this)) {
                        try {
                            for (WaitingFrameData waitingFrameData2 : TnetSpdySession.access$000(TnetSpdySession.this)) {
                                if (waitingFrameData.equals(waitingFrameData2)) {
                                    ALog.e(TnetSpdySession.TAG, "[addWaitingFrameData]frame in waiting list.", TnetSpdySession.this.mSeq, new Object[0]);
                                    return;
                                }
                            }
                            TnetSpdySession.access$000(TnetSpdySession.this).add(waitingFrameData);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, ThreadPoolExecutorFactory.Priority.NORMAL);
        }
    }

    private void flushWaitingFrameData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c4a395", new Object[]{this});
        } else {
            ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anet.channel.session.TnetSpdySession.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (TnetSpdySession.access$000(TnetSpdySession.this)) {
                        try {
                            Iterator it = TnetSpdySession.access$000(TnetSpdySession.this).iterator();
                            while (it.hasNext()) {
                                WaitingFrameData waitingFrameData = (WaitingFrameData) it.next();
                                if (!TnetSpdySession.access$100(TnetSpdySession.this).get()) {
                                    TnetSpdySession.this.sendCustomFrame(waitingFrameData.dataId, waitingFrameData.data, waitingFrameData.type, waitingFrameData.channel, waitingFrameData.qos);
                                    it.remove();
                                } else {
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, ThreadPoolExecutorFactory.Priority.NORMAL);
        }
    }

    private void http3ConnectionDetectorUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827ee2ff", new Object[]{this});
        } else {
            ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anet.channel.session.TnetSpdySession.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (TnetSpdySession.access$1200(TnetSpdySession.this).is1RttHTTP3()) {
                        Http3ConnectionDetector.updateHttp3Status(true);
                    }
                }
            }, ThreadPoolExecutorFactory.Priority.NORMAL);
        }
    }

    public static /* synthetic */ Object ipc$super(TnetSpdySession tnetSpdySession, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/session/TnetSpdySession");
    }

    private void onDataFrameException(int i, int i2, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31c1b8c", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), str});
            return;
        }
        CustomDataFrameCb customDataFrameCb = this.dataFrameCb;
        if (customDataFrameCb != null) {
            customDataFrameCb.onException(i, i2, z, str, null);
        }
    }

    public void auth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("554c4e2f", new Object[]{this});
            return;
        }
        IAuth iAuth = this.auth;
        if (iAuth != null) {
            iAuth.auth(this, new IAuth.AuthCallback() { // from class: anet.channel.session.TnetSpdySession.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.IAuth.AuthCallback
                public void onAuthFail(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ccbec0a1", new Object[]{this, new Integer(i), str});
                        return;
                    }
                    TnetSpdySession.access$800(TnetSpdySession.this, 5, null);
                    TnetSpdySession tnetSpdySession = TnetSpdySession.this;
                    SessionStatistic sessionStatistic = tnetSpdySession.mSessionStat;
                    if (sessionStatistic != null) {
                        sessionStatistic.errorCode = i;
                    }
                    tnetSpdySession.close("Accs_Auth_Fail:" + i);
                }

                @Override // anet.channel.IAuth.AuthCallback
                public void onAuthSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3cb08c63", new Object[]{this});
                        return;
                    }
                    TnetSpdySession tnetSpdySession = TnetSpdySession.this;
                    SessionStatistic sessionStatistic = tnetSpdySession.mSessionStat;
                    sessionStatistic.ret = 1;
                    ALog.d(TnetSpdySession.TAG, "spdyOnStreamResponse", tnetSpdySession.mSeq, "authTime", Long.valueOf(sessionStatistic.authTime));
                    TnetSpdySession tnetSpdySession2 = TnetSpdySession.this;
                    if (tnetSpdySession2.mConnectedTime > 0) {
                        tnetSpdySession2.mSessionStat.authTime = System.currentTimeMillis() - TnetSpdySession.this.mConnectedTime;
                    }
                    TnetSpdySession.access$700(TnetSpdySession.this, 4, null);
                    TnetSpdySession.this.mLastPingTime = System.currentTimeMillis();
                    TnetSpdySession tnetSpdySession3 = TnetSpdySession.this;
                    IHeartbeat iHeartbeat = tnetSpdySession3.heartbeat;
                    if (iHeartbeat != null) {
                        iHeartbeat.start(tnetSpdySession3);
                    }
                }
            });
            return;
        }
        notifyStatus(4, null);
        this.mSessionStat.ret = 1;
        IHeartbeat iHeartbeat = this.heartbeat;
        if (iHeartbeat != null) {
            iHeartbeat.start(this);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void bioPingRecvCallback(SpdySession spdySession, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6dabda", new Object[]{this, spdySession, new Integer(i)});
        }
    }

    @Override // anet.channel.Session
    public void close(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9419ce89", new Object[]{this, str});
            return;
        }
        updateCloseReason(str);
        ALog.e(TAG, "force close! closeReason=" + str, this.mSeq, MspGlobalDefine.SESSION, this);
        notifyStatus(7, null);
        try {
            IHeartbeat iHeartbeat = this.heartbeat;
            if (iHeartbeat != null) {
                iHeartbeat.stop();
                this.heartbeat = null;
            }
            SpdySession spdySession = this.mSession;
            if (spdySession != null) {
                spdySession.closeSession();
            }
        } catch (Exception unused) {
        }
    }

    public int getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue();
        }
        return this.errorCode;
    }

    @Override // anet.channel.Session
    public boolean getForceCellular() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fcdf6ca", new Object[]{this})).booleanValue();
        }
        return this.forceCellular;
    }

    @Override // anet.channel.Session
    public Runnable getRecvTimeOutRunnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("4a74edeb", new Object[]{this});
        }
        return new Runnable() { // from class: anet.channel.session.TnetSpdySession.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (TnetSpdySession.this.mHasUnrevPing) {
                    TnetSpdySession tnetSpdySession = TnetSpdySession.this;
                    ALog.e(TnetSpdySession.TAG, "send msg time out!", tnetSpdySession.mSeq, "pingUnRcv:", Boolean.valueOf(tnetSpdySession.mHasUnrevPing));
                    try {
                        TnetSpdySession.access$200(TnetSpdySession.this, 2048, null);
                        ConnEvent connEvent = new ConnEvent();
                        connEvent.isSuccess = false;
                        connEvent.isAccs = TnetSpdySession.access$300(TnetSpdySession.this);
                        TnetSpdySession tnetSpdySession2 = TnetSpdySession.this;
                        connEvent.isTunnel = tnetSpdySession2.isTunnel;
                        connEvent.isForceCell = TnetSpdySession.access$400(tnetSpdySession2);
                        connEvent.useProxyStrategy = TnetSpdySession.this.useProxyStrategy;
                        StrategyCenter.getInstance().notifyConnEvent(TnetSpdySession.access$500(TnetSpdySession.this), TnetSpdySession.access$600(TnetSpdySession.this), connEvent);
                        TnetSpdySession.this.close(true, "ping time out");
                    } catch (Exception unused) {
                    }
                }
            }
        };
    }

    public String getTnetExternStatMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f743c5cb", new Object[]{this});
        }
        return this.tnetExternStatMsg;
    }

    public void initSessionInfo(SessionInfo sessionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1a9585", new Object[]{this, sessionInfo});
            return;
        }
        if (sessionInfo != null) {
            this.dataFrameCb = sessionInfo.customDataFrameCb;
            this.auth = sessionInfo.auth;
            if (sessionInfo.isKeepAlive) {
                this.mSessionStat.isKL = 1L;
                this.autoReCreate = true;
                IHeartbeat iHeartbeat = sessionInfo.heartbeat;
                this.heartbeat = iHeartbeat;
                boolean z = sessionInfo.isAccs;
                this.isAccs = z;
                if (iHeartbeat == null) {
                    if (!z || AwcnConfig.isAccsSessionCreateForbiddenInBg()) {
                        this.heartbeat = HeartbeatManager.getDefaultHeartbeat();
                    } else {
                        this.heartbeat = HeartbeatManager.getDefaultBackgroundAccsHeartbeat();
                    }
                }
            }
        }
        if (this.heartbeat == null) {
            this.heartbeat = new SelfKillHeartbeatImpl();
        }
    }

    @Override // anet.channel.Session
    public boolean isSupportSmoothReconnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c04e9cf", new Object[]{this})).booleanValue();
        }
        return true ^ this.isAccs;
    }

    @Override // anet.channel.Session
    public void onDisconnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18aad6e2", new Object[]{this});
        } else {
            this.mHasUnrevPing = false;
        }
    }

    @Override // anet.channel.Session
    public void ping(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e69854fb", new Object[]{this, new Boolean(z)});
        } else {
            ping(z, this.mReadTimeout);
        }
    }

    public void putAsyncSSLMetaVal(final Context context, final String str, final String str2, final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2704145f", new Object[]{this, context, str, str2, bArr});
        } else {
            ThreadPoolExecutorFactory.submitBackupTask(new Runnable() { // from class: anet.channel.session.TnetSpdySession.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TnetSpdySession.access$1300(TnetSpdySession.this, context, str, str2, bArr);
                    }
                }
            });
        }
    }

    @Override // anet.channel.Session
    public void sendCustomFrame(int i, byte[] bArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c377614", new Object[]{this, new Integer(i), bArr, new Integer(i2)});
        } else {
            sendCustomFrame(i, bArr, i2, 1, 4);
        }
    }

    @Override // anet.channel.Session
    public void setForceCellular(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d16da", new Object[]{this, new Boolean(z)});
        } else {
            this.forceCellular = z;
        }
    }

    public void setTnetPublicKey(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cbfdaf1", new Object[]{this, new Integer(i)});
        } else {
            this.tnetPublicKey = i;
        }
    }

    private void commitFlow(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea915ed6", new Object[]{this, str, new Long(j), new Long(j2)});
            return;
        }
        try {
            FlowStat flowStat = new FlowStat();
            flowStat.refer = "accs";
            flowStat.protocoltype = this.mConnType.toString();
            flowStat.req_identifier = str;
            flowStat.upstream = j;
            flowStat.downstream = j2;
            NetworkAnalysis.getInstance().commitFlow(flowStat);
        } catch (Exception e) {
            ALog.e(TAG, "accs commit flow info failed!", null, e, new Object[0]);
        }
    }

    @Override // anet.channel.Session
    public void ping(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec72bd68", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        if (ALog.isPrintLog(1)) {
            ALog.d(TAG, "ping", this.mSeq, "host", this.mHost, "thread", Thread.currentThread().getName());
        }
        if (z) {
            try {
                if (this.mSession != null) {
                    if (!(this.mStatus == 0 || this.mStatus == 4)) {
                        return;
                    }
                    handleCallbacks(64, null);
                    if (!this.mHasUnrevPing) {
                        this.mHasUnrevPing = true;
                        this.mSessionStat.ppkgCount++;
                        this.mSession.submitPing();
                        if (ALog.isPrintLog(1)) {
                            ALog.d(TAG, this.mHost + " submit ping ms:" + (System.currentTimeMillis() - this.mLastPingTime) + " force:" + z, this.mSeq, new Object[0]);
                        }
                        setPingTimeout(i);
                        this.mLastPingTime = System.currentTimeMillis();
                        IHeartbeat iHeartbeat = this.heartbeat;
                        if (iHeartbeat != null) {
                            iHeartbeat.reSchedule();
                            return;
                        }
                        return;
                    }
                    return;
                }
                ALog.e(TAG, this.mHost + " session null", this.mSeq, new Object[0]);
                close("session null");
            } catch (SpdyErrorException e) {
                if (e.SpdyErrorGetCode() == -1104 || e.SpdyErrorGetCode() == -1103) {
                    ALog.e(TAG, "Send request on closed session!!!", this.mSeq, new Object[0]);
                    notifyStatus(6, new Event(2));
                }
                ALog.e(TAG, "ping", this.mSeq, e, new Object[0]);
            } catch (Exception e2) {
                ALog.e(TAG, "ping", this.mSeq, e2, new Object[0]);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:151|26|27|147|(4:(3:159|29|(2:(3:36|(6:145|38|39|(1:41)|42|43)(7:68|157|69|(1:71)(2:72|73)|74|143|75)|76)(2:34|35)|96))|161|95|96)|90|140|91|92|155|93|94) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:(4:151|26|27|147)|(4:(3:159|29|(2:(3:36|(6:145|38|39|(1:41)|42|43)(7:68|157|69|(1:71)(2:72|73)|74|143|75)|76)(2:34|35)|96))|161|95|96)|90|140|91|92|155|93|94) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0251, code lost:
        commitFlow(r2, r3, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0260, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0261, code lost:
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0264, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0265, code lost:
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0268, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0269, code lost:
        r1 = r10;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x029c, code lost:
        if (r14 != null) goto L_0x024e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0333, code lost:
        if (r14 != null) goto L_0x024e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0337, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0249, code lost:
        if (r14 != null) goto L_0x024e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x024b, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x024e, code lost:
        r3 = r14.length;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02bb A[Catch: all -> 0x01d8, TryCatch #15 {all -> 0x01d8, blocks: (B:75:0x01bd, B:76:0x01c0, B:91:0x021b, B:93:0x022e, B:95:0x0232, B:112:0x027e, B:115:0x029f, B:117:0x02bb, B:119:0x02c1, B:126:0x0303, B:130:0x0322), top: B:148:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0152 A[Catch: all -> 0x00c2, Exception -> 0x0188, SpdyErrorException -> 0x018e, TRY_LEAVE, TryCatch #2 {all -> 0x00c2, blocks: (B:11:0x0098, B:13:0x009c, B:26:0x00e6, B:29:0x0109, B:32:0x010f, B:34:0x0114, B:36:0x0121, B:38:0x0129, B:41:0x012e, B:43:0x0131, B:44:0x0134, B:45:0x0137, B:46:0x013a, B:47:0x013d, B:48:0x0140, B:49:0x0143, B:50:0x0146, B:51:0x0148, B:54:0x0152, B:56:0x0165, B:69:0x01a6, B:72:0x01ac), top: B:142:0x0098 }] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.atomic.AtomicBoolean] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v25, types: [anet.channel.statist.StatObject] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [int] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v33, types: [anet.channel.appmonitor.IAppMonitor] */
    /* JADX WARN: Unknown variable types count: 2 */
    @Override // anet.channel.Session
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sendCustomFrame(int r27, byte[] r28, int r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.TnetSpdySession.sendCustomFrame(int, byte[], int, int, int):void");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class RequestCallback extends DftSpdyCb {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private RequestCb callback;
        private Request request;
        private int statusCode = 0;
        private long recDataCount = 0;
        private long rspBodyInflateSize = 0;
        private long recvCallCount = 0;
        private long responseStart = 0;
        private ZstdStreamInflater zstdStreamInflater = null;
        private ZstdDecompressDict zstdDecompressDict = null;
        private ByteArrayOutputStream recData = null;
        private String contentEncoding = null;
        private boolean isZstd = false;
        private boolean isZstdDict = false;
        private String useAsDictionaryStr = null;
        private String LatestDictionaryStr = null;
        private String urlKey = null;
        private ZstdResponseHelper zstdResponseHelper = null;
        private boolean isGzip = false;
        private boolean isGzipDecompressOpend = AwcnConfig.isGzipDecompressOpend();
        private boolean isDecompressOpend = AwcnConfig.isDecompressOpend();
        private boolean isZstdStreamDecompressOpened = AwcnConfig.isZstdStreamDecompressOpened();
        private boolean isZstdDictDecompressOpened = AwcnConfig.isZstdDictDecompressMtopEnable();
        private boolean isSetZstdDictFinish = false;
        private long recDataStart = 0;
        private long chunkCbTime = 0;

        static {
            t2o.a(607125726);
        }

        public RequestCallback(Request request, RequestCb requestCb) {
            this.request = request;
            this.callback = requestCb;
        }

        public static /* synthetic */ Object ipc$super(RequestCallback requestCallback, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/session/TnetSpdySession$RequestCallback");
        }

        private void zstdStreamDecompress(String str, SpdyByteArray spdyByteArray, boolean z, int i) {
            int decompress;
            ByteArray byteArray;
            ZstdResponseHelper zstdResponseHelper;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76b4d78e", new Object[]{this, str, spdyByteArray, new Boolean(z), new Integer(i)});
                return;
            }
            if (this.zstdStreamInflater == null) {
                this.zstdStreamInflater = new ZstdStreamInflater();
            }
            try {
                if (this.isZstdDictDecompressOpened && EncodingHelper.isZstdValid() && (zstdResponseHelper = this.zstdResponseHelper) != null && this.isZstdDict && !this.isSetZstdDictFinish) {
                    byte[] dictionary = zstdResponseHelper.getDictionary(this.urlKey, this.request.getSeq());
                    if (this.zstdDecompressDict == null && dictionary != null) {
                        ZstdDecompressDict zstdDecompressDict = new ZstdDecompressDict(dictionary, 0, dictionary.length);
                        this.zstdDecompressDict = zstdDecompressDict;
                        this.zstdStreamInflater.setDict(zstdDecompressDict);
                        ALog.e(TnetSpdySession.TAG, "[zstd-d] zstdStreamDecompress zstd dict decompress setDict success!", this.request.getSeq(), new Object[0]);
                    }
                    this.isSetZstdDictFinish = true;
                }
            } catch (Throwable th) {
                ALog.e(TnetSpdySession.TAG, "[zstd-d] zstd dict decompress error=" + th.toString(), this.request.getSeq(), new Object[0]);
            }
            if (!z || i != 0) {
                if (spdyByteArray.isUseDirectBuffer()) {
                    ByteArray retrieveAndCopy = ByteArrayPool.getInstance().retrieveAndCopy(spdyByteArray.getByteBuffer(), i);
                    spdyByteArray.recycle();
                    this.zstdStreamInflater.setInput(retrieveAndCopy.getBuffer(), 0, retrieveAndCopy.getDataLength());
                } else {
                    byte[] copyOf = Arrays.copyOf(spdyByteArray.getByteArray(), spdyByteArray.getDataLength());
                    spdyByteArray.recycle();
                    this.zstdStreamInflater.setInput(copyOf, 0, copyOf.length);
                }
                byte[] bArr = new byte[131072];
                while (true) {
                    try {
                        decompress = this.zstdStreamInflater.decompress(bArr);
                        this.rspBodyInflateSize += Math.max(decompress, 0);
                        if (decompress <= 0) {
                            break;
                        }
                        ByteArray retrieveAndCopy2 = ByteArrayPool.getInstance().retrieveAndCopy(bArr, decompress);
                        RequestStatistic requestStatistic = this.request.rs;
                        requestStatistic.bodyDeflatedRefer = 2;
                        requestStatistic.bodyDeflatedRet = 1;
                        this.callback.onDataReceive(retrieveAndCopy2, z && this.zstdStreamInflater.frameFinished());
                    } catch (Exception e) {
                        RequestStatistic requestStatistic2 = this.request.rs;
                        requestStatistic2.bodyDeflatedRefer = 2;
                        requestStatistic2.bodyDeflatedRet = 0;
                        requestStatistic2.rspDecompressionTime = System.currentTimeMillis() - this.recDataStart;
                        this.callback.onFinish(-211, str + " zstd stream catch error", this.request.rs);
                        String obj = e.toString();
                        ALog.e(TnetSpdySession.TAG, str + " zstd stream catch error=" + obj, this.request.getSeq(), " bizReqId", this.request.rs.bizReqId);
                        try {
                            ZstdErrorStatistic zstdErrorStatistic = new ZstdErrorStatistic(this.request.getHost(), this.request.getUrlString(), "nw_zstd_error");
                            int indexOf = obj.indexOf("errCode=");
                            String str2 = "";
                            if (indexOf != -1) {
                                str2 = obj.substring(indexOf + 8);
                            }
                            zstdErrorStatistic.errorCode = str2;
                            AppMonitor.getInstance().commitStat(zstdErrorStatistic);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                if (z) {
                    zstdStreamFinish("zstdStreamDecompress_2", ByteArrayPool.getInstance().retrieveAndCopy(bArr, decompress));
                    return;
                }
                return;
            }
            if (spdyByteArray.isUseDirectBuffer()) {
                byteArray = ByteArrayPool.getInstance().retrieveAndCopy(spdyByteArray.getByteBuffer(), i);
            } else {
                byteArray = ByteArrayPool.getInstance().retrieveAndCopy(spdyByteArray.getByteArray(), spdyByteArray.getDataLength());
            }
            zstdStreamFinish("zstdStreamDecompress_0", byteArray);
        }

        private void zstdStreamFinish(String str, ByteArray byteArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26fe07ce", new Object[]{this, str, byteArray});
            } else if (this.zstdStreamInflater.frameFinished()) {
                this.zstdStreamInflater.close();
                ZstdDecompressDict zstdDecompressDict = this.zstdDecompressDict;
                if (zstdDecompressDict != null) {
                    zstdDecompressDict.a();
                }
                RequestStatistic requestStatistic = this.request.rs;
                requestStatistic.bodyDeflatedRefer = 2;
                requestStatistic.bodyDeflatedRet = 1;
                requestStatistic.rspDecompressionTime = System.currentTimeMillis() - this.recDataStart;
                this.callback.onDataReceive(byteArray, true);
                ALog.e(TnetSpdySession.TAG, str + " zstd stream close ", this.request.getSeq(), new Object[0]);
            } else {
                RequestStatistic requestStatistic2 = this.request.rs;
                requestStatistic2.bodyDeflatedRefer = 2;
                requestStatistic2.bodyDeflatedRet = 0;
                requestStatistic2.rspDecompressionTime = System.currentTimeMillis() - this.recDataStart;
                RequestCb requestCb = this.callback;
                requestCb.onFinish(-210, str + " zstd stream error", this.request.rs);
                ALog.e(TnetSpdySession.TAG, str + " zstd stream  error ", this.request.getSeq(), " bizReqId", this.request.rs.bizReqId);
                try {
                    AppMonitor.getInstance().commitStat(new ZstdErrorStatistic(this.request.getHost(), this.request.getUrlString(), "nw_zstd_error"));
                } catch (Exception unused) {
                }
            }
        }

        @Override // anet.channel.session.DftSpdyCb, org.android.spdy.Spdycb
        public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z, long j, SpdyByteArray spdyByteArray, Object obj) {
            Throwable e;
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9cc7148", new Object[]{this, spdySession, new Boolean(z), new Long(j), spdyByteArray, obj});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            int dataLength = spdyByteArray.getDataLength();
            if (spdyByteArray.isUseDirectBuffer()) {
                if (spdyByteArray.getByteBuffer() == null) {
                    ALog.e(TnetSpdySession.TAG, "spdyDataChunkRecvCB, isTnetRecvUpdate=true, data.getByteBuffer() is null, return", this.request.getSeq(), "len", Integer.valueOf(dataLength), "fin", Boolean.valueOf(z), " bizReqId", this.request.rs.bizReqId);
                    return;
                } else {
                    dataLength = spdyByteArray.getByteBuffer().limit();
                    ALog.d(TnetSpdySession.TAG, "spdyDataChunkRecvCB, isTnetRecvUpdate=true", this.request.getSeq(), "len", Integer.valueOf(dataLength), "fin", Boolean.valueOf(z), " bizReqId", this.request.rs.bizReqId);
                }
            }
            if (ALog.isPrintLog(1)) {
                ALog.d(TnetSpdySession.TAG, "spdyDataChunkRecvCB", this.request.getSeq(), "len", Integer.valueOf(dataLength), "fin", Boolean.valueOf(z), " bizReqId", this.request.rs.bizReqId);
            }
            RequestStatistic requestStatistic = this.request.rs;
            long j2 = dataLength;
            requestStatistic.oneRecMaxDataSize = Math.max(j2, requestStatistic.oneRecMaxDataSize);
            long j3 = this.recvCallCount + 1;
            this.recvCallCount = j3;
            if (z) {
                this.request.rs.putExtra("recvCallCount", Long.valueOf(j3));
                this.request.rs.putExtra("isUseDirectBuffer", Boolean.valueOf(spdyByteArray.isUseDirectBuffer()));
            }
            this.request.rs.recDataSize += j2;
            this.request.rs.lastRecvDataTime = System.currentTimeMillis() - this.request.rs.sendStart;
            IHeartbeat iHeartbeat = TnetSpdySession.this.heartbeat;
            if (iHeartbeat != null) {
                iHeartbeat.reSchedule();
            }
            this.recDataCount += j2;
            this.recDataStart = currentTimeMillis;
            if (this.callback != null) {
                ByteArray create = ByteArray.create(0);
                if (!this.isDecompressOpend || ((!this.isGzipDecompressOpend || !this.isGzip) && !this.isZstd && !this.isZstdDict)) {
                    if (dataLength != 0) {
                        if (spdyByteArray.isUseDirectBuffer()) {
                            create = ByteArrayPool.getInstance().retrieveAndCopy(spdyByteArray.getByteBuffer(), dataLength);
                        } else {
                            create = ByteArrayPool.getInstance().retrieveAndCopy(spdyByteArray.getByteArray(), spdyByteArray.getDataLength());
                        }
                    }
                    RequestStatistic requestStatistic2 = this.request.rs;
                    requestStatistic2.bodyDeflatedRefer = 1;
                    requestStatistic2.bodyDeflatedRet = 1;
                    this.callback.onDataReceive(create, z);
                    spdyByteArray.recycle();
                } else {
                    try {
                        if (this.isZstdStreamDecompressOpened) {
                            if (!this.isZstd) {
                            }
                            zstdStreamDecompress("finDataChunkRecvCB", spdyByteArray, z, dataLength);
                        }
                        if (!this.isZstdDict) {
                            if (this.recData == null) {
                                this.recData = new ByteArrayOutputStream((int) (this.request.rs.contentLength <= 0 ? 1024L : this.request.rs.contentLength * 2));
                            }
                            if (spdyByteArray.isUseDirectBuffer()) {
                                this.recData.write(ByteArrayPool.getInstance().retrieveAndCopy(spdyByteArray.getByteBuffer(), dataLength).getBuffer(), 0, dataLength);
                                i = 0;
                            } else {
                                i = 0;
                                this.recData.write(spdyByteArray.getByteArray(), 0, spdyByteArray.getDataLength());
                            }
                            spdyByteArray.recycle();
                            if (z) {
                                this.request.rs.bodyDeflatedRefer = i;
                                this.recDataStart = System.currentTimeMillis();
                                byte[] decompress = EncodingHelper.decompress(this.contentEncoding, this.recData.toByteArray());
                                this.request.rs.rspDecompressionTime = System.currentTimeMillis() - this.recDataStart;
                                this.rspBodyInflateSize += Math.max(decompress.length, 0);
                                ByteArray retrieveAndCopy = ByteArrayPool.getInstance().retrieveAndCopy(decompress, decompress.length);
                                this.request.rs.bodyDeflatedRet = 1;
                                this.callback.onDataReceive(retrieveAndCopy, z);
                                this.recData = null;
                            }
                        }
                        zstdStreamDecompress("finDataChunkRecvCB", spdyByteArray, z, dataLength);
                    } catch (Error e2) {
                        e = e2;
                        RequestStatistic requestStatistic3 = this.request.rs;
                        requestStatistic3.bodyDeflatedRet = 0;
                        requestStatistic3.rspDecompressionTime = System.currentTimeMillis() - this.recDataStart;
                        this.callback.onFinish(EncodingHelper.encodingFail, "finDataChunkRecvCB error", this.request.rs);
                        ALog.e(TnetSpdySession.TAG, "finDataChunkRecvCB error=" + e.toString(), this.request.getSeq(), " bizReqId", this.request.rs.bizReqId);
                        TnetSpdySession.access$1400(TnetSpdySession.this, 32, null);
                        this.chunkCbTime += System.currentTimeMillis() - currentTimeMillis;
                    } catch (Exception e3) {
                        e = e3;
                        RequestStatistic requestStatistic32 = this.request.rs;
                        requestStatistic32.bodyDeflatedRet = 0;
                        requestStatistic32.rspDecompressionTime = System.currentTimeMillis() - this.recDataStart;
                        this.callback.onFinish(EncodingHelper.encodingFail, "finDataChunkRecvCB error", this.request.rs);
                        ALog.e(TnetSpdySession.TAG, "finDataChunkRecvCB error=" + e.toString(), this.request.getSeq(), " bizReqId", this.request.rs.bizReqId);
                        TnetSpdySession.access$1400(TnetSpdySession.this, 32, null);
                        this.chunkCbTime += System.currentTimeMillis() - currentTimeMillis;
                    }
                }
                TnetSpdySession.access$1400(TnetSpdySession.this, 32, null);
            }
            this.chunkCbTime += System.currentTimeMillis() - currentTimeMillis;
        }

        @Override // anet.channel.session.DftSpdyCb, org.android.spdy.Spdycb
        public void spdyStreamCloseCallback(SpdySession spdySession, long j, int i, Object obj, SuperviseData superviseData) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bce1581", new Object[]{this, spdySession, new Long(j), new Integer(i), obj, superviseData});
                return;
            }
            if (ALog.isPrintLog(1)) {
                ALog.d(TnetSpdySession.TAG, "spdyStreamCloseCallback", this.request.getSeq(), "streamId", Long.valueOf(j), "errorCode", Integer.valueOf(i), " bizReqId", this.request.rs.bizReqId);
            }
            if (this.isZstdDictDecompressOpened && EncodingHelper.isZstdValid() && this.zstdResponseHelper != null) {
                ALog.e(TnetSpdySession.TAG, "[zstd-d] dueToZstdLinkDictionary!", this.request.getSeq(), new Object[0]);
                this.zstdResponseHelper.dueToLinkDictionary(this.urlKey, this.request.getSeq());
            }
            if (i != 0) {
                this.statusCode = ErrorConstant.ERROR_TNET_REQUEST_FAIL;
                str = ErrorConstant.formatMsg(ErrorConstant.ERROR_TNET_REQUEST_FAIL, String.valueOf(i));
                if (i != -2005) {
                    AppMonitor.getInstance().commitStat(new ExceptionStatistic(-300, str, this.request.rs, null));
                }
                ALog.e(TnetSpdySession.TAG, "spdyStreamCloseCallback error", this.request.getSeq(), MspGlobalDefine.SESSION, TnetSpdySession.this.mSeq, "status code", Integer.valueOf(i), MonitorItemConstants.KEY_URL, this.request.getHttpUrl().simpleUrlString(), " bizReqId", this.request.rs.bizReqId);
            } else {
                str = "SUCCESS";
            }
            RequestStatistic requestStatistic = this.request.rs;
            int i2 = requestStatistic.bodyDeflatedRefer;
            if (i2 == 0 || i2 == 2) {
                requestStatistic.bodyDeflatedType = EncodingHelper.getBodyDeflatedType(this.contentEncoding);
            }
            this.request.rs.tnetErrorCode = i;
            setStatisticData(superviseData, this.statusCode, str);
            RequestCb requestCb = this.callback;
            if (requestCb != null) {
                requestCb.onFinish(this.statusCode, str, this.request.rs);
            }
            if (AwcnConfig.isZstdDictDecompressMtopEnable() && EncodingHelper.isZstdValid()) {
                Request request = this.request;
                RequestStatistic requestStatistic2 = request.rs;
                if (requestStatistic2.bodyDeflatedRet == 0 && requestStatistic2.bodyDeflatedType == 4) {
                    ZstdDictHelper.updateZstdDictFail(this.urlKey, request.getSeq());
                }
            }
            if (i == -2004) {
                if (!TnetSpdySession.this.mHasUnrevPing) {
                    TnetSpdySession.this.ping(true);
                }
                if (TnetSpdySession.access$1504(TnetSpdySession.this) >= 2) {
                    ConnEvent connEvent = new ConnEvent();
                    connEvent.isSuccess = false;
                    connEvent.isAccs = TnetSpdySession.access$300(TnetSpdySession.this);
                    TnetSpdySession tnetSpdySession = TnetSpdySession.this;
                    connEvent.isTunnel = tnetSpdySession.isTunnel;
                    connEvent.isForceCell = TnetSpdySession.access$400(tnetSpdySession);
                    connEvent.useProxyStrategy = TnetSpdySession.this.useProxyStrategy;
                    StrategyCenter.getInstance().notifyConnEvent(TnetSpdySession.access$1600(TnetSpdySession.this), TnetSpdySession.access$1700(TnetSpdySession.this), connEvent);
                    TnetSpdySession.this.close(true, "continuous -2004");
                }
            }
        }

        private void setStatisticData(SuperviseData superviseData, int i, String str) {
            boolean z;
            TnetSpdySession tnetSpdySession;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0723e37", new Object[]{this, superviseData, new Integer(i), str});
                return;
            }
            try {
                this.request.rs.rspEnd = System.currentTimeMillis();
                this.request.rs.chunkCbTime = this.chunkCbTime;
                AnalysisFactory.getV3Instance().log(this.request.rs.span, "netRspRecvEnd", null);
                if (!this.request.rs.isDone.get()) {
                    RequestStatistic requestStatistic = this.request.rs;
                    requestStatistic.sessionCloseReason = TnetSpdySession.this.mSessionStat.closeReason;
                    if (i > 0) {
                        requestStatistic.ret = 1;
                        TnetSpdySession.access$1802(TnetSpdySession.this, true);
                    }
                    this.request.rs.statusCode = i;
                    this.request.rs.msg = str;
                    if (superviseData != null) {
                        RequestStatistic requestStatistic2 = this.request.rs;
                        if (requestStatistic2.bodyDeflatedRefer == 1) {
                            requestStatistic2.bodyDeflatedType = superviseData.bodyDeflatedType;
                        }
                        requestStatistic2.fecRecoverCnt = superviseData.fecRecoverCnt;
                        this.request.rs.fecProtected = superviseData.fecProtected;
                        RequestStatistic requestStatistic3 = this.request.rs;
                        requestStatistic3.externInfo = superviseData.externInfo;
                        requestStatistic3.streamId = superviseData.streamId;
                        requestStatistic3.rspEnd = superviseData.responseEnd;
                        this.request.rs.rspDecompressionTime = superviseData.rspDecompressionTime;
                        RequestStatistic requestStatistic4 = this.request.rs;
                        if (requestStatistic4.waitConnectStat == -1) {
                            requestStatistic4.waitConnectStat = superviseData.waitConnectStat;
                        }
                        requestStatistic4.tnetSendStart = superviseData.sendStart;
                        this.request.rs.tnetStreamPktSendStart = superviseData.streamPktSendStart;
                        this.request.rs.tnetStreamPktRecvStart = superviseData.streamPktRecvStart;
                        this.request.rs.tnetStreamRecvStart = superviseData.streamRecvStart;
                        this.request.rs.tnetResponseStart = superviseData.responseStart;
                        this.request.rs.sendBeforeTime = superviseData.sendStart - superviseData.requestStart;
                        RequestStatistic requestStatistic5 = this.request.rs;
                        requestStatistic5.sendDataTime = superviseData.sendEnd - requestStatistic5.sendStart;
                        long j = superviseData.responseStart;
                        long j2 = superviseData.sendEnd;
                        if (j - j2 > 0) {
                            this.request.rs.firstDataTime = j - j2;
                            RequestStatistic requestStatistic6 = this.request.rs;
                            requestStatistic6.putExtra("firstDataChunkTime", Long.valueOf(requestStatistic6.firstChunkTime - superviseData.responseStart));
                            this.request.rs.putExtra("streamH2bTime", Long.valueOf(superviseData.streamRecvBodyStart - superviseData.streamRecvStart));
                            this.request.rs.putExtra("rspH2bTime", Long.valueOf(superviseData.responseBodyStart - superviseData.responseStart));
                            RequestStatistic requestStatistic7 = this.request.rs;
                            requestStatistic7.putExtra("rspCbH2bTime", Long.valueOf(requestStatistic7.firstChunkTime - this.responseStart));
                            this.request.rs.putExtra("fbTimeTrace", superviseData.streamRecvStart + "-" + superviseData.responseStart + "-" + this.responseStart + "-" + superviseData.streamRecvBodyStart + "-" + superviseData.responseBodyStart + "-" + this.request.rs.firstChunkTime + "|" + this.request.rs.responseCbStart);
                        }
                        long j3 = superviseData.responseEnd;
                        long j4 = superviseData.responseStart;
                        if (j3 - j4 > 0) {
                            this.request.rs.recDataTime = j3 - j4;
                        } else if (this.responseStart != 0) {
                            this.request.rs.recDataTime = System.currentTimeMillis() - this.responseStart;
                        }
                        this.request.rs.putExtra("tnetExternStat", superviseData.getExternStat());
                        this.request.rs.putExtra("recvBodyTime", Long.valueOf(superviseData.responseEnd - superviseData.responseBodyStart));
                        this.request.rs.tnetTotalTime = superviseData.responseEnd - superviseData.requestStart;
                        this.request.rs.streamTotalTime = superviseData.responseEnd - superviseData.sendStart;
                        this.request.rs.streamRecvTime = superviseData.streamRecvTime;
                        this.request.rs.sendDataSize = superviseData.bodySize + superviseData.compressSize;
                        this.request.rs.recDataSize = this.recDataCount + superviseData.recvUncompressSize;
                        this.request.rs.reqHeadInflateSize = superviseData.uncompressSize;
                        this.request.rs.reqHeadDeflateSize = superviseData.compressSize;
                        if (this.request.rs.reqBodyInflateSize <= 0) {
                            this.request.rs.reqBodyInflateSize = superviseData.bodySize;
                        }
                        if (this.request.rs.reqBodyDeflateSize <= 0) {
                            this.request.rs.reqBodyDeflateSize = superviseData.bodySize;
                        }
                        this.request.rs.rspHeadDeflateSize = superviseData.recvCompressSize;
                        this.request.rs.rspHeadInflateSize = superviseData.recvUncompressSize;
                        RequestStatistic requestStatistic8 = this.request.rs;
                        if (requestStatistic8.bodyDeflatedRefer != 1) {
                            requestStatistic8.rspBodyDeflateSize = this.recDataCount;
                            this.request.rs.rspBodyInflateSize = this.rspBodyInflateSize;
                        } else {
                            requestStatistic8.rspBodyDeflateSize = superviseData.recvBodySize;
                            this.request.rs.rspBodyInflateSize = this.recDataCount;
                        }
                        if (this.request.rs.contentLength == 0) {
                            this.request.rs.contentLength = superviseData.originContentLength;
                        }
                        SessionStatistic sessionStatistic = TnetSpdySession.this.mSessionStat;
                        sessionStatistic.recvSizeCount += superviseData.recvBodySize + superviseData.recvCompressSize;
                        sessionStatistic.sendSizeCount += superviseData.bodySize + superviseData.compressSize;
                        RequestStatistic requestStatistic9 = this.request.rs;
                        requestStatistic9.srtt = superviseData.srtt;
                        requestStatistic9.minRtt = superviseData.minRtt;
                        requestStatistic9.connInFlight = superviseData.connInFlight;
                        requestStatistic9.recvLimitBps = superviseData.rateLimit;
                        requestStatistic9.pktRetransRate = (superviseData.streamPktRetrans * 1.0d) / superviseData.streamPktSend;
                        SRttMonitor.putDomainSRtt(this.request.getHost(), superviseData.srtt);
                        if (TnetSpdySession.access$1900(TnetSpdySession.this).isHTTP3() && TnetSpdySession.this.isTunnel) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(TnetSpdySession.TUNNEL_0RTT_STATUS, superviseData.tunnel0RTTStatus);
                                jSONObject.put(TnetSpdySession.TUNNEL_DEGRADED, superviseData.tunnelDegraded);
                                jSONObject.put("errorCode", superviseData.tunnelErrorCode);
                                jSONObject.put(TnetSpdySession.TUNNEL_RETRY_TIMES, superviseData.tunnelRetryTimes);
                                jSONObject.put(TnetSpdySession.TUNNEL_TYPE, superviseData.tunnelType);
                                if (TnetSpdySession.access$2000(TnetSpdySession.this) != null) {
                                    jSONObject.put("ip", TnetSpdySession.access$2000(TnetSpdySession.this).get("ip"));
                                    jSONObject.put(TnetSpdySession.TUNNEL_CID, TnetSpdySession.access$2000(TnetSpdySession.this).get(TnetSpdySession.TUNNEL_CID));
                                }
                                this.request.rs.tunnelInfo = jSONObject.toString();
                            } catch (Exception e) {
                                ALog.e(TnetSpdySession.TAG, "[Tunnel Info Error]", TnetSpdySession.this.mSeq, e, " bizReqId", this.request.rs.bizReqId);
                            }
                        }
                        if (TnetSpdySession.access$2100(TnetSpdySession.this).isHTTP3()) {
                            TnetSpdySession tnetSpdySession2 = TnetSpdySession.this;
                            int i2 = superviseData.reqMultipathStatus;
                            if (!(i2 == 1 || i2 == 2)) {
                                z = false;
                                TnetSpdySession.access$2202(tnetSpdySession2, z);
                                this.request.rs.isUseMPQuic = TnetSpdySession.access$2200(TnetSpdySession.this);
                                RequestStatistic requestStatistic10 = this.request.rs;
                                tnetSpdySession = TnetSpdySession.this;
                                requestStatistic10.isMPQuic = tnetSpdySession.mSessionStat.isMPQuic;
                                requestStatistic10.mpquicStatus = superviseData.reqMultipathStatus;
                                requestStatistic10.mpquicSendWeight = superviseData.defaultPathSendWeight;
                                requestStatistic10.mpquicRecvWeight = superviseData.defaultPathRecvWeight;
                                if (TnetSpdySession.access$2200(tnetSpdySession) && GlobalAppRuntimeInfo.isAppBackground()) {
                                    ALog.e(TnetSpdySession.TAG, "[setStatisticData]mpquic use in background.", TnetSpdySession.this.mSeq, " bizReqId", this.request.rs.bizReqId);
                                }
                            }
                            z = true;
                            TnetSpdySession.access$2202(tnetSpdySession2, z);
                            this.request.rs.isUseMPQuic = TnetSpdySession.access$2200(TnetSpdySession.this);
                            RequestStatistic requestStatistic102 = this.request.rs;
                            tnetSpdySession = TnetSpdySession.this;
                            requestStatistic102.isMPQuic = tnetSpdySession.mSessionStat.isMPQuic;
                            requestStatistic102.mpquicStatus = superviseData.reqMultipathStatus;
                            requestStatistic102.mpquicSendWeight = superviseData.defaultPathSendWeight;
                            requestStatistic102.mpquicRecvWeight = superviseData.defaultPathRecvWeight;
                            if (TnetSpdySession.access$2200(tnetSpdySession)) {
                                ALog.e(TnetSpdySession.TAG, "[setStatisticData]mpquic use in background.", TnetSpdySession.this.mSeq, " bizReqId", this.request.rs.bizReqId);
                            }
                        }
                        ALog.e(TnetSpdySession.TAG, "[falcoId:" + this.request.rs.falcoId + "] [setStatisticData]", this.request.getSeq(), "tnetStat", superviseData.superviseDataToString(), MspGlobalDefine.SESSION, TnetSpdySession.this.mSeq, " bizReqId", this.request.rs.bizReqId);
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // anet.channel.session.DftSpdyCb, org.android.spdy.Spdycb
        public void spdyOnStreamResponse(SpdySession spdySession, long j, Map<String, List<String>> map, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fdf60d3", new Object[]{this, spdySession, new Long(j), map, obj});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.responseStart = currentTimeMillis;
            this.request.rs.rspStart = currentTimeMillis;
            RequestStatistic requestStatistic = this.request.rs;
            requestStatistic.firstDataTime = this.responseStart - requestStatistic.sendStart;
            this.statusCode = HttpHelper.parseStatusCode(map);
            TnetSpdySession.access$1502(TnetSpdySession.this, 0);
            ALog.i(TnetSpdySession.TAG, "", this.request.getSeq(), "statusCode", Integer.valueOf(this.statusCode), " bizReqId", this.request.rs.bizReqId);
            ALog.i(TnetSpdySession.TAG, "", this.request.getSeq(), "response headers", map, " bizReqId", this.request.rs.bizReqId);
            String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.CONTENT_ENCODING);
            this.contentEncoding = singleHeaderFieldByKey;
            this.request.rs.contentEncoding = singleHeaderFieldByKey;
            this.request.rs.contentLength = HttpHelper.parseContentLength(map);
            this.isZstd = "zstd".equalsIgnoreCase(this.contentEncoding);
            this.request.rs.isZstdNotReadyUse = !EncodingHelper.isZstdValid() && this.isZstd;
            this.isGzip = "gzip".equalsIgnoreCase(this.contentEncoding);
            this.isZstdDict = "zstd-d".equalsIgnoreCase(this.contentEncoding);
            this.useAsDictionaryStr = HttpHelper.getSingleHeaderFieldByKey(map, "Use-As-Dictionary");
            this.LatestDictionaryStr = HttpHelper.getSingleHeaderFieldByKey(map, "Latest-Dictionary");
            String str = this.request.getHttpUrl().host() + this.request.getHttpUrl().path();
            this.urlKey = str;
            DispatchZstdDictEvent dispatchZstdDictEvent = ZstdDictHelper.getDispatchZstdDictEvent(str, this.request.rs.isZstdDictFlag == 1, this.request.rs.contentEncoding, this.useAsDictionaryStr, this.LatestDictionaryStr, this.request.getSeq());
            if (dispatchZstdDictEvent != null) {
                this.zstdResponseHelper = new ZstdResponseHelper().parseZstdResponseHeader(dispatchZstdDictEvent.urlKey, dispatchZstdDictEvent.contentEncodeStr, dispatchZstdDictEvent.useAsDictionaryStr, dispatchZstdDictEvent.LatestDictionaryStr, this.request.getSeq());
            }
            if (this.contentEncoding != null && (this.isZstd || this.isGzip || this.isZstdDict)) {
                ALog.e(TnetSpdySession.TAG, "spdyOnStreamResponse contentEncoding=" + this.contentEncoding + " ,contentLength=" + this.request.rs.contentLength, this.request.getSeq(), " bizReqId", this.request.rs.bizReqId);
                HttpHelper.removeHeaderFiledByKey(map, HttpConstant.CONTENT_ENCODING);
                HttpHelper.removeHeaderFiledByKey(map, "Content-Length");
                if (this.isZstd || this.isZstdDict) {
                    this.zstdStreamInflater = new ZstdStreamInflater();
                }
            }
            RequestCb requestCb = this.callback;
            if (requestCb != null) {
                requestCb.onResponseCode(this.statusCode, HttpHelper.cloneMap(map));
            }
            TnetSpdySession.access$2300(TnetSpdySession.this, 16, null);
            this.request.rs.server_cc = HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.QUIC_CO_TAGS);
            this.request.rs.contentType = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Type");
            this.request.rs.serverRT = HttpHelper.parseServerRT(map, 1);
            this.request.rs.serverBRT = HttpHelper.parseServerRT(map, 2);
            this.request.rs.eagleEyeId = HttpHelper.parseEagleId(map);
            this.request.rs.isHitCache = HttpHelper.parseCache(map);
            this.request.rs.hitCache = HttpHelper.parseXCache(map);
            this.request.rs.via = HttpHelper.parseVia(map);
            TnetSpdySession.access$2400(TnetSpdySession.this, this.request, this.statusCode);
            TnetSpdySession.access$2500(TnetSpdySession.this, this.request, map);
            IHeartbeat iHeartbeat = TnetSpdySession.this.heartbeat;
            if (iHeartbeat != null) {
                iHeartbeat.reSchedule();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:(8:(3:322|28|(50:33|(2:35|(52:37|38|312|39|40|44|(3:46|47|48)(4:49|316|50|51)|310|63|(2:69|70)|71|(1:75)|76|77|(2:85|(1:87))|88|89|90|91|306|92|93|320|94|95|96|97|291|98|296|99|(7:108|109|298|110|294|111|112)|120|(3:128|(1:130)(2:131|(1:133)(1:134))|(6:145|146|147|301|148|149)(6:138|139|140|289|141|142))|282|152|154|284|(6:161|(1:163)(3:166|(7:168|169|170|171|308|172|173)(4:183|(3:185|(1:187)(1:188)|189)|190|(8:194|216|217|218|219|318|220|221)(11:195|(1:197)(1:198)|199|(1:201)(2:202|(1:204)(1:205))|206|207|208|209|314|210|211))|222)|239|(3:241|(1:243)|(1:247))|248|(2:250|251)(2:252|(2:254|329)(1:326)))|229|(1:231)(1:232)|233|234|235|236|304|237|238|239|(0)|248|(0)(0)))|43|44|(0)(0)|310|63|(4:65|67|69|70)|71|(2:73|75)|76|77|(4:79|83|85|(0))|88|89|90|91|306|92|93|320|94|95|96|97|291|98|296|99|(10:101|104|106|108|109|298|110|294|111|112)|120|(12:122|124|126|128|(0)(0)|(1:136)|145|146|147|301|148|149)|282|152|154|284|(8:156|158|161|(0)(0)|239|(0)|248|(0)(0))|229|(0)(0)|233|234|235|236|304|237|238|239|(0)|248|(0)(0)))|304|237|238|239|(0)|248|(0)(0))|320|94|95|96|97|291|98|296|99|(0)|120|(0)|282|152|154|284|(0)|229|(0)(0)|233|234|235|236) */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0278, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0320, code lost:
        anet.channel.util.ALog.e(r13, "SessionInfo setMultiPath error.", r23.mSeq, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0350, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0385, code lost:
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0245 A[Catch: all -> 0x0278, Exception -> 0x0310, TryCatch #12 {all -> 0x0278, blocks: (B:98:0x0222, B:99:0x023f, B:101:0x0245, B:106:0x0251, B:108:0x025b, B:112:0x0274, B:120:0x0283, B:122:0x0289, B:124:0x0291, B:126:0x0295, B:128:0x029d, B:130:0x02a9, B:131:0x02b0, B:133:0x02b8, B:138:0x02c8, B:142:0x02e8, B:145:0x02ef, B:149:0x0308, B:153:0x0320, B:154:0x032a, B:156:0x0332, B:158:0x033a, B:161:0x0344, B:163:0x0348, B:166:0x0354, B:168:0x0358, B:173:0x0374, B:183:0x0387, B:185:0x038e, B:187:0x0392, B:189:0x0398, B:190:0x039a, B:192:0x03a0, B:195:0x03ab, B:197:0x03af, B:199:0x03b5, B:202:0x03cb, B:206:0x03d4, B:211:0x03ea, B:216:0x03f5, B:221:0x040e, B:222:0x0411, B:229:0x0421, B:231:0x0425, B:232:0x0428, B:233:0x042a, B:238:0x043f, B:239:0x0442, B:241:0x044a, B:243:0x0450, B:245:0x0455, B:247:0x045b, B:248:0x0460, B:250:0x047a, B:252:0x0493, B:254:0x04b9), top: B:291:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0289 A[Catch: all -> 0x0278, Exception -> 0x0310, TryCatch #12 {all -> 0x0278, blocks: (B:98:0x0222, B:99:0x023f, B:101:0x0245, B:106:0x0251, B:108:0x025b, B:112:0x0274, B:120:0x0283, B:122:0x0289, B:124:0x0291, B:126:0x0295, B:128:0x029d, B:130:0x02a9, B:131:0x02b0, B:133:0x02b8, B:138:0x02c8, B:142:0x02e8, B:145:0x02ef, B:149:0x0308, B:153:0x0320, B:154:0x032a, B:156:0x0332, B:158:0x033a, B:161:0x0344, B:163:0x0348, B:166:0x0354, B:168:0x0358, B:173:0x0374, B:183:0x0387, B:185:0x038e, B:187:0x0392, B:189:0x0398, B:190:0x039a, B:192:0x03a0, B:195:0x03ab, B:197:0x03af, B:199:0x03b5, B:202:0x03cb, B:206:0x03d4, B:211:0x03ea, B:216:0x03f5, B:221:0x040e, B:222:0x0411, B:229:0x0421, B:231:0x0425, B:232:0x0428, B:233:0x042a, B:238:0x043f, B:239:0x0442, B:241:0x044a, B:243:0x0450, B:245:0x0455, B:247:0x045b, B:248:0x0460, B:250:0x047a, B:252:0x0493, B:254:0x04b9), top: B:291:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a9 A[Catch: all -> 0x0278, Exception -> 0x0310, TryCatch #12 {all -> 0x0278, blocks: (B:98:0x0222, B:99:0x023f, B:101:0x0245, B:106:0x0251, B:108:0x025b, B:112:0x0274, B:120:0x0283, B:122:0x0289, B:124:0x0291, B:126:0x0295, B:128:0x029d, B:130:0x02a9, B:131:0x02b0, B:133:0x02b8, B:138:0x02c8, B:142:0x02e8, B:145:0x02ef, B:149:0x0308, B:153:0x0320, B:154:0x032a, B:156:0x0332, B:158:0x033a, B:161:0x0344, B:163:0x0348, B:166:0x0354, B:168:0x0358, B:173:0x0374, B:183:0x0387, B:185:0x038e, B:187:0x0392, B:189:0x0398, B:190:0x039a, B:192:0x03a0, B:195:0x03ab, B:197:0x03af, B:199:0x03b5, B:202:0x03cb, B:206:0x03d4, B:211:0x03ea, B:216:0x03f5, B:221:0x040e, B:222:0x0411, B:229:0x0421, B:231:0x0425, B:232:0x0428, B:233:0x042a, B:238:0x043f, B:239:0x0442, B:241:0x044a, B:243:0x0450, B:245:0x0455, B:247:0x045b, B:248:0x0460, B:250:0x047a, B:252:0x0493, B:254:0x04b9), top: B:291:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b0 A[Catch: all -> 0x0278, Exception -> 0x0310, TryCatch #12 {all -> 0x0278, blocks: (B:98:0x0222, B:99:0x023f, B:101:0x0245, B:106:0x0251, B:108:0x025b, B:112:0x0274, B:120:0x0283, B:122:0x0289, B:124:0x0291, B:126:0x0295, B:128:0x029d, B:130:0x02a9, B:131:0x02b0, B:133:0x02b8, B:138:0x02c8, B:142:0x02e8, B:145:0x02ef, B:149:0x0308, B:153:0x0320, B:154:0x032a, B:156:0x0332, B:158:0x033a, B:161:0x0344, B:163:0x0348, B:166:0x0354, B:168:0x0358, B:173:0x0374, B:183:0x0387, B:185:0x038e, B:187:0x0392, B:189:0x0398, B:190:0x039a, B:192:0x03a0, B:195:0x03ab, B:197:0x03af, B:199:0x03b5, B:202:0x03cb, B:206:0x03d4, B:211:0x03ea, B:216:0x03f5, B:221:0x040e, B:222:0x0411, B:229:0x0421, B:231:0x0425, B:232:0x0428, B:233:0x042a, B:238:0x043f, B:239:0x0442, B:241:0x044a, B:243:0x0450, B:245:0x0455, B:247:0x045b, B:248:0x0460, B:250:0x047a, B:252:0x0493, B:254:0x04b9), top: B:291:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0332 A[Catch: all -> 0x0278, SpdyErrorException -> 0x0350, TryCatch #12 {all -> 0x0278, blocks: (B:98:0x0222, B:99:0x023f, B:101:0x0245, B:106:0x0251, B:108:0x025b, B:112:0x0274, B:120:0x0283, B:122:0x0289, B:124:0x0291, B:126:0x0295, B:128:0x029d, B:130:0x02a9, B:131:0x02b0, B:133:0x02b8, B:138:0x02c8, B:142:0x02e8, B:145:0x02ef, B:149:0x0308, B:153:0x0320, B:154:0x032a, B:156:0x0332, B:158:0x033a, B:161:0x0344, B:163:0x0348, B:166:0x0354, B:168:0x0358, B:173:0x0374, B:183:0x0387, B:185:0x038e, B:187:0x0392, B:189:0x0398, B:190:0x039a, B:192:0x03a0, B:195:0x03ab, B:197:0x03af, B:199:0x03b5, B:202:0x03cb, B:206:0x03d4, B:211:0x03ea, B:216:0x03f5, B:221:0x040e, B:222:0x0411, B:229:0x0421, B:231:0x0425, B:232:0x0428, B:233:0x042a, B:238:0x043f, B:239:0x0442, B:241:0x044a, B:243:0x0450, B:245:0x0455, B:247:0x045b, B:248:0x0460, B:250:0x047a, B:252:0x0493, B:254:0x04b9), top: B:291:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0348 A[Catch: all -> 0x0278, SpdyErrorException -> 0x0350, TryCatch #12 {all -> 0x0278, blocks: (B:98:0x0222, B:99:0x023f, B:101:0x0245, B:106:0x0251, B:108:0x025b, B:112:0x0274, B:120:0x0283, B:122:0x0289, B:124:0x0291, B:126:0x0295, B:128:0x029d, B:130:0x02a9, B:131:0x02b0, B:133:0x02b8, B:138:0x02c8, B:142:0x02e8, B:145:0x02ef, B:149:0x0308, B:153:0x0320, B:154:0x032a, B:156:0x0332, B:158:0x033a, B:161:0x0344, B:163:0x0348, B:166:0x0354, B:168:0x0358, B:173:0x0374, B:183:0x0387, B:185:0x038e, B:187:0x0392, B:189:0x0398, B:190:0x039a, B:192:0x03a0, B:195:0x03ab, B:197:0x03af, B:199:0x03b5, B:202:0x03cb, B:206:0x03d4, B:211:0x03ea, B:216:0x03f5, B:221:0x040e, B:222:0x0411, B:229:0x0421, B:231:0x0425, B:232:0x0428, B:233:0x042a, B:238:0x043f, B:239:0x0442, B:241:0x044a, B:243:0x0450, B:245:0x0455, B:247:0x045b, B:248:0x0460, B:250:0x047a, B:252:0x0493, B:254:0x04b9), top: B:291:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0354 A[Catch: all -> 0x0278, SpdyErrorException -> 0x0350, TryCatch #12 {all -> 0x0278, blocks: (B:98:0x0222, B:99:0x023f, B:101:0x0245, B:106:0x0251, B:108:0x025b, B:112:0x0274, B:120:0x0283, B:122:0x0289, B:124:0x0291, B:126:0x0295, B:128:0x029d, B:130:0x02a9, B:131:0x02b0, B:133:0x02b8, B:138:0x02c8, B:142:0x02e8, B:145:0x02ef, B:149:0x0308, B:153:0x0320, B:154:0x032a, B:156:0x0332, B:158:0x033a, B:161:0x0344, B:163:0x0348, B:166:0x0354, B:168:0x0358, B:173:0x0374, B:183:0x0387, B:185:0x038e, B:187:0x0392, B:189:0x0398, B:190:0x039a, B:192:0x03a0, B:195:0x03ab, B:197:0x03af, B:199:0x03b5, B:202:0x03cb, B:206:0x03d4, B:211:0x03ea, B:216:0x03f5, B:221:0x040e, B:222:0x0411, B:229:0x0421, B:231:0x0425, B:232:0x0428, B:233:0x042a, B:238:0x043f, B:239:0x0442, B:241:0x044a, B:243:0x0450, B:245:0x0455, B:247:0x045b, B:248:0x0460, B:250:0x047a, B:252:0x0493, B:254:0x04b9), top: B:291:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0425 A[Catch: all -> 0x0278, SpdyErrorException -> 0x0350, TryCatch #12 {all -> 0x0278, blocks: (B:98:0x0222, B:99:0x023f, B:101:0x0245, B:106:0x0251, B:108:0x025b, B:112:0x0274, B:120:0x0283, B:122:0x0289, B:124:0x0291, B:126:0x0295, B:128:0x029d, B:130:0x02a9, B:131:0x02b0, B:133:0x02b8, B:138:0x02c8, B:142:0x02e8, B:145:0x02ef, B:149:0x0308, B:153:0x0320, B:154:0x032a, B:156:0x0332, B:158:0x033a, B:161:0x0344, B:163:0x0348, B:166:0x0354, B:168:0x0358, B:173:0x0374, B:183:0x0387, B:185:0x038e, B:187:0x0392, B:189:0x0398, B:190:0x039a, B:192:0x03a0, B:195:0x03ab, B:197:0x03af, B:199:0x03b5, B:202:0x03cb, B:206:0x03d4, B:211:0x03ea, B:216:0x03f5, B:221:0x040e, B:222:0x0411, B:229:0x0421, B:231:0x0425, B:232:0x0428, B:233:0x042a, B:238:0x043f, B:239:0x0442, B:241:0x044a, B:243:0x0450, B:245:0x0455, B:247:0x045b, B:248:0x0460, B:250:0x047a, B:252:0x0493, B:254:0x04b9), top: B:291:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0428 A[Catch: all -> 0x0278, SpdyErrorException -> 0x0350, TryCatch #12 {all -> 0x0278, blocks: (B:98:0x0222, B:99:0x023f, B:101:0x0245, B:106:0x0251, B:108:0x025b, B:112:0x0274, B:120:0x0283, B:122:0x0289, B:124:0x0291, B:126:0x0295, B:128:0x029d, B:130:0x02a9, B:131:0x02b0, B:133:0x02b8, B:138:0x02c8, B:142:0x02e8, B:145:0x02ef, B:149:0x0308, B:153:0x0320, B:154:0x032a, B:156:0x0332, B:158:0x033a, B:161:0x0344, B:163:0x0348, B:166:0x0354, B:168:0x0358, B:173:0x0374, B:183:0x0387, B:185:0x038e, B:187:0x0392, B:189:0x0398, B:190:0x039a, B:192:0x03a0, B:195:0x03ab, B:197:0x03af, B:199:0x03b5, B:202:0x03cb, B:206:0x03d4, B:211:0x03ea, B:216:0x03f5, B:221:0x040e, B:222:0x0411, B:229:0x0421, B:231:0x0425, B:232:0x0428, B:233:0x042a, B:238:0x043f, B:239:0x0442, B:241:0x044a, B:243:0x0450, B:245:0x0455, B:247:0x045b, B:248:0x0460, B:250:0x047a, B:252:0x0493, B:254:0x04b9), top: B:291:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x044a A[Catch: all -> 0x0278, SpdyErrorException -> 0x0350, TryCatch #12 {all -> 0x0278, blocks: (B:98:0x0222, B:99:0x023f, B:101:0x0245, B:106:0x0251, B:108:0x025b, B:112:0x0274, B:120:0x0283, B:122:0x0289, B:124:0x0291, B:126:0x0295, B:128:0x029d, B:130:0x02a9, B:131:0x02b0, B:133:0x02b8, B:138:0x02c8, B:142:0x02e8, B:145:0x02ef, B:149:0x0308, B:153:0x0320, B:154:0x032a, B:156:0x0332, B:158:0x033a, B:161:0x0344, B:163:0x0348, B:166:0x0354, B:168:0x0358, B:173:0x0374, B:183:0x0387, B:185:0x038e, B:187:0x0392, B:189:0x0398, B:190:0x039a, B:192:0x03a0, B:195:0x03ab, B:197:0x03af, B:199:0x03b5, B:202:0x03cb, B:206:0x03d4, B:211:0x03ea, B:216:0x03f5, B:221:0x040e, B:222:0x0411, B:229:0x0421, B:231:0x0425, B:232:0x0428, B:233:0x042a, B:238:0x043f, B:239:0x0442, B:241:0x044a, B:243:0x0450, B:245:0x0455, B:247:0x045b, B:248:0x0460, B:250:0x047a, B:252:0x0493, B:254:0x04b9), top: B:291:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x047a A[Catch: all -> 0x0278, SpdyErrorException -> 0x0350, TryCatch #12 {all -> 0x0278, blocks: (B:98:0x0222, B:99:0x023f, B:101:0x0245, B:106:0x0251, B:108:0x025b, B:112:0x0274, B:120:0x0283, B:122:0x0289, B:124:0x0291, B:126:0x0295, B:128:0x029d, B:130:0x02a9, B:131:0x02b0, B:133:0x02b8, B:138:0x02c8, B:142:0x02e8, B:145:0x02ef, B:149:0x0308, B:153:0x0320, B:154:0x032a, B:156:0x0332, B:158:0x033a, B:161:0x0344, B:163:0x0348, B:166:0x0354, B:168:0x0358, B:173:0x0374, B:183:0x0387, B:185:0x038e, B:187:0x0392, B:189:0x0398, B:190:0x039a, B:192:0x03a0, B:195:0x03ab, B:197:0x03af, B:199:0x03b5, B:202:0x03cb, B:206:0x03d4, B:211:0x03ea, B:216:0x03f5, B:221:0x040e, B:222:0x0411, B:229:0x0421, B:231:0x0425, B:232:0x0428, B:233:0x042a, B:238:0x043f, B:239:0x0442, B:241:0x044a, B:243:0x0450, B:245:0x0455, B:247:0x045b, B:248:0x0460, B:250:0x047a, B:252:0x0493, B:254:0x04b9), top: B:291:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0493 A[Catch: all -> 0x0278, SpdyErrorException -> 0x0350, TryCatch #12 {all -> 0x0278, blocks: (B:98:0x0222, B:99:0x023f, B:101:0x0245, B:106:0x0251, B:108:0x025b, B:112:0x0274, B:120:0x0283, B:122:0x0289, B:124:0x0291, B:126:0x0295, B:128:0x029d, B:130:0x02a9, B:131:0x02b0, B:133:0x02b8, B:138:0x02c8, B:142:0x02e8, B:145:0x02ef, B:149:0x0308, B:153:0x0320, B:154:0x032a, B:156:0x0332, B:158:0x033a, B:161:0x0344, B:163:0x0348, B:166:0x0354, B:168:0x0358, B:173:0x0374, B:183:0x0387, B:185:0x038e, B:187:0x0392, B:189:0x0398, B:190:0x039a, B:192:0x03a0, B:195:0x03ab, B:197:0x03af, B:199:0x03b5, B:202:0x03cb, B:206:0x03d4, B:211:0x03ea, B:216:0x03f5, B:221:0x040e, B:222:0x0411, B:229:0x0421, B:231:0x0425, B:232:0x0428, B:233:0x042a, B:238:0x043f, B:239:0x0442, B:241:0x044a, B:243:0x0450, B:245:0x0455, B:247:0x045b, B:248:0x0460, B:250:0x047a, B:252:0x0493, B:254:0x04b9), top: B:291:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0128 A[Catch: all -> 0x0108, SpdyErrorException -> 0x010f, TRY_ENTER, TryCatch #29 {SpdyErrorException -> 0x010f, all -> 0x0108, blocks: (B:50:0x0104, B:65:0x0128, B:67:0x0130, B:69:0x0138, B:73:0x0147, B:79:0x0157, B:81:0x015b, B:83:0x0163, B:85:0x016b), top: B:316:0x0104 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0147 A[Catch: all -> 0x0108, SpdyErrorException -> 0x010f, TRY_ENTER, TRY_LEAVE, TryCatch #29 {SpdyErrorException -> 0x010f, all -> 0x0108, blocks: (B:50:0x0104, B:65:0x0128, B:67:0x0130, B:69:0x0138, B:73:0x0147, B:79:0x0157, B:81:0x015b, B:83:0x0163, B:85:0x016b), top: B:316:0x0104 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0157 A[Catch: all -> 0x0108, SpdyErrorException -> 0x010f, TRY_ENTER, TryCatch #29 {SpdyErrorException -> 0x010f, all -> 0x0108, blocks: (B:50:0x0104, B:65:0x0128, B:67:0x0130, B:69:0x0138, B:73:0x0147, B:79:0x0157, B:81:0x015b, B:83:0x0163, B:85:0x016b), top: B:316:0x0104 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0171  */
    @Override // anet.channel.Session
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void connect() {
        /*
            Method dump skipped, instructions count: 1324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.TnetSpdySession.connect():void");
    }

    @Override // anet.channel.Session
    public boolean isAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[]{this})).booleanValue();
        }
        return this.mStatus == 4;
    }

    private void initSpdyAgent() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a12f24a", new Object[]{this});
            return;
        }
        SpdyAgent.enableDebug = false;
        this.mAgent = SpdyAgent.getInstance(this.mContext, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        ALog.e(TAG, "[initSpdyAgent] setAccsSslCallback start!", this.mSeq, new Object[0]);
        if (this.isSecondRefreshEnable) {
            ALog.e(TAG, "[initSpdyAgent] 0 isSecondRefreshEnable true!", this.mSeq, new Object[0]);
            this.mAgent.setAccsSslCallback(new AccsSSLCallback() { // from class: anet.channel.session.TnetSpdySession.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // org.android.spdy.AccsSSLCallback
                public byte[] getSSLPublicKey(int i2, byte[] bArr) {
                    int i3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (byte[]) ipChange2.ipc$dispatch("13408d1a", new Object[]{this, new Integer(i2), bArr});
                    }
                    byte[] bArr2 = null;
                    try {
                        TnetSpdySession tnetSpdySession = TnetSpdySession.this;
                        if (tnetSpdySession.iSecurity == null) {
                            tnetSpdySession.iSecurity = TnetSpdySession.access$900(tnetSpdySession) != null ? TnetSpdySession.access$900(TnetSpdySession.this).getSecurity() : null;
                        }
                        ISecurity iSecurity = TnetSpdySession.this.iSecurity;
                        if (iSecurity == null || iSecurity.isSecOff()) {
                            TnetSpdySession tnetSpdySession2 = TnetSpdySession.this;
                            String str = tnetSpdySession2.mSeq;
                            ISecurity iSecurity2 = tnetSpdySession2.iSecurity;
                            if (iSecurity2 == null) {
                                i3 = 0;
                            } else {
                                i3 = iSecurity2.isSecOff() ? 1 : 2;
                            }
                            ALog.e(TnetSpdySession.TAG, "[initSpdyAgent] 0 getSSLPublicKey", str, "type", Integer.valueOf(i3));
                        } else {
                            TnetSpdySession tnetSpdySession3 = TnetSpdySession.this;
                            bArr2 = tnetSpdySession3.iSecurity.decrypt(TnetSpdySession.access$1000(tnetSpdySession3), ISecurity.CIPHER_ALGORITHM_AES128, SpdyProtocol.TNET_PUBKEY_SG_KEY, bArr);
                            if (bArr2 != null && ALog.isPrintLog(2)) {
                                ALog.i(TnetSpdySession.TAG, "[initSpdyAgent] 0 getSSLPublicKey", TnetSpdySession.this.mSeq, aj.KEY_DECRYPT, new String(bArr2));
                            }
                        }
                    } catch (Throwable th) {
                        ALog.e(TnetSpdySession.TAG, "[initSpdyAgent] 0 getSSLPublicKey fail! ", TnetSpdySession.this.mSeq, th, new Object[0]);
                    }
                    return bArr2;
                }
            });
        } else {
            ALog.e(TAG, "[initSpdyAgent] 1 isSecondRefreshEnable false!", this.mSeq, new Object[0]);
            ISecurity iSecurity = this.iSecurity;
            if (iSecurity == null || iSecurity.isSecOff()) {
                String str = this.mSeq;
                ISecurity iSecurity2 = this.iSecurity;
                if (iSecurity2 == null) {
                    i = 0;
                } else {
                    i = iSecurity2.isSecOff() ? 1 : 2;
                }
                ALog.e(TAG, "[initSpdyAgent] 1 getSSLPublicKey", str, "type", Integer.valueOf(i));
            } else {
                this.mAgent.setAccsSslCallback(new AccsSSLCallback() { // from class: anet.channel.session.TnetSpdySession.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // org.android.spdy.AccsSSLCallback
                    public byte[] getSSLPublicKey(int i2, byte[] bArr) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (byte[]) ipChange2.ipc$dispatch("13408d1a", new Object[]{this, new Integer(i2), bArr});
                        }
                        byte[] bArr2 = null;
                        try {
                            TnetSpdySession tnetSpdySession = TnetSpdySession.this;
                            bArr2 = tnetSpdySession.iSecurity.decrypt(TnetSpdySession.access$1100(tnetSpdySession), ISecurity.CIPHER_ALGORITHM_AES128, SpdyProtocol.TNET_PUBKEY_SG_KEY, bArr);
                            if (bArr2 != null && ALog.isPrintLog(2)) {
                                ALog.i(TnetSpdySession.TAG, "[initSpdyAgent] 1 getSSLPublicKey", TnetSpdySession.this.mSeq, aj.KEY_DECRYPT, new String(bArr2));
                            }
                        } catch (Throwable th) {
                            ALog.e(TnetSpdySession.TAG, "[initSpdyAgent] 1 getSSLPublicKey fail! ", TnetSpdySession.this.mSeq, th, new Object[0]);
                        }
                        return bArr2;
                    }
                });
            }
        }
        ALog.e(TAG, "[initSpdyAgent] setAccsSslCallback end!", this.mSeq, new Object[0]);
    }

    @Override // org.android.spdy.SessionCb
    public byte[] getSSLMeta(SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c9362ffe", new Object[]{this, spdySession});
        }
        long currentTimeMillis = System.currentTimeMillis();
        String domain = spdySession.getDomain();
        byte[] bArr = null;
        if (this.secondRefreshOpt == 1) {
            if (this.isSslSpOptEnable) {
                byte[] sslTicket = getSslTicket(SSL_TIKET_KEY2 + domain);
                if (sslTicket != null && sslTicket.length > 0) {
                    this.mSessionStat.isHitTicket = 1;
                }
                this.mSessionStat.ticketTime = System.currentTimeMillis() - currentTimeMillis;
                return sslTicket;
            }
            ALog.e(TAG, "[lazyLoadTnetSec] secondRefreshOpt=1, getSSLMeta return null", this.mSeq, "host", this.mRealHost);
            return null;
        } else if (TextUtils.isEmpty(domain)) {
            ALog.i(TAG, "get sslticket host is null", null, new Object[0]);
            return null;
        } else {
            try {
                if (this.iSecurity == null) {
                    Config config = this.mConfig;
                    this.iSecurity = config != null ? config.getSecurity() : null;
                }
                ISecurity iSecurity = this.iSecurity;
                if (iSecurity != null) {
                    Context context = this.mContext;
                    bArr = iSecurity.getBytes(context, SSL_TIKET_KEY2 + domain);
                }
            } catch (Throwable th) {
                ALog.e(TAG, "getSSLMeta", null, th, new Object[0]);
            }
            if (bArr != null && bArr.length > 0) {
                this.mSessionStat.isHitTicket = 1;
            }
            this.mSessionStat.ticketTime = System.currentTimeMillis() - currentTimeMillis;
            return bArr;
        }
    }

    public void initConfig(Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("181b3487", new Object[]{this, config});
        } else if (config != null) {
            this.mAppkey = config.getAppkey();
            boolean z = AwcnConfig.isTnetLazyLoadSecEnable() || "orange-dc.m.taobao.com".equalsIgnoreCase(this.mRealHost);
            this.isSecondRefreshEnable = z;
            if (z) {
                this.mConfig = config;
                boolean isSslSpOptEnable = AwcnConfig.isSslSpOptEnable();
                this.isSslSpOptEnable = isSslSpOptEnable;
                ALog.e(TAG, "[lazyLoadTnetSec] initConfig, lazyLoadTnetSec true", this.mSeq, "isSslSpOptEnable", Boolean.valueOf(isSslSpOptEnable));
                return;
            }
            this.iSecurity = config.getSecurity();
            ALog.e(TAG, "[initConfig] initConfig, lazyLoadTnetSec false!", this.mSeq, new Object[0]);
        } else {
            ALog.e(TAG, "[initConfig] initConfig, config is null!", this.mSeq, new Object[0]);
        }
    }

    @Override // anet.channel.Session
    public boolean isReuse(Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4949e94d", new Object[]{this, session})).booleanValue();
        }
        if (session != null) {
            try {
                if (getConnType().equals(session.getConnType())) {
                    boolean z = this.isCreated && this.mSession.equals(((TnetSpdySession) session).mSession);
                    ALog.e(TAG, "reuse session.", this.mSeq, "result", Boolean.valueOf(z), MspGlobalDefine.SESSION, session.mSeq);
                    return z;
                }
            } catch (Exception unused) {
                ALog.e(TAG, "[isReuse]error.", null, new Object[0]);
            }
        }
        return false;
    }

    @Override // org.android.spdy.SessionCb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ce64c60", new Object[]{this, spdySession, bArr})).intValue();
        }
        String domain = spdySession.getDomain();
        if (this.secondRefreshOpt == 1) {
            if (this.isSslSpOptEnable) {
                putAsyncSSLMetaVal(this.mContext, SSL_TIKET_KEY2 + domain, SSL_TIKET_KEY2 + domain, bArr);
                return 0;
            }
            ALog.e(TAG, "[lazyLoadTnetSec] secondRefreshOpt=1, putSSLMeta return -1", this.mSeq, "host", this.mRealHost);
            return -1;
        } else if (TextUtils.isEmpty(domain)) {
            return -1;
        } else {
            try {
                if (this.iSecurity == null) {
                    Config config = this.mConfig;
                    this.iSecurity = config != null ? config.getSecurity() : null;
                }
                ISecurity iSecurity = this.iSecurity;
                if (iSecurity == null) {
                    return -1;
                }
                if (!iSecurity.saveBytes(this.mContext, SSL_TIKET_KEY2 + domain, bArr)) {
                    i = -1;
                }
                return i;
            } catch (Throwable th) {
                ALog.e(TAG, "putSSLMeta", null, th, new Object[0]);
                return -1;
            }
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7576ccd6", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2)});
            return;
        }
        ALog.e(TAG, "spdyCustomControlFrameFailCallback", this.mSeq, "dataId", Integer.valueOf(i));
        onDataFrameException(i, i2, true, "tnet error");
        CustomFrameStat customFrameStat = new CustomFrameStat();
        customFrameStat.host = this.mRealHost;
        customFrameStat.isAccs = this.isAccs;
        customFrameStat.errCode = i2;
        customFrameStat.ret = 0;
        AppMonitor.getInstance().commitStat(customFrameStat);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i) {
        ICapability capability;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76348e5", new Object[]{this, spdySession, obj, superviseConnectInfo, new Integer(i)});
            return;
        }
        ALog.e(TAG, "spdySessionCloseCallback", this.mSeq, " errorCode:", Integer.valueOf(i));
        IHeartbeat iHeartbeat = this.heartbeat;
        if (iHeartbeat != null) {
            iHeartbeat.stop();
            this.heartbeat = null;
        }
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e) {
                ALog.e(TAG, "session clean up failed!", null, e, new Object[0]);
            }
        }
        if (i == -3516 || i == -5004) {
            ConnEvent connEvent = new ConnEvent();
            connEvent.isSuccess = false;
            connEvent.isTunnel = this.isTunnel;
            connEvent.isForceCell = this.forceCellular;
            connEvent.useProxyStrategy = this.useProxyStrategy;
            StrategyCenter.getInstance().notifyConnEvent(this.mRealHost, this.mConnStrategy, connEvent);
        }
        Event event = new Event(2);
        event.errorCode = i;
        notifyStatus(6, event);
        if (superviseConnectInfo != null) {
            SessionStatistic sessionStatistic = this.mSessionStat;
            sessionStatistic.requestCount = superviseConnectInfo.reused_counter;
            sessionStatistic.liveTime = superviseConnectInfo.keepalive_period_second;
            sessionStatistic.fecSendCount = superviseConnectInfo.fecSendCount;
            sessionStatistic.connectInfo = superviseConnectInfo.connectInfo;
            ALog.e(TAG, "[fec] fecSendCount = " + this.mSessionStat.fecSendCount, this.mSeq, "connectInfo", this.mSessionStat.connectInfo);
            SessionStatistic sessionStatistic2 = this.mSessionStat;
            sessionStatistic2.bgForbiddenTime = superviseConnectInfo.bgForbiddenTime;
            sessionStatistic2.pubkeyRetry = superviseConnectInfo.pubkeyRetry;
            sessionStatistic2.connSendSize = superviseConnectInfo.connSendSize;
            sessionStatistic2.connRecvSize = superviseConnectInfo.connRecvSize;
            sessionStatistic2.handshakeStat = superviseConnectInfo.handshakeStat;
            sessionStatistic2.putExtra("tnetExternStat", spdySession.getExternStat());
            this.mSessionStat.ticketSize = superviseConnectInfo.ticketSize;
            try {
                if (this.mConnType.isHTTP3()) {
                    SessionStatistic sessionStatistic3 = this.mSessionStat;
                    sessionStatistic3.xqc0RttStatus = superviseConnectInfo.xqc0RttStatus;
                    sessionStatistic3.retransmissionRate = superviseConnectInfo.retransmissionRate;
                    sessionStatistic3.lossRate = superviseConnectInfo.lossRate;
                    sessionStatistic3.tlpCount = superviseConnectInfo.tlpCount;
                    sessionStatistic3.rtoCount = superviseConnectInfo.rtoCount;
                    sessionStatistic3.srtt = superviseConnectInfo.srtt;
                    double d = superviseConnectInfo.standbyPathWeight;
                    sessionStatistic3.standbyPathWeight = d;
                    if (d > 0.1d) {
                        GlobalAppRuntimeInfo.showUserToast();
                    }
                    if (this.isTunnel) {
                        try {
                            if (this.tunnelInfo == null) {
                                this.tunnelInfo = new JSONObject();
                            }
                            this.tunnelInfo.put(TUNNEL_0RTT_STATUS, superviseConnectInfo.tunnel0RTTStatus);
                            this.tunnelInfo.put("errorCode", superviseConnectInfo.tunnelErrorCode);
                            this.tunnelInfo.put(TUNNEL_DEGRADED, superviseConnectInfo.tunnelDegraded);
                            this.tunnelInfo.put(TUNNEL_RETRY_TIMES, superviseConnectInfo.tunnelRetryTimes);
                            this.tunnelInfo.put(TUNNEL_SRTT, superviseConnectInfo.tunnelSrtt);
                            this.tunnelInfo.put(TUNNEL_RETRANSMISSION_RATE, superviseConnectInfo.tunnelRetransmissionRate);
                            this.tunnelInfo.put(TUNNEL_LOSS_RATE, superviseConnectInfo.tunnelLossRate);
                            String jSONObject = this.tunnelInfo.toString();
                            ALog.e(TAG, "[spdySessionCloseCallback]", this.mSeq, "tunnelInfo", jSONObject);
                            this.mSessionStat.tunnelInfo = jSONObject;
                        } catch (Exception e2) {
                            ALog.e(TAG, "[Tunnel Info Error]", this.mSeq, e2, new Object[0]);
                        }
                    }
                    try {
                        SessionStatistic sessionStatistic4 = this.mSessionStat;
                        sessionStatistic4.mpquicStatus = superviseConnectInfo.mpquicStatus;
                        sessionStatistic4.mpquicSendWeight = superviseConnectInfo.defaultPathSendWeight;
                        sessionStatistic4.mpquicRecvWeight = superviseConnectInfo.defaultPathRecvWeight;
                        sessionStatistic4.multiNetworkStatus = superviseConnectInfo.multiNetStatus;
                        sessionStatistic4.mpquicPathInfo = superviseConnectInfo.mpquicPathInfo;
                        sessionStatistic4.mpquicOpened = AwcnConfig.isMPQuicEnable() ? 1 : 0;
                    } catch (Exception e3) {
                        ALog.e(TAG, "[MPQUIC stat error]", this.mSeq, e3, new Object[0]);
                    }
                }
                ALog.e(TAG, "[spdySessionCloseCallback]", this.mSeq, "connectInfo", spdySession.getConnectInfoOnDisConnected());
            } catch (Exception unused) {
            }
        }
        SessionStatistic sessionStatistic5 = this.mSessionStat;
        if (sessionStatistic5.errorCode == 0) {
            sessionStatistic5.errorCode = i;
        }
        sessionStatistic5.lastPingInterval = (int) (System.currentTimeMillis() - this.mLastPingTime);
        AppMonitor.getInstance().commitStat(this.mSessionStat);
        if (Utils.isIPV6Address(this.mSessionStat.ip)) {
            AppMonitor.getInstance().commitStat(new SessionMonitor(this.mSessionStat));
        }
        AppMonitor.getInstance().commitAlarm(this.mSessionStat.getAlarmObject());
        if (AwcnConfig.isSocketBoostHost(this.mRealHost) && (capability = NetworkAssist.getAssistManager().getCapability(1)) != null && capability.isEnable()) {
            ((ISocketBoostCapability) capability).clear(this.mIp, this.mPort, this.mConnType.isHTTP3() ? 1 : 0);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionFailedError(SpdySession spdySession, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d5bd4", new Object[]{this, spdySession, new Integer(i), obj});
            return;
        }
        if (spdySession != null) {
            try {
                this.mSessionStat.putExtra("tnetExternStat", spdySession.getExternStat());
                spdySession.cleanUp();
            } catch (Exception e) {
                ALog.e(TAG, "[spdySessionFailedError]session clean up failed!", null, e, new Object[0]);
            }
        }
        notifyStatus(2, new Event(256, i, "tnet connect fail"));
        ALog.e(TAG, null, this.mSeq, " errorId:", Integer.valueOf(i));
        SessionStatistic sessionStatistic = this.mSessionStat;
        sessionStatistic.errorCode = i;
        sessionStatistic.ret = 0;
        if (!sessionStatistic.isReported) {
            sessionStatistic.ret = 2;
        }
        sessionStatistic.netType = NetworkStatusHelper.getNetworkSubType();
        AppMonitor.getInstance().commitStat(this.mSessionStat);
        if (Utils.isIPV6Address(this.mSessionStat.ip)) {
            AppMonitor.getInstance().commitStat(new SessionMonitor(this.mSessionStat));
        }
        AppMonitor.getInstance().commitAlarm(this.mSessionStat.getAlarmObject());
    }

    @Override // org.android.spdy.SessionExtraCb
    public void spdySessionOnWritable(SpdySession spdySession, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5c8a40", new Object[]{this, spdySession, obj, new Integer(i)});
        } else if (this.eagainStatus.compareAndSet(true, false)) {
            ALog.e(TAG, "[spdySessionOnWritable] session writable", this.mSeq, "size", Integer.valueOf(i));
            flushWaitingFrameData();
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        ICapability capability;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2bcf0e", new Object[]{this, spdySession, superviseConnectInfo});
            return;
        }
        SessionStatistic sessionStatistic = this.mSessionStat;
        sessionStatistic.connectionTime = superviseConnectInfo.connectTime;
        sessionStatistic.sslTime = superviseConnectInfo.handshakeTime;
        sessionStatistic.sslCalTime = superviseConnectInfo.doHandshakeTime;
        sessionStatistic.netType = NetworkStatusHelper.getNetworkSubType();
        this.mConnectedTime = System.currentTimeMillis();
        try {
            SessionStatistic sessionStatistic2 = this.mSessionStat;
            int i = superviseConnectInfo.isForceCellular;
            sessionStatistic2.forceCellular = i;
            this.isActualCellular = i > 0;
        } catch (Exception unused) {
        }
        if (this.mConnType.isHTTP3()) {
            SessionStatistic sessionStatistic3 = this.mSessionStat;
            sessionStatistic3.scid = superviseConnectInfo.scid;
            sessionStatistic3.dcid = superviseConnectInfo.dcid;
            sessionStatistic3.congControlKind = superviseConnectInfo.congControlKind;
            this.isQuicTry0RTT = spdySession.isQuicTry0RTT();
            http3ConnectionDetectorUpdate();
            if (this.isTunnel) {
                try {
                    StrategyInfo currStrategyInfo = superviseConnectInfo.getCurrStrategyInfo();
                    if (this.tunnelInfo == null) {
                        this.tunnelInfo = new JSONObject();
                    }
                    if (currStrategyInfo != null) {
                        this.tunnelInfo.put("ip", currStrategyInfo.getTunnelStrategyHost());
                        this.tunnelInfo.put(TUNNEL_PORT, currStrategyInfo.getTunnelStrategyPort());
                    }
                    this.tunnelInfo.put(TUNNEL_CONNECT_TIME, superviseConnectInfo.tunnelConnectTime);
                    JSONObject jSONObject = this.tunnelInfo;
                    jSONObject.put(TUNNEL_CID, superviseConnectInfo.tunnelScid + "|" + superviseConnectInfo.tunnelDcid);
                    this.tunnelInfo.put(TUNNEL_TYPE, superviseConnectInfo.tunnelType);
                } catch (Exception e) {
                    ALog.e(TAG, "[Tunnel Info Error]", this.mSeq, e, new Object[0]);
                }
            }
            ALog.e(TAG, "[HTTP3 spdySessionConnectCB]", this.mSeq, "connectInfo", spdySession.getConnectInfoOnConnected());
        }
        notifyStatus(0, new Event(1));
        auth();
        ALog.e(TAG, "spdySessionConnectCB connect", this.mSeq, TUNNEL_CONNECT_TIME, Integer.valueOf(superviseConnectInfo.connectTime), "sslTime", Integer.valueOf(superviseConnectInfo.handshakeTime));
        if (AwcnConfig.isSocketBoostHost(this.mRealHost) && (capability = NetworkAssist.getAssistManager().getCapability(1)) != null && capability.isEnable()) {
            ((ISocketBoostCapability) capability).set(this.mIp, this.mPort, this.mConnType.isHTTP3() ? 1 : 0, 0);
        }
    }

    private byte[] getSslTicket(String str) {
        Throwable th;
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f9ff38aa", new Object[]{this, str});
        }
        Context context = GlobalAppRuntimeInfo.getContext();
        byte[] bArr = null;
        try {
            SessionSslTicket sessionSslTicket = mSslTicketMap.get(str);
            if (sessionSslTicket != null) {
                try {
                    String str2 = sessionSslTicket.ticket;
                    if (str2 != null && !str2.isEmpty()) {
                        byte[] bytes = sessionSslTicket.ticket.getBytes();
                        ALog.e(TAG, "[ticket_opt] getSslTicket get map!!", this.mSeq, "key", str, "sk", sessionSslTicket.secretKey);
                        return bytes;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (context != null && sp == null) {
                sp = PreferenceManager.getDefaultSharedPreferences(context);
            }
            if (context == null || (sharedPreferences = sp) == null) {
                bArr = null;
                try {
                    ALog.e(TAG, "[ticket_opt] getSslTicket not need try get sp!!", this.mSeq, BaseFBPlugin.VERIFY_TYPE.sp, Boolean.valueOf(sp == null));
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                String string = sharedPreferences.getString(str, null);
                if (string != null) {
                    try {
                        if (!string.isEmpty()) {
                            JSONObject jSONObject = new JSONObject(string);
                            String optString = jSONObject.optString("sk");
                            String optString2 = jSONObject.optString(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP);
                            if (optString2 != null && !optString2.isEmpty() && optString != null && !optString.isEmpty()) {
                                String decryptNoDeps = SecurityHelper.decryptNoDeps(optString, optString2, this.mSeq, "[ticket_opt]");
                                ALog.e(TAG, "[ticket_opt] getSslTicket get sp!!", this.mSeq, "key", str, "isTicketStrNull", Boolean.valueOf(decryptNoDeps == null), "tStr", optString2, "tsk", optString);
                                if (decryptNoDeps == null || decryptNoDeps.isEmpty()) {
                                    sp.edit().remove(str).apply();
                                } else {
                                    mSslTicketMap.put(str, new SessionSslTicket(optString, optString2));
                                    return decryptNoDeps.getBytes();
                                }
                            }
                            return null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bArr = null;
                    }
                }
                try {
                    ALog.e(TAG, "[ticket_opt] getSslTicket, sp not find!!", this.mSeq, new Object[0]);
                    return null;
                } catch (Throwable th5) {
                    th = th5;
                    bArr = null;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
        ALog.e(TAG, "[ticket_opt] getSslTicket error", this.mSeq, th, new Object[0]);
        return bArr;
    }

    @Override // org.android.spdy.SessionCb
    public void spdyPingRecvCallback(SpdySession spdySession, long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1c4fe4d", new Object[]{this, spdySession, new Long(j), obj});
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "ping receive", this.mSeq, HttpConstant.HOST, this.mHost, "id", Long.valueOf(j));
        }
        if (j >= 0) {
            this.mHasUnrevPing = false;
            this.requestTimeoutCount = 0;
            IHeartbeat iHeartbeat = this.heartbeat;
            if (iHeartbeat != null) {
                iHeartbeat.reSchedule();
            }
            handleCallbacks(128, null);
        }
    }

    private boolean putSSLMetaVal(Context context, String str, String str2, byte[] bArr) {
        String str3;
        SessionSslTicket sessionSslTicket;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fd7d141", new Object[]{this, context, str, str2, bArr})).booleanValue();
        }
        try {
            String str4 = new String(bArr);
            if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || str4.isEmpty()) {
                sessionSslTicket = null;
                str3 = null;
            } else {
                sessionSslTicket = new SessionSslTicket(str2, str4);
                mSslTicketMap.put(str, sessionSslTicket);
                str3 = SecurityHelper.encryptNoDeps(str2, str4, this.mSeq, "[ticket_opt]");
                ALog.e(TAG, "[ticket_opt] putSSLMetaVal", this.mSeq, "key", str, "sk", str2, "encryptTicket", str3);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[ticket_opt] putSSLMetaVal error", this.mSeq, th, new Object[0]);
        }
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty() && str3 != null && !str3.isEmpty()) {
            if (context != null && sp == null) {
                sp = PreferenceManager.getDefaultSharedPreferences(context);
            }
            if (!(sp == null || sessionSslTicket == null || str3.isEmpty())) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sk", sessionSslTicket.secretKey);
                jSONObject.put(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP, str3);
                sp.edit().putString(str, jSONObject.toString()).apply();
                ALog.e(TAG, "[ticket_opt] putSSLMetaVal sp put", this.mSeq, "key", str, "sslTicket", str3);
            }
            return true;
        }
        ALog.e(TAG, "[ticket_opt] putSSLMetaVal null", this.mSeq, "key", str, "secretKey", str2, "encryptTicket", str3);
        return false;
    }

    @Override // anet.channel.Session
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            close((String) null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
        if (r34.mStatus == 4) goto L_0x00d3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0332 A[Catch: Exception -> 0x0177, SpdyErrorException -> 0x017e, TryCatch #8 {SpdyErrorException -> 0x017e, Exception -> 0x0177, blocks: (B:44:0x010b, B:56:0x0197, B:58:0x019f, B:61:0x01a4, B:62:0x01ca, B:63:0x01dd, B:66:0x01f0, B:68:0x01f7, B:69:0x01fa, B:70:0x01fe, B:71:0x0202, B:73:0x0215, B:74:0x0217, B:75:0x021d, B:77:0x0221, B:78:0x0249, B:80:0x024f, B:81:0x0297, B:83:0x02a1, B:85:0x02a9, B:88:0x02ba, B:90:0x02c4, B:94:0x02cc, B:98:0x02d9, B:101:0x02e1, B:106:0x02ef, B:109:0x02f5, B:113:0x02ff, B:115:0x0332, B:116:0x0357), top: B:158:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03a0 A[Catch: Exception -> 0x03c2, SpdyErrorException -> 0x03c5, TryCatch #11 {SpdyErrorException -> 0x03c5, Exception -> 0x03c2, blocks: (B:118:0x0392, B:120:0x03a0, B:125:0x03c8, B:138:0x0402), top: B:153:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03eb A[Catch: Exception -> 0x03ef, SpdyErrorException -> 0x03f2, TRY_LEAVE, TryCatch #12 {SpdyErrorException -> 0x03f2, Exception -> 0x03ef, blocks: (B:126:0x03d3, B:128:0x03eb), top: B:151:0x03d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f0 A[Catch: Exception -> 0x0177, SpdyErrorException -> 0x017e, TRY_ENTER, TryCatch #8 {SpdyErrorException -> 0x017e, Exception -> 0x0177, blocks: (B:44:0x010b, B:56:0x0197, B:58:0x019f, B:61:0x01a4, B:62:0x01ca, B:63:0x01dd, B:66:0x01f0, B:68:0x01f7, B:69:0x01fa, B:70:0x01fe, B:71:0x0202, B:73:0x0215, B:74:0x0217, B:75:0x021d, B:77:0x0221, B:78:0x0249, B:80:0x024f, B:81:0x0297, B:83:0x02a1, B:85:0x02a9, B:88:0x02ba, B:90:0x02c4, B:94:0x02cc, B:98:0x02d9, B:101:0x02e1, B:106:0x02ef, B:109:0x02f5, B:113:0x02ff, B:115:0x0332, B:116:0x0357), top: B:158:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0202 A[Catch: Exception -> 0x0177, SpdyErrorException -> 0x017e, TryCatch #8 {SpdyErrorException -> 0x017e, Exception -> 0x0177, blocks: (B:44:0x010b, B:56:0x0197, B:58:0x019f, B:61:0x01a4, B:62:0x01ca, B:63:0x01dd, B:66:0x01f0, B:68:0x01f7, B:69:0x01fa, B:70:0x01fe, B:71:0x0202, B:73:0x0215, B:74:0x0217, B:75:0x021d, B:77:0x0221, B:78:0x0249, B:80:0x024f, B:81:0x0297, B:83:0x02a1, B:85:0x02a9, B:88:0x02ba, B:90:0x02c4, B:94:0x02cc, B:98:0x02d9, B:101:0x02e1, B:106:0x02ef, B:109:0x02f5, B:113:0x02ff, B:115:0x0332, B:116:0x0357), top: B:158:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0221 A[Catch: Exception -> 0x0177, SpdyErrorException -> 0x017e, TryCatch #8 {SpdyErrorException -> 0x017e, Exception -> 0x0177, blocks: (B:44:0x010b, B:56:0x0197, B:58:0x019f, B:61:0x01a4, B:62:0x01ca, B:63:0x01dd, B:66:0x01f0, B:68:0x01f7, B:69:0x01fa, B:70:0x01fe, B:71:0x0202, B:73:0x0215, B:74:0x0217, B:75:0x021d, B:77:0x0221, B:78:0x0249, B:80:0x024f, B:81:0x0297, B:83:0x02a1, B:85:0x02a9, B:88:0x02ba, B:90:0x02c4, B:94:0x02cc, B:98:0x02d9, B:101:0x02e1, B:106:0x02ef, B:109:0x02f5, B:113:0x02ff, B:115:0x0332, B:116:0x0357), top: B:158:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024f A[Catch: Exception -> 0x0177, SpdyErrorException -> 0x017e, TryCatch #8 {SpdyErrorException -> 0x017e, Exception -> 0x0177, blocks: (B:44:0x010b, B:56:0x0197, B:58:0x019f, B:61:0x01a4, B:62:0x01ca, B:63:0x01dd, B:66:0x01f0, B:68:0x01f7, B:69:0x01fa, B:70:0x01fe, B:71:0x0202, B:73:0x0215, B:74:0x0217, B:75:0x021d, B:77:0x0221, B:78:0x0249, B:80:0x024f, B:81:0x0297, B:83:0x02a1, B:85:0x02a9, B:88:0x02ba, B:90:0x02c4, B:94:0x02cc, B:98:0x02d9, B:101:0x02e1, B:106:0x02ef, B:109:0x02f5, B:113:0x02ff, B:115:0x0332, B:116:0x0357), top: B:158:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c4 A[Catch: Exception -> 0x0177, SpdyErrorException -> 0x017e, TryCatch #8 {SpdyErrorException -> 0x017e, Exception -> 0x0177, blocks: (B:44:0x010b, B:56:0x0197, B:58:0x019f, B:61:0x01a4, B:62:0x01ca, B:63:0x01dd, B:66:0x01f0, B:68:0x01f7, B:69:0x01fa, B:70:0x01fe, B:71:0x0202, B:73:0x0215, B:74:0x0217, B:75:0x021d, B:77:0x0221, B:78:0x0249, B:80:0x024f, B:81:0x0297, B:83:0x02a1, B:85:0x02a9, B:88:0x02ba, B:90:0x02c4, B:94:0x02cc, B:98:0x02d9, B:101:0x02e1, B:106:0x02ef, B:109:0x02f5, B:113:0x02ff, B:115:0x0332, B:116:0x0357), top: B:158:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ca  */
    @Override // anet.channel.Session
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public anet.channel.request.Cancelable request(anet.channel.request.Request r35, anet.channel.RequestCb r36) {
        /*
            Method dump skipped, instructions count: 1193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.TnetSpdySession.request(anet.channel.request.Request, anet.channel.RequestCb):anet.channel.request.Cancelable");
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1cc5fc5", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bArr});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        hashMap.put("frameRecvTime", Long.valueOf(elapsedRealtime));
        ALog.e(TAG, "[spdyCustomControlFrameRecvCallback]", this.mSeq, "dataId", Integer.valueOf(i), "type", Integer.valueOf(i2), "len", Integer.valueOf(i4), "frameCb", this.dataFrameCb);
        if (ALog.isPrintLog(1) && i4 < 512) {
            String str = "";
            for (int i5 = 0; i5 < bArr.length; i5++) {
                str = str + Integer.toHexString(bArr[i5] & 255) + " ";
            }
            ALog.e(TAG, null, this.mSeq, "str", str);
        }
        CustomDataFrameCb customDataFrameCb = this.dataFrameCb;
        if (customDataFrameCb != null) {
            customDataFrameCb.onDataReceive(this, bArr, i, i2, i4, hashMap);
        } else {
            ALog.e(TAG, "AccsFrameCb is null", this.mSeq, new Object[0]);
            AppMonitor.getInstance().commitStat(new ExceptionStatistic(-105, null, "rt"));
        }
        SessionStatistic sessionStatistic = this.mSessionStat;
        sessionStatistic.inceptCount++;
        if (i2 == 201) {
            sessionStatistic.reliableChannelCount++;
        } else if (i2 == 202) {
            sessionStatistic.unreliableChannelCount++;
        }
        IHeartbeat iHeartbeat = this.heartbeat;
        if (iHeartbeat != null) {
            iHeartbeat.reSchedule();
        }
        commitFlow(this.mHost, 0L, bArr == null ? 0L : bArr.length);
    }
}
