package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jt8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809135);
    }

    public static void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f562573a", new Object[]{map});
        } else if (map != null) {
            try {
                if (!map.isEmpty()) {
                    JSONObject jSONObject = new JSONObject(map);
                    JSONArray jSONArray = jSONObject.getJSONArray("dataTrack");
                    if (jSONArray != null) {
                        UTABTest.activateServer(jSONArray.toJSONString());
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("starkApm");
                    if (jSONObject2 != null) {
                        HashMap<String, String> hashMap = new HashMap<>();
                        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                            if (!(entry.getKey() == null || entry.getValue() == null)) {
                                hashMap.put(entry.getKey(), entry.getValue().toString());
                            }
                        }
                        lq6.a().f("homepage", hashMap);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                sfh.f("ExtraUtils", "abtestRecord error");
            }
        }
    }

    public static float b(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9d353", new Object[]{context, new Integer(i)})).floatValue();
        }
        return (i / context.getResources().getDisplayMetrics().density) + 0.5f;
    }
}
