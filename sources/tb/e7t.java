package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e7t extends u22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699203);
    }

    public static /* synthetic */ Object ipc$super(e7t e7tVar, String str, Object... objArr) {
        if (str.hashCode() == -2105903856) {
            super.t((b8v) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultron/events/TaoLiveTrackSubscriber");
    }

    @Override // tb.u22, tb.l6v
    public void t(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        super.t(b8vVar);
        JSONObject z = z(b8vVar);
        String valueOf = String.valueOf(z.get("eventName"));
        String string = z.getString("args");
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            hashMap = (HashMap) JSON.parseObject(string, HashMap.class);
        } catch (Throwable unused) {
            hha.b("TaoLiveTrack", "args 转译失败");
        }
        JSONObject jSONObject = (JSONObject) z.get("ultronItemData");
        if (jSONObject != null) {
            hashMap.putAll(zha.e(null, (LiveItem) fkx.f(jSONObject.toJSONString(), LiveItem.class)));
        }
        int g = zqq.g(z.getString("eventId"), 0);
        if (2201 == g) {
            if (wda.G()) {
                kkr.i().o().a(valueOf, hashMap);
            } else {
                kkr.i().o().b(valueOf, hashMap);
            }
        } else if (2101 == g) {
            kkr.i().o().c(valueOf, hashMap);
        }
    }
}
