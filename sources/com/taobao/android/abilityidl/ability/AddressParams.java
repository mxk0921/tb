package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.IAbilityResult;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class AddressParams implements IAbilityResult {
    public Map<String, ? extends Object> data;
    public String scene;

    static {
        t2o.a(525336692);
        t2o.a(144703597);
    }

    public AddressParams() {
        this.scene = "";
    }

    public AddressParams(Map<String, ? extends Object> map) {
        this();
        this.data = MegaUtils.s(map, "data");
        String x = MegaUtils.x(map, "scene", null);
        if (x != null) {
            this.scene = x;
            return;
        }
        throw new RuntimeException("scene 参数必传！");
    }
}
