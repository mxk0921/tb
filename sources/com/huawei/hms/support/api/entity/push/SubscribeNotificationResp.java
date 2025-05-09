package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SubscribeNotificationResp implements IMessageEntity {
    @Packed
    private int retCode = -1;
    @Packed
    private String subscribeResults;

    public int getRetCode() {
        return this.retCode;
    }

    public String getSubscribeResults() {
        return this.subscribeResults;
    }

    public void setRetCode(int i) {
        this.retCode = i;
    }

    public void setSubscribeResults(String str) {
        this.subscribeResults = str;
    }
}
