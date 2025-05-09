package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import java.util.Map;
import tb.tz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class w0a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856431);
    }

    public static void a(oz8 oz8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf70f808", new Object[]{oz8Var, str});
        } else {
            b(oz8Var, str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void b(oz8 oz8Var, String str, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46902047", new Object[]{oz8Var, str, l});
        } else if (oz8Var != null) {
            c(l, oz8Var, str);
            oz8Var.log("{\"H5Stage\":\"" + str + "\",\"time\":\"" + l + "\"}");
        }
    }

    public static void c(Long l, oz8 oz8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f415ffa4", new Object[]{l, oz8Var, str});
            return;
        }
        try {
            qz8 n = oz8Var.n(str);
            n.b(l);
            n.c(l);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static oz8 d(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oz8) ipChange.ipc$dispatch("aa671181", new Object[]{str, str2, map});
        }
        try {
            tz8 tz8Var = FalcoGlobalTracer.get();
            if (tz8Var == null) {
                return null;
            }
            tz8.a d = tz8Var.d(str, str2);
            if (map != null) {
                raq k = tz8Var.k(map);
                if (k != null) {
                    d.b(k);
                } else {
                    v7t.i("FullTraceUtils", "openTracingContextMap=" + map);
                }
            } else {
                v7t.i("FullTraceUtils", "openTracingContextMap==null ");
            }
            return d.c();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static oz8 e(String str, String str2, raq raqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oz8) ipChange.ipc$dispatch("caaac71", new Object[]{str, str2, raqVar});
        }
        try {
            tz8 tz8Var = FalcoGlobalTracer.get();
            if (tz8Var == null) {
                return null;
            }
            tz8.a d = tz8Var.d(str, str2);
            if (raqVar != null) {
                d.b(raqVar);
            } else {
                v7t.i("FullTraceUtils", "spanContext=null " + x74.i(new Exception().fillInStackTrace()));
            }
            return d.c();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static oz8 f(String str, String str2, abq abqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oz8) ipChange.ipc$dispatch("cacabb02", new Object[]{str, str2, abqVar});
        }
        if (abqVar != null) {
            return e(str, str2, abqVar.a());
        }
        v7t.i("FullTraceUtils", "falcoSpan=null " + x74.i(new Exception().fillInStackTrace()));
        return null;
    }
}
