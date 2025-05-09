package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wwf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001965);
    }

    public static int a(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3d6ea3c", new Object[]{jSONObject, str, new Integer(i)})).intValue();
        }
        Integer integer = jSONObject.getInteger(str);
        if (integer == null) {
            return i;
        }
        return integer.intValue();
    }
}
