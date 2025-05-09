package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class twm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093219);
    }

    public static Map<String, String> a(LiveItem liveItem) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d7d27a54", new Object[]{liveItem});
        }
        HashMap hashMap = new HashMap();
        if (liveItem == null || (jSONObject = liveItem.itemExtData) == null || (jSONObject2 = jSONObject.getJSONObject("itemListTrackData")) == null || (jSONObject3 = jSONObject2.getJSONObject("umpUtParams")) == null) {
            return hashMap;
        }
        HashMap<String, String> b = mxf.b(jSONObject3);
        b.put("gl_click_pos", liveItem.cpsClickPos);
        return b;
    }
}
