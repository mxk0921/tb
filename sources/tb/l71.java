package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class l71 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALARM_POINT = "Monitor_Trade_Service";
    public static final String MODULE = "Page_Trade_Govern";

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6604f2d5", new Object[]{str, str2, str3, str4});
        } else if (str != null) {
            if (str2 == null) {
                str2 = "null";
            }
            if (str3 == null) {
                str3 = "null";
            }
            if (str4 == null) {
                str4 = "null";
            }
            AppMonitor.Alarm.commitFail("Page_Trade_Govern", str, str2, str3, str4);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ba5f16", new Object[]{str, str2});
        } else if (str != null) {
            if (str2 == null) {
                str2 = "null";
            }
            AppMonitor.Alarm.commitSuccess("Page_Trade_Govern", str, str2);
        }
    }
}
