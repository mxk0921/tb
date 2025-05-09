package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ndv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UMB_FEATURE_CAINIAO_ERROR = "cainiaoError";
    public static final String UMB_FEATURE_CATAPULT_ERROR = "catapultError";
    public static final String UMB_FEATURE_COMPONENT_ERROR = "componentError";
    public static final String UMB_FEATURE_DOWN_GRADE = "downGrade";
    public static final String UMB_FEATURE_DX_ERROR = "dxError";
    public static final String UMB_FEATURE_EVENT_ERROR = "eventError";
    public static final String UMB_FEATURE_LOGISTIC_MAP_ERROR = "logisticMapError";
    public static final String UMB_FEATURE_ORDER_MONITOR = "orderMonitor";
    public static final String UMB_FEATURE_PAGE_ERROR = "pageError";
    public static final String UMB_FEATURE_PAY_ERROR = "payError";
    public static final String UMB_FEATURE_RECOMMEND_ERROR = "recommendError";
    public static final String UMB_FEATURE_RENDER_ERROE = "renderError";
    public static final String UMB_FEATURE_REQUEST_ERROR = "requestError";
    public static final String UMB_FEATURE_REQUEST_SUCCESS = "requestSuccess";

    static {
        t2o.a(297795589);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716ee568", new Object[]{context, str, str2, str3, str4, str5, map});
            return;
        }
        b(context, str2, str3, str4, str5, map);
        lor.d(str, str3, str4, str5, new String[0]);
    }

    public static void b(Context context, String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbf6db2", new Object[]{context, str, str2, str3, str4, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        ygb a2 = gcl.a();
        if (a2 != null) {
            a2.a(str, str2, str3, str4, map);
        }
    }

    public static void c(Context context, String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d678f0", new Object[]{context, str, str2, str3, str4, map});
        } else {
            a(context, str, UMB_FEATURE_LOGISTIC_MAP_ERROR, str2, str3, str4, map);
        }
    }
}
