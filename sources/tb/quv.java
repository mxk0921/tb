package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class quv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG1_CHANGE_LIFE_CICLE_SETTING_STATE = "changeOneClicleSettingStateForSetting";
    public static final String ARG1_CHANGE_SETTING_STATE = "changeSettingState";
    public static final String ARG1_GET_CONSUME_FATIGUE = "consumeFatigue";
    public static final String ARG1_GET_HIT_AB = "isHitABTestForSetting";
    public static final String ARG1_GET_LIFE_CICLE_SETTING_STATE = "getLifeCicleSettingCurrentStateForSetting";
    public static final String ARG1_GET_SETTING_STATE = "getSettingCurrentStateForSetting";
    public static final String ARG1_NEED_SHOW_GUIDE = "needShowGuideForType";
    public static final String PAGE_NAME = "Page_MYTBSettingVC_generic";

    public static String a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97d2e59d", new Object[]{str, str2, new Integer(i)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizName", (Object) str);
        jSONObject.put("type", (Object) str2);
        jSONObject.put("resultFatigue", (Object) String.valueOf(i));
        return d(jSONObject);
    }

    public static String b(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f99221ec", new Object[]{str, str2, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizName", (Object) str);
        jSONObject.put("type", (Object) str2);
        jSONObject.put("autoConsumeFatigue", (Object) String.valueOf(z));
        return d(jSONObject);
    }

    public static <T> String c(String str, String str2, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5939e3bb", new Object[]{str, str2, t});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizName", (Object) str);
        jSONObject.put("key", (Object) str2);
        jSONObject.put("value", (Object) t.toString());
        return d(jSONObject);
    }

    public static String d(JSONObject jSONObject) {
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
}
