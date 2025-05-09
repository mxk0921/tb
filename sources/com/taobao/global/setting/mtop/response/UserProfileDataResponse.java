package com.taobao.global.setting.mtop.response;

import mtopsdk.mtop.domain.BaseOutDo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UserProfileDataResponse extends BaseOutDo {
    private UserProfileDataResult data;

    public void setData(UserProfileDataResult userProfileDataResult) {
        this.data = userProfileDataResult;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public UserProfileDataResult getData() {
        return this.data;
    }
}
