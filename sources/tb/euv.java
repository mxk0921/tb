package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.ThreadMode;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class euv implements rl8<ttv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final utv f18828a;

    static {
        t2o.a(352321630);
        t2o.a(723517460);
    }

    public euv(utv utvVar) {
        this.f18828a = utvVar;
    }

    @Override // tb.rl8
    public ThreadMode R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    /* renamed from: a */
    public gl8 h(ttv ttvVar) {
        JSONObject jSONObject;
        x3w x3wVar;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gl8) ipChange.ipc$dispatch("e484ae6", new Object[]{this, ttvVar});
        }
        if (ttvVar == null || (jSONObject = ttvVar.e) == null || (x3wVar = (x3w) jSONObject.get("VerticalItemNode")) == null) {
            return null;
        }
        try {
            i = Integer.parseInt(jSONObject.getString("eventId"));
        } catch (Exception unused) {
            txj.e("UserTrackSubscribe", "eventId解析失败，eventId：" + jSONObject.getString("eventId"));
            i = -1;
        }
        if (i == -1) {
            return null;
        }
        String string = jSONObject.getString("arg1");
        String string2 = jSONObject.getString("arg2");
        String string3 = jSONObject.getString("arg3");
        JSONObject jSONObject2 = (JSONObject) jSONObject.get("args");
        HashMap hashMap = new HashMap();
        if (jSONObject2 != null) {
            for (String str : jSONObject2.keySet()) {
                hashMap.put(str, jSONObject2.getString(str));
            }
        }
        if (i == 2101) {
            this.f18828a.e(x3wVar.b, string, string2, string3, hashMap, x3wVar, true);
        } else if (i == 2201) {
            this.f18828a.f(x3wVar.b, string, string2, string3, hashMap, x3wVar);
        }
        return null;
    }
}
