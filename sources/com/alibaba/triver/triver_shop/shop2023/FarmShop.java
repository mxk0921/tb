package com.alibaba.triver.triver_shop.shop2023;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.EmbedSecondFloorView;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopNewLiveLoftView;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.view.ShopOptSwipeLayout;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.alibaba.triver.triver_shop.newShop.view.Tab3LiveContentRender;
import com.alibaba.triver.triver_shop.newShop.view.adapter.ShopContainerPageAdapter;
import com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023PullDownHelper;
import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023TopNavBarNativeComponent;
import com.alibaba.triver.triver_shop.shop2023.nativeview.ShopFarmTopNavBarNativeComponent;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderInfoTemplate;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderTagListTemplate;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.extend.utils.DisplayUtil;
import java.util.Map;
import tb.a1v;
import tb.aop;
import tb.aqp;
import tb.bdw;
import tb.brf;
import tb.c8c;
import tb.ckf;
import tb.cnp;
import tb.dop;
import tb.enp;
import tb.fnp;
import tb.g1a;
import tb.gnp;
import tb.hnp;
import tb.ic1;
import tb.inp;
import tb.jnp;
import tb.jpu;
import tb.kew;
import tb.khu;
import tb.knp;
import tb.lnp;
import tb.ltt;
import tb.mop;
import tb.nop;
import tb.npp;
import tb.o09;
import tb.p09;
import tb.q09;
import tb.r09;
import tb.r54;
import tb.s09;
import tb.spp;
import tb.ssq;
import tb.t09;
import tb.t2o;
import tb.ups;
import tb.v09;
import tb.v44;
import tb.vpd;
import tb.xhv;
import tb.xpd;
import tb.y1a;
import tb.znp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FarmShop extends Shop2023BaseComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ViewGroup A0;
    public inp B0;
    public Shop2023TopNavBarNativeComponent C0;
    public Shop2023PullDownHelper D0;
    public knp E0;
    public boolean G0;
    public v44 H0;
    public v44 I0;
    public lnp J0;
    public LinearLayout K0;
    public FrameLayout L;
    public Boolean L0;
    public FrameLayout M;
    public boolean M0;
    public EnhancedViewPager N;
    public ShopOptSwipeLayout O;
    public FrameLayout P;
    public FrameLayout Q;
    public ViewGroup R;
    public Tab3LiveContentRender S;
    public FrameLayout T;
    public ShopContainerPageAdapter U;
    public TUrlImageView V;
    public View W;
    public View X;
    public View Y;
    public boolean Z;
    public boolean a0;
    public boolean c0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public int n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public int r0;
    public aop s0;
    public EmbedShopLoftComponent t0;
    public Shop2023HeaderInfoTemplate u0;
    public jnp v0;
    public gnp w0;
    public Shop2023HeaderTagListTemplate x0;
    public int z0;
    public boolean b0 = true;
    public final dop d0 = new dop(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    public final enp e0 = new enp(0, 0, false, 7, null);
    public final dop f0 = new dop(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    public final dop g0 = new dop(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    public final int y0 = 3;
    public boolean F0 = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FarmShop f3289a;

        static {
            t2o.a(766510210);
        }

        public a(FarmShop farmShop) {
            ckf.g(farmShop, "this$0");
            this.f3289a = farmShop;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FarmShop$AnimatorListener");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            FarmShop.A1(this.f3289a, true);
            ShopOptSwipeLayout q1 = FarmShop.q1(this.f3289a);
            if (q1 != null) {
                q1.forceInterceptAllTouchEvent(true);
            } else {
                ckf.y("outerSwiperLayout");
                throw null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            npp.Companion.b("onAnimationEnd");
            FarmShop.g1(this.f3289a);
            FarmShop.A1(this.f3289a, false);
            this.f3289a.M();
            ShopOptSwipeLayout q1 = FarmShop.q1(this.f3289a);
            if (q1 != null) {
                q1.forceInterceptAllTouchEvent(false);
                EnhancedViewPager h1 = FarmShop.h1(this.f3289a);
                if (h1 != null) {
                    h1.setCanDispatchToChild(true);
                    EnhancedViewPager h12 = FarmShop.h1(this.f3289a);
                    if (h12 != null) {
                        h12.setCanScroll(true);
                    } else {
                        ckf.y("contentViewPager");
                        throw null;
                    }
                } else {
                    ckf.y("contentViewPager");
                    throw null;
                }
            } else {
                ckf.y("outerSwiperLayout");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                FarmShop.this.X();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (FarmShop.this.c()) {
                FarmShop.i1(FarmShop.this).finish();
            }
        }
    }

    static {
        t2o.a(766510209);
    }

    public static final /* synthetic */ void A1(FarmShop farmShop, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e40560", new Object[]{farmShop, new Boolean(z)});
        } else {
            farmShop.i0(z);
        }
    }

    public static /* synthetic */ void A2(FarmShop farmShop, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17aed6ea", new Object[]{farmShop, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        farmShop.z2(z);
    }

    public static final /* synthetic */ void B1(FarmShop farmShop, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5131895", new Object[]{farmShop, new Integer(i)});
        } else {
            farmShop.k0 = i;
        }
    }

    public static final /* synthetic */ void C1(FarmShop farmShop, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96f64fc", new Object[]{farmShop, new Integer(i)});
        } else {
            farmShop.j0 = i;
        }
    }

    public static final /* synthetic */ void D1(FarmShop farmShop, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd9aa31", new Object[]{farmShop, new Integer(i)});
        } else {
            farmShop.h0 = i;
        }
    }

    public static final /* synthetic */ void F1(FarmShop farmShop, int i, boolean z, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43c33bc", new Object[]{farmShop, new Integer(i), new Boolean(z), num});
        } else {
            farmShop.u2(i, z, num);
        }
    }

    public static final /* synthetic */ void G1(FarmShop farmShop, BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300032ff", new Object[]{farmShop, baseTemplateComponent, layoutParams});
        } else {
            farmShop.w2(baseTemplateComponent, layoutParams);
        }
    }

    public static /* synthetic */ void L1(FarmShop farmShop, float f, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12df8ee", new Object[]{farmShop, new Float(f), new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            f = Math.abs(farmShop.j0);
        }
        farmShop.J1(f);
    }

    public static final /* synthetic */ void d1(FarmShop farmShop, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aea848e", new Object[]{farmShop, new Float(f)});
        } else {
            farmShop.J1(f);
        }
    }

    public static final /* synthetic */ void e1(FarmShop farmShop, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb2ac", new Object[]{farmShop, new Boolean(z)});
        } else {
            farmShop.M1(z);
        }
    }

    public static final /* synthetic */ boolean f1(FarmShop farmShop, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bafde6fb", new Object[]{farmShop, new Boolean(z)})).booleanValue();
        }
        return farmShop.P1(z);
    }

    public static final /* synthetic */ void g1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81b2fc6d", new Object[]{farmShop});
        } else {
            farmShop.T1();
        }
    }

    public static final /* synthetic */ EnhancedViewPager h1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnhancedViewPager) ipChange.ipc$dispatch("9460f18a", new Object[]{farmShop});
        }
        return farmShop.N;
    }

    public static final /* synthetic */ FragmentActivity i1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("7b21840e", new Object[]{farmShop});
        }
        return farmShop.n();
    }

    public static /* synthetic */ Object ipc$super(FarmShop farmShop, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2039436547:
                super.N((FragmentActivity) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2]);
                return null;
            case -1983604863:
                super.g();
                return null;
            case -361976500:
                super.f0((String) objArr[0], (JSONObject) objArr[1]);
                return null;
            case 407727923:
                super.onPageSelected(((Number) objArr[0]).intValue());
                return null;
            case 474982114:
                super.U();
                return null;
            case 709948537:
                super.S0(((Boolean) objArr[0]).booleanValue());
                return null;
            case 988548963:
                super.T();
                return null;
            case 1857984310:
                super.V((Configuration) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FarmShop");
        }
    }

    public static final /* synthetic */ EmbedShopLoftComponent j1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmbedShopLoftComponent) ipChange.ipc$dispatch("8fbe6692", new Object[]{farmShop});
        }
        return farmShop.t0;
    }

    public static final /* synthetic */ boolean k1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("941c264b", new Object[]{farmShop})).booleanValue();
        }
        return farmShop.r();
    }

    public static final /* synthetic */ int l1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21527c39", new Object[]{farmShop})).intValue();
        }
        return farmShop.u();
    }

    public static final /* synthetic */ boolean m1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ad4f488", new Object[]{farmShop})).booleanValue();
        }
        return farmShop.v();
    }

    public static final /* synthetic */ inp n1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (inp) ipChange.ipc$dispatch("9cec24ed", new Object[]{farmShop});
        }
        return farmShop.B0;
    }

    public static final /* synthetic */ boolean o1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("365dfb8", new Object[]{farmShop})).booleanValue();
        }
        return farmShop.Z;
    }

    public static final /* synthetic */ FrameLayout p1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("9d418a66", new Object[]{farmShop});
        }
        return farmShop.Q;
    }

    public static final /* synthetic */ ShopOptSwipeLayout q1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopOptSwipeLayout) ipChange.ipc$dispatch("c1e5e9ea", new Object[]{farmShop});
        }
        return farmShop.O;
    }

    public static final /* synthetic */ fnp r1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnp) ipChange.ipc$dispatch("485bc15e", new Object[]{farmShop});
        }
        farmShop.getClass();
        return null;
    }

    public static final /* synthetic */ jnp s1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnp) ipChange.ipc$dispatch("1b20e3d9", new Object[]{farmShop});
        }
        return farmShop.v0;
    }

    public static final /* synthetic */ ShopDataParser t1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("e19dbdb4", new Object[]{farmShop});
        }
        return farmShop.J();
    }

    public static /* synthetic */ void t2(FarmShop farmShop, int i, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66572e80", new Object[]{farmShop, new Integer(i), new Boolean(z), new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        farmShop.s2(i, z);
    }

    public static final /* synthetic */ Shop2023HeaderInfoTemplate u1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Shop2023HeaderInfoTemplate) ipChange.ipc$dispatch("ebf30b3a", new Object[]{farmShop});
        }
        return farmShop.u0;
    }

    public static final /* synthetic */ int v1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44a40045", new Object[]{farmShop})).intValue();
        }
        return farmShop.W1();
    }

    public static /* synthetic */ void v2(FarmShop farmShop, int i, boolean z, Integer num, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55be2d00", new Object[]{farmShop, new Integer(i), new Boolean(z), num, new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        farmShop.u2(i, z, num);
    }

    public static final /* synthetic */ boolean w1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1fdbaf1", new Object[]{farmShop})).booleanValue();
        }
        return farmShop.h2();
    }

    public static final /* synthetic */ void x1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bae7cd8", new Object[]{farmShop});
        } else {
            farmShop.j2();
        }
    }

    public static final /* synthetic */ void y1(FarmShop farmShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf97f4f", new Object[]{farmShop});
        } else {
            farmShop.n2();
        }
    }

    public final void M1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4780bdd", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2023PullDownHelper shop2023PullDownHelper = this.D0;
        if (shop2023PullDownHelper != null) {
            shop2023PullDownHelper.l(z);
        }
    }

    public final void N1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a42166", new Object[]{this});
            return;
        }
        p2();
        this.j0 = 0;
        this.k0 = 0;
        S0(true);
    }

    public final boolean P1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcb4226c", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            if (r() || B()) {
                return false;
            }
        } else if (!B()) {
            return false;
        }
        lnp lnpVar = this.J0;
        if (lnpVar != null) {
            lnpVar.d(z);
        }
        w0(z);
        z2(z);
        EnhancedViewPager enhancedViewPager = this.N;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCanScroll(!z);
            return true;
        }
        ckf.y("contentViewPager");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void Q0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8c47cb", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.u0;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.K(z);
        }
        inp inpVar = this.B0;
        if (inpVar != null) {
            inpVar.T(z);
        }
        EnhancedViewPager enhancedViewPager = this.N;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCanScroll(true ^ z);
            this.p0 = z;
            return;
        }
        ckf.y("contentViewPager");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
            return;
        }
        super.T();
        Tab3LiveContentRender tab3LiveContentRender = this.S;
        if (tab3LiveContentRender != null) {
            tab3LiveContentRender.onPause();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void T0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39a87a0", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.u0;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.L(z, ShopExtKt.t(J(), z));
        }
        gnp gnpVar = this.w0;
        if (gnpVar != null) {
            gnpVar.I(ShopExtKt.t(J(), z));
        }
    }

    public final void T1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9027d45c", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.U();
        Tab3LiveContentRender tab3LiveContentRender = this.S;
        if (tab3LiveContentRender != null) {
            tab3LiveContentRender.onResume();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void U0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fb09c29", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.u0;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.N(z);
        }
        inp inpVar = this.B0;
        if (inpVar != null) {
            inpVar.s(z);
        }
        inp inpVar2 = this.B0;
        if (inpVar2 != null) {
            inpVar2.M(z);
        }
        knp knpVar = this.E0;
        if (knpVar != null) {
            knpVar.c(z);
        }
    }

    public final View U1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cb74cf6b", new Object[]{this});
        }
        ViewGroup viewGroup = this.A0;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void V(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebe9736", new Object[]{this, configuration});
            return;
        }
        ckf.g(configuration, "newConfig");
        super.V(configuration);
        kew.L(H(), new FarmShop$onConfigChanged$1(this));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void V0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec1c35e6", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.u0;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.O(z);
        }
        inp inpVar = this.B0;
        if (inpVar != null) {
            inpVar.V(z);
        }
    }

    public final int V1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("edc59cdf", new Object[]{this})).intValue();
        }
        if (O()) {
            return this.f0.c();
        }
        return this.f0.f();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58479d3a", new Object[]{this, str});
            return;
        }
        ckf.g(str, "tabName");
        if (!r()) {
            ShopOptSwipeLayout shopOptSwipeLayout = this.O;
            if (shopOptSwipeLayout == null) {
                ckf.y("outerSwiperLayout");
                throw null;
            } else if (!shopOptSwipeLayout.getAlreadyTouch()) {
                N1();
            }
        }
    }

    public final int W1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a89d5b74", new Object[]{this})).intValue();
        }
        return (V1() - L()) - this.e0.g();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288626bd", new Object[]{this});
            return;
        }
        j2();
        a1v.c(J(), "Page_Shop_Live_FloatWindow_Click", null, null, 8, null);
    }

    public final dop X1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dop) ipChange.ipc$dispatch("a8935f41", new Object[]{this});
        }
        return this.f0;
    }

    public final void Y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99482615", new Object[]{this});
        } else if (v()) {
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.u0;
            if (shop2023HeaderInfoTemplate != null) {
                shop2023HeaderInfoTemplate.I(false);
            }
            inp inpVar = this.B0;
            if (inpVar != null) {
                inpVar.s(false);
            }
            ViewGroup viewGroup = this.R;
            if (viewGroup != null) {
                kew.C(viewGroup);
                EmbedShopLoftComponent embedShopLoftComponent = this.t0;
                if (embedShopLoftComponent != null) {
                    embedShopLoftComponent.C();
                    return;
                }
                return;
            }
            ckf.y("bigCardContainer");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void Z(View view, MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e83a4696", new Object[]{this, view, motionEvent, new Integer(i)});
            return;
        }
        ckf.g(view, "fromTargetView");
        ckf.g(motionEvent, "event");
        t2(this, i, false, 2, null);
    }

    public final void Z1() {
        jnp jnpVar;
        View d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f72cb592", new Object[]{this});
        } else if (!this.c0 && (jnpVar = this.v0) != null && (d = jnpVar.d()) != null) {
            bdw.c(d, 0.0f, 200L, null, 4, null).start();
            this.c0 = true;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void a0(View view, MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1d4d88f", new Object[]{this, view, motionEvent, new Integer(i)});
            return;
        }
        ckf.g(view, "fromTargetView");
        ckf.g(motionEvent, "event");
        v2(this, i, false, null, 6, null);
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.Shop2023BaseComponent
    public int a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4731263", new Object[]{this})).intValue();
        }
        return H().getHeight();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4498028c", new Object[]{this});
        } else if (!v() || !r()) {
            e();
        } else {
            f();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad7d9eea", new Object[]{this})).booleanValue();
        }
        return S1();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void c0(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcf8e1a", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.u0;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.L(z, jSONObject);
        }
        gnp gnpVar = this.w0;
        if (gnpVar != null) {
            gnpVar.I(jSONObject);
        }
        g1a<Boolean, xhv> d = J().w0().d();
        if (d != null) {
            d.invoke(Boolean.valueOf(z));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void f0(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6cad4c", new Object[]{this, str, jSONObject});
        } else {
            super.f0(str, jSONObject);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.g();
        knp knpVar = this.E0;
        if (knpVar != null) {
            knpVar.b();
        }
        inp inpVar = this.B0;
        if (inpVar != null) {
            inpVar.p();
        }
    }

    public final boolean h2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("880b9960", new Object[]{this})).booleanValue();
        }
        if (!v()) {
            return false;
        }
        if (O() || i2()) {
            return true;
        }
        return false;
    }

    public final boolean i2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be86d20f", new Object[]{this})).booleanValue();
        }
        return ckf.b(J().u0(), "farmshop_z");
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public ViewPager m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("8aa45209", new Object[]{this});
        }
        EnhancedViewPager enhancedViewPager = this.N;
        if (enhancedViewPager != null) {
            return enhancedViewPager;
        }
        ckf.y("contentViewPager");
        throw null;
    }

    public final boolean m2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3de9080", new Object[]{this})).booleanValue();
        }
        if (!v() || !i2()) {
            return false;
        }
        return true;
    }

    public final void n2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da75e3be", new Object[]{this});
        } else {
            j2();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeCancel(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5770811", new Object[]{this, motionEvent});
            return;
        }
        ckf.g(motionEvent, "event");
        o2();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown(View view, MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74251660", new Object[]{this, view, motionEvent, new Integer(i)});
            return;
        }
        ckf.g(view, "fromTargetView");
        ckf.g(motionEvent, "event");
        Z(view, motionEvent, i);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeUp(View view, MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e512d9", new Object[]{this, view, motionEvent, new Integer(i)});
            return;
        }
        ckf.g(view, "fromTargetView");
        ckf.g(motionEvent, "event");
        a0(view, motionEvent, i);
    }

    public final void q2() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df6d57a", new Object[]{this});
        } else if (v()) {
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.u0;
            if (shop2023HeaderInfoTemplate != null) {
                shop2023HeaderInfoTemplate.I(true);
            }
            inp inpVar = this.B0;
            if (inpVar != null) {
                inpVar.s(true);
            }
            ViewGroup viewGroup = this.R;
            if (viewGroup != null) {
                aop aopVar = this.s0;
                if (aopVar != null) {
                    i = aopVar.b();
                }
                kew.e(viewGroup, i);
                ViewGroup viewGroup2 = this.R;
                if (viewGroup2 != null) {
                    kew.g0(viewGroup2);
                    EmbedShopLoftComponent embedShopLoftComponent = this.t0;
                    if (embedShopLoftComponent != null) {
                        embedShopLoftComponent.E();
                        return;
                    }
                    return;
                }
                ckf.y("bigCardContainer");
                throw null;
            }
            ckf.y("bigCardContainer");
            throw null;
        }
    }

    public final void r2() {
        jnp jnpVar;
        View d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d52a0f8d", new Object[]{this});
        } else if (this.c0 && (jnpVar = this.v0) != null && (d = jnpVar.d()) != null) {
            bdw.c(d, 1.0f, 200L, null, 4, null).start();
            this.c0 = false;
        }
    }

    public final void w2(BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9e8c2e", new Object[]{this, baseTemplateComponent, layoutParams});
            return;
        }
        int i = this.z0;
        int i2 = this.y0;
        if (i < i2) {
            int i3 = i + 1;
            this.z0 = i3;
            if (i3 >= i2) {
                H1();
            }
        }
    }

    public final void y2() {
        c8c v2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da382260", new Object[]{this});
            return;
        }
        ShopContainerPageAdapter shopContainerPageAdapter = this.U;
        if (shopContainerPageAdapter != null) {
            Fragment item = shopContainerPageAdapter.getItem(J().j(J().C(), J().p1()));
            if ((item instanceof ShopStandardFragment) && (v2 = ((ShopStandardFragment) item).v2()) != null && (v2 instanceof cnp)) {
                cnp cnpVar = (cnp) v2;
                ShopOptSwipeLayout shopOptSwipeLayout = this.O;
                if (shopOptSwipeLayout != null) {
                    cnpVar.j(shopOptSwipeLayout.getYSpeed());
                } else {
                    ckf.y("outerSwiperLayout");
                    throw null;
                }
            }
        } else {
            ckf.y("shopContainerPageAdapter");
            throw null;
        }
    }

    public final void z2(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d917ec3", new Object[]{this, new Boolean(z)});
            return;
        }
        int height = H().getHeight();
        if (height == 0) {
            height = r54.m(n()).heightPixels;
        }
        if (this.q0) {
            FrameLayout frameLayout = this.P;
            if (frameLayout != null) {
                kew.e(frameLayout, height);
            } else {
                ckf.y("centerContainer");
                throw null;
            }
        } else {
            FrameLayout frameLayout2 = this.P;
            if (frameLayout2 != null) {
                int g = (height - this.e0.g()) - L();
                if (z) {
                    i = this.f0.a();
                }
                kew.e(frameLayout2, g + i);
                return;
            }
            ckf.y("centerContainer");
            throw null;
        }
    }

    public void H1() {
        View U1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d0cb3b", new Object[]{this});
        } else if (u() == 0) {
            ShopContainerPageAdapter shopContainerPageAdapter = this.U;
            if (shopContainerPageAdapter != null) {
                shopContainerPageAdapter.i(0);
                if (v() && (U1 = U1()) != null) {
                    kew.C(U1);
                    return;
                }
                return;
            }
            ckf.y("shopContainerPageAdapter");
            throw null;
        } else {
            kew.L(H(), new FarmShop$allTemplateLoadFinish$1(this));
        }
    }

    public final void J1(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b4c473f", new Object[]{this, new Float(f)});
        } else if (!h2()) {
            float f2 = 1 - ((f / this.h0) * 1.0f);
            if (this.G0) {
                FrameLayout frameLayout = this.L;
                if (frameLayout != null) {
                    frameLayout.setAlpha(f2);
                } else {
                    ckf.y("newfarmerContainer");
                    throw null;
                }
            } else {
                View U1 = U1();
                if (U1 != null) {
                    U1.setAlpha(f2);
                }
                LinearLayout linearLayout = this.K0;
                if (linearLayout != null) {
                    linearLayout.setAlpha(f2);
                }
                View U12 = U1();
                if (U12 != null) {
                    U12.setTranslationY((-f) / 3);
                }
                LinearLayout linearLayout2 = this.K0;
                if (linearLayout2 != null) {
                    linearLayout2.setTranslationY((-f) / 3);
                }
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void O0(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e0f8b4d", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        ckf.g(str, "targetTabName");
        if (spp.c(str)) {
            j2();
            return;
        }
        int j = J().j(i, i2);
        EnhancedViewPager enhancedViewPager = this.N;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCurrentItem(j, false);
        } else {
            ckf.y("contentViewPager");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void S0(boolean z) {
        View d;
        View d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a50f479", new Object[]{this, new Boolean(z)});
            return;
        }
        npp.Companion.b(ckf.p("update expanded : ", Boolean.valueOf(z)));
        if (!ckf.b(this.L0, Boolean.valueOf(z))) {
            if (z) {
                Y(W1());
            } else {
                Y(-W1());
            }
            this.L0 = Boolean.valueOf(z);
        }
        super.S0(z);
        b0();
        if (!z) {
            Y1();
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.u0;
            if (shop2023HeaderInfoTemplate != null) {
                shop2023HeaderInfoTemplate.M(Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED);
            }
            Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate = this.x0;
            if (shop2023HeaderTagListTemplate != null) {
                shop2023HeaderTagListTemplate.J();
            }
        } else if (v()) {
            if (O() || i2()) {
                q2();
                v44 v44Var = this.H0;
                if (!(v44Var == null || (d = v44Var.d()) == null)) {
                    kew.C(d);
                }
            } else {
                v44 v44Var2 = this.H0;
                if (!(v44Var2 == null || (d2 = v44Var2.d()) == null)) {
                    kew.g0(d2);
                }
            }
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate2 = this.u0;
            if (shop2023HeaderInfoTemplate2 != null) {
                shop2023HeaderInfoTemplate2.M(Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED);
            }
            Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate2 = this.x0;
            if (shop2023HeaderTagListTemplate2 != null) {
                shop2023HeaderTagListTemplate2.J();
            }
        } else {
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate3 = this.u0;
            if (shop2023HeaderInfoTemplate3 != null) {
                shop2023HeaderInfoTemplate3.M(Shop2023HeaderInfoTemplate.HeaderStyle.DEFAULT);
            }
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate4 = this.u0;
            if (shop2023HeaderInfoTemplate4 != null) {
                shop2023HeaderInfoTemplate4.I(false);
            }
            Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate3 = this.x0;
            if (shop2023HeaderTagListTemplate3 != null) {
                shop2023HeaderTagListTemplate3.K();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a2() {
        /*
            r8 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.triver.triver_shop.shop2023.FarmShop.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0012
            java.lang.String r2 = "80545b71"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r8
            r1.ipc$dispatch(r2, r0)
            return
        L_0x0012:
            com.alibaba.triver.triver_shop.newShop.data.ShopDataParser r1 = r8.J()
            com.alibaba.triver.triver_shop.newShop.data.ShopDataParser$e r1 = r1.O0()
            tb.znp r1 = r1.c()
            int r2 = r1.a()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = tb.kew.v(r2)
            int r2 = r2 * 2
            r3 = 0
            java.lang.String r4 = r1.c()     // Catch: all -> 0x0041
            int r4 = android.graphics.Color.parseColor(r4)     // Catch: all -> 0x0041
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: all -> 0x0041
            tb.xhv r5 = tb.xhv.INSTANCE     // Catch: all -> 0x003f
            kotlin.Result.m1108constructorimpl(r5)     // Catch: all -> 0x003f
            goto L_0x004a
        L_0x003f:
            r5 = move-exception
            goto L_0x0043
        L_0x0041:
            r5 = move-exception
            r4 = r3
        L_0x0043:
            java.lang.Object r5 = kotlin.b.a(r5)
            kotlin.Result.m1108constructorimpl(r5)
        L_0x004a:
            if (r4 != 0) goto L_0x004d
            return
        L_0x004d:
            int r4 = r4.intValue()
            r8.M0 = r0
            float r0 = r1.d()
            tb.dop r5 = r8.f0
            int r5 = r5.c()
            float r5 = (float) r5
            float r0 = r0 * r5
            int r0 = (int) r0
            int r2 = r2 - r0
            android.view.View r5 = r8.X
            java.lang.String r6 = "shopBackgroundColorViewPart1"
            if (r5 == 0) goto L_0x00c1
            tb.kew.e(r5, r0)
            android.view.View r5 = r8.Y
            java.lang.String r7 = "shopBackgroundColorViewPart2"
            if (r5 == 0) goto L_0x00bd
            tb.kew.e(r5, r2)
            android.view.View r2 = r8.Y
            if (r2 == 0) goto L_0x00b9
            r2.setBackgroundColor(r4)
            android.view.View r2 = r8.Y
            if (r2 == 0) goto L_0x00b5
            tb.kew.d0(r2, r0)
            float r0 = r1.e()
            r1 = 255(0xff, float:3.57E-43)
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = (int) r0
            int r1 = android.graphics.Color.red(r4)
            int r2 = android.graphics.Color.green(r4)
            int r5 = android.graphics.Color.blue(r4)
            int r0 = android.graphics.Color.argb(r0, r1, r2, r5)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP
            int[] r0 = new int[]{r4, r0}
            r1.<init>(r2, r0)
            android.view.View r0 = r8.X
            if (r0 == 0) goto L_0x00b1
            tb.kew.S(r0, r1)
            return
        L_0x00b1:
            tb.ckf.y(r6)
            throw r3
        L_0x00b5:
            tb.ckf.y(r7)
            throw r3
        L_0x00b9:
            tb.ckf.y(r7)
            throw r3
        L_0x00bd:
            tb.ckf.y(r7)
            throw r3
        L_0x00c1:
            tb.ckf.y(r6)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.shop2023.FarmShop.a2():void");
    }

    public final void x2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47800db5", new Object[]{this});
            return;
        }
        S0(false);
        if (O()) {
            inp inpVar = this.B0;
            if (inpVar != null) {
                inpVar.m(false);
            }
        } else {
            inp inpVar2 = this.B0;
            if (inpVar2 != null) {
                inpVar2.n();
            }
        }
        int i = this.h0;
        this.j0 = i;
        this.k0 = 0 - i;
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            kew.d0(frameLayout, this.e0.g() + L());
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.u0;
            if (shop2023HeaderInfoTemplate != null) {
                shop2023HeaderInfoTemplate.M(Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED);
                return;
            }
            return;
        }
        ckf.y("navViewContainer");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.Shop2023BaseComponent, com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void N(FragmentActivity fragmentActivity, ShopDataParser shopDataParser, ShopDXEngine shopDXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8670aafd", new Object[]{this, fragmentActivity, shopDataParser, shopDXEngine});
            return;
        }
        ckf.g(fragmentActivity, "context");
        ckf.g(shopDataParser, "shopData");
        ckf.g(shopDXEngine, "shopDXEngine");
        ltt lttVar = new ltt();
        this.G0 = shopDataParser.W1();
        npp.Companion.f(ckf.p("initComponent ", shopDataParser.u0()));
        super.N(fragmentActivity, shopDataParser, shopDXEngine);
        fragmentActivity.getLifecycle().addObserver(C());
        this.F0 = shopDataParser.O0().b();
        this.b0 = s() != 0;
        shopDataParser.m1().q(new b());
        shopDataParser.D2(new FarmShop$initComponent$2(this, shopDataParser));
        shopDataParser.m1().p(new FarmShop$initComponent$3(this));
        shopDataParser.m1().u(new FarmShop$initComponent$4(this));
        shopDataParser.m1().x(new FarmShop$initComponent$5(this));
        this.n0 = ViewConfiguration.get(fragmentActivity).getScaledTouchSlop();
        khu.a(fragmentActivity, true);
        g2();
        shopDataParser.Y2(mop.KEY_INIT_SHOP_BASE_VIEW, Long.valueOf(lttVar.a()));
        lttVar.b();
        ShopOptSwipeLayout shopOptSwipeLayout = this.O;
        if (shopOptSwipeLayout != null) {
            shopOptSwipeLayout.setScrollThreshold(this.n0);
            this.E0 = new knp(this);
            f2();
            a2();
            A2(this, false, 1, null);
            shopDataParser.Y2(mop.KEY_INIT_SHOP_TEMPLATE_COMPONENT_COST, Long.valueOf(lttVar.a()));
            S0(true);
            shopDataParser.w2(this.d0.a() - this.e0.g());
            return;
        }
        ckf.y("outerSwiperLayout");
        throw null;
    }

    public final void O1(boolean z, boolean z2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f1300b", new Object[]{this, new Boolean(z), new Boolean(z2), new Integer(i), new Integer(i2)});
            return;
        }
        npp.a aVar = npp.Companion;
        aVar.b("changeOtherToOtherPage : lastTabFullScreen : " + z + " , targetTabFullScreen : " + z2);
        if (z2) {
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.setZ(0.0f);
                FrameLayout frameLayout2 = this.T;
                if (frameLayout2 != null) {
                    frameLayout2.setZ(1.0f);
                    FrameLayout frameLayout3 = this.Q;
                    if (frameLayout3 != null) {
                        kew.d0(frameLayout3, this.f0.b());
                        View U1 = U1();
                        if (U1 != null) {
                            kew.C(U1);
                        }
                        S0(false);
                        inp inpVar = this.B0;
                        if (inpVar != null) {
                            inpVar.l(r());
                        }
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                } else {
                    ckf.y("shopHeaderContainer");
                    throw null;
                }
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        } else {
            FrameLayout frameLayout4 = this.Q;
            if (frameLayout4 != null) {
                frameLayout4.setZ(0.1f);
                FrameLayout frameLayout5 = this.T;
                if (frameLayout5 != null) {
                    frameLayout5.setZ(0.0f);
                    int W1 = W1();
                    int f = this.f0.f() - W1;
                    inp inpVar2 = this.B0;
                    if (inpVar2 != null) {
                        inpVar2.J(W1);
                    }
                    View U12 = U1();
                    if (U12 != null) {
                        kew.g0(U12);
                    }
                    if (!r()) {
                        this.j0 = W1;
                        this.k0 = 0 - W1;
                        inp inpVar3 = this.B0;
                        if (inpVar3 != null) {
                            inpVar3.l(r());
                        }
                    } else if (!m2()) {
                        Y1();
                        FrameLayout frameLayout6 = this.Q;
                        if (frameLayout6 != null) {
                            int z3 = kew.z(frameLayout6) - f;
                            EnhancedViewPager enhancedViewPager = this.N;
                            if (enhancedViewPager != null) {
                                enhancedViewPager.post(new o09(z3, this, W1));
                            } else {
                                ckf.y("contentViewPager");
                                throw null;
                            }
                        } else {
                            ckf.y("navViewContainer");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("shopHeaderContainer");
                    throw null;
                }
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        }
        if (spp.c(J().S(i, i2))) {
            ShopExtKt.k0(J(), null, 2, null);
        }
        this.q0 = z2;
    }

    public final void R1(boolean z, boolean z2, int i, int i2) {
        View d;
        Shop2023TopNavBarNativeComponent A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab70ef9b", new Object[]{this, new Boolean(z), new Boolean(z2), new Integer(i), new Integer(i2)});
            return;
        }
        npp.a aVar = npp.Companion;
        aVar.b("changeToOtherPage : lastTabFullScreen : " + z + " , targetTabFullScreen : " + z2);
        int i3 = this.h0;
        int W1 = W1();
        this.h0 = W1;
        inp inpVar = this.B0;
        if (inpVar != null) {
            inpVar.J(W1);
        }
        if (z2) {
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.setZ(0.0f);
                inp inpVar2 = this.B0;
                if (inpVar2 != null) {
                    inpVar2.n();
                }
                FrameLayout frameLayout2 = this.Q;
                if (frameLayout2 != null) {
                    kew.d0(frameLayout2, this.f0.b());
                    S0(false);
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        } else {
            FrameLayout frameLayout3 = this.Q;
            if (frameLayout3 != null) {
                frameLayout3.setZ(0.1f);
                if (!i2()) {
                    FrameLayout frameLayout4 = this.L;
                    if (frameLayout4 != null) {
                        kew.C(frameLayout4);
                    } else {
                        ckf.y("newfarmerContainer");
                        throw null;
                    }
                }
                int W12 = W1();
                inp inpVar3 = this.B0;
                if (inpVar3 != null) {
                    inpVar3.J(W12);
                }
                int f = this.f0.f() - W12;
                if (!r()) {
                    inp inpVar4 = this.B0;
                    if (inpVar4 != null) {
                        inpVar4.n();
                    }
                    this.j0 = W12;
                    this.k0 = 0 - W12;
                } else if (E()) {
                    FrameLayout frameLayout5 = this.Q;
                    if (frameLayout5 != null) {
                        kew.d0(frameLayout5, this.f0.f());
                        inp inpVar5 = this.B0;
                        if (!(inpVar5 == null || (A = inpVar5.A()) == null)) {
                            A.r(true);
                        }
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                } else if (!m2()) {
                    Y1();
                    v44 v44Var = this.H0;
                    if (!(v44Var == null || (d = v44Var.d()) == null)) {
                        kew.g0(d);
                    }
                    View U1 = U1();
                    if (U1 != null) {
                        kew.g0(U1);
                    }
                    FrameLayout frameLayout6 = this.Q;
                    if (frameLayout6 != null) {
                        int z3 = kew.z(frameLayout6) - f;
                        EnhancedViewPager enhancedViewPager = this.N;
                        if (enhancedViewPager != null) {
                            enhancedViewPager.post(new q09(this, i3, z3, W12));
                        } else {
                            ckf.y("contentViewPager");
                            throw null;
                        }
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                }
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        }
        if (z2) {
            FrameLayout frameLayout7 = this.T;
            if (frameLayout7 != null) {
                frameLayout7.setZ(1.0f);
                View U12 = U1();
                if (U12 != null) {
                    kew.C(U12);
                }
            } else {
                ckf.y("shopHeaderContainer");
                throw null;
            }
        } else if (!v() || !i2()) {
            View U13 = U1();
            if (U13 != null) {
                kew.g0(U13);
            }
        } else {
            View U14 = U1();
            if (U14 != null) {
                kew.C(U14);
            }
        }
        if (z) {
            FrameLayout frameLayout8 = this.T;
            if (frameLayout8 != null) {
                frameLayout8.setZ(0.0f);
                View U15 = U1();
                if (U15 != null) {
                    kew.g0(U15);
                }
            } else {
                ckf.y("shopHeaderContainer");
                throw null;
            }
        }
        this.q0 = z2;
    }

    public final boolean S1() {
        View d;
        View contentView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cca356c2", new Object[]{this})).booleanValue();
        }
        if (!this.Z) {
            return true;
        }
        npp.Companion.b("goBack to shopIndex");
        this.Z = false;
        Q0(false);
        Tab3LiveContentRender tab3LiveContentRender = this.S;
        if (!(tab3LiveContentRender == null || (contentView = tab3LiveContentRender.getContentView()) == null)) {
            ViewGroup viewGroup = this.R;
            if (viewGroup != null) {
                viewGroup.removeView(contentView);
            } else {
                ckf.y("bigCardContainer");
                throw null;
            }
        }
        Tab3LiveContentRender tab3LiveContentRender2 = this.S;
        if (tab3LiveContentRender2 != null) {
            tab3LiveContentRender2.k();
        }
        vpd I = J().I();
        if (I != null) {
            I.a(99, 0);
        }
        vpd I2 = J().I();
        if (I2 != null) {
            I2.c(J().C(), J().p1());
        }
        if (h2()) {
            q2();
        } else {
            ViewGroup viewGroup2 = this.R;
            if (viewGroup2 != null) {
                kew.C(viewGroup2);
                View U1 = U1();
                if (U1 != null) {
                    kew.g0(U1);
                }
                v44 v44Var = this.H0;
                if (!(v44Var == null || (d = v44Var.d()) == null)) {
                    kew.g0(d);
                }
            } else {
                ckf.y("bigCardContainer");
                throw null;
            }
        }
        if (!i2()) {
            x2();
        } else if (!v()) {
            N1();
        } else if (r()) {
            N1();
        } else {
            x2();
        }
        return false;
    }

    public final void j2() {
        View contentView;
        View d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6bfc07", new Object[]{this});
        } else if (!this.Z) {
            this.Z = true;
            Y1();
            vpd I = J().I();
            if (I != null) {
                I.a(J().C(), J().p1());
            }
            v44 v44Var = this.H0;
            if (!(v44Var == null || (d = v44Var.d()) == null)) {
                kew.C(d);
            }
            View U1 = U1();
            if (U1 != null) {
                kew.C(U1);
            }
            inp inpVar = this.B0;
            if (inpVar != null) {
                inpVar.G(this.h0);
            }
            Tab3LiveContentRender tab3LiveContentRender = this.S;
            if (!(tab3LiveContentRender == null || (contentView = tab3LiveContentRender.getContentView()) == null)) {
                ViewGroup viewGroup = this.R;
                if (viewGroup != null) {
                    viewGroup.addView(contentView);
                    ViewGroup viewGroup2 = this.R;
                    if (viewGroup2 != null) {
                        kew.g0(viewGroup2);
                        ViewGroup viewGroup3 = this.R;
                        if (viewGroup3 != null) {
                            kew.e(viewGroup3, H().getHeight());
                            FrameLayout frameLayout = this.Q;
                            if (frameLayout != null) {
                                kew.d0(frameLayout, H().getHeight());
                            } else {
                                ckf.y("navViewContainer");
                                throw null;
                            }
                        } else {
                            ckf.y("bigCardContainer");
                            throw null;
                        }
                    } else {
                        ckf.y("bigCardContainer");
                        throw null;
                    }
                } else {
                    ckf.y("bigCardContainer");
                    throw null;
                }
            }
            Tab3LiveContentRender tab3LiveContentRender2 = this.S;
            if (tab3LiveContentRender2 != null) {
                tab3LiveContentRender2.j();
            }
            vpd I2 = J().I();
            if (I2 != null) {
                I2.c(99, 0);
            }
        }
    }

    public final void k2(int i) {
        inp inpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd328a", new Object[]{this, new Integer(i)});
            return;
        }
        if (!h2() && (inpVar = this.B0) != null) {
            inpVar.k(this.j0, i);
        }
        int i2 = this.j0;
        AnimatorSet animatorSet = new AnimatorSet();
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float f = i;
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            Animator i3 = bdw.i(frameLayout, f, 0L, null, linearInterpolator, 6, null);
            if (i3 instanceof ValueAnimator) {
                ((ValueAnimator) i3).addUpdateListener(new s09(this, i2));
            }
            xhv xhvVar = xhv.INSTANCE;
            animatorSet.playTogether(i3);
            animatorSet.addListener(new a(this));
            animatorSet.start();
            return;
        }
        ckf.y("navViewContainer");
        throw null;
    }

    public void o2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d8ba32", new Object[]{this});
            return;
        }
        this.a0 = false;
        EnhancedViewPager enhancedViewPager = this.N;
        Boolean bool = null;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCanDispatchToChild(true);
            EnhancedViewPager enhancedViewPager2 = this.N;
            if (enhancedViewPager2 != null) {
                enhancedViewPager2.setCanScroll(!this.p0);
                Shop2023PullDownHelper shop2023PullDownHelper = this.D0;
                if (shop2023PullDownHelper == null || !shop2023PullDownHelper.i()) {
                    r2();
                    if (!v() || this.k0 < this.i0 / 2 || !h2()) {
                        if (!A() && !this.q0 && !j()) {
                            boolean z = this.l0;
                            ShopOptSwipeLayout shopOptSwipeLayout = this.O;
                            if (shopOptSwipeLayout != null) {
                                shopOptSwipeLayout.forceInterceptAllTouchEvent(false);
                                this.l0 = false;
                                this.o0 = 0;
                                if (z) {
                                    npp.a aVar = npp.Companion;
                                    aVar.b("upDistance : " + this.j0 + ", downDistance : " + this.k0);
                                    if (v()) {
                                        ViewGroup viewGroup = this.R;
                                        if (viewGroup != null) {
                                            aop aopVar = this.s0;
                                            ckf.d(aopVar);
                                            kew.e(viewGroup, aopVar.b());
                                        } else {
                                            ckf.y("bigCardContainer");
                                            throw null;
                                        }
                                    }
                                    int i = this.j0;
                                    if (i == 0) {
                                        S0(true);
                                        T1();
                                        return;
                                    }
                                    int i2 = this.h0;
                                    if (i == i2) {
                                        if (this.F0 && r()) {
                                            ShopDataParser J = J();
                                            EmbedShopLoftComponent embedShopLoftComponent = this.t0;
                                            if (embedShopLoftComponent != null) {
                                                bool = Boolean.valueOf(embedShopLoftComponent.u());
                                            }
                                            ShopExtKt.j0(J, bool);
                                        }
                                        if (r()) {
                                            y2();
                                        }
                                        S0(false);
                                        T1();
                                    } else if (i / i2 < 0.3d || !this.m0) {
                                        N1();
                                    } else {
                                        k2((i2 - i) * (-1));
                                        int i3 = this.h0;
                                        this.j0 = i3;
                                        this.k0 = 0 - i3;
                                        S0(false);
                                        if (this.F0) {
                                            ShopDataParser J2 = J();
                                            EmbedShopLoftComponent embedShopLoftComponent2 = this.t0;
                                            if (embedShopLoftComponent2 != null) {
                                                bool = Boolean.valueOf(embedShopLoftComponent2.u());
                                            }
                                            ShopExtKt.j0(J2, bool);
                                        }
                                        y2();
                                    }
                                }
                            } else {
                                ckf.y("outerSwiperLayout");
                                throw null;
                            }
                        }
                    } else if (J().O0().q()) {
                        j2();
                    } else {
                        EmbedShopLoftComponent embedShopLoftComponent3 = this.t0;
                        if (embedShopLoftComponent3 != null) {
                            embedShopLoftComponent3.B();
                        }
                        ViewGroup viewGroup2 = this.R;
                        if (viewGroup2 != null) {
                            aop aopVar2 = this.s0;
                            kew.e(viewGroup2, aopVar2 == null ? 0 : aopVar2.b());
                            FrameLayout frameLayout = this.Q;
                            if (frameLayout != null) {
                                kew.d0(frameLayout, V1());
                                this.j0 = 0;
                                this.k0 = 0;
                                return;
                            }
                            ckf.y("navViewContainer");
                            throw null;
                        }
                        ckf.y("bigCardContainer");
                        throw null;
                    }
                }
            } else {
                ckf.y("contentViewPager");
                throw null;
            }
        } else {
            ckf.y("contentViewPager");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        View d;
        View d2;
        View d3;
        View d4;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        super.onPageSelected(i);
        int p = p();
        if (i != p) {
            ShopContainerPageAdapter shopContainerPageAdapter = this.U;
            if (shopContainerPageAdapter != null) {
                shopContainerPageAdapter.j(p);
            } else {
                ckf.y("shopContainerPageAdapter");
                throw null;
            }
        }
        ShopContainerPageAdapter shopContainerPageAdapter2 = this.U;
        if (shopContainerPageAdapter2 != null) {
            shopContainerPageAdapter2.i(i);
            int i2 = J().i(p());
            m0(i);
            int i3 = J().i(p());
            int o = o();
            int k = J().k(p());
            int i4 = J().i(i);
            J().W2(i4, k);
            npp.a aVar = npp.Companion;
            aVar.b("flag ship , on page selected , newTab = " + k + ", newSub = " + i4 + " , oldTab = " + o + ", position : " + i);
            l0(k);
            o();
            y1a<Integer, Integer, Integer, Integer, xhv> F = F();
            if (F != null) {
                F.invoke(Integer.valueOf(k), Integer.valueOf(i4), Integer.valueOf(o), Integer.valueOf(i2));
            }
            Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent = this.C0;
            if (shop2023TopNavBarNativeComponent != null) {
                shop2023TopNavBarNativeComponent.w(k, i3);
            }
            boolean c2 = spp.c(J().S(o, i2));
            boolean c3 = spp.c(J().S(k, i3));
            if (o == 0 && k != 0) {
                R1(c2, c3, o, i2);
            }
            if (o != 0 && k == 0) {
                Q1(c2, o, i2);
            }
            if (!(o == 0 || k == 0)) {
                O1(c2, c3, o, i2);
            }
            A2(this, false, 1, null);
            b0();
            A0(false);
            if (!c3 && (!v() || !r() || k != 0)) {
                z = false;
            }
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.u0;
            if (shop2023HeaderInfoTemplate != null) {
                shop2023HeaderInfoTemplate.I(z);
            }
            if (c2) {
                Q0(false);
                U0(false);
                this.Z = false;
            }
            if (h2()) {
                View U1 = U1();
                if (U1 != null) {
                    kew.C(U1);
                }
                v44 v44Var = this.H0;
                if (!(v44Var == null || (d4 = v44Var.d()) == null)) {
                    kew.C(d4);
                }
                v44 v44Var2 = this.I0;
                if (v44Var2 != null && (d3 = v44Var2.d()) != null) {
                    kew.C(d3);
                    return;
                }
                return;
            }
            Y1();
            View U12 = U1();
            if (U12 != null) {
                kew.g0(U12);
            }
            v44 v44Var3 = this.H0;
            if (!(v44Var3 == null || (d2 = v44Var3.d()) == null)) {
                kew.g0(d2);
            }
            v44 v44Var4 = this.I0;
            if (v44Var4 != null && (d = v44Var4.d()) != null) {
                kew.g0(d);
                return;
            }
            return;
        }
        ckf.y("shopContainerPageAdapter");
        throw null;
    }

    public final void p2() {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d282a0a", new Object[]{this});
            return;
        }
        int i = this.j0;
        float V1 = V1();
        if (this.Q != null) {
            float z = V1 - kew.z(frameLayout);
            AnimatorSet animatorSet = new AnimatorSet();
            FrameLayout frameLayout2 = this.Q;
            if (frameLayout2 != null) {
                Animator i2 = bdw.i(frameLayout2, z, 0L, null, new LinearInterpolator(), 6, null);
                if (i2 instanceof ValueAnimator) {
                    ((ValueAnimator) i2).addUpdateListener(new t09(i, this));
                }
                xhv xhvVar = xhv.INSTANCE;
                animatorSet.playTogether(i2);
                animatorSet.setInterpolator(new LinearInterpolator());
                animatorSet.addListener(new a(this));
                animatorSet.start();
                return;
            }
            ckf.y("navViewContainer");
            throw null;
        }
        ckf.y("navViewContainer");
        throw null;
    }

    public final void s2(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c55ab211", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.Z || !q() || A() || this.q0) {
        } else {
            if ((!z || !j()) && J().Q1(J().R())) {
                if (!this.l0) {
                    int abs = this.o0 + Math.abs(i);
                    this.o0 = abs;
                    if (abs < this.n0) {
                        return;
                    }
                }
                Z1();
                int Z0 = (int) (i * Z0());
                if (this.j0 < this.h0 && ((O() || i2()) && v())) {
                    ViewGroup viewGroup = this.R;
                    if (viewGroup == null) {
                        ckf.y("bigCardContainer");
                        throw null;
                    } else if (!kew.I(viewGroup)) {
                        q2();
                    }
                }
                int V1 = V1();
                EnhancedViewPager enhancedViewPager = this.N;
                if (enhancedViewPager != null) {
                    enhancedViewPager.setCanScroll(false);
                    this.m0 = false;
                    this.l0 = true;
                    boolean h2 = h2();
                    EnhancedViewPager enhancedViewPager2 = this.N;
                    if (enhancedViewPager2 != null) {
                        enhancedViewPager2.setCanDispatchToChild(false);
                        int i2 = this.j0;
                        if (i2 - Z0 > 0 || h2) {
                            this.k0 += Z0;
                            this.j0 = i2 - Z0;
                        } else {
                            Shop2023PullDownHelper shop2023PullDownHelper = this.D0;
                            if (shop2023PullDownHelper != null) {
                                shop2023PullDownHelper.h(Z0);
                            }
                            this.j0 = 0;
                            this.k0 = 0;
                            EnhancedViewPager enhancedViewPager3 = this.N;
                            if (enhancedViewPager3 != null) {
                                enhancedViewPager3.setCanDispatchToChild(true);
                            } else {
                                ckf.y("contentViewPager");
                                throw null;
                            }
                        }
                        inp inpVar = this.B0;
                        if (inpVar != null) {
                            inpVar.G(this.j0);
                        }
                        L1(this, 0.0f, 1, null);
                        if (v()) {
                            aop aopVar = this.s0;
                            ckf.d(aopVar);
                            int b2 = aopVar.b();
                            ViewGroup viewGroup2 = this.R;
                            if (viewGroup2 == null) {
                                ckf.y("bigCardContainer");
                                throw null;
                            } else if (viewGroup2.getHeight() + Math.abs(this.k0) < b2) {
                                ViewGroup viewGroup3 = this.R;
                                if (viewGroup3 != null) {
                                    kew.e(viewGroup3, b2);
                                } else {
                                    ckf.y("bigCardContainer");
                                    throw null;
                                }
                            } else if (this.j0 <= 0) {
                                ViewGroup viewGroup4 = this.R;
                                if (viewGroup4 != null) {
                                    kew.e(viewGroup4, Math.min(H().getHeight(), b2 + Math.abs(this.k0)));
                                } else {
                                    ckf.y("bigCardContainer");
                                    throw null;
                                }
                            }
                        }
                        FrameLayout frameLayout = this.Q;
                        if (frameLayout != null) {
                            kew.d0(frameLayout, V1 + this.k0);
                            if (v() && this.k0 >= this.i0 && !this.a0) {
                                kew.i0(n());
                                this.a0 = true;
                                return;
                            }
                            return;
                        }
                        ckf.y("navViewContainer");
                        throw null;
                    }
                    ckf.y("contentViewPager");
                    throw null;
                }
                ckf.y("contentViewPager");
                throw null;
            }
        }
    }

    public final void u2(int i, boolean z, Integer num) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8536df6d", new Object[]{this, new Integer(i), new Boolean(z), num});
        } else if (this.Z || !q() || A() || this.q0) {
        } else {
            if (!z || !j()) {
                if (!this.l0) {
                    EnhancedViewPager enhancedViewPager = this.N;
                    if (enhancedViewPager != null) {
                        enhancedViewPager.setCanDispatchToChild(false);
                        int abs = this.o0 + Math.abs(i);
                        this.o0 = abs;
                        if (abs < this.n0) {
                            return;
                        }
                    } else {
                        ckf.y("contentViewPager");
                        throw null;
                    }
                }
                int Z0 = (int) (i * Z0());
                Shop2023PullDownHelper shop2023PullDownHelper = this.D0;
                if (shop2023PullDownHelper == null || !shop2023PullDownHelper.j(Z0)) {
                    Z1();
                    this.l0 = true;
                    this.m0 = true;
                    EnhancedViewPager enhancedViewPager2 = this.N;
                    if (enhancedViewPager2 != null) {
                        enhancedViewPager2.setCanScroll(false);
                        if (this.j0 >= this.h0) {
                            EnhancedViewPager enhancedViewPager3 = this.N;
                            if (enhancedViewPager3 != null) {
                                enhancedViewPager3.setCanDispatchToChild(true);
                            } else {
                                ckf.y("contentViewPager");
                                throw null;
                            }
                        } else {
                            if (num == null) {
                                i2 = V1();
                            } else {
                                i2 = num.intValue();
                            }
                            int i3 = this.j0 + Z0;
                            this.j0 = i3;
                            this.k0 -= Z0;
                            int i4 = this.h0;
                            if (i3 > i4) {
                                this.j0 = i4;
                                this.k0 = 0 - i4;
                            }
                            inp inpVar = this.B0;
                            if (inpVar != null) {
                                inpVar.G(this.j0);
                            }
                            L1(this, 0.0f, 1, null);
                            if (v()) {
                                aop aopVar = this.s0;
                                ckf.d(aopVar);
                                int b2 = aopVar.b();
                                int i5 = this.j0;
                                if (i5 >= 0) {
                                    ViewGroup viewGroup = this.R;
                                    if (viewGroup != null) {
                                        kew.e(viewGroup, b2);
                                    } else {
                                        ckf.y("bigCardContainer");
                                        throw null;
                                    }
                                } else {
                                    ViewGroup viewGroup2 = this.R;
                                    if (viewGroup2 != null) {
                                        kew.e(viewGroup2, b2 - i5);
                                    } else {
                                        ckf.y("bigCardContainer");
                                        throw null;
                                    }
                                }
                            }
                            FrameLayout frameLayout = this.Q;
                            if (frameLayout != null) {
                                kew.d0(frameLayout, i2 - this.j0);
                            } else {
                                ckf.y("navViewContainer");
                                throw null;
                            }
                        }
                    } else {
                        ckf.y("contentViewPager");
                        throw null;
                    }
                }
            }
        }
    }

    public final void f2() {
        ShopComponentModel shopComponentModel;
        EmbedSecondFloorView v;
        xpd.a f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f2897a", new Object[]{this});
            return;
        }
        Map<String, ShopComponentModel> m = J().O0().m();
        if (m == null) {
            npp.Companion.b("shopComponentData null");
            return;
        }
        c2(m);
        View view = null;
        if (m.get("tb_shop_sub_tab_2023") != null) {
            X1().m(J().O0().i());
            ShopFarmTopNavBarNativeComponent shopFarmTopNavBarNativeComponent = new ShopFarmTopNavBarNativeComponent(n(), J(), X1().a());
            this.C0 = shopFarmTopNavBarNativeComponent;
            inp inpVar = this.B0;
            if (inpVar != null) {
                inpVar.S(shopFarmTopNavBarNativeComponent);
            }
            Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent = this.C0;
            if (shop2023TopNavBarNativeComponent != null) {
                shop2023TopNavBarNativeComponent.t(false);
            }
            EnhancedViewPager enhancedViewPager = this.N;
            if (enhancedViewPager != null) {
                enhancedViewPager.addOnPageChangeListener(this.C0);
                Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent2 = this.C0;
                if (shop2023TopNavBarNativeComponent2 != null) {
                    shop2023TopNavBarNativeComponent2.u(new FarmShop$initTemplateComponent$1$1(this));
                }
                FrameLayout frameLayout = this.Q;
                if (frameLayout != null) {
                    Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent3 = this.C0;
                    ckf.d(shop2023TopNavBarNativeComponent3);
                    frameLayout.addView(shop2023TopNavBarNativeComponent3.g(), kew.j(0, X1().a(), 0, 0, 0, 0, 0, 125, null));
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            } else {
                ckf.y("contentViewPager");
                throw null;
            }
        }
        if (v()) {
            this.f0.i(this.r0);
            if (i2()) {
                this.f0.k(this.r0);
            } else {
                this.f0.k(L() + this.d0.a());
            }
        } else {
            this.f0.i(L() + this.d0.a());
            dop dopVar = this.f0;
            dopVar.k(dopVar.c());
        }
        FrameLayout frameLayout2 = this.Q;
        if (frameLayout2 != null) {
            kew.e(frameLayout2, -2);
            FrameLayout frameLayout3 = this.Q;
            if (frameLayout3 != null) {
                kew.d0(frameLayout3, this.f0.c());
                J().O0().s(this.f0.c());
                if (v()) {
                    this.S = new Tab3LiveContentRender(n(), new ups(brf.a(jpu.a("type", "nativeLiveContainer"), jpu.a("payload", brf.a(jpu.a("source", brf.a(jpu.a("shopLive2023", J().O0().d())))))), J(), 0, 0), true, false, 8, null);
                    if (J().O0().q()) {
                        shopComponentModel = new ShopDataParser.e(J()).g();
                    } else {
                        shopComponentModel = J().O0().o();
                    }
                    if (shopComponentModel != null) {
                        jnp jnpVar = new jnp(shopComponentModel, !J().O0().q(), !i2());
                        this.v0 = jnpVar;
                        BaseContentComponent.e0(this, jnpVar, null, 2, null);
                        jnp jnpVar2 = this.v0;
                        ckf.d(jnpVar2);
                        jnpVar2.k(n(), J(), I(), null);
                        ViewGroup viewGroup = this.R;
                        if (viewGroup != null) {
                            jnp jnpVar3 = this.v0;
                            ckf.d(jnpVar3);
                            View d = jnpVar3.d();
                            aop aopVar = this.s0;
                            viewGroup.addView(d, kew.j(0, kew.Q(Integer.valueOf(shopComponentModel.getRenderHeight())), 0, aopVar == null ? 0 : aopVar.a(), 0, 0, 80, 53, null));
                            EmbedShopLoftComponent embedShopLoftComponent = this.t0;
                            if (!(embedShopLoftComponent == null || (v = embedShopLoftComponent.v()) == null || (f = v.f()) == null)) {
                                f.c(ShopNewLiveLoftView.a.class.getName(), new r09(this));
                            }
                        } else {
                            ckf.y("bigCardContainer");
                            throw null;
                        }
                    }
                }
                b2(m);
                int W1 = W1();
                this.h0 = W1;
                inp inpVar2 = this.B0;
                if (inpVar2 != null) {
                    inpVar2.J(W1);
                }
                inp inpVar3 = this.B0;
                if (inpVar3 != null) {
                    inpVar3.L(null);
                }
                inp inpVar4 = this.B0;
                if (inpVar4 != null) {
                    Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.u0;
                    if (shop2023HeaderInfoTemplate != null) {
                        view = shop2023HeaderInfoTemplate.d();
                    }
                    inpVar4.R(view);
                }
                inp inpVar5 = this.B0;
                if (inpVar5 != null) {
                    inpVar5.C();
                }
                J().C2(L() + this.e0.g());
                Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent4 = this.C0;
                if (shop2023TopNavBarNativeComponent4 != null) {
                    shop2023TopNavBarNativeComponent4.r(true);
                }
                H1();
                knp knpVar = this.E0;
                if (knpVar != null) {
                    knpVar.a(J(), H());
                    return;
                }
                return;
            }
            ckf.y("navViewContainer");
            throw null;
        }
        ckf.y("navViewContainer");
        throw null;
    }

    public final void g2() {
        aop aopVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        View K = kew.K(n(), R.layout.view_shop_farm_base_layout);
        if (K != null) {
            this.O = new ShopOptSwipeLayout(n());
            View findViewById = K.findViewById(R.id.shop_2023_search_bar_container);
            ckf.f(findViewById, "contentView.findViewById(R.id.shop_2023_search_bar_container)");
            FrameLayout frameLayout = (FrameLayout) findViewById;
            this.M = frameLayout;
            frameLayout.setPadding(0, L(), 0, 0);
            View findViewById2 = K.findViewById(R.id.shop_2023_content_part);
            ckf.f(findViewById2, "contentView.findViewById(R.id.shop_2023_content_part)");
            this.P = (FrameLayout) findViewById2;
            View findViewById3 = K.findViewById(R.id.shop_2023_big_card_part);
            ckf.f(findViewById3, "contentView.findViewById(R.id.shop_2023_big_card_part)");
            this.R = (ViewGroup) findViewById3;
            View findViewById4 = K.findViewById(R.id.shop_new_farmer_container);
            ckf.f(findViewById4, "contentView.findViewById(R.id.shop_new_farmer_container)");
            this.L = (FrameLayout) findViewById4;
            View findViewById5 = K.findViewById(R.id.shop_2023_index_nav_part);
            ckf.f(findViewById5, "contentView.findViewById(R.id.shop_2023_index_nav_part)");
            this.Q = (FrameLayout) findViewById5;
            View findViewById6 = K.findViewById(R.id.shop_2023_top_header_part);
            ckf.f(findViewById6, "contentView.findViewById(R.id.shop_2023_top_header_part)");
            this.T = (FrameLayout) findViewById6;
            View findViewById7 = K.findViewById(R.id.shop_2023_background_img);
            ckf.f(findViewById7, "contentView.findViewById(R.id.shop_2023_background_img)");
            this.V = (TUrlImageView) findViewById7;
            View findViewById8 = K.findViewById(R.id.shop_2023_background_color_view_container);
            ckf.f(findViewById8, "contentView.findViewById(R.id.shop_2023_background_color_view_container)");
            this.W = findViewById8;
            View findViewById9 = K.findViewById(R.id.shop_2023_background_color_view);
            ckf.f(findViewById9, "contentView.findViewById(R.id.shop_2023_background_color_view)");
            this.X = findViewById9;
            View findViewById10 = K.findViewById(R.id.shop_2023_background_color_view_2);
            ckf.f(findViewById10, "contentView.findViewById(R.id.shop_2023_background_color_view_2)");
            this.Y = findViewById10;
            EnhancedViewPager enhancedViewPager = new EnhancedViewPager(n());
            enhancedViewPager.setId(R.id.new_shop_view_view_pager);
            v09 v09Var = new v09(J());
            this.N = enhancedViewPager;
            FrameLayout frameLayout2 = this.Q;
            if (frameLayout2 != null) {
                frameLayout2.setZ(0.1f);
                kew.T(enhancedViewPager);
                EnhancedViewPager enhancedViewPager2 = this.N;
                if (enhancedViewPager2 != null) {
                    enhancedViewPager2.setOffscreenPageLimit(v09Var.getCount() - 1);
                    FragmentManager supportFragmentManager = n().getSupportFragmentManager();
                    ckf.f(supportFragmentManager, "context.supportFragmentManager");
                    ShopContainerPageAdapter shopContainerPageAdapter = new ShopContainerPageAdapter(supportFragmentManager);
                    this.U = shopContainerPageAdapter;
                    shopContainerPageAdapter.k(v09Var);
                    ShopContainerPageAdapter shopContainerPageAdapter2 = this.U;
                    if (shopContainerPageAdapter2 != null) {
                        enhancedViewPager.setAdapter(shopContainerPageAdapter2);
                        enhancedViewPager.addOnPageChangeListener(this);
                        FrameLayout frameLayout3 = this.P;
                        if (frameLayout3 != null) {
                            kew.a(frameLayout3, enhancedViewPager);
                            ShopOptSwipeLayout shopOptSwipeLayout = this.O;
                            if (shopOptSwipeLayout != null) {
                                shopOptSwipeLayout.setSwipeListener(this);
                                ShopOptSwipeLayout shopOptSwipeLayout2 = this.O;
                                if (shopOptSwipeLayout2 != null) {
                                    shopOptSwipeLayout2.setEnableInterceptAllEventByDownEventIntercept(aqp.Companion.E());
                                    ShopOptSwipeLayout shopOptSwipeLayout3 = this.O;
                                    if (shopOptSwipeLayout3 != null) {
                                        kew.a(shopOptSwipeLayout3, K);
                                        ShopOptSwipeLayout shopOptSwipeLayout4 = this.O;
                                        if (shopOptSwipeLayout4 != null) {
                                            shopOptSwipeLayout4.setExpandedStatusGetter(new FarmShop$initView$1(this));
                                            FrameLayout H = H();
                                            ShopOptSwipeLayout shopOptSwipeLayout5 = this.O;
                                            if (shopOptSwipeLayout5 != null) {
                                                kew.a(H, shopOptSwipeLayout5);
                                                znp c2 = J().O0().c();
                                                String b2 = c2.b();
                                                if (b2 != null) {
                                                    TUrlImageView tUrlImageView = this.V;
                                                    if (tUrlImageView != null) {
                                                        tUrlImageView.setImageUrl(b2);
                                                        TUrlImageView tUrlImageView2 = this.V;
                                                        if (tUrlImageView2 != null) {
                                                            tUrlImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                                            TUrlImageView tUrlImageView3 = this.V;
                                                            if (tUrlImageView3 != null) {
                                                                kew.e(tUrlImageView3, kew.Q(Integer.valueOf(c2.a())));
                                                            } else {
                                                                ckf.y("shopBackgroundImg");
                                                                throw null;
                                                            }
                                                        } else {
                                                            ckf.y("shopBackgroundImg");
                                                            throw null;
                                                        }
                                                    } else {
                                                        ckf.y("shopBackgroundImg");
                                                        throw null;
                                                    }
                                                }
                                                if (!khu.e()) {
                                                    r0(J().O0().p());
                                                }
                                                if (v()) {
                                                    if (i2()) {
                                                        int screenHeight = DisplayUtil.getScreenHeight(H().getContext());
                                                        aopVar = new aop((int) (screenHeight * J().O0().k()), J().O0().l().a());
                                                        this.i0 = screenHeight - aopVar.b();
                                                    } else {
                                                        aopVar = J().O0().l();
                                                        this.i0 = aopVar.a();
                                                    }
                                                    this.s0 = aopVar;
                                                    this.r0 = aopVar.b() - aopVar.a();
                                                    ViewGroup viewGroup = this.R;
                                                    if (viewGroup != null) {
                                                        kew.e(viewGroup, aopVar.b());
                                                        if (J().O0().r()) {
                                                            EmbedShopLoftComponent embedShopLoftComponent = new EmbedShopLoftComponent(n(), J(), I());
                                                            if (J().O0().q()) {
                                                                J().P2(true);
                                                                embedShopLoftComponent.v().r(true);
                                                            }
                                                            embedShopLoftComponent.J(new FarmShop$initView$3(this));
                                                            ViewGroup viewGroup2 = this.R;
                                                            if (viewGroup2 != null) {
                                                                kew.a(viewGroup2, embedShopLoftComponent.x());
                                                                try {
                                                                    embedShopLoftComponent.z();
                                                                } catch (Exception e) {
                                                                    embedShopLoftComponent.x().setBackgroundColor(-16777216);
                                                                    npp.Companion.d(e);
                                                                }
                                                                this.t0 = embedShopLoftComponent;
                                                                if (!J().O0().q()) {
                                                                    View view = new View(n());
                                                                    kew.S(view, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, ic1.h0(new Integer[]{0, Integer.valueOf(Color.parseColor("#df000000"))})));
                                                                    ViewGroup viewGroup3 = this.R;
                                                                    if (viewGroup3 != null) {
                                                                        viewGroup3.addView(view, kew.j(0, kew.P(152), 0, 0, 0, 0, 48, 61, null));
                                                                    } else {
                                                                        ckf.y("bigCardContainer");
                                                                        throw null;
                                                                    }
                                                                }
                                                                View view2 = new View(n());
                                                                kew.S(view2, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, ic1.h0(new Integer[]{0, Integer.valueOf(Color.parseColor("#7f000000")), 0})));
                                                                ViewGroup viewGroup4 = this.R;
                                                                if (viewGroup4 != null) {
                                                                    viewGroup4.addView(view2, kew.j(0, kew.P(194), 0, aopVar.a() - kew.P(90), 0, 0, 80, 53, null));
                                                                } else {
                                                                    ckf.y("bigCardContainer");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                ckf.y("bigCardContainer");
                                                                throw null;
                                                            }
                                                        }
                                                    } else {
                                                        ckf.y("bigCardContainer");
                                                        throw null;
                                                    }
                                                }
                                            } else {
                                                ckf.y("outerSwiperLayout");
                                                throw null;
                                            }
                                        } else {
                                            ckf.y("outerSwiperLayout");
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("outerSwiperLayout");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("outerSwiperLayout");
                                    throw null;
                                }
                            } else {
                                ckf.y("outerSwiperLayout");
                                throw null;
                            }
                        } else {
                            ckf.y("centerContainer");
                            throw null;
                        }
                    } else {
                        ckf.y("shopContainerPageAdapter");
                        throw null;
                    }
                } else {
                    ckf.y("contentViewPager");
                    throw null;
                }
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        }
    }

    public final void b2(Map<String, ShopComponentModel> map) {
        ShopComponentModel shopComponentModel;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca56f8f8", new Object[]{this, map});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(n());
        this.K0 = linearLayout;
        linearLayout.setOrientation(1);
        if (this.G0 && i2() && !v()) {
            ShopComponentModel shopComponentModel2 = map.get("tb_shop_header_new_farmers_2024");
            if (shopComponentModel2 != null) {
                v44 v44Var = new v44(shopComponentModel2);
                BaseContentComponent.e0(this, v44Var, null, 2, null);
                int v = kew.v(Integer.valueOf(shopComponentModel2.getRenderHeight()));
                v44Var.k(n(), J(), I(), null);
                npp.Companion.f(ckf.p("tb_shop_header_new_farmers_2024 init ", Integer.valueOf(shopComponentModel2.getRenderHeight())));
                linearLayout.addView(v44Var.d(), kew.n(0, kew.Q(Integer.valueOf(shopComponentModel2.getRenderHeight())), 0, 0, 0, 0, 61, null));
                i = v;
            }
            ShopComponentModel shopComponentModel3 = map.get("tb_shop_header_live_honor_list_2024");
            if (shopComponentModel3 != null) {
                v44 v44Var2 = new v44(shopComponentModel3);
                BaseContentComponent.e0(this, v44Var2, null, 2, null);
                i += kew.v(Integer.valueOf(shopComponentModel3.getRenderHeight()));
                v44Var2.k(n(), J(), I(), null);
                npp.Companion.f(ckf.p("tb_shop_header_live_honor_list_2024 init ", Integer.valueOf(shopComponentModel3.getRenderHeight())));
                linearLayout.addView(v44Var2.d(), kew.n(0, kew.Q(Integer.valueOf(shopComponentModel3.getRenderHeight())), 0, 0, 0, 0, 61, null));
            }
        }
        if (!v() && (shopComponentModel = map.get("tb_shop_header_live_item_2024")) != null) {
            v44 v44Var3 = new v44(shopComponentModel);
            this.I0 = v44Var3;
            BaseContentComponent.e0(this, v44Var3, null, 2, null);
            i += kew.v(Integer.valueOf(shopComponentModel.getRenderHeight()));
            v44 v44Var4 = this.I0;
            if (v44Var4 != null) {
                v44Var4.k(n(), J(), I(), null);
            }
            npp.Companion.f(ckf.p("tb_shop_header_live_item_2024 init ", Integer.valueOf(shopComponentModel.getRenderHeight())));
            v44 v44Var5 = this.I0;
            linearLayout.addView(v44Var5 == null ? null : v44Var5.d(), kew.n(0, kew.Q(Integer.valueOf(shopComponentModel.getRenderHeight())), 0, 0, 0, 0, 61, null));
        }
        if (!this.G0 || !i2() || v()) {
            FrameLayout frameLayout = this.T;
            if (frameLayout != null) {
                frameLayout.addView(linearLayout, kew.j(0, 0, this.d0.a(), 0, 0, 0, 0, 123, null));
                dop dopVar = this.d0;
                dopVar.m(dopVar.a() + i);
                dop dopVar2 = this.f0;
                dopVar2.i(dopVar2.c() + i);
                dop dopVar3 = this.f0;
                dopVar3.k(dopVar3.f() + i);
                FrameLayout frameLayout2 = this.T;
                if (frameLayout2 != null) {
                    kew.e(frameLayout2, this.d0.a());
                    FrameLayout frameLayout3 = this.Q;
                    if (frameLayout3 != null) {
                        kew.d0(frameLayout3, this.f0.c());
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                } else {
                    ckf.y("shopHeaderContainer");
                    throw null;
                }
            } else {
                ckf.y("shopHeaderContainer");
                throw null;
            }
        } else {
            FrameLayout frameLayout4 = this.L;
            if (frameLayout4 != null) {
                frameLayout4.addView(linearLayout, kew.j(0, 0, L() + this.e0.g(), 0, 0, 0, 0, 123, null));
                this.f0.i(L() + this.e0.g() + i);
                this.f0.k(L() + this.e0.g() + i);
                FrameLayout frameLayout5 = this.Q;
                if (frameLayout5 != null) {
                    kew.d0(frameLayout5, this.f0.c());
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            } else {
                ckf.y("newfarmerContainer");
                throw null;
            }
        }
    }

    public final void c2(Map<String, ShopComponentModel> map) {
        int i;
        int i2;
        int i3;
        int i4;
        JSONObject jSONObject;
        String string;
        Integer m;
        String string2;
        Integer m2;
        TUrlImageView w;
        int a2;
        Integer m3;
        Integer m4;
        JSONObject jSONObject2;
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe49541", new Object[]{this, map});
            return;
        }
        boolean z = map.get("tb_shop_header_shop_info_2023_native") != null;
        ShopComponentModel shopComponentModel = map.get("tb_shop_header_shop_info_2023");
        if (shopComponentModel != null) {
            if (z) {
                JSONObject data = shopComponentModel.getData();
                z = ckf.b("true", (data == null || (jSONObject2 = data.getJSONObject("feature")) == null) ? null : jSONObject2.getString("showNativeShopInfo"));
            }
            this.e0.q(z);
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = new Shop2023HeaderInfoTemplate(shopComponentModel, new FarmShop$initHeader$1$1(this));
            this.u0 = shop2023HeaderInfoTemplate;
            BaseContentComponent.e0(this, shop2023HeaderInfoTemplate, null, 2, null);
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate2 = this.u0;
            if (shop2023HeaderInfoTemplate2 != null) {
                shop2023HeaderInfoTemplate2.x(new FarmShop$initHeader$1$2(this));
            }
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate3 = this.u0;
            ckf.d(shop2023HeaderInfoTemplate3);
            shop2023HeaderInfoTemplate3.k(n(), J(), I(), null);
            JSONObject extData = shopComponentModel.getExtData();
            if (extData != null) {
                enp enpVar = this.e0;
                String string3 = extData.getString("indexPageHeaderFoldedStyleHeight");
                enpVar.j((string3 == null || (m4 = ssq.m(string3)) == null) ? 0 : kew.Q(m4));
                enp enpVar2 = this.e0;
                String string4 = extData.getString("otherPageHeaderStyleHeight");
                enpVar2.l((string4 == null || (m3 = ssq.m(string4)) == null) ? 0 : kew.Q(m3));
                xhv xhvVar = xhv.INSTANCE;
            }
            if (this.e0.d() == 0) {
                this.e0.j(kew.Q(182));
            }
            if (this.e0.g() == 0) {
                this.e0.l(kew.Q(121));
            }
            if (z) {
                this.e0.s(kew.Q(Integer.valueOf(shopComponentModel.getRenderHeight())));
            } else {
                this.e0.m(kew.Q(Integer.valueOf(shopComponentModel.getRenderHeight())));
            }
            FrameLayout frameLayout = this.M;
            if (frameLayout != null) {
                Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate4 = this.u0;
                ckf.d(shop2023HeaderInfoTemplate4);
                View d = shop2023HeaderInfoTemplate4.d();
                int v = kew.v(11);
                if (z) {
                    a2 = this.e0.p();
                } else {
                    a2 = this.e0.a();
                }
                frameLayout.addView(d, kew.j(0, a2, v, 0, 0, 0, 0, 121, null));
                xhv xhvVar2 = xhv.INSTANCE;
            } else {
                ckf.y("searchBarContainer");
                throw null;
            }
        }
        ShopComponentModel shopComponentModel2 = map.get("tb_shop_header_shop_info_2023_native");
        if (shopComponentModel2 != null) {
            int P = kew.P(Integer.valueOf(shopComponentModel2.getRenderHeight()));
            nop nopVar = new nop(n(), J(), this.G0, i2(), this.e0.p());
            this.B0 = nopVar;
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate5 = this.u0;
            nopVar.Q(shop2023HeaderInfoTemplate5 == null ? null : shop2023HeaderInfoTemplate5.d());
            inp inpVar = this.B0;
            if (!(inpVar == null || (w = inpVar.w()) == null)) {
                w.setOnClickListener(new c());
                xhv xhvVar3 = xhv.INSTANCE;
            }
            inp inpVar2 = this.B0;
            if (inpVar2 != null) {
                inpVar2.N(new FarmShop$initHeader$2$2(this));
            }
            gnp a3 = gnp.Companion.a(J(), I());
            if (a3 != null) {
                this.w0 = a3;
                inp inpVar3 = this.B0;
                if (inpVar3 != null) {
                    inpVar3.i(a3.d());
                    xhv xhvVar4 = xhv.INSTANCE;
                }
            }
            FrameLayout frameLayout2 = this.T;
            if (frameLayout2 != null) {
                inp inpVar4 = this.B0;
                ckf.d(inpVar4);
                frameLayout2.addView(inpVar4.z(), kew.j(0, P, 0, 0, 0, 0, 0, 125, null));
                enp enpVar3 = this.e0;
                JSONObject extData2 = shopComponentModel2.getExtData();
                Integer valueOf = (extData2 == null || (string2 = extData2.getString("indexPageHeaderFoldedStyleHeight")) == null || (m2 = ssq.m(string2)) == null) ? null : Integer.valueOf(kew.Q(m2));
                if (valueOf == null) {
                    i3 = kew.Q(134);
                } else {
                    i3 = valueOf.intValue();
                }
                enpVar3.j(i3);
                enp enpVar4 = this.e0;
                JSONObject extData3 = shopComponentModel2.getExtData();
                Integer valueOf2 = (extData3 == null || (string = extData3.getString("otherPageHeaderStyleHeight")) == null || (m = ssq.m(string)) == null) ? null : Integer.valueOf(kew.Q(m));
                if (valueOf2 == null) {
                    i4 = kew.Q(134);
                } else {
                    i4 = valueOf2.intValue();
                }
                enpVar4.l(i4);
                enp enpVar5 = this.e0;
                int g = enpVar5.g();
                JSONObject extData4 = shopComponentModel2.getExtData();
                int i6 = 66;
                if (!(extData4 == null || (jSONObject = extData4.getJSONObject("otherPageStyleConfig")) == null)) {
                    i6 = jSONObject.getIntValue("shopIconHeight");
                }
                enpVar5.l(g + ((int) (kew.P(Integer.valueOf(i6)) * 0.18f)));
                this.e0.r(P);
                this.e0.m(P);
                if (!this.G0) {
                    inp inpVar5 = this.B0;
                    FrameLayout frameLayout3 = this.P;
                    if (frameLayout3 != null) {
                        FrameLayout frameLayout4 = this.Q;
                        if (frameLayout4 != null) {
                            FrameLayout frameLayout5 = this.T;
                            if (frameLayout5 != null) {
                                Shop2023PullDownHelper shop2023PullDownHelper = new Shop2023PullDownHelper(inpVar5, new View[]{frameLayout3, frameLayout4, frameLayout5});
                                this.D0 = shop2023PullDownHelper;
                                if (this.M0) {
                                    View view = this.W;
                                    if (view != null) {
                                        shop2023PullDownHelper.n(view);
                                    } else {
                                        ckf.y("shopBackgroundColorViewContainer");
                                        throw null;
                                    }
                                } else {
                                    TUrlImageView tUrlImageView = this.V;
                                    if (tUrlImageView != null) {
                                        shop2023PullDownHelper.n(tUrlImageView);
                                    } else {
                                        ckf.y("shopBackgroundImg");
                                        throw null;
                                    }
                                }
                                Shop2023PullDownHelper shop2023PullDownHelper2 = this.D0;
                                if (shop2023PullDownHelper2 != null) {
                                    FrameLayout frameLayout6 = this.M;
                                    if (frameLayout6 != null) {
                                        shop2023PullDownHelper2.f(frameLayout6);
                                        xhv xhvVar5 = xhv.INSTANCE;
                                    } else {
                                        ckf.y("searchBarContainer");
                                        throw null;
                                    }
                                }
                            } else {
                                ckf.y("shopHeaderContainer");
                                throw null;
                            }
                        } else {
                            ckf.y("navViewContainer");
                            throw null;
                        }
                    } else {
                        ckf.y("centerContainer");
                        throw null;
                    }
                }
                lnp lnpVar = new lnp(this.B0);
                this.J0 = lnpVar;
                FrameLayout frameLayout7 = this.P;
                if (frameLayout7 != null) {
                    lnpVar.i(frameLayout7);
                    lnp lnpVar2 = this.J0;
                    if (lnpVar2 != null) {
                        lnpVar2.c(H());
                        xhv xhvVar6 = xhv.INSTANCE;
                    }
                } else {
                    ckf.y("centerContainer");
                    throw null;
                }
            } else {
                ckf.y("shopHeaderContainer");
                throw null;
            }
        }
        LinearLayout linearLayout = new LinearLayout(n());
        linearLayout.setOrientation(1);
        ShopComponentModel shopComponentModel3 = map.get("tb_shop_header_farmer_endorsement_2024");
        if (shopComponentModel3 == null) {
            i = 0;
        } else {
            v44 v44Var = new v44(shopComponentModel3);
            this.H0 = v44Var;
            BaseContentComponent.e0(this, v44Var, null, 2, null);
            v44 v44Var2 = this.H0;
            if (v44Var2 != null) {
                v44Var2.k(n(), J(), I(), null);
                xhv xhvVar7 = xhv.INSTANCE;
            }
            npp.Companion.f(ckf.p("tb_shop_header_farmer_endorsement_2024 init ", Integer.valueOf(shopComponentModel3.getRenderHeight())));
            i = kew.v(Integer.valueOf(shopComponentModel3.getRenderHeight()));
            v44 v44Var3 = this.H0;
            linearLayout.addView(v44Var3 == null ? null : v44Var3.d(), kew.n(0, i, 0, 0, 0, 0, 61, null));
            xhv xhvVar8 = xhv.INSTANCE;
        }
        ShopComponentModel shopComponentModel4 = map.get("tb_shop_header_honor_list_2023");
        if (shopComponentModel4 == null) {
            i2 = 0;
        } else {
            hnp hnpVar = new hnp(shopComponentModel4);
            BaseContentComponent.e0(this, hnpVar, null, 2, null);
            hnpVar.k(n(), J(), I(), null);
            i2 = kew.P(Integer.valueOf(shopComponentModel4.getRenderHeight()));
            npp.Companion.f(ckf.p("tb_shop_header_honor_list_2023 ", Integer.valueOf(i2)));
            linearLayout.addView(hnpVar.d(), kew.n(0, kew.Q(Integer.valueOf(shopComponentModel4.getRenderHeight())), 0, 0, 0, 0, 61, null));
            xhv xhvVar9 = xhv.INSTANCE;
        }
        ShopComponentModel shopComponentModel5 = map.get("tb_shop_header_tag_list_2023");
        if (shopComponentModel5 != null) {
            Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate = new Shop2023HeaderTagListTemplate(shopComponentModel5);
            this.x0 = shop2023HeaderTagListTemplate;
            BaseContentComponent.e0(this, shop2023HeaderTagListTemplate, null, 2, null);
            shop2023HeaderTagListTemplate.x(new FarmShop$initHeader$5$1(this, shop2023HeaderTagListTemplate));
            shop2023HeaderTagListTemplate.k(n(), J(), I(), null);
            int P2 = kew.P(Integer.valueOf(shopComponentModel5.getRenderHeight()));
            npp.Companion.f(ckf.p("tb_shop_header_tag_list_2023 ", Integer.valueOf(P2)));
            FrameLayout frameLayout8 = new FrameLayout(n());
            kew.a(frameLayout8, shop2023HeaderTagListTemplate.d());
            linearLayout.addView(frameLayout8, kew.n(-2, P2, 0, 0, 0, 0, 60, null));
            xhv xhvVar10 = xhv.INSTANCE;
            i5 = P2;
        }
        this.A0 = linearLayout;
        inp inpVar6 = this.B0;
        if (inpVar6 != null) {
            inpVar6.L(linearLayout);
        }
        FrameLayout frameLayout9 = this.T;
        if (frameLayout9 != null) {
            frameLayout9.addView(linearLayout, kew.j(0, 0, this.e0.a(), 0, 0, 0, 0, 123, null));
            this.g0.m(i + i2 + i5);
            this.d0.m(this.e0.a() + this.g0.a());
            this.d0.i(L());
            FrameLayout frameLayout10 = this.T;
            if (frameLayout10 != null) {
                kew.e(frameLayout10, this.d0.a());
                FrameLayout frameLayout11 = this.T;
                if (frameLayout11 != null) {
                    kew.d0(frameLayout11, this.d0.c());
                } else {
                    ckf.y("shopHeaderContainer");
                    throw null;
                }
            } else {
                ckf.y("shopHeaderContainer");
                throw null;
            }
        } else {
            ckf.y("shopHeaderContainer");
            throw null;
        }
    }

    public final void Q1(boolean z, int i, int i2) {
        View d;
        FrameLayout frameLayout;
        View U1;
        View d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("893b3eb4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
            return;
        }
        npp.Companion.b(ckf.p("changeToHomePage : lastTabFullScreen : ", Boolean.valueOf(z)));
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.u0;
        if (!(shop2023HeaderInfoTemplate == null || (d2 = shop2023HeaderInfoTemplate.d()) == null)) {
            kew.g0(d2);
        }
        FrameLayout frameLayout2 = this.L;
        if (frameLayout2 != null) {
            kew.g0(frameLayout2);
            FrameLayout frameLayout3 = this.L;
            if (frameLayout3 != null) {
                frameLayout3.setAlpha(1.0f);
                int W1 = W1();
                this.h0 = W1;
                inp inpVar = this.B0;
                if (inpVar != null) {
                    inpVar.J(W1);
                }
                if (this.b0) {
                    S0(true);
                    inp inpVar2 = this.B0;
                    if (inpVar2 != null) {
                        inpVar2.m(true);
                    }
                    this.b0 = false;
                    this.j0 = 0;
                    this.k0 = 0;
                    dop dopVar = this.f0;
                    dopVar.h(dopVar.e());
                    L1(this, 0.0f, 1, null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    FrameLayout frameLayout4 = this.Q;
                    if (frameLayout4 != null) {
                        float c2 = X1().c();
                        if (this.Q != null) {
                            animatorSet.playTogether(bdw.i(frameLayout4, c2 - kew.z(frameLayout), 0L, null, null, 14, null));
                            animatorSet.addListener(new p09(this));
                            animatorSet.start();
                            if (v()) {
                                Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate2 = this.u0;
                                if (shop2023HeaderInfoTemplate2 != null) {
                                    shop2023HeaderInfoTemplate2.M(Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED);
                                }
                            } else {
                                View U12 = U1();
                                if (U12 != null) {
                                    U12.setAlpha(1.0f);
                                }
                            }
                            if (!v() && (U1 = U1()) != null) {
                                U1.setAlpha(1.0f);
                            }
                        } else {
                            ckf.y("navViewContainer");
                            throw null;
                        }
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                } else {
                    if (!m2()) {
                        S0(false);
                        inp inpVar3 = this.B0;
                        if (inpVar3 != null) {
                            inpVar3.m(false);
                        }
                        int i3 = this.h0;
                        this.j0 = i3;
                        this.k0 = 0 - i3;
                        FrameLayout frameLayout5 = this.Q;
                        if (frameLayout5 != null) {
                            kew.d0(frameLayout5, this.e0.g() + L());
                            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate3 = this.u0;
                            if (shop2023HeaderInfoTemplate3 != null) {
                                shop2023HeaderInfoTemplate3.M(Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED);
                            }
                        } else {
                            ckf.y("navViewContainer");
                            throw null;
                        }
                    }
                    if (v() && spp.c(J().S(i, i2))) {
                        ShopExtKt.k0(J(), null, 2, null);
                    }
                }
                if (z) {
                    FrameLayout frameLayout6 = this.T;
                    if (frameLayout6 != null) {
                        frameLayout6.setZ(0.0f);
                        FrameLayout frameLayout7 = this.Q;
                        if (frameLayout7 != null) {
                            frameLayout7.setZ(0.1f);
                        } else {
                            ckf.y("navViewContainer");
                            throw null;
                        }
                    } else {
                        ckf.y("shopHeaderContainer");
                        throw null;
                    }
                }
                View U13 = U1();
                if (U13 != null) {
                    kew.g0(U13);
                }
                this.q0 = false;
                if (v()) {
                    View U14 = U1();
                    if (U14 != null) {
                        kew.C(U14);
                    }
                    v44 v44Var = this.H0;
                    if (!(v44Var == null || (d = v44Var.d()) == null)) {
                        kew.C(d);
                    }
                    if (r()) {
                        q2();
                        return;
                    }
                    return;
                }
                return;
            }
            ckf.y("newfarmerContainer");
            throw null;
        }
        ckf.y("newfarmerContainer");
        throw null;
    }
}
