package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class rbn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RemoteSo";

    /* renamed from: a  reason: collision with root package name */
    public static volatile ngd f27263a = new j27("RemoteSo");

    public static ngd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ngd) ipChange.ipc$dispatch("708b4cd9", new Object[0]);
        }
        return f27263a;
    }

    public static void c(ngd ngdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54753765", new Object[]{ngdVar});
        } else {
            f27263a = ngdVar;
        }
    }

    public static void d(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb808d0", new Object[]{str, map});
        } else {
            f27263a.b(str, map);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b9d4898", new Object[]{str, str2});
            return;
        }
        ngd ngdVar = f27263a;
        HashMap hashMap = new HashMap();
        hashMap.put("RSoErrorCode", str);
        if (trq.c(str2)) {
            str2 = "";
        }
        hashMap.put("RSoErrorMsg", str2);
        ngdVar.b(ngd.POINT_SDK_INTERNAL_ERROR, hashMap);
    }

    public static void f(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8de7a5d", new Object[]{str, str2, th});
            return;
        }
        ngd ngdVar = f27263a;
        HashMap hashMap = new HashMap();
        hashMap.put("RSoErrorCode", str);
        hashMap.put("RSoErrorMsg", str2 + " : " + b(th));
        ngdVar.b(ngd.POINT_SDK_INTERNAL_ERROR, hashMap);
    }

    public static void g(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa0ba67", new Object[]{str, th});
        } else {
            f(str, "", th);
        }
    }

    public static void h(String str, Map<String, Object> map, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867f18d4", new Object[]{str, map, rSoException});
        } else {
            f27263a.e(str, map, rSoException);
        }
    }

    public static void i(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a588fe5d", new Object[]{str, runnable});
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            g(str, th);
        }
    }

    public static void j(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e42e39c", new Object[]{str, map});
        } else {
            f27263a.c(str, map);
        }
    }

    public static String b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf2d95be", new Object[]{th});
        }
        if (th == null) {
            return "null Throwable";
        }
        try {
            String th2 = th.toString();
            if (TextUtils.isEmpty(th2)) {
                return "empty detail error msg";
            }
            return th2.substring(0, Math.min(th2.length(), 400));
        } catch (Throwable th3) {
            return "parseErrorMsg, error," + th3.getClass();
        }
    }
}
