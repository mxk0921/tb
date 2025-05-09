package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gf3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static JSONObject f19940a;

    public static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1cf3a216", new Object[0]);
        }
        JSONObject jSONObject = f19940a;
        if (jSONObject != null) {
            return jSONObject;
        }
        String b = xal.b("cashDeskPopConfig", "{\"isTBBuyFloatMode\":\"true\",\"99tm\":\"true\",\"pageType\":\"float\"}");
        if (TextUtils.isEmpty(b)) {
            f19940a = null;
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(b);
            f19940a = parseObject;
            return parseObject;
        } catch (Exception unused) {
            f19940a = null;
            return null;
        }
    }

    public static Map<String, String> b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6023ad87", new Object[]{map});
        }
        HashMap hashMap = null;
        if (map == null) {
            return null;
        }
        JSONObject a2 = a();
        if (a2 != null && !a2.isEmpty()) {
            for (String str : a2.keySet()) {
                String str2 = map.get(str);
                if (str2 != null && str2.equals(a2.getString(str))) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(str, str2);
                }
            }
        }
        return hashMap;
    }

    public static boolean c(Map<String, String> map) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9cddb52", new Object[]{map})).booleanValue();
        }
        if (!(map == null || (a2 = a()) == null || a2.isEmpty())) {
            for (String str : a2.keySet()) {
                String str2 = map.get(str);
                if (str2 != null && str2.equals(a2.getString(str))) {
                    return true;
                }
            }
        }
        return false;
    }
}
