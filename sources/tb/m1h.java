package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class m1h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CDN_REQUEST = "cdn_request";
    public static final String DYNAMIC_X_BIND_DATA = "dynamic_bind_data";
    public static final String DYNAMIC_X_CREATE = "dynamic_create_view";
    public static final String DYNAMIC_X_DOWNLOAD = "dynamic_x_download";
    public static final String DYNAMIC_X_FETCH = "dynamic_template_fetch";
    public static final String FEEDLIST_REQUEST = "feedList_request_total";
    public static final String MTOP_REQUEST = "mtop_request";

    static {
        t2o.a(806355494);
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426ed724", new Object[]{str, str2, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail("Live_Home_Monitor", str, str2, str3, str4);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeeb8e7", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess("Live_Home_Monitor", str, str2);
        }
    }
}
