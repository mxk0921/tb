package tb;

import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class te2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031784);
    }

    public static void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871a82c8", new Object[]{aVar, str});
        } else if (aVar == null || aVar.w() == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("error", "no_data");
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("CCOScreenShot", 19997, "tbLogistics", null, null, hashMap).build());
        } else {
            try {
                JSONObject jSONObject = aVar.w().i().getJSONObject("events").getJSONObject("utExplosure").getJSONObject("fields").getJSONObject("args");
                HashMap hashMap2 = new HashMap();
                for (String str2 : jSONObject.keySet()) {
                    hashMap2.put(str2, jSONObject.getString(str2));
                }
                lor.c(str, "screenshot", hashMap2.toString());
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("CCOScreenShot", 19997, "tbLogistics", null, null, hashMap2).build());
            } catch (Throwable unused) {
            }
        }
    }
}
