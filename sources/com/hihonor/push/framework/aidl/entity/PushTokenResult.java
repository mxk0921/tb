package com.hihonor.push.framework.aidl.entity;

import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.annotation.Packed;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PushTokenResult implements IMessageEntity {
    @Packed
    private String pushToken = "";

    public String getPushToken() {
        return this.pushToken;
    }

    public void setPushToken(String str) {
        this.pushToken = str;
    }
}
