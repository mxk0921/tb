package com.taobao.tao.remotebusiness.js;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IInteractingListener;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteCacheListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.instanceconfigs.MtopExternalInstanceConfigsData;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.IWVRequestInterceptor;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopAccountSiteUtils;
import mtopsdk.mtop.intf.MtopSetting;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import org.json.JSONObject;
import tb.nyn;
import tb.ov2;
import tb.rid;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopJSBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "mtopsdk.MtopJSBridge";

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<d>> f12730a = new ConcurrentHashMap<>();
    public static volatile ScheduledExecutorService b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MtopJSListener f12735a;

        public a(MtopJSListener mtopJSListener) {
            this.f12735a = mtopJSListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f12735a.onTimeOut();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Mtop f12736a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        public b(Mtop mtop, String str, int i) {
            this.f12736a = mtop;
            this.b = str;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MtopJSBridge.e(this.f12736a, this.b, this.c, false);
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) MtopJSBridge.a().get(this.b);
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                MtopJSBridge.b(dVar.f12738a, dVar.b, dVar.c);
            }
            copyOnWriteArrayList.clear();
            MtopJSBridge.a().remove(this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AtomicInteger d = new AtomicInteger(1);

        /* renamed from: a  reason: collision with root package name */
        public final ThreadGroup f12737a;
        public final AtomicInteger b = new AtomicInteger(1);
        public final String c;

        static {
            t2o.a(589299750);
        }

        public c() {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f12737a = threadGroup;
            this.c = "mtop pool-" + d.getAndIncrement() + "-thread-";
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            ThreadGroup threadGroup = this.f12737a;
            Thread thread = new Thread(threadGroup, runnable, this.c + this.b.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, Object> f12738a;
        public final IRemoteBaseListener b;
        public final int c;

        static {
            t2o.a(589299751);
        }

        public d(Map<String, Object> map, IRemoteBaseListener iRemoteBaseListener, int i) {
            this.f12738a = map;
            this.b = iRemoteBaseListener;
            this.c = i;
        }
    }

    static {
        t2o.a(589299747);
    }

    public static /* synthetic */ ConcurrentHashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("6789008f", new Object[0]);
        }
        return f12730a;
    }

    public static /* synthetic */ void b(Map map, IRemoteBaseListener iRemoteBaseListener, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd6e019a", new Object[]{map, iRemoteBaseListener, new Integer(i)});
        } else {
            d(map, iRemoteBaseListener, i);
        }
    }

    public static void d(Map<String, Object> map, IRemoteBaseListener iRemoteBaseListener, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9749f2d1", new Object[]{map, iRemoteBaseListener, new Integer(i)});
            return;
        }
        MtopBusiness c2 = c(map);
        if (c2 == null) {
            iRemoteBaseListener.onSystemError(0, new MtopResponse(ErrorConstant.ERRCODE_PARSE_JSPARAM_ERROR, ErrorConstant.ERRMSG_PARSE_JSPARAM_ERROR), null);
            return;
        }
        String seqNo = c2.getSeqNo();
        TBSdkLog.e(TAG, seqNo, "jsparam jsParamMap." + map);
        if (SwitchConfig.getInstance().isEnableJsBridgeTimeout() && SwitchConfig.getInstance().jsBridgeTimeoutApiSet != null && SwitchConfig.getInstance().jsBridgeTimeoutApiSet.contains(c2.request.getKey()) && i > 3000) {
            int i2 = i / 2;
            c2.setSocketTimeoutMilliSecond(i2);
            MtopNetworkProp mtopNetworkProp = c2.mtopProp;
            if (mtopNetworkProp != null) {
                mtopNetworkProp.isTimeoutEnable = true;
            }
            String seqNo2 = c2.getSeqNo();
            TBSdkLog.e(TAG, seqNo2, "[setSocketTimeoutMilliSecond]before=" + i + ", after=" + i2);
        }
        MtopJSListener mtopJSListener = new MtopJSListener(c2, iRemoteBaseListener, i);
        c2.registerListener((IRemoteListener) mtopJSListener);
        c2.startRequest();
        f().schedule(new a(mtopJSListener), i, TimeUnit.MILLISECONDS);
    }

    public static Mtop e(Mtop mtop, String str, long j, boolean z) {
        MtopExternalInstanceConfigsData.a aVar;
        if (mtop != null && !StringUtils.isBlank(str)) {
            MtopConfig mtopConfig = mtop.getMtopConfig();
            if (z) {
                aVar = mtopsdk.instanceconfigs.a.c().e(mtopConfig.context, mtopConfig.appKey, str);
            } else {
                aVar = mtopsdk.instanceconfigs.a.c().h(mtopConfig.context, mtopConfig.appKey, str, j);
            }
            if (aVar != null && !StringUtils.isBlank(null) && !StringUtils.isBlank(null)) {
                try {
                    if (!StringUtils.isBlank("") && !StringUtils.isBlank("") && !StringUtils.isBlank("") && !StringUtils.isBlank("") && !StringUtils.isBlank("") && !StringUtils.isBlank("")) {
                        Mtop instance = Mtop.instance((String) null, mtop.getMtopConfig().context);
                        MtopSetting.setMtopDomain(null, "", "", "");
                        rid ridVar = (rid) Class.forName("").getMethod("", String.class).invoke(null, null);
                        if (ridVar != null) {
                            nyn.f(instance, ridVar);
                            MtopAccountSiteUtils.bindInstanceId(null, null);
                            return instance;
                        }
                    }
                    return null;
                } catch (Exception e) {
                    TBSdkLog.e(TAG, "do generateMtopFromRemoteInstanceId error.", e);
                }
            }
        }
        return null;
    }

    public static ScheduledExecutorService f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("73e3b116", new Object[0]);
        }
        if (b == null) {
            synchronized (MtopJSBridge.class) {
                try {
                    if (b == null) {
                        b = new ScheduledThreadPoolExecutor(1, new c());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class MtopJSListener implements IRemoteBaseListener, IRemoteCacheListener, IInteractingListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private MtopResponse cachedResponse;
        public final IRemoteBaseListener listener;
        private final MtopBusiness mtopBusiness;
        private long timeout;
        private AtomicBoolean isFinish = new AtomicBoolean(false);
        private AtomicBoolean ignoreTimeout = new AtomicBoolean(false);
        private AtomicLong loginDuration = new AtomicLong(0);

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f12731a;
            public final /* synthetic */ MtopResponse b;
            public final /* synthetic */ BaseOutDo c;
            public final /* synthetic */ Object d;

            public a(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                this.f12731a = i;
                this.b = mtopResponse;
                this.c = baseOutDo;
                this.d = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    MtopJSListener.this.listener.onSuccess(this.f12731a, this.b, this.c, this.d);
                } catch (Exception e) {
                    TBSdkLog.e(MtopJSBridge.TAG, "do onSuccess callback error.", e);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f12732a;
            public final /* synthetic */ MtopResponse b;
            public final /* synthetic */ Object c;

            public b(int i, MtopResponse mtopResponse, Object obj) {
                this.f12732a = i;
                this.b = mtopResponse;
                this.c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    MtopJSListener.this.listener.onError(this.f12732a, this.b, this.c);
                } catch (Exception e) {
                    TBSdkLog.e(MtopJSBridge.TAG, "do onError callback error.", e);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f12733a;
            public final /* synthetic */ MtopResponse b;
            public final /* synthetic */ Object c;

            public c(int i, MtopResponse mtopResponse, Object obj) {
                this.f12733a = i;
                this.b = mtopResponse;
                this.c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    MtopJSListener.this.listener.onSystemError(this.f12733a, this.b, this.c);
                } catch (Exception e) {
                    TBSdkLog.e(MtopJSBridge.TAG, "do onSystemError callback error.", e);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MtopJSListener.this.onTimeOut();
                }
            }
        }

        static {
            t2o.a(589299754);
            t2o.a(589299719);
            t2o.a(589299720);
            t2o.a(589299718);
        }

        public MtopJSListener(MtopBusiness mtopBusiness, IRemoteBaseListener iRemoteBaseListener, int i) {
            this.mtopBusiness = mtopBusiness;
            this.listener = iRemoteBaseListener;
            this.timeout = i;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteCacheListener
        public void onCached(MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73f40859", new Object[]{this, mtopCacheEvent, baseOutDo, obj});
                return;
            }
            if (mtopCacheEvent != null) {
                this.cachedResponse = mtopCacheEvent.getMtopResponse();
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                TBSdkLog.d(MtopJSBridge.TAG, "callback onCached");
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (this.isFinish.compareAndSet(false, true)) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    TBSdkLog.d(MtopJSBridge.TAG, "callback onError");
                }
                MtopJSBridge.f().submit(new b(i, mtopResponse, obj));
            }
        }

        @Override // com.taobao.tao.remotebusiness.IInteractingListener
        public void onInteract(String str) {
            MtopNetworkProp mtopNetworkProp;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8938ee06", new Object[]{this, str});
                return;
            }
            TBSdkLog.e(MtopJSBridge.TAG, "onInteract action: " + str);
            if (this.isFinish.get() || !SwitchConfig.getInstance().isOptH5LoginTimeout()) {
                return;
            }
            if (TextUtils.equals(str, "login")) {
                this.ignoreTimeout.set(true);
                this.loginDuration.set(System.currentTimeMillis());
            } else if (TextUtils.equals(str, "interact_finish")) {
                this.loginDuration.set(System.currentTimeMillis() - this.loginDuration.get());
                if (this.ignoreTimeout.compareAndSet(true, false)) {
                    MtopBusiness mtopBusiness = this.mtopBusiness;
                    if (!(mtopBusiness == null || (mtopNetworkProp = mtopBusiness.mtopProp) == null)) {
                        mtopNetworkProp.loginTime = this.loginDuration.get();
                    }
                    MtopJSBridge.f().schedule(new d(), this.timeout, TimeUnit.MILLISECONDS);
                }
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else if (this.isFinish.compareAndSet(false, true)) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    TBSdkLog.d(MtopJSBridge.TAG, "callback onSuccess");
                }
                MtopJSBridge.f().submit(new a(i, mtopResponse, baseOutDo, obj));
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (this.isFinish.compareAndSet(false, true)) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    TBSdkLog.d(MtopJSBridge.TAG, "callback onSystemError");
                }
                MtopJSBridge.f().submit(new c(i, mtopResponse, obj));
            }
        }

        public void onTimeOut() {
            MtopNetworkProp mtopNetworkProp;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47459e9", new Object[]{this});
                return;
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                TBSdkLog.e(MtopJSBridge.TAG, "callback onTimeOut");
            }
            if (this.ignoreTimeout.get()) {
                TBSdkLog.e(MtopJSBridge.TAG, "onInteracting callback ignoreTimeout");
                MtopBusiness mtopBusiness = this.mtopBusiness;
                if (mtopBusiness != null && (mtopNetworkProp = mtopBusiness.mtopProp) != null) {
                    mtopNetworkProp.isLoginTimeout = true;
                }
            } else if (!this.isFinish.compareAndSet(false, true)) {
                TBSdkLog.e(MtopJSBridge.TAG, "onTimeOut task is finish");
            } else {
                this.mtopBusiness.cancelRequest();
                try {
                    MtopResponse mtopResponse = this.cachedResponse;
                    if (mtopResponse != null) {
                        this.listener.onSuccess(0, mtopResponse, null, null);
                    } else {
                        this.listener.onSystemError(0, null, null);
                    }
                } catch (Exception e) {
                    TBSdkLog.e(MtopJSBridge.TAG, "do onTimeOut callback error.", e);
                }
            }
        }
    }

    public static void h(Map<String, Object> map, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d4ee057", new Object[]{map, iRemoteBaseListener});
        } else if (iRemoteBaseListener == null) {
            TBSdkLog.e(TAG, "illegal param listener.");
        } else if (map == null || map.isEmpty()) {
            TBSdkLog.e(TAG, "illegal param jsParamMap.");
            iRemoteBaseListener.onSystemError(0, new MtopResponse(ErrorConstant.ERRCODE_ILLEGAL_JSPARAM_ERROR, ErrorConstant.ERRMSG_ILLEGAL_JSPARAM_ERROR), null);
        } else {
            int i = 20000;
            try {
                int intValue = ((Integer) map.get("timeout")).intValue();
                if (intValue >= 0) {
                    i = 60000;
                    if (intValue <= 60000) {
                        i = intValue;
                    }
                }
            } catch (Exception unused) {
                TBSdkLog.e(TAG, "parse timeout (jsParam field) error.");
            }
            if (!g(map, iRemoteBaseListener, i)) {
                d(map, iRemoteBaseListener, i);
            }
        }
    }

    public static boolean g(Map<String, Object> map, IRemoteBaseListener iRemoteBaseListener, int i) {
        IWVRequestInterceptor iWVRequestInterceptor;
        HashMap<String, String> intercept;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40cc04ce", new Object[]{map, iRemoteBaseListener, new Integer(i)})).booleanValue();
        }
        if (SwitchConfig.getInstance().dynamicInjectMtopInstance()) {
            try {
                JSONObject jSONObject = new JSONObject(map);
                String string = jSONObject.getString("api");
                String optString = jSONObject.optString("v", "*");
                String optString2 = jSONObject.optString("pageUrl");
                String optString3 = jSONObject.optString(ov2.ALIPAY_ACCOUNT_SITE, "");
                if (TextUtils.isEmpty(optString3) && (iWVRequestInterceptor = MtopSetting.sWVRequestInterceptor) != null && (intercept = iWVRequestInterceptor.intercept(string, optString, optString2)) != null && intercept.size() > 0) {
                    optString3 = intercept.get(ov2.ALIPAY_ACCOUNT_SITE);
                }
                if (StringUtils.isNotBlank(optString3) && StringUtils.isBlank(MtopAccountSiteUtils.getInstanceId(optString3))) {
                    Mtop instance = Mtop.getInstance(Mtop.Id.INNER);
                    if (e(instance, optString3, -1L, true) != null) {
                        return false;
                    }
                    ConcurrentHashMap<String, CopyOnWriteArrayList<d>> concurrentHashMap = f12730a;
                    CopyOnWriteArrayList<d> copyOnWriteArrayList = concurrentHashMap.get(optString3);
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.add(new d(map, iRemoteBaseListener, i));
                        return true;
                    }
                    CopyOnWriteArrayList<d> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                    copyOnWriteArrayList2.add(new d(map, iRemoteBaseListener, i));
                    concurrentHashMap.put(optString3, copyOnWriteArrayList2);
                    MtopSDKThreadPoolExecutorFactory.submit(new b(instance, optString3, i));
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0171 A[Catch: Exception -> 0x0090, TRY_ENTER, TryCatch #0 {Exception -> 0x0090, blocks: (B:9:0x0058, B:10:0x0061, B:12:0x0067, B:14:0x0084, B:16:0x0088, B:21:0x009d, B:27:0x00ea, B:29:0x00ee, B:31:0x00f4, B:33:0x00fa, B:35:0x0107, B:39:0x0112, B:41:0x0120, B:43:0x0129, B:45:0x0132, B:47:0x013b, B:49:0x0141, B:64:0x0171, B:66:0x0177, B:159:0x0364), top: B:175:0x0058 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.tao.remotebusiness.MtopBusiness c(java.util.Map<java.lang.String, java.lang.Object> r24) {
        /*
            Method dump skipped, instructions count: 953
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.remotebusiness.js.MtopJSBridge.c(java.util.Map):com.taobao.tao.remotebusiness.MtopBusiness");
    }
}
