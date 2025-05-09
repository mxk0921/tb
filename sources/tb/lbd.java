package tb;

import com.taobao.android.abilityidl.ability.PowerMsgCountMessage;
import com.taobao.android.abilityidl.ability.PowerMsgJoinMessage;
import com.taobao.android.abilityidl.ability.PowerMsgPowerMessage;
import com.taobao.android.abilityidl.ability.PowerMsgSubscribeResult;
import com.taobao.android.abilityidl.ability.PowerMsgTextMessage;
import com.taobao.android.abilityidl.ability.PowerMsgUnSubscribeResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface lbd extends jdb {
    void P(PowerMsgUnSubscribeResult powerMsgUnSubscribeResult);

    void s0(PowerMsgTextMessage powerMsgTextMessage);

    void u0(PowerMsgSubscribeResult powerMsgSubscribeResult);

    void v1(PowerMsgCountMessage powerMsgCountMessage);

    void x(PowerMsgPowerMessage powerMsgPowerMessage);

    void z0(PowerMsgJoinMessage powerMsgJoinMessage);
}
