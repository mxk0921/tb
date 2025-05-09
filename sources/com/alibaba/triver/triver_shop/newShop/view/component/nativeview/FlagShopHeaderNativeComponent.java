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
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.android.nav.Nav;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import kotlin.Triple;
import tb.a1v;
import tb.brf;
import tb.brp;
import tb.ckf;
import tb.d1a;
import tb.jpu;
import tb.kew;
import tb.khu;
import tb.npp;
import tb.t2o;
import tb.tk9;
import tb.wsq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShopHeaderNativeComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ShopDataParser A;
    public String B;
    public String C;
    public int C0;
    public String D;
    public String E;
    public d1a<xhv> E0;
    public String F;
    public boolean F0;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    public ViewGroup P;
    public FrameLayout Q;
    public FrameLayout R;
    public TextView S;
    public TextView T;
    public TUrlImageView U;
    public TUrlImageView V;
    public TUrlImageView W;
    public TUrlImageView X;
    public TUrlImageView Y;
    public float Z;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3193a;
    public ValueAnimator b;
    public LinearLayout c;
    public TUrlImageView d;
    public View e;
    public String f;
    public String g;
    public String h;
    public String i;
    public TUrlImageView j;
    public String k;
    public String l;
    public String m;
    public LinearLayout n;
    public String o;
    public tk9 p;
    public FrameLayout q;
    public LinearLayout r;
    public TextView s;
    public TUrlImageView t;
    public JSONArray t0;
    public TUrlImageView u;
    public View u0;
    public TextView v;
    public View v0;
    public TUrlImageView w;
    public boolean w0;
    public TUrlImageView x;
    public boolean x0;
    public LinearLayout y;
    public boolean y0;
    public FrameLayout z;
    public final int a0 = kew.v(200);
    public final int b0 = kew.v(88);
    public final String c0 = "https://img.alicdn.com/imgextra/i4/O1CN01AoieOd1YarKEpT3lD_!!6000000003076-2-tps-60-60.png";
    public final String d0 = "https://img.alicdn.com/imgextra/i1/O1CN01orPion1EpFS9EgHZX_!!6000000000400-2-tps-60-60.png";
    public final String e0 = "https://img.alicdn.com/imgextra/i4/O1CN01UZCshu1byciwn6iVo_!!6000000003534-2-tps-60-60.png";
    public final String f0 = "https://img.alicdn.com/imgextra/i3/O1CN01LPT7C11qrUnPhldLh_!!6000000005549-2-tps-60-60.png";
    public final String g0 = "https://img.alicdn.com/imgextra/i2/O1CN017LoGP51e7RaCPwN0O_!!6000000003824-2-tps-60-60.png";
    public final String h0 = "https://img.alicdn.com/imgextra/i3/O1CN01A4IHBM1chVXQrdLya_!!6000000003632-2-tps-60-60.png";
    public final String i0 = "https://gw.alicdn.com/imgextra/i2/O1CN01ysnaqe1loDlyQEX4x_!!6000000004865-54-tps-72-72.apng";
    public final String j0 = "https://img.alicdn.com/imgextra/i4/O1CN01vSq81P1UiPH9DJO8a_!!6000000002551-54-tps-200-200.apng";
    public final int k0 = -15656659;
    public final int l0 = kew.c(1120557, 0.6f);
    public final int m0 = -11509638;
    public final int n0 = -1;
    public final int o0 = kew.c(16777215, 0.6f);
    public final int p0 = kew.c(16777215, 0.8f);
    public final int q0 = kew.c(16777215, 0.1f);
    public final int r0 = kew.c(14672615, 1.0f);
    public final int s0 = kew.c(13291479, 0.3f);
    public final Drawable z0 = kew.u(-1, null, null, kew.v(12), 0, 0, 0, 0, 0, 0, 1014, null);
    public final Drawable A0 = kew.u(-788744, null, null, kew.v(12), 0, 0, 0, 0, 0, 0, 1014, null);
    public final Drawable B0 = kew.u(kew.c(3355443, 0.4f), null, null, kew.v(12), 0, 0, 0, 0, 0, 0, 1014, null);
    public final Handler D0 = new Handler();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUrlImageView f3194a;
        public final /* synthetic */ FlagShopHeaderNativeComponent b;

        public a(TUrlImageView tUrlImageView, FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
            this.f3194a = tUrlImageView;
            this.b = flagShopHeaderNativeComponent;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else if (i3 - i > 0) {
                this.f3194a.removeOnLayoutChangeListener(this);
                FlagShopHeaderNativeComponent.E(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ FlagShopHeaderNativeComponent f3196a;

            public a(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
                this.f3196a = flagShopHeaderNativeComponent;
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
                    FlagShopHeaderNativeComponent.G(this.f3196a, ((Float) animatedValue).floatValue());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!FlagShopHeaderNativeComponent.this.R()) {
                FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = FlagShopHeaderNativeComponent.this;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(FlagShopHeaderNativeComponent.c(flagShopHeaderNativeComponent), 1.0f);
                FlagShopHeaderNativeComponent flagShopHeaderNativeComponent2 = FlagShopHeaderNativeComponent.this;
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new a(flagShopHeaderNativeComponent2));
                ofFloat.start();
                xhv xhvVar = xhv.INSTANCE;
                FlagShopHeaderNativeComponent.x(flagShopHeaderNativeComponent, ofFloat);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ FlagShopHeaderNativeComponent f3198a;

            public a(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
                this.f3198a = flagShopHeaderNativeComponent;
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
                    FlagShopHeaderNativeComponent.G(this.f3198a, ((Float) animatedValue).floatValue());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
        }

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!FlagShopHeaderNativeComponent.this.R()) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(FlagShopHeaderNativeComponent.c(FlagShopHeaderNativeComponent.this), 0.0f);
                FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = FlagShopHeaderNativeComponent.this;
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new a(flagShopHeaderNativeComponent));
                ofFloat.start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FlagShopHeaderNativeComponent.E(FlagShopHeaderNativeComponent.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                FlagShopHeaderNativeComponent.a(FlagShopHeaderNativeComponent.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class h implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f3203a;
        public final /* synthetic */ FlagShopHeaderNativeComponent b;

        public h(FrameLayout frameLayout, FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
            this.f3203a = frameLayout;
            this.b = flagShopHeaderNativeComponent;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            Context context = this.f3203a.getContext();
            ckf.f(context, "context");
            khu.h(context, FlagShopHeaderNativeComponent.e(this.b));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class i implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LinearLayout f3204a;
        public final /* synthetic */ FlagShopHeaderNativeComponent b;

        public i(LinearLayout linearLayout, FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
            this.f3204a = linearLayout;
            this.b = flagShopHeaderNativeComponent;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            Context context = this.f3204a.getContext();
            ckf.f(context, "context");
            khu.h(context, FlagShopHeaderNativeComponent.e(this.b));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class j implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            LinearLayout j = FlagShopHeaderNativeComponent.j(FlagShopHeaderNativeComponent.this);
            if (j != null) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    j.scrollTo(0, ((Integer) animatedValue).intValue());
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
    public static final class k extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/FlagShopHeaderNativeComponent$scrollSearchWord$1$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                FlagShopHeaderNativeComponent.d(FlagShopHeaderNativeComponent.this).post(new a(FlagShopHeaderNativeComponent.this));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ FlagShopHeaderNativeComponent f3207a;

            public a(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
                this.f3207a = flagShopHeaderNativeComponent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LinearLayout j = FlagShopHeaderNativeComponent.j(this.f3207a);
                String str = null;
                if (j != null) {
                    j.scrollTo(0, 0);
                    FlagShopHeaderNativeComponent flagShopHeaderNativeComponent = this.f3207a;
                    FlagShopHeaderNativeComponent.D(flagShopHeaderNativeComponent, FlagShopHeaderNativeComponent.r(flagShopHeaderNativeComponent) + 1);
                    int r = FlagShopHeaderNativeComponent.r(flagShopHeaderNativeComponent);
                    JSONArray n = FlagShopHeaderNativeComponent.n(this.f3207a);
                    ckf.d(n);
                    FlagShopHeaderNativeComponent.D(flagShopHeaderNativeComponent, r % n.size());
                    JSONArray n2 = FlagShopHeaderNativeComponent.n(this.f3207a);
                    ckf.d(n2);
                    Object obj = n2.get(FlagShopHeaderNativeComponent.r(this.f3207a));
                    JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
                    if (jSONObject != null) {
                        FlagShopHeaderNativeComponent flagShopHeaderNativeComponent2 = this.f3207a;
                        FlagShopHeaderNativeComponent.C(flagShopHeaderNativeComponent2, jSONObject.getString("displayText"));
                        FlagShopHeaderNativeComponent.B(flagShopHeaderNativeComponent2, jSONObject.getString("icon"));
                        FlagShopHeaderNativeComponent.z(flagShopHeaderNativeComponent2, jSONObject.getString("displayPicUrl"));
                        FlagShopHeaderNativeComponent.w(flagShopHeaderNativeComponent2, jSONObject.getString("benefitType"));
                        FlagShopHeaderNativeComponent.y(flagShopHeaderNativeComponent2, jSONObject.getString("sapUrl"));
                        FlagShopHeaderNativeComponent.A(flagShopHeaderNativeComponent2, jSONObject.getString("srpUrl"));
                    }
                    TUrlImageView h = FlagShopHeaderNativeComponent.h(this.f3207a);
                    if (h != null) {
                        h.setImageUrl(FlagShopHeaderNativeComponent.p(this.f3207a));
                    }
                    String m = FlagShopHeaderNativeComponent.m(this.f3207a);
                    if (m == null || wsq.a0(m)) {
                        TextView t = FlagShopHeaderNativeComponent.t(this.f3207a);
                        if (t != null) {
                            t.setText(FlagShopHeaderNativeComponent.q(this.f3207a));
                        }
                        TextView t2 = FlagShopHeaderNativeComponent.t(this.f3207a);
                        if (t2 != null) {
                            t2.setVisibility(0);
                        }
                        TUrlImageView h2 = FlagShopHeaderNativeComponent.h(this.f3207a);
                        if (h2 != null) {
                            h2.setVisibility(0);
                        }
                        TUrlImageView f = FlagShopHeaderNativeComponent.f(this.f3207a);
                        if (f != null) {
                            f.setVisibility(8);
                        }
                    } else {
                        TUrlImageView f2 = FlagShopHeaderNativeComponent.f(this.f3207a);
                        if (f2 != null) {
                            f2.setImageUrl(FlagShopHeaderNativeComponent.m(this.f3207a));
                        }
                        TextView t3 = FlagShopHeaderNativeComponent.t(this.f3207a);
                        if (t3 != null) {
                            t3.setVisibility(8);
                        }
                        TUrlImageView h3 = FlagShopHeaderNativeComponent.h(this.f3207a);
                        if (h3 != null) {
                            h3.setVisibility(8);
                        }
                        TUrlImageView f3 = FlagShopHeaderNativeComponent.f(this.f3207a);
                        if (f3 != null) {
                            f3.setVisibility(0);
                        }
                    }
                    JSONArray n3 = FlagShopHeaderNativeComponent.n(this.f3207a);
                    ckf.d(n3);
                    int r2 = (FlagShopHeaderNativeComponent.r(this.f3207a) + 1) % n3.size();
                    JSONArray n4 = FlagShopHeaderNativeComponent.n(this.f3207a);
                    ckf.d(n4);
                    Object obj2 = n4.get(r2);
                    JSONObject jSONObject2 = obj2 instanceof JSONObject ? (JSONObject) obj2 : null;
                    TUrlImageView i = FlagShopHeaderNativeComponent.i(this.f3207a);
                    if (i != null) {
                        i.setImageUrl(jSONObject2 == null ? null : jSONObject2.getString("icon"));
                    }
                    String string = jSONObject2 == null ? null : jSONObject2.getString("displayPicUrl");
                    if (string == null || wsq.a0(string)) {
                        TextView u = FlagShopHeaderNativeComponent.u(this.f3207a);
                        if (u != null) {
                            if (jSONObject2 != null) {
                                str = jSONObject2.getString("displayText");
                            }
                            u.setText(str);
                        }
                        TextView u2 = FlagShopHeaderNativeComponent.u(this.f3207a);
                        if (u2 != null) {
                            u2.setVisibility(0);
                        }
                        TUrlImageView i2 = FlagShopHeaderNativeComponent.i(this.f3207a);
                        if (i2 != null) {
                            i2.setVisibility(0);
                        }
                        TUrlImageView g = FlagShopHeaderNativeComponent.g(this.f3207a);
                        if (g != null) {
                            g.setVisibility(8);
                        }
                    } else {
                        TUrlImageView g2 = FlagShopHeaderNativeComponent.g(this.f3207a);
                        if (g2 != null) {
                            if (jSONObject2 != null) {
                                str = jSONObject2.getString("displayPicUrl");
                            }
                            g2.setImageUrl(str);
                        }
                        TextView u3 = FlagShopHeaderNativeComponent.u(this.f3207a);
                        if (u3 != null) {
                            u3.setVisibility(8);
                        }
                        TUrlImageView i3 = FlagShopHeaderNativeComponent.i(this.f3207a);
                        if (i3 != null) {
                            i3.setVisibility(8);
                        }
                        TUrlImageView g3 = FlagShopHeaderNativeComponent.g(this.f3207a);
                        if (g3 != null) {
                            g3.setVisibility(0);
                        }
                    }
                    FlagShopHeaderNativeComponent.E(this.f3207a);
                    return;
                }
                ckf.y("llSearchWord");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FlagShopHeaderNativeComponent.v(FlagShopHeaderNativeComponent.this);
            FlagShopHeaderNativeComponent.F(FlagShopHeaderNativeComponent.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class m implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                khu.h(FlagShopHeaderNativeComponent.this.S(), FlagShopHeaderNativeComponent.e(FlagShopHeaderNativeComponent.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class n implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            d1a<xhv> Y = FlagShopHeaderNativeComponent.this.Y();
            if (Y != null) {
                Y.invoke();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class o implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FlagShopHeaderNativeComponent.E(FlagShopHeaderNativeComponent.this);
            }
        }
    }

    static {
        t2o.a(766509955);
    }

    public FlagShopHeaderNativeComponent(Context context) {
        ckf.g(context, "context");
        this.f3193a = context;
    }

    public static final /* synthetic */ void A(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b200af5", new Object[]{flagShopHeaderNativeComponent, str});
        } else {
            flagShopHeaderNativeComponent.O = str;
        }
    }

    public static final /* synthetic */ void B(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a1a0fe", new Object[]{flagShopHeaderNativeComponent, str});
        } else {
            flagShopHeaderNativeComponent.I = str;
        }
    }

    public static /* synthetic */ void B0(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent, String str, Map map, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59c1974", new Object[]{flagShopHeaderNativeComponent, str, map, new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            map = null;
        }
        flagShopHeaderNativeComponent.A0(str, map);
    }

    public static final /* synthetic */ void C(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca42dcc1", new Object[]{flagShopHeaderNativeComponent, str});
        } else {
            flagShopHeaderNativeComponent.H = str;
        }
    }

    public static final /* synthetic */ void D(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1e8e1e2", new Object[]{flagShopHeaderNativeComponent, new Integer(i2)});
        } else {
            flagShopHeaderNativeComponent.C0 = i2;
        }
    }

    public static final /* synthetic */ void E(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c43e5068", new Object[]{flagShopHeaderNativeComponent});
        } else {
            flagShopHeaderNativeComponent.r0();
        }
    }

    public static final /* synthetic */ void F(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93938677", new Object[]{flagShopHeaderNativeComponent});
        } else {
            flagShopHeaderNativeComponent.s0();
        }
    }

    public static final /* synthetic */ void G(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef43b3", new Object[]{flagShopHeaderNativeComponent, new Float(f2)});
        } else {
            flagShopHeaderNativeComponent.x0(f2);
        }
    }

    public static /* synthetic */ Triple I(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent, LinearLayout linearLayout, String str, String str2, String str3, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Triple) ipChange.ipc$dispatch("b7bf49af", new Object[]{flagShopHeaderNativeComponent, linearLayout, str, str2, str3, new Integer(i2), obj});
        }
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        return flagShopHeaderNativeComponent.H(linearLayout, str, str2, str3);
    }

    public static final /* synthetic */ void a(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89d8e94", new Object[]{flagShopHeaderNativeComponent});
        } else {
            flagShopHeaderNativeComponent.N();
        }
    }

    public static final /* synthetic */ String b(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ddee8802", new Object[]{flagShopHeaderNativeComponent});
        }
        return flagShopHeaderNativeComponent.K;
    }

    public static final /* synthetic */ float c(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f2920f0", new Object[]{flagShopHeaderNativeComponent})).floatValue();
        }
        return flagShopHeaderNativeComponent.Z;
    }

    public static final /* synthetic */ Handler d(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a23f5bef", new Object[]{flagShopHeaderNativeComponent});
        }
        return flagShopHeaderNativeComponent.D0;
    }

    public static final /* synthetic */ String e(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3d97324", new Object[]{flagShopHeaderNativeComponent});
        }
        return flagShopHeaderNativeComponent.o;
    }

    public static final /* synthetic */ TUrlImageView f(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("67b28a49", new Object[]{flagShopHeaderNativeComponent});
        }
        return flagShopHeaderNativeComponent.u;
    }

    public static final /* synthetic */ TUrlImageView g(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("ea007db7", new Object[]{flagShopHeaderNativeComponent});
        }
        return flagShopHeaderNativeComponent.x;
    }

    public static final /* synthetic */ TUrlImageView h(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("894331c9", new Object[]{flagShopHeaderNativeComponent});
        }
        return flagShopHeaderNativeComponent.t;
    }

    public static final /* synthetic */ TUrlImageView i(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("fa84c637", new Object[]{flagShopHeaderNativeComponent});
        }
        return flagShopHeaderNativeComponent.w;
    }

    public static final /* synthetic */ LinearLayout j(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("ea608ca2", new Object[]{flagShopHeaderNativeComponent});
        }
        return flagShopHeaderNativeComponent.r;
    }

    public static final /* synthetic */ String k(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42d817b2", new Object[]{flagShopHeaderNativeComponent});
        }
        return flagShopHeaderNativeComponent.N;
    }

    public static final /* synthetic */ String l(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad6d8401", new Object[]{flagShopHeaderNativeComponent});
        }
        return flagShopHeaderNativeComponent.M;
    }

    public static final /* synthetic */ String m(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5d591a0", new Object[]{flagShopHeaderNativeComponent});
        }
        return flagShopHeaderNativeComponent.J;
    }

    public static final /* synthetic */ JSONArray n(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("249b4902", new Object[]{flagShopHeaderNativeComponent});
        }
        return flagShopHeaderNativeComponent.t0;
    }

    public static final /* synthetic */ String o(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77d04e09", new Object[]{flagShopHeaderNativeComponent});
        }
        return flagShopHeaderNativeComponent.O;
    }

    public static final /* synthetic */ String p(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3f459e0", new Object[]{flagShopHeaderNativeComponent});
        }
        return flagShopHeaderNativeComponent.I;
    }

    public static final /* synthetic */ String q(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd045255", new Object[]{flagShopHeaderNativeComponent});
        }
        return flagShopHeaderNativeComponent.H;
    }

    public static final /* synthetic */ int r(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62b076c0", new Object[]{flagShopHeaderNativeComponent})).intValue();
        }
        return flagShopHeaderNativeComponent.C0;
    }

    public static final /* synthetic */ ShopDataParser s(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("96b35549", new Object[]{flagShopHeaderNativeComponent});
        }
        return flagShopHeaderNativeComponent.A;
    }

    public static final /* synthetic */ TextView t(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("dcc26041", new Object[]{flagShopHeaderNativeComponent});
        }
        return flagShopHeaderNativeComponent.s;
    }

    public static final /* synthetic */ TextView u(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("26d754df", new Object[]{flagShopHeaderNativeComponent});
        }
        return flagShopHeaderNativeComponent.v;
    }

    public static final /* synthetic */ void v(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd006e96", new Object[]{flagShopHeaderNativeComponent});
        } else {
            flagShopHeaderNativeComponent.j0();
        }
    }

    public static final /* synthetic */ void w(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4231ea1c", new Object[]{flagShopHeaderNativeComponent, str});
        } else {
            flagShopHeaderNativeComponent.K = str;
        }
    }

    public static final /* synthetic */ void x(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ad02973", new Object[]{flagShopHeaderNativeComponent, valueAnimator});
        } else {
            flagShopHeaderNativeComponent.b = valueAnimator;
        }
    }

    public static final /* synthetic */ void y(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c111766c", new Object[]{flagShopHeaderNativeComponent, str});
        } else {
            flagShopHeaderNativeComponent.N = str;
        }
    }

    public static final /* synthetic */ void z(FlagShopHeaderNativeComponent flagShopHeaderNativeComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772c143e", new Object[]{flagShopHeaderNativeComponent, str});
        } else {
            flagShopHeaderNativeComponent.J = str;
        }
    }

    public final void A0(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3531cd18", new Object[]{this, str, map});
        } else {
            a1v.m(ShopConstants.PAGE_SHOP, str, a0(map));
        }
    }

    public final Triple<TextView, TUrlImageView, TUrlImageView> H(LinearLayout linearLayout, String str, String str2, String str3) {
        LinearLayout.LayoutParams layoutParams;
        int i2;
        LinearLayout.LayoutParams layoutParams2;
        int i3;
        int i4 = 0;
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
        textView.setTextColor(this.n0);
        textView.setText(str);
        if (str3 == null || wsq.a0(str3)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
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
            i3 = 8;
        } else {
            i3 = 0;
        }
        tUrlImageView.setVisibility(i3);
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
            i4 = 8;
        }
        tUrlImageView2.setVisibility(i4);
        tUrlImageView2.addOnLayoutChangeListener(new a(tUrlImageView2, this));
        linearLayout2.addView(tUrlImageView2);
        linearLayout.addView(linearLayout2);
        return new Triple<>(textView, tUrlImageView2, tUrlImageView);
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2797ae2a", new Object[]{this});
            return;
        }
        this.F0 = false;
        npp.Companion.f("FlagShopHeaderNativeComponent animateDown ");
        ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            viewGroup.post(new b());
        }
    }

    public final void K(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b1a429", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        npp.Companion.f(ckf.p("FlagShopHeaderNativeComponent moveSize ", Integer.valueOf(i2)));
        if (i2 <= 0) {
            i0(i2 + i3, i3);
            L();
            return;
        }
        h0(i2 + i3, i3);
        J();
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79247fe3", new Object[]{this});
            return;
        }
        this.F0 = false;
        ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            viewGroup.post(new c());
        }
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5272f04", new Object[]{this});
            return;
        }
        Activity activity = (Activity) this.f3193a;
        ShopDataParser shopDataParser = this.A;
        if (shopDataParser != null) {
            String P = shopDataParser.P();
            ShopDataParser shopDataParser2 = this.A;
            if (shopDataParser2 != null) {
                ShopMoreUtils.INSTANCE.w(activity, shopDataParser, P, shopDataParser2.R(), null, null, null);
                ShopDataParser shopDataParser3 = this.A;
                if (shopDataParser3 != null) {
                    if (!shopDataParser3.H1()) {
                        ShopDataParser shopDataParser4 = this.A;
                        if (shopDataParser4 != null) {
                            brp.g(shopDataParser4);
                        } else {
                            ckf.y("shopData");
                            throw null;
                        }
                    }
                    B0(this, "Page_Shop_Page_Shop_Button-More", null, 2, null);
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

    public final void O(ShopDXEngine shopDXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d09bde0", new Object[]{this, shopDXEngine});
            return;
        }
        ckf.g(shopDXEngine, "shopDXEngine");
        tk9.a aVar = tk9.Companion;
        ShopDataParser shopDataParser = this.A;
        if (shopDataParser != null) {
            tk9 a2 = aVar.a(shopDataParser, shopDXEngine);
            if (a2 != null) {
                this.p = a2;
                FrameLayout frameLayout = this.R;
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

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("610296e2", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.U;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(this.C);
        }
        W().setImageUrl(this.e0);
        TUrlImageView tUrlImageView2 = this.W;
        if (tUrlImageView2 != null) {
            tUrlImageView2.setImageUrl(this.c0);
            TUrlImageView tUrlImageView3 = this.X;
            if (tUrlImageView3 != null) {
                tUrlImageView3.setImageUrl(this.g0);
                TextView textView = this.T;
                if (textView != null) {
                    textView.setTextColor(this.n0);
                }
                TextView textView2 = this.S;
                if (textView2 != null) {
                    textView2.setTextColor(this.o0);
                    TextView textView3 = this.s;
                    if (textView3 != null) {
                        textView3.setTextColor(this.p0);
                    }
                    TextView textView4 = this.s;
                    if (textView4 != null) {
                        textView4.setHintTextColor(this.p0);
                    }
                    TextView textView5 = this.v;
                    if (textView5 != null) {
                        textView5.setTextColor(this.p0);
                    }
                    TextView textView6 = this.v;
                    if (textView6 != null) {
                        textView6.setHintTextColor(this.p0);
                    }
                    FrameLayout frameLayout = this.Q;
                    if (frameLayout != null) {
                        frameLayout.setBackground(this.B0);
                        if (this.w0) {
                            TUrlImageView tUrlImageView4 = this.V;
                            if (tUrlImageView4 != null) {
                                tUrlImageView4.setImageUrl(this.l);
                                String str = this.g;
                                if (str == null || wsq.a0(str)) {
                                    TUrlImageView tUrlImageView5 = this.j;
                                    if (tUrlImageView5 != null) {
                                        tUrlImageView5.setImageUrl(this.i);
                                    }
                                } else {
                                    TUrlImageView tUrlImageView6 = this.j;
                                    if (tUrlImageView6 != null) {
                                        tUrlImageView6.setImageUrl(this.g);
                                    }
                                }
                            } else {
                                ckf.y("ivLogo");
                                throw null;
                            }
                        } else {
                            TUrlImageView tUrlImageView7 = this.V;
                            if (tUrlImageView7 != null) {
                                tUrlImageView7.setImageUrl(this.E);
                            } else {
                                ckf.y("ivLogo");
                                throw null;
                            }
                        }
                        View view = this.u0;
                        if (view != null) {
                            view.setBackgroundColor(this.q0);
                            View view2 = this.v0;
                            if (view2 != null) {
                                view2.setBackgroundColor(this.q0);
                            } else {
                                ckf.y("fansDivider");
                                throw null;
                            }
                        } else {
                            ckf.y("searchDivider");
                            throw null;
                        }
                    } else {
                        ckf.y("flSearchBar");
                        throw null;
                    }
                } else {
                    ckf.y("tvFans");
                    throw null;
                }
            } else {
                ckf.y("ivSearch");
                throw null;
            }
        } else {
            ckf.y("ivMore");
            throw null;
        }
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116da808", new Object[]{this});
            return;
        }
        npp.Companion.f("FlagShopHeaderNativeComponent fold ");
        this.F0 = true;
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        x0(0.0f);
    }

    public final boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d90c78d7", new Object[]{this})).booleanValue();
        }
        return this.F0;
    }

    public final Context S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f3193a;
    }

    public final int T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8fa291f8", new Object[]{this})).intValue();
        }
        return this.b0;
    }

    public final int U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cdda4f06", new Object[]{this})).intValue();
        }
        return this.a0;
    }

    public final FrameLayout V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2021be25", new Object[]{this});
        }
        FrameLayout frameLayout = this.q;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("honorContainer");
        throw null;
    }

    public final TUrlImageView W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("9923a62b", new Object[]{this});
        }
        TUrlImageView tUrlImageView = this.Y;
        if (tUrlImageView != null) {
            return tUrlImageView;
        }
        ckf.y("ivBack");
        throw null;
    }

    public final LinearLayout X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("2bcbfa1c", new Object[]{this});
        }
        LinearLayout linearLayout = this.c;
        if (linearLayout != null) {
            return linearLayout;
        }
        ckf.y("llSearch");
        throw null;
    }

    public final d1a<xhv> Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("abadfd7e", new Object[]{this});
        }
        return this.E0;
    }

    public final String Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8e78229", new Object[]{this});
        }
        return this.L;
    }

    public final HashMap<String, String> a0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("719e0466", new Object[]{this, map});
        }
        ShopDataParser shopDataParser = this.A;
        if (shopDataParser != null) {
            HashMap<String, String> l1 = shopDataParser.l1();
            ShopDataParser shopDataParser2 = this.A;
            if (shopDataParser2 != null) {
                l1.put("shop_id", shopDataParser2.W0());
                ShopDataParser shopDataParser3 = this.A;
                if (shopDataParser3 != null) {
                    l1.put("seller_id", shopDataParser3.N0());
                    ShopDataParser shopDataParser4 = this.A;
                    if (shopDataParser4 != null) {
                        l1.put("identityCode", shopDataParser4.s0());
                        ShopDataParser shopDataParser5 = this.A;
                        if (shopDataParser5 != null) {
                            l1.put("industryShop", shopDataParser5.u0());
                            ShopDataParser shopDataParser6 = this.A;
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

    public final void c0(ViewGroup viewGroup) {
        LinearLayout linearLayout;
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b59e761b", new Object[]{this, viewGroup});
            return;
        }
        FrameLayout frameLayout2 = new FrameLayout(viewGroup.getContext());
        this.P = frameLayout2;
        frameLayout2.setClipChildren(false);
        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.LayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams)).width = -1;
            frameLayout2.setLayoutParams(layoutParams);
        } else {
            ViewGroup.LayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.width = -1;
            xhv xhvVar = xhv.INSTANCE;
            frameLayout2.setLayoutParams(marginLayoutParams);
        }
        LinearLayout linearLayout2 = new LinearLayout(frameLayout2.getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout2.setLayoutParams(layoutParams2);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar2 = xhv.INSTANCE;
            linearLayout2.setLayoutParams(marginLayoutParams2);
        }
        m0(linearLayout2);
        ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            ((ViewGroup.LayoutParams) marginLayoutParams3).width = -1;
            marginLayoutParams3.height = T();
            linearLayout2.setLayoutParams(layoutParams3);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) marginLayoutParams4).width = -1;
            marginLayoutParams4.height = T();
            xhv xhvVar3 = xhv.INSTANCE;
            linearLayout2.setLayoutParams(marginLayoutParams4);
        }
        TUrlImageView tUrlImageView = new TUrlImageView(linearLayout2.getContext());
        ViewGroup.LayoutParams layoutParams4 = tUrlImageView.getLayoutParams();
        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView.setLayoutParams(layoutParams4);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams5 = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar4 = xhv.INSTANCE;
            tUrlImageView.setLayoutParams(marginLayoutParams5);
        }
        l0(tUrlImageView);
        tUrlImageView.setPadding(kew.v(12), 0, kew.v(12), 0);
        ViewGroup.LayoutParams layoutParams5 = tUrlImageView.getLayoutParams();
        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams5;
            marginLayoutParams6.width = kew.v(64);
            marginLayoutParams6.height = kew.v(64);
            marginLayoutParams6.setMarginStart(kew.v(20));
            marginLayoutParams6.setMarginEnd(kew.v(4));
            tUrlImageView.setLayoutParams(layoutParams5);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams7 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams7.width = kew.v(64);
            marginLayoutParams7.height = kew.v(64);
            marginLayoutParams7.setMarginStart(kew.v(20));
            marginLayoutParams7.setMarginEnd(kew.v(4));
            xhv xhvVar5 = xhv.INSTANCE;
            tUrlImageView.setLayoutParams(marginLayoutParams7);
        }
        linearLayout2.addView(tUrlImageView);
        xhv xhvVar6 = xhv.INSTANCE;
        FrameLayout frameLayout3 = new FrameLayout(linearLayout2.getContext());
        this.Q = frameLayout3;
        ViewGroup.LayoutParams layoutParams6 = frameLayout3.getLayoutParams();
        LinearLayout.LayoutParams layoutParams7 = null;
        LinearLayout.LayoutParams layoutParams8 = layoutParams6 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams6 : null;
        if (layoutParams8 == null) {
            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) layoutParams9).width = -1;
            layoutParams9.height = kew.v(72);
            layoutParams9.weight = 1.0f;
            frameLayout3.setLayoutParams(layoutParams9);
        } else {
            ((ViewGroup.LayoutParams) layoutParams8).width = -1;
            layoutParams8.height = kew.v(72);
            layoutParams8.weight = 1.0f;
        }
        LinearLayout linearLayout3 = new LinearLayout(frameLayout3.getContext());
        linearLayout3.setOrientation(1);
        ViewGroup.LayoutParams layoutParams10 = linearLayout3.getLayoutParams();
        if (layoutParams10 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout3.setLayoutParams(layoutParams10);
        } else {
            linearLayout3.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.r = linearLayout3;
        ViewGroup.LayoutParams layoutParams11 = linearLayout3.getLayoutParams();
        FrameLayout.LayoutParams layoutParams12 = layoutParams11 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams11 : null;
        if (layoutParams12 == null) {
            FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) layoutParams13).width = -1;
            ((ViewGroup.LayoutParams) layoutParams13).height = -1;
            layoutParams13.setMarginEnd(kew.v(88));
            linearLayout3.setLayoutParams(layoutParams13);
        } else {
            ((ViewGroup.LayoutParams) layoutParams12).width = -1;
            ((ViewGroup.LayoutParams) layoutParams12).height = -1;
            layoutParams12.setMarginEnd(kew.v(88));
        }
        Triple<TextView, TUrlImageView, TUrlImageView> H = H(linearLayout3, this.H, this.I, this.J);
        this.s = H.getFirst();
        this.t = H.getSecond();
        this.u = H.getThird();
        JSONArray jSONArray = this.t0;
        if (jSONArray == null || jSONArray.size() <= 1) {
            linearLayout = linearLayout3;
            frameLayout = frameLayout3;
        } else {
            JSONArray jSONArray2 = this.t0;
            ckf.d(jSONArray2);
            Object obj = jSONArray2.get(1);
            JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
            linearLayout = linearLayout3;
            frameLayout = frameLayout3;
            Triple I = I(this, linearLayout3, jSONObject == null ? null : jSONObject.getString("displayText"), jSONObject == null ? null : jSONObject.getString("icon"), null, 4, null);
            this.v = (TextView) I.getFirst();
            this.w = (TUrlImageView) I.getSecond();
            this.x = (TUrlImageView) I.getThird();
        }
        linearLayout.post(new d());
        linearLayout.setOnClickListener(new e(linearLayout));
        frameLayout.addView(linearLayout);
        View view = new View(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams14 = view.getLayoutParams();
        if (layoutParams14 instanceof ViewGroup.MarginLayoutParams) {
            view.setLayoutParams(layoutParams14);
        } else {
            view.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.u0 = view;
        ViewGroup.LayoutParams layoutParams15 = view.getLayoutParams();
        FrameLayout.LayoutParams layoutParams16 = layoutParams15 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams15 : null;
        if (layoutParams16 == null) {
            FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams17.width = kew.v(2);
            layoutParams17.height = kew.v(32);
            layoutParams17.setMarginEnd(kew.v(88));
            layoutParams17.gravity = 8388629;
            view.setLayoutParams(layoutParams17);
        } else {
            layoutParams16.width = kew.v(2);
            layoutParams16.height = kew.v(32);
            layoutParams16.setMarginEnd(kew.v(88));
            layoutParams16.gravity = 8388629;
        }
        view.setBackgroundColor(this.q0);
        frameLayout.addView(view);
        TUrlImageView tUrlImageView2 = new TUrlImageView(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams18 = tUrlImageView2.getLayoutParams();
        if (layoutParams18 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView2.setLayoutParams(layoutParams18);
        } else {
            tUrlImageView2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.X = tUrlImageView2;
        int v = kew.v(10);
        tUrlImageView2.setPadding(v, v, v, v);
        ViewGroup.LayoutParams layoutParams19 = tUrlImageView2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams20 = layoutParams19 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams19 : null;
        if (layoutParams20 == null) {
            FrameLayout.LayoutParams layoutParams21 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams21.width = kew.v(60);
            layoutParams21.height = kew.v(60);
            layoutParams21.setMarginEnd(kew.v(15));
            layoutParams21.gravity = 8388629;
            tUrlImageView2.setLayoutParams(layoutParams21);
        } else {
            layoutParams20.width = kew.v(60);
            layoutParams20.height = kew.v(60);
            layoutParams20.setMarginEnd(kew.v(15));
            layoutParams20.gravity = 8388629;
        }
        tUrlImageView2.setOnClickListener(new f(tUrlImageView2));
        frameLayout.addView(tUrlImageView2);
        linearLayout2.addView(frameLayout);
        TUrlImageView tUrlImageView3 = new TUrlImageView(linearLayout2.getContext());
        ViewGroup.LayoutParams layoutParams22 = tUrlImageView3.getLayoutParams();
        if (layoutParams22 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView3.setLayoutParams(layoutParams22);
        } else {
            tUrlImageView3.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.W = tUrlImageView3;
        tUrlImageView3.setPadding(kew.v(12), 0, kew.v(12), 0);
        ViewGroup.LayoutParams layoutParams23 = tUrlImageView3.getLayoutParams();
        if (layoutParams23 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams23;
            marginLayoutParams8.width = kew.v(64);
            marginLayoutParams8.height = kew.v(64);
            marginLayoutParams8.setMarginEnd(kew.v(20));
            marginLayoutParams8.setMarginStart(kew.v(4));
            tUrlImageView3.setLayoutParams(layoutParams23);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams9 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams9.width = kew.v(64);
            marginLayoutParams9.height = kew.v(64);
            marginLayoutParams9.setMarginEnd(kew.v(20));
            marginLayoutParams9.setMarginStart(kew.v(4));
            tUrlImageView3.setLayoutParams(marginLayoutParams9);
        }
        tUrlImageView3.setOnClickListener(new g());
        linearLayout2.addView(tUrlImageView3);
        frameLayout2.addView(linearLayout2);
        LinearLayout linearLayout4 = new LinearLayout(frameLayout2.getContext());
        linearLayout4.setOrientation(1);
        ViewGroup.LayoutParams layoutParams24 = linearLayout4.getLayoutParams();
        if (layoutParams24 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout4.setLayoutParams(layoutParams24);
        } else {
            linearLayout4.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        ViewGroup.LayoutParams layoutParams25 = linearLayout4.getLayoutParams();
        if (layoutParams25 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.LayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams25)).width = -1;
            linearLayout4.setLayoutParams(layoutParams25);
        } else {
            ViewGroup.LayoutParams marginLayoutParams10 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams10.width = -1;
            linearLayout4.setLayoutParams(marginLayoutParams10);
        }
        LinearLayout linearLayout5 = new LinearLayout(linearLayout4.getContext());
        linearLayout5.setOrientation(0);
        linearLayout5.setGravity(16);
        ViewGroup.LayoutParams layoutParams26 = linearLayout5.getLayoutParams();
        if (layoutParams26 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout5.setLayoutParams(layoutParams26);
        } else {
            linearLayout5.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.n = linearLayout5;
        linearLayout5.setClipChildren(false);
        linearLayout5.setClipToPadding(false);
        kew.a0(linearLayout5, T() + kew.v(6));
        ViewGroup.LayoutParams layoutParams27 = linearLayout5.getLayoutParams();
        if (layoutParams27 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.LayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams27)).width = -1;
            linearLayout5.setLayoutParams(layoutParams27);
        } else {
            ViewGroup.LayoutParams marginLayoutParams11 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams11.width = -1;
            linearLayout5.setLayoutParams(marginLayoutParams11);
        }
        FrameLayout frameLayout4 = new FrameLayout(linearLayout5.getContext());
        this.z = frameLayout4;
        ViewGroup.LayoutParams layoutParams28 = frameLayout4.getLayoutParams();
        if (layoutParams28 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams12 = (ViewGroup.MarginLayoutParams) layoutParams28;
            marginLayoutParams12.width = kew.v(100);
            marginLayoutParams12.height = kew.v(100);
            marginLayoutParams12.setMarginStart(kew.v(18));
            marginLayoutParams12.setMarginEnd(kew.v(2));
            frameLayout4.setLayoutParams(layoutParams28);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams13 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams13.width = kew.v(100);
            marginLayoutParams13.height = kew.v(100);
            marginLayoutParams13.setMarginStart(kew.v(18));
            marginLayoutParams13.setMarginEnd(kew.v(2));
            frameLayout4.setLayoutParams(marginLayoutParams13);
        }
        frameLayout4.setOnClickListener(new h(frameLayout4, this));
        v0(false);
        FrameLayout frameLayout5 = new FrameLayout(frameLayout4.getContext());
        TUrlImageView tUrlImageView4 = new TUrlImageView(frameLayout5.getContext());
        ViewGroup.LayoutParams layoutParams29 = tUrlImageView4.getLayoutParams();
        if (layoutParams29 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView4.setLayoutParams(layoutParams29);
        } else {
            tUrlImageView4.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.V = tUrlImageView4;
        kew.e0(tUrlImageView4, true, kew.v(12));
        ViewGroup.LayoutParams layoutParams30 = tUrlImageView4.getLayoutParams();
        FrameLayout.LayoutParams layoutParams31 = layoutParams30 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams30 : null;
        if (layoutParams31 == null) {
            FrameLayout.LayoutParams layoutParams32 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams32.gravity = 17;
            if (q0()) {
                layoutParams32.width = kew.v(68);
                layoutParams32.height = kew.v(68);
                kew.e0(tUrlImageView4, true, kew.v(34));
            } else if (p0()) {
                layoutParams32.width = kew.v(64);
                layoutParams32.height = kew.v(64);
                kew.e0(tUrlImageView4, true, kew.v(32));
            } else {
                layoutParams32.width = kew.v(72);
                layoutParams32.height = kew.v(72);
            }
            tUrlImageView4.setLayoutParams(layoutParams32);
        } else {
            layoutParams31.gravity = 17;
            if (q0()) {
                layoutParams31.width = kew.v(68);
                layoutParams31.height = kew.v(68);
                kew.e0(tUrlImageView4, true, kew.v(34));
            } else if (p0()) {
                layoutParams31.width = kew.v(64);
                layoutParams31.height = kew.v(64);
                kew.e0(tUrlImageView4, true, kew.v(32));
            } else {
                layoutParams31.width = kew.v(72);
                layoutParams31.height = kew.v(72);
            }
        }
        frameLayout5.addView(tUrlImageView4);
        if (q0()) {
            TUrlImageView tUrlImageView5 = new TUrlImageView(frameLayout5.getContext());
            ViewGroup.LayoutParams layoutParams33 = tUrlImageView5.getLayoutParams();
            if (layoutParams33 instanceof ViewGroup.MarginLayoutParams) {
                tUrlImageView5.setLayoutParams(layoutParams33);
            } else {
                tUrlImageView5.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            }
            this.e = tUrlImageView5;
            ViewGroup.LayoutParams layoutParams34 = tUrlImageView5.getLayoutParams();
            FrameLayout.LayoutParams layoutParams35 = layoutParams34 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams34 : null;
            if (layoutParams35 == null) {
                FrameLayout.LayoutParams layoutParams36 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams36.width = kew.v(88);
                layoutParams36.height = kew.v(88);
                layoutParams36.gravity = 17;
                tUrlImageView5.setLayoutParams(layoutParams36);
            } else {
                layoutParams35.width = kew.v(88);
                layoutParams35.height = kew.v(88);
                layoutParams35.gravity = 17;
            }
            tUrlImageView5.setSkipAutoSize(true);
            tUrlImageView5.setImageUrl(this.j0);
            frameLayout5.addView(tUrlImageView5);
            TUrlImageView tUrlImageView6 = new TUrlImageView(frameLayout5.getContext());
            ViewGroup.LayoutParams layoutParams37 = tUrlImageView6.getLayoutParams();
            if (layoutParams37 instanceof ViewGroup.MarginLayoutParams) {
                tUrlImageView6.setLayoutParams(layoutParams37);
            } else {
                tUrlImageView6.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            }
            this.d = tUrlImageView6;
            ViewGroup.LayoutParams layoutParams38 = tUrlImageView6.getLayoutParams();
            FrameLayout.LayoutParams layoutParams39 = layoutParams38 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams38 : null;
            if (layoutParams39 == null) {
                FrameLayout.LayoutParams layoutParams40 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams40.width = kew.v(26);
                layoutParams40.height = kew.v(26);
                layoutParams40.gravity = BadgeDrawable.BOTTOM_END;
                layoutParams40.setMarginEnd(kew.v(11));
                layoutParams40.bottomMargin = kew.v(11);
                tUrlImageView6.setLayoutParams(layoutParams40);
            } else {
                layoutParams39.width = kew.v(26);
                layoutParams39.height = kew.v(26);
                layoutParams39.gravity = BadgeDrawable.BOTTOM_END;
                layoutParams39.setMarginEnd(kew.v(11));
                layoutParams39.bottomMargin = kew.v(11);
            }
            tUrlImageView6.setSkipAutoSize(true);
            tUrlImageView6.setImageUrl(this.i0);
            frameLayout5.addView(tUrlImageView6);
        }
        frameLayout4.addView(frameLayout5);
        TUrlImageView tUrlImageView7 = new TUrlImageView(frameLayout4.getContext());
        ViewGroup.LayoutParams layoutParams41 = tUrlImageView7.getLayoutParams();
        if (layoutParams41 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView7.setLayoutParams(layoutParams41);
        } else {
            tUrlImageView7.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        ViewGroup.LayoutParams layoutParams42 = tUrlImageView7.getLayoutParams();
        if (layoutParams42 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams14 = (ViewGroup.MarginLayoutParams) layoutParams42;
            ((ViewGroup.LayoutParams) marginLayoutParams14).width = -1;
            ((ViewGroup.LayoutParams) marginLayoutParams14).height = -1;
            tUrlImageView7.setLayoutParams(layoutParams42);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams15 = new ViewGroup.MarginLayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) marginLayoutParams15).width = -1;
            ((ViewGroup.LayoutParams) marginLayoutParams15).height = -1;
            tUrlImageView7.setLayoutParams(marginLayoutParams15);
        }
        if (p0()) {
            tUrlImageView7.setImageUrl(this.D);
        }
        frameLayout4.addView(tUrlImageView7);
        linearLayout5.addView(frameLayout4);
        LinearLayout linearLayout6 = new LinearLayout(linearLayout5.getContext());
        linearLayout6.setOrientation(1);
        ViewGroup.LayoutParams layoutParams43 = linearLayout6.getLayoutParams();
        if (layoutParams43 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout6.setLayoutParams(layoutParams43);
        } else {
            linearLayout6.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        linearLayout6.setOnClickListener(new i(linearLayout6, this));
        this.y = linearLayout6;
        ViewGroup.LayoutParams layoutParams44 = linearLayout6.getLayoutParams();
        if (layoutParams44 instanceof LinearLayout.LayoutParams) {
            layoutParams7 = (LinearLayout.LayoutParams) layoutParams44;
        }
        if (layoutParams7 == null) {
            LinearLayout.LayoutParams layoutParams45 = new LinearLayout.LayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) layoutParams45).width = -1;
            layoutParams45.weight = 1.0f;
            linearLayout6.setLayoutParams(layoutParams45);
        } else {
            ((ViewGroup.LayoutParams) layoutParams7).width = -1;
            layoutParams7.weight = 1.0f;
        }
        if (this.w0) {
            TUrlImageView tUrlImageView8 = new TUrlImageView(linearLayout6.getContext());
            ViewGroup.LayoutParams layoutParams46 = tUrlImageView8.getLayoutParams();
            if (layoutParams46 instanceof ViewGroup.MarginLayoutParams) {
                tUrlImageView8.setLayoutParams(layoutParams46);
            } else {
                tUrlImageView8.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            }
            this.j = tUrlImageView8;
            ViewGroup.LayoutParams layoutParams47 = tUrlImageView8.getLayoutParams();
            if (layoutParams47 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams16 = (ViewGroup.MarginLayoutParams) layoutParams47;
                marginLayoutParams16.width = kew.v(230);
                marginLayoutParams16.height = kew.v(37);
                tUrlImageView8.setLayoutParams(layoutParams47);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams17 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams17.width = kew.v(230);
                marginLayoutParams17.height = kew.v(37);
                tUrlImageView8.setLayoutParams(marginLayoutParams17);
            }
            linearLayout6.addView(tUrlImageView8);
        } else {
            LinearLayout linearLayout7 = new LinearLayout(linearLayout6.getContext());
            linearLayout7.setOrientation(0);
            linearLayout7.setGravity(16);
            ViewGroup.LayoutParams layoutParams48 = linearLayout7.getLayoutParams();
            if (layoutParams48 instanceof ViewGroup.MarginLayoutParams) {
                linearLayout7.setLayoutParams(layoutParams48);
            } else {
                linearLayout7.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            }
            TextView textView = new TextView(linearLayout7.getContext());
            ViewGroup.LayoutParams layoutParams49 = textView.getLayoutParams();
            if (layoutParams49 instanceof ViewGroup.MarginLayoutParams) {
                textView.setLayoutParams(layoutParams49);
            } else {
                textView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            }
            this.T = textView;
            textView.setText(this.F);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setGravity(17);
            textView.setSingleLine();
            textView.setTextColor(this.k0);
            kew.c0(textView, kew.v(30));
            linearLayout7.addView(textView);
            TUrlImageView tUrlImageView9 = new TUrlImageView(linearLayout7.getContext());
            ViewGroup.LayoutParams layoutParams50 = tUrlImageView9.getLayoutParams();
            if (layoutParams50 instanceof ViewGroup.MarginLayoutParams) {
                tUrlImageView9.setLayoutParams(layoutParams50);
            } else {
                tUrlImageView9.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            }
            tUrlImageView9.setAdjustViewBounds(true);
            ViewGroup.LayoutParams layoutParams51 = tUrlImageView9.getLayoutParams();
            if (layoutParams51 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams18 = (ViewGroup.MarginLayoutParams) layoutParams51;
                marginLayoutParams18.height = kew.v(27);
                marginLayoutParams18.topMargin = kew.v(4);
                marginLayoutParams18.setMarginStart(kew.v(10));
                tUrlImageView9.setLayoutParams(layoutParams51);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams19 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams19.height = kew.v(27);
                marginLayoutParams19.topMargin = kew.v(4);
                marginLayoutParams19.setMarginStart(kew.v(10));
                tUrlImageView9.setLayoutParams(marginLayoutParams19);
            }
            tUrlImageView9.setImageUrl(this.m);
            linearLayout7.addView(tUrlImageView9);
            linearLayout6.addView(linearLayout7);
        }
        LinearLayout linearLayout8 = new LinearLayout(linearLayout6.getContext());
        linearLayout8.setOrientation(0);
        linearLayout8.setGravity(16);
        ViewGroup.LayoutParams layoutParams52 = linearLayout8.getLayoutParams();
        if (layoutParams52 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout8.setLayoutParams(layoutParams52);
        } else {
            linearLayout8.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        ViewGroup.LayoutParams layoutParams53 = linearLayout8.getLayoutParams();
        if (layoutParams53 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams53).topMargin = kew.v(8);
            linearLayout8.setLayoutParams(layoutParams53);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams20 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams20.topMargin = kew.v(8);
            linearLayout8.setLayoutParams(marginLayoutParams20);
        }
        String str = this.B;
        if (str != null && !wsq.a0(str)) {
            TUrlImageView tUrlImageView10 = new TUrlImageView(linearLayout8.getContext());
            ViewGroup.LayoutParams layoutParams54 = tUrlImageView10.getLayoutParams();
            if (layoutParams54 instanceof ViewGroup.MarginLayoutParams) {
                tUrlImageView10.setLayoutParams(layoutParams54);
            } else {
                tUrlImageView10.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            }
            this.U = tUrlImageView10;
            tUrlImageView10.setAdjustViewBounds(true);
            ViewGroup.LayoutParams layoutParams55 = tUrlImageView10.getLayoutParams();
            if (layoutParams55 instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams55).height = kew.v(18);
                tUrlImageView10.setLayoutParams(layoutParams55);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams21 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams21.height = kew.v(18);
                tUrlImageView10.setLayoutParams(marginLayoutParams21);
            }
            linearLayout8.addView(tUrlImageView10);
            View view2 = new View(linearLayout8.getContext());
            ViewGroup.LayoutParams layoutParams56 = view2.getLayoutParams();
            if (layoutParams56 instanceof ViewGroup.MarginLayoutParams) {
                view2.setLayoutParams(layoutParams56);
            } else {
                view2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            }
            this.v0 = view2;
            ViewGroup.LayoutParams layoutParams57 = view2.getLayoutParams();
            if (layoutParams57 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams22 = (ViewGroup.MarginLayoutParams) layoutParams57;
                marginLayoutParams22.width = kew.v(2);
                marginLayoutParams22.height = kew.v(18);
                marginLayoutParams22.setMarginStart(kew.v(10));
                marginLayoutParams22.setMarginEnd(kew.v(10));
                view2.setLayoutParams(layoutParams57);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams23 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams23.width = kew.v(2);
                marginLayoutParams23.height = kew.v(18);
                marginLayoutParams23.setMarginStart(kew.v(10));
                marginLayoutParams23.setMarginEnd(kew.v(10));
                view2.setLayoutParams(marginLayoutParams23);
            }
            view2.setBackgroundColor(this.q0);
            linearLayout8.addView(view2);
        }
        TextView textView2 = new TextView(linearLayout8.getContext());
        ViewGroup.LayoutParams layoutParams58 = textView2.getLayoutParams();
        if (layoutParams58 instanceof ViewGroup.MarginLayoutParams) {
            textView2.setLayoutParams(layoutParams58);
        } else {
            textView2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.S = textView2;
        textView2.setText(this.G);
        kew.c0(textView2, kew.v(20));
        linearLayout8.addView(textView2);
        linearLayout6.addView(linearLayout8);
        linearLayout5.addView(linearLayout6);
        FrameLayout frameLayout6 = new FrameLayout(linearLayout5.getContext());
        this.R = frameLayout6;
        frameLayout6.setClipChildren(false);
        ViewGroup.LayoutParams layoutParams59 = frameLayout6.getLayoutParams();
        if (layoutParams59 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams24 = (ViewGroup.MarginLayoutParams) layoutParams59;
            marginLayoutParams24.setMarginEnd(kew.v(32));
            marginLayoutParams24.bottomMargin = kew.v(18);
            marginLayoutParams24.height = kew.v(60);
            frameLayout6.setLayoutParams(layoutParams59);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams25 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams25.setMarginEnd(kew.v(32));
            marginLayoutParams25.bottomMargin = kew.v(18);
            marginLayoutParams25.height = kew.v(60);
            frameLayout6.setLayoutParams(marginLayoutParams25);
        }
        linearLayout5.addView(frameLayout6);
        linearLayout4.addView(linearLayout5);
        FrameLayout frameLayout7 = new FrameLayout(linearLayout4.getContext());
        k0(frameLayout7);
        ViewGroup.LayoutParams layoutParams60 = frameLayout7.getLayoutParams();
        if (layoutParams60 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams26 = (ViewGroup.MarginLayoutParams) layoutParams60;
            ((ViewGroup.LayoutParams) marginLayoutParams26).width = -1;
            marginLayoutParams26.topMargin = -kew.v(10);
            frameLayout7.setLayoutParams(layoutParams60);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams27 = new ViewGroup.MarginLayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) marginLayoutParams27).width = -1;
            marginLayoutParams27.topMargin = -kew.v(10);
            frameLayout7.setLayoutParams(marginLayoutParams27);
        }
        linearLayout4.addView(frameLayout7);
        frameLayout2.addView(linearLayout4);
        viewGroup.addView(frameLayout2);
    }

    public final boolean d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82717df", new Object[]{this})).booleanValue();
        }
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final boolean e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("751d6ff3", new Object[]{this})).booleanValue();
        }
        if (this.Z > 0.9f) {
            return true;
        }
        return false;
    }

    public final void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46f2a542", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.U;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(this.B);
        }
        W().setImageUrl(this.f0);
        TUrlImageView tUrlImageView2 = this.W;
        if (tUrlImageView2 != null) {
            tUrlImageView2.setImageUrl(this.d0);
            TUrlImageView tUrlImageView3 = this.X;
            if (tUrlImageView3 != null) {
                tUrlImageView3.setImageUrl(this.h0);
                TextView textView = this.T;
                if (textView != null) {
                    textView.setTextColor(this.k0);
                }
                TextView textView2 = this.S;
                if (textView2 != null) {
                    textView2.setTextColor(this.l0);
                    TextView textView3 = this.s;
                    if (textView3 != null) {
                        textView3.setTextColor(this.m0);
                    }
                    TextView textView4 = this.s;
                    if (textView4 != null) {
                        textView4.setHintTextColor(this.m0);
                    }
                    TextView textView5 = this.v;
                    if (textView5 != null) {
                        textView5.setTextColor(this.m0);
                    }
                    TextView textView6 = this.v;
                    if (textView6 != null) {
                        textView6.setHintTextColor(this.m0);
                    }
                    if (this.y0) {
                        FrameLayout frameLayout = this.Q;
                        if (frameLayout != null) {
                            frameLayout.setBackground(this.z0);
                        } else {
                            ckf.y("flSearchBar");
                            throw null;
                        }
                    } else {
                        FrameLayout frameLayout2 = this.Q;
                        if (frameLayout2 != null) {
                            frameLayout2.setBackground(this.A0);
                        } else {
                            ckf.y("flSearchBar");
                            throw null;
                        }
                    }
                    if (this.w0) {
                        TUrlImageView tUrlImageView4 = this.V;
                        if (tUrlImageView4 != null) {
                            tUrlImageView4.setImageUrl(this.k);
                            String str = this.f;
                            if (str == null || wsq.a0(str)) {
                                TUrlImageView tUrlImageView5 = this.j;
                                if (tUrlImageView5 != null) {
                                    tUrlImageView5.setImageUrl(this.h);
                                }
                            } else {
                                TUrlImageView tUrlImageView6 = this.j;
                                if (tUrlImageView6 != null) {
                                    tUrlImageView6.setImageUrl(this.f);
                                }
                            }
                        } else {
                            ckf.y("ivLogo");
                            throw null;
                        }
                    } else {
                        TUrlImageView tUrlImageView7 = this.V;
                        if (tUrlImageView7 != null) {
                            tUrlImageView7.setImageUrl(this.E);
                        } else {
                            ckf.y("ivLogo");
                            throw null;
                        }
                    }
                    View view = this.u0;
                    if (view != null) {
                        view.setBackgroundColor(this.r0);
                        View view2 = this.v0;
                        if (view2 != null) {
                            view2.setBackgroundColor(this.s0);
                        } else {
                            ckf.y("fansDivider");
                            throw null;
                        }
                    } else {
                        ckf.y("searchDivider");
                        throw null;
                    }
                } else {
                    ckf.y("tvFans");
                    throw null;
                }
            } else {
                ckf.y("ivSearch");
                throw null;
            }
        } else {
            ckf.y("ivMore");
            throw null;
        }
    }

    public final void g0() {
        final FragmentActivity fragmentActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4b5a46a", new Object[]{this});
            return;
        }
        Context context = this.f3193a;
        if (context instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) context;
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity != null) {
            fragmentActivity.getLifecycle().addObserver(new LifecycleObserver() { // from class: com.alibaba.triver.triver_shop.newShop.view.component.nativeview.FlagShopHeaderNativeComponent$listenLifecycle$1$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroyed() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bf354a81", new Object[]{this});
                        return;
                    }
                    npp.Companion.f("FlagShopHeaderNativeComponent onDestroyed ");
                    FlagShopHeaderNativeComponent.d(FlagShopHeaderNativeComponent.this).removeCallbacksAndMessages(null);
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
                    npp.Companion.f("FlagShopHeaderNativeComponent onStart ");
                    FlagShopHeaderNativeComponent.F(FlagShopHeaderNativeComponent.this);
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
                public final void onStop() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b3dde88", new Object[]{this});
                        return;
                    }
                    npp.Companion.f("FlagShopHeaderNativeComponent onStop ");
                    FlagShopHeaderNativeComponent.d(FlagShopHeaderNativeComponent.this).removeCallbacksAndMessages(null);
                }
            });
        }
    }

    public final void h0(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f7c8fa", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else {
            x0(1 - ((i2 - i3) / (this.a0 - this.b0)));
        }
    }

    public final void i0(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f98c73", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else {
            x0((i3 - i2) / (this.a0 - this.b0));
        }
    }

    public final void k0(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461ccfc3", new Object[]{this, frameLayout});
            return;
        }
        ckf.g(frameLayout, "<set-?>");
        this.q = frameLayout;
    }

    public final void l0(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47705ea3", new Object[]{this, tUrlImageView});
            return;
        }
        ckf.g(tUrlImageView, "<set-?>");
        this.Y = tUrlImageView;
    }

    public final void m0(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8748936", new Object[]{this, linearLayout});
            return;
        }
        ckf.g(linearLayout, "<set-?>");
        this.c = linearLayout;
    }

    public final void n0(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa004752", new Object[]{this, d1aVar});
        } else {
            this.E0 = d1aVar;
        }
    }

    public final void o0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13b2b06d", new Object[]{this, str});
        } else {
            this.L = str;
        }
    }

    public final boolean p0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76c7c55e", new Object[]{this})).booleanValue();
        }
        if (this.x0 || this.w0 || (str = this.D) == null || wsq.a0(str)) {
            return false;
        }
        return true;
    }

    public final boolean q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6771b1f", new Object[]{this})).booleanValue();
        }
        if (!this.x0 || this.w0) {
            return false;
        }
        return true;
    }

    public final void r0() {
        TUrlImageView tUrlImageView;
        TUrlImageView tUrlImageView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85ad0d8", new Object[]{this});
            return;
        }
        TextView textView = this.s;
        if (!(textView == null || (tUrlImageView2 = this.t) == null)) {
            LinearLayout linearLayout = this.r;
            if (linearLayout == null) {
                ckf.y("llSearchWord");
                throw null;
            } else if (textView.getPaint().measureText(this.H) > (linearLayout.getWidth() - tUrlImageView2.getWidth()) - kew.v(40)) {
                tUrlImageView2.setAlpha(0.0f);
            } else {
                tUrlImageView2.setAlpha(1.0f);
            }
        }
        TextView textView2 = this.v;
        if (textView2 != null && (tUrlImageView = this.w) != null) {
            LinearLayout linearLayout2 = this.r;
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

    public final void s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35d9ae7", new Object[]{this});
            return;
        }
        JSONArray jSONArray = this.t0;
        if (jSONArray != null && !jSONArray.isEmpty()) {
            JSONArray jSONArray2 = this.t0;
            ckf.d(jSONArray2);
            if (jSONArray2.size() != 1) {
                this.D0.removeCallbacksAndMessages(null);
                this.D0.postDelayed(new l(), 3000L);
            }
        }
    }

    public final void t0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5264d0d7", new Object[]{this, new Boolean(z)});
        } else if (z) {
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                kew.C(frameLayout);
                LinearLayout linearLayout = this.n;
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
            FrameLayout frameLayout2 = this.Q;
            if (frameLayout2 != null) {
                kew.g0(frameLayout2);
                LinearLayout linearLayout2 = this.n;
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

    public final void u0(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7611facf", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        tk9 tk9Var = this.p;
        if (tk9Var != null) {
            tk9Var.I(jSONObject);
        }
    }

    public final void v0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb5615f", new Object[]{this, new Boolean(z)});
        } else if (z) {
            View view = this.e;
            if (view != null) {
                kew.C(view);
            }
            TUrlImageView tUrlImageView = this.d;
            if (tUrlImageView != null) {
                kew.C(tUrlImageView);
            }
            FrameLayout frameLayout = this.z;
            if (frameLayout != null) {
                frameLayout.setOnClickListener(new m());
            } else {
                ckf.y("flLogo");
                throw null;
            }
        } else if (q0()) {
            View view2 = this.e;
            if (view2 != null) {
                kew.g0(view2);
            }
            TUrlImageView tUrlImageView2 = this.d;
            if (tUrlImageView2 != null) {
                kew.g0(tUrlImageView2);
            }
            FrameLayout frameLayout2 = this.z;
            if (frameLayout2 != null) {
                frameLayout2.setOnClickListener(new n());
            } else {
                ckf.y("flLogo");
                throw null;
            }
        }
    }

    public final void w0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec1c35e6", new Object[]{this, new Boolean(z)});
        } else if (z) {
            y0("live");
        }
    }

    public final void y0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("936706f9", new Object[]{this, str});
            return;
        }
        npp.Companion.f(ckf.p("FlagShopHeaderNativeComponent updateStyle ", str));
        int hashCode = str.hashCode();
        if (hashCode != -1268966304) {
            if (hashCode != 3322092) {
                if (hashCode == 1544803905 && str.equals("default")) {
                    f0();
                }
            } else if (str.equals("live")) {
                P();
            }
        } else if (str.equals("folded")) {
            f0();
        }
    }

    public final void z0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4da2f3", new Object[]{this, new Boolean(z)});
        } else if (z) {
            y0("default");
        } else {
            y0("folded");
        }
    }

    public final void M(ViewGroup viewGroup, ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3725eb52", new Object[]{this, viewGroup, shopDataParser});
            return;
        }
        ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(shopDataParser, "shopData");
        this.A = shopDataParser;
        b0(shopDataParser);
        c0(viewGroup);
        z0(true);
        s0();
        g0();
    }

    public final void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71bda086", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.r;
        if (linearLayout != null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, linearLayout.getHeight());
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new j());
            ofInt.addListener(new k());
            ofInt.start();
            return;
        }
        ckf.y("llSearchWord");
        throw null;
    }

    public final void x0(float f2) {
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
        this.Z = f2;
        FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                float f3 = 1;
                float f4 = f3 - f2;
                layoutParams2.setMarginEnd((int) (kew.v(130) * f4));
                FrameLayout frameLayout2 = this.Q;
                if (frameLayout2 != null) {
                    frameLayout2.setLayoutParams(layoutParams2);
                    LinearLayout linearLayout = this.r;
                    if (linearLayout != null) {
                        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
                        if (layoutParams3 != null) {
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                            layoutParams4.setMarginStart((int) (kew.v(64) * f4));
                            LinearLayout linearLayout2 = this.r;
                            if (linearLayout2 != null) {
                                linearLayout2.setLayoutParams(layoutParams4);
                                FrameLayout frameLayout3 = this.z;
                                if (frameLayout3 != null) {
                                    frameLayout3.setTranslationX(kew.v(55) * f4);
                                    FrameLayout frameLayout4 = this.z;
                                    if (frameLayout4 != null) {
                                        float f5 = -f4;
                                        frameLayout4.setTranslationY(kew.v(Double.valueOf(99.5d)) * f5);
                                        String str = this.D;
                                        if (str == null || wsq.a0(str)) {
                                            FrameLayout frameLayout5 = this.z;
                                            if (frameLayout5 != null) {
                                                float f6 = f3 - (f4 * 0.112f);
                                                frameLayout5.setScaleX(f6);
                                                FrameLayout frameLayout6 = this.z;
                                                if (frameLayout6 != null) {
                                                    frameLayout6.setScaleY(f6);
                                                } else {
                                                    ckf.y("flLogo");
                                                    throw null;
                                                }
                                            } else {
                                                ckf.y("flLogo");
                                                throw null;
                                            }
                                        } else {
                                            FrameLayout frameLayout7 = this.z;
                                            if (frameLayout7 != null) {
                                                float f7 = f3 - (f4 * 0.132f);
                                                frameLayout7.setScaleX(f7);
                                                FrameLayout frameLayout8 = this.z;
                                                if (frameLayout8 != null) {
                                                    frameLayout8.setScaleY(f7);
                                                } else {
                                                    ckf.y("flLogo");
                                                    throw null;
                                                }
                                            } else {
                                                ckf.y("flLogo");
                                                throw null;
                                            }
                                        }
                                        LinearLayout linearLayout3 = this.y;
                                        if (linearLayout3 != null) {
                                            float f8 = f2 * f2;
                                            linearLayout3.setAlpha(f8);
                                            V().setAlpha(f8);
                                            FrameLayout frameLayout9 = this.R;
                                            if (frameLayout9 != null) {
                                                frameLayout9.setTranslationX(kew.v(58) * f5);
                                                FrameLayout frameLayout10 = this.R;
                                                if (frameLayout10 != null) {
                                                    frameLayout10.setTranslationY(f5 * kew.v(94));
                                                    LinearLayout linearLayout4 = this.r;
                                                    if (linearLayout4 != null) {
                                                        linearLayout4.post(new o());
                                                    } else {
                                                        ckf.y("llSearchWord");
                                                        throw null;
                                                    }
                                                } else {
                                                    ckf.y("flFollow");
                                                    throw null;
                                                }
                                            } else {
                                                ckf.y("flFollow");
                                                throw null;
                                            }
                                        } else {
                                            ckf.y("llShopInfo");
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("flLogo");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("flLogo");
                                    throw null;
                                }
                            } else {
                                ckf.y("llSearchWord");
                                throw null;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                    } else {
                        ckf.y("llSearchWord");
                        throw null;
                    }
                } else {
                    ckf.y("flSearchBar");
                    throw null;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        } else {
            ckf.y("flSearchBar");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ LinearLayout b;

        public e(LinearLayout linearLayout) {
            this.b = linearLayout;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ShopDataParser s = FlagShopHeaderNativeComponent.s(FlagShopHeaderNativeComponent.this);
            if (s != null) {
                a1v.p(s, "Page_Shop_Page_Shop_Button-Search", kotlin.collections.a.j(jpu.a("position", "1"), jpu.a("shadingWord", FlagShopHeaderNativeComponent.q(FlagShopHeaderNativeComponent.this)), jpu.a("benefitType", FlagShopHeaderNativeComponent.b(FlagShopHeaderNativeComponent.this)), jpu.a("utArg1", FlagShopHeaderNativeComponent.this.Z()), jpu.a("timeStamp", String.valueOf(System.currentTimeMillis()))));
                if (FlagShopHeaderNativeComponent.k(FlagShopHeaderNativeComponent.this) == null) {
                    Nav.from(this.b.getContext()).toUri(FlagShopHeaderNativeComponent.l(FlagShopHeaderNativeComponent.this));
                    return;
                }
                String k = FlagShopHeaderNativeComponent.k(FlagShopHeaderNativeComponent.this);
                if (k != null) {
                    Nav.from(this.b.getContext()).toUri(k);
                    return;
                }
                return;
            }
            ckf.y("shopData");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ TUrlImageView b;

        public f(TUrlImageView tUrlImageView) {
            this.b = tUrlImageView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ShopDataParser s = FlagShopHeaderNativeComponent.s(FlagShopHeaderNativeComponent.this);
            if (s != null) {
                a1v.p(s, "Page_Shop_Page_Shop_Button-Search", kotlin.collections.a.j(jpu.a("position", "2"), jpu.a("shadingWord", FlagShopHeaderNativeComponent.q(FlagShopHeaderNativeComponent.this)), jpu.a("benefitType", FlagShopHeaderNativeComponent.b(FlagShopHeaderNativeComponent.this)), jpu.a("utArg1", FlagShopHeaderNativeComponent.this.Z()), jpu.a("timeStamp", String.valueOf(System.currentTimeMillis()))));
                if (FlagShopHeaderNativeComponent.o(FlagShopHeaderNativeComponent.this) == null) {
                    Context context = this.b.getContext();
                    ckf.f(context, "context");
                    khu.h(context, FlagShopHeaderNativeComponent.l(FlagShopHeaderNativeComponent.this));
                    return;
                }
                String o = FlagShopHeaderNativeComponent.o(FlagShopHeaderNativeComponent.this);
                if (o != null) {
                    Context context2 = this.b.getContext();
                    ckf.f(context2, "context");
                    khu.h(context2, o);
                    return;
                }
                return;
            }
            ckf.y("shopData");
            throw null;
        }
    }

    public final void b0(ShopDataParser shopDataParser) {
        Object e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d8f9cd", new Object[]{this, shopDataParser});
            return;
        }
        this.x0 = shopDataParser.V1();
        String S0 = shopDataParser.S0();
        this.y0 = !(S0 == null || wsq.a0(S0));
        JSONObject D1 = shopDataParser.D1();
        this.o = D1.getJSONObject("shopInfo").getString("introUrl");
        this.E = D1.getJSONObject("shopInfo").getString("shopLogo");
        JSONObject jSONObject = D1.getJSONObject("headerData");
        if (jSONObject != null) {
            this.F = jSONObject.getString("title");
            jSONObject.getString("shopSignStyle");
            this.D = jSONObject.getString("logoActivityPicUrl");
            String string = jSONObject.getString("titlePicUrl");
            if (string != null && !wsq.a0(string)) {
                this.w0 = true;
            }
            this.k = jSONObject.getString("titlePicUrlForFolded");
            this.l = jSONObject.getString("titlePicUrlForLive");
            this.B = jSONObject.getString("tmRankImageUrl");
            this.C = jSONObject.getString("tmRankImageUrlForDark");
            this.m = jSONObject.getString("rankImageUrl");
            this.h = jSONObject.getString("tmallPicUrl");
            this.i = jSONObject.getString("tmallPicUrlDark");
            this.f = jSONObject.getString("activityTmallPicUrl");
            this.g = jSONObject.getString("activityTmallPicUrlDark");
            JSONObject jSONObject2 = jSONObject.getJSONObject("relation");
            this.G = ckf.p(jSONObject2.getString("fansNumStr"), jSONObject2.getString("fansDes"));
        }
        JSONObject jSONObject3 = D1.getJSONObject("navigatorData");
        if (jSONObject3 != null) {
            this.H = jSONObject3.getString("searchWord");
            this.M = jSONObject3.getString("searchUrl");
            JSONArray jSONArray = jSONObject3.getJSONArray("shopSearchWordList");
            this.t0 = jSONArray;
            if (!(jSONArray == null || (e2 = brf.e(jSONArray, 0)) == null)) {
                if ((e2 instanceof JSONObject ? (JSONObject) e2 : null) != null) {
                    JSONObject jSONObject4 = (JSONObject) e2;
                    this.H = jSONObject4.getString("displayText");
                    this.I = jSONObject4.getString("icon");
                    this.J = jSONObject4.getString("displayPicUrl");
                    this.K = jSONObject4.getString("benefitType");
                    this.N = jSONObject4.getString("sapUrl");
                    this.O = jSONObject4.getString("srpUrl");
                }
            }
        }
        String str = this.H;
        if (str == null || wsq.a0(str)) {
            this.H = "搜索店铺内宝贝";
        }
        JSONArray jSONArray2 = this.t0;
        if (jSONArray2 != null) {
            for (Object obj : jSONArray2) {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject5 = (JSONObject) obj;
                    a1v.r(shopDataParser, "Page_Shop_Button-Search_shadow", kotlin.collections.a.j(jpu.a("version", "1"), jpu.a("shadingWord", jSONObject5.getString("displayText")), jpu.a("benefitType", jSONObject5.getString("benefitType")), jpu.a("timeStamp", String.valueOf(System.currentTimeMillis()))));
                    a1v.r(shopDataParser, "Page_Shop_Page_Shop_Button-Search", kotlin.collections.a.j(jpu.a("shadingWord", jSONObject5.getString("displayText")), jpu.a("benefitType", jSONObject5.getString("benefitType"))));
                }
            }
        }
    }
}
