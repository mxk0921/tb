package com.taobao.android.festival.business.data;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FestivalInfoResponse extends BaseOutDo {
    private FestivalInfoData data;

    static {
        t2o.a(464519187);
    }

    public void setData(FestivalInfoData festivalInfoData) {
        this.data = festivalInfoData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public FestivalInfoData getData() {
        return this.data;
    }
}
