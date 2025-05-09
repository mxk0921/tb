package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import java.util.Map;
import tb.tz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class t66 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596925);
    }

    public static sy8 a(Map<String, String> map, String str, String str2) {
        tz8.a d;
        raq k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sy8) ipChange.ipc$dispatch("88a33d8b", new Object[]{map, str, str2});
        }
        try {
            tz8 tz8Var = FalcoGlobalTracer.get();
            if (tz8Var == null || (d = tz8Var.d(str, str2)) == null) {
                return null;
            }
            if (!(map == null || (k = tz8Var.k(map)) == null)) {
                d.b(k);
            }
            return d.i();
        } catch (Throwable th) {
            xv5.b(th);
            return null;
        }
    }

    public static sy8 b(raq raqVar, String str, String str2) {
        tz8.a d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sy8) ipChange.ipc$dispatch("25173c5b", new Object[]{raqVar, str, str2});
        }
        try {
            tz8 tz8Var = FalcoGlobalTracer.get();
            if (tz8Var == null || (d = tz8Var.d(str, str2)) == null) {
                return null;
            }
            if (raqVar != null) {
                d.b(raqVar);
            }
            return d.i();
        } catch (Throwable th) {
            xv5.b(th);
            return null;
        }
    }

    public static uy8 c(String str, String str2) {
        tz8.a d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uy8) ipChange.ipc$dispatch("c6112f58", new Object[]{str, str2});
        }
        try {
            tz8 tz8Var = FalcoGlobalTracer.get();
            if (tz8Var == null || (d = tz8Var.d(str, str2)) == null) {
                return null;
            }
            return d.d();
        } catch (Throwable th) {
            xv5.b(th);
            return null;
        }
    }

    public static vy8 d(Map<String, String> map, String str, String str2) {
        tz8.a d;
        raq k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vy8) ipChange.ipc$dispatch("6f35f62b", new Object[]{map, str, str2});
        }
        try {
            tz8 tz8Var = FalcoGlobalTracer.get();
            if (tz8Var == null || (d = tz8Var.d(str, str2)) == null) {
                return null;
            }
            if (!(map == null || (k = tz8Var.k(map)) == null)) {
                d.b(k);
            }
            return d.c();
        } catch (Throwable th) {
            xv5.b(th);
            return null;
        }
    }

    public static vy8 e(raq raqVar, String str, String str2) {
        tz8.a d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vy8) ipChange.ipc$dispatch("23d213ad", new Object[]{raqVar, str, str2});
        }
        try {
            tz8 tz8Var = FalcoGlobalTracer.get();
            if (tz8Var == null || (d = tz8Var.d(str, str2)) == null) {
                return null;
            }
            if (raqVar != null) {
                d.b(raqVar);
            }
            return d.c();
        } catch (Throwable th) {
            xv5.b(th);
            return null;
        }
    }

    public static qz8 f(oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qz8) ipChange.ipc$dispatch("47f84391", new Object[]{oz8Var});
        }
        if (oz8Var == null) {
            return null;
        }
        try {
            return oz8Var.n("DXAbility");
        } catch (Throwable th) {
            xv5.b(th);
            return null;
        }
    }

    public static qz8 g(oz8 oz8Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qz8) ipChange.ipc$dispatch("6cb7908d", new Object[]{oz8Var, jSONObject});
        }
        if (oz8Var != null) {
            try {
                if (k(jSONObject)) {
                    return oz8Var.n(vwf.g(jSONObject, v4s.PARAM_UPLOAD_STAGE, ""));
                }
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
        return null;
    }

    public static void h(qz8 qz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c33c57c", new Object[]{qz8Var});
        } else if (qz8Var != null) {
            try {
                h36.g("DXOpenTracerUtil", "finishStage： " + qz8Var.name());
                qz8Var.c(Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    public static Map<String, String> i(oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("37b7de58", new Object[]{oz8Var});
        }
        try {
            tz8 tz8Var = FalcoGlobalTracer.get();
            if (tz8Var == null || oz8Var == null) {
                return null;
            }
            return tz8Var.c(oz8Var.a());
        } catch (Throwable th) {
            xv5.b(th);
            return null;
        }
    }

    public static Map<String, String> j(oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7d446639", new Object[]{oz8Var});
        }
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var == null || oz8Var == null) {
            return null;
        }
        return tz8Var.c(oz8Var.a());
    }

    public static void l(oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a0474b", new Object[]{oz8Var});
        } else if (oz8Var != null) {
            try {
                oz8Var.finish();
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    public static void m(oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d113f9", new Object[]{oz8Var});
        } else if (oz8Var != null) {
            try {
                oz8Var.z();
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("149cac1e", new Object[0])).booleanValue();
        }
        return eb5.k();
    }

    public static void o(oz8 oz8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b24772e8", new Object[]{oz8Var, str});
        } else if (oz8Var != null && !TextUtils.isEmpty(str)) {
            try {
                oz8Var.A(str);
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    public static void p(oz8 oz8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326cae06", new Object[]{oz8Var, str});
        } else if (oz8Var != null) {
            try {
                oz8Var.X("errorMsg", str);
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    public static void q(oz8 oz8Var, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2de540e", new Object[]{oz8Var, str, new Long(j)});
        } else if (oz8Var != null) {
            try {
                oz8Var.f(str, Long.valueOf(j));
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    public static void r(oz8 oz8Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7e849c0", new Object[]{oz8Var, str, str2});
        } else if (oz8Var != null) {
            try {
                oz8Var.X(str, str2);
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    public static void s(qz8 qz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12fbc2cb", new Object[]{qz8Var});
        } else if (qz8Var != null) {
            try {
                h36.g("DXOpenTracerUtil", "startStage： " + qz8Var.name());
                qz8Var.b(Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    public static boolean k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a397b6c9", new Object[]{jSONObject})).booleanValue();
        }
        return !TextUtils.isEmpty(vwf.g(jSONObject, v4s.PARAM_UPLOAD_STAGE, ""));
    }
}
