package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoWirelessAmpImbaMessageSessionListResponse extends BaseOutDo {
    private MtopTaobaoWirelessAmpImbaMessageSessionListResponseData data;

    static {
        t2o.a(552599701);
    }

    public void setData(MtopTaobaoWirelessAmpImbaMessageSessionListResponseData mtopTaobaoWirelessAmpImbaMessageSessionListResponseData) {
        this.data = mtopTaobaoWirelessAmpImbaMessageSessionListResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoWirelessAmpImbaMessageSessionListResponseData getData() {
        return this.data;
    }
}
