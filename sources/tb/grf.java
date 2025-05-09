package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class grf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782857);
    }

    public static int a(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("168b65ee", new Object[]{jSONObject, str, new Integer(i)})).intValue();
        }
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            try {
                if (!jSONObject.containsKey(str)) {
                    return i;
                }
                return jSONObject.getIntValue(str);
            } catch (Exception unused) {
            }
        }
        return i;
    }
}
