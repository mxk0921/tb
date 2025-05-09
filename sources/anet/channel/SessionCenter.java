package anet.channel;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import anet.channel.Config;
import anet.channel.SessionParamStat;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.entity.ProtocolType;
import anet.channel.entity.SessionType;
import anet.channel.security.ISecurity;
import anet.channel.session.HttpSession;
import anet.channel.session.okhttp.OkHttpConnector;
import anet.channel.statist.SwitchFlowStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.StrategyResultParser;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.IAmdcSign;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.SessionSeq;
import anet.channel.util.StringUtils;
import anet.channel.util.Utils;
import anetwork.channel.util.RequestConstant;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.ConnectException;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import tb.h1p;
import tb.mh1;
import tb.pod;
import tb.t2o;
import tb.v4s;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SessionCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "awcn.SessionCenter";
    public static Map<Config, SessionCenter> instancesMap = new HashMap();
    private static boolean mInit = false;
    public Config config;
    public final InnerListener innerListener;
    public String seqNum;
    public final SessionPool sessionPool = new SessionPool();
    public final SessionPool retryReqSessionPool = new SessionPool();
    public final Map<String, SessionRequest> srCacheMap = new HashMap();
    public final LruCache<String, SessionRequest> srConcurrencyCache = new LruCache<>(32);
    public final SessionAttributeManager attributeManager = new SessionAttributeManager();
    public Context context = GlobalAppRuntimeInfo.getContext();
    public final AccsSessionManager accsSessionManager = new AccsSessionManager(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class InnerListener implements NetworkStatusHelper.INetworkStatusChangeListener, AppLifecycle.AppLifecycleListener, IStrategyListener, NetworkStatusHelper.IVpnProxyStatusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean foreGroundCheckRunning;

        static {
            t2o.a(607125533);
            t2o.a(607125819);
            t2o.a(607125932);
            t2o.a(607125840);
            t2o.a(607125820);
        }

        private InnerListener() {
            this.foreGroundCheckRunning = false;
        }

        @Override // anet.channel.strategy.IStrategyListener
        public void onStrategyUpdated(StrategyResultParser.HttpDnsResponse httpDnsResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c33e6115", new Object[]{this, httpDnsResponse});
                return;
            }
            SessionCenter.access$100(SessionCenter.this, httpDnsResponse);
            SessionCenter.this.accsSessionManager.checkAndStartSession();
        }

        @Override // anet.channel.status.NetworkStatusHelper.IVpnProxyStatusChangeListener
        public void onVpnProxyStatusChanged(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dd51090", new Object[]{this, new Boolean(z), new Boolean(z2)});
                return;
            }
            List<SessionRequest> infos = SessionCenter.this.sessionPool.getInfos();
            if (!infos.isEmpty()) {
                for (SessionRequest sessionRequest : infos) {
                    ALog.e(SessionCenter.TAG, "[ap] onVpnProxyStatusChanged check session available. request=" + sessionRequest.getHost(), SessionCenter.this.config.getTag(), new Object[0]);
                    sessionRequest.checkSession(1500, SessionCenter.this.config.getTag());
                }
            }
        }

        public void registerAll() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0db8185", new Object[]{this});
                return;
            }
            AppLifecycle.registerLifecycleListener(this);
            NetworkStatusHelper.addStatusChangeListener(this);
            StrategyCenter.getInstance().registerListener(this);
            NetworkStatusHelper.registerVpnProxyStatusListener(this);
        }

        public void unRegisterAll() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fbe05ac", new Object[]{this});
                return;
            }
            StrategyCenter.getInstance().unregisterListener(this);
            AppLifecycle.unregisterLifecycleListener(this);
            NetworkStatusHelper.removeStatusChangeListener(this);
            NetworkStatusHelper.unregisterVpnProxyStatusListener(this);
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void background() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("550392b5", new Object[]{this});
                return;
            }
            ALog.e(SessionCenter.TAG, "[background] config=" + SessionCenter.this.config.getTag(), SessionCenter.this.seqNum, new Object[0]);
            if (!SessionCenter.access$200()) {
                ALog.e(SessionCenter.TAG, "background not inited!", SessionCenter.this.seqNum, new Object[0]);
                return;
            }
            try {
                StrategyCenter.getInstance().saveData();
                if (AwcnConfig.isAccsSessionCreateForbiddenInBg()) {
                    ALog.e(SessionCenter.TAG, "close session", SessionCenter.this.seqNum, new Object[0]);
                    SessionCenter.this.accsSessionManager.forceCloseSession("accs_bg", false);
                }
            } catch (Exception unused) {
            }
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void forground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5402817", new Object[]{this});
                return;
            }
            ALog.e(SessionCenter.TAG, "[forground] config=" + SessionCenter.this.config.getTag(), SessionCenter.this.seqNum, new Object[0]);
            if (SessionCenter.this.context != null && !this.foreGroundCheckRunning) {
                this.foreGroundCheckRunning = true;
                if (!SessionCenter.access$200()) {
                    ALog.e(SessionCenter.TAG, "forground not inited!", SessionCenter.this.seqNum, new Object[0]);
                    return;
                }
                try {
                    if (AppLifecycle.lastEnterBackgroundTime == 0 || System.currentTimeMillis() - AppLifecycle.lastEnterBackgroundTime <= 60000) {
                        SessionCenter.this.accsSessionManager.checkAndStartSession();
                    } else {
                        SessionCenter.this.accsSessionManager.checkSessions("accs_fg");
                    }
                    if (AppLifecycle.lastEnterBackgroundTime != 0) {
                        ALog.e(SessionCenter.TAG, "foreground check session available.", SessionCenter.this.seqNum, new Object[0]);
                        List<SessionRequest> infos = SessionCenter.this.sessionPool.getInfos();
                        if (!infos.isEmpty()) {
                            for (SessionRequest sessionRequest : infos) {
                                sessionRequest.checkSessionsAvailable();
                            }
                        }
                    }
                    this.foreGroundCheckRunning = false;
                } catch (Exception unused) {
                }
            }
        }

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                return;
            }
            String str = "onNetworkStatusChanged. config=" + SessionCenter.this.config.getTag();
            String str2 = SessionCenter.this.seqNum;
            if (networkStatus == null) {
                i = -1;
            } else {
                i = networkStatus.isLastNone.get() ? 1 : 2;
            }
            ALog.e(SessionCenter.TAG, str, str2, "networkStatus", networkStatus, "isLastNone", Integer.valueOf(i));
            List<SessionRequest> infos = SessionCenter.this.sessionPool.getInfos();
            if (!infos.isEmpty()) {
                for (SessionRequest sessionRequest : infos) {
                    ALog.d(SessionCenter.TAG, "network change, try recreate session", SessionCenter.this.seqNum, new Object[0]);
                    sessionRequest.reCreateSession(null, networkStatus);
                }
            }
            SessionCenter.this.accsSessionManager.checkAndStartSession();
        }
    }

    static {
        t2o.a(607125530);
    }

    private SessionCenter(final Config config) {
        InnerListener innerListener = new InnerListener();
        this.innerListener = innerListener;
        this.config = config;
        this.seqNum = config.getAppkey();
        innerListener.registerAll();
        if (!config.getAppkey().equals("[default]")) {
            final String appkey = config.getAppkey();
            ALog.e(TAG, "amdc set sign start！", null, new Object[0]);
            AmdcRuntimeInfo.setSign(new IAmdcSign() { // from class: anet.channel.SessionCenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.strategy.dispatch.IAmdcSign
                public String aesDecryptStr(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (String) ipChange.ipc$dispatch("7787bb3c", new Object[]{this, str});
                    }
                    return config.getSecurity().aesDecryptStr(appkey, str);
                }

                @Override // anet.channel.strategy.dispatch.IAmdcSign
                public String aesEncryptStr(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (String) ipChange.ipc$dispatch("7f310614", new Object[]{this, str});
                    }
                    return config.getSecurity().aesEncryptStr(appkey, str);
                }

                @Override // anet.channel.strategy.dispatch.IAmdcSign
                public String getAppkey() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (String) ipChange.ipc$dispatch("c9396be5", new Object[]{this});
                    }
                    return appkey;
                }

                @Override // anet.channel.strategy.dispatch.IAmdcSign
                public String sign(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (String) ipChange.ipc$dispatch("fd165d2", new Object[]{this, str});
                    }
                    return config.getSecurity().sign(SessionCenter.this.context, ISecurity.SIGN_ALGORITHM_HMAC_SHA1, getAppkey(), str);
                }

                @Override // anet.channel.strategy.dispatch.IAmdcSign
                public boolean useSecurityGuard() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("a6b2f289", new Object[]{this})).booleanValue();
                    }
                    return true ^ config.getSecurity().isSecOff();
                }
            });
        }
    }

    public static /* synthetic */ void access$100(SessionCenter sessionCenter, StrategyResultParser.HttpDnsResponse httpDnsResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8091be0", new Object[]{sessionCenter, httpDnsResponse});
        } else {
            sessionCenter.checkAndUpdateStrategy(httpDnsResponse);
        }
    }

    public static /* synthetic */ boolean access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26a27dfd", new Object[0])).booleanValue();
        }
        return mInit;
    }

    public static void checkAndStartAccsSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c4a0638", new Object[0]);
            return;
        }
        for (SessionCenter sessionCenter : instancesMap.values()) {
            sessionCenter.accsSessionManager.checkAndStartSession();
        }
    }

    private SessionRequest getConcurrencyRequestByUrl(HttpUrl httpUrl) {
        SessionRequest sessionRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionRequest) ipChange.ipc$dispatch("3ab76c54", new Object[]{this, httpUrl});
        }
        String concatString = StringUtils.concatString(httpUrl.scheme(), HttpConstant.SCHEME_SPLIT, httpUrl.host());
        if (TextUtils.isEmpty(concatString)) {
            return null;
        }
        synchronized (this.srConcurrencyCache) {
            try {
                sessionRequest = this.srConcurrencyCache.get(concatString);
                if (sessionRequest == null) {
                    sessionRequest = new SessionRequest(concatString, this);
                    this.srConcurrencyCache.put(concatString, sessionRequest);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sessionRequest;
    }

    public static synchronized SessionCenter getInstance(String str) {
        synchronized (SessionCenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SessionCenter) ipChange.ipc$dispatch("493af5fd", new Object[]{str});
            }
            Config configByTag = Config.getConfigByTag(str);
            if (configByTag != null) {
                return getInstance(configByTag);
            }
            throw new RuntimeException("tag not exist!");
        }
    }

    private SessionRequest getSessionRequestByUrl(HttpUrl httpUrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionRequest) ipChange.ipc$dispatch("4ebfe2f1", new Object[]{this, httpUrl});
        }
        String cNameByHost = StrategyCenter.getInstance().getCNameByHost(httpUrl.host());
        if (cNameByHost == null) {
            cNameByHost = httpUrl.host();
        }
        String scheme = httpUrl.scheme();
        if (!httpUrl.isSchemeLocked()) {
            scheme = StrategyCenter.getInstance().getSchemeByHost(cNameByHost, scheme);
        }
        return getSessionRequest(StringUtils.concatString(scheme, HttpConstant.SCHEME_SPLIT, cNameByHost));
    }

    public static synchronized void init(Context context) {
        synchronized (SessionCenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("609fd211", new Object[]{context});
            } else if (context != null) {
                GlobalAppRuntimeInfo.setContext(context.getApplicationContext());
                if (!mInit) {
                    Map<Config, SessionCenter> map = instancesMap;
                    Config config = Config.DEFAULT_CONFIG;
                    map.put(config, new SessionCenter(config));
                    AppLifecycle.initialize();
                    if (!AwcnConfig.isTbNextLaunch()) {
                        StrategyCenter.getInstance().initialize(GlobalAppRuntimeInfo.getContext());
                    }
                    mInit = true;
                }
            } else {
                ALog.e(TAG, "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            }
        }
    }

    public void asyncGet(HttpUrl httpUrl, int i, long j, SessionGetCallback sessionGetCallback, SessionParamStat sessionParamStat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1dac02", new Object[]{this, httpUrl, new Integer(i), new Long(j), sessionGetCallback, sessionParamStat});
        } else if (sessionGetCallback == null) {
            throw new NullPointerException("cb is null");
        } else if (j > 0) {
            try {
                getInternalAsync(httpUrl, i, j, sessionGetCallback, sessionParamStat);
            } catch (NoAvailStrategyException e) {
                httpUrl.isNoStrategy = true;
                sessionGetCallback.onSessionGetFail();
                ALog.e(TAG, "[Get] no strategy! " + e.getMessage(), this.seqNum, "url", httpUrl.urlString());
            } catch (NoSocketPermissionInBgException unused) {
                sessionGetCallback.onSessionGetFail();
                throw new NoSocketPermissionInBgException("no socket permissions in background");
            } catch (Exception e2) {
                sessionGetCallback.onSessionGetFail();
                ALog.e(TAG, "[asyncGet] fail! ", this.seqNum, "url", httpUrl.urlString(), "error", e2);
            }
        } else {
            throw new InvalidParameterException("timeout must > 0");
        }
    }

    @Deprecated
    public void enterBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436c8bad", new Object[]{this});
        } else {
            AppLifecycle.onBackground();
        }
    }

    @Deprecated
    public void enterForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1a8d42", new Object[]{this});
        } else {
            AppLifecycle.onForeground();
        }
    }

    public Session get(String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("625cc7d1", new Object[]{this, str, new Long(j)}) : get(HttpUrl.parse(str), SessionType.ALL, j);
    }

    public Session getInternal(HttpUrl httpUrl, int i, int i2, long j, SessionGetCallback sessionGetCallback) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("3031b487", new Object[]{this, httpUrl, new Integer(i), new Integer(i2), new Long(j), sessionGetCallback}) : getInternal(httpUrl, i, i2, j, sessionGetCallback, null);
    }

    public Session getSessionBySessionPool(HttpUrl httpUrl, int i, SessionParamStat sessionParamStat) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("ee1b5eb4", new Object[]{this, httpUrl, new Integer(i), sessionParamStat}) : this.sessionPool.getSession(getSessionRequestByUrl(httpUrl), i, ProtocolType.ALL, sessionParamStat);
    }

    public SessionRequest getSessionRequest(String str) {
        SessionRequest sessionRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionRequest) ipChange.ipc$dispatch("49e71bf9", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.srCacheMap) {
            try {
                sessionRequest = this.srCacheMap.get(str);
                if (sessionRequest == null) {
                    sessionRequest = new SessionRequest(str, this);
                    this.srCacheMap.put(str, sessionRequest);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sessionRequest;
    }

    public Session getThrowsException(String str, long j) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("cb9171c7", new Object[]{this, str, new Long(j)}) : getInternal(HttpUrl.parse(str), SessionType.ALL, ProtocolType.ALL, j, null);
    }

    public void registerAccsSessionListener(ISessionListener iSessionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31c66a5", new Object[]{this, iSessionListener});
        } else {
            this.accsSessionManager.registerListener(iSessionListener);
        }
    }

    public void registerPublicKey(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db5ec55f", new Object[]{this, str, new Integer(i)});
        } else {
            this.attributeManager.registerPublicKey(str, i);
        }
    }

    public void registerSessionInfo(SessionInfo sessionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54836d52", new Object[]{this, sessionInfo});
            return;
        }
        this.attributeManager.registerSessionInfo(sessionInfo);
        if (sessionInfo.isKeepAlive) {
            this.accsSessionManager.checkAndStartSession();
        }
    }

    @Deprecated
    public synchronized void switchEnv(ENV env) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25480b21", new Object[]{this, env});
        } else {
            switchEnvironment(env);
        }
    }

    public void unregisterAccsSessionListener(ISessionListener iSessionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1dff7e", new Object[]{this, iSessionListener});
        } else {
            this.accsSessionManager.unregisterListener(iSessionListener);
        }
    }

    public void unregisterSessionInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8f9b19", new Object[]{this, str});
            return;
        }
        SessionInfo unregisterSessionInfo = this.attributeManager.unregisterSessionInfo(str);
        if (unregisterSessionInfo != null && unregisterSessionInfo.isKeepAlive) {
            this.accsSessionManager.checkAndStartSession();
        }
    }

    public void forceRecreateAccsSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f581051", new Object[]{this});
        } else {
            this.accsSessionManager.forceCloseSession("force_recreate_accs_session", true);
        }
    }

    @Deprecated
    public Session get(String str, ConnType.TypeLevel typeLevel, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("40a9c7a7", new Object[]{this, str, typeLevel, new Long(j)});
        }
        return get(HttpUrl.parse(str), typeLevel == ConnType.TypeLevel.SPDY ? SessionType.LONG_LINK : SessionType.SHORT_LINK, j);
    }

    public Session getInternal(HttpUrl httpUrl, int i, int i2, long j, SessionGetCallback sessionGetCallback, SessionParamStat sessionParamStat) throws Exception {
        SessionInfo sessionInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("edebd21e", new Object[]{this, httpUrl, new Integer(i), new Integer(i2), new Long(j), sessionGetCallback, sessionParamStat});
        }
        String str = sessionParamStat == null ? "" : sessionParamStat.req;
        boolean z = sessionParamStat != null && sessionParamStat.isRetry;
        if (!mInit) {
            ALog.e(TAG, "getInternal not inited!", this.seqNum, "reqSeq", str);
            throw new IllegalStateException("getInternal not inited");
        } else if (httpUrl != null) {
            ALog.e(TAG, "getInternal", this.seqNum, "u", httpUrl.urlString(), "sessionType", i == SessionType.LONG_LINK ? "LongLink" : "ShortLink", "protocolType", Integer.valueOf(i2), "timeout", Long.valueOf(j), "reqSeq", str, v4s.PARAM_IS_RETRY, Boolean.valueOf(z));
            SessionRequest sessionRequestByUrl = getSessionRequestByUrl(httpUrl);
            Session session = this.sessionPool.getSession(sessionRequestByUrl, i, i2, sessionParamStat);
            if (session != null) {
                ALog.e(TAG, "fragmentation get internal hit cache session", this.seqNum, MspGlobalDefine.SESSION, session, "reqSeq", str);
            } else if (this.config != Config.DEFAULT_CONFIG || i == SessionType.SHORT_LINK) {
                if (!GlobalAppRuntimeInfo.isAppBackground() || i != SessionType.LONG_LINK || !AwcnConfig.isAccsSessionCreateForbiddenInBg() || (sessionInfo = this.attributeManager.getSessionInfo(httpUrl.host())) == null || !sessionInfo.isAccs) {
                    sessionRequestByUrl.start(this.context, i, i2, SessionSeq.createSequenceNo(this.seqNum), sessionGetCallback, j, sessionParamStat);
                    if (sessionGetCallback == null && j > 0 && ((i == SessionType.ALL || sessionRequestByUrl.getConnectingType() == i) && (i2 == ProtocolType.ALL || sessionRequestByUrl.getConnectingProtocolType() == i2))) {
                        sessionRequestByUrl.await(j);
                        session = this.sessionPool.getSession(sessionRequestByUrl, i, i2, sessionParamStat);
                        if (session == null) {
                            throw new ConnectException("session connecting failed or timeout");
                        }
                    }
                } else {
                    ALog.w(TAG, "app background, forbid to create accs session", this.seqNum, "reqSeq", str);
                    throw new ConnectException("accs session connecting forbidden in background");
                }
            } else if (sessionGetCallback == null) {
                return null;
            } else {
                sessionGetCallback.onSessionGetFail();
                return null;
            }
            return session;
        } else {
            throw new InvalidParameterException("httpUrl is null");
        }
    }

    @Deprecated
    public Session getThrowsException(String str, ConnType.TypeLevel typeLevel, long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("442ac39d", new Object[]{this, str, typeLevel, new Long(j)});
        }
        return getInternal(HttpUrl.parse(str), typeLevel == ConnType.TypeLevel.SPDY ? SessionType.LONG_LINK : SessionType.SHORT_LINK, ProtocolType.ALL, j, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0086 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:6:0x0016, B:8:0x001a, B:12:0x0020, B:14:0x0023, B:16:0x002b, B:18:0x0031, B:23:0x003e, B:25:0x0042, B:26:0x0045, B:28:0x0049, B:29:0x0050, B:31:0x0054, B:32:0x005c, B:34:0x0060, B:37:0x0066, B:39:0x006c, B:41:0x0070, B:43:0x0076, B:44:0x0079, B:45:0x007b, B:46:0x0082, B:48:0x0086, B:49:0x008d), top: B:54:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void checkAndUpdateStrategy(anet.channel.strategy.StrategyResultParser.HttpDnsResponse r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = anet.channel.SessionCenter.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0016
            java.lang.String r3 = "dd5e9817"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r8
            r4[r0] = r9
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0016:
            anet.channel.strategy.StrategyResultParser$Dns[] r2 = r9.dns     // Catch: Exception -> 0x003c
            if (r2 == 0) goto L_0x00a5
            int r3 = r2.length     // Catch: Exception -> 0x003c
            if (r3 != 0) goto L_0x001f
            goto L_0x00a5
        L_0x001f:
            r3 = 0
        L_0x0020:
            int r4 = r2.length     // Catch: Exception -> 0x003c
            if (r3 >= r4) goto L_0x00b2
            r4 = r2[r3]     // Catch: Exception -> 0x003c
            boolean r5 = anet.channel.AwcnConfig.isAllowAccessPoint()     // Catch: Exception -> 0x003c
            if (r5 != 0) goto L_0x005c
            boolean r5 = anet.channel.AwcnConfig.isAccessPointOpened()     // Catch: Exception -> 0x003c
            if (r5 == 0) goto L_0x003e
            int r5 = r9.statusChangeType     // Catch: Exception -> 0x003c
            anet.channel.strategy.dispatch.HttpDispatcher$AmdcConditionType r6 = anet.channel.strategy.dispatch.HttpDispatcher.AmdcConditionType.DEFAULT_AMDC     // Catch: Exception -> 0x003c
            int r6 = r6.ordinal()     // Catch: Exception -> 0x003c
            if (r5 == r6) goto L_0x003e
            goto L_0x005c
        L_0x003c:
            r9 = move-exception
            goto L_0x00a6
        L_0x003e:
            boolean r5 = r4.effectNow     // Catch: Exception -> 0x003c
            if (r5 == 0) goto L_0x0045
            r8.handleEffectNowByDns(r4)     // Catch: Exception -> 0x003c
        L_0x0045:
            java.lang.String r5 = r4.unit     // Catch: Exception -> 0x003c
            if (r5 == 0) goto L_0x0050
            java.lang.String r6 = r4.safeAisles     // Catch: Exception -> 0x003c
            java.lang.String r7 = r4.host     // Catch: Exception -> 0x003c
            r8.handleUnitChange(r6, r7, r5)     // Catch: Exception -> 0x003c
        L_0x0050:
            boolean r5 = r4.hasIPv6     // Catch: Exception -> 0x003c
            if (r5 == 0) goto L_0x0082
            java.lang.String r5 = r4.safeAisles     // Catch: Exception -> 0x003c
            java.lang.String r6 = r4.host     // Catch: Exception -> 0x003c
            r8.handleIPv6Reconnect(r5, r6)     // Catch: Exception -> 0x003c
            goto L_0x0082
        L_0x005c:
            java.lang.String r5 = r9.accessPoint     // Catch: Exception -> 0x003c
            if (r5 != 0) goto L_0x0064
            java.lang.String r6 = r9.clientIp     // Catch: Exception -> 0x003c
            if (r6 == 0) goto L_0x0082
        L_0x0064:
            if (r5 == 0) goto L_0x006c
            boolean r5 = r5.isEmpty()     // Catch: Exception -> 0x003c
            if (r5 == 0) goto L_0x0079
        L_0x006c:
            java.lang.String r5 = r9.clientIp     // Catch: Exception -> 0x003c
            if (r5 == 0) goto L_0x0079
            boolean r5 = r5.isEmpty()     // Catch: Exception -> 0x003c
            if (r5 != 0) goto L_0x0079
            java.lang.String r5 = r9.clientIp     // Catch: Exception -> 0x003c
            goto L_0x007b
        L_0x0079:
            java.lang.String r5 = r9.accessPoint     // Catch: Exception -> 0x003c
        L_0x007b:
            java.lang.String r6 = r4.safeAisles     // Catch: Exception -> 0x003c
            java.lang.String r7 = r4.host     // Catch: Exception -> 0x003c
            r8.handleAccessPointChange(r6, r7, r5)     // Catch: Exception -> 0x003c
        L_0x0082:
            boolean r5 = r4.hasHttp3     // Catch: Exception -> 0x003c
            if (r5 == 0) goto L_0x008d
            java.lang.String r5 = r4.safeAisles     // Catch: Exception -> 0x003c
            java.lang.String r6 = r4.host     // Catch: Exception -> 0x003c
            r8.handleHttp3Reconnect(r5, r6)     // Catch: Exception -> 0x003c
        L_0x008d:
            java.lang.String r5 = r4.safeAisles     // Catch: Exception -> 0x003c
            java.lang.String r6 = r4.host     // Catch: Exception -> 0x003c
            r8.handleInvalidStrategyReconnect(r5, r6)     // Catch: Exception -> 0x003c
            java.lang.String r5 = r4.safeAisles     // Catch: Exception -> 0x003c
            java.lang.String r6 = r4.host     // Catch: Exception -> 0x003c
            java.lang.String r7 = "amdc"
            r8.handlePreSession(r5, r6, r7)     // Catch: Exception -> 0x003c
            java.lang.String r4 = r4.host     // Catch: Exception -> 0x003c
            anet.channel.AwcnConfig.updateAccessPointStatus(r4)     // Catch: Exception -> 0x003c
            int r3 = r3 + r0
            goto L_0x0020
        L_0x00a5:
            return
        L_0x00a6:
            java.lang.String r0 = r8.seqNum
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "awcn.SessionCenter"
            java.lang.String r3 = "checkStrategy failed"
            anet.channel.util.ALog.e(r2, r3, r0, r9, r1)
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.SessionCenter.checkAndUpdateStrategy(anet.channel.strategy.StrategyResultParser$HttpDnsResponse):void");
    }

    @Deprecated
    public Session get(HttpUrl httpUrl, ConnType.TypeLevel typeLevel, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("9872516b", new Object[]{this, httpUrl, typeLevel, new Long(j)});
        }
        return get(httpUrl, typeLevel == ConnType.TypeLevel.SPDY ? SessionType.LONG_LINK : SessionType.SHORT_LINK, j);
    }

    public Session getSessionBySessionPool(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("f2ab697", new Object[]{this, str, new Integer(i)}) : this.sessionPool.getSession(getSessionRequestByUrl(HttpUrl.parse(StringUtils.buildKey("https", str))), i, ProtocolType.ALL, null);
    }

    public Session getThrowsException(HttpUrl httpUrl, int i, long j, SessionParamStat sessionParamStat) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("f195542d", new Object[]{this, httpUrl, new Integer(i), new Long(j), sessionParamStat}) : getInternal(httpUrl, i, ProtocolType.ALL, j, null, sessionParamStat);
    }

    private void handleEffectNowByDns(StrategyResultParser.Dns dns) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b2bd1a", new Object[]{this, dns});
            return;
        }
        ALog.i(TAG, "find effectNow by dns", this.seqNum, "host", dns.host);
        StrategyResultParser.Server[] serverArr = dns.servers;
        if (!(serverArr == null || serverArr.length == 0)) {
            for (Session session : this.sessionPool.getSessions(getSessionRequest(StringUtils.buildKey(dns.safeAisles, dns.host)))) {
                if (!session.getConnType().isHttpType()) {
                    int i = 0;
                    while (true) {
                        StrategyResultParser.Server[] serverArr2 = dns.servers;
                        if (i >= serverArr2.length) {
                            session.close(true, "ip_ConnStrategy_not_match");
                            break;
                        }
                        StrategyResultParser.Channel[] channelArr = serverArr2[i].channels;
                        if (!(channelArr == null || channelArr.length == 0)) {
                            for (StrategyResultParser.Channel channel : channelArr) {
                                StrategyResultParser.ChannelAttribute[] channelAttributeArr = channel.attributes;
                                String[] strArr = channel.ips;
                                if (!(channelAttributeArr == null || channelAttributeArr.length == 0 || strArr == null || strArr.length == 0)) {
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= strArr.length) {
                                            z = false;
                                            break;
                                        } else if (session.getIp().equals(strArr[i2])) {
                                            z = true;
                                            break;
                                        } else {
                                            i2++;
                                        }
                                    }
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= channelAttributeArr.length) {
                                            z2 = false;
                                            break;
                                        }
                                        if (session.getPort() == channelAttributeArr[i3].port && session.getConnType().equals(ConnType.valueOf(ConnProtocol.valueOf(channelAttributeArr[i3])))) {
                                            z2 = true;
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (z && z2) {
                                        if (ALog.isPrintLog(2)) {
                                            ALog.i(TAG, "ip & ConnStrategy match", session.mSeq, pod.IP, session.getIp(), "port", Integer.valueOf(session.getPort()), "connType", session.getConnType());
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            continue;
                        }
                        i++;
                    }
                }
            }
        }
    }

    public static synchronized void switchEnvironment(ENV env) {
        synchronized (SessionCenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("410fe7bb", new Object[]{env});
                return;
            }
            if (GlobalAppRuntimeInfo.getEnv() != env) {
                ALog.e(TAG, "switch env", null, "old", GlobalAppRuntimeInfo.getEnv(), "new", env);
                GlobalAppRuntimeInfo.setEnv(env);
                StrategyCenter.getInstance().switchEnv();
                SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION).switchAccsServer(env == ENV.TEST ? 0 : 1);
            }
            Iterator<Map.Entry<Config, SessionCenter>> it = instancesMap.entrySet().iterator();
            while (it.hasNext()) {
                SessionCenter value = it.next().getValue();
                if (value.config.getEnv() != env) {
                    ALog.e(TAG, "remove instance", value.seqNum, RequestConstant.ENVIRONMENT, value.config.getEnv());
                    value.accsSessionManager.forceCloseSession("accs_switch_env", false);
                    value.innerListener.unRegisterAll();
                    it.remove();
                }
            }
        }
    }

    public Session get(HttpUrl httpUrl, int i, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("306ac9e2", new Object[]{this, httpUrl, new Integer(i), new Long(j)}) : get(httpUrl, i, ProtocolType.ALL, j);
    }

    public Session getThrowsException(HttpUrl httpUrl, int i, long j) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("b663f858", new Object[]{this, httpUrl, new Integer(i), new Long(j)}) : getInternal(httpUrl, i, ProtocolType.ALL, j, null);
    }

    public void handleSessionNetworkStatus(List<Session> list, boolean z, NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bd9580b", new Object[]{this, list, new Boolean(z), networkStatus});
        } else if (list != null && !list.isEmpty()) {
            for (Session session : list) {
                if (AwcnConfig.isLastStatusNoneOpt() && networkStatus != null && networkStatus.isLastNone.get()) {
                    StringBuilder sb = new StringBuilder("[handleSessionNetworkStatus] isLastNone=");
                    sb.append(networkStatus.isLastNone.get() ? 1 : 2);
                    ALog.e(TAG, sb.toString(), session.mSeq, new Object[0]);
                    session.ping(true, 2000);
                } else if (session.mConnType.isHTTP3() && ((z || session.mConnStrategy.isSupportMultiPath()) && session.isSupportSmoothReconnect())) {
                    ALog.e(TAG, "[handleSessionNetworkStatus]smooth reconnect", session.mSeq, new Object[0]);
                    session.isDeprecated = true;
                    session.isNetworkStatusChangeDeprecated = true;
                    session.ping(true, 2000);
                } else if (session.isSupportSmoothReconnect()) {
                    session.isDeprecated = true;
                    session.isNetworkStatusChangeDeprecated = true;
                    session.autoReCreate = true;
                    session.ping(true, 1000);
                    ALog.e(TAG, "[network status opt] [handleSessionNetworkStatus] smooth reconnect", session.mSeq, new Object[0]);
                } else {
                    session.close(true, "network_change");
                }
            }
        }
    }

    public boolean isExistH3Session(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cda825f3", new Object[]{this, str})).booleanValue();
        }
        for (Session session : this.sessionPool.getSessions(getSessionRequest(StringUtils.buildKey("https", str)))) {
            if (session.mConnType.isHTTP3()) {
                ALog.e(TAG, "[registerHTTP3ConnProtocol] isExistH3Session", session.mSeq, "host", str, pod.IP, session.mConnStrategy.getIp(), "protocol", session.mConnStrategy.getProtocol().toString());
                return true;
            }
        }
        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(false, str);
        if (connStrategyListByHost != null && !connStrategyListByHost.isEmpty()) {
            ListIterator<IConnStrategy> listIterator = connStrategyListByHost.listIterator();
            while (listIterator.hasNext()) {
                IConnStrategy next = listIterator.next();
                ConnType valueOf = ConnType.valueOf(next.getProtocol());
                if (valueOf != null && valueOf.isHTTP3()) {
                    ALog.e(TAG, "[registerHTTP3ConnProtocol] isExistH3Strategy", this.seqNum, "host", str, "connType", valueOf.toString(), pod.IP, next.getIp());
                    return true;
                }
            }
        }
        return false;
    }

    public static synchronized SessionCenter getInstance(Config config) {
        Context appContext;
        synchronized (SessionCenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SessionCenter) ipChange.ipc$dispatch("57ed800b", new Object[]{config});
            }
            if (config != null) {
                if (!mInit && (appContext = Utils.getAppContext()) != null) {
                    init(appContext);
                }
                SessionCenter sessionCenter = instancesMap.get(config);
                if (sessionCenter == null) {
                    sessionCenter = new SessionCenter(config);
                    instancesMap.put(config, sessionCenter);
                }
                return sessionCenter;
            }
            throw new NullPointerException("config is null!");
        }
    }

    private void handleHttp3Reconnect(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec44954f", new Object[]{this, str, str2});
        } else if (AwcnConfig.isHttp3ReconnectEnable()) {
            String buildKey = StringUtils.buildKey(str, str2);
            for (Session session : this.sessionPool.getSessions(getSessionRequest(buildKey))) {
                if (!session.mConnType.isHTTP3() && !session.isDeprecated) {
                    ALog.e(TAG, "[handleSession] reconnect to http3 ", session.mSeq, "session host", session.mHost, pod.IP, session.mIp);
                    handleSession(str2, buildKey, session, SessionParamStat.UseConnectType.H3, null, "http3_reconnect");
                }
            }
        }
    }

    private void handleIPv6Reconnect(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b17f223", new Object[]{this, str, str2});
            return;
        }
        String buildKey = StringUtils.buildKey(str, str2);
        for (Session session : this.sessionPool.getSessions(getSessionRequest(buildKey))) {
            if (!anet.channel.strategy.utils.Utils.isIPV6Address(session.mIp) && !session.isComplex) {
                ALog.e(TAG, "[handleSession] reconnect to ipv6", session.mSeq, "session host", session.mHost, pod.IP, session.mIp);
                handleSession(str2, buildKey, session, SessionParamStat.UseConnectType.IPV6, null, "ipv6");
            }
        }
    }

    private void handleInvalidStrategyReconnect(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8ea750", new Object[]{this, str, str2});
        } else if (AwcnConfig.isAmdcStrategyUpdateEnable()) {
            String buildKey = StringUtils.buildKey(str, str2);
            for (Session session : this.sessionPool.getSessions(getSessionRequest(buildKey))) {
                if (session.isStrategyInvalid && !session.isDeprecated) {
                    ALog.e(TAG, "[handleSession] reconnect to invalid strategy", session.mSeq, "session host", session.mHost, pod.IP, session.mIp);
                    handleSession(str2, buildKey, session, SessionParamStat.UseConnectType.INVALID_STRATEGY, null, "invalid_strategy");
                }
            }
        }
    }

    public Session get(HttpUrl httpUrl, int i, int i2, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("a5d1ef35", new Object[]{this, httpUrl, new Integer(i), new Integer(i2), new Long(j)}) : get(httpUrl, i, i2, j, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.String, anet.channel.strategy.IConnStrategy] */
    /* JADX WARN: Type inference failed for: r10v7 */
    public void getThrowsException(Uri uri, int i, long j, String str) throws Exception {
        String str2;
        HttpUrl httpUrl;
        String str3;
        Exception e;
        int i2 = 2;
        char c = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85059a7f", new Object[]{this, uri, new Integer(i), new Long(j), str});
            return;
        }
        List<String> matchHostListByOption = AwcnConfig.getMatchHostListByOption(uri, str);
        if (matchHostListByOption != null && !matchHostListByOption.isEmpty()) {
            Iterator<String> it = matchHostListByOption.iterator();
            while (it.hasNext()) {
                String str4 = h1p.HTTPS_PREFIX + it.next();
                HttpUrl parse = HttpUrl.parse(str4);
                if (parse != null) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = "list";
                    objArr[c] = matchHostListByOption;
                    ALog.e(TAG, "[dnsOpt] long link realUrl=" + str4, null, objArr);
                    try {
                        int i3 = ProtocolType.ALL;
                        str3 = TAG;
                        str2 = 0;
                        httpUrl = parse;
                        try {
                            getInternal(parse, i, i3, j, null);
                        } catch (NoAvailStrategyException unused) {
                            Session session = get(httpUrl, SessionType.SHORT_LINK, 0L);
                            if (session == null) {
                                session = new HttpSession(GlobalAppRuntimeInfo.getContext(), new ConnInfo(StringUtils.concatString(httpUrl.scheme(), HttpConstant.SCHEME_SPLIT, httpUrl.host()), str2, str2));
                            }
                            if ((session instanceof HttpSession) && OkHttpConnector.isOkHttpEnable(httpUrl)) {
                                ((HttpSession) session).setUseOkhttp(true);
                                i2 = 2;
                                c = 1;
                            }
                            i2 = 2;
                            c = 1;
                        } catch (Exception e2) {
                            e = e2;
                            ALog.e(str3, "[dnsOpt] getThrowsException error =" + e.toString(), str2, new Object[0]);
                            i2 = 2;
                            c = 1;
                        }
                    } catch (NoAvailStrategyException unused2) {
                        str2 = 0;
                        httpUrl = parse;
                    } catch (Exception e3) {
                        e = e3;
                        str3 = TAG;
                        str2 = 0;
                    }
                    i2 = 2;
                    c = 1;
                } else {
                    return;
                }
            }
        }
    }

    public Session get(HttpUrl httpUrl, int i, int i2, long j, SessionParamStat sessionParamStat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("438fc1b0", new Object[]{this, httpUrl, new Integer(i), new Integer(i2), new Long(j), sessionParamStat});
        }
        try {
            return getInternal(httpUrl, i, i2, j, null, sessionParamStat);
        } catch (NoAvailStrategyException e) {
            httpUrl.isNoStrategy = true;
            ALog.e(TAG, "[Get] no strategy! " + e.getMessage(), this.seqNum, "url", httpUrl.urlString());
            return null;
        } catch (NoSocketPermissionInBgException unused) {
            throw new NoSocketPermissionInBgException("no socket permissions in background");
        } catch (ConnectException e2) {
            ALog.e(TAG, "[Get]connect exception", this.seqNum, "errMsg", e2.getMessage(), "url", httpUrl.urlString());
            return null;
        } catch (InvalidParameterException e3) {
            ALog.e(TAG, "[Get]param url is invalid", this.seqNum, e3, "url", httpUrl);
            return null;
        } catch (TimeoutException e4) {
            ALog.e(TAG, "[Get]timeout exception", this.seqNum, e4, "url", httpUrl.urlString());
            return null;
        } catch (Exception e5) {
            ALog.e(TAG, "[Get]" + e5.getMessage(), this.seqNum, "url", httpUrl.urlString());
            return null;
        }
    }

    public void handlePreSession(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4bbe20", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            if (AwcnConfig.isPreSessionOptEnable() && AwcnConfig.isPreSessionWhiteList(str2) && AwcnConfig.isAllowUsePreSession(str2)) {
                AwcnConfig.updateUsePreSession(str2);
                String buildKey = StringUtils.buildKey(str, str2);
                Session session = this.sessionPool.getSession(getSessionRequest(buildKey), SessionType.LONG_LINK);
                if (session == null) {
                    getThrowsException(HttpUrl.parse(buildKey), SessionType.LONG_LINK, 0L);
                    ALog.e(TAG, "[handlePreSession] pre session = ", null, "host", str2, "msg", str3);
                } else {
                    ALog.e(TAG, "[handlePreSession] exist pre session = " + session, session.mSeq, "host", str2, "msg", str3);
                }
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[handlePreSession] error = " + th.toString(), null, "host", str2);
        }
    }

    public void getInternalAsync(HttpUrl httpUrl, int i, long j, SessionGetCallback sessionGetCallback, SessionParamStat sessionParamStat) throws Exception {
        String str;
        String str2;
        SessionInfo sessionInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5ff713", new Object[]{this, httpUrl, new Integer(i), new Long(j), sessionGetCallback, sessionParamStat});
            return;
        }
        if (sessionParamStat == null) {
            str = "";
        } else {
            str = sessionParamStat.req;
        }
        boolean z = sessionParamStat != null && sessionParamStat.isRetry;
        if (!mInit) {
            ALog.e(TAG, "getInternal not inited!", this.seqNum, new Object[0]);
            throw new IllegalStateException("getInternal not inited");
        } else if (httpUrl == null) {
            throw new InvalidParameterException("httpUrl is null");
        } else if (sessionGetCallback != null) {
            String str3 = this.seqNum;
            String urlString = httpUrl.urlString();
            if (i == SessionType.LONG_LINK) {
                str2 = "LongLink";
            } else {
                str2 = "ShortLink";
            }
            ALog.d(TAG, "getInternal", str3, "u", urlString, "sessionType", str2, "timeout", Long.valueOf(j), "reqSeq", str, v4s.PARAM_IS_RETRY, Boolean.valueOf(z));
            SessionRequest sessionRequestByUrl = getSessionRequestByUrl(httpUrl);
            Session session = (sessionParamStat == null || sessionParamStat.sessionFlag != SessionParamStat.UseConnectType.DEFAULT.ordinal()) ? null : this.sessionPool.getSession(sessionRequestByUrl, i, ProtocolType.ALL, sessionParamStat);
            if (session != null) {
                ALog.e(TAG, "get internal hit cache session", this.seqNum, MspGlobalDefine.SESSION, session, "reqSeq", str);
                sessionGetCallback.onSessionGetSuccess(session);
            } else if (this.config == Config.DEFAULT_CONFIG && i != SessionType.SHORT_LINK) {
                sessionGetCallback.onSessionGetFail();
            } else if (!GlobalAppRuntimeInfo.isAppBackground() || i != SessionType.LONG_LINK || !AwcnConfig.isAccsSessionCreateForbiddenInBg() || (sessionInfo = this.attributeManager.getSessionInfo(httpUrl.host())) == null || !sessionInfo.isAccs) {
                sessionRequestByUrl.startAsync(this.context, i, SessionSeq.createSequenceNo(this.seqNum), sessionGetCallback, j, false, sessionParamStat);
            } else {
                ALog.w(TAG, "app background, forbid to create accs session", this.seqNum, "reqSeq", str);
                throw new ConnectException("accs session connecting forbidden in background");
            }
        } else {
            throw new InvalidParameterException("sessionGetCallback is null");
        }
    }

    public void handleSession(String str, String str2, final Session session, SessionParamStat.UseConnectType useConnectType, String str3, final String str4) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aba31ad", new Object[]{this, str, str2, session, useConnectType, str3, str4});
            return;
        }
        final SwitchFlowStat switchFlowStat = new SwitchFlowStat(str, str4);
        if (!AwcnConfig.isSmoothReconnectEnable() || !session.isSupportSmoothReconnect()) {
            session.close(true, str4 + "connect_change");
        } else {
            ALog.e(TAG, "[handleSession] smooth reconnect start " + str4, session.mSeq, "host", str);
            if (AwcnConfig.isSmoothReconnectOptOpened()) {
                asyncGet(HttpUrl.parse(str2), SessionType.LONG_LINK, 3000L, new SessionGetCallback() { // from class: anet.channel.SessionCenter.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // anet.channel.SessionGetCallback
                    public void onSessionGetFail() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("735355e4", new Object[]{this});
                            return;
                        }
                        Session session2 = session;
                        ALog.e(SessionCenter.TAG, "[handleSession] not smooth reconnect, scene=" + str4 + " ,onSessionGetFail", session2.mSeq, "Session", session2);
                    }

                    @Override // anet.channel.SessionGetCallback
                    public void onSessionGetSuccess(Session session2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6d473443", new Object[]{this, session2});
                            return;
                        }
                        String str5 = session.mSeq;
                        ALog.e(SessionCenter.TAG, "[handleSession] need smooth reconnect, scene=" + str4 + " ,onSessionGetSuccess! ", str5, "newSession", session2.mSeq, "oldSession", str5);
                        switchFlowStat.smoothReconnect = 1;
                        session.isDeprecated = true;
                    }
                }, new SessionParamStat(useConnectType.ordinal()));
            } else {
                switchFlowStat.smoothReconnect = 1;
                session.isDeprecated = true;
                HttpUrl parse = HttpUrl.parse(str2);
                if (session.getConnType().isHttpType()) {
                    i = SessionType.SHORT_LINK;
                } else {
                    i = SessionType.LONG_LINK;
                }
                get(parse, i, 0L);
            }
        }
        AppMonitor.getInstance().commitStat(switchFlowStat);
    }

    private void handleAccessPointChange(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abdb7639", new Object[]{this, str, str2, str3});
        } else if (AwcnConfig.isVpnOptOpened() && AwcnConfig.isHostInVpnProxySessionWhiteList(str2)) {
            String buildKey = StringUtils.buildKey(str, str2);
            for (Session session : this.sessionPool.getSessions(getSessionRequest(buildKey))) {
                if (!StringUtils.isStringEqual(session.accessPoint, str3)) {
                    ALog.e(TAG, "[handleSession] reconnect to ap", session.mSeq, "session accessPoint", session.accessPoint, z9u.KEY_ACCESS_POINT, str3, "session host", session.mHost, pod.IP, session.mIp);
                    handleSession(str2, buildKey, session, SessionParamStat.UseConnectType.ACCESS_POINT, str3, z9u.KEY_ACCESS_POINT);
                }
            }
        }
    }

    private void handleUnitChange(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd30dec1", new Object[]{this, str, str2, str3});
            return;
        }
        String buildKey = StringUtils.buildKey(str, str2);
        for (Session session : this.sessionPool.getSessions(getSessionRequest(buildKey))) {
            if (!StringUtils.isStringEqual(session.unit, str3)) {
                ALog.e(TAG, "[handleSession] reconnect to unit", session.mSeq, "session unit", session.unit, mh1.PRICE_UNIT, str3);
                handleSession(str2, buildKey, session, SessionParamStat.UseConnectType.UNIT, str3, mh1.PRICE_UNIT);
            }
        }
    }

    public void asyncGet(HttpUrl httpUrl, int i, long j, SessionGetCallback sessionGetCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5c5bd5", new Object[]{this, httpUrl, new Integer(i), new Long(j), sessionGetCallback});
        } else {
            asyncGet(httpUrl, i, j, sessionGetCallback, (SessionParamStat) null);
        }
    }

    @Deprecated
    public static synchronized void init(Context context, String str) {
        synchronized (SessionCenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("624f99b", new Object[]{context, str});
            } else {
                init(context, str, GlobalAppRuntimeInfo.getEnv());
            }
        }
    }

    public void asyncGet(HttpUrl httpUrl, int i, long j, boolean z, SessionGetCallback sessionGetCallback) throws Exception {
        SessionRequest sessionRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58cb9cd1", new Object[]{this, httpUrl, new Integer(i), new Long(j), new Boolean(z), sessionGetCallback});
        } else if (mInit) {
            ALog.e(TAG, "[fragmentation] getInternal", this.seqNum, "u", httpUrl.urlString(), "sessionType", i == SessionType.LONG_LINK ? "LongLink" : "ShortLink", "timeout", Long.valueOf(j));
            if (z) {
                sessionRequest = getConcurrencyRequestByUrl(httpUrl);
            } else {
                sessionRequest = getSessionRequestByUrl(httpUrl);
            }
            sessionRequest.setForceCellular(z);
            Session session = this.sessionPool.getSession(sessionRequest, i);
            if (session != null) {
                ALog.e(TAG, "fragmentation get internal hit cache session", this.seqNum, MspGlobalDefine.SESSION, session);
                sessionGetCallback.onSessionGetSuccess(session);
                return;
            }
            ALog.e(TAG, "[fragmentation] create session, isMultipath=[" + z + "]", this.seqNum, new Object[0]);
            sessionRequest.startAsync(this.context, i, SessionSeq.createSequenceNo(this.seqNum), sessionGetCallback, j, z, null);
        } else {
            ALog.e(TAG, "[fragmentation] getInternal not inited!", this.seqNum, new Object[0]);
            throw new IllegalStateException("getInternal not inited");
        }
    }

    @Deprecated
    public static synchronized SessionCenter getInstance() {
        Context appContext;
        synchronized (SessionCenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SessionCenter) ipChange.ipc$dispatch("35a03d87", new Object[0]);
            }
            if (!mInit && (appContext = Utils.getAppContext()) != null) {
                init(appContext);
            }
            SessionCenter sessionCenter = null;
            for (Map.Entry<Config, SessionCenter> entry : instancesMap.entrySet()) {
                SessionCenter value = entry.getValue();
                if (entry.getKey() != Config.DEFAULT_CONFIG) {
                    return value;
                }
                sessionCenter = value;
            }
            return sessionCenter;
        }
    }

    public static synchronized void init(Context context, String str, ENV env) {
        synchronized (SessionCenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f406f06", new Object[]{context, str, env});
            } else if (context != null) {
                Config config = Config.getConfig(str, env);
                if (config == null) {
                    config = new Config.Builder().setAppkey(str).setEnv(env).build();
                }
                init(context, config);
            } else {
                ALog.e(TAG, "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            }
        }
    }

    @Deprecated
    public Session getThrowsException(HttpUrl httpUrl, ConnType.TypeLevel typeLevel, long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("456e6a35", new Object[]{this, httpUrl, typeLevel, new Long(j)});
        }
        return getInternal(httpUrl, typeLevel == ConnType.TypeLevel.SPDY ? SessionType.LONG_LINK : SessionType.SHORT_LINK, ProtocolType.ALL, j, null);
    }

    public Session getThrowsException(HttpUrl httpUrl, int i, int i2, long j) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("defe8f7f", new Object[]{this, httpUrl, new Integer(i), new Integer(i2), new Long(j)}) : getInternal(httpUrl, i, i2, j, null);
    }

    public static synchronized void init(Context context, Config config) {
        synchronized (SessionCenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("910b656f", new Object[]{context, config});
            } else if (context == null) {
                ALog.e(TAG, "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            } else if (config != null) {
                init(context);
                if (!instancesMap.containsKey(config)) {
                    instancesMap.put(config, new SessionCenter(config));
                }
            } else {
                ALog.e(TAG, "paramter config is null!", null, new Object[0]);
                throw new NullPointerException("init failed. config is null");
            }
        }
    }
}
