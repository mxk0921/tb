package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(297795613);
    }

    public static void a(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5559d040", new Object[]{str, str2, strArr});
        } else {
            b(str, str2, "", "", strArr);
        }
    }

    public static void b(String str, String str2, String str3, String str4, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b17d9", new Object[]{str, str2, str3, str4, strArr});
        } else if (gcl.c() != null) {
            gcl.c().b(str, str2, str3, str4, 0, strArr);
        }
    }

    public static void c(String str, String str2, String str3, String str4, int i, String str5, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b9369c", new Object[]{str, str2, str3, str4, new Integer(i), str5, th});
        } else if (gcl.c() != null) {
            gcl.c().a(str, str2, str3, str4, i, th, str5);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
        } else {
            c(str, str2, "0", "", 0, "", th);
        }
    }
}
