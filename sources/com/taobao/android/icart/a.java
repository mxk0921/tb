package com.taobao.android.icart;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.BaseICartFragment;
import com.taobao.android.icart.BaseICartFragmentProxy;
import com.taobao.android.icart.engine.CartVEngine;
import com.taobao.android.icart.engine.CartVEngineFactory;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import tb.c21;
import tb.c9x;
import tb.ei8;
import tb.f8e;
import tb.hav;
import tb.hc3;
import tb.ic3;
import tb.juv;
import tb.kmb;
import tb.la3;
import tb.na3;
import tb.pav;
import tb.qb3;
import tb.rb3;
import tb.sb3;
import tb.t2o;
import tb.u8l;
import tb.ub3;
import tb.uc3;
import tb.vav;
import tb.y9a;
import tb.zc3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a extends BaseICartFragmentProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UltronICartFragment";
    public static boolean f = false;
    public f8e d;
    public final String e;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.icart.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class RunnableC0424a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0424a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                long j = a.this.c().getLong(y9a.CLICK_STAGE) - c21.g().getLong("startProcessSystemClockTime", -1L);
                kmb g = a.E(a.this).g();
                juv.d(g, "Page_ShoppingCart_MainTabCartLoad", "appLaunch2MainCartTabLoad=" + j);
            } catch (Exception e) {
                ei8.a("getApmStartCartDurationError", e);
            }
        }
    }

    static {
        t2o.a(478150664);
        qb3.a();
    }

    public a(BaseICartFragment baseICartFragment) {
        super(baseICartFragment);
        ub3.m("TouchDownPerf", "提前时间", true, 0.01f, null);
        hav.d(c9x.CART_BIZ_NAME, "Cart:导航阶段");
        System.currentTimeMillis();
        Context context = TBMainHost.b().getContext();
        if (context instanceof Activity) {
            CartVEngineFactory.doPreRequest((Activity) context, true, "click");
        }
        String andResetInstanceId = CartVEngineFactory.getAndResetInstanceId();
        this.e = andResetInstanceId == null ? na3.a() : andResetInstanceId;
        f = true;
        if (ic3.c() && !CartVEngineFactory.isPrefetchSuccess()) {
            uc3.e(context == null ? Globals.getApplication() : context);
        }
    }

    public static /* synthetic */ f8e E(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8e) ipChange.ipc$dispatch("a51f85f1", new Object[]{aVar});
        }
        return aVar.d;
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcb0a079", new Object[0])).booleanValue();
        }
        return f;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.v((Bundle) objArr[0]);
                return null;
            case -1542694236:
                super.y();
                return null;
            case -1504501726:
                super.o();
                return null;
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
            case 1270686685:
                super.q();
                return null;
            case 1950489833:
                super.A();
                return null;
            case 2133689546:
                super.w();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/NativeFragmentProxyImpl");
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
        if (u8l.q("SupportLifecycle", true)) {
            this.d.onVisible();
        }
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void B(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        hav.g(c9x.CART_BIZ_NAME, TAG, "#onViewCreated");
        this.d.onViewCreated(view, bundle);
    }

    public final f8e F() {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8e) ipChange.ipc$dispatch("a7ab2142", new Object[]{this});
        }
        CartVEngine cartVEngine = null;
        try {
            if (TBMainHost.b().getContext() == b()) {
                f8e cartVEngine2 = CartVEngineFactory.getCartVEngine(b());
                if (cartVEngine2 == null) {
                    CartVEngineFactory.updatePrefetchObjResult();
                    cartVEngine = new CartVEngine(b(), this.e);
                    try {
                        CartVEngineFactory.putCartVEngine(cartVEngine);
                        cartVEngine2 = cartVEngine;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cartVEngine != null) {
                            cartVEngine.setInstanceId(this.e);
                        }
                        throw th;
                    }
                } else {
                    hav.d(c9x.CART_BIZ_NAME, "是否命中预热Engine:" + cartVEngine2.c());
                }
                cartVEngine2.setInstanceId(this.e);
                return cartVEngine2;
            }
            CartVEngine cartVEngine3 = new CartVEngine(b(), this.e);
            cartVEngine3.setInstanceId(this.e);
            return cartVEngine3;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void H(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221cff6b", new Object[]{this, bundle});
        } else if (TBMainHost.b().getContext() == b() && bundle == null) {
            pav.k(new RunnableC0424a());
        }
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public BaseICartFragmentProxy f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseICartFragmentProxy) ipChange.ipc$dispatch("1fb65f58", new Object[]{this});
        }
        return BaseICartFragment.b.c(this.f7942a);
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public BaseICartFragmentProxy.FragmentProxyType h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseICartFragmentProxy.FragmentProxyType) ipChange.ipc$dispatch("872b3ae7", new Object[]{this});
        }
        return BaseICartFragmentProxy.FragmentProxyType.NATIVE;
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        f8e f8eVar = this.d;
        if (f8eVar != null) {
            return f8eVar.getUTPageName();
        }
        return "";
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void k(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e52feba", new Object[]{this, loginAction});
            return;
        }
        hav.g(c9x.CART_BIZ_NAME, TAG, "登录态变化,", loginAction.name());
        f8e f8eVar = this.d;
        if (f8eVar != null) {
            f8eVar.i(loginAction);
        }
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void l(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.d.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public View n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        return this.d.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.o();
        hav.g(c9x.CART_BIZ_NAME, TAG, "#onDestroy");
        this.d.onDestroy();
        rb3.d(this.d.g().O());
        la3.b(d(), UltronTradeHybridStage.ON_CONTAINER_DESTROY);
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.p();
        this.d.onDestroyView();
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        super.q();
        if (vav.a(c9x.CART_BIZ_NAME, "clearMemoCacheOnLowMemo", true)) {
            sb3.h();
        }
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void r(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        } else {
            this.d.onNewIntent(intent);
        }
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public boolean s(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        f8e f8eVar = this.d;
        if (f8eVar == null || !f8eVar.f(i, keyEvent)) {
            return super.s(i, keyEvent);
        }
        return true;
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        hav.g(c9x.CART_BIZ_NAME, TAG, "#onPause");
        super.t();
        this.d.onPause();
        la3.b(d(), UltronTradeHybridStage.ON_CONTAINER_PAUSE);
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("150393c1", new Object[]{this, new Boolean(z)});
            return;
        }
        hav.g(c9x.CART_BIZ_NAME, TAG, "#onResume");
        super.u(z);
        this.d.onResume();
        la3.b(d(), UltronTradeHybridStage.ON_CONTAINER_RESUME);
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void v(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.v(bundle);
        zc3.b(bundle, this.d);
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.w();
        this.d.onStart();
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        hav.g(c9x.CART_BIZ_NAME, TAG, "#onStop");
        super.x();
        this.d.onStop();
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40c5aa4", new Object[]{this});
            return;
        }
        super.y();
        if (u8l.q("SupportLifecycle", true)) {
            this.d.h();
        }
    }

    @Override // com.taobao.android.icart.BaseICartFragmentProxy
    public void m(Bundle bundle) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        hav.g(c9x.CART_BIZ_NAME, TAG, "#onCreate,是否是主Tab：", String.valueOf(TBMainHost.b().getContext() == b()));
        super.m(bundle);
        System.currentTimeMillis();
        if (bundle == null) {
            z = false;
        }
        hc3.b(this, z);
        if (this.d == null) {
            this.d = F();
        }
        rb3.b(this.d.g().O(), this.d);
        this.d.d(this.f7942a);
        this.d.onCreate(bundle);
        H(bundle);
        la3.b(d(), UltronTradeHybridStage.ON_CONTAINER_CREATE);
        if (z) {
            hav.g(c9x.CART_BIZ_NAME, TAG, "重建");
        }
        zc3.a(bundle);
    }
}
