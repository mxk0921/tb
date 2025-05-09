package tb;

import android.app.Activity;
import android.view.Choreographer;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fyo extends yu1 implements ViewTreeObserver.OnScrollChangedListener, Choreographer.FrameCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BLOCK_FRAME_TIME = 250;
    public static final int FROZEN_FRAME_TIME = 700;
    public static final int JANK_FRAME_TIME = 32;
    public static final int MOVIE_BIG_JANK_FRAME_TIME = 125;
    public static final int MOVIE_JANK_FRAME_TIME = 83;
    public static final String SCROLL_TYPE_FINGER = "fingerScroll";
    public static final String SCROLL_TYPE_VIEW = "viewScroll";
    public static final int SLOW_FRAME_TIME = 17;
    public final ey9 D;
    public final int E;
    public final WeakReference<Activity> m;
    public long z;
    public boolean n = false;
    public boolean o = true;
    public long p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public int u = 0;
    public int v = 0;
    public long w = -1;
    public boolean x = false;
    public boolean y = false;
    public boolean A = false;
    public long B = 0;
    public int C = 0;
    public final int F = ViewConfiguration.getTapTimeout();
    public long G = 0;
    public long H = 0;
    public boolean I = false;
    public boolean K = true;
    public boolean L = false;
    public final cw8 l = n();
    public final float J = 16.666666f;

    public fyo(Activity activity, vex vexVar, ey9 ey9Var) {
        super(activity, vexVar);
        this.m = new WeakReference<>(activity);
        this.D = ey9Var;
        this.E = ViewConfiguration.get(activity).getScaledTouchSlop();
    }

    public static /* synthetic */ Object ipc$super(fyo fyoVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1509847139:
                super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).longValue());
                return null;
            case -272160509:
                super.h();
                return null;
            case 245885753:
                super.d((IPage) objArr[0]);
                return null;
            case 986647644:
                super.l((IPage) objArr[0]);
                return null;
            case 2133689546:
                super.i();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/data/fps/ScrollFrameCollector");
        }
    }

    @Override // tb.yu1, tb.afx.a
    public void a(int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6018f9d", new Object[]{this, new Integer(i), new Float(f), new Float(f2), new Long(j)});
            return;
        }
        super.a(i, f, f2, j);
        if (i == 2) {
            float f3 = this.j;
            int i2 = this.E;
            if (f3 > i2 || this.k > i2) {
                long j2 = this.g;
                if (j2 > 0 && j - j2 > this.F) {
                    this.I = true;
                }
            }
        }
    }

    @Override // tb.yu1
    public void d(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea7eb39", new Object[]{this, iPage});
            return;
        }
        super.d(iPage);
        ey9 ey9Var = this.D;
        if (ey9Var != null && (iPage instanceof cll)) {
            ey9Var.c((cll) iPage);
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
            return;
        }
        long j2 = j / 1000000;
        if (this.x) {
            q();
        } else {
            this.K = true;
            this.L = false;
            o();
            r(this.w);
        }
        if (this.o) {
            this.w = j2;
            this.o = false;
            this.y = false;
            this.L = false;
        } else if (!this.x) {
            this.w = j2;
            this.y = false;
            if (this.A) {
                int i = (int) (((this.C * 1.0d) / this.B) * 1000.0d);
                if (i < 30) {
                    this.l.e(i);
                }
                this.A = false;
            }
            this.L = false;
        } else {
            if (this.I && !this.L) {
                p();
                this.L = true;
            }
            s(j2);
        }
    }

    @Override // tb.yu1
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc72903", new Object[]{this});
            return;
        }
        super.h();
        this.n = true;
        Activity activity = this.m.get();
        if (activity != null) {
            yu1.m(activity, this);
            yu1.k(activity, this.D);
        }
    }

    @Override // tb.yu1
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.i();
        Activity activity = this.m.get();
        if (activity != null) {
            yu1.e(activity, this);
            yu1.c(activity, this.D);
        }
    }

    @Override // tb.yu1
    public void l(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3acf0c5c", new Object[]{this, iPage});
            return;
        }
        super.l(iPage);
        if (iPage instanceof cll) {
            cll cllVar = (cll) iPage;
            cllVar.D(this.z);
            ey9 ey9Var = this.D;
            if (ey9Var != null) {
                ey9Var.j(cllVar);
            }
        }
    }

    public final cw8 n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cw8) ipChange.ipc$dispatch("4ba1a1f3", new Object[]{this});
        }
        zzb<?> b = yq7.b(ic.ACTIVITY_FPS_DISPATCHER);
        if (b instanceof cw8) {
            return (cw8) b;
        }
        return null;
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26997f8c", new Object[]{this});
            return;
        }
        ey9 ey9Var = this.D;
        if (ey9Var != null) {
            ey9Var.e();
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d815a80f", new Object[]{this});
            return;
        }
        this.x = true;
        this.y = true;
        if (this.K) {
            long nanoTime = System.nanoTime() / 1000000;
            this.w = nanoTime;
            this.H = nanoTime;
            q();
            this.K = false;
        }
    }

    public final void p() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac45d13", new Object[]{this});
            return;
        }
        ey9 ey9Var = this.D;
        if (ey9Var != null) {
            if (this.I) {
                str = SCROLL_TYPE_FINGER;
            } else {
                str = SCROLL_TYPE_VIEW;
            }
            ey9Var.f(str);
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fb8101", new Object[]{this});
        } else if (!this.n) {
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void r(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a98f88be", new Object[]{this, new Long(j)});
            return;
        }
        if (this.I && !yq7.c(this.l)) {
            long j2 = j - this.H;
            if (j2 > 0) {
                this.l.g((int) ((1000.0d / j2) * this.G));
            }
        }
        this.I = false;
        this.G = 0L;
        this.H = 0L;
    }

    public final void s(long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d0565b", new Object[]{this, new Long(j)});
            return;
        }
        long j2 = j - this.w;
        this.w = j;
        if (this.y) {
            this.z += j2;
        }
        if (this.p + j2 > 1000) {
            if (!yq7.c(this.l)) {
                cw8 cw8Var = this.l;
                if (this.I) {
                    str = SCROLL_TYPE_FINGER;
                } else {
                    str = SCROLL_TYPE_VIEW;
                }
                cw8Var.f(str, this.v, this.r, this.s, this.t, this.u, this.q);
            }
            this.p = 0L;
            this.v = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            this.q = 0;
            this.x = false;
            if (!this.y) {
                return;
            }
        }
        this.y = false;
        int i = (j2 > 17L ? 1 : (j2 == 17L ? 0 : -1));
        if (i > 0) {
            this.q++;
            if (j2 > 32) {
                this.r++;
            }
            if (j2 > 83) {
                this.s++;
                if (j2 > 125) {
                    this.t++;
                }
            }
            if (j2 > 700) {
                this.u++;
            }
        }
        if (this.A) {
            long j3 = this.B;
            double d = j3;
            if (d <= 99.6d || i >= 0) {
                this.B = j3 + j2;
                this.C++;
            } else {
                int i2 = (int) (((this.C * 1.0d) / d) * 1000.0d);
                if (i2 < 30) {
                    this.l.e(i2);
                }
                this.A = false;
            }
        } else if (j2 > 33.3d && this.I) {
            this.A = true;
            this.B = j2;
            this.C = 1;
        }
        this.p += j2;
        this.G = ((float) this.G) + Math.max(((float) j2) - this.J, 0.0f);
        this.v++;
    }
}
