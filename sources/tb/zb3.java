package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zb3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199569);
    }

    public static Boolean a(JSONObject jSONObject, String str, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("fbe8cb89", new Object[]{jSONObject, str, bool});
        }
        Boolean bool2 = jSONObject.getBoolean(str);
        if (bool2 == null) {
            return bool;
        }
        return bool2;
    }

    public static Long b(JSONObject jSONObject, String str, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("11539135", new Object[]{jSONObject, str, l});
        }
        Long l2 = jSONObject.getLong(str);
        if (l2 == null) {
            return l;
        }
        return l2;
    }

    public static String c(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("197ae2aa", new Object[]{jSONObject, str, str2});
        }
        String string = jSONObject.getString(str);
        if (string == null) {
            return str2;
        }
        return string;
    }
}
