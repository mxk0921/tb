package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k71 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(455081997);
    }

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
            if (!TextUtils.isEmpty(str2)) {
                str2 = str2.concat(":appVersion=2.0");
            }
            AppMonitor.Alarm.commitFail("Dymanic_tracker", str, str2, str3, str4);
        }
    }
}
