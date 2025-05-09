package com.alibaba.triver.triver_shop.newShop.view;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.alibaba.triver.triver_shop.newShop.data.NativeShopRenderContainerType;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.mop;
import tb.npp;
import tb.r54;
import tb.t2o;
import tb.ups;
import tb.wpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class BaseShopContentRender implements wpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ups f3111a;
    public boolean b;
    public final ShopDataParser c;
    public final FragmentActivity d;
    public final a e;
    public final BaseShopContentRender$acLifecycle$1 f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements ComponentCallbacks2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            } else {
                ckf.g(configuration, "newConfig");
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            } else {
                BaseShopContentRender.this.u();
            }
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            } else if (i == 10 || i == 15) {
                BaseShopContentRender.this.u();
            }
        }
    }

    static {
        t2o.a(766509604);
        t2o.a(766509633);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender$acLifecycle$1] */
    public BaseShopContentRender(Context context, ups upsVar) {
        ckf.g(context, "context");
        ckf.g(upsVar, "tabBarItemDataModel");
        this.f3111a = upsVar;
        this.c = upsVar.o();
        this.d = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        this.e = new a();
        this.f = new LifecycleObserver() { // from class: com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender$acLifecycle$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroyed() {
                Lifecycle lifecycle;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bf354a81", new Object[]{this});
                    return;
                }
                FragmentActivity m = BaseShopContentRender.m(BaseShopContentRender.this);
                if (m != null && (lifecycle = m.getLifecycle()) != null) {
                    lifecycle.removeObserver(this);
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            public final void onStop() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                } else {
                    BaseShopContentRender.this.u();
                }
            }
        };
        q();
        p();
    }

    public static final /* synthetic */ FragmentActivity m(BaseShopContentRender baseShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("b1ad30c5", new Object[]{baseShopContentRender});
        }
        return baseShopContentRender.d;
    }

    public static final /* synthetic */ ups n(BaseShopContentRender baseShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ups) ipChange.ipc$dispatch("48d8f1be", new Object[]{baseShopContentRender});
        }
        return baseShopContentRender.f3111a;
    }

    @Override // tb.wpd
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c090532a", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    @Override // tb.wpd
    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        ShopDataParser shopDataParser = this.c;
        if (shopDataParser != null) {
            shopDataParser.o2(this.e);
        }
    }

    @Override // tb.wpd
    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f577597a", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    @Override // tb.wpd
    public void h(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c682d848", new Object[]{this, new Float(f)});
        } else {
            wpd.a.f(this, f);
        }
    }

    @Override // tb.wpd
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("975ab1a6", new Object[]{this})).booleanValue();
        }
        return wpd.a.e(this);
    }

    @Override // tb.wpd
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8288af", new Object[]{this});
            return;
        }
        wpd.a.c(this);
        ShopExtKt.Z(this.f3111a);
        npp.Companion.b(ckf.p("onViewSelectedByViewPager : ", this.f3111a.k()));
        String c = NativeShopRenderContainerType.Companion.c(this.f3111a.f());
        ShopDataParser o = this.f3111a.o();
        if (o != null) {
            o.Z2(mop.KEY_SHOP_INDEX_TYPE, c);
        }
        ShopDataParser o2 = this.f3111a.o();
        if (o2 != null) {
            o2.Y2(ckf.p(this.f3111a.k(), "_containerType"), c);
        }
        q();
    }

    @Override // tb.wpd
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345056d6", new Object[]{this});
        } else {
            wpd.a.d(this);
        }
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbd89bae", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.wpd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            wpd.a.a(this);
        }
    }

    @Override // tb.wpd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            wpd.a.b(this);
        }
    }

    public final void p() {
        ShopDataParser.h g1;
        FragmentActivity fragmentActivity;
        Lifecycle lifecycle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cdfd277", new Object[]{this});
            return;
        }
        ShopDataParser shopDataParser = this.c;
        if (shopDataParser != null && (g1 = shopDataParser.g1()) != null && g1.f() && (fragmentActivity = this.d) != null && (lifecycle = fragmentActivity.getLifecycle()) != null) {
            lifecycle.addObserver(this.f);
        }
    }

    public final void q() {
        ShopDataParser.h g1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209a989d", new Object[]{this});
            return;
        }
        ShopDataParser shopDataParser = this.c;
        if (shopDataParser != null && (g1 = shopDataParser.g1()) != null && g1.e()) {
            this.c.n2(this.e);
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1399d3ea", new Object[]{this});
            return;
        }
        ShopDataParser o = this.f3111a.o();
        if (o != null) {
            o.X2(ckf.p(this.f3111a.k(), "_appEnd"));
        }
    }

    public final void s(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60ec5d46", new Object[]{this, obj});
            return;
        }
        ShopDataParser o = this.f3111a.o();
        if (o != null) {
            o.Y2(ckf.p(this.f3111a.k(), "_appEnd"), obj);
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae377631", new Object[]{this});
            return;
        }
        ShopDataParser o = this.f3111a.o();
        if (o != null) {
            o.X2(ckf.p(this.f3111a.k(), "_appStart"));
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c01a24", new Object[]{this});
        } else if (o()) {
            r54.C(new BaseShopContentRender$tryToRecycle$1(this));
        }
    }
}
