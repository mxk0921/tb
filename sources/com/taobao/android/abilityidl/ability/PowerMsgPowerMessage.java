package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.IAbilityResult;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class PowerMsgPowerMessage implements IAbilityResult {
    public String data;
    public PowerMsgMessageHeader header;

    static {
        t2o.a(525337432);
        t2o.a(144703597);
    }

    public PowerMsgPowerMessage() {
    }

    public PowerMsgPowerMessage(Map<String, ? extends Object> map) {
        this();
        this.header = (map == null || !map.containsKey("header")) ? null : new PowerMsgMessageHeader(MegaUtils.s(map, "header"));
        this.data = MegaUtils.x(map, "data", null);
    }
}
