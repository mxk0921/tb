package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tl4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(490733610);
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a8e2cc4", new Object[]{jSONObject});
        }
        JSONObject b = b(jSONObject);
        if (b != null) {
            return b.getString("pageUrl");
        }
        fve.e("CampaignDataParse", "smartContent == null");
        return null;
    }

    public static JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("201d3786", new Object[]{jSONObject});
        }
        if (jSONObject != null) {
            return jSONObject.getJSONObject(vaj.KEY_SMART_CONTENT);
        }
        fve.e("CampaignDataParse", "information == null");
        return null;
    }

    public static String c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba875298", new Object[]{jSONObject});
        }
        JSONObject b = b(jSONObject);
        if (b != null) {
            return b.getString("ssrPageUrl");
        }
        fve.e("CampaignDataParse", "smartContent == null");
        return null;
    }

    public static JSONObject d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("53ade790", new Object[]{jSONObject});
        }
        JSONObject b = b(jSONObject);
        if (b == null) {
            return null;
        }
        return b.getJSONObject("tabPassParams");
    }
}
