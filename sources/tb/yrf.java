package tb;

import com.alibaba.jsi.standard.js.Bridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yrf extends ksf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long kAllProperties = 0;
    public static final long kOnlyConfigurable = 4;
    public static final long kOnlyEnumerable = 2;
    public static final long kOnlyWritable = 1;

    static {
        t2o.a(921698345);
    }

    public yrf(dqf dqfVar) {
        super(dqfVar, Bridge.createNative(dqfVar, 7));
        u(dqfVar);
    }

    public static /* synthetic */ Object ipc$super(yrf yrfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/js/JSObject");
    }

    public static void u(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568d8b35", new Object[]{dqfVar});
        } else if (dqfVar.r()) {
            throw new RuntimeException("JSContext '" + dqfVar.o() + "'has been disposed!");
        }
    }

    public ypf A(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ypf) ipChange.ipc$dispatch("767db0bd", new Object[]{this, dqfVar});
        }
        b();
        Object cmd = Bridge.cmd(dqfVar, 119, this.b);
        if (cmd instanceof ypf) {
            return (ypf) cmd;
        }
        return null;
    }

    public spf B(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (spf) ipChange.ipc$dispatch("e817c33a", new Object[]{this, dqfVar});
        }
        b();
        Object cmd = Bridge.cmd(dqfVar, 111, this.b);
        if (cmd != null) {
            return (spf) cmd;
        }
        return null;
    }

    public spf C(dqf dqfVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (spf) ipChange.ipc$dispatch("5d9979f4", new Object[]{this, dqfVar, new Long(j)});
        }
        b();
        Object cmd = Bridge.cmd(dqfVar, 124, this.b, j);
        if (cmd != null) {
            return (spf) cmd;
        }
        return null;
    }

    public ksf D(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("2415c80b", new Object[]{this, dqfVar});
        }
        b();
        Object cmd = Bridge.cmd(dqfVar, 116, this.b);
        if (cmd != null) {
            return (ksf) cmd;
        }
        return null;
    }

    public boolean E(dqf dqfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a02413a", new Object[]{this, dqfVar, str})).booleanValue();
        }
        return F(dqfVar, new esf(str));
    }

    public boolean F(dqf dqfVar, ksf ksfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("195c42f5", new Object[]{this, dqfVar, ksfVar})).booleanValue();
        }
        b();
        if (Bridge.cmd(dqfVar, 106, this.b, new Object[]{ksfVar}) != null) {
            return true;
        }
        return false;
    }

    public boolean G(dqf dqfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85008ea4", new Object[]{this, dqfVar, str})).booleanValue();
        }
        return H(dqfVar, new esf(str));
    }

    public boolean H(dqf dqfVar, ksf ksfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f81b994b", new Object[]{this, dqfVar, ksfVar})).booleanValue();
        }
        b();
        if (Bridge.cmd(dqfVar, 104, this.b, new Object[]{ksfVar}) != null) {
            return true;
        }
        return false;
    }

    public boolean I(dqf dqfVar, int i, ksf ksfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4303e1f2", new Object[]{this, dqfVar, new Integer(i), ksfVar})).booleanValue();
        }
        b();
        if (Bridge.cmd(dqfVar, 101, this.b, i, new Object[]{ksfVar}) != null) {
            return true;
        }
        return false;
    }

    public boolean J(dqf dqfVar, String str, ksf ksfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8068fa3", new Object[]{this, dqfVar, str, ksfVar})).booleanValue();
        }
        return K(dqfVar, new esf(str), ksfVar);
    }

    public boolean K(dqf dqfVar, ksf ksfVar, ksf ksfVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91cba158", new Object[]{this, dqfVar, ksfVar, ksfVar2})).booleanValue();
        }
        b();
        if (Bridge.cmd(dqfVar, 100, this.b, new Object[]{ksfVar, ksfVar2}) != null) {
            return true;
        }
        return false;
    }

    public boolean L(dqf dqfVar, ksf ksfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30e8506f", new Object[]{this, dqfVar, ksfVar})).booleanValue();
        }
        b();
        if (Bridge.cmd(dqfVar, 117, this.b, new Object[]{ksfVar}) != null) {
            return true;
        }
        return false;
    }

    @Override // tb.ksf
    public final ksf a(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("db5ac280", new Object[]{this, dqfVar});
        }
        return f(dqfVar);
    }

    @Override // tb.ksf
    public yrf c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yrf) ipChange.ipc$dispatch("58c6b458", new Object[]{this});
        }
        return this;
    }

    @Override // tb.ksf
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fea9ac9d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public nsf v(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nsf) ipChange.ipc$dispatch("2f45114b", new Object[]{this, dqfVar});
        }
        return e(dqfVar);
    }

    public boolean w(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30afc557", new Object[]{this, dqfVar})).booleanValue();
        }
        b();
        if (Bridge.cmd(dqfVar, 122, this.b) != null) {
            return true;
        }
        return false;
    }

    public ksf x(dqf dqfVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("ee2cc628", new Object[]{this, dqfVar, new Integer(i)});
        }
        b();
        Object cmd = Bridge.cmd(dqfVar, 103, this.b, i);
        if (cmd != null) {
            return (ksf) cmd;
        }
        return null;
    }

    public ksf y(dqf dqfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("150774bf", new Object[]{this, dqfVar, str});
        }
        return z(dqfVar, new esf(str));
    }

    public ksf z(dqf dqfVar, ksf ksfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("63bbac02", new Object[]{this, dqfVar, ksfVar});
        }
        b();
        Object cmd = Bridge.cmd(dqfVar, 102, this.b, new Object[]{ksfVar});
        if (cmd != null) {
            return (ksf) cmd;
        }
        return null;
    }

    public yrf(dqf dqfVar, long j) {
        super(dqfVar, j);
        u(dqfVar);
    }
}
