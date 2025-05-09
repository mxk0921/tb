package tb;

import android.view.Choreographer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class emh extends ix1 implements Choreographer.FrameCallback {
    public kkh j;
    public float c = 1.0f;
    public boolean d = false;
    public long e = 0;
    public float f = 0.0f;
    public int g = 0;
    public float h = -2.14748365E9f;
    public float i = 2.14748365E9f;
    public boolean k = false;

    public void A(float f) {
        this.c = f;
    }

    public final void B() {
        if (this.j != null) {
            float f = this.f;
            float f2 = this.h;
            if (f < f2 || f > this.i) {
                zhh.b(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f2), Float.valueOf(this.i), Float.valueOf(this.f)));
            }
        }
    }

    @Override // tb.ix1
    public void a() {
        super.a();
        b(n());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        a();
        r();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        float f;
        float f2;
        q();
        if (this.j != null && isRunning()) {
            long j2 = this.e;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float j4 = ((float) j3) / j();
            float f3 = this.f;
            if (n()) {
                j4 = -j4;
            }
            float f4 = f3 + j4;
            this.f = f4;
            boolean e = uvi.e(f4, l(), k());
            this.f = uvi.c(this.f, l(), k());
            this.e = j;
            e();
            if (!e) {
                if (getRepeatCount() == -1 || this.g < getRepeatCount()) {
                    c();
                    this.g++;
                    if (getRepeatMode() == 2) {
                        this.d = !this.d;
                        u();
                    } else {
                        if (n()) {
                            f = k();
                        } else {
                            f = l();
                        }
                        this.f = f;
                    }
                    this.e = j;
                } else {
                    if (this.c < 0.0f) {
                        f2 = l();
                    } else {
                        f2 = k();
                    }
                    this.f = f2;
                    r();
                    b(n());
                }
            }
            B();
            k6g.a("LottieValueAnimator#doFrame");
        }
    }

    public void f() {
        this.j = null;
        this.h = -2.14748365E9f;
        this.i = 2.14748365E9f;
    }

    public void g() {
        r();
        b(n());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float l;
        float k;
        float l2;
        if (this.j == null) {
            return 0.0f;
        }
        if (n()) {
            l = k() - this.f;
            k = k();
            l2 = l();
        } else {
            l = this.f - l();
            k = k();
            l2 = l();
        }
        return l / (k - l2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(h());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        kkh kkhVar = this.j;
        if (kkhVar == null) {
            return 0L;
        }
        return kkhVar.d();
    }

    public float h() {
        kkh kkhVar = this.j;
        if (kkhVar == null) {
            return 0.0f;
        }
        return (this.f - kkhVar.p()) / (this.j.f() - this.j.p());
    }

    public float i() {
        return this.f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.k;
    }

    public final float j() {
        kkh kkhVar = this.j;
        if (kkhVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / kkhVar.i()) / Math.abs(this.c);
    }

    public float k() {
        kkh kkhVar = this.j;
        if (kkhVar == null) {
            return 0.0f;
        }
        float f = this.i;
        if (f == 2.14748365E9f) {
            return kkhVar.f();
        }
        return f;
    }

    public float l() {
        kkh kkhVar = this.j;
        if (kkhVar == null) {
            return 0.0f;
        }
        float f = this.h;
        if (f == -2.14748365E9f) {
            return kkhVar.p();
        }
        return f;
    }

    public float m() {
        return this.c;
    }

    public final boolean n() {
        if (m() < 0.0f) {
            return true;
        }
        return false;
    }

    public void o() {
        r();
    }

    public void p() {
        float f;
        this.k = true;
        d(n());
        if (n()) {
            f = k();
        } else {
            f = l();
        }
        w((int) f);
        this.e = 0L;
        this.g = 0;
        q();
    }

    public void q() {
        if (isRunning()) {
            s(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void r() {
        s(true);
    }

    public void s(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.k = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.d) {
            this.d = false;
            u();
        }
    }

    public void t() {
        this.k = true;
        q();
        this.e = 0L;
        if (n() && i() == l()) {
            this.f = k();
        } else if (!n() && i() == k()) {
            this.f = l();
        }
    }

    public void u() {
        A(-m());
    }

    public void v(kkh kkhVar) {
        boolean z;
        if (this.j == null) {
            z = true;
        } else {
            z = false;
        }
        this.j = kkhVar;
        if (z) {
            y((int) Math.max(this.h, kkhVar.p()), (int) Math.min(this.i, kkhVar.f()));
        } else {
            y((int) kkhVar.p(), (int) kkhVar.f());
        }
        float f = this.f;
        this.f = 0.0f;
        w((int) f);
        e();
    }

    public void w(float f) {
        if (this.f != f) {
            this.f = uvi.c(f, l(), k());
            this.e = 0L;
            e();
        }
    }

    public void x(float f) {
        y(this.h, f);
    }

    public void z(int i) {
        y(i, (int) this.i);
    }

    public void y(float f, float f2) {
        if (f > f2) {
            zhh.b("minFrame (" + f + ") must be <= maxFrame (" + f2 + f7l.BRACKET_END_STR);
            return;
        }
        kkh kkhVar = this.j;
        float p = kkhVar == null ? -3.4028235E38f : kkhVar.p();
        kkh kkhVar2 = this.j;
        float f3 = kkhVar2 == null ? Float.MAX_VALUE : kkhVar2.f();
        float c = uvi.c(f, p, f3);
        float c2 = uvi.c(f2, p, f3);
        if (c != this.h || c2 != this.i) {
            this.h = c;
            this.i = c2;
            w((int) uvi.c(this.f, c, c2));
        }
    }
}
