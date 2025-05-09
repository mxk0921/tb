package tb;

import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean f = false;

    /* renamed from: a  reason: collision with root package name */
    public final x7 f31886a;
    public final JSONObject b;
    public zq c;
    public final hr d;
    public AbilityHubAdapter e;

    static {
        t2o.a(336592898);
    }

    public y7() {
        this(null);
    }

    public static void h(h8 h8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08a5445", new Object[]{h8Var});
        } else if (!f) {
            f = true;
            if (h8Var != null) {
                x7.b(h8Var);
            }
        }
    }

    public c8 a(JSONObject jSONObject, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("e52fa62e", new Object[]{this, jSONObject, k8Var, u8Var});
        }
        if (jSONObject != null) {
            return b(new n8(jSONObject), k8Var, u8Var);
        }
        b8 b8Var = new b8(new a8(10002, "NULL"), true);
        z71.d(k8Var, null, b8Var);
        return b8Var;
    }

    public c8 b(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("76506516", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (k8Var == null) {
            k8Var = new k8();
        }
        k8Var.g(this);
        String b = n8Var.b();
        if (b != null) {
            try {
                m8<k8> a2 = this.f31886a.a(b);
                if (a2 != null) {
                    return a2.c(n8Var, k8Var, u8Var);
                }
            } catch (Throwable th) {
                b8 b8Var = new b8(new a8(10000, "type " + b + ", exp=" + pr.d(th)));
                z71.d(k8Var, n8Var, b8Var);
                return b8Var;
            }
        }
        b8 b8Var2 = new b8(new a8(10002, "TypeNotFound：" + b));
        z71.d(k8Var, n8Var, b8Var2);
        return b8Var2;
    }

    public m8<k8> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m8) ipChange.ipc$dispatch("c3b9ef17", new Object[]{this, str});
        }
        return this.f31886a.a(str);
    }

    public hr d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hr) ipChange.ipc$dispatch("2bf0ca3b", new Object[]{this});
        }
        return this.d;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("804c2c4a", new Object[]{this});
        }
        return this.b;
    }

    public AbilityHubAdapter f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityHubAdapter) ipChange.ipc$dispatch("9150cbfb", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new AbilityHubAdapter(g());
        }
        return this.e;
    }

    public zq g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zq) ipChange.ipc$dispatch("3c9115ae", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new zq("AbilityKit", "AbilityKit");
        }
        this.c.h(this);
        return this.c;
    }

    public boolean i(String str, w8 w8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("492d64ef", new Object[]{this, str, w8Var})).booleanValue();
        }
        return this.f31886a.c(str, w8Var);
    }

    public boolean j(String str, Class<? extends hdb> cls, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea5c2ddc", new Object[]{this, str, cls, str2})).booleanValue();
        }
        return this.f31886a.c(str, new vhi(new qq(cls), str2));
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.b.clear();
        }
    }

    public void l(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aecb0568", new Object[]{this, str, jSONObject});
        } else {
            this.d.b(str, jSONObject);
        }
    }

    public void m(zq zqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aaf2fe", new Object[]{this, zqVar});
            return;
        }
        zq zqVar2 = this.c;
        if (zqVar2 == null) {
            this.c = zqVar;
        } else if ("AbilityKit".equalsIgnoreCase(zqVar2.getBusinessID()) && "AbilityKit".equalsIgnoreCase(this.c.getNamespace())) {
            this.c = zqVar;
            this.f31886a.d(zqVar.getNamespace());
        }
    }

    public y7(zq zqVar, z7 z7Var) {
        this(z7Var);
        this.c = zqVar;
    }

    public y7(z7 z7Var) {
        this.e = null;
        c2f.a();
        this.f31886a = new x7(g().getNamespace());
        this.b = new JSONObject();
        new HashMap();
        this.d = new hr();
    }
}
