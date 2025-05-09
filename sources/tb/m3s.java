package tb;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class m3s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356516);
    }

    public static JSONObject a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a169e7c", new Object[]{intent});
        }
        JSONObject jSONObject = new JSONObject();
        if (!(intent == null || intent.getExtras() == null)) {
            Bundle extras = intent.getExtras();
            for (String str : extras.keySet()) {
                jSONObject.put(str, extras.get(str));
            }
        }
        return jSONObject;
    }

    public static HashMap<String, String> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("20c77b73", new Object[]{jSONObject});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null && !jSONObject.keySet().isEmpty()) {
            try {
                for (String str : jSONObject.keySet()) {
                    String valueOf = String.valueOf(str);
                    hashMap.put(valueOf, jSONObject.getString(valueOf));
                }
            } catch (Exception e) {
                v2s.o().A().c("TLiveJsonUtils", e.getMessage());
            }
        }
        return hashMap;
    }

    public static HashMap<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("4b0efd8d", new Object[]{str});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(str)) {
            try {
                return b(JSON.parseObject(str));
            } catch (Exception e) {
                o3s.b("TLiveJsonUtils", e.toString());
            }
        }
        return hashMap;
    }

    public static HashMap<String, Object> d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9d6c27d2", new Object[]{jSONObject});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (jSONObject != null) {
            try {
                if (!jSONObject.keySet().isEmpty()) {
                    for (String str : jSONObject.keySet()) {
                        String valueOf = String.valueOf(str);
                        hashMap.put(valueOf, jSONObject.get(valueOf));
                    }
                }
            } catch (Exception e) {
                o3s.b("TLiveJsonUtils", e.toString());
            }
        }
        return hashMap;
    }

    public static HashMap<String, Object> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("4788ff0e", new Object[]{str});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(str)) {
            try {
                return d(JSON.parseObject(str));
            } catch (Exception e) {
                o3s.b("TLiveJsonUtils", e.toString());
            }
        }
        return hashMap;
    }

    public static long f(JSONObject jSONObject, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28dcd537", new Object[]{jSONObject, str, new Long(j)})).longValue();
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                return jSONObject.getLongValue(str);
            } catch (Throwable th) {
                o3s.b("TLiveJsonUtils", "getLong" + th.getMessage());
            }
        }
        return j;
    }
}
