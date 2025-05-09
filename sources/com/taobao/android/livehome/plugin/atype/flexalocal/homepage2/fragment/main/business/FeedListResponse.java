package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.business;

import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.HomeMainListData;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FeedListResponse<responseData extends HomeMainListData> extends BaseOutDo {
    private responseData data;

    static {
        t2o.a(310378715);
    }

    public void setData(responseData responsedata) {
        this.data = responsedata;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public responseData getData() {
        return this.data;
    }
}
