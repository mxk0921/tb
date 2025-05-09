package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lbq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7282fd58", new Object[]{str, str2, str3, str4});
        } else {
            di8.b(str, p6j.MTOP_STAGE_DATAPARSE, str2, str3, str4);
        }
    }

    public static void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b198a4", new Object[]{str, str2, str3, str4});
        } else {
            di8.b(str, "eventProcess", str2, str3, str4);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c8f42cb", new Object[]{str, str2, th});
        } else if (th != null) {
            String name = th.getClass().getName();
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace == null || stackTrace.length <= 0) {
                str3 = null;
            } else {
                str3 = stackTrace[0].toString();
            }
            if (str3 == null) {
                str3 = "";
            }
            di8.b(str, "exception", str2, name, str3);
        }
    }
}
