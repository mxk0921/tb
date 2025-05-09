package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.ui.view.refresh.circlebar.CircleProgressBar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.a07;
import tb.a1v;
import tb.aj8;
import tb.ckf;
import tb.cyo;
import tb.jpu;
import tb.kew;
import tb.kqu;
import tb.lk8;
import tb.njg;
import tb.pg1;
import tb.r54;
import tb.t2o;
import tb.ups;
import tb.w1a;
import tb.xhv;
import tb.xyp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2023CategoryNativeComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ups f3315a;
    public ViewGroup b;
    public final JSONArray c;
    public final String d;
    public final String e;
    public final String f;
    public int g;
    public TUrlImageView h;
    public TextView i;
    public View j;
    public RecyclerView k;
    public View l;
    public View m;
    public final int n;
    public final Drawable o;
    public final Drawable p;
    public final Drawable q;
    public final Drawable r;
    public final int s;
    public boolean t;
    public w1a<? super JSONObject, ? super String, ? super JSONObject, xhv> u;
    public final njg v;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class Holder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public TUrlImageView f3316a;
        public TextView b;
        public FrameLayout c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Shop2023CategoryNativeComponent f3317a;
            public final /* synthetic */ Holder b;

            public a(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent, Holder holder) {
                this.f3317a = shop2023CategoryNativeComponent;
                this.b = holder;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    Shop2023CategoryNativeComponent.x(this.f3317a, this.b.getAdapterPosition(), false, 2, null);
                }
            }
        }

        static {
            t2o.a(766510347);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent, ViewGroup viewGroup) {
            super(viewGroup);
            ckf.g(shop2023CategoryNativeComponent, "this$0");
            ckf.g(viewGroup, "item");
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = null;
            FrameLayout.LayoutParams layoutParams3 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams3 == null) {
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams4.width = -1;
                layoutParams4.height = kew.v(100);
                xhv xhvVar = xhv.INSTANCE;
                viewGroup.setLayoutParams(layoutParams4);
            } else {
                layoutParams3.width = -1;
                layoutParams3.height = kew.v(100);
            }
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            e0(frameLayout);
            ViewGroup.LayoutParams layoutParams5 = frameLayout.getLayoutParams();
            FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams5 : null;
            if (layoutParams6 == null) {
                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams7.width = -1;
                layoutParams7.height = -1;
                xhv xhvVar2 = xhv.INSTANCE;
                frameLayout.setLayoutParams(layoutParams7);
            } else {
                layoutParams6.width = -1;
                layoutParams6.height = -1;
            }
            TextView textView = new TextView(frameLayout.getContext());
            ViewGroup.LayoutParams layoutParams8 = textView.getLayoutParams();
            if (layoutParams8 instanceof ViewGroup.MarginLayoutParams) {
                textView.setLayoutParams(layoutParams8);
            } else {
                ViewGroup.LayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                xhv xhvVar3 = xhv.INSTANCE;
                textView.setLayoutParams(marginLayoutParams);
            }
            ViewGroup.LayoutParams layoutParams9 = textView.getLayoutParams();
            FrameLayout.LayoutParams layoutParams10 = layoutParams9 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams9 : null;
            if (layoutParams10 == null) {
                FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams11.gravity = 17;
                xhv xhvVar4 = xhv.INSTANCE;
                textView.setLayoutParams(layoutParams11);
            } else {
                layoutParams10.gravity = 17;
            }
            kew.c0(textView, kew.v(24));
            textView.setTextColor(-13421773);
            xhv xhvVar5 = xhv.INSTANCE;
            frameLayout.addView(textView);
            g0(textView);
            TUrlImageView tUrlImageView = new TUrlImageView(frameLayout.getContext());
            ViewGroup.LayoutParams layoutParams12 = tUrlImageView.getLayoutParams();
            if (layoutParams12 instanceof ViewGroup.MarginLayoutParams) {
                tUrlImageView.setLayoutParams(layoutParams12);
            } else {
                tUrlImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            }
            ViewGroup.LayoutParams layoutParams13 = tUrlImageView.getLayoutParams();
            layoutParams2 = layoutParams13 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams13 : layoutParams2;
            if (layoutParams2 == null) {
                FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams14.width = -1;
                layoutParams14.height = kew.v(22);
                layoutParams14.gravity = 17;
                tUrlImageView.setLayoutParams(layoutParams14);
            } else {
                layoutParams2.width = -1;
                layoutParams2.height = kew.v(22);
                layoutParams2.gravity = 17;
            }
            frameLayout.addView(tUrlImageView);
            f0(tUrlImageView);
            viewGroup.addView(frameLayout);
            viewGroup.setOnClickListener(new a(shop2023CategoryNativeComponent, this));
        }

        public static /* synthetic */ Object ipc$super(Holder holder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/nativeview/Shop2023CategoryNativeComponent$Holder");
        }

        public final FrameLayout b0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FrameLayout) ipChange.ipc$dispatch("68173fb1", new Object[]{this});
            }
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                return frameLayout;
            }
            ckf.y("flBg");
            throw null;
        }

        public final TUrlImageView c0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TUrlImageView) ipChange.ipc$dispatch("ee89d259", new Object[]{this});
            }
            TUrlImageView tUrlImageView = this.f3316a;
            if (tUrlImageView != null) {
                return tUrlImageView;
            }
            ckf.y("ivIcon");
            throw null;
        }

        public final TextView d0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("97c7949e", new Object[]{this});
            }
            TextView textView = this.b;
            if (textView != null) {
                return textView;
            }
            ckf.y("tvName");
            throw null;
        }

        public final void e0(FrameLayout frameLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e6fdeb7", new Object[]{this, frameLayout});
                return;
            }
            ckf.g(frameLayout, "<set-?>");
            this.c = frameLayout;
        }

        public final void f0(TUrlImageView tUrlImageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ecfb835", new Object[]{this, tUrlImageView});
                return;
            }
            ckf.g(tUrlImageView, "<set-?>");
            this.f3316a = tUrlImageView;
        }

        public final void g0(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96bc56ce", new Object[]{this, textView});
                return;
            }
            ckf.g(textView, "<set-?>");
            this.b = textView;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ lk8 f3320a;

        public b(lk8 lk8Var) {
            this.f3320a = lk8Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
                return;
            }
            lk8 lk8Var = this.f3320a;
            Set<lk8<aj8>> set = aj8.Companion.a().get(cyo.class);
            if (set != null) {
                kqu.a(set).remove(lk8Var);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Shop2023CategoryNativeComponent f3322a;

            public a(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
                this.f3322a = shop2023CategoryNativeComponent;
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
                    RecyclerView n = Shop2023CategoryNativeComponent.n(this.f3322a);
                    if (n != null) {
                        n.setTranslationX((-floatValue) * Shop2023CategoryNativeComponent.d(this.f3322a));
                        View g = Shop2023CategoryNativeComponent.g(this.f3322a);
                        if (g != null) {
                            kew.X(g, (int) ((1 - floatValue) * Shop2023CategoryNativeComponent.d(this.f3322a)));
                        }
                        View b = Shop2023CategoryNativeComponent.b(this.f3322a);
                        if (b != null) {
                            View b2 = Shop2023CategoryNativeComponent.b(this.f3322a);
                            if (b2 != null) {
                                b.setTranslationX((-(b2.getLeft() + kew.v(1))) * floatValue);
                            } else {
                                ckf.y(pg1.ATOM_EXT_button);
                                throw null;
                            }
                        } else {
                            ckf.y(pg1.ATOM_EXT_button);
                            throw null;
                        }
                    } else {
                        ckf.y(OrderConfigs.RECYCLERVIEW);
                        throw null;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class b extends AnimatorListenerAdapter {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Shop2023CategoryNativeComponent f3323a;

            public b(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
                this.f3323a = shop2023CategoryNativeComponent;
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/nativeview/Shop2023CategoryNativeComponent$attachTo$1$1$2");
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                String str;
                String str2;
                Drawable drawable;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                Shop2023CategoryNativeComponent shop2023CategoryNativeComponent = this.f3323a;
                Shop2023CategoryNativeComponent.r(shop2023CategoryNativeComponent, true ^ Shop2023CategoryNativeComponent.q(shop2023CategoryNativeComponent));
                TUrlImageView i = Shop2023CategoryNativeComponent.i(this.f3323a);
                if (i != null) {
                    if (Shop2023CategoryNativeComponent.q(this.f3323a)) {
                        str = Shop2023CategoryNativeComponent.l(this.f3323a);
                    } else {
                        str = Shop2023CategoryNativeComponent.f(this.f3323a);
                    }
                    i.setImageUrl(str);
                    TextView o = Shop2023CategoryNativeComponent.o(this.f3323a);
                    if (o != null) {
                        if (Shop2023CategoryNativeComponent.q(this.f3323a)) {
                            str2 = "分类";
                        } else {
                            str2 = "收起";
                        }
                        o.setText(str2);
                        View b = Shop2023CategoryNativeComponent.b(this.f3323a);
                        if (b != null) {
                            if (Shop2023CategoryNativeComponent.q(this.f3323a)) {
                                drawable = Shop2023CategoryNativeComponent.e(this.f3323a);
                            } else {
                                drawable = Shop2023CategoryNativeComponent.k(this.f3323a);
                            }
                            b.setBackground(drawable);
                            if (Shop2023CategoryNativeComponent.q(this.f3323a)) {
                                RecyclerView n = Shop2023CategoryNativeComponent.n(this.f3323a);
                                if (n == null) {
                                    ckf.y(OrderConfigs.RECYCLERVIEW);
                                    throw null;
                                } else if (n.getVisibility() == 0) {
                                    Shop2023CategoryNativeComponent.t(this.f3323a);
                                }
                            } else {
                                RecyclerView n2 = Shop2023CategoryNativeComponent.n(this.f3323a);
                                if (n2 != null) {
                                    kew.g0(n2);
                                    Shop2023CategoryNativeComponent.u(this.f3323a);
                                    return;
                                }
                                ckf.y(OrderConfigs.RECYCLERVIEW);
                                throw null;
                            }
                        } else {
                            ckf.y(pg1.ATOM_EXT_button);
                            throw null;
                        }
                    } else {
                        ckf.y("tvClose");
                        throw null;
                    }
                } else {
                    ckf.y("icon");
                    throw null;
                }
            }
        }

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            float f2 = 0.0f;
            if (Shop2023CategoryNativeComponent.q(Shop2023CategoryNativeComponent.this)) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (!Shop2023CategoryNativeComponent.q(Shop2023CategoryNativeComponent.this)) {
                f2 = 1.0f;
            }
            if (Shop2023CategoryNativeComponent.q(Shop2023CategoryNativeComponent.this)) {
                Shop2023CategoryNativeComponent.this.E();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
            Shop2023CategoryNativeComponent shop2023CategoryNativeComponent = Shop2023CategoryNativeComponent.this;
            ofFloat.addUpdateListener(new a(shop2023CategoryNativeComponent));
            ofFloat.addListener(new b(shop2023CategoryNativeComponent));
            ofFloat.setDuration(0L);
            ofFloat.start();
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
                return;
            }
            View b = Shop2023CategoryNativeComponent.b(Shop2023CategoryNativeComponent.this);
            if (b != null) {
                b.performClick();
            } else {
                ckf.y(pg1.ATOM_EXT_button);
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements lk8<cyo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public void onEvent(cyo cyoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ed61577", new Object[]{this, cyoVar});
                return;
            }
            ckf.g(cyoVar, "event");
            View b = Shop2023CategoryNativeComponent.b(Shop2023CategoryNativeComponent.this);
            if (b != null) {
                b.setTranslationY(cyoVar.c());
                View m = Shop2023CategoryNativeComponent.m(Shop2023CategoryNativeComponent.this);
                if (m != null) {
                    m.setTranslationY(cyoVar.c());
                    return;
                }
                return;
            }
            ckf.y(pg1.ATOM_EXT_button);
            throw null;
        }
    }

    static {
        t2o.a(766510345);
    }

    public static /* synthetic */ void M(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4ff6dc", new Object[]{shop2023CategoryNativeComponent, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            z = shop2023CategoryNativeComponent.t;
        }
        shop2023CategoryNativeComponent.L(z);
    }

    public static final /* synthetic */ int a(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67a6f34b", new Object[]{shop2023CategoryNativeComponent})).intValue();
        }
        return shop2023CategoryNativeComponent.n;
    }

    public static final /* synthetic */ View b(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("34e9075a", new Object[]{shop2023CategoryNativeComponent});
        }
        return shop2023CategoryNativeComponent.l;
    }

    public static final /* synthetic */ JSONArray c(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("17bc6531", new Object[]{shop2023CategoryNativeComponent});
        }
        return shop2023CategoryNativeComponent.c;
    }

    public static final /* synthetic */ int d(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee388495", new Object[]{shop2023CategoryNativeComponent})).intValue();
        }
        return shop2023CategoryNativeComponent.s;
    }

    public static final /* synthetic */ Drawable e(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("de12b583", new Object[]{shop2023CategoryNativeComponent});
        }
        return shop2023CategoryNativeComponent.q;
    }

    public static final /* synthetic */ String f(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68e8199c", new Object[]{shop2023CategoryNativeComponent});
        }
        return shop2023CategoryNativeComponent.e;
    }

    public static final /* synthetic */ View g(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7564c93a", new Object[]{shop2023CategoryNativeComponent});
        }
        return shop2023CategoryNativeComponent.j;
    }

    public static final /* synthetic */ Drawable h(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("746fc06d", new Object[]{shop2023CategoryNativeComponent});
        }
        return shop2023CategoryNativeComponent.p;
    }

    public static final /* synthetic */ TUrlImageView i(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("ac13787d", new Object[]{shop2023CategoryNativeComponent});
        }
        return shop2023CategoryNativeComponent.h;
    }

    public static final /* synthetic */ List j(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("debf020f", new Object[]{shop2023CategoryNativeComponent});
        }
        return shop2023CategoryNativeComponent.y();
    }

    public static final /* synthetic */ Drawable k(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("528269c5", new Object[]{shop2023CategoryNativeComponent});
        }
        return shop2023CategoryNativeComponent.r;
    }

    public static final /* synthetic */ String l(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367ea21a", new Object[]{shop2023CategoryNativeComponent});
        }
        return shop2023CategoryNativeComponent.d;
    }

    public static final /* synthetic */ View m(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6d64a4b2", new Object[]{shop2023CategoryNativeComponent});
        }
        return shop2023CategoryNativeComponent.m;
    }

    public static final /* synthetic */ RecyclerView n(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("e8854011", new Object[]{shop2023CategoryNativeComponent});
        }
        return shop2023CategoryNativeComponent.k;
    }

    public static final /* synthetic */ TextView o(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("ed885044", new Object[]{shop2023CategoryNativeComponent});
        }
        return shop2023CategoryNativeComponent.i;
    }

    public static final /* synthetic */ Drawable p(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("6bf23dd4", new Object[]{shop2023CategoryNativeComponent});
        }
        return shop2023CategoryNativeComponent.o;
    }

    public static final /* synthetic */ boolean q(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20cba62", new Object[]{shop2023CategoryNativeComponent})).booleanValue();
        }
        return shop2023CategoryNativeComponent.t;
    }

    public static final /* synthetic */ void r(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c2ecee", new Object[]{shop2023CategoryNativeComponent, new Boolean(z)});
        } else {
            shop2023CategoryNativeComponent.t = z;
        }
    }

    public static final /* synthetic */ void s(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c99df041", new Object[]{shop2023CategoryNativeComponent, recyclerView});
        } else {
            shop2023CategoryNativeComponent.k = recyclerView;
        }
    }

    public static final /* synthetic */ void t(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38f05a26", new Object[]{shop2023CategoryNativeComponent});
        } else {
            shop2023CategoryNativeComponent.I();
        }
    }

    public static final /* synthetic */ void u(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af469a4", new Object[]{shop2023CategoryNativeComponent});
        } else {
            shop2023CategoryNativeComponent.J();
        }
    }

    public static /* synthetic */ void x(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent, int i, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df13bf12", new Object[]{shop2023CategoryNativeComponent, new Integer(i), new Boolean(z), new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        shop2023CategoryNativeComponent.w(i, z);
    }

    public final HashMap<String, String> A(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("33c0c85c", new Object[]{this, str, map});
        }
        ShopDataParser o = this.f3315a.o();
        HashMap<String, String> hashMap = new HashMap<>();
        if (o != null) {
            hashMap = o.l1();
            hashMap.put("shop_id", o.W0());
            hashMap.put("seller_id", o.N0());
            hashMap.put("identityCode", o.s0());
        }
        hashMap.put("category_id", str);
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb45307d", new Object[]{this});
        } else {
            x(this, this.g + 1, false, 2, null);
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b773fa", new Object[]{this});
            return;
        }
        View view = this.m;
        if (view != null) {
            kew.h(view);
        }
        this.m = null;
    }

    public final void F(w1a<? super JSONObject, ? super String, ? super JSONObject, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae9b8a5f", new Object[]{this, w1aVar});
        } else {
            this.u = w1aVar;
        }
    }

    public final boolean H(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4606845", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!z) {
            E();
            return false;
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            return G(viewGroup);
        }
        ckf.y("container");
        throw null;
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1dc5789", new Object[]{this});
        } else {
            a1v.m(ShopConstants.PAGE_SHOP, "Page_Shop_allitem_category_switch_Off", A(null, null));
        }
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d297b87", new Object[]{this});
        } else {
            a1v.m(ShopConstants.PAGE_SHOP, "Page_Shop_allitem_category_switch_On", A(null, null));
        }
    }

    public final void K(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3531cd18", new Object[]{this, str, map});
        } else {
            a1v.m(ShopConstants.PAGE_SHOP, "Page_Shop_allitem_category_tab", A(str, map));
        }
    }

    public final List<a> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("85f5d54c", new Object[]{this});
        }
        return (List) this.v.getValue();
    }

    public final ups z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ups) ipChange.ipc$dispatch("dd6916a6", new Object[]{this});
        }
        return this.f3315a;
    }

    public final void C(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b59e761b", new Object[]{this, viewGroup});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = this.s;
            marginLayoutParams.height = -1;
            frameLayout.setLayoutParams(layoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams2.width = this.s;
            marginLayoutParams2.height = -1;
            xhv xhvVar = xhv.INSTANCE;
            frameLayout.setLayoutParams(marginLayoutParams2);
        }
        xyp.a(frameLayout, new Shop2023CategoryNativeComponent$initView$1$2(this), new Shop2023CategoryNativeComponent$initView$1$3(viewGroup, this));
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        this.l = frameLayout2;
        frameLayout2.setBackground(this.r);
        ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
        LinearLayout.LayoutParams layoutParams3 = null;
        FrameLayout.LayoutParams layoutParams4 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams4 == null) {
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams5.width = kew.v(96);
            layoutParams5.height = kew.v(96);
            layoutParams5.bottomMargin = kew.v(170);
            layoutParams5.gravity = 81;
            xhv xhvVar2 = xhv.INSTANCE;
            frameLayout2.setLayoutParams(layoutParams5);
        } else {
            layoutParams4.width = kew.v(96);
            layoutParams4.height = kew.v(96);
            layoutParams4.bottomMargin = kew.v(170);
            layoutParams4.gravity = 81;
        }
        LinearLayout linearLayout = new LinearLayout(frameLayout2.getContext());
        ViewGroup.LayoutParams layoutParams6 = linearLayout.getLayoutParams();
        if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout.setLayoutParams(layoutParams6);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar3 = xhv.INSTANCE;
            linearLayout.setLayoutParams(marginLayoutParams3);
        }
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams7 = linearLayout.getLayoutParams();
        FrameLayout.LayoutParams layoutParams8 = layoutParams7 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams7 : null;
        if (layoutParams8 == null) {
            FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams9.gravity = 17;
            xhv xhvVar4 = xhv.INSTANCE;
            linearLayout.setLayoutParams(layoutParams9);
        } else {
            layoutParams8.gravity = 17;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(linearLayout.getContext());
        ViewGroup.LayoutParams layoutParams10 = tUrlImageView.getLayoutParams();
        if (layoutParams10 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView.setLayoutParams(layoutParams10);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar5 = xhv.INSTANCE;
            tUrlImageView.setLayoutParams(marginLayoutParams4);
        }
        this.h = tUrlImageView;
        ViewGroup.LayoutParams layoutParams11 = tUrlImageView.getLayoutParams();
        LinearLayout.LayoutParams layoutParams12 = layoutParams11 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams11 : null;
        if (layoutParams12 == null) {
            LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams13.width = kew.v(32);
            layoutParams13.height = kew.v(32);
            layoutParams13.gravity = 1;
            xhv xhvVar6 = xhv.INSTANCE;
            tUrlImageView.setLayoutParams(layoutParams13);
        } else {
            layoutParams12.width = kew.v(32);
            layoutParams12.height = kew.v(32);
            layoutParams12.gravity = 1;
        }
        tUrlImageView.setImageUrl(this.e);
        linearLayout.addView(tUrlImageView);
        xhv xhvVar7 = xhv.INSTANCE;
        TextView textView = new TextView(linearLayout.getContext());
        ViewGroup.LayoutParams layoutParams14 = textView.getLayoutParams();
        if (layoutParams14 instanceof ViewGroup.MarginLayoutParams) {
            textView.setLayoutParams(layoutParams14);
        } else {
            textView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.i = textView;
        ViewGroup.LayoutParams layoutParams15 = textView.getLayoutParams();
        if (layoutParams15 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams15;
        }
        if (layoutParams3 == null) {
            LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams16.topMargin = kew.v(6);
            layoutParams16.gravity = 1;
            textView.setLayoutParams(layoutParams16);
        } else {
            layoutParams3.topMargin = kew.v(6);
            layoutParams3.gravity = 1;
        }
        textView.setText("收起");
        kew.c0(textView, kew.v(20));
        textView.setTextColor(-10066330);
        linearLayout.addView(textView);
        frameLayout2.addView(linearLayout);
        frameLayout.addView(frameLayout2);
        viewGroup.addView(frameLayout);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class MyAdapter extends RecyclerView.Adapter<Holder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Shop2023CategoryNativeComponent f3318a;

        static {
            t2o.a(766510349);
        }

        public MyAdapter(Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
            ckf.g(shop2023CategoryNativeComponent, "this$0");
            this.f3318a = shop2023CategoryNativeComponent;
        }

        public static /* synthetic */ Object ipc$super(MyAdapter myAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/nativeview/Shop2023CategoryNativeComponent$MyAdapter");
        }

        /* renamed from: N */
        public Holder onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Holder) ipChange.ipc$dispatch("201406c4", new Object[]{this, viewGroup, new Integer(i)});
            }
            ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
            return new Holder(this.f3318a, new FrameLayout(viewGroup.getContext()));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            return Shop2023CategoryNativeComponent.j(this.f3318a).size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
            }
            return i;
        }

        /* renamed from: M */
        public void onBindViewHolder(Holder holder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95fbe554", new Object[]{this, holder, new Integer(i)});
                return;
            }
            ckf.g(holder, "holder");
            a aVar = (a) Shop2023CategoryNativeComponent.j(this.f3318a).get(i);
            String e = aVar.e();
            if (e == null || e.length() == 0) {
                holder.c0().setImageUrl(null);
                holder.d0().setText(aVar.b());
            } else {
                holder.c0().setImageUrl(aVar.e());
                holder.d0().setText((CharSequence) null);
            }
            int d = aVar.d();
            if (d == 0) {
                holder.itemView.setBackground(null);
                holder.b0().setBackground(null);
                holder.d0().setTypeface(Typeface.DEFAULT);
            } else if (d == 1) {
                holder.itemView.setBackgroundColor(-1);
                holder.b0().setBackground(null);
                holder.d0().setTypeface(Typeface.DEFAULT_BOLD);
            } else if (d == 2) {
                holder.itemView.setBackgroundColor(-1);
                holder.b0().setBackground(Shop2023CategoryNativeComponent.p(this.f3318a));
                holder.d0().setTypeface(Typeface.DEFAULT);
            } else if (d == 3) {
                holder.itemView.setBackgroundColor(-1);
                holder.b0().setBackground(Shop2023CategoryNativeComponent.h(this.f3318a));
                holder.d0().setTypeface(Typeface.DEFAULT);
            }
        }
    }

    public final boolean G(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bff2c36", new Object[]{this, viewGroup})).booleanValue();
        }
        if (this.m != null) {
            return true;
        }
        if (!this.t) {
            return false;
        }
        TextView textView = new TextView(viewGroup.getContext());
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            textView.setLayoutParams(layoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar = xhv.INSTANCE;
            textView.setLayoutParams(marginLayoutParams);
        }
        this.m = textView;
        textView.setPadding(kew.v(20), 0, 0, 0);
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 == null) {
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams4.width = kew.v(390);
            layoutParams4.height = kew.v(78);
            layoutParams4.leftMargin = kew.v(100);
            layoutParams4.bottomMargin = kew.v(180);
            layoutParams4.gravity = 80;
            xhv xhvVar2 = xhv.INSTANCE;
            textView.setLayoutParams(layoutParams4);
        } else {
            layoutParams3.width = kew.v(390);
            layoutParams3.height = kew.v(78);
            layoutParams3.leftMargin = kew.v(100);
            layoutParams3.bottomMargin = kew.v(180);
            layoutParams3.gravity = 80;
        }
        textView.setBackgroundResource(R.drawable.shop_category_tip);
        textView.setText("点击展开分类 选购更便捷");
        textView.setGravity(17);
        kew.c0(textView, kew.v(28));
        textView.setTextColor(-1);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        viewGroup.addView(textView);
        return true;
    }

    public final void L(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21df1e9d", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            str = "1";
        } else {
            str = "2";
        }
        a1v.n(ShopConstants.PAGE_SHOP, "Page_Shop_allitem_category_tab_exp", A(null, kotlin.collections.a.i(jpu.a("state", str))));
    }

    public final void v(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a79766", new Object[]{this, viewGroup});
            return;
        }
        ckf.g(viewGroup, "container");
        this.b = viewGroup;
        if (viewGroup.getChildCount() == 1) {
            this.j = viewGroup.getChildAt(0);
        }
        View view = this.j;
        if (view != null) {
            kew.X(view, this.s);
        }
        C(viewGroup);
        w(0, false);
        View view2 = this.l;
        if (view2 != null) {
            ViewProxy.setOnClickListener(view2, new c());
            if (ckf.b(this.f, "close")) {
                RecyclerView recyclerView = this.k;
                if (recyclerView != null) {
                    kew.C(recyclerView);
                    View view3 = this.l;
                    if (view3 != null) {
                        view3.post(new d());
                    } else {
                        ckf.y(pg1.ATOM_EXT_button);
                        throw null;
                    }
                } else {
                    ckf.y(OrderConfigs.RECYCLERVIEW);
                    throw null;
                }
            }
            L(ckf.b(this.f, "close"));
            View view4 = this.l;
            if (view4 != null) {
                e eVar = new e();
                aj8.a aVar = aj8.Companion;
                Set<lk8<aj8>> set = aVar.a().get(cyo.class);
                if (set == null) {
                    set = new LinkedHashSet<>();
                    aVar.a().put(cyo.class, set);
                }
                set.add(eVar);
                view4.addOnAttachStateChangeListener(new b(eVar));
                return;
            }
            ckf.y(pg1.ATOM_EXT_button);
            throw null;
        }
        ckf.y(pg1.ATOM_EXT_button);
        throw null;
    }

    public Shop2023CategoryNativeComponent(ups upsVar) {
        ckf.g(upsVar, "tabBarItemDataModel");
        this.f3315a = upsVar;
        this.c = upsVar.c();
        JSONObject d2 = upsVar.d();
        String str = null;
        this.d = d2 == null ? null : d2.getString("url");
        JSONObject b2 = upsVar.b();
        this.e = b2 != null ? b2.getString("url") : str;
        this.f = upsVar.e();
        this.g = -1;
        this.n = -592138;
        this.o = kew.u(-592138, null, null, 0, 0, 0, 0, kew.v(24), 0, 0, 894, null);
        this.p = kew.u(-592138, null, null, 0, 0, kew.v(24), 0, 0, 0, 0, 990, null);
        this.q = kew.u(-1, null, null, 0, 0, kew.v(10), 0, kew.v(10), kew.v(1), kew.c(0, 0.1f), 94, null);
        this.r = kew.u(CircleProgressBar.DEFAULT_CIRCLE_BG_LIGHT, null, null, kew.v(10), 0, 0, 0, 0, kew.v(1), kew.c(0, 0.1f), 246, null);
        this.s = kew.v(132);
        this.v = kotlin.a.b(new Shop2023CategoryNativeComponent$list$2(this));
    }

    public final void w(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd191773", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (i <= y().size() - 1 && this.g != i) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject f = y().get(i).f();
            linkedHashMap.put("utLogMap", f == null ? null : f.toJSONString());
            linkedHashMap.putAll(r54.U(y().get(i).c().getInnerMap()));
            if (z) {
                K(y().get(i).a(), linkedHashMap);
            }
            for (a aVar : y()) {
                aVar.h(0);
            }
            y().get(i).h(1);
            if (i > 0) {
                y().get(i - 1).h(2);
            }
            if (i < y().size() - 1) {
                y().get(i + 1).h(3);
            }
            RecyclerView recyclerView = this.k;
            if (recyclerView != null) {
                recyclerView.getAdapter().notifyDataSetChanged();
                String b2 = i < y().size() - 1 ? y().get(1 + i).b() : null;
                w1a<? super JSONObject, ? super String, ? super JSONObject, xhv> w1aVar = this.u;
                if (w1aVar != null) {
                    w1aVar.invoke(y().get(i).c(), b2, y().get(i).g());
                }
                this.g = i;
                RecyclerView recyclerView2 = this.k;
                if (recyclerView2 != null) {
                    recyclerView2.scrollToPosition(i);
                } else {
                    ckf.y(OrderConfigs.RECYCLERVIEW);
                    throw null;
                }
            } else {
                ckf.y(OrderConfigs.RECYCLERVIEW);
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f3319a;
        public final String b;
        public final JSONObject c;
        public final String d;
        public int e;
        public final JSONObject f;
        public final JSONObject g;

        static {
            t2o.a(766510346);
        }

        public a(String str, String str2, JSONObject jSONObject, String str3, int i, JSONObject jSONObject2, JSONObject jSONObject3) {
            ckf.g(jSONObject, "queryStringMap");
            this.f3319a = str;
            this.b = str2;
            this.c = jSONObject;
            this.d = str3;
            this.e = i;
            this.f = jSONObject2;
            this.g = jSONObject3;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
            }
            return this.b;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
            }
            return this.f3319a;
        }

        public final JSONObject c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("875577c0", new Object[]{this});
            }
            return this.c;
        }

        public final int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
            }
            return this.e;
        }

        public final String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
            }
            return this.d;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (ckf.b(this.f3319a, aVar.f3319a) && ckf.b(this.b, aVar.b) && ckf.b(this.c, aVar.c) && ckf.b(this.d, aVar.d) && this.e == aVar.e && ckf.b(this.f, aVar.f) && ckf.b(this.g, aVar.g)) {
                return true;
            }
            return false;
        }

        public final JSONObject f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("40e47994", new Object[]{this});
            }
            return this.g;
        }

        public final JSONObject g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("1fdad89f", new Object[]{this});
            }
            return this.f;
        }

        public final void h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bfef36d", new Object[]{this, new Integer(i)});
            } else {
                this.e = i;
            }
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.f3319a;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            int i6 = i * 31;
            String str2 = this.b;
            if (str2 == null) {
                i2 = 0;
            } else {
                i2 = str2.hashCode();
            }
            int hashCode = (((i6 + i2) * 31) + this.c.hashCode()) * 31;
            String str3 = this.d;
            if (str3 == null) {
                i3 = 0;
            } else {
                i3 = str3.hashCode();
            }
            int i7 = (((hashCode + i3) * 31) + this.e) * 31;
            JSONObject jSONObject = this.f;
            if (jSONObject == null) {
                i4 = 0;
            } else {
                i4 = jSONObject.hashCode();
            }
            int i8 = (i7 + i4) * 31;
            JSONObject jSONObject2 = this.g;
            if (jSONObject2 != null) {
                i5 = jSONObject2.hashCode();
            }
            return i8 + i5;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Bean(name=" + ((Object) this.f3319a) + ", id=" + ((Object) this.b) + ", queryStringMap=" + this.c + ", url=" + ((Object) this.d) + ", state=" + this.e + ", utParam=" + this.f + ", utLogMap=" + this.g + ')';
        }

        public /* synthetic */ a(String str, String str2, JSONObject jSONObject, String str3, int i, JSONObject jSONObject2, JSONObject jSONObject3, int i2, a07 a07Var) {
            this(str, str2, jSONObject, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? 0 : i, jSONObject2, jSONObject3);
        }
    }
}
