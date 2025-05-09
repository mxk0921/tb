package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rv5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FAILURE = 1;
    public static final int FINISH = 0;
    public static final int INTERRUPT = 2;

    /* renamed from: a  reason: collision with root package name */
    public int f27627a = 0;
    public JSONObject b = null;
    public a c = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f27628a;
        public final String b;

        static {
            t2o.a(444596685);
        }

        public a(int i, String str) {
            this.f27628a = i;
            this.b = str;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "DXAtomicEventError{errorCode=" + this.f27628a + ", errorMsg='" + this.b + "'}";
        }
    }

    static {
        t2o.a(444596684);
    }

    public static rv5 a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv5) ipChange.ipc$dispatch("692c06c1", new Object[]{new Integer(i), str});
        }
        rv5 rv5Var = new rv5();
        rv5Var.f27627a = 1;
        rv5Var.c = new a(i, str);
        return rv5Var;
    }

    public static rv5 b(kv5 kv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv5) ipChange.ipc$dispatch("6c70847d", new Object[]{kv5Var});
        }
        rv5 rv5Var = new rv5();
        rv5Var.f27627a = 1;
        rv5Var.c = new a(kv5Var.f22945a, kv5Var.b);
        return rv5Var;
    }

    public static rv5 c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv5) ipChange.ipc$dispatch("a35c6981", new Object[]{jSONObject});
        }
        rv5 rv5Var = new rv5();
        rv5Var.f27627a = 0;
        rv5Var.b = jSONObject;
        return rv5Var;
    }

    public static rv5 d(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv5) ipChange.ipc$dispatch("7b405e06", new Object[]{new Integer(i), str});
        }
        rv5 rv5Var = new rv5();
        rv5Var.f27627a = 2;
        rv5Var.c = new a(i, str);
        return rv5Var;
    }

    public static rv5 e(c8 c8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv5) ipChange.ipc$dispatch("11d35b11", new Object[]{c8Var});
        }
        if (c8Var == null) {
            return b(kv5.EVENT_CHAIN_ERROR_ABILITY_EXEC_RESULT_IS_NULL);
        }
        if (c8Var.b() && (c8Var instanceof b8)) {
            b8 b8Var = (b8) c8Var;
            if (c8Var.c()) {
                return d(b8Var.a().a(), b8Var.a().b());
            }
            return a(b8Var.a().a(), b8Var.a().b());
        } else if (c8Var instanceof f8) {
            return c(((f8) c8Var).a());
        } else {
            if (!(c8Var instanceof aii)) {
                return null;
            }
            if (c8Var.a() != null) {
                aii aiiVar = (aii) c8Var;
                if (aiiVar.a().getData() != null) {
                    return c(new JSONObject(aiiVar.a().getData()));
                }
            }
            return c(new JSONObject());
        }
    }

    public a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b9ee681a", new Object[]{this});
        }
        return this.c;
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("48213684", new Object[]{this});
        }
        return this.b;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.f27627a;
    }
}
