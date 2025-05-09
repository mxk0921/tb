package tb;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class ix1 extends ValueAnimator {

    /* renamed from: a  reason: collision with root package name */
    public final Set<ValueAnimator.AnimatorUpdateListener> f21625a = new CopyOnWriteArraySet();
    public final Set<Animator.AnimatorListener> b = new CopyOnWriteArraySet();

    public void a() {
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        ((CopyOnWriteArraySet) this.b).add(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ((CopyOnWriteArraySet) this.f21625a).add(animatorUpdateListener);
    }

    public void b(boolean z) {
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public void c() {
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
        }
    }

    public void d(boolean z) {
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    public void e() {
        Iterator it = ((CopyOnWriteArraySet) this.f21625a).iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        zhh.b("LottieAnimator does not support getStartDelay.");
        return 0L;
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        ((CopyOnWriteArraySet) this.b).clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        ((CopyOnWriteArraySet) this.f21625a).clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        ((CopyOnWriteArraySet) this.b).remove(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ((CopyOnWriteArraySet) this.f21625a).remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        zhh.b("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        zhh.b("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        zhh.b("LottieAnimator does not support setDuration.");
        return null;
    }
}
