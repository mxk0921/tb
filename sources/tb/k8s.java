package tb;

import android.text.TextUtils;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.register.AbilityType;
import com.taobao.themis.kernel.adapter.IApiInvokerChainFactory;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class k8s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TMSAbilityManager";

    /* renamed from: a  reason: collision with root package name */
    public static volatile k8s f22473a;
    public static final Map<String, Map<String, j8s>> b = new ConcurrentHashMap();
    public static final Map<String, j8s> c = new ConcurrentHashMap();
    public static final Map<String, AbilityHubAdapter> d = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x4k f22474a;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ ApiContext d;
        public final /* synthetic */ uq e;

        public a(x4k x4kVar, String str, JSONObject jSONObject, ApiContext apiContext, uq uqVar) {
            this.f22474a = x4kVar;
            this.b = str;
            this.c = jSONObject;
            this.d = apiContext;
            this.e = uqVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                k8s.a(k8s.this, this.f22474a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jr[] f22475a;
        public final /* synthetic */ CountDownLatch b;

        public b(k8s k8sVar, jr[] jrVarArr, CountDownLatch countDownLatch) {
            this.f22475a = jrVarArr;
            this.b = countDownLatch;
        }

        @Override // tb.uq
        public void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
                return;
            }
            this.f22475a[0] = jrVar;
            this.b.countDown();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22478a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ExecuteResult[] c;
        public final /* synthetic */ CountDownLatch d;

        public e(k8s k8sVar, String str, String str2, ExecuteResult[] executeResultArr, CountDownLatch countDownLatch) {
            this.f22478a = str;
            this.b = str2;
            this.c = executeResultArr;
            this.d = countDownLatch;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            mcs.b(mcs.MODULE_MEGA, this.f22478a, this.b, mcs.d("Mega"), new JSONObject(executeResult.toFormattedData()));
            if (executeResult.getStatusCode() == 0 || executeResult.getStatusCode() >= 100) {
                this.c[0] = executeResult;
                this.d.countDown();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class f {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$themis$kernel$ability$register$AbilityType;

        static {
            int[] iArr = new int[AbilityType.values().length];
            $SwitchMap$com$taobao$themis$kernel$ability$register$AbilityType = iArr;
            try {
                iArr[AbilityType.GLOBAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$themis$kernel$ability$register$AbilityType[AbilityType.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$themis$kernel$ability$register$AbilityType[AbilityType.SUBPAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(839909411);
    }

    public static /* synthetic */ void a(k8s k8sVar, x4k x4kVar, String str, JSONObject jSONObject, ApiContext apiContext, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c847331", new Object[]{k8sVar, x4kVar, str, jSONObject, apiContext, uqVar});
        } else {
            k8sVar.b(x4kVar, str, jSONObject, apiContext, uqVar);
        }
    }

    public static synchronized k8s j() {
        synchronized (k8s.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (k8s) ipChange.ipc$dispatch("e1ea18d7", new Object[0]);
            }
            if (f22473a == null) {
                f22473a = new k8s();
            }
            return f22473a;
        }
    }

    public final void b(x4k x4kVar, String str, JSONObject jSONObject, ApiContext apiContext, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58d0ccb6", new Object[]{this, x4kVar, str, jSONObject, apiContext, uqVar});
            return;
        }
        f11 b2 = l8s.b(str, apiContext.a());
        if (b2 == null) {
            TMSLogger.b(TAG, "cannot find ApiMeta " + str);
            uqVar.a(jr.e("1", "Api meta not found"), false);
            return;
        }
        j8s i = i(x4kVar, b2.b);
        if (i == null) {
            TMSLogger.b(TAG, "cannot create AbilityInstance");
            uqVar.a(jr.e("1", "cannot create AbilityInstance"), false);
            return;
        }
        ((IApiInvokerChainFactory) p8s.g(IApiInvokerChainFactory.class)).createApiInvokerChain(x4kVar, i, b2, jSONObject).a(apiContext, new Object[1], uqVar);
    }

    public void c(x4k x4kVar, String str, JSONObject jSONObject, ApiContext apiContext, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9b8856", new Object[]{this, x4kVar, str, jSONObject, apiContext, uqVar});
        } else {
            ((IExecutorService) p8s.g(IExecutorService.class)).getExecutor(ExecutorType.JSAPI).execute(new a(x4kVar, str, jSONObject, apiContext, uqVar));
        }
    }

    public final j8s h(Class<? extends j8s> cls) {
        try {
            j8s j8sVar = (j8s) cls.newInstance();
            j8sVar.onInitialized();
            return j8sVar;
        } catch (Throwable th) {
            TMSLogger.c(TAG, "createAbilityInstance failed", th);
            return null;
        }
    }

    public final synchronized j8s i(x4k x4kVar, fr frVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j8s) ipChange.ipc$dispatch("f5c8d8b1", new Object[]{this, x4kVar, frVar});
        }
        String name = frVar.f19475a.getName();
        Map hashMap = new HashMap();
        int i = f.$SwitchMap$com$taobao$themis$kernel$ability$register$AbilityType[frVar.c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                }
            } else if (x4kVar instanceof ITMSPage) {
                x4kVar = ((ITMSPage) x4kVar).getInstance();
            }
            if (x4kVar == null) {
                TMSLogger.b(TAG, "findAbilityInstance but node is null");
            } else {
                Map<String, Map<String, j8s>> map = b;
                Map map2 = (Map) ((ConcurrentHashMap) map).get(x4kVar.b());
                if (map2 != null) {
                    hashMap = map2;
                } else {
                    ((ConcurrentHashMap) map).put(x4kVar.b(), hashMap);
                }
            }
        } else {
            hashMap = c;
        }
        if (hashMap.containsKey(name)) {
            return (j8s) hashMap.get(name);
        }
        j8s h = h(frVar.f19475a);
        if (h != null) {
            hashMap.put(name, h);
        }
        return h;
    }

    public synchronized void k(x4k x4kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a291725d", new Object[]{this, x4kVar});
            return;
        }
        AbilityHubAdapter abilityHubAdapter = (AbilityHubAdapter) ((ConcurrentHashMap) d).remove(x4kVar.b());
        if (abilityHubAdapter != null && q9s.q()) {
            abilityHubAdapter.n();
        }
        Map map = (Map) ((ConcurrentHashMap) b).remove(x4kVar.b());
        if (map != null && !map.isEmpty()) {
            for (j8s j8sVar : map.values()) {
                if (j8sVar != null) {
                    j8sVar.onFinalized();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22476a;
        public final /* synthetic */ String b;
        public final /* synthetic */ uq c;

        public c(k8s k8sVar, String str, String str2, uq uqVar) {
            this.f22476a = str;
            this.b = str2;
            this.c = uqVar;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            mcs.b(mcs.MODULE_MEGA, this.f22476a, this.b, mcs.d("Mega"), new JSONObject(executeResult.toFormattedData()));
            if (executeResult.getStatusCode() == 0) {
                this.c.a(new jr(true, new JSONObject(executeResult.toFormattedData())), false);
            } else if (executeResult.getStatusCode() == 1) {
                if (!"result".equals(executeResult.getType()) || executeResult.getData() != null) {
                    this.c.a(new jr(true, new JSONObject(executeResult.toFormattedData())), true);
                }
            } else if (executeResult.getStatusCode() != 99 && executeResult.getStatusCode() > 100) {
                this.c.a(jr.e("meg_error", JSON.toJSONString(executeResult.toFormattedData())), false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22477a;
        public final /* synthetic */ String b;
        public final /* synthetic */ uq c;

        public d(k8s k8sVar, String str, String str2, uq uqVar) {
            this.f22477a = str;
            this.b = str2;
            this.c = uqVar;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            mcs.b(mcs.MODULE_MEGA, this.f22477a, this.b, mcs.d("Mega"), new JSONObject(executeResult.toFormattedData()));
            if (executeResult.getStatusCode() == 0) {
                this.c.a(new jr(true, new JSONObject(executeResult.toFormattedData())), false);
            } else if (executeResult.getStatusCode() == 1) {
                if (!"result".equals(executeResult.getType()) || executeResult.getData() != null) {
                    this.c.a(new jr(true, new JSONObject(executeResult.toFormattedData())), true);
                }
            } else if (executeResult.getStatusCode() != 99 && executeResult.getStatusCode() > 100) {
                this.c.a(jr.e("meg_error", JSON.toJSONString(executeResult.toFormattedData())), false);
            }
        }
    }

    public jr g(x4k x4kVar, String str, JSONObject jSONObject, ApiContext apiContext, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jr) ipChange.ipc$dispatch("5ee82913", new Object[]{this, x4kVar, str, jSONObject, apiContext, new Long(j)});
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        jr[] jrVarArr = new jr[1];
        try {
            b(x4kVar, str, jSONObject, apiContext, new b(this, jrVarArr, countDownLatch));
            try {
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                TMSLogger.b(TAG, "sync lock await error!");
            }
            jr jrVar = jrVarArr[0];
            if (jrVar != null) {
                return jrVar;
            }
            TMSLogger.b(TAG, "callSync api TimeOut!");
            return jr.e("9", "callSync timeout");
        } catch (Throwable th) {
            TMSLogger.c(TAG, "call Sync exception", th);
            countDownLatch.countDown();
            return jr.e("6", Arrays.toString(th.getStackTrace()));
        }
    }

    public ExecuteResult f(bbs bbsVar, String str, String str2, String str3, String str4, String str5, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("12a372cf", new Object[]{this, bbsVar, str, str2, str3, str4, str5, jSONObject});
        }
        String str6 = null;
        if (q9s.q() && bbsVar.z) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ExecuteResult[] executeResultArr = {null};
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) d;
        AbilityHubAdapter abilityHubAdapter = (AbilityHubAdapter) concurrentHashMap.get(bbsVar.b());
        ITMSPage topPage = bbsVar.W().getTopPage();
        if (topPage != null) {
            str6 = qml.a(topPage);
        }
        if (TextUtils.isEmpty(str6)) {
            str6 = bbsVar.L();
        }
        zq zqVar = new zq(str6, TMSCalendarBridge.namespace);
        zqVar.d(new WeakReference<>(bbsVar.I()));
        if (abilityHubAdapter == null) {
            abilityHubAdapter = new AbilityHubAdapter(zqVar);
            concurrentHashMap.put(bbsVar.b(), abilityHubAdapter);
        }
        HashMap hashMap = new HashMap();
        xq xqVar = new xq(zqVar);
        xqVar.e(hashMap);
        xqVar.o(bbsVar.L());
        xqVar.b(str3);
        abilityHubAdapter.j(str4, str5, xqVar, jSONObject, new e(this, str5, str2, executeResultArr, countDownLatch));
        try {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } catch (Throwable unused) {
        }
        countDownLatch.countDown();
        return executeResultArr[0];
    }

    public void e(String str, String str2, String str3, String str4, JSONObject jSONObject, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c24c9662", new Object[]{this, str, str2, str3, str4, jSONObject, uqVar});
            return;
        }
        try {
            zq zqVar = new zq("", TMSCalendarBridge.namespace);
            AbilityHubAdapter abilityHubAdapter = new AbilityHubAdapter(zqVar);
            xq xqVar = new xq(zqVar);
            xqVar.e(new HashMap());
            xqVar.b(str2);
            abilityHubAdapter.j(str3, str4, xqVar, jSONObject, new c(this, str4, str, uqVar));
        } catch (Throwable th) {
            try {
                uqVar.a(jr.e("meg_error", JSON.toJSONString(ErrorResult.a.f(th.getMessage()).toFormattedData())), true);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public void d(bbs bbsVar, String str, String str2, String str3, String str4, String str5, JSONObject jSONObject, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70deb3ac", new Object[]{this, bbsVar, str, str2, str3, str4, str5, jSONObject, uqVar});
        } else if (!q9s.q() || !bbsVar.z) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) d;
            AbilityHubAdapter abilityHubAdapter = (AbilityHubAdapter) concurrentHashMap.get(bbsVar.b());
            ITMSPage topPage = bbsVar.W().getTopPage();
            String a2 = topPage != null ? qml.a(topPage) : null;
            if (TextUtils.isEmpty(a2)) {
                a2 = bbsVar.L();
            }
            zq zqVar = new zq(a2, TMSCalendarBridge.namespace);
            zqVar.d(new WeakReference<>(bbsVar.I()));
            if (abilityHubAdapter == null) {
                abilityHubAdapter = new AbilityHubAdapter(zqVar);
                concurrentHashMap.put(bbsVar.b(), abilityHubAdapter);
            }
            HashMap hashMap = new HashMap();
            xq xqVar = new xq(zqVar);
            xqVar.e(hashMap);
            xqVar.o(bbsVar.L());
            xqVar.b(str3);
            try {
                abilityHubAdapter.j(str4, str5, xqVar, jSONObject, new d(this, str5, str2, uqVar));
            } catch (Throwable th) {
                try {
                    uqVar.a(jr.e("meg_error", JSON.toJSONString(ErrorResult.a.f(th.getMessage()).toFormattedData())), true);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
    }
}
