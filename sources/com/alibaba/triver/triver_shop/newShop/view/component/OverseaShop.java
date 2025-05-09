package com.alibaba.triver.triver_shop.newShop.view.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
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
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.alibaba.triver.triver_shop.shop2023.template.OverseaShopHeaderInfoTemplate;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;
import tb.bdw;
import tb.bhl;
import tb.bnp;
import tb.chl;
import tb.ckf;
import tb.cyo;
import tb.dhl;
import tb.fhl;
import tb.kew;
import tb.khu;
import tb.mop;
import tb.npp;
import tb.r54;
import tb.sk9;
import tb.t2o;
import tb.xhv;
import tb.y1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class OverseaShop extends BaseContentComponent {
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
    public OverseaShopHeaderInfoTemplate Y;
    public dhl a0;
    public int c0;
    public final int Z = kew.P(750);
    public final bnp b0 = new bnp(0, 1, null);
    public final cyo d0 = new cyo(0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OverseaShop f3191a;

        static {
            t2o.a(766509931);
        }

        public a(OverseaShop overseaShop) {
            ckf.g(overseaShop, "this$0");
            this.f3191a = overseaShop;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/OverseaShop$AnimatorListener");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            this.f3191a.i0(false);
            this.f3191a.M();
            ShopSwipeListenerLayout a1 = OverseaShop.a1(this.f3191a);
            if (a1 != null) {
                a1.forceInterceptAllTouchEvent(false);
            } else {
                ckf.y("outerSwiperLayout");
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
            this.f3191a.i0(true);
            ShopSwipeListenerLayout a1 = OverseaShop.a1(this.f3191a);
            if (a1 != null) {
                a1.forceInterceptAllTouchEvent(true);
            } else {
                ckf.y("outerSwiperLayout");
                throw null;
            }
        }
    }

    static {
        t2o.a(766509930);
    }

    public OverseaShop() {
        kew.P(Integer.valueOf((int) mop.KEY_FLAG_SHIP_BIG_CARD_SIZE_RPX));
        kew.P(Integer.valueOf((int) mop.KEY_FLAG_SHIP_SUPER_BIG_CARD_SIZE_RPX));
    }

    public static final /* synthetic */ ViewGroup W0(OverseaShop overseaShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d2976044", new Object[]{overseaShop});
        }
        return overseaShop.P;
    }

    public static final /* synthetic */ View X0(OverseaShop overseaShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("204be731", new Object[]{overseaShop});
        }
        return overseaShop.R;
    }

    public static final /* synthetic */ EmbedShopLoftComponent Y0(OverseaShop overseaShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmbedShopLoftComponent) ipChange.ipc$dispatch("b4a1fd04", new Object[]{overseaShop});
        }
        overseaShop.getClass();
        return null;
    }

    public static final /* synthetic */ TUrlImageView Z0(OverseaShop overseaShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("d00d0700", new Object[]{overseaShop});
        }
        return overseaShop.V;
    }

    public static final /* synthetic */ ShopSwipeListenerLayout a1(OverseaShop overseaShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopSwipeListenerLayout) ipChange.ipc$dispatch("407c8c69", new Object[]{overseaShop});
        }
        return overseaShop.K;
    }

    public static final /* synthetic */ cyo b1(OverseaShop overseaShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cyo) ipChange.ipc$dispatch("5487016a", new Object[]{overseaShop});
        }
        return overseaShop.d0;
    }

    public static final /* synthetic */ OverseaShopHeaderInfoTemplate c1(OverseaShop overseaShop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OverseaShopHeaderInfoTemplate) ipChange.ipc$dispatch("abdf606e", new Object[]{overseaShop});
        }
        return overseaShop.Y;
    }

    public static final /* synthetic */ void d1(OverseaShop overseaShop, BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc48baeb", new Object[]{overseaShop, baseTemplateComponent, layoutParams});
        } else {
            overseaShop.t1(baseTemplateComponent, layoutParams);
        }
    }

    public static /* synthetic */ Object ipc$super(OverseaShop overseaShop, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/OverseaShop");
        }
    }

    public static /* synthetic */ void o1(OverseaShop overseaShop, int i, boolean z, boolean z2, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7922b77", new Object[]{overseaShop, new Integer(i), new Boolean(z), new Boolean(z2), new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        overseaShop.n1(i, z, z2);
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
        b0();
        if (!O()) {
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
            }
            if (v()) {
                r54.F(new OverseaShop$updateExpandedStatus$1(this));
            }
        } else {
            r54.F(new OverseaShop$updateExpandedStatus$2(this));
            r54.G(new OverseaShop$updateExpandedStatus$3(this));
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
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void c0(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcf8e1a", new Object[]{this, new Boolean(z), jSONObject});
        } else {
            r54.C(new OverseaShop$onSubscribeStatusChanged$1(this, z, jSONObject));
        }
    }

    public final int g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11d3d190", new Object[]{this})).intValue();
        }
        return this.X;
    }

    public final int h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d36079c9", new Object[]{this})).intValue();
        }
        return this.X;
    }

    public int i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b86f4555", new Object[]{this})).intValue();
        }
        return g1();
    }

    public int j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b601ace", new Object[]{this})).intValue();
        }
        return h1();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ce96e15", new Object[]{this})).intValue();
        }
        v();
        return this.Z;
    }

    public final void k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f2897a", new Object[]{this});
            return;
        }
        Map<String, ShopComponentModel> m = J().O0().m();
        ckf.d(m);
        ShopComponentModel shopComponentModel = m.get("tb_shop_multilingual_header_info");
        View view = null;
        if (shopComponentModel != null) {
            OverseaShopHeaderInfoTemplate overseaShopHeaderInfoTemplate = new OverseaShopHeaderInfoTemplate(shopComponentModel, new OverseaShop$initTemplateComponent$1$1(this));
            this.Y = overseaShopHeaderInfoTemplate;
            BaseContentComponent.e0(this, overseaShopHeaderInfoTemplate, null, 2, null);
            OverseaShopHeaderInfoTemplate overseaShopHeaderInfoTemplate2 = this.Y;
            if (overseaShopHeaderInfoTemplate2 != null) {
                overseaShopHeaderInfoTemplate2.x(new OverseaShop$initTemplateComponent$1$2(this));
            }
            OverseaShopHeaderInfoTemplate overseaShopHeaderInfoTemplate3 = this.Y;
            ckf.d(overseaShopHeaderInfoTemplate3);
            overseaShopHeaderInfoTemplate3.k(n(), J(), I(), null);
            PerceptionLinearLayout perceptionLinearLayout = this.Q;
            if (perceptionLinearLayout != null) {
                OverseaShopHeaderInfoTemplate overseaShopHeaderInfoTemplate4 = this.Y;
                ckf.d(overseaShopHeaderInfoTemplate4);
                perceptionLinearLayout.addView(overseaShopHeaderInfoTemplate4.d());
            } else {
                ckf.y("shopHeaderContainer");
                throw null;
            }
        }
        ShopComponentModel shopComponentModel2 = m.get("tb_shop_multilingual_header_endorse");
        if (shopComponentModel2 == null) {
            t1(null, null);
            return;
        }
        dhl dhlVar = new dhl(shopComponentModel2);
        this.a0 = dhlVar;
        BaseContentComponent.e0(this, dhlVar, null, 2, null);
        dhl dhlVar2 = this.a0;
        if (dhlVar2 != null) {
            dhlVar2.x(new OverseaShop$initTemplateComponent$2$1(this));
        }
        dhl dhlVar3 = this.a0;
        if (dhlVar3 != null) {
            dhlVar3.k(n(), J(), I(), null);
        }
        PerceptionLinearLayout perceptionLinearLayout2 = this.Q;
        if (perceptionLinearLayout2 != null) {
            dhl dhlVar4 = this.a0;
            if (dhlVar4 != null) {
                view = dhlVar4.d();
            }
            perceptionLinearLayout2.addView(view);
            return;
        }
        ckf.y("shopHeaderContainer");
        throw null;
    }

    public final void m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad10f563", new Object[]{this});
            return;
        }
        if (!v()) {
            View view = this.L;
            if (view != null) {
                kew.T(view);
            } else {
                ckf.y(a5.f2660a);
                throw null;
            }
        }
        ViewGroup viewGroup = this.N;
        if (viewGroup != null) {
            sk9.a aVar = sk9.Companion;
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
        q1();
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

    public final void p1(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f2ec39", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            w();
        }
    }

    public void q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d8ba32", new Object[]{this});
        }
    }

    public final void r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f5ec47", new Object[]{this});
        } else if (!r()) {
            o1(this, i1(), false, false, 6, null);
            S0(true);
        }
    }

    public final void s1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6c966e", new Object[]{this});
            return;
        }
        int j1 = j1();
        o1(this, j1 * (-1), false, false, 4, null);
        x0(j1);
        S0(false);
    }

    public final void t1(BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9e8c2e", new Object[]{this, baseTemplateComponent, layoutParams});
            return;
        }
        if (baseTemplateComponent instanceof OverseaShopHeaderInfoTemplate) {
            this.W = ((OverseaShopHeaderInfoTemplate) baseTemplateComponent).j().height;
        }
        if (baseTemplateComponent instanceof dhl) {
            this.X = ((dhl) baseTemplateComponent).j().height;
        }
        int i = this.c0 + 1;
        this.c0 = i;
        if (i >= 2) {
            if (this.X == 0) {
                z = false;
            }
            s0(z);
            e1();
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
        fragmentActivity.getLifecycle().addObserver(C());
        super.N(fragmentActivity, shopDataParser, shopDXEngine);
        kew.O(Integer.valueOf(L()));
        shopDataParser.w2(SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR);
        khu.a(fragmentActivity, true);
        l1();
        ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            kew.e(viewGroup, k());
            k1();
            m1();
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

    public void e1() {
        int i;
        int L;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d0cb3b", new Object[]{this});
            return;
        }
        npp.Companion.b("allTemplateLoadFinish");
        if (w()) {
            i = this.W + L();
            L = this.X;
        } else {
            i = this.W;
            L = L();
        }
        int i2 = i + L;
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
        if (perceptionSizeFrameLayout != null) {
            kew.d0(perceptionSizeFrameLayout, i2);
            L();
            ShopDataParser J = J();
            ViewGroup viewGroup = this.N;
            if (viewGroup != null) {
                J.w2(kew.O(Integer.valueOf(kew.r(viewGroup))));
                ShopContainerPageAdapter shopContainerPageAdapter = this.T;
                if (shopContainerPageAdapter != null) {
                    shopContainerPageAdapter.i(0);
                    onPageSelected(0);
                    M();
                    this.b0.b(J().L(), H());
                    return;
                }
                ckf.y("shopContainerPageAdapter");
                throw null;
            }
            ckf.y("tabBarContainer");
            throw null;
        }
        ckf.y("navViewContainer");
        throw null;
    }

    public final void f1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e3150", new Object[]{this, new Boolean(z)});
            return;
        }
        npp.Companion.f(ckf.p("OverseaShop changeCenterContainerSize ", Integer.valueOf(this.X)));
        ShopSwipeListenerLayout shopSwipeListenerLayout = this.M;
        if (shopSwipeListenerLayout != null) {
            int height = H().getHeight() - L();
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
            if (perceptionSizeFrameLayout != null) {
                int height2 = ((height - perceptionSizeFrameLayout.getHeight()) - this.W) + this.X;
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
            p1(o, k);
            y1a<Integer, Integer, Integer, Integer, xhv> F = F();
            if (F != null) {
                F.invoke(Integer.valueOf(k), Integer.valueOf(i3), Integer.valueOf(o), Integer.valueOf(i2));
            }
            b0();
            A0(false);
            return;
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
        if (d()) {
            r1();
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
            s1();
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
        f1(false);
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

    public final void n1(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960fb6d0", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
            return;
        }
        ValueAnimator valueAnimator = null;
        if (O() && v()) {
            ShopSwipeListenerLayout shopSwipeListenerLayout = this.K;
            if (shopSwipeListenerLayout != null) {
                shopSwipeListenerLayout.forceInterceptAllTouchEvent(true);
            } else {
                ckf.y("outerSwiperLayout");
                throw null;
            }
        }
        npp.a aVar = npp.Companion;
        aVar.b("moveNavViewAndCenterContainer : " + i + " , needHeaderAlphaChanged : " + z);
        AnimatorSet animatorSet = new AnimatorSet();
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
        if (perceptionSizeFrameLayout != null) {
            Animator j = bdw.j(perceptionSizeFrameLayout, i, 0L, null, 6, null);
            if (z2) {
                if (j instanceof ValueAnimator) {
                    valueAnimator = (ValueAnimator) j;
                }
                if (valueAnimator != null) {
                    valueAnimator.addUpdateListener(new chl(i, this));
                }
            }
            xhv xhvVar = xhv.INSTANCE;
            animatorSet.playTogether(j);
            animatorSet.addListener(new a(this));
            animatorSet.start();
            return;
        }
        ckf.y("navViewContainer");
        throw null;
    }

    public final void l1() {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        H().setId(R.id.oversea_shop_root);
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
            ShopSwipeListenerLayout shopSwipeListenerLayout = (ShopSwipeListenerLayout) findViewById2;
            this.M = shopSwipeListenerLayout;
            kew.W(shopSwipeListenerLayout, kew.v(30), kew.v(30), 0, 0, 12, null);
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
            ckf.f(findViewById6, "contentView.findViewById<PerceptionSizeFrameLayout?>(R.id.new_shop_view_nav_view_container).apply {\n            viewSizeChangedListener = this@OverseaShop\n        }");
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = (PerceptionSizeFrameLayout) findViewById6;
            this.O = perceptionSizeFrameLayout;
            kew.e(perceptionSizeFrameLayout, 0);
            View findViewById7 = K.findViewById(R.id.new_shop_view_header_view_container);
            ((PerceptionLinearLayout) findViewById7).setViewSizeChangedListener(this);
            ckf.f(findViewById7, "contentView.findViewById<PerceptionLinearLayout?>(R.id.new_shop_view_header_view_container).apply {\n            viewSizeChangedListener = this@OverseaShop\n        }");
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
            fhl fhlVar = new fhl(J());
            this.J = enhancedViewPager;
            enhancedViewPager.setOffscreenPageLimit(fhlVar.getCount() - 1);
            FragmentManager supportFragmentManager = n().getSupportFragmentManager();
            ckf.f(supportFragmentManager, "context.supportFragmentManager");
            ShopContainerPageAdapter shopContainerPageAdapter = new ShopContainerPageAdapter(supportFragmentManager);
            this.T = shopContainerPageAdapter;
            shopContainerPageAdapter.k(fhlVar);
            ShopContainerPageAdapter shopContainerPageAdapter2 = this.T;
            FrameLayout.LayoutParams layoutParams = null;
            if (shopContainerPageAdapter2 != null) {
                enhancedViewPager.setAdapter(shopContainerPageAdapter2);
                enhancedViewPager.addOnPageChangeListener(this);
                ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.M;
                if (shopSwipeListenerLayout2 != null) {
                    kew.a(shopSwipeListenerLayout2, enhancedViewPager);
                    ShopSwipeListenerLayout shopSwipeListenerLayout3 = this.K;
                    if (shopSwipeListenerLayout3 != null) {
                        shopSwipeListenerLayout3.setSwipeListener(this);
                        ShopSwipeListenerLayout shopSwipeListenerLayout4 = this.K;
                        if (shopSwipeListenerLayout4 != null) {
                            kew.a(shopSwipeListenerLayout4, K);
                            FrameLayout H = H();
                            ShopSwipeListenerLayout shopSwipeListenerLayout5 = this.K;
                            if (shopSwipeListenerLayout5 != null) {
                                kew.a(H, shopSwipeListenerLayout5);
                                View view = this.L;
                                if (view != null) {
                                    kew.e(view, L());
                                    ViewGroup viewGroup = this.P;
                                    if (viewGroup != null) {
                                        kew.e(viewGroup, k());
                                        if (s() != 0) {
                                            D().setBackgroundColor(sk9.Companion.q());
                                            kew.a(H(), D());
                                        }
                                        FrameLayout H2 = H();
                                        TUrlImageView tUrlImageView4 = new TUrlImageView(H2.getContext());
                                        ViewGroup.LayoutParams layoutParams2 = tUrlImageView4.getLayoutParams();
                                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                            tUrlImageView4.setLayoutParams(layoutParams2);
                                        } else {
                                            tUrlImageView4.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                                        }
                                        tUrlImageView4.setBackground(kew.u(kew.c(0, 0.1f), null, null, kew.v(44), 0, 0, 0, 0, 0, 0, 1014, null));
                                        tUrlImageView4.setPadding(kew.v(1), kew.v(1), kew.v(1), kew.v(1));
                                        ViewGroup.LayoutParams layoutParams3 = tUrlImageView4.getLayoutParams();
                                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                                            layoutParams = (FrameLayout.LayoutParams) layoutParams3;
                                        }
                                        if (layoutParams == null) {
                                            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                                            layoutParams4.gravity = 85;
                                            layoutParams4.bottomMargin = kew.v(200);
                                            layoutParams4.width = kew.v(88);
                                            layoutParams4.height = kew.v(88);
                                            layoutParams4.rightMargin = kew.v(10);
                                            tUrlImageView4.setLayoutParams(layoutParams4);
                                        } else {
                                            layoutParams.gravity = 85;
                                            layoutParams.bottomMargin = kew.v(200);
                                            layoutParams.width = kew.v(88);
                                            layoutParams.height = kew.v(88);
                                            layoutParams.rightMargin = kew.v(10);
                                        }
                                        JSONObject Z0 = J().Z0();
                                        String str = "https://img.alicdn.com/imgextra/i2/O1CN01GoozT11pKgkVchBTC_!!6000000005342-2-tps-132-132.png";
                                        if (!(Z0 == null || (string = Z0.getString("overSeaServerIconUrl")) == null)) {
                                            str = string;
                                        }
                                        tUrlImageView4.setImageUrl(str);
                                        tUrlImageView4.setOnClickListener(new bhl(tUrlImageView4, this));
                                        H2.addView(tUrlImageView4);
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
}
