package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopTaobaoBentleyPluginAccountBatchResponse extends BaseOutDo {
    private MtopTaobaoBentleyPluginAccountBatchResponseData data;

    static {
        t2o.a(552599686);
    }

    public void setData(MtopTaobaoBentleyPluginAccountBatchResponseData mtopTaobaoBentleyPluginAccountBatchResponseData) {
        this.data = mtopTaobaoBentleyPluginAccountBatchResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopTaobaoBentleyPluginAccountBatchResponseData getData() {
        return this.data;
    }
}
