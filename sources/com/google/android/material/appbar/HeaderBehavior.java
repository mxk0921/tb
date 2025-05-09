package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    public Runnable c;
    public OverScroller d;
    public boolean e;
    public int g;
    public VelocityTracker i;
    public int f = -1;
    public int h = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final CoordinatorLayout f5019a;
        private final V b;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.f5019a = coordinatorLayout;
            this.b = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.b != null && (overScroller = HeaderBehavior.this.d) != null) {
                if (overScroller.computeScrollOffset()) {
                    HeaderBehavior headerBehavior = HeaderBehavior.this;
                    headerBehavior.l(this.f5019a, this.b, headerBehavior.d.getCurrY());
                    ViewCompat.postOnAnimation(this.b, this);
                    return;
                }
                HeaderBehavior.this.j(this.f5019a, this.b);
            }
        }
    }

    public HeaderBehavior() {
    }

    public boolean e(V v) {
        return false;
    }

    public final void f() {
        if (this.i == null) {
            this.i = VelocityTracker.obtain();
        }
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        Runnable runnable = this.c;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.c = null;
        }
        if (this.d == null) {
            this.d = new OverScroller(v.getContext());
        }
        this.d.fling(0, a(), 0, Math.round(f), 0, 0, i, i2);
        if (this.d.computeScrollOffset()) {
            a aVar = new a(coordinatorLayout, v);
            this.c = aVar;
            ViewCompat.postOnAnimation(v, aVar);
            return true;
        }
        j(coordinatorLayout, v);
        return false;
    }

    public int h(V v) {
        return -v.getHeight();
    }

    public int i(V v) {
        return v.getHeight();
    }

    public final int k(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return m(coordinatorLayout, v, b() - i, i2, i3);
    }

    public int l(CoordinatorLayout coordinatorLayout, V v, int i) {
        return m(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int clamp;
        int a2 = a();
        if (i2 == 0 || a2 < i2 || a2 > i3 || a2 == (clamp = MathUtils.clamp(i, i2, i3))) {
            return 0;
        }
        d(clamp);
        return a2 - clamp;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        if (this.h < 0) {
            this.h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.e) {
            int i = this.f;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.g) > this.h) {
                this.g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (!e(v) || !coordinatorLayout.isPointInChildBounds(v, x, y2)) {
                z = false;
            } else {
                z = true;
            }
            this.e = z;
            if (z) {
                this.g = y2;
                this.f = motionEvent.getPointerId(0);
                f();
                OverScroller overScroller = this.d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = 1
            goto L_0x001c
        L_0x001b:
            r12 = 0
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.g = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.g
            int r7 = r1 - r0
            r11.g = r0
            int r8 = r11.h(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.k(r5, r6, r7, r8, r9)
        L_0x004c:
            r12 = 0
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.i
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.i
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.i
            int r4 = r11.f
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.i(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.g(r6, r7, r8, r9, r10)
            r12 = 1
            goto L_0x0073
        L_0x0072:
            r12 = 0
        L_0x0073:
            r11.e = r3
            r11.f = r1
            android.view.VelocityTracker r13 = r11.i
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.i = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.i
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.e
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = 0
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void j(CoordinatorLayout coordinatorLayout, V v) {
    }
}
