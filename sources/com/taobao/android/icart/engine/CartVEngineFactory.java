package com.taobao.android.icart.engine;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.MessageQueue;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.android.icart.core.performance.preloader.task.impl.CartFirstPageRequestPreloader;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.custom.TradeHybridCustomAnnotation;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.TradeHybridInstanceManager;
import com.taobao.android.icart.weex.utils.OrangeUtil;
import com.taobao.android.opencart.InitCart;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.navigation.TBFragmentTabHost;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.c9x;
import tb.ei8;
import tb.f8e;
import tb.hav;
import tb.ipx;
import tb.je3;
import tb.l9v;
import tb.lcv;
import tb.na3;
import tb.op6;
import tb.pav;
import tb.qb3;
import tb.t2o;
import tb.ub3;
import tb.vav;
import tb.zm6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CartVEngineFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CartVEngineFactory";
    private static volatile boolean isPrefetchSuccess;
    private static volatile long sStartTime;
    private static final Map<Integer, f8e> mMap = new ConcurrentHashMap();
    private static final AtomicBoolean prefetchObj = new AtomicBoolean();
    private static final AtomicBoolean initAtomic = new AtomicBoolean();
    private static final AtomicBoolean lifecycleAtomic = new AtomicBoolean();
    private static final AtomicBoolean tabActivityDestroyAtomic = new AtomicBoolean();
    private static final AtomicInteger prefetchCount = new AtomicInteger();
    private static final AtomicBoolean hasDoPreRequest = new AtomicBoolean();
    private static volatile boolean sRunIdleTask = false;
    private static final Object object = new Object();
    private static final AtomicInteger sIdleInvokeCount = new AtomicInteger();
    private static String sInstanceId = null;
    private static final AtomicBoolean sHasRegisterTabChangedBroadcast = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ipx.Companion.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(478150762);
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }

        public c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else if (TBMainHost.b().getContext() == activity) {
                try {
                    CartVEngineFactory.access$400().set(true);
                    for (f8e f8eVar : CartVEngineFactory.access$100().values()) {
                        if (f8eVar != null && !f8eVar.isDestroy()) {
                            CartVEngineFactory.access$600(f8eVar, "主tab购物车销毁了");
                        }
                    }
                    CartVEngineFactory.access$100().clear();
                } catch (Exception e) {
                    ei8.a("tabActivityDestroy", e);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else if (TBMainHost.b().getContext() == activity) {
                try {
                    TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
                    int currentTab = o != null ? o.getCurrentTab() : -1;
                    if (CartVEngineFactory.access$400().getAndSet(false) && vav.a(c9x.CART_BIZ_NAME, "enablePrefetchIdleHandler", true) && currentTab != 3) {
                        CartVEngineFactory.access$000().set(false);
                        pav.g(new d(activity, null));
                    }
                } catch (Exception e) {
                    ei8.a("tabActivityResume", e);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<Activity> f7980a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Activity activity = (Activity) d.a(d.this).get();
                if (activity != null && !activity.isFinishing() && CartVEngineFactory.access$800().getAndSet(false)) {
                    hav.d(CartVEngineFactory.TAG, "开始idle预创建购物车任务");
                    CartVEngineFactory.access$900().incrementAndGet();
                    CartVEngineFactory.prefetchCartVEngine(activity, "idleHandlePreload");
                }
            }
        }

        static {
            t2o.a(478150763);
        }

        public /* synthetic */ d(Activity activity, a aVar) {
            this(activity);
        }

        public static /* synthetic */ WeakReference a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakReference) ipChange.ipc$dispatch("4911fb0f", new Object[]{dVar});
            }
            return dVar.f7980a;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            pav.k(new a());
            return false;
        }

        public d(Activity activity) {
            this.f7980a = new WeakReference<>(activity);
        }
    }

    static {
        t2o.a(478150757);
        qb3.a();
    }

    public static /* synthetic */ AtomicBoolean access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("baff37f7", new Object[0]);
        }
        return prefetchObj;
    }

    public static /* synthetic */ Map access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d58732ed", new Object[0]);
        }
        return mMap;
    }

    public static /* synthetic */ boolean access$202(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b117a53d", new Object[]{new Boolean(z)})).booleanValue();
        }
        isPrefetchSuccess = z;
        return z;
    }

    public static /* synthetic */ AtomicBoolean access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("b9259ffb", new Object[0]);
        }
        return tabActivityDestroyAtomic;
    }

    public static /* synthetic */ void access$600(f8e f8eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513d8bd6", new Object[]{f8eVar, str});
        } else {
            destroyCartVEngine(f8eVar, str);
        }
    }

    public static /* synthetic */ AtomicBoolean access$800() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("b74c07ff", new Object[0]);
        }
        return initAtomic;
    }

    public static /* synthetic */ AtomicInteger access$900() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("613e2faa", new Object[0]);
        }
        return sIdleInvokeCount;
    }

    private static void destroyCartVEngine(f8e f8eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c69dd8e", new Object[]{f8eVar, str});
        } else if (f8eVar != null) {
            try {
                f8eVar.onDestroy();
                je3.e();
                zm6.g().e(c9x.CART_BIZ_NAME);
            } catch (Exception e) {
                ei8.a("destroyCartVEngine reason=" + str, e);
            }
        }
    }

    public static void doPreRequest(Activity activity, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7ac26e", new Object[]{activity, new Boolean(z), str});
        } else if (activity != null && !com.taobao.android.icart.a.G() && !hasDoPreRequest.getAndSet(true)) {
            String a2 = na3.a();
            sInstanceId = a2;
            CartFirstPageRequestPreloader.g(activity, a2, z, str);
        }
    }

    public static String getAndResetInstanceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8008ef5b", new Object[0]);
        }
        String str = sInstanceId;
        sInstanceId = null;
        return str;
    }

    public static f8e getCartVEngine(Activity activity) {
        f8e f8eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8e) ipChange.ipc$dispatch("830939d4", new Object[]{activity});
        }
        if (activity == null) {
            return null;
        }
        if (vav.a(c9x.CART_BIZ_NAME, "disableSyncGetEngine", true)) {
            return mMap.get(Integer.valueOf(activity.hashCode()));
        }
        synchronized (object) {
            f8eVar = mMap.get(Integer.valueOf(activity.hashCode()));
        }
        return f8eVar;
    }

    public static long getPrefetchStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7160f8dd", new Object[0])).longValue();
        }
        return sStartTime;
    }

    public static boolean isPrefetchSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa6de70d", new Object[0])).booleanValue();
        }
        return isPrefetchSuccess;
    }

    public static boolean isRunIdleTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd740725", new Object[0])).booleanValue();
        }
        return sRunIdleTask;
    }

    public static void prefetchCartVEngine(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5699f9fa", new Object[]{activity});
            return;
        }
        sRunIdleTask = true;
        registerNavigationListener();
        if (OrangeUtil.isWeexCart()) {
            pav.i(new a(), 5000L);
        }
        if (!OrangeUtil.isWeexCart() || !OrangeUtil.useWeexPrerender()) {
            registerLifecycle();
            if (activity == null) {
                tabActivityDestroyAtomic.set(true);
                initAtomic.set(true);
                return;
            }
            prefetchCartVEngine(activity, "normalPreload");
            return;
        }
        TradeHybridInstanceManager.INSTANCE.preRenderInstance();
    }

    public static void putCartVEngine(f8e f8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("762eacd9", new Object[]{f8eVar});
        } else if (f8eVar != null && f8eVar.getActivity() != null) {
            mMap.put(Integer.valueOf(f8eVar.getActivity().hashCode()), f8eVar);
        }
    }

    private static void registerLifecycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cfc90e", new Object[0]);
        } else if (!lifecycleAtomic.getAndSet(true)) {
            Globals.getApplication().registerActivityLifecycleCallbacks(new c(null));
        }
    }

    private static void registerNavigationListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ca9df2", new Object[0]);
        } else if (!sHasRegisterTabChangedBroadcast.getAndSet(true)) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(InitCart.sTabChangedBroadcastAction);
            LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.icart.engine.CartVEngineFactory.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public int f7977a = 0;

                /* compiled from: Taobao */
                /* renamed from: com.taobao.android.icart.engine.CartVEngineFactory$3$a */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
                public class a implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ int f7978a;

                    public a(int i) {
                        this.f7978a = i;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            lcv.INSTANCE.c(Integer.valueOf(this.f7978a));
                        } catch (Throwable unused) {
                        }
                    }
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/engine/CartVEngineFactory$3");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    int i;
                    int i2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    try {
                        Bundle extras = intent.getExtras();
                        if (!(extras == null || (i = extras.getInt("index", -1)) < 0 || i == this.f7977a)) {
                            this.f7977a = i;
                            a aVar = new a(i);
                            if (3 == i) {
                                i2 = 2000;
                            } else {
                                i2 = 1000;
                            }
                            pav.l(aVar, vav.e(c9x.CART_BIZ_NAME, "delayCallHybridOnTabChanged", i2));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }, intentFilter);
        }
    }

    public static void removeCartVEngine(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f871878d", new Object[]{activity});
        } else if (activity != null) {
            mMap.remove(Integer.valueOf(activity.hashCode()));
        }
    }

    public static void updatePrefetchObjResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e66c7b", new Object[0]);
        } else {
            prefetchObj.set(true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements f8e.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f7979a;
        public final /* synthetic */ int b;

        public b(Activity activity, int i) {
            this.f7979a = activity;
            this.b = i;
        }

        @Override // tb.f8e.a
        public void b(f8e f8eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("990b85f9", new Object[]{this, f8eVar});
                return;
            }
            hav.d(CartVEngineFactory.TAG, "缓存加载失败，仍然复用engine");
            a(f8eVar);
        }

        @Override // tb.f8e.a
        public void a(f8e f8eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6834001e", new Object[]{this, f8eVar});
            } else if (this.f7979a.isFinishing()) {
                ub3.d("fragmentPreloadState", "预热完成，但是当前fragment已经销毁，预热实例丢弃", false, 0.01f);
                f8eVar.onDestroy();
            } else if (CartVEngineFactory.access$000().get()) {
                hav.d(CartVEngineFactory.TAG, "预热完成，但是当前fragment已经创建完成，预热实例丢弃");
                f8eVar.onDestroy();
                ub3.d("fragmentPreloadState", "预热完成，但是当前fragment已经创建完成，预热实例丢弃", false, 0.01f);
            } else {
                CartVEngineFactory.access$100().put(Integer.valueOf(this.b), f8eVar);
                CartVEngineFactory.access$202(true);
                hav.d(CartVEngineFactory.TAG, "预创建购物车engine成功（有cache）");
            }
        }
    }

    public static void prefetchCartVEngine(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56965944", new Object[]{activity, str});
        } else if (!l9v.a("forceDisablePrefetch")) {
            doPreRequest(activity, false, str);
            if (!initAtomic.getAndSet(true) && !com.taobao.android.icart.a.G()) {
                sStartTime = System.currentTimeMillis();
                if (activity == null) {
                    ub3.h(TAG, "activity is null， scene=" + str, 0.005f);
                    return;
                }
                je3.i(activity);
                hav.g(TAG, "开始首屏闲时预加载,场景：", str, ",count=" + prefetchCount.incrementAndGet());
                int hashCode = activity.hashCode();
                isPrefetchSuccess = false;
                registerLifecycle();
                Map<Integer, f8e> map = mMap;
                if (map.get(Integer.valueOf(hashCode)) != null || prefetchObj.get()) {
                    hav.d(TAG, "prefetch failed code=" + hashCode);
                    return;
                }
                hav.d(TAG, "开始预创建购物车");
                synchronized (object) {
                    try {
                        System.currentTimeMillis();
                        boolean e = op6.e(activity);
                        CartVEngine cartVEngine = new CartVEngine(activity, null, true, new b(activity, hashCode));
                        hav.d(TAG, "完成创建CartVEngine，hasCacheData=" + e);
                        if (!cartVEngine.g().b0() || !e) {
                            map.put(Integer.valueOf(hashCode), cartVEngine);
                            isPrefetchSuccess = true;
                            hav.d(TAG, "预创建购物车engine成功（无cache）");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @TradeHybridCustomAnnotation
    public static void prefetchCartVEngine(Activity activity, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285783b7", new Object[]{activity, str, str2, map});
        } else if (UltronTradeHybridStage.ON_CONTAINER_DESTROY.equals(str) || UltronTradeHybridStage.ON_TAB_CHANGE.equals(str)) {
            String g = vav.g(c9x.CART_BIZ_NAME, "prefetchScenesFromTrade", "orderList,orderDetail,sku,newBuy,paysuccess,mytaobao");
            if (!TextUtils.isEmpty(g) && g.contains(str2)) {
                if (vav.b(c9x.CART_BIZ_NAME, "onlyDoPreRequestWhenPrefetchFromTrade", true, true)) {
                    doPreRequest(activity, false, str2);
                } else {
                    prefetchCartVEngine(activity, str2);
                }
            }
        }
    }
}
