package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uqa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809109);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae029e69", new Object[]{str, str2, str3});
            return;
        }
        TLog.logd("Page_Home_Track", str, " " + str2 + " " + str3);
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb86b2a", new Object[]{str, str2, str3});
            return;
        }
        try {
            TLog.loge("Page_Home_Track", str, " " + str2 + " " + str3);
        } catch (Throwable th) {
            d71.c(th, d71.POINT_COMMIT_FAILURE, "Page_Home", null, null, null);
        }
    }

    public static String c(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3874058", new Object[]{th});
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            th.printStackTrace(new PrintStream(byteArrayOutputStream));
            String byteArrayOutputStream2 = byteArrayOutputStream.toString();
            byteArrayOutputStream.close();
            return byteArrayOutputStream2;
        } catch (Throwable th2) {
            fve.c("Page_Home_Track", "appendThrowable", th2);
            return "null";
        }
    }
}
