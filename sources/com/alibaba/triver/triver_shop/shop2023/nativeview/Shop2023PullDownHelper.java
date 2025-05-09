package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.ckf;
import tb.inp;
import tb.kew;
import tb.r54;
import tb.sqj;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2023PullDownHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final inp f3335a;
    public final View[] b;
    public View c;
    public TUrlImageView d;
    public TUrlImageView e;
    public ValueAnimator f;
    public boolean g = true;
    public final int h = kew.v(1000);
    public int i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TUrlImageView w;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            inp g = Shop2023PullDownHelper.this.g();
            if (g != null && (w = g.w()) != null) {
                w.performClick();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TUrlImageView x;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            inp g = Shop2023PullDownHelper.this.g();
            if (g != null && (x = g.x()) != null) {
                x.performClick();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            Shop2023PullDownHelper shop2023PullDownHelper = Shop2023PullDownHelper.this;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                Shop2023PullDownHelper.e(shop2023PullDownHelper, ((Integer) animatedValue).intValue());
                Shop2023PullDownHelper shop2023PullDownHelper2 = Shop2023PullDownHelper.this;
                Shop2023PullDownHelper.d(shop2023PullDownHelper2, Shop2023PullDownHelper.c(shop2023PullDownHelper2));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    static {
        t2o.a(766510385);
    }

    public Shop2023PullDownHelper(inp inpVar, View[] viewArr) {
        ckf.g(viewArr, "viewsToMove");
        this.f3335a = inpVar;
        this.b = viewArr;
    }

    public static final /* synthetic */ TUrlImageView a(Shop2023PullDownHelper shop2023PullDownHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("528d5023", new Object[]{shop2023PullDownHelper});
        }
        return shop2023PullDownHelper.e;
    }

    public static final /* synthetic */ TUrlImageView b(Shop2023PullDownHelper shop2023PullDownHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("f30bf91", new Object[]{shop2023PullDownHelper});
        }
        return shop2023PullDownHelper.d;
    }

    public static final /* synthetic */ int c(Shop2023PullDownHelper shop2023PullDownHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970fc9a6", new Object[]{shop2023PullDownHelper})).intValue();
        }
        return shop2023PullDownHelper.i;
    }

    public static final /* synthetic */ void d(Shop2023PullDownHelper shop2023PullDownHelper, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc43be6", new Object[]{shop2023PullDownHelper, new Integer(i)});
        } else {
            shop2023PullDownHelper.k(i);
        }
    }

    public static final /* synthetic */ void e(Shop2023PullDownHelper shop2023PullDownHelper, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf36ef0", new Object[]{shop2023PullDownHelper, new Integer(i)});
        } else {
            shop2023PullDownHelper.m(i);
        }
    }

    public final void f(FrameLayout frameLayout) {
        TUrlImageView x;
        TUrlImageView w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42eba32a", new Object[]{this, frameLayout});
            return;
        }
        ckf.g(frameLayout, "container");
        TUrlImageView tUrlImageView = new TUrlImageView(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams = tUrlImageView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView.setLayoutParams(layoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar = xhv.INSTANCE;
            tUrlImageView.setLayoutParams(marginLayoutParams);
        }
        this.e = tUrlImageView;
        tUrlImageView.setContentDescription("返回");
        ViewGroup.LayoutParams layoutParams2 = tUrlImageView.getLayoutParams();
        String str = null;
        FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 == null) {
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams4.width = kew.v(54);
            layoutParams4.height = kew.v(54);
            layoutParams4.topMargin = kew.v(12);
            layoutParams4.leftMargin = kew.v(12);
            xhv xhvVar2 = xhv.INSTANCE;
            tUrlImageView.setLayoutParams(layoutParams4);
        } else {
            layoutParams3.width = kew.v(54);
            layoutParams3.height = kew.v(54);
            layoutParams3.topMargin = kew.v(12);
            layoutParams3.leftMargin = kew.v(12);
        }
        inp g = g();
        tUrlImageView.setImageUrl((g == null || (w = g.w()) == null) ? null : w.getImageUrl());
        tUrlImageView.setOnClickListener(new a());
        frameLayout.addView(tUrlImageView);
        TUrlImageView tUrlImageView2 = new TUrlImageView(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams5 = tUrlImageView2.getLayoutParams();
        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView2.setLayoutParams(layoutParams5);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar3 = xhv.INSTANCE;
            tUrlImageView2.setLayoutParams(marginLayoutParams2);
        }
        this.d = tUrlImageView2;
        tUrlImageView2.setContentDescription(sqj.MORE_BUTTON);
        ViewGroup.LayoutParams layoutParams6 = tUrlImageView2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams7 = layoutParams6 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams6 : null;
        if (layoutParams7 == null) {
            FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams8.width = kew.v(54);
            layoutParams8.height = kew.v(54);
            layoutParams8.topMargin = kew.v(12);
            layoutParams8.rightMargin = kew.v(18);
            layoutParams8.gravity = 5;
            xhv xhvVar4 = xhv.INSTANCE;
            tUrlImageView2.setLayoutParams(layoutParams8);
        } else {
            layoutParams7.width = kew.v(54);
            layoutParams7.height = kew.v(54);
            layoutParams7.topMargin = kew.v(12);
            layoutParams7.rightMargin = kew.v(18);
            layoutParams7.gravity = 5;
        }
        inp g2 = g();
        if (!(g2 == null || (x = g2.x()) == null)) {
            str = x.getImageUrl();
        }
        tUrlImageView2.setImageUrl(str);
        tUrlImageView2.setOnClickListener(new b());
        frameLayout.addView(tUrlImageView2);
        inp inpVar = this.f3335a;
        if (inpVar != null) {
            inpVar.O(new Shop2023PullDownHelper$attachTo$2(this));
        }
    }

    public final inp g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (inp) ipChange.ipc$dispatch("9ab12bea", new Object[]{this});
        }
        return this.f3335a;
    }

    public final void h(int i) {
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85a8f29", new Object[]{this, new Integer(i)});
        } else if (this.g) {
            ValueAnimator valueAnimator = this.f;
            TUrlImageView tUrlImageView2 = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f = null;
            }
            if (this.i <= 0) {
                m(0);
            }
            inp inpVar = this.f3335a;
            if (inpVar == null) {
                tUrlImageView = null;
            } else {
                tUrlImageView = inpVar.w();
            }
            if (tUrlImageView != null) {
                tUrlImageView.setAlpha(0.0f);
            }
            inp inpVar2 = this.f3335a;
            if (inpVar2 != null) {
                tUrlImageView2 = inpVar2.x();
            }
            if (tUrlImageView2 != null) {
                tUrlImageView2.setAlpha(0.0f);
            }
            int i2 = this.i;
            m(i2 + ((int) (i * (1 - (i2 / this.h)))));
            k(this.i);
        }
    }

    public final boolean i() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40bc073b", new Object[]{this})).booleanValue();
        }
        if (!this.g || (i = this.i) <= 0) {
            return false;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, 0);
        ofInt.addUpdateListener(new c());
        ofInt.start();
        xhv xhvVar = xhv.INSTANCE;
        this.f = ofInt;
        return true;
    }

    public final boolean j(int i) {
        int i2;
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e0dfe1e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!this.g || (i2 = this.i) <= 0) {
            return false;
        }
        m(i2 - i);
        if (this.i <= 0) {
            inp inpVar = this.f3335a;
            TUrlImageView tUrlImageView2 = null;
            if (inpVar == null) {
                tUrlImageView = null;
            } else {
                tUrlImageView = inpVar.w();
            }
            if (tUrlImageView != null) {
                tUrlImageView.setAlpha(1.0f);
            }
            inp inpVar2 = this.f3335a;
            if (inpVar2 != null) {
                tUrlImageView2 = inpVar2.x();
            }
            if (tUrlImageView2 != null) {
                tUrlImageView2.setAlpha(1.0f);
            }
            m(0);
        }
        k(this.i);
        return true;
    }

    public final void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb38caa", new Object[]{this, new Integer(i)});
            return;
        }
        for (View view : this.b) {
            view.setTranslationY(i);
        }
    }

    public final void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public final void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50335be0", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.h;
        if (i > i2) {
            this.i = i2;
        } else {
            this.i = i;
        }
        if (i >= 0) {
            float I = 1 + r54.I(Float.valueOf(i * 1.4f), Integer.valueOf(this.h));
            View view = this.c;
            if (view != null) {
                view.setScaleX(I);
            }
            View view2 = this.c;
            if (view2 != null) {
                view2.setScaleY(I);
            }
        }
    }

    public final void n(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7c757e", new Object[]{this, view});
            return;
        }
        this.c = view;
        if (view != null) {
            view.setPivotX(kew.v(750) / 2.0f);
        }
        View view2 = this.c;
        if (view2 != null) {
            view2.setPivotY(0.0f);
        }
    }
}
