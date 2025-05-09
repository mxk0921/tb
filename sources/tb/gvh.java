package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gvh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static fvh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("412b2815", new Object[0]);
        }
        return hvh.q();
    }

    public static fvh b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("24ab40ab", new Object[]{jSONObject});
        }
        return hvh.r(jSONObject);
    }
}
