package com.huawei.hms.common.api;

import com.huawei.hms.common.Feature;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final Feature feature;

    public UnsupportedApiCallException(Feature feature) {
        this.feature = feature;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.feature + " is unsupported";
    }
}
