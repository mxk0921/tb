package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fs7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(String str, Object... objArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe17598b", new Object[]{str, objArr});
        }
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        if (objArr != null) {
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(" ");
                sb.append(f(objArr[i], objArr[i2]));
                i += 2;
            }
            if (i == objArr.length - 1) {
                sb.append(" ");
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("774883eb", new Object[]{str});
        }
        return "DLoader." + str;
    }

    public static void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
        } else if (xh4.k) {
            jhh jhhVar = xh4.b;
            if (jhhVar != null) {
                ((h5s) jhhVar).a(b(str), a(str2, objArr));
                return;
            }
            b(str);
            a(str2, objArr);
        }
    }

    public static void d(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d61a9c", new Object[]{str, str2, th, objArr});
            return;
        }
        jhh jhhVar = xh4.b;
        if (jhhVar != null) {
            ((h5s) jhhVar).c(b(str), a(str2, objArr), th);
        } else {
            Log.e(b(str), str2, th);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{str, str2, objArr});
            return;
        }
        jhh jhhVar = xh4.b;
        if (jhhVar != null) {
            ((h5s) jhhVar).b(b(str), a(str2, objArr));
        } else {
            Log.e(b(str), a(str2, objArr));
        }
    }

    public static String f(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4425a33f", new Object[]{obj, obj2});
        }
        StringBuilder sb = new StringBuilder();
        if (obj == null) {
            obj = "";
        }
        sb.append(obj);
        sb.append(":");
        if (obj2 == null) {
            obj2 = "";
        }
        sb.append(obj2);
        return sb.toString();
    }

    public static void g(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb8f2d", new Object[]{str, str2, objArr});
        } else if (xh4.k) {
            jhh jhhVar = xh4.b;
            if (jhhVar != null) {
                ((h5s) jhhVar).d(b(str), a(str2, objArr));
                return;
            }
            b(str);
            a(str2, objArr);
        }
    }

    public static void h(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a20ae5f", new Object[]{str, str2, objArr});
            return;
        }
        jhh jhhVar = xh4.b;
        if (jhhVar != null) {
            ((h5s) jhhVar).e(b(str), a(str2, objArr));
            return;
        }
        b(str);
        a(str2, objArr);
    }
}
