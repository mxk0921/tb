package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mxf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093354);
    }

    public static String[] a(JSONObject jSONObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("5e645c0c", new Object[]{jSONObject});
        }
        String[] strArr = null;
        if (jSONObject != null) {
            try {
                if (jSONObject.keySet().size() > 0) {
                    strArr = new String[jSONObject.keySet().size()];
                    for (String str : jSONObject.keySet()) {
                        String valueOf = String.valueOf(str);
                        int i2 = i + 1;
                        strArr[i] = valueOf + "=" + jSONObject.getString(valueOf);
                        i = i2;
                    }
                }
            } catch (Exception e) {
                v2s.o().A().c(b.f2661a, e.getMessage());
            }
        }
        return strArr;
    }

    public static HashMap<String, String> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("45abf1be", new Object[]{jSONObject});
        }
        return m3s.b(jSONObject);
    }

    public static Map<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf456ef4", new Object[]{str});
        }
        return m3s.c(str);
    }

    public static List<String> d(JSONArray jSONArray) {
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c76f2c53", new Object[]{jSONArray});
        }
        ArrayList arrayList = null;
        try {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < jSONArray.size(); i++) {
                try {
                    arrayList2.add(jSONArray.getString(i));
                } catch (Exception e2) {
                    e = e2;
                    arrayList = arrayList2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            return arrayList2;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static JSONObject e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f057a803", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return JSON.parseObject(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
