package com.taobao.android.festival.business.data;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FestivalResponse extends BaseOutDo {
    private FestivalResponseData data;

    static {
        t2o.a(464519189);
    }

    public void setData(FestivalResponseData festivalResponseData) {
        this.data = festivalResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public FestivalResponseData getData() {
        return this.data;
    }
}
