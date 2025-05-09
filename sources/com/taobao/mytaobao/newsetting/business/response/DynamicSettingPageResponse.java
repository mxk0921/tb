package com.taobao.mytaobao.newsetting.business.response;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DynamicSettingPageResponse extends BaseOutDo {
    public DynamicSettingPageResult data;

    static {
        t2o.a(745537830);
    }

    public void setData(DynamicSettingPageResult dynamicSettingPageResult) {
        this.data = dynamicSettingPageResult;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public DynamicSettingPageResult getData() {
        return this.data;
    }
}
