package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.IAbilityResult;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class PowerMsgStreamMessagesResult implements IAbilityResult {
    public Integer bizCode;
    public Integer code;
    public Long downRT;
    public List<PowerMsgStreamMessageDataResult> messages;
    public Long seqNUM;
    public String streamID;
    public String topic;

    static {
        t2o.a(525337445);
        t2o.a(144703597);
    }
}
