package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class t0j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(689963200);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20f00926", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "tab2native=true";
        }
        return str + "，tab2native=true";
    }

    public static void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426ed724", new Object[]{str, str2, str3, str4});
        } else {
            c(str, str2, str3, str4, null);
        }
    }

    public static void c(String str, String str2, String str3, String str4, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d53bb51", new Object[]{str, str2, str3, str4, th});
            return;
        }
        if (th != null) {
            String str5 = "throwable=" + th.getMessage();
            if (TextUtils.isEmpty(str4)) {
                str4 = str5;
            } else {
                str4 = str4 + "，" + str5;
            }
        }
        AppMonitor.Alarm.commitFail("Tab2Interact", str, a(str4), str2, str3);
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeeb8e7", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess("Tab2Interact", str, a(str2));
        }
    }
}
