package tb;

import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xv8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static cw9 f31625a;

    public static void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
            return;
        }
        d();
        if (f31625a.b(3)) {
            f31625a.d(str, e(str2, objArr), objArr);
        }
    }

    public static void b(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea92bab", new Object[]{new Integer(i), str, str2});
            return;
        }
        d();
        if (f31625a.b(6)) {
            f31625a.c(6, str, str2);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{str, str2, objArr});
            return;
        }
        d();
        if (f31625a.b(6)) {
            f31625a.e(str, str2, objArr);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a588da36", new Object[0]);
        } else if (f31625a == null) {
            f31625a = new f17();
        }
    }

    public static String e(String str, Object... objArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35d32f54", new Object[]{str, objArr});
        }
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        int i2 = 0;
        while (true) {
            int indexOf = str.indexOf(37, i);
            if (indexOf < 0 || indexOf >= length - 1) {
                break;
            }
            i = indexOf + 1;
            char charAt = str.charAt(i);
            if (Character.isLetter(charAt)) {
                if (charAt == 'K' && i2 < objArr.length) {
                    objArr[i2] = j(((Integer) objArr[i2]).intValue());
                    bytes[i] = 115;
                }
                i2++;
            }
        }
        return new String(bytes);
    }

    public static void f(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb8f2d", new Object[]{str, str2, objArr});
            return;
        }
        d();
        if (f31625a.b(4)) {
            f31625a.i(str, str2, objArr);
        }
    }

    public static boolean g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a546af9", new Object[]{new Integer(i)})).booleanValue();
        }
        d();
        return f31625a.b(i);
    }

    public static void h(cw9 cw9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb95502", new Object[]{cw9Var});
        } else {
            f31625a = cw9Var;
        }
    }

    public static void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8075dd08", new Object[]{new Integer(i)});
            return;
        }
        d();
        f31625a.a(i);
    }

    public static String j(long j) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5886c108", new Object[]{new Long(j)});
        }
        if (j <= 0) {
            return String.valueOf(j);
        }
        float f = (float) j;
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "KB";
        } else {
            str = "B";
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "MB";
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "GB";
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = RVEnvironmentService.PLATFORM_TB;
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "PB";
        }
        if (f < 1.0f) {
            str2 = String.format(Locale.getDefault(), "%.2f", Float.valueOf(f));
        } else if (f < 10.0f) {
            str2 = String.format(Locale.getDefault(), "%.2f", Float.valueOf(f));
        } else if (f < 100.0f) {
            str2 = String.format(Locale.getDefault(), "%.2f", Float.valueOf(f));
        } else {
            str2 = String.format(Locale.getDefault(), "%.0f", Float.valueOf(f));
        }
        return str2.concat(str);
    }

    public static void k(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a20ae5f", new Object[]{str, str2, objArr});
            return;
        }
        d();
        if (f31625a.b(5)) {
            f31625a.w(str, str2, objArr);
        }
    }
}
