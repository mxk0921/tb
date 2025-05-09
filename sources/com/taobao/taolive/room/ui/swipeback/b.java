package com.taobao.taolive.room.ui.swipeback;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.VelocityTrackerCompat;
import androidx.core.widget.ScrollerCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    public static final int EDGE_SIZE = 20;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final Interpolator v = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f13246a;
    public final int b;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public float m;
    public float n;
    public int o;
    public final ScrollerCompat p;
    public final c q;
    public View r;
    public boolean s;
    public final ViewGroup t;
    public int c = -1;
    public final Runnable u = new RunnableC0755b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Interpolator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
            }
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.taolive.room.ui.swipeback.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class RunnableC0755b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0755b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b.this.E(0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(779093283);
        }

        public abstract int a(View view, int i, int i2);

        public abstract int b(View view, int i, int i2);

        public int c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("955ed6c2", new Object[]{this, new Integer(i)})).intValue();
            }
            return i;
        }

        public abstract int d(View view);

        public abstract int e(View view);

        public void f(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ceb6938", new Object[]{this, new Integer(i), new Integer(i2)});
            }
        }

        public boolean g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d450f839", new Object[]{this, new Integer(i)})).booleanValue();
            }
            return false;
        }

        public void h(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("127471e9", new Object[]{this, new Integer(i), new Integer(i2)});
            }
        }

        public void i(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faa1e09a", new Object[]{this, view, new Integer(i)});
            }
        }

        public void j(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i)});
            }
        }

        public void k(View view, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bc6f844", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        public abstract void l(View view, float f, float f2);

        public abstract boolean m(View view, int i);
    }

    static {
        t2o.a(779093280);
    }

    public b(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.t = viewGroup;
            this.q = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            float f = context.getResources().getDisplayMetrics().density;
            this.b = viewConfiguration.getScaledTouchSlop();
            this.m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.p = ScrollerCompat.create(context, v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public static b m(ViewGroup viewGroup, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("33fb2db9", new Object[]{viewGroup, cVar});
        }
        return new b(viewGroup.getContext(), viewGroup, cVar);
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e99af62", new Object[]{this});
            return;
        }
        this.l.computeCurrentVelocity(1000, this.m);
        n(f(VelocityTrackerCompat.getXVelocity(this.l, this.c), this.n, this.m), f(VelocityTrackerCompat.getYVelocity(this.l, this.c), this.n, this.m));
    }

    public final void B(float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fca50c6", new Object[]{this, new Float(f), new Float(f2), new Integer(i)});
            return;
        }
        boolean c2 = c(f, f2, i, 1);
        if (c(f2, f, i, 4)) {
            c2 |= true;
        }
        if (c(f, f2, i, 2)) {
            boolean z = c2 ? 1 : 0;
            char c3 = c2 ? 1 : 0;
            c2 = z | true;
        }
        if (c(f2, f, i, 8)) {
            boolean z2 = c2 ? 1 : 0;
            char c4 = c2 ? 1 : 0;
            c2 = z2 | true;
        }
        if (c2) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | (c2 ? 1 : 0);
            c cVar = this.q;
            int i2 = c2 ? 1 : 0;
            int i3 = c2 ? 1 : 0;
            int i4 = c2 ? 1 : 0;
            cVar.f(i2, i);
        }
    }

    public final void C(float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326738df", new Object[]{this, new Float(f), new Float(f2), new Integer(i)});
            return;
        }
        q(i);
        float[] fArr = this.d;
        this.f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.e;
        this.g[i] = f2;
        fArr2[i] = f2;
        this.h[i] = t((int) f, (int) f2);
        this.k |= 1 << i;
    }

    public final void D(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5314c965", new Object[]{this, motionEvent});
            return;
        }
        int pointerCount = MotionEventCompat.getPointerCount(motionEvent);
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = MotionEventCompat.getPointerId(motionEvent, i);
            float x = MotionEventCompat.getX(motionEvent, i);
            float y = MotionEventCompat.getY(motionEvent, i);
            this.f[pointerId] = x;
            this.g[pointerId] = y;
        }
    }

    public void E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60493ac1", new Object[]{this, new Integer(i)});
        } else if (this.f13246a != i) {
            this.f13246a = i;
            this.q.j(i);
            if (i == 0) {
                this.r = null;
            }
        }
    }

    public void F(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4682717c", new Object[]{this, new Integer(i)});
        }
    }

    public void G(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("892aa8f1", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public void H(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3b322da", new Object[]{this, new Float(f)});
        } else {
            this.m = f;
        }
    }

    public void I(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfe494ac", new Object[]{this, new Float(f)});
        } else {
            this.n = f;
        }
    }

    public boolean J(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dfd2dcc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.s) {
            return s(i, i2, (int) VelocityTrackerCompat.getXVelocity(this.l, this.c), (int) VelocityTrackerCompat.getYVelocity(this.l, this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public boolean K(MotionEvent motionEvent) {
        View r;
        View r2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f2f2aa", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int pointerCount = MotionEventCompat.getPointerCount(motionEvent);
                    for (int i = 0; i < pointerCount; i++) {
                        int pointerId = MotionEventCompat.getPointerId(motionEvent, i);
                        float x = MotionEventCompat.getX(motionEvent, i);
                        float y = MotionEventCompat.getY(motionEvent, i);
                        float f = x - this.d[pointerId];
                        float f2 = y - this.e[pointerId];
                        B(f, f2, pointerId);
                        if (this.f13246a == 1 || ((r = r((int) x, (int) y)) != null && y * 3.0f < r.getHeight() * 2 && e(r, f, f2) && M(r, pointerId))) {
                            break;
                        }
                    }
                    D(motionEvent);
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                        float x2 = MotionEventCompat.getX(motionEvent, actionIndex);
                        float y2 = MotionEventCompat.getY(motionEvent, actionIndex);
                        C(x2, y2, pointerId2);
                        int i2 = this.f13246a;
                        if (i2 == 0) {
                            int i3 = this.h[pointerId2];
                            int i4 = this.o;
                            if ((i3 & i4) != 0) {
                                this.q.h(i3 & i4, pointerId2);
                            }
                        } else if (i2 == 2 && (r2 = r((int) x2, (int) y2)) == this.r) {
                            M(r2, pointerId2);
                        }
                    } else if (actionMasked == 6) {
                        i(MotionEventCompat.getPointerId(motionEvent, actionIndex));
                    }
                }
            }
            a();
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId3 = MotionEventCompat.getPointerId(motionEvent, 0);
            C(x3, y3, pointerId3);
            View r3 = r((int) x3, (int) y3);
            if (r3 == this.r && this.f13246a == 2) {
                M(r3, pointerId3);
            }
            int i5 = this.h[pointerId3];
            int i6 = this.o;
            if ((i5 & i6) != 0) {
                this.q.h(i5 & i6, pointerId3);
            }
        }
        if (this.f13246a == 1) {
            return true;
        }
        return false;
    }

    public boolean L(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e49516c", new Object[]{this, view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        this.r = view;
        this.c = -1;
        return s(i, i2, 0, 0);
    }

    public boolean M(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0261a9", new Object[]{this, view, new Integer(i)})).booleanValue();
        }
        if (view == this.r && this.c == i) {
            return true;
        }
        if (view == null || !this.q.m(view, i)) {
            return false;
        }
        this.c = i;
        b(view, i);
        return true;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.c = -1;
        h();
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public void b(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e446bb3", new Object[]{this, view, new Integer(i)});
        } else if (view.getParent() == this.t) {
            this.r = view;
            this.c = i;
            this.q.i(view, i);
            E(1);
        } else {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.t + f7l.BRACKET_END_STR);
        }
    }

    public final boolean c(float f, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebf42c94", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2)})).booleanValue();
        }
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (!((this.h[i] & i2) != i2 || (this.o & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2)) {
            float f3 = this.b;
            if (abs > f3 || abs2 > f3) {
                if (abs < abs2 * 0.5f && this.q.g(i2)) {
                    int[] iArr = this.j;
                    iArr[i] = iArr[i] | i2;
                    return false;
                } else if ((this.i[i] & i2) != 0 || abs <= this.b) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean d(int i, int i2) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c8b001c", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!x(i2)) {
            return false;
        }
        if ((i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f = this.f[i2] - this.d[i2];
        float f2 = this.g[i2] - this.e[i2];
        if (z && z2) {
            int i3 = this.b;
            if ((f * f) + (f2 * f2) > i3 * i3) {
                return true;
            }
            return false;
        } else if (z) {
            if (f <= this.b || Math.abs(f2) > this.b) {
                return false;
            }
            return true;
        } else if (!z2 || Math.abs(f2) <= this.b) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean e(View view, float f, float f2) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f7bd99e", new Object[]{this, view, new Float(f), new Float(f2)})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        if (this.q.d(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.q.e(view) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            int i = this.b;
            if ((f * f) + (f2 * f2) > i * i) {
                return true;
            }
            return false;
        } else if (z) {
            if (f <= this.b || Math.abs(f2) > this.b) {
                return false;
            }
            return true;
        } else if (!z2 || Math.abs(f2) <= this.b) {
            return false;
        } else {
            return true;
        }
    }

    public final float f(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10fc2831", new Object[]{this, new Float(f), new Float(f2), new Float(f3)})).floatValue();
        }
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f > 0.0f) {
            return f3;
        }
        return -f3;
    }

    public final int g(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1127d717", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i > 0) {
            return i3;
        }
        return -i3;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdd066b8", new Object[]{this});
            return;
        }
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
    }

    public final void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3ce34b", new Object[]{this, new Integer(i)});
            return;
        }
        float[] fArr = this.d;
        if (fArr != null) {
            fArr[i] = 0.0f;
            this.e[i] = 0.0f;
            this.f[i] = 0.0f;
            this.g[i] = 0.0f;
            this.h[i] = 0;
            this.i[i] = 0;
            this.j[i] = 0;
            this.k = (~(1 << i)) & this.k;
        }
    }

    public final int j(int i, int i2, int i3) {
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdbb4503", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i == 0) {
            return 0;
        }
        int width = this.t.getWidth();
        float f = width / 2;
        float o = f + (o(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(o / abs) * 1000.0f) * 4;
        } else {
            i4 = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    public final int k(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7bfae48", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).intValue();
        }
        int g = g(i3, (int) this.n, (int) this.m);
        int g2 = g(i4, (int) this.n, (int) this.m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(g);
        int abs4 = Math.abs(g2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (g != 0) {
            f = abs3;
            f2 = i5;
        } else {
            f = abs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (g2 != 0) {
            f3 = abs4;
            f4 = i5;
        } else {
            f3 = abs2;
            f4 = i6;
        }
        return (int) ((j(i, g, this.q.d(view)) * f5) + (j(i2, g2, this.q.e(view)) * (f3 / f4)));
    }

    public boolean l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc50f82", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.f13246a == 2) {
            boolean computeScrollOffset = this.p.computeScrollOffset();
            int currX = this.p.getCurrX();
            int currY = this.p.getCurrY();
            int left = currX - this.r.getLeft();
            int top = currY - this.r.getTop();
            if (left != 0) {
                this.r.offsetLeftAndRight(left);
            }
            if (top != 0) {
                this.r.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.q.k(this.r, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.p.getFinalX() && currY == this.p.getFinalY()) {
                this.p.abortAnimation();
                computeScrollOffset = this.p.isFinished();
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.t.post(this.u);
                } else {
                    E(0);
                }
            }
        }
        if (this.f13246a == 2) {
            return true;
        }
        return false;
    }

    public final void n(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd2f4663", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.s = true;
        this.q.l(this.r, f, f2);
        this.s = false;
        if (this.f13246a == 1) {
            E(0);
        }
    }

    public final float o(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96b34422", new Object[]{this, new Float(f)})).floatValue();
        }
        return (float) Math.sin((float) ((f - 0.5f) * 0.4712389167638204d));
    }

    public final void p(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243c8d96", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int left = this.r.getLeft();
        int top = this.r.getTop();
        if (i3 != 0) {
            i = this.q.a(this.r, i, i3);
            this.r.offsetLeftAndRight(i - left);
        }
        if (i4 != 0) {
            i2 = this.q.b(this.r, i2, i4);
            this.r.offsetTopAndBottom(i2 - top);
        }
        if (i3 != 0 || i4 != 0) {
            this.q.k(this.r, i, i2, i - left, i2 - top);
        }
    }

    public final void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64ef179", new Object[]{this, new Integer(i)});
            return;
        }
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
    }

    public View r(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e92ec8c1", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        for (int childCount = this.t.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.t.getChildAt(this.q.c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean s(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92b9cb7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).booleanValue();
        }
        int left = this.r.getLeft();
        int top = this.r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.p.abortAnimation();
            E(0);
            return false;
        }
        this.p.startScroll(left, top, i5, i6, k(this.r, i5, i6, i3, i4));
        E(2);
        return true;
    }

    public final int t(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7552d45", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        return 1;
    }

    public int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef27d65c", new Object[]{this})).intValue();
        }
        return this.f13246a;
    }

    public boolean v(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e9cddd6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return y(this.r, i, i2);
    }

    public boolean w(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("174f9202", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!x(i2) || (i & this.h[i2]) == 0) {
            return false;
        }
        return true;
    }

    public boolean x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b5438b", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (((1 << i) & this.k) != 0) {
            return true;
        }
        return false;
    }

    public boolean y(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e91c986", new Object[]{this, view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    public void z(MotionEvent motionEvent) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63068cc6", new Object[]{this, motionEvent});
            return;
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = MotionEventCompat.getPointerId(motionEvent, 0);
            View r = r((int) x, (int) y);
            C(x, y, pointerId);
            M(r, pointerId);
            int i3 = this.h[pointerId] & this.o;
            if (i3 != 0) {
                this.q.h(i3, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f13246a == 1) {
                A();
            }
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f13246a == 1) {
                    n(0.0f, 0.0f);
                }
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                float x2 = MotionEventCompat.getX(motionEvent, actionIndex);
                float y2 = MotionEventCompat.getY(motionEvent, actionIndex);
                C(x2, y2, pointerId2);
                if (this.f13246a == 0) {
                    M(r((int) x2, (int) y2), pointerId2);
                    int i4 = this.h[pointerId2] & this.o;
                    if (i4 != 0) {
                        this.q.h(i4, pointerId2);
                    }
                } else if (v((int) x2, (int) y2)) {
                    M(this.r, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                if (this.f13246a == 1 && pointerId3 == this.c) {
                    int pointerCount = MotionEventCompat.getPointerCount(motionEvent);
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = MotionEventCompat.getPointerId(motionEvent, i2);
                        if (pointerId4 != this.c) {
                            View r2 = r((int) MotionEventCompat.getX(motionEvent, i2), (int) MotionEventCompat.getY(motionEvent, i2));
                            View view = this.r;
                            if (r2 == view && M(view, pointerId4)) {
                                i = this.c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        A();
                    }
                }
                i(pointerId3);
            }
        } else if (this.f13246a == 1) {
            int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.c);
            float x3 = MotionEventCompat.getX(motionEvent, findPointerIndex);
            float y3 = MotionEventCompat.getY(motionEvent, findPointerIndex);
            float[] fArr = this.f;
            int i5 = this.c;
            int i6 = (int) (x3 - fArr[i5]);
            int i7 = (int) (y3 - this.g[i5]);
            p(this.r.getLeft() + i6, this.r.getTop() + i7, i6, i7);
            D(motionEvent);
        } else {
            int pointerCount2 = MotionEventCompat.getPointerCount(motionEvent);
            while (i2 < pointerCount2) {
                int pointerId5 = MotionEventCompat.getPointerId(motionEvent, i2);
                float x4 = MotionEventCompat.getX(motionEvent, i2);
                float y4 = MotionEventCompat.getY(motionEvent, i2);
                float f = x4 - this.d[pointerId5];
                float f2 = y4 - this.e[pointerId5];
                B(f, f2, pointerId5);
                if (this.f13246a != 1) {
                    View r3 = r((int) x4, (int) y4);
                    if (e(r3, f, f2) && M(r3, pointerId5)) {
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            D(motionEvent);
        }
    }
}
