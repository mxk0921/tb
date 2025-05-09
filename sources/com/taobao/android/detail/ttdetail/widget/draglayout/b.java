package com.taobao.android.detail.ttdetail.widget.draglayout;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.f7l;
import tb.t2o;
import tb.tq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final Interpolator v = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f7012a;
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
    public final float m;
    public final float n;
    public final int o;
    public final OverScroller p;
    public final c q;
    public View r;
    public boolean s;
    public final ViewGroup t;
    public int c = -1;
    public final Runnable u = new RunnableC0386b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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
    /* renamed from: com.taobao.android.detail.ttdetail.widget.draglayout.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class RunnableC0386b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0386b() {
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912263021);
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

        public void g(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faa1e09a", new Object[]{this, view, new Integer(i)});
            }
        }

        public void h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i)});
            }
        }

        public void i(View view, boolean z, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0627290", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        public void j(View view, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32d03eca", new Object[]{this, view, new Float(f), new Float(f2)});
            }
        }

        public abstract boolean k(View view, int i);
    }

    static {
        t2o.a(912263018);
    }

    public b(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.t = viewGroup;
            this.q = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.p = new OverScroller(context, v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public static b m(ViewGroup viewGroup, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1909d5b9", new Object[]{viewGroup, cVar});
        }
        return new b(tq4.d(viewGroup), viewGroup, cVar);
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e99af62", new Object[]{this});
            return;
        }
        this.l.computeCurrentVelocity(1000, this.m);
        n(f(this.l.getXVelocity(this.c), this.n, this.m), f(this.l.getYVelocity(this.c), this.n, this.m));
    }

    public final void B(float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fca50c6", new Object[]{this, new Float(f), new Float(f2), new Integer(i)});
            return;
        }
        boolean d = d(f, f2, i, 1);
        if (d(f2, f, i, 4)) {
            d |= true;
        }
        if (d(f, f2, i, 2)) {
            boolean z = d ? 1 : 0;
            char c2 = d ? 1 : 0;
            d = z | true;
        }
        if (d(f2, f, i, 8)) {
            boolean z2 = d ? 1 : 0;
            char c3 = d ? 1 : 0;
            d = z2 | true;
        }
        if (d) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | (d ? 1 : 0);
            c cVar = this.q;
            int i2 = d ? 1 : 0;
            int i3 = d ? 1 : 0;
            int i4 = d ? 1 : 0;
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
        this.h[i] = u((int) f, (int) f2);
        this.k |= 1 << i;
    }

    public final void D(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5314c965", new Object[]{this, motionEvent});
            return;
        }
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (x(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    public void E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60493ac1", new Object[]{this, new Integer(i)});
            return;
        }
        this.t.removeCallbacks(this.u);
        if (this.f7012a != i) {
            this.f7012a = i;
            this.q.h(i);
            if (this.f7012a == 0) {
                this.r = null;
            }
        }
    }

    public boolean F(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dfd2dcc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.s) {
            return s(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f7, code lost:
        if (r12 != r11) goto L_0x0100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean G(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.draglayout.b.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e49516c", new Object[]{this, view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        this.r = view;
        this.c = -1;
        boolean s = s(i, i2, 0, 0);
        if (!s && this.f7012a == 0 && this.r != null) {
            this.r = null;
        }
        return s;
    }

    public boolean I(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0261a9", new Object[]{this, view, new Integer(i)})).booleanValue();
        }
        if (view == this.r && this.c == i) {
            return true;
        }
        if (view == null || !this.q.k(view, i)) {
            return false;
        }
        this.c = i;
        c(view, i);
        return true;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf58fb7", new Object[]{this});
            return;
        }
        b();
        if (this.f7012a == 2) {
            int currX = this.p.getCurrX();
            int currY = this.p.getCurrY();
            this.p.abortAnimation();
            int currX2 = this.p.getCurrX();
            int currY2 = this.p.getCurrY();
            this.q.i(this.r, false, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        E(0);
    }

    public void b() {
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

    public void c(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e446bb3", new Object[]{this, view, new Integer(i)});
        } else if (view.getParent() == this.t) {
            this.r = view;
            this.c = i;
            this.q.g(view, i);
            E(1);
        } else {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.t + f7l.BRACKET_END_STR);
        }
    }

    public final boolean d(float f, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebf42c94", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2)})).booleanValue();
        }
        Math.abs(f);
        Math.abs(f2);
        int i3 = this.h[i];
        return false;
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
            if (Math.abs(f) > this.b) {
                return true;
            }
            return false;
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
        } else if (this.d != null && w(i)) {
            this.d[i] = 0.0f;
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
        if (this.f7012a == 2) {
            boolean computeScrollOffset = this.p.computeScrollOffset();
            int currX = this.p.getCurrX();
            int currY = this.p.getCurrY();
            int left = currX - ((this.r.getLeft() + this.r.getRight()) >> 1);
            int top = currY - ((this.r.getTop() + this.r.getBottom()) >> 1);
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.r, left);
            }
            if (top != 0) {
                ViewCompat.offsetTopAndBottom(this.r, top);
            }
            if (!(left == 0 && top == 0)) {
                this.q.i(this.r, false, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.p.getFinalX() && currY == this.p.getFinalY()) {
                this.p.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.t.post(this.u);
                } else {
                    E(0);
                }
            }
        }
        if (this.f7012a == 2) {
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
        this.q.j(this.r, f, f2);
        this.s = false;
        if (this.f7012a == 1) {
            E(0);
        }
    }

    public final float o(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96b34422", new Object[]{this, new Float(f)})).floatValue();
        }
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    public final void p(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243c8d96", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int left = (this.r.getLeft() + this.r.getRight()) >> 1;
        int top = (this.r.getTop() + this.r.getBottom()) >> 1;
        if (i3 != 0) {
            i = this.q.a(this.r, i, i3);
            ViewCompat.offsetLeftAndRight(this.r, i - left);
        }
        if (i4 != 0) {
            i2 = this.q.b(this.r, i2, i4);
            ViewCompat.offsetTopAndBottom(this.r, i2 - top);
        }
        if (i3 != 0 || i4 != 0) {
            this.q.i(this.r, true, i, i2, i - left, i2 - top);
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
        int left = (this.r.getLeft() + this.r.getRight()) >> 1;
        int top = (this.r.getTop() + this.r.getBottom()) >> 1;
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

    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("775fc16", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final int u(int i, int i2) {
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f812bf8", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i >= this.t.getLeft() + this.o) {
            i3 = 0;
        }
        if (i2 < this.t.getTop() + this.o) {
            i3 |= 4;
        }
        if (i > this.t.getRight() - this.o) {
            i3 |= 2;
        }
        if (i2 > this.t.getBottom() - this.o) {
            return i3 | 8;
        }
        return i3;
    }

    public boolean v(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e9cddd6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return y(this.r, i, i2);
    }

    public boolean w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b5438b", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (((1 << i) & this.k) != 0) {
            return true;
        }
        return false;
    }

    public final boolean x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ecd18db", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (w(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
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
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View r = r((int) x, (int) y);
            C(x, y, pointerId);
            I(r, pointerId);
            int i3 = this.h[pointerId];
        } else if (actionMasked == 1) {
            if (this.f7012a == 1) {
                A();
            }
            b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f7012a == 1) {
                    n(0.0f, 0.0f);
                }
                b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                C(x2, y2, pointerId2);
                if (this.f7012a == 0) {
                    I(r((int) x2, (int) y2), pointerId2);
                    int i4 = this.h[pointerId2];
                } else if (v((int) x2, (int) y2)) {
                    I(this.r, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f7012a == 1 && pointerId3 == this.c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.c) {
                            View r2 = r((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.r;
                            if (r2 == view && I(view, pointerId4)) {
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
        } else if (this.f7012a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (x(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.d[pointerId5];
                    float f2 = y3 - this.e[pointerId5];
                    B(f, f2, pointerId5);
                    if (this.f7012a != 1) {
                        View r3 = r((int) x3, (int) y3);
                        if (e(r3, f, f2) && I(r3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            D(motionEvent);
        } else if (x(this.c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f;
            int i5 = this.c;
            int i6 = (int) (x4 - fArr[i5]);
            int i7 = (int) (y4 - this.g[i5]);
            p(((this.r.getLeft() + this.r.getRight()) >> 1) + i6, ((this.r.getTop() + this.r.getBottom()) >> 1) + i7, i6, i7);
            D(motionEvent);
        }
    }
}
