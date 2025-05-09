package com.ut.mini;

import android.app.Application;
import android.os.RemoteException;
import com.alibaba.analytics.AnalyticsMgr;
import com.alibaba.analytics.IAnalytics;
import com.alibaba.analytics.core.config.UTClientConfigMgr;
import com.alibaba.analytics.core.model.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.b1v;
import tb.c2v;
import tb.ccu;
import tb.e2v;
import tb.e3v;
import tb.flv;
import tb.g2v;
import tb.gw;
import tb.haj;
import tb.hsq;
import tb.i2v;
import tb.iaq;
import tb.j1o;
import tb.m2v;
import tb.nhh;
import tb.o4e;
import tb.oeh;
import tb.p1v;
import tb.p3v;
import tb.qzu;
import tb.r0v;
import tb.r1v;
import tb.r2v;
import tb.rbo;
import tb.rhv;
import tb.rrg;
import tb.rzu;
import tb.s2v;
import tb.t1v;
import tb.t2o;
import tb.t2v;
import tb.tkn;
import tb.to1;
import tb.u51;
import tb.v2v;
import tb.vep;
import tb.vww;
import tb.vyp;
import tb.w4s;
import tb.wu3;
import tb.wzu;
import tb.x1v;
import tb.x4e;
import tb.yzu;
import tb.zhx;
import tb.zzu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UTAnalytics {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UTAnalytics";
    private UTTracker mDefaultTracker;
    private s2v mUTSceneTracker;
    private static UTAnalytics mInstance = new UTAnalytics();
    private static volatile boolean mInit = false;
    private static volatile boolean mInit4app = false;
    private static boolean mIsMainProcess = true;
    public static long testTime = 0;
    private Map<String, UTTracker> mTrackerMap = new HashMap();
    private HashMap<String, UTTracker> mAppKeyTrackMap = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Application val$application;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Application application) {
            super(str);
            this.val$application = application;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/UTAnalytics$1");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            e3v.sendBootTime(this.val$application);
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException unused) {
            }
            try {
                nhh.f(UTAnalytics.TAG, "initSecurity");
                rhv.b().d(this.val$application.getBaseContext());
            } catch (Throwable th) {
                nhh.h(null, th, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AnalyticsMgr.b.dispatchLocalHits();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AnalyticsMgr.b.saveCacheDataToLocal();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map val$logMap;

        public d(Map map) {
            this.val$logMap = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                flv.h().f(new Log("8", null, (String) this.val$logMap.get(oeh.EVENTID), this.val$logMap));
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String val$channel;

        public e(String str) {
            this.val$channel = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                iaq.b(wu3.c().b(), "channel", this.val$channel);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class f implements Runnable, rbo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Map<String, String> logMap;

        static {
            t2o.a(962593147);
            t2o.a(962593059);
        }

        @Override // tb.rbo
        public void clean() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            } else {
                this.logMap = null;
            }
        }

        @Override // tb.rbo
        public void fill(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7129a67", new Object[]{this, objArr});
                return;
            }
            Object obj = objArr[0];
            if (obj != null) {
                this.logMap = (Map) obj;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AnalyticsMgr.b.transferLog(this.logMap);
            } catch (Throwable unused) {
            }
            to1.a().c(this);
        }
    }

    static {
        t2o.a(962593141);
    }

    private UTAnalytics() {
    }

    private boolean checkInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fdaa2c3", new Object[]{this})).booleanValue();
        }
        return AnalyticsMgr.g;
    }

    private static Runnable createSimpleTransferLogTask(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("76431d86", new Object[]{map});
        }
        return new d(map);
    }

    private Runnable createTransferLogTask(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("976af18", new Object[]{this, map});
        }
        return (Runnable) to1.a().d(f.class, map);
    }

    public static UTAnalytics getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTAnalytics) ipChange.ipc$dispatch("d44f1992", new Object[0]);
        }
        return mInstance;
    }

    private void initialize(Application application, o4e o4eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2f5befb", new Object[]{this, application, o4eVar, new Boolean(z)});
            return;
        }
        setAppVersion(o4eVar.getUTAppVersion());
        setChannel(o4eVar.getUTChannel());
        if (o4eVar.isAliyunOsSystem()) {
            getInstance().setToAliyunOsPlatform();
        }
        if (o4eVar.isUTCrashHandlerDisable()) {
            r1v.getInstance().turnOff();
        } else {
            r1v.getInstance().turnOn(application.getApplicationContext());
            if (o4eVar.getUTCrashCraughtListener() != null) {
                r1v.getInstance().setCrashCaughtListener(o4eVar.getUTCrashCraughtListener());
            }
        }
        if (o4eVar.isUTLogEnable()) {
            turnOnDebug();
        }
        if (!mInit || z) {
            setRequestAuthentication(o4eVar.getUTRequestAuthInstance());
        }
        if (!mInit) {
            if (mIsMainProcess) {
                gw multiProcessAdapter = haj.getMultiProcessAdapter();
                if (multiProcessAdapter != null) {
                    try {
                        multiProcessAdapter.registerActivityLifecycleCallbacks();
                    } catch (Exception e2) {
                        wzu.registeActivityLifecycleCallbacks(application);
                        e2.printStackTrace();
                    }
                } else {
                    wzu.registeActivityLifecycleCallbacks(application);
                }
                wzu.registerAppStatusCallbacks(qzu.getInstance());
                wzu.registerAppStatusCallbacks(p1v.getInstance());
                wzu.registerAppStatusCallbacks(tkn.getInstance());
                wzu.registerAppStatusCallbacks(rzu.getInstance());
            }
            if (mIsMainProcess) {
                ccu.getInstance().init(application);
                com.alibaba.analytics.core.config.a.i();
                t1v.init();
                j1o.getInstance().init();
                r2v.init();
                zzu.init();
                if (b1v.bUTDataCollector) {
                    try {
                        r0v.init(application, vww.getInstance());
                    } catch (Throwable unused) {
                    }
                }
                e2v.init();
                AnalyticsMgr.X();
            }
        }
    }

    private void setAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{this, str});
        } else {
            AnalyticsMgr.Y(str);
        }
    }

    private void setChannel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d4aa12", new Object[]{this, str});
            return;
        }
        AnalyticsMgr.Z(str);
        try {
            ((m2v) AnalyticsMgr.c).a(new e(str));
        } catch (Throwable unused) {
        }
    }

    public static void setDelaySecond(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f4ce67", new Object[]{new Integer(i)});
        } else {
            AnalyticsMgr.a0(i);
        }
    }

    private void turnOffCrashHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceee947c", new Object[]{this});
        } else {
            r1v.getInstance().turnOff();
        }
    }

    private void turnOnDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc27dd7e", new Object[]{this});
        } else {
            AnalyticsMgr.f0();
        }
    }

    public void dispatchLocalHits() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2516edf8", new Object[]{this});
        } else if (checkInit()) {
            ((m2v) AnalyticsMgr.c).a(new b());
        }
    }

    public synchronized UTTracker getDefaultTracker() {
        Class<? extends UTTracker> cls;
        try {
            hsq.f(wu3.c().a());
            if (this.mDefaultTracker == null) {
                gw multiProcessAdapter = haj.getMultiProcessAdapter();
                UTTracker uTTracker = null;
                if (multiProcessAdapter == null) {
                    cls = null;
                } else if (multiProcessAdapter.isUiSubProcess()) {
                    cls = multiProcessAdapter.getSubProcessUTTrackerClass();
                } else {
                    cls = UTTracker.class;
                }
                if (cls == null) {
                    cls = UTTracker.class;
                }
                try {
                    uTTracker = (UTTracker) cls.newInstance();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (uTTracker == null) {
                    this.mDefaultTracker = new UTTracker();
                } else {
                    this.mDefaultTracker = uTTracker;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mDefaultTracker;
    }

    @Deprecated
    public String getOperationHistory(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e5198dd", new Object[]{this, new Integer(i), str});
        }
        return x1v.getInstance().getOperationHistory(i, str);
    }

    public synchronized UTTracker getTracker(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTTracker) ipChange.ipc$dispatch("80f6f7a1", new Object[]{this, str});
        } else if (hsq.f(str)) {
            throw new IllegalArgumentException("TrackId is null");
        } else if (this.mTrackerMap.containsKey(str)) {
            return this.mTrackerMap.get(str);
        } else {
            UTTracker uTTracker = new UTTracker();
            uTTracker.setTrackId(str);
            this.mTrackerMap.put(str, uTTracker);
            return uTTracker;
        }
    }

    public synchronized UTTracker getTrackerByAppkey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTTracker) ipChange.ipc$dispatch("50a2de16", new Object[]{this, str});
        } else if (hsq.f(str)) {
            throw new IllegalArgumentException("appKey is null");
        } else if (this.mAppKeyTrackMap.containsKey(str)) {
            return this.mAppKeyTrackMap.get(str);
        } else {
            UTTracker uTTracker = new UTTracker();
            uTTracker.setAppKey(str);
            this.mAppKeyTrackMap.put(str, uTTracker);
            return uTTracker;
        }
    }

    public synchronized s2v getUTSceneTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s2v) ipChange.ipc$dispatch("19678419", new Object[]{this});
        }
        if (this.mUTSceneTracker == null) {
            gw multiProcessAdapter = haj.getMultiProcessAdapter();
            if (multiProcessAdapter != null && multiProcessAdapter.isUiSubProcess()) {
                this.mUTSceneTracker = multiProcessAdapter.getSubProcessUTSceneTracker();
            }
            if (this.mUTSceneTracker == null) {
                this.mUTSceneTracker = new s2v();
            }
        }
        return this.mUTSceneTracker;
    }

    public synchronized t2v getUTScrollTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t2v) ipChange.ipc$dispatch("3e194663", new Object[]{this});
        }
        return t2v.getInstance();
    }

    public boolean isInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[]{this})).booleanValue();
        }
        return mInit;
    }

    public void registerPlugin(g2v g2vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("736cca4b", new Object[]{this, g2vVar});
        } else {
            i2v.getInstance().registerPlugin(g2vVar);
        }
    }

    public void registerWindvane() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("154bcf74", new Object[]{this});
        } else {
            zhx.registerWindvane(mInit);
        }
    }

    @Deprecated
    public void saveCacheDataToLocal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb3568", new Object[]{this});
        } else if (checkInit()) {
            ((m2v) AnalyticsMgr.c).a(new c());
        }
    }

    @Deprecated
    public String selfCheck(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e26f193", new Object[]{this, str});
        }
        if (!checkInit()) {
            return "local not init";
        }
        IAnalytics iAnalytics = AnalyticsMgr.b;
        if (iAnalytics == null) {
            return "not bind remote service，waitting 10 second";
        }
        try {
            return iAnalytics.selfCheck(str);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void sessionTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d804f2", new Object[]{this});
            return;
        }
        vyp.i().J(System.currentTimeMillis());
        vep.a().g();
        p3v.getInstance().sessionTimeout();
        com.alibaba.analytics.core.config.a.i().k();
        AnalyticsMgr.d0(new HashMap());
        AnalyticsMgr.X();
    }

    public synchronized void setAppApplicationInstance4sdk(Application application, o4e o4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a0185d", new Object[]{this, application, o4eVar});
        } else if (!mInit) {
            if (application == null || o4eVar == null || application.getBaseContext() == null) {
                throw new IllegalArgumentException("application and callback must not be null");
            }
            wu3.c().k(application.getBaseContext());
            rzu.checkFirstLaunch(application);
            UTClientConfigMgr.c().d();
            w4s.registerTLog();
            AnalyticsMgr.P(application);
            initialize(application, o4eVar, false);
            registerWindvane();
            mInit = true;
        }
    }

    public void setToAliyunOsPlatform() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa53712f", new Object[]{this});
        } else {
            wu3.c().n();
        }
    }

    public void transferLog(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8801825", new Object[]{this, map});
        } else if (checkInit()) {
            ((m2v) AnalyticsMgr.c).a(createTransferLogTask(map));
        }
    }

    public void transferSimpleLog(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da030037", new Object[]{this, map});
        } else if (checkInit()) {
            if (wu3.c().h()) {
                transferLog(map);
            } else {
                AnalyticsMgr.M().a(createSimpleTransferLogTask(map));
            }
        }
    }

    public void turnOffAutoPageTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21c1f82", new Object[]{this});
        } else {
            c2v.getInstance().turnOffAutoPageTrack();
        }
    }

    public void turnOffRealTimeDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f108167d", new Object[]{this});
        } else {
            AnalyticsMgr.e0();
        }
    }

    public void turnOnRealTimeDebug(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee88af2", new Object[]{this, map});
        } else {
            AnalyticsMgr.g0(map);
        }
    }

    public void unregisterPlugin(g2v g2vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37d4c24", new Object[]{this, g2vVar});
        } else {
            i2v.getInstance().unregisterPlugin(g2vVar);
        }
    }

    public void updateSessionProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17bd97e", new Object[]{this, map});
        } else {
            AnalyticsMgr.h0(map);
        }
    }

    @Deprecated
    public void updateUserAccount(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("782de874", new Object[]{this, str, str2});
        } else {
            updateUserAccount(str, str2, null);
        }
    }

    public void userRegister(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74607f9f", new Object[]{this, str});
        } else if (!hsq.f(str)) {
            getDefaultTracker().send(new UTOriginalCustomHitBuilder("UT", 1006, str, null, null, null).build());
        } else {
            throw new IllegalArgumentException("Usernick can not be null or empty!");
        }
    }

    @Deprecated
    public static void setDisableWindvane(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f61fa13d", new Object[]{new Boolean(z)});
        } else {
            b1v.bWindvaneExtend = !z;
        }
    }

    public void registerPlugin(g2v g2vVar, boolean z, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b265cb", new Object[]{this, g2vVar, new Boolean(z), list, list2});
        } else {
            i2v.getInstance().registerPlugin(g2vVar, z, list, list2);
        }
    }

    public void updateUserAccount(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37d5d3e", new Object[]{this, str, str2, str3});
            return;
        }
        AnalyticsMgr.i0(str, str2, str3);
        if (!hsq.f(str)) {
            UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder("UT", 1007, str, str2, null, null);
            uTOriginalCustomHitBuilder.setProperty("_priority", "5");
            getInstance().getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
        }
    }

    private void setRequestAuthentication(x4e x4eVar) {
        String str;
        String str2;
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69d6ba4", new Object[]{this, x4eVar});
        } else if (x4eVar != null) {
            if (x4eVar instanceof v2v) {
                v2v v2vVar = (v2v) x4eVar;
                str2 = v2vVar.getAppkey();
                str = v2vVar.getAuthcode();
            } else if (x4eVar instanceof yzu) {
                yzu yzuVar = (yzu) x4eVar;
                str2 = yzuVar.getAppkey();
                String appSecret = yzuVar.getAppSecret();
                z2 = yzuVar.isEncode();
                str = appSecret;
                z = false;
            } else {
                throw new IllegalArgumentException("此签名方式暂不支持!请使用 UTSecuritySDKRequestAuthentication 或 UTBaseRequestAuthentication 设置签名!");
            }
            wu3.c().j(str2);
            AnalyticsMgr.c0(z, z2, str2, str);
        } else {
            throw new NullPointerException("签名不能为空!");
        }
    }

    public synchronized void setAppApplicationInstance(Application application, o4e o4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db46da23", new Object[]{this, application, o4eVar});
        } else if (!mInit4app) {
            testTime = System.currentTimeMillis();
            nhh.m(TAG, "setAppApplicationInstance start");
            if (application == null || o4eVar == null || application.getBaseContext() == null) {
                throw new IllegalArgumentException("application and callback must not be null");
            }
            vyp.i().t(application.getBaseContext(), o4eVar.getUTRequestAuthInstance().getAppkey(), o4eVar.getUTAppVersion(), o4eVar.getUTChannel());
            wu3.c().k(application.getBaseContext());
            rzu.checkFirstLaunch(application);
            UTClientConfigMgr.c().d();
            w4s.registerTLog();
            AnalyticsMgr.P(application);
            mIsMainProcess = u51.l(application.getApplicationContext());
            nhh.m(TAG, rrg.APP_LAUNCH);
            initialize(application, o4eVar, true);
            registerWindvane();
            mInit = true;
            mInit4app = true;
            nhh.m(TAG, "setAppApplicationInstance mInit", Boolean.valueOf(mInit));
            if (nhh.n()) {
                nhh.m(TAG, "setAppApplicationInstance cost", Long.valueOf(System.currentTimeMillis() - testTime));
            }
            if (mIsMainProcess) {
                new a("InitSecurity", application).start();
            }
        }
    }

    public void updateUserAccount(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c8f388", new Object[]{this, str, str2, str3, str4});
            return;
        }
        AnalyticsMgr.j0(str, str2, str3, str4);
        if (!hsq.f(str)) {
            UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder("UT", 1007, str, str2, null, null);
            uTOriginalCustomHitBuilder.setProperty("_priority", "5");
            getInstance().getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
        }
    }
}
