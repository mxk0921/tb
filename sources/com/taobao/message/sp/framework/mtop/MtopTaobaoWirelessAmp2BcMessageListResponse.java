package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoWirelessAmp2BcMessageListResponse extends BaseOutDo {
    private MtopTaobaoWirelessAmp2BcMessageListResponseData data;

    static {
        t2o.a(552599692);
    }

    public void setData(MtopTaobaoWirelessAmp2BcMessageListResponseData mtopTaobaoWirelessAmp2BcMessageListResponseData) {
        this.data = mtopTaobaoWirelessAmp2BcMessageListResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoWirelessAmp2BcMessageListResponseData getData() {
        return this.data;
    }
}
