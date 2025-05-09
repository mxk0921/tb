package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h36 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DinamicX";
    public static final String TAG_BASELINE = "DinamicX_Baseline";
    public static final String TAG_SCRIPT_EXPR = "DinamicX_ScriptExpr";

    static {
        t2o.a(444596869);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else if (DinamicXEngine.j0()) {
            k(str);
        }
    }

    public static void b(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e678f70a", new Object[]{str, strArr});
        } else if (DinamicXEngine.j0()) {
            k(strArr);
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else if (DinamicXEngine.j0()) {
            Log.e(TAG, k(str));
        }
    }

    public static void d(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
        } else if (DinamicXEngine.j0()) {
            Log.e(str, str2, th);
        }
    }

    public static void e(String str, Throwable th, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee75e40", new Object[]{str, th, strArr});
        } else if (DinamicXEngine.j0()) {
            Log.e(str, k(strArr), th);
        }
    }

    public static void f(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05cf23b", new Object[]{str, objArr});
        } else if (DinamicXEngine.j0()) {
            String j = j(objArr);
            if (TextUtils.isEmpty(str)) {
                Log.e(TAG, j);
            } else {
                Log.e(str, j);
            }
        }
    }

    public static void g(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edde2c29", new Object[]{str, strArr});
        } else if (DinamicXEngine.j0()) {
            String k = k(strArr);
            if (TextUtils.isEmpty(str)) {
                Log.e(TAG, k);
            } else {
                Log.e(str, k);
            }
        }
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45144a19", new Object[]{str});
        } else if (DinamicXEngine.j0()) {
            Log.e(TAG_SCRIPT_EXPR, k(str));
        }
    }

    public static void i(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7300a5", new Object[]{str, strArr});
        } else if (DinamicXEngine.j0()) {
            k(strArr);
        }
    }

    public static String j(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("132f869f", new Object[]{objArr});
        }
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        if (objArr.length == 1) {
            return JSON.toJSONString(objArr[0]);
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(JSON.toJSONString(obj));
            sb.append(" ");
        }
        return sb.toString();
    }

    public static String k(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3193a943", new Object[]{strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void l(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2d4fd4f", new Object[]{strArr});
        } else if (DinamicXEngine.j0()) {
            k(strArr);
        }
    }

    public static void m(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f244b620", new Object[]{strArr});
        } else if (eb5.s()) {
            Log.e("DinamicXConsume", k(strArr));
        }
    }

    public static void n(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38a0be2d", new Object[]{strArr});
        } else if (eb5.u()) {
            Log.e("DXEventChain", k(strArr));
        }
    }

    public static void o(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97afbd9", new Object[]{strArr});
        } else if (eb5.u()) {
            Log.e("DXNanoEventChain", k(strArr));
        }
    }

    public static void p(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6297a5", new Object[]{strArr});
        } else if (DinamicXEngine.j0()) {
            k(strArr);
        }
    }

    public static void q(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98c7b6dc", new Object[]{strArr});
        } else if (DinamicXEngine.j0()) {
            k(strArr);
        }
    }

    public static void r(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6292d784", new Object[]{strArr});
        } else if (DinamicXEngine.j0()) {
            Log.e("DXAnimationProcess", k(strArr));
        }
    }

    public static void s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4c71f3e", new Object[]{str, str2});
        } else if (DinamicXEngine.j0() && !TextUtils.isEmpty(str)) {
            new StringBuilder("DinamicX_perform_").append(str);
        }
    }

    public static void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc0dfd7e", new Object[]{str});
        } else if (DinamicXEngine.j0()) {
            b(TAG, str);
        }
    }

    public static void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("775f23c9", new Object[]{str});
        } else if (DinamicXEngine.j0()) {
            g(TAG, str);
        }
    }

    public static void v(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c876db", new Object[]{strArr});
        } else if (eb5.C()) {
            Log.e("DinamicXRelease", k(strArr));
        }
    }

    public static void w(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fbe857", new Object[]{str, strArr});
        } else if (DinamicXEngine.j0()) {
            k(strArr);
        }
    }
}
