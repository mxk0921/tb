package com.taobao.global.setting.mtop.response;

import com.taobao.global.setting.mtop.model.UserProfile;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UserProfileDataResult implements IMTOPDataObject {
    public UserProfile simpleInfo;

    public UserProfile getSimpleInfo() {
        return this.simpleInfo;
    }

    public void setSimpleInfo(UserProfile userProfile) {
        this.simpleInfo = userProfile;
    }
}
