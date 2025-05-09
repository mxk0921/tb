package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vh7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809851);
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3add84ef", new Object[]{jSONObject});
            return;
        }
        jSONObject.put(x3w.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (Object) String.valueOf(pb6.s(Globals.getApplication())));
        jSONObject.put("screenHeight", (Object) String.valueOf(pb6.r(Globals.getApplication())));
    }
}
