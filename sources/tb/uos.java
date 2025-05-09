package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class uos {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fef85c0d", new Object[]{stackTraceElementArr});
        }
        if (stackTraceElementArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23c3dd74", new Object[0])).longValue();
        }
        return SystemClock.uptimeMillis();
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82fcb5c1", new Object[]{str});
        }
        if (str.startsWith("lib") && str.endsWith(jcq.SO_EXTENSION)) {
            return str;
        }
        return "lib" + str + jcq.SO_EXTENSION;
    }

    public static String d(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ee56550", new Object[]{str});
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf <= 0 || (i = lastIndexOf + 1) > str.length()) {
            return str;
        }
        return str.substring(i);
    }

    public static void f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e5213", new Object[]{new Long(j)});
            return;
        }
        try {
            RSoLog.d("TUtils, ready to safeSleep  " + j);
            Thread.sleep(j);
        } catch (Throwable th) {
            rbn.g("safeSleep", th);
        }
    }

    public static boolean e(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e98735a", new Object[]{file})).booleanValue();
        }
        try {
            return jg9.f(file);
        } catch (Throwable th) {
            rbn.g("safeDelete", th);
            return false;
        }
    }
}
