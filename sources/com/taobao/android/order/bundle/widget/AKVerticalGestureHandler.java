package com.taobao.android.order.bundle.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.b9c;
import tb.eab;
import tb.fnn;
import tb.t2o;
import tb.t8;
import tb.uel;
import tb.z4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AKVerticalGestureHandler implements b9c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int g;
    public int h;
    public int i;
    public VelocityTracker j;
    public final c k;
    public final eab l;
    public boolean n;
    public final float o;

    /* renamed from: a  reason: collision with root package name */
    public int f9119a = 1;
    public float b = -1.0f;
    public float c = -1.0f;
    public float d = 0.0f;
    public boolean e = false;
    public boolean f = false;
    public final fnn m = fnn.e(z4a.REC_ORDER_DETAIL);

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface State {
        public static final int ANIMATING = 4;
        public static final int CLOSED = 3;
        public static final int COLLAPSE = 2;
        public static final int EXPAND = 1;
        public static final int INIT = 0;
        public static final int MAX_OFFSET = 5;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f9120a;
        public final /* synthetic */ int b;

        public a(View view, int i) {
            this.f9120a = view;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AKVerticalGestureHandler.a(AKVerticalGestureHandler.this).a(this.f9120a, this.b);
            if (AKVerticalGestureHandler.b(AKVerticalGestureHandler.this)) {
                AKVerticalGestureHandler.a(AKVerticalGestureHandler.this).b(this.f9120a);
                AKVerticalGestureHandler.c(AKVerticalGestureHandler.this, false);
            }
            AKVerticalGestureHandler.d(AKVerticalGestureHandler.this, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f9121a;

        public b(View view) {
            this.f9121a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AKVerticalGestureHandler.a(AKVerticalGestureHandler.this).c(this.f9121a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void a(View view, int i);

        void b(View view);

        void c(View view);

        boolean d(int i);

        boolean e();
    }

    static {
        t2o.a(297795590);
        t2o.a(297795596);
    }

    public AKVerticalGestureHandler(c cVar, eab eabVar, boolean z, Context context) {
        this.k = cVar;
        this.l = eabVar;
        this.o = ViewConfiguration.get(context.getApplicationContext()).getScaledTouchSlop();
    }

    public static /* synthetic */ c a(AKVerticalGestureHandler aKVerticalGestureHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("2665e8d8", new Object[]{aKVerticalGestureHandler});
        }
        return aKVerticalGestureHandler.k;
    }

    public static /* synthetic */ boolean b(AKVerticalGestureHandler aKVerticalGestureHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53d12b7a", new Object[]{aKVerticalGestureHandler})).booleanValue();
        }
        return aKVerticalGestureHandler.n;
    }

    public static /* synthetic */ boolean c(AKVerticalGestureHandler aKVerticalGestureHandler, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecac5ca4", new Object[]{aKVerticalGestureHandler, new Boolean(z)})).booleanValue();
        }
        aKVerticalGestureHandler.n = z;
        return z;
    }

    public static /* synthetic */ int d(AKVerticalGestureHandler aKVerticalGestureHandler, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3b803c3", new Object[]{aKVerticalGestureHandler, new Integer(i)})).intValue();
        }
        aKVerticalGestureHandler.f9119a = i;
        return i;
    }

    public final float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ebcc6af6", new Object[]{this})).floatValue();
        }
        VelocityTracker velocityTracker = this.j;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000);
        return this.j.getYVelocity();
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbc139b1", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.f9119a;
    }

    public final void h(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ee8e8a", new Object[]{this, view, new Float(f)});
            return;
        }
        float e = e();
        float f2 = this.d + f;
        if (e < 900.0f || f <= 0.0f) {
            if (e < -900.0f || f >= 0.0f) {
                if (f < 0.0f) {
                    int i = this.g;
                    float f3 = i / 2.0f;
                    if (f2 < f3) {
                        q(1, view, e);
                        return;
                    }
                    if (f2 > f3) {
                        int i2 = this.i;
                        if (f2 < i2 - ((i2 - i) / 2.0f)) {
                            q(2, view, e);
                            return;
                        }
                    }
                    q(3, view, e);
                    return;
                }
                int i3 = this.i;
                int i4 = this.g;
                if (f2 > i3 - ((i3 - i4) / 2.0f)) {
                    q(3, view, e);
                } else if (f2 > i4 / 4.0f) {
                    q(2, view, e);
                } else {
                    q(1, view, e);
                }
            } else if (f2 > this.g) {
                q(2, view, e);
            } else {
                q(1, view, e);
            }
        } else if (f2 > this.g) {
            q(3, view, e);
        } else {
            q(2, view, e);
        }
    }

    public boolean i(MotionEvent motionEvent, View view) {
        boolean z;
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0012a9c", new Object[]{this, motionEvent, view})).booleanValue();
        }
        if (motionEvent.getActionMasked() == 0) {
            this.b = motionEvent.getRawY();
            this.c = motionEvent.getRawX();
            this.d = view.getTranslationY();
            this.e = false;
            this.f = false;
            return false;
        }
        if (this.h - this.g <= 0 || this.f9119a == 1) {
            z = false;
        } else {
            z = true;
        }
        float rawY = motionEvent.getRawY() - this.b;
        float rawX = motionEvent.getRawX() - this.c;
        if (!this.e && !n(view, rawY)) {
            if (z && motionEvent.getPointerCount() > 1) {
                return true;
            }
            if (z) {
                f = 0.1f;
            } else {
                f = 0.5f;
            }
            if (((t8) this.l).h()) {
                f2 = this.o;
            } else {
                f2 = 0.0f;
            }
            if (Math.abs(rawY) + f2 >= this.o * f && (Math.abs(rawY) + f2 >= Math.abs(rawX) || Math.abs(rawY) + f2 >= this.o * 3.0f * f)) {
                this.f = true;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r3 != 3) goto L_0x004b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean j(android.view.MotionEvent r7, android.view.View r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 3
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.order.bundle.widget.AKVerticalGestureHandler.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "c03524e0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r5 = 0
            r2[r5] = r6
            r2[r1] = r7
            r2[r0] = r8
            java.lang.Object r7 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001f:
            int r3 = r7.getActionMasked()
            float r4 = r7.getRawY()
            float r5 = r6.b
            float r4 = r4 - r5
            if (r3 == r1) goto L_0x003c
            if (r3 == r0) goto L_0x0031
            if (r3 == r2) goto L_0x003c
            goto L_0x004b
        L_0x0031:
            r6.m(r7)
            boolean r7 = r6.f
            if (r7 == 0) goto L_0x004b
            r6.o(r8, r4)
            goto L_0x004b
        L_0x003c:
            boolean r7 = r6.f
            if (r7 == 0) goto L_0x004b
            r6.h(r8, r4)
            r7 = 0
            r6.c = r7
            r6.b = r7
            r7 = 0
            r6.j = r7
        L_0x004b:
            boolean r7 = r6.f
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.order.bundle.widget.AKVerticalGestureHandler.j(android.view.MotionEvent, android.view.View):boolean");
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        fnn fnnVar = this.m;
        if (fnnVar != null) {
            fnnVar.c();
        }
    }

    public void l(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bcedfbc", new Object[]{this, view, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public final void m(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f576b4a5", new Object[]{this, motionEvent});
            return;
        }
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
        this.j.addMovement(motionEvent);
    }

    public final boolean n(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b42f7b3", new Object[]{this, view, new Float(f)})).booleanValue();
        }
        if (view == null || !this.k.e() || this.k.d((int) f)) {
            return true;
        }
        if (this.f9119a != 1 || f >= 0.0f) {
            return false;
        }
        return true;
    }

    public final void o(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("820b9c7c", new Object[]{this, view, new Float(f)});
            return;
        }
        view.setTranslationY(Math.min(f(), Math.max(0.0f, f + this.d)));
        c cVar = this.k;
        if (cVar != null) {
            cVar.c(view);
        }
    }

    public void q(int i, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e566d242", new Object[]{this, new Integer(i), view, new Float(f)});
            return;
        }
        a aVar = new a(view, i);
        b bVar = new b(view);
        this.f9119a = 4;
        if (i == 0) {
            ((t8) this.l).g(view, f, aVar, bVar);
        } else if (i == 1) {
            ((t8) this.l).f(view, f, aVar, bVar);
        } else if (i == 2) {
            ((t8) this.l).e(view, f, aVar, bVar);
        } else if (i == 3 || i == 5) {
            ((t8) this.l).d(view, f, aVar, bVar);
        }
    }

    public void p(int i, int i2, int i3, View view) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("263e0e1f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), view});
            return;
        }
        fnn fnnVar = this.m;
        if (fnnVar == null || Boolean.parseBoolean(fnnVar.d("optimizeRecommend", "false"))) {
            z = false;
        }
        if (!uel.m() || z) {
            this.f9119a = 0;
        }
        this.g = i;
        this.h = i2;
        this.i = i3;
        ((t8) this.l).k(i, i2, i3, view);
    }
}
