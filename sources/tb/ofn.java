package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ofn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699650);
    }

    public static HashMap<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("2c26f932", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return new HashMap<>();
        }
        String string = jSONObject.getString("bannerTag");
        String string2 = jSONObject.getString("businessId");
        String string3 = jSONObject.getString(rg0.JUMP_URL);
        String string4 = jSONObject.getString("activityType");
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(string4)) {
            hashMap.put("type", string4);
        }
        if (TextUtils.isEmpty(string4) && !TextUtils.isEmpty(string)) {
            hashMap.put("type", string);
        }
        if (!TextUtils.isEmpty(string2)) {
            hashMap.put("typeid", string2);
        }
        if (("event".equals(string) || "others".equals(string)) && !TextUtils.isEmpty(string3)) {
            hashMap.put("typeid", string3);
        }
        return hashMap;
    }

    public static void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b5203e", new Object[]{jSONObject});
            return;
        }
        HashMap<String, String> a2 = a(jSONObject);
        b2e o = kkr.i().o();
        if (o != null) {
            o.c("liveroom_banner", a2);
        }
    }

    public static void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc78abf3", new Object[]{jSONObject});
            return;
        }
        HashMap<String, String> a2 = a(jSONObject);
        b2e o = kkr.i().o();
        if (o != null) {
            o.b("liveroom_banner", a2);
        }
    }
}
