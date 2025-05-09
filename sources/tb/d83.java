package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class d83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767250);
    }

    public static final String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d3de799", new Object[]{jSONObject});
        }
        return qrf.n("", jSONObject, AbilityConst.Server.f14056a, AbilityConst.Server.h, AbilityConst.Server.i);
    }
}
