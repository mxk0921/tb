package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.PowerMsgPowerMessage;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ilm {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f21390a;
    public final PowerMsgPowerMessage b;

    static {
        t2o.a(525337437);
    }

    public ilm() {
    }

    public ilm(Map<String, ? extends Object> map) {
        this();
        PowerMsgPowerMessage powerMsgPowerMessage = null;
        this.f21390a = MegaUtils.m(map, "bizCode", null);
        if (map != null && map.containsKey("message")) {
            powerMsgPowerMessage = new PowerMsgPowerMessage(MegaUtils.s(map, "message"));
        }
        this.b = powerMsgPowerMessage;
    }
}
