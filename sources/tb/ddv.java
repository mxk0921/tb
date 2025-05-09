package tb;

import android.text.TextUtils;
import com.alibaba.android.umbrella.performance.UmbrellaPerformanceTracker;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ddv {
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
        t2o.a(729808937);
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8adb0", new Object[]{str, th});
            return;
        }
        try {
            TLog.loge("UmbrellaMonitor", "UncatchedException,", th);
            hrg.a("componentRender", "catch_exception", "1.0", "Page_Home", str, f(th), th.getClass().getSimpleName(), th.getClass().getSimpleName());
        } catch (Throwable th2) {
            TLog.loge("UmbrellaMonitor", "when catch exception, it has an other exception.", th2);
            TLog.loge("UmbrellaMonitor", "the origin exception is ", th);
        }
    }

    public static void b(String str, String str2, String str3, String str4, Map<String, String> map, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d9232b", new Object[]{str, str2, str3, str4, map, str5, str6});
        } else {
            hrg.a(str, str2, str3, "Page_Home", str4, map, str5, str6);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeeb8e7", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(m09.TASK_TYPE_LEVEL, m0b.d());
        hrg.b(str, str2, "1.0", "Page_Home", "", hashMap);
    }

    public static void d(String str, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204ddda8", new Object[]{str, new Long(j), map});
        } else if (j >= 20) {
            UmbrellaPerformanceTracker.commitPerformancePoint("Page_Home", "create_view", str + "_create", j, map);
        }
    }

    public static void e(DXTemplateItem dXTemplateItem, JSONObject jSONObject, String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6208781", new Object[]{dXTemplateItem, jSONObject, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            str4 = "";
        } else {
            str4 = jSONObject.toJSONString();
        }
        hashMap.put("data", str4);
        hashMap.put("identifier", dXTemplateItem.d());
        hashMap.put("url", dXTemplateItem.c);
        hrg.a("componentRender", "DinamicX3RenderFailed", "1.0", "Page_Home", str3, hashMap, str, str2);
    }

    public static Map<String, String> f(Throwable th) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("53826ebc", new Object[]{th});
        }
        HashMap hashMap = new HashMap(10);
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace == null || stackTrace.length <= 0) {
            str = "";
            str2 = str;
        } else {
            str = stackTrace[0].toString();
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
                sb.append("\r\n");
            }
            str2 = sb.toString();
        }
        hashMap.put("errorMsg", th.toString() + " " + str);
        hashMap.put("errorStackString", str2);
        return hashMap;
    }

    public static void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("438be0f0", new Object[]{str, str2});
        } else {
            hrg.a("componentRender", "Async_Render", "1.0", "Page_Home", str2, null, str, str);
        }
    }

    public static void h(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de4150b", new Object[]{str, str2, str3, str4, str5, str6});
        } else {
            i(str, str2, "", str3, str4, str5, str6);
        }
    }

    public static void i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
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
        hrg.a(fdv.F_DATA_PROCESS, str, str2, "Page_Home", str3, hashMap, str4, str5);
    }

    public static void j(String str, String str2, String str3, String str4, String str5) {
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
        hrg.b(fdv.F_DATA_PROCESS, str, str2, "Page_Home", str3, hashMap);
    }

    public static void k(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68015234", new Object[]{str, str2, str3, str4, str5, str6});
        } else {
            l(str, str2, str3, str4, str5, str6, null);
        }
    }

    public static void l(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e35ad1", new Object[]{str, str2, str3, str4, str5, str6, map});
            return;
        }
        if (TextUtils.isEmpty(str5) || TextUtils.isEmpty(str6)) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put(str5, str6);
        }
        if (map != null && !map.isEmpty()) {
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.putAll(map);
        }
        hrg.a(fdv.F_NETWORK_REQUEST, str, str2, "GUESS_YOU_LIKE", "Page_Home", hashMap, str3, str4);
    }

    public static void m(String str, String str2, Map<String, String> map) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4386895b", new Object[]{str, str2, map});
            return;
        }
        if (map == null || map.isEmpty()) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.putAll(map);
        }
        hrg.b(fdv.F_NETWORK_REQUEST, str, str2, "GUESS_YOU_LIKE", "Page_Home", hashMap);
    }

    public static void n(String str, String str2) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e663a0", new Object[]{str, str2});
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put(str, str2);
            hashMap.put(m09.TASK_TYPE_LEVEL, m0b.d());
        }
        hrg.b("signFree", "sign_free_abnormal_node", "1.0", "Page_Home", "", hashMap);
    }
}
