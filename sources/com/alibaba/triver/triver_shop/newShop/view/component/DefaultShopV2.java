package com.alibaba.triver.triver_shop.newShop.view.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.a5;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.ext.ShopUTExposeEventKt;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionLinearLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionSizeFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout;
import com.alibaba.triver.triver_shop.newShop.view.adapter.ShopContainerPageAdapter;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BottomBarComponent;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.ShopHeaderComponent;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Result;
import tb.aqp;
import tb.bdw;
import tb.ckf;
import tb.cyo;
import tb.kew;
import tb.khu;
import tb.kwj;
import tb.mop;
import tb.npp;
import tb.pop;
import tb.q87;
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
public final class DefaultShopV2 extends BaseContentComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public EnhancedViewPager J;
    public ShopSwipeListenerLayout K;
    public View L;
    public ShopSwipeListenerLayout M;
    public ViewGroup N;
    public PerceptionSizeFrameLayout O;
    public ViewGroup P;
    public PerceptionLinearLayout Q;
    public View R;
    public View S;
    public ShopContainerPageAdapter T;
    public View U;
    public TUrlImageView V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public boolean b0;
    public kwj d0;
    public EmbedShopLoftComponent f0;
    public q87 l0;
    public boolean c0 = true;
    public final ShopHeaderComponent e0 = new ShopHeaderComponent(new DefaultShopV2$shopHeaderComponent$1(this), null);
    public final int g0 = kew.P(Integer.valueOf((int) mop.KEY_FLAG_SHIP_BIG_CARD_SIZE_RPX));
    public final int h0 = kew.P(750);
    public final BottomBarComponent i0 = new BottomBarComponent(new DefaultShopV2$bottomBarComponent$1(this), null, 2, null);
    public final pop j0 = new pop();
    public final top k0 = new top();
    public final cyo m0 = new cyo(0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DefaultShopV2 f3182a;

        static {
            t2o.a(766509829);
        }

        public a(DefaultShopV2 defaultShopV2) {
            ckf.g(defaultShopV2, "this$0");
            this.f3182a = defaultShopV2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/DefaultShopV2$AnimatorListener");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            this.f3182a.i0(false);
            View a1 = DefaultShopV2.a1(this.f3182a);
            if (a1 != null) {
                kew.C(a1);
                this.f3182a.M();
                ShopSwipeListenerLayout f1 = DefaultShopV2.f1(this.f3182a);
                if (f1 != null) {
                    f1.forceInterceptAllTouchEvent(false);
                } else {
                    ckf.y("outerSwiperLayout");
                    throw null;
                }
            } else {
                ckf.y("centerContainerWhiteFrame");
                throw null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            this.f3182a.i0(true);
            View a1 = DefaultShopV2.a1(this.f3182a);
            if (a1 != null) {
                kew.g0(a1);
                ShopSwipeListenerLayout f1 = DefaultShopV2.f1(this.f3182a);
                if (f1 != null) {
                    f1.forceInterceptAllTouchEvent(true);
                } else {
                    ckf.y("outerSwiperLayout");
                    throw null;
                }
            } else {
                ckf.y("centerContainerWhiteFrame");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3183a;
        public final /* synthetic */ DefaultShopV2 b;

        public b(int i, DefaultShopV2 defaultShopV2) {
            this.f3183a = i;
            this.b = defaultShopV2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                if (this.f3183a > 0) {
                    DefaultShopV2.g1(this.b).d(-((int) floatValue));
                } else {
                    DefaultShopV2.g1(this.b).d(this.f3183a - ((int) floatValue));
                }
                DefaultShopV2.g1(this.b).b();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    static {
        t2o.a(766509828);
    }

    public DefaultShopV2() {
        kew.P(Integer.valueOf((int) mop.KEY_FLAG_SHIP_SUPER_BIG_CARD_SIZE_RPX));
    }

    public static /* synthetic */ void G1(DefaultShopV2 defaultShopV2, int i, boolean z, boolean z2, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f32ee795", new Object[]{defaultShopV2, new Integer(i), new Boolean(z), new Boolean(z2), new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        defaultShopV2.F1(i, z, z2);
    }

    public static final /* synthetic */ boolean W0(DefaultShopV2 defaultShopV2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ec9219b", new Object[]{defaultShopV2, new Boolean(z)})).booleanValue();
        }
        return defaultShopV2.q1(z);
    }

    public static final /* synthetic */ ViewGroup X0(DefaultShopV2 defaultShopV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("71db5d66", new Object[]{defaultShopV2});
        }
        return defaultShopV2.P;
    }

    public static final /* synthetic */ View Y0(DefaultShopV2 defaultShopV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f73f154f", new Object[]{defaultShopV2});
        }
        return defaultShopV2.R;
    }

    public static final /* synthetic */ kwj Z0(DefaultShopV2 defaultShopV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kwj) ipChange.ipc$dispatch("2fac08e0", new Object[]{defaultShopV2});
        }
        return defaultShopV2.d0;
    }

    public static final /* synthetic */ View a1(DefaultShopV2 defaultShopV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1e10257e", new Object[]{defaultShopV2});
        }
        return defaultShopV2.U;
    }

    public static final /* synthetic */ EnhancedViewPager b1(DefaultShopV2 defaultShopV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnhancedViewPager) ipChange.ipc$dispatch("a5880c6e", new Object[]{defaultShopV2});
        }
        return defaultShopV2.J;
    }

    public static final /* synthetic */ EmbedShopLoftComponent c1(DefaultShopV2 defaultShopV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmbedShopLoftComponent) ipChange.ipc$dispatch("799dfaa6", new Object[]{defaultShopV2});
        }
        return defaultShopV2.f0;
    }

    public static final /* synthetic */ TUrlImageView d1(DefaultShopV2 defaultShopV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("f562dbe2", new Object[]{defaultShopV2});
        }
        return defaultShopV2.V;
    }

    public static final /* synthetic */ int e1(DefaultShopV2 defaultShopV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f9e9be6", new Object[]{defaultShopV2})).intValue();
        }
        return defaultShopV2.X;
    }

    public static final /* synthetic */ ShopSwipeListenerLayout f1(DefaultShopV2 defaultShopV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopSwipeListenerLayout) ipChange.ipc$dispatch("fed2fe87", new Object[]{defaultShopV2});
        }
        return defaultShopV2.K;
    }

    public static final /* synthetic */ cyo g1(DefaultShopV2 defaultShopV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cyo) ipChange.ipc$dispatch("60191a0c", new Object[]{defaultShopV2});
        }
        return defaultShopV2.m0;
    }

    public static final /* synthetic */ ShopHeaderComponent h1(DefaultShopV2 defaultShopV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopHeaderComponent) ipChange.ipc$dispatch("1e4f3d50", new Object[]{defaultShopV2});
        }
        return defaultShopV2.e0;
    }

    public static final /* synthetic */ void i1(DefaultShopV2 defaultShopV2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e101aec", new Object[]{defaultShopV2, new Boolean(z)});
        } else {
            defaultShopV2.c0 = z;
        }
    }

    public static /* synthetic */ Object ipc$super(DefaultShopV2 defaultShopV2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2039436547:
                super.N((FragmentActivity) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2]);
                return null;
            case -1311450993:
                super.a0((View) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            case -1253755420:
                super.onSwipeDown();
                return null;
            case -398834026:
                super.Z((View) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            case 407727923:
                super.onPageSelected(((Number) objArr[0]).intValue());
                return null;
            case 709948537:
                super.S0(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1176808989:
                super.onSwipeUp();
                return null;
            case 1703005214:
                super.onPageScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/DefaultShopV2");
        }
    }

    public static final /* synthetic */ void j1(DefaultShopV2 defaultShopV2, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c17172f1", new Object[]{defaultShopV2, new Integer(i), new Boolean(z)});
        } else {
            defaultShopV2.N1(i, z);
        }
    }

    public static final /* synthetic */ void k1(DefaultShopV2 defaultShopV2, BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8711d449", new Object[]{defaultShopV2, baseTemplateComponent, layoutParams});
        } else {
            defaultShopV2.O1(baseTemplateComponent, layoutParams);
        }
    }

    public final void B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f2897a", new Object[]{this});
            return;
        }
        kwj kwjVar = new kwj(n(), J(), v(), new DefaultShopV2$initTemplateComponent$1(this));
        this.d0 = kwjVar;
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
        if (perceptionSizeFrameLayout != null) {
            perceptionSizeFrameLayout.addView(kwjVar.a());
            this.X = kew.p(45);
            this.i0.x(new DefaultShopV2$initTemplateComponent$2(this));
            this.i0.k(n(), J(), I(), null);
            ViewGroup viewGroup = this.N;
            if (viewGroup != null) {
                viewGroup.addView(this.i0.d());
                this.e0.x(new DefaultShopV2$initTemplateComponent$3(this));
                this.e0.k(n(), J(), I(), null);
                PerceptionLinearLayout perceptionLinearLayout = this.Q;
                if (perceptionLinearLayout != null) {
                    perceptionLinearLayout.addView(this.e0.d());
                    if (w()) {
                        this.j0.x(new DefaultShopV2$initTemplateComponent$4(this));
                        this.j0.k(n(), J(), I(), null);
                    }
                    View d = this.e0.d();
                    kwj kwjVar2 = this.d0;
                    if (kwjVar2 != null) {
                        q87 q87Var = new q87(d, kwjVar2.a(), this.i0.d());
                        this.l0 = q87Var;
                        ShopSwipeListenerLayout shopSwipeListenerLayout = this.M;
                        if (shopSwipeListenerLayout != null) {
                            q87Var.k(shopSwipeListenerLayout);
                            q87 q87Var2 = this.l0;
                            if (q87Var2 != null) {
                                q87Var2.c(H());
                                return;
                            }
                            return;
                        }
                        ckf.y("centerContainer");
                        throw null;
                    }
                    ckf.y("bottomBarAndIndexNavManager");
                    throw null;
                }
                ckf.y("shopHeaderContainer");
                throw null;
            }
            ckf.y("tabBarContainer");
            throw null;
        }
        ckf.y("navViewContainer");
        throw null;
    }

    public final void D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad10f563", new Object[]{this});
            return;
        }
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
        if (perceptionSizeFrameLayout != null) {
            sk9.a aVar = sk9.Companion;
            kew.S(perceptionSizeFrameLayout, aVar.i());
            if (!v()) {
                View view = this.L;
                if (view != null) {
                    kew.T(view);
                    PerceptionLinearLayout perceptionLinearLayout = this.Q;
                    if (perceptionLinearLayout != null) {
                        kew.T(perceptionLinearLayout);
                    } else {
                        ckf.y("shopHeaderContainer");
                        throw null;
                    }
                } else {
                    ckf.y(a5.f2660a);
                    throw null;
                }
            }
            ViewGroup viewGroup = this.N;
            if (viewGroup != null) {
                kew.S(viewGroup, aVar.c());
                ViewGroup viewGroup2 = this.N;
                if (viewGroup2 != null) {
                    viewGroup2.setElevation(kew.p(30));
                    if (v()) {
                        View view2 = this.R;
                        if (view2 != null) {
                            kew.S(view2, sk9.a.b.INSTANCE.a());
                            View view3 = this.R;
                            if (view3 != null) {
                                kew.e(view3, kew.P(370));
                                View view4 = this.S;
                                if (view4 != null) {
                                    kew.S(view4, aVar.b());
                                    View view5 = this.S;
                                    if (view5 != null) {
                                        kew.e(view5, (int) (k() * 0.35d));
                                    } else {
                                        ckf.y("bigCardBottomBlackShadowBg");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("bigCardBottomBlackShadowBg");
                                    throw null;
                                }
                            } else {
                                ckf.y("bigCardTopBlackShadowBg");
                                throw null;
                            }
                        } else {
                            ckf.y("bigCardTopBlackShadowBg");
                            throw null;
                        }
                    } else {
                        View view6 = this.R;
                        if (view6 != null) {
                            kew.B(view6);
                            View view7 = this.S;
                            if (view7 != null) {
                                kew.B(view7);
                                ViewGroup viewGroup3 = this.P;
                                if (viewGroup3 != null) {
                                    kew.B(viewGroup3);
                                    TUrlImageView tUrlImageView = this.V;
                                    if (tUrlImageView != null) {
                                        kew.B(tUrlImageView);
                                    } else {
                                        ckf.y("loftAtmosphereBgPic");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("bigCardContainer");
                                    throw null;
                                }
                            } else {
                                ckf.y("bigCardBottomBlackShadowBg");
                                throw null;
                            }
                        } else {
                            ckf.y("bigCardTopBlackShadowBg");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("tabBarContainer");
                    throw null;
                }
            } else {
                ckf.y("tabBarContainer");
                throw null;
            }
        } else {
            ckf.y("navViewContainer");
            throw null;
        }
    }

    public final void H1(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f2ec39", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            w();
        }
    }

    public final void L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f5ec47", new Object[]{this});
        } else if (!r()) {
            G1(this, x1(), false, false, 6, null);
            S0(true);
        }
    }

    public final void M1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6c966e", new Object[]{this});
            return;
        }
        int y1 = y1();
        G1(this, y1 * (-1), true, false, 4, null);
        x0(y1);
        S0(false);
    }

    public final void N1(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae6b19a", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        EnhancedViewPager enhancedViewPager = this.J;
        if (enhancedViewPager == null) {
            ckf.y("contentViewPager");
            throw null;
        } else if (enhancedViewPager.getCurrentItem() == i) {
            npp.a aVar = npp.Companion;
            aVar.b("switchTabToInViewPager : " + i + " , but same");
        } else {
            npp.Companion.b(ckf.p("switchTabToInViewPager : ", Integer.valueOf(i)));
            EnhancedViewPager enhancedViewPager2 = this.J;
            if (enhancedViewPager2 != null) {
                enhancedViewPager2.setCurrentItem(i, z);
            } else {
                ckf.y("contentViewPager");
                throw null;
            }
        }
    }

    public final void O1(BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9e8c2e", new Object[]{this, baseTemplateComponent, layoutParams});
            return;
        }
        if (!w() || this.Z != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.W == 0 || this.X == 0 || this.Y == 0 || !z) {
            if (baseTemplateComponent instanceof ShopHeaderComponent) {
                this.W = baseTemplateComponent.j().height;
            }
            if (baseTemplateComponent instanceof BottomBarComponent) {
                this.Y = baseTemplateComponent.j().height;
            }
            if (baseTemplateComponent instanceof pop) {
                this.Z = baseTemplateComponent.j().height;
            }
            if (w() && this.Z == 0) {
                z2 = false;
            }
            if (this.W != 0 && this.X != 0 && this.Y != 0 && z2) {
                l1();
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void c0(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcf8e1a", new Object[]{this, new Boolean(z), jSONObject});
        } else {
            r54.C(new DefaultShopV2$onSubscribeStatusChanged$1(this, z, jSONObject));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public int k() {
        EmbedShopLoftComponent embedShopLoftComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ce96e15", new Object[]{this})).intValue();
        }
        if (J().a3() && J().Y1()) {
            return this.g0;
        }
        if (!v() || (embedShopLoftComponent = this.f0) == null || !embedShopLoftComponent.A()) {
            return this.h0;
        }
        return l(this.g0);
    }

    public void l1() {
        int i;
        int L;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d0cb3b", new Object[]{this});
            return;
        }
        npp.Companion.b("allTemplateLoadFinish");
        if (!v() || !O()) {
            if (w()) {
                i = this.W + L();
                L = this.Z;
            } else {
                i = this.W;
                L = L();
            }
            int i2 = i + L;
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
            if (perceptionSizeFrameLayout != null) {
                kew.d0(perceptionSizeFrameLayout, i2);
                this.a0 = i2;
                if (w()) {
                    PerceptionLinearLayout perceptionLinearLayout = this.Q;
                    if (perceptionLinearLayout != null) {
                        perceptionLinearLayout.addView(this.j0.d());
                    } else {
                        ckf.y("shopHeaderContainer");
                        throw null;
                    }
                }
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        } else {
            int k = k() - this.X;
            this.a0 = k;
            PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.O;
            if (perceptionSizeFrameLayout2 != null) {
                kew.d0(perceptionSizeFrameLayout2, k);
                EmbedShopLoftComponent embedShopLoftComponent = this.f0;
                if (embedShopLoftComponent != null) {
                    embedShopLoftComponent.G(this.X);
                }
                if (w()) {
                    this.j0.B(v());
                    PerceptionLinearLayout perceptionLinearLayout2 = this.Q;
                    if (perceptionLinearLayout2 != null) {
                        perceptionLinearLayout2.addView(this.j0.d());
                    } else {
                        ckf.y("shopHeaderContainer");
                        throw null;
                    }
                }
                if (y()) {
                    r1();
                }
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        }
        ShopDataParser J = J();
        int i3 = this.Y;
        ViewGroup viewGroup = this.N;
        if (viewGroup != null) {
            J.w2(kew.O(Integer.valueOf(i3 + kew.r(viewGroup))));
            if (u() == 0) {
                ShopContainerPageAdapter shopContainerPageAdapter = this.T;
                if (shopContainerPageAdapter != null) {
                    shopContainerPageAdapter.i(u());
                } else {
                    ckf.y("shopContainerPageAdapter");
                    throw null;
                }
            }
            PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.O;
            if (perceptionSizeFrameLayout3 != null) {
                kew.L(perceptionSizeFrameLayout3, new DefaultShopV2$allTemplateLoadFinish$1(this));
                M();
                return;
            }
            ckf.y("navViewContainer");
            throw null;
        }
        ckf.y("tabBarContainer");
        throw null;
    }

    public final void m1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfa3fa", new Object[]{this, new Boolean(z)});
        } else if (z) {
            Object f = sk9.a.f(sk9.Companion, z, 0, false, 6, null);
            if (f != null && (f instanceof ViewOutlineProvider)) {
                ShopSwipeListenerLayout shopSwipeListenerLayout = this.M;
                if (shopSwipeListenerLayout != null) {
                    shopSwipeListenerLayout.setOutlineProvider((ViewOutlineProvider) f);
                    ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.M;
                    if (shopSwipeListenerLayout2 != null) {
                        shopSwipeListenerLayout2.setClipToOutline(true);
                    } else {
                        ckf.y("centerContainer");
                        throw null;
                    }
                } else {
                    ckf.y("centerContainer");
                    throw null;
                }
            }
        } else {
            ShopSwipeListenerLayout shopSwipeListenerLayout3 = this.M;
            if (shopSwipeListenerLayout3 != null) {
                shopSwipeListenerLayout3.setOutlineProvider(null);
                ShopSwipeListenerLayout shopSwipeListenerLayout4 = this.M;
                if (shopSwipeListenerLayout4 != null) {
                    shopSwipeListenerLayout4.setClipToOutline(false);
                } else {
                    ckf.y("centerContainer");
                    throw null;
                }
            } else {
                ckf.y("centerContainer");
                throw null;
            }
        }
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
        J1();
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

    public final void p1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1872ee07", new Object[]{this, new Integer(i)});
            return;
        }
        npp.a aVar = npp.Companion;
        aVar.b("changeOtherTabToFistTab, current expanded : " + r() + ' ');
        if (r() && v()) {
            G1(this, w1() * (-1), false, false, 6, null);
            S0(false);
        }
    }

    public final boolean q1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcb4226c", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            if (r() || B()) {
                return false;
            }
        } else if (r() || !B()) {
            return false;
        }
        q87 q87Var = this.l0;
        if (q87Var != null) {
            q87Var.d(z);
        }
        w0(z);
        EnhancedViewPager enhancedViewPager = this.J;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCanScroll(!z);
            return true;
        }
        ckf.y("contentViewPager");
        throw null;
    }

    public final void r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd220b9", new Object[]{this});
            return;
        }
        npp.Companion.b("continueInitSHopLoftBigCard");
        this.k0.x(new DefaultShopV2$continueInitShopLoftBigCard$1(this));
        this.k0.k(n(), J(), I(), null);
    }

    public final void s1() {
        View x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a945f4", new Object[]{this});
        } else if (!v() && !khu.e()) {
            r0(J().J1());
            if (v()) {
                u0(true);
                EmbedShopLoftComponent embedShopLoftComponent = new EmbedShopLoftComponent(n(), J(), I());
                this.f0 = embedShopLoftComponent;
                embedShopLoftComponent.F(k() / kew.x());
                EmbedShopLoftComponent embedShopLoftComponent2 = this.f0;
                if (!(embedShopLoftComponent2 == null || (x = embedShopLoftComponent2.x()) == null)) {
                    ViewGroup viewGroup = this.P;
                    if (viewGroup != null) {
                        kew.a(viewGroup, x);
                    } else {
                        ckf.y("bigCardContainer");
                        throw null;
                    }
                }
                this.e0.K(true);
                EmbedShopLoftComponent embedShopLoftComponent3 = this.f0;
                if (embedShopLoftComponent3 != null && embedShopLoftComponent3.A()) {
                    y0(false);
                }
            }
        }
    }

    public final int t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11d3d190", new Object[]{this})).intValue();
        }
        int i = this.a0;
        View view = this.L;
        if (view != null) {
            return i - view.getBottom();
        }
        ckf.y(a5.f2660a);
        throw null;
    }

    public final int u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d36079c9", new Object[]{this})).intValue();
        }
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
        if (perceptionSizeFrameLayout != null) {
            int top = perceptionSizeFrameLayout.getTop();
            View view = this.L;
            if (view != null) {
                return top - view.getBottom();
            }
            ckf.y(a5.f2660a);
            throw null;
        }
        ckf.y("navViewContainer");
        throw null;
    }

    public final int v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f305df0", new Object[]{this})).intValue();
        }
        PerceptionLinearLayout perceptionLinearLayout = this.Q;
        if (perceptionLinearLayout != null) {
            return perceptionLinearLayout.getHeight();
        }
        ckf.y("shopHeaderContainer");
        throw null;
    }

    public final int w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65349e29", new Object[]{this})).intValue();
        }
        PerceptionLinearLayout perceptionLinearLayout = this.Q;
        if (perceptionLinearLayout != null) {
            return perceptionLinearLayout.getHeight();
        }
        ckf.y("shopHeaderContainer");
        throw null;
    }

    public int x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b86f4555", new Object[]{this})).intValue();
        }
        if (O()) {
            return t1();
        }
        return v1();
    }

    public int y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b601ace", new Object[]{this})).intValue();
        }
        if (O()) {
            return u1();
        }
        return w1();
    }

    public final void A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78705187", new Object[]{this});
            return;
        }
        String i1 = J().i1();
        npp.Companion.b(ckf.p("shopSignType : ", i1));
        if (!ckf.b(i1, ytc.TYPE_FOLD)) {
            if (ckf.b(i1, "loft")) {
                s1();
            }
            s1();
            if (v()) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
                layoutParams.gravity = 80;
                ViewGroup viewGroup = this.P;
                if (viewGroup != null) {
                    View view = this.S;
                    if (view != null) {
                        viewGroup.addView(view, layoutParams);
                    } else {
                        ckf.y("bigCardBottomBlackShadowBg");
                        throw null;
                    }
                } else {
                    ckf.y("bigCardContainer");
                    throw null;
                }
            }
        }
    }

    public final void C1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        View K = kew.K(n(), R.layout.view_new_shop_view_flag_ship);
        if (K != null) {
            this.K = new ShopSwipeListenerLayout(n());
            View findViewById = K.findViewById(R.id.new_shop_view_center_container_white_frame);
            ckf.f(findViewById, "contentView.findViewById(R.id.new_shop_view_center_container_white_frame)");
            this.U = findViewById;
            View findViewById2 = K.findViewById(R.id.new_shop_view_center_container);
            ((ShopSwipeListenerLayout) findViewById2).setNormalMode(true);
            xhv xhvVar = xhv.INSTANCE;
            ckf.f(findViewById2, "contentView.findViewById<ShopSwipeListenerLayout?>(R.id.new_shop_view_center_container).apply {\n            this.normalMode = true\n        }");
            this.M = (ShopSwipeListenerLayout) findViewById2;
            View findViewById3 = K.findViewById(R.id.new_shop_view_status_bar_view);
            ckf.f(findViewById3, "contentView.findViewById(R.id.new_shop_view_status_bar_view)");
            this.L = findViewById3;
            View findViewById4 = K.findViewById(R.id.new_shop_view_tab_bar_container);
            ckf.f(findViewById4, "contentView.findViewById(R.id.new_shop_view_tab_bar_container)");
            this.N = (ViewGroup) findViewById4;
            View findViewById5 = K.findViewById(R.id.new_shop_view_big_card_view_container);
            ckf.f(findViewById5, "contentView.findViewById(R.id.new_shop_view_big_card_view_container)");
            this.P = (ViewGroup) findViewById5;
            View findViewById6 = K.findViewById(R.id.new_shop_view_nav_view_container);
            ((PerceptionSizeFrameLayout) findViewById6).setViewSizeChangedListener(this);
            ckf.f(findViewById6, "contentView.findViewById<PerceptionSizeFrameLayout?>(R.id.new_shop_view_nav_view_container).apply {\n            viewSizeChangedListener = this@DefaultShopV2\n        }");
            this.O = (PerceptionSizeFrameLayout) findViewById6;
            View findViewById7 = K.findViewById(R.id.new_shop_view_header_view_container);
            ((PerceptionLinearLayout) findViewById7).setViewSizeChangedListener(this);
            ckf.f(findViewById7, "contentView.findViewById<PerceptionLinearLayout?>(R.id.new_shop_view_header_view_container).apply {\n            viewSizeChangedListener = this@DefaultShopV2\n        }");
            this.Q = (PerceptionLinearLayout) findViewById7;
            View findViewById8 = K.findViewById(R.id.new_shop_view_backGround_img);
            TUrlImageView tUrlImageView = (TUrlImageView) findViewById8;
            String S0 = J().S0();
            if (S0 == null) {
                S0 = mop.DEFAULT_2022_BG_IMG_URL;
            }
            tUrlImageView.setImageUrl(S0);
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ckf.f(findViewById8, "contentView.findViewById<TUrlImageView?>(R.id.new_shop_view_backGround_img).apply {\n            this.imageUrl = shopData.getShopCommonAtmospherePicUrl() ?: ShopExt.DEFAULT_2022_BG_IMG_URL\n            this.scaleType = ImageView.ScaleType.CENTER_CROP\n        }");
            TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById8;
            View findViewById9 = K.findViewById(R.id.new_shop_view_black_shadow_bg);
            ckf.f(findViewById9, "contentView.findViewById(R.id.new_shop_view_black_shadow_bg)");
            this.R = findViewById9;
            this.S = new View(n());
            View findViewById10 = K.findViewById(R.id.new_shop_view_loft_atmosphere_bg);
            TUrlImageView tUrlImageView3 = (TUrlImageView) findViewById10;
            String x0 = J().x0();
            if (x0 != null) {
                tUrlImageView3.setImageUrl(x0);
            }
            ckf.f(findViewById10, "contentView.findViewById<TUrlImageView?>(R.id.new_shop_view_loft_atmosphere_bg).apply {\n            shopData.getLoftAtmospherePicUrl()?.isNotEmpty {\n                this.imageUrl = it\n            }\n        }");
            this.V = (TUrlImageView) findViewById10;
            EnhancedViewPager enhancedViewPager = new EnhancedViewPager(n());
            enhancedViewPager.setId(R.id.new_shop_view_view_pager);
            r1k r1kVar = new r1k(J());
            this.J = enhancedViewPager;
            enhancedViewPager.setOffscreenPageLimit(r1kVar.getCount() - 1);
            FragmentManager supportFragmentManager = n().getSupportFragmentManager();
            ckf.f(supportFragmentManager, "context.supportFragmentManager");
            ShopContainerPageAdapter shopContainerPageAdapter = new ShopContainerPageAdapter(supportFragmentManager);
            this.T = shopContainerPageAdapter;
            shopContainerPageAdapter.k(r1kVar);
            ShopContainerPageAdapter shopContainerPageAdapter2 = this.T;
            if (shopContainerPageAdapter2 != null) {
                enhancedViewPager.setAdapter(shopContainerPageAdapter2);
                enhancedViewPager.addOnPageChangeListener(this);
                ShopSwipeListenerLayout shopSwipeListenerLayout = this.M;
                if (shopSwipeListenerLayout != null) {
                    kew.a(shopSwipeListenerLayout, enhancedViewPager);
                    ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.K;
                    if (shopSwipeListenerLayout2 != null) {
                        shopSwipeListenerLayout2.setSwipeListener(this);
                        ShopSwipeListenerLayout shopSwipeListenerLayout3 = this.K;
                        if (shopSwipeListenerLayout3 != null) {
                            kew.a(shopSwipeListenerLayout3, K);
                            FrameLayout H = H();
                            ShopSwipeListenerLayout shopSwipeListenerLayout4 = this.K;
                            if (shopSwipeListenerLayout4 != null) {
                                kew.a(H, shopSwipeListenerLayout4);
                                View view = this.L;
                                if (view != null) {
                                    kew.e(view, L());
                                    ViewGroup viewGroup = this.P;
                                    if (viewGroup != null) {
                                        kew.e(viewGroup, k());
                                        if (s() != 0) {
                                            D().setBackgroundColor(sk9.Companion.q());
                                            kew.a(H(), D());
                                            return;
                                        }
                                        return;
                                    }
                                    ckf.y("bigCardContainer");
                                    throw null;
                                }
                                ckf.y(a5.f2660a);
                                throw null;
                            }
                            ckf.y("outerSwiperLayout");
                            throw null;
                        }
                        ckf.y("outerSwiperLayout");
                        throw null;
                    }
                    ckf.y("outerSwiperLayout");
                    throw null;
                }
                ckf.y("centerContainer");
                throw null;
            }
            ckf.y("shopContainerPageAdapter");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void N(FragmentActivity fragmentActivity, ShopDataParser shopDataParser, ShopDXEngine shopDXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8670aafd", new Object[]{this, fragmentActivity, shopDataParser, shopDXEngine});
            return;
        }
        ckf.g(fragmentActivity, "context");
        ckf.g(shopDataParser, "shopData");
        ckf.g(shopDXEngine, "shopDXEngine");
        try {
            this.b0 = aqp.Companion.g();
            Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            Result.m1108constructorimpl(kotlin.b.a(th));
        }
        shopDataParser.m1().x(new DefaultShopV2$initComponent$2(this));
        fragmentActivity.getLifecycle().addObserver(C());
        super.N(fragmentActivity, shopDataParser, shopDXEngine);
        shopDataParser.x2(kew.O(Integer.valueOf(L())) + 90);
        shopDataParser.w2(SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR);
        khu.a(fragmentActivity, true);
        C1();
        A1();
        ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            kew.e(viewGroup, k());
            B1();
            D1();
            return;
        }
        ckf.y("bigCardContainer");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void O0(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e0f8b4d", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        ckf.g(str, "targetTabName");
        int j = J().j(i, i2);
        EnhancedViewPager enhancedViewPager = this.J;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCurrentItem(j, false);
        } else {
            ckf.y("contentViewPager");
            throw null;
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
        if (this.b0 && y() && !j() && O() && Q()) {
            j0(false);
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
            if (perceptionSizeFrameLayout != null) {
                int z = kew.z(perceptionSizeFrameLayout) - i;
                ViewGroup viewGroup = this.P;
                if (viewGroup != null) {
                    int height = viewGroup.getHeight() - i;
                    int i2 = this.a0;
                    if (z <= i2) {
                        height = k();
                        z = i2;
                    }
                    ViewGroup viewGroup2 = this.P;
                    if (viewGroup2 != null) {
                        kew.e(viewGroup2, height);
                        PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.O;
                        if (perceptionSizeFrameLayout2 != null) {
                            kew.d0(perceptionSizeFrameLayout2, z);
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
                ckf.y("navViewContainer");
                throw null;
            }
        }
    }

    public final void n1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e3150", new Object[]{this, new Boolean(z)});
            return;
        }
        ShopSwipeListenerLayout shopSwipeListenerLayout = this.M;
        if (shopSwipeListenerLayout != null) {
            int height = H().getHeight() - L();
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
            if (perceptionSizeFrameLayout != null) {
                int height2 = height - perceptionSizeFrameLayout.getHeight();
                sk9.a aVar = sk9.Companion;
                kew.e(shopSwipeListenerLayout, height2 + aVar.g());
                ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.M;
                if (shopSwipeListenerLayout2 != null) {
                    shopSwipeListenerLayout2.setPadding(0, 0, 0, aVar.g());
                } else {
                    ckf.y("centerContainer");
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

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        super.onPageSelected(i);
        if (i != p()) {
            ShopContainerPageAdapter shopContainerPageAdapter = this.T;
            if (shopContainerPageAdapter != null) {
                shopContainerPageAdapter.j(p());
            } else {
                ckf.y("shopContainerPageAdapter");
                throw null;
            }
        }
        ShopContainerPageAdapter shopContainerPageAdapter2 = this.T;
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
            l0(k);
            o();
            H1(o, k);
            kwj kwjVar = this.d0;
            if (kwjVar != null) {
                kwjVar.c(k, i);
                this.i0.H(o());
                if (o == 0 && k != 0) {
                    o1();
                }
                if (o != 0 && k == 0) {
                    p1(o);
                }
                y1a<Integer, Integer, Integer, Integer, xhv> F = F();
                if (F != null) {
                    F.invoke(Integer.valueOf(k), Integer.valueOf(i3), Integer.valueOf(o), Integer.valueOf(i2));
                }
                b0();
                A0(false);
                return;
            }
            ckf.y("bottomBarAndIndexNavManager");
            throw null;
        }
        ckf.y("shopContainerPageAdapter");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54535e4", new Object[]{this});
            return;
        }
        super.onSwipeDown();
        if (d() && J().Q1(J().R())) {
            L1();
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
            M1();
        }
    }

    public void J1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d8ba32", new Object[]{this});
        } else if (this.b0 && !d() && O()) {
            if (Q()) {
                ViewGroup viewGroup = this.P;
                if (viewGroup != null) {
                    kew.e(viewGroup, k());
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
                    if (perceptionSizeFrameLayout != null) {
                        kew.d0(perceptionSizeFrameLayout, this.a0);
                        D0(false);
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                } else {
                    ckf.y("bigCardContainer");
                    throw null;
                }
            }
            j0(true);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void S0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a50f479", new Object[]{this, new Boolean(z)});
            return;
        }
        npp.Companion.b(ckf.p("update expanded : ", Boolean.valueOf(z)));
        super.S0(z);
        kwj kwjVar = this.d0;
        if (kwjVar != null) {
            kwjVar.d(z);
            b0();
            m1(!z);
            if (!O()) {
                if (z) {
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
                    if (perceptionSizeFrameLayout != null) {
                        kew.S(perceptionSizeFrameLayout, sk9.Companion.i());
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                } else {
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.O;
                    if (perceptionSizeFrameLayout2 != null) {
                        kew.S(perceptionSizeFrameLayout2, sk9.Companion.j());
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                }
                this.e0.L(false);
                this.j0.B(false);
                TUrlImageView tUrlImageView = this.V;
                if (tUrlImageView != null) {
                    kew.B(tUrlImageView);
                } else {
                    ckf.y("loftAtmosphereBgPic");
                    throw null;
                }
            } else if (z) {
                if (w()) {
                    ShopUTExposeEventKt.p(J());
                    this.j0.B(v());
                }
                if (v()) {
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.O;
                    if (perceptionSizeFrameLayout3 != null) {
                        kew.S(perceptionSizeFrameLayout3, sk9.Companion.i());
                        r54.F(new DefaultShopV2$updateExpandedStatus$1(this));
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                } else {
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout4 = this.O;
                    if (perceptionSizeFrameLayout4 != null) {
                        kew.S(perceptionSizeFrameLayout4, sk9.Companion.i());
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                }
                if (y()) {
                    this.e0.K(true);
                } else if (!v()) {
                    this.e0.L(false);
                } else {
                    this.e0.L(true);
                }
            } else {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout5 = this.O;
                if (perceptionSizeFrameLayout5 != null) {
                    kew.S(perceptionSizeFrameLayout5, sk9.Companion.j());
                    r54.F(new DefaultShopV2$updateExpandedStatus$2(this));
                    r54.G(new DefaultShopV2$updateExpandedStatus$3(this));
                    return;
                }
                ckf.y("navViewContainer");
                throw null;
            }
        } else {
            ckf.y("bottomBarAndIndexNavManager");
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
        if (this.b0 && this.c0 && y() && !j() && O() && r() && J().Q1(J().R())) {
            j0(false);
            D0(true);
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
            if (perceptionSizeFrameLayout == null) {
                ckf.y("navViewContainer");
                throw null;
            } else if ((kew.z(perceptionSizeFrameLayout) + i) - this.a0 >= 350) {
                EmbedShopLoftComponent embedShopLoftComponent = this.f0;
                if (embedShopLoftComponent != null) {
                    embedShopLoftComponent.B();
                }
                J1();
                this.c0 = false;
                r54.E(new DefaultShopV2$onParentSwipeDown$1(this), 500L);
            } else {
                ViewGroup viewGroup = this.P;
                if (viewGroup == null) {
                    ckf.y("bigCardContainer");
                    throw null;
                } else if (viewGroup != null) {
                    kew.e(viewGroup, viewGroup.getHeight() + i);
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.O;
                    if (perceptionSizeFrameLayout2 == null) {
                        ckf.y("navViewContainer");
                        throw null;
                    } else if (perceptionSizeFrameLayout2 != null) {
                        kew.d0(perceptionSizeFrameLayout2, kew.z(perceptionSizeFrameLayout2) + i);
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

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, tb.zfw
    public void a(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bf4b1c", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        ckf.g(view, "view");
        npp.Companion.b(ckf.p("flag ship , size changed , newHeight = ", Integer.valueOf(i2)));
        n1(false);
        PerceptionLinearLayout perceptionLinearLayout = this.Q;
        if (perceptionLinearLayout == null) {
            ckf.y("shopHeaderContainer");
            throw null;
        } else if (ckf.b(view, perceptionLinearLayout)) {
            View view2 = this.R;
            if (view2 != null) {
                kew.e(view2, i2 + L() + kew.P(6));
            } else {
                ckf.y("bigCardTopBlackShadowBg");
                throw null;
            }
        }
    }

    public final void o1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc51c7c", new Object[]{this});
            return;
        }
        npp.Companion.b(ckf.p("changeFirstTabToOtherTab, current expanded : ", Boolean.valueOf(r())));
        if (r()) {
            if (E() && spp.a(J().S(s(), t()))) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
                if (perceptionSizeFrameLayout != null) {
                    perceptionSizeFrameLayout.setMarginTop(L());
                    PerceptionLinearLayout perceptionLinearLayout = this.Q;
                    if (perceptionLinearLayout != null) {
                        perceptionLinearLayout.setAlpha(0.0f);
                        S0(false);
                    } else {
                        ckf.y("shopHeaderContainer");
                        throw null;
                    }
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            } else if (v()) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.O;
                if (perceptionSizeFrameLayout2 != null) {
                    int top = perceptionSizeFrameLayout2.getTop();
                    PerceptionLinearLayout perceptionLinearLayout2 = this.Q;
                    if (perceptionLinearLayout2 != null) {
                        F1((top - perceptionLinearLayout2.getBottom()) * (-1), false, false);
                        S0(true);
                        this.m0.d(-y1());
                        this.m0.b();
                    } else {
                        ckf.y("shopHeaderContainer");
                        throw null;
                    }
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            } else {
                S0(true);
                this.m0.d(-y1());
                this.m0.b();
            }
        }
        r54.F(new DefaultShopV2$changeFirstTabToOtherTab$1(this));
    }

    public final void F1(int i, boolean z, boolean z2) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960fb6d0", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
            return;
        }
        if (O() && v()) {
            ShopSwipeListenerLayout shopSwipeListenerLayout = this.K;
            if (shopSwipeListenerLayout != null) {
                shopSwipeListenerLayout.forceInterceptAllTouchEvent(true);
            } else {
                ckf.y("outerSwiperLayout");
                throw null;
            }
        }
        if (z) {
            Y(i);
        }
        npp.a aVar = npp.Companion;
        aVar.b("moveNavViewAndCenterContainer : " + i + " , needHeaderAlphaChanged : " + z);
        AnimatorSet animatorSet = new AnimatorSet();
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
        if (perceptionSizeFrameLayout != null) {
            Animator j = bdw.j(perceptionSizeFrameLayout, i, 0L, null, 6, null);
            if (z2) {
                ValueAnimator valueAnimator = j instanceof ValueAnimator ? (ValueAnimator) j : null;
                if (valueAnimator != null) {
                    valueAnimator.addUpdateListener(new b(i, this));
                }
            }
            xhv xhvVar = xhv.INSTANCE;
            PerceptionLinearLayout perceptionLinearLayout = this.Q;
            if (perceptionLinearLayout != null) {
                if (z) {
                    f = i > 0 ? 1.0f : 0.0f;
                } else {
                    f = perceptionLinearLayout.getAlpha();
                }
                animatorSet.playTogether(j, bdw.c(perceptionLinearLayout, f, 0L, null, 6, null));
                animatorSet.addListener(new a(this));
                animatorSet.start();
                return;
            }
            ckf.y("shopHeaderContainer");
            throw null;
        }
        ckf.y("navViewContainer");
        throw null;
    }
}
