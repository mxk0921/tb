package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class brq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1027604503);
    }

    public static String[] a(Map<String, String> map) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("b0c38aa1", new Object[]{map});
        }
        String[] strArr = null;
        if (map != null) {
            try {
                if (map.keySet().size() > 0) {
                    strArr = new String[map.keySet().size()];
                    for (String str : map.keySet()) {
                        String valueOf = String.valueOf(str);
                        int i2 = i + 1;
                        strArr[i] = valueOf + "=" + map.get(valueOf);
                        i = i2;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    public static HashMap<String, String> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("45abf1be", new Object[]{jSONObject});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null) {
            try {
                if (jSONObject.keySet().size() > 0) {
                    for (String str : jSONObject.keySet()) {
                        String valueOf = String.valueOf(str);
                        hashMap.put(valueOf, jSONObject.getString(valueOf));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9b32eca", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static long d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66c9f198", new Object[]{str, new Long(j)})).longValue();
        }
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return j;
        }
    }

    public static JSONObject e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f057a803", new Object[]{str});
        }
        try {
            return JSON.parseObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
