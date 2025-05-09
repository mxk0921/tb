package tb;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class j1j {

    /* renamed from: a  reason: collision with root package name */
    public final long f21701a;
    public final long b;
    public final TimeInterpolator c;
    public int d;
    public int e;

    public j1j(long j, long j2) {
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.f21701a = j;
        this.b = j2;
    }

    public static j1j b(ValueAnimator valueAnimator) {
        j1j j1jVar = new j1j(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        j1jVar.d = valueAnimator.getRepeatCount();
        j1jVar.e = valueAnimator.getRepeatMode();
        return j1jVar;
    }

    public static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return pz0.FAST_OUT_SLOW_IN_INTERPOLATOR;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return pz0.FAST_OUT_LINEAR_IN_INTERPOLATOR;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            return pz0.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
        }
        return interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f21701a;
    }

    public long d() {
        return this.b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return pz0.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1j)) {
            return false;
        }
        j1j j1jVar = (j1j) obj;
        if (c() == j1jVar.c() && d() == j1jVar.d() && g() == j1jVar.g() && h() == j1jVar.h()) {
            return e().getClass().equals(j1jVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return "\n" + j1j.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public j1j(long j, long j2, TimeInterpolator timeInterpolator) {
        this.d = 0;
        this.e = 1;
        this.f21701a = j;
        this.b = j2;
        this.c = timeInterpolator;
    }
}
