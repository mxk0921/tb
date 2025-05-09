package tb;

import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgBizParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgCountValueParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgSendMessageParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgSendTextParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgSubscribeParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgTopicRequestParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgUnSubscribeParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface whc {
    void C(KSPowerMsgSendTextParams kSPowerMsgSendTextParams, x0g x0gVar);

    void E(KSPowerMsgSendMessageParams kSPowerMsgSendMessageParams, v0g v0gVar);

    void H(KSPowerMsgTopicRequestParams kSPowerMsgTopicRequestParams, t0g t0gVar);

    xhc a();

    void j(KSPowerMsgTopicRequestParams kSPowerMsgTopicRequestParams, u0g u0gVar);

    void l(KSPowerMsgUnSubscribeParams kSPowerMsgUnSubscribeParams, q0g q0gVar);

    void p(KSPowerMsgTopicRequestParams kSPowerMsgTopicRequestParams, s0g s0gVar);

    void r(KSPowerMsgSubscribeParams kSPowerMsgSubscribeParams, q0g q0gVar);

    void t(KSPowerMsgBizParams kSPowerMsgBizParams, o0g o0gVar);

    void x(KSPowerMsgCountValueParams kSPowerMsgCountValueParams, p0g p0gVar);
}
