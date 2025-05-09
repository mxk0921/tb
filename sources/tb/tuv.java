package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tuv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("952a3906", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder("");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry == null || entry.getKey() == null) {
                return sb.toString();
            }
            if (entry.getKey().toLowerCase().equals("args")) {
                if (entry.getValue() != null) {
                    sb.append(entry.getValue().toString());
                } else {
                    sb.append(entry.getValue());
                }
            } else if (entry.getValue() != null) {
                sb.append("[");
                sb.append(entry.getKey());
                sb.append(":");
                sb.append(entry.getValue().toString());
                sb.append("]");
            } else {
                sb.append("[");
                sb.append(entry.getKey());
                sb.append(":");
                sb.append(entry.getValue());
                sb.append("]");
            }
        }
        return sb.toString();
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70596c6e", new Object[]{str, str2, str3});
        } else {
            c("2101", str, str2, str3);
        }
    }

    public static void c(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8b54d2", new Object[]{str, str2, str3, str4});
        } else if (str4 == null) {
            TBS.Ext.commitEvent(str2, Integer.parseInt(str), str3, (Object) null, (Object) null);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("args", str4);
            TBS.Ext.commitEvent(str2, Integer.parseInt(str), str3, null, null, a(hashMap));
        }
    }

    public static void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6203bbc0", new Object[]{map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(map);
        }
    }

    public static void e(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be12fe50", new Object[]{obj, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(obj, str);
        }
    }

    public static void f(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{obj, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, map);
        }
    }

    public static void g(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("228d084", new Object[]{str, str2, str3, str4, str5, map});
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str3)) {
            sb.append("spm=" + str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(",scm=" + str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            sb.append(",extra=" + str5);
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    sb.append("," + key + "=" + value);
                }
            }
        }
        b(str, str2, sb.toString());
        if (str3 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("spm-url", str3);
            if (map != null && map.containsKey(yj4.PARAM_UT_PARAMS)) {
                hashMap.put(z9u.KEY_UTPARAM_URL, map.get(yj4.PARAM_UT_PARAMS));
            }
            d(hashMap);
        }
    }

    public static void h(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dffffa01", new Object[]{str, str2, str3});
        } else {
            c("2201", str, str2, str3);
        }
    }

    public static void i(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e006a5", new Object[]{str, str2, str3, str4, str5, map});
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str3)) {
            sb.append("spm=" + str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(",scm=" + str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            sb.append(",extra=" + str5);
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    sb.append("," + key + "=" + value);
                }
            }
        }
        h(str, str2, sb.toString());
    }
}
