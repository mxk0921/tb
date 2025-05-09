package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mdh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLLECTION_LOG_PREFIX = "lbs_sdk.coll_";
    public static final String FENCE_LOG_PREFIX = "lbs_sdk.fence_";
    public static final String LBS_LOG_PREFIX = "lbs_sdk.";
    public static final String LBS_PASSIVE_PREFIX = "lbs_passive.";
    public static final String LOCATION_LOG_PREFIX = "lbs_passive.loc_";
    public static final String REPORT_LOG_PREFIX = "lbs_passive.report_";

    static {
        t2o.a(789577866);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else {
            AdapterForTLog.logd(str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            AdapterForTLog.loge(str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
        } else {
            AdapterForTLog.loge(str, str2, th);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
        } else {
            AdapterForTLog.logi(str, str2);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
        } else {
            AdapterForTLog.logw(str, str2);
        }
    }
}
