package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.IAbilityResult;
import java.util.Map;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class PowerMsgTextMessage implements IAbilityResult {
    public PowerMsgMessageHeader header;
    public String text;
    public Map<String, ? extends Object> values;

    static {
        t2o.a(525337453);
        t2o.a(144703597);
    }

    public PowerMsgTextMessage() {
    }

    public PowerMsgTextMessage(Map<String, ? extends Object> map) {
        this();
        this.header = (map == null || !map.containsKey("header")) ? null : new PowerMsgMessageHeader(MegaUtils.s(map, "header"));
        this.text = MegaUtils.x(map, "text", null);
        this.values = MegaUtils.s(map, pg1.ATOM_values);
    }
}
