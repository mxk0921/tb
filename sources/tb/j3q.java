package tb;

import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class j3q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(698351634);
    }

    public static Map<String, Object> a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("512895af", new Object[]{map});
        }
        if (map != null && !map.isEmpty()) {
            String valueOf = String.valueOf(map.get("bizName"));
            Object obj = map.get("request_key");
            if ("taobaolive_msoa".equals(valueOf)) {
                map.put("openFrom", "tblive");
                if (obj == null) {
                    map.put("request_key", "openFrom");
                } else {
                    map.put("request_key", obj.toString() + ",openFrom");
                }
            }
        }
        return map;
    }

    public static String b(Map<String, Object> map) {
        Object obj;
        String[] split;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("598a1cdd", new Object[]{map});
        }
        if (map == null || map.isEmpty() || (obj = map.get("request_key")) == null) {
            return null;
        }
        String valueOf = String.valueOf(obj);
        if (!(TextUtils.isEmpty(valueOf) || (split = valueOf.split(",")) == null || split.length == 0)) {
            String str = "";
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && (obj2 = map.get(str2)) != null) {
                    String obj3 = obj2.toString();
                    if (!TextUtils.isEmpty(obj3)) {
                        str = str + "&" + str2 + "=" + obj3;
                    }
                }
            }
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            return str + "&request_key=" + valueOf;
        }
        return null;
    }

    public static String c(Map<String, Object> map) {
        Object obj;
        String[] split;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6174f3a", new Object[]{map});
        }
        if (map == null || map.isEmpty() || (obj = map.get(r4p.KEY_MSOA_TRANS_KEY)) == null) {
            return null;
        }
        String valueOf = String.valueOf(obj);
        if (!(TextUtils.isEmpty(valueOf) || (split = valueOf.split(",")) == null || split.length == 0)) {
            String str = "";
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && (obj2 = map.get(str2)) != null) {
                    String obj3 = obj2.toString();
                    if (!TextUtils.isEmpty(obj3)) {
                        str = str + "&" + str2 + "=" + obj3;
                    }
                }
            }
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            return str + "&transparent_key=" + valueOf;
        }
        return null;
    }

    public static void d(Map<String, Object> map, Bundle bundle) {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88aae115", new Object[]{map, bundle});
        } else if (map != null && !map.isEmpty() && bundle != null && (obj = map.get(r4p.KEY_MSOA_TRANS_KEY)) != null) {
            String valueOf = String.valueOf(obj);
            if (!TextUtils.isEmpty(valueOf)) {
                String[] split = valueOf.split(",");
                if (split == null || split.length == 0) {
                    "TRANSPARENT_KEY : value is not illegal,   it is = ".concat(valueOf);
                    return;
                }
                bundle.putString(r4p.KEY_MSOA_TRANS_KEY, valueOf);
                for (String str : split) {
                    if (!TextUtils.isEmpty(str) && (obj2 = map.get(str)) != null) {
                        String obj3 = obj2.toString();
                        if (!TextUtils.isEmpty(obj3)) {
                            bundle.putString(str, obj3);
                        }
                    }
                }
            }
        }
    }
}
