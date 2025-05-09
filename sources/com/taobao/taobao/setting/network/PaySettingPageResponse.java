package com.taobao.taobao.setting.network;

import mtopsdk.mtop.domain.BaseOutDo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PaySettingPageResponse extends BaseOutDo {
    public PaySettingPageResult data;

    public void setData(PaySettingPageResult paySettingPageResult) {
        this.data = paySettingPageResult;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public PaySettingPageResult getData() {
        return this.data;
    }
}
