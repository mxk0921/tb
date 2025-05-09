package tb;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.android.aura.service.render.widget.roundcornerlayout.UMFRoundCornerLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jij;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class eij implements UMFRoundCornerLayout.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f18601a;
    public float b = 0.0f;
    public boolean c = false;
    public int d = 100;
    public VelocityTracker e;
    public a f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    static {
        t2o.a(81789333);
        t2o.a(80740631);
    }

    public final float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7854cab", new Object[]{this})).floatValue();
        }
        VelocityTracker velocityTracker = this.e;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000);
        return this.e.getXVelocity();
    }

    public final void b(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ee8e8a", new Object[]{this, view, new Float(f)});
            return;
        }
        float a2 = a();
        if (f <= 0.0f) {
            return;
        }
        if (a2 >= 900.0f || Math.abs(f) >= this.d * 0.1f) {
            ((jij.c) this.f).b();
        }
    }

    public boolean c(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0012a9c", new Object[]{this, motionEvent, view})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        float rawX = motionEvent.getRawX();
        motionEvent.getRawY();
        if (actionMasked == 0) {
            this.f18601a = rawX;
            this.b = view.getTranslationX();
            this.c = false;
            return false;
        } else if (Math.abs(rawX - this.f18601a) < ViewConfiguration.get(view.getContext().getApplicationContext()).getScaledTouchSlop() * 5.0f) {
            return false;
        } else {
            this.f18601a = rawX;
            this.c = true;
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r4 != 3) goto L_0x0064;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(android.view.MotionEvent r8, android.view.View r9) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = tb.eij.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001f
            java.lang.String r5 = "c03524e0"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r7
            r3[r1] = r8
            r3[r0] = r9
            java.lang.Object r8 = r4.ipc$dispatch(r5, r3)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x001f:
            boolean r4 = r7.c
            if (r4 != 0) goto L_0x0024
            return r2
        L_0x0024:
            int r4 = r8.getActionMasked()
            float r5 = r8.getRawX()
            float r6 = r7.f18601a
            float r5 = r5 - r6
            if (r4 == r1) goto L_0x0055
            if (r4 == r0) goto L_0x0036
            if (r4 == r3) goto L_0x0055
            goto L_0x0064
        L_0x0036:
            r7.f(r8)
            int r8 = r7.d
            float r8 = (float) r8
            float r0 = r7.b
            float r0 = r0 + r5
            r2 = 0
            float r0 = java.lang.Math.max(r2, r0)
            float r8 = java.lang.Math.min(r8, r0)
            r9.setTranslationX(r8)
            tb.eij$a r8 = r7.f
            if (r8 == 0) goto L_0x0064
            tb.jij$c r8 = (tb.jij.c) r8
            r8.c(r5)
            goto L_0x0064
        L_0x0055:
            r7.c = r2
            r7.b(r9, r5)
            android.view.VelocityTracker r8 = r7.e
            if (r8 == 0) goto L_0x0064
            r8.recycle()
            r8 = 0
            r7.e = r8
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.eij.d(android.view.MotionEvent, android.view.View):boolean");
    }

    public void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80daa999", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    public final void f(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f576b4a5", new Object[]{this, motionEvent});
            return;
        }
        if (this.e == null) {
            this.e = VelocityTracker.obtain();
        }
        this.e.addMovement(motionEvent);
    }

    public void g(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848f9d30", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.d = i2;
        }
    }
}
