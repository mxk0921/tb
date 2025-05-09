package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class qpo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        iao.d().j(true);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74cac7d5", new Object[]{context, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("monitorPoint", "Launch");
            jSONObject.put("successCount", "0");
            jSONObject.put("failCount", "1");
            jSONObject.put("page", "Page_Panic");
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errorCode", (Object) "1");
            jSONObject2.put("errorCount", (Object) "1");
            jSONObject2.put("errorMsg", (Object) str);
            jSONArray.add(jSONObject2);
            jSONObject.put(pg1.ATOM_errors, (Object) jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.add(jSONObject);
            HashMap hashMap = new HashMap();
            hashMap.put("data", jSONArray2);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("alarmData", JSON.toJSONString(hashMap));
            kao.f(context, "h-adashx.ut.taobao.com", 0L, "Page_Panic", 65501, "", "", "", hashMap2);
        } catch (Exception unused) {
        }
    }
}
