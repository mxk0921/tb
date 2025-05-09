package com.taobao.android.abilitykit.ability.pop.render.util;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.util.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.c9c;
import tb.t2o;
import tb.wz0;
import tb.xbm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class GestureHandler implements c9c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ON_TOUCH_POSITION_CHANGED = "onPositionChanged";
    public float c;
    public float d;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public VelocityTracker k;
    public final b l;
    public final com.taobao.android.abilitykit.ability.pop.render.util.b m;
    public final boolean n;
    public boolean o;

    /* renamed from: a  reason: collision with root package name */
    public final float f6276a = xbm.b();
    public int b = 0;
    public float e = 0.0f;
    public boolean f = false;
    public float p = 0.0f;
    public float q = Float.MIN_VALUE;
    public float r = Float.MIN_VALUE;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface State {
        public static final int ANIMATING = 4;
        public static final int CLOSED = 3;
        public static final int COLLAPSE = 2;
        public static final int EXPAND = 1;
        public static final int INIT = 0;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f6277a;
        public final /* synthetic */ int b;

        public a(View view, int i) {
            this.f6277a = view;
            this.b = i;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
                return;
            }
            GestureHandler.a(GestureHandler.this).f();
            GestureHandler.a(GestureHandler.this).a(this.f6277a, this.b);
            if (GestureHandler.b(GestureHandler.this)) {
                GestureHandler.a(GestureHandler.this).b(this.f6277a);
                GestureHandler.c(GestureHandler.this, false);
            }
            GestureHandler.d(GestureHandler.this, this.b);
        }

        public void b(wz0 wz0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e702cef", new Object[]{this, wz0Var});
            } else {
                GestureHandler.a(GestureHandler.this).c(wz0Var);
            }
        }

        public void c(float f, float f2, boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad8ae67f", new Object[]{this, new Float(f), new Float(f2), new Boolean(z), str});
            } else {
                GestureHandler.a(GestureHandler.this).e(f, f2, this.f6277a.getWidth(), this.f6277a.getHeight(), z, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a(View view, int i);

        void b(View view);

        void c(wz0 wz0Var);

        boolean d(boolean z, float f, int i, View view);

        void e(float f, float f2, int i, int i2, boolean z, String str);

        void f();
    }

    static {
        t2o.a(336593047);
        t2o.a(336593054);
    }

    public GestureHandler(b bVar, com.taobao.android.abilitykit.ability.pop.render.util.b bVar2, boolean z, boolean z2, boolean z3) {
        this.l = bVar;
        this.n = z;
        this.m = bVar2;
        this.i = z2;
        this.j = z3;
        ((com.taobao.android.abilitykit.ability.pop.render.util.a) bVar2).k(z2);
    }

    public static /* synthetic */ b a(GestureHandler gestureHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("dcb6f26e", new Object[]{gestureHandler});
        }
        return gestureHandler.l;
    }

    public static /* synthetic */ boolean b(GestureHandler gestureHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("855b803", new Object[]{gestureHandler})).booleanValue();
        }
        return gestureHandler.o;
    }

    public static /* synthetic */ boolean c(GestureHandler gestureHandler, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86905577", new Object[]{gestureHandler, new Boolean(z)})).booleanValue();
        }
        gestureHandler.o = z;
        return z;
    }

    public static /* synthetic */ int d(GestureHandler gestureHandler, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f916734", new Object[]{gestureHandler, new Integer(i)})).intValue();
        }
        gestureHandler.b = i;
        return i;
    }

    public final float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7854cab", new Object[]{this})).floatValue();
        }
        VelocityTracker velocityTracker = this.k;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000);
        if (this.i) {
            return this.k.getXVelocity();
        }
        return this.k.getYVelocity();
    }

    public final void f(View view, float f) {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ee8e8a", new Object[]{this, view, new Float(f)});
            return;
        }
        float e = e();
        boolean z3 = this.j;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if ((z3 ^ z) && (e >= this.f6276a || Math.abs(f) >= this.h * 0.1f)) {
            if (!this.n) {
                m(3, view, e);
                return;
            }
            this.o = true;
        }
        boolean z4 = this.j;
        if (f < 0.0f) {
            z2 = true;
        }
        if (z4 ^ z2) {
            m(1, view, e);
        } else if (1 == this.b) {
            m(1, view, e);
        } else {
            m(2, view, e);
        }
    }

    public final boolean g(View view, float f) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0c15c6e", new Object[]{this, view, new Float(f)})).booleanValue();
        }
        if (view == null || this.l.d(this.i, this.p, (int) f, view) || ((com.taobao.android.abilitykit.ability.pop.render.util.a) this.m).h()) {
            return true;
        }
        if (this.b == 1) {
            boolean z2 = this.j;
            if (f < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z2 ^ z) {
                return true;
            }
        }
        return false;
    }

    public boolean h(MotionEvent motionEvent, View view) {
        float f;
        float f2;
        boolean z;
        float f3;
        float f4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0012a9c", new Object[]{this, motionEvent, view})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (actionMasked == 0) {
            if (this.i) {
                f3 = motionEvent.getX();
            } else {
                f3 = motionEvent.getY();
            }
            this.p = f3;
            this.d = rawX;
            this.c = rawY;
            this.q = view.getY();
            this.r = view.getX();
            if (this.i) {
                f4 = view.getTranslationX();
            } else {
                f4 = view.getTranslationY();
            }
            this.e = f4;
            this.f = false;
            return false;
        }
        float f5 = rawX - this.d;
        float f6 = rawY - this.c;
        if (this.i) {
            f = f5;
        } else {
            f = f6;
        }
        if (g(view, f)) {
            return false;
        }
        float scaledTouchSlop = ViewConfiguration.get(view.getContext().getApplicationContext()).getScaledTouchSlop();
        if (this.h - this.g <= 0 || this.b == 1) {
            f2 = 5.0f;
        } else {
            f2 = 0.5f;
        }
        if (Math.abs(f) >= scaledTouchSlop * f2) {
            boolean z2 = this.i;
            if (Math.abs(f6) <= Math.abs(f5)) {
                z = true;
            } else {
                z = false;
            }
            if (!(z ^ z2)) {
                this.d = rawX;
                this.c = rawY;
                this.f = true;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r4 != 3) goto L_0x00bf;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean i(android.view.MotionEvent r10, android.view.View r11) {
        /*
            r9 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001f
            java.lang.String r5 = "c03524e0"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r9
            r3[r1] = r10
            r3[r0] = r11
            java.lang.Object r10 = r4.ipc$dispatch(r5, r3)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L_0x001f:
            boolean r4 = r9.f
            if (r4 != 0) goto L_0x0024
            return r2
        L_0x0024:
            int r4 = r10.getActionMasked()
            boolean r5 = r9.i
            if (r5 == 0) goto L_0x0034
            float r5 = r10.getRawX()
            float r6 = r9.d
        L_0x0032:
            float r5 = r5 - r6
            goto L_0x003b
        L_0x0034:
            float r5 = r10.getRawY()
            float r6 = r9.c
            goto L_0x0032
        L_0x003b:
            if (r4 == r1) goto L_0x00b0
            if (r4 == r0) goto L_0x0043
            if (r4 == r3) goto L_0x00b0
            goto L_0x00bf
        L_0x0043:
            r9.j(r10)
            boolean r10 = r9.j
            r0 = 0
            if (r10 == 0) goto L_0x005b
            int r10 = r9.h
            int r10 = -r10
            float r10 = (float) r10
            float r2 = r9.e
            float r5 = r5 + r2
            float r0 = java.lang.Math.min(r0, r5)
            float r10 = java.lang.Math.max(r10, r0)
            goto L_0x0069
        L_0x005b:
            int r10 = r9.h
            float r10 = (float) r10
            float r2 = r9.e
            float r5 = r5 + r2
            float r0 = java.lang.Math.max(r0, r5)
            float r10 = java.lang.Math.min(r10, r0)
        L_0x0069:
            float r3 = r9.r
            r0 = 1
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x008b
            float r4 = r9.q
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x008b
            com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler$b r2 = r9.l
            int r5 = r11.getWidth()
            int r6 = r11.getHeight()
            r7 = 0
            java.lang.String r8 = "onPositionChanged"
            r2.e(r3, r4, r5, r6, r7, r8)
            r9.r = r0
            r9.q = r0
        L_0x008b:
            boolean r0 = r9.i
            if (r0 == 0) goto L_0x0093
            r11.setTranslationX(r10)
            goto L_0x0096
        L_0x0093:
            r11.setTranslationY(r10)
        L_0x0096:
            com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler$b r2 = r9.l
            float r3 = r11.getX()
            float r4 = r11.getY()
            int r5 = r11.getWidth()
            int r6 = r11.getHeight()
            r7 = 0
            java.lang.String r8 = "onPositionChanged"
            r2.e(r3, r4, r5, r6, r7, r8)
            goto L_0x00bf
        L_0x00b0:
            r9.f = r2
            r9.f(r11, r5)
            android.view.VelocityTracker r10 = r9.k
            if (r10 == 0) goto L_0x00bf
            r10.recycle()
            r10 = 0
            r9.k = r10
        L_0x00bf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler.i(android.view.MotionEvent, android.view.View):boolean");
    }

    public final void j(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f576b4a5", new Object[]{this, motionEvent});
            return;
        }
        if (this.k == null) {
            this.k = VelocityTracker.obtain();
        }
        this.k.addMovement(motionEvent);
    }

    public void k(int i, int i2) {
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848f9d30", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.b = 0;
        this.g = i;
        this.h = i2;
        if (this.j) {
            i3 = -1;
        }
        ((com.taobao.android.abilitykit.ability.pop.render.util.a) this.m).l(i * i3, i3 * i2);
    }

    public void l(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f5b97d", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.i = z;
        this.j = z2;
        ((com.taobao.android.abilitykit.ability.pop.render.util.a) this.m).k(z);
    }

    public final void m(int i, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e566d242", new Object[]{this, new Integer(i), view, new Float(f)});
            return;
        }
        a aVar = new a(view, i);
        if (i == 1) {
            ((com.taobao.android.abilitykit.ability.pop.render.util.a) this.m).g(view, f, aVar);
        } else if (i == 2) {
            ((com.taobao.android.abilitykit.ability.pop.render.util.a) this.m).f(view, f, aVar);
        } else if (i == 3) {
            ((com.taobao.android.abilitykit.ability.pop.render.util.a) this.m).e(view, f, aVar);
        }
        this.b = 4;
    }
}
