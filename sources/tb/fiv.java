package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fiv extends xv8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(620757080);
    }

    public static void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
        } else if (xv8.g(3)) {
            xv8.a("RxPhenix", w(str2, str), objArr);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{str, str2, objArr});
        } else if (xv8.g(6)) {
            xv8.c("RxPhenix", w(str2, str), objArr);
        }
    }

    public static void f(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb8f2d", new Object[]{str, str2, objArr});
        } else if (xv8.g(4)) {
            xv8.f("RxPhenix", w(str2, str), objArr);
        }
    }

    public static /* synthetic */ Object ipc$super(fiv fivVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/common/UnitedLog");
    }

    public static void k(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a20ae5f", new Object[]{str, str2, objArr});
        } else if (xv8.g(5)) {
            xv8.k("RxPhenix", w(str2, str), objArr);
        }
    }

    public static void l(StringBuilder sb, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc8c6b99", new Object[]{sb, str, new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (!z || !str.startsWith(itw.URL_SEPARATOR)) {
                sb.append(str.replace(f7l.MOD, "%%"));
                return;
            }
            sb.append("http:");
            sb.append(str.replace(f7l.MOD, "%%"));
            sb.append("?complete=prefix");
        }
    }

    public static void m(String str, a aVar, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a7b0263", new Object[]{str, aVar, str2, objArr});
        } else if (xv8.g(3)) {
            xv8.a("RxPhenix", v(str2, aVar, str, true), objArr);
        }
    }

    public static void n(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("458e02e0", new Object[]{str, str2, str3, objArr});
        } else if (xv8.g(3)) {
            xv8.a("RxPhenix", x(str, str3, str2, true), objArr);
        }
    }

    public static void o(String str, a aVar, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e307c2c2", new Object[]{str, aVar, str2, objArr});
        } else if (xv8.g(6)) {
            xv8.c("RxPhenix", v(str2, aVar, str, false), objArr);
        }
    }

    public static void p(String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3081bcf", new Object[]{str, str2, aVar});
        } else {
            q(str, str2, aVar, false);
        }
    }

    public static void q(String str, String str2, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfc10e5", new Object[]{str, str2, aVar, new Boolean(z)});
        } else if (xv8.g(6)) {
            StringBuilder sb = new StringBuilder("[falcoId:");
            sb.append(aVar.Y().s);
            sb.append("] | [requestId:");
            sb.append(aVar.d());
            sb.append("] |");
            sb.append(str2);
            if (z) {
                sb.append("| ");
                sb.append(aVar.O());
            }
            xv8.b(6, str, sb.toString());
        }
    }

    public static void r(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cb6e521", new Object[]{str, str2, str3, objArr});
        } else if (xv8.g(6)) {
            xv8.c("RxPhenix", x(str, str3, str2, false), objArr);
        }
    }

    public static void s(String str, a aVar, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c53ac43e", new Object[]{str, aVar, str2, objArr});
        } else if (xv8.g(4)) {
            xv8.f("RxPhenix", v(str2, aVar, str, true), objArr);
        }
    }

    public static int t(String str, int i, String str2, String str3, String str4, boolean z) {
        int i2 = 5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35f1acf2", new Object[]{str, new Integer(i), str2, str3, str4, new Boolean(z)})).intValue();
        }
        if (str != null) {
            i2 = 5 + str.length();
        }
        if (str4 != null) {
            i2 += str4.length() + 2;
        }
        if (i > 0) {
            i2 += 11;
        }
        if (str2 != null) {
            i2 += str2.length() + 8;
        }
        if (str3 == null) {
            return i2;
        }
        int length = i2 + str3.length() + 7;
        if (z) {
            return length + 21;
        }
        return length;
    }

    public static String u(String str, int i, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3342a448", new Object[]{str, new Integer(i), str2, str3, str4, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder(t(str, i, str2, str3, str4, z));
        sb.append('[');
        sb.append(str4);
        sb.append(']');
        if (i > 0) {
            sb.append(" ID=");
            sb.append(i);
        }
        if (str2 != null) {
            sb.append(" MODULE=");
            sb.append(str2);
        }
        if (i > 0 || str2 != null) {
            sb.append(", ");
        } else {
            sb.append(' ');
        }
        sb.append(str);
        if (str3 != null) {
            sb.append(", PATH=");
            l(sb, str3, z);
        }
        return sb.substring(0);
    }

    public static String v(String str, a aVar, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a5edaea", new Object[]{str, aVar, str2, new Boolean(z)});
        }
        if (aVar != null) {
            return u(str, aVar.d(), aVar.N(), aVar.O(), str2, z);
        }
        return u(str, -1, null, null, str2, false);
    }

    public static String w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45ee05f1", new Object[]{str, str2});
        }
        return u(str, -1, null, null, str2, false);
    }

    public static String x(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("971df2a5", new Object[]{str, str2, str3, new Boolean(z)});
        }
        return u(str2, -1, null, str3, str, z);
    }

    public static void y(String str, a aVar, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dced4970", new Object[]{str, aVar, str2, objArr});
        } else if (xv8.g(5)) {
            xv8.k("RxPhenix", v(str2, aVar, str, false), objArr);
        }
    }
}
