package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.PowerMsgTextMessage;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class llm {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f23398a;
    public final PowerMsgTextMessage b;

    static {
        t2o.a(525337440);
    }

    public llm() {
    }

    public llm(Map<String, ? extends Object> map) {
        this();
        PowerMsgTextMessage powerMsgTextMessage = null;
        this.f23398a = MegaUtils.m(map, "bizCode", null);
        if (map != null && map.containsKey("message")) {
            powerMsgTextMessage = new PowerMsgTextMessage(MegaUtils.s(map, "message"));
        }
        this.b = powerMsgTextMessage;
    }
}
