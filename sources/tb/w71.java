package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class w71 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_CODE_DATA_ERROR = "error_code_data_error";
    public static final String ERROR_CODE_DATA_NULL = "error_code_data_null";
    public static final String ERROR_CODE_LISTENER_ERROR = "error_code_listener_error";
    public static final String ERROR_CODE_LISTENER_IS_NULL = "error_code_listener_is_null";
    public static final String ERROR_CODE_NO_RUNNING = "error_code_no_running";
    public static final String MODULE_POINT_CDN_RECEIVE = "lm_module_point_cdn_receive";
    public static final String MODULE_POINT_DEDUPLICATION = "lm_module_point_deduplication";
    public static final String MODULE_POINT_HEART = "lm_module_point_heart";
    public static final String MODULE_POINT_PM_RECEIVE = "lm_module_point_pm_receive";
    public static final String MODULE_POINT_PROVIDER = "lm_module_point_provider";
    public static final String MONITOR_BUINESS_ARG = "time=%d;source=java";
    public static final String MONITOR_MOUDLE = "taolive";

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca02fda", new Object[]{str, str2, str3});
        } else if (v2s.o().e() != null) {
            v2s.o().e().commitFail("taolive", str, str2, str3);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("966f0c5d", new Object[]{str});
        } else if (v2s.o().e() != null) {
            v2s.o().e().commitSuccess("taolive", str);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeeb8e7", new Object[]{str, str2});
        } else if (v2s.o().e() != null) {
            v2s.o().e().commitSuccess("taolive", str, str2);
        }
    }
}
