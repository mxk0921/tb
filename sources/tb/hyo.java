package tb;

import android.app.Activity;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IScrollListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hyo extends yu1 implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnDrawListener, Choreographer.FrameCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ey9 m;
    public final int n;
    public boolean o = true;
    public boolean p = false;
    public boolean q = true;
    public boolean r = false;
    public long s = -1;
    public double t = vu3.b.GEO_NOT_SUPPORT;
    public double u = vu3.b.GEO_NOT_SUPPORT;
    public long v = 0;
    public int w = 0;

    public hyo(Activity activity, vex vexVar, ey9 ey9Var) {
        super(activity, vexVar);
        this.n = ViewConfiguration.get(activity).getScaledTouchSlop();
        this.m = ey9Var;
    }

    public static /* synthetic */ Object ipc$super(hyo hyoVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1509847139) {
            super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).longValue());
            return null;
        } else if (hashCode == -272160509) {
            super.h();
            return null;
        } else if (hashCode == 2133689546) {
            super.i();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/monitor/impl/data/fps/ScrollHitchRateV2Collector");
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
        if (2 == i) {
            float f3 = this.j;
            int i2 = this.n;
            if ((f3 > i2 || this.k > i2) && this.g > 0) {
                this.r = true;
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
        } else if (this.p || this.w < 1) {
            q();
            if (!this.p && j == this.s) {
                j = System.nanoTime();
            }
            long j2 = this.s;
            long j3 = 0;
            if (j2 > 0) {
                j3 = j - j2;
            }
            this.s = j;
            if (!this.p) {
                this.w++;
                s(j, j3);
                return;
            }
            this.p = false;
            if (this.o) {
                this.o = false;
                b21.s().p().onStopMonitorDoFrame();
                return;
            }
            this.w = 0;
            s(j, j3);
        } else {
            p(r(this.s));
            b21.s().p().onStopMonitorDoFrame();
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
        yu1.m(this.f32352a.get(), this);
        Choreographer.getInstance().removeFrameCallback(this);
        ViewTreeObserver g = yu1.g(this.f32352a.get());
        if (g != null) {
            g.removeOnDrawListener(this);
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
        yu1.e(this.f32352a.get(), this);
        ViewTreeObserver g = yu1.g(this.f32352a.get());
        if (g != null && g.isAlive()) {
            g.addOnDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73be92ca", new Object[]{this});
        } else if (this.q && this.r) {
            this.r = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d815a80f", new Object[]{this});
            return;
        }
        this.p = true;
        if (this.q) {
            long nanoTime = System.nanoTime();
            this.s = nanoTime;
            this.v = nanoTime;
            this.q = false;
            q();
            IScrollListener p = b21.s().p();
            Activity activity = this.f32352a.get();
            if (this.r) {
                i = 1;
            } else {
                i = 2;
            }
            p.onScrollStart(activity, i);
            zq6.b("ScrollHitchRateV2", "ScrollBegin");
        }
    }

    public final void p(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac96e4f7", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.m != null) {
            StringBuilder sb = new StringBuilder();
            Queue<FrameMetrics> b = this.m.b();
            if (b != null) {
                Iterator<FrameMetrics> it = b.iterator();
                while (it.hasNext()) {
                    ey9.i(sb, gyo.a(it.next()));
                    if (it.hasNext()) {
                        sb.append("~~~~\n");
                    } else {
                        sb.append("\n");
                    }
                }
            }
            str = sb.toString();
        } else {
            str = null;
        }
        IScrollListener p = b21.s().p();
        p.onScrollEnd(this.f32352a.get(), str);
        p.onScrollEnd(this.f32352a.get(), i, str);
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fb8101", new Object[]{this});
        } else {
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final int r(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a98f88b1", new Object[]{this, new Long(j)})).intValue();
        }
        int i = -1;
        if (this.r) {
            long j2 = this.v;
            if (j2 > 0 && j - j2 > 100000000) {
                int i2 = (int) ((this.t * 1000.0d) / this.u);
                if (n(i2, j2 / 1000000)) {
                    i = i2;
                }
            }
        }
        this.r = false;
        this.q = true;
        this.t = vu3.b.GEO_NOT_SUPPORT;
        this.u = vu3.b.GEO_NOT_SUPPORT;
        this.v = 0L;
        this.s = -1L;
        this.w = 0;
        return i;
    }

    public final void s(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b53aebc9", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        b21.s().p().onDoFrame(j);
        this.t += Math.max(((float) j2) - (f() * 1000000.0f), 0.0f);
        this.u += Math.max(j2, 0L);
    }

    public final boolean n(int i, long j) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1679399", new Object[]{this, new Integer(i), new Long(j)})).booleanValue();
        }
        for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
            Long l = (Long) entry.getValue();
            if (l != null && j >= l.longValue()) {
                ((cll) entry.getKey()).d().u("scrollHitchRateV2", Integer.valueOf(i));
                z = true;
            }
        }
        return z;
    }
}
