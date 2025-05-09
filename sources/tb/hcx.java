package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hcx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(437256275);
    }

    public static JSONObject a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("88b05788", new Object[]{list});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : list) {
                JSONObject D = obx.f(sd7.d().b()).D(str);
                if (D != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("currentId", D.get("switch_id_index"));
                    jSONObject2.put("lastRefreshTime", D.get("switch_refresh_time"));
                    jSONObject2.put("lastSwitchTime", D.get("switch_click_time"));
                    jSONObject.put(str, (Object) jSONObject2);
                }
            }
            return jSONObject;
        } catch (Exception e) {
            hgh.d("buildWidgetSwitchData error: " + e.getMessage());
            return null;
        }
    }

    public static void b(List<String> list, String str, boolean z, yyb yybVar, x3o x3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4210be", new Object[]{list, str, new Boolean(z), yybVar, x3oVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("channel", (Object) str);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (list.contains("43")) {
            jSONObject2.put("43", (Object) "3");
        }
        if (list.contains("88")) {
            jSONObject2.put("88", (Object) "2");
        }
        jSONObject.put("dataVersion", (Object) jSONObject2.toString());
        jSONObject.put("uid", (Object) vd7.e(sd7.d().b()).h());
        JSONObject a2 = a(list);
        if (a2 != null) {
            jSONObject.put("switchRecords", (Object) a2);
        }
        if (z) {
            ud7.d().h("widget", list, jSONObject, yybVar);
        } else {
            ud7.d().g("widget", list, jSONObject, yybVar, x3oVar);
        }
    }

    public static void c(String str, yyb yybVar, x3o x3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1169083", new Object[]{str, yybVar, x3oVar});
        } else {
            b(Collections.singletonList(str), "", false, yybVar, x3oVar);
        }
    }

    public static void d(List<String> list, String str, boolean z, yyb yybVar, x3o x3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8d31622", new Object[]{list, str, new Boolean(z), yybVar, x3oVar});
        } else {
            b(list, str, z, yybVar, x3oVar);
        }
    }
}
