package com.taobao.activelocation.mtop.defaultPos;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MtopDefaultPositionResponse extends BaseOutDo {
    private MtopDefaultPositionData data;

    static {
        t2o.a(789577749);
    }

    public void setData(MtopDefaultPositionData mtopDefaultPositionData) {
        this.data = mtopDefaultPositionData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopDefaultPositionData getData() {
        return this.data;
    }
}
