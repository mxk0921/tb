package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k4v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends TypeReference<HashMap<String, String>> {
    }

    static {
        t2o.a(473956400);
    }

    public static void b(JSONObject jSONObject) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b528b986", new Object[]{jSONObject});
        } else if (jSONObject != null && (a2 = wk1.a(jSONObject)) != null && a2.containsKey("page") && a2.containsKey("eventId")) {
            String string = a2.getString("page");
            String string2 = a2.getString("eventId");
            String string3 = a2.getString("arg1");
            String string4 = a2.getString("arg2");
            String string5 = a2.getString("arg3");
            JSONObject jSONObject2 = a2.getJSONObject("args");
            TBS.Ext.commitEvent(string, Integer.parseInt(string2), string3, string4, string5, e(jSONObject2));
            try {
                if (TextUtils.equals("2101", string2)) {
                    cqv.u(string, string3 + "_BehaviX_UT", null, null, hqv.s(jSONObject2));
                }
            } catch (Exception e) {
                bqa.b("homepage_track", "commitEvent error", e);
            }
        }
    }

    public static String e(JSONObject jSONObject) {
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

    public static void d(Uri uri, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be2bd030", new Object[]{uri, jSONObject});
        } else if (uri != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("passOnTrack");
            if (jSONObject2 != null && jSONObject2.size() > 0) {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties((Map) JSON.parseObject(jSONObject2.toJSONString(), new a(), new Feature[0]));
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("nextPageUtparam");
            if (jSONObject3 != null && jSONObject3.size() > 0) {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(jSONObject3));
            }
            b(jSONObject);
        }
    }

    public static boolean c(JSONObject jSONObject, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f597506", new Object[]{jSONObject, context})).booleanValue();
        }
        if (jSONObject == null || jSONObject.getBooleanValue("isTracked")) {
            return false;
        }
        jSONObject.put("isTracked", (Object) Boolean.TRUE);
        JSONObject jSONObject2 = jSONObject.getJSONObject(i2b.TRACK_EXPOSURE_PARAM);
        if (jSONObject2 != null && jSONObject2.size() > 0 && jSONObject2.containsKey("page") && jSONObject2.containsKey("eventId")) {
            String string = jSONObject2.getString("page");
            String string2 = jSONObject2.getString("eventId");
            String string3 = jSONObject2.getString("arg1");
            String string4 = jSONObject2.getString("arg2");
            String string5 = jSONObject2.getString("arg3");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
            try {
                TBS.Ext.commitEvent(string, Integer.parseInt(string2), string3, string4, string5, e(jSONObject3));
                if (TextUtils.equals("2101", string2)) {
                    cqv.u(string, string3 + "_BehaviX_UT", null, null, hqv.s(jSONObject3));
                }
                return true;
            } catch (Exception e) {
                bqa.b("homepage_track", "commitEvent error", e);
            }
        }
        return false;
    }
}
