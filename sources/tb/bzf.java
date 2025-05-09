package tb;

import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bzf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static g17 f16732a;

    static {
        t2o.a(367001633);
    }

    public static void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
            return;
        }
        c();
        if (f16732a.e(3)) {
            f16732a.a(str, d(str2, objArr), objArr);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{str, str2, objArr});
            return;
        }
        c();
        if (f16732a.e(6)) {
            f16732a.b(str, str2, objArr);
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a588da36", new Object[0]);
        } else if (f16732a == null) {
            f16732a = new g17();
        }
    }

    public static String d(String str, Object... objArr) {
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
                    objArr[i2] = f(((Integer) objArr[i2]).intValue());
                    bytes[i] = 115;
                }
                i2++;
            }
        }
        return new String(bytes);
    }

    public static void e(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb8f2d", new Object[]{str, str2, objArr});
            return;
        }
        c();
        if (f16732a.e(4)) {
            f16732a.d(str, str2, objArr);
        }
    }

    public static String f(long j) {
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

    public static void g(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a20ae5f", new Object[]{str, str2, objArr});
            return;
        }
        c();
        if (f16732a.e(5)) {
            f16732a.f(str, str2, objArr);
        }
    }
}
