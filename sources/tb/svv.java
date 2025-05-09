package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class svv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG1_CLICK = "Page_Home_Button-guessitem-1001";
    public static final int EVENT_ID_CLICK = 2101;
    public static final String PAGE_NAME_HOME = "Page_Home";

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b521660", new Object[]{jSONObject});
        } else {
            b("Page_Home", 2101, ARG1_CLICK, null, null, jSONObject);
        }
    }

    public static void b(String str, int i, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d201f463", new Object[]{str, new Integer(i), str2, str3, str4, jSONObject});
        } else {
            TBS.Ext.commitEvent(str, i, str2, str3, str4, c(jSONObject));
        }
    }

    public static String c(JSONObject jSONObject) {
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
        String sb2 = sb.toString();
        v1.b("UtUtils", "toTrackString: " + sb2);
        return sb2;
    }
}
