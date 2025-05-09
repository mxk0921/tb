package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class h5h implements g5h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093330);
        t2o.a(806355674);
    }

    @Override // tb.g5h
    public void a(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74fbba85", new Object[]{this, str, hashMap});
        } else {
            ebu.p(str, hashMap);
        }
    }

    @Override // tb.g5h
    public qt9 b(ux9 ux9Var, qt9 qt9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qt9) ipChange.ipc$dispatch("5958bded", new Object[]{this, ux9Var, qt9Var});
        }
        return rbu.m(ux9Var, qt9Var);
    }

    @Override // tb.g5h
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d835ead6", new Object[]{this});
        }
        return up6.r(vx9.d());
    }

    @Override // tb.g5h
    public void d(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ebb9d3c", new Object[]{this, str, strArr});
        } else {
            ebu.k(str, strArr);
        }
    }

    @Override // tb.g5h
    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5c47784e", new Object[]{this});
        }
        return up6.E(vx9.d());
    }

    @Override // tb.g5h
    public void f(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3320ca22", new Object[]{this, str, map});
        } else {
            ebu.j(str, map);
        }
    }

    @Override // tb.g5h
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd7f76fc", new Object[]{this});
        }
        return up6.L(vx9.d());
    }

    @Override // tb.g5h
    public void h(ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a81c2e1b", new Object[]{this, ux9Var, str});
        }
    }

    @Override // tb.g5h
    public String i(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4a6b05a", new Object[]{this, ux9Var});
        }
        return up6.X(ux9Var);
    }

    @Override // tb.g5h
    public Map<String, String> j(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4b02fe76", new Object[]{this, ux9Var});
        }
        return up6.E(ux9Var);
    }

    @Override // tb.g5h
    public int k(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79f6e7ab", new Object[]{this, ux9Var})).intValue();
        }
        return up6.f0(ux9Var);
    }

    @Override // tb.g5h
    public void l(ux9 ux9Var, Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12ebcf7e", new Object[]{this, ux9Var, context, str, map});
        } else {
            rbu.S(ux9Var, context, str, map);
        }
    }

    @Override // tb.g5h
    public void m(ux9 ux9Var, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c462fa", new Object[]{this, ux9Var, str, map});
        } else {
            rbu.K(ux9Var, str, map);
        }
    }

    @Override // tb.g5h
    public void n(ux9 ux9Var, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b70a14", new Object[]{this, ux9Var, str, strArr});
        } else {
            rbu.L(ux9Var, str, strArr);
        }
    }

    @Override // tb.g5h
    public void o(ux9 ux9Var, int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bebe20b0", new Object[]{this, ux9Var, new Integer(i), str, map});
        } else {
            rbu.Q(i, str, map);
        }
    }

    @Override // tb.g5h
    public void p(ux9 ux9Var, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f1845d", new Object[]{this, ux9Var, str, hashMap});
        } else {
            rbu.b0(ux9Var, str, null, hashMap);
        }
    }

    @Override // tb.g5h
    public void q(ux9 ux9Var, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97be44ef", new Object[]{this, ux9Var, obj, map});
        } else {
            rbu.o0(ux9Var, obj, map);
        }
    }

    @Override // tb.g5h
    public qt9 r(qt9 qt9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qt9) ipChange.ipc$dispatch("731eef15", new Object[]{this, qt9Var});
        }
        return ebu.d(qt9Var);
    }

    @Override // tb.g5h
    public void s(ux9 ux9Var, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fee545a", new Object[]{this, ux9Var, str, strArr});
        } else {
            rbu.i(ux9Var, str, strArr);
        }
    }
}
