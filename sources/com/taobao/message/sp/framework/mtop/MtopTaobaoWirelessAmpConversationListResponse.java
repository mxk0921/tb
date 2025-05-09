package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoWirelessAmpConversationListResponse extends BaseOutDo {
    private MtopTaobaoWirelessAmpConversationListResponseData data;

    static {
        t2o.a(552599698);
    }

    public void setData(MtopTaobaoWirelessAmpConversationListResponseData mtopTaobaoWirelessAmpConversationListResponseData) {
        this.data = mtopTaobaoWirelessAmpConversationListResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoWirelessAmpConversationListResponseData getData() {
        return this.data;
    }
}
