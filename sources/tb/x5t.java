package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class x5t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f31169a;
    public static String b;
    public static int c;

    static {
        t2o.a(779093374);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72ec0887", new Object[]{str});
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        stringBuffer.append(f31169a);
        stringBuffer.append("-");
        stringBuffer.append(b);
        stringBuffer.append(":");
        stringBuffer.append(c);
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (g()) {
            e(new Throwable().getStackTrace());
            cwd A = v2s.o().A();
            if (str == null) {
                str = "TaoLive";
            }
            A.b(str, a(str2));
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else {
            d(null, str);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else if (g()) {
            e(new Throwable().getStackTrace());
            cwd A = v2s.o().A();
            if (str == null) {
                str = "TaoLive";
            }
            A.c(str, a(str2));
        }
    }

    public static void e(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53743879", new Object[]{stackTraceElementArr});
            return;
        }
        f31169a = stackTraceElementArr[1].getFileName();
        b = stackTraceElementArr[1].getMethodName();
        c = stackTraceElementArr[1].getLineNumber();
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
        } else if (g()) {
            e(new Throwable().getStackTrace());
            cwd A = v2s.o().A();
            if (str == null) {
                str = "TaoLive";
            }
            A.a(str, a(str2));
        }
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[0])).booleanValue();
        }
        return hw0.l();
    }

    public static void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491da1b4", new Object[]{str, str2});
        } else if (v2s.o().A() != null) {
            cwd A = v2s.o().A();
            if (str == null) {
                str = "TaoLive";
            }
            A.c(str, str2);
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98beaa0f", new Object[]{str, str2});
        } else if (g()) {
            e(new Throwable().getStackTrace());
            cwd A = v2s.o().A();
            if (str == null) {
                str = "TaoLive";
            }
            A.b(str, a(str2));
        } else {
            cwd A2 = v2s.o().A();
            if (str == null) {
                str = "TaoLive";
            }
            A2.b(str, str2);
        }
    }

    public static void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255ed510", new Object[]{str, str2});
        } else if (g()) {
            e(new Throwable().getStackTrace());
            cwd A = v2s.o().A();
            if (str == null) {
                str = "TaoLive";
            }
            A.c(str, a(str2));
        } else if (v2s.o().A() != null) {
            cwd A2 = v2s.o().A();
            if (str == null) {
                str = "TaoLive";
            }
            A2.c(str, str2);
        }
    }

    public static void k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57df8114", new Object[]{str, str2});
        } else if (g()) {
            e(new Throwable().getStackTrace());
            cwd A = v2s.o().A();
            if (str == null) {
                str = "TaoLive";
            }
            A.a(str, a(str2));
        } else {
            cwd A2 = v2s.o().A();
            if (str == null) {
                str = "TaoLive";
            }
            A2.a(str, str2);
        }
    }
}
