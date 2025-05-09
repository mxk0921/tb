package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hfg extends b20 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699232);
    }

    public static /* synthetic */ Object ipc$super(hfg hfgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultronnew/events/LVTrackEventHandler");
    }

    @Override // tb.b20
    public void a(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792eff86", new Object[]{this, context, jSONObject, jSONObject2});
            return;
        }
        String string = jSONObject.getString("eventName");
        String string2 = jSONObject.getString("args");
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            hashMap = (HashMap) JSON.parseObject(string2, HashMap.class);
        } catch (Throwable unused) {
            hha.b("LVTrackEventHandler", "args 转译失败");
        }
        JSONObject jSONObject3 = jSONObject2 != null ? jSONObject2.getJSONObject("ultronItemData") : null;
        if (jSONObject3 != null && jSONObject3.containsKey("itemId")) {
            hashMap.putAll(zha.e(null, (LiveItem) fkx.f(jSONObject3.toJSONString(), LiveItem.class)));
        }
        int g = zqq.g(jSONObject.getString("eventId"), 0);
        if (2201 == g) {
            if (wda.G()) {
                kkr.i().o().a(string, hashMap);
            } else {
                kkr.i().o().b(string, hashMap);
            }
        } else if (2101 == g) {
            kkr.i().o().c(string, hashMap);
        }
    }
}
