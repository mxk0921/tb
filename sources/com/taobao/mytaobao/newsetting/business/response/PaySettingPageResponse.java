package com.taobao.mytaobao.newsetting.business.response;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PaySettingPageResponse extends BaseOutDo {
    public PaySettingPageResult data;

    static {
        t2o.a(745537832);
    }

    public void setData(PaySettingPageResult paySettingPageResult) {
        this.data = paySettingPageResult;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public PaySettingPageResult getData() {
        return this.data;
    }
}
