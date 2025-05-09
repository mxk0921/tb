package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.IAbilityResult;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ScreenSetBrightnessParams implements IAbilityResult {
    public Integer brightness;

    static {
        t2o.a(525337490);
        t2o.a(144703597);
    }

    public ScreenSetBrightnessParams() {
    }

    public ScreenSetBrightnessParams(Map<String, ? extends Object> map) {
        this();
        this.brightness = MegaUtils.m(map, "brightness", null);
    }
}
