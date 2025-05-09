package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class lor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(297795586);
    }

    public static void a(String str, String str2, String str3, String str4, int i, String str5, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b9369c", new Object[]{str, str2, str3, str4, new Integer(i), str5, th});
        } else if (gcl.c() != null) {
            gcl.c().a(str, str2, str3, str4, i, th, str5);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
        } else {
            a(str, str2, "0", "", 0, "", th);
        }
    }

    public static void c(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c619ebf", new Object[]{str, str2, strArr});
        } else {
            d(str, str2, "", "", strArr);
        }
    }

    public static void d(String str, String str2, String str3, String str4, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74a7311d", new Object[]{str, str2, str3, str4, strArr});
        } else if (gcl.c() != null) {
            gcl.c().b(str, str2, str3, str4, 0, strArr);
        }
    }
}
