package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class qz implements z8e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public wg3 f27011a;
    public int b = -1;
    public final NavigableMap<Integer, wg3> c = new TreeMap();

    static {
        t2o.a(993001705);
        t2o.a(993001708);
    }

    @Override // tb.z8e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7082ac8d", new Object[]{this});
            return;
        }
        for (Map.Entry entry : ((TreeMap) this.c).entrySet()) {
            f((wg3) entry.getValue(), ((Integer) entry.getKey()).intValue());
        }
    }

    @Override // tb.z8e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2580662b", new Object[]{this});
            return;
        }
        wg3 wg3Var = this.f27011a;
        if (wg3Var != null) {
            wg3Var.E();
        }
        this.f27011a = null;
        this.b = -1;
    }

    @Override // tb.z8e
    public void d(boolean z, y8e y8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df90f09b", new Object[]{this, new Boolean(z), y8eVar});
        } else {
            m(z, y8eVar);
        }
    }

    @Override // tb.z8e
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        b();
        ((TreeMap) this.c).clear();
    }

    @Override // tb.z8e
    public void e(wg3 wg3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("566214d1", new Object[]{this, wg3Var, new Integer(i)});
            return;
        }
        if (wg3Var == this.f27011a) {
            wg3Var.E();
            this.f27011a = null;
            this.b = -1;
        }
        ((TreeMap) this.c).remove(Integer.valueOf(i));
    }

    @Override // tb.z8e
    public void f(wg3 wg3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("412a370c", new Object[]{this, wg3Var, new Integer(i)});
        } else if (wg3Var.Y() && wg3Var.u()) {
            if (wg3Var == this.f27011a) {
                wg3Var.N();
            } else {
                wg3Var.E();
            }
        }
    }

    @Override // tb.z8e
    public void g(wg3 wg3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd62a2c", new Object[]{this, wg3Var, new Integer(i)});
        } else if (wg3Var != null && wg3Var != this.f27011a) {
            b();
            l(wg3Var, i);
        }
    }

    @Override // tb.z8e
    public void h(wg3 wg3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335241df", new Object[]{this, wg3Var, new Integer(i)});
        } else if (wg3Var.Y()) {
            ((TreeMap) this.c).put(Integer.valueOf(i), wg3Var);
        }
    }

    @Override // tb.z8e
    public void i(boolean z, y8e y8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b44b46e", new Object[]{this, new Boolean(z), y8eVar});
        } else {
            m(z, y8eVar);
        }
    }

    @Override // tb.z8e
    public void j(y8e y8eVar, wg3 wg3Var, int i) {
        int i2;
        Map.Entry higherEntry;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd456d54", new Object[]{this, y8eVar, wg3Var, new Integer(i)});
        } else if (!this.c.isEmpty() && (i2 = this.b) >= 0 && this.f27011a != null && (higherEntry = ((TreeMap) this.c).higherEntry(Integer.valueOf(i2))) != null) {
            int intValue = ((Integer) higherEntry.getKey()).intValue();
            wg3 wg3Var2 = (wg3) higherEntry.getValue();
            xw1 xw1Var = (xw1) y8eVar;
            int E0 = xw1Var.E0();
            int D0 = xw1Var.D0();
            int e = wg3Var2.e();
            int v = wg3Var2.v();
            int k = (int) ((v - e) * k());
            if (v - E0 >= k && D0 - e >= k) {
                l(wg3Var2, intValue);
            }
        }
    }

    public abstract float k();

    public final void l(wg3 wg3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dce4496e", new Object[]{this, wg3Var, new Integer(i)});
            return;
        }
        wg3 wg3Var2 = this.f27011a;
        if (wg3Var != wg3Var2) {
            if (wg3Var2 != null) {
                wg3Var2.E();
            }
            wg3Var.N();
            this.f27011a = wg3Var;
            this.b = i;
        }
    }

    public final void m(boolean z, y8e y8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d60a3286", new Object[]{this, new Boolean(z), y8eVar});
        } else if (!z) {
            b();
        } else {
            ((q5p) this).c(y8eVar);
        }
    }
}
