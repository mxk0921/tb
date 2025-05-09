package tb;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class r05 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f27029a = -1;
    public int b = 0;
    public final ScaleGestureDetector c;
    public VelocityTracker d;
    public boolean e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final float j;
    public final float k;
    public final drk l;
    public euk m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ScaleGestureDetector.OnScaleGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f27030a;

        public a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            if (scaleFactor >= 0.0f) {
                r05.a(r05.this).c(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            }
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8bc93791", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            this.f27030a = scaleGestureDetector.getCurrentSpan();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d53c49db", new Object[]{this, scaleGestureDetector});
            } else if (r05.b(r05.this) != null) {
                r05.b(r05.this).a(1.0f, scaleGestureDetector.getCurrentSpan() / this.f27030a);
            }
        }
    }

    static {
        t2o.a(912263043);
    }

    public r05(Context context, drk drkVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.k = viewConfiguration.getScaledMinimumFlingVelocity();
        this.j = viewConfiguration.getScaledTouchSlop();
        this.l = drkVar;
        this.c = new ScaleGestureDetector(context, new a());
    }

    public static /* synthetic */ drk a(r05 r05Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drk) ipChange.ipc$dispatch("17b0d3f", new Object[]{r05Var});
        }
        return r05Var.l;
    }

    public static /* synthetic */ euk b(r05 r05Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (euk) ipChange.ipc$dispatch("d07b356d", new Object[]{r05Var});
        }
        return r05Var.m;
    }

    public final float c(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71acc8a8", new Object[]{this, motionEvent})).floatValue();
        }
        try {
            return motionEvent.getX(this.b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    public final float d(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("869590e9", new Object[]{this, motionEvent})).floatValue();
        }
        try {
            return motionEvent.getY(this.b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98b514a4", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7be90108", new Object[]{this})).booleanValue();
        }
        return this.c.isInProgress();
    }

    public boolean g(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            this.c.onTouchEvent(motionEvent);
            return h(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    public final boolean h(MotionEvent motionEvent) {
        boolean z;
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63068cca", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f27029a = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            float c = c(motionEvent);
            this.h = c;
            this.f = c;
            float d = d(motionEvent);
            this.i = d;
            this.g = d;
            this.e = false;
        } else if (action == 1) {
            this.f27029a = -1;
            if (this.e && this.d != null) {
                this.f = c(motionEvent);
                this.g = d(motionEvent);
                this.d.addMovement(motionEvent);
                this.d.computeCurrentVelocity(1000);
                float xVelocity = this.d.getXVelocity();
                float yVelocity = this.d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.k) {
                    this.l.b(this.f, this.g, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker = this.d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.d = null;
            }
        } else if (action == 2) {
            float c2 = c(motionEvent);
            float d2 = d(motionEvent);
            float f = c2 - this.f;
            float f2 = d2 - this.g;
            float f3 = c2 - this.h;
            float f4 = d2 - this.i;
            if (!this.e) {
                if (Math.sqrt((f * f) + (f2 * f2)) >= this.j) {
                    z = true;
                } else {
                    z = false;
                }
                this.e = z;
            }
            if (this.e) {
                this.l.a(f, f2, f3, f4);
                this.f = c2;
                this.g = d2;
                VelocityTracker velocityTracker2 = this.d;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.f27029a = -1;
            VelocityTracker velocityTracker3 = this.d;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.d = null;
            }
        } else if (action == 6) {
            int b = iwv.b(motionEvent.getAction());
            if (motionEvent.getPointerId(b) == this.f27029a) {
                if (b == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                this.f27029a = motionEvent.getPointerId(i);
                this.f = motionEvent.getX(i);
                this.g = motionEvent.getY(i);
            }
        }
        int i3 = this.f27029a;
        if (i3 != -1) {
            i2 = i3;
        }
        this.b = motionEvent.findPointerIndex(i2);
        return true;
    }

    public void i(euk eukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122ad508", new Object[]{this, eukVar});
        } else {
            this.m = eukVar;
        }
    }
}
