package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pjh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View.OnLongClickListener f26126a;
    public boolean b;
    public long e;
    public final View g;
    public float c = -1.0f;
    public float d = -1.0f;
    public final Handler f = new Handler(Looper.getMainLooper());
    public final b h = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(478151135);
        }

        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (!(pjh.a(pjh.this) == -1.0f || pjh.b(pjh.this) == -1.0f)) {
                pjh.c(pjh.this, true);
                if (pjh.d(pjh.this) != null) {
                    pjh.d(pjh.this).onLongClick(pjh.e(pjh.this));
                }
            }
            pjh.f(pjh.this);
        }
    }

    static {
        t2o.a(478151133);
    }

    public pjh(View view) {
        this.g = view;
    }

    public static /* synthetic */ float a(pjh pjhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6feb0a7", new Object[]{pjhVar})).floatValue();
        }
        return pjhVar.c;
    }

    public static /* synthetic */ float b(pjh pjhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b3d2046", new Object[]{pjhVar})).floatValue();
        }
        return pjhVar.d;
    }

    public static /* synthetic */ boolean c(pjh pjhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94e26285", new Object[]{pjhVar, new Boolean(z)})).booleanValue();
        }
        pjhVar.b = z;
        return z;
    }

    public static /* synthetic */ View.OnLongClickListener d(pjh pjhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnLongClickListener) ipChange.ipc$dispatch("6df8d899", new Object[]{pjhVar});
        }
        return pjhVar.f26126a;
    }

    public static /* synthetic */ View e(pjh pjhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6bcac0b5", new Object[]{pjhVar});
        }
        return pjhVar.g;
    }

    public static /* synthetic */ void f(pjh pjhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c36ded2", new Object[]{pjhVar});
        } else {
            pjhVar.i();
        }
    }

    public boolean g(MotionEvent motionEvent) {
        View.OnLongClickListener onLongClickListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getPointerCount() > 0 && motionEvent.getPointerId(0) != 0) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.c == -1.0f && this.d == -1.0f) {
            this.b = false;
            this.c = motionEvent.getX();
            this.d = motionEvent.getY();
            this.e = SystemClock.uptimeMillis();
            this.f.postDelayed(this.h, ViewConfiguration.getLongPressTimeout());
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 4) {
            i();
            if (this.b) {
                this.b = false;
                return true;
            }
        } else if (motionEvent.getAction() == 1) {
            this.b = false;
            if (SystemClock.uptimeMillis() - this.e >= ViewConfiguration.getLongPressTimeout()) {
                if (!(this.c == -1.0f || this.d == -1.0f || (onLongClickListener = this.f26126a) == null)) {
                    onLongClickListener.onLongClick(this.g);
                }
                i();
                return true;
            }
            i();
        } else if (h(motionEvent)) {
            i();
        }
        return false;
    }

    public final boolean h(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d7d0abb", new Object[]{this, motionEvent})).booleanValue();
        }
        if (Math.abs(this.c - motionEvent.getX()) > ViewConfiguration.get(this.g.getContext()).getScaledTouchSlop() || Math.abs(this.d - motionEvent.getY()) > ViewConfiguration.get(this.g.getContext()).getScaledTouchSlop()) {
            return true;
        }
        return false;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.c = -1.0f;
        this.d = -1.0f;
        this.f.removeCallbacks(this.h);
    }

    public void j(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f73f2f", new Object[]{this, onLongClickListener});
        } else {
            this.f26126a = onLongClickListener;
        }
    }
}
