package com.alibaba.triver.triver_shop.newShop.view.component.nativeview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.ShopMoreUtils;
import com.alibaba.triver.triver_shop.extension.dianmicX.AutoScrollTextView;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionLinearLayout;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.android.nav.Nav;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import kotlin.collections.a;
import kotlin.jvm.internal.Lambda;
import tb.a07;
import tb.a1v;
import tb.brf;
import tb.brp;
import tb.c7z;
import tb.ckf;
import tb.d1a;
import tb.d7z;
import tb.g1a;
import tb.gnp;
import tb.jpu;
import tb.kew;
import tb.khu;
import tb.npp;
import tb.r54;
import tb.t2o;
import tb.wsq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2025HeaderNativeComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final int N0 = 1;
    public static final int O0 = 2;
    public static final int P0 = 3;
    public String A;
    public g1a<? super Integer, xhv> A0;
    public String B;
    public View B0;
    public String C;
    public String D;
    public String E;
    public ViewGroup F;
    public int F0;
    public ViewGroup G;
    public ViewGroup H;
    public d1a<xhv> H0;
    public FrameLayout I;
    public long I0;
    public FrameLayout J;
    public int J0;
    public TextView K;
    public TextView L;
    public int L0;
    public TUrlImageView M;
    public boolean M0;
    public TUrlImageView N;
    public TUrlImageView O;
    public TUrlImageView P;
    public TUrlImageView Q;
    public String Q0;
    public TUrlImageView R;
    public ShopDXEngine R0;
    public TUrlImageView S;
    public String S0;
    public View T;
    public String T0;
    public String U0;
    public Animator.AnimatorListener V;
    public int W;
    public int W0;
    public View X0;
    public int Y0;
    public View Z0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3218a;
    public int a1;
    public ValueAnimator b;
    public TUrlImageView c;
    public int c0;
    public View d;
    public String e;
    public LinearLayout f;
    public String g;
    public FrameLayout h;
    public LinearLayout i;
    public TextView j;
    public TUrlImageView k;
    public TUrlImageView l;
    public TextView m;
    public TUrlImageView n;
    public TUrlImageView o;
    public LinearLayout p;
    public FrameLayout q;
    public ShopDataParser r;
    public String s;
    public String t;
    public String u;
    public String v;
    public JSONArray v0;
    public String w;
    public View w0;
    public String x;
    public View x0;
    public String y;
    public boolean y0;
    public String z;
    public g1a<? super Integer, xhv> z0;
    public final long U = 100;
    public boolean V0 = true;
    public final int X = kew.v(88);
    public final int Y = kew.v(112);
    public int Z = kew.v(200);
    public final int a0 = kew.v(74);
    public int b0 = kew.v(900);
    public final String d0 = "https://img.alicdn.com/imgextra/i4/O1CN01AoieOd1YarKEpT3lD_!!6000000003076-2-tps-60-60.png";
    public final String e0 = "https://img.alicdn.com/imgextra/i1/O1CN01orPion1EpFS9EgHZX_!!6000000000400-2-tps-60-60.png";
    public final String f0 = "https://img.alicdn.com/imgextra/i4/O1CN01UZCshu1byciwn6iVo_!!6000000003534-2-tps-60-60.png";
    public final String g0 = "https://img.alicdn.com/imgextra/i3/O1CN01LPT7C11qrUnPhldLh_!!6000000005549-2-tps-60-60.png";
    public final String h0 = "https://img.alicdn.com/imgextra/i2/O1CN017LoGP51e7RaCPwN0O_!!6000000003824-2-tps-60-60.png";
    public final String i0 = "https://img.alicdn.com/imgextra/i3/O1CN01A4IHBM1chVXQrdLya_!!6000000003632-2-tps-60-60.png";
    public final String j0 = "https://img.alicdn.com/imgextra/i4/O1CN01WnI87N1gWIDsY86x3_!!6000000004149-54-tps-64-64.apng";
    public final String k0 = "https://gw.alicdn.com/imgextra/i1/O1CN01cyctA126BqeWWansE_!!6000000007624-54-tps-200-200.apng";
    public final String l0 = "https://img.alicdn.com/imgextra/i3/O1CN01m8QCaN1WJKxVPDDXH_!!6000000002767-2-tps-1500-180.png";
    public final String m0 = "https://img.alicdn.com/imgextra/i4/O1CN01lN08sY28KfVjyIM4O_!!6000000007914-2-tps-1500-180.png";
    public final int n0 = -15656659;
    public final int o0 = kew.c(1120557, 0.6f);
    public final int p0 = -11509638;
    public final int q0 = -1;
    public final int r0 = kew.c(16777215, 0.8f);
    public final int s0 = kew.c(16777215, 0.1f);
    public final int t0 = kew.c(14672615, 1.0f);
    public final int u0 = kew.c(13291479, 0.3f);
    public final Drawable C0 = kew.u(-788744, null, null, kew.v(12), 0, 0, 0, 0, 0, 0, 1014, null);
    public final Drawable D0 = kew.u(kew.c(3355443, 0.4f), null, null, kew.v(12), 0, 0, 0, 0, 0, 0, 1014, null);
    public final Drawable E0 = kew.u(-1, null, null, 0, kew.v(30), kew.v(30), 0, 0, 0, 0, 974, null);
    public final Handler G0 = new Handler();
    public final int K0 = 2;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766509983);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("94b074df", new Object[]{this})).intValue();
            }
            return Shop2025HeaderNativeComponent.k();
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d286946d", new Object[]{this})).intValue();
            }
            return Shop2025HeaderNativeComponent.l();
        }

        public final int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4b57593e", new Object[]{this})).intValue();
            }
            return Shop2025HeaderNativeComponent.m();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUrlImageView f3219a;
        public final /* synthetic */ Shop2025HeaderNativeComponent b;

        public b(TUrlImageView tUrlImageView, Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
            this.f3219a = tUrlImageView;
            this.b = shop2025HeaderNativeComponent;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else if (i3 - i > 0) {
                this.f3219a.removeOnLayoutChangeListener(this);
                Shop2025HeaderNativeComponent.H(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public c(boolean z) {
            this.b = z;
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
                Shop2025HeaderNativeComponent.this.t0(this.b, ((Integer) animatedValue).intValue(), false);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public d(boolean z) {
            this.b = z;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/Shop2025HeaderNativeComponent$animateDown$1$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            Shop2025HeaderNativeComponent.A(Shop2025HeaderNativeComponent.this, Shop2025HeaderNativeComponent.Companion.b());
            if (this.b) {
                kew.h0(Shop2025HeaderNativeComponent.this.g0());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/Shop2025HeaderNativeComponent$animateToMid$1$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                Shop2025HeaderNativeComponent.A(Shop2025HeaderNativeComponent.this, Shop2025HeaderNativeComponent.Companion.c());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
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
                Shop2025HeaderNativeComponent.this.v0(((Integer) animatedValue).intValue(), false);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class h extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d1a<xhv> f3225a;

        public h(d1a<xhv> d1aVar) {
            this.f3225a = d1aVar;
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/Shop2025HeaderNativeComponent$animateUp$1$3");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                this.f3225a.invoke();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class o implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            LinearLayout i = Shop2025HeaderNativeComponent.i(Shop2025HeaderNativeComponent.this);
            if (i != null) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    i.scrollTo(0, ((Integer) animatedValue).intValue());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            ckf.y("llSearchWord");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class p extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public p() {
        }

        public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/Shop2025HeaderNativeComponent$scrollSearchWord$1$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                Shop2025HeaderNativeComponent.c(Shop2025HeaderNativeComponent.this).post(new a(Shop2025HeaderNativeComponent.this));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Shop2025HeaderNativeComponent f3235a;

            public a(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
                this.f3235a = shop2025HeaderNativeComponent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LinearLayout i = Shop2025HeaderNativeComponent.i(this.f3235a);
                String str = null;
                if (i != null) {
                    i.scrollTo(0, 0);
                    Shop2025HeaderNativeComponent shop2025HeaderNativeComponent = this.f3235a;
                    Shop2025HeaderNativeComponent.G(shop2025HeaderNativeComponent, Shop2025HeaderNativeComponent.u(shop2025HeaderNativeComponent) + 1);
                    int u = Shop2025HeaderNativeComponent.u(shop2025HeaderNativeComponent);
                    JSONArray q = Shop2025HeaderNativeComponent.q(this.f3235a);
                    ckf.d(q);
                    Shop2025HeaderNativeComponent.G(shop2025HeaderNativeComponent, u % q.size());
                    JSONArray q2 = Shop2025HeaderNativeComponent.q(this.f3235a);
                    ckf.d(q2);
                    Object obj = q2.get(Shop2025HeaderNativeComponent.u(this.f3235a));
                    JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
                    if (jSONObject != null) {
                        Shop2025HeaderNativeComponent shop2025HeaderNativeComponent2 = this.f3235a;
                        Shop2025HeaderNativeComponent.F(shop2025HeaderNativeComponent2, jSONObject.getString("displayText"));
                        Shop2025HeaderNativeComponent.E(shop2025HeaderNativeComponent2, jSONObject.getString("icon"));
                        Shop2025HeaderNativeComponent.C(shop2025HeaderNativeComponent2, jSONObject.getString("displayPicUrl"));
                        Shop2025HeaderNativeComponent.z(shop2025HeaderNativeComponent2, jSONObject.getString("benefitType"));
                        Shop2025HeaderNativeComponent.B(shop2025HeaderNativeComponent2, jSONObject.getString("sapUrl"));
                        Shop2025HeaderNativeComponent.D(shop2025HeaderNativeComponent2, jSONObject.getString("srpUrl"));
                    }
                    TUrlImageView g = Shop2025HeaderNativeComponent.g(this.f3235a);
                    if (g != null) {
                        g.setImageUrl(Shop2025HeaderNativeComponent.s(this.f3235a));
                    }
                    String p = Shop2025HeaderNativeComponent.p(this.f3235a);
                    if (p == null || wsq.a0(p)) {
                        TextView w = Shop2025HeaderNativeComponent.w(this.f3235a);
                        if (w != null) {
                            w.setText(Shop2025HeaderNativeComponent.t(this.f3235a));
                        }
                        TextView w2 = Shop2025HeaderNativeComponent.w(this.f3235a);
                        if (w2 != null) {
                            w2.setVisibility(0);
                        }
                        TUrlImageView g2 = Shop2025HeaderNativeComponent.g(this.f3235a);
                        if (g2 != null) {
                            g2.setVisibility(0);
                        }
                        TUrlImageView e = Shop2025HeaderNativeComponent.e(this.f3235a);
                        if (e != null) {
                            e.setVisibility(8);
                        }
                    } else {
                        TUrlImageView e2 = Shop2025HeaderNativeComponent.e(this.f3235a);
                        if (e2 != null) {
                            e2.setImageUrl(Shop2025HeaderNativeComponent.p(this.f3235a));
                        }
                        TextView w3 = Shop2025HeaderNativeComponent.w(this.f3235a);
                        if (w3 != null) {
                            w3.setVisibility(8);
                        }
                        TUrlImageView g3 = Shop2025HeaderNativeComponent.g(this.f3235a);
                        if (g3 != null) {
                            g3.setVisibility(8);
                        }
                        TUrlImageView e3 = Shop2025HeaderNativeComponent.e(this.f3235a);
                        if (e3 != null) {
                            e3.setVisibility(0);
                        }
                    }
                    JSONArray q3 = Shop2025HeaderNativeComponent.q(this.f3235a);
                    ckf.d(q3);
                    int u2 = (Shop2025HeaderNativeComponent.u(this.f3235a) + 1) % q3.size();
                    JSONArray q4 = Shop2025HeaderNativeComponent.q(this.f3235a);
                    ckf.d(q4);
                    Object obj2 = q4.get(u2);
                    JSONObject jSONObject2 = obj2 instanceof JSONObject ? (JSONObject) obj2 : null;
                    TUrlImageView h = Shop2025HeaderNativeComponent.h(this.f3235a);
                    if (h != null) {
                        h.setImageUrl(jSONObject2 == null ? null : jSONObject2.getString("icon"));
                    }
                    String string = jSONObject2 == null ? null : jSONObject2.getString("displayPicUrl");
                    if (string == null || wsq.a0(string)) {
                        TextView x = Shop2025HeaderNativeComponent.x(this.f3235a);
                        if (x != null) {
                            if (jSONObject2 != null) {
                                str = jSONObject2.getString("displayText");
                            }
                            x.setText(str);
                        }
                        TextView x2 = Shop2025HeaderNativeComponent.x(this.f3235a);
                        if (x2 != null) {
                            x2.setVisibility(0);
                        }
                        TUrlImageView h2 = Shop2025HeaderNativeComponent.h(this.f3235a);
                        if (h2 != null) {
                            h2.setVisibility(0);
                        }
                        TUrlImageView f = Shop2025HeaderNativeComponent.f(this.f3235a);
                        if (f != null) {
                            f.setVisibility(8);
                        }
                    } else {
                        TUrlImageView f2 = Shop2025HeaderNativeComponent.f(this.f3235a);
                        if (f2 != null) {
                            if (jSONObject2 != null) {
                                str = jSONObject2.getString("displayPicUrl");
                            }
                            f2.setImageUrl(str);
                        }
                        TextView x3 = Shop2025HeaderNativeComponent.x(this.f3235a);
                        if (x3 != null) {
                            x3.setVisibility(8);
                        }
                        TUrlImageView h3 = Shop2025HeaderNativeComponent.h(this.f3235a);
                        if (h3 != null) {
                            h3.setVisibility(8);
                        }
                        TUrlImageView f3 = Shop2025HeaderNativeComponent.f(this.f3235a);
                        if (f3 != null) {
                            f3.setVisibility(0);
                        }
                    }
                    Shop2025HeaderNativeComponent.H(this.f3235a);
                    return;
                }
                ckf.y("llSearchWord");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class q implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public q() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Shop2025HeaderNativeComponent.y(Shop2025HeaderNativeComponent.this);
            Shop2025HeaderNativeComponent.I(Shop2025HeaderNativeComponent.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class r implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public r() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                khu.h(Shop2025HeaderNativeComponent.this.a0(), Shop2025HeaderNativeComponent.d(Shop2025HeaderNativeComponent.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class s implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public s() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                khu.h(Shop2025HeaderNativeComponent.this.a0(), Shop2025HeaderNativeComponent.d(Shop2025HeaderNativeComponent.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class t implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public t() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Shop2025HeaderNativeComponent.H(Shop2025HeaderNativeComponent.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class u {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f3240a;
        public float b;

        static {
            t2o.a(766509984);
        }

        public final float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4703e214", new Object[]{this})).floatValue();
            }
            return this.b;
        }

        public final float b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc48d087", new Object[]{this})).floatValue();
            }
            return this.f3240a;
        }

        public final void c(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2fde3d90", new Object[]{this, new Float(f)});
            } else {
                this.b = f;
            }
        }

        public final void d(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("baf5f815", new Object[]{this, new Float(f)});
            } else {
                this.f3240a = f;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class v implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public v() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Shop2025HeaderNativeComponent.H(Shop2025HeaderNativeComponent.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class w implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public w() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                Shop2025HeaderNativeComponent.a(Shop2025HeaderNativeComponent.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class x implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public x() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            TUrlImageView g0 = Shop2025HeaderNativeComponent.this.g0();
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                g0.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    static {
        t2o.a(766509982);
    }

    public static final /* synthetic */ void A(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb9ba24", new Object[]{shop2025HeaderNativeComponent, new Integer(i)});
        } else {
            shop2025HeaderNativeComponent.z0(i);
        }
    }

    public static final /* synthetic */ void B(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eeb40a1", new Object[]{shop2025HeaderNativeComponent, str});
        } else {
            shop2025HeaderNativeComponent.D = str;
        }
    }

    public static final /* synthetic */ void C(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505de73", new Object[]{shop2025HeaderNativeComponent, str});
        } else {
            shop2025HeaderNativeComponent.A = str;
        }
    }

    public static final /* synthetic */ void D(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f9d52a", new Object[]{shop2025HeaderNativeComponent, str});
        } else {
            shop2025HeaderNativeComponent.E = str;
        }
    }

    public static final /* synthetic */ void E(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("747b6b33", new Object[]{shop2025HeaderNativeComponent, str});
        } else {
            shop2025HeaderNativeComponent.z = str;
        }
    }

    public static final /* synthetic */ void F(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("581ca6f6", new Object[]{shop2025HeaderNativeComponent, str});
        } else {
            shop2025HeaderNativeComponent.y = str;
        }
    }

    public static final /* synthetic */ void G(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97c330d", new Object[]{shop2025HeaderNativeComponent, new Integer(i)});
        } else {
            shop2025HeaderNativeComponent.F0 = i;
        }
    }

    public static final /* synthetic */ void H(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb6addd", new Object[]{shop2025HeaderNativeComponent});
        } else {
            shop2025HeaderNativeComponent.P0();
        }
    }

    public static final /* synthetic */ void I(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0be3ec", new Object[]{shop2025HeaderNativeComponent});
        } else {
            shop2025HeaderNativeComponent.Q0();
        }
    }

    public static /* synthetic */ Triple K(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, LinearLayout linearLayout, String str, String str2, String str3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Triple) ipChange.ipc$dispatch("93e41ea4", new Object[]{shop2025HeaderNativeComponent, linearLayout, str, str2, str3, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return shop2025HeaderNativeComponent.J(linearLayout, str, str2, str3);
    }

    public static /* synthetic */ void M(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, boolean z, long j, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a0e10a3", new Object[]{shop2025HeaderNativeComponent, new Boolean(z), new Long(j), new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            j = shop2025HeaderNativeComponent.U;
        }
        shop2025HeaderNativeComponent.L(z, j);
    }

    public static /* synthetic */ void P(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, long j, d1a d1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4249f0d9", new Object[]{shop2025HeaderNativeComponent, new Long(j), d1aVar, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            j = shop2025HeaderNativeComponent.U;
        }
        if ((i & 2) != 0) {
            d1aVar = null;
        }
        shop2025HeaderNativeComponent.O(j, d1aVar);
    }

    public static /* synthetic */ void V(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, long j, d1a d1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83cf7e", new Object[]{shop2025HeaderNativeComponent, new Long(j), d1aVar, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            j = shop2025HeaderNativeComponent.U;
        }
        if ((i & 2) != 0) {
            d1aVar = null;
        }
        shop2025HeaderNativeComponent.U(j, d1aVar);
    }

    public static /* synthetic */ boolean X(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, Integer num, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48e75a85", new Object[]{shop2025HeaderNativeComponent, num, new Integer(i), obj})).booleanValue();
        }
        if ((i & 1) != 0) {
            num = null;
        }
        return shop2025HeaderNativeComponent.W(num);
    }

    public static /* synthetic */ boolean Z(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, Integer num, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f3ea437", new Object[]{shop2025HeaderNativeComponent, num, new Integer(i), obj})).booleanValue();
        }
        if ((i & 1) != 0) {
            num = null;
        }
        return shop2025HeaderNativeComponent.Y(num);
    }

    public static /* synthetic */ void Z0(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, String str, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f631669", new Object[]{shop2025HeaderNativeComponent, str, map, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            map = null;
        }
        shop2025HeaderNativeComponent.Y0(str, map);
    }

    public static final /* synthetic */ void a(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a015ec09", new Object[]{shop2025HeaderNativeComponent});
        } else {
            shop2025HeaderNativeComponent.R();
        }
    }

    public static final /* synthetic */ String b(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb48232d", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.B;
    }

    public static final /* synthetic */ Handler c(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("cf9ed85a", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.G0;
    }

    public static final /* synthetic */ String d(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1330e4f", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.g;
    }

    public static final /* synthetic */ TUrlImageView e(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("714d9ab4", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.l;
    }

    public static final /* synthetic */ TUrlImageView f(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("f39b8e22", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.o;
    }

    public static final /* synthetic */ TUrlImageView g(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("92de4234", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.k;
    }

    public static final /* synthetic */ TUrlImageView h(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("41fd6a2", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.n;
    }

    public static final /* synthetic */ LinearLayout i(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("55ed897", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.i;
    }

    public static final /* synthetic */ LinearLayout j(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("79381d89", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.p;
    }

    public static final /* synthetic */ int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbe7b846", new Object[0])).intValue();
        }
        return N0;
    }

    public static final /* synthetic */ int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4a9c5f8", new Object[0])).intValue();
        }
        return P0;
    }

    public static final /* synthetic */ int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1723ed07", new Object[0])).intValue();
        }
        return O0;
    }

    public static final /* synthetic */ String n(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6031b2dd", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.D;
    }

    public static final /* synthetic */ String o(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cac71f2c", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.C;
    }

    public static final /* synthetic */ String p(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c32f2ccb", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.A;
    }

    public static final /* synthetic */ JSONArray q(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("63647ced", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.v0;
    }

    public static final /* synthetic */ String r(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9529e934", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.E;
    }

    public static /* synthetic */ boolean r0(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, Integer num, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9105c671", new Object[]{shop2025HeaderNativeComponent, num, new Integer(i), obj})).booleanValue();
        }
        if ((i & 1) != 0) {
            num = null;
        }
        return shop2025HeaderNativeComponent.q0(num);
    }

    public static final /* synthetic */ String s(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c14df50b", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.z;
    }

    public static final /* synthetic */ String t(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a5ded80", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.y;
    }

    public static final /* synthetic */ int u(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa28d435", new Object[]{shop2025HeaderNativeComponent})).intValue();
        }
        return shop2025HeaderNativeComponent.F0;
    }

    public static /* synthetic */ void u0(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, boolean z, int i, boolean z2, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d02076", new Object[]{shop2025HeaderNativeComponent, new Boolean(z), new Integer(i), new Boolean(z2), new Integer(i2), obj});
            return;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        shop2025HeaderNativeComponent.t0(z, i, z2);
    }

    public static final /* synthetic */ ShopDataParser v(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("14d8cab4", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.r;
    }

    public static final /* synthetic */ TextView w(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("8246eeb6", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.j;
    }

    public static /* synthetic */ void w0(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, int i, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a9f5f39", new Object[]{shop2025HeaderNativeComponent, new Integer(i), new Boolean(z), new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        shop2025HeaderNativeComponent.v0(i, z);
    }

    public static final /* synthetic */ TextView x(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("cc5be354", new Object[]{shop2025HeaderNativeComponent});
        }
        return shop2025HeaderNativeComponent.m;
    }

    public static final /* synthetic */ void y(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5478cc0b", new Object[]{shop2025HeaderNativeComponent});
        } else {
            shop2025HeaderNativeComponent.x0();
        }
    }

    public static final /* synthetic */ void z(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00bb451", new Object[]{shop2025HeaderNativeComponent, str});
        } else {
            shop2025HeaderNativeComponent.B = str;
        }
    }

    public final void A0(Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e51504", new Object[]{this, animatorListener});
        } else {
            this.V = animatorListener;
        }
    }

    public final void B0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942d1629", new Object[]{this, view});
            return;
        }
        ckf.g(view, "<set-?>");
        this.T = view;
    }

    public final void C0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afa457", new Object[]{this, view});
        } else {
            this.B0 = view;
        }
    }

    public final void D0(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461ccfc3", new Object[]{this, frameLayout});
            return;
        }
        ckf.g(frameLayout, "<set-?>");
        this.h = frameLayout;
    }

    public final void E0(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47705ea3", new Object[]{this, tUrlImageView});
            return;
        }
        ckf.g(tUrlImageView, "<set-?>");
        this.Q = tUrlImageView;
    }

    public final void F0(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfe39fa6", new Object[]{this, tUrlImageView});
            return;
        }
        ckf.g(tUrlImageView, "<set-?>");
        this.S = tUrlImageView;
    }

    public final void G0(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aed5538", new Object[]{this, tUrlImageView});
            return;
        }
        ckf.g(tUrlImageView, "<set-?>");
        this.R = tUrlImageView;
    }

    public final void H0(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8748936", new Object[]{this, linearLayout});
        } else {
            ckf.g(linearLayout, "<set-?>");
        }
    }

    public final void I0(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa004752", new Object[]{this, d1aVar});
        } else {
            this.H0 = d1aVar;
        }
    }

    public final Triple<TextView, TUrlImageView, TUrlImageView> J(LinearLayout linearLayout, String str, String str2, String str3) {
        LinearLayout.LayoutParams layoutParams;
        int i;
        LinearLayout.LayoutParams layoutParams2;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Triple) ipChange.ipc$dispatch("29af2a27", new Object[]{this, linearLayout, str, str2, str3});
        }
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout2.setLayoutParams(layoutParams3);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar = xhv.INSTANCE;
            linearLayout2.setLayoutParams(marginLayoutParams);
        }
        ViewGroup.LayoutParams layoutParams4 = linearLayout2.getLayoutParams();
        LinearLayout.LayoutParams layoutParams5 = null;
        if (layoutParams4 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams4;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams6.width = kew.v(700);
            layoutParams6.height = kew.v(72);
            xhv xhvVar2 = xhv.INSTANCE;
            linearLayout2.setLayoutParams(layoutParams6);
        } else {
            layoutParams.width = kew.v(700);
            layoutParams.height = kew.v(72);
        }
        TextView textView = new TextView(linearLayout2.getContext());
        ViewGroup.LayoutParams layoutParams7 = textView.getLayoutParams();
        if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
            textView.setLayoutParams(layoutParams7);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar3 = xhv.INSTANCE;
            textView.setLayoutParams(marginLayoutParams2);
        }
        textView.setPadding(kew.v(28), 0, kew.v(12), kew.v(3));
        textView.setSingleLine();
        kew.c0(textView, kew.v(30));
        textView.setTextColor(this.q0);
        textView.setText(str);
        if (str3 == null || wsq.a0(str3)) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        xhv xhvVar4 = xhv.INSTANCE;
        linearLayout2.addView(textView);
        TUrlImageView tUrlImageView = new TUrlImageView(linearLayout2.getContext());
        ViewGroup.LayoutParams layoutParams8 = tUrlImageView.getLayoutParams();
        if (layoutParams8 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView.setLayoutParams(layoutParams8);
        } else {
            tUrlImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        tUrlImageView.setImageUrl(str3);
        tUrlImageView.setPadding(kew.v(28), 0, kew.v(12), 0);
        tUrlImageView.setAdjustViewBounds(true);
        ViewGroup.LayoutParams layoutParams9 = tUrlImageView.getLayoutParams();
        if (layoutParams9 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams9;
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 == null) {
            LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams10.height = kew.v(30);
            tUrlImageView.setLayoutParams(layoutParams10);
        } else {
            layoutParams2.height = kew.v(30);
        }
        if (str3 == null || wsq.a0(str3)) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        tUrlImageView.setVisibility(i2);
        linearLayout2.addView(tUrlImageView);
        TUrlImageView tUrlImageView2 = new TUrlImageView(linearLayout2.getContext());
        ViewGroup.LayoutParams layoutParams11 = tUrlImageView2.getLayoutParams();
        if (layoutParams11 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView2.setLayoutParams(layoutParams11);
        } else {
            tUrlImageView2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        tUrlImageView2.setAdjustViewBounds(true);
        ViewGroup.LayoutParams layoutParams12 = tUrlImageView2.getLayoutParams();
        if (layoutParams12 instanceof LinearLayout.LayoutParams) {
            layoutParams5 = (LinearLayout.LayoutParams) layoutParams12;
        }
        if (layoutParams5 == null) {
            LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams13.height = kew.v(28);
            tUrlImageView2.setLayoutParams(layoutParams13);
        } else {
            layoutParams5.height = kew.v(28);
        }
        tUrlImageView2.setImageUrl(str2);
        if (str3 != null && !wsq.a0(str3)) {
            i3 = 8;
        }
        tUrlImageView2.setVisibility(i3);
        tUrlImageView2.addOnLayoutChangeListener(new b(tUrlImageView2, this));
        linearLayout2.addView(tUrlImageView2);
        linearLayout.addView(linearLayout2);
        return new Triple<>(textView, tUrlImageView2, tUrlImageView);
    }

    public final void J0(g1a<? super Integer, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5a4009", new Object[]{this, g1aVar});
        } else {
            this.z0 = g1aVar;
        }
    }

    public final void K0(g1a<? super Integer, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e7299e", new Object[]{this, g1aVar});
        } else {
            this.A0 = g1aVar;
        }
    }

    public final void L(boolean z, long j) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a07aea1a", new Object[]{this, new Boolean(z), new Long(j)});
            return;
        }
        this.M0 = false;
        npp.Companion.f("Shop2025HeaderNativeComponent animateDown ");
        if (!this.M0) {
            if (z) {
                i = this.b0;
            } else {
                i = this.W + this.Z;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(this.L0, i);
            ofInt.setDuration(j);
            ofInt.addUpdateListener(new c(z));
            ofInt.addListener(new d(z));
            Animator.AnimatorListener b0 = b0();
            if (b0 != null) {
                ofInt.addListener(b0);
            }
            ofInt.start();
            xhv xhvVar = xhv.INSTANCE;
            this.b = ofInt;
        }
    }

    public final void L0(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea8cc58", new Object[]{this, viewGroup});
        } else {
            this.G = viewGroup;
        }
    }

    public final void M0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d554ae3c", new Object[]{this, new Integer(i)});
        } else {
            this.W = i;
        }
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c52b9f3", new Object[]{this});
            return;
        }
        npp.Companion.f("Shop2025HeaderNativeComponent animateToMid ");
        this.M0 = false;
        ValueAnimator ofInt = ValueAnimator.ofInt(this.L0, this.W + this.Z + this.a0);
        ofInt.setDuration(this.U);
        ofInt.addUpdateListener(new e());
        ofInt.addListener(new f());
        Animator.AnimatorListener b0 = b0();
        if (b0 != null) {
            ofInt.addListener(b0);
        }
        ofInt.start();
        xhv xhvVar = xhv.INSTANCE;
        this.b = ofInt;
    }

    public final boolean N0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76c7c55e", new Object[]{this})).booleanValue();
        }
        if (this.y0 || (str = this.u) == null || wsq.a0(str)) {
            return false;
        }
        return true;
    }

    public final void O(long j, d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432c08a8", new Object[]{this, new Long(j), d1aVar});
            return;
        }
        this.M0 = false;
        Shop2025HeaderNativeComponent$animateUp$endAction$1 shop2025HeaderNativeComponent$animateUp$endAction$1 = new Shop2025HeaderNativeComponent$animateUp$endAction$1(this, d1aVar);
        int i = this.L0;
        int i2 = this.W + this.X;
        if (i <= i2) {
            v0(i2, false);
            shop2025HeaderNativeComponent$animateUp$endAction$1.invoke();
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new g());
        Animator.AnimatorListener b0 = b0();
        if (b0 != null) {
            ofInt.addListener(b0);
        }
        ofInt.addListener(new h(shop2025HeaderNativeComponent$animateUp$endAction$1));
        ofInt.start();
    }

    public final boolean O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6771b1f", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void P0() {
        TUrlImageView tUrlImageView;
        TUrlImageView tUrlImageView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85ad0d8", new Object[]{this});
            return;
        }
        TextView textView = this.j;
        if (!(textView == null || (tUrlImageView2 = this.k) == null)) {
            LinearLayout linearLayout = this.i;
            if (linearLayout == null) {
                ckf.y("llSearchWord");
                throw null;
            } else if (textView.getPaint().measureText(this.y) > (linearLayout.getWidth() - tUrlImageView2.getWidth()) - kew.v(40)) {
                tUrlImageView2.setAlpha(0.0f);
            } else {
                tUrlImageView2.setAlpha(1.0f);
            }
        }
        TextView textView2 = this.m;
        if (textView2 != null && (tUrlImageView = this.n) != null) {
            LinearLayout linearLayout2 = this.i;
            if (linearLayout2 == null) {
                ckf.y("llSearchWord");
                throw null;
            } else if (textView2.getPaint().measureText(textView2.getText().toString()) > (linearLayout2.getWidth() - tUrlImageView.getWidth()) - kew.v(40)) {
                tUrlImageView.setAlpha(0.0f);
            } else {
                tUrlImageView.setAlpha(1.0f);
            }
        }
    }

    public final void Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35d9ae7", new Object[]{this});
            return;
        }
        JSONArray jSONArray = this.v0;
        if (jSONArray != null && !jSONArray.isEmpty()) {
            JSONArray jSONArray2 = this.v0;
            ckf.d(jSONArray2);
            if (jSONArray2.size() != 1) {
                this.G0.removeCallbacksAndMessages(null);
                this.G0.postDelayed(new q(), 3000L);
            }
        }
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5272f04", new Object[]{this});
            return;
        }
        Activity activity = (Activity) this.f3218a;
        ShopDataParser shopDataParser = this.r;
        if (shopDataParser != null) {
            String P = shopDataParser.P();
            ShopDataParser shopDataParser2 = this.r;
            if (shopDataParser2 != null) {
                ShopMoreUtils.INSTANCE.w(activity, shopDataParser, P, shopDataParser2.R(), null, null, null);
                ShopDataParser shopDataParser3 = this.r;
                if (shopDataParser3 != null) {
                    if (!shopDataParser3.H1()) {
                        ShopDataParser shopDataParser4 = this.r;
                        if (shopDataParser4 != null) {
                            brp.g(shopDataParser4);
                        } else {
                            ckf.y("shopData");
                            throw null;
                        }
                    }
                    Z0(this, "Page_Shop_Page_Shop_Button-More", null, 2, null);
                    return;
                }
                ckf.y("shopData");
                throw null;
            }
            ckf.y("shopData");
            throw null;
        }
        ckf.y("shopData");
        throw null;
    }

    public final void R0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5264d0d7", new Object[]{this, new Boolean(z)});
        } else if (z) {
            FrameLayout frameLayout = this.I;
            if (frameLayout != null) {
                kew.C(frameLayout);
                LinearLayout linearLayout = this.f;
                if (linearLayout != null) {
                    kew.C(linearLayout);
                } else {
                    ckf.y("llShopInfoPart");
                    throw null;
                }
            } else {
                ckf.y("flSearchBar");
                throw null;
            }
        } else {
            FrameLayout frameLayout2 = this.I;
            if (frameLayout2 != null) {
                kew.g0(frameLayout2);
                LinearLayout linearLayout2 = this.f;
                if (linearLayout2 != null) {
                    kew.g0(linearLayout2);
                } else {
                    ckf.y("llShopInfoPart");
                    throw null;
                }
            } else {
                ckf.y("flSearchBar");
                throw null;
            }
        }
    }

    public final void S(ShopDXEngine shopDXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d09bde0", new Object[]{this, shopDXEngine});
            return;
        }
        ckf.g(shopDXEngine, "shopDXEngine");
        gnp.a aVar = gnp.Companion;
        ShopDataParser shopDataParser = this.r;
        if (shopDataParser != null) {
            gnp a2 = aVar.a(shopDataParser, shopDXEngine);
            if (a2 != null) {
                FrameLayout frameLayout = this.J;
                if (frameLayout != null) {
                    frameLayout.addView(a2.d());
                } else {
                    ckf.y("flFollow");
                    throw null;
                }
            }
        } else {
            ckf.y("shopData");
            throw null;
        }
    }

    public final void S0(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7611facf", new Object[]{this, new Boolean(z), jSONObject});
        }
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("610296e2", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.M;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(this.t);
        }
        f0().setImageUrl(this.f0);
        TUrlImageView tUrlImageView2 = this.O;
        if (tUrlImageView2 != null) {
            tUrlImageView2.setImageUrl(this.d0);
            TUrlImageView tUrlImageView3 = this.P;
            if (tUrlImageView3 != null) {
                tUrlImageView3.setImageUrl(this.h0);
                TextView textView = this.j;
                if (textView != null) {
                    textView.setTextColor(this.r0);
                }
                TextView textView2 = this.j;
                if (textView2 != null) {
                    textView2.setHintTextColor(this.r0);
                }
                TextView textView3 = this.m;
                if (textView3 != null) {
                    textView3.setTextColor(this.r0);
                }
                TextView textView4 = this.m;
                if (textView4 != null) {
                    textView4.setHintTextColor(this.r0);
                }
                FrameLayout frameLayout = this.I;
                if (frameLayout != null) {
                    frameLayout.setBackground(this.D0);
                    TUrlImageView tUrlImageView4 = this.N;
                    if (tUrlImageView4 != null) {
                        tUrlImageView4.setImageUrl(this.v);
                        View view = this.w0;
                        if (view != null) {
                            view.setBackgroundColor(this.s0);
                            View view2 = this.x0;
                            if (view2 != null) {
                                view2.setBackgroundColor(this.u0);
                                return;
                            }
                            return;
                        }
                        ckf.y("searchDivider");
                        throw null;
                    }
                    ckf.y("ivLogo");
                    throw null;
                }
                ckf.y("flSearchBar");
                throw null;
            }
            ckf.y("ivSearch");
            throw null;
        }
        ckf.y("ivMore");
        throw null;
    }

    public final void T0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb5615f", new Object[]{this, new Boolean(z)});
        } else if (z) {
            FrameLayout frameLayout = this.q;
            if (frameLayout != null) {
                frameLayout.setOnClickListener(new r());
            } else {
                ckf.y("flLogo");
                throw null;
            }
        } else if (O0()) {
            View view = this.d;
            if (view != null) {
                kew.g0(view);
            }
            TUrlImageView tUrlImageView = this.c;
            if (tUrlImageView != null) {
                kew.g0(tUrlImageView);
            }
            FrameLayout frameLayout2 = this.q;
            if (frameLayout2 != null) {
                frameLayout2.setOnClickListener(new s());
            } else {
                ckf.y("flLogo");
                throw null;
            }
        }
    }

    public final void U(long j, d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("643f3923", new Object[]{this, new Long(j), d1aVar});
            return;
        }
        npp.Companion.f("Shop2025HeaderNativeComponent fold ");
        this.M0 = true;
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        O(j, d1aVar);
    }

    public final void U0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec1c35e6", new Object[]{this, new Boolean(z)});
        } else if (z) {
            W0("live");
        }
    }

    public final boolean W(Integer num) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2d74f84", new Object[]{this, num})).booleanValue();
        }
        if (num == null) {
            i = this.c0;
        } else {
            i = num.intValue();
        }
        if (i == N0) {
            return true;
        }
        return false;
    }

    public final void W0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("936706f9", new Object[]{this, str});
            return;
        }
        npp.Companion.f(ckf.p("Shop2025HeaderNativeComponent updateStyle ", str));
        int hashCode = str.hashCode();
        if (hashCode != -1268966304) {
            if (hashCode != 3322092) {
                if (hashCode == 1544803905 && str.equals("default")) {
                    o0();
                }
            } else if (str.equals("live")) {
                T();
            }
        } else if (str.equals("folded")) {
            o0();
        }
    }

    public final void X0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4da2f3", new Object[]{this, new Boolean(z)});
        } else if (z) {
            W0("default");
        } else {
            W0("folded");
        }
    }

    public final boolean Y(Integer num) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8acb2512", new Object[]{this, num})).booleanValue();
        }
        if (num == null) {
            i = this.c0;
        } else {
            i = num.intValue();
        }
        if (i == P0) {
            return true;
        }
        return false;
    }

    public final void Y0(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3531cd18", new Object[]{this, str, map});
        } else {
            a1v.m(ShopConstants.PAGE_SHOP, str, l0(map));
        }
    }

    public final Context a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f3218a;
    }

    public final View a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6b5b1b5f", new Object[]{this});
        }
        return this.X0;
    }

    public final Animator.AnimatorListener b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator.AnimatorListener) ipChange.ipc$dispatch("61735a0", new Object[]{this});
        }
        return this.V;
    }

    public final int b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9563c997", new Object[]{this})).intValue();
        }
        return this.Y0;
    }

    public final int c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8fa291f8", new Object[]{this})).intValue();
        }
        return this.X;
    }

    public final View c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f2be23c5", new Object[]{this});
        }
        return this.Z0;
    }

    public final int d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cdda4f06", new Object[]{this})).intValue();
        }
        return this.Z;
    }

    public final int d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19f3bafd", new Object[]{this})).intValue();
        }
        return this.a1;
    }

    public final FrameLayout e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2021be25", new Object[]{this});
        }
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("honorContainer");
        throw null;
    }

    public final d1a<xhv> e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("abadfd7e", new Object[]{this});
        }
        return this.H0;
    }

    public final TUrlImageView f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("9923a62b", new Object[]{this});
        }
        TUrlImageView tUrlImageView = this.Q;
        if (tUrlImageView != null) {
            return tUrlImageView;
        }
        ckf.y("ivBack");
        throw null;
    }

    public final boolean f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f51cc85", new Object[]{this})).booleanValue();
        }
        return this.V0;
    }

    public final TUrlImageView g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("2ef4e630", new Object[]{this});
        }
        TUrlImageView tUrlImageView = this.S;
        if (tUrlImageView != null) {
            return tUrlImageView;
        }
        ckf.y("ivDefaultPullDown");
        throw null;
    }

    public final int g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("290013f8", new Object[]{this})).intValue();
        }
        return this.W0;
    }

    public final TUrlImageView h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("52d389f6", new Object[]{this});
        }
        TUrlImageView tUrlImageView = this.R;
        if (tUrlImageView != null) {
            return tUrlImageView;
        }
        ckf.y("ivMiddlePullDown");
        throw null;
    }

    public final u h1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("5a6036bb", new Object[]{this, str});
        }
        if (str == null) {
            return new u();
        }
        u uVar = new u();
        List y0 = wsq.y0(str, new char[]{','}, false, 0, 6, null);
        if (y0.size() == 2) {
            uVar.d(r54.a0((String) y0.get(0)));
            uVar.c(r54.a0((String) y0.get(1)));
        }
        return uVar;
    }

    public final int i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de9eca7f", new Object[]{this})).intValue();
        }
        return this.a0;
    }

    public final void i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38325cf", new Object[]{this});
            return;
        }
        int i = this.W0;
        if (i > 0) {
            this.Z = this.Y + this.X + i;
        }
    }

    public final int j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff9f915c", new Object[]{this})).intValue();
        }
        return this.Y;
    }

    public final void j1(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3116c9", new Object[]{this, view});
        } else {
            this.X0 = view;
        }
    }

    public final String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8e78229", new Object[]{this});
        }
        return null;
    }

    public final void k1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f2de953", new Object[]{this, new Integer(i)});
        } else {
            this.Y0 = i;
        }
    }

    public final HashMap<String, String> l0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("719e0466", new Object[]{this, map});
        }
        ShopDataParser shopDataParser = this.r;
        if (shopDataParser != null) {
            HashMap<String, String> l1 = shopDataParser.l1();
            ShopDataParser shopDataParser2 = this.r;
            if (shopDataParser2 != null) {
                l1.put("shop_id", shopDataParser2.W0());
                ShopDataParser shopDataParser3 = this.r;
                if (shopDataParser3 != null) {
                    l1.put("seller_id", shopDataParser3.N0());
                    ShopDataParser shopDataParser4 = this.r;
                    if (shopDataParser4 != null) {
                        l1.put("identityCode", shopDataParser4.s0());
                        ShopDataParser shopDataParser5 = this.r;
                        if (shopDataParser5 != null) {
                            l1.put("industryShop", shopDataParser5.u0());
                            ShopDataParser shopDataParser6 = this.r;
                            if (shopDataParser6 != null) {
                                l1.put("identityCode", shopDataParser6.s0());
                                if (map != null) {
                                    l1.putAll(map);
                                }
                                return l1;
                            }
                            ckf.y("shopData");
                            throw null;
                        }
                        ckf.y("shopData");
                        throw null;
                    }
                    ckf.y("shopData");
                    throw null;
                }
                ckf.y("shopData");
                throw null;
            }
            ckf.y("shopData");
            throw null;
        }
        ckf.y("shopData");
        throw null;
    }

    public final void l1(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf03423", new Object[]{this, view});
        } else {
            this.Z0 = view;
        }
    }

    public final void m1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("977abdad", new Object[]{this, new Integer(i)});
        } else {
            this.a1 = i;
        }
    }

    public final void n0(ViewGroup viewGroup) {
        FrameLayout frameLayout;
        final LinearLayout linearLayout;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b59e761b", new Object[]{this, viewGroup});
            return;
        }
        ViewGroup viewGroup2 = this.G;
        if (viewGroup2 != null) {
            kew.d0(viewGroup2, this.W + this.Z);
            xhv xhvVar = xhv.INSTANCE;
        }
        r54.Q(new Shop2025HeaderNativeComponent$initView$1(this));
        FrameLayout frameLayout2 = new FrameLayout(viewGroup.getContext());
        this.F = frameLayout2;
        frameLayout2.setClipChildren(false);
        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.LayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams)).width = -1;
            frameLayout2.setLayoutParams(layoutParams);
        } else {
            ViewGroup.LayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.width = -1;
            xhv xhvVar2 = xhv.INSTANCE;
            frameLayout2.setLayoutParams(marginLayoutParams);
        }
        View view = new View(frameLayout2.getContext());
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            view.setLayoutParams(layoutParams2);
        } else {
            ViewGroup.LayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar3 = xhv.INSTANCE;
            view.setLayoutParams(marginLayoutParams2);
        }
        B0(view);
        view.setBackgroundColor(-1);
        view.setAlpha(0.0f);
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            ((ViewGroup.LayoutParams) marginLayoutParams3).width = -1;
            ((ViewGroup.LayoutParams) marginLayoutParams3).height = -1;
            view.setLayoutParams(layoutParams3);
        } else {
            ViewGroup.LayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams4.width = -1;
            marginLayoutParams4.height = -1;
            xhv xhvVar4 = xhv.INSTANCE;
            view.setLayoutParams(marginLayoutParams4);
        }
        view.setContentDescription("headerMiddleStatusToFoldStatusBackground");
        view.setImportantForAccessibility(2);
        frameLayout2.addView(view);
        xhv xhvVar5 = xhv.INSTANCE;
        LinearLayout linearLayout2 = new LinearLayout(frameLayout2.getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ViewGroup.LayoutParams layoutParams4 = linearLayout2.getLayoutParams();
        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout2.setLayoutParams(layoutParams4);
        } else {
            linearLayout2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        H0(linearLayout2);
        ViewGroup.LayoutParams layoutParams5 = linearLayout2.getLayoutParams();
        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
            ((ViewGroup.LayoutParams) marginLayoutParams5).width = -1;
            marginLayoutParams5.height = c0();
            linearLayout2.setLayoutParams(layoutParams5);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams6 = new ViewGroup.MarginLayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) marginLayoutParams6).width = -1;
            marginLayoutParams6.height = c0();
            linearLayout2.setLayoutParams(marginLayoutParams6);
        }
        TUrlImageView tUrlImageView = new TUrlImageView(linearLayout2.getContext());
        ViewGroup.LayoutParams layoutParams6 = tUrlImageView.getLayoutParams();
        if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView.setLayoutParams(layoutParams6);
        } else {
            tUrlImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        E0(tUrlImageView);
        tUrlImageView.setPadding(kew.v(12), 0, kew.v(12), 0);
        ViewGroup.LayoutParams layoutParams7 = tUrlImageView.getLayoutParams();
        if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams7;
            marginLayoutParams7.width = kew.v(64);
            marginLayoutParams7.height = kew.v(64);
            marginLayoutParams7.setMarginStart(kew.v(18));
            marginLayoutParams7.setMarginEnd(kew.v(4));
            tUrlImageView.setLayoutParams(layoutParams7);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams8 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams8.width = kew.v(64);
            marginLayoutParams8.height = kew.v(64);
            marginLayoutParams8.setMarginStart(kew.v(18));
            marginLayoutParams8.setMarginEnd(kew.v(4));
            tUrlImageView.setLayoutParams(marginLayoutParams8);
        }
        tUrlImageView.setContentDescription("返回按钮");
        linearLayout2.addView(tUrlImageView);
        FrameLayout frameLayout3 = new FrameLayout(linearLayout2.getContext());
        this.I = frameLayout3;
        ViewGroup.LayoutParams layoutParams8 = frameLayout3.getLayoutParams();
        LinearLayout.LayoutParams layoutParams9 = null;
        LinearLayout.LayoutParams layoutParams10 = layoutParams8 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams8 : null;
        if (layoutParams10 == null) {
            LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) layoutParams11).width = -1;
            layoutParams11.height = kew.v(72);
            layoutParams11.weight = 1.0f;
            frameLayout3.setLayoutParams(layoutParams11);
        } else {
            ((ViewGroup.LayoutParams) layoutParams10).width = -1;
            layoutParams10.height = kew.v(72);
            layoutParams10.weight = 1.0f;
        }
        LinearLayout linearLayout3 = new LinearLayout(frameLayout3.getContext());
        linearLayout3.setOrientation(1);
        ViewGroup.LayoutParams layoutParams12 = linearLayout3.getLayoutParams();
        if (layoutParams12 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout3.setLayoutParams(layoutParams12);
        } else {
            linearLayout3.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.i = linearLayout3;
        ViewGroup.LayoutParams layoutParams13 = linearLayout3.getLayoutParams();
        FrameLayout.LayoutParams layoutParams14 = layoutParams13 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams13 : null;
        if (layoutParams14 == null) {
            FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) layoutParams15).width = -1;
            ((ViewGroup.LayoutParams) layoutParams15).height = -1;
            layoutParams15.setMarginEnd(kew.v(88));
            linearLayout3.setLayoutParams(layoutParams15);
        } else {
            ((ViewGroup.LayoutParams) layoutParams14).width = -1;
            ((ViewGroup.LayoutParams) layoutParams14).height = -1;
            layoutParams14.setMarginEnd(kew.v(88));
        }
        Triple<TextView, TUrlImageView, TUrlImageView> J = J(linearLayout3, this.y, this.z, this.A);
        this.j = J.getFirst();
        this.k = J.getSecond();
        this.l = J.getThird();
        JSONArray jSONArray = this.v0;
        if (jSONArray == null || jSONArray.size() <= 1) {
            linearLayout = linearLayout3;
            frameLayout = frameLayout3;
        } else {
            JSONArray jSONArray2 = this.v0;
            ckf.d(jSONArray2);
            Object obj = jSONArray2.get(1);
            JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
            linearLayout = linearLayout3;
            frameLayout = frameLayout3;
            Triple K = K(this, linearLayout3, jSONObject == null ? null : jSONObject.getString("displayText"), jSONObject == null ? null : jSONObject.getString("icon"), null, 4, null);
            this.m = (TextView) K.getFirst();
            this.n = (TUrlImageView) K.getSecond();
            this.o = (TUrlImageView) K.getThird();
        }
        linearLayout.post(new v());
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.component.nativeview.Shop2025HeaderNativeComponent$initView$2$3$3$2$5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.triver.triver_shop.newShop.view.component.nativeview.Shop2025HeaderNativeComponent$initView$2$3$3$2$5$1  reason: invalid class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ Shop2025HeaderNativeComponent this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
                    super(0);
                    this.this$0 = shop2025HeaderNativeComponent;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/Shop2025HeaderNativeComponent$initView$2$3$3$2$5$1");
                }

                @Override // tb.d1a
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                        return;
                    }
                    ShopDataParser v = Shop2025HeaderNativeComponent.v(this.this$0);
                    if (v != null) {
                        a1v.c(v, "Page_Shop_Page_Shop_Button-Search", a.k(jpu.a("position", "1"), jpu.a("shadingWord", Shop2025HeaderNativeComponent.t(this.this$0)), jpu.a("benefitType", Shop2025HeaderNativeComponent.b(this.this$0)), jpu.a("utArg1", this.this$0.k0()), jpu.a("timeStamp", String.valueOf(System.currentTimeMillis()))), null, 8, null);
                    } else {
                        ckf.y("shopData");
                        throw null;
                    }
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                r54.Q(new AnonymousClass1(Shop2025HeaderNativeComponent.this));
                if (Shop2025HeaderNativeComponent.n(Shop2025HeaderNativeComponent.this) == null) {
                    Nav.from(linearLayout.getContext()).toUri(Shop2025HeaderNativeComponent.o(Shop2025HeaderNativeComponent.this));
                    return;
                }
                String n = Shop2025HeaderNativeComponent.n(Shop2025HeaderNativeComponent.this);
                if (n != null) {
                    LinearLayout linearLayout4 = linearLayout;
                    String substring = n.substring(wsq.Y(n, "?", 0, false, 6, null) + 1);
                    ckf.f(substring, "(this as java.lang.String).substring(startIndex)");
                    String p2 = ckf.p("http://shop.m.taobao.com/goods/index.htm?gotoSearch=1&", substring);
                    npp.Companion.f(ckf.p("Shop2025HeaderNativeComponent onclick activeUrl ", p2));
                    Nav.from(linearLayout4.getContext()).toUri(p2);
                }
            }
        });
        frameLayout.addView(linearLayout);
        View view2 = new View(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams16 = view2.getLayoutParams();
        if (layoutParams16 instanceof ViewGroup.MarginLayoutParams) {
            view2.setLayoutParams(layoutParams16);
        } else {
            view2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.w0 = view2;
        ViewGroup.LayoutParams layoutParams17 = view2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams18 = layoutParams17 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams17 : null;
        if (layoutParams18 == null) {
            FrameLayout.LayoutParams layoutParams19 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams19.width = kew.v(2);
            layoutParams19.height = kew.v(32);
            layoutParams19.setMarginEnd(kew.v(88));
            layoutParams19.gravity = 8388629;
            view2.setLayoutParams(layoutParams19);
        } else {
            layoutParams18.width = kew.v(2);
            layoutParams18.height = kew.v(32);
            layoutParams18.setMarginEnd(kew.v(88));
            layoutParams18.gravity = 8388629;
        }
        view2.setBackgroundColor(this.s0);
        frameLayout.addView(view2);
        final TUrlImageView tUrlImageView2 = new TUrlImageView(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams20 = tUrlImageView2.getLayoutParams();
        if (layoutParams20 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView2.setLayoutParams(layoutParams20);
        } else {
            tUrlImageView2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.P = tUrlImageView2;
        int v2 = kew.v(10);
        tUrlImageView2.setPadding(v2, v2, v2, v2);
        ViewGroup.LayoutParams layoutParams21 = tUrlImageView2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams22 = layoutParams21 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams21 : null;
        if (layoutParams22 == null) {
            FrameLayout.LayoutParams layoutParams23 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams23.width = kew.v(60);
            layoutParams23.height = kew.v(60);
            layoutParams23.setMarginEnd(kew.v(15));
            layoutParams23.gravity = 8388629;
            tUrlImageView2.setLayoutParams(layoutParams23);
        } else {
            layoutParams22.width = kew.v(60);
            layoutParams22.height = kew.v(60);
            layoutParams22.setMarginEnd(kew.v(15));
            layoutParams22.gravity = 8388629;
        }
        tUrlImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.component.nativeview.Shop2025HeaderNativeComponent$initView$2$3$3$4$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.triver.triver_shop.newShop.view.component.nativeview.Shop2025HeaderNativeComponent$initView$2$3$3$4$2$1  reason: invalid class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ Shop2025HeaderNativeComponent this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
                    super(0);
                    this.this$0 = shop2025HeaderNativeComponent;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/Shop2025HeaderNativeComponent$initView$2$3$3$4$2$1");
                }

                @Override // tb.d1a
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                        return;
                    }
                    ShopDataParser v = Shop2025HeaderNativeComponent.v(this.this$0);
                    if (v != null) {
                        a1v.c(v, "Page_Shop_Page_Shop_Button-Search", a.k(jpu.a("position", "2"), jpu.a("shadingWord", Shop2025HeaderNativeComponent.t(this.this$0)), jpu.a("benefitType", Shop2025HeaderNativeComponent.b(this.this$0)), jpu.a("utArg1", this.this$0.k0()), jpu.a("timeStamp", String.valueOf(System.currentTimeMillis()))), null, 8, null);
                    } else {
                        ckf.y("shopData");
                        throw null;
                    }
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                    return;
                }
                r54.Q(new AnonymousClass1(Shop2025HeaderNativeComponent.this));
                if (Shop2025HeaderNativeComponent.r(Shop2025HeaderNativeComponent.this) == null) {
                    Context context = tUrlImageView2.getContext();
                    ckf.f(context, "context");
                    khu.h(context, Shop2025HeaderNativeComponent.o(Shop2025HeaderNativeComponent.this));
                    return;
                }
                String r2 = Shop2025HeaderNativeComponent.r(Shop2025HeaderNativeComponent.this);
                if (r2 != null) {
                    Context context2 = tUrlImageView2.getContext();
                    ckf.f(context2, "context");
                    khu.h(context2, r2);
                }
            }
        });
        frameLayout.addView(tUrlImageView2);
        linearLayout2.addView(frameLayout);
        TUrlImageView tUrlImageView3 = new TUrlImageView(linearLayout2.getContext());
        ViewGroup.LayoutParams layoutParams24 = tUrlImageView3.getLayoutParams();
        if (layoutParams24 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView3.setLayoutParams(layoutParams24);
        } else {
            tUrlImageView3.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.O = tUrlImageView3;
        tUrlImageView3.setPadding(kew.v(12), 0, kew.v(12), 0);
        ViewGroup.LayoutParams layoutParams25 = tUrlImageView3.getLayoutParams();
        if (layoutParams25 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams9 = (ViewGroup.MarginLayoutParams) layoutParams25;
            marginLayoutParams9.width = kew.v(64);
            marginLayoutParams9.height = kew.v(64);
            marginLayoutParams9.setMarginEnd(kew.v(18));
            marginLayoutParams9.setMarginStart(kew.v(4));
            tUrlImageView3.setLayoutParams(layoutParams25);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams10 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams10.width = kew.v(64);
            marginLayoutParams10.height = kew.v(64);
            marginLayoutParams10.setMarginEnd(kew.v(18));
            marginLayoutParams10.setMarginStart(kew.v(4));
            tUrlImageView3.setLayoutParams(marginLayoutParams10);
        }
        tUrlImageView3.setContentDescription("更多按钮");
        tUrlImageView3.setOnClickListener(new w());
        linearLayout2.addView(tUrlImageView3);
        frameLayout2.addView(linearLayout2);
        FrameLayout frameLayout4 = new FrameLayout(frameLayout2.getContext());
        this.H = frameLayout4;
        ViewGroup.LayoutParams layoutParams26 = frameLayout4.getLayoutParams();
        if (layoutParams26 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.LayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams26)).width = -1;
            frameLayout4.setLayoutParams(layoutParams26);
        } else {
            ViewGroup.LayoutParams marginLayoutParams11 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams11.width = -1;
            frameLayout4.setLayoutParams(marginLayoutParams11);
        }
        View view3 = new View(frameLayout4.getContext());
        ViewGroup.LayoutParams layoutParams27 = view3.getLayoutParams();
        if (layoutParams27 instanceof ViewGroup.MarginLayoutParams) {
            view3.setLayoutParams(layoutParams27);
        } else {
            view3.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        C0(view3);
        kew.S(view3, this.E0);
        view3.setContentDescription("店招白色背景");
        view3.setImportantForAccessibility(2);
        ViewGroup.LayoutParams layoutParams28 = view3.getLayoutParams();
        FrameLayout.LayoutParams layoutParams29 = layoutParams28 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams28 : null;
        if (layoutParams29 == null) {
            FrameLayout.LayoutParams layoutParams30 = new FrameLayout.LayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) layoutParams30).width = -1;
            layoutParams30.height = j0() + g1() + kew.v(8);
            layoutParams30.gravity = 80;
            view3.setLayoutParams(layoutParams30);
        } else {
            ((ViewGroup.LayoutParams) layoutParams29).width = -1;
            layoutParams29.height = j0() + g1() + kew.v(8);
            layoutParams29.gravity = 80;
        }
        frameLayout4.addView(view3);
        LinearLayout linearLayout4 = new LinearLayout(frameLayout4.getContext());
        linearLayout4.setOrientation(0);
        linearLayout4.setGravity(16);
        ViewGroup.LayoutParams layoutParams31 = linearLayout4.getLayoutParams();
        if (layoutParams31 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout4.setLayoutParams(layoutParams31);
        } else {
            linearLayout4.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.f = linearLayout4;
        linearLayout4.setClipChildren(false);
        linearLayout4.setClipToPadding(false);
        kew.a0(linearLayout4, c0());
        ViewGroup.LayoutParams layoutParams32 = linearLayout4.getLayoutParams();
        if (layoutParams32 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams12 = (ViewGroup.MarginLayoutParams) layoutParams32;
            ((ViewGroup.LayoutParams) marginLayoutParams12).width = -1;
            marginLayoutParams12.height = j0() + c0() + kew.v(1);
            linearLayout4.setLayoutParams(layoutParams32);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams13 = new ViewGroup.MarginLayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) marginLayoutParams13).width = -1;
            marginLayoutParams13.height = j0() + c0() + kew.v(1);
            linearLayout4.setLayoutParams(marginLayoutParams13);
        }
        final FrameLayout frameLayout5 = new FrameLayout(linearLayout4.getContext());
        this.q = frameLayout5;
        ViewGroup.LayoutParams layoutParams33 = frameLayout5.getLayoutParams();
        if (layoutParams33 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams14 = (ViewGroup.MarginLayoutParams) layoutParams33;
            marginLayoutParams14.width = kew.v(100);
            marginLayoutParams14.height = kew.v(100);
            marginLayoutParams14.setMarginStart(kew.v(18));
            marginLayoutParams14.setMarginEnd(kew.v(2));
            frameLayout5.setLayoutParams(layoutParams33);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams15 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams15.width = kew.v(100);
            marginLayoutParams15.height = kew.v(100);
            marginLayoutParams15.setMarginStart(kew.v(18));
            marginLayoutParams15.setMarginEnd(kew.v(2));
            frameLayout5.setLayoutParams(marginLayoutParams15);
        }
        frameLayout5.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.component.nativeview.Shop2025HeaderNativeComponent$initView$2$4$3$2$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.triver.triver_shop.newShop.view.component.nativeview.Shop2025HeaderNativeComponent$initView$2$4$3$2$2$1  reason: invalid class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ Shop2025HeaderNativeComponent this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
                    super(0);
                    this.this$0 = shop2025HeaderNativeComponent;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/Shop2025HeaderNativeComponent$initView$2$4$3$2$2$1");
                }

                @Override // tb.d1a
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                        return;
                    }
                    ShopDataParser v = Shop2025HeaderNativeComponent.v(this.this$0);
                    if (v != null) {
                        a1v.c(v, "Page_Shop_ShopLogo", null, null, 12, null);
                    } else {
                        ckf.y("shopData");
                        throw null;
                    }
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view4});
                    return;
                }
                Context context = frameLayout5.getContext();
                ckf.f(context, "context");
                khu.h(context, Shop2025HeaderNativeComponent.d(this));
                r54.Q(new AnonymousClass1(this));
            }
        });
        T0(false);
        FrameLayout frameLayout6 = new FrameLayout(frameLayout5.getContext());
        TUrlImageView tUrlImageView4 = new TUrlImageView(frameLayout6.getContext());
        ViewGroup.LayoutParams layoutParams34 = tUrlImageView4.getLayoutParams();
        if (layoutParams34 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView4.setLayoutParams(layoutParams34);
        } else {
            tUrlImageView4.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.N = tUrlImageView4;
        kew.e0(tUrlImageView4, true, kew.v(12));
        ViewGroup.LayoutParams layoutParams35 = tUrlImageView4.getLayoutParams();
        FrameLayout.LayoutParams layoutParams36 = layoutParams35 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams35 : null;
        if (layoutParams36 == null) {
            FrameLayout.LayoutParams layoutParams37 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams37.gravity = 17;
            if (O0()) {
                layoutParams37.width = kew.v(68);
                layoutParams37.height = kew.v(68);
            } else if (N0()) {
                layoutParams37.width = kew.v(64);
                layoutParams37.height = kew.v(64);
                kew.e0(tUrlImageView4, true, kew.v(32));
            } else {
                layoutParams37.width = kew.v(72);
                layoutParams37.height = kew.v(72);
            }
            tUrlImageView4.setLayoutParams(layoutParams37);
        } else {
            layoutParams36.gravity = 17;
            if (O0()) {
                layoutParams36.width = kew.v(68);
                layoutParams36.height = kew.v(68);
            } else if (N0()) {
                layoutParams36.width = kew.v(64);
                layoutParams36.height = kew.v(64);
                kew.e0(tUrlImageView4, true, kew.v(32));
            } else {
                layoutParams36.width = kew.v(72);
                layoutParams36.height = kew.v(72);
            }
        }
        frameLayout6.addView(tUrlImageView4);
        if (O0()) {
            TUrlImageView tUrlImageView5 = new TUrlImageView(frameLayout6.getContext());
            ViewGroup.LayoutParams layoutParams38 = tUrlImageView5.getLayoutParams();
            if (layoutParams38 instanceof ViewGroup.MarginLayoutParams) {
                tUrlImageView5.setLayoutParams(layoutParams38);
            } else {
                tUrlImageView5.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            }
            this.d = tUrlImageView5;
            ViewGroup.LayoutParams layoutParams39 = tUrlImageView5.getLayoutParams();
            FrameLayout.LayoutParams layoutParams40 = layoutParams39 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams39 : null;
            if (layoutParams40 == null) {
                FrameLayout.LayoutParams layoutParams41 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams41.width = kew.v(88);
                layoutParams41.height = kew.v(88);
                layoutParams41.gravity = 17;
                tUrlImageView5.setLayoutParams(layoutParams41);
            } else {
                layoutParams40.width = kew.v(88);
                layoutParams40.height = kew.v(88);
                layoutParams40.gravity = 17;
            }
            tUrlImageView5.setSkipAutoSize(true);
            tUrlImageView5.setImageUrl(this.k0);
            frameLayout6.addView(tUrlImageView5);
            TUrlImageView tUrlImageView6 = new TUrlImageView(frameLayout6.getContext());
            ViewGroup.LayoutParams layoutParams42 = tUrlImageView6.getLayoutParams();
            if (layoutParams42 instanceof ViewGroup.MarginLayoutParams) {
                tUrlImageView6.setLayoutParams(layoutParams42);
            } else {
                tUrlImageView6.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            }
            this.c = tUrlImageView6;
            ViewGroup.LayoutParams layoutParams43 = tUrlImageView6.getLayoutParams();
            FrameLayout.LayoutParams layoutParams44 = layoutParams43 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams43 : null;
            if (layoutParams44 == null) {
                FrameLayout.LayoutParams layoutParams45 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams45.width = kew.v(26);
                layoutParams45.height = kew.v(26);
                layoutParams45.gravity = BadgeDrawable.BOTTOM_END;
                layoutParams45.setMarginEnd(kew.v(11));
                layoutParams45.bottomMargin = kew.v(11);
                tUrlImageView6.setLayoutParams(layoutParams45);
            } else {
                layoutParams44.width = kew.v(26);
                layoutParams44.height = kew.v(26);
                layoutParams44.gravity = BadgeDrawable.BOTTOM_END;
                layoutParams44.setMarginEnd(kew.v(11));
                layoutParams44.bottomMargin = kew.v(11);
            }
            tUrlImageView6.setSkipAutoSize(true);
            tUrlImageView6.setImageUrl(this.j0);
            frameLayout6.addView(tUrlImageView6);
        }
        frameLayout5.addView(frameLayout6);
        TUrlImageView tUrlImageView7 = new TUrlImageView(frameLayout5.getContext());
        ViewGroup.LayoutParams layoutParams46 = tUrlImageView7.getLayoutParams();
        if (layoutParams46 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView7.setLayoutParams(layoutParams46);
        } else {
            tUrlImageView7.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        ViewGroup.LayoutParams layoutParams47 = tUrlImageView7.getLayoutParams();
        if (layoutParams47 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams16 = (ViewGroup.MarginLayoutParams) layoutParams47;
            ((ViewGroup.LayoutParams) marginLayoutParams16).width = -1;
            ((ViewGroup.LayoutParams) marginLayoutParams16).height = -1;
            tUrlImageView7.setLayoutParams(layoutParams47);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams17 = new ViewGroup.MarginLayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) marginLayoutParams17).width = -1;
            ((ViewGroup.LayoutParams) marginLayoutParams17).height = -1;
            tUrlImageView7.setLayoutParams(marginLayoutParams17);
        }
        if (N0()) {
            tUrlImageView7.setImageUrl(this.u);
        }
        frameLayout5.addView(tUrlImageView7);
        linearLayout4.addView(frameLayout5);
        final PerceptionLinearLayout perceptionLinearLayout = new PerceptionLinearLayout(linearLayout4.getContext());
        perceptionLinearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams48 = perceptionLinearLayout.getLayoutParams();
        if (layoutParams48 instanceof ViewGroup.MarginLayoutParams) {
            perceptionLinearLayout.setLayoutParams(layoutParams48);
        } else {
            perceptionLinearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        perceptionLinearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.component.nativeview.Shop2025HeaderNativeComponent$initView$2$4$3$3$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.triver.triver_shop.newShop.view.component.nativeview.Shop2025HeaderNativeComponent$initView$2$4$3$3$1$1  reason: invalid class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ Shop2025HeaderNativeComponent this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
                    super(0);
                    this.this$0 = shop2025HeaderNativeComponent;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/Shop2025HeaderNativeComponent$initView$2$4$3$3$1$1");
                }

                @Override // tb.d1a
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                        return;
                    }
                    ShopDataParser v = Shop2025HeaderNativeComponent.v(this.this$0);
                    if (v != null) {
                        a1v.c(v, "Page_Shop_ShopTopCard", null, null, 12, null);
                    } else {
                        ckf.y("shopData");
                        throw null;
                    }
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view4});
                    return;
                }
                LinearLayout j = Shop2025HeaderNativeComponent.j(Shop2025HeaderNativeComponent.this);
                if (j == null) {
                    ckf.y("llShopInfo");
                    throw null;
                } else if (j.getAlpha() > 0.9d) {
                    Context context = perceptionLinearLayout.getContext();
                    ckf.f(context, "context");
                    khu.h(context, Shop2025HeaderNativeComponent.d(Shop2025HeaderNativeComponent.this));
                    r54.Q(new AnonymousClass1(Shop2025HeaderNativeComponent.this));
                }
            }
        });
        perceptionLinearLayout.setDispatchTouchEventDelegate(new Shop2025HeaderNativeComponent$initView$2$4$3$3$2(this));
        this.p = perceptionLinearLayout;
        ViewGroup.LayoutParams layoutParams49 = perceptionLinearLayout.getLayoutParams();
        LinearLayout.LayoutParams layoutParams50 = layoutParams49 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams49 : null;
        if (layoutParams50 == null) {
            LinearLayout.LayoutParams layoutParams51 = new LinearLayout.LayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) layoutParams51).width = -1;
            f2 = 1.0f;
            layoutParams51.weight = 1.0f;
            perceptionLinearLayout.setLayoutParams(layoutParams51);
        } else {
            f2 = 1.0f;
            ((ViewGroup.LayoutParams) layoutParams50).width = -1;
            layoutParams50.weight = 1.0f;
        }
        LinearLayout linearLayout5 = new LinearLayout(perceptionLinearLayout.getContext());
        linearLayout5.setOrientation(0);
        linearLayout5.setGravity(16);
        ViewGroup.LayoutParams layoutParams52 = linearLayout5.getLayoutParams();
        if (layoutParams52 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout5.setLayoutParams(layoutParams52);
        } else {
            linearLayout5.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        Context context = linearLayout5.getContext();
        ckf.f(context, "context");
        AutoScrollTextView autoScrollTextView = new AutoScrollTextView(context);
        ViewGroup.LayoutParams layoutParams53 = autoScrollTextView.getLayoutParams();
        if (layoutParams53 instanceof ViewGroup.MarginLayoutParams) {
            autoScrollTextView.setLayoutParams(layoutParams53);
        } else {
            autoScrollTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.L = autoScrollTextView.getTextView();
        autoScrollTextView.getTextView().setText(this.w);
        autoScrollTextView.getTextView().setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout5.setGravity(17);
        autoScrollTextView.getTextView().setSingleLine();
        autoScrollTextView.getTextView().setTextColor(this.n0);
        kew.c0(autoScrollTextView.getTextView(), kew.v(30));
        autoScrollTextView.setEnableSizeChangeRestartAnimation(true);
        ViewGroup.LayoutParams layoutParams54 = autoScrollTextView.getLayoutParams();
        if (layoutParams54 instanceof LinearLayout.LayoutParams) {
            layoutParams9 = (LinearLayout.LayoutParams) layoutParams54;
        }
        if (layoutParams9 == null) {
            LinearLayout.LayoutParams layoutParams55 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams55.width = 0;
            layoutParams55.weight = f2;
            autoScrollTextView.setLayoutParams(layoutParams55);
        } else {
            layoutParams9.width = 0;
            layoutParams9.weight = f2;
        }
        r54.E(new Shop2025HeaderNativeComponent$initView$2$4$3$3$4$1$2(autoScrollTextView), 500L);
        linearLayout5.addView(autoScrollTextView);
        TUrlImageView tUrlImageView8 = new TUrlImageView(linearLayout5.getContext());
        ViewGroup.LayoutParams layoutParams56 = tUrlImageView8.getLayoutParams();
        if (layoutParams56 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView8.setLayoutParams(layoutParams56);
        } else {
            tUrlImageView8.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        tUrlImageView8.setAdjustViewBounds(true);
        u h1 = h1(this.Q0);
        ViewGroup.LayoutParams layoutParams57 = tUrlImageView8.getLayoutParams();
        if (layoutParams57 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams18 = (ViewGroup.MarginLayoutParams) layoutParams57;
            marginLayoutParams18.width = kew.v(Float.valueOf(h1.b()));
            marginLayoutParams18.height = kew.v(Float.valueOf(h1.a()));
            marginLayoutParams18.setMarginStart(kew.v(8));
            marginLayoutParams18.setMarginEnd(kew.v(8));
            tUrlImageView8.setLayoutParams(layoutParams57);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams19 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams19.width = kew.v(Float.valueOf(h1.b()));
            marginLayoutParams19.height = kew.v(Float.valueOf(h1.a()));
            marginLayoutParams19.setMarginStart(kew.v(8));
            marginLayoutParams19.setMarginEnd(kew.v(8));
            tUrlImageView8.setLayoutParams(marginLayoutParams19);
        }
        tUrlImageView8.setContentDescription("TMALLLogo");
        tUrlImageView8.setImageUrl(this.e);
        linearLayout5.addView(tUrlImageView8);
        perceptionLinearLayout.addView(linearLayout5);
        linearLayout5.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.component.nativeview.Shop2025HeaderNativeComponent$initView$2$4$3$3$5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.triver.triver_shop.newShop.view.component.nativeview.Shop2025HeaderNativeComponent$initView$2$4$3$3$5$1  reason: invalid class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ Shop2025HeaderNativeComponent this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
                    super(0);
                    this.this$0 = shop2025HeaderNativeComponent;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/Shop2025HeaderNativeComponent$initView$2$4$3$3$5$1");
                }

                @Override // tb.d1a
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                        return;
                    }
                    ShopDataParser v = Shop2025HeaderNativeComponent.v(this.this$0);
                    if (v != null) {
                        a1v.c(v, "Page_Shop_ShopName", null, null, 12, null);
                    } else {
                        ckf.y("shopData");
                        throw null;
                    }
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view4});
                    return;
                }
                LinearLayout j = Shop2025HeaderNativeComponent.j(Shop2025HeaderNativeComponent.this);
                if (j == null) {
                    ckf.y("llShopInfo");
                    throw null;
                } else if (j.getAlpha() > 0.9d) {
                    Context context2 = perceptionLinearLayout.getContext();
                    ckf.f(context2, "context");
                    khu.h(context2, Shop2025HeaderNativeComponent.d(Shop2025HeaderNativeComponent.this));
                    r54.Q(new AnonymousClass1(Shop2025HeaderNativeComponent.this));
                }
            }
        });
        LinearLayout linearLayout6 = new LinearLayout(perceptionLinearLayout.getContext());
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(16);
        ViewGroup.LayoutParams layoutParams58 = linearLayout6.getLayoutParams();
        if (layoutParams58 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout6.setLayoutParams(layoutParams58);
        } else {
            linearLayout6.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        ViewGroup.LayoutParams layoutParams59 = linearLayout6.getLayoutParams();
        if (layoutParams59 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams59).topMargin = kew.v(8);
            linearLayout6.setLayoutParams(layoutParams59);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams20 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams20.topMargin = kew.v(8);
            linearLayout6.setLayoutParams(marginLayoutParams20);
        }
        TUrlImageView tUrlImageView9 = new TUrlImageView(linearLayout6.getContext());
        ViewGroup.LayoutParams layoutParams60 = tUrlImageView9.getLayoutParams();
        if (layoutParams60 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView9.setLayoutParams(layoutParams60);
        } else {
            tUrlImageView9.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        tUrlImageView9.setAdjustViewBounds(true);
        u h12 = h1(this.T0);
        ViewGroup.LayoutParams layoutParams61 = tUrlImageView9.getLayoutParams();
        if (layoutParams61 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams21 = (ViewGroup.MarginLayoutParams) layoutParams61;
            marginLayoutParams21.height = kew.v(Float.valueOf(h12.a()));
            marginLayoutParams21.width = kew.v(Float.valueOf(h12.b()));
            tUrlImageView9.setLayoutParams(layoutParams61);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams22 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams22.height = kew.v(Float.valueOf(h12.a()));
            marginLayoutParams22.width = kew.v(Float.valueOf(h12.b()));
            tUrlImageView9.setLayoutParams(marginLayoutParams22);
        }
        tUrlImageView9.setImageUrl(this.S0);
        linearLayout6.addView(tUrlImageView9);
        String str = this.s;
        if (str != null && !wsq.a0(str)) {
            TUrlImageView tUrlImageView10 = new TUrlImageView(linearLayout6.getContext());
            ViewGroup.LayoutParams layoutParams62 = tUrlImageView10.getLayoutParams();
            if (layoutParams62 instanceof ViewGroup.MarginLayoutParams) {
                tUrlImageView10.setLayoutParams(layoutParams62);
            } else {
                tUrlImageView10.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            }
            this.M = tUrlImageView10;
            tUrlImageView10.setAdjustViewBounds(true);
            u h13 = h1(this.U0);
            ViewGroup.LayoutParams layoutParams63 = tUrlImageView10.getLayoutParams();
            if (layoutParams63 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams23 = (ViewGroup.MarginLayoutParams) layoutParams63;
                marginLayoutParams23.height = kew.v(Float.valueOf(h13.a()));
                marginLayoutParams23.width = kew.v(Float.valueOf(h13.b()));
                tUrlImageView10.setLayoutParams(layoutParams63);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams24 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams24.height = kew.v(Float.valueOf(h13.a()));
                marginLayoutParams24.width = kew.v(Float.valueOf(h13.b()));
                tUrlImageView10.setLayoutParams(marginLayoutParams24);
            }
            linearLayout6.addView(tUrlImageView10);
            View view4 = new View(linearLayout6.getContext());
            ViewGroup.LayoutParams layoutParams64 = view4.getLayoutParams();
            if (layoutParams64 instanceof ViewGroup.MarginLayoutParams) {
                view4.setLayoutParams(layoutParams64);
            } else {
                view4.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            }
            this.x0 = view4;
            ViewGroup.LayoutParams layoutParams65 = view4.getLayoutParams();
            if (layoutParams65 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams25 = (ViewGroup.MarginLayoutParams) layoutParams65;
                marginLayoutParams25.width = kew.v(2);
                marginLayoutParams25.height = kew.v(18);
                marginLayoutParams25.setMarginStart(kew.v(10));
                marginLayoutParams25.setMarginEnd(kew.v(10));
                view4.setLayoutParams(layoutParams65);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams26 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams26.width = kew.v(2);
                marginLayoutParams26.height = kew.v(18);
                marginLayoutParams26.setMarginStart(kew.v(10));
                marginLayoutParams26.setMarginEnd(kew.v(10));
                view4.setLayoutParams(marginLayoutParams26);
            }
            kew.e0(view4, true, kew.v(1));
            view4.setContentDescription("粉丝分割线");
            view4.setImportantForAccessibility(2);
            view4.setBackgroundColor(this.u0);
            linearLayout6.addView(view4);
        }
        TextView textView = new TextView(linearLayout6.getContext());
        ViewGroup.LayoutParams layoutParams66 = textView.getLayoutParams();
        if (layoutParams66 instanceof ViewGroup.MarginLayoutParams) {
            textView.setLayoutParams(layoutParams66);
        } else {
            textView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.K = textView;
        textView.setText(this.x);
        kew.c0(textView, kew.v(20));
        linearLayout6.addView(textView);
        perceptionLinearLayout.addView(linearLayout6);
        linearLayout4.addView(perceptionLinearLayout);
        FrameLayout frameLayout7 = new FrameLayout(linearLayout4.getContext());
        this.J = frameLayout7;
        frameLayout7.setClipChildren(false);
        ViewGroup.LayoutParams layoutParams67 = frameLayout7.getLayoutParams();
        if (layoutParams67 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams27 = (ViewGroup.MarginLayoutParams) layoutParams67;
            marginLayoutParams27.setMarginEnd(kew.v(32));
            marginLayoutParams27.bottomMargin = kew.v(Float.valueOf(14.5f));
            marginLayoutParams27.height = kew.v(60);
            frameLayout7.setLayoutParams(layoutParams67);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams28 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams28.setMarginEnd(kew.v(32));
            marginLayoutParams28.bottomMargin = kew.v(Float.valueOf(14.5f));
            marginLayoutParams28.height = kew.v(60);
            frameLayout7.setLayoutParams(marginLayoutParams28);
        }
        linearLayout4.addView(frameLayout7);
        frameLayout4.addView(linearLayout4);
        FrameLayout frameLayout8 = new FrameLayout(frameLayout4.getContext());
        ViewGroup.LayoutParams layoutParams68 = frameLayout8.getLayoutParams();
        if (layoutParams68 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams29 = (ViewGroup.MarginLayoutParams) layoutParams68;
            ((ViewGroup.LayoutParams) marginLayoutParams29).width = -1;
            marginLayoutParams29.height = f1() ? kew.v(Integer.valueOf(i0())) : 0;
            frameLayout8.setLayoutParams(layoutParams68);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams30 = new ViewGroup.MarginLayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) marginLayoutParams30).width = -1;
            marginLayoutParams30.height = f1() ? kew.v(Integer.valueOf(i0())) : 0;
            frameLayout8.setLayoutParams(marginLayoutParams30);
        }
        frameLayout8.setPadding(0, 0, 0, kew.v(20));
        frameLayout8.setContentDescription("middleLayout");
        frameLayout8.setImportantForAccessibility(2);
        TUrlImageView tUrlImageView11 = new TUrlImageView(frameLayout8.getContext());
        ViewGroup.LayoutParams layoutParams69 = tUrlImageView11.getLayoutParams();
        if (layoutParams69 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView11.setLayoutParams(layoutParams69);
        } else {
            tUrlImageView11.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        G0(tUrlImageView11);
        ViewGroup.LayoutParams layoutParams70 = tUrlImageView11.getLayoutParams();
        if (layoutParams70 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams31 = (ViewGroup.MarginLayoutParams) layoutParams70;
            ((ViewGroup.LayoutParams) marginLayoutParams31).width = -1;
            ((ViewGroup.LayoutParams) marginLayoutParams31).height = -1;
            tUrlImageView11.setLayoutParams(layoutParams70);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams32 = new ViewGroup.MarginLayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) marginLayoutParams32).width = -1;
            ((ViewGroup.LayoutParams) marginLayoutParams32).height = -1;
            tUrlImageView11.setLayoutParams(marginLayoutParams32);
        }
        kew.C(tUrlImageView11);
        tUrlImageView11.setImageUrl(this.l0);
        tUrlImageView11.setContentDescription("middlePullDownImage");
        tUrlImageView11.setImportantForAccessibility(2);
        tUrlImageView11.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.component.nativeview.Shop2025HeaderNativeComponent$initView$2$4$4$2$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.triver.triver_shop.newShop.view.component.nativeview.Shop2025HeaderNativeComponent$initView$2$4$4$2$2$1  reason: invalid class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ Shop2025HeaderNativeComponent this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Shop2025HeaderNativeComponent shop2025HeaderNativeComponent) {
                    super(0);
                    this.this$0 = shop2025HeaderNativeComponent;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/Shop2025HeaderNativeComponent$initView$2$4$4$2$2$1");
                }

                @Override // tb.d1a
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                        return;
                    }
                    ShopDataParser v = Shop2025HeaderNativeComponent.v(this.this$0);
                    if (v != null) {
                        a1v.c(v, "Page_Shop_2Flivecard-hidestrip", null, null, 12, null);
                    } else {
                        ckf.y("shopData");
                        throw null;
                    }
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view5});
                    return;
                }
                r54.Q(new AnonymousClass1(Shop2025HeaderNativeComponent.this));
                d1a<xhv> e1 = Shop2025HeaderNativeComponent.this.e1();
                if (e1 != null) {
                    e1.invoke();
                }
            }
        });
        frameLayout8.addView(tUrlImageView11);
        TUrlImageView tUrlImageView12 = new TUrlImageView(frameLayout8.getContext());
        ViewGroup.LayoutParams layoutParams71 = tUrlImageView12.getLayoutParams();
        if (layoutParams71 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView12.setLayoutParams(layoutParams71);
        } else {
            tUrlImageView12.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        F0(tUrlImageView12);
        ViewGroup.LayoutParams layoutParams72 = tUrlImageView12.getLayoutParams();
        if (layoutParams72 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams33 = (ViewGroup.MarginLayoutParams) layoutParams72;
            ((ViewGroup.LayoutParams) marginLayoutParams33).width = -1;
            ((ViewGroup.LayoutParams) marginLayoutParams33).height = -1;
            tUrlImageView12.setLayoutParams(layoutParams72);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams34 = new ViewGroup.MarginLayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) marginLayoutParams34).width = -1;
            ((ViewGroup.LayoutParams) marginLayoutParams34).height = -1;
            tUrlImageView12.setLayoutParams(marginLayoutParams34);
        }
        kew.C(tUrlImageView12);
        tUrlImageView12.setImageUrl(this.m0);
        tUrlImageView12.setContentDescription("defaultPullDownImage");
        tUrlImageView12.setImportantForAccessibility(2);
        frameLayout8.addView(tUrlImageView12);
        frameLayout4.addView(frameLayout8);
        FrameLayout frameLayout9 = new FrameLayout(frameLayout4.getContext());
        D0(frameLayout9);
        ViewGroup.LayoutParams layoutParams73 = frameLayout9.getLayoutParams();
        if (layoutParams73 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams35 = (ViewGroup.MarginLayoutParams) layoutParams73;
            ((ViewGroup.LayoutParams) marginLayoutParams35).width = -1;
            marginLayoutParams35.height = g1();
            marginLayoutParams35.topMargin = c0() + j0();
            frameLayout9.setLayoutParams(layoutParams73);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams36 = new ViewGroup.MarginLayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) marginLayoutParams36).width = -1;
            marginLayoutParams36.height = g1();
            marginLayoutParams36.topMargin = c0() + j0();
            frameLayout9.setLayoutParams(marginLayoutParams36);
        }
        View a1 = a1();
        if (a1 != null) {
            ViewGroup.LayoutParams layoutParams74 = a1.getLayoutParams();
            if (layoutParams74 instanceof ViewGroup.MarginLayoutParams) {
                a1.setLayoutParams(layoutParams74);
            } else {
                a1.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            }
            ViewGroup.LayoutParams layoutParams75 = a1.getLayoutParams();
            if (layoutParams75 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams37 = (ViewGroup.MarginLayoutParams) layoutParams75;
                ((ViewGroup.LayoutParams) marginLayoutParams37).width = -1;
                marginLayoutParams37.height = b1();
                a1.setLayoutParams(layoutParams75);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams38 = new ViewGroup.MarginLayoutParams(-2, -2);
                ((ViewGroup.LayoutParams) marginLayoutParams38).width = -1;
                marginLayoutParams38.height = b1();
                a1.setLayoutParams(marginLayoutParams38);
            }
            frameLayout9.addView(a1);
        }
        View c1 = c1();
        if (c1 != null) {
            ViewGroup.LayoutParams layoutParams76 = c1.getLayoutParams();
            if (layoutParams76 instanceof ViewGroup.MarginLayoutParams) {
                c1.setLayoutParams(layoutParams76);
            } else {
                c1.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            }
            ViewGroup.LayoutParams layoutParams77 = c1.getLayoutParams();
            if (layoutParams77 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams39 = (ViewGroup.MarginLayoutParams) layoutParams77;
                ((ViewGroup.LayoutParams) marginLayoutParams39).width = -1;
                marginLayoutParams39.height = d1();
                marginLayoutParams39.topMargin = b1();
                c1.setLayoutParams(layoutParams77);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams40 = new ViewGroup.MarginLayoutParams(-2, -2);
                ((ViewGroup.LayoutParams) marginLayoutParams40).width = -1;
                marginLayoutParams40.height = d1();
                marginLayoutParams40.topMargin = b1();
                c1.setLayoutParams(marginLayoutParams40);
            }
            frameLayout9.addView(c1);
        }
        frameLayout4.addView(frameLayout9);
        frameLayout2.addView(frameLayout4);
        viewGroup.addView(frameLayout2);
    }

    public final void n1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb28e7", new Object[]{this, new Boolean(z)});
        } else {
            this.V0 = z;
        }
    }

    public final void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46f2a542", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.M;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(this.s);
        }
        f0().setImageUrl(this.g0);
        TUrlImageView tUrlImageView2 = this.O;
        if (tUrlImageView2 != null) {
            tUrlImageView2.setImageUrl(this.e0);
            TUrlImageView tUrlImageView3 = this.P;
            if (tUrlImageView3 != null) {
                tUrlImageView3.setImageUrl(this.i0);
                TextView textView = this.L;
                if (textView != null) {
                    textView.setTextColor(this.n0);
                }
                TextView textView2 = this.K;
                if (textView2 != null) {
                    textView2.setTextColor(this.o0);
                    TextView textView3 = this.j;
                    if (textView3 != null) {
                        textView3.setTextColor(this.p0);
                    }
                    TextView textView4 = this.j;
                    if (textView4 != null) {
                        textView4.setHintTextColor(this.p0);
                    }
                    TextView textView5 = this.m;
                    if (textView5 != null) {
                        textView5.setTextColor(this.p0);
                    }
                    TextView textView6 = this.m;
                    if (textView6 != null) {
                        textView6.setHintTextColor(this.p0);
                    }
                    FrameLayout frameLayout = this.I;
                    if (frameLayout != null) {
                        frameLayout.setBackground(this.C0);
                        TUrlImageView tUrlImageView4 = this.N;
                        if (tUrlImageView4 != null) {
                            tUrlImageView4.setImageUrl(this.v);
                            View view = this.w0;
                            if (view != null) {
                                view.setBackgroundColor(this.t0);
                                View view2 = this.x0;
                                if (view2 != null) {
                                    view2.setBackgroundColor(this.u0);
                                    return;
                                }
                                return;
                            }
                            ckf.y("searchDivider");
                            throw null;
                        }
                        ckf.y("ivLogo");
                        throw null;
                    }
                    ckf.y("flSearchBar");
                    throw null;
                }
                ckf.y("tvFans");
                throw null;
            }
            ckf.y("ivSearch");
            throw null;
        }
        ckf.y("ivMore");
        throw null;
    }

    public final void p0() {
        final FragmentActivity fragmentActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4b5a46a", new Object[]{this});
            return;
        }
        Context context = this.f3218a;
        if (context instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) context;
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity != null) {
            fragmentActivity.getLifecycle().addObserver(new LifecycleObserver() { // from class: com.alibaba.triver.triver_shop.newShop.view.component.nativeview.Shop2025HeaderNativeComponent$listenLifecycle$1$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroyed() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bf354a81", new Object[]{this});
                        return;
                    }
                    npp.Companion.f("Shop2025HeaderNativeComponent onDestroyed ");
                    Shop2025HeaderNativeComponent.c(Shop2025HeaderNativeComponent.this).removeCallbacksAndMessages(null);
                    Lifecycle lifecycle = fragmentActivity.getLifecycle();
                    if (lifecycle != null) {
                        lifecycle.removeObserver(this);
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_START)
                public final void onStart() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7f2d84ca", new Object[]{this});
                        return;
                    }
                    npp.Companion.f("Shop2025HeaderNativeComponent onStart ");
                    Shop2025HeaderNativeComponent.I(Shop2025HeaderNativeComponent.this);
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
                public final void onStop() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b3dde88", new Object[]{this});
                        return;
                    }
                    npp.Companion.f("Shop2025HeaderNativeComponent onStop ");
                    Shop2025HeaderNativeComponent.c(Shop2025HeaderNativeComponent.this).removeCallbacksAndMessages(null);
                }
            });
        }
    }

    public final boolean q0(Integer num) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99c8b718", new Object[]{this, num})).booleanValue();
        }
        if (num == null) {
            i = this.c0;
        } else {
            i = num.intValue();
        }
        if (i == O0) {
            return true;
        }
        return false;
    }

    public final void s0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2df91c62", new Object[]{this, new Boolean(z)});
            return;
        }
        long currentTimeMillis = (this.L0 - this.J0) / (System.currentTimeMillis() - this.I0);
        npp.a aVar = npp.Companion;
        aVar.f("Shop2025HeaderNativeComponent moveCancel " + this.L0 + ' ' + currentTimeMillis);
        int i = this.K0;
        if (currentTimeMillis >= i) {
            int i2 = this.c0;
            if (i2 == N0) {
                if (!z || !this.V0) {
                    M(this, z, 0L, 2, null);
                } else {
                    N();
                }
            } else if (i2 == O0) {
                M(this, z, 0L, 2, null);
            } else {
                M(this, z, 0L, 2, null);
            }
        } else if (currentTimeMillis <= (-i)) {
            int i3 = this.c0;
            if (i3 == P0) {
                if (!z || !this.V0) {
                    P(this, 0L, null, 3, null);
                } else {
                    N();
                }
            } else if (i3 == O0) {
                P(this, 0L, null, 3, null);
            }
        } else {
            int i4 = this.Z;
            int i5 = this.X;
            int i6 = (i4 - i5) / 2;
            if (z) {
                i6 += this.a0 / 2;
            }
            int i7 = this.L0;
            int i8 = this.W;
            if (i7 < i8 + i5 + i6) {
                P(this, 0L, null, 3, null);
            } else {
                int i9 = (((this.b0 - i8) - i5) - this.a0) / 2;
                if (!z || i7 >= i8 + i5 + i9) {
                    M(this, z, 0L, 2, null);
                } else if (this.V0) {
                    N();
                } else {
                    P(this, 0L, null, 3, null);
                }
            }
        }
        this.I0 = 0L;
    }

    public final void y0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae59ca3", new Object[]{this, new Integer(i)});
        } else {
            this.b0 = i + (this.Z - this.X);
        }
    }

    public final void z0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5559e89", new Object[]{this, new Integer(i)});
            return;
        }
        this.c0 = i;
        if (i == O0) {
            r54.Q(new Shop2025HeaderNativeComponent$curState$1(this));
            kew.h0(h0());
            kew.C(g0());
        } else {
            kew.C(h0());
        }
        if (i == N0) {
            kew.C(g0());
        }
        g1a<? super Integer, xhv> g1aVar = this.A0;
        if (g1aVar != null) {
            g1aVar.invoke(Integer.valueOf(i));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            Shop2025HeaderNativeComponent shop2025HeaderNativeComponent = Shop2025HeaderNativeComponent.this;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                shop2025HeaderNativeComponent.t0(true, ((Integer) animatedValue).intValue(), false);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public final void Q(ViewGroup viewGroup, ShopDataParser shopDataParser, ShopDXEngine shopDXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b70c274", new Object[]{this, viewGroup, shopDataParser, shopDXEngine});
            return;
        }
        ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(shopDataParser, "shopData");
        ckf.g(shopDXEngine, "shopDXEngine");
        this.r = shopDataParser;
        this.R0 = shopDXEngine;
        o1();
        i1();
        m0(shopDataParser);
        n0(viewGroup);
        X0(true);
        Q0();
        p0();
    }

    public final void V0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28974bc3", new Object[]{this, new Float(f2)});
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        float f3 = f2 * f2;
        FrameLayout frameLayout = this.I;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                float f4 = 1;
                float f5 = f4 - f2;
                layoutParams2.setMarginEnd((int) (kew.v(130) * f5));
                FrameLayout frameLayout2 = this.I;
                if (frameLayout2 != null) {
                    frameLayout2.setLayoutParams(layoutParams2);
                    LinearLayout linearLayout = this.i;
                    if (linearLayout != null) {
                        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
                        if (layoutParams3 != null) {
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                            layoutParams4.setMarginStart((int) (kew.v(64) * f5));
                            LinearLayout linearLayout2 = this.i;
                            if (linearLayout2 != null) {
                                linearLayout2.setLayoutParams(layoutParams4);
                                FrameLayout frameLayout3 = this.q;
                                if (frameLayout3 != null) {
                                    frameLayout3.setTranslationX(kew.v(55) * f5);
                                    FrameLayout frameLayout4 = this.q;
                                    if (frameLayout4 != null) {
                                        float f6 = -f5;
                                        frameLayout4.setTranslationY(kew.v(Double.valueOf(99.5d)) * f6);
                                        String str = this.u;
                                        if (str == null || wsq.a0(str)) {
                                            FrameLayout frameLayout5 = this.q;
                                            if (frameLayout5 != null) {
                                                float f7 = f4 - (f5 * 0.112f);
                                                frameLayout5.setScaleX(f7);
                                                FrameLayout frameLayout6 = this.q;
                                                if (frameLayout6 != null) {
                                                    frameLayout6.setScaleY(f7);
                                                } else {
                                                    ckf.y("flLogo");
                                                    throw null;
                                                }
                                            } else {
                                                ckf.y("flLogo");
                                                throw null;
                                            }
                                        } else {
                                            FrameLayout frameLayout7 = this.q;
                                            if (frameLayout7 != null) {
                                                float f8 = f4 - (f5 * 0.132f);
                                                frameLayout7.setScaleX(f8);
                                                FrameLayout frameLayout8 = this.q;
                                                if (frameLayout8 != null) {
                                                    frameLayout8.setScaleY(f8);
                                                } else {
                                                    ckf.y("flLogo");
                                                    throw null;
                                                }
                                            } else {
                                                ckf.y("flLogo");
                                                throw null;
                                            }
                                        }
                                        LinearLayout linearLayout3 = this.p;
                                        if (linearLayout3 != null) {
                                            linearLayout3.setAlpha(f3);
                                            e0().setAlpha(f3);
                                            View view = this.B0;
                                            if (view != null) {
                                                view.setAlpha(f3);
                                            }
                                            FrameLayout frameLayout9 = this.J;
                                            if (frameLayout9 != null) {
                                                frameLayout9.setTranslationX(kew.v(58) * f6);
                                                FrameLayout frameLayout10 = this.J;
                                                if (frameLayout10 != null) {
                                                    frameLayout10.setTranslationY(f6 * kew.v(Float.valueOf(97.5f)));
                                                    LinearLayout linearLayout4 = this.i;
                                                    if (linearLayout4 != null) {
                                                        linearLayout4.post(new t());
                                                        npp.Companion.e(ckf.p("expandProgress : ", Float.valueOf(f2)));
                                                        return;
                                                    }
                                                    ckf.y("llSearchWord");
                                                    throw null;
                                                }
                                                ckf.y("flFollow");
                                                throw null;
                                            }
                                            ckf.y("flFollow");
                                            throw null;
                                        }
                                        ckf.y("llShopInfo");
                                        throw null;
                                    }
                                    ckf.y("flLogo");
                                    throw null;
                                }
                                ckf.y("flLogo");
                                throw null;
                            }
                            ckf.y("llSearchWord");
                            throw null;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                    ckf.y("llSearchWord");
                    throw null;
                }
                ckf.y("flSearchBar");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        ckf.y("flSearchBar");
        throw null;
    }

    public final void m0(ShopDataParser shopDataParser) {
        JSONObject data;
        Object e2;
        JSONObject data2;
        JSONObject jSONObject;
        JSONObject data3;
        JSONObject data4;
        JSONObject data5;
        JSONObject data6;
        JSONObject data7;
        JSONObject data8;
        JSONObject data9;
        JSONObject data10;
        JSONObject data11;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d8f9cd", new Object[]{this, shopDataParser});
            return;
        }
        this.y0 = shopDataParser.V1();
        shopDataParser.v1("live");
        JSONObject D1 = shopDataParser.D1();
        this.g = D1.getJSONObject("shopInfo").getString("introUrl");
        this.v = D1.getJSONObject("shopInfo").getString("shopLogo");
        JSONObject jSONObject2 = D1.getJSONObject("navigatorData");
        if (jSONObject2 != null) {
            this.y = jSONObject2.getString("searchWord");
            this.C = jSONObject2.getString("searchUrl");
        }
        Map<String, ShopComponentModel> m = shopDataParser.O0().m();
        JSONObject jSONObject3 = null;
        ShopComponentModel shopComponentModel = m == null ? null : m.get("tb_shop_header_shop_info_2025_native");
        String str = "";
        if (!(shopComponentModel == null || (data11 = shopComponentModel.getData()) == null || (string = data11.getString("shopName")) == null)) {
            str = string;
        }
        this.w = str;
        this.u = (shopComponentModel == null || (data10 = shopComponentModel.getData()) == null) ? null : data10.getString("logoActivityPicUrl");
        this.e = (shopComponentModel == null || (data9 = shopComponentModel.getData()) == null) ? null : data9.getString("bizLogo25");
        this.Q0 = (shopComponentModel == null || (data8 = shopComponentModel.getData()) == null) ? null : data8.getString("bizLogo25Size");
        this.s = (shopComponentModel == null || (data7 = shopComponentModel.getData()) == null) ? null : data7.getString("rankImage25");
        this.S0 = (shopComponentModel == null || (data6 = shopComponentModel.getData()) == null) ? null : data6.getString("subBizLogo25");
        this.T0 = (shopComponentModel == null || (data5 = shopComponentModel.getData()) == null) ? null : data5.getString("subBizLogo25Size");
        this.U0 = (shopComponentModel == null || (data4 = shopComponentModel.getData()) == null) ? null : data4.getString("rankImage25Size");
        this.t = (shopComponentModel == null || (data3 = shopComponentModel.getData()) == null) ? null : data3.getString("rankImage25");
        this.x = (shopComponentModel == null || (data2 = shopComponentModel.getData()) == null || (jSONObject = data2.getJSONObject("relation")) == null) ? null : ckf.p(jSONObject.getString("fansNumStr"), jSONObject.getString("fansDes"));
        if (!(shopComponentModel == null || (data = shopComponentModel.getData()) == null)) {
            JSONArray jSONArray = data.getJSONArray("shopSearchWordList");
            this.v0 = jSONArray;
            if (!(jSONArray == null || (e2 = brf.e(jSONArray, 0)) == null)) {
                if (e2 instanceof JSONObject) {
                    jSONObject3 = (JSONObject) e2;
                }
                if (jSONObject3 != null) {
                    JSONObject jSONObject4 = (JSONObject) e2;
                    this.y = jSONObject4.getString("displayText");
                    this.z = jSONObject4.getString("icon");
                    this.A = jSONObject4.getString("displayPicUrl");
                    this.B = jSONObject4.getString("benefitType");
                    this.D = jSONObject4.getString("sapUrl");
                    this.E = jSONObject4.getString("srpUrl");
                }
            }
        }
        String str2 = this.y;
        if (str2 == null || wsq.a0(str2)) {
            this.y = "搜索店铺内宝贝";
        }
        JSONArray jSONArray2 = this.v0;
        if (jSONArray2 != null) {
            for (Object obj : jSONArray2) {
                if (obj instanceof JSONObject) {
                    r54.Q(new Shop2025HeaderNativeComponent$initData$4$1(shopDataParser, obj));
                }
            }
        }
    }

    public final void o1() {
        ShopComponentModel shopComponentModel;
        ShopComponentModel shopComponentModel2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6422ffb", new Object[]{this});
            return;
        }
        ShopDataParser shopDataParser = this.r;
        if (shopDataParser != null) {
            Map<String, ShopComponentModel> m = shopDataParser.O0().m();
            if (!(m == null || (shopComponentModel2 = m.get(c7z.templateName)) == null)) {
                k1(kew.v(Integer.valueOf(shopComponentModel2.getRenderHeight())));
                i = b1();
                c7z c7zVar = new c7z(shopComponentModel2);
                Context a0 = a0();
                ShopDataParser shopDataParser2 = this.r;
                if (shopDataParser2 != null) {
                    ShopDXEngine shopDXEngine = this.R0;
                    if (shopDXEngine != null) {
                        c7zVar.k(a0, shopDataParser2, shopDXEngine, null);
                        j1(c7zVar.d());
                    } else {
                        ckf.y("shopDXEngine");
                        throw null;
                    }
                } else {
                    ckf.y("shopData");
                    throw null;
                }
            }
            ShopDataParser shopDataParser3 = this.r;
            if (shopDataParser3 != null) {
                Map<String, ShopComponentModel> m2 = shopDataParser3.O0().m();
                if (!(m2 == null || (shopComponentModel = m2.get(d7z.templateName)) == null)) {
                    m1(kew.v(Integer.valueOf(shopComponentModel.getRenderHeight())));
                    i += d1();
                    d7z d7zVar = new d7z(shopComponentModel);
                    Context a02 = a0();
                    ShopDataParser shopDataParser4 = this.r;
                    if (shopDataParser4 != null) {
                        ShopDXEngine shopDXEngine2 = this.R0;
                        if (shopDXEngine2 != null) {
                            d7zVar.k(a02, shopDataParser4, shopDXEngine2, null);
                            l1(d7zVar.d());
                            d7zVar.L();
                        } else {
                            ckf.y("shopDXEngine");
                            throw null;
                        }
                    } else {
                        ckf.y("shopData");
                        throw null;
                    }
                }
                this.W0 = i;
                return;
            }
            ckf.y("shopData");
            throw null;
        }
        ckf.y("shopData");
        throw null;
    }

    public final void t0(boolean z, int i, boolean z2) {
        int i2;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf198ab", new Object[]{this, new Boolean(z), new Integer(i), new Boolean(z2)});
            return;
        }
        if (z2 && this.I0 == 0) {
            this.I0 = System.currentTimeMillis();
            this.J0 = this.L0;
        }
        this.L0 = i;
        int i3 = this.W + this.Z;
        if (i <= i3) {
            V0(1 - ((i3 - i) / (i2 - this.X)));
            ViewGroup viewGroup2 = this.G;
            if (viewGroup2 != null) {
                kew.d0(viewGroup2, i);
            }
            g1a<? super Integer, xhv> g1aVar = this.z0;
            if (g1aVar != null) {
                g1aVar.invoke(Integer.valueOf(i));
            }
        } else if (z) {
            if (r0(this, null, 1, null)) {
                float f2 = this.X;
                if (this.H != null) {
                    float min = 1.0f - Math.min(1.0f, ((int) Math.max(f2 - viewGroup.getY(), 0.0f)) / this.a0);
                    h0().setAlpha(min * min);
                } else {
                    ckf.y("llScrollPart");
                    throw null;
                }
            }
            V0(1.0f);
            ViewGroup viewGroup3 = this.H;
            if (viewGroup3 != null) {
                viewGroup3.setTranslationY(i - i3);
                ViewGroup viewGroup4 = this.G;
                if (viewGroup4 != null) {
                    kew.d0(viewGroup4, i);
                }
                g1a<? super Integer, xhv> g1aVar2 = this.z0;
                if (g1aVar2 != null) {
                    g1aVar2.invoke(Integer.valueOf(i));
                }
                ViewGroup viewGroup5 = this.F;
                if (viewGroup5 != null) {
                    kew.e(viewGroup5, i - this.W);
                    return;
                }
                return;
            }
            ckf.y("llScrollPart");
            throw null;
        } else {
            V0(1.0f);
            ViewGroup viewGroup6 = this.G;
            if (viewGroup6 != null) {
                kew.d0(viewGroup6, i3);
            }
            g1a<? super Integer, xhv> g1aVar3 = this.z0;
            if (g1aVar3 != null) {
                g1aVar3.invoke(Integer.valueOf(i3));
            }
        }
    }

    public final void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71bda086", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, linearLayout.getHeight());
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new o());
            ofInt.addListener(new p());
            ofInt.start();
            return;
        }
        ckf.y("llSearchWord");
        throw null;
    }

    public final void v0(int i, boolean z) {
        int i2;
        int i3;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f9cc44", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        npp.a aVar = npp.Companion;
        aVar.f(ckf.p("move up : ", Integer.valueOf(i)));
        if (z && this.I0 == 0) {
            this.I0 = System.currentTimeMillis();
            this.J0 = i;
        }
        this.L0 = i;
        int i4 = this.W;
        int i5 = i4 + this.X;
        if (i <= i4 + this.Z) {
            V0((i - i5) / (i3 - i2));
            ViewGroup viewGroup2 = this.H;
            if (viewGroup2 != null) {
                viewGroup2.setTranslationY(0.0f);
            } else {
                ckf.y("llScrollPart");
                throw null;
            }
        } else {
            if (r0(this, null, 1, null)) {
                float f2 = this.X;
                if (this.H != null) {
                    float min = 1.0f - Math.min(1.0f, ((int) Math.max(f2 - viewGroup.getY(), 0.0f)) / this.a0);
                    h0().setAlpha(min * min);
                } else {
                    ckf.y("llScrollPart");
                    throw null;
                }
            }
            V0(1.0f);
            ViewGroup viewGroup3 = this.H;
            if (viewGroup3 != null) {
                viewGroup3.setTranslationY((i - i5) - (this.Z - this.X));
                ViewGroup viewGroup4 = this.F;
                if (viewGroup4 != null) {
                    kew.e(viewGroup4, i - this.W);
                }
            } else {
                ckf.y("llScrollPart");
                throw null;
            }
        }
        int i6 = this.W;
        int i7 = this.X;
        if (i > i6 + i7) {
            ViewGroup viewGroup5 = this.G;
            if (viewGroup5 != null) {
                kew.d0(viewGroup5, i);
            }
            g1a<? super Integer, xhv> g1aVar = this.z0;
            if (g1aVar != null) {
                g1aVar.invoke(Integer.valueOf(i));
            }
            aVar.f("update content View top margin");
        } else {
            ViewGroup viewGroup6 = this.G;
            if (viewGroup6 != null) {
                kew.d0(viewGroup6, i6 + i7);
            }
            aVar.f("update content View top margin");
            g1a<? super Integer, xhv> g1aVar2 = this.z0;
            if (g1aVar2 != null) {
                g1aVar2.invoke(Integer.valueOf(this.W + this.X));
            }
        }
        if (g0().getAlpha() == 1.0f) {
            g0().setAlpha(0.99f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(g0().getAlpha(), 0.0f);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new x());
            ofFloat.start();
        }
    }

    public Shop2025HeaderNativeComponent(Context context) {
        ckf.g(context, "context");
        this.f3218a = context;
        kew.c(16777215, 0.6f);
        kew.u(-1, null, null, kew.v(12), 0, 0, 0, 0, 0, 0, 1014, null);
    }
}
