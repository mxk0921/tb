package com.taobao.taobao.scancode.common.mtop.resp;

import com.taobao.taobao.scancode.common.mtop.data.PailitaoRecommendRespData;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PailitaoRecommendResp extends BaseOutDo {
    private PailitaoRecommendRespData data;

    static {
        t2o.a(760217648);
    }

    public void setData(PailitaoRecommendRespData pailitaoRecommendRespData) {
        this.data = pailitaoRecommendRespData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public PailitaoRecommendRespData getData() {
        return this.data;
    }
}
