package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.ut.UserTrackConstants;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class suv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_UT_EVENT = "userTrack";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, a> f28288a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f28289a;
        public final String b;

        static {
            t2o.a(745538186);
        }

        public a(String str, String str2, String str3) {
            this.f28289a = str2;
            this.b = str3;
        }
    }

    static {
        String[][] strArr;
        t2o.a(745538185);
        for (String[] strArr2 : UserTrackConstants.f11356a) {
            String str = strArr2[0];
            f28288a.put(str, new a(str, strArr2[1], strArr2[2]));
        }
    }

    public static String a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("546b9496", new Object[]{str, str2, str3, map});
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append("spm=" + str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(",scm=" + str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(",extra=" + str3);
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
        return sb.toString();
    }

    public static String b(Map<String, String> map) {
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

    public static void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70596c6e", new Object[]{str, str2, str3});
        } else {
            g("2101", str, str2, str3);
        }
    }

    public static void d(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5794e81a", new Object[]{str, str2, str3, str4, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(str3)) {
            jSONObject2.put("spm", (Object) str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            jSONObject2.put("scm", (Object) str4);
        }
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        c(str, str2, i(jSONObject2));
    }

    public static void e(String str, int i, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f422272", new Object[]{str, new Integer(i), str2, str3, str4, jSONObject});
        } else {
            TBS.Ext.commitEvent(str, i, str2, str3, str4, i(jSONObject));
        }
    }

    public static void f(String str, int i, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f1dc63a", new Object[]{str, new Integer(i), str2, str3, str4, str5});
        } else {
            TBS.Ext.commitEvent(str, i, str2, str3, str4, str5);
        }
    }

    public static void g(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8b54d2", new Object[]{str, str2, str3, str4});
        } else if (str4 == null) {
            TBS.Ext.commitEvent(str2, Integer.parseInt(str), str3, (Object) null, (Object) null);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("args", str4);
            TBS.Ext.commitEvent(str2, Integer.parseInt(str), str3, null, null, b(hashMap));
        }
    }

    public static void h(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ac4c40", new Object[]{str, str2, str3});
        } else {
            g("2201", str, str2, str3);
        }
    }

    public static String i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39015978", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(600);
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (!TextUtils.isEmpty(string)) {
                sb.append(str);
                sb.append("=");
                sb.append(string);
                sb.append(",");
            }
        }
        if (sb.length() <= 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void j(String str, Object obj, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c629bf", new Object[]{str, obj, str2, str3, map});
        } else if (str != null) {
            a aVar = (a) ((HashMap) f28288a).get(str);
            if (aVar != null) {
                TextUtils.isEmpty(str2);
                if (TextUtils.isEmpty(str3)) {
                    str3 = aVar.b;
                }
            }
            if (str3 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("spm-cnt", str3);
                if (map != null) {
                    hashMap.putAll(map);
                }
                n(obj, hashMap);
            }
            if (str3 != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("spm-url", str3);
                l(hashMap2);
            }
        }
    }

    public static void k(String str, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7467853", new Object[]{str, obj, map});
        } else {
            j(str, obj, null, null, map);
        }
    }

    public static void l(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6203bbc0", new Object[]{map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(map);
        }
    }

    public static void m(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be12fe50", new Object[]{obj, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(obj, str);
        }
    }

    public static void n(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{obj, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, map);
        }
    }

    public static void o(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcaba4d", new Object[]{str, str2, str3});
        } else {
            p(str, str2, str3, null);
        }
    }

    public static void p(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab54cad7", new Object[]{str, str2, str3, str4});
        } else {
            q(str, str2, str3, str4, null);
        }
    }

    public static void q(String str, String str2, String str3, String str4, String str5) {
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac538ce1", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        if (!TextUtils.isEmpty(str4)) {
            str6 = "spm=" + str3 + ",scm=" + str4;
        } else {
            str6 = "spm=" + str3;
        }
        if (!TextUtils.isEmpty(str5)) {
            str6 = str6 + ",extra=" + str5;
        }
        c(str, str2, str6);
        if (str3 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("spm-url", str3);
            l(hashMap);
        }
    }
}
