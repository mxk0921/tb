package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.PointF;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.d15;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class awp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f16046a;

        /* compiled from: Taobao */
        /* renamed from: tb.awp$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0878a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0878a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ViewParent parent = a.this.f16046a.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(a.this.f16046a);
                }
            }
        }

        public a(View view) {
            this.f16046a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                new Handler().post(new RunnableC0878a());
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements TypeEvaluator<PointF> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final PointF f16048a;
        public final View b;

        static {
            t2o.a(295699105);
        }

        public b(PointF pointF, View view) {
            this.f16048a = pointF;
            this.b = view;
        }

        /* renamed from: a */
        public PointF evaluate(float f, PointF pointF, PointF pointF2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PointF) ipChange.ipc$dispatch("3d57b937", new Object[]{this, new Float(f), pointF, pointF2});
            }
            float f2 = 1.0f - f;
            PointF pointF3 = new PointF();
            float f3 = f2 * f2;
            float f4 = f2 * 2.0f * f;
            PointF pointF4 = this.f16048a;
            float f5 = f * f;
            float f6 = (pointF.x * f3) + (pointF4.x * f4) + (pointF2.x * f5);
            pointF3.x = f6;
            pointF3.y = (f3 * pointF.y) + (f4 * pointF4.y) + (f5 * pointF2.y);
            this.b.setTranslationX(f6);
            this.b.setTranslationY(pointF3.y);
            return pointF3;
        }
    }

    static {
        t2o.a(295699102);
    }

    public static void b(View view, Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca39556c", new Object[]{view, animationListener});
        } else if (view != null && view.getVisibility() == 0) {
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.74f, 1, 0.0f);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.setDuration(150L);
            animationSet.setInterpolator(new AccelerateInterpolator());
            animationSet.setAnimationListener(animationListener);
            view.startAnimation(animationSet);
        }
    }

    public static void c(View view, Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c84494f", new Object[]{view, animationListener});
        } else if (view != null && view.getVisibility() == 0) {
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.74f, 1, 0.0f);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.setDuration(150L);
            animationSet.setInterpolator(new AccelerateInterpolator());
            animationSet.setAnimationListener(animationListener);
            view.startAnimation(animationSet);
        }
    }

    public static void d(View view, ux9 ux9Var, Animation.AnimationListener animationListener) {
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eab85d2", new Object[]{view, ux9Var, animationListener});
        } else if (view != null && view.getVisibility() == 0) {
            if (view.getParent() == null || !(view.getParent() instanceof LinearLayout)) {
                view2 = view;
            } else {
                view2 = (View) view.getParent();
            }
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 1.0f, 1, 1.0f);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.setDuration(500L);
            animationSet.setInterpolator(new AccelerateInterpolator());
            if (vwl.e().g()) {
                d15 d15Var = new d15(view2, animationSet, "AnimationLifeCycle/ShowCaseCloseAnimation");
                d15Var.addAnimationListener(new d15.b(animationListener, animationSet));
                d15Var.c(true);
                if (ux9Var == null || ux9Var.d() == null) {
                    animationSet.setAnimationListener(animationListener);
                    view2.startAnimation(animationSet);
                    return;
                }
                ux9Var.d().a(d15Var);
                return;
            }
            animationSet.setAnimationListener(animationListener);
            view2.startAnimation(animationSet);
        }
    }

    public static void e(View view, ux9 ux9Var, Animation.AnimationListener animationListener) {
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d068279", new Object[]{view, ux9Var, animationListener});
        } else if (view != null && view.getVisibility() == 0) {
            if (view.getParent() == null || !(view.getParent() instanceof LinearLayout)) {
                view2 = view;
            } else {
                view2 = (View) view.getParent();
            }
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 1.0f);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.setDuration(500L);
            animationSet.setInterpolator(new AccelerateInterpolator());
            if (vwl.e().g()) {
                d15 d15Var = new d15(view2, animationSet, "AnimationLifeCycle/ShowCaseShowAnimation");
                d15Var.c(true);
                d15Var.addAnimationListener(new d15.b(animationListener, animationSet));
                if (ux9Var == null || ux9Var.d() == null) {
                    animationSet.setAnimationListener(animationListener);
                    view2.startAnimation(animationSet);
                    return;
                }
                ux9Var.d().a(d15Var);
                return;
            }
            animationSet.setAnimationListener(animationListener);
            view2.startAnimation(animationSet);
        }
    }

    public static void a(View view, View view2, View view3, View view4, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b654d", new Object[]{view, view2, view3, view4, new Long(j)});
        } else if (view == null || view2 == null || view3 == null) {
            hha.b("ShowcaseAnimation", "cartBezierAnim | view empty.");
        } else {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            PointF pointF = new PointF(nw0.a(60.0f), iArr[1] + (view2.getHeight() / 2));
            if (view4 != null) {
                view4.getLocationInWindow(iArr);
                pointF = new PointF(nw0.a(60.0f), iArr[1] + (view4.getHeight() / 2));
            }
            int[] iArr2 = new int[2];
            view3.getLocationInWindow(iArr2);
            PointF pointF2 = new PointF(iArr2[0], iArr2[1]);
            PointF pointF3 = new PointF((pointF2.x * 3.0f) / 4.0f, 0.0f);
            hha.b("ShowcaseAnimation", "cartBezierAnim | startX=" + pointF.x + "   startY=" + pointF.y + "     endX=" + pointF2.x + " endY=" + pointF2.y + "     controlX=" + pointF3.x + " controlPointY=" + pointF3.y);
            ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "position", new b(pointF3, view), pointF, pointF2);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.5f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.5f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.5f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(j);
            animatorSet.playTogether(ofObject, ofFloat, ofFloat2, ofFloat3);
            animatorSet.addListener(new a(view));
            animatorSet.start();
        }
    }
}
