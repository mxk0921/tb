package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtopAmpAmpserviceGetbatchampuserinfoforimResponse extends BaseOutDo {
    private MtopAmpAmpserviceGetbatchampuserinfoforimResponseData data;

    static {
        t2o.a(552599683);
    }

    public void setData(MtopAmpAmpserviceGetbatchampuserinfoforimResponseData mtopAmpAmpserviceGetbatchampuserinfoforimResponseData) {
        this.data = mtopAmpAmpserviceGetbatchampuserinfoforimResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public MtopAmpAmpserviceGetbatchampuserinfoforimResponseData getData() {
        return this.data;
    }
}
