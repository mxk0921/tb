package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.IAbilityResult;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class PowerMsgHistoryMessagesResult implements IAbilityResult {
    public Integer code;
    public List<PowerMsgPowerMessage> commonMessages;
    public List<PowerMsgCountMessage> countMessages;
    public List<PowerMsgJoinMessage> joinMessages;
    public List<PowerMsgTextMessage> textMessages;

    static {
        t2o.a(525337426);
        t2o.a(144703597);
    }
}
