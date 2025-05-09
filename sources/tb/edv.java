package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class edv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHILD_BIZ = "GUESS_YOU_LIKE";
    public static final String DATA_PROCESS_GATEWAY_LOAD_CACHE = "GATEWAY_LOAD_CACHE";
    public static final String DATA_PROCESS_GATEWAY_LOAD_PRESET = "GATEWAY_LOAD_PRESET";
    public static final String MAIN_BIZ = "Page_Home";
    public static final String PERFORMANCE_TAG = "create_view";
    public static final String REQUEST_ADD_REPEAT_PARAMS = "request_add_repeat_params";
    public static final String TAG_EXCEPTION = "catch_exception";
    public static final String TAG_FIXED_TAB = "home_fixed_recommend_tab";
    public static final String TAG_FIXED_TAB_REQUEST = "home_fixed_recommend_tab_request";

    static {
        t2o.a(487587993);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30003215", new Object[]{str, str2, str3, str4, str5, str6, str7});
            return;
        }
        if (TextUtils.isEmpty(str6) || TextUtils.isEmpty(str7)) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put(str6, str7);
        }
        jrg.a(fdv.F_DATA_PROCESS, str, str2, "Page_Home", str3, hashMap, str4, str5);
    }

    public static void b(String str, String str2, String str3, String str4, String str5) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ec8791", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put(str4, str5);
        }
        jrg.b(fdv.F_DATA_PROCESS, str, str2, "Page_Home", str3, hashMap);
    }

    public static void c(String str, String str2, String str3, String str4, String str5, String str6) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68015234", new Object[]{str, str2, str3, str4, str5, str6});
            return;
        }
        if (TextUtils.isEmpty(str5) || TextUtils.isEmpty(str6)) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put(str5, str6);
        }
        jrg.a(fdv.F_NETWORK_REQUEST, str, str2, "GUESS_YOU_LIKE", "Page_Home", hashMap, str3, str4);
    }
}
