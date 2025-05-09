package tb;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class z39 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f32509a;
    @JSONField(serialize = false)
    private List<String> actions;
    public Long b;
    public Long c;
    public int d;
    public String e;
    public String f;
    public String g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297050);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final z39 a(String str, String str2, String str3, Long l, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z39) ipChange.ipc$dispatch("7e63aa3b", new Object[]{this, str, str2, str3, l, new Integer(i)});
            }
            z39 z39Var = new z39(null);
            z39Var.l(i);
            z39Var.m(str3);
            z39Var.j(l);
            z39Var.p(str2);
            z39Var.q(str);
            return z39Var;
        }

        public a() {
        }

        @JvmStatic
        public final z39 b(String str, String str2, Long l, Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z39) ipChange.ipc$dispatch("c6d6dffa", new Object[]{this, str, str2, l, map});
            }
            z39 z39Var = new z39(null);
            if (map == null) {
                return z39Var;
            }
            try {
                z39Var.n((String) map.get("feat"));
                z39Var.o((String) map.get("result_code"));
                z39Var.k(qrl.a((String) map.get("debug"), false));
                z39Var.h(kqu.c(map.get("actions")));
                z39Var.m(com.etao.feimagesearch.mnn.utils.a.a(map));
            } catch (Exception unused) {
            }
            z39Var.q(str);
            z39Var.p(str2);
            z39Var.j(l);
            return z39Var;
        }
    }

    static {
        t2o.a(481297049);
    }

    public /* synthetic */ z39(a07 a07Var) {
        this();
    }

    public final Long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("d0265fb3", new Object[]{this});
        }
        return this.c;
    }

    public final Long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("5b0d31fe", new Object[]{this});
        }
        return this.b;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("374a7336", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ff2c1d1", new Object[]{this});
        }
        return this.g;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2107a51", new Object[]{this});
        }
        return this.e;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
        }
        return this.f32509a;
    }

    public final boolean g() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99e03d77", new Object[]{this})).booleanValue();
        }
        String str = this.e;
        if (str == null || str.length() == 0) {
            z = true;
        }
        return !z;
    }

    public final void h(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b28a33", new Object[]{this, list});
        } else {
            this.actions = list;
        }
    }

    public final void i(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("124a8f6d", new Object[]{this, l});
        } else {
            this.c = l;
        }
    }

    public final void j(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3497f82", new Object[]{this, l});
        } else {
            this.b = l;
        }
    }

    public final void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe02abc", new Object[]{this, new Boolean(z)});
        }
    }

    public final void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e84d632c", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a3342d", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("247e1045", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public final void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fcd0b3d", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public final void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ef5988", new Object[]{this, str});
        }
    }

    public final void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cebea143", new Object[]{this, str});
        } else {
            this.f32509a = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "resultCode:" + ((Object) this.f) + ", feat:" + ((Object) this.e) + ", extraInfo:" + ((Object) this.g);
    }

    public z39() {
        this.d = -1;
    }
}
