package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n6p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REGISTER_MODULES = "registerModules";

    static {
        t2o.a(815793819);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca02fda", new Object[]{str, str2, str3});
        } else {
            AppMonitor.Alarm.commitFail("SearchNxWeex", str, str2, str3);
        }
    }

    public static void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426ed724", new Object[]{str, str2, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail("SearchNxWeex", str, str2, str3, str4);
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("966f0c5d", new Object[]{str});
        } else {
            AppMonitor.Alarm.commitSuccess("SearchNxWeex", str);
        }
    }
}
