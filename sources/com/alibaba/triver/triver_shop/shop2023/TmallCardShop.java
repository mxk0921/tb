package com.alibaba.triver.triver_shop.shop2023;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.res.Configuration;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.a5;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.view.MarginSupportFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionLinearLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionSizeFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout;
import com.alibaba.triver.triver_shop.newShop.view.adapter.ShopContainerPageAdapter;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.ShopHeaderComponent;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.alibaba.triver.triver_shop.shop2023.nativeview.CarShopTopNavBarNativeComponent;
import com.alibaba.triver.triver_shop.shop2023.template.TmallCarBottomBarTemplate;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Pair;
import tb.a07;
import tb.a1v;
import tb.aqp;
import tb.bdw;
import tb.brf;
import tb.ckf;
import tb.eqp;
import tb.jnp;
import tb.kew;
import tb.khu;
import tb.ltt;
import tb.mop;
import tb.npp;
import tb.r1k;
import tb.r54;
import tb.sk9;
import tb.spp;
import tb.t2o;
import tb.top;
import tb.xhv;
import tb.y1a;
import tb.ytc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class TmallCardShop extends Shop2023BaseComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final int defaultBottomBarBottomMargin = 0;
    public static final int defaultBottomBarSize = 121;
    public static final int defaultHeaderSize = 88;
    public EnhancedViewPager L;
    public View M;
    public ShopSwipeListenerLayout N;
    public ShopSwipeListenerLayout O;
    public ViewGroup P;
    public PerceptionSizeFrameLayout Q;
    public ViewGroup R;
    public PerceptionLinearLayout S;
    public View T;
    public ShopContainerPageAdapter U;
    public TUrlImageView V;
    public int X;
    public int Y;
    public int Z;
    public boolean b0;
    public boolean d0;
    public boolean e0;
    public EmbedShopLoftComponent h0;
    public CarShopTopNavBarNativeComponent l0;
    public int W = 88;
    public final boolean a0 = true;
    public boolean c0 = true;
    public boolean f0 = true;
    public final ShopHeaderComponent g0 = new ShopHeaderComponent(TmallCardShop$shopHeaderComponent$1.INSTANCE, new TmallCardShop$shopHeaderComponent$2(this));
    public final int i0 = kew.P(Integer.valueOf((int) mop.KEY_FLAG_SHIP_BIG_CARD_SIZE_RPX));
    public final TmallCarBottomBarTemplate j0 = new TmallCarBottomBarTemplate(new TmallCardShop$bottomBarComponent$1(this));
    public final top k0 = new top();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TmallCardShop f3297a;

        static {
            t2o.a(766510283);
        }

        public a(TmallCardShop tmallCardShop) {
            ckf.g(tmallCardShop, "this$0");
            this.f3297a = tmallCardShop;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/TmallCardShop$AnimatorListener");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            TmallCardShop.r1(this.f3297a, true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            TmallCardShop.r1(this.f3297a, false);
            this.f3297a.M();
            ShopSwipeListenerLayout n1 = TmallCardShop.n1(this.f3297a);
            if (n1 != null) {
                n1.forceInterceptAllTouchEvent(false);
            } else {
                ckf.y("outerSwiperLayout");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b {
        static {
            t2o.a(766510284);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public b() {
        }
    }

    static {
        t2o.a(766510282);
    }

    public TmallCardShop() {
        kew.P(Integer.valueOf((int) mop.KEY_FLAG_SHIP_H5_BIG_CARD_SIZE_RPX));
    }

    public static /* synthetic */ void U1(TmallCardShop tmallCardShop, int i, int i2, boolean z, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f86ec0", new Object[]{tmallCardShop, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3), obj});
            return;
        }
        if ((i3 & 4) != 0) {
            z = true;
        }
        tmallCardShop.T1(i, i2, z);
    }

    public static final /* synthetic */ void d1(TmallCardShop tmallCardShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb5dbdb", new Object[]{tmallCardShop});
        } else {
            tmallCardShop.e();
        }
    }

    public static final /* synthetic */ void e1(TmallCardShop tmallCardShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8450b5", new Object[]{tmallCardShop});
        } else {
            tmallCardShop.f();
        }
    }

    public static final /* synthetic */ ViewGroup f1(TmallCardShop tmallCardShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cb51e1ea", new Object[]{tmallCardShop});
        }
        return tmallCardShop.R;
    }

    public static final /* synthetic */ View g1(TmallCardShop tmallCardShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e053c2cb", new Object[]{tmallCardShop});
        }
        return tmallCardShop.T;
    }

    public static final /* synthetic */ CarShopTopNavBarNativeComponent h1(TmallCardShop tmallCardShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CarShopTopNavBarNativeComponent) ipChange.ipc$dispatch("291ffdfa", new Object[]{tmallCardShop});
        }
        return tmallCardShop.l0;
    }

    public static final /* synthetic */ EnhancedViewPager i1(TmallCardShop tmallCardShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnhancedViewPager) ipChange.ipc$dispatch("1dfe24f2", new Object[]{tmallCardShop});
        }
        return tmallCardShop.L;
    }

    public static /* synthetic */ Object ipc$super(TmallCardShop tmallCardShop, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2039436547:
                super.N((FragmentActivity) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2]);
                return null;
            case -1384276246:
                return new Boolean(super.c());
            case -1311450993:
                super.a0((View) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            case -1253755420:
                super.onSwipeDown();
                return null;
            case -460543790:
                return new Boolean(super.d());
            case -398834026:
                super.Z((View) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).intValue());
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
            case 1176808989:
                super.onSwipeUp();
                return null;
            case 1703005214:
                super.onPageScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            case 1857984310:
                super.V((Configuration) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/TmallCardShop");
        }
    }

    public static final /* synthetic */ int j1(TmallCardShop tmallCardShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c219268", new Object[]{tmallCardShop})).intValue();
        }
        return tmallCardShop.W;
    }

    public static final /* synthetic */ EmbedShopLoftComponent k1(TmallCardShop tmallCardShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmbedShopLoftComponent) ipChange.ipc$dispatch("98f37b2a", new Object[]{tmallCardShop});
        }
        return tmallCardShop.h0;
    }

    public static final /* synthetic */ TUrlImageView l1(TmallCardShop tmallCardShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("e125cb26", new Object[]{tmallCardShop});
        }
        return tmallCardShop.V;
    }

    public static final /* synthetic */ int m1(TmallCardShop tmallCardShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16f72ae2", new Object[]{tmallCardShop})).intValue();
        }
        return tmallCardShop.Y;
    }

    public static final /* synthetic */ ShopSwipeListenerLayout n1(TmallCardShop tmallCardShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopSwipeListenerLayout) ipChange.ipc$dispatch("5768083", new Object[]{tmallCardShop});
        }
        return tmallCardShop.N;
    }

    public static final /* synthetic */ ShopDataParser o1(TmallCardShop tmallCardShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("6ca9b61a", new Object[]{tmallCardShop});
        }
        return tmallCardShop.J();
    }

    public static final /* synthetic */ ShopHeaderComponent p1(TmallCardShop tmallCardShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopHeaderComponent) ipChange.ipc$dispatch("ed10948c", new Object[]{tmallCardShop});
        }
        return tmallCardShop.g0;
    }

    public static final /* synthetic */ void q1(TmallCardShop tmallCardShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942c5ca8", new Object[]{tmallCardShop});
        } else {
            tmallCardShop.W1();
        }
    }

    public static final /* synthetic */ void r1(TmallCardShop tmallCardShop, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2ee9bd2", new Object[]{tmallCardShop, new Boolean(z)});
        } else {
            tmallCardShop.i0(z);
        }
    }

    public static final /* synthetic */ void s1(TmallCardShop tmallCardShop, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c7e2b0", new Object[]{tmallCardShop, new Boolean(z)});
        } else {
            tmallCardShop.f0 = z;
        }
    }

    public static final /* synthetic */ void t1(TmallCardShop tmallCardShop, BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e4c4385", new Object[]{tmallCardShop, baseTemplateComponent, layoutParams});
        } else {
            tmallCardShop.Z1(baseTemplateComponent, layoutParams);
        }
    }

    public final void C1(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98c25ef", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (spp.c(J().S(i, i2))) {
            Q0(false);
            U0(false);
            if (!O()) {
                ShopExtKt.k0(J(), null, 2, null);
            } else if (!r() || !v()) {
                ShopExtKt.k0(J(), null, 2, null);
            }
        } else {
            this.d0 = false;
        }
    }

    public final void D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd220b9", new Object[]{this});
            return;
        }
        npp.Companion.b("continueInitSHopLoftBigCard");
        if (J().w1()) {
            ShopComponentModel g = new ShopDataParser.e(J()).g();
            if (g != null) {
                jnp jnpVar = new jnp(g, false, !J().a3(), 2, null);
                jnpVar.x(new TmallCardShop$continueInitShopLoftBigCard$1$1$1(this, jnpVar));
                jnpVar.k(n(), J(), I(), null);
                ViewGroup viewGroup = this.R;
                if (viewGroup != null) {
                    viewGroup.addView(jnpVar.d(), kew.j(0, kew.Q(Integer.valueOf(g.getRenderHeight())), 0, sk9.Companion.g(), 0, 0, 80, 53, null));
                } else {
                    ckf.y("bigCardContainer");
                    throw null;
                }
            }
        } else {
            this.k0.x(new TmallCardShop$continueInitShopLoftBigCard$2(this));
            this.k0.k(n(), J(), I(), null);
        }
    }

    public final void F1() {
        View x;
        EmbedShopLoftComponent embedShopLoftComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a945f4", new Object[]{this});
        } else if (!v() && !khu.e()) {
            r0(J().J1());
            if (v()) {
                u0(true);
                this.h0 = new EmbedShopLoftComponent(n(), J(), I());
                if (J().O0().q() && (embedShopLoftComponent = this.h0) != null) {
                    embedShopLoftComponent.J(new TmallCardShop$createShopLoftBigCard$1(this));
                }
                EmbedShopLoftComponent embedShopLoftComponent2 = this.h0;
                if (embedShopLoftComponent2 != null) {
                    embedShopLoftComponent2.J(new TmallCardShop$createShopLoftBigCard$2(this));
                }
                EmbedShopLoftComponent embedShopLoftComponent3 = this.h0;
                if (embedShopLoftComponent3 != null) {
                    embedShopLoftComponent3.F(k() / kew.x());
                }
                EmbedShopLoftComponent embedShopLoftComponent4 = this.h0;
                if (!(embedShopLoftComponent4 == null || (x = embedShopLoftComponent4.x()) == null)) {
                    ViewGroup viewGroup = this.R;
                    if (viewGroup != null) {
                        kew.a(viewGroup, x);
                    } else {
                        ckf.y("bigCardContainer");
                        throw null;
                    }
                }
                this.g0.K(true);
                EmbedShopLoftComponent embedShopLoftComponent5 = this.h0;
                if (embedShopLoftComponent5 != null && embedShopLoftComponent5.A()) {
                    y0(false);
                }
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public eqp G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eqp) ipChange.ipc$dispatch("6aaaf133", new Object[]{this});
        }
        return new eqp(0, 0);
    }

    public final int G1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3320c7e8", new Object[]{this})).intValue();
        }
        if (!O()) {
            return this.X + L();
        }
        if (v()) {
            return k() - sk9.Companion.g();
        }
        return 0;
    }

    public final int H1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8528e735", new Object[]{this})).intValue();
        }
        return k() - sk9.Companion.g();
    }

    public final int J1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83d8b4ae", new Object[]{this})).intValue();
        }
        ShopSwipeListenerLayout shopSwipeListenerLayout = this.O;
        if (shopSwipeListenerLayout != null) {
            return shopSwipeListenerLayout.getTop();
        }
        ckf.y("centerContainer");
        throw null;
    }

    public final int L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cd2bf9", new Object[]{this})).intValue();
        }
        int k = k();
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.Q;
        if (perceptionSizeFrameLayout != null) {
            return (k - perceptionSizeFrameLayout.getTop()) - sk9.Companion.g();
        }
        ckf.y("navViewContainer");
        throw null;
    }

    public final int M1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("958f5a72", new Object[]{this})).intValue();
        }
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.Q;
        if (perceptionSizeFrameLayout != null) {
            return (perceptionSizeFrameLayout.getTop() - L()) - this.X;
        }
        ckf.y("navViewContainer");
        throw null;
    }

    public final int N1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("242cf213", new Object[]{this})).intValue();
        }
        if (!O() || !v()) {
            return this.X + L();
        }
        return k() - sk9.Companion.g();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void Q0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8c47cb", new Object[]{this, new Boolean(z)});
            return;
        }
        this.g0.G(z);
        if (z) {
            ViewGroup viewGroup = this.P;
            if (viewGroup != null) {
                kew.C(viewGroup);
            } else {
                ckf.y("tabBarContainer");
                throw null;
            }
        } else {
            ViewGroup viewGroup2 = this.P;
            if (viewGroup2 != null) {
                kew.g0(viewGroup2);
            } else {
                ckf.y("tabBarContainer");
                throw null;
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46691468", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4c47713", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final boolean S1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("880b9960", new Object[]{this})).booleanValue();
        }
        if (!v() || !O()) {
            return false;
        }
        return true;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
        } else {
            super.T();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void T0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39a87a0", new Object[]{this, new Boolean(z)});
        } else {
            this.g0.H(z, ShopExtKt.t(J(), z));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        } else {
            super.U();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void U0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fb09c29", new Object[]{this, new Boolean(z)});
            return;
        }
        this.g0.J(z);
        if (z) {
            ViewGroup viewGroup = this.P;
            if (viewGroup != null) {
                kew.S(viewGroup, sk9.a.C1054a.INSTANCE.c());
            } else {
                ckf.y("tabBarContainer");
                throw null;
            }
        } else {
            ViewGroup viewGroup2 = this.P;
            if (viewGroup2 != null) {
                kew.S(viewGroup2, sk9.a.C1054a.INSTANCE.b());
            } else {
                ckf.y("tabBarContainer");
                throw null;
            }
        }
        this.j0.I(z);
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
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void V0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec1c35e6", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288626bd", new Object[]{this});
            return;
        }
        W1();
        a1v.c(J(), "Page_Shop_Live_FloatWindow_Click", null, null, 8, null);
    }

    public final void X1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f5ec47", new Object[]{this});
        } else if (!r()) {
            U1(this, L1(), H1(), false, 4, null);
            S0(true);
        }
    }

    public final void Y1() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6c966e", new Object[]{this});
            return;
        }
        U1(this, M1() * (-1), J1() * (-1), false, 4, null);
        S0(false);
        if (v()) {
            ShopDataParser J = J();
            EmbedShopLoftComponent embedShopLoftComponent = this.h0;
            if (embedShopLoftComponent == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(embedShopLoftComponent.u());
            }
            ShopExtKt.j0(J, bool);
        }
    }

    public final void Z1(BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9e8c2e", new Object[]{this, baseTemplateComponent, layoutParams});
        } else if (this.X == 0 || this.Z == 0) {
            if (baseTemplateComponent instanceof ShopHeaderComponent) {
                this.X = baseTemplateComponent.j().height;
                ShopHeaderComponent shopHeaderComponent = this.g0;
                d0(shopHeaderComponent, shopHeaderComponent.F());
            }
            if (baseTemplateComponent instanceof TmallCarBottomBarTemplate) {
                this.Z = baseTemplateComponent.j().height;
                TmallCarBottomBarTemplate tmallCarBottomBarTemplate = this.j0;
                d0(tmallCarBottomBarTemplate, tmallCarBottomBarTemplate.D());
            }
            if (this.X != 0 && this.Z != 0) {
                u1();
            }
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
        super.a0(view, motionEvent, i);
        ShopSwipeListenerLayout shopSwipeListenerLayout = this.N;
        if (shopSwipeListenerLayout == null) {
            ckf.y("outerSwiperLayout");
            throw null;
        } else if (!ckf.b(shopSwipeListenerLayout.isFirstHorizontalScroll(), Boolean.TRUE)) {
            if ((this.b0 && (!O() || !v())) || !this.a0 || !y() || j()) {
                return;
            }
            if (Q() || !S1()) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.Q;
                if (perceptionSizeFrameLayout != null) {
                    int z = kew.z(perceptionSizeFrameLayout) - i;
                    ViewGroup viewGroup = this.R;
                    if (viewGroup != null) {
                        int height = viewGroup.getHeight() - i;
                        ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.O;
                        if (shopSwipeListenerLayout2 != null) {
                            int z2 = kew.z(shopSwipeListenerLayout2) - i;
                            if (z <= N1()) {
                                z = N1();
                                height = k();
                            }
                            if (z2 <= G1()) {
                                z2 = G1();
                            }
                            ViewGroup viewGroup2 = this.R;
                            if (viewGroup2 != null) {
                                kew.e(viewGroup2, height);
                                PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.Q;
                                if (perceptionSizeFrameLayout2 != null) {
                                    kew.d0(perceptionSizeFrameLayout2, z);
                                    ShopSwipeListenerLayout shopSwipeListenerLayout3 = this.O;
                                    if (shopSwipeListenerLayout3 != null) {
                                        kew.d0(shopSwipeListenerLayout3, z2);
                                    } else {
                                        ckf.y("centerContainer");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("navViewContainer");
                                    throw null;
                                }
                            } else {
                                ckf.y("bigCardContainer");
                                throw null;
                            }
                        } else {
                            ckf.y("centerContainer");
                            throw null;
                        }
                    } else {
                        ckf.y("bigCardContainer");
                        throw null;
                    }
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4498028c", new Object[]{this});
        } else {
            r54.C(new TmallCardShop$onStatusBarStyleChanged$1(this));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad7d9eea", new Object[]{this})).booleanValue();
        }
        if (!B1()) {
            return false;
        }
        return super.c();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void c0(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcf8e1a", new Object[]{this, new Boolean(z), jSONObject});
        } else {
            r54.C(new TmallCardShop$onSubscribeStatusChanged$1(this, z, jSONObject));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e48ca8d2", new Object[]{this})).booleanValue();
        }
        if (!O() || !v()) {
            return false;
        }
        if (!this.b0 || (O() && v())) {
            return super.d();
        }
        return false;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ce96e15", new Object[]{this})).intValue();
        }
        if (J().O0().q()) {
            return J().O0().l().b();
        }
        return l(this.i0);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public ViewPager m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("8aa45209", new Object[]{this});
        }
        EnhancedViewPager enhancedViewPager = this.L;
        if (enhancedViewPager != null) {
            return enhancedViewPager;
        }
        ckf.y("contentViewPager");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else {
            super.onPageScrollStateChanged(i);
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
        V1();
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

    public final void v1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("439caa6a", new Object[]{this, new Boolean(z)});
            return;
        }
        ShopSwipeListenerLayout shopSwipeListenerLayout = this.O;
        if (shopSwipeListenerLayout != null) {
            kew.e0(shopSwipeListenerLayout, z, sk9.Companion.g());
        } else {
            ckf.y("centerContainer");
            throw null;
        }
    }

    public final void w1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e3150", new Object[]{this, new Boolean(z)});
            return;
        }
        if (O()) {
            ShopSwipeListenerLayout shopSwipeListenerLayout = this.O;
            if (shopSwipeListenerLayout != null) {
                kew.e(shopSwipeListenerLayout, (H().getHeight() + sk9.Companion.g()) - this.Z);
            } else {
                ckf.y("centerContainer");
                throw null;
            }
        } else if (z) {
            ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.O;
            if (shopSwipeListenerLayout2 != null) {
                kew.e(shopSwipeListenerLayout2, H().getHeight() + sk9.Companion.g());
            } else {
                ckf.y("centerContainer");
                throw null;
            }
        } else {
            ShopSwipeListenerLayout shopSwipeListenerLayout3 = this.O;
            if (shopSwipeListenerLayout3 != null) {
                kew.e(shopSwipeListenerLayout3, (((H().getHeight() - L()) - this.X) + sk9.Companion.g()) - this.Z);
            } else {
                ckf.y("centerContainer");
                throw null;
            }
        }
        ShopSwipeListenerLayout shopSwipeListenerLayout4 = this.O;
        if (shopSwipeListenerLayout4 != null) {
            shopSwipeListenerLayout4.setPadding(0, 0, 0, sk9.Companion.g());
        } else {
            ckf.y("centerContainer");
            throw null;
        }
    }

    public final void P1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f2897a", new Object[]{this});
            return;
        }
        CarShopTopNavBarNativeComponent carShopTopNavBarNativeComponent = new CarShopTopNavBarNativeComponent(n(), J());
        this.l0 = carShopTopNavBarNativeComponent;
        EnhancedViewPager enhancedViewPager = this.L;
        if (enhancedViewPager != null) {
            enhancedViewPager.addOnPageChangeListener(carShopTopNavBarNativeComponent);
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.Q;
            if (perceptionSizeFrameLayout != null) {
                carShopTopNavBarNativeComponent.j(perceptionSizeFrameLayout);
                carShopTopNavBarNativeComponent.v(new TmallCardShop$initTemplateComponent$1(this));
                int p = kew.p(Integer.valueOf(this.W));
                this.Y = p;
                PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.Q;
                if (perceptionSizeFrameLayout2 != null) {
                    kew.e(perceptionSizeFrameLayout2, p);
                    if (this.Y == 0) {
                        PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.Q;
                        if (perceptionSizeFrameLayout3 != null) {
                            kew.e(perceptionSizeFrameLayout3, 0);
                        } else {
                            ckf.y("navViewContainer");
                            throw null;
                        }
                    }
                    this.g0.x(new TmallCardShop$initTemplateComponent$2(this));
                    this.g0.k(n(), J(), I(), null);
                    PerceptionLinearLayout perceptionLinearLayout = this.S;
                    if (perceptionLinearLayout != null) {
                        perceptionLinearLayout.addView(this.g0.d());
                        this.j0.x(new TmallCardShop$initTemplateComponent$3(this));
                        this.j0.k(n(), J(), I(), null);
                        this.Z = kew.v(Integer.valueOf(this.j0.E()));
                        ViewGroup viewGroup = this.P;
                        if (viewGroup != null) {
                            viewGroup.addView(this.j0.d());
                            ViewGroup viewGroup2 = this.P;
                            if (viewGroup2 != null) {
                                viewGroup2.setElevation(kew.p(30));
                            } else {
                                ckf.y("tabBarContainer");
                                throw null;
                            }
                        } else {
                            ckf.y("tabBarContainer");
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
                ckf.y("navViewContainer");
                throw null;
            }
        } else {
            ckf.y("contentViewPager");
            throw null;
        }
    }

    public final void W1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37009f7d", new Object[]{this});
            return;
        }
        Pair<Integer, Integer> v1 = J().v1("live");
        if (v1 != null) {
            O0(v1.getFirst().intValue(), v1.getSecond().intValue(), "live");
            this.d0 = true;
            return;
        }
        npp.Companion.b("do not find live tab");
        EmbedShopLoftComponent embedShopLoftComponent = this.h0;
        if (embedShopLoftComponent != null) {
            embedShopLoftComponent.B();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54535e4", new Object[]{this});
            return;
        }
        super.onSwipeDown();
        if (d()) {
            if (!S1() || J().Q1(J().S(o(), J().i(p())))) {
                X1();
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4624ae1d", new Object[]{this});
            return;
        }
        super.onSwipeUp();
        if (d() && r()) {
            Y1();
        }
    }

    public final void A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b73dfc", new Object[]{this});
        } else if (this.b0) {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.Q;
            if (perceptionSizeFrameLayout != null) {
                kew.d0(perceptionSizeFrameLayout, N1());
                S0(true);
                ShopSwipeListenerLayout shopSwipeListenerLayout = this.O;
                if (shopSwipeListenerLayout != null) {
                    kew.d0(shopSwipeListenerLayout, 0);
                    this.g0.K(true);
                    return;
                }
                ckf.y("centerContainer");
                throw null;
            }
            ckf.y("navViewContainer");
            throw null;
        } else {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.Q;
            if (perceptionSizeFrameLayout2 != null) {
                kew.d0(perceptionSizeFrameLayout2, N1());
                S0(true);
                ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.O;
                if (shopSwipeListenerLayout2 != null) {
                    kew.d0(shopSwipeListenerLayout2, G1());
                    this.g0.L(false);
                    return;
                }
                ckf.y("centerContainer");
                throw null;
            }
            ckf.y("navViewContainer");
            throw null;
        }
    }

    public final boolean B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cca356c2", new Object[]{this})).booleanValue();
        }
        if (this.d0 && spp.c(J().R())) {
            this.d0 = false;
            O0(0, 0, J().S(0, 0));
            return false;
        } else if (!this.e0 || !spp.c(J().R())) {
            return true;
        } else {
            npp.Companion.f("goBack to all item");
            Pair<Integer, Integer> v1 = J().v1("allitems");
            if (v1 != null) {
                O0(v1.getFirst().intValue(), v1.getSecond().intValue(), "allitems");
            }
            return false;
        }
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
        if (shopDataParser.l2()) {
            this.W = 0;
        }
        fragmentActivity.getLifecycle().addObserver(C());
        super.N(fragmentActivity, shopDataParser, shopDXEngine);
        shopDataParser.R1();
        shopDataParser.x2(0);
        shopDataParser.w2(0);
        khu.a(fragmentActivity, true);
        Q1();
        shopDataParser.Y2(mop.KEY_INIT_SHOP_BASE_VIEW, Long.valueOf(lttVar.a()));
        lttVar.b();
        O1();
        ViewGroup viewGroup = this.R;
        if (viewGroup != null) {
            kew.e(viewGroup, k());
            P1();
            R1();
            shopDataParser.Y2(mop.KEY_INIT_SHOP_TEMPLATE_COMPONENT_COST, Long.valueOf(lttVar.a()));
            return;
        }
        ckf.y("bigCardContainer");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void O0(int i, int i2, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e0f8b4d", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        ckf.g(str, "targetTabName");
        if (aqp.Companion.A()) {
            Object E0 = J().E0(str);
            npp.Companion.f(ckf.p("FlagShipContentComponentV2 switchTabTo params ", E0));
            if (!(E0 instanceof String) || ((CharSequence) E0).length() <= 0) {
                z = false;
            } else {
                JSONObject k = brf.k((String) E0);
                z = ckf.b(k == null ? null : k.getString("enableGoBackToAllItems"), "true");
            }
            if (!z || !spp.c(str)) {
                this.e0 = false;
            } else {
                this.e0 = true;
            }
        }
        int j = J().j(i, i2);
        EnhancedViewPager enhancedViewPager = this.L;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCurrentItem(j, false);
        } else {
            ckf.y("contentViewPager");
            throw null;
        }
    }

    public final void O1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78705187", new Object[]{this});
            return;
        }
        String i1 = J().i1();
        if (J().O0().q()) {
            J().P2(true);
        }
        npp.Companion.b(ckf.p("shopSignType : ", i1));
        if (!ckf.b(i1, ytc.TYPE_FOLD)) {
            if (ckf.b(i1, "loft")) {
                F1();
            }
            F1();
            if (v()) {
                new FrameLayout.LayoutParams(-1, 0).gravity = 80;
            }
        }
    }

    public final void Q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        View K = kew.K(n(), R.layout.view_new_shop_view_tmall_car);
        if (K != null) {
            View findViewById = K.findViewById(R.id.new_shop_view_center_container);
            ((ShopSwipeListenerLayout) findViewById).setNormalMode(true);
            xhv xhvVar = xhv.INSTANCE;
            ckf.f(findViewById, "contentView.findViewById<ShopSwipeListenerLayout?>(R.id.new_shop_view_center_container)\n                .apply {\n                    this.normalMode = true\n                }");
            this.O = (ShopSwipeListenerLayout) findViewById;
            v1(true);
            View findViewById2 = K.findViewById(R.id.new_shop_view_status_bar_view);
            ckf.f(findViewById2, "contentView.findViewById(R.id.new_shop_view_status_bar_view)");
            this.M = findViewById2;
            View findViewById3 = K.findViewById(R.id.new_shop_view_tab_bar_container);
            ViewGroup viewGroup = (ViewGroup) findViewById3;
            ckf.f(viewGroup, "");
            kew.U(viewGroup, 0);
            kew.X(viewGroup, 0);
            kew.b0(viewGroup, 0);
            ckf.f(findViewById3, "contentView.findViewById<ViewGroup?>(R.id.new_shop_view_tab_bar_container).apply {\n            //汽车店不需要margin\n            setBottomMargin(0)\n            setLeftAndStartMargin(0)\n            setRightAndEndMargin(0)\n        }");
            this.P = (ViewGroup) findViewById3;
            View findViewById4 = K.findViewById(R.id.new_shop_view_big_card_view_container);
            ckf.f(findViewById4, "contentView.findViewById(R.id.new_shop_view_big_card_view_container)");
            this.R = (ViewGroup) findViewById4;
            View findViewById5 = K.findViewById(R.id.new_shop_view_nav_view_container);
            ((PerceptionSizeFrameLayout) findViewById5).setViewSizeChangedListener(this);
            ckf.f(findViewById5, "contentView.findViewById<PerceptionSizeFrameLayout?>(R.id.new_shop_view_nav_view_container)\n                .apply {\n                    viewSizeChangedListener = this@TmallCardShop\n                }");
            this.Q = (PerceptionSizeFrameLayout) findViewById5;
            View findViewById6 = K.findViewById(R.id.new_shop_view_header_view_container);
            ((PerceptionLinearLayout) findViewById6).setViewSizeChangedListener(this);
            ckf.f(findViewById6, "contentView.findViewById<PerceptionLinearLayout?>(R.id.new_shop_view_header_view_container)\n                .apply {\n                    viewSizeChangedListener = this@TmallCardShop\n                }");
            this.S = (PerceptionLinearLayout) findViewById6;
            View findViewById7 = K.findViewById(R.id.new_shop_view_backGround_img);
            TUrlImageView tUrlImageView = (TUrlImageView) findViewById7;
            String S0 = J().S0();
            if (S0 == null) {
                S0 = mop.DEFAULT_2022_BG_IMG_URL;
            }
            tUrlImageView.setImageUrl(S0);
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ckf.f(findViewById7, "contentView.findViewById<TUrlImageView?>(R.id.new_shop_view_backGround_img).apply {\n                this.imageUrl =\n                    shopData.getShopCommonAtmospherePicUrl() ?: ShopExt.DEFAULT_2022_BG_IMG_URL\n                this.scaleType = ImageView.ScaleType.CENTER_CROP\n            }");
            TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById7;
            View findViewById8 = K.findViewById(R.id.new_shop_view_black_shadow_bg);
            ckf.f(findViewById8, "contentView.findViewById(R.id.new_shop_view_black_shadow_bg)");
            this.T = findViewById8;
            new View(n());
            View findViewById9 = K.findViewById(R.id.new_shop_view_loft_atmosphere_bg);
            TUrlImageView tUrlImageView3 = (TUrlImageView) findViewById9;
            String x0 = J().x0();
            if (x0 != null) {
                tUrlImageView3.setImageUrl(x0);
            }
            ckf.f(findViewById9, "contentView.findViewById<TUrlImageView?>(R.id.new_shop_view_loft_atmosphere_bg).apply {\n                shopData.getLoftAtmospherePicUrl()?.isNotEmpty {\n                    this.imageUrl = it\n                }\n            }");
            this.V = (TUrlImageView) findViewById9;
            View findViewById10 = K.findViewById(R.id.new_shop_view_tab3_container);
            ckf.f(findViewById10, "contentView.findViewById(R.id.new_shop_view_tab3_container)");
            MarginSupportFrameLayout marginSupportFrameLayout = (MarginSupportFrameLayout) findViewById10;
            EnhancedViewPager enhancedViewPager = new EnhancedViewPager(n());
            enhancedViewPager.setId(R.id.new_shop_view_view_pager);
            r1k r1kVar = new r1k(J());
            npp.Companion.b(ckf.p("hasFullScreenPage : ", Boolean.valueOf(r1kVar.c())));
            this.L = enhancedViewPager;
            enhancedViewPager.setOffscreenPageLimit(r1kVar.getCount() - 1);
            FragmentManager supportFragmentManager = n().getSupportFragmentManager();
            ckf.f(supportFragmentManager, "context.supportFragmentManager");
            ShopContainerPageAdapter shopContainerPageAdapter = new ShopContainerPageAdapter(supportFragmentManager);
            this.U = shopContainerPageAdapter;
            shopContainerPageAdapter.k(r1kVar);
            ShopContainerPageAdapter shopContainerPageAdapter2 = this.U;
            if (shopContainerPageAdapter2 != null) {
                enhancedViewPager.setAdapter(shopContainerPageAdapter2);
                enhancedViewPager.addOnPageChangeListener(this);
                ShopSwipeListenerLayout shopSwipeListenerLayout = this.O;
                if (shopSwipeListenerLayout != null) {
                    kew.a(shopSwipeListenerLayout, enhancedViewPager);
                    ShopSwipeListenerLayout shopSwipeListenerLayout2 = new ShopSwipeListenerLayout(n());
                    this.N = shopSwipeListenerLayout2;
                    shopSwipeListenerLayout2.setSwipeListener(this);
                    kew.a(shopSwipeListenerLayout2, K);
                    shopSwipeListenerLayout2.setInCenterContainerFlag(Boolean.FALSE);
                    shopSwipeListenerLayout2.setScrollThreshold(85);
                    kew.a(H(), shopSwipeListenerLayout2);
                    View view = this.M;
                    if (view != null) {
                        kew.e(view, L());
                        ViewGroup viewGroup2 = this.R;
                        if (viewGroup2 != null) {
                            kew.e(viewGroup2, k());
                        } else {
                            ckf.y("bigCardContainer");
                            throw null;
                        }
                    } else {
                        ckf.y(a5.f2660a);
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
        }
    }

    public final void R1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad10f563", new Object[]{this});
            return;
        }
        View view = this.T;
        if (view != null) {
            kew.e(view, kew.v(600));
            View view2 = this.T;
            if (view2 != null) {
                sk9.a.C1054a aVar = sk9.a.C1054a.INSTANCE;
                kew.S(view2, aVar.a());
                View view3 = this.T;
                if (view3 != null) {
                    kew.g0(view3);
                    if (v()) {
                        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.Q;
                        if (perceptionSizeFrameLayout != null) {
                            kew.S(perceptionSizeFrameLayout, sk9.Companion.j());
                            if (!P()) {
                                TUrlImageView tUrlImageView = this.V;
                                if (tUrlImageView != null) {
                                    kew.B(tUrlImageView);
                                } else {
                                    ckf.y("loftAtmosphereBgPic");
                                    throw null;
                                }
                            }
                        } else {
                            ckf.y("navViewContainer");
                            throw null;
                        }
                    } else {
                        PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.Q;
                        if (perceptionSizeFrameLayout2 != null) {
                            kew.S(perceptionSizeFrameLayout2, sk9.Companion.j());
                            View view4 = this.M;
                            if (view4 != null) {
                                kew.T(view4);
                                PerceptionLinearLayout perceptionLinearLayout = this.S;
                                if (perceptionLinearLayout != null) {
                                    kew.T(perceptionLinearLayout);
                                    TUrlImageView tUrlImageView2 = this.V;
                                    if (tUrlImageView2 != null) {
                                        kew.B(tUrlImageView2);
                                    } else {
                                        ckf.y("loftAtmosphereBgPic");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("shopHeaderContainer");
                                    throw null;
                                }
                            } else {
                                ckf.y(a5.f2660a);
                                throw null;
                            }
                        } else {
                            ckf.y("navViewContainer");
                            throw null;
                        }
                    }
                    ViewGroup viewGroup = this.P;
                    if (viewGroup != null) {
                        kew.S(viewGroup, aVar.b());
                        if (J().d0() == 0) {
                            if (v()) {
                                ShopSwipeListenerLayout shopSwipeListenerLayout = this.O;
                                if (shopSwipeListenerLayout != null) {
                                    kew.d0(shopSwipeListenerLayout, G1());
                                    PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.Q;
                                    if (perceptionSizeFrameLayout3 != null) {
                                        kew.d0(perceptionSizeFrameLayout3, N1());
                                    } else {
                                        ckf.y("navViewContainer");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("centerContainer");
                                    throw null;
                                }
                            } else {
                                ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.O;
                                if (shopSwipeListenerLayout2 != null) {
                                    kew.d0(shopSwipeListenerLayout2, 0);
                                    PerceptionSizeFrameLayout perceptionSizeFrameLayout4 = this.Q;
                                    if (perceptionSizeFrameLayout4 != null) {
                                        kew.d0(perceptionSizeFrameLayout4, N1());
                                    } else {
                                        ckf.y("navViewContainer");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("centerContainer");
                                    throw null;
                                }
                            }
                        }
                        w1(J().P1(J().d0(), J().f0()));
                        if (J().d0() == 0) {
                            this.c0 = true;
                            return;
                        }
                        return;
                    }
                    ckf.y("tabBarContainer");
                    throw null;
                }
                ckf.y("bigCardTopBlackShadowBg");
                throw null;
            }
            ckf.y("bigCardTopBlackShadowBg");
            throw null;
        }
        ckf.y("bigCardTopBlackShadowBg");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void S0(boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a50f479", new Object[]{this, new Boolean(z)});
            return;
        }
        npp.Companion.b(ckf.p("update expanded : ", Boolean.valueOf(z)));
        super.S0(z);
        b0();
        if (O()) {
            this.g0.K(true);
            if (!z) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.Q;
                if (perceptionSizeFrameLayout != null) {
                    kew.S(perceptionSizeFrameLayout, sk9.Companion.j());
                    r54.F(new TmallCardShop$updateExpandedStatus$2(this));
                    r54.G(new TmallCardShop$updateExpandedStatus$3(this));
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            } else if (v()) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.Q;
                if (perceptionSizeFrameLayout2 != null) {
                    kew.S(perceptionSizeFrameLayout2, sk9.Companion.j());
                    r54.F(new TmallCardShop$updateExpandedStatus$1(this));
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            } else {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.Q;
                if (perceptionSizeFrameLayout3 != null) {
                    kew.S(perceptionSizeFrameLayout3, sk9.Companion.j());
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            }
        } else {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout4 = this.Q;
            if (perceptionSizeFrameLayout4 != null) {
                kew.S(perceptionSizeFrameLayout4, sk9.Companion.j());
                if (spp.c(J().R())) {
                    this.g0.K(true);
                } else {
                    this.g0.L(false);
                }
                TUrlImageView tUrlImageView = this.V;
                if (tUrlImageView != null) {
                    kew.B(tUrlImageView);
                } else {
                    ckf.y("loftAtmosphereBgPic");
                    throw null;
                }
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        }
        if (O() && v() && z) {
            z2 = true;
        }
        v1(z2);
        if (this.b0) {
            this.g0.K(true);
        }
    }

    public void V1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d8ba32", new Object[]{this});
            return;
        }
        j0(true);
        if (this.a0 && Q()) {
            ViewGroup viewGroup = this.R;
            if (viewGroup != null) {
                kew.e(viewGroup, k());
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.Q;
                if (perceptionSizeFrameLayout != null) {
                    kew.d0(perceptionSizeFrameLayout, N1());
                    ShopSwipeListenerLayout shopSwipeListenerLayout = this.O;
                    if (shopSwipeListenerLayout != null) {
                        kew.d0(shopSwipeListenerLayout, G1());
                        D0(false);
                        return;
                    }
                    ckf.y("centerContainer");
                    throw null;
                }
                ckf.y("navViewContainer");
                throw null;
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
        super.Z(view, motionEvent, i);
        ShopSwipeListenerLayout shopSwipeListenerLayout = this.N;
        if (shopSwipeListenerLayout == null) {
            ckf.y("outerSwiperLayout");
            throw null;
        } else if (!ckf.b(shopSwipeListenerLayout.isFirstHorizontalScroll(), Boolean.TRUE)) {
            if ((!this.b0 || (O() && v())) && this.f0 && this.a0 && !j() && r() && J().Q1(J().R())) {
                j0(false);
                if (S1()) {
                    D0(true);
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.Q;
                    if (perceptionSizeFrameLayout == null) {
                        ckf.y("navViewContainer");
                        throw null;
                    } else if ((kew.z(perceptionSizeFrameLayout) + i) - N1() >= 350) {
                        if (J().w1()) {
                            V1();
                            W1();
                            ShopExtKt.l(J());
                        } else {
                            EmbedShopLoftComponent embedShopLoftComponent = this.h0;
                            if (embedShopLoftComponent != null) {
                                embedShopLoftComponent.B();
                            }
                            V1();
                        }
                        this.f0 = false;
                        r54.E(new TmallCardShop$onParentSwipeDown$1(this), 500L);
                    } else {
                        ViewGroup viewGroup = this.R;
                        if (viewGroup == null) {
                            ckf.y("bigCardContainer");
                            throw null;
                        } else if (viewGroup != null) {
                            kew.e(viewGroup, viewGroup.getHeight() + i);
                            PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.Q;
                            if (perceptionSizeFrameLayout2 == null) {
                                ckf.y("navViewContainer");
                                throw null;
                            } else if (perceptionSizeFrameLayout2 != null) {
                                kew.d0(perceptionSizeFrameLayout2, kew.z(perceptionSizeFrameLayout2) + i);
                                ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.O;
                                if (shopSwipeListenerLayout2 == null) {
                                    ckf.y("centerContainer");
                                    throw null;
                                } else if (shopSwipeListenerLayout2 != null) {
                                    kew.d0(shopSwipeListenerLayout2, kew.z(shopSwipeListenerLayout2) + i);
                                } else {
                                    ckf.y("centerContainer");
                                    throw null;
                                }
                            } else {
                                ckf.y("navViewContainer");
                                throw null;
                            }
                        } else {
                            ckf.y("bigCardContainer");
                            throw null;
                        }
                    }
                }
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, tb.zfw
    public void a(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bf4b1c", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        ckf.g(view, "view");
        npp.Companion.b(ckf.p("flag ship , size changed , newHeight = ", Integer.valueOf(i2)));
        if (this.b0) {
            w1(true);
        } else {
            w1(false);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        super.onPageSelected(i);
        if (i != p()) {
            ShopContainerPageAdapter shopContainerPageAdapter = this.U;
            if (shopContainerPageAdapter != null) {
                shopContainerPageAdapter.j(p());
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
            J().i(p());
            int o = o();
            int k = J().k(p());
            int i3 = J().i(i);
            J().W2(i3, k);
            npp.a aVar = npp.Companion;
            aVar.b("flag ship , on page selected , newTab = " + k + ", newSub = " + i3 + " , oldTab = " + o + ", position : " + i);
            this.b0 = J().P1(J().C(), J().p1());
            if (O() || !this.b0) {
                z = true;
            }
            v1(z);
            boolean r = r();
            l0(k);
            o();
            this.g0.I(true);
            this.j0.H(o());
            if (o == 0 && k != 0) {
                x1();
            }
            if (o != 0 && k == 0) {
                y1(o, i2);
            }
            if (!(o == 0 || k == 0)) {
                A1();
            }
            if (k != 0) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.Q;
                if (perceptionSizeFrameLayout != null) {
                    kew.C(perceptionSizeFrameLayout);
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            } else {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.Q;
                if (perceptionSizeFrameLayout2 != null) {
                    kew.g0(perceptionSizeFrameLayout2);
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            }
            w1(this.b0);
            y1a<Integer, Integer, Integer, Integer, xhv> F = F();
            if (F != null) {
                F.invoke(Integer.valueOf(k), Integer.valueOf(i3), Integer.valueOf(o), Integer.valueOf(i2));
            }
            b0();
            C1(o, i2, r);
            return;
        }
        ckf.y("shopContainerPageAdapter");
        throw null;
    }

    public void u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d0cb3b", new Object[]{this});
            return;
        }
        J().C2(L() + this.X);
        ShopDataParser J = J();
        int i = this.Z;
        ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            J.B2(i + kew.O(Integer.valueOf(kew.r(viewGroup))));
            if (!v() || s() != 0) {
                N1();
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.Q;
                if (perceptionSizeFrameLayout != null) {
                    kew.d0(perceptionSizeFrameLayout, N1());
                    ShopSwipeListenerLayout shopSwipeListenerLayout = this.O;
                    if (shopSwipeListenerLayout != null) {
                        kew.d0(shopSwipeListenerLayout, G1());
                    } else {
                        ckf.y("centerContainer");
                        throw null;
                    }
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            } else {
                int N1 = N1();
                PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.Q;
                if (perceptionSizeFrameLayout2 != null) {
                    kew.d0(perceptionSizeFrameLayout2, N1);
                    ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.O;
                    if (shopSwipeListenerLayout2 != null) {
                        kew.d0(shopSwipeListenerLayout2, G1());
                        int g = sk9.Companion.g();
                        EmbedShopLoftComponent embedShopLoftComponent = this.h0;
                        if (embedShopLoftComponent != null) {
                            embedShopLoftComponent.G(g);
                        }
                    } else {
                        ckf.y("centerContainer");
                        throw null;
                    }
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            }
            if (v() && y()) {
                D1();
            }
            if (u() == 0) {
                ShopContainerPageAdapter shopContainerPageAdapter = this.U;
                if (shopContainerPageAdapter != null) {
                    shopContainerPageAdapter.i(u());
                } else {
                    ckf.y("shopContainerPageAdapter");
                    throw null;
                }
            }
            if (s() == 0) {
                this.g0.K(true);
            } else {
                this.g0.L(false);
            }
            if (u() == 0) {
                onPageSelected(u());
                return;
            }
            if (J().d0() == 0 && J().P1(J().d0(), J().f0())) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.Q;
                if (perceptionSizeFrameLayout3 != null) {
                    kew.d0(perceptionSizeFrameLayout3, this.X + L());
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            }
            EnhancedViewPager enhancedViewPager = this.L;
            if (enhancedViewPager != null) {
                enhancedViewPager.setCurrentItem(u(), false);
            } else {
                ckf.y("contentViewPager");
                throw null;
            }
        } else {
            ckf.y("tabBarContainer");
            throw null;
        }
    }

    public final void x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc51c7c", new Object[]{this});
            return;
        }
        npp.Companion.b(ckf.p("changeFirstTabToOtherTab, current expanded : ", Boolean.valueOf(r())));
        if (this.b0) {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.Q;
            if (perceptionSizeFrameLayout != null) {
                kew.d0(perceptionSizeFrameLayout, N1());
                S0(true);
                ShopSwipeListenerLayout shopSwipeListenerLayout = this.O;
                if (shopSwipeListenerLayout != null) {
                    kew.d0(shopSwipeListenerLayout, 0);
                    this.g0.K(true);
                } else {
                    ckf.y("centerContainer");
                    throw null;
                }
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        } else {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.Q;
            if (perceptionSizeFrameLayout2 != null) {
                kew.d0(perceptionSizeFrameLayout2, N1());
                S0(true);
                ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.O;
                if (shopSwipeListenerLayout2 != null) {
                    kew.d0(shopSwipeListenerLayout2, G1());
                    this.g0.L(false);
                } else {
                    ckf.y("centerContainer");
                    throw null;
                }
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        }
        r54.F(new TmallCardShop$changeFirstTabToOtherTab$1(this));
    }

    public final void y1(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5eb45dc", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        npp.Companion.b(ckf.p("changeOtherTabToFistTab, current expanded : ", Boolean.valueOf(r())));
        if (!v()) {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.Q;
            if (perceptionSizeFrameLayout != null) {
                kew.d0(perceptionSizeFrameLayout, N1());
                ShopSwipeListenerLayout shopSwipeListenerLayout = this.O;
                if (shopSwipeListenerLayout != null) {
                    kew.d0(shopSwipeListenerLayout, G1());
                    S0(false);
                } else {
                    ckf.y("centerContainer");
                    throw null;
                }
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        } else if (this.c0) {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.Q;
            if (perceptionSizeFrameLayout2 != null) {
                kew.d0(perceptionSizeFrameLayout2, L() + this.X);
                ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.O;
                if (shopSwipeListenerLayout2 != null) {
                    kew.d0(shopSwipeListenerLayout2, 0);
                    S0(false);
                } else {
                    ckf.y("centerContainer");
                    throw null;
                }
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        } else {
            this.c0 = true;
            PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.Q;
            if (perceptionSizeFrameLayout3 != null) {
                kew.d0(perceptionSizeFrameLayout3, N1());
                ShopSwipeListenerLayout shopSwipeListenerLayout3 = this.O;
                if (shopSwipeListenerLayout3 != null) {
                    kew.d0(shopSwipeListenerLayout3, G1());
                    S0(true);
                } else {
                    ckf.y("centerContainer");
                    throw null;
                }
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        }
        View view = this.T;
        if (view != null) {
            kew.g0(view);
        } else {
            ckf.y("bigCardTopBlackShadowBg");
            throw null;
        }
    }

    public final void T1(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9607fc81", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (this.b0) {
            npp.Companion.b("current page full screen ， stop animation");
        } else {
            if (z) {
                Y(i);
            }
            if (O() && v() && !this.b0) {
                ShopSwipeListenerLayout shopSwipeListenerLayout = this.N;
                if (shopSwipeListenerLayout != null) {
                    shopSwipeListenerLayout.forceInterceptAllTouchEvent(true);
                } else {
                    ckf.y("outerSwiperLayout");
                    throw null;
                }
            }
            npp.a aVar = npp.Companion;
            aVar.b("moveNavView : " + i + " , moveCenter : " + i2);
            AnimatorSet animatorSet = new AnimatorSet();
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.Q;
            if (perceptionSizeFrameLayout != null) {
                Animator j = bdw.j(perceptionSizeFrameLayout, i, 0L, null, 6, null);
                ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.O;
                if (shopSwipeListenerLayout2 != null) {
                    animatorSet.playTogether(j, bdw.j(shopSwipeListenerLayout2, i2, 0L, null, 6, null));
                    animatorSet.addListener(new a(this));
                    animatorSet.start();
                    return;
                }
                ckf.y("centerContainer");
                throw null;
            }
            ckf.y("navViewContainer");
            throw null;
        }
    }
}
