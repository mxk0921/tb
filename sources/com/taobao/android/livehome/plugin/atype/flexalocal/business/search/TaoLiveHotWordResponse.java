package com.taobao.android.livehome.plugin.atype.flexalocal.business.search;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaoLiveHotWordResponse extends BaseOutDo {
    private TaoLiveHotwordResponseData data;

    static {
        t2o.a(310378525);
    }

    public void setData(TaoLiveHotwordResponseData taoLiveHotwordResponseData) {
        this.data = taoLiveHotwordResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public TaoLiveHotwordResponseData getData() {
        return this.data;
    }
}
