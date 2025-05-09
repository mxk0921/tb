package tb;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sr3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001722);
    }

    public static String b(String str, yko ykoVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8155464", new Object[]{str, ykoVar});
        }
        String string = ykoVar.r().a().getString("config", "");
        if (string.equals("")) {
            return "";
        }
        try {
            jSONObject = new JSONObject(string);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = new JSONObject();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return "";
        }
        return optJSONObject.optString("val");
    }

    public static boolean c(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("574be8a0", new Object[]{ykoVar})).booleanValue();
        }
        return a("enableChituSE", ykoVar);
    }

    public static boolean a(String str, yko ykoVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42902cf1", new Object[]{str, ykoVar})).booleanValue();
        }
        if (ykoVar == null) {
            return false;
        }
        String string = ykoVar.r().a().getString("config", "");
        if (string.equals("")) {
            return false;
        }
        try {
            jSONObject = new JSONObject(string);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = new JSONObject();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        return optJSONObject != null && "true".equals(optJSONObject.optString("val"));
    }
}
