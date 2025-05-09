package tb;

import android.app.Application;
import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class u8x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f29234a = e();

    static {
        t2o.a(982516274);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f003de7a", new Object[]{str});
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f4dd2c", new Object[]{str});
        }
    }

    public static void c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac70bd8", new Object[]{str, new Long(j)});
        }
    }

    public static boolean d(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f62ae8dd", new Object[]{application, str})).booleanValue();
        }
        return false;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21ceaeef", new Object[0])).booleanValue();
        }
        try {
            return new File("/data/local/tmp/.trace_weex2").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2671821c", new Object[]{str});
        } else if (f29234a) {
            l(str);
        }
    }

    public static void g(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3216d930", new Object[]{str, str2, str3});
        } else if (f29234a) {
            l(str + ":" + str2 + ":" + str3);
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb77084", new Object[0]);
        } else if (f29234a) {
            Trace.endSection();
        }
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a27580e2", new Object[]{str});
        } else {
            l(str);
        }
    }

    public static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdde0e4a", new Object[0]);
        } else {
            Trace.endSection();
        }
    }

    public static long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f633f58", new Object[0])).longValue();
        }
        return 0L;
    }

    public static void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347681a2", new Object[]{str});
            return;
        }
        try {
            Trace.beginSection(str);
        } catch (Throwable th) {
            dwh.i(th);
        }
    }
}
