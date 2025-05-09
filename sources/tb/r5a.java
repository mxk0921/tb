package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.munion.taosdk.CpmIfsCommitter;
import com.taobao.munion.taosdk.MunionCommitterFactory;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class r5a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final transient String AD_VAL_MATCH_TYPE = "AD";

    /* renamed from: a  reason: collision with root package name */
    public static final String f27121a = "Page_Home";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a extends TypeReference<HashMap<String, String>> {
    }

    static {
        t2o.a(729808943);
    }

    public static JSONObject a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8b0a05a", new Object[]{str, jSONObject});
        }
        HashMap hashMap = new HashMap(16);
        hashMap.put("Page_Home_Show-guessitem-1001", "utLogMapEdge");
        hashMap.put(svv.ARG1_CLICK, "utLogMapEdge");
        try {
            if (hashMap.containsKey(str) && jSONObject.containsKey(hashMap.get(str))) {
                jSONObject.remove(hashMap.get(str));
            }
            return jSONObject;
        } catch (Exception e) {
            y9n.d("cleanUTArgs.", e);
            return jSONObject;
        }
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a3edf5", new Object[]{jSONObject, jSONObject2, jSONObject3});
        } else if (jSONObject == null) {
            fve.m("GatewayUTUtils", "commitClickAd card == null");
        } else if (jSONObject2 == null) {
            fve.m("GatewayUTUtils", "commitClickAd clickParamArgs == null");
        } else {
            JSONObject n = n(jSONObject2, jSONObject3, "args");
            if (n == null) {
                fve.m("GatewayUTUtils", "commitClickAd args == null");
            } else if (TextUtils.equals(n.getString("brandAd"), "1")) {
                String string = n.getString("clkArr");
                String string2 = n.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID);
                String string3 = jSONObject.getString("adNamespace");
                if (TextUtils.isEmpty(string)) {
                    fve.e("GatewayUTUtils", "commitExposureAd 广告入参不合法 clkArr ： " + string);
                    return;
                }
                fve.e("GatewayUTUtils", "commitExposureAd clkArr");
                AlimamaAdvertising.instance().buildTanxClickArrayTracking(string).c(string2).b(string3).a();
            }
        }
    }

    public static void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b521660", new Object[]{jSONObject});
        } else {
            e(null, jSONObject, null);
        }
    }

    public static void d(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc607090", new Object[]{jSONObject, jSONObject2});
        } else {
            e(jSONObject, jSONObject2, null);
        }
    }

    public static void e(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa1c60", new Object[]{jSONObject, jSONObject2, jSONObject3});
        } else if (jSONObject2 != null) {
            v(jSONObject);
            JSONObject jSONObject5 = jSONObject2.getJSONObject("clickParam");
            if (jSONObject == null) {
                jSONObject4 = null;
            } else {
                jSONObject4 = jSONObject.getJSONObject("args");
            }
            JSONObject p = p(jSONObject5, jSONObject4);
            b(jSONObject, p, jSONObject3);
            g(p, jSONObject3);
        }
    }

    public static void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b528b986", new Object[]{jSONObject});
        } else {
            g(jSONObject, null);
        }
    }

    public static void g(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e14a2a", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject != null && jSONObject.size() > 0 && jSONObject.containsKey("page") && jSONObject.containsKey("eventId")) {
            try {
                String o = o(jSONObject, jSONObject2, "page");
                String o2 = o(jSONObject, jSONObject2, "eventId");
                String o3 = o(jSONObject, jSONObject2, "arg1");
                String o4 = o(jSONObject, jSONObject2, "arg2");
                String o5 = o(jSONObject, jSONObject2, "arg3");
                JSONObject a2 = a(o3, n(jSONObject, jSONObject2, "args"));
                TBS.Ext.commitEvent(o, Integer.parseInt(o2), o3, o4, o5, q(o, a2));
                if (a2 == null) {
                    str = "";
                } else {
                    str = a2.getString("ifs");
                }
                JSONObject jSONObject3 = jSONObject.getJSONObject("args");
                if ((jSONObject3 == null || !TextUtils.equals(jSONObject3.getString("brandAd"), "1")) && !TextUtils.isEmpty(str)) {
                    MunionCommitterFactory.createIfsCommitter(m0b.c(), CpmIfsCommitter.class).commitEvent(str);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void h(String str, int i, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2c2e77", new Object[]{str, new Integer(i), str2, jSONObject});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, str2, null, null, q(str, jSONObject));
            if (i == 2101) {
                cqv.u(str, str2 + "_BehaviX_UT", null, null, hqv.s(jSONObject));
            }
        } catch (Exception unused) {
        }
    }

    public static void i(String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb757923", new Object[]{str, new Integer(i), str2, str3});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, str2, null, null, str3);
            if (i == 2101) {
                cqv.u(str, str2 + "_BehaviX_UT", null, null, str3);
            }
        } catch (Exception unused) {
        }
    }

    public static void j(String str, int i, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d201f463", new Object[]{str, new Integer(i), str2, str3, str4, jSONObject});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, str2, str3, str4, q(str, jSONObject));
        } catch (Exception unused) {
        }
    }

    public static void k(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a98c28", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject2 != null && TextUtils.equals(jSONObject2.getString("brandAd"), "1")) {
            try {
                String string = jSONObject2.getString("ifs");
                String string2 = jSONObject2.getString("ifsArr");
                if (!TextUtils.isEmpty(string)) {
                    fve.e("GatewayUTUtils", "commitExposureAd ifs");
                    AlimamaAdvertising.instance().buildIfsExposure(m0b.c(), string).withArgPid(jSONObject2.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID)).withArgNamespace(jSONObject.getString("adNamespace")).commit();
                } else if (!TextUtils.isEmpty(string2)) {
                    fve.e("GatewayUTUtils", "commitExposureAd ifsArr");
                    AlimamaAdvertising.instance().commitIfsArrayExposure(string2, jSONObject2.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID), jSONObject.getString("adNamespace"), null);
                } else {
                    fve.e("GatewayUTUtils", "commitExposureAd error");
                }
            } catch (Exception e) {
                y9n.d("Brand Ad's ifs track met problem.", e);
            }
        }
    }

    public static void l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3520d2ed", new Object[]{jSONObject});
        } else {
            m(jSONObject, null);
        }
    }

    public static void m(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d839a3", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject != null && (p = p(jSONObject.getJSONObject(i2b.TRACK_EXPOSURE_PARAM), jSONObject.getJSONObject("args"))) != null) {
            JSONObject jSONObject3 = p.getJSONObject("args");
            k(jSONObject, jSONObject3);
            try {
                cd0.d(jSONObject, jSONObject3);
            } catch (Throwable th) {
                TLog.loge("AdMonitorHelper", "checkBrandAdCard error.", th);
            }
            if ((jSONObject2 != null && jSONObject2.getBooleanValue("skipCheck")) || !jSONObject.getBooleanValue("isTracked")) {
                jSONObject.put("isTracked", (Object) Boolean.TRUE);
                if (jSONObject3 != null) {
                    String string = p.getString("page");
                    if (!TextUtils.isEmpty(jSONObject3.getString("feedbackURL"))) {
                        v71.b(string);
                    }
                    if (TextUtils.equals(jSONObject3.getString("match_type"), "AD")) {
                        v71.a(string);
                    }
                }
                g(p, jSONObject2);
            }
        }
    }

    public static JSONObject n(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("152d470d", new Object[]{jSONObject, jSONObject2, str});
        }
        if (jSONObject2 == null) {
            return jSONObject.getJSONObject(str);
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
        if (jSONObject3 == null || jSONObject3.isEmpty()) {
            return jSONObject.getJSONObject(str);
        }
        return jSONObject3;
    }

    public static String o(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a57bad2", new Object[]{jSONObject, jSONObject2, str});
        }
        if (jSONObject2 == null) {
            return jSONObject.getString(str);
        }
        String string = jSONObject2.getString(str);
        if (TextUtils.isEmpty(string)) {
            return jSONObject.getString(str);
        }
        return string;
    }

    public static JSONObject p(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ba9c6d45", new Object[]{jSONObject, jSONObject2});
        }
        if (!(jSONObject2 == null || jSONObject2.isEmpty() || jSONObject == null)) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("args");
                if (jSONObject3 == null) {
                    jSONObject.put("args", (Object) jSONObject2);
                } else {
                    boolean equals = "1".equals(jSONObject2.getString("argsType"));
                    for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                        if (!equals) {
                            jSONObject3.put(entry.getKey(), entry.getValue());
                        } else if (!jSONObject3.containsKey(entry.getKey())) {
                            jSONObject3.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
            } catch (Throwable th) {
                y9n.d("AutoExposureUtils", th);
            }
        }
        return jSONObject;
    }

    public static void r(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6203bbc0", new Object[]{map});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(map);
        } catch (Exception unused) {
        }
    }

    public static void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ce5d14", new Object[]{str});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(str);
        } catch (Exception unused) {
        }
    }

    public static void t(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{obj, map});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, map);
        } catch (Exception unused) {
        }
    }

    public static void u(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c541ce3", new Object[]{obj, str});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(obj, str);
        } catch (Exception unused) {
        }
    }

    public static String q(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eeb5dac2", new Object[]{str, jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(600);
        for (String str2 : jSONObject.keySet()) {
            String string = jSONObject.getString(str2);
            if (!TextUtils.isEmpty(string)) {
                if (string.length() > 2048) {
                    TBS.Ext.commitEvent(str, 19999, "super_long_args", str2);
                }
                sb.append(str2);
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

    public static void v(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56fbb1b", new Object[]{jSONObject});
        } else if (jSONObject != null && jSONObject.getJSONObject("args") != null) {
            String string = jSONObject.getJSONObject("args").getString("utLogMap");
            if (!TextUtils.isEmpty(string)) {
                try {
                    HashMap hashMap = (HashMap) JSON.parseObject(URLDecoder.decode(string, "UTF-8"), new a(), new Feature[0]);
                    ki9.a(hashMap, jSONObject.getJSONObject("ext"));
                    HashMap hashMap2 = new HashMap(hashMap);
                    String string2 = jSONObject.getJSONObject("args").getString("realExposeIndex");
                    if (!TextUtils.isEmpty(string2)) {
                        hashMap2.put("realExposeIndex", string2);
                        hashMap.put("realExposeIndex", string2);
                    }
                    r(hashMap2);
                    s(JSON.toJSONString(hashMap));
                } catch (Throwable th) {
                    y9n.d("RecommendUTUtils", th);
                }
            }
        }
    }
}
