package tb;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.MarginSupportFrameLayout;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class bdw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MarginSupportFrameLayout f16336a;
        public final /* synthetic */ int b;

        public a(MarginSupportFrameLayout marginSupportFrameLayout, int i) {
            this.f16336a = marginSupportFrameLayout;
            this.b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            MarginSupportFrameLayout marginSupportFrameLayout = this.f16336a;
            float f = this.b;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                marginSupportFrameLayout.setMarginTop(f + ((Float) animatedValue).floatValue());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f16337a;
        public final /* synthetic */ int b;

        public b(FrameLayout frameLayout, int i) {
            this.f16337a = frameLayout;
            this.b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            FrameLayout frameLayout = this.f16337a;
            float f = this.b;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                kew.d0(frameLayout, (int) (f + ((Float) animatedValue).floatValue()));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    static {
        t2o.a(766509559);
    }

    public static final Animator a(View view, Integer num, Integer num2, Integer num3) {
        int i;
        int i2;
        Float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("2a2b02bf", new Object[]{view, num, num2, num3});
        }
        ckf.g(view, "<this>");
        int width = view.getWidth();
        int height = view.getHeight();
        if (num == null) {
            i = width / 2;
        } else {
            i = num.intValue();
        }
        if (num2 == null) {
            i2 = height / 2;
        } else {
            i2 = num2.intValue();
        }
        if (num3 == null) {
            f = null;
        } else {
            f = Float.valueOf(num3.intValue());
        }
        if (f == null) {
            f2 = Math.max(width, height);
        } else {
            f2 = f.floatValue();
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, 0.0f, f2);
        createCircularReveal.setDuration(300L);
        createCircularReveal.setInterpolator(new AccelerateDecelerateInterpolator());
        return createCircularReveal;
    }

    public static final Animator b(View view, float f, long j, Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("8875f145", new Object[]{view, new Float(f), new Long(j), animatorListener});
        }
        ckf.g(view, "<this>");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "Alpha", f);
        ofFloat.setDuration(j);
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        return ofFloat;
    }

    public static /* synthetic */ Animator c(View view, float f, long j, Animator.AnimatorListener animatorListener, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("6ff1a5ff", new Object[]{view, new Float(f), new Long(j), animatorListener, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            j = 300;
        }
        if ((i & 4) != 0) {
            animatorListener = null;
        }
        return b(view, f, j, animatorListener);
    }

    public static final Animator d(View view, Integer num, Integer num2) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("f3708f93", new Object[]{view, num, num2});
        }
        ckf.g(view, "<this>");
        int width = view.getWidth();
        int height = view.getHeight();
        if (num == null) {
            i = width / 2;
        } else {
            i = num.intValue();
        }
        if (num2 == null) {
            i2 = height / 2;
        } else {
            i2 = num2.intValue();
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, Math.max(width, height), 0.0f);
        createCircularReveal.setDuration(300L);
        createCircularReveal.setInterpolator(new AccelerateDecelerateInterpolator());
        return createCircularReveal;
    }

    public static final Animator e(View view, float f, long j, Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("2d9c3c8a", new Object[]{view, new Float(f), new Long(j), animatorListener});
        }
        ckf.g(view, "<this>");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "Y", view.getY() + f);
        ofFloat.setDuration(j);
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        return ofFloat;
    }

    public static /* synthetic */ Animator f(View view, float f, long j, Animator.AnimatorListener animatorListener, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("e88b779a", new Object[]{view, new Float(f), new Long(j), animatorListener, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            j = 300;
        }
        if ((i & 4) != 0) {
            animatorListener = null;
        }
        return e(view, f, j, animatorListener);
    }

    public static final Animator g(FrameLayout frameLayout, float f, long j, Animator.AnimatorListener animatorListener, Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("4c84eae8", new Object[]{frameLayout, new Float(f), new Long(j), animatorListener, interpolator});
        }
        ckf.g(frameLayout, "<this>");
        int z = kew.z(frameLayout);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f);
        ofFloat.addUpdateListener(new b(frameLayout, z));
        ofFloat.setDuration(j);
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        if (interpolator != null) {
            ofFloat.setInterpolator(interpolator);
        }
        return ofFloat;
    }

    public static final Animator h(MarginSupportFrameLayout marginSupportFrameLayout, float f, long j, Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("f5e0dd46", new Object[]{marginSupportFrameLayout, new Float(f), new Long(j), animatorListener});
        }
        ckf.g(marginSupportFrameLayout, "<this>");
        int z = kew.z(marginSupportFrameLayout);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f);
        ofFloat.addUpdateListener(new a(marginSupportFrameLayout, z));
        ofFloat.setDuration(j);
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        return ofFloat;
    }

    public static /* synthetic */ Animator i(FrameLayout frameLayout, float f, long j, Animator.AnimatorListener animatorListener, Interpolator interpolator, int i, Object obj) {
        Animator.AnimatorListener animatorListener2;
        Interpolator interpolator2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("e67e0dbc", new Object[]{frameLayout, new Float(f), new Long(j), animatorListener, interpolator, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            j = 300;
        }
        if ((i & 4) != 0) {
            animatorListener2 = null;
        } else {
            animatorListener2 = animatorListener;
        }
        if ((i & 8) != 0) {
            interpolator2 = null;
        } else {
            interpolator2 = interpolator;
        }
        return g(frameLayout, f, j, animatorListener2, interpolator2);
    }

    public static /* synthetic */ Animator j(MarginSupportFrameLayout marginSupportFrameLayout, float f, long j, Animator.AnimatorListener animatorListener, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("5abb0004", new Object[]{marginSupportFrameLayout, new Float(f), new Long(j), animatorListener, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            j = 300;
        }
        if ((i & 4) != 0) {
            animatorListener = null;
        }
        return h(marginSupportFrameLayout, f, j, animatorListener);
    }
}
