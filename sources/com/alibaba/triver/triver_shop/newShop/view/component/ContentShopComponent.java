package com.alibaba.triver.triver_shop.newShop.view.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.a5;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftViewManager;
import com.alibaba.triver.triver_shop.newShop.ClickView;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionLinearLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionSizeFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout;
import com.alibaba.triver.triver_shop.newShop.view.adapter.ShopContainerPageAdapter;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BottomBarComponent;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.ShopHeaderComponent;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Result;
import tb.aqp;
import tb.bdw;
import tb.brf;
import tb.ckf;
import tb.jpu;
import tb.kew;
import tb.khu;
import tb.kwj;
import tb.mop;
import tb.npp;
import tb.r1k;
import tb.r54;
import tb.sk9;
import tb.t2o;
import tb.top;
import tb.xhv;
import tb.xpd;
import tb.y1a;
import tb.zaw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ContentShopComponent extends BaseContentComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ViewPager J;
    public View K;
    public ShopSwipeListenerLayout L;
    public ShopSwipeListenerLayout M;
    public ViewGroup N;
    public PerceptionSizeFrameLayout O;
    public ViewGroup P;
    public PerceptionLinearLayout Q;
    public View R;
    public View S;
    public View T;
    public View U;
    public ShopContainerPageAdapter V;
    public TUrlImageView W;
    public View X;
    public TUrlImageView Y;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public kwj f0;
    public EmbedShopLoftComponent h0;
    public xpd i0;
    public final top n0;
    public boolean Z = true;
    public boolean a0 = true;
    public final ShopHeaderComponent g0 = new ShopHeaderComponent(ContentShopComponent$shopHeaderComponent$1.INSTANCE, null);
    public final int j0 = kew.P(Integer.valueOf((int) mop.KEY_FLAG_SHIP_BIG_CARD_SIZE_RPX));
    public final int k0 = kew.P(Integer.valueOf((int) mop.KEY_FLAG_SHIP_SUPER_BIG_CARD_SIZE_RPX));
    public final BottomBarComponent l0 = new BottomBarComponent(new ContentShopComponent$bottomBarComponent$1(this), null, 2, null);
    public final zaw m0 = new zaw();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ContentShopComponent f3179a;

        static {
            t2o.a(766509810);
        }

        public a(ContentShopComponent contentShopComponent) {
            ckf.g(contentShopComponent, "this$0");
            this.f3179a = contentShopComponent;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/ContentShopComponent$AnimatorListener");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            this.f3179a.i0(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            this.f3179a.i0(false);
            this.f3179a.M();
            ShopSwipeListenerLayout f1 = ContentShopComponent.f1(this.f3179a);
            if (f1 != null) {
                f1.forceInterceptAllTouchEvent(false);
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
        public final /* synthetic */ String b;

        public b(String str) {
            this.b = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                khu.h(ContentShopComponent.this.n(), this.b);
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
                return;
            }
            String G = ContentShopComponent.this.J().G();
            if (G != null) {
                khu.h(ContentShopComponent.this.n(), G);
            }
        }
    }

    static {
        t2o.a(766509809);
    }

    public ContentShopComponent() {
        kew.P(Integer.valueOf((int) mop.KEY_FLAG_SHIP_H5_BIG_CARD_SIZE_RPX));
        top topVar = new top();
        topVar.C(true);
        xhv xhvVar = xhv.INSTANCE;
        this.n0 = topVar;
    }

    public static /* synthetic */ void F1(ContentShopComponent contentShopComponent, int i, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c794a2d8", new Object[]{contentShopComponent, new Integer(i), new Boolean(z), new Integer(i2), obj});
        } else if (obj == null) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            contentShopComponent.D1(i, z);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: moveNavViewAndCenterContainer");
        }
    }

    public static final /* synthetic */ void W0(ContentShopComponent contentShopComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7954f6ff", new Object[]{contentShopComponent});
        } else {
            contentShopComponent.o1();
        }
    }

    public static final /* synthetic */ ViewGroup X0(ContentShopComponent contentShopComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cd9fdd95", new Object[]{contentShopComponent});
        }
        return contentShopComponent.P;
    }

    public static final /* synthetic */ View Y0(ContentShopComponent contentShopComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7ded84ff", new Object[]{contentShopComponent});
        }
        return contentShopComponent.S;
    }

    public static final /* synthetic */ View Z0(ContentShopComponent contentShopComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("933d1c04", new Object[]{contentShopComponent});
        }
        return contentShopComponent.R;
    }

    public static final /* synthetic */ kwj a1(ContentShopComponent contentShopComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kwj) ipChange.ipc$dispatch("117e0671", new Object[]{contentShopComponent});
        }
        return contentShopComponent.f0;
    }

    public static final /* synthetic */ ViewPager b1(ContentShopComponent contentShopComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("cae84bdb", new Object[]{contentShopComponent});
        }
        return contentShopComponent.J;
    }

    public static final /* synthetic */ EmbedShopLoftComponent c1(ContentShopComponent contentShopComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmbedShopLoftComponent) ipChange.ipc$dispatch("1c72a7d", new Object[]{contentShopComponent});
        }
        return contentShopComponent.h0;
    }

    public static final /* synthetic */ TUrlImageView d1(ContentShopComponent contentShopComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("d783edc7", new Object[]{contentShopComponent});
        }
        return contentShopComponent.Y;
    }

    public static final /* synthetic */ xpd e1(ContentShopComponent contentShopComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpd) ipChange.ipc$dispatch("67fb0cab", new Object[]{contentShopComponent});
        }
        return contentShopComponent.i0;
    }

    public static final /* synthetic */ ShopSwipeListenerLayout f1(ContentShopComponent contentShopComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopSwipeListenerLayout) ipChange.ipc$dispatch("640412b8", new Object[]{contentShopComponent});
        }
        return contentShopComponent.M;
    }

    public static final /* synthetic */ TUrlImageView g1(ContentShopComponent contentShopComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("3859003a", new Object[]{contentShopComponent});
        }
        return contentShopComponent.W;
    }

    public static final /* synthetic */ ShopHeaderComponent h1(ContentShopComponent contentShopComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopHeaderComponent) ipChange.ipc$dispatch("6c4fc3db", new Object[]{contentShopComponent});
        }
        return contentShopComponent.g0;
    }

    public static final /* synthetic */ zaw i1(ContentShopComponent contentShopComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zaw) ipChange.ipc$dispatch("2fb4286f", new Object[]{contentShopComponent});
        }
        return contentShopComponent.m0;
    }

    public static /* synthetic */ Object ipc$super(ContentShopComponent contentShopComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2039436547:
                super.N((FragmentActivity) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2]);
                return null;
            case -1253755420:
                super.onSwipeDown();
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/ContentShopComponent");
        }
    }

    public static final /* synthetic */ void j1(ContentShopComponent contentShopComponent, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81aa4ce0", new Object[]{contentShopComponent, new Integer(i), new Boolean(z)});
        } else {
            contentShopComponent.J1(i, z);
        }
    }

    public static final /* synthetic */ void k1(ContentShopComponent contentShopComponent, BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e500f4", new Object[]{contentShopComponent, baseTemplateComponent, layoutParams});
        } else {
            contentShopComponent.L1(baseTemplateComponent, layoutParams);
        }
    }

    public final void A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f2897a", new Object[]{this});
            return;
        }
        this.f0 = new kwj(n(), J(), v(), new ContentShopComponent$initTemplateComponent$1(this));
        this.c0 = kew.p(45);
        this.l0.x(new ContentShopComponent$initTemplateComponent$2(this));
        this.l0.k(n(), J(), I(), null);
        ViewGroup viewGroup = this.N;
        if (viewGroup != null) {
            viewGroup.addView(this.l0.d());
            this.g0.x(new ContentShopComponent$initTemplateComponent$3(this));
            this.g0.k(n(), J(), I(), null);
            PerceptionLinearLayout perceptionLinearLayout = this.Q;
            if (perceptionLinearLayout != null) {
                perceptionLinearLayout.addView(this.g0.d());
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
                if (perceptionSizeFrameLayout != null) {
                    kwj kwjVar = this.f0;
                    if (kwjVar != null) {
                        perceptionSizeFrameLayout.addView(kwjVar.a());
                        zaw zawVar = this.m0;
                        zawVar.x(new ContentShopComponent$initTemplateComponent$4$1(this));
                        zawVar.k(n(), J(), I(), null);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams.gravity = 80;
                        ViewGroup viewGroup2 = this.P;
                        if (viewGroup2 != null) {
                            viewGroup2.addView(zawVar.d(), layoutParams);
                        } else {
                            ckf.y("bigCardContainer");
                            throw null;
                        }
                    } else {
                        ckf.y("bottomBarAndIndexNavManager");
                        throw null;
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
            ckf.y("tabBarContainer");
            throw null;
        }
    }

    public final void C1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad10f563", new Object[]{this});
            return;
        }
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
        if (perceptionSizeFrameLayout != null) {
            sk9.a aVar = sk9.Companion;
            kew.S(perceptionSizeFrameLayout, aVar.h());
            ViewGroup viewGroup = this.N;
            if (viewGroup != null) {
                kew.S(viewGroup, aVar.c());
                ViewGroup viewGroup2 = this.N;
                if (viewGroup2 != null) {
                    viewGroup2.setElevation(kew.p(30));
                    View view = this.R;
                    if (view != null) {
                        kew.S(view, aVar.l());
                        View view2 = this.R;
                        if (view2 != null) {
                            kew.e(view2, kew.P(370));
                            View view3 = this.T;
                            if (view3 != null) {
                                kew.S(view3, aVar.n());
                                View view4 = this.T;
                                if (view4 != null) {
                                    kew.e(view4, kew.P(135));
                                    View view5 = this.U;
                                    if (view5 != null) {
                                        kew.S(view5, aVar.o());
                                        View view6 = new View(n());
                                        this.S = view6;
                                        kew.S(view6, aVar.m());
                                        View view7 = this.S;
                                        if (view7 != null) {
                                            kew.C(view7);
                                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, kew.P(370));
                                            layoutParams.gravity = 48;
                                            ViewGroup viewGroup3 = this.P;
                                            if (viewGroup3 != null) {
                                                View view8 = this.S;
                                                if (view8 != null) {
                                                    viewGroup3.addView(view8, layoutParams);
                                                    if (this.a0) {
                                                        ViewGroup viewGroup4 = this.N;
                                                        if (viewGroup4 != null) {
                                                            kew.B(viewGroup4);
                                                        } else {
                                                            ckf.y("tabBarContainer");
                                                            throw null;
                                                        }
                                                    }
                                                } else {
                                                    ckf.y("bigCardContentFullScreenTopBlackShadow");
                                                    throw null;
                                                }
                                            } else {
                                                ckf.y("bigCardContainer");
                                                throw null;
                                            }
                                        } else {
                                            ckf.y("bigCardContentFullScreenTopBlackShadow");
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("bigCardBottomBlackShadowBGPart2");
                                        throw null;
                                    }
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

    public final void G1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f5ec47", new Object[]{this});
        } else if (!r()) {
            F1(this, w1(), false, 2, null);
            S0(true);
        }
    }

    public final void H1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6c966e", new Object[]{this});
            return;
        }
        int x1 = x1();
        D1(x1 * (-1), true);
        x0(x1);
        S0(false);
    }

    public final void J1(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae6b19a", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        ViewPager viewPager = this.J;
        if (viewPager == null) {
            ckf.y("contentViewPager");
            throw null;
        } else if (viewPager.getCurrentItem() == i) {
            npp.a aVar = npp.Companion;
            aVar.b("switchTabToInViewPager : " + i + " , but same");
        } else {
            npp.Companion.b(ckf.p("switchTabToInViewPager : ", Integer.valueOf(i)));
            ViewPager viewPager2 = this.J;
            if (viewPager2 != null) {
                viewPager2.setCurrentItem(i, z);
            } else {
                ckf.y("contentViewPager");
                throw null;
            }
        }
    }

    public final void L1(BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9e8c2e", new Object[]{this, baseTemplateComponent, layoutParams});
        } else if (this.b0 == 0 || this.c0 == 0 || this.d0 == 0) {
            if (baseTemplateComponent instanceof ShopHeaderComponent) {
                this.b0 = baseTemplateComponent.j().height;
            }
            if (baseTemplateComponent instanceof BottomBarComponent) {
                this.d0 = baseTemplateComponent.j().height;
            }
            if (this.b0 != 0 && this.c0 != 0 && this.d0 != 0) {
                l1();
            }
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
        kwj kwjVar = this.f0;
        if (kwjVar != null) {
            kwjVar.d(z);
            b0();
            if (!O()) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
                if (perceptionSizeFrameLayout != null) {
                    kew.S(perceptionSizeFrameLayout, sk9.Companion.j());
                    TUrlImageView tUrlImageView = this.Y;
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
            } else if (z) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.O;
                if (perceptionSizeFrameLayout2 != null) {
                    kew.S(perceptionSizeFrameLayout2, sk9.Companion.h());
                    r54.F(new ContentShopComponent$updateExpandedStatus$1(this));
                    return;
                }
                ckf.y("navViewContainer");
                throw null;
            } else {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.O;
                if (perceptionSizeFrameLayout3 != null) {
                    kew.S(perceptionSizeFrameLayout3, sk9.Companion.j());
                    r54.F(new ContentShopComponent$updateExpandedStatus$2(this));
                    r54.G(new ContentShopComponent$updateExpandedStatus$3(this));
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
    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4498028c", new Object[]{this});
        } else {
            r54.C(new ContentShopComponent$onStatusBarStyleChanged$1(this));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void c0(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcf8e1a", new Object[]{this, new Boolean(z), jSONObject});
        } else {
            r54.C(new ContentShopComponent$onSubscribeStatusChanged$1(this, z, jSONObject));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ce96e15", new Object[]{this})).intValue();
        }
        if (this.Z) {
            return l(this.j0);
        }
        return l(this.k0);
    }

    public void l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d0cb3b", new Object[]{this});
            return;
        }
        int k = k() + kew.P(24);
        this.e0 = k;
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
        if (perceptionSizeFrameLayout != null) {
            kew.d0(perceptionSizeFrameLayout, k);
            if (this.a0) {
                J().w2(this.b0);
            } else {
                ShopDataParser J = J();
                int i = this.d0;
                ViewGroup viewGroup = this.N;
                if (viewGroup != null) {
                    J.w2(kew.O(Integer.valueOf(i + kew.r(viewGroup))));
                } else {
                    ckf.y("tabBarContainer");
                    throw null;
                }
            }
            if (u() == 0) {
                ShopContainerPageAdapter shopContainerPageAdapter = this.V;
                if (shopContainerPageAdapter != null) {
                    shopContainerPageAdapter.i(u());
                } else {
                    ckf.y("shopContainerPageAdapter");
                    throw null;
                }
            }
            PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.O;
            if (perceptionSizeFrameLayout2 != null) {
                kew.L(perceptionSizeFrameLayout2, new ContentShopComponent$allTemplateLoadFinish$1(this));
                if (s() == 0) {
                    TUrlImageView tUrlImageView = this.W;
                    if (tUrlImageView != null) {
                        kew.C(tUrlImageView);
                    } else {
                        ckf.y("shopBackgroundImg");
                        throw null;
                    }
                } else {
                    TUrlImageView tUrlImageView2 = this.W;
                    if (tUrlImageView2 != null) {
                        kew.g0(tUrlImageView2);
                    } else {
                        ckf.y("shopBackgroundImg");
                        throw null;
                    }
                }
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        } else {
            ckf.y("navViewContainer");
            throw null;
        }
    }

    public final void o1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd220b9", new Object[]{this});
            return;
        }
        npp.Companion.b("continueInitSHopLoftBigCard");
        this.n0.x(new ContentShopComponent$continueInitShopLoftBigCard$1(this));
        this.n0.k(n(), J(), I(), null);
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
    public void onSwipeDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54535e4", new Object[]{this});
            return;
        }
        super.onSwipeDown();
        if (d()) {
            if (!O() || J().Q1(J().S(o(), J().i(p())))) {
                G1();
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
            H1();
        }
    }

    public final void p1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41206d78", new Object[]{this});
        } else if (!v()) {
            ClickView clickView = new ClickView(n());
            String x1 = J().x1();
            if (x1 != null && x1.length() != 0) {
                TUrlImageView tUrlImageView = new TUrlImageView(n());
                tUrlImageView.setImageUrl(x1);
                tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                ViewGroup viewGroup = this.P;
                if (viewGroup != null) {
                    kew.a(viewGroup, tUrlImageView);
                    ViewGroup viewGroup2 = this.P;
                    if (viewGroup2 != null) {
                        kew.a(viewGroup2, clickView);
                        r0(true);
                        String N = J().N();
                        if (N != null) {
                            clickView.setOnClickListener(new b(N));
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
    }

    public final void q1() {
        View x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a945f4", new Object[]{this});
        } else if (!v() && !khu.e()) {
            r0(J().J1());
            if (v()) {
                u0(true);
                EmbedShopLoftComponent embedShopLoftComponent = new EmbedShopLoftComponent(n(), J(), I());
                this.h0 = embedShopLoftComponent;
                embedShopLoftComponent.F(k() / kew.x());
                EmbedShopLoftComponent embedShopLoftComponent2 = this.h0;
                if (!(embedShopLoftComponent2 == null || (x = embedShopLoftComponent2.x()) == null)) {
                    ViewGroup viewGroup = this.P;
                    if (viewGroup != null) {
                        kew.a(viewGroup, x);
                    } else {
                        ckf.y("bigCardContainer");
                        throw null;
                    }
                }
                this.g0.K(true);
                EmbedShopLoftComponent embedShopLoftComponent3 = this.h0;
                if (embedShopLoftComponent3 != null && embedShopLoftComponent3.A()) {
                    y0(false);
                }
            }
        }
    }

    public final int s1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11d3d190", new Object[]{this})).intValue();
        }
        int i = this.e0;
        View view = this.K;
        if (view != null) {
            return i - view.getBottom();
        }
        ckf.y(a5.f2660a);
        throw null;
    }

    public final int t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d36079c9", new Object[]{this})).intValue();
        }
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
        if (perceptionSizeFrameLayout != null) {
            int top = perceptionSizeFrameLayout.getTop();
            View view = this.K;
            if (view != null) {
                return top - view.getBottom();
            }
            ckf.y(a5.f2660a);
            throw null;
        }
        ckf.y("navViewContainer");
        throw null;
    }

    public final int u1() {
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

    public final int v1() {
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

    public int w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b86f4555", new Object[]{this})).intValue();
        }
        if (O()) {
            return s1();
        }
        return u1();
    }

    public int x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b601ace", new Object[]{this})).intValue();
        }
        if (O()) {
            return t1();
        }
        return v1();
    }

    public final void B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        View K = kew.K(n(), R.layout.view_new_shop_view_flag_ship);
        if (K != null) {
            View findViewById = K.findViewById(R.id.new_shop_view_center_container_white_frame);
            ckf.f(findViewById, "contentView.findViewById(R.id.new_shop_view_center_container_white_frame)");
            this.X = findViewById;
            View findViewById2 = K.findViewById(R.id.new_shop_view_center_container);
            ShopSwipeListenerLayout shopSwipeListenerLayout = (ShopSwipeListenerLayout) findViewById2;
            sk9.a aVar = sk9.Companion;
            Object f = sk9.a.f(aVar, true, 0, false, 6, null);
            if (f != null) {
                shopSwipeListenerLayout.setOutlineProvider((ViewOutlineProvider) f);
            }
            shopSwipeListenerLayout.setClipToOutline(true);
            xhv xhvVar = xhv.INSTANCE;
            ckf.f(findViewById2, "contentView.findViewById<ShopSwipeListenerLayout?>(R.id.new_shop_view_center_container)\n                .apply {\n                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {\n                        FlagShipDrawable.getCenterContainerOutLineProvider(true)?.let {\n                            this.outlineProvider = it as ViewOutlineProvider\n                        }\n                        this.clipToOutline = true\n                    }\n                }");
            this.L = (ShopSwipeListenerLayout) findViewById2;
            View findViewById3 = K.findViewById(R.id.new_shop_view_status_bar_view);
            ckf.f(findViewById3, "contentView.findViewById(R.id.new_shop_view_status_bar_view)");
            this.K = findViewById3;
            View findViewById4 = K.findViewById(R.id.new_shop_view_tab_bar_container);
            ckf.f(findViewById4, "contentView.findViewById(R.id.new_shop_view_tab_bar_container)");
            this.N = (ViewGroup) findViewById4;
            View findViewById5 = K.findViewById(R.id.new_shop_view_big_card_view_container);
            ckf.f(findViewById5, "contentView.findViewById(R.id.new_shop_view_big_card_view_container)");
            this.P = (ViewGroup) findViewById5;
            View findViewById6 = K.findViewById(R.id.new_shop_view_nav_view_container);
            ((PerceptionSizeFrameLayout) findViewById6).setViewSizeChangedListener(this);
            ckf.f(findViewById6, "contentView.findViewById<PerceptionSizeFrameLayout?>(R.id.new_shop_view_nav_view_container)\n                .apply {\n                    viewSizeChangedListener = this@ContentShopComponent\n                }");
            this.O = (PerceptionSizeFrameLayout) findViewById6;
            View findViewById7 = K.findViewById(R.id.new_shop_view_header_view_container);
            ((PerceptionLinearLayout) findViewById7).setViewSizeChangedListener(this);
            ckf.f(findViewById7, "contentView.findViewById<PerceptionLinearLayout?>(R.id.new_shop_view_header_view_container)\n                .apply {\n                    viewSizeChangedListener = this@ContentShopComponent\n                }");
            this.Q = (PerceptionLinearLayout) findViewById7;
            View findViewById8 = K.findViewById(R.id.new_shop_view_backGround_img);
            TUrlImageView tUrlImageView = (TUrlImageView) findViewById8;
            String S0 = J().S0();
            if (S0 == null) {
                S0 = mop.DEFAULT_2022_BG_IMG_URL;
            }
            tUrlImageView.setImageUrl(S0);
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            kew.B(tUrlImageView);
            ckf.f(findViewById8, "contentView.findViewById<TUrlImageView?>(R.id.new_shop_view_backGround_img).apply {\n                this.imageUrl =\n                    shopData.getShopCommonAtmospherePicUrl() ?: ShopExt.DEFAULT_2022_BG_IMG_URL\n                this.scaleType = ImageView.ScaleType.CENTER_CROP\n                this.goneView()\n            }");
            this.W = (TUrlImageView) findViewById8;
            View findViewById9 = K.findViewById(R.id.new_shop_view_black_shadow_bg);
            ckf.f(findViewById9, "contentView.findViewById(R.id.new_shop_view_black_shadow_bg)");
            this.R = findViewById9;
            this.T = new View(n());
            this.U = new View(n());
            View findViewById10 = K.findViewById(R.id.new_shop_view_loft_atmosphere_bg);
            TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById10;
            String x0 = J().x0();
            if (x0 != null) {
                tUrlImageView2.setImageUrl(x0);
            }
            ckf.f(findViewById10, "contentView.findViewById<TUrlImageView?>(R.id.new_shop_view_loft_atmosphere_bg).apply {\n                shopData.getLoftAtmospherePicUrl()?.isNotEmpty {\n                    this.imageUrl = it\n                }\n            }");
            this.Y = (TUrlImageView) findViewById10;
            View K2 = kew.K(n(), R.layout.view_empty_view_pager);
            if (K2 != null) {
                ViewPager viewPager = (ViewPager) K2;
                r1k r1kVar = new r1k(J());
                this.J = viewPager;
                viewPager.setOffscreenPageLimit(r1kVar.getCount() - 1);
                FragmentManager supportFragmentManager = n().getSupportFragmentManager();
                ckf.f(supportFragmentManager, "context.supportFragmentManager");
                ShopContainerPageAdapter shopContainerPageAdapter = new ShopContainerPageAdapter(supportFragmentManager);
                this.V = shopContainerPageAdapter;
                shopContainerPageAdapter.k(r1kVar);
                ShopContainerPageAdapter shopContainerPageAdapter2 = this.V;
                if (shopContainerPageAdapter2 != null) {
                    viewPager.setAdapter(shopContainerPageAdapter2);
                    viewPager.addOnPageChangeListener(this);
                    ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.L;
                    if (shopSwipeListenerLayout2 != null) {
                        kew.a(shopSwipeListenerLayout2, viewPager);
                        ShopSwipeListenerLayout shopSwipeListenerLayout3 = new ShopSwipeListenerLayout(n());
                        this.M = shopSwipeListenerLayout3;
                        shopSwipeListenerLayout3.setSwipeListener(this);
                        kew.a(shopSwipeListenerLayout3, K);
                        shopSwipeListenerLayout3.setInCenterContainerFlag(Boolean.FALSE);
                        kew.a(H(), shopSwipeListenerLayout3);
                        View view = this.K;
                        if (view != null) {
                            kew.e(view, L());
                            ViewGroup viewGroup = this.P;
                            if (viewGroup != null) {
                                kew.e(viewGroup, k());
                                if (s() != 0) {
                                    D().setBackgroundColor(aVar.q());
                                    kew.a(H(), D());
                                }
                                Object f2 = sk9.a.f(aVar, true, aVar.p(), false, 4, null);
                                if (f2 != null) {
                                    ViewGroup viewGroup2 = this.P;
                                    if (viewGroup2 != null) {
                                        viewGroup2.setOutlineProvider((ViewOutlineProvider) f2);
                                        ViewGroup viewGroup3 = this.P;
                                        if (viewGroup3 != null) {
                                            viewGroup3.setClipToOutline(true);
                                        } else {
                                            ckf.y("bigCardContainer");
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("bigCardContainer");
                                        throw null;
                                    }
                                }
                                kew.S(H(), new ColorDrawable(-16777216));
                                return;
                            }
                            ckf.y("bigCardContainer");
                            throw null;
                        }
                        ckf.y(a5.f2660a);
                        throw null;
                    }
                    ckf.y("centerContainer");
                    throw null;
                }
                ckf.y("shopContainerPageAdapter");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.v4.view.ViewPager");
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
        int j = J().j(i, i2);
        ViewPager viewPager = this.J;
        if (viewPager != null) {
            viewPager.setCurrentItem(j, false);
        } else {
            ckf.y("contentViewPager");
            throw null;
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
        int L = L();
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
        if (perceptionSizeFrameLayout != null) {
            int height = L + perceptionSizeFrameLayout.getHeight();
            ShopSwipeListenerLayout shopSwipeListenerLayout = this.L;
            if (shopSwipeListenerLayout != null) {
                int height2 = H().getHeight() - height;
                sk9.a aVar = sk9.Companion;
                kew.e(shopSwipeListenerLayout, height2 + aVar.g());
                ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.L;
                if (shopSwipeListenerLayout2 != null) {
                    shopSwipeListenerLayout2.setPadding(0, 0, 0, aVar.g());
                } else {
                    ckf.y("centerContainer");
                    throw null;
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

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        super.onPageSelected(i);
        if (i != p()) {
            ShopContainerPageAdapter shopContainerPageAdapter = this.V;
            if (shopContainerPageAdapter != null) {
                shopContainerPageAdapter.j(p());
            } else {
                ckf.y("shopContainerPageAdapter");
                throw null;
            }
        }
        ShopContainerPageAdapter shopContainerPageAdapter2 = this.V;
        if (shopContainerPageAdapter2 != null) {
            shopContainerPageAdapter2.i(i);
            int i2 = J().i(p());
            m0(i);
            int o = o();
            int k = J().k(p());
            int i3 = J().i(i);
            J().W2(i3, k);
            npp.a aVar = npp.Companion;
            aVar.b("flag ship , on page selected , newTab = " + k + ", newSub = " + i3 + " , oldTab = " + o + ", position : " + i);
            l0(k);
            o();
            kwj kwjVar = this.f0;
            if (kwjVar != null) {
                kwjVar.c(k, p());
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
                if (perceptionSizeFrameLayout != null) {
                    kew.e(perceptionSizeFrameLayout, -2);
                    this.g0.I(true);
                    this.l0.H(o());
                    if (o == 0 && k != 0) {
                        m1();
                    }
                    if (o != 0 && k == 0) {
                        n1(o);
                    }
                    y1a<Integer, Integer, Integer, Integer, xhv> F = F();
                    if (F != null) {
                        F.invoke(Integer.valueOf(k), Integer.valueOf(i3), Integer.valueOf(o), Integer.valueOf(i2));
                    }
                    b0();
                    return;
                }
                ckf.y("navViewContainer");
                throw null;
            }
            ckf.y("bottomBarAndIndexNavManager");
            throw null;
        }
        ckf.y("shopContainerPageAdapter");
        throw null;
    }

    public final void y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78705187", new Object[]{this});
            return;
        }
        String i1 = J().i1();
        npp.Companion.b(ckf.p("shopSignType : ", i1));
        if (i1 != null) {
            int hashCode = i1.hashCode();
            if (hashCode != -187499722) {
                if (hashCode != 3327377) {
                    if (hashCode == 93653765 && i1.equals("bgPic")) {
                        p1();
                    }
                } else if (i1.equals("loft")) {
                    q1();
                }
            } else if (i1.equals("bgVideo")) {
                r1();
            }
        }
        q1();
        r1();
        p1();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 80;
        ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            View view = this.T;
            if (view != null) {
                viewGroup.addView(view, layoutParams);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, kew.P(570));
                layoutParams2.gravity = 80;
                layoutParams2.bottomMargin = kew.P(135);
                ViewGroup viewGroup2 = this.P;
                if (viewGroup2 != null) {
                    View view2 = this.U;
                    if (view2 != null) {
                        viewGroup2.addView(view2, layoutParams2);
                    } else {
                        ckf.y("bigCardBottomBlackShadowBGPart2");
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
            ckf.y("bigCardContainer");
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
            aqp.a aVar = aqp.Companion;
            this.Z = aVar.s();
            this.a0 = aVar.O0();
            Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            Result.m1108constructorimpl(kotlin.b.a(th));
        }
        fragmentActivity.getLifecycle().addObserver(C());
        super.N(fragmentActivity, shopDataParser, shopDXEngine);
        khu.a(fragmentActivity, true);
        B1();
        y1();
        ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            int k = k();
            sk9.a aVar2 = sk9.Companion;
            kew.e(viewGroup, k + aVar2.p());
            ViewGroup viewGroup2 = this.P;
            if (viewGroup2 != null) {
                viewGroup2.setPadding(0, aVar2.p(), 0, 0);
                ViewGroup viewGroup3 = this.P;
                if (viewGroup3 != null) {
                    viewGroup3.setTranslationY(aVar2.p() * (-1.0f));
                    A1();
                    C1();
                    if (!v()) {
                        npp.Companion.b("data error : video shop has no bigCard");
                        r54.Y(fragmentActivity, "[DEBUG]: 状态错误，视频店无大卡");
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
        ckf.y("bigCardContainer");
        throw null;
    }

    public final void m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc51c7c", new Object[]{this});
            return;
        }
        npp.Companion.b(ckf.p("changeFirstTabToOtherTab, current expanded : ", Boolean.valueOf(r())));
        if (r()) {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.O;
            if (perceptionSizeFrameLayout != null) {
                int top = perceptionSizeFrameLayout.getTop();
                PerceptionLinearLayout perceptionLinearLayout = this.Q;
                if (perceptionLinearLayout != null) {
                    D1((top - perceptionLinearLayout.getBottom()) * (-1), false);
                    S0(true);
                } else {
                    ckf.y("shopHeaderContainer");
                    throw null;
                }
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        }
        r54.F(new ContentShopComponent$changeFirstTabToOtherTab$1(this));
        this.g0.L(false);
    }

    public final void r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("639ece58", new Object[]{this});
        } else if (!v()) {
            ClickView clickView = new ClickView(n());
            String H = J().H();
            if (H != null && H.length() != 0 && !khu.e()) {
                r0(true);
                xpd miniVideoView = ShopLoftViewManager.getMiniVideoView();
                this.i0 = miniVideoView;
                miniVideoView.initWithData(n(), brf.a(jpu.a("videoUrl", H), jpu.a("autoRelease", Boolean.TRUE)), null, null);
                miniVideoView.didAppear();
                miniVideoView.mute(true);
                View view = miniVideoView.getView();
                if (view != null) {
                    ViewGroup viewGroup = this.P;
                    if (viewGroup != null) {
                        viewGroup.addView(view);
                        clickView.setOnClickListener(new c());
                        ViewGroup viewGroup2 = this.P;
                        if (viewGroup2 != null) {
                            kew.a(viewGroup2, clickView);
                        } else {
                            ckf.y("bigCardContainer");
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

    public final void D1(int i, boolean z) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2428c84", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        if (O() && v()) {
            ShopSwipeListenerLayout shopSwipeListenerLayout = this.M;
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

    public final void n1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1872ee07", new Object[]{this, new Integer(i)});
            return;
        }
        TUrlImageView tUrlImageView = this.W;
        if (tUrlImageView != null) {
            kew.C(tUrlImageView);
            ViewGroup viewGroup = this.P;
            if (viewGroup != null) {
                kew.g0(viewGroup);
                View view = this.R;
                if (view != null) {
                    kew.g0(view);
                    npp.Companion.b(ckf.p("changeOtherTabToFistTab, current expanded : ", Boolean.valueOf(r())));
                    if (r()) {
                        F1(this, v1() * (-1), false, 2, null);
                        S0(false);
                    }
                    this.g0.K(true);
                    return;
                }
                ckf.y("bigCardTopBlackShadowBg");
                throw null;
            }
            ckf.y("bigCardContainer");
            throw null;
        }
        ckf.y("shopBackgroundImg");
        throw null;
    }
}
