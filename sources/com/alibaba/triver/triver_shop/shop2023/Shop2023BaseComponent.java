package com.alibaba.triver.triver_shop.shop2023;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aqp;
import tb.ckf;
import tb.kew;
import tb.mop;
import tb.r54;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Shop2023BaseComponent extends BaseContentComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final float J = 1.0f;
    public final LifecycleObserver K = new LifecycleObserver() { // from class: com.alibaba.triver.triver_shop.shop2023.Shop2023BaseComponent$lifecycleObserver$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPaused() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c47335f4", new Object[]{this});
            } else {
                Shop2023BaseComponent.W0(Shop2023BaseComponent.this);
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResumed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17fe877f", new Object[]{this});
                return;
            }
            Shop2023BaseComponent.Y0(Shop2023BaseComponent.this);
            Shop2023BaseComponent.X0(Shop2023BaseComponent.this);
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                Shop2023BaseComponent.this.X();
            }
        }
    }

    static {
        t2o.a(766510269);
    }

    public static final /* synthetic */ void W0(Shop2023BaseComponent shop2023BaseComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96df8779", new Object[]{shop2023BaseComponent});
        } else {
            shop2023BaseComponent.T();
        }
    }

    public static final /* synthetic */ void X0(Shop2023BaseComponent shop2023BaseComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85fc1a", new Object[]{shop2023BaseComponent});
        } else {
            shop2023BaseComponent.U();
        }
    }

    public static final /* synthetic */ void Y0(Shop2023BaseComponent shop2023BaseComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7595f9b0", new Object[]{shop2023BaseComponent});
        } else {
            shop2023BaseComponent.b0();
        }
    }

    public static /* synthetic */ Object ipc$super(Shop2023BaseComponent shop2023BaseComponent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Shop2023BaseComponent");
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public LifecycleObserver C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LifecycleObserver) ipChange.ipc$dispatch("aae145f", new Object[]{this});
        }
        return this.K;
    }

    public final float Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c8d32be", new Object[]{this})).floatValue();
        }
        return this.J;
    }

    public int a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4731263", new Object[]{this})).intValue();
        }
        return 0;
    }

    public final void b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("582beedb", new Object[]{this});
            return;
        }
        J().w0().h(new Shop2023BaseComponent$initLiveEventProcessor$1(this));
        J().w0().k(new Shop2023BaseComponent$initLiveEventProcessor$2(this));
        J().w0().l(new Shop2023BaseComponent$initLiveEventProcessor$3(this));
        J().w0().i(new Shop2023BaseComponent$initLiveEventProcessor$4(this));
    }

    public final void c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56821c3", new Object[]{this});
            return;
        }
        J().G2(new Shop2023BaseComponent$initShopViewContextFunction$1(this));
        J().m1().A(H());
        J().m1().q(new a());
        J().m1().r(new Shop2023BaseComponent$initShopViewContextFunction$3(this));
        J().m1().y(new Shop2023BaseComponent$initShopViewContextFunction$4(this));
        J().m1().w(new Shop2023BaseComponent$initShopViewContextFunction$5(this));
        g0(J().m1().a());
        J().m1().z(new Shop2023BaseComponent$initShopViewContextFunction$6(this));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void N(FragmentActivity fragmentActivity, ShopDataParser shopDataParser, ShopDXEngine shopDXEngine) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8670aafd", new Object[]{this, fragmentActivity, shopDataParser, shopDXEngine});
            return;
        }
        ckf.g(fragmentActivity, "context");
        ckf.g(shopDataParser, "shopData");
        ckf.g(shopDXEngine, "shopDXEngine");
        k0(fragmentActivity);
        I0(shopDataParser);
        G0(shopDXEngine);
        F0(new FrameLayout(fragmentActivity));
        kew.T(H());
        s0(shopDataParser.z1());
        o0(shopDataParser.d0());
        p0(shopDataParser.f0());
        shopDataParser.Y2(mop.KEY_TAB_KEY_NAME, shopDataParser.S(s(), t()));
        c1();
        q0(shopDataParser.j(s(), t()));
        if (u() != 0) {
            A0(true);
        }
        L0(kew.y(fragmentActivity));
        z0(new View(fragmentActivity));
        long j = s() == 0 ? 1000L : 0L;
        aqp.a aVar = aqp.Companion;
        if (aVar.O()) {
            j = aVar.L0();
        }
        r54.E(new Shop2023BaseComponent$initComponent$1(fragmentActivity, shopDataParser), j);
        n0(r54.m(fragmentActivity).heightPixels);
        String x0 = shopDataParser.x0();
        if (x0 == null || x0.length() <= 0) {
            z = false;
        }
        y0(z);
        E0(shopDataParser.d2());
        b1();
    }
}
