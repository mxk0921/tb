package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.support.basics.AppContextHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class pgh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FBV2_TAG = "fb_v2_";

    /* renamed from: a  reason: collision with root package name */
    public static a f26080a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void d(String str, String str2, Throwable th);

        void e(String str, String str2, Throwable th);

        void i(String str, String str2, Throwable th);
    }

    public static String a(String str, Throwable th) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fda15ffd", new Object[]{str, th});
        }
        String str3 = "";
        if (str == null) {
            str2 = str3;
        } else {
            str2 = " ".concat(str);
        }
        if (th != null) {
            str3 = " " + th.getMessage();
        }
        return str2 + str3;
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757c96e", new Object[]{str, str2});
        } else {
            c(str, str2, null);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("167dfb47", new Object[]{str, str2, th});
        } else if (AppContextHolder.b) {
            a aVar = f26080a;
            if (aVar != null) {
                aVar.d(FBV2_TAG + str, a(str2, th), th);
                return;
            }
            new StringBuilder(FBV2_TAG).append(str);
            a(str2, th);
        }
    }

    @Deprecated
    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e35699", new Object[]{str});
        } else {
            f(null, str, null);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c23", new Object[]{str, str2});
        } else {
            f(str, str2, null);
        }
    }

    public static void f(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c88bb2", new Object[]{str, str2, th});
            return;
        }
        a aVar = f26080a;
        if (aVar != null) {
            aVar.e(FBV2_TAG + str, a(str2, th), th);
            return;
        }
        Log.e(FBV2_TAG + str, a(str2, th), th);
    }

    @Deprecated
    public static void g(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b012e6fc", new Object[]{str, th});
        } else {
            f(null, str, th);
        }
    }

    @Deprecated
    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9dfc8bf", new Object[]{str});
        } else {
            j(null, str, null);
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161e0c9", new Object[]{str, str2});
        } else {
            j(str, str2, null);
        }
    }

    public static void j(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c019acc", new Object[]{str, str2, th});
            return;
        }
        a aVar = f26080a;
        if (aVar != null) {
            aVar.i(FBV2_TAG + str, a(str2, th), th);
            return;
        }
        new StringBuilder(FBV2_TAG).append(str);
        a(str2, th);
    }

    public static void k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad36f22", new Object[]{str, str2});
        }
    }

    public static void l(Throwable th) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9b71eb", new Object[]{th});
        } else {
            f(null, "rethrowRuntimeError", th);
            throw new RuntimeException(th);
        }
    }

    public static void m(Throwable th, String str) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce2e16f5", new Object[]{th, str});
        } else {
            f(null, str, th);
            throw new RuntimeException(str, th);
        }
    }

    public static void n(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5156003f", new Object[]{aVar});
        } else {
            f26080a = aVar;
        }
    }

    public static void o(Object obj, String str) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77541477", new Object[]{obj, str});
        } else if (obj == null) {
            f(null, str, null);
            throw new RuntimeException(str);
        }
    }

    public static void p(String str) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f23127", new Object[]{str});
        } else {
            f(null, str, null);
            throw new RuntimeException(str);
        }
    }
}
