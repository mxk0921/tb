package com.huawei.hms.api;

import android.content.Intent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class HuaweiServicesRepairableException extends UserRecoverableException {
    private final int statusCode;

    public HuaweiServicesRepairableException(int i, String str, Intent intent) {
        super(str, intent);
        this.statusCode = i;
    }

    public int getConnectionStatusCode() {
        return this.statusCode;
    }
}
