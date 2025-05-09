package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023BottomBarNativeComponent;
import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023TopNavBarNativeComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class lnp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final inp f23448a;
    public FrameLayout b;
    public View c;
    public int d = -1;
    public Shop2023BottomBarNativeComponent e;
    public ValueAnimator f;
    public boolean g;

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
            inp g = lnp.this.g();
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
            inp g = lnp.this.g();
            if (g != null && (x = g.x()) != null) {
                x.performClick();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/nativeview/Shop2023OtherShopNativeComponent$changeToOtherShop$1$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FrameLayout t;
            FrameLayout t2;
            TUrlImageView tUrlImageView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            TUrlImageView tUrlImageView2 = null;
            if (!lnp.b(lnp.this)) {
                FrameLayout a2 = lnp.a(lnp.this);
                if (a2 != null) {
                    a2.setZ(0.0f);
                    inp g = lnp.this.g();
                    if (g == null) {
                        tUrlImageView = null;
                    } else {
                        tUrlImageView = g.w();
                    }
                    if (tUrlImageView != null) {
                        tUrlImageView.setAlpha(1.0f);
                    }
                    inp g2 = lnp.this.g();
                    if (g2 != null) {
                        tUrlImageView2 = g2.x();
                    }
                    if (tUrlImageView2 != null) {
                        tUrlImageView2.setAlpha(1.0f);
                    }
                } else {
                    ckf.y("container");
                    throw null;
                }
            } else {
                FrameLayout a3 = lnp.a(lnp.this);
                if (a3 != null) {
                    a3.setZ(2.0f);
                } else {
                    ckf.y("container");
                    throw null;
                }
            }
            if (lnp.b(lnp.this)) {
                Shop2023BottomBarNativeComponent e = lnp.this.e();
                if (e != null && (t2 = e.t()) != null) {
                    kew.C(t2);
                    return;
                }
                return;
            }
            Shop2023BottomBarNativeComponent e2 = lnp.this.e();
            if (e2 != null && (t = e2.t()) != null) {
                kew.g0(t);
            }
        }
    }

    static {
        t2o.a(766510380);
    }

    public lnp(inp inpVar) {
        this.f23448a = inpVar;
    }

    public static final /* synthetic */ FrameLayout a(lnp lnpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("274f2bac", new Object[]{lnpVar});
        }
        return lnpVar.b;
    }

    public static final /* synthetic */ boolean b(lnp lnpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed85c076", new Object[]{lnpVar})).booleanValue();
        }
        return lnpVar.g;
    }

    public final void d(boolean z) {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903c3ff2", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.d == -1) {
            this.d = f().getTop();
        }
        if (this.f == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new c(z));
            ofFloat.addListener(new d());
            xhv xhvVar = xhv.INSTANCE;
            this.f = ofFloat;
        }
        ValueAnimator valueAnimator2 = this.f;
        if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || (valueAnimator = this.f) == null)) {
            valueAnimator.cancel();
        }
        if (z) {
            ValueAnimator valueAnimator3 = this.f;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
        } else {
            ValueAnimator valueAnimator4 = this.f;
            if (valueAnimator4 != null) {
                valueAnimator4.reverse();
            }
        }
        this.g = z;
    }

    public final Shop2023BottomBarNativeComponent e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Shop2023BottomBarNativeComponent) ipChange.ipc$dispatch("62560e58", new Object[]{this});
        }
        return this.e;
    }

    public final View f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1950dff", new Object[]{this});
        }
        View view = this.c;
        if (view != null) {
            return view;
        }
        ckf.y("centerContainer");
        throw null;
    }

    public final inp g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (inp) ipChange.ipc$dispatch("9ab12bea", new Object[]{this});
        }
        return this.f23448a;
    }

    public final void h(Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74906bc6", new Object[]{this, shop2023BottomBarNativeComponent});
        } else {
            this.e = shop2023BottomBarNativeComponent;
        }
    }

    public final void i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af8fec1", new Object[]{this, view});
            return;
        }
        ckf.g(view, "<set-?>");
        this.c = view;
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
            Shop2023TopNavBarNativeComponent A;
            ViewGroup g;
            View z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                FrameLayout a2 = lnp.a(lnp.this);
                FrameLayout frameLayout = null;
                if (a2 != null) {
                    a2.setAlpha(floatValue);
                    inp g2 = lnp.this.g();
                    if (!(g2 == null || (z = g2.z()) == null)) {
                        boolean z2 = this.b;
                        lnp lnpVar = lnp.this;
                        z.setAlpha(1 - floatValue);
                        if (z2) {
                            lnpVar.g().w().setAlpha(0.0f);
                            lnpVar.g().x().setAlpha(0.0f);
                        }
                        FrameLayout a3 = lnp.a(lnpVar);
                        if (a3 != null) {
                            z.setTranslationY((-a3.getHeight()) * floatValue);
                        } else {
                            ckf.y("container");
                            throw null;
                        }
                    }
                    inp g3 = lnp.this.g();
                    if (!(g3 == null || (A = g3.A()) == null || (g = A.g()) == null)) {
                        lnp lnpVar2 = lnp.this;
                        g.setTranslationY((-(g.getHeight() + kew.v(2))) * Math.min(2 * floatValue, 1.0f));
                        lnpVar2.f().setTranslationY(g.getTranslationY());
                    }
                    Shop2023BottomBarNativeComponent e = lnp.this.e();
                    if (e != null) {
                        frameLayout = e.t();
                    }
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1 - floatValue);
                        return;
                    }
                    return;
                }
                ckf.y("container");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public final void c(View view) {
        int i;
        sop y;
        sop y2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d96d314b", new Object[]{this, view});
            return;
        }
        ckf.g(view, "root");
        View findViewById = view.findViewById(R.id.shop_2023_other_shop_container);
        ckf.f(findViewById, "root.findViewById<FrameLayout>(R.id.shop_2023_other_shop_container)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        this.b = frameLayout;
        frameLayout.setAlpha(0.0f);
        Context context = frameLayout.getContext();
        ckf.f(context, "context");
        kew.a0(frameLayout, kew.y(context));
        Context context2 = frameLayout.getContext();
        ckf.f(context2, "context");
        int y3 = kew.y(context2);
        inp g = g();
        FrameLayout.LayoutParams layoutParams = null;
        Integer valueOf = (g == null || (y2 = g.y()) == null) ? null : Integer.valueOf(y2.o());
        if (valueOf == null) {
            i = kew.v(90);
        } else {
            i = valueOf.intValue();
        }
        int i2 = y3 + i;
        inp g2 = g();
        int i3 = 66;
        if (!(g2 == null || (y = g2.y()) == null)) {
            i3 = y.c();
        }
        kew.e(frameLayout, i2 + ((int) (kew.v(Integer.valueOf(i3)) * 0.18f)));
        frameLayout.setBackgroundColor(-1);
        TUrlImageView tUrlImageView = new TUrlImageView(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams2 = tUrlImageView.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView.setLayoutParams(layoutParams2);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar = xhv.INSTANCE;
            tUrlImageView.setLayoutParams(marginLayoutParams);
        }
        tUrlImageView.setContentDescription("返回");
        ViewGroup.LayoutParams layoutParams3 = tUrlImageView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 == null) {
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams5.width = kew.v(54);
            layoutParams5.height = kew.v(54);
            layoutParams5.topMargin = kew.v(12);
            layoutParams5.leftMargin = kew.v(12);
            xhv xhvVar2 = xhv.INSTANCE;
            tUrlImageView.setLayoutParams(layoutParams5);
        } else {
            layoutParams4.width = kew.v(54);
            layoutParams4.height = kew.v(54);
            layoutParams4.topMargin = kew.v(12);
            layoutParams4.leftMargin = kew.v(12);
        }
        tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN013dzdLg1MxVMViYez0_!!6000000001501-2-tps-108-108.png");
        tUrlImageView.setOnClickListener(new a());
        frameLayout.addView(tUrlImageView);
        xhv xhvVar3 = xhv.INSTANCE;
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams6 = linearLayout.getLayoutParams();
        if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout.setLayoutParams(layoutParams6);
        } else {
            linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        linearLayout.setGravity(17);
        ViewGroup.LayoutParams layoutParams7 = linearLayout.getLayoutParams();
        FrameLayout.LayoutParams layoutParams8 = layoutParams7 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams7 : null;
        if (layoutParams8 == null) {
            FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams9.gravity = 1;
            layoutParams9.topMargin = kew.v(12);
            linearLayout.setLayoutParams(layoutParams9);
        } else {
            layoutParams8.gravity = 1;
            layoutParams8.topMargin = kew.v(12);
        }
        TUrlImageView tUrlImageView2 = new TUrlImageView(linearLayout.getContext());
        ViewGroup.LayoutParams layoutParams10 = tUrlImageView2.getLayoutParams();
        if (layoutParams10 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView2.setLayoutParams(layoutParams10);
        } else {
            tUrlImageView2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01vCKFka1CuAMXT24wB_!!6000000000140-2-tps-34-34.png");
        ViewGroup.LayoutParams layoutParams11 = tUrlImageView2.getLayoutParams();
        if (layoutParams11 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams11;
            marginLayoutParams2.width = kew.v(36);
            marginLayoutParams2.height = kew.v(36);
            marginLayoutParams2.rightMargin = kew.v(16);
            tUrlImageView2.setLayoutParams(layoutParams11);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams3.width = kew.v(36);
            marginLayoutParams3.height = kew.v(36);
            marginLayoutParams3.rightMargin = kew.v(16);
            tUrlImageView2.setLayoutParams(marginLayoutParams3);
        }
        linearLayout.addView(tUrlImageView2);
        TextView textView = new TextView(linearLayout.getContext());
        ViewGroup.LayoutParams layoutParams12 = textView.getLayoutParams();
        if (layoutParams12 instanceof ViewGroup.MarginLayoutParams) {
            textView.setLayoutParams(layoutParams12);
        } else {
            textView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        kew.c0(textView, kew.v(36));
        textView.setTextColor(-16777216);
        textView.setText("其他店铺的精选推荐");
        linearLayout.addView(textView);
        frameLayout.addView(linearLayout);
        TUrlImageView tUrlImageView3 = new TUrlImageView(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams13 = tUrlImageView3.getLayoutParams();
        if (layoutParams13 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView3.setLayoutParams(layoutParams13);
        } else {
            tUrlImageView3.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        tUrlImageView3.setContentDescription(sqj.MORE_BUTTON);
        ViewGroup.LayoutParams layoutParams14 = tUrlImageView3.getLayoutParams();
        if (layoutParams14 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams14;
        }
        if (layoutParams == null) {
            FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams15.width = kew.v(54);
            layoutParams15.height = kew.v(54);
            layoutParams15.topMargin = kew.v(12);
            layoutParams15.rightMargin = kew.v(18);
            layoutParams15.gravity = 5;
            tUrlImageView3.setLayoutParams(layoutParams15);
        } else {
            layoutParams.width = kew.v(54);
            layoutParams.height = kew.v(54);
            layoutParams.topMargin = kew.v(12);
            layoutParams.rightMargin = kew.v(18);
            layoutParams.gravity = 5;
        }
        tUrlImageView3.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01ObPozU1ErXGtZezPP_!!6000000000405-2-tps-108-108.png");
        tUrlImageView3.setOnClickListener(new b());
        frameLayout.addView(tUrlImageView3);
    }
}
