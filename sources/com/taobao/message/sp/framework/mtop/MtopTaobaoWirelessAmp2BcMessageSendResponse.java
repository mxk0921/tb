package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoWirelessAmp2BcMessageSendResponse extends BaseOutDo {
    private MtopTaobaoWirelessAmp2BcMessageSendResponseData data;

    static {
        t2o.a(552599695);
    }

    public void setData(MtopTaobaoWirelessAmp2BcMessageSendResponseData mtopTaobaoWirelessAmp2BcMessageSendResponseData) {
        this.data = mtopTaobaoWirelessAmp2BcMessageSendResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoWirelessAmp2BcMessageSendResponseData getData() {
        return this.data;
    }
}
