package com.taobao.android.icart.weex.impl;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.BaseICartFragment;
import com.taobao.android.icart.BaseICartFragmentProxy;
import com.taobao.android.icart.engine.CartVEngineFactory;
import com.taobao.android.icart.weex.TradeHybridInstanceManager;
import com.taobao.android.icart.weex.call.CartMegaManager;
import com.taobao.android.icart.weex.downgrade.CartWeexDowngradeHelper;
import com.taobao.android.icart.weex.performance.CartWeexPerformance;
import com.taobao.android.icart.weex.prefetch.ColdStartPrefetch;
import com.taobao.android.icart.weex.prefetch.NextRPCPrefetch;
import com.taobao.android.icart.weex.recreate.RecreateQueryData;
import com.taobao.android.icart.weex.utils.OrangeUtil;
import com.taobao.android.opencart.broadcast.CartRefreshCheckBroadcast;
import com.taobao.android.opencart.broadcast.TBCartWVService;
import com.taobao.android.tbelder.TBElder;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.tao.Globals;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import kotlin.Metadata;
import tb.a07;
import tb.anj;
import tb.c9x;
import tb.ckf;
import tb.cqv;
import tb.cw6;
import tb.hav;
import tb.hvd;
import tb.ine;
import tb.j2e;
import tb.jji;
import tb.m9u;
import tb.nbq;
import tb.ne3;
import tb.o78;
import tb.pav;
import tb.r4p;
import tb.rv;
import tb.sv;
import tb.t2o;
import tb.u60;
import tb.y9a;
import tb.z4v;
import tb.zd3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class WeexFragmentProxyImpl extends BaseICartFragmentProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public ViewGroup f;
    public volatile j2e g;
    public final QueryParamsManager i;
    public final Intent p;
    public final boolean q;
    public final zd3 d = new zd3();
    public final long e = System.currentTimeMillis();
    public final CartWeexDowngradeHelper h = new CartWeexDowngradeHelper();
    public final Handler j = new Handler(Looper.getMainLooper());
    public final WeexFragmentProxyImpl$mElderBroadcastReceiver$1 k = new BroadcastReceiver() { // from class: com.taobao.android.icart.weex.impl.WeexFragmentProxyImpl$mElderBroadcastReceiver$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(WeexFragmentProxyImpl$mElderBroadcastReceiver$1 weexFragmentProxyImpl$mElderBroadcastReceiver$1, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/impl/WeexFragmentProxyImpl$mElderBroadcastReceiver$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (anj.Companion.a()) {
                WeexFragmentProxyImpl.this.a("elderSwitch");
            }
        }
    };
    public final e l = new e();
    public final WeexFragmentProxyImpl$mNavigationTabListener$1 m = new WeexFragmentProxyImpl$mNavigationTabListener$1(this);
    public final hvd n = new f();
    public final d o = new d();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(478150994);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public b(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseICartFragmentProxy r2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BaseICartFragment G = WeexFragmentProxyImpl.G(WeexFragmentProxyImpl.this);
            if (((G == null || (r2 = G.r2()) == null) ? null : r2.h()) == BaseICartFragmentProxy.FragmentProxyType.NATIVE) {
                hav.d(c9x.TAG, "已经降级到Native了（post），无需再次触发");
                return;
            }
            boolean E = WeexFragmentProxyImpl.E(WeexFragmentProxyImpl.this, this.b);
            if (cw6.b() && E) {
                Application application = Globals.getApplication();
                z4v.a(application, "Weex购物车降级Native reason=" + this.b);
            }
            ne3.c cVar = ne3.Companion;
            ne3.c.e(cVar, "DowngradeNative", "降级Native reason=" + this.b + ",result=" + E, 0.0f, 4, null);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long b;

        public c(long j) {
            this.b = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String instanceId;
            Boolean bool;
            sv b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            j2e H = WeexFragmentProxyImpl.H(WeexFragmentProxyImpl.this);
            if (H != null && (instanceId = H.getInstanceId()) != null) {
                rv i = CartMegaManager.INSTANCE.i(instanceId);
                if (i == null || (b = i.b()) == null) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(b.m());
                }
                if (!ckf.b(bool, Boolean.TRUE)) {
                    WeexFragmentProxyImpl weexFragmentProxyImpl = WeexFragmentProxyImpl.this;
                    weexFragmentProxyImpl.a("HandleShakeTimeout countDown=" + this.b);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class d implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Fragment fragment;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                return;
            }
            ckf.g(activity, "activity");
            if (ckf.b(activity, WeexFragmentProxyImpl.this.b())) {
                if (WeexFragmentProxyImpl.I(WeexFragmentProxyImpl.this)) {
                    TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
                    if (o != null) {
                        fragment = o.getCurrentFragment();
                    } else {
                        fragment = null;
                    }
                    if (!ckf.b(fragment, WeexFragmentProxyImpl.G(WeexFragmentProxyImpl.this))) {
                        return;
                    }
                }
                j2e H = WeexFragmentProxyImpl.H(WeexFragmentProxyImpl.this);
                if (H != null) {
                    H.a();
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                return;
            }
            ckf.g(activity, "activity");
            ckf.g(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class e implements Localization.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.alibaba.ability.localization.Localization.a
        public void onChange(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c58b74d", new Object[]{this, language, str});
                return;
            }
            ckf.g(language, LoggingSPCache.STORAGE_LANGUAGE);
            ckf.g(str, r4p.KEY_EDITION_CODE);
            if (anj.Companion.b()) {
                WeexFragmentProxyImpl.this.a("languageSwitch");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class f implements hvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.hvd
        public final void onTabChanged(int i, String str) {
            j2e H;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
            } else if (!ckf.b("cart", str) && (H = WeexFragmentProxyImpl.H(WeexFragmentProxyImpl.this)) != null) {
                H.a();
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/taobao/android/icart/weex/impl/WeexFragmentProxyImpl$onCreate$2$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j2e f8063a;
        public final /* synthetic */ WeexFragmentProxyImpl b;

        public g(j2e j2eVar, WeexFragmentProxyImpl weexFragmentProxyImpl) {
            this.f8063a = j2eVar;
            this.b = weexFragmentProxyImpl;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                NextRPCPrefetch.INSTANCE.k(this.f8063a.getInstanceId(), this.b.i());
            }
        }
    }

    static {
        t2o.a(478150993);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.taobao.android.icart.weex.impl.WeexFragmentProxyImpl$mElderBroadcastReceiver$1] */
    public WeexFragmentProxyImpl(BaseICartFragment baseICartFragment, Intent intent, boolean z) {
        super(baseICartFragment);
        ckf.g(baseICartFragment, "fragment");
        ckf.g(intent, "activityIntent");
        this.p = intent;
        this.q = z;
        this.i = new QueryParamsManager(Globals.getApplication(), intent);
        m9u.a aVar = m9u.Companion;
        aVar.a("Cart#WeexFragmentInit");
        hav.d(c9x.TAG, "创建weex fragment");
        if (!CartVEngineFactory.isRunIdleTask()) {
            ColdStartPrefetch.INSTANCE.m(ColdStartPrefetch.StartType.FRAGMENT_INIT);
        } else if (!z || !TradeHybridInstanceManager.INSTANCE.hasPreRenderInstance()) {
            TradeHybridInstanceManager.INSTANCE.preCreateInstance(z);
        }
        aVar.b("Cart#WeexFragmentInit");
    }

    public static final /* synthetic */ boolean E(WeexFragmentProxyImpl weexFragmentProxyImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6a219ad", new Object[]{weexFragmentProxyImpl, str})).booleanValue();
        }
        return super.a(str);
    }

    public static final /* synthetic */ Intent F(WeexFragmentProxyImpl weexFragmentProxyImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("73e8b373", new Object[]{weexFragmentProxyImpl});
        }
        return weexFragmentProxyImpl.p;
    }

    public static final /* synthetic */ BaseICartFragment G(WeexFragmentProxyImpl weexFragmentProxyImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseICartFragment) ipChange.ipc$dispatch("cddb170", new Object[]{weexFragmentProxyImpl});
        }
        return weexFragmentProxyImpl.f7942a;
    }

    public static final /* synthetic */ j2e H(WeexFragmentProxyImpl weexFragmentProxyImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j2e) ipChange.ipc$dispatch("a1f60b7d", new Object[]{weexFragmentProxyImpl});
        }
        return weexFragmentProxyImpl.g;
    }

    public static final /* synthetic */ boolean I(WeexFragmentProxyImpl weexFragmentProxyImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e647087", new Object[]{weexFragmentProxyImpl})).booleanValue();
        }
        return weexFragmentProxyImpl.q;
    }

    public static /* synthetic */ Object ipc$super(WeexFragmentProxyImpl weexFragmentProxyImpl, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.v((Bundle) objArr[0]);
                return null;
            case -1711976255:
                super.z();
                return null;
            case -1542694236:
                super.y();
                return null;
            case -1504501726:
                super.o();
                return null;
            case -1451526838:
                return new Boolean(super.a((String) objArr[0]));
            case -641568046:
                super.m((Bundle) objArr[0]);
                return null;
            case -198387616:
                return new Boolean(super.s(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case 188604040:
                super.x();
                return null;
            case 352555969:
                super.u(((Boolean) objArr[0]).booleanValue());
                return null;
            case 462397159:
                super.p();
                return null;
            case 797441118:
                super.t();
                return null;
            case 1045626554:
                super.k((LoginAction) objArr[0]);
                return null;
            case 1257714799:
                super.l(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1950489833:
                super.A();
                return null;
            case 2133689546:
                super.w();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/impl/WeexFragmentProxyImpl");
        }
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74421ce9", new Object[]{this});
            return;
        }
        super.A();
        j2e j2eVar = this.g;
        if (j2eVar != null) {
            j2eVar.onResume();
        }
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void B(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
        }
    }

    public final long K(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("922f23bf", new Object[]{this, bundle})).longValue();
        }
        if (bundle != null) {
            return e();
        }
        Activity b2 = b();
        ckf.f(b2, "activity");
        return b2.getIntent().getLongExtra("NAV_TO_URL_START_TIME", e());
    }

    public final long L(Bundle bundle) {
        Bundle arguments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e7c694b", new Object[]{this, bundle})).longValue();
        }
        if (bundle != null) {
            return e();
        }
        BaseICartFragment baseICartFragment = this.f7942a;
        if (baseICartFragment == null || (arguments = baseICartFragment.getArguments()) == null) {
            return 0L;
        }
        long j = arguments.getLong(y9a.CLICK_STAGE, 0L);
        if (j > 0) {
            return (System.currentTimeMillis() - SystemClock.uptimeMillis()) + j;
        }
        return e();
    }

    public final void M(CartWeexPerformance cartWeexPerformance, Bundle bundle) {
        long j;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442e89d", new Object[]{this, cartWeexPerformance, bundle});
            return;
        }
        if (this.q) {
            j = L(bundle);
        } else {
            j = K(bundle);
        }
        cartWeexPerformance.y(j);
        cartWeexPerformance.m(this.e);
        cartWeexPerformance.l(e());
        cartWeexPerformance.E(CartVEngineFactory.isRunIdleTask());
        if (bundle != null) {
            z = true;
        }
        cartWeexPerformance.D(z);
        ColdStartPrefetch coldStartPrefetch = ColdStartPrefetch.INSTANCE;
        if (coldStartPrefetch.l()) {
            if (coldStartPrefetch.k() > 0 && coldStartPrefetch.j() > 0) {
                cartWeexPerformance.M(coldStartPrefetch.k());
                cartWeexPerformance.L(coldStartPrefetch.j());
            }
            if (coldStartPrefetch.h() == ColdStartPrefetch.StartType.TOUCH_DOWN && coldStartPrefetch.i() > 0) {
                cartWeexPerformance.G(true);
                cartWeexPerformance.x(coldStartPrefetch.i());
            }
        }
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ba93a", new Object[]{this});
            return;
        }
        long handleShakeCountDown = OrangeUtil.INSTANCE.getHandleShakeCountDown();
        if (handleShakeCountDown <= 0) {
            hav.d(c9x.TAG, "握手逻辑跳过，countDown=" + handleShakeCountDown);
            return;
        }
        this.j.postDelayed(new c(handleShakeCountDown), handleShakeCountDown);
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62e1136d", new Object[]{this});
        } else {
            cqv.m(i().o(), null, this, new String[0]);
        }
    }

    public final boolean P() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bcfe288", new Object[]{this})).booleanValue();
        }
        j2e j2eVar = this.g;
        if (j2eVar == null || (str = j2eVar.getInstanceId()) == null) {
            str = "";
        }
        if (!CartMegaManager.INSTANCE.j(str)) {
            return false;
        }
        j2e j2eVar2 = this.g;
        if (j2eVar2 != null) {
            j2e.a.a(j2eVar2, "closePop", null, 2, null);
        }
        return true;
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public BaseICartFragmentProxy f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseICartFragmentProxy) ipChange.ipc$dispatch("1fb65f58", new Object[]{this});
        }
        BaseICartFragmentProxy a2 = BaseICartFragment.b.a(this.f7942a);
        ckf.f(a2, "ProxyFactory.createNative(mFragment)");
        return a2;
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public BaseICartFragmentProxy.FragmentProxyType h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseICartFragmentProxy.FragmentProxyType) ipChange.ipc$dispatch("872b3ae7", new Object[]{this});
        }
        return BaseICartFragmentProxy.FragmentProxyType.WEEX;
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public QueryParamsManager i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QueryParamsManager) ipChange.ipc$dispatch("45979145", new Object[]{this});
        }
        return this.i;
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        String o = i().o();
        ckf.f(o, "queryParamsManager.pageName");
        return o;
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void k(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e52feba", new Object[]{this, loginAction});
            return;
        }
        super.k(loginAction);
        if (loginAction != null && loginAction == LoginAction.NOTIFY_LOGIN_SUCCESS) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "cartBroadcastFrom", o78.REFRESH_SOURCE_LOGIN_SUCCESS);
            jji.a(Globals.getApplication(), jSONObject);
        }
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void l(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.l(i, i2, intent);
        j2e j2eVar = this.g;
        if (j2eVar != null) {
            j2eVar.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void m(Bundle bundle) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.m(bundle);
        m9u.a aVar = m9u.Companion;
        aVar.a("Cart#FragmentCreate");
        this.g = TradeHybridInstanceManager.INSTANCE.getAvailableInstance(this, this.q);
        j2e j2eVar = this.g;
        ckf.d(j2eVar);
        M(j2eVar.h(), bundle);
        j2e j2eVar2 = this.g;
        if (j2eVar2 != null && j2eVar2.e()) {
            a("GetInstanceCheckWeexHasError");
        }
        anj.a aVar2 = anj.Companion;
        aVar2.c(this.k);
        aVar2.d(this.l);
        this.h.a(this);
        TBCartWVService.registerPlugin();
        CartRefreshCheckBroadcast.f(Globals.getApplication());
        if (this.q) {
            com.taobao.tao.navigation.a.h(this.n);
        } else {
            this.d.a();
        }
        RecreateQueryData recreateQueryData = RecreateQueryData.INSTANCE;
        boolean z = this.q;
        j2e j2eVar3 = this.g;
        String str = null;
        if (j2eVar3 != null) {
            bool = Boolean.valueOf(j2eVar3.j());
        } else {
            bool = null;
        }
        recreateQueryData.g(bundle, z, bool);
        j2e j2eVar4 = this.g;
        if (j2eVar4 != null) {
            j2eVar4.m();
        }
        Globals.getApplication().registerActivityLifecycleCallbacks(this.o);
        ColdStartPrefetch.INSTANCE.d();
        j2e j2eVar5 = this.g;
        if (j2eVar5 != null) {
            if (!j2eVar5.c()) {
                j2eVar5 = null;
            }
            if (j2eVar5 != null) {
                pav.k(new g(j2eVar5, this));
            }
        }
        nbq.c(c9x.TAG, c9x.TAG, c9x.TAG, "default");
        StringBuilder sb = new StringBuilder("Fragment OnCreate instanceID=");
        j2e j2eVar6 = this.g;
        if (j2eVar6 != null) {
            str = j2eVar6.getInstanceId();
        }
        sb.append(str);
        hav.d(c9x.TAG, sb.toString());
        aVar.b("Cart#FragmentCreate");
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public View n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ViewGroup viewGroup2 = this.f;
        String str = null;
        ViewGroup viewGroup3 = null;
        if (viewGroup2 == null) {
            m9u.a aVar = m9u.Companion;
            aVar.a("Cart#FragmentCreateView");
            j2e j2eVar = this.g;
            if (j2eVar != null) {
                viewGroup3 = j2eVar.getRootView();
            }
            this.f = viewGroup3;
            aVar.b("Cart#FragmentCreateView");
        } else {
            if ((viewGroup2 != null ? viewGroup2.getParent() : null) instanceof ViewGroup) {
                ne3.c cVar = ne3.Companion;
                StringBuilder sb = new StringBuilder("执行fragment onCreateView时，发现rootView还有parentView isTabMain=");
                sb.append(this.q);
                sb.append(", instanceName=");
                j2e j2eVar2 = this.g;
                if (j2eVar2 != null) {
                    str = j2eVar2.name();
                }
                sb.append(str);
                ne3.c.e(cVar, "FragmentOnCreateViewHasParentView", sb.toString(), 0.0f, 4, null);
            }
        }
        ViewGroup viewGroup4 = this.f;
        ckf.d(viewGroup4);
        return viewGroup4;
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void o() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.o();
        String str2 = null;
        this.j.removeCallbacksAndMessages(null);
        j2e j2eVar = this.g;
        if (j2eVar != null) {
            j2eVar.destroy();
        }
        if (this.q) {
            com.taobao.tao.navigation.a.T(3, null);
        }
        this.h.b();
        anj.a aVar = anj.Companion;
        aVar.e(this.k);
        aVar.f(this.l);
        if (this.q) {
            com.taobao.tao.navigation.a.K(this.n);
            RecreateQueryData recreateQueryData = RecreateQueryData.INSTANCE;
            j2e j2eVar2 = this.g;
            if (j2eVar2 == null || (str = j2eVar2.getInstanceId()) == null) {
                str = "";
            }
            recreateQueryData.f(str);
            ine ineVar = ine.INSTANCE;
            StringBuilder sb = new StringBuilder("destroy_");
            j2e j2eVar3 = this.g;
            if (j2eVar3 != null) {
                str2 = j2eVar3.getInstanceId();
            }
            sb.append(str2);
            ineVar.d(sb.toString());
        }
        Globals.getApplication().unregisterActivityLifecycleCallbacks(this.o);
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void p() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.p();
        StringBuilder sb = new StringBuilder("Fragment onDestroyView, instanceID=");
        j2e j2eVar = this.g;
        if (j2eVar != null) {
            str = j2eVar.getInstanceId();
        } else {
            str = null;
        }
        sb.append(str);
        hav.d(c9x.TAG, sb.toString());
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public boolean s(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4 || !P()) {
            return super.s(i, keyEvent);
        }
        return true;
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void t() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.t();
        j2e j2eVar = this.g;
        if (j2eVar != null) {
            j2eVar.onPause();
        }
        O();
        StringBuilder sb = new StringBuilder("Fragment onPause, instanceID=");
        j2e j2eVar2 = this.g;
        if (j2eVar2 != null) {
            str = j2eVar2.getInstanceId();
        } else {
            str = null;
        }
        sb.append(str);
        hav.d(c9x.TAG, sb.toString());
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void u(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("150393c1", new Object[]{this, new Boolean(z)});
            return;
        }
        super.u(z);
        BaseICartFragment baseICartFragment = this.f7942a;
        ckf.f(baseICartFragment, "mFragment");
        if (!baseICartFragment.e()) {
            N();
        }
        j2e j2eVar = this.g;
        if (j2eVar != null) {
            j2eVar.onResume();
        }
        BaseICartFragment baseICartFragment2 = this.f7942a;
        ckf.f(baseICartFragment2, "mFragment");
        if (baseICartFragment2.getActivity() != null && !this.q) {
            zd3 zd3Var = this.d;
            BaseICartFragment baseICartFragment3 = this.f7942a;
            ckf.f(baseICartFragment3, "mFragment");
            FragmentActivity activity = baseICartFragment3.getActivity();
            ckf.d(activity);
            zd3Var.b(activity);
        }
        if (this.q) {
            com.taobao.tao.navigation.a.T(3, this.m);
        }
        J();
        StringBuilder sb = new StringBuilder("Fragment onResume, instanceID=");
        j2e j2eVar2 = this.g;
        if (j2eVar2 != null) {
            str = j2eVar2.getInstanceId();
        } else {
            str = null;
        }
        sb.append(str);
        hav.d(c9x.TAG, sb.toString());
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.w();
        j2e j2eVar = this.g;
        if (j2eVar != null) {
            j2eVar.onStart();
        }
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.x();
        j2e j2eVar = this.g;
        if (j2eVar != null) {
            j2eVar.onStop();
        }
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40c5aa4", new Object[]{this});
            return;
        }
        super.y();
        j2e j2eVar = this.g;
        if (j2eVar != null) {
            j2eVar.onPause();
        }
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99f550c1", new Object[]{this});
            return;
        }
        super.z();
        j2e j2eVar = this.g;
        if (j2eVar != null) {
            j2eVar.a();
        }
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1d1a8e", new Object[]{this});
            return;
        }
        Q();
        String o = i().o();
        ckf.f(o, "queryParamsManager.pageName");
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.f(instance, "UTAnalytics.getInstance()");
        instance.getDefaultTracker().updatePageName(b(), o);
        cqv.l(o, null, this, new String[0]);
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void v(Bundle bundle) {
        j2e j2eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.v(bundle);
        if (this.q && (j2eVar = this.g) != null) {
            j2e.a.a(j2eVar, "onSaveInstanceState", null, 2, null);
        }
    }

    public final void Q() {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65c7fd52", new Object[]{this});
            return;
        }
        try {
            z = u60.a(b());
        } catch (Throwable unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("voiceIsOpen", String.valueOf(z));
        hashMap.put("bizName", c9x.CART_BIZ_NAME);
        hashMap.put(c9x.CART_BIZ_NAME, "true");
        hashMap.put("fromWeex", "true");
        hashMap.put("isSecondPage", String.valueOf(true ^ this.q));
        if (!i().w()) {
            str = i().h();
        } else if (Localization.o()) {
            str = "a2141.oversea_cart";
        } else {
            str = "a2141.7631563";
        }
        if (!TextUtils.isEmpty(str)) {
            ckf.f(str, "spmCnt");
            hashMap.put("spm-cnt", str);
        }
        if (TBElder.b()) {
            hashMap.put("oldPeople", "true");
        }
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.f(instance, "UTAnalytics.getInstance()");
        instance.getDefaultTracker().updatePageProperties(b(), hashMap);
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public boolean a(String str) {
        BaseICartFragmentProxy r2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a97b754a", new Object[]{this, str})).booleanValue();
        }
        BaseICartFragment baseICartFragment = this.f7942a;
        if (((baseICartFragment == null || (r2 = baseICartFragment.r2()) == null) ? null : r2.h()) == BaseICartFragmentProxy.FragmentProxyType.NATIVE) {
            hav.d(c9x.TAG, "已经降级到Native了，无需再次触发");
            return false;
        }
        j2e j2eVar = this.g;
        if (j2eVar != null) {
            j2eVar.a();
        }
        this.j.post(new b(str));
        return true;
    }
}
