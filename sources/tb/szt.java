package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class szt implements e1e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static szt f;
    public boolean d = false;
    public boolean e = false;

    /* renamed from: a  reason: collision with root package name */
    public final zv3 f28380a = new zv3();
    public final pqo b = new pqo();
    public final rzt c = new rzt();

    static {
        t2o.a(962592885);
        t2o.a(962592943);
    }

    public static synchronized szt d() {
        synchronized (szt.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (szt) ipChange.ipc$dispatch("464cd728", new Object[0]);
            }
            if (f == null) {
                f = new szt();
            }
            return f;
        }
    }

    public final ozt a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozt) ipChange.ipc$dispatch("14131e1c", new Object[]{this});
        }
        return this.c.a();
    }

    @Override // tb.e1e
    public ozt b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozt) ipChange.ipc$dispatch("f80b62d6", new Object[]{this});
        }
        if (e()) {
            return a();
        }
        return null;
    }

    @Override // tb.e1e
    public void c(qe2 qe2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff5b6f3", new Object[]{this, qe2Var});
        } else if (qe2Var != null) {
            h(qe2Var.a(), qe2Var.f26695a, qe2Var.c);
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        if (!b1v.bDetectIpv6 || this.d || this.f28380a.b() || a() == null) {
            return false;
        }
        int a2 = pte.a();
        if (a2 == 2) {
            return true;
        }
        if (a2 == 3) {
            return this.b.b();
        }
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba4450fa", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("598b7ba0", new Object[]{this});
            return;
        }
        x2r.f().i("close_detect_ipv6", this.f28380a);
        x2r.f().i("sample_ipv6", this.b);
    }

    public final void h(boolean z, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8acddcad", new Object[]{this, new Boolean(z), new Integer(i), new Long(j)});
        } else if (!z && this.e) {
            this.d = true;
            i(false);
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1975666", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }
}
