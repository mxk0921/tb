package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.l;
import tb.pnl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class k32 implements Runnable, hbp, pnl.b, l.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float PAGE_LOAD_PERCENT = 0.7f;
    private static final String o = "BaseVisibleCalculator";
    private static final int p = 20000;

    /* renamed from: a  reason: collision with root package name */
    private l f22371a;
    public final cll d;
    private volatile pnl j;
    private float b = 0.0f;
    private boolean c = false;
    private int e = 0;
    private float f = 0.0f;
    private float g = 0.0f;
    private float h = 0.0f;
    private float i = 0.0f;
    private boolean k = false;
    private volatile boolean l = false;
    private boolean m = false;
    private final Runnable n = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            k32.this.m(-1);
            k32.c(k32.this);
        }
    }

    public k32(cll cllVar) {
        if (cllVar != null) {
            this.d = cllVar;
            zzb<?> b = yq7.b(ic.WINDOW_EVENT_DISPATCHER);
            if (b instanceof l) {
                this.f22371a = (l) b;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Visible calculate must page not null");
    }

    public static /* synthetic */ void c(k32 k32Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b78b077e", new Object[]{k32Var});
        } else {
            k32Var.p();
        }
    }

    private void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49790c1b", new Object[]{this, new Long(j)});
        } else if (!this.m) {
            i(j);
            p();
            this.m = true;
        }
    }

    private void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314007a1", new Object[]{this, new Long(j)});
        } else if (!this.c && !this.k) {
            j(j);
            p();
            this.c = true;
        }
    }

    private int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44c94463", new Object[]{this})).intValue();
        }
        Context h = this.d.h();
        if (h != null) {
            return ViewConfiguration.get(h).getScaledTouchSlop();
        }
        return Integer.MAX_VALUE;
    }

    private boolean h(cll cllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28d19a63", new Object[]{this, cllVar})).booleanValue();
        }
        if (cllVar.J()) {
            return obq.BIZ_NAME.equals(cllVar.o());
        }
        if (cllVar.M()) {
            return "com.taobao.tao.homepage.HomepageFragment".equals(cllVar.o());
        }
        return false;
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b32511", new Object[]{this});
            return;
        }
        this.k = true;
        if (this.j != null) {
            synchronized (this) {
                try {
                    if (this.j != null) {
                        w9a.g().f().removeCallbacks(this.n);
                        if (this.j != null) {
                            this.j.e();
                        }
                        k();
                        this.j = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!yq7.c(this.f22371a)) {
            this.f22371a.removeListener(this);
        }
    }

    @Override // com.taobao.monitor.impl.trace.l.c
    public void A(Activity activity, KeyEvent keyEvent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5c8321", new Object[]{this, activity, keyEvent, new Long(j)});
        }
    }

    @Override // tb.pnl.b
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70da9bad", new Object[]{this, view});
        } else {
            this.d.c0(view);
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a6ce8b", new Object[]{this, new Integer(i)});
            return;
        }
        m(i);
        r();
    }

    public abstract void i(long j);

    public abstract void j(long j);

    public abstract void k();

    public abstract void l(long j);

    public abstract void m(int i);

    public abstract void n(float f, long j);

    @Override // com.taobao.monitor.impl.trace.l.c
    public void o(Activity activity, int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("747a3d9a", new Object[]{this, activity, new Integer(i), new Float(f), new Float(f2), new Long(j)});
        } else if (!this.k && !this.c && qgw.c(activity, this.d.w())) {
            if (i == 0) {
                this.f = f;
                this.g = f2;
                this.h = 0.0f;
                this.i = 0.0f;
            } else if (i == 1) {
                float g = g();
                if (this.h > g || this.i > g) {
                    p();
                    m(-2);
                }
            } else if (i == 2) {
                this.h += Math.abs(f - this.f);
                this.i += Math.abs(f2 - this.g);
                this.f = f;
                this.g = f2;
            }
        }
    }

    public void q(View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeadff81", new Object[]{this, view, new Long(j)});
        } else if (!this.l && this.d.N()) {
            if (this.k) {
                m(-6);
                return;
            }
            this.j = new pnl(view, this.d);
            this.j.d(this);
            this.j.c();
            if (!yq7.c(this.f22371a)) {
                this.f22371a.addListener(this);
            }
            w9a.g().f().postDelayed(this.n, 20000L);
            l(j);
            this.l = true;
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38eab52f", new Object[]{this});
        } else {
            p();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        int i = this.e + 1;
        this.e = i;
        if (i > 2) {
            d(out.a());
            return;
        }
        Handler i2 = w9a.g().i();
        i2.removeCallbacks(this);
        i2.postAtFrontOfQueue(this);
    }

    @Override // tb.pnl.b
    public void b(float f, long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5efa603b", new Object[]{this, new Float(f), new Long(j)});
            return;
        }
        if (this.d.J() || this.d.M()) {
            str = this.d.o();
        } else {
            str = this.d.getPageName();
        }
        float b = lll.b(str);
        float f2 = h(this.d) ? 0.8f : 0.7f;
        if (Math.abs(f - this.b) > 0.05f || f >= f2 || f >= b) {
            n(f, out.a());
            zq6.a(o, "visiblePercent", Float.valueOf(f), this.d.getPageName());
            if ((f >= f2 || f >= b) && !this.c && !this.k) {
                e(j);
                run();
            }
            this.b = f;
        }
    }
}
