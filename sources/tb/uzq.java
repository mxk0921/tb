package tb;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class uzq implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f29702a;
    public float b;
    public final float c;
    public float d;
    public a e;
    public float f;
    public float g;
    public int h;
    public boolean i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a(float f);

        void b(float f);

        void c();

        void d();

        void onDismiss();

        void onReset();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(918552809);
        }

        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public final uzq a(View view, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uzq) ipChange.ipc$dispatch("f4319e97", new Object[]{this, view, aVar});
            }
            ckf.g(view, "view");
            ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
            ckf.f(viewConfiguration, "ViewConfiguration.get(view.context)");
            Context context = view.getContext();
            ckf.f(context, "view.context");
            Resources resources = context.getResources();
            ckf.f(resources, "view.context.resources");
            return new uzq(aVar, viewConfiguration.getScaledTouchSlop() * 2, resources.getDisplayMetrics().heightPixels * 0.5f, 0.0f, 8, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        boolean canBeSwiped();
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "animation", "Ltb/xhv;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class d implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ckf.f(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                a a2 = uzq.a(uzq.this);
                if (a2 != null) {
                    a2.b(floatValue);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    static {
        t2o.a(918552807);
    }

    public uzq(a aVar, int i, float f, float f2) {
        j(aVar);
        this.f29702a = i;
        this.c = f;
        this.d = f2;
    }

    public static final /* synthetic */ a a(uzq uzqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1830f325", new Object[]{uzqVar});
        }
        return uzqVar.e;
    }

    public final float b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("afe0794b", new Object[]{this, new Float(f)})).floatValue();
        }
        float f2 = this.c;
        if (f > f2) {
            return f2;
        }
        return f;
    }

    public final ViewGroup c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("b0015f4d", new Object[]{this, view});
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            return (ViewGroup) parent;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final boolean d(View view, MotionEvent motionEvent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("555c1ec1", new Object[]{this, view, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float rawX = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    float f = rawY - this.b;
                    float f2 = rawX - this.f;
                    float f3 = rawY - this.g;
                    this.f = rawX;
                    this.g = rawY;
                    if (!h(motionEvent)) {
                        return false;
                    }
                    if (!this.i && !f(f2, f3) && !e(f)) {
                        return false;
                    }
                    if (!this.i) {
                        c(view).requestDisallowInterceptTouchEvent(true);
                        a aVar = this.e;
                        if (aVar != null) {
                            aVar.c();
                        }
                    }
                    this.i = true;
                    i(view, f2, f3);
                    return false;
                } else if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        return false;
                    }
                    m(view);
                    this.i = false;
                    this.h = -1;
                    return false;
                }
            }
            if (!h(motionEvent) || !this.i) {
                z = false;
            } else {
                z = l(view);
            }
            c(view).requestDisallowInterceptTouchEvent(false);
            this.i = false;
            return z;
        }
        this.f = motionEvent.getRawX();
        float rawY2 = motionEvent.getRawY();
        this.g = rawY2;
        this.b = rawY2;
        this.i = false;
        this.h = motionEvent.getPointerId(motionEvent.getPointerCount() - 1);
        return false;
    }

    public final boolean e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16cea69c", new Object[]{this, new Float(f)})).booleanValue();
        }
        if (Math.abs(f) > this.f29702a) {
            return true;
        }
        return false;
    }

    public final boolean f(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d10e7249", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        double d2 = f2;
        if (Math.abs(d2) <= Math.abs(f) || Math.abs(d2) <= 10) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("240b52a3", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final boolean h(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c382b8b", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.h < 0 || motionEvent.getPointerCount() != 1) {
            return false;
        }
        return true;
    }

    public final void i(View view, float f, float f2) {
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5191f4d5", new Object[]{this, view, new Float(f), new Float(f2)});
            return;
        }
        float translationX = view.getTranslationX() + f;
        float b2 = b(view.getTranslationY() + f2);
        view.setTranslationX(translationX);
        view.setTranslationY(b2);
        if (b2 < 0) {
            f3 = 0.0f;
        } else {
            f3 = b2 / this.c;
        }
        float f4 = 1 - f3;
        float f5 = (f4 * 0.5f) + 0.5f;
        view.setScaleX(f5);
        view.setScaleY(f5);
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(b2);
        }
        a aVar2 = this.e;
        if (aVar2 != null) {
            aVar2.b(f4);
        }
    }

    public final void j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba742cf5", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    public final void k(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5033509d", new Object[]{this, new Float(f)});
        } else {
            this.d = f;
        }
    }

    public final boolean l(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0feac40", new Object[]{this, view})).booleanValue();
        }
        view.getTranslationX();
        if (view.getTranslationY() > this.d) {
            a aVar = this.e;
            if (aVar != null) {
                aVar.onDismiss();
            }
            return true;
        }
        a aVar2 = this.e;
        if (aVar2 != null) {
            aVar2.onReset();
        }
        m(view);
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        ckf.g(view, "v");
        ckf.g(motionEvent, "event");
        return ((!(view instanceof c) || ((c) view).canBeSwiped() || this.i) ? d(view, motionEvent) : false) || view.onTouchEvent(motionEvent);
    }

    public final void m(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e268bc5b", new Object[]{this, view});
        } else if (view.getTranslationX() != 0.0f || view.getTranslationY() != 0.0f) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationX", 0.0f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "translationY", 0.0f);
            ofFloat.addUpdateListener(new d());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(100L);
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            animatorSet.start();
        }
    }

    public /* synthetic */ uzq(a aVar, int i, float f, float f2, int i2, a07 a07Var) {
        this(aVar, i, f, (i2 & 8) != 0 ? 0.3f * f : f2);
    }
}
