package com.alibaba.triver.triver_shop.newShop.view.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.a5;
import com.alibaba.triver.triver_shop.ShopMoreUtils;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftViewManager;
import com.alibaba.triver.triver_shop.newShop.ClickView;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.view.MarginSupportFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionLinearLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionSizeFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout;
import com.alibaba.triver.triver_shop.newShop.view.adapter.ShopContainerPageAdapter;
import com.alibaba.triver.triver_shop.newShop.view.component.nativeview.FlagShopHeaderNativeComponent;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BottomBarComponent;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.alibaba.triver.triver_shop.newShop.view.embed.SwipeBigCardComponent;
import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.remote.LoadConfig;
import com.taobao.appbundle.remote.view.RemoteLoadingView;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Pair;
import kotlin.Result;
import tb.a07;
import tb.a1v;
import tb.aqp;
import tb.bdw;
import tb.brf;
import tb.ckf;
import tb.eqp;
import tb.gps;
import tb.hps;
import tb.irp;
import tb.jnp;
import tb.jpu;
import tb.kew;
import tb.khu;
import tb.kwj;
import tb.ltt;
import tb.mop;
import tb.nk9;
import tb.npp;
import tb.pk9;
import tb.qk9;
import tb.r1k;
import tb.r54;
import tb.sk9;
import tb.spp;
import tb.t2o;
import tb.top;
import tb.ups;
import tb.wsq;
import tb.xhv;
import tb.xpd;
import tb.y1a;
import tb.ytc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipContentComponentV3 extends BaseContentComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final int defaultBottomBarBottomMargin = 51;
    public static final int defaultBottomBarSize = 88;
    public static final int defaultHeaderSize = 88;
    public boolean A0;
    public nk9 C0;
    public FlagShopHeaderNativeComponent J;
    public EnhancedViewPager K;
    public View L;
    public ShopSwipeListenerLayout M;
    public ShopSwipeListenerLayout N;
    public ViewGroup O;
    public PerceptionSizeFrameLayout P;
    public ViewGroup Q;
    public PerceptionLinearLayout R;
    public View S;
    public View T;
    public ShopContainerPageAdapter U;
    public View V;
    public TUrlImageView W;
    public MarginSupportFrameLayout X;
    public boolean Y;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public boolean f0;
    public boolean i0;
    public boolean j0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public kwj p0;
    public EmbedShopLoftComponent q0;
    public SwipeBigCardComponent r0;
    public jnp x0;
    public gps y0;
    public hps z0;
    public boolean Z = true;
    public int a0 = 45;
    public boolean g0 = true;
    public boolean h0 = true;
    public final boolean k0 = true;
    public boolean l0 = true;
    public final int s0 = kew.P(Integer.valueOf((int) mop.KEY_FLAG_SHIP_BIG_CARD_SIZE_RPX));
    public final int t0 = kew.P(Integer.valueOf((int) mop.KEY_FLAG_SHIP_SUPER_BIG_CARD_SIZE_RPX));
    public final int u0 = kew.P(Integer.valueOf((int) mop.KEY_FLAG_SHIP_H5_BIG_CARD_SIZE_RPX));
    public final BottomBarComponent v0 = new BottomBarComponent(new FlagShipContentComponentV3$bottomBarComponent$1(this), new FlagShipContentComponentV3$bottomBarComponent$2(this));
    public final top w0 = new top();
    public boolean B0 = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FlagShipContentComponentV3 f3187a;

        static {
            t2o.a(766509890);
        }

        public a(FlagShipContentComponentV3 flagShipContentComponentV3) {
            ckf.g(flagShipContentComponentV3, "this$0");
            this.f3187a = flagShipContentComponentV3;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV3$AnimatorListener");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            this.f3187a.i0(true);
            View e1 = FlagShipContentComponentV3.e1(this.f3187a);
            if (e1 != null) {
                kew.g0(e1);
            } else {
                ckf.y("centerContainerWhiteFrame");
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
            this.f3187a.i0(false);
            View e1 = FlagShipContentComponentV3.e1(this.f3187a);
            if (e1 != null) {
                kew.C(e1);
                this.f3187a.M();
                ShopSwipeListenerLayout n1 = FlagShipContentComponentV3.n1(this.f3187a);
                if (n1 != null) {
                    n1.forceInterceptAllTouchEvent(false);
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
    public static final class b {
        static {
            t2o.a(766509891);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public b() {
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
            String G = FlagShipContentComponentV3.this.J().G();
            if (G != null) {
                khu.h(FlagShipContentComponentV3.this.n(), G);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (FlagShipContentComponentV3.Y0(FlagShipContentComponentV3.this)) {
                FlagShipContentComponentV3.this.n().finish();
            }
        }
    }

    static {
        t2o.a(766509889);
    }

    public static final /* synthetic */ void A1(FlagShipContentComponentV3 flagShipContentComponentV3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32bb408", new Object[]{flagShipContentComponentV3, new Boolean(z)});
        } else {
            flagShipContentComponentV3.l0 = z;
        }
    }

    public static final /* synthetic */ void B1(FlagShipContentComponentV3 flagShipContentComponentV3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9571b76b", new Object[]{flagShipContentComponentV3, new Boolean(z)});
        } else {
            flagShipContentComponentV3.h0 = z;
        }
    }

    public static final /* synthetic */ void C1(FlagShipContentComponentV3 flagShipContentComponentV3, gps gpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be47ab0c", new Object[]{flagShipContentComponentV3, gpsVar});
        } else {
            flagShipContentComponentV3.y0 = gpsVar;
        }
    }

    public static final /* synthetic */ void D1(FlagShipContentComponentV3 flagShipContentComponentV3, hps hpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ff6694", new Object[]{flagShipContentComponentV3, hpsVar});
        } else {
            flagShipContentComponentV3.z0 = hpsVar;
        }
    }

    public static /* synthetic */ void E2(FlagShipContentComponentV3 flagShipContentComponentV3, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb1444cf", new Object[]{flagShipContentComponentV3, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        flagShipContentComponentV3.D2(z);
    }

    public static final /* synthetic */ void F1(FlagShipContentComponentV3 flagShipContentComponentV3, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e520ca5", new Object[]{flagShipContentComponentV3, new Integer(i), new Boolean(z)});
        } else {
            flagShipContentComponentV3.J2(i, z);
        }
    }

    public static final /* synthetic */ void G1(FlagShipContentComponentV3 flagShipContentComponentV3, BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843e84f9", new Object[]{flagShipContentComponentV3, baseTemplateComponent, layoutParams});
        } else {
            flagShipContentComponentV3.K2(baseTemplateComponent, layoutParams);
        }
    }

    public static final /* synthetic */ boolean W0(FlagShipContentComponentV3 flagShipContentComponentV3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f21b41", new Object[]{flagShipContentComponentV3, new Boolean(z)})).booleanValue();
        }
        return flagShipContentComponentV3.Q1(z);
    }

    public static final /* synthetic */ boolean X0(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22da5a20", new Object[]{flagShipContentComponentV3})).booleanValue();
        }
        return flagShipContentComponentV3.R1();
    }

    public static final /* synthetic */ boolean Y0(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3415954d", new Object[]{flagShipContentComponentV3})).booleanValue();
        }
        return flagShipContentComponentV3.S1();
    }

    public static final /* synthetic */ void Z0(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ae5401", new Object[]{flagShipContentComponentV3});
        } else {
            flagShipContentComponentV3.c2();
        }
    }

    public static final /* synthetic */ boolean a1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c12eb9f1", new Object[]{flagShipContentComponentV3})).booleanValue();
        }
        return flagShipContentComponentV3.k0;
    }

    public static final /* synthetic */ ViewGroup b1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("9bf303b0", new Object[]{flagShipContentComponentV3});
        }
        return flagShipContentComponentV3.Q;
    }

    public static final /* synthetic */ View c1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bc315789", new Object[]{flagShipContentComponentV3});
        }
        return flagShipContentComponentV3.S;
    }

    public static final /* synthetic */ BottomBarComponent d1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BottomBarComponent) ipChange.ipc$dispatch("67d80ba0", new Object[]{flagShipContentComponentV3});
        }
        return flagShipContentComponentV3.v0;
    }

    public static final /* synthetic */ View e1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("45524bba", new Object[]{flagShipContentComponentV3});
        }
        return flagShipContentComponentV3.V;
    }

    public static final /* synthetic */ boolean f1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1faf91e6", new Object[]{flagShipContentComponentV3})).booleanValue();
        }
        return flagShipContentComponentV3.j0;
    }

    public static final /* synthetic */ int g1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0ccbfce", new Object[]{flagShipContentComponentV3})).intValue();
        }
        return flagShipContentComponentV3.a0;
    }

    public static final /* synthetic */ EmbedShopLoftComponent h1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmbedShopLoftComponent) ipChange.ipc$dispatch("12f4acd8", new Object[]{flagShipContentComponentV3});
        }
        return flagShipContentComponentV3.q0;
    }

    public static final /* synthetic */ FlagShopHeaderNativeComponent i1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlagShopHeaderNativeComponent) ipChange.ipc$dispatch("e113f185", new Object[]{flagShipContentComponentV3});
        }
        return flagShipContentComponentV3.J;
    }

    public static /* synthetic */ Object ipc$super(FlagShipContentComponentV3 flagShipContentComponentV3, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV3");
        }
    }

    public static final /* synthetic */ TUrlImageView j1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("d28e0922", new Object[]{flagShipContentComponentV3});
        }
        return flagShipContentComponentV3.W;
    }

    public static final /* synthetic */ PerceptionSizeFrameLayout k1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerceptionSizeFrameLayout) ipChange.ipc$dispatch("c701956", new Object[]{flagShipContentComponentV3});
        }
        return flagShipContentComponentV3.P;
    }

    public static final /* synthetic */ int l1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8d5ab14", new Object[]{flagShipContentComponentV3})).intValue();
        }
        return flagShipContentComponentV3.c0;
    }

    public static final /* synthetic */ kwj m1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kwj) ipChange.ipc$dispatch("7be6e2e2", new Object[]{flagShipContentComponentV3});
        }
        return flagShipContentComponentV3.p0;
    }

    public static final /* synthetic */ ShopSwipeListenerLayout n1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopSwipeListenerLayout) ipChange.ipc$dispatch("cfdb1c7d", new Object[]{flagShipContentComponentV3});
        }
        return flagShipContentComponentV3.M;
    }

    public static final /* synthetic */ jnp o1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnp) ipChange.ipc$dispatch("62d83662", new Object[]{flagShipContentComponentV3});
        }
        return flagShipContentComponentV3.x0;
    }

    public static final /* synthetic */ PerceptionLinearLayout p1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerceptionLinearLayout) ipChange.ipc$dispatch("e9d70f62", new Object[]{flagShipContentComponentV3});
        }
        return flagShipContentComponentV3.R;
    }

    public static final /* synthetic */ top q1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (top) ipChange.ipc$dispatch("9985976a", new Object[]{flagShipContentComponentV3});
        }
        return flagShipContentComponentV3.w0;
    }

    public static final /* synthetic */ SwipeBigCardComponent r1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SwipeBigCardComponent) ipChange.ipc$dispatch("93e4dc38", new Object[]{flagShipContentComponentV3});
        }
        return flagShipContentComponentV3.r0;
    }

    public static final /* synthetic */ MarginSupportFrameLayout s1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MarginSupportFrameLayout) ipChange.ipc$dispatch("ee5b013b", new Object[]{flagShipContentComponentV3});
        }
        return flagShipContentComponentV3.X;
    }

    public static final /* synthetic */ gps t1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gps) ipChange.ipc$dispatch("4d455082", new Object[]{flagShipContentComponentV3});
        }
        return flagShipContentComponentV3.y0;
    }

    public static final /* synthetic */ hps u1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hps) ipChange.ipc$dispatch("d19faf82", new Object[]{flagShipContentComponentV3});
        }
        return flagShipContentComponentV3.z0;
    }

    public static final /* synthetic */ boolean v1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c1cee94", new Object[]{flagShipContentComponentV3})).booleanValue();
        }
        return flagShipContentComponentV3.A0;
    }

    public static final /* synthetic */ void w1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbf82dc8", new Object[]{flagShipContentComponentV3});
        } else {
            flagShipContentComponentV3.A2();
        }
    }

    public static final /* synthetic */ void x1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b627db", new Object[]{flagShipContentComponentV3});
        } else {
            flagShipContentComponentV3.C2();
        }
    }

    public static /* synthetic */ void x2(FlagShipContentComponentV3 flagShipContentComponentV3, int i, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7087a433", new Object[]{flagShipContentComponentV3, new Integer(i), new Boolean(z), new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        flagShipContentComponentV3.w2(i, z);
    }

    public static final /* synthetic */ void y1(FlagShipContentComponentV3 flagShipContentComponentV3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("387e9b4d", new Object[]{flagShipContentComponentV3, new Boolean(z)});
        } else {
            flagShipContentComponentV3.D2(z);
        }
    }

    public final void C2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0229050", new Object[]{this});
        } else {
            V1();
        }
    }

    public final void D2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8fd2cf8", new Object[]{this, new Boolean(z)});
        } else {
            B2(z);
        }
    }

    public final void F2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21b4792", new Object[]{this, new Boolean(z)});
        } else {
            this.Z = z;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public eqp G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eqp) ipChange.ipc$dispatch("6aaaf133", new Object[]{this});
        }
        return new eqp(0, SecExceptionCode.SEC_ERROR_INIT_CLAZZ_NULL_ERROR);
    }

    public final void G2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7652c339", new Object[]{this});
        } else if (!O() || !v() || z()) {
            View h2 = h2();
            if (h2 != null) {
                h2.setAlpha(1.0f);
            }
        } else {
            View h22 = h2();
            if (h22 != null) {
                h22.setAlpha(0.0f);
            }
        }
    }

    public final void H2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f5ec47", new Object[]{this});
            return;
        }
        FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = this.J;
        if (flagShopHeaderNativeComponent != null) {
            flagShopHeaderNativeComponent.J();
        }
        if (!r()) {
            G2();
            x2(this, n2(), false, 2, null);
            S0(true);
        }
    }

    public final void I2() {
        Boolean bool;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6c966e", new Object[]{this});
            return;
        }
        FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = this.J;
        if (flagShopHeaderNativeComponent != null) {
            flagShopHeaderNativeComponent.L();
        }
        p2();
        if (O() && this.k0) {
            z = false;
        }
        int o2 = o2();
        w2(o2 * (-1), z);
        x0(o2);
        S0(false);
        if (this.B0 && v()) {
            ShopDataParser J = J();
            EmbedShopLoftComponent embedShopLoftComponent = this.q0;
            if (embedShopLoftComponent == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(embedShopLoftComponent.u());
            }
            ShopExtKt.j0(J, bool);
        }
    }

    public final void J2(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae6b19a", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        EnhancedViewPager enhancedViewPager = this.K;
        if (enhancedViewPager == null) {
            ckf.y("contentViewPager");
            throw null;
        } else if (enhancedViewPager.getCurrentItem() == i) {
            npp.a aVar = npp.Companion;
            aVar.b("switchTabToInViewPager : " + i + " , but same");
        } else {
            npp.Companion.b(ckf.p("switchTabToInViewPager : ", Integer.valueOf(i)));
            EnhancedViewPager enhancedViewPager2 = this.K;
            if (enhancedViewPager2 != null) {
                enhancedViewPager2.setCurrentItem(i, z);
            } else {
                ckf.y("contentViewPager");
                throw null;
            }
        }
    }

    public final void K2(BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9e8c2e", new Object[]{this, baseTemplateComponent, layoutParams});
        } else if (this.b0 == 0 || this.d0 == 0) {
            if (baseTemplateComponent instanceof BottomBarComponent) {
                this.d0 = baseTemplateComponent.j().height;
                BottomBarComponent bottomBarComponent = this.v0;
                d0(bottomBarComponent, bottomBarComponent.E());
            }
            if (this.b0 != 0 && this.d0 != 0) {
                H1();
            }
        }
    }

    public final void L1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("439caa6a", new Object[]{this, new Boolean(z)});
            return;
        }
        ShopSwipeListenerLayout shopSwipeListenerLayout = this.N;
        if (shopSwipeListenerLayout != null) {
            kew.e0(shopSwipeListenerLayout, z, sk9.Companion.g());
        } else {
            ckf.y("centerContainer");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void Q0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8c47cb", new Object[]{this, new Boolean(z)});
            return;
        }
        FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = this.J;
        if (flagShopHeaderNativeComponent != null) {
            flagShopHeaderNativeComponent.t0(z);
        }
        if (z) {
            ViewGroup viewGroup = this.O;
            if (viewGroup != null) {
                kew.C(viewGroup);
            } else {
                ckf.y("tabBarContainer");
                throw null;
            }
        } else {
            ViewGroup viewGroup2 = this.O;
            if (viewGroup2 != null) {
                kew.g0(viewGroup2);
            } else {
                ckf.y("tabBarContainer");
                throw null;
            }
        }
    }

    public final boolean Q1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcb4226c", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            if (B()) {
                return false;
            }
        } else if (!B()) {
            return false;
        }
        nk9 nk9Var = this.C0;
        if (nk9Var != null) {
            nk9Var.e(z);
        }
        w0(z);
        M1(false);
        EnhancedViewPager enhancedViewPager = this.K;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCanScroll(!z);
            return true;
        }
        ckf.y("contentViewPager");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46691468", new Object[]{this})).booleanValue();
        }
        if (!this.A0) {
            return false;
        }
        gps gpsVar = this.y0;
        if (gpsVar != null) {
            gpsVar.k();
        }
        hps hpsVar = this.z0;
        if (hpsVar != null) {
            hpsVar.k();
        }
        return true;
    }

    public final boolean R1() {
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
    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4c47713", new Object[]{this})).booleanValue();
        }
        if (!this.A0) {
            return false;
        }
        gps gpsVar = this.y0;
        if (gpsVar != null) {
            gpsVar.j();
        }
        hps hpsVar = this.z0;
        if (hpsVar != null) {
            hpsVar.j();
        }
        return true;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
            return;
        }
        super.T();
        SwipeBigCardComponent swipeBigCardComponent = this.r0;
        if (swipeBigCardComponent != null) {
            swipeBigCardComponent.l();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void T0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39a87a0", new Object[]{this, new Boolean(z)});
            return;
        }
        FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = this.J;
        if (flagShopHeaderNativeComponent != null) {
            flagShopHeaderNativeComponent.u0(z, ShopExtKt.t(J(), z));
        }
    }

    public final void T1(int i, int i2, boolean z) {
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
            this.m0 = false;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void U() {
        SwipeBigCardComponent swipeBigCardComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.U();
        if (O() && r() && (swipeBigCardComponent = this.r0) != null) {
            swipeBigCardComponent.k();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void U0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fb09c29", new Object[]{this, new Boolean(z)});
            return;
        }
        FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = this.J;
        if (flagShopHeaderNativeComponent != null) {
            flagShopHeaderNativeComponent.v0(z);
        }
        if (z) {
            ViewGroup viewGroup = this.O;
            if (viewGroup != null) {
                kew.S(viewGroup, sk9.Companion.d());
            } else {
                ckf.y("tabBarContainer");
                throw null;
            }
        } else {
            ViewGroup viewGroup2 = this.O;
            if (viewGroup2 != null) {
                kew.S(viewGroup2, sk9.Companion.c());
            } else {
                ckf.y("tabBarContainer");
                throw null;
            }
        }
        this.v0.I(z);
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
        kew.L(H(), new FlagShipContentComponentV3$onConfigChanged$1(this));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void V0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec1c35e6", new Object[]{this, new Boolean(z)});
        }
    }

    public final void W1() {
        int i;
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
                jnpVar.x(new FlagShipContentComponentV3$continueInitShopLoftBigCard$1$1$1(this, jnpVar));
                jnpVar.k(n(), J(), I(), null);
                ViewGroup viewGroup = this.Q;
                if (viewGroup != null) {
                    View d2 = jnpVar.d();
                    int Q = kew.Q(Integer.valueOf(g.getRenderHeight()));
                    int i2 = this.c0;
                    if (jnpVar.i().a3()) {
                        i = kew.v(10);
                    } else {
                        i = sk9.Companion.g();
                    }
                    viewGroup.addView(d2, kew.j(0, Q, 0, i2 + i, 0, 0, 80, 53, null));
                    this.x0 = jnpVar;
                    return;
                }
                ckf.y("bigCardContainer");
                throw null;
            }
            return;
        }
        this.w0.x(new FlagShipContentComponentV3$continueInitShopLoftBigCard$2(this));
        this.w0.k(n(), J(), I(), null);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288626bd", new Object[]{this});
            return;
        }
        A2();
        a1v.c(J(), "Page_Shop_Live_FloatWindow_Click", null, null, 8, null);
    }

    public final void Y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41206d78", new Object[]{this});
        } else if (!v()) {
            ClickView clickView = new ClickView(n());
            String F = J().F();
            if (F != null && F.length() != 0) {
                TUrlImageView tUrlImageView = new TUrlImageView(n());
                tUrlImageView.setImageUrl(F);
                tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                ViewGroup viewGroup = this.Q;
                if (viewGroup != null) {
                    kew.a(viewGroup, tUrlImageView);
                    clickView.setOnClickListener(new qk9(this));
                    ViewGroup viewGroup2 = this.Q;
                    if (viewGroup2 != null) {
                        kew.a(viewGroup2, clickView);
                        r0(true);
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

    public final void Z1() {
        View x;
        EmbedShopLoftComponent embedShopLoftComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a945f4", new Object[]{this});
        } else if (!v() && !khu.e()) {
            r0(J().J1());
            if (v()) {
                u0(true);
                this.q0 = new EmbedShopLoftComponent(n(), J(), I());
                if (J().O0().q() && (embedShopLoftComponent = this.q0) != null) {
                    embedShopLoftComponent.J(new FlagShipContentComponentV3$createShopLoftBigCard$1(this));
                }
                EmbedShopLoftComponent embedShopLoftComponent2 = this.q0;
                if (embedShopLoftComponent2 != null) {
                    embedShopLoftComponent2.J(new FlagShipContentComponentV3$createShopLoftBigCard$2(this));
                }
                EmbedShopLoftComponent embedShopLoftComponent3 = this.q0;
                if (embedShopLoftComponent3 != null) {
                    embedShopLoftComponent3.F(k() / kew.x());
                }
                EmbedShopLoftComponent embedShopLoftComponent4 = this.q0;
                if (!(embedShopLoftComponent4 == null || (x = embedShopLoftComponent4.x()) == null)) {
                    ViewGroup viewGroup = this.Q;
                    if (viewGroup != null) {
                        kew.a(viewGroup, x);
                    } else {
                        ckf.y("bigCardContainer");
                        throw null;
                    }
                }
                FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = this.J;
                if (flagShopHeaderNativeComponent != null) {
                    flagShopHeaderNativeComponent.w0(true);
                }
                EmbedShopLoftComponent embedShopLoftComponent5 = this.q0;
                if (embedShopLoftComponent5 != null && embedShopLoftComponent5.A()) {
                    y0(false);
                }
            }
        }
    }

    public final void a2() {
        EnhancedViewPager j;
        final int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eec639", new Object[]{this});
        } else if (!v() && !khu.e()) {
            v0(J().B1());
            if (z()) {
                r0(true);
                ShopMoreUtils.INSTANCE.n(J());
                SwipeBigCardComponent swipeBigCardComponent = new SwipeBigCardComponent();
                swipeBigCardComponent.p(new FlagShipContentComponentV3$createSwipeBigCard$1(this));
                swipeBigCardComponent.r(new FlagShipContentComponentV3$createSwipeBigCard$2(this));
                this.r0 = swipeBigCardComponent;
                swipeBigCardComponent.m(J(), I(), n());
                if (J().O0().q()) {
                    swipeBigCardComponent.c().J(new FlagShipContentComponentV3$createSwipeBigCard$3(this));
                }
                swipeBigCardComponent.c().F(k() / kew.x());
                FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = this.J;
                if (flagShopHeaderNativeComponent != null) {
                    flagShopHeaderNativeComponent.w0(true);
                }
                if (swipeBigCardComponent.c().A()) {
                    y0(false);
                }
                JSONArray J = J().J();
                if (J != null) {
                    i = J.size();
                }
                final boolean a2 = swipeBigCardComponent.a();
                if (i > 1) {
                    u0(a2);
                    t0(true);
                } else if (a2) {
                    u0(true);
                } else {
                    t0(true);
                }
                SwipeBigCardComponent swipeBigCardComponent2 = this.r0;
                if (!(swipeBigCardComponent2 == null || (j = swipeBigCardComponent2.j()) == null)) {
                    j.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.component.FlagShipContentComponentV3$createSwipeBigCard$4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                        public void onPageScrollStateChanged(int i2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i2)});
                            }
                        }

                        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                        public void onPageScrolled(int i2, float f, int i3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i2), new Float(f), new Integer(i3)});
                            }
                        }

                        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                        public void onPageSelected(int i2) {
                            boolean z = true;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i2)});
                            } else if (i > 1 && a2) {
                                jnp o1 = FlagShipContentComponentV3.o1(this);
                                if (o1 != null) {
                                    FlagShipContentComponentV3 flagShipContentComponentV3 = this;
                                    if (o1.n()) {
                                        if (i2 != 0) {
                                            z = false;
                                        }
                                        FlagShipContentComponentV3.B1(flagShipContentComponentV3, z);
                                        if (i2 == 0) {
                                            kew.g0(o1.d());
                                            return;
                                        } else {
                                            kew.B(o1.d());
                                            return;
                                        }
                                    }
                                }
                                if (!FlagShipContentComponentV3.q1(this).n()) {
                                    npp.Companion.b("shopHeaderLoftComponent not init , stop operation");
                                    return;
                                }
                                FlagShipContentComponentV3 flagShipContentComponentV32 = this;
                                if (i2 != 0) {
                                    z = false;
                                }
                                FlagShipContentComponentV3.B1(flagShipContentComponentV32, z);
                                if (i2 == 0) {
                                    kew.g0(FlagShipContentComponentV3.q1(this).d());
                                } else {
                                    kew.B(FlagShipContentComponentV3.q1(this).d());
                                }
                            }
                        }
                    });
                }
                ViewGroup viewGroup = this.Q;
                if (viewGroup != null) {
                    kew.a(viewGroup, swipeBigCardComponent.h());
                } else {
                    ckf.y("bigCardContainer");
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
            r54.C(new FlagShipContentComponentV3$onStatusBarStyleChanged$1(this));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad7d9eea", new Object[]{this})).booleanValue();
        }
        if (this.A0) {
            V1();
            return false;
        } else if (!S1()) {
            return false;
        } else {
            return super.c();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void c0(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcf8e1a", new Object[]{this, new Boolean(z), jSONObject});
        } else {
            r54.C(new FlagShipContentComponentV3$onSubscribeStatusChanged$1(this, z, jSONObject));
        }
    }

    public final void c2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2a99f6", new Object[]{this});
        } else if (J().C() == 0 && r()) {
            onSwipeUp();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e48ca8d2", new Object[]{this})).booleanValue();
        }
        if (this.A0) {
            return false;
        }
        if (this.k0 && (!O() || !v())) {
            return false;
        }
        if (!this.g0 || !this.j0) {
            return super.d();
        }
        return false;
    }

    public final int f2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11d3d190", new Object[]{this})).intValue();
        }
        if (this.k0) {
            return m2() - (L() + this.b0);
        }
        int m2 = m2();
        View view = this.L;
        if (view != null) {
            return m2 - view.getBottom();
        }
        ckf.y(a5.f2660a);
        throw null;
    }

    public final int g2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d36079c9", new Object[]{this})).intValue();
        }
        if (this.k0) {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
            if (perceptionSizeFrameLayout != null) {
                return perceptionSizeFrameLayout.getTop() - (L() + this.b0);
            }
            ckf.y("navViewContainer");
            throw null;
        }
        PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.P;
        if (perceptionSizeFrameLayout2 != null) {
            int top = perceptionSizeFrameLayout2.getTop();
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

    public final View h2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8e3a5fc2", new Object[]{this});
        }
        return null;
    }

    public final int i2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ed44a7a", new Object[]{this})).intValue();
        }
        return this.e0;
    }

    public final int j2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f305df0", new Object[]{this})).intValue();
        }
        return this.b0 + this.e0;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public int k() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ce96e15", new Object[]{this})).intValue();
        }
        if (x() || z()) {
            return l(this.u0);
        }
        if (J().O0().q()) {
            return J().O0().l().b();
        }
        if (this.Z) {
            i = this.t0;
        } else {
            i = this.s0;
        }
        return l(i);
    }

    public final int k2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65349e29", new Object[]{this})).intValue();
        }
        return this.b0 + this.e0;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public ViewPager m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("8aa45209", new Object[]{this});
        }
        EnhancedViewPager enhancedViewPager = this.K;
        if (enhancedViewPager != null) {
            return enhancedViewPager;
        }
        ckf.y("contentViewPager");
        throw null;
    }

    public final int m2() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("242cf213", new Object[]{this})).intValue();
        }
        if (!O() || !v()) {
            return this.e0 + this.b0 + L();
        }
        int k = k();
        if (x()) {
            i = k - this.c0;
            i2 = sk9.Companion.g();
        } else {
            i = k - this.c0;
            if (y2()) {
                i2 = sk9.Companion.g();
            }
        }
        return i - i2;
    }

    public int n2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b86f4555", new Object[]{this})).intValue();
        }
        if (O()) {
            return f2();
        }
        return j2();
    }

    public int o2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b601ace", new Object[]{this})).intValue();
        }
        if (O()) {
            return g2();
        }
        return k2();
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
        z2();
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

    public final void p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22925914", new Object[]{this});
            return;
        }
        View h2 = h2();
        if (h2 != null) {
            h2.setAlpha(0.0f);
        }
    }

    public final boolean v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("880b9960", new Object[]{this})).booleanValue();
        }
        if (!v() || !O()) {
            return false;
        }
        return true;
    }

    public boolean y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf2e0f69", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final void A2() {
        EmbedShopLoftComponent c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37009f7d", new Object[]{this});
            return;
        }
        Pair<Integer, Integer> v1 = J().v1("live");
        if (v1 != null) {
            O0(v1.getFirst().intValue(), v1.getSecond().intValue(), "live");
            this.m0 = true;
            return;
        }
        npp.Companion.b("do not find live tab");
        EmbedShopLoftComponent embedShopLoftComponent = this.q0;
        if (embedShopLoftComponent != null) {
            embedShopLoftComponent.B();
        }
        SwipeBigCardComponent swipeBigCardComponent = this.r0;
        if (swipeBigCardComponent != null && (c2 = swipeBigCardComponent.c()) != null) {
            c2.B();
        }
    }

    public void H1() {
        SwipeBigCardComponent swipeBigCardComponent;
        EmbedShopLoftComponent c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d0cb3b", new Object[]{this});
            return;
        }
        J().C2(L() + this.b0);
        ShopDataParser J = J();
        int i = this.d0;
        ViewGroup viewGroup = this.O;
        if (viewGroup != null) {
            J.B2(i + kew.r(viewGroup));
            if (!v() || !O()) {
                int L = this.b0 + L() + this.e0;
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
                if (perceptionSizeFrameLayout != null) {
                    kew.d0(perceptionSizeFrameLayout, L);
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            } else {
                int k = k();
                if (x()) {
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.P;
                    if (perceptionSizeFrameLayout2 != null) {
                        int i2 = k - this.c0;
                        sk9.a aVar = sk9.Companion;
                        kew.d0(perceptionSizeFrameLayout2, i2 - aVar.g());
                        aVar.g();
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                } else {
                    int g = (k - this.c0) - (y2() ? sk9.Companion.g() : 0);
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.P;
                    if (perceptionSizeFrameLayout3 != null) {
                        kew.d0(perceptionSizeFrameLayout3, g);
                        int g2 = this.c0 + sk9.Companion.g();
                        if (!(!z() || (swipeBigCardComponent = this.r0) == null || (c2 = swipeBigCardComponent.c()) == null)) {
                            c2.G(g2);
                        }
                        EmbedShopLoftComponent embedShopLoftComponent = this.q0;
                        if (embedShopLoftComponent != null) {
                            embedShopLoftComponent.G(g2);
                        }
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                }
                if (y()) {
                    W1();
                }
            }
            ShopDataParser J2 = J();
            int i3 = this.d0;
            ViewGroup viewGroup2 = this.O;
            if (viewGroup2 != null) {
                J2.w2(kew.O(Integer.valueOf(i3 + kew.r(viewGroup2))));
                if (u() == 0) {
                    ShopContainerPageAdapter shopContainerPageAdapter = this.U;
                    if (shopContainerPageAdapter != null) {
                        shopContainerPageAdapter.i(u());
                    } else {
                        ckf.y("shopContainerPageAdapter");
                        throw null;
                    }
                }
                if (this.i0) {
                    r54.F(new FlagShipContentComponentV3$allTemplateLoadFinish$1(this));
                }
                if (u() == 0) {
                    onPageSelected(u());
                    return;
                }
                if (this.k0 && J().d0() == 0 && J().P1(J().d0(), J().f0())) {
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout4 = this.P;
                    if (perceptionSizeFrameLayout4 != null) {
                        kew.d0(perceptionSizeFrameLayout4, this.b0 + L());
                        FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = this.J;
                        if (flagShopHeaderNativeComponent != null) {
                            flagShopHeaderNativeComponent.Q();
                        }
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                }
                EnhancedViewPager enhancedViewPager = this.K;
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
        } else {
            ckf.y("tabBarContainer");
            throw null;
        }
    }

    public final void J1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb741278", new Object[]{this});
        } else if (this.J == null) {
            int m2 = m2();
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
            if (perceptionSizeFrameLayout != null) {
                float z = 1 - ((m2 - kew.z(perceptionSizeFrameLayout)) / i2());
                View h2 = h2();
                if (h2 != null) {
                    h2.setAlpha(z);
                    return;
                }
                return;
            }
            ckf.y("navViewContainer");
            throw null;
        }
    }

    public final void M1(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e3150", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            ShopSwipeListenerLayout shopSwipeListenerLayout = this.N;
            if (shopSwipeListenerLayout != null) {
                kew.e(shopSwipeListenerLayout, H().getHeight() + sk9.Companion.g());
            } else {
                ckf.y("centerContainer");
                throw null;
            }
        } else if (this.k0) {
            if (B()) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
                if (perceptionSizeFrameLayout != null) {
                    i = perceptionSizeFrameLayout.getHeight();
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            } else {
                i = 0;
            }
            ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.N;
            if (shopSwipeListenerLayout2 != null) {
                int height = (H().getHeight() - L()) - this.b0;
                PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.P;
                if (perceptionSizeFrameLayout2 != null) {
                    kew.e(shopSwipeListenerLayout2, (height - perceptionSizeFrameLayout2.getHeight()) + sk9.Companion.g() + i);
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            } else {
                ckf.y("centerContainer");
                throw null;
            }
        } else {
            ShopSwipeListenerLayout shopSwipeListenerLayout3 = this.N;
            if (shopSwipeListenerLayout3 != null) {
                int height2 = H().getHeight() - L();
                PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.P;
                if (perceptionSizeFrameLayout3 != null) {
                    kew.e(shopSwipeListenerLayout3, (height2 - perceptionSizeFrameLayout3.getHeight()) + sk9.Companion.g());
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            } else {
                ckf.y("centerContainer");
                throw null;
            }
        }
        ShopSwipeListenerLayout shopSwipeListenerLayout4 = this.N;
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
            ipChange.ipc$dispatch("97b73dfc", new Object[]{this});
        } else if (this.j0) {
            FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = this.J;
            if (flagShopHeaderNativeComponent != null) {
                flagShopHeaderNativeComponent.w0(true);
            }
        } else {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
            if (perceptionSizeFrameLayout != null) {
                kew.d0(perceptionSizeFrameLayout, L() + this.b0);
                FlagShopHeaderNativeComponent flagShopHeaderNativeComponent2 = this.J;
                if (flagShopHeaderNativeComponent2 != null) {
                    flagShopHeaderNativeComponent2.Q();
                }
                p2();
                return;
            }
            ckf.y("navViewContainer");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58479d3a", new Object[]{this, str});
            return;
        }
        ckf.g(str, "tabName");
        if (!O() || !v()) {
            ShopSwipeListenerLayout shopSwipeListenerLayout = this.M;
            if (shopSwipeListenerLayout == null) {
                ckf.y("outerSwiperLayout");
                throw null;
            } else if (!shopSwipeListenerLayout.getAlreadyTouch()) {
                FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = this.J;
                if (flagShopHeaderNativeComponent == null || !flagShopHeaderNativeComponent.e0()) {
                    FlagShopHeaderNativeComponent flagShopHeaderNativeComponent2 = this.J;
                    if (flagShopHeaderNativeComponent2 == null || !flagShopHeaderNativeComponent2.d0()) {
                        npp.Companion.f("FlagShipContentComponentV3 onContentPageScrollToTopCallback ");
                        FlagShopHeaderNativeComponent flagShopHeaderNativeComponent3 = this.J;
                        if (flagShopHeaderNativeComponent3 != null) {
                            flagShopHeaderNativeComponent3.J();
                        }
                        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
                        if (perceptionSizeFrameLayout != null) {
                            kew.d0(perceptionSizeFrameLayout, m2());
                        } else {
                            ckf.y("navViewContainer");
                            throw null;
                        }
                    }
                }
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void a0(View view, MotionEvent motionEvent, int i) {
        FlagShopHeaderNativeComponent flagShopHeaderNativeComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1d4d88f", new Object[]{this, view, motionEvent, new Integer(i)});
            return;
        }
        ckf.g(view, "fromTargetView");
        ckf.g(motionEvent, "event");
        super.a0(view, motionEvent, i);
        ShopSwipeListenerLayout shopSwipeListenerLayout = this.M;
        if (shopSwipeListenerLayout == null) {
            ckf.y("outerSwiperLayout");
            throw null;
        } else if (ckf.b(shopSwipeListenerLayout.isFirstHorizontalScroll(), Boolean.TRUE) || this.A0 || this.j0 || !this.h0) {
        } else {
            if ((!y() && !this.f0) || j()) {
                return;
            }
            if (Q() || (!v2() && i2() != 0)) {
                this.o0 = true;
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
                if (perceptionSizeFrameLayout != null) {
                    int z = kew.z(perceptionSizeFrameLayout) - i;
                    ViewGroup viewGroup = this.Q;
                    if (viewGroup != null) {
                        int height = viewGroup.getHeight() - i;
                        if (z <= m2()) {
                            J1();
                            if (z < m2() - i2()) {
                                z = m2() - i2();
                            }
                            height = k();
                        }
                        ViewGroup viewGroup2 = this.Q;
                        if (viewGroup2 != null) {
                            kew.e(viewGroup2, height);
                            PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.P;
                            if (perceptionSizeFrameLayout2 != null) {
                                kew.d0(perceptionSizeFrameLayout2, z);
                                if (!v2() && (flagShopHeaderNativeComponent = this.J) != null) {
                                    int m2 = m2() - i2();
                                    PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.P;
                                    if (perceptionSizeFrameLayout3 != null) {
                                        flagShopHeaderNativeComponent.i0(m2, kew.z(perceptionSizeFrameLayout3));
                                    } else {
                                        ckf.y("navViewContainer");
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

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54535e4", new Object[]{this});
            return;
        }
        super.onSwipeDown();
        if (d()) {
            if (!v2() || J().Q1(J().S(o(), J().i(p())))) {
                H2();
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
            I2();
        }
    }

    public final void s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f2897a", new Object[]{this});
            return;
        }
        boolean y = J().y();
        kwj kwjVar = new kwj(n(), J(), v(), new FlagShipContentComponentV3$initTemplateComponent$1(this));
        this.p0 = kwjVar;
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
        if (perceptionSizeFrameLayout != null) {
            perceptionSizeFrameLayout.addView(kwjVar.a());
            int p = kew.p(Integer.valueOf(this.a0));
            this.c0 = p;
            PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.P;
            if (perceptionSizeFrameLayout2 != null) {
                kew.e(perceptionSizeFrameLayout2, p);
                if (this.c0 == 0 || y) {
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.P;
                    if (perceptionSizeFrameLayout3 != null) {
                        kew.e(perceptionSizeFrameLayout3, 0);
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                }
                J().o0();
                this.v0.x(new FlagShipContentComponentV3$initTemplateComponent$2(this));
                this.v0.k(n(), J(), I(), null);
                ViewGroup viewGroup = this.O;
                if (viewGroup != null) {
                    viewGroup.addView(this.v0.d());
                    if (y) {
                        ViewGroup viewGroup2 = this.O;
                        if (viewGroup2 != null) {
                            kew.C(viewGroup2);
                        } else {
                            ckf.y("tabBarContainer");
                            throw null;
                        }
                    }
                    FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = this.J;
                    ckf.d(flagShopHeaderNativeComponent);
                    LinearLayout X = flagShopHeaderNativeComponent.X();
                    kwj kwjVar2 = this.p0;
                    if (kwjVar2 != null) {
                        nk9 nk9Var = new nk9(X, kwjVar2.a(), this.v0.d());
                        this.C0 = nk9Var;
                        ShopSwipeListenerLayout shopSwipeListenerLayout = this.N;
                        if (shopSwipeListenerLayout != null) {
                            nk9Var.l(shopSwipeListenerLayout);
                            nk9 nk9Var2 = this.C0;
                            if (nk9Var2 != null) {
                                nk9Var2.d(H());
                                return;
                            }
                            return;
                        }
                        ckf.y("centerContainer");
                        throw null;
                    }
                    ckf.y("newBottomBarAndIndexNavManager");
                    throw null;
                }
                ckf.y("tabBarContainer");
                throw null;
            }
            ckf.y("navViewContainer");
            throw null;
        }
        ckf.y("navViewContainer");
        throw null;
    }

    public final void t2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        View K = kew.K(n(), R.layout.view_new_shop_view_flag_ship);
        if (K != null) {
            View findViewById = K.findViewById(R.id.new_shop_view_center_container_white_frame);
            ckf.f(findViewById, "contentView.findViewById(R.id.new_shop_view_center_container_white_frame)");
            this.V = findViewById;
            View findViewById2 = K.findViewById(R.id.new_shop_view_center_container);
            ((ShopSwipeListenerLayout) findViewById2).setNormalMode(true);
            xhv xhvVar = xhv.INSTANCE;
            ckf.f(findViewById2, "contentView.findViewById<ShopSwipeListenerLayout?>(R.id.new_shop_view_center_container)\n                .apply {\n//                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {\n//                        FlagShipDrawable.getCenterContainerOutLineProvider(true)?.let {\n//                            this.outlineProvider = it as ViewOutlineProvider\n//                        }\n//                        this.clipToOutline = true\n//                    }\n                    this.normalMode = true\n                }");
            this.N = (ShopSwipeListenerLayout) findViewById2;
            L1(true);
            View findViewById3 = K.findViewById(R.id.new_shop_view_status_bar_view);
            ckf.f(findViewById3, "contentView.findViewById(R.id.new_shop_view_status_bar_view)");
            this.L = findViewById3;
            View findViewById4 = K.findViewById(R.id.new_shop_view_tab_bar_container);
            ckf.f(findViewById4, "contentView.findViewById(R.id.new_shop_view_tab_bar_container)");
            this.O = (ViewGroup) findViewById4;
            View findViewById5 = K.findViewById(R.id.new_shop_view_big_card_view_container);
            ckf.f(findViewById5, "contentView.findViewById(R.id.new_shop_view_big_card_view_container)");
            this.Q = (ViewGroup) findViewById5;
            View findViewById6 = K.findViewById(R.id.new_shop_view_nav_view_container);
            ((PerceptionSizeFrameLayout) findViewById6).setViewSizeChangedListener(this);
            ckf.f(findViewById6, "contentView.findViewById<PerceptionSizeFrameLayout?>(R.id.new_shop_view_nav_view_container)\n                .apply {\n                    viewSizeChangedListener = this@FlagShipContentComponentV3\n                }");
            this.P = (PerceptionSizeFrameLayout) findViewById6;
            View findViewById7 = K.findViewById(R.id.new_shop_view_header_view_container);
            ((PerceptionLinearLayout) findViewById7).setViewSizeChangedListener(this);
            ckf.f(findViewById7, "contentView.findViewById<PerceptionLinearLayout?>(R.id.new_shop_view_header_view_container)\n                .apply {\n                    viewSizeChangedListener = this@FlagShipContentComponentV3\n                }");
            this.R = (PerceptionLinearLayout) findViewById7;
            View findViewById8 = K.findViewById(R.id.new_shop_view_backGround_img);
            TUrlImageView tUrlImageView = (TUrlImageView) findViewById8;
            String S0 = J().S0();
            if (S0 != null && !wsq.a0(S0)) {
                tUrlImageView.setImageUrl(J().S0());
            } else if (J().P0().e()) {
                tUrlImageView.setBackgroundColor(-1);
            } else {
                tUrlImageView.setImageUrl(mop.DEFAULT_2022_BG_IMG_URL);
            }
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ckf.f(findViewById8, "contentView.findViewById<TUrlImageView?>(R.id.new_shop_view_backGround_img).apply {\n                if (shopData.getShopCommonAtmospherePicUrl().isNullOrBlank()) {\n                    if (shopData.shopAbConfig.reinforceSearchBar) {\n                        this.setBackgroundColor(Color.WHITE)\n                    } else {\n                        this.imageUrl = ShopExt.DEFAULT_2022_BG_IMG_URL\n                    }\n                } else {\n                    this.imageUrl =\n                        shopData.getShopCommonAtmospherePicUrl()\n                }\n                this.scaleType = ImageView.ScaleType.CENTER_CROP\n            }");
            TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById8;
            View findViewById9 = K.findViewById(R.id.new_shop_view_black_shadow_bg);
            ckf.f(findViewById9, "contentView.findViewById(R.id.new_shop_view_black_shadow_bg)");
            this.S = findViewById9;
            this.T = new View(n());
            View findViewById10 = K.findViewById(R.id.new_shop_view_loft_atmosphere_bg);
            TUrlImageView tUrlImageView3 = (TUrlImageView) findViewById10;
            String x0 = J().x0();
            if (x0 != null) {
                tUrlImageView3.setImageUrl(x0);
            }
            ckf.f(findViewById10, "contentView.findViewById<TUrlImageView?>(R.id.new_shop_view_loft_atmosphere_bg).apply {\n                shopData.getLoftAtmospherePicUrl()?.isNotEmpty {\n                    this.imageUrl = it\n                }\n            }");
            this.W = (TUrlImageView) findViewById10;
            View findViewById11 = K.findViewById(R.id.new_shop_view_tab3_container);
            ckf.f(findViewById11, "contentView.findViewById(R.id.new_shop_view_tab3_container)");
            this.X = (MarginSupportFrameLayout) findViewById11;
            EnhancedViewPager enhancedViewPager = new EnhancedViewPager(n());
            enhancedViewPager.setId(R.id.new_shop_view_view_pager);
            r1k r1kVar = new r1k(J());
            boolean c2 = r1kVar.c();
            this.Y = c2;
            npp.Companion.b(ckf.p("hasFullScreenPage : ", Boolean.valueOf(c2)));
            this.K = enhancedViewPager;
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
                ShopSwipeListenerLayout shopSwipeListenerLayout = this.N;
                if (shopSwipeListenerLayout != null) {
                    kew.a(shopSwipeListenerLayout, enhancedViewPager);
                    ShopSwipeListenerLayout shopSwipeListenerLayout2 = new ShopSwipeListenerLayout(n());
                    this.M = shopSwipeListenerLayout2;
                    shopSwipeListenerLayout2.setSwipeListener(this);
                    kew.a(shopSwipeListenerLayout2, K);
                    shopSwipeListenerLayout2.setInCenterContainerFlag(Boolean.FALSE);
                    shopSwipeListenerLayout2.setScrollThreshold(85);
                    kew.a(H(), shopSwipeListenerLayout2);
                    View view = this.L;
                    if (view != null) {
                        kew.e(view, L());
                        ViewGroup viewGroup = this.Q;
                        if (viewGroup != null) {
                            kew.e(viewGroup, k());
                            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
                            if (perceptionSizeFrameLayout != null) {
                                kew.d0(perceptionSizeFrameLayout, kew.P(88) + L());
                            } else {
                                ckf.y("navViewContainer");
                                throw null;
                            }
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

    public final void u2() {
        SwipeBigCardComponent swipeBigCardComponent;
        EmbedShopLoftComponent c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad10f563", new Object[]{this});
            return;
        }
        if (v()) {
            if (y2()) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
                if (perceptionSizeFrameLayout != null) {
                    kew.S(perceptionSizeFrameLayout, sk9.Companion.j());
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            } else {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.P;
                if (perceptionSizeFrameLayout2 != null) {
                    kew.S(perceptionSizeFrameLayout2, sk9.Companion.i());
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            }
            if (!P()) {
                TUrlImageView tUrlImageView = this.W;
                if (tUrlImageView != null) {
                    kew.B(tUrlImageView);
                } else {
                    ckf.y("loftAtmosphereBgPic");
                    throw null;
                }
            }
        } else {
            PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.P;
            if (perceptionSizeFrameLayout3 != null) {
                kew.S(perceptionSizeFrameLayout3, sk9.Companion.j());
                View view = this.L;
                if (view != null) {
                    kew.T(view);
                    PerceptionLinearLayout perceptionLinearLayout = this.R;
                    if (perceptionLinearLayout != null) {
                        kew.T(perceptionLinearLayout);
                        TUrlImageView tUrlImageView2 = this.W;
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
        ViewGroup viewGroup = this.O;
        if (viewGroup != null) {
            sk9.a aVar = sk9.Companion;
            kew.S(viewGroup, aVar.c());
            ViewGroup viewGroup2 = this.O;
            if (viewGroup2 != null) {
                viewGroup2.setElevation(kew.p(30));
                if (v()) {
                    boolean I1 = J().I1();
                    EmbedShopLoftComponent embedShopLoftComponent = this.q0;
                    if ((embedShopLoftComponent == null || !embedShopLoftComponent.A()) && ((swipeBigCardComponent = this.r0) == null || (c2 = swipeBigCardComponent.c()) == null || !c2.A())) {
                        View view2 = this.S;
                        if (view2 != null) {
                            kew.S(view2, aVar.k());
                        } else {
                            ckf.y("bigCardTopBlackShadowBg");
                            throw null;
                        }
                    }
                    if (I1) {
                        View view3 = this.S;
                        if (view3 != null) {
                            view3.setBackground(null);
                        } else {
                            ckf.y("bigCardTopBlackShadowBg");
                            throw null;
                        }
                    } else {
                        View view4 = this.S;
                        if (view4 != null) {
                            kew.e(view4, kew.P(364));
                        } else {
                            ckf.y("bigCardTopBlackShadowBg");
                            throw null;
                        }
                    }
                    if (!x() || z()) {
                        if (I1) {
                            View view5 = this.T;
                            if (view5 != null) {
                                kew.S(view5, aVar.a());
                                View view6 = this.T;
                                if (view6 != null) {
                                    kew.e(view6, kew.p(70));
                                } else {
                                    ckf.y("bigCardBottomBlackShadowBg");
                                    throw null;
                                }
                            } else {
                                ckf.y("bigCardBottomBlackShadowBg");
                                throw null;
                            }
                        } else {
                            View view7 = this.T;
                            if (view7 != null) {
                                kew.S(view7, aVar.b());
                                View view8 = this.T;
                                if (view8 != null) {
                                    kew.e(view8, aVar.g() + this.c0);
                                } else {
                                    ckf.y("bigCardBottomBlackShadowBg");
                                    throw null;
                                }
                            } else {
                                ckf.y("bigCardBottomBlackShadowBg");
                                throw null;
                            }
                        }
                    }
                    if (z()) {
                        ViewGroup viewGroup3 = this.Q;
                        if (viewGroup3 != null) {
                            SwipeBigCardComponent swipeBigCardComponent2 = this.r0;
                            ckf.d(swipeBigCardComponent2);
                            viewGroup3.addView(swipeBigCardComponent2.f().b());
                            ViewGroup viewGroup4 = this.Q;
                            if (viewGroup4 != null) {
                                SwipeBigCardComponent swipeBigCardComponent3 = this.r0;
                                ckf.d(swipeBigCardComponent3);
                                viewGroup4.addView(swipeBigCardComponent3.f().c());
                                return;
                            }
                            ckf.y("bigCardContainer");
                            throw null;
                        }
                        ckf.y("bigCardContainer");
                        throw null;
                    }
                    return;
                }
                return;
            }
            ckf.y("tabBarContainer");
            throw null;
        }
        ckf.y("tabBarContainer");
        throw null;
    }

    public final void B2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1add4f85", new Object[]{this, new Boolean(z)});
        } else if (J().s1() != null && !this.A0) {
            this.A0 = true;
            MarginSupportFrameLayout marginSupportFrameLayout = this.X;
            if (marginSupportFrameLayout != null) {
                ViewGroup.LayoutParams layoutParams = marginSupportFrameLayout.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.topToBottom = -1;
                    layoutParams2.topToTop = 0;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = H().getHeight();
                    MarginSupportFrameLayout marginSupportFrameLayout2 = this.X;
                    if (marginSupportFrameLayout2 != null) {
                        marginSupportFrameLayout2.setLayoutParams(layoutParams2);
                        PerceptionLinearLayout perceptionLinearLayout = this.R;
                        if (perceptionLinearLayout != null) {
                            perceptionLinearLayout.setZ(1.0f);
                            if (this.j0) {
                                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
                                if (perceptionSizeFrameLayout != null) {
                                    perceptionSizeFrameLayout.setZ(0.0f);
                                } else {
                                    ckf.y("navViewContainer");
                                    throw null;
                                }
                            }
                            if (!J().g1().d()) {
                                RemoteLoadingView remoteLoadingView = new RemoteLoadingView(n(), new LoadConfig.b().l());
                                MarginSupportFrameLayout marginSupportFrameLayout3 = this.X;
                                if (marginSupportFrameLayout3 != null) {
                                    kew.a(marginSupportFrameLayout3, remoteLoadingView);
                                    khu.i("shopTab3", J().W0(), n(), new FlagShipContentComponentV3$openTab3$1(this, remoteLoadingView, z), new FlagShipContentComponentV3$openTab3$2(this, remoteLoadingView), new FlagShipContentComponentV3$openTab3$3(remoteLoadingView));
                                } else {
                                    ckf.y("tab3Container");
                                    throw null;
                                }
                            } else {
                                hps hpsVar = new hps(n(), J());
                                this.z0 = hpsVar;
                                hpsVar.x(z);
                                MarginSupportFrameLayout marginSupportFrameLayout4 = this.X;
                                if (marginSupportFrameLayout4 != null) {
                                    hps hpsVar2 = this.z0;
                                    ckf.d(hpsVar2);
                                    kew.a(marginSupportFrameLayout4, hpsVar2.getContentView());
                                    hps hpsVar3 = this.z0;
                                    if (hpsVar3 != null) {
                                        hpsVar3.j();
                                    }
                                } else {
                                    ckf.y("tab3Container");
                                    throw null;
                                }
                            }
                            FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = this.J;
                            if (flagShopHeaderNativeComponent != null) {
                                flagShopHeaderNativeComponent.z0(true);
                            }
                            r54.C(new FlagShipContentComponentV3$openTab3$4(this, z));
                            return;
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

    public final void N1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc51c7c", new Object[]{this});
            return;
        }
        npp.Companion.b(ckf.p("changeFirstTabToOtherTab, current expanded : ", Boolean.valueOf(r())));
        p2();
        if (r()) {
            if (E()) {
                G2();
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
                if (perceptionSizeFrameLayout != null) {
                    kew.d0(perceptionSizeFrameLayout, m2());
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            } else {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.P;
                if (perceptionSizeFrameLayout2 != null) {
                    w2((perceptionSizeFrameLayout2.getTop() - (L() + this.b0)) * (-1), false);
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            }
            S0(true);
        } else if (this.k0) {
            S0(true);
        }
        r54.F(new FlagShipContentComponentV3$changeFirstTabToOtherTab$1(this));
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
            npp.Companion.f(ckf.p("FlagShipContentComponentV3 switchTabTo params ", E0));
            if (!(E0 instanceof String) || ((CharSequence) E0).length() <= 0) {
                z = false;
            } else {
                JSONObject k = brf.k((String) E0);
                z = ckf.b(k == null ? null : k.getString("enableGoBackToAllItems"), "true");
            }
            if (!z || !spp.c(str)) {
                this.n0 = false;
            } else {
                this.n0 = true;
            }
        }
        int j = J().j(i, i2);
        EnhancedViewPager enhancedViewPager = this.K;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCurrentItem(j, false);
        } else {
            ckf.y("contentViewPager");
            throw null;
        }
    }

    public final void O1(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5eb45dc", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        J().P1(i, i2);
        npp.Companion.b(ckf.p("changeOtherTabToFistTab, current expanded : ", Boolean.valueOf(r())));
        if (!r()) {
            return;
        }
        if (!this.k0) {
            x2(this, k2() * (-1), false, 2, null);
            S0(false);
            return;
        }
        if (v()) {
            S0(false);
        }
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
        if (perceptionSizeFrameLayout != null) {
            kew.d0(perceptionSizeFrameLayout, L() + this.b0);
            FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = this.J;
            if (flagShopHeaderNativeComponent != null) {
                flagShopHeaderNativeComponent.Q();
            }
            p2();
            return;
        }
        ckf.y("navViewContainer");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void S0(boolean z) {
        FlagShopHeaderNativeComponent flagShopHeaderNativeComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a50f479", new Object[]{this, new Boolean(z)});
            return;
        }
        npp.Companion.b(ckf.p("update expanded : ", Boolean.valueOf(z)));
        super.S0(z);
        kwj kwjVar = this.p0;
        if (kwjVar != null) {
            kwjVar.d(z);
            b0();
            if (!O()) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
                if (perceptionSizeFrameLayout != null) {
                    kew.S(perceptionSizeFrameLayout, sk9.Companion.j());
                    if (spp.c(J().R())) {
                        FlagShopHeaderNativeComponent flagShopHeaderNativeComponent2 = this.J;
                        if (flagShopHeaderNativeComponent2 != null) {
                            flagShopHeaderNativeComponent2.w0(true);
                        }
                    } else {
                        FlagShopHeaderNativeComponent flagShopHeaderNativeComponent3 = this.J;
                        if (flagShopHeaderNativeComponent3 != null) {
                            flagShopHeaderNativeComponent3.z0(false);
                        }
                    }
                    TUrlImageView tUrlImageView = this.W;
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
                if (v()) {
                    if (y2()) {
                        PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.P;
                        if (perceptionSizeFrameLayout2 != null) {
                            kew.S(perceptionSizeFrameLayout2, sk9.Companion.j());
                        } else {
                            ckf.y("navViewContainer");
                            throw null;
                        }
                    } else {
                        PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.P;
                        if (perceptionSizeFrameLayout3 != null) {
                            kew.S(perceptionSizeFrameLayout3, sk9.Companion.i());
                        } else {
                            ckf.y("navViewContainer");
                            throw null;
                        }
                    }
                    r54.F(new FlagShipContentComponentV3$updateExpandedStatus$1(this));
                } else {
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout4 = this.P;
                    if (perceptionSizeFrameLayout4 != null) {
                        kew.S(perceptionSizeFrameLayout4, sk9.Companion.j());
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                }
                if (y() || z()) {
                    FlagShopHeaderNativeComponent flagShopHeaderNativeComponent4 = this.J;
                    if (flagShopHeaderNativeComponent4 != null) {
                        flagShopHeaderNativeComponent4.w0(true);
                    }
                } else if (!v()) {
                    FlagShopHeaderNativeComponent flagShopHeaderNativeComponent5 = this.J;
                    if (flagShopHeaderNativeComponent5 != null) {
                        flagShopHeaderNativeComponent5.z0(false);
                    }
                } else {
                    FlagShopHeaderNativeComponent flagShopHeaderNativeComponent6 = this.J;
                    if (flagShopHeaderNativeComponent6 != null) {
                        flagShopHeaderNativeComponent6.z0(true);
                    }
                }
            } else {
                if (this.k0 && v() && (flagShopHeaderNativeComponent = this.J) != null) {
                    flagShopHeaderNativeComponent.z0(false);
                }
                PerceptionSizeFrameLayout perceptionSizeFrameLayout5 = this.P;
                if (perceptionSizeFrameLayout5 != null) {
                    kew.S(perceptionSizeFrameLayout5, sk9.Companion.j());
                    r54.F(new FlagShipContentComponentV3$updateExpandedStatus$2(this));
                    r54.G(new FlagShipContentComponentV3$updateExpandedStatus$3(this));
                    return;
                }
                ckf.y("navViewContainer");
                throw null;
            }
        } else {
            ckf.y("newBottomBarAndIndexNavManager");
            throw null;
        }
    }

    public final boolean S1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cca356c2", new Object[]{this})).booleanValue();
        }
        if (this.m0 && spp.c(J().R())) {
            this.m0 = false;
            O0(0, 0, J().S(0, 0));
            return false;
        } else if (!this.n0 || !spp.c(J().R())) {
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

    public final void V1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1202b2dd", new Object[]{this});
        } else if (this.A0) {
            this.A0 = false;
            if (this.j0) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
                if (perceptionSizeFrameLayout != null) {
                    perceptionSizeFrameLayout.setZ(1.0f);
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            }
            if ((!O() || !v() || !r()) && !this.j0) {
                FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = this.J;
                if (flagShopHeaderNativeComponent != null) {
                    flagShopHeaderNativeComponent.z0(false);
                }
            } else {
                FlagShopHeaderNativeComponent flagShopHeaderNativeComponent2 = this.J;
                if (flagShopHeaderNativeComponent2 != null) {
                    flagShopHeaderNativeComponent2.w0(true);
                }
            }
            gps gpsVar = this.y0;
            if (gpsVar != null) {
                gpsVar.k();
            }
            hps hpsVar = this.z0;
            if (hpsVar != null) {
                hpsVar.k();
            }
            y1a<Integer, Integer, Integer, Integer, xhv> F = F();
            if (F != null) {
                F.invoke(Integer.valueOf(J().C()), Integer.valueOf(J().p1()), -1, -1);
            }
            gps gpsVar2 = this.y0;
            if (gpsVar2 != null) {
                gpsVar2.p();
            }
            hps hpsVar2 = this.z0;
            if (hpsVar2 != null) {
                hpsVar2.v();
            }
            MarginSupportFrameLayout marginSupportFrameLayout = this.X;
            if (marginSupportFrameLayout != null) {
                bdw.h(marginSupportFrameLayout, H().getHeight(), 700L, new pk9(this)).start();
            } else {
                ckf.y("tab3Container");
                throw null;
            }
        }
    }

    public final void X1() {
        String g0;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e7fa1a", new Object[]{this});
        } else if (!v() && (g0 = J().g0()) != null && !khu.e()) {
            r0(true);
            t0(true);
            y0(false);
            irp irpVar = new irp(n());
            irpVar.c(J());
            String valueOf = String.valueOf(kew.O(Integer.valueOf(L())) + 112);
            String valueOf2 = String.valueOf((this.a0 * 2) + 50);
            J().Z2("immersive_webview_load_start", Long.valueOf(System.currentTimeMillis()));
            Uri.Builder buildUpon = Uri.parse(g0).buildUpon();
            Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("paddingTopAndBottom", valueOf + ',' + valueOf2);
            if (J().s() > 1) {
                z = true;
            }
            irpVar.b(appendQueryParameter.appendQueryParameter("hasNav", String.valueOf(z)).build().toString());
            ViewGroup viewGroup = this.Q;
            if (viewGroup != null) {
                kew.a(viewGroup, irpVar.a());
            } else {
                ckf.y("bigCardContainer");
                throw null;
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void Z(View view, MotionEvent motionEvent, int i) {
        FlagShopHeaderNativeComponent flagShopHeaderNativeComponent;
        EmbedShopLoftComponent c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e83a4696", new Object[]{this, view, motionEvent, new Integer(i)});
            return;
        }
        ckf.g(view, "fromTargetView");
        ckf.g(motionEvent, "event");
        super.Z(view, motionEvent, i);
        ShopSwipeListenerLayout shopSwipeListenerLayout = this.M;
        if (shopSwipeListenerLayout == null) {
            ckf.y("outerSwiperLayout");
            throw null;
        } else if (ckf.b(shopSwipeListenerLayout.isFirstHorizontalScroll(), Boolean.TRUE) || this.A0 || this.j0 || !this.l0 || !this.h0) {
        } else {
            if ((y() || !this.f0 || !v2()) && !j() && r() && J().Q1(J().R())) {
                this.o0 = true;
                j0(false);
                if (v2()) {
                    D0(true);
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
                    if (perceptionSizeFrameLayout == null) {
                        ckf.y("navViewContainer");
                        throw null;
                    } else if ((kew.z(perceptionSizeFrameLayout) + i) - m2() >= 350) {
                        if (J().w1()) {
                            z2();
                            A2();
                            ShopExtKt.l(J());
                        } else {
                            if (z()) {
                                SwipeBigCardComponent swipeBigCardComponent = this.r0;
                                if (!(swipeBigCardComponent == null || (c2 = swipeBigCardComponent.c()) == null)) {
                                    c2.B();
                                }
                            } else {
                                EmbedShopLoftComponent embedShopLoftComponent = this.q0;
                                if (embedShopLoftComponent != null) {
                                    embedShopLoftComponent.B();
                                }
                            }
                            z2();
                        }
                        this.l0 = false;
                        r54.E(new FlagShipContentComponentV3$onParentSwipeDown$1(this), 500L);
                    } else {
                        J1();
                        ViewGroup viewGroup = this.Q;
                        if (viewGroup == null) {
                            ckf.y("bigCardContainer");
                            throw null;
                        } else if (viewGroup != null) {
                            kew.e(viewGroup, viewGroup.getHeight() + i);
                            PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.P;
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
                } else if (this.f0) {
                    D0(true);
                    PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.P;
                    if (perceptionSizeFrameLayout3 != null) {
                        if (kew.z(perceptionSizeFrameLayout3) + i > m2()) {
                            PerceptionSizeFrameLayout perceptionSizeFrameLayout4 = this.P;
                            if (perceptionSizeFrameLayout4 != null) {
                                kew.d0(perceptionSizeFrameLayout4, m2());
                            } else {
                                ckf.y("navViewContainer");
                                throw null;
                            }
                        } else {
                            PerceptionSizeFrameLayout perceptionSizeFrameLayout5 = this.P;
                            if (perceptionSizeFrameLayout5 == null) {
                                ckf.y("navViewContainer");
                                throw null;
                            } else if (perceptionSizeFrameLayout5 != null) {
                                kew.d0(perceptionSizeFrameLayout5, kew.z(perceptionSizeFrameLayout5) + i);
                            } else {
                                ckf.y("navViewContainer");
                                throw null;
                            }
                        }
                        ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.M;
                        if (shopSwipeListenerLayout2 != null) {
                            if (ckf.b(shopSwipeListenerLayout2.isFirstHorizontalScroll(), Boolean.FALSE) && (flagShopHeaderNativeComponent = this.J) != null) {
                                int m2 = m2();
                                PerceptionSizeFrameLayout perceptionSizeFrameLayout6 = this.P;
                                if (perceptionSizeFrameLayout6 != null) {
                                    flagShopHeaderNativeComponent.h0(m2, kew.z(perceptionSizeFrameLayout6));
                                } else {
                                    ckf.y("navViewContainer");
                                    throw null;
                                }
                            }
                            J1();
                            return;
                        }
                        ckf.y("outerSwiperLayout");
                        throw null;
                    }
                    ckf.y("navViewContainer");
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
        if (this.j0) {
            M1(true);
        } else {
            M1(false);
        }
    }

    public final void b2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("639ece58", new Object[]{this});
        } else if (!v()) {
            ClickView clickView = new ClickView(n());
            String H = J().H();
            if (H != null && H.length() != 0 && !khu.e()) {
                r0(true);
                xpd miniVideoView = ShopLoftViewManager.getMiniVideoView();
                miniVideoView.initWithData(n(), brf.a(jpu.a("videoUrl", H), jpu.a("autoRelease", Boolean.TRUE)), null, null);
                miniVideoView.didAppear();
                miniVideoView.mute(true);
                View view = miniVideoView.getView();
                if (view != null) {
                    ViewGroup viewGroup = this.Q;
                    if (viewGroup != null) {
                        viewGroup.addView(view);
                        clickView.setOnClickListener(new c());
                        ViewGroup viewGroup2 = this.Q;
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

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        FlagShopHeaderNativeComponent flagShopHeaderNativeComponent;
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
            int i3 = J().i(p());
            int o = o();
            int k = J().k(p());
            int i4 = J().i(i);
            J().W2(i4, k);
            ups t1 = J().t1(k, i4);
            if (!(t1 == null || (flagShopHeaderNativeComponent = this.J) == null)) {
                flagShopHeaderNativeComponent.o0(t1.t());
            }
            npp.a aVar = npp.Companion;
            aVar.b("flag ship , on page selected , newTab = " + k + ", newSub = " + i4 + " , oldTab = " + o + ", position : " + i);
            boolean P1 = J().P1(J().C(), J().p1());
            this.j0 = P1;
            L1(true ^ P1);
            boolean r = r();
            l0(k);
            o();
            if (!this.i0) {
                C2();
            }
            kwj kwjVar = this.p0;
            if (kwjVar != null) {
                kwjVar.c(k, i);
                this.v0.H(o());
                if (o == 0 && k != 0) {
                    N1();
                }
                if (o != 0 && k == 0) {
                    O1(o, i2);
                }
                if (!(o == 0 || k == 0)) {
                    P1();
                }
                if (this.g0 && this.Y) {
                    U1(o, i2, k, i3);
                } else if (k != o) {
                    M1(false);
                }
                if (!this.i0) {
                    y1a<Integer, Integer, Integer, Integer, xhv> F = F();
                    if (F != null) {
                        F.invoke(Integer.valueOf(k), Integer.valueOf(i4), Integer.valueOf(o), Integer.valueOf(i2));
                    }
                } else {
                    this.i0 = false;
                }
                A0(false);
                b0();
                T1(o, i2, r);
                v2();
                return;
            }
            ckf.y("newBottomBarAndIndexNavManager");
            throw null;
        }
        ckf.y("shopContainerPageAdapter");
        throw null;
    }

    public final void q2() {
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
        if (i1 != null) {
            switch (i1.hashCode()) {
                case -187499722:
                    if (i1.equals("bgVideo")) {
                        b2();
                        break;
                    }
                    break;
                case 2908512:
                    if (i1.equals("carousel")) {
                        a2();
                        break;
                    }
                    break;
                case 3148801:
                    if (i1.equals(ytc.TYPE_FOLD)) {
                        return;
                    }
                    break;
                case 3327377:
                    if (i1.equals("loft")) {
                        Z1();
                        break;
                    }
                    break;
                case 93653765:
                    if (i1.equals("bgPic")) {
                        Y1();
                        break;
                    }
                    break;
                case 1630978260:
                    if (i1.equals("singleModule")) {
                        X1();
                        break;
                    }
                    break;
            }
        }
        Z1();
        X1();
        b2();
        Y1();
        if ((v() && !x()) || z()) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
            layoutParams.gravity = 80;
            ViewGroup viewGroup = this.Q;
            if (viewGroup != null) {
                View view = this.T;
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

    public final void r2() {
        TUrlImageView W;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f21d3b", new Object[]{this});
            return;
        }
        this.f0 = true;
        FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = new FlagShopHeaderNativeComponent(n());
        this.J = flagShopHeaderNativeComponent;
        PerceptionLinearLayout perceptionLinearLayout = this.R;
        if (perceptionLinearLayout != null) {
            flagShopHeaderNativeComponent.M(perceptionLinearLayout, J());
            FlagShopHeaderNativeComponent flagShopHeaderNativeComponent2 = this.J;
            if (!(flagShopHeaderNativeComponent2 == null || (W = flagShopHeaderNativeComponent2.W()) == null)) {
                W.setOnClickListener(new d());
            }
            FlagShopHeaderNativeComponent flagShopHeaderNativeComponent3 = this.J;
            if (flagShopHeaderNativeComponent3 != null) {
                flagShopHeaderNativeComponent3.n0(new FlagShipContentComponentV3$initNativeHeader$2(this));
            }
            FlagShopHeaderNativeComponent flagShopHeaderNativeComponent4 = this.J;
            if (flagShopHeaderNativeComponent4 != null) {
                flagShopHeaderNativeComponent4.O(I());
            }
            FlagShopHeaderNativeComponent flagShopHeaderNativeComponent5 = this.J;
            this.b0 = flagShopHeaderNativeComponent5 == null ? 0 : flagShopHeaderNativeComponent5.T();
            FlagShopHeaderNativeComponent flagShopHeaderNativeComponent6 = this.J;
            int U = flagShopHeaderNativeComponent6 == null ? 0 : flagShopHeaderNativeComponent6.U();
            FlagShopHeaderNativeComponent flagShopHeaderNativeComponent7 = this.J;
            if (flagShopHeaderNativeComponent7 != null) {
                i = flagShopHeaderNativeComponent7.T();
            }
            this.e0 = U - i;
            return;
        }
        ckf.y("shopHeaderContainer");
        throw null;
    }

    public void z2() {
        FlagShopHeaderNativeComponent flagShopHeaderNativeComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d8ba32", new Object[]{this});
            return;
        }
        boolean z = this.o0;
        this.o0 = false;
        j0(true);
        if (this.h0) {
            if (Q() || i2() != 0) {
                if (i2() != 0 && !this.j0 && z) {
                    if (Q()) {
                        G2();
                    } else {
                        p2();
                        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
                        if (perceptionSizeFrameLayout != null) {
                            kew.d0(perceptionSizeFrameLayout, m2() - i2());
                            FlagShopHeaderNativeComponent flagShopHeaderNativeComponent2 = this.J;
                            if (flagShopHeaderNativeComponent2 != null) {
                                flagShopHeaderNativeComponent2.L();
                            }
                        } else {
                            ckf.y("navViewContainer");
                            throw null;
                        }
                    }
                }
                if (Q()) {
                    ViewGroup viewGroup = this.Q;
                    if (viewGroup != null) {
                        kew.e(viewGroup, k());
                        PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.P;
                        if (perceptionSizeFrameLayout2 != null) {
                            kew.d0(perceptionSizeFrameLayout2, m2());
                            if (!v2()) {
                                ShopSwipeListenerLayout shopSwipeListenerLayout = this.M;
                                if (shopSwipeListenerLayout == null) {
                                    ckf.y("outerSwiperLayout");
                                    throw null;
                                } else if (ckf.b(shopSwipeListenerLayout.isFirstHorizontalScroll(), Boolean.FALSE) && (flagShopHeaderNativeComponent = this.J) != null) {
                                    flagShopHeaderNativeComponent.J();
                                }
                            }
                            D0(false);
                            return;
                        }
                        ckf.y("navViewContainer");
                        throw null;
                    }
                    ckf.y("bigCardContainer");
                    throw null;
                }
            }
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
        ltt lttVar = new ltt();
        try {
            this.B0 = shopDataParser.O0().b();
            aqp.a aVar = aqp.Companion;
            F2(aVar.p0());
            this.h0 = aVar.g();
            Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            Result.m1108constructorimpl(kotlin.b.a(th));
        }
        if (this.k0) {
            shopDataParser.z2(false);
            npp.Companion.b("alwaysShowHeader true , enableFullScreenPageCanPullDownHeader false");
        }
        if (shopDataParser.l2()) {
            this.a0 = 0;
        }
        shopDataParser.m1().x(new FlagShipContentComponentV3$initComponent$2(this));
        fragmentActivity.getLifecycle().addObserver(C());
        super.N(fragmentActivity, shopDataParser, shopDXEngine);
        this.i0 = shopDataParser.R1();
        int O = (this.a0 * 2) + kew.O(Integer.valueOf(L()));
        int i = this.a0;
        int i2 = (i * 2) + 50;
        if (this.k0) {
            O += kew.O(Integer.valueOf(kew.p(Integer.valueOf(i + 8))));
        }
        shopDataParser.x2(O);
        shopDataParser.w2(i2);
        this.g0 = aqp.Companion.x();
        khu.a(fragmentActivity, true);
        t2();
        if (shopDataParser.P0().e()) {
            r2();
        }
        shopDataParser.Y2(mop.KEY_INIT_SHOP_BASE_VIEW, Long.valueOf(lttVar.a()));
        lttVar.b();
        q2();
        ViewGroup viewGroup = this.Q;
        if (viewGroup != null) {
            kew.e(viewGroup, k());
            s2();
            u2();
            shopDataParser.Y2(mop.KEY_INIT_SHOP_TEMPLATE_COMPONENT_COST, Long.valueOf(lttVar.a()));
            shopDataParser.m1().r(new FlagShipContentComponentV3$initComponent$3(this));
            return;
        }
        ckf.y("bigCardContainer");
        throw null;
    }

    public final void U1(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26556c9c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        boolean P1 = J().P1(i, i2);
        boolean P12 = J().P1(i3, i4);
        boolean z = i3 == 2;
        boolean z2 = i == 2;
        if (P1 != P12 || ((P1 || P12) && z != z2)) {
            ShopSwipeListenerLayout shopSwipeListenerLayout = this.N;
            if (shopSwipeListenerLayout != null) {
                ViewGroup.LayoutParams layoutParams = shopSwipeListenerLayout.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    if (!this.k0) {
                        if (P12) {
                            layoutParams2.topToBottom = -1;
                            ShopSwipeListenerLayout shopSwipeListenerLayout2 = this.N;
                            if (shopSwipeListenerLayout2 != null) {
                                shopSwipeListenerLayout2.setLayoutParams(layoutParams2);
                                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
                                if (perceptionSizeFrameLayout != null) {
                                    kew.d0(perceptionSizeFrameLayout, L());
                                    if (z) {
                                        PerceptionLinearLayout perceptionLinearLayout = this.R;
                                        if (perceptionLinearLayout != null) {
                                            perceptionLinearLayout.setZ(2.0f);
                                            PerceptionLinearLayout perceptionLinearLayout2 = this.R;
                                            if (perceptionLinearLayout2 != null) {
                                                kew.h0(perceptionLinearLayout2);
                                                PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.P;
                                                if (perceptionSizeFrameLayout2 != null) {
                                                    perceptionSizeFrameLayout2.setZ(0.0f);
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
                                        PerceptionLinearLayout perceptionLinearLayout3 = this.R;
                                        if (perceptionLinearLayout3 != null) {
                                            perceptionLinearLayout3.setZ(0.0f);
                                            PerceptionSizeFrameLayout perceptionSizeFrameLayout3 = this.P;
                                            if (perceptionSizeFrameLayout3 != null) {
                                                perceptionSizeFrameLayout3.setZ(1.0f);
                                            } else {
                                                ckf.y("navViewContainer");
                                                throw null;
                                            }
                                        } else {
                                            ckf.y("shopHeaderContainer");
                                            throw null;
                                        }
                                    }
                                    S0(false);
                                    kwj kwjVar = this.p0;
                                    if (kwjVar != null) {
                                        kwjVar.f(true);
                                        M1(true);
                                        return;
                                    }
                                    ckf.y("newBottomBarAndIndexNavManager");
                                    throw null;
                                }
                                ckf.y("navViewContainer");
                                throw null;
                            }
                            ckf.y("centerContainer");
                            throw null;
                        }
                        PerceptionSizeFrameLayout perceptionSizeFrameLayout4 = this.P;
                        if (perceptionSizeFrameLayout4 != null) {
                            layoutParams2.topToBottom = perceptionSizeFrameLayout4.getId();
                            PerceptionSizeFrameLayout perceptionSizeFrameLayout5 = this.P;
                            if (perceptionSizeFrameLayout5 != null) {
                                kew.d0(perceptionSizeFrameLayout5, L());
                                PerceptionSizeFrameLayout perceptionSizeFrameLayout6 = this.P;
                                if (perceptionSizeFrameLayout6 != null) {
                                    perceptionSizeFrameLayout6.setZ(0.0f);
                                    PerceptionLinearLayout perceptionLinearLayout4 = this.R;
                                    if (perceptionLinearLayout4 != null) {
                                        perceptionLinearLayout4.setAlpha(0.0f);
                                        PerceptionLinearLayout perceptionLinearLayout5 = this.R;
                                        if (perceptionLinearLayout5 != null) {
                                            perceptionLinearLayout5.setZ(0.0f);
                                            S0(false);
                                            kwj kwjVar2 = this.p0;
                                            if (kwjVar2 != null) {
                                                kwjVar2.f(false);
                                                M1(false);
                                                return;
                                            }
                                            ckf.y("newBottomBarAndIndexNavManager");
                                            throw null;
                                        }
                                        ckf.y("shopHeaderContainer");
                                        throw null;
                                    }
                                    ckf.y("shopHeaderContainer");
                                    throw null;
                                }
                                ckf.y("navViewContainer");
                                throw null;
                            }
                            ckf.y("navViewContainer");
                            throw null;
                        }
                        ckf.y("navViewContainer");
                        throw null;
                    } else if (P12) {
                        layoutParams2.topToBottom = -1;
                        ShopSwipeListenerLayout shopSwipeListenerLayout3 = this.N;
                        if (shopSwipeListenerLayout3 != null) {
                            shopSwipeListenerLayout3.setLayoutParams(layoutParams2);
                            if (z) {
                                PerceptionLinearLayout perceptionLinearLayout6 = this.R;
                                if (perceptionLinearLayout6 != null) {
                                    perceptionLinearLayout6.setZ(2.0f);
                                    PerceptionLinearLayout perceptionLinearLayout7 = this.R;
                                    if (perceptionLinearLayout7 != null) {
                                        kew.h0(perceptionLinearLayout7);
                                        PerceptionSizeFrameLayout perceptionSizeFrameLayout7 = this.P;
                                        if (perceptionSizeFrameLayout7 != null) {
                                            perceptionSizeFrameLayout7.setZ(0.0f);
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
                                PerceptionSizeFrameLayout perceptionSizeFrameLayout8 = this.P;
                                if (perceptionSizeFrameLayout8 != null) {
                                    perceptionSizeFrameLayout8.setZ(1.0f);
                                    PerceptionLinearLayout perceptionLinearLayout8 = this.R;
                                    if (perceptionLinearLayout8 != null) {
                                        perceptionLinearLayout8.setZ(2.0f);
                                        if (this.f0) {
                                            PerceptionSizeFrameLayout perceptionSizeFrameLayout9 = this.P;
                                            if (perceptionSizeFrameLayout9 != null) {
                                                perceptionSizeFrameLayout9.setZ(3.0f);
                                            } else {
                                                ckf.y("navViewContainer");
                                                throw null;
                                            }
                                        }
                                        FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = this.J;
                                        if (flagShopHeaderNativeComponent != null) {
                                            flagShopHeaderNativeComponent.w0(true);
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
                            p2();
                            PerceptionSizeFrameLayout perceptionSizeFrameLayout10 = this.P;
                            if (perceptionSizeFrameLayout10 != null) {
                                kew.d0(perceptionSizeFrameLayout10, L() + this.b0);
                                FlagShopHeaderNativeComponent flagShopHeaderNativeComponent2 = this.J;
                                if (flagShopHeaderNativeComponent2 != null) {
                                    flagShopHeaderNativeComponent2.Q();
                                }
                                kwj kwjVar3 = this.p0;
                                if (kwjVar3 != null) {
                                    kwjVar3.f(true);
                                    M1(true);
                                    return;
                                }
                                ckf.y("newBottomBarAndIndexNavManager");
                                throw null;
                            }
                            ckf.y("navViewContainer");
                            throw null;
                        }
                        ckf.y("centerContainer");
                        throw null;
                    } else {
                        PerceptionSizeFrameLayout perceptionSizeFrameLayout11 = this.P;
                        if (perceptionSizeFrameLayout11 != null) {
                            layoutParams2.topToBottom = perceptionSizeFrameLayout11.getId();
                            PerceptionSizeFrameLayout perceptionSizeFrameLayout12 = this.P;
                            if (perceptionSizeFrameLayout12 != null) {
                                perceptionSizeFrameLayout12.setZ(0.0f);
                                PerceptionLinearLayout perceptionLinearLayout9 = this.R;
                                if (perceptionLinearLayout9 != null) {
                                    perceptionLinearLayout9.setAlpha(1.0f);
                                    PerceptionLinearLayout perceptionLinearLayout10 = this.R;
                                    if (perceptionLinearLayout10 != null) {
                                        perceptionLinearLayout10.setZ(0.0f);
                                        FlagShopHeaderNativeComponent flagShopHeaderNativeComponent3 = this.J;
                                        if (flagShopHeaderNativeComponent3 != null) {
                                            flagShopHeaderNativeComponent3.z0(false);
                                        }
                                        kwj kwjVar4 = this.p0;
                                        if (kwjVar4 != null) {
                                            kwjVar4.f(false);
                                            M1(false);
                                            if (v() && J().C() == 0 && J().p1() == 0) {
                                                S0(false);
                                                return;
                                            }
                                            return;
                                        }
                                        ckf.y("newBottomBarAndIndexNavManager");
                                        throw null;
                                    }
                                    ckf.y("shopHeaderContainer");
                                    throw null;
                                }
                                ckf.y("shopHeaderContainer");
                                throw null;
                            }
                            ckf.y("navViewContainer");
                            throw null;
                        }
                        ckf.y("navViewContainer");
                        throw null;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
                }
            } else {
                ckf.y("centerContainer");
                throw null;
            }
        }
    }

    public final void w2(int i, boolean z) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2428c84", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.j0) {
            npp.Companion.b("current page full screen ， stop animation");
        } else {
            if (z) {
                Y(i);
            }
            if (O() && v() && !this.j0) {
                ShopSwipeListenerLayout shopSwipeListenerLayout = this.M;
                if (shopSwipeListenerLayout != null) {
                    shopSwipeListenerLayout.forceInterceptAllTouchEvent(true);
                } else {
                    ckf.y("outerSwiperLayout");
                    throw null;
                }
            }
            npp.a aVar = npp.Companion;
            aVar.b("moveNavViewAndCenterContainer : " + i + " , needHeaderAlphaChanged : " + z);
            FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = this.J;
            if (flagShopHeaderNativeComponent != null) {
                PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.P;
                if (perceptionSizeFrameLayout != null) {
                    flagShopHeaderNativeComponent.K(i, kew.z(perceptionSizeFrameLayout));
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            PerceptionSizeFrameLayout perceptionSizeFrameLayout2 = this.P;
            if (perceptionSizeFrameLayout2 != null) {
                Animator j = bdw.j(perceptionSizeFrameLayout2, i, 0L, null, 6, null);
                PerceptionLinearLayout perceptionLinearLayout = this.R;
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
}
