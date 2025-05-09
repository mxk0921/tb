package tb;

import android.taobao.windvane.extra.log.TLogImpl;
import android.taobao.windvane.util.log.ILog;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class v7t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ILog f29843a = new TLogImpl();

    static {
        t2o.a(989856443);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else {
            f29843a.d(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("765cc49b", new Object[]{str, str2, th, objArr});
        } else {
            f29843a.d(str, g(str2, objArr), th);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
        } else {
            f29843a.d(str, g(str2, objArr));
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            f29843a.e(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d61a9c", new Object[]{str, str2, th, objArr});
        } else {
            f29843a.e(str, g(str2, objArr), th);
        }
    }

    public static void f(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{str, str2, objArr});
        } else {
            f29843a.e(str, g(str2, objArr));
        }
    }

    public static String g(String str, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c19a5cd7", new Object[]{str, objArr});
        }
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        return String.format(str, objArr);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2039022b", new Object[0])).booleanValue();
        }
        return true;
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
        } else {
            f29843a.i(str, str2);
        }
    }

    public static void j(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8bb72a0", new Object[]{str, str2, th, objArr});
        } else {
            f29843a.i(str, g(str2, objArr), th);
        }
    }

    public static void k(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb8f2d", new Object[]{str, str2, objArr});
        } else {
            f29843a.i(str, g(str2, objArr));
        }
    }

    public static void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625b1491", new Object[]{str, str2});
        } else {
            f29843a.v(str, str2);
        }
    }

    public static void m(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee4d0ad", new Object[]{str, str2, th, objArr});
        } else {
            f29843a.v(str, g(str2, objArr), th);
        }
    }

    public static void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
        } else {
            f29843a.w(str, str2);
        }
    }

    public static void o(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5e26ae", new Object[]{str, str2, th, objArr});
        } else {
            f29843a.w(str, g(str2, objArr), th);
        }
    }

    public static void p(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a20ae5f", new Object[]{str, str2, objArr});
        } else {
            f29843a.w(str, g(str2, objArr));
        }
    }
}
