package com.hihonor.push.framework.aidl.entity;

import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.annotation.Packed;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ResponseHeader implements IMessageEntity {
    @Packed
    public int statusCode;
    @Packed
    public String statusMessage;

    public ResponseHeader() {
        this.statusCode = -1;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setStatusMessage(String str) {
        this.statusMessage = str;
    }

    public ResponseHeader(int i, String str) {
        this.statusCode = i;
        this.statusMessage = str;
    }
}
