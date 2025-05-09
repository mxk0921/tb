package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.zsz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gzy implements zsz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f20333a;
    public String b;

    static {
        t2o.a(598737163);
        t2o.a(598737503);
    }

    @Override // tb.zsz
    public zsz a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zsz) ipChange.ipc$dispatch("e731fc7a", new Object[]{this});
        }
        gzy gzyVar = new gzy();
        gzyVar.f20333a = this.f20333a;
        gzyVar.b = this.b;
        return gzyVar;
    }

    @Override // tb.jkz
    public jkz b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkz) ipChange.ipc$dispatch("f3431015", new Object[]{this});
        }
        return zsz.a.a(this);
    }

    @Override // tb.jkz
    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsz)) {
            return false;
        }
        return f((zsz) obj);
    }

    @Override // tb.jkz
    public void g(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad3ff3d", new Object[]{this, new Integer(i), str});
            return;
        }
        ckf.g(str, "value");
        if (i == -18018673) {
            this.b = str;
        } else {
            zsz.a.g(this, i, str);
        }
    }

    @Override // tb.jkz
    public void h(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848f9d30", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            zsz.a.d(this, i, i2);
        }
    }

    @Override // tb.jkz
    public void i(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848fa0f1", new Object[]{this, new Integer(i), new Long(j)});
        } else {
            zsz.a.e(this, i, j);
        }
    }

    @Override // tb.jkz
    public void j(int i, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848f8a6b", new Object[]{this, new Integer(i), new Double(d)});
        } else {
            zsz.a.b(this, i, d);
        }
    }

    @Override // tb.jkz
    public void k(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848f91ed", new Object[]{this, new Integer(i), new Float(f)});
        } else if (i == -1295530522) {
            this.f20333a = f;
        } else {
            zsz.a.c(this, i, f);
        }
    }

    @Override // tb.jkz
    public void l(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848fdd01", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            zsz.a.h(this, i, z);
        }
    }

    @Override // tb.jkz
    public void m(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd52c54f", new Object[]{this, new Integer(i), obj});
            return;
        }
        ckf.g(obj, "value");
        zsz.a.f(this, i, obj);
    }

    @Override // tb.zsz
    public boolean f(zsz zszVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50433f3c", new Object[]{this, zszVar})).booleanValue();
        }
        ckf.g(zszVar, "other");
        if (!(zszVar instanceof gzy)) {
            return false;
        }
        gzy gzyVar = (gzy) zszVar;
        return gzyVar.f20333a == this.f20333a && ckf.b(gzyVar.b, this.b);
    }
}
