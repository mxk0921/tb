package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.weex.DismissPopWeexModule;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nuv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45dd6182", new Object[]{str, str2, map});
        } else {
            j(str, str2, 2101, map);
        }
    }

    public static Map<String, String> b(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e787273f", new Object[]{strArr});
        }
        HashMap hashMap = new HashMap();
        if (strArr.length == 0) {
            return hashMap;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str) && str.contains("=")) {
                if (str.contains(",")) {
                    arrayList.add(str);
                } else {
                    g(str, hashMap);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (String str2 : ((String) it.next()).split(",")) {
                g(str2, hashMap);
            }
        }
        return hashMap;
    }

    public static void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a58403", new Object[]{str, map});
        } else {
            h(str, 19999, map);
        }
    }

    public static void d(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b9e7e9d", new Object[]{str, strArr});
        } else {
            i(str, 19999, strArr);
        }
    }

    public static void e(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e0e723", new Object[]{str, str2, map});
        } else {
            j(str, str2, 2201, map);
        }
    }

    public static Map<String, String> f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9e05a2b7", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null && !jSONObject.isEmpty()) {
            for (String str : jSONObject.keySet()) {
                hashMap.put(str, String.valueOf(jSONObject.get(str)));
            }
        }
        return hashMap;
    }

    public static void g(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767d1c6d", new Object[]{str, map});
            return;
        }
        String[] split = str.split("=");
        if (split != null) {
            if (split.length == 1) {
                map.put(split[0], "");
            } else if (split.length == 2) {
                map.put(split[0], split[1]);
            }
        }
    }

    public static void h(String str, int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d02383a", new Object[]{str, new Integer(i), map});
        } else {
            j(null, str, i, map);
        }
    }

    public static void i(String str, int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f883f54", new Object[]{str, new Integer(i), strArr});
        } else {
            h(str, i, b(strArr));
        }
    }

    public static void j(String str, String str2, int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57de3804", new Object[]{str, str2, new Integer(i), map});
            return;
        }
        if (str == null) {
            str = DismissPopWeexModule.MODULE_NAME;
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, null, null, map).build());
    }
}
