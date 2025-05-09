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
import com.alibaba.triver.triver_shop.newShop.view.adapter.ShopContainerPageAdapter;
import com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023BottomBarNativeComponent;
import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023PullDownHelper;
import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023TopNavBarNativeComponent;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderInfoTemplate;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderRelationTemplate;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderTagListTemplate;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;
import kotlin.Pair;
import tb.a1v;
import tb.aop;
import tb.aqp;
import tb.bdw;
import tb.brf;
import tb.c8c;
import tb.ckf;
import tb.cnp;
import tb.d1a;
import tb.dnp;
import tb.dop;
import tb.enp;
import tb.eqp;
import tb.fnp;
import tb.g1a;
import tb.gnp;
import tb.gx6;
import tb.hnp;
import tb.hx6;
import tb.ic1;
import tb.inp;
import tb.ix6;
import tb.jnp;
import tb.kew;
import tb.khu;
import tb.knp;
import tb.lnp;
import tb.ltt;
import tb.mop;
import tb.npp;
import tb.r1k;
import tb.r54;
import tb.spp;
import tb.ssq;
import tb.t2o;
import tb.ups;
import tb.xhv;
import tb.xpd;
import tb.y1a;
import tb.znp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Default2023Shop extends Shop2023BaseComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public aop E0;
    public EmbedShopLoftComponent F0;
    public Shop2023HeaderInfoTemplate G0;
    public fnp H0;
    public Shop2023HeaderRelationTemplate I0;
    public dnp J0;
    public jnp K0;
    public FrameLayout L;
    public gnp L0;
    public EnhancedViewPager M;
    public Shop2023HeaderTagListTemplate M0;
    public ShopOptSwipeLayout N;
    public FrameLayout O;
    public int O0;
    public ViewGroup P;
    public FrameLayout P0;
    public View Q;
    public Runnable Q0;
    public FrameLayout R;
    public ShopWrapWebView R0;
    public ViewGroup S;
    public inp S0;
    public FrameLayout T;
    public Shop2023BottomBarNativeComponent T0;
    public FrameLayout U;
    public Shop2023TopNavBarNativeComponent U0;
    public ShopContainerPageAdapter V;
    public Shop2023PullDownHelper V0;
    public TUrlImageView W;
    public lnp W0;
    public View X;
    public knp X0;
    public View Y;
    public View Z;
    public boolean Z0;
    public View a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean f0;
    public boolean g0;
    public d1a<xhv> h0;
    public boolean i0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public boolean w0;
    public boolean x0;
    public int y0;
    public int z0;
    public boolean e0 = true;
    public final dop j0 = new dop(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    public final enp k0 = new enp(0, 0, false, 7, null);
    public final dop l0 = new dop(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    public final dop m0 = new dop(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    public final dop n0 = new dop(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    public final dop o0 = new dop(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    public final dop p0 = new dop(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    public final dop q0 = new dop(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    public final int N0 = 3;
    public boolean Y0 = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Default2023Shop f3279a;

        static {
            t2o.a(766510167);
        }

        public a(Default2023Shop default2023Shop) {
            ckf.g(default2023Shop, "this$0");
            this.f3279a = default2023Shop;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$AnimatorListener");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            Default2023Shop.V1(this.f3279a, true);
            ShopOptSwipeLayout y1 = Default2023Shop.y1(this.f3279a);
            if (y1 != null) {
                y1.forceInterceptAllTouchEvent(true);
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
            Default2023Shop.f1(this.f3279a);
            Default2023Shop.V1(this.f3279a, false);
            this.f3279a.M();
            ShopOptSwipeLayout y1 = Default2023Shop.y1(this.f3279a);
            if (y1 != null) {
                y1.forceInterceptAllTouchEvent(false);
                EnhancedViewPager n1 = Default2023Shop.n1(this.f3279a);
                if (n1 != null) {
                    n1.setCanDispatchToChild(true);
                    EnhancedViewPager n12 = Default2023Shop.n1(this.f3279a);
                    if (n12 != null) {
                        n12.setCanScroll(true);
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
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3280a;
        public final /* synthetic */ Default2023Shop b;
        public final /* synthetic */ int c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Default2023Shop f3281a;

            public a(Default2023Shop default2023Shop) {
                this.f3281a = default2023Shop;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                Default2023Shop default2023Shop = this.f3281a;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    Default2023Shop.f2(default2023Shop, ((Integer) animatedValue).intValue(), false, Integer.valueOf(Default2023Shop.P1(this.f3281a).f()));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.triver.triver_shop.shop2023.Default2023Shop$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class C0103b extends a {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Default2023Shop b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0103b(Default2023Shop default2023Shop, int i) {
                super(default2023Shop);
                this.b = default2023Shop;
                this.c = i;
            }

            public static /* synthetic */ Object ipc$super(C0103b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$changeOtherToOtherPage$1$1$2");
            }

            @Override // com.alibaba.triver.triver_shop.shop2023.Default2023Shop.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                ckf.g(animator, "animation");
                inp u1 = Default2023Shop.u1(this.b);
                if (u1 != null) {
                    u1.l(Default2023Shop.q1(this.b));
                }
                FrameLayout M1 = Default2023Shop.M1(this.b);
                if (M1 != null) {
                    kew.C(M1);
                    Default2023Shop.b2(this.b, this.c);
                    Default2023Shop.a2(this.b, 0 - this.c);
                    return;
                }
                ckf.y("shopRelationContainer");
                throw null;
            }
        }

        public b(int i, Default2023Shop default2023Shop, int i2) {
            this.f3280a = i;
            this.b = default2023Shop;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(this.f3280a);
            Default2023Shop default2023Shop = this.b;
            int i = this.c;
            ofInt.addUpdateListener(new a(default2023Shop));
            ofInt.setDuration(900L);
            ofInt.addListener(new a(default2023Shop));
            ofInt.addListener(new C0103b(default2023Shop, i));
            ofInt.start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
            super(Default2023Shop.this);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$changeToHomePage$1$1");
        }

        @Override // com.alibaba.triver.triver_shop.shop2023.Default2023Shop.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            super.onAnimationEnd(animator);
            FrameLayout x1 = Default2023Shop.x1(Default2023Shop.this);
            if (x1 != null) {
                kew.d0(x1, Default2023Shop.P1(Default2023Shop.this).c());
                FrameLayout M1 = Default2023Shop.M1(Default2023Shop.this);
                if (M1 != null) {
                    kew.d0(M1, Default2023Shop.v1(Default2023Shop.this).c());
                } else {
                    ckf.y("shopRelationContainer");
                    throw null;
                }
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Default2023Shop f3283a;

            public a(Default2023Shop default2023Shop) {
                this.f3283a = default2023Shop;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                Default2023Shop default2023Shop = this.f3283a;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    Default2023Shop.f2(default2023Shop, ((Integer) animatedValue).intValue(), false, Integer.valueOf(Default2023Shop.P1(this.f3283a).c()));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class b extends a {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Default2023Shop b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Default2023Shop default2023Shop, int i) {
                super(default2023Shop);
                this.b = default2023Shop;
                this.c = i;
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$changeToOtherPage$1$1$2");
            }

            @Override // com.alibaba.triver.triver_shop.shop2023.Default2023Shop.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                ckf.g(animator, "animation");
                int O1 = Default2023Shop.O1(this.b);
                Default2023Shop default2023Shop = this.b;
                Default2023Shop.c2(default2023Shop, O1);
                inp u1 = Default2023Shop.u1(default2023Shop);
                if (u1 != null) {
                    u1.J(O1);
                }
                inp u12 = Default2023Shop.u1(this.b);
                if (u12 != null) {
                    u12.n();
                }
                FrameLayout M1 = Default2023Shop.M1(this.b);
                if (M1 != null) {
                    kew.C(M1);
                    Default2023Shop.b2(this.b, this.c);
                    Default2023Shop.a2(this.b, 0 - this.c);
                    this.b.S0(false);
                    return;
                }
                ckf.y("shopRelationContainer");
                throw null;
            }
        }

        public d(int i, int i2, int i3) {
            this.b = i;
            this.c = i2;
            this.d = i3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Default2023Shop.c2(Default2023Shop.this, this.b);
            inp u1 = Default2023Shop.u1(Default2023Shop.this);
            if (u1 != null) {
                u1.J(this.b);
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(this.c);
            Default2023Shop default2023Shop = Default2023Shop.this;
            int i = this.d;
            ofInt.addUpdateListener(new a(default2023Shop));
            ofInt.setDuration(900L);
            ofInt.addListener(new b(default2023Shop, i));
            ofInt.addListener(new a(default2023Shop));
            ofInt.start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                Default2023Shop.this.X();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
            super(Default2023Shop.this);
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$moveNavAnimation$1$1$1");
        }

        @Override // com.alibaba.triver.triver_shop.shop2023.Default2023Shop.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            super.onAnimationEnd(animator);
            FrameLayout M1 = Default2023Shop.M1(Default2023Shop.this);
            if (M1 != null) {
                FrameLayout M12 = Default2023Shop.M1(Default2023Shop.this);
                if (M12 != null) {
                    if (kew.z(M12) == Default2023Shop.v1(Default2023Shop.this).c()) {
                        f = 1.0f;
                    } else {
                        FrameLayout M13 = Default2023Shop.M1(Default2023Shop.this);
                        if (M13 != null) {
                            f = M13.getAlpha();
                        } else {
                            ckf.y("shopRelationContainer");
                            throw null;
                        }
                    }
                    M1.setAlpha(f);
                    View L1 = Default2023Shop.L1(Default2023Shop.this);
                    if (L1 != null) {
                        FrameLayout M14 = Default2023Shop.M1(Default2023Shop.this);
                        if (M14 != null) {
                            L1.setAlpha(M14.getAlpha());
                        } else {
                            ckf.y("shopRelationContainer");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("shopRelationContainer");
                    throw null;
                }
            } else {
                ckf.y("shopRelationContainer");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3285a;
        public final /* synthetic */ Default2023Shop b;

        public g(int i, Default2023Shop default2023Shop) {
            this.f3285a = i;
            this.b = default2023Shop;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float f = this.f3285a;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = 1 - ((f - ((Float) animatedValue).floatValue()) / Default2023Shop.m1(this.b));
                if (Default2023Shop.l1(this.b) >= 0) {
                    FrameLayout M1 = Default2023Shop.M1(this.b);
                    if (M1 != null) {
                        M1.setAlpha(1.0f);
                    } else {
                        ckf.y("shopRelationContainer");
                        throw null;
                    }
                } else {
                    FrameLayout M12 = Default2023Shop.M1(this.b);
                    if (M12 != null) {
                        M12.setAlpha(floatValue);
                    } else {
                        ckf.y("shopRelationContainer");
                        throw null;
                    }
                }
                View L1 = Default2023Shop.L1(this.b);
                if (L1 != null) {
                    L1.setAlpha(floatValue);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class h extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
            super(Default2023Shop.this);
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$resetToInitialPosition$1$2$1");
        }

        @Override // com.alibaba.triver.triver_shop.shop2023.Default2023Shop.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            super.onAnimationEnd(animator);
            FrameLayout M1 = Default2023Shop.M1(Default2023Shop.this);
            if (M1 != null) {
                FrameLayout M12 = Default2023Shop.M1(Default2023Shop.this);
                if (M12 != null) {
                    if (kew.z(M12) == Default2023Shop.v1(Default2023Shop.this).c()) {
                        f = 1.0f;
                    } else {
                        FrameLayout M13 = Default2023Shop.M1(Default2023Shop.this);
                        if (M13 != null) {
                            f = M13.getAlpha();
                        } else {
                            ckf.y("shopRelationContainer");
                            throw null;
                        }
                    }
                    M1.setAlpha(f);
                    View L1 = Default2023Shop.L1(Default2023Shop.this);
                    if (L1 != null) {
                        FrameLayout M14 = Default2023Shop.M1(Default2023Shop.this);
                        if (M14 != null) {
                            L1.setAlpha(M14.getAlpha());
                        } else {
                            ckf.y("shopRelationContainer");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("shopRelationContainer");
                    throw null;
                }
            } else {
                ckf.y("shopRelationContainer");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class i extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
            super(Default2023Shop.this);
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$startJumpToFirstBottomIndexFromLiveV2$1$1");
        }

        @Override // com.alibaba.triver.triver_shop.shop2023.Default2023Shop.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            ViewGroup h1 = Default2023Shop.h1(Default2023Shop.this);
            if (h1 != null) {
                aop G1 = Default2023Shop.G1(Default2023Shop.this);
                ckf.d(G1);
                kew.e(h1, G1.b());
                return;
            }
            ckf.y("bigCardContainer");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class j extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
            super(Default2023Shop.this);
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$startToChangeToTab3Animation$1$1");
        }

        @Override // com.alibaba.triver.triver_shop.shop2023.Default2023Shop.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            Default2023Shop.V1(Default2023Shop.this, false);
            EnhancedViewPager n1 = Default2023Shop.n1(Default2023Shop.this);
            if (n1 != null) {
                n1.setCanDispatchToChild(true);
                Default2023Shop.Q1(Default2023Shop.this);
                if (Default2023Shop.s1(Default2023Shop.this)) {
                    ViewGroup h1 = Default2023Shop.h1(Default2023Shop.this);
                    if (h1 != null) {
                        aop G1 = Default2023Shop.G1(Default2023Shop.this);
                        ckf.d(G1);
                        kew.e(h1, G1.b());
                    } else {
                        ckf.y("bigCardContainer");
                        throw null;
                    }
                }
                View j1 = Default2023Shop.j1(Default2023Shop.this);
                if (j1 != null) {
                    kew.C(j1);
                    View j12 = Default2023Shop.j1(Default2023Shop.this);
                    if (j12 != null) {
                        j12.setAlpha(1.0f);
                    } else {
                        ckf.y("bottomBarContainerBG");
                        throw null;
                    }
                } else {
                    ckf.y("bottomBarContainerBG");
                    throw null;
                }
            } else {
                ckf.y("contentViewPager");
                throw null;
            }
        }

        @Override // com.alibaba.triver.triver_shop.shop2023.Default2023Shop.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            Default2023Shop.V1(Default2023Shop.this, true);
            ViewGroup h1 = Default2023Shop.h1(Default2023Shop.this);
            if (h1 != null) {
                kew.e(h1, Default2023Shop.A1(Default2023Shop.this).getHeight());
            } else {
                ckf.y("bigCardContainer");
                throw null;
            }
        }
    }

    static {
        t2o.a(766510166);
    }

    public static final /* synthetic */ FrameLayout A1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("96a21465", new Object[]{default2023Shop});
        }
        return default2023Shop.H();
    }

    public static final /* synthetic */ dnp B1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dnp) ipChange.ipc$dispatch("83e5536c", new Object[]{default2023Shop});
        }
        return default2023Shop.J0;
    }

    public static final /* synthetic */ fnp C1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnp) ipChange.ipc$dispatch("bc6a54e8", new Object[]{default2023Shop});
        }
        return default2023Shop.H0;
    }

    public static final /* synthetic */ Shop2023HeaderRelationTemplate D1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Shop2023HeaderRelationTemplate) ipChange.ipc$dispatch("60ea1592", new Object[]{default2023Shop});
        }
        return default2023Shop.I0;
    }

    public static final /* synthetic */ jnp F1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnp) ipChange.ipc$dispatch("546901b3", new Object[]{default2023Shop});
        }
        return default2023Shop.K0;
    }

    public static final /* synthetic */ aop G1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aop) ipChange.ipc$dispatch("1547bed8", new Object[]{default2023Shop});
        }
        return default2023Shop.E0;
    }

    public static final /* synthetic */ ShopDataParser H1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("c9e382a2", new Object[]{default2023Shop});
        }
        return default2023Shop.J();
    }

    public static final /* synthetic */ Shop2023HeaderInfoTemplate J1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Shop2023HeaderInfoTemplate) ipChange.ipc$dispatch("cc48707c", new Object[]{default2023Shop});
        }
        return default2023Shop.G0;
    }

    public static final /* synthetic */ View L1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bb301376", new Object[]{default2023Shop});
        }
        return default2023Shop.v2();
    }

    public static final /* synthetic */ FrameLayout M1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("afb4eda8", new Object[]{default2023Shop});
        }
        return default2023Shop.U;
    }

    public static final /* synthetic */ boolean N1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5b44a21", new Object[]{default2023Shop})).booleanValue();
        }
        return default2023Shop.w0;
    }

    public static final /* synthetic */ int O1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63da9f0f", new Object[]{default2023Shop})).intValue();
        }
        return default2023Shop.x2();
    }

    public static final /* synthetic */ dop P1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dop) ipChange.ipc$dispatch("391f32fa", new Object[]{default2023Shop});
        }
        return default2023Shop.l0;
    }

    public static final /* synthetic */ void Q1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2a1fd6", new Object[]{default2023Shop});
        } else {
            default2023Shop.E2();
        }
    }

    public static /* synthetic */ void Q2(Default2023Shop default2023Shop, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc9bcc6", new Object[]{default2023Shop, new Boolean(z), new Integer(i2), obj});
            return;
        }
        if ((i2 & 1) != 0) {
            z = false;
        }
        default2023Shop.P2(z);
    }

    public static final /* synthetic */ void R1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6184b97f", new Object[]{default2023Shop});
        } else {
            default2023Shop.G2();
        }
    }

    public static final /* synthetic */ void S1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be155fd0", new Object[]{default2023Shop});
        } else {
            default2023Shop.H2();
        }
    }

    public static /* synthetic */ void S2(Default2023Shop default2023Shop, int i2, boolean z, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e462eee", new Object[]{default2023Shop, new Integer(i2), new Boolean(z), new Integer(i3), obj});
            return;
        }
        if ((i3 & 2) != 0) {
            z = true;
        }
        default2023Shop.R2(i2, z);
    }

    public static final /* synthetic */ void T1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20eb68be", new Object[]{default2023Shop});
        } else {
            default2023Shop.I2();
        }
    }

    public static final /* synthetic */ void U1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7fe4aaf", new Object[]{default2023Shop});
        } else {
            default2023Shop.K2();
        }
    }

    public static /* synthetic */ void U2(Default2023Shop default2023Shop, int i2, boolean z, Integer num, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79812e40", new Object[]{default2023Shop, new Integer(i2), new Boolean(z), num, new Integer(i3), obj});
            return;
        }
        if ((i3 & 2) != 0) {
            z = true;
        }
        if ((i3 & 4) != 0) {
            num = null;
        }
        default2023Shop.T2(i2, z, num);
    }

    public static final /* synthetic */ void V1(Default2023Shop default2023Shop, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b92b60da", new Object[]{default2023Shop, new Boolean(z)});
        } else {
            default2023Shop.i0(z);
        }
    }

    public static final /* synthetic */ void W1(Default2023Shop default2023Shop, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64cb759", new Object[]{default2023Shop, runnable});
        } else {
            default2023Shop.Q0 = runnable;
        }
    }

    public static final /* synthetic */ void X1(Default2023Shop default2023Shop, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61290a92", new Object[]{default2023Shop, new Boolean(z)});
        } else {
            default2023Shop.g0 = z;
        }
    }

    public static final /* synthetic */ void Y1(Default2023Shop default2023Shop, d1a d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799f5570", new Object[]{default2023Shop, d1aVar});
        } else {
            default2023Shop.h0 = d1aVar;
        }
    }

    public static final /* synthetic */ void Z1(Default2023Shop default2023Shop, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dda8a312", new Object[]{default2023Shop, new Boolean(z)});
        } else {
            default2023Shop.f0 = z;
        }
    }

    public static final /* synthetic */ void a2(Default2023Shop default2023Shop, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bef7b43", new Object[]{default2023Shop, new Integer(i2)});
        } else {
            default2023Shop.u0 = i2;
        }
    }

    public static final /* synthetic */ void b2(Default2023Shop default2023Shop, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cfebcfc", new Object[]{default2023Shop, new Integer(i2)});
        } else {
            default2023Shop.t0 = i2;
        }
    }

    public static final /* synthetic */ void c2(Default2023Shop default2023Shop, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("520b2227", new Object[]{default2023Shop, new Integer(i2)});
        } else {
            default2023Shop.r0 = i2;
        }
    }

    public static final /* synthetic */ void d1(Default2023Shop default2023Shop, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e660e", new Object[]{default2023Shop, new Boolean(z)});
        } else {
            default2023Shop.j2(z);
        }
    }

    public static final /* synthetic */ boolean e1(Default2023Shop default2023Shop, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8833d767", new Object[]{default2023Shop, new Boolean(z)})).booleanValue();
        }
        return default2023Shop.o2(z);
    }

    public static final /* synthetic */ void f1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f7dea1", new Object[]{default2023Shop});
        } else {
            default2023Shop.t2();
        }
    }

    public static final /* synthetic */ void f2(Default2023Shop default2023Shop, int i2, boolean z, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ce85e2", new Object[]{default2023Shop, new Integer(i2), new Boolean(z), num});
        } else {
            default2023Shop.T2(i2, z, num);
        }
    }

    public static final /* synthetic */ boolean g1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ed5a532", new Object[]{default2023Shop})).booleanValue();
        }
        return default2023Shop.j();
    }

    public static final /* synthetic */ void g2(Default2023Shop default2023Shop, BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b78d9a7d", new Object[]{default2023Shop, baseTemplateComponent, layoutParams});
        } else {
            default2023Shop.V2(baseTemplateComponent, layoutParams);
        }
    }

    public static final /* synthetic */ ViewGroup h1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("8e9ab732", new Object[]{default2023Shop});
        }
        return default2023Shop.S;
    }

    public static final /* synthetic */ void h2(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31997cec", new Object[]{default2023Shop});
        } else {
            default2023Shop.X2();
        }
    }

    public static final /* synthetic */ ViewGroup i1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("3bf60fa", new Object[]{default2023Shop});
        }
        return default2023Shop.P;
    }

    public static /* synthetic */ Object ipc$super(Default2023Shop default2023Shop, String str, Object... objArr) {
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
            case 709948537:
                super.S0(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1703005214:
                super.onPageScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            case 1857984310:
                super.V((Configuration) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop");
        }
    }

    public static final /* synthetic */ View j1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("94c0c058", new Object[]{default2023Shop});
        }
        return default2023Shop.Q;
    }

    public static final /* synthetic */ d1a k1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("97ac5708", new Object[]{default2023Shop});
        }
        return default2023Shop.h0;
    }

    public static final /* synthetic */ int l1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8bd9913f", new Object[]{default2023Shop})).intValue();
        }
        return default2023Shop.u0;
    }

    public static final /* synthetic */ int m1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10c696db", new Object[]{default2023Shop})).intValue();
        }
        return default2023Shop.r0;
    }

    public static final /* synthetic */ EnhancedViewPager n1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnhancedViewPager) ipChange.ipc$dispatch("e265af3a", new Object[]{default2023Shop});
        }
        return default2023Shop.M;
    }

    public static final /* synthetic */ FragmentActivity o1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("ce758922", new Object[]{default2023Shop});
        }
        return default2023Shop.n();
    }

    public static final /* synthetic */ EmbedShopLoftComponent p1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmbedShopLoftComponent) ipChange.ipc$dispatch("f7803b72", new Object[]{default2023Shop});
        }
        return default2023Shop.F0;
    }

    public static final /* synthetic */ boolean q1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("335ecb8b", new Object[]{default2023Shop})).booleanValue();
        }
        return default2023Shop.r();
    }

    public static final /* synthetic */ int r1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba9a889b", new Object[]{default2023Shop})).intValue();
        }
        return default2023Shop.u();
    }

    public static final /* synthetic */ boolean s1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b069eeae", new Object[]{default2023Shop})).booleanValue();
        }
        return default2023Shop.v();
    }

    public static final /* synthetic */ boolean t1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa2614bf", new Object[]{default2023Shop})).booleanValue();
        }
        return default2023Shop.A();
    }

    public static final /* synthetic */ inp u1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (inp) ipChange.ipc$dispatch("6cd83ba5", new Object[]{default2023Shop});
        }
        return default2023Shop.S0;
    }

    public static final /* synthetic */ dop v1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dop) ipChange.ipc$dispatch("87507681", new Object[]{default2023Shop});
        }
        return default2023Shop.q0;
    }

    public static final /* synthetic */ dop w1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dop) ipChange.ipc$dispatch("205f9d6e", new Object[]{default2023Shop});
        }
        return default2023Shop.p0;
    }

    public static final /* synthetic */ FrameLayout x1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("e576823e", new Object[]{default2023Shop});
        }
        return default2023Shop.R;
    }

    public static final /* synthetic */ ShopOptSwipeLayout y1(Default2023Shop default2023Shop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopOptSwipeLayout) ipChange.ipc$dispatch("ff161d32", new Object[]{default2023Shop});
        }
        return default2023Shop.N;
    }

    public final boolean D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("556f1ec", new Object[]{this})).booleanValue();
        }
        if (J().C() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public eqp G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eqp) ipChange.ipc$dispatch("6aaaf133", new Object[]{this});
        }
        return new eqp(0, Shop2023BottomBarNativeComponent.bottomBarHeightWithBottomMarginRpxValue);
    }

    public final void G2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da75e3be", new Object[]{this});
        } else {
            Q2(this, false, 1, null);
        }
    }

    public final void H2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e61b84d", new Object[]{this});
        } else if (!this.g0) {
            if (this.f0) {
                this.h0 = null;
                return;
            }
            this.f0 = true;
            r54.C(new Default2023Shop$onContentPageStartScroll$1(this));
        }
    }

    public final void I2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("801d0e1f", new Object[]{this});
            return;
        }
        Default2023Shop$onContentPageStopScroll$restoreBottomBarAction$1 default2023Shop$onContentPageStopScroll$restoreBottomBarAction$1 = new Default2023Shop$onContentPageStopScroll$restoreBottomBarAction$1(this);
        if (this.f0) {
            this.h0 = default2023Shop$onContentPageStopScroll$restoreBottomBarAction$1;
        } else if (this.g0) {
            default2023Shop$onContentPageStopScroll$restoreBottomBarAction$1.invoke();
        }
    }

    public final void M2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df6d57a", new Object[]{this});
        } else if (v()) {
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.G0;
            if (shop2023HeaderInfoTemplate != null) {
                shop2023HeaderInfoTemplate.I(true);
            }
            inp inpVar = this.S0;
            if (inpVar != null) {
                inpVar.s(true);
            }
            ViewGroup viewGroup = this.S;
            if (viewGroup != null) {
                kew.g0(viewGroup);
                EmbedShopLoftComponent embedShopLoftComponent = this.F0;
                if (embedShopLoftComponent != null) {
                    embedShopLoftComponent.E();
                    return;
                }
                return;
            }
            ckf.y("bigCardContainer");
            throw null;
        }
    }

    public final void N2() {
        jnp jnpVar;
        View d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d52a0f8d", new Object[]{this});
        } else if (this.i0 && (jnpVar = this.K0) != null && (d2 = jnpVar.d()) != null) {
            bdw.c(d2, 1.0f, 200L, null, 4, null).start();
            this.i0 = false;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void Q0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8c47cb", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.G0;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.K(z);
        }
        inp inpVar = this.S0;
        if (inpVar != null) {
            inpVar.T(z);
        }
        Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent = this.T0;
        if (shop2023BottomBarNativeComponent != null) {
            shop2023BottomBarNativeComponent.G(z);
        }
        EnhancedViewPager enhancedViewPager = this.M;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCanScroll(true ^ z);
            this.A0 = z;
            return;
        }
        ckf.y("contentViewPager");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void T0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39a87a0", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.G0;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.L(z, ShopExtKt.t(J(), z));
        }
        gnp gnpVar = this.L0;
        if (gnpVar != null) {
            gnpVar.I(ShopExtKt.t(J(), z));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void U0(boolean z) {
        Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fb09c29", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.G0;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.N(z);
        }
        inp inpVar = this.S0;
        if (inpVar != null) {
            inpVar.s(z);
        }
        inp inpVar2 = this.S0;
        if (inpVar2 != null) {
            inpVar2.M(z);
        }
        if (z && (shop2023BottomBarNativeComponent = this.T0) != null) {
            shop2023BottomBarNativeComponent.z();
        }
        knp knpVar = this.X0;
        if (knpVar != null) {
            knpVar.c(z);
        }
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
        kew.L(H(), new Default2023Shop$onConfigChanged$1(this));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void V0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec1c35e6", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.G0;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.O(z);
        }
        inp inpVar = this.S0;
        if (inpVar != null) {
            inpVar.V(z);
        }
    }

    public final void V2(BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9e8c2e", new Object[]{this, baseTemplateComponent, layoutParams});
            return;
        }
        int i2 = this.O0;
        int i3 = this.N0;
        if (i2 < i3) {
            int i4 = i2 + 1;
            this.O0 = i4;
            if (i4 >= i3) {
                i2();
            }
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
        if (!r()) {
            ShopOptSwipeLayout shopOptSwipeLayout = this.N;
            if (shopOptSwipeLayout == null) {
                ckf.y("outerSwiperLayout");
                throw null;
            } else if (!shopOptSwipeLayout.getAlreadyTouch()) {
                k2();
            }
        }
    }

    public final void W2() {
        c8c v2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da382260", new Object[]{this});
            return;
        }
        ShopContainerPageAdapter shopContainerPageAdapter = this.V;
        if (shopContainerPageAdapter != null) {
            Fragment item = shopContainerPageAdapter.getItem(J().j(J().C(), J().p1()));
            if ((item instanceof ShopStandardFragment) && (v2 = ((ShopStandardFragment) item).v2()) != null && (v2 instanceof cnp)) {
                cnp cnpVar = (cnp) v2;
                ShopOptSwipeLayout shopOptSwipeLayout = this.N;
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

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288626bd", new Object[]{this});
            return;
        }
        E2();
        a1v.c(J(), "Page_Shop_Live_FloatWindow_Click", null, null, 8, null);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void Z(View view, MotionEvent motionEvent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e83a4696", new Object[]{this, view, motionEvent, new Integer(i2)});
            return;
        }
        ckf.g(view, "fromTargetView");
        ckf.g(motionEvent, "event");
        S2(this, i2, false, 2, null);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void a0(View view, MotionEvent motionEvent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1d4d88f", new Object[]{this, view, motionEvent, new Integer(i2)});
            return;
        }
        ckf.g(view, "fromTargetView");
        ckf.g(motionEvent, "event");
        U2(this, i2, false, null, 6, null);
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
            return;
        }
        if (D2()) {
            if (v() && r()) {
                f();
                return;
            }
        } else if (ckf.b(J().R(), "live")) {
            f();
            return;
        }
        e();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad7d9eea", new Object[]{this})).booleanValue();
        }
        return r2();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void c0(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcf8e1a", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.G0;
        if (shop2023HeaderInfoTemplate != null) {
            shop2023HeaderInfoTemplate.L(z, jSONObject);
        }
        gnp gnpVar = this.L0;
        if (gnpVar != null) {
            gnpVar.I(jSONObject);
        }
        g1a<Boolean, xhv> d2 = J().w0().d();
        if (d2 != null) {
            d2.invoke(Boolean.valueOf(z));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void f0(String str, JSONObject jSONObject) {
        Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6cad4c", new Object[]{this, str, jSONObject});
            return;
        }
        super.f0(str, jSONObject);
        if (ckf.b(str, "tb_shop_bottom_bar_2023") && (shop2023BottomBarNativeComponent = this.T0) != null) {
            shop2023BottomBarNativeComponent.y(jSONObject);
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
        knp knpVar = this.X0;
        if (knpVar != null) {
            knpVar.b();
        }
        ShopWrapWebView shopWrapWebView = this.R0;
        if (shopWrapWebView != null) {
            kew.h(shopWrapWebView);
        }
        ShopWrapWebView shopWrapWebView2 = this.R0;
        if (shopWrapWebView2 != null) {
            shopWrapWebView2.destroyWebView();
        }
        inp inpVar = this.S0;
        if (inpVar != null) {
            inpVar.p();
        }
    }

    public final void j2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4780bdd", new Object[]{this, new Boolean(z)});
            return;
        }
        Shop2023PullDownHelper shop2023PullDownHelper = this.V0;
        if (shop2023PullDownHelper != null) {
            shop2023PullDownHelper.l(z);
        }
    }

    public final void k2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a42166", new Object[]{this});
            return;
        }
        L2();
        this.t0 = 0;
        this.u0 = 0;
        if (D2()) {
            n2(false);
        }
        S0(true);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public ViewPager m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("8aa45209", new Object[]{this});
        }
        EnhancedViewPager enhancedViewPager = this.M;
        if (enhancedViewPager != null) {
            return enhancedViewPager;
        }
        ckf.y("contentViewPager");
        throw null;
    }

    public final void n2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74e4e", new Object[]{this, new Boolean(z)});
        }
    }

    public final boolean o2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcb4226c", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        npp.a aVar = npp.Companion;
        aVar.f("Default2023Shop changeToCrossStoreStyle " + z + ' ' + r());
        if (z) {
            if (r() || B()) {
                return false;
            }
        } else if (!B()) {
            return false;
        }
        lnp lnpVar = this.W0;
        if (lnpVar != null) {
            lnpVar.d(z);
        }
        w0(z);
        X2();
        EnhancedViewPager enhancedViewPager = this.M;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCanScroll(!z);
            return true;
        }
        ckf.y("contentViewPager");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i2)});
        } else {
            super.onPageScrollStateChanged(i2);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeCancel(MotionEvent motionEvent) {
        ShopWrapWebView shopWrapWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5770811", new Object[]{this, motionEvent});
            return;
        }
        ckf.g(motionEvent, "event");
        J2();
        ShopOptSwipeLayout shopOptSwipeLayout = this.N;
        if (shopOptSwipeLayout == null) {
            ckf.y("outerSwiperLayout");
            throw null;
        } else if (shopOptSwipeLayout.isForceIntercept() && (shopWrapWebView = this.R0) != null) {
            shopWrapWebView.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown(View view, MotionEvent motionEvent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74251660", new Object[]{this, view, motionEvent, new Integer(i2)});
            return;
        }
        ckf.g(view, "fromTargetView");
        ckf.g(motionEvent, "event");
        Z(view, motionEvent, i2);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeUp(View view, MotionEvent motionEvent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e512d9", new Object[]{this, view, motionEvent, new Integer(i2)});
            return;
        }
        ckf.g(view, "fromTargetView");
        ckf.g(motionEvent, "event");
        a0(view, motionEvent, i2);
    }

    public final void s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f4577c", new Object[]{this});
        }
    }

    public final void t2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9027d45c", new Object[]{this});
            return;
        }
        Runnable runnable = this.Q0;
        if (runnable != null) {
            runnable.run();
        }
        this.Q0 = null;
    }

    public final int u2() {
        int a2;
        int d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d523f80", new Object[]{this})).intValue();
        }
        if (!D2()) {
            return 0;
        }
        if (this.k0.n()) {
            a2 = this.k0.o();
            d2 = this.k0.d();
        } else {
            a2 = this.k0.a();
            d2 = this.k0.d();
        }
        return a2 - d2;
    }

    public final View v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cb74cf6b", new Object[]{this});
        }
        FrameLayout frameLayout = this.P0;
        if (frameLayout != null) {
            return frameLayout;
        }
        fnp fnpVar = this.H0;
        if (fnpVar == null) {
            return null;
        }
        return fnpVar.d();
    }

    public final int w2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("edc59cdf", new Object[]{this})).intValue();
        }
        if (D2()) {
            return this.l0.c();
        }
        return this.l0.f();
    }

    public final int x2() {
        int f2;
        int g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a89d5b74", new Object[]{this})).intValue();
        }
        if (!D2()) {
            f2 = this.l0.f() - L();
            g2 = this.k0.g();
        } else if (v()) {
            return this.q0.a() + ((this.D0 - L()) - this.k0.g());
        } else {
            f2 = this.l0.c() - L();
            g2 = this.k0.g();
        }
        return f2 - g2;
    }

    public final void y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99482615", new Object[]{this});
        } else if (v()) {
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.G0;
            if (shop2023HeaderInfoTemplate != null) {
                shop2023HeaderInfoTemplate.I(false);
            }
            inp inpVar = this.S0;
            if (inpVar != null) {
                inpVar.s(false);
            }
            ViewGroup viewGroup = this.S;
            if (viewGroup != null) {
                kew.C(viewGroup);
                EmbedShopLoftComponent embedShopLoftComponent = this.F0;
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

    public final void z2() {
        jnp jnpVar;
        View d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f72cb592", new Object[]{this});
        } else if (!this.i0 && (jnpVar = this.K0) != null && (d2 = jnpVar.d()) != null) {
            bdw.c(d2, 0.0f, 200L, null, 4, null).start();
            this.i0 = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A2() {
        /*
            r8 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.triver.triver_shop.shop2023.Default2023Shop.$ipChange
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
            r8.Z0 = r0
            float r0 = r1.d()
            tb.dop r5 = r8.l0
            int r5 = r5.c()
            float r5 = (float) r5
            float r0 = r0 * r5
            int r0 = (int) r0
            int r2 = r2 - r0
            android.view.View r5 = r8.Y
            java.lang.String r6 = "shopBackgroundColorViewPart1"
            if (r5 == 0) goto L_0x00c1
            tb.kew.e(r5, r0)
            android.view.View r5 = r8.Z
            java.lang.String r7 = "shopBackgroundColorViewPart2"
            if (r5 == 0) goto L_0x00bd
            tb.kew.e(r5, r2)
            android.view.View r2 = r8.Z
            if (r2 == 0) goto L_0x00b9
            r2.setBackgroundColor(r4)
            android.view.View r2 = r8.Z
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
            android.view.View r0 = r8.Y
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
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.shop2023.Default2023Shop.A2():void");
    }

    public final void E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6bfc07", new Object[]{this});
            return;
        }
        Pair<Integer, Integer> v1 = J().v1("live");
        if (v1 != null) {
            this.b0 = true;
            O0(v1.getFirst().intValue(), v1.getSecond().intValue(), "live");
            return;
        }
        npp.Companion.b("do not find live tab");
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
        if (D2()) {
            if (!z) {
                y2();
                Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.G0;
                if (shop2023HeaderInfoTemplate != null) {
                    shop2023HeaderInfoTemplate.M(Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED);
                }
                Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate = this.M0;
                if (shop2023HeaderTagListTemplate != null) {
                    shop2023HeaderTagListTemplate.J();
                }
            } else if (v()) {
                M2();
                Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate2 = this.G0;
                if (shop2023HeaderInfoTemplate2 != null) {
                    shop2023HeaderInfoTemplate2.M(Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED);
                }
                Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate2 = this.M0;
                if (shop2023HeaderTagListTemplate2 != null) {
                    shop2023HeaderTagListTemplate2.J();
                }
            } else {
                Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate3 = this.G0;
                if (shop2023HeaderInfoTemplate3 != null) {
                    shop2023HeaderInfoTemplate3.M(Shop2023HeaderInfoTemplate.HeaderStyle.DEFAULT);
                }
                Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate4 = this.G0;
                if (shop2023HeaderInfoTemplate4 != null) {
                    shop2023HeaderInfoTemplate4.I(false);
                }
                Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate3 = this.M0;
                if (shop2023HeaderTagListTemplate3 != null) {
                    shop2023HeaderTagListTemplate3.K();
                }
            }
        } else if (!z || this.C0) {
            Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate4 = this.M0;
            if (shop2023HeaderTagListTemplate4 != null) {
                shop2023HeaderTagListTemplate4.J();
            }
        } else {
            Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate5 = this.M0;
            if (shop2023HeaderTagListTemplate5 != null) {
                shop2023HeaderTagListTemplate5.K();
            }
        }
    }

    public final void X2() {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a3e7a31", new Object[]{this});
            return;
        }
        int height = H().getHeight();
        if (height == 0) {
            height = r54.m(n()).heightPixels;
        }
        if (B()) {
            FrameLayout frameLayout = this.R;
            if (frameLayout != null) {
                i2 = frameLayout.getHeight();
            } else {
                ckf.y("navViewContainer");
                throw null;
            }
        }
        if (this.C0) {
            FrameLayout frameLayout2 = this.O;
            if (frameLayout2 != null) {
                kew.e(frameLayout2, height);
            } else {
                ckf.y("centerContainer");
                throw null;
            }
        } else if (D2()) {
            FrameLayout frameLayout3 = this.O;
            if (frameLayout3 != null) {
                kew.e(frameLayout3, ((height - this.k0.g()) - L()) + this.l0.a() + i2);
            } else {
                ckf.y("centerContainer");
                throw null;
            }
        } else {
            FrameLayout frameLayout4 = this.O;
            if (frameLayout4 != null) {
                kew.e(frameLayout4, (((height - this.k0.g()) - this.l0.a()) - L()) + this.l0.a() + i2);
            } else {
                ckf.y("centerContainer");
                throw null;
            }
        }
    }

    public void i2() {
        View v2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d0cb3b", new Object[]{this});
        } else if (u() == 0) {
            ShopContainerPageAdapter shopContainerPageAdapter = this.V;
            if (shopContainerPageAdapter != null) {
                shopContainerPageAdapter.i(0);
                if (v() && (v2 = v2()) != null) {
                    kew.C(v2);
                    return;
                }
                return;
            }
            ckf.y("shopContainerPageAdapter");
            throw null;
        } else {
            kew.L(H(), new Default2023Shop$allTemplateLoadFinish$1(this));
        }
    }

    public void J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d8ba32", new Object[]{this});
            return;
        }
        this.d0 = false;
        EnhancedViewPager enhancedViewPager = this.M;
        Boolean bool = null;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCanDispatchToChild(true);
            EnhancedViewPager enhancedViewPager2 = this.M;
            if (enhancedViewPager2 != null) {
                enhancedViewPager2.setCanScroll(!B() && !this.A0);
                Shop2023PullDownHelper shop2023PullDownHelper = this.V0;
                if (shop2023PullDownHelper == null || !shop2023PullDownHelper.i()) {
                    N2();
                    if (v() && this.u0 >= this.s0 && D2()) {
                        if (J().O0().q()) {
                            P2(true);
                            return;
                        }
                        EmbedShopLoftComponent embedShopLoftComponent = this.F0;
                        if (embedShopLoftComponent != null) {
                            embedShopLoftComponent.B();
                        }
                    }
                    if (!A() && !this.C0 && !j()) {
                        boolean z = this.w0;
                        ShopOptSwipeLayout shopOptSwipeLayout = this.N;
                        if (shopOptSwipeLayout != null) {
                            shopOptSwipeLayout.forceInterceptAllTouchEvent(false);
                            this.w0 = false;
                            this.z0 = 0;
                            if (z) {
                                npp.a aVar = npp.Companion;
                                aVar.b("upDistance : " + this.t0 + ", downDistance : " + this.u0);
                                if (v()) {
                                    ViewGroup viewGroup = this.S;
                                    if (viewGroup != null) {
                                        aop aopVar = this.E0;
                                        ckf.d(aopVar);
                                        kew.e(viewGroup, aopVar.b());
                                    } else {
                                        ckf.y("bigCardContainer");
                                        throw null;
                                    }
                                }
                                int i2 = this.t0;
                                if (i2 == 0) {
                                    S0(true);
                                    t2();
                                    if (D2()) {
                                        n2(false);
                                        return;
                                    }
                                    return;
                                }
                                int i3 = this.r0;
                                if (i2 == i3) {
                                    if (this.Y0 && r()) {
                                        ShopDataParser J = J();
                                        EmbedShopLoftComponent embedShopLoftComponent2 = this.F0;
                                        if (embedShopLoftComponent2 != null) {
                                            bool = Boolean.valueOf(embedShopLoftComponent2.u());
                                        }
                                        ShopExtKt.j0(J, bool);
                                    }
                                    if (r()) {
                                        W2();
                                    }
                                    S0(false);
                                    t2();
                                    n2(true);
                                } else if (i2 / i3 < 0.3d || !this.x0) {
                                    k2();
                                } else {
                                    F2((i3 - i2) * (-1));
                                    int i4 = this.r0;
                                    this.t0 = i4;
                                    this.u0 = 0 - i4;
                                    n2(true);
                                    S0(false);
                                    if (this.Y0) {
                                        ShopDataParser J2 = J();
                                        EmbedShopLoftComponent embedShopLoftComponent3 = this.F0;
                                        if (embedShopLoftComponent3 != null) {
                                            bool = Boolean.valueOf(embedShopLoftComponent3.u());
                                        }
                                        ShopExtKt.j0(J2, bool);
                                    }
                                    W2();
                                }
                            }
                        } else {
                            ckf.y("outerSwiperLayout");
                            throw null;
                        }
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

    public final void K2() {
        View d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712efc8e", new Object[]{this});
            return;
        }
        npp.Companion.b("reCalculateHeightAndLayout");
        this.o0.i(this.p0.a());
        dnp dnpVar = this.J0;
        if (!(dnpVar == null || (d2 = dnpVar.d()) == null)) {
            kew.d0(d2, this.o0.c());
        }
        this.q0.h(this.p0.a() + this.o0.a());
        if (v()) {
            this.q0.i(this.D0);
        } else {
            this.q0.i(L() + this.j0.a());
        }
        FrameLayout frameLayout = this.U;
        if (frameLayout != null) {
            kew.e(frameLayout, this.q0.a());
            FrameLayout frameLayout2 = this.U;
            if (frameLayout2 != null) {
                kew.d0(frameLayout2, this.q0.c());
                inp inpVar = this.S0;
                if (inpVar != null) {
                    inpVar.P(this.q0.a());
                }
                if (this.q0.a() == 0) {
                    this.B0 = true;
                    View view = this.a0;
                    if (view != null) {
                        view.setBackgroundColor(0);
                        n2(true);
                        Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent = this.U0;
                        if (shop2023TopNavBarNativeComponent != null) {
                            shop2023TopNavBarNativeComponent.t(false);
                        }
                        Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent2 = this.U0;
                        if (shop2023TopNavBarNativeComponent2 != null) {
                            shop2023TopNavBarNativeComponent2.r(true ^ r());
                        }
                    } else {
                        ckf.y("shopCenterGrayLine");
                        throw null;
                    }
                }
                if (v()) {
                    this.l0.i(this.D0 + this.q0.a());
                } else {
                    this.l0.i(L() + this.j0.a() + this.q0.a());
                }
                this.l0.k(L() + this.k0.a() + this.n0.a());
                FrameLayout frameLayout3 = this.R;
                if (frameLayout3 != null) {
                    kew.e(frameLayout3, -2);
                    if (this.C0) {
                        FrameLayout frameLayout4 = this.R;
                        if (frameLayout4 != null) {
                            kew.d0(frameLayout4, this.l0.b());
                        } else {
                            ckf.y("navViewContainer");
                            throw null;
                        }
                    } else if (O()) {
                        if (r()) {
                            FrameLayout frameLayout5 = this.R;
                            if (frameLayout5 != null) {
                                kew.d0(frameLayout5, this.l0.c());
                            } else {
                                ckf.y("navViewContainer");
                                throw null;
                            }
                        }
                    } else if (r()) {
                        FrameLayout frameLayout6 = this.R;
                        if (frameLayout6 != null) {
                            kew.d0(frameLayout6, this.l0.f());
                        } else {
                            ckf.y("navViewContainer");
                            throw null;
                        }
                    }
                    this.r0 = x2();
                    if (!r()) {
                        this.t0 = this.r0;
                    }
                    inp inpVar2 = this.S0;
                    if (inpVar2 != null) {
                        inpVar2.J(this.r0);
                    }
                    this.v0 = u2();
                    return;
                }
                ckf.y("navViewContainer");
                throw null;
            }
            ckf.y("shopRelationContainer");
            throw null;
        }
        ckf.y("shopRelationContainer");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.Shop2023BaseComponent, com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void N(FragmentActivity fragmentActivity, ShopDataParser shopDataParser, ShopDXEngine shopDXEngine) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8670aafd", new Object[]{this, fragmentActivity, shopDataParser, shopDXEngine});
            return;
        }
        ckf.g(fragmentActivity, "context");
        ckf.g(shopDataParser, "shopData");
        ckf.g(shopDXEngine, "shopDXEngine");
        ltt lttVar = new ltt();
        super.N(fragmentActivity, shopDataParser, shopDXEngine);
        fragmentActivity.getLifecycle().addObserver(C());
        this.Y0 = shopDataParser.O0().b();
        if (s() != 0) {
            z = true;
        }
        this.e0 = z;
        shopDataParser.m1().q(new e());
        shopDataParser.m1().u(new Default2023Shop$initComponent$2(this));
        shopDataParser.m1().x(new Default2023Shop$initComponent$3(this));
        if (aqp.Companion.r() && shopDataParser.P0().b()) {
            shopDataParser.m1().s(new Default2023Shop$initComponent$4(this));
            shopDataParser.m1().t(new Default2023Shop$initComponent$5(this));
        }
        this.y0 = ViewConfiguration.get(fragmentActivity).getScaledTouchSlop();
        khu.a(fragmentActivity, true);
        C2();
        shopDataParser.Y2(mop.KEY_INIT_SHOP_BASE_VIEW, Long.valueOf(lttVar.a()));
        lttVar.b();
        ShopOptSwipeLayout shopOptSwipeLayout = this.N;
        if (shopOptSwipeLayout != null) {
            shopOptSwipeLayout.setScrollThreshold(this.y0);
            this.X0 = new knp(this);
            B2();
            A2();
            if (this.B0) {
                n2(true);
            }
            X2();
            shopDataParser.Y2(mop.KEY_INIT_SHOP_TEMPLATE_COMPONENT_COST, Long.valueOf(lttVar.a()));
            return;
        }
        ckf.y("outerSwiperLayout");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void O0(int i2, int i3, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e0f8b4d", new Object[]{this, new Integer(i2), new Integer(i3), str});
            return;
        }
        ckf.g(str, "targetTabName");
        if (aqp.Companion.A()) {
            Object E0 = J().E0(str);
            npp.Companion.f(ckf.p("Default2023Shop switchTabTo params ", E0));
            if (!(E0 instanceof String) || ((CharSequence) E0).length() <= 0) {
                z = false;
            } else {
                JSONObject k = brf.k((String) E0);
                z = ckf.b(k == null ? null : k.getString("enableGoBackToAllItems"), "true");
            }
            if (!z || !spp.c(str)) {
                this.c0 = false;
            } else {
                this.c0 = true;
            }
        }
        int j2 = J().j(i2, i3);
        EnhancedViewPager enhancedViewPager = this.M;
        if (enhancedViewPager != null) {
            enhancedViewPager.setCurrentItem(j2, false);
        } else {
            ckf.y("contentViewPager");
            throw null;
        }
    }

    public final void R2(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c55ab211", new Object[]{this, new Integer(i2), new Boolean(z)});
        } else if (!q() || A() || this.C0) {
        } else {
            if ((!z || !j()) && J().Q1(J().R())) {
                if (!this.w0) {
                    int abs = this.z0 + Math.abs(i2);
                    this.z0 = abs;
                    if (abs < this.y0) {
                        return;
                    }
                }
                z2();
                int Z0 = (int) (i2 * Z0());
                if (this.t0 < this.r0 && D2()) {
                    n2(false);
                    if (v()) {
                        ViewGroup viewGroup = this.S;
                        if (viewGroup == null) {
                            ckf.y("bigCardContainer");
                            throw null;
                        } else if (!kew.I(viewGroup)) {
                            M2();
                        }
                    }
                }
                int w2 = w2();
                EnhancedViewPager enhancedViewPager = this.M;
                if (enhancedViewPager != null) {
                    enhancedViewPager.setCanScroll(false);
                    this.x0 = false;
                    this.w0 = true;
                    boolean z2 = D2() && v();
                    EnhancedViewPager enhancedViewPager2 = this.M;
                    if (enhancedViewPager2 != null) {
                        enhancedViewPager2.setCanDispatchToChild(false);
                        int i3 = this.t0;
                        if (i3 - Z0 > 0 || z2) {
                            this.u0 += Z0;
                            this.t0 = i3 - Z0;
                        } else {
                            Shop2023PullDownHelper shop2023PullDownHelper = this.V0;
                            if (shop2023PullDownHelper != null) {
                                shop2023PullDownHelper.h(Z0);
                            }
                            this.t0 = 0;
                            this.u0 = 0;
                            EnhancedViewPager enhancedViewPager3 = this.M;
                            if (enhancedViewPager3 != null) {
                                enhancedViewPager3.setCanDispatchToChild(true);
                            } else {
                                ckf.y("contentViewPager");
                                throw null;
                            }
                        }
                        inp inpVar = this.S0;
                        if (inpVar != null) {
                            inpVar.G(this.t0);
                        }
                        float abs2 = Math.abs(this.t0) / this.r0;
                        float f2 = 1 - (abs2 * 1.0f);
                        if (this.u0 >= 0) {
                            FrameLayout frameLayout = this.U;
                            if (frameLayout != null) {
                                frameLayout.setAlpha(1.0f);
                            } else {
                                ckf.y("shopRelationContainer");
                                throw null;
                            }
                        } else {
                            FrameLayout frameLayout2 = this.U;
                            if (frameLayout2 != null) {
                                frameLayout2.setAlpha(f2);
                            } else {
                                ckf.y("shopRelationContainer");
                                throw null;
                            }
                        }
                        View v2 = v2();
                        if (v2 != null) {
                            v2.setAlpha(f2);
                        }
                        if (v()) {
                            aop aopVar = this.E0;
                            ckf.d(aopVar);
                            int b2 = aopVar.b();
                            ViewGroup viewGroup2 = this.S;
                            if (viewGroup2 == null) {
                                ckf.y("bigCardContainer");
                                throw null;
                            } else if (viewGroup2.getHeight() + Math.abs(this.u0) < b2) {
                                ViewGroup viewGroup3 = this.S;
                                if (viewGroup3 != null) {
                                    kew.e(viewGroup3, b2);
                                } else {
                                    ckf.y("bigCardContainer");
                                    throw null;
                                }
                            } else if (this.t0 <= 0) {
                                ViewGroup viewGroup4 = this.S;
                                if (viewGroup4 != null) {
                                    kew.e(viewGroup4, Math.min(H().getHeight(), b2 + Math.abs(this.u0)));
                                } else {
                                    ckf.y("bigCardContainer");
                                    throw null;
                                }
                            }
                        }
                        if (this.u0 >= 0) {
                            FrameLayout frameLayout3 = this.U;
                            if (frameLayout3 != null) {
                                kew.d0(frameLayout3, this.q0.c() + this.u0);
                            } else {
                                ckf.y("shopRelationContainer");
                                throw null;
                            }
                        } else {
                            FrameLayout frameLayout4 = this.U;
                            if (frameLayout4 != null) {
                                kew.d0(frameLayout4, this.q0.c() - ((int) (this.v0 * abs2)));
                            } else {
                                ckf.y("shopRelationContainer");
                                throw null;
                            }
                        }
                        FrameLayout frameLayout5 = this.R;
                        if (frameLayout5 != null) {
                            kew.d0(frameLayout5, w2 + this.u0);
                            if (v() && this.u0 >= this.s0 && !this.d0) {
                                kew.i0(n());
                                this.d0 = true;
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

    public final void T2(int i2, boolean z, Integer num) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8536df6d", new Object[]{this, new Integer(i2), new Boolean(z), num});
        } else if (!q() || A() || this.C0) {
        } else {
            if (!z || !j()) {
                if (!this.w0) {
                    EnhancedViewPager enhancedViewPager = this.M;
                    if (enhancedViewPager != null) {
                        enhancedViewPager.setCanDispatchToChild(false);
                        int abs = this.z0 + Math.abs(i2);
                        this.z0 = abs;
                        if (abs < this.y0) {
                            return;
                        }
                    } else {
                        ckf.y("contentViewPager");
                        throw null;
                    }
                }
                int Z0 = (int) (i2 * Z0());
                Shop2023PullDownHelper shop2023PullDownHelper = this.V0;
                if (shop2023PullDownHelper == null || !shop2023PullDownHelper.j(Z0)) {
                    z2();
                    this.w0 = true;
                    this.x0 = true;
                    EnhancedViewPager enhancedViewPager2 = this.M;
                    if (enhancedViewPager2 != null) {
                        enhancedViewPager2.setCanScroll(false);
                        if (this.t0 >= this.r0) {
                            n2(true);
                            EnhancedViewPager enhancedViewPager3 = this.M;
                            if (enhancedViewPager3 != null) {
                                enhancedViewPager3.setCanDispatchToChild(true);
                            } else {
                                ckf.y("contentViewPager");
                                throw null;
                            }
                        } else {
                            if (num == null) {
                                i3 = w2();
                            } else {
                                i3 = num.intValue();
                            }
                            int i4 = this.t0 + Z0;
                            this.t0 = i4;
                            this.u0 -= Z0;
                            int i5 = this.r0;
                            if (i4 > i5) {
                                this.t0 = i5;
                                this.u0 = 0 - i5;
                            }
                            inp inpVar = this.S0;
                            if (inpVar != null) {
                                inpVar.G(this.t0);
                            }
                            float abs2 = Math.abs(this.t0) / this.r0;
                            float f2 = 1 - (abs2 * 1.0f);
                            if (this.u0 >= 0) {
                                FrameLayout frameLayout = this.U;
                                if (frameLayout != null) {
                                    frameLayout.setAlpha(1.0f);
                                } else {
                                    ckf.y("shopRelationContainer");
                                    throw null;
                                }
                            } else {
                                FrameLayout frameLayout2 = this.U;
                                if (frameLayout2 != null) {
                                    frameLayout2.setAlpha(f2);
                                } else {
                                    ckf.y("shopRelationContainer");
                                    throw null;
                                }
                            }
                            View v2 = v2();
                            if (v2 != null) {
                                v2.setAlpha(f2);
                            }
                            if (this.u0 >= 0) {
                                FrameLayout frameLayout3 = this.U;
                                if (frameLayout3 != null) {
                                    kew.d0(frameLayout3, this.q0.c() - this.t0);
                                } else {
                                    ckf.y("shopRelationContainer");
                                    throw null;
                                }
                            } else {
                                FrameLayout frameLayout4 = this.U;
                                if (frameLayout4 != null) {
                                    kew.d0(frameLayout4, this.q0.c() - ((int) (this.v0 * abs2)));
                                } else {
                                    ckf.y("shopRelationContainer");
                                    throw null;
                                }
                            }
                            if (v()) {
                                aop aopVar = this.E0;
                                ckf.d(aopVar);
                                int b2 = aopVar.b();
                                int i6 = this.t0;
                                if (i6 >= 0) {
                                    ViewGroup viewGroup = this.S;
                                    if (viewGroup != null) {
                                        kew.e(viewGroup, b2);
                                    } else {
                                        ckf.y("bigCardContainer");
                                        throw null;
                                    }
                                } else {
                                    ViewGroup viewGroup2 = this.S;
                                    if (viewGroup2 != null) {
                                        kew.e(viewGroup2, b2 - i6);
                                    } else {
                                        ckf.y("bigCardContainer");
                                        throw null;
                                    }
                                }
                            }
                            FrameLayout frameLayout5 = this.R;
                            if (frameLayout5 != null) {
                                kew.d0(frameLayout5, i3 - this.t0);
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

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i2) {
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i2)});
            return;
        }
        super.onPageSelected(i2);
        int p = p();
        if (i2 != p) {
            ShopContainerPageAdapter shopContainerPageAdapter = this.V;
            if (shopContainerPageAdapter != null) {
                shopContainerPageAdapter.j(p);
            } else {
                ckf.y("shopContainerPageAdapter");
                throw null;
            }
        }
        ShopContainerPageAdapter shopContainerPageAdapter2 = this.V;
        if (shopContainerPageAdapter2 != null) {
            shopContainerPageAdapter2.i(i2);
            int i3 = J().i(p());
            m0(i2);
            int i4 = J().i(p());
            int o = o();
            int k = J().k(p());
            int i5 = J().i(i2);
            J().W2(i5, k);
            npp.a aVar = npp.Companion;
            aVar.b("flag ship , on page selected , newTab = " + k + ", newSub = " + i5 + " , oldTab = " + o + ", position : " + i2);
            ups t1 = J().t1(k, i5);
            if (!(t1 == null || (shop2023HeaderInfoTemplate = this.G0) == null)) {
                shop2023HeaderInfoTemplate.P(t1.t());
            }
            l0(k);
            o();
            y1a<Integer, Integer, Integer, Integer, xhv> F = F();
            if (F != null) {
                F.invoke(Integer.valueOf(k), Integer.valueOf(i5), Integer.valueOf(o), Integer.valueOf(i3));
            }
            Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent = this.U0;
            if (shop2023TopNavBarNativeComponent != null) {
                shop2023TopNavBarNativeComponent.w(k, i4);
            }
            Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent = this.T0;
            if (shop2023BottomBarNativeComponent != null) {
                shop2023BottomBarNativeComponent.E(k, i4);
            }
            boolean c2 = spp.c(J().S(o, i3));
            boolean c3 = spp.c(J().S(k, i4));
            if (o == 0 && k != 0) {
                q2(c2, c3, o, i3);
            }
            if (o != 0 && k == 0) {
                p2(c2, o, i3);
            }
            if (!(o == 0 || k == 0)) {
                m2(c2, c3, o, i3);
            }
            X2();
            b0();
            A0(false);
            if (!c3 && (!v() || !r() || k != 0)) {
                z = false;
            }
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate2 = this.G0;
            if (shop2023HeaderInfoTemplate2 != null) {
                shop2023HeaderInfoTemplate2.I(z);
            }
            if (c2) {
                Q0(false);
                U0(false);
                this.b0 = false;
            }
            if (c2 && k == 0 && J().m1().c()) {
                O2();
                return;
            }
            return;
        }
        ckf.y("shopContainerPageAdapter");
        throw null;
    }

    public final void q2(boolean z, boolean z2, int i2, int i3) {
        Shop2023TopNavBarNativeComponent A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab70ef9b", new Object[]{this, new Boolean(z), new Boolean(z2), new Integer(i2), new Integer(i3)});
            return;
        }
        npp.a aVar = npp.Companion;
        aVar.b("changeToOtherPage : lastTabFullScreen : " + z + " , targetTabFullScreen : " + z2);
        int i4 = this.r0;
        int x2 = x2();
        this.r0 = x2;
        inp inpVar = this.S0;
        if (inpVar != null) {
            inpVar.J(x2);
        }
        if (z2) {
            FrameLayout frameLayout = this.R;
            if (frameLayout != null) {
                frameLayout.setZ(0.0f);
                inp inpVar2 = this.S0;
                if (inpVar2 != null) {
                    inpVar2.n();
                }
                FrameLayout frameLayout2 = this.R;
                if (frameLayout2 != null) {
                    kew.d0(frameLayout2, this.l0.b());
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
            FrameLayout frameLayout3 = this.R;
            if (frameLayout3 != null) {
                frameLayout3.setZ(0.1f);
                int x22 = x2();
                inp inpVar3 = this.S0;
                if (inpVar3 != null) {
                    inpVar3.J(x22);
                }
                int f2 = this.l0.f() - x22;
                if (!r()) {
                    inp inpVar4 = this.S0;
                    if (inpVar4 != null) {
                        inpVar4.n();
                    }
                    FrameLayout frameLayout4 = this.R;
                    if (frameLayout4 != null) {
                        kew.d0(frameLayout4, f2);
                        FrameLayout frameLayout5 = this.U;
                        if (frameLayout5 != null) {
                            kew.C(frameLayout5);
                            this.t0 = x22;
                            this.u0 = 0 - x22;
                        } else {
                            ckf.y("shopRelationContainer");
                            throw null;
                        }
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                } else if (E()) {
                    FrameLayout frameLayout6 = this.R;
                    if (frameLayout6 != null) {
                        kew.d0(frameLayout6, this.l0.f());
                        inp inpVar5 = this.S0;
                        if (!(inpVar5 == null || (A = inpVar5.A()) == null)) {
                            A.r(true);
                        }
                        FrameLayout frameLayout7 = this.U;
                        if (frameLayout7 != null) {
                            kew.C(frameLayout7);
                        } else {
                            ckf.y("shopRelationContainer");
                            throw null;
                        }
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                } else {
                    FrameLayout frameLayout8 = this.R;
                    if (frameLayout8 != null) {
                        int z3 = kew.z(frameLayout8) - f2;
                        EnhancedViewPager enhancedViewPager = this.M;
                        if (enhancedViewPager != null) {
                            enhancedViewPager.post(new d(i4, z3, x22));
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
            FrameLayout frameLayout9 = this.T;
            if (frameLayout9 != null) {
                frameLayout9.setZ(1.0f);
                View v2 = v2();
                if (v2 != null) {
                    kew.C(v2);
                }
            } else {
                ckf.y("shopHeaderContainer");
                throw null;
            }
        } else {
            View v22 = v2();
            if (v22 != null) {
                kew.g0(v22);
            }
        }
        if (z) {
            FrameLayout frameLayout10 = this.T;
            if (frameLayout10 != null) {
                frameLayout10.setZ(0.0f);
                View v23 = v2();
                if (v23 != null) {
                    kew.g0(v23);
                }
            } else {
                ckf.y("shopHeaderContainer");
                throw null;
            }
        }
        this.C0 = z2;
        s2();
        n2(true);
        y2();
    }

    public final boolean r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cca356c2", new Object[]{this})).booleanValue();
        }
        if (this.b0 && spp.c(J().R())) {
            npp.Companion.b("goBack to shopIndex");
            this.b0 = false;
            O0(0, 0, J().S(0, 0));
            return false;
        } else if (!this.c0 || !spp.c(J().R())) {
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

    public final void O2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919dd9fb", new Object[]{this});
        } else if (v()) {
            i0(true);
            ViewGroup viewGroup = this.P;
            if (viewGroup != null) {
                int height = viewGroup.getHeight() / 2;
                ViewGroup viewGroup2 = this.S;
                if (viewGroup2 != null) {
                    kew.e(viewGroup2, H().getHeight());
                    FrameLayout frameLayout = this.R;
                    if (frameLayout != null) {
                        kew.d0(frameLayout, this.l0.c());
                        FrameLayout frameLayout2 = this.U;
                        if (frameLayout2 != null) {
                            kew.d0(frameLayout2, this.q0.c());
                            FrameLayout frameLayout3 = this.O;
                            if (frameLayout3 != null) {
                                int width = frameLayout3.getWidth() / 2;
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.addListener(new a(this));
                                FrameLayout frameLayout4 = this.O;
                                if (frameLayout4 != null) {
                                    int width2 = frameLayout4.getWidth() / 2;
                                    ViewGroup viewGroup3 = this.P;
                                    if (viewGroup3 != null) {
                                        int top = viewGroup3.getTop() - this.l0.c();
                                        FrameLayout frameLayout5 = this.R;
                                        if (frameLayout5 != null) {
                                            int height2 = (top - frameLayout5.getHeight()) + height;
                                            FrameLayout frameLayout6 = this.O;
                                            if (frameLayout6 != null) {
                                                Animator a2 = bdw.a(frameLayout6, Integer.valueOf(width2), Integer.valueOf(height2), Integer.valueOf(width));
                                                FrameLayout frameLayout7 = this.R;
                                                if (frameLayout7 != null) {
                                                    int width3 = frameLayout7.getWidth() / 2;
                                                    ViewGroup viewGroup4 = this.P;
                                                    if (viewGroup4 != null) {
                                                        int top2 = (viewGroup4.getTop() - this.l0.c()) + height;
                                                        FrameLayout frameLayout8 = this.R;
                                                        if (frameLayout8 != null) {
                                                            Animator a3 = bdw.a(frameLayout8, Integer.valueOf(width3), Integer.valueOf(top2), Integer.valueOf(width));
                                                            FrameLayout frameLayout9 = this.U;
                                                            if (frameLayout9 != null) {
                                                                int width4 = frameLayout9.getWidth() / 2;
                                                                ViewGroup viewGroup5 = this.P;
                                                                if (viewGroup5 != null) {
                                                                    int top3 = (viewGroup5.getTop() - this.q0.c()) + height;
                                                                    FrameLayout frameLayout10 = this.U;
                                                                    if (frameLayout10 != null) {
                                                                        animatorSet.playTogether(a2, a3, bdw.a(frameLayout10, Integer.valueOf(width4), Integer.valueOf(top3), Integer.valueOf(width)));
                                                                        animatorSet.addListener(new i());
                                                                        animatorSet.setDuration(400L);
                                                                        animatorSet.start();
                                                                        return;
                                                                    }
                                                                    ckf.y("shopRelationContainer");
                                                                    throw null;
                                                                }
                                                                ckf.y("bottomBarContainer");
                                                                throw null;
                                                            }
                                                            ckf.y("shopRelationContainer");
                                                            throw null;
                                                        }
                                                        ckf.y("navViewContainer");
                                                        throw null;
                                                    }
                                                    ckf.y("bottomBarContainer");
                                                    throw null;
                                                }
                                                ckf.y("navViewContainer");
                                                throw null;
                                            }
                                            ckf.y("centerContainer");
                                            throw null;
                                        }
                                        ckf.y("navViewContainer");
                                        throw null;
                                    }
                                    ckf.y("bottomBarContainer");
                                    throw null;
                                }
                                ckf.y("centerContainer");
                                throw null;
                            }
                            ckf.y("centerContainer");
                            throw null;
                        }
                        ckf.y("shopRelationContainer");
                        throw null;
                    }
                    ckf.y("navViewContainer");
                    throw null;
                }
                ckf.y("bigCardContainer");
                throw null;
            }
            ckf.y("bottomBarContainer");
            throw null;
        }
    }

    public final void m2(boolean z, boolean z2, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f1300b", new Object[]{this, new Boolean(z), new Boolean(z2), new Integer(i2), new Integer(i3)});
            return;
        }
        npp.a aVar = npp.Companion;
        aVar.b("changeOtherToOtherPage : lastTabFullScreen : " + z + " , targetTabFullScreen : " + z2);
        if (z2) {
            FrameLayout frameLayout = this.R;
            if (frameLayout != null) {
                frameLayout.setZ(0.0f);
                FrameLayout frameLayout2 = this.T;
                if (frameLayout2 != null) {
                    frameLayout2.setZ(1.0f);
                    FrameLayout frameLayout3 = this.R;
                    if (frameLayout3 != null) {
                        kew.d0(frameLayout3, this.l0.b());
                        View v2 = v2();
                        if (v2 != null) {
                            kew.C(v2);
                        }
                        S0(false);
                        inp inpVar = this.S0;
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
            FrameLayout frameLayout4 = this.R;
            if (frameLayout4 != null) {
                frameLayout4.setZ(0.1f);
                FrameLayout frameLayout5 = this.T;
                if (frameLayout5 != null) {
                    frameLayout5.setZ(0.0f);
                    int x2 = x2();
                    int f2 = this.l0.f() - x2;
                    inp inpVar2 = this.S0;
                    if (inpVar2 != null) {
                        inpVar2.J(x2);
                    }
                    View v22 = v2();
                    if (v22 != null) {
                        kew.g0(v22);
                    }
                    if (!r()) {
                        FrameLayout frameLayout6 = this.R;
                        if (frameLayout6 != null) {
                            kew.d0(frameLayout6, f2);
                            this.t0 = x2;
                            this.u0 = 0 - x2;
                            inp inpVar3 = this.S0;
                            if (inpVar3 != null) {
                                inpVar3.l(r());
                            }
                        } else {
                            ckf.y("navViewContainer");
                            throw null;
                        }
                    } else {
                        FrameLayout frameLayout7 = this.R;
                        if (frameLayout7 != null) {
                            int z3 = kew.z(frameLayout7) - f2;
                            EnhancedViewPager enhancedViewPager = this.M;
                            if (enhancedViewPager != null) {
                                enhancedViewPager.post(new b(z3, this, x2));
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
        if (spp.c(J().S(i2, i3))) {
            ShopExtKt.k0(J(), null, 2, null);
        }
        this.C0 = z2;
        s2();
        n2(true);
    }

    public final void L2() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d282a0a", new Object[]{this});
            return;
        }
        int i2 = this.t0;
        float w2 = w2();
        if (this.R != null) {
            float z = w2 - kew.z(frameLayout);
            float c2 = this.q0.c();
            if (this.U != null) {
                float z2 = c2 - kew.z(frameLayout2);
                inp inpVar = this.S0;
                if (inpVar != null) {
                    inpVar.k(this.t0, (int) z);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                FrameLayout frameLayout3 = this.R;
                if (frameLayout3 != null) {
                    Animator i3 = bdw.i(frameLayout3, z, 0L, null, new LinearInterpolator(), 6, null);
                    if (i3 instanceof ValueAnimator) {
                        ((ValueAnimator) i3).addUpdateListener(new g(i2, this));
                    }
                    xhv xhvVar = xhv.INSTANCE;
                    FrameLayout frameLayout4 = this.U;
                    if (frameLayout4 != null) {
                        Animator i4 = bdw.i(frameLayout4, z2, 0L, null, new LinearInterpolator(), 6, null);
                        i4.addListener(new h());
                        animatorSet.playTogether(i3, i4);
                        animatorSet.setInterpolator(new LinearInterpolator());
                        animatorSet.addListener(new a(this));
                        animatorSet.start();
                        return;
                    }
                    ckf.y("shopRelationContainer");
                    throw null;
                }
                ckf.y("navViewContainer");
                throw null;
            }
            ckf.y("shopRelationContainer");
            throw null;
        }
        ckf.y("navViewContainer");
        throw null;
    }

    public final void B2() {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent;
        inp inpVar;
        ShopComponentModel shopComponentModel;
        EmbedSecondFloorView v;
        xpd.a f2;
        String string;
        int i4;
        int i5;
        JSONObject jSONObject;
        String string2;
        Integer m;
        String string3;
        Integer m2;
        TUrlImageView w;
        int a2;
        Integer m3;
        Integer m4;
        JSONObject jSONObject2;
        int i6 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f2897a", new Object[]{this});
            return;
        }
        Map<String, ShopComponentModel> m5 = J().O0().m();
        if (m5 == null) {
            npp.Companion.b("shopComponentData null");
            return;
        }
        boolean z3 = m5.get("tb_shop_header_shop_info_2023_native") != null;
        ShopComponentModel shopComponentModel2 = m5.get("tb_shop_header_shop_info_2023");
        if (shopComponentModel2 != null) {
            if (z3) {
                JSONObject data = shopComponentModel2.getData();
                z3 = ckf.b("true", (data == null || (jSONObject2 = data.getJSONObject("feature")) == null) ? null : jSONObject2.getString("showNativeShopInfo"));
            }
            this.k0.q(z3);
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = new Shop2023HeaderInfoTemplate(shopComponentModel2, new Default2023Shop$initTemplateComponent$1$1(this));
            this.G0 = shop2023HeaderInfoTemplate;
            BaseContentComponent.e0(this, shop2023HeaderInfoTemplate, null, 2, null);
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate2 = this.G0;
            if (shop2023HeaderInfoTemplate2 != null) {
                shop2023HeaderInfoTemplate2.x(new Default2023Shop$initTemplateComponent$1$2(this));
            }
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate3 = this.G0;
            ckf.d(shop2023HeaderInfoTemplate3);
            shop2023HeaderInfoTemplate3.k(n(), J(), I(), null);
            JSONObject extData = shopComponentModel2.getExtData();
            if (extData != null) {
                enp enpVar = this.k0;
                String string4 = extData.getString("indexPageHeaderFoldedStyleHeight");
                enpVar.j((string4 == null || (m4 = ssq.m(string4)) == null) ? 0 : kew.Q(m4));
                enp enpVar2 = this.k0;
                String string5 = extData.getString("otherPageHeaderStyleHeight");
                enpVar2.l((string5 == null || (m3 = ssq.m(string5)) == null) ? 0 : kew.Q(m3));
                xhv xhvVar = xhv.INSTANCE;
            }
            if (this.k0.d() == 0) {
                this.k0.j(kew.Q(182));
            }
            if (this.k0.g() == 0) {
                this.k0.l(kew.Q(121));
            }
            if (z3) {
                this.k0.s(kew.Q(Integer.valueOf(shopComponentModel2.getRenderHeight())));
            } else {
                this.k0.m(kew.Q(Integer.valueOf(shopComponentModel2.getRenderHeight())));
            }
            FrameLayout frameLayout = this.L;
            if (frameLayout != null) {
                Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate4 = this.G0;
                ckf.d(shop2023HeaderInfoTemplate4);
                View d2 = shop2023HeaderInfoTemplate4.d();
                int v2 = kew.v(11);
                if (z3) {
                    a2 = this.k0.p();
                } else {
                    a2 = this.k0.a();
                }
                frameLayout.addView(d2, kew.j(0, a2, v2, 0, 0, 0, 0, 121, null));
                xhv xhvVar2 = xhv.INSTANCE;
            } else {
                ckf.y("searchBarContainer");
                throw null;
            }
        }
        ShopComponentModel shopComponentModel3 = m5.get("tb_shop_header_shop_info_2023_native");
        if (shopComponentModel3 != null) {
            int P = kew.P(Integer.valueOf(shopComponentModel3.getRenderHeight()));
            inp inpVar2 = new inp(n(), J(), this.k0.p());
            this.S0 = inpVar2;
            Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate5 = this.G0;
            inpVar2.Q(shop2023HeaderInfoTemplate5 == null ? null : shop2023HeaderInfoTemplate5.d());
            inp inpVar3 = this.S0;
            if (!(inpVar3 == null || (w = inpVar3.w()) == null)) {
                w.setOnClickListener(new hx6(this));
                xhv xhvVar3 = xhv.INSTANCE;
            }
            inp inpVar4 = this.S0;
            if (inpVar4 != null) {
                inpVar4.N(new Default2023Shop$initTemplateComponent$2$2(this));
            }
            gnp a3 = gnp.Companion.a(J(), I());
            if (a3 != null) {
                this.L0 = a3;
                inp inpVar5 = this.S0;
                if (inpVar5 != null) {
                    inpVar5.i(a3.d());
                    xhv xhvVar4 = xhv.INSTANCE;
                }
            }
            FrameLayout frameLayout2 = this.T;
            if (frameLayout2 != null) {
                inp inpVar6 = this.S0;
                ckf.d(inpVar6);
                frameLayout2.addView(inpVar6.z(), kew.j(0, P, 0, 0, 0, 0, 0, 125, null));
                enp enpVar3 = this.k0;
                JSONObject extData2 = shopComponentModel3.getExtData();
                Integer valueOf = (extData2 == null || (string3 = extData2.getString("indexPageHeaderFoldedStyleHeight")) == null || (m2 = ssq.m(string3)) == null) ? null : Integer.valueOf(kew.Q(m2));
                if (valueOf == null) {
                    i4 = kew.Q(134);
                } else {
                    i4 = valueOf.intValue();
                }
                enpVar3.j(i4);
                enp enpVar4 = this.k0;
                JSONObject extData3 = shopComponentModel3.getExtData();
                Integer valueOf2 = (extData3 == null || (string2 = extData3.getString("otherPageHeaderStyleHeight")) == null || (m = ssq.m(string2)) == null) ? null : Integer.valueOf(kew.Q(m));
                if (valueOf2 == null) {
                    i5 = kew.Q(134);
                } else {
                    i5 = valueOf2.intValue();
                }
                enpVar4.l(i5);
                enp enpVar5 = this.k0;
                int g2 = enpVar5.g();
                JSONObject extData4 = shopComponentModel3.getExtData();
                int i7 = 66;
                if (!(extData4 == null || (jSONObject = extData4.getJSONObject("otherPageStyleConfig")) == null)) {
                    i7 = jSONObject.getIntValue("shopIconHeight");
                }
                enpVar5.l(g2 + ((int) (kew.P(Integer.valueOf(i7)) * 0.18f)));
                this.k0.r(P);
                this.k0.m(P);
                inp inpVar7 = this.S0;
                FrameLayout frameLayout3 = this.O;
                if (frameLayout3 != null) {
                    FrameLayout frameLayout4 = this.R;
                    if (frameLayout4 != null) {
                        FrameLayout frameLayout5 = this.U;
                        if (frameLayout5 != null) {
                            FrameLayout frameLayout6 = this.T;
                            if (frameLayout6 != null) {
                                Shop2023PullDownHelper shop2023PullDownHelper = new Shop2023PullDownHelper(inpVar7, new View[]{frameLayout3, frameLayout4, frameLayout5, frameLayout6});
                                this.V0 = shop2023PullDownHelper;
                                if (this.Z0) {
                                    View view = this.X;
                                    if (view != null) {
                                        shop2023PullDownHelper.n(view);
                                    } else {
                                        ckf.y("shopBackgroundColorViewContainer");
                                        throw null;
                                    }
                                } else {
                                    TUrlImageView tUrlImageView = this.W;
                                    if (tUrlImageView != null) {
                                        shop2023PullDownHelper.n(tUrlImageView);
                                    } else {
                                        ckf.y("shopBackgroundImg");
                                        throw null;
                                    }
                                }
                                Shop2023PullDownHelper shop2023PullDownHelper2 = this.V0;
                                if (shop2023PullDownHelper2 != null) {
                                    FrameLayout frameLayout7 = this.L;
                                    if (frameLayout7 != null) {
                                        shop2023PullDownHelper2.f(frameLayout7);
                                        xhv xhvVar5 = xhv.INSTANCE;
                                    } else {
                                        ckf.y("searchBarContainer");
                                        throw null;
                                    }
                                }
                                lnp lnpVar = new lnp(this.S0);
                                this.W0 = lnpVar;
                                FrameLayout frameLayout8 = this.O;
                                if (frameLayout8 != null) {
                                    lnpVar.i(frameLayout8);
                                    lnp lnpVar2 = this.W0;
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
                        } else {
                            ckf.y("shopRelationContainer");
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
            } else {
                ckf.y("shopHeaderContainer");
                throw null;
            }
        }
        ShopComponentModel shopComponentModel4 = m5.get("tb_shop_header_feature_2023");
        if (shopComponentModel4 != null) {
            fnp fnpVar = new fnp(shopComponentModel4);
            this.H0 = fnpVar;
            BaseContentComponent.e0(this, fnpVar, null, 2, null);
            fnp fnpVar2 = this.H0;
            ckf.d(fnpVar2);
            fnpVar2.k(n(), J(), I(), null);
            this.n0.m(kew.Q(Integer.valueOf(shopComponentModel4.getRenderHeight())));
            FrameLayout frameLayout9 = this.T;
            if (frameLayout9 != null) {
                fnp fnpVar3 = this.H0;
                ckf.d(fnpVar3);
                frameLayout9.addView(fnpVar3.d(), kew.j(0, this.n0.a(), this.k0.a(), 0, 0, 0, 0, 121, null));
                xhv xhvVar7 = xhv.INSTANCE;
            } else {
                ckf.y("shopHeaderContainer");
                throw null;
            }
        }
        FrameLayout frameLayout10 = new FrameLayout(n());
        boolean z4 = (m5.get("tb_shop_header_honor_list_2023") == null && m5.get("tb_shop_header_tag_list_2023") == null) ? false : true;
        ShopComponentModel shopComponentModel5 = m5.get("tb_shop_header_honor_list_2023");
        if (shopComponentModel5 == null) {
            i2 = 0;
        } else {
            hnp hnpVar = new hnp(shopComponentModel5);
            BaseContentComponent.e0(this, hnpVar, null, 2, null);
            hnpVar.k(n(), J(), I(), null);
            i2 = kew.P(Integer.valueOf(shopComponentModel5.getRenderHeight()));
            frameLayout10.addView(hnpVar.d(), kew.j(0, i2, 0, 0, 0, 0, 0, 121, null));
            xhv xhvVar8 = xhv.INSTANCE;
        }
        ShopComponentModel shopComponentModel6 = m5.get("tb_shop_header_tag_list_2023");
        if (shopComponentModel6 == null) {
            i3 = 0;
        } else {
            Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate = new Shop2023HeaderTagListTemplate(shopComponentModel6);
            this.M0 = shop2023HeaderTagListTemplate;
            BaseContentComponent.e0(this, shop2023HeaderTagListTemplate, null, 2, null);
            shop2023HeaderTagListTemplate.x(new Default2023Shop$initTemplateComponent$5$1(this, shop2023HeaderTagListTemplate));
            shop2023HeaderTagListTemplate.k(n(), J(), I(), null);
            i3 = kew.P(Integer.valueOf(shopComponentModel6.getRenderHeight()));
            FrameLayout frameLayout11 = new FrameLayout(n());
            kew.a(frameLayout11, shop2023HeaderTagListTemplate.d());
            frameLayout10.addView(frameLayout11, kew.j(-2, i3, i2, 0, 0, 0, 0, 120, null));
            xhv xhvVar9 = xhv.INSTANCE;
        }
        if (z4) {
            this.P0 = frameLayout10;
            FrameLayout frameLayout12 = this.T;
            if (frameLayout12 != null) {
                int i8 = i2 + i3;
                frameLayout12.addView(frameLayout10, kew.j(0, i8, this.k0.a(), 0, 0, 0, 0, 121, null));
                this.n0.m(i8);
            } else {
                ckf.y("shopHeaderContainer");
                throw null;
            }
        }
        this.j0.m(this.k0.a() + this.n0.a());
        this.j0.i(L());
        FrameLayout frameLayout13 = this.T;
        if (frameLayout13 != null) {
            kew.e(frameLayout13, this.j0.a());
            FrameLayout frameLayout14 = this.T;
            if (frameLayout14 != null) {
                kew.d0(frameLayout14, this.j0.c());
                ShopComponentModel shopComponentModel7 = m5.get("tb_shop_header_relation_2023");
                if (shopComponentModel7 == null) {
                    z = false;
                } else {
                    z = shopComponentModel7.canRenderDXTemplate();
                    Shop2023HeaderRelationTemplate shop2023HeaderRelationTemplate = new Shop2023HeaderRelationTemplate(shopComponentModel7);
                    this.I0 = shop2023HeaderRelationTemplate;
                    BaseContentComponent.e0(this, shop2023HeaderRelationTemplate, null, 2, null);
                    Shop2023HeaderRelationTemplate shop2023HeaderRelationTemplate2 = this.I0;
                    if (shop2023HeaderRelationTemplate2 != null) {
                        shop2023HeaderRelationTemplate2.G(new Default2023Shop$initTemplateComponent$6$1(this));
                    }
                    Shop2023HeaderRelationTemplate shop2023HeaderRelationTemplate3 = this.I0;
                    ckf.d(shop2023HeaderRelationTemplate3);
                    shop2023HeaderRelationTemplate3.k(n(), J(), I(), null);
                    this.p0.m(kew.Q(Integer.valueOf(shopComponentModel7.getRenderHeight())));
                    FrameLayout frameLayout15 = this.U;
                    if (frameLayout15 != null) {
                        Shop2023HeaderRelationTemplate shop2023HeaderRelationTemplate4 = this.I0;
                        ckf.d(shop2023HeaderRelationTemplate4);
                        frameLayout15.addView(shop2023HeaderRelationTemplate4.d(), kew.j(0, this.p0.a(), 0, 0, 0, 0, 0, 125, null));
                        xhv xhvVar10 = xhv.INSTANCE;
                    } else {
                        ckf.y("shopRelationContainer");
                        throw null;
                    }
                }
                ShopComponentModel shopComponentModel8 = m5.get("tb_shop_header_relation_2023_web");
                if (shopComponentModel8 != null) {
                    z = shopComponentModel8.getTargetUrl() != null;
                    if (z) {
                        ShopExtKt.Y(shopComponentModel8, n());
                    }
                    J().X2("shopRelationWebViewStart");
                    ShopWrapWebView shopWrapWebView = new ShopWrapWebView(n());
                    shopWrapWebView.setShopData(J());
                    this.R0 = shopWrapWebView;
                    kew.T(shopWrapWebView);
                    shopWrapWebView.setLoadFailedProcessor(new ix6(this, shopWrapWebView));
                    shopWrapWebView.render(ShopExtKt.f(shopComponentModel8.getTargetUrl(), n().getIntent()));
                    this.p0.m(kew.Q(Integer.valueOf(shopComponentModel8.getRenderHeight())));
                    FrameLayout frameLayout16 = this.U;
                    if (frameLayout16 != null) {
                        frameLayout16.addView(shopWrapWebView, kew.j(0, this.p0.a(), 0, 0, 0, 0, 0, 125, null));
                        JSONObject extData5 = shopComponentModel8.getExtData();
                        if (!(extData5 == null || (string = extData5.getString("loadingPic")) == null)) {
                            TUrlImageView tUrlImageView2 = new TUrlImageView(n());
                            tUrlImageView2.setImageUrl(string);
                            tUrlImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                            FrameLayout frameLayout17 = this.U;
                            if (frameLayout17 != null) {
                                kew.a(frameLayout17, tUrlImageView2);
                                shopWrapWebView.getShopFrameworkBizAdapter().b(tUrlImageView2);
                                xhv xhvVar11 = xhv.INSTANCE;
                            } else {
                                ckf.y("shopRelationContainer");
                                throw null;
                            }
                        }
                    } else {
                        ckf.y("shopRelationContainer");
                        throw null;
                    }
                }
                ShopComponentModel shopComponentModel9 = m5.get("tb_shop_header_activity_2023");
                if (shopComponentModel9 == null) {
                    z2 = false;
                } else {
                    this.J0 = new dnp(shopComponentModel9, z);
                    z2 = shopComponentModel9.canRenderDXTemplate();
                    BaseContentComponent.e0(this, this.J0, null, 2, null);
                    dnp dnpVar = this.J0;
                    ckf.d(dnpVar);
                    dnpVar.k(n(), J(), I(), null);
                    this.o0.m(kew.Q(Integer.valueOf(shopComponentModel9.getRenderHeight())));
                    this.o0.i(this.p0.a());
                    FrameLayout frameLayout18 = this.U;
                    if (frameLayout18 != null) {
                        dnp dnpVar2 = this.J0;
                        ckf.d(dnpVar2);
                        frameLayout18.addView(dnpVar2.d(), kew.j(0, this.o0.a(), this.o0.c(), 0, 0, 0, 0, 121, null));
                        xhv xhvVar12 = xhv.INSTANCE;
                    } else {
                        ckf.y("shopRelationContainer");
                        throw null;
                    }
                }
                this.q0.m(this.p0.a() + this.o0.a());
                if (v()) {
                    this.q0.i(this.D0);
                } else {
                    this.q0.i(L() + this.j0.a());
                }
                FrameLayout frameLayout19 = this.U;
                if (frameLayout19 != null) {
                    kew.e(frameLayout19, this.q0.a());
                    FrameLayout frameLayout20 = this.U;
                    if (frameLayout20 != null) {
                        kew.d0(frameLayout20, this.q0.c());
                        if (this.q0.a() == 0) {
                            this.B0 = true;
                            View view2 = this.a0;
                            if (view2 != null) {
                                view2.setBackgroundColor(0);
                            } else {
                                ckf.y("shopCenterGrayLine");
                                throw null;
                            }
                        }
                        if (m5.get("tb_shop_sub_tab_2023") != null) {
                            this.l0.m(J().O0().i());
                            Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent2 = new Shop2023TopNavBarNativeComponent(n(), J(), this.l0.a());
                            this.U0 = shop2023TopNavBarNativeComponent2;
                            inp inpVar8 = this.S0;
                            if (inpVar8 != null) {
                                inpVar8.S(shop2023TopNavBarNativeComponent2);
                            }
                            Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent3 = this.U0;
                            if (shop2023TopNavBarNativeComponent3 != null) {
                                shop2023TopNavBarNativeComponent3.t(z);
                            }
                            Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent4 = this.U0;
                            if (shop2023TopNavBarNativeComponent4 != null) {
                                shop2023TopNavBarNativeComponent4.s(z2);
                            }
                            EnhancedViewPager enhancedViewPager = this.M;
                            if (enhancedViewPager != null) {
                                enhancedViewPager.addOnPageChangeListener(this.U0);
                                Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent5 = this.U0;
                                if (shop2023TopNavBarNativeComponent5 != null) {
                                    shop2023TopNavBarNativeComponent5.u(new Default2023Shop$initTemplateComponent$9$1(this));
                                }
                                FrameLayout frameLayout21 = this.R;
                                if (frameLayout21 != null) {
                                    Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent6 = this.U0;
                                    ckf.d(shop2023TopNavBarNativeComponent6);
                                    frameLayout21.addView(shop2023TopNavBarNativeComponent6.g(), kew.j(0, this.l0.a(), 0, 0, 0, 0, 0, 125, null));
                                    xhv xhvVar13 = xhv.INSTANCE;
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
                            this.l0.i(this.D0 + this.q0.a());
                        } else {
                            this.l0.i(L() + this.j0.a() + this.q0.a());
                        }
                        this.l0.k(L() + this.k0.a() + this.n0.a());
                        FrameLayout frameLayout22 = this.R;
                        if (frameLayout22 != null) {
                            kew.e(frameLayout22, -2);
                            FrameLayout frameLayout23 = this.R;
                            if (frameLayout23 != null) {
                                kew.d0(frameLayout23, this.l0.c());
                                J().O0().s(this.l0.c());
                                ShopComponentModel shopComponentModel10 = m5.get("tb_shop_bottom_bar_2023");
                                if (shopComponentModel10 != null) {
                                    this.m0.h(kew.Q(Integer.valueOf(shopComponentModel10.getRenderHeight())));
                                    Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent = new Shop2023BottomBarNativeComponent(n(), J());
                                    this.T0 = shop2023BottomBarNativeComponent;
                                    lnp lnpVar3 = this.W0;
                                    if (lnpVar3 != null) {
                                        lnpVar3.h(shop2023BottomBarNativeComponent);
                                    }
                                    EnhancedViewPager enhancedViewPager2 = this.M;
                                    if (enhancedViewPager2 != null) {
                                        enhancedViewPager2.addOnPageChangeListener(this.T0);
                                        Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent2 = this.T0;
                                        if (shop2023BottomBarNativeComponent2 != null) {
                                            shop2023BottomBarNativeComponent2.A(new Default2023Shop$initTemplateComponent$10$1(this));
                                        }
                                        Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent3 = this.T0;
                                        if (shop2023BottomBarNativeComponent3 != null) {
                                            ViewGroup viewGroup = this.P;
                                            if (viewGroup != null) {
                                                shop2023BottomBarNativeComponent3.k(viewGroup, this.m0.a());
                                                xhv xhvVar14 = xhv.INSTANCE;
                                            } else {
                                                ckf.y("bottomBarContainer");
                                                throw null;
                                            }
                                        }
                                        ShopDataParser J = J();
                                        Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent4 = this.T0;
                                        if (shop2023BottomBarNativeComponent4 != null) {
                                            i6 = kew.O(Integer.valueOf(shop2023BottomBarNativeComponent4.n()));
                                        }
                                        J.w2(i6);
                                        xhv xhvVar15 = xhv.INSTANCE;
                                    } else {
                                        ckf.y("contentViewPager");
                                        throw null;
                                    }
                                }
                                if (v()) {
                                    if (J().O0().q()) {
                                        shopComponentModel = new ShopDataParser.e(J()).g();
                                    } else {
                                        shopComponentModel = J().O0().o();
                                    }
                                    if (shopComponentModel != null) {
                                        jnp jnpVar = new jnp(shopComponentModel, !J().O0().q(), false, 4, null);
                                        this.K0 = jnpVar;
                                        BaseContentComponent.e0(this, jnpVar, null, 2, null);
                                        jnp jnpVar2 = this.K0;
                                        ckf.d(jnpVar2);
                                        jnpVar2.k(n(), J(), I(), null);
                                        ViewGroup viewGroup2 = this.S;
                                        if (viewGroup2 != null) {
                                            jnp jnpVar3 = this.K0;
                                            ckf.d(jnpVar3);
                                            View d3 = jnpVar3.d();
                                            int Q = kew.Q(Integer.valueOf(shopComponentModel.getRenderHeight()));
                                            aop aopVar = this.E0;
                                            ckf.d(aopVar);
                                            viewGroup2.addView(d3, kew.j(0, Q, 0, aopVar.a(), 0, 0, 80, 53, null));
                                            EmbedShopLoftComponent embedShopLoftComponent = this.F0;
                                            if (!(embedShopLoftComponent == null || (v = embedShopLoftComponent.v()) == null || (f2 = v.f()) == null)) {
                                                f2.c(ShopNewLiveLoftView.a.class.getName(), new gx6(this));
                                                xhv xhvVar16 = xhv.INSTANCE;
                                            }
                                        } else {
                                            ckf.y("bigCardContainer");
                                            throw null;
                                        }
                                    }
                                }
                                int x2 = x2();
                                this.r0 = x2;
                                inp inpVar9 = this.S0;
                                if (inpVar9 != null) {
                                    inpVar9.J(x2);
                                }
                                inp inpVar10 = this.S0;
                                if (inpVar10 != null) {
                                    fnp fnpVar4 = this.H0;
                                    inpVar10.L(fnpVar4 == null ? null : fnpVar4.d());
                                }
                                if (z4 && (inpVar = this.S0) != null) {
                                    inpVar.L(frameLayout10);
                                }
                                inp inpVar11 = this.S0;
                                if (inpVar11 != null) {
                                    Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate6 = this.G0;
                                    inpVar11.R(shop2023HeaderInfoTemplate6 == null ? null : shop2023HeaderInfoTemplate6.d());
                                }
                                inp inpVar12 = this.S0;
                                if (inpVar12 != null) {
                                    inpVar12.P(this.q0.a());
                                }
                                inp inpVar13 = this.S0;
                                if (inpVar13 != null) {
                                    inpVar13.C();
                                    xhv xhvVar17 = xhv.INSTANCE;
                                }
                                this.v0 = u2();
                                ViewGroup viewGroup3 = this.P;
                                if (viewGroup3 != null) {
                                    kew.e(viewGroup3, this.m0.a());
                                    FrameLayout frameLayout24 = this.O;
                                    if (frameLayout24 != null) {
                                        kew.e(frameLayout24, ((r54.m(n()).heightPixels - this.k0.a()) - this.m0.a()) - L());
                                        J().B2(this.m0.a());
                                        J().C2(L() + this.k0.g());
                                        if (!z && !z2 && (shop2023TopNavBarNativeComponent = this.U0) != null) {
                                            shop2023TopNavBarNativeComponent.r(true);
                                            xhv xhvVar18 = xhv.INSTANCE;
                                        }
                                        i2();
                                        knp knpVar = this.X0;
                                        if (knpVar != null) {
                                            knpVar.a(J(), H());
                                            xhv xhvVar19 = xhv.INSTANCE;
                                            return;
                                        }
                                        return;
                                    }
                                    ckf.y("centerContainer");
                                    throw null;
                                }
                                ckf.y("bottomBarContainer");
                                throw null;
                            }
                            ckf.y("navViewContainer");
                            throw null;
                        }
                        ckf.y("navViewContainer");
                        throw null;
                    }
                    ckf.y("shopRelationContainer");
                    throw null;
                }
                ckf.y("shopRelationContainer");
                throw null;
            }
            ckf.y("shopHeaderContainer");
            throw null;
        }
        ckf.y("shopHeaderContainer");
        throw null;
    }

    public final void C2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        View K = kew.K(n(), R.layout.view_shop_2023_base_layout);
        if (K != null) {
            this.N = new ShopOptSwipeLayout(n());
            View findViewById = K.findViewById(R.id.shop_2023_search_bar_container);
            ckf.f(findViewById, "contentView.findViewById(R.id.shop_2023_search_bar_container)");
            FrameLayout frameLayout = (FrameLayout) findViewById;
            this.L = frameLayout;
            frameLayout.setPadding(0, L(), 0, 0);
            View findViewById2 = K.findViewById(R.id.shop_2023_content_part);
            ckf.f(findViewById2, "contentView.findViewById(R.id.shop_2023_content_part)");
            this.O = (FrameLayout) findViewById2;
            View findViewById3 = K.findViewById(R.id.shop_2023_big_card_part);
            ckf.f(findViewById3, "contentView.findViewById(R.id.shop_2023_big_card_part)");
            this.S = (ViewGroup) findViewById3;
            View findViewById4 = K.findViewById(R.id.shop_2023_index_nav_part);
            ckf.f(findViewById4, "contentView.findViewById(R.id.shop_2023_index_nav_part)");
            this.R = (FrameLayout) findViewById4;
            View findViewById5 = K.findViewById(R.id.shop_2023_top_header_part);
            ckf.f(findViewById5, "contentView.findViewById(R.id.shop_2023_top_header_part)");
            this.T = (FrameLayout) findViewById5;
            View findViewById6 = K.findViewById(R.id.shop_2023_background_img);
            ckf.f(findViewById6, "contentView.findViewById(R.id.shop_2023_background_img)");
            this.W = (TUrlImageView) findViewById6;
            View findViewById7 = K.findViewById(R.id.shop_2023_background_color_view_container);
            ckf.f(findViewById7, "contentView.findViewById(R.id.shop_2023_background_color_view_container)");
            this.X = findViewById7;
            View findViewById8 = K.findViewById(R.id.shop_2023_background_color_view);
            ckf.f(findViewById8, "contentView.findViewById(R.id.shop_2023_background_color_view)");
            this.Y = findViewById8;
            View findViewById9 = K.findViewById(R.id.shop_2023_background_color_view_2);
            ckf.f(findViewById9, "contentView.findViewById(R.id.shop_2023_background_color_view_2)");
            this.Z = findViewById9;
            View findViewById10 = K.findViewById(R.id.shop_2023_bottom_bar_part);
            ckf.f(findViewById10, "contentView.findViewById(R.id.shop_2023_bottom_bar_part)");
            this.P = (ViewGroup) findViewById10;
            View findViewById11 = K.findViewById(R.id.shop_2023_bottom_bar_part_bg);
            ckf.f(findViewById11, "contentView.findViewById(R.id.shop_2023_bottom_bar_part_bg)");
            this.Q = findViewById11;
            View findViewById12 = K.findViewById(R.id.shop_2023_relation_part);
            ckf.f(findViewById12, "contentView.findViewById(R.id.shop_2023_relation_part)");
            this.U = (FrameLayout) findViewById12;
            View findViewById13 = K.findViewById(R.id.shop_2023_center_gray_line);
            ckf.f(findViewById13, "contentView.findViewById(R.id.shop_2023_center_gray_line)");
            this.a0 = findViewById13;
            kew.B(findViewById13);
            EnhancedViewPager enhancedViewPager = new EnhancedViewPager(n());
            enhancedViewPager.setId(R.id.new_shop_view_view_pager);
            r1k r1kVar = new r1k(J());
            this.M = enhancedViewPager;
            FrameLayout frameLayout2 = this.R;
            if (frameLayout2 != null) {
                frameLayout2.setZ(0.1f);
                kew.T(enhancedViewPager);
                EnhancedViewPager enhancedViewPager2 = this.M;
                if (enhancedViewPager2 != null) {
                    enhancedViewPager2.setOffscreenPageLimit(r1kVar.getCount() - 1);
                    FragmentManager supportFragmentManager = n().getSupportFragmentManager();
                    ckf.f(supportFragmentManager, "context.supportFragmentManager");
                    ShopContainerPageAdapter shopContainerPageAdapter = new ShopContainerPageAdapter(supportFragmentManager);
                    this.V = shopContainerPageAdapter;
                    shopContainerPageAdapter.k(r1kVar);
                    ShopContainerPageAdapter shopContainerPageAdapter2 = this.V;
                    if (shopContainerPageAdapter2 != null) {
                        enhancedViewPager.setAdapter(shopContainerPageAdapter2);
                        enhancedViewPager.addOnPageChangeListener(this);
                        FrameLayout frameLayout3 = this.O;
                        if (frameLayout3 != null) {
                            kew.a(frameLayout3, enhancedViewPager);
                            ShopOptSwipeLayout shopOptSwipeLayout = this.N;
                            if (shopOptSwipeLayout != null) {
                                shopOptSwipeLayout.setSwipeListener(this);
                                ShopOptSwipeLayout shopOptSwipeLayout2 = this.N;
                                if (shopOptSwipeLayout2 != null) {
                                    kew.a(shopOptSwipeLayout2, K);
                                    ShopOptSwipeLayout shopOptSwipeLayout3 = this.N;
                                    if (shopOptSwipeLayout3 != null) {
                                        shopOptSwipeLayout3.setExpandedStatusGetter(new Default2023Shop$initView$1(this));
                                        FrameLayout H = H();
                                        ShopOptSwipeLayout shopOptSwipeLayout4 = this.N;
                                        if (shopOptSwipeLayout4 != null) {
                                            kew.a(H, shopOptSwipeLayout4);
                                            znp c2 = J().O0().c();
                                            String b2 = c2.b();
                                            if (b2 != null) {
                                                TUrlImageView tUrlImageView = this.W;
                                                if (tUrlImageView != null) {
                                                    tUrlImageView.setImageUrl(b2);
                                                    TUrlImageView tUrlImageView2 = this.W;
                                                    if (tUrlImageView2 != null) {
                                                        tUrlImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                                        TUrlImageView tUrlImageView3 = this.W;
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
                                                aop l = J().O0().l();
                                                this.E0 = l;
                                                this.D0 = l.b() - l.a();
                                                this.s0 = l.a();
                                                ViewGroup viewGroup = this.S;
                                                if (viewGroup != null) {
                                                    kew.e(viewGroup, l.b());
                                                    if (J().O0().r()) {
                                                        EmbedShopLoftComponent embedShopLoftComponent = new EmbedShopLoftComponent(n(), J(), I());
                                                        if (J().O0().q()) {
                                                            J().P2(true);
                                                            embedShopLoftComponent.v().r(true);
                                                        }
                                                        embedShopLoftComponent.J(new Default2023Shop$initView$3(this));
                                                        ViewGroup viewGroup2 = this.S;
                                                        if (viewGroup2 != null) {
                                                            kew.a(viewGroup2, embedShopLoftComponent.x());
                                                            embedShopLoftComponent.z();
                                                            this.F0 = embedShopLoftComponent;
                                                            if (!J().O0().q()) {
                                                                View view = new View(n());
                                                                kew.S(view, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, ic1.h0(new Integer[]{0, Integer.valueOf(Color.parseColor("#df000000"))})));
                                                                ViewGroup viewGroup3 = this.S;
                                                                if (viewGroup3 != null) {
                                                                    viewGroup3.addView(view, kew.j(0, kew.P(152), 0, 0, 0, 0, 48, 61, null));
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
                                                    View view2 = new View(n());
                                                    kew.S(view2, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, ic1.h0(new Integer[]{0, Integer.valueOf(Color.parseColor("#7f000000")), 0})));
                                                    ViewGroup viewGroup4 = this.S;
                                                    if (viewGroup4 != null) {
                                                        viewGroup4.addView(view2, kew.j(0, kew.P(194), 0, l.a() - kew.P(90), 0, 0, 80, 53, null));
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

    public final void F2(int i2) {
        int L;
        int z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd328a", new Object[]{this, new Integer(i2)});
            return;
        }
        inp inpVar = this.S0;
        if (inpVar != null) {
            inpVar.k(this.t0, i2);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float f2 = i2;
        FrameLayout frameLayout = this.R;
        if (frameLayout != null) {
            Animator i3 = bdw.i(frameLayout, f2, 0L, null, linearInterpolator, 6, null);
            LinearInterpolator linearInterpolator2 = new LinearInterpolator();
            if (i2 > 0) {
                L = this.q0.c();
                FrameLayout frameLayout2 = this.U;
                if (frameLayout2 != null) {
                    z = kew.z(frameLayout2);
                } else {
                    ckf.y("shopRelationContainer");
                    throw null;
                }
            } else {
                L = L() + this.k0.a();
                FrameLayout frameLayout3 = this.U;
                if (frameLayout3 != null) {
                    z = kew.z(frameLayout3);
                } else {
                    ckf.y("shopRelationContainer");
                    throw null;
                }
            }
            float f3 = L - z;
            FrameLayout frameLayout4 = this.U;
            if (frameLayout4 != null) {
                Animator i4 = bdw.i(frameLayout4, f3, 0L, null, linearInterpolator2, 6, null);
                i4.addListener(new f());
                xhv xhvVar = xhv.INSTANCE;
                animatorSet.playTogether(i3, i4);
                animatorSet.addListener(new a(this));
                animatorSet.start();
                return;
            }
            ckf.y("shopRelationContainer");
            throw null;
        }
        ckf.y("navViewContainer");
        throw null;
    }

    public final void P2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d500b0f", new Object[]{this, new Boolean(z)});
            return;
        }
        npp.Companion.b("start tab3 animation");
        ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            int height = viewGroup.getHeight() / 2;
            i0(true);
            View view = this.Q;
            if (view != null) {
                kew.g0(view);
                AnimatorSet animatorSet = new AnimatorSet();
                FrameLayout frameLayout = this.O;
                if (frameLayout != null) {
                    Integer valueOf = Integer.valueOf(frameLayout.getWidth() / 2);
                    ViewGroup viewGroup2 = this.P;
                    if (viewGroup2 != null) {
                        int top = viewGroup2.getTop();
                        FrameLayout frameLayout2 = this.O;
                        if (frameLayout2 != null) {
                            Animator d2 = bdw.d(frameLayout, valueOf, Integer.valueOf((top - frameLayout2.getTop()) + height));
                            FrameLayout frameLayout3 = this.R;
                            if (frameLayout3 != null) {
                                Integer valueOf2 = Integer.valueOf(frameLayout3.getWidth() / 2);
                                ViewGroup viewGroup3 = this.P;
                                if (viewGroup3 != null) {
                                    int top2 = viewGroup3.getTop();
                                    FrameLayout frameLayout4 = this.R;
                                    if (frameLayout4 != null) {
                                        Animator d3 = bdw.d(frameLayout3, valueOf2, Integer.valueOf((top2 - frameLayout4.getTop()) + height));
                                        FrameLayout frameLayout5 = this.U;
                                        if (frameLayout5 != null) {
                                            Integer valueOf3 = Integer.valueOf(frameLayout5.getWidth() / 2);
                                            ViewGroup viewGroup4 = this.P;
                                            if (viewGroup4 != null) {
                                                int top3 = viewGroup4.getTop();
                                                FrameLayout frameLayout6 = this.U;
                                                if (frameLayout6 != null) {
                                                    Animator d4 = bdw.d(frameLayout5, valueOf3, Integer.valueOf((top3 - frameLayout6.getTop()) + height));
                                                    View view2 = this.Q;
                                                    if (view2 != null) {
                                                        animatorSet.playTogether(d2, d3, d4, bdw.c(view2, 0.0f, 0L, null, 6, null));
                                                        animatorSet.addListener(new j());
                                                        animatorSet.addListener(new a(this));
                                                        animatorSet.start();
                                                        Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent = this.T0;
                                                        if (shop2023BottomBarNativeComponent != null) {
                                                            shop2023BottomBarNativeComponent.D(2);
                                                        }
                                                        if (z) {
                                                            ShopExtKt.l(J());
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    ckf.y("bottomBarContainerBG");
                                                    throw null;
                                                }
                                                ckf.y("shopRelationContainer");
                                                throw null;
                                            }
                                            ckf.y("bottomBarContainer");
                                            throw null;
                                        }
                                        ckf.y("shopRelationContainer");
                                        throw null;
                                    }
                                    ckf.y("navViewContainer");
                                    throw null;
                                }
                                ckf.y("bottomBarContainer");
                                throw null;
                            }
                            ckf.y("navViewContainer");
                            throw null;
                        }
                        ckf.y("centerContainer");
                        throw null;
                    }
                    ckf.y("bottomBarContainer");
                    throw null;
                }
                ckf.y("centerContainer");
                throw null;
            }
            ckf.y("bottomBarContainerBG");
            throw null;
        }
        ckf.y("bottomBarContainer");
        throw null;
    }

    public final void p2(boolean z, int i2, int i3) {
        FrameLayout frameLayout;
        View d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("893b3eb4", new Object[]{this, new Boolean(z), new Integer(i2), new Integer(i3)});
            return;
        }
        npp.Companion.b(ckf.p("changeToHomePage : lastTabFullScreen : ", Boolean.valueOf(z)));
        Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate = this.G0;
        if (!(shop2023HeaderInfoTemplate == null || (d2 = shop2023HeaderInfoTemplate.d()) == null)) {
            kew.g0(d2);
        }
        int x2 = x2();
        this.r0 = x2;
        inp inpVar = this.S0;
        if (inpVar != null) {
            inpVar.J(x2);
        }
        FrameLayout frameLayout2 = this.U;
        if (frameLayout2 != null) {
            kew.g0(frameLayout2);
            if (this.e0) {
                S0(true);
                inp inpVar2 = this.S0;
                if (inpVar2 != null) {
                    inpVar2.m(true);
                }
                this.e0 = false;
                this.t0 = 0;
                this.u0 = 0;
                dop dopVar = this.l0;
                dopVar.h(dopVar.e());
                FrameLayout frameLayout3 = this.U;
                if (frameLayout3 != null) {
                    frameLayout3.setAlpha(1.0f);
                    View v2 = v2();
                    if (v2 != null) {
                        v2.setAlpha(1.0f);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    FrameLayout frameLayout4 = this.R;
                    if (frameLayout4 != null) {
                        float c2 = this.l0.c();
                        if (this.R != null) {
                            Animator i4 = bdw.i(frameLayout4, c2 - kew.z(frameLayout), 0L, null, null, 14, null);
                            FrameLayout frameLayout5 = this.U;
                            if (frameLayout5 != null) {
                                animatorSet.playTogether(i4, bdw.c(frameLayout5, 1.0f, 0L, null, 6, null));
                                animatorSet.addListener(new c());
                                animatorSet.start();
                                if (v()) {
                                    Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate2 = this.G0;
                                    if (shop2023HeaderInfoTemplate2 != null) {
                                        shop2023HeaderInfoTemplate2.M(Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED);
                                    }
                                } else {
                                    Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate3 = this.G0;
                                    if (shop2023HeaderInfoTemplate3 != null) {
                                        shop2023HeaderInfoTemplate3.M(Shop2023HeaderInfoTemplate.HeaderStyle.DEFAULT);
                                    }
                                }
                                n2(false);
                            } else {
                                ckf.y("shopRelationContainer");
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
                    ckf.y("shopRelationContainer");
                    throw null;
                }
            } else {
                S0(false);
                inp inpVar3 = this.S0;
                if (inpVar3 != null) {
                    inpVar3.m(false);
                }
                int i5 = this.r0;
                this.t0 = i5;
                this.u0 = 0 - i5;
                FrameLayout frameLayout6 = this.R;
                if (frameLayout6 != null) {
                    kew.d0(frameLayout6, this.k0.g() + L());
                    Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate4 = this.G0;
                    if (shop2023HeaderInfoTemplate4 != null) {
                        shop2023HeaderInfoTemplate4.M(Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED);
                    }
                    if (v() && spp.c(J().S(i2, i3))) {
                        ShopExtKt.k0(J(), null, 2, null);
                    }
                } else {
                    ckf.y("navViewContainer");
                    throw null;
                }
            }
            if (z) {
                FrameLayout frameLayout7 = this.T;
                if (frameLayout7 != null) {
                    frameLayout7.setZ(0.0f);
                    FrameLayout frameLayout8 = this.R;
                    if (frameLayout8 != null) {
                        frameLayout8.setZ(0.1f);
                    } else {
                        ckf.y("navViewContainer");
                        throw null;
                    }
                } else {
                    ckf.y("shopHeaderContainer");
                    throw null;
                }
            }
            View v22 = v2();
            if (v22 != null) {
                kew.g0(v22);
            }
            this.C0 = false;
            if (v()) {
                View v23 = v2();
                if (v23 != null) {
                    kew.C(v23);
                }
                if (r()) {
                    M2();
                    return;
                }
                return;
            }
            return;
        }
        ckf.y("shopRelationContainer");
        throw null;
    }
}
