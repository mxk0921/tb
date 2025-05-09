package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class q87 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f26575a;
    public final View b;
    public final View c;
    public FrameLayout d;
    public View e;
    public int f = -1;
    public final int g = kew.v(16);
    public ValueAnimator h;
    public boolean i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ FrameLayout b;

        public a(FrameLayout frameLayout) {
            this.b = frameLayout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int measuredHeight = q87.this.g().getMeasuredHeight();
            if (measuredHeight <= 0) {
                measuredHeight = kew.v(90);
            }
            FrameLayout frameLayout = this.b;
            Context context = frameLayout.getContext();
            ckf.f(context, "context");
            kew.e(frameLayout, kew.y(context) + measuredHeight);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public b(boolean z) {
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
                float floatValue = ((Float) animatedValue).floatValue();
                FrameLayout a2 = q87.a(q87.this);
                if (a2 != null) {
                    a2.setAlpha(floatValue);
                    View g = q87.this.g();
                    boolean z = this.b;
                    q87 q87Var = q87.this;
                    float f = 1 - floatValue;
                    g.setAlpha(f);
                    if (z) {
                        TUrlImageView h = q87Var.h();
                        if (h != null) {
                            h.setAlpha(0.0f);
                        }
                        TUrlImageView i = q87Var.i();
                        if (i != null) {
                            i.setAlpha(0.0f);
                        }
                    }
                    q87.this.j().setAlpha(f);
                    ViewParent parent = q87.this.e().getParent();
                    if (parent != null) {
                        ((View) parent).setAlpha(f);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
                ckf.y("container");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26578a;
        public final /* synthetic */ q87 b;

        public c(boolean z, q87 q87Var) {
            this.f26578a = z;
            this.b = q87Var;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/DefaultV2OtherShopNativeComponent$changeToOtherShop$1$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            if (!this.f26578a) {
                FrameLayout a2 = q87.a(this.b);
                if (a2 != null) {
                    a2.setZ(0.0f);
                    TUrlImageView h = this.b.h();
                    if (h != null) {
                        h.setAlpha(1.0f);
                    }
                    TUrlImageView i = this.b.i();
                    if (i != null) {
                        i.setAlpha(1.0f);
                    }
                } else {
                    ckf.y("container");
                    throw null;
                }
            } else {
                FrameLayout a3 = q87.a(this.b);
                if (a3 != null) {
                    a3.setZ(2.0f);
                } else {
                    ckf.y("container");
                    throw null;
                }
            }
            if (q87.b(this.b)) {
                ViewParent parent = this.b.e().getParent();
                if (parent != null) {
                    kew.C((View) parent);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            ViewParent parent2 = this.b.e().getParent();
            if (parent2 != null) {
                kew.g0((View) parent2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    static {
        t2o.a(766509946);
    }

    public q87(View view, View view2, View view3) {
        ckf.g(view, "headBar");
        ckf.g(view2, "navBar");
        ckf.g(view3, "bottomBar");
        this.f26575a = view;
        this.b = view2;
        this.c = view3;
    }

    public static final /* synthetic */ FrameLayout a(q87 q87Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("9c1bf591", new Object[]{q87Var});
        }
        return q87Var.d;
    }

    public static final /* synthetic */ boolean b(q87 q87Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba9eec47", new Object[]{q87Var})).booleanValue();
        }
        return q87Var.i;
    }

    public final void d(boolean z) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903c3ff2", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.f == -1) {
            this.f = f().getTop();
        }
        if (this.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new b(z));
            ofFloat.addListener(new c(z, this));
            xhv xhvVar = xhv.INSTANCE;
            this.h = ofFloat;
        }
        ValueAnimator valueAnimator4 = this.h;
        if (!(valueAnimator4 == null || !valueAnimator4.isRunning() || (valueAnimator3 = this.h) == null)) {
            valueAnimator3.cancel();
        }
        if (z) {
            if (!this.i && (valueAnimator2 = this.h) != null) {
                valueAnimator2.start();
            }
        } else if (this.i && (valueAnimator = this.h) != null) {
            valueAnimator.reverse();
        }
        this.i = z;
    }

    public final View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b4f37ebb", new Object[]{this});
        }
        return this.c;
    }

    public final View f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1950dff", new Object[]{this});
        }
        View view = this.e;
        if (view != null) {
            return view;
        }
        ckf.y("centerContainer");
        throw null;
    }

    public final View g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2c05b26", new Object[]{this});
        }
        return this.f26575a;
    }

    public final TUrlImageView h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("9923a62b", new Object[]{this});
        }
        return null;
    }

    public final TUrlImageView i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("32514bfd", new Object[]{this});
        }
        return null;
    }

    public final View j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ef459f6f", new Object[]{this});
        }
        return this.b;
    }

    public final void k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af8fec1", new Object[]{this, view});
            return;
        }
        ckf.g(view, "<set-?>");
        this.e = view;
    }

    public final void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d96d314b", new Object[]{this, view});
            return;
        }
        ckf.g(view, "root");
        View findViewById = view.findViewById(R.id.flag_other_shop_container);
        ckf.f(findViewById, "root.findViewById<FrameLayout>(R.id.flag_other_shop_container)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        this.d = frameLayout;
        frameLayout.setAlpha(0.0f);
        Context context = frameLayout.getContext();
        ckf.f(context, "context");
        kew.a0(frameLayout, kew.y(context));
        frameLayout.post(new a(frameLayout));
        frameLayout.setBackgroundColor(-1);
        TUrlImageView tUrlImageView = new TUrlImageView(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams = tUrlImageView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView.setLayoutParams(layoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar = xhv.INSTANCE;
            tUrlImageView.setLayoutParams(marginLayoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = tUrlImageView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams3 = null;
        FrameLayout.LayoutParams layoutParams4 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams4 == null) {
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams5.width = kew.v(54);
            layoutParams5.height = kew.v(54);
            layoutParams5.topMargin = this.g;
            layoutParams5.leftMargin = kew.v(5);
            xhv xhvVar2 = xhv.INSTANCE;
            tUrlImageView.setLayoutParams(layoutParams5);
        } else {
            layoutParams4.width = kew.v(54);
            layoutParams4.height = kew.v(54);
            layoutParams4.topMargin = this.g;
            layoutParams4.leftMargin = kew.v(5);
        }
        tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN013dzdLg1MxVMViYez0_!!6000000001501-2-tps-108-108.png");
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
            layoutParams9.topMargin = this.g;
            linearLayout.setLayoutParams(layoutParams9);
        } else {
            layoutParams8.gravity = 1;
            layoutParams8.topMargin = this.g;
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
        ViewGroup.LayoutParams layoutParams14 = tUrlImageView3.getLayoutParams();
        if (layoutParams14 instanceof FrameLayout.LayoutParams) {
            layoutParams3 = (FrameLayout.LayoutParams) layoutParams14;
        }
        if (layoutParams3 == null) {
            FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams15.width = kew.v(54);
            layoutParams15.height = kew.v(54);
            layoutParams15.topMargin = this.g;
            layoutParams15.rightMargin = kew.v(18);
            layoutParams15.gravity = 5;
            tUrlImageView3.setLayoutParams(layoutParams15);
        } else {
            layoutParams3.width = kew.v(54);
            layoutParams3.height = kew.v(54);
            layoutParams3.topMargin = this.g;
            layoutParams3.rightMargin = kew.v(18);
            layoutParams3.gravity = 5;
        }
        tUrlImageView3.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01ObPozU1ErXGtZezPP_!!6000000000405-2-tps-108-108.png");
        frameLayout.addView(tUrlImageView3);
    }
}
