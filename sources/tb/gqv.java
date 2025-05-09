package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gqv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809232);
    }

    public static String a(JSONObject jSONObject) {
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

    public static String[] b(JSONObject jSONObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("133ef0c0", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return null;
        }
        String[] strArr = new String[jSONObject.size()];
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (string != null) {
                strArr[i] = str + "=" + string;
                i++;
            }
        }
        return strArr;
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d1dc473", new Object[]{jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject.getJSONObject("args") != null) {
            jSONObject3.put(yj4.PARAM_PVID, (Object) jSONObject.getJSONObject("args").getString(yj4.PARAM_PVID));
        }
        String str2 = "";
        String string = (jSONObject.getJSONObject("item") == null || jSONObject.getJSONObject("item").getJSONObject("0") == null || jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") == null) ? str2 : jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam").getString("itemId");
        if (jSONObject2 == null || jSONObject2.getJSONObject("clickParam") == null) {
            str = "click_recommend_item_delete";
        } else {
            str = jSONObject2.getJSONObject("clickParam").getString("arg1");
            str2 = jSONObject2.getJSONObject("clickParam").getString("page");
            if (jSONObject2.getJSONObject("clickParam").getJSONObject("args") != null) {
                jSONObject3.put("reasonArgs", (Object) jSONObject2.getJSONObject("clickParam").getJSONObject("args").getString("reasonArgs"));
            }
        }
        cqv.u(str2, str, null, string, b(jSONObject3));
    }

    public static void d(JSONObject jSONObject) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e570e50e", new Object[]{jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject.getJSONObject("args") != null) {
            jSONObject2.put(yj4.PARAM_PVID, (Object) jSONObject.getJSONObject("args").getString(yj4.PARAM_PVID));
        }
        String string = (jSONObject.getJSONObject("item") == null || jSONObject.getJSONObject("item").getJSONObject("0") == null || jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") == null) ? null : jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam").getString("itemId");
        if (jSONObject.getJSONObject("subSection") == null || jSONObject.getJSONObject("subSection").getJSONObject("overlay") == null || jSONObject.getJSONObject("subSection").getJSONObject("overlay").getJSONObject(i2b.TRACK_EXPOSURE_PARAM) == null) {
            str2 = "click_recommend_item_overlay";
            str = "";
        } else {
            str2 = jSONObject.getJSONObject("subSection").getJSONObject("overlay").getJSONObject(i2b.TRACK_EXPOSURE_PARAM).getString("arg1");
            str = jSONObject.getJSONObject("subSection").getJSONObject("overlay").getJSONObject(i2b.TRACK_EXPOSURE_PARAM).getString("page");
        }
        cqv.u(str, str2, null, string, b(jSONObject2));
    }

    public static void e(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ee58bd", new Object[]{jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject.getJSONObject("args") != null) {
            jSONObject3.put(yj4.PARAM_PVID, (Object) jSONObject.getJSONObject("args").getString(yj4.PARAM_PVID));
        }
        String str2 = "";
        String string = (jSONObject.getJSONObject("item") == null || jSONObject.getJSONObject("item").getJSONObject("0") == null || jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") == null) ? str2 : jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam").getString("itemId");
        if (jSONObject2 == null || jSONObject2.getJSONObject("clickParam") == null) {
            str = "click_recommend_item_similar";
        } else {
            str = jSONObject2.getJSONObject("clickParam").getString("arg1");
            str2 = jSONObject2.getJSONObject("clickParam").getString("page");
        }
        cqv.u(str2, str, null, string, b(jSONObject3));
    }
}
