package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class h55 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f20416a;
    public static int b;

    static {
        t2o.a(440402008);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c99e03d", new Object[]{str, str2});
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (f()) {
            d(new Throwable().getStackTrace());
            stringBuffer.append("[");
            stringBuffer.append(f20416a);
            stringBuffer.append(" L");
            stringBuffer.append(b);
            stringBuffer.append("] ");
        }
        stringBuffer.append(str);
        stringBuffer.append(": ");
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757c96e", new Object[]{str, str2});
        } else {
            ck.g().c("detail-industry", a(str, str2), "");
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c23", new Object[]{str, str2});
        } else {
            ck.g().b("detail-industry", a(str, str2), "");
        }
    }

    public static void d(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c076f5fe", new Object[]{stackTraceElementArr});
            return;
        }
        f20416a = stackTraceElementArr[2].getFileName();
        b = stackTraceElementArr[2].getLineNumber();
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[0])).booleanValue();
        }
        return cw6.b();
    }
}
