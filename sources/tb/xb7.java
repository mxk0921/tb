package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class xb7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public qc4 f31265a;
    public String b;
    public Map<String, String> c;
    public String d;
    public JSONObject e;
    public qc4 f;
    public Map<String, String> g;
    public JSONObject h;

    static {
        t2o.a(440401978);
    }

    public final qc4 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qc4) ipChange.ipc$dispatch("eea03ee4", new Object[]{this});
        }
        return this.f31265a;
    }

    public final qc4 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qc4) ipChange.ipc$dispatch("f90e6999", new Object[]{this});
        }
        return this.f;
    }

    public final JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5c589975", new Object[]{this});
        }
        return this.h;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return this.b;
    }

    public final Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a7f3a94", new Object[]{this});
        }
        return this.c;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3055120f", new Object[]{this});
        }
        return this.d;
    }

    public final JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d6054174", new Object[]{this});
        }
        return this.e;
    }

    public final void h(qc4 qc4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8fccf62", new Object[]{this, qc4Var});
        } else {
            this.f31265a = qc4Var;
        }
    }

    public final void i(qc4 qc4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6614e5b5", new Object[]{this, qc4Var});
        } else {
            this.f = qc4Var;
        }
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3ed8354", new Object[]{this, str});
        }
    }

    public final void k(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77902c62", new Object[]{this, map});
        } else {
            this.g = map;
        }
    }

    public final void l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71c06af", new Object[]{this, jSONObject});
        } else {
            this.h = jSONObject;
        }
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9174f85f", new Object[]{this, str});
        }
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final void o(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b020637a", new Object[]{this, map});
        } else {
            this.c = map;
        }
    }

    public final void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aeba447", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public final void q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442da728", new Object[]{this, jSONObject});
        } else {
            this.e = jSONObject;
        }
    }
}
