package com.alibaba.triver.triver_shop.newShop.view.component;

import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import kotlin.Pair;
import tb.aqp;
import tb.ckf;
import tb.eqp;
import tb.iai;
import tb.kew;
import tb.khu;
import tb.mop;
import tb.npp;
import tb.r54;
import tb.t2o;
import tb.u1a;
import tb.xhv;
import tb.y1a;
import tb.zfw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BaseContentComponent implements ShopSwipeListenerLayout.a, ViewPager.OnPageChangeListener, zfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean F;
    public FrameLayout H;

    /* renamed from: a */
    public FragmentActivity f3176a;
    public ShopDataParser b;
    public ShopDXEngine c;
    public FrameLayout d;
    public View e;
    public y1a<? super Integer, ? super Integer, ? super Integer, ? super Integer, xhv> g;
    public u1a<? super Integer, ? super Boolean, xhv> h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean r;
    public long t;
    public int v;
    public boolean x;
    public boolean y;
    public boolean z;
    public final HashMap<String, BaseTemplateComponent> f = new HashMap<>();
    public boolean q = true;
    public boolean s = true;
    public final long u = 500;
    public boolean w = true;
    public boolean E = true;
    public boolean G = true;
    public final LifecycleObserver I = new LifecycleObserver() { // from class: com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent$lifecycleObserver$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
        public final void onCreated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff48d810", new Object[]{this});
            } else {
                r54.F(new BaseContentComponent$lifecycleObserver$1$onCreated$1(BaseContentComponent.this));
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPaused() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c47335f4", new Object[]{this});
            } else {
                BaseContentComponent.this.T();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResumed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17fe877f", new Object[]{this});
                return;
            }
            BaseContentComponent.this.b0();
            BaseContentComponent.this.U();
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
            BaseContentComponent.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                BaseContentComponent.this.X();
            }
        }
    }

    static {
        t2o.a(766509794);
        t2o.a(766509929);
        t2o.a(766509708);
        t2o.a(766509781);
    }

    public BaseContentComponent() {
        new Pair(0, 0);
    }

    public static final /* synthetic */ HashMap b(BaseContentComponent baseContentComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("119b1921", new Object[]{baseContentComponent});
        }
        return baseContentComponent.f;
    }

    public static /* synthetic */ void e0(BaseContentComponent baseContentComponent, BaseTemplateComponent baseTemplateComponent, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63f82b7", new Object[]{baseContentComponent, baseTemplateComponent, str, new Integer(i), obj});
        } else if (obj == null) {
            if ((i & 2) != 0) {
                str = null;
            }
            baseContentComponent.d0(baseTemplateComponent, str);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTemplateCreate");
        }
    }

    public final boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d252dd06", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public final void A0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("457efbf1", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5930181", new Object[]{this})).booleanValue();
        }
        return this.F;
    }

    public final void B0(u1a<? super Integer, ? super Boolean, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3ed787", new Object[]{this, u1aVar});
        } else {
            this.h = u1aVar;
        }
    }

    public LifecycleObserver C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LifecycleObserver) ipChange.ipc$dispatch("aae145f", new Object[]{this});
        }
        return this.I;
    }

    public final void C0(y1a<? super Integer, ? super Integer, ? super Integer, ? super Integer, xhv> y1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("558c27d3", new Object[]{this, y1aVar});
        } else {
            this.g = y1aVar;
        }
    }

    public final View D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("915fdef0", new Object[]{this});
        }
        View view = this.e;
        if (view != null) {
            return view;
        }
        ckf.y("maskView");
        throw null;
    }

    public final void D0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9fe86ba", new Object[]{this, new Boolean(z)});
        } else {
            this.C = z;
        }
    }

    public final boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66e2703b", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public final void E0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dbacd5d", new Object[]{this, new Boolean(z)});
        }
    }

    public final y1a<Integer, Integer, Integer, Integer, xhv> F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y1a) ipChange.ipc$dispatch("b041aabd", new Object[]{this});
        }
        return this.g;
    }

    public final void F0(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c522c38", new Object[]{this, frameLayout});
            return;
        }
        ckf.g(frameLayout, "<set-?>");
        this.d = frameLayout;
    }

    public eqp G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eqp) ipChange.ipc$dispatch("6aaaf133", new Object[]{this});
        }
        return null;
    }

    public final void G0(ShopDXEngine shopDXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f190731", new Object[]{this, shopDXEngine});
            return;
        }
        ckf.g(shopDXEngine, "<set-?>");
        this.c = shopDXEngine;
    }

    public final FrameLayout H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("30af2510", new Object[]{this});
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("rootLayout");
        throw null;
    }

    public final ShopDXEngine I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDXEngine) ipChange.ipc$dispatch("3739581f", new Object[]{this});
        }
        ShopDXEngine shopDXEngine = this.c;
        if (shopDXEngine != null) {
            return shopDXEngine;
        }
        ckf.y("shopDXEngine");
        throw null;
    }

    public final void I0(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37976b35", new Object[]{this, shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "<set-?>");
        this.b = shopDataParser;
    }

    public final ShopDataParser J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("16b01ba5", new Object[]{this});
        }
        ShopDataParser shopDataParser = this.b;
        if (shopDataParser != null) {
            return shopDataParser;
        }
        ckf.y("shopData");
        throw null;
    }

    public final void J0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("208e3782", new Object[]{this, new Boolean(z)});
        } else {
            this.G = z;
        }
    }

    public View K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("11ec5a7a", new Object[]{this});
        }
        return H();
    }

    public final int L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d074ed26", new Object[]{this})).intValue();
        }
        return this.o;
    }

    public final void L0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d554ae3c", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d614d5", new Object[]{this});
        } else {
            kew.B(D());
        }
    }

    public void M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d360ee", new Object[]{this});
            return;
        }
        ViewPager m = m();
        if (m != null) {
            m.setCurrentItem(m.getCurrentItem() + 1, true);
        }
    }

    public void N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36542208", new Object[]{this});
            return;
        }
        ViewPager m = m();
        if (m != null) {
            m.getCurrentItem();
            m.setCurrentItem(m.getCurrentItem() - 1, true);
        }
    }

    public final boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb4e86ef", new Object[]{this})).booleanValue();
        }
        if (this.m == 0) {
            return true;
        }
        return false;
    }

    public void O0(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e0f8b4d", new Object[]{this, new Integer(i), new Integer(i2), str});
        } else {
            ckf.g(str, "targetTabName");
        }
    }

    public final boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9531368", new Object[]{this})).booleanValue();
        }
        return this.D;
    }

    public final void P0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e47ff4", new Object[]{this, str});
            return;
        }
        ckf.g(str, "direction");
        if (ckf.b(str, "pre")) {
            N0();
        } else if (ckf.b(str, "next")) {
            M0();
        }
    }

    public final boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2cbc626", new Object[]{this})).booleanValue();
        }
        return this.C;
    }

    public void Q0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8c47cb", new Object[]{this, new Boolean(z)});
        }
    }

    public boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46691468", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void R0(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a25e", new Object[]{this, str, jSONObject});
        } else if (str != null && jSONObject != null) {
            r54.C(new BaseContentComponent$updateDXTemplateData$1(this, str, jSONObject));
        }
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4c47713", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void S0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a50f479", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
        }
    }

    public void T0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39a87a0", new Object[]{this, new Boolean(z)});
        }
    }

    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        }
    }

    public void U0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fb09c29", new Object[]{this, new Boolean(z)});
        }
    }

    public void V(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebe9736", new Object[]{this, configuration});
        } else {
            ckf.g(configuration, "newConfig");
        }
    }

    public void V0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec1c35e6", new Object[]{this, new Boolean(z)});
        }
    }

    public void W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58479d3a", new Object[]{this, str});
        } else {
            ckf.g(str, "tabName");
        }
    }

    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288626bd", new Object[]{this});
        }
    }

    public final void Y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40014cf2", new Object[]{this, new Integer(i)});
        } else if (i != 0) {
            if (i < 0) {
                u1a<? super Integer, ? super Boolean, xhv> u1aVar = this.h;
                if (u1aVar != null) {
                    u1aVar.invoke(Integer.valueOf(kew.O(Integer.valueOf(i))), Boolean.FALSE);
                    return;
                }
                return;
            }
            u1a<? super Integer, ? super Boolean, xhv> u1aVar2 = this.h;
            if (u1aVar2 != null) {
                u1aVar2.invoke(Integer.valueOf(kew.O(Integer.valueOf(i))), Boolean.TRUE);
            }
        }
    }

    public void Z(View view, MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e83a4696", new Object[]{this, view, motionEvent, new Integer(i)});
            return;
        }
        ckf.g(view, "fromTargetView");
        ckf.g(motionEvent, "event");
    }

    @Override // tb.zfw
    public void a(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bf4b1c", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            ckf.g(view, "view");
        }
    }

    public void a0(View view, MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1d4d88f", new Object[]{this, view, motionEvent, new Integer(i)});
            return;
        }
        ckf.g(view, "fromTargetView");
        ckf.g(motionEvent, "event");
    }

    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4498028c", new Object[]{this});
        } else {
            r54.C(new BaseContentComponent$onStatusBarStyleChanged$1(this));
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad7d9eea", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void c0(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcf8e1a", new Object[]{this, new Boolean(z), jSONObject});
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e48ca8d2", new Object[]{this})).booleanValue();
        }
        if (this.p || this.r || this.C) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.t < this.u) {
            return false;
        }
        this.t = currentTimeMillis;
        return this.s;
    }

    public final void d0(BaseTemplateComponent baseTemplateComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b5d064", new Object[]{this, baseTemplateComponent, str});
        } else if (baseTemplateComponent != null) {
            if (baseTemplateComponent instanceof Shop2023BaseTemplateComponent) {
                this.f.put(((Shop2023BaseTemplateComponent) baseTemplateComponent).D().getName(), baseTemplateComponent);
                return;
            }
            HashMap<String, BaseTemplateComponent> hashMap = this.f;
            if (str != null) {
                hashMap.put(str, baseTemplateComponent);
            }
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57378b2a", new Object[]{this});
        } else if (!this.E) {
            khu.a(n(), true);
            this.E = true;
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c0c210", new Object[]{this});
        } else if (this.E) {
            khu.a(n(), false);
            this.E = false;
        }
    }

    public void f0(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6cad4c", new Object[]{this, str, jSONObject});
            return;
        }
        npp.a aVar = npp.Companion;
        aVar.a("refreshDXWidget widgetName:" + ((Object) str) + ", refreshData:" + jSONObject + ' ');
        R0(str, jSONObject);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public final void g0(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2e27f5", new Object[]{this, frameLayout});
            return;
        }
        ckf.g(frameLayout, "<set-?>");
        this.H = frameLayout;
    }

    public final boolean h() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("661e7265", new Object[]{this})).booleanValue();
        }
        DisplayMetrics m = r54.m(n());
        int i2 = m.heightPixels;
        if (i2 == 0 || (i = m.widthPixels) == 0) {
            return true;
        }
        float f = i2 / i;
        npp.Companion.b(ckf.p("current window ratio : ", Float.valueOf(f)));
        if (f >= 1.94d) {
            return true;
        }
        return false;
    }

    public void h0(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48eb2f9", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
        } else {
            r54.C(new BaseContentComponent$setAllItemCountIconVisibleFunction$1(z, this, i, i2));
        }
    }

    public final FrameLayout i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("1945951b", new Object[]{this});
        }
        FrameLayout frameLayout = this.H;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("allItemCountIconContainer");
        throw null;
    }

    public final void i0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c9f4391", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34477d33", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public final void j0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("537dc004", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ce96e15", new Object[]{this})).intValue();
        }
        return 0;
    }

    public final void k0(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f6a45d", new Object[]{this, fragmentActivity});
            return;
        }
        ckf.g(fragmentActivity, "<set-?>");
        this.f3176a = fragmentActivity;
    }

    public final int l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dadd6488", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = this.v;
        if (i2 == 0) {
            return i;
        }
        if (this.w) {
            return i;
        }
        return iai.c(i2 * 0.75d);
    }

    public final void l0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e214432c", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    public ViewPager m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("8aa45209", new Object[]{this});
        }
        return null;
    }

    public final void m0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90cb73e1", new Object[]{this, new Integer(i)});
        } else {
            this.n = i;
        }
    }

    public final FragmentActivity n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("28f6ec3f", new Object[]{this});
        }
        FragmentActivity fragmentActivity = this.f3176a;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        ckf.y("context");
        throw null;
    }

    public final void n0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bdbe28e", new Object[]{this, new Integer(i)});
        } else {
            this.v = i;
        }
    }

    public final int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd496a9e", new Object[]{this})).intValue();
        }
        return this.m;
    }

    public final void o0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37fa41e3", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            this.p = true;
        } else {
            this.p = false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeCancel(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5770811", new Object[]{this, motionEvent});
        } else {
            ShopSwipeListenerLayout.a.C0102a.b(this, motionEvent);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54535e4", new Object[]{this});
        } else {
            ShopSwipeListenerLayout.a.C0102a.c(this);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4624ae1d", new Object[]{this});
        } else {
            ShopSwipeListenerLayout.a.C0102a.e(this);
        }
    }

    public final int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue();
        }
        return this.n;
    }

    public final void p0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b415f35c", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56939d3b", new Object[]{this})).booleanValue();
        }
        return this.G;
    }

    public final void q0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3912ee3a", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41ecbf3a", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public final void r0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13692bf5", new Object[]{this, new Boolean(z)});
        } else {
            this.x = z;
        }
    }

    public final int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1cda607", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public final void s0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76fd9af6", new Object[]{this, new Boolean(z)});
        } else {
            this.B = z;
        }
    }

    public final int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfe68406", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public final void t0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1efaae4", new Object[]{this, new Boolean(z)});
        } else {
            this.A = z;
        }
    }

    public final int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2575dc68", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public final void u0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dcaf03e", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c50cf6b7", new Object[]{this})).booleanValue();
        }
        return this.x;
    }

    public final void v0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca8db6a", new Object[]{this, new Boolean(z)});
        } else {
            this.z = z;
        }
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("339e2396", new Object[]{this})).booleanValue();
        }
        return this.B;
    }

    public final void w0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace0936b", new Object[]{this, new Boolean(z)});
        } else {
            this.F = z;
        }
    }

    public final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd7d6d80", new Object[]{this})).booleanValue();
        }
        return this.A;
    }

    public final void x0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858d821c", new Object[]{this, new Integer(i)});
        }
    }

    public final boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e85eade6", new Object[]{this})).booleanValue();
        }
        return this.y;
    }

    public final void y0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4460e1b8", new Object[]{this, new Boolean(z)});
        } else {
            this.D = z;
        }
    }

    public final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29b23da2", new Object[]{this})).booleanValue();
        }
        return this.z;
    }

    public final void z0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa837958", new Object[]{this, view});
            return;
        }
        ckf.g(view, "<set-?>");
        this.e = view;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown(View view, MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74251660", new Object[]{this, view, motionEvent, new Integer(i)});
            return;
        }
        ckf.g(view, "fromTargetView");
        ckf.g(motionEvent, "event");
        ShopSwipeListenerLayout.a.C0102a.d(this, view, motionEvent, i);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeUp(View view, MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e512d9", new Object[]{this, view, motionEvent, new Integer(i)});
            return;
        }
        ckf.g(view, "fromTargetView");
        ckf.g(motionEvent, "event");
        ShopSwipeListenerLayout.a.C0102a.f(this, view, motionEvent, i);
    }

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
        this.B = shopDataParser.z1();
        this.i = shopDataParser.d0();
        this.j = shopDataParser.f0();
        g0(shopDataParser.m1().a());
        shopDataParser.m1().A(H());
        shopDataParser.Y2(mop.KEY_TAB_KEY_NAME, shopDataParser.S(this.i, this.j));
        shopDataParser.m1().q(new a());
        shopDataParser.m1().y(new BaseContentComponent$initComponent$2(this));
        shopDataParser.m1().w(new BaseContentComponent$initComponent$3(this));
        shopDataParser.m1().z(new BaseContentComponent$initComponent$4(this));
        int j = shopDataParser.j(this.i, this.j);
        this.k = j;
        if (j != 0) {
            this.l = true;
        }
        this.o = kew.y(fragmentActivity);
        z0(new View(fragmentActivity));
        long j2 = this.i == 0 ? 1000L : 0L;
        aqp.a aVar = aqp.Companion;
        if (aVar.O()) {
            j2 = aVar.L0();
        }
        r54.E(new BaseContentComponent$initComponent$5(fragmentActivity, shopDataParser), j2);
        this.w = h();
        this.v = r54.m(fragmentActivity).heightPixels;
        String x0 = shopDataParser.x0();
        if (x0 == null || x0.length() <= 0) {
            z = false;
        }
        this.D = z;
        shopDataParser.d2();
        shopDataParser.w0().h(new BaseContentComponent$initComponent$6(this));
        shopDataParser.w0().k(new BaseContentComponent$initComponent$7(this));
        shopDataParser.w0().l(new BaseContentComponent$initComponent$8(this));
        shopDataParser.w0().i(new BaseContentComponent$initComponent$9(this));
    }
}
