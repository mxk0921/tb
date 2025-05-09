package com.huawei.hms.support.api.client;

import android.os.Bundle;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BundleResult {

    /* renamed from: a  reason: collision with root package name */
    private int f5475a;
    private Bundle b;

    public BundleResult(int i, Bundle bundle) {
        this.f5475a = i;
        this.b = bundle;
    }

    public int getResultCode() {
        return this.f5475a;
    }

    public Bundle getRspBody() {
        return this.b;
    }

    public void setResultCode(int i) {
        this.f5475a = i;
    }

    public void setRspBody(Bundle bundle) {
        this.b = bundle;
    }
}
