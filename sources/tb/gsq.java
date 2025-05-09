package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gsq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092100);
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf456ef4", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject.keySet().size() > 0) {
                    for (String str2 : parseObject.keySet()) {
                        String valueOf = String.valueOf(str2);
                        hashMap.put(valueOf, parseObject.getString(valueOf));
                    }
                }
            } catch (Exception e) {
                v2s.o().A().c(b.f2661a, e.getMessage());
            }
        }
        return hashMap;
    }

    public static String b(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eeea0c80", new Object[]{map, str});
        }
        if (map == null) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return String.valueOf(map.get(str));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
