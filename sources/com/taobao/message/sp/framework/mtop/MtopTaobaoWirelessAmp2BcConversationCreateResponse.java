package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoWirelessAmp2BcConversationCreateResponse extends BaseOutDo {
    private MtopTaobaoWirelessAmp2BcConversationCreateResponseData data;

    static {
        t2o.a(552599689);
    }

    public void setData(MtopTaobaoWirelessAmp2BcConversationCreateResponseData mtopTaobaoWirelessAmp2BcConversationCreateResponseData) {
        this.data = mtopTaobaoWirelessAmp2BcConversationCreateResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoWirelessAmp2BcConversationCreateResponseData getData() {
        return this.data;
    }
}
