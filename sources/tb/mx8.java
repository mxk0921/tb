package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mx8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LIVE_ALGO_FAILURE_BIZCODE_ERROR = "bizcode不匹配";
    public static final String LIVE_ALGO_FAILURE_DETAIL = "live_algo_failure_detail";
    public static final String LIVE_ALGO_FAILURE_NO_BIZCODE = "算法未返回bizcode";
    public static final String LIVE_ALGO_FAILURE_NUMBER = "live_algo_failure_number";
    public static final String LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR = "result is null";
    public static final String LIVE_ALGO_NUMBER = "live_algo_number";
    public static final String LIVE_ALGO_STATISTICS = "live_algo_statistics";
    public static final String LIVE_ALGO_SUCCESS_NUMBER = "live_algo_success_number";
    public static final String LIVE_FAR_AWAY_DETAIL = "live_far_away_detail";
    public static final String LIVE_FAR_AWAY_NUMBER = "live_far_away_number";
    public static final String LIVE_SINGLE_FRAME_DURATION = "live_single_frame_duration";
    public static final String LIVE_TOTAL_DURATION = "live_total_duration";

    static {
        t2o.a(491782347);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f05d08", new Object[]{str, str2, str3});
        } else {
            uve.a("Page_Home", 19999, "liveFaceDetector", str, str2, str3);
        }
    }

    public static void b(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c63c635", new Object[]{str, str2, hashMap});
        } else {
            TBS.Ext.commitEvent("Page_Home", 19999, "liveFaceDetector", LIVE_ALGO_STATISTICS, str2, jx8.i(hashMap));
        }
    }
}
