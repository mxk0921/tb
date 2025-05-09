package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sfh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729808931);
    }

    public static String a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("533fe44", new Object[]{str, th});
        }
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("\t");
        String message = th.getMessage();
        String name = th.getClass().getName();
        sb.append(str + "\t");
        sb.append(name);
        sb.append("  ");
        sb.append(message);
        sb.append("\r\n");
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (message == null || message.length() == 0) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("\tat  ");
            sb.append(stackTraceElement);
            sb.append("\r\n");
        }
        return sb.toString();
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9891f3", new Object[0]);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bebe7bb", new Object[]{str, str2});
            return;
        }
        TLog.logd("homepage_track", str, str2);
        hrg.e("logTrack", str, str2);
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{str, str2});
            return;
        }
        TLog.loge("homepage_track", str, str2);
        hrg.c("logTrack", "logTrack", "logTrack", str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc02eb9", new Object[]{str, str2, th});
            return;
        }
        if (th == null) {
            str3 = str2 + "******* NULL == e *******";
        } else {
            str3 = a(str2, th);
        }
        TLog.loge("homepage_track", str, str3);
        hrg.c("logTrack", "logTrack", "logTrack", str, str3);
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0cbec0", new Object[]{str, str2});
            return;
        }
        TLog.logi("homepage_track", str, str2);
        hrg.e("logTrack", str, str2);
    }
}
