package com.alibaba.triver.triver_shop.shop2023;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.a5;
import com.alibaba.triver.triver_shop.ShopMoreUtils;
import com.alibaba.triver.triver_shop.container.shopLoft.EmbedSecondFloorView;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopNewLiveLoftView;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.view.MarginSupportFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionLinearLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionSizeFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.ShopOptSwipeLayout;
import com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout;
import com.alibaba.triver.triver_shop.newShop.view.Tab3LiveContentRender;
import com.alibaba.triver.triver_shop.newShop.view.adapter.ShopContainerPageAdapter;
import com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent;
import com.alibaba.triver.triver_shop.newShop.view.component.nativeview.Shop2025HeaderNativeComponent;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.alibaba.triver.triver_shop.newShop.view.embed.WebSwipeBigCardComponent;
import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.a07;
import tb.a1v;
import tb.aqp;
import tb.bdw;
import tb.brf;
import tb.c7z;
import tb.ckf;
import tb.d7z;
import tb.eqp;
import tb.hps;
import tb.jnp;
import tb.jpu;
import tb.kew;
import tb.khu;
import tb.ltt;
import tb.mop;
import tb.npp;
import tb.r1k;
import tb.r54;
import tb.sk9;
import tb.spp;
import tb.svy;
import tb.t2o;
import tb.top;
import tb.ups;
import tb.vpd;
import tb.wiy;
import tb.xhv;
import tb.xiy;
import tb.xpd;
import tb.y1a;
import tb.yiy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipV25 extends Shop2023BaseComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final int defaultBottomBarBottomMargin = 0;
    public static final int defaultBottomBarSize = 121;
    public static final int defaultHeaderSize = 84;
    public jnp A1;
    public EmbedShopLoftComponent B1;
    public View C1;
    public yiy D1;
    public Tab3LiveContentRender E1;
    public MarginSupportFrameLayout F1;
    public int G1;
    public int H1;
    public int I1;
    public int J1;
    public boolean K1;
    public boolean L1;
    public hps M1;
    public WebSwipeBigCardComponent N1;
    public EnhancedViewPager a1;
    public View b1;
    public ShopOptSwipeLayout c1;
    public ShopSwipeListenerLayout d1;
    public ViewGroup e1;
    public PerceptionSizeFrameLayout f1;
    public ViewGroup g1;
    public PerceptionLinearLayout h1;
    public View i1;
    public ShopContainerPageAdapter j1;
    public TUrlImageView k1;
    public int l1;
    public int m1;
    public int n1;
    public boolean p1;
    public boolean q1;
    public boolean r1;
    public boolean s1;
    public boolean t1;
    public boolean u1;
    public int v1;
    public int w1;
    public Shop2025HeaderNativeComponent y1;
    public svy z1;
    public final boolean o1 = true;
    public boolean x1 = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FlagShipV25 f3292a;

        static {
            t2o.a(766510238);
        }

        public a(FlagShipV25 flagShipV25) {
            ckf.g(flagShipV25, "this$0");
            this.f3292a = flagShipV25;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FlagShipV25$AnimatorListener");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            FlagShipV25.C1(this.f3292a, false);
            this.f3292a.M();
            ShopOptSwipeLayout s1 = FlagShipV25.s1(this.f3292a);
            if (s1 != null) {
                s1.forceInterceptAllTouchEvent(false);
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
            FlagShipV25.C1(this.f3292a, true);
            ShopOptSwipeLayout s1 = FlagShipV25.s1(this.f3292a);
            if (s1 != null) {
                s1.forceInterceptAllTouchEvent(true);
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
            t2o.a(766510239);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
            super(FlagShipV25.this);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FlagShipV25$hideTab3$1");
        }

        @Override // com.alibaba.triver.triver_shop.shop2023.FlagShipV25.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            super.onAnimationEnd(animator);
            MarginSupportFrameLayout N1 = FlagShipV25.N1(FlagShipV25.this);
            if (N1 != null) {
                ViewGroup.LayoutParams layoutParams = N1.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.topToBottom = 0;
                    layoutParams2.topToTop = -1;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
                    MarginSupportFrameLayout N12 = FlagShipV25.N1(FlagShipV25.this);
                    if (N12 != null) {
                        N12.setLayoutParams(layoutParams2);
                        if (FlagShipV25.m1(FlagShipV25.this)) {
                            PerceptionLinearLayout M1 = FlagShipV25.M1(FlagShipV25.this);
                            if (M1 != null) {
                                PerceptionSizeFrameLayout r1 = FlagShipV25.r1(FlagShipV25.this);
                                if (r1 != null) {
                                    M1.setZ(r1.getZ());
                                } else {
                                    ckf.y("navViewContainer");
                                    throw null;
                                }
                            } else {
                                ckf.y("shopHeaderContainer");
                                throw null;
                            }
                        } else {
                            PerceptionLinearLayout M12 = FlagShipV25.M1(FlagShipV25.this);
                            if (M12 != null) {
                                M12.setZ(0.0f);
                            } else {
                                ckf.y("shopHeaderContainer");
                                throw null;
                            }
                        }
                        hps O1 = FlagShipV25.O1(FlagShipV25.this);
                        if (O1 != null) {
                            O1.destroyView();
                        }
                        FlagShipV25.S1(FlagShipV25.this, null);
                        MarginSupportFrameLayout N13 = FlagShipV25.N1(FlagShipV25.this);
                        if (N13 != null) {
                            N13.removeAllViews();
                            vpd I = FlagShipV25.v1(FlagShipV25.this).I();
                            if (I != null) {
                                I.c(FlagShipV25.v1(FlagShipV25.this).C(), FlagShipV25.v1(FlagShipV25.this).p1());
                                return;
                            }
                            return;
                        }
                        ckf.y("tab3Container");
                        throw null;
                    }
                    ckf.y("tab3Container");
                    throw null;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
            ckf.y("tab3Container");
            throw null;
        }
    }

    static {
        t2o.a(766510237);
    }

    public FlagShipV25() {
        kew.P(Integer.valueOf((int) mop.KEY_FLAG_SHIP_BIG_CARD_SIZE_RPX));
        kew.P(Integer.valueOf((int) mop.KEY_FLAG_SHIP_H5_BIG_CARD_SIZE_RPX));
        new top();
    }

    public static final /* synthetic */ void A1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8cfbc5", new Object[]{flagShipV25});
        } else {
            flagShipV25.a3();
        }
    }

    public static final /* synthetic */ void B1(FlagShipV25 flagShipV25, BaseTemplateComponent baseTemplateComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6173a", new Object[]{flagShipV25, baseTemplateComponent, str});
        } else {
            flagShipV25.d0(baseTemplateComponent, str);
        }
    }

    public static final /* synthetic */ void C1(FlagShipV25 flagShipV25, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c1d1d5", new Object[]{flagShipV25, new Boolean(z)});
        } else {
            flagShipV25.i0(z);
        }
    }

    public static final /* synthetic */ void D1(FlagShipV25 flagShipV25, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("655b3833", new Object[]{flagShipV25, new Boolean(z)});
        } else {
            flagShipV25.x1 = z;
        }
    }

    public static final /* synthetic */ boolean G1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e092ef5", new Object[]{flagShipV25})).booleanValue();
        }
        return flagShipV25.b3();
    }

    public static final /* synthetic */ void H0(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc2abb8", new Object[]{flagShipV25});
        } else {
            flagShipV25.e();
        }
    }

    public static final /* synthetic */ void H1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d55aec", new Object[]{flagShipV25});
        } else {
            flagShipV25.d3();
        }
    }

    public static final /* synthetic */ void K0(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347c8f12", new Object[]{flagShipV25});
        } else {
            flagShipV25.f();
        }
    }

    public static final /* synthetic */ boolean L1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ab3d993", new Object[]{flagShipV25})).booleanValue();
        }
        return flagShipV25.L1;
    }

    public static final /* synthetic */ PerceptionLinearLayout M1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerceptionLinearLayout) ipChange.ipc$dispatch("d751ef01", new Object[]{flagShipV25});
        }
        return flagShipV25.h1;
    }

    public static final /* synthetic */ MarginSupportFrameLayout N1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MarginSupportFrameLayout) ipChange.ipc$dispatch("d5f7aa84", new Object[]{flagShipV25});
        }
        return flagShipV25.F1;
    }

    public static final /* synthetic */ hps O1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hps) ipChange.ipc$dispatch("b5ce82c5", new Object[]{flagShipV25});
        }
        return flagShipV25.M1;
    }

    public static final /* synthetic */ WebSwipeBigCardComponent P1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebSwipeBigCardComponent) ipChange.ipc$dispatch("f337a7ed", new Object[]{flagShipV25});
        }
        return flagShipV25.N1;
    }

    public static final /* synthetic */ void Q1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871fc2db", new Object[]{flagShipV25});
        } else {
            flagShipV25.f3();
        }
    }

    public static final /* synthetic */ boolean R1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44020601", new Object[]{flagShipV25})).booleanValue();
        }
        return flagShipV25.K1;
    }

    public static final /* synthetic */ void S1(FlagShipV25 flagShipV25, hps hpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5794a19", new Object[]{flagShipV25, hpsVar});
        } else {
            flagShipV25.M1 = hpsVar;
        }
    }

    public static final /* synthetic */ void T1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43876f00", new Object[]{flagShipV25});
        } else {
            flagShipV25.g3();
        }
    }

    public static final /* synthetic */ boolean d1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28d014a8", new Object[]{flagShipV25})).booleanValue();
        }
        return flagShipV25.d2();
    }

    public static final /* synthetic */ ViewGroup e1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2b2fcd6d", new Object[]{flagShipV25});
        }
        return flagShipV25.g1;
    }

    public static final /* synthetic */ View f1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3e9238e8", new Object[]{flagShipV25});
        }
        return flagShipV25.i1;
    }

    public static final /* synthetic */ JSONObject g1(FlagShipV25 flagShipV25, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3ce56b7a", new Object[]{flagShipV25, str});
        }
        return flagShipV25.e2(str);
    }

    public static final /* synthetic */ EnhancedViewPager h1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnhancedViewPager) ipChange.ipc$dispatch("5438f035", new Object[]{flagShipV25});
        }
        return flagShipV25.a1;
    }

    public static final /* synthetic */ FragmentActivity i1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("39b7dc5d", new Object[]{flagShipV25});
        }
        return flagShipV25.n();
    }

    public static /* synthetic */ Object ipc$super(FlagShipV25 flagShipV25, String str, Object... objArr) {
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
                return new Boolean(flagShipV25.d());
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FlagShipV25");
        }
    }

    public static final /* synthetic */ int j1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55f5014a", new Object[]{flagShipV25})).intValue();
        }
        return flagShipV25.o();
    }

    public static final /* synthetic */ boolean k1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("438087f", new Object[]{flagShipV25})).booleanValue();
        }
        return flagShipV25.r1;
    }

    public static final /* synthetic */ boolean l1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af9dc02d", new Object[]{flagShipV25})).booleanValue();
        }
        return flagShipV25.s1;
    }

    public static final /* synthetic */ boolean m1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8167016f", new Object[]{flagShipV25})).booleanValue();
        }
        return flagShipV25.p1;
    }

    public static final /* synthetic */ EmbedShopLoftComponent n1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmbedShopLoftComponent) ipChange.ipc$dispatch("95ed2ed", new Object[]{flagShipV25});
        }
        return flagShipV25.B1;
    }

    public static final /* synthetic */ boolean o1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b67ffdb0", new Object[]{flagShipV25})).booleanValue();
        }
        return flagShipV25.r();
    }

    public static final /* synthetic */ boolean p1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2882a53", new Object[]{flagShipV25})).booleanValue();
        }
        return flagShipV25.v();
    }

    public static final /* synthetic */ Shop2025HeaderNativeComponent q1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Shop2025HeaderNativeComponent) ipChange.ipc$dispatch("be77ac6f", new Object[]{flagShipV25});
        }
        return flagShipV25.y1;
    }

    public static final /* synthetic */ PerceptionSizeFrameLayout r1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerceptionSizeFrameLayout) ipChange.ipc$dispatch("a6591f69", new Object[]{flagShipV25});
        }
        return flagShipV25.f1;
    }

    public static final /* synthetic */ ShopOptSwipeLayout s1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopOptSwipeLayout) ipChange.ipc$dispatch("384c1c6d", new Object[]{flagShipV25});
        }
        return flagShipV25.c1;
    }

    public static final /* synthetic */ FrameLayout t1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("420964a0", new Object[]{flagShipV25});
        }
        return flagShipV25.H();
    }

    public static final /* synthetic */ jnp u1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnp) ipChange.ipc$dispatch("9dd9d2d8", new Object[]{flagShipV25});
        }
        return flagShipV25.A1;
    }

    public static final /* synthetic */ ShopDataParser v1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("f10590dd", new Object[]{flagShipV25});
        }
        return flagShipV25.J();
    }

    public static final /* synthetic */ int w1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("914bed42", new Object[]{flagShipV25})).intValue();
        }
        return flagShipV25.L();
    }

    public static final /* synthetic */ Tab3LiveContentRender x1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Tab3LiveContentRender) ipChange.ipc$dispatch("c1e1e76e", new Object[]{flagShipV25});
        }
        return flagShipV25.E1;
    }

    public static final /* synthetic */ ViewGroup y1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("f99f9473", new Object[]{flagShipV25});
        }
        return flagShipV25.e1;
    }

    public static final /* synthetic */ boolean z1(FlagShipV25 flagShipV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4915f4a", new Object[]{flagShipV25})).booleanValue();
        }
        return flagShipV25.Y2();
    }

    public final void F1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e3150", new Object[]{this, new Boolean(z)});
        } else if (z) {
            ShopSwipeListenerLayout shopSwipeListenerLayout = this.d1;
            if (shopSwipeListenerLayout != null) {
                kew.e(shopSwipeListenerLayout, H().getHeight());
            } else {
                ckf.y("centerContainer");
                throw null;
            }
        } else if (ckf.b(J().D(J().C()), mop.KEY_ALL_ITEMS)) {
            ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.d1;
            if (shopSwipeListenerLayout2 != null) {
                kew.e(shopSwipeListenerLayout2, (((H().getHeight() - L()) - this.l1) - this.m1) - this.n1);
            } else {
                ckf.y("centerContainer");
                throw null;
            }
        } else {
            ShopSwipeListenerLayout shopSwipeListenerLayout3 = this.d1;
            if (shopSwipeListenerLayout3 != null) {
                kew.e(shopSwipeListenerLayout3, ((H().getHeight() - L()) - this.l1) - this.n1);
            } else {
                ckf.y("centerContainer");
                throw null;
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

    public final TextView P2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("b106189a", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void Q0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8c47cb", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2025HeaderNativeComponent shop2025HeaderNativeComponent = this.y1;
        if (shop2025HeaderNativeComponent != null) {
            shop2025HeaderNativeComponent.R0(z);
            if (z) {
                ViewGroup viewGroup = this.e1;
                if (viewGroup != null) {
                    kew.C(viewGroup);
                } else {
                    ckf.y("tabBarContainer");
                    throw null;
                }
            } else if (!this.r1) {
                ViewGroup viewGroup2 = this.e1;
                if (viewGroup2 != null) {
                    kew.g0(viewGroup2);
                } else {
                    ckf.y("tabBarContainer");
                    throw null;
                }
            }
        } else {
            ckf.y("headerNativeComponent");
            throw null;
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

    public final void R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335827c3", new Object[]{this});
            return;
        }
        Map<String, ShopComponentModel> m = J().O0().m();
        if (m != null) {
            ShopComponentModel shopComponentModel = m.get(yiy.templateName);
            if (shopComponentModel != null) {
                this.n1 = kew.v(Integer.valueOf(shopComponentModel.getRenderHeight()));
            }
            m.get("tb_shop_header_shop_info_2023_native");
            ShopComponentModel shopComponentModel2 = m.get(c7z.templateName);
            if (shopComponentModel2 != null) {
                this.H1 = kew.v(Integer.valueOf(shopComponentModel2.getRenderHeight()));
            }
            ShopComponentModel shopComponentModel3 = m.get(d7z.templateName);
            if (shopComponentModel3 != null) {
                this.I1 = kew.v(Integer.valueOf(shopComponentModel3.getRenderHeight()));
            }
        }
        this.J1 = this.I1 + this.H1;
        int v = kew.v(88);
        this.G1 = v;
        this.l1 = v;
        if (this.n1 == 0) {
            this.n1 = kew.v(121);
        }
        this.m1 = kew.v(84);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4c47713", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
            return;
        }
        super.T();
        WebSwipeBigCardComponent webSwipeBigCardComponent = this.N1;
        if (webSwipeBigCardComponent != null) {
            webSwipeBigCardComponent.k();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void T0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39a87a0", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2025HeaderNativeComponent shop2025HeaderNativeComponent = this.y1;
        if (shop2025HeaderNativeComponent != null) {
            shop2025HeaderNativeComponent.S0(z, ShopExtKt.t(J(), z));
        } else {
            ckf.y("headerNativeComponent");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void U() {
        WebSwipeBigCardComponent webSwipeBigCardComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.U();
        Tab3LiveContentRender tab3LiveContentRender = this.E1;
        if (tab3LiveContentRender != null) {
            tab3LiveContentRender.onResume();
        }
        if (O() && r() && (webSwipeBigCardComponent = this.N1) != null) {
            webSwipeBigCardComponent.j();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void U0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fb09c29", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2025HeaderNativeComponent shop2025HeaderNativeComponent = this.y1;
        if (shop2025HeaderNativeComponent != null) {
            shop2025HeaderNativeComponent.T0(z);
            if (z) {
                ViewGroup viewGroup = this.e1;
                if (viewGroup != null) {
                    kew.S(viewGroup, sk9.a.d.INSTANCE.b());
                } else {
                    ckf.y("tabBarContainer");
                    throw null;
                }
            } else {
                ViewGroup viewGroup2 = this.e1;
                if (viewGroup2 != null) {
                    kew.S(viewGroup2, sk9.a.d.INSTANCE.a());
                } else {
                    ckf.y("tabBarContainer");
                    throw null;
                }
            }
            yiy yiyVar = this.D1;
            if (yiyVar != null) {
                yiyVar.M(z);
                return;
            }
            return;
        }
        ckf.y("headerNativeComponent");
        throw null;
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

    public final void V2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad10f563", new Object[]{this});
            return;
        }
        if (v()) {
            ViewGroup viewGroup = this.g1;
            if (viewGroup != null) {
                kew.e(viewGroup, k());
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.f1;
                if (perceptionSizeFrameLayout != null) {
                    kew.S(perceptionSizeFrameLayout, sk9.Companion.j());
                    if (!P()) {
                        TUrlImageView tUrlImageView = this.k1;
                        if (tUrlImageView != null) {
                            kew.B(tUrlImageView);
                        } else {
                            ckf.y("loftAtmosphereBgPic");
                            throw null;
                        }
                    }
                    if (this.L1) {
                        View view = this.i1;
                        if (view != null) {
                            view.setBackgroundColor(Color.parseColor("#66000000"));
                            View view2 = this.i1;
                            if (view2 != null) {
                                kew.e(view2, k());
                                View view3 = this.i1;
                                if (view3 != null) {
                                    kew.B(view3);
                                    View view4 = this.C1;
                                    if (view4 != null) {
                                        view4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#00000000"), Color.parseColor("#8F000000")}));
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
                            ckf.y("bigCardTopBlackShadowBg");
                            throw null;
                        }
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
            PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.f1;
            if (perceptionSizeFrameLayout2 != null) {
                kew.S(perceptionSizeFrameLayout2, sk9.Companion.j());
                View view5 = this.b1;
                if (view5 != null) {
                    kew.T(view5);
                    PerceptionLinearLayout perceptionLinearLayout = this.h1;
                    if (perceptionLinearLayout != null) {
                        kew.T(perceptionLinearLayout);
                        TUrlImageView tUrlImageView2 = this.k1;
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
        ViewGroup viewGroup2 = this.e1;
        if (viewGroup2 != null) {
            kew.S(viewGroup2, sk9.a.C1054a.INSTANCE.b());
            J().d0();
            F1(J().P1(J().d0(), J().f0()));
            J().d0();
            return;
        }
        ckf.y("tabBarContainer");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58479d3a", new Object[]{this, str});
            return;
        }
        ckf.g(str, "tabName");
        r54.H(new FlagShipV25$onContentPageScrollToTopCallback$1(this));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288626bd", new Object[]{this});
            return;
        }
        a3();
        a1v.c(J(), "Page_Shop_Live_FloatWindow_Click", null, null, 8, null);
    }

    public final boolean Y2() {
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
    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4498028c", new Object[]{this});
        } else {
            r54.C(new FlagShipV25$onStatusBarStyleChanged$1(this));
        }
    }

    public final boolean b3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1af398d5", new Object[]{this})).booleanValue();
        }
        if (J().C() != 0 || !r()) {
            return false;
        }
        return true;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad7d9eea", new Object[]{this})).booleanValue();
        }
        if (!d2()) {
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
            r54.C(new FlagShipV25$onSubscribeStatusChanged$1(this, z, jSONObject));
        }
    }

    public final void c3() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eec639", new Object[]{this});
            return;
        }
        v0(true);
        r0(true);
        ShopMoreUtils.INSTANCE.n(J());
        WebSwipeBigCardComponent webSwipeBigCardComponent = new WebSwipeBigCardComponent();
        this.N1 = webSwipeBigCardComponent;
        int O = kew.O(Integer.valueOf(k() - e3()));
        JSONArray J = J().J();
        if (J != null && J.size() == 1) {
            z = true;
        }
        int O2 = kew.O(Integer.valueOf(sk9.Companion.g())) + kew.O(Integer.valueOf(this.J1)) + O;
        if (!z) {
            O2 += 63;
        }
        webSwipeBigCardComponent.w(Integer.valueOf(O2));
        webSwipeBigCardComponent.x(Integer.valueOf(kew.O(Integer.valueOf(this.G1))));
        webSwipeBigCardComponent.v(this.J1);
        webSwipeBigCardComponent.m(O);
        webSwipeBigCardComponent.n(new FlagShipV25$createSwipeBigCard$1(this));
        webSwipeBigCardComponent.o(new FlagShipV25$createSwipeBigCard$2(this));
        webSwipeBigCardComponent.l(J(), I(), n());
        t0(true);
        ViewGroup viewGroup = this.g1;
        if (viewGroup != null) {
            kew.a(viewGroup, webSwipeBigCardComponent.e());
            ViewGroup viewGroup2 = this.g1;
            if (viewGroup2 != null) {
                viewGroup2.addView(webSwipeBigCardComponent.d().d());
                ViewGroup viewGroup3 = this.g1;
                if (viewGroup3 != null) {
                    viewGroup3.addView(webSwipeBigCardComponent.d().e());
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

    public final void d3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2a99f6", new Object[]{this});
        } else if (J().C() == 0 && r()) {
            Shop2025HeaderNativeComponent shop2025HeaderNativeComponent = this.y1;
            if (shop2025HeaderNativeComponent != null) {
                Shop2025HeaderNativeComponent.V(shop2025HeaderNativeComponent, 0L, null, 3, null);
            } else {
                ckf.y("headerNativeComponent");
                throw null;
            }
        }
    }

    public final int e3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b67ba24b", new Object[]{this})).intValue();
        }
        return k() - J().O0().l().a();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ce96e15", new Object[]{this})).intValue();
        }
        return J().O0().l().b() + this.J1;
    }

    public final int l2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("242cf213", new Object[]{this})).intValue();
        }
        if (!O() || !v()) {
            return this.l1 + L();
        }
        return e3();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public ViewPager m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("8aa45209", new Object[]{this});
        }
        EnhancedViewPager enhancedViewPager = this.a1;
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
        Z2();
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

    public final void J1(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5eb45dc", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        npp.Companion.b(ckf.p("changeOtherTabToFistTab, current expanded : ", Boolean.valueOf(r())));
        if (v()) {
            Shop2025HeaderNativeComponent shop2025HeaderNativeComponent = this.y1;
            if (shop2025HeaderNativeComponent != null) {
                Shop2025HeaderNativeComponent.V(shop2025HeaderNativeComponent, 0L, null, 2, null);
                Shop2025HeaderNativeComponent shop2025HeaderNativeComponent2 = this.y1;
                if (shop2025HeaderNativeComponent2 != null) {
                    shop2025HeaderNativeComponent2.X0(true);
                } else {
                    ckf.y("headerNativeComponent");
                    throw null;
                }
            } else {
                ckf.y("headerNativeComponent");
                throw null;
            }
        }
    }

    public final void Q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78705187", new Object[]{this});
            return;
        }
        if (!khu.e()) {
            r0(J().O0().p());
        }
        if (v()) {
            ViewGroup viewGroup = this.g1;
            if (viewGroup != null) {
                kew.e(viewGroup, k());
                if (J().O0().r()) {
                    u0(true);
                    EmbedShopLoftComponent embedShopLoftComponent = new EmbedShopLoftComponent(n(), J(), I());
                    if (J().O0().q()) {
                        this.L1 = true;
                        J().P2(true);
                        embedShopLoftComponent.v().r(true);
                    }
                    embedShopLoftComponent.N(kew.v(92) + sk9.Companion.g());
                    ViewGroup viewGroup2 = this.g1;
                    if (viewGroup2 != null) {
                        kew.a(viewGroup2, embedShopLoftComponent.x());
                        embedShopLoftComponent.z();
                        embedShopLoftComponent.J(new FlagShipV25$initBigCard$1(this));
                        this.B1 = embedShopLoftComponent;
                        if (this.L1) {
                            embedShopLoftComponent.y();
                        }
                        if (J().v1("live") == null) {
                            S2();
                        }
                    } else {
                        ckf.y("bigCardContainer");
                        throw null;
                    }
                }
                if (J().O0().u()) {
                    c3();
                    return;
                }
                return;
            }
            ckf.y("bigCardContainer");
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
            ShopContainerPageAdapter shopContainerPageAdapter = this.j1;
            if (shopContainerPageAdapter != null) {
                shopContainerPageAdapter.j(p());
            } else {
                ckf.y("shopContainerPageAdapter");
                throw null;
            }
        }
        ShopContainerPageAdapter shopContainerPageAdapter2 = this.j1;
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
            this.p1 = J().P1(J().C(), J().p1());
            this.s1 = J().e3(J().C(), J().p1());
            boolean c2 = spp.c(J().S(o, i2));
            r();
            l0(k);
            o();
            yiy yiyVar = this.D1;
            if (yiyVar != null) {
                yiyVar.H(o());
            }
            if (o == 0 && k != 0) {
                I1();
            }
            if (o != 0 && k == 0) {
                J1(o, i2);
            }
            if (!(o == 0 || k == 0)) {
                K1();
            }
            if (ckf.b(J().D(k), mop.KEY_ALL_ITEMS)) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.f1;
                if (perceptionSizeFrameLayout != null) {
                    kew.e(perceptionSizeFrameLayout, this.m1);
                    svy svyVar = this.z1;
                    if (svyVar != null) {
                        svyVar.f(i3);
                    } else {
                        ckf.y("shop25NavBar");
                        throw null;
                    }
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            } else {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.f1;
                if (perceptionSizeFrameLayout2 != null) {
                    kew.e(perceptionSizeFrameLayout2, 0);
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            }
            F1(this.p1);
            if (c2) {
                Q0(false);
                U0(false);
                this.q1 = false;
            }
            y1a<Integer, Integer, Integer, Integer, xhv> F = F();
            if (F != null) {
                F.invoke(Integer.valueOf(k), Integer.valueOf(i4), Integer.valueOf(o), Integer.valueOf(i2));
            }
            b0();
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
        } else {
            super.onSwipeDown();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4624ae1d", new Object[]{this});
        } else {
            super.onSwipeUp();
        }
    }

    public void E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d0cb3b", new Object[]{this});
            return;
        }
        J().C2(L() + this.l1);
        J().B2(this.n1);
        if (!v() || s() != 0) {
            Shop2025HeaderNativeComponent shop2025HeaderNativeComponent = this.y1;
            if (shop2025HeaderNativeComponent != null) {
                shop2025HeaderNativeComponent.L(false, 0L);
            } else {
                ckf.y("headerNativeComponent");
                throw null;
            }
        } else {
            int g = sk9.Companion.g();
            EmbedShopLoftComponent embedShopLoftComponent = this.B1;
            if (embedShopLoftComponent != null) {
                embedShopLoftComponent.G(g);
            }
            Shop2025HeaderNativeComponent shop2025HeaderNativeComponent2 = this.y1;
            if (shop2025HeaderNativeComponent2 != null) {
                shop2025HeaderNativeComponent2.L(true, 0L);
            } else {
                ckf.y("headerNativeComponent");
                throw null;
            }
        }
        if (u() == 0) {
            ShopContainerPageAdapter shopContainerPageAdapter = this.j1;
            if (shopContainerPageAdapter != null) {
                shopContainerPageAdapter.i(u());
            } else {
                ckf.y("shopContainerPageAdapter");
                throw null;
            }
        }
        if (u() == 0) {
            onPageSelected(u());
            return;
        }
        if (J().d0() == 0 && J().P1(J().d0(), J().f0())) {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.f1;
            if (perceptionSizeFrameLayout != null) {
                kew.d0(perceptionSizeFrameLayout, this.l1 + L());
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        }
        EnhancedViewPager enhancedViewPager = this.a1;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCurrentItem(u(), false);
        } else {
            ckf.y("contentViewPager");
            throw null;
        }
    }

    public final void I1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc51c7c", new Object[]{this});
            return;
        }
        npp.Companion.b(ckf.p("changeFirstTabToOtherTab, current expanded : ", Boolean.valueOf(r())));
        if (this.p1) {
            Shop2025HeaderNativeComponent shop2025HeaderNativeComponent = this.y1;
            if (shop2025HeaderNativeComponent != null) {
                shop2025HeaderNativeComponent.U0(true);
                Shop2025HeaderNativeComponent shop2025HeaderNativeComponent2 = this.y1;
                if (shop2025HeaderNativeComponent2 != null) {
                    shop2025HeaderNativeComponent2.U(0L, new FlagShipV25$changeFirstTabToOtherTab$1(this));
                } else {
                    ckf.y("headerNativeComponent");
                    throw null;
                }
            } else {
                ckf.y("headerNativeComponent");
                throw null;
            }
        } else if (E()) {
            A0(false);
            Shop2025HeaderNativeComponent shop2025HeaderNativeComponent3 = this.y1;
            if (shop2025HeaderNativeComponent3 != null) {
                shop2025HeaderNativeComponent3.L(false, 0L);
            } else {
                ckf.y("headerNativeComponent");
                throw null;
            }
        } else {
            Shop2025HeaderNativeComponent shop2025HeaderNativeComponent4 = this.y1;
            if (shop2025HeaderNativeComponent4 != null) {
                Shop2025HeaderNativeComponent.V(shop2025HeaderNativeComponent4, 0L, null, 2, null);
            } else {
                ckf.y("headerNativeComponent");
                throw null;
            }
        }
        r54.F(new FlagShipV25$changeFirstTabToOtherTab$2(this));
    }

    public final void K1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b73dfc", new Object[]{this});
        } else if (this.p1) {
            Shop2025HeaderNativeComponent shop2025HeaderNativeComponent = this.y1;
            if (shop2025HeaderNativeComponent != null) {
                shop2025HeaderNativeComponent.U0(true);
                Shop2025HeaderNativeComponent shop2025HeaderNativeComponent2 = this.y1;
                if (shop2025HeaderNativeComponent2 != null) {
                    shop2025HeaderNativeComponent2.U(0L, new FlagShipV25$changeOtherToOther$1(this));
                } else {
                    ckf.y("headerNativeComponent");
                    throw null;
                }
            } else {
                ckf.y("headerNativeComponent");
                throw null;
            }
        } else {
            Shop2025HeaderNativeComponent shop2025HeaderNativeComponent3 = this.y1;
            if (shop2025HeaderNativeComponent3 != null) {
                shop2025HeaderNativeComponent3.X0(false);
                Shop2025HeaderNativeComponent shop2025HeaderNativeComponent4 = this.y1;
                if (shop2025HeaderNativeComponent4 != null) {
                    Shop2025HeaderNativeComponent.V(shop2025HeaderNativeComponent4, 0L, null, 2, null);
                } else {
                    ckf.y("headerNativeComponent");
                    throw null;
                }
            } else {
                ckf.y("headerNativeComponent");
                throw null;
            }
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
        fragmentActivity.getLifecycle().addObserver(C());
        super.N(fragmentActivity, shopDataParser, shopDXEngine);
        R2();
        shopDataParser.R1();
        shopDataParser.x2(0);
        shopDataParser.w2(0);
        shopDataParser.m1().r(new FlagShipV25$initComponent$1(this));
        shopDataParser.m1().C(new FlagShipV25$initComponent$2(this));
        shopDataParser.D2(new FlagShipV25$initComponent$3(this, shopDataParser));
        this.v1 = ViewConfiguration.get(fragmentActivity).getScaledTouchSlop();
        khu.a(fragmentActivity, true);
        U2();
        shopDataParser.Y2(mop.KEY_INIT_SHOP_BASE_VIEW, Long.valueOf(lttVar.a()));
        lttVar.b();
        Q2();
        T2();
        V2();
        shopDataParser.Y2(mop.KEY_INIT_SHOP_TEMPLATE_COMPONENT_COST, Long.valueOf(lttVar.a()));
        E1();
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
                this.t1 = false;
            } else {
                this.t1 = true;
            }
        }
        if (ckf.b(str, "live")) {
            a3();
            return;
        }
        int j = J().j(i, i2);
        EnhancedViewPager enhancedViewPager = this.a1;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCurrentItem(j, false);
        } else {
            ckf.y("contentViewPager");
            throw null;
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
        b0();
        if (!O()) {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.f1;
            if (perceptionSizeFrameLayout != null) {
                kew.S(perceptionSizeFrameLayout, sk9.Companion.j());
                if (spp.c(J().R())) {
                    Shop2025HeaderNativeComponent shop2025HeaderNativeComponent = this.y1;
                    if (shop2025HeaderNativeComponent != null) {
                        shop2025HeaderNativeComponent.U0(true);
                    } else {
                        ckf.y("headerNativeComponent");
                        throw null;
                    }
                } else {
                    Shop2025HeaderNativeComponent shop2025HeaderNativeComponent2 = this.y1;
                    if (shop2025HeaderNativeComponent2 != null) {
                        shop2025HeaderNativeComponent2.X0(false);
                    } else {
                        ckf.y("headerNativeComponent");
                        throw null;
                    }
                }
                TUrlImageView tUrlImageView = this.k1;
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
        } else if (!z) {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.f1;
            if (perceptionSizeFrameLayout2 != null) {
                kew.S(perceptionSizeFrameLayout2, sk9.Companion.j());
                Shop2025HeaderNativeComponent shop2025HeaderNativeComponent3 = this.y1;
                if (shop2025HeaderNativeComponent3 != null) {
                    shop2025HeaderNativeComponent3.X0(false);
                    EmbedShopLoftComponent embedShopLoftComponent = this.B1;
                    if (embedShopLoftComponent != null) {
                        embedShopLoftComponent.C();
                    }
                    WebSwipeBigCardComponent webSwipeBigCardComponent = this.N1;
                    if (webSwipeBigCardComponent != null) {
                        webSwipeBigCardComponent.k();
                    }
                    TUrlImageView tUrlImageView2 = this.k1;
                    if (tUrlImageView2 != null) {
                        kew.B(tUrlImageView2);
                        ViewGroup viewGroup = this.g1;
                        if (viewGroup != null) {
                            kew.C(viewGroup);
                        } else {
                            ckf.y("bigCardContainer");
                            throw null;
                        }
                    } else {
                        ckf.y("loftAtmosphereBgPic");
                        throw null;
                    }
                } else {
                    ckf.y("headerNativeComponent");
                    throw null;
                }
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        } else if (v()) {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.f1;
            if (perceptionSizeFrameLayout3 != null) {
                kew.S(perceptionSizeFrameLayout3, sk9.Companion.j());
                Shop2025HeaderNativeComponent shop2025HeaderNativeComponent4 = this.y1;
                if (shop2025HeaderNativeComponent4 != null) {
                    shop2025HeaderNativeComponent4.U0(true);
                    EmbedShopLoftComponent embedShopLoftComponent2 = this.B1;
                    if (embedShopLoftComponent2 != null) {
                        embedShopLoftComponent2.E();
                    }
                    ViewGroup viewGroup2 = this.g1;
                    if (viewGroup2 != null) {
                        kew.g0(viewGroup2);
                        WebSwipeBigCardComponent webSwipeBigCardComponent2 = this.N1;
                        if (webSwipeBigCardComponent2 != null) {
                            webSwipeBigCardComponent2.j();
                        }
                    } else {
                        ckf.y("bigCardContainer");
                        throw null;
                    }
                } else {
                    ckf.y("headerNativeComponent");
                    throw null;
                }
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        } else {
            Shop2025HeaderNativeComponent shop2025HeaderNativeComponent5 = this.y1;
            if (shop2025HeaderNativeComponent5 != null) {
                shop2025HeaderNativeComponent5.X0(true);
                PerceptionSizeFrameLayout perceptionSizeFrameLayout4 = this.f1;
                if (perceptionSizeFrameLayout4 != null) {
                    kew.S(perceptionSizeFrameLayout4, sk9.Companion.j());
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            } else {
                ckf.y("headerNativeComponent");
                throw null;
            }
        }
        if (this.p1) {
            Shop2025HeaderNativeComponent shop2025HeaderNativeComponent6 = this.y1;
            if (shop2025HeaderNativeComponent6 != null) {
                shop2025HeaderNativeComponent6.U0(true);
            } else {
                ckf.y("headerNativeComponent");
                throw null;
            }
        }
    }

    public final void S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a759214d", new Object[]{this});
        } else {
            this.E1 = new Tab3LiveContentRender(n(), new ups(brf.a(jpu.a("type", "nativeLiveContainer"), jpu.a("payload", brf.a(jpu.a("source", brf.a(jpu.a("shopLive2023", J().O0().d())))))), J(), 0, 0), true, false);
        }
    }

    public final void U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        View K = kew.K(n(), R.layout.view_flag_shop_v25);
        if (K != null) {
            K.setBackgroundColor(-1);
            View findViewById = K.findViewById(R.id.new_shop_view_center_container);
            ((ShopSwipeListenerLayout) findViewById).setNormalMode(true);
            xhv xhvVar = xhv.INSTANCE;
            ckf.f(findViewById, "contentView.findViewById<ShopSwipeListenerLayout?>(R.id.new_shop_view_center_container)\n                .apply {\n                    this.normalMode = true\n                }");
            this.d1 = (ShopSwipeListenerLayout) findViewById;
            View findViewById2 = K.findViewById(R.id.new_shop_view_status_bar_view);
            ckf.f(findViewById2, "contentView.findViewById(R.id.new_shop_view_status_bar_view)");
            this.b1 = findViewById2;
            View findViewById3 = K.findViewById(R.id.new_shop_view_tab_bar_container);
            ViewGroup viewGroup = (ViewGroup) findViewById3;
            ckf.f(viewGroup, "");
            kew.U(viewGroup, 0);
            kew.X(viewGroup, 0);
            kew.b0(viewGroup, 0);
            ckf.f(findViewById3, "contentView.findViewById<ViewGroup?>(R.id.new_shop_view_tab_bar_container).apply {\n            //汽车店不需要margin\n            setBottomMargin(0)\n            setLeftAndStartMargin(0)\n            setRightAndEndMargin(0)\n        }");
            this.e1 = (ViewGroup) findViewById3;
            View findViewById4 = K.findViewById(R.id.new_shop_view_big_card_view_container);
            ckf.f(findViewById4, "contentView.findViewById(R.id.new_shop_view_big_card_view_container)");
            this.g1 = (ViewGroup) findViewById4;
            View findViewById5 = K.findViewById(R.id.new_shop_view_nav_view_container);
            ((PerceptionSizeFrameLayout) findViewById5).setViewSizeChangedListener(this);
            ckf.f(findViewById5, "contentView.findViewById<PerceptionSizeFrameLayout?>(R.id.new_shop_view_nav_view_container)\n                .apply {\n                    viewSizeChangedListener = this@FlagShipV25\n                }");
            this.f1 = (PerceptionSizeFrameLayout) findViewById5;
            View findViewById6 = K.findViewById(R.id.new_shop_view_header_view_container);
            ((PerceptionLinearLayout) findViewById6).setViewSizeChangedListener(this);
            ckf.f(findViewById6, "contentView.findViewById<PerceptionLinearLayout?>(R.id.new_shop_view_header_view_container)\n                .apply {\n                    viewSizeChangedListener = this@FlagShipV25\n                }");
            this.h1 = (PerceptionLinearLayout) findViewById6;
            View findViewById7 = K.findViewById(R.id.new_shop_view_backGround_img);
            TUrlImageView tUrlImageView = (TUrlImageView) findViewById7;
            ckf.f(findViewById7, "contentView.findViewById<TUrlImageView?>(R.id.new_shop_view_backGround_img).apply {\n//                this.imageUrl =\n//                    shopData.getShopCommonAtmospherePicUrl() ?: ShopExt.DEFAULT_2022_BG_IMG_URL\n//                this.scaleType = ImageView.ScaleType.CENTER_CROP\n            }");
            TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById7;
            View findViewById8 = K.findViewById(R.id.new_shop_view_black_shadow_bg);
            ckf.f(findViewById8, "contentView.findViewById(R.id.new_shop_view_black_shadow_bg)");
            this.i1 = findViewById8;
            this.C1 = new View(n());
            View findViewById9 = K.findViewById(R.id.new_shop_view_loft_atmosphere_bg);
            TUrlImageView tUrlImageView3 = (TUrlImageView) findViewById9;
            ckf.f(findViewById9, "contentView.findViewById<TUrlImageView?>(R.id.new_shop_view_loft_atmosphere_bg).apply {\n//                shopData.getLoftAtmospherePicUrl()?.isNotEmpty {\n//                    this.imageUrl = it\n//                }\n            }");
            this.k1 = (TUrlImageView) findViewById9;
            View findViewById10 = K.findViewById(R.id.new_shop_view_tab3_container);
            ckf.f(findViewById10, "contentView.findViewById(R.id.new_shop_view_tab3_container)");
            this.F1 = (MarginSupportFrameLayout) findViewById10;
            ShopSwipeListenerLayout shopSwipeListenerLayout = this.d1;
            if (shopSwipeListenerLayout != null) {
                ViewGroup.LayoutParams layoutParams = shopSwipeListenerLayout.getLayoutParams();
                if (layoutParams != null && (layoutParams instanceof ConstraintLayout.LayoutParams)) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.f1;
                    if (perceptionSizeFrameLayout != null) {
                        layoutParams2.topToBottom = perceptionSizeFrameLayout.getId();
                        layoutParams2.topToTop = -1;
                        ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.d1;
                        if (shopSwipeListenerLayout2 != null) {
                            shopSwipeListenerLayout2.setLayoutParams(layoutParams);
                        } else {
                            ckf.y("centerContainer");
                            throw null;
                        }
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                }
                EnhancedViewPager enhancedViewPager = new EnhancedViewPager(n());
                enhancedViewPager.setId(R.id.new_shop_view_view_pager);
                r1k r1kVar = new r1k(J());
                npp.Companion.b(ckf.p("hasFullScreenPage : ", Boolean.valueOf(r1kVar.c())));
                this.a1 = enhancedViewPager;
                enhancedViewPager.setOffscreenPageLimit(r1kVar.getCount() - 1);
                FragmentManager supportFragmentManager = n().getSupportFragmentManager();
                ckf.f(supportFragmentManager, "context.supportFragmentManager");
                ShopContainerPageAdapter shopContainerPageAdapter = new ShopContainerPageAdapter(supportFragmentManager);
                this.j1 = shopContainerPageAdapter;
                shopContainerPageAdapter.k(r1kVar);
                ShopContainerPageAdapter shopContainerPageAdapter2 = this.j1;
                if (shopContainerPageAdapter2 != null) {
                    enhancedViewPager.setAdapter(shopContainerPageAdapter2);
                    enhancedViewPager.addOnPageChangeListener(this);
                    ShopSwipeListenerLayout shopSwipeListenerLayout3 = this.d1;
                    if (shopSwipeListenerLayout3 != null) {
                        kew.a(shopSwipeListenerLayout3, enhancedViewPager);
                        ShopOptSwipeLayout shopOptSwipeLayout = new ShopOptSwipeLayout(n());
                        this.c1 = shopOptSwipeLayout;
                        shopOptSwipeLayout.setSwipeListener(this);
                        shopOptSwipeLayout.setExpandedStatusGetter(new FlagShipV25$initView$8(this));
                        kew.a(shopOptSwipeLayout, K);
                        shopOptSwipeLayout.setInCenterContainerFlag(Boolean.FALSE);
                        shopOptSwipeLayout.setScrollThreshold(this.v1);
                        kew.a(H(), shopOptSwipeLayout);
                        View view = this.b1;
                        if (view != null) {
                            kew.e(view, L());
                            ViewGroup viewGroup2 = this.g1;
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
            } else {
                ckf.y("centerContainer");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c6  */
    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Z(android.view.View r11, android.view.MotionEvent r12, int r13) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.shop2023.FlagShipV25.Z(android.view.View, android.view.MotionEvent, int):void");
    }

    public void Z2() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d8ba32", new Object[]{this});
            return;
        }
        j0(true);
        EnhancedViewPager enhancedViewPager = this.a1;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCanScroll(true);
            EnhancedViewPager enhancedViewPager2 = this.a1;
            if (enhancedViewPager2 != null) {
                enhancedViewPager2.setCanDispatchToChild(true);
                if (!this.r1 && !this.s1 && this.o1 && !A() && !this.p1 && !j()) {
                    boolean z2 = this.u1;
                    ShopOptSwipeLayout shopOptSwipeLayout = this.c1;
                    if (shopOptSwipeLayout != null) {
                        shopOptSwipeLayout.forceInterceptAllTouchEvent(false);
                        this.u1 = false;
                        this.w1 = 0;
                        if (z2) {
                            ViewGroup viewGroup = this.g1;
                            if (viewGroup != null) {
                                kew.e(viewGroup, k());
                                D0(false);
                                Shop2025HeaderNativeComponent shop2025HeaderNativeComponent = this.y1;
                                if (shop2025HeaderNativeComponent != null) {
                                    if (O() && v()) {
                                        z = true;
                                    }
                                    shop2025HeaderNativeComponent.s0(z);
                                    return;
                                }
                                ckf.y("headerNativeComponent");
                                throw null;
                            }
                            ckf.y("bigCardContainer");
                            throw null;
                        }
                        return;
                    }
                    ckf.y("outerSwiperLayout");
                    throw null;
                }
                return;
            }
            ckf.y("contentViewPager");
            throw null;
        }
        ckf.y("contentViewPager");
        throw null;
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
        if (this.p1) {
            F1(true);
        } else {
            F1(false);
        }
    }

    public final void a3() {
        View contentView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37009f7d", new Object[]{this});
        } else if (!this.r1) {
            Pair<Integer, Integer> v1 = J().v1("live");
            if (v1 != null) {
                if (O()) {
                    this.q1 = true;
                }
                EnhancedViewPager enhancedViewPager = this.a1;
                if (enhancedViewPager != null) {
                    enhancedViewPager.setCurrentItem(J().j(v1.getFirst().intValue(), v1.getSecond().intValue()), false);
                } else {
                    ckf.y("contentViewPager");
                    throw null;
                }
            } else {
                npp.Companion.b("do not find live tab");
                if (O()) {
                    this.q1 = true;
                }
                this.r1 = true;
                Tab3LiveContentRender tab3LiveContentRender = this.E1;
                if (tab3LiveContentRender != null && (contentView = tab3LiveContentRender.getContentView()) != null) {
                    Shop2025HeaderNativeComponent shop2025HeaderNativeComponent = this.y1;
                    if (shop2025HeaderNativeComponent != null) {
                        shop2025HeaderNativeComponent.U(0L, new FlagShipV25$onShopLoftLiveClick$1$1(this, contentView));
                    } else {
                        ckf.y("headerNativeComponent");
                        throw null;
                    }
                }
            }
        }
    }

    public final boolean d2() {
        View contentView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cca356c2", new Object[]{this})).booleanValue();
        }
        if (this.q1) {
            this.q1 = false;
            this.r1 = false;
            if (J().C() != 0) {
                O0(0, 0, J().S(0, 0));
                Shop2025HeaderNativeComponent shop2025HeaderNativeComponent = this.y1;
                if (shop2025HeaderNativeComponent != null) {
                    Shop2025HeaderNativeComponent.P(shop2025HeaderNativeComponent, 0L, null, 2, null);
                } else {
                    ckf.y("headerNativeComponent");
                    throw null;
                }
            } else {
                Q0(false);
                Tab3LiveContentRender tab3LiveContentRender = this.E1;
                if (!(tab3LiveContentRender == null || (contentView = tab3LiveContentRender.getContentView()) == null)) {
                    ViewGroup viewGroup = this.g1;
                    if (viewGroup != null) {
                        viewGroup.removeView(contentView);
                    } else {
                        ckf.y("bigCardContainer");
                        throw null;
                    }
                }
                Tab3LiveContentRender tab3LiveContentRender2 = this.E1;
                if (tab3LiveContentRender2 != null) {
                    tab3LiveContentRender2.k();
                }
                Shop2025HeaderNativeComponent shop2025HeaderNativeComponent2 = this.y1;
                if (shop2025HeaderNativeComponent2 != null) {
                    Shop2025HeaderNativeComponent.P(shop2025HeaderNativeComponent2, 0L, null, 2, null);
                    ViewGroup viewGroup2 = this.g1;
                    if (viewGroup2 != null) {
                        kew.e(viewGroup2, k());
                        ViewGroup viewGroup3 = this.e1;
                        if (viewGroup3 != null) {
                            kew.g0(viewGroup3);
                            vpd I = J().I();
                            if (I != null) {
                                I.a(99, 0);
                            }
                            vpd I2 = J().I();
                            if (I2 != null) {
                                I2.c(J().C(), J().p1());
                            }
                        } else {
                            ckf.y("tabBarContainer");
                            throw null;
                        }
                    } else {
                        ckf.y("bigCardContainer");
                        throw null;
                    }
                } else {
                    ckf.y("headerNativeComponent");
                    throw null;
                }
            }
            return false;
        } else if (this.t1 && spp.c(J().R())) {
            npp.Companion.f("goBack to all item");
            Pair<Integer, Integer> v1 = J().v1("allitems");
            if (v1 != null) {
                O0(v1.getFirst().intValue(), v1.getSecond().intValue(), "allitems");
            }
            return false;
        } else if (!this.K1) {
            return true;
        } else {
            f3();
            return false;
        }
    }

    public final void f3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8e6c827", new Object[]{this});
        } else if (this.K1) {
            this.K1 = false;
            if ((!O() || !v() || !r()) && !this.p1) {
                Shop2025HeaderNativeComponent shop2025HeaderNativeComponent = this.y1;
                if (shop2025HeaderNativeComponent != null) {
                    shop2025HeaderNativeComponent.X0(false);
                } else {
                    ckf.y("headerNativeComponent");
                    throw null;
                }
            } else {
                Shop2025HeaderNativeComponent shop2025HeaderNativeComponent2 = this.y1;
                if (shop2025HeaderNativeComponent2 != null) {
                    shop2025HeaderNativeComponent2.U0(true);
                } else {
                    ckf.y("headerNativeComponent");
                    throw null;
                }
            }
            hps hpsVar = this.M1;
            if (hpsVar != null) {
                hpsVar.k();
            }
            y1a<Integer, Integer, Integer, Integer, xhv> F = F();
            if (F != null) {
                F.invoke(Integer.valueOf(J().C()), Integer.valueOf(J().p1()), -1, -1);
            }
            hps hpsVar2 = this.M1;
            if (hpsVar2 != null) {
                hpsVar2.v();
            }
            MarginSupportFrameLayout marginSupportFrameLayout = this.F1;
            if (marginSupportFrameLayout != null) {
                bdw.h(marginSupportFrameLayout, H().getHeight(), 700L, new c()).start();
            } else {
                ckf.y("tab3Container");
                throw null;
            }
        }
    }

    public final void g3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("949bdae2", new Object[]{this});
        } else if (J().s1() != null && !this.K1) {
            this.K1 = true;
            MarginSupportFrameLayout marginSupportFrameLayout = this.F1;
            if (marginSupportFrameLayout != null) {
                ViewGroup.LayoutParams layoutParams = marginSupportFrameLayout.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.topToBottom = -1;
                    layoutParams2.topToTop = 0;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = H().getHeight();
                    MarginSupportFrameLayout marginSupportFrameLayout2 = this.F1;
                    if (marginSupportFrameLayout2 != null) {
                        marginSupportFrameLayout2.setLayoutParams(layoutParams2);
                        PerceptionLinearLayout perceptionLinearLayout = this.h1;
                        if (perceptionLinearLayout != null) {
                            perceptionLinearLayout.setZ(1.0f);
                            hps hpsVar = new hps(n(), J());
                            this.M1 = hpsVar;
                            hpsVar.x(false);
                            MarginSupportFrameLayout marginSupportFrameLayout3 = this.F1;
                            if (marginSupportFrameLayout3 != null) {
                                hps hpsVar2 = this.M1;
                                ckf.d(hpsVar2);
                                kew.a(marginSupportFrameLayout3, hpsVar2.getContentView());
                                hps hpsVar3 = this.M1;
                                if (hpsVar3 != null) {
                                    hpsVar3.j();
                                }
                                Shop2025HeaderNativeComponent shop2025HeaderNativeComponent = this.y1;
                                if (shop2025HeaderNativeComponent != null) {
                                    Shop2025HeaderNativeComponent.V(shop2025HeaderNativeComponent, 0L, new FlagShipV25$showTab3$1(this), 1, null);
                                    r54.C(new FlagShipV25$showTab3$2(this));
                                    return;
                                }
                                ckf.y("headerNativeComponent");
                                throw null;
                            }
                            ckf.y("tab3Container");
                            throw null;
                        }
                        ckf.y("shopHeaderContainer");
                        throw null;
                    }
                    ckf.y("tab3Container");
                    throw null;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
            ckf.y("tab3Container");
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
        if (this.K1 || this.r1 || this.s1) {
            return;
        }
        if ((this.p1 && (!O() || !v())) || !this.o1 || j()) {
            return;
        }
        if (r() || this.u1) {
            if (!this.u1) {
                EnhancedViewPager enhancedViewPager = this.a1;
                if (enhancedViewPager != null) {
                    enhancedViewPager.setCanDispatchToChild(false);
                    int abs = this.w1 + Math.abs(i);
                    this.w1 = abs;
                    if (abs < this.v1) {
                        return;
                    }
                } else {
                    ckf.y("contentViewPager");
                    throw null;
                }
            }
            this.u1 = true;
            EnhancedViewPager enhancedViewPager2 = this.a1;
            if (enhancedViewPager2 != null) {
                enhancedViewPager2.setCanScroll(false);
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.f1;
                if (perceptionSizeFrameLayout != null) {
                    int z = kew.z(perceptionSizeFrameLayout) - i;
                    ViewGroup viewGroup = this.g1;
                    if (viewGroup != null) {
                        int height = viewGroup.getHeight() - i;
                        if (height <= k()) {
                            height = k();
                        }
                        if (!z()) {
                            ViewGroup viewGroup2 = this.g1;
                            if (viewGroup2 != null) {
                                kew.e(viewGroup2, height);
                            } else {
                                ckf.y("bigCardContainer");
                                throw null;
                            }
                        }
                        Shop2025HeaderNativeComponent shop2025HeaderNativeComponent = this.y1;
                        if (shop2025HeaderNativeComponent != null) {
                            Shop2025HeaderNativeComponent.w0(shop2025HeaderNativeComponent, z, false, 2, null);
                            Shop2025HeaderNativeComponent shop2025HeaderNativeComponent2 = this.y1;
                            if (shop2025HeaderNativeComponent2 == null) {
                                ckf.y("headerNativeComponent");
                                throw null;
                            } else if (z < shop2025HeaderNativeComponent2.c0() + L()) {
                                EnhancedViewPager enhancedViewPager3 = this.a1;
                                if (enhancedViewPager3 != null) {
                                    enhancedViewPager3.setCanDispatchToChild(true);
                                } else {
                                    ckf.y("contentViewPager");
                                    throw null;
                                }
                            }
                        } else {
                            ckf.y("headerNativeComponent");
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
            } else {
                ckf.y("contentViewPager");
                throw null;
            }
        }
    }

    public final JSONObject e2(String str) {
        View K;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2c8de1bc", new Object[]{this, str});
        }
        yiy yiyVar = this.D1;
        if (yiyVar == null || str == null || (K = yiyVar.K(str)) == null) {
            return null;
        }
        int[] iArr = new int[2];
        K.getLocationOnScreen(iArr);
        return brf.a(jpu.a("data", brf.a(jpu.a("x", Integer.valueOf(kew.O(Integer.valueOf(iArr[0])))), jpu.a("y", Integer.valueOf(kew.O(Integer.valueOf(iArr[1])))), jpu.a("width", Integer.valueOf(kew.O(Integer.valueOf(K.getWidth())))), jpu.a("height", Integer.valueOf(kew.O(Integer.valueOf(K.getHeight())))))));
    }

    public final void T2() {
        EmbedSecondFloorView v;
        xpd.a f;
        ShopComponentModel shopComponentModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f2897a", new Object[]{this});
            return;
        }
        Shop2025HeaderNativeComponent shop2025HeaderNativeComponent = new Shop2025HeaderNativeComponent(n());
        this.y1 = shop2025HeaderNativeComponent;
        shop2025HeaderNativeComponent.A0(new a(this));
        Shop2025HeaderNativeComponent shop2025HeaderNativeComponent2 = this.y1;
        if (shop2025HeaderNativeComponent2 != null) {
            shop2025HeaderNativeComponent2.n1(z() ? false : this.L1);
            Shop2025HeaderNativeComponent shop2025HeaderNativeComponent3 = this.y1;
            if (shop2025HeaderNativeComponent3 != null) {
                shop2025HeaderNativeComponent3.M0(L());
                Shop2025HeaderNativeComponent shop2025HeaderNativeComponent4 = this.y1;
                if (shop2025HeaderNativeComponent4 != null) {
                    int e3 = e3();
                    sk9.a aVar = sk9.Companion;
                    shop2025HeaderNativeComponent4.y0(e3 - aVar.g());
                    Shop2025HeaderNativeComponent shop2025HeaderNativeComponent5 = this.y1;
                    if (shop2025HeaderNativeComponent5 != null) {
                        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.f1;
                        if (perceptionSizeFrameLayout != null) {
                            shop2025HeaderNativeComponent5.L0(perceptionSizeFrameLayout);
                            Shop2025HeaderNativeComponent shop2025HeaderNativeComponent6 = this.y1;
                            if (shop2025HeaderNativeComponent6 != null) {
                                PerceptionLinearLayout perceptionLinearLayout = this.h1;
                                if (perceptionLinearLayout != null) {
                                    shop2025HeaderNativeComponent6.Q(perceptionLinearLayout, J(), I());
                                    Shop2025HeaderNativeComponent shop2025HeaderNativeComponent7 = this.y1;
                                    if (shop2025HeaderNativeComponent7 != null) {
                                        shop2025HeaderNativeComponent7.S(I());
                                        Shop2025HeaderNativeComponent shop2025HeaderNativeComponent8 = this.y1;
                                        if (shop2025HeaderNativeComponent8 != null) {
                                            shop2025HeaderNativeComponent8.J0(new FlagShipV25$initTemplateComponent$1(this));
                                            Shop2025HeaderNativeComponent shop2025HeaderNativeComponent9 = this.y1;
                                            if (shop2025HeaderNativeComponent9 != null) {
                                                shop2025HeaderNativeComponent9.f0().setOnClickListener(new wiy(this));
                                                Shop2025HeaderNativeComponent shop2025HeaderNativeComponent10 = this.y1;
                                                if (shop2025HeaderNativeComponent10 != null) {
                                                    shop2025HeaderNativeComponent10.I0(new FlagShipV25$initTemplateComponent$3(this));
                                                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                                    Shop2025HeaderNativeComponent shop2025HeaderNativeComponent11 = this.y1;
                                                    if (shop2025HeaderNativeComponent11 != null) {
                                                        shop2025HeaderNativeComponent11.K0(new FlagShipV25$initTemplateComponent$4(this, ref$ObjectRef));
                                                        Map<String, ShopComponentModel> m = J().O0().m();
                                                        if (!(m == null || (shopComponentModel = m.get(yiy.templateName)) == null)) {
                                                            yiy yiyVar = new yiy(new FlagShipV25$initTemplateComponent$5$1(this), new FlagShipV25$initTemplateComponent$5$2(this), shopComponentModel);
                                                            this.D1 = yiyVar;
                                                            yiyVar.x(new FlagShipV25$initTemplateComponent$5$3(this));
                                                            yiy yiyVar2 = this.D1;
                                                            ckf.d(yiyVar2);
                                                            yiyVar2.k(n(), J(), I(), null);
                                                            ViewGroup viewGroup = this.e1;
                                                            if (viewGroup != null) {
                                                                yiy yiyVar3 = this.D1;
                                                                ckf.d(yiyVar3);
                                                                viewGroup.addView(yiyVar3.d());
                                                                ViewGroup viewGroup2 = this.e1;
                                                                if (viewGroup2 != null) {
                                                                    kew.e(viewGroup2, this.n1);
                                                                } else {
                                                                    ckf.y("tabBarContainer");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                ckf.y("tabBarContainer");
                                                                throw null;
                                                            }
                                                        }
                                                        svy svyVar = new svy(J());
                                                        this.z1 = svyVar;
                                                        PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.f1;
                                                        if (perceptionSizeFrameLayout2 != null) {
                                                            svyVar.b(perceptionSizeFrameLayout2);
                                                            if (svyVar.c() == 1) {
                                                                this.m1 = 0;
                                                            }
                                                            svyVar.e(new FlagShipV25$initTemplateComponent$6$1(this));
                                                            PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.f1;
                                                            if (perceptionSizeFrameLayout3 != null) {
                                                                kew.e(perceptionSizeFrameLayout3, this.m1);
                                                                if (v()) {
                                                                    ShopComponentModel g = J().O0().g();
                                                                    if (g != null) {
                                                                        jnp jnpVar = new jnp(g, !this.L1, true);
                                                                        this.A1 = jnpVar;
                                                                        BaseContentComponent.e0(this, jnpVar, null, 2, null);
                                                                        jnp jnpVar2 = this.A1;
                                                                        ckf.d(jnpVar2);
                                                                        jnpVar2.k(n(), J(), I(), null);
                                                                        ViewGroup viewGroup3 = this.g1;
                                                                        if (viewGroup3 != null) {
                                                                            jnp jnpVar3 = this.A1;
                                                                            ckf.d(jnpVar3);
                                                                            viewGroup3.addView(jnpVar3.d(), kew.j(0, kew.Q(Integer.valueOf(g.getRenderHeight())), 0, aVar.g() + this.J1 + (k() - e3()), 0, 0, 80, 53, null));
                                                                            if (this.L1) {
                                                                                ViewGroup viewGroup4 = this.g1;
                                                                                if (viewGroup4 != null) {
                                                                                    View view = this.C1;
                                                                                    if (view != null) {
                                                                                        viewGroup4.addView(view, kew.j(0, kew.v(308), 0, 0, 0, 0, 80, 61, null));
                                                                                    } else {
                                                                                        ckf.y("bigCardBottomBlackShadowBg");
                                                                                        throw null;
                                                                                    }
                                                                                } else {
                                                                                    ckf.y("bigCardContainer");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            EmbedShopLoftComponent embedShopLoftComponent = this.B1;
                                                                            if (!(embedShopLoftComponent == null || (v = embedShopLoftComponent.v()) == null || (f = v.f()) == null)) {
                                                                                f.c(ShopNewLiveLoftView.a.class.getName(), new xiy(this));
                                                                            }
                                                                        } else {
                                                                            ckf.y("bigCardContainer");
                                                                            throw null;
                                                                        }
                                                                    }
                                                                    r54.E(new FlagShipV25$initTemplateComponent$8(this), 5000L);
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
                                                    ckf.y("headerNativeComponent");
                                                    throw null;
                                                }
                                                ckf.y("headerNativeComponent");
                                                throw null;
                                            }
                                            ckf.y("headerNativeComponent");
                                            throw null;
                                        }
                                        ckf.y("headerNativeComponent");
                                        throw null;
                                    }
                                    ckf.y("headerNativeComponent");
                                    throw null;
                                }
                                ckf.y("shopHeaderContainer");
                                throw null;
                            }
                            ckf.y("headerNativeComponent");
                            throw null;
                        }
                        ckf.y("navViewContainer");
                        throw null;
                    }
                    ckf.y("headerNativeComponent");
                    throw null;
                }
                ckf.y("headerNativeComponent");
                throw null;
            }
            ckf.y("headerNativeComponent");
            throw null;
        }
        ckf.y("headerNativeComponent");
        throw null;
    }
}
