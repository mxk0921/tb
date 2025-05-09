package com.huawei.hms.activity.internal;

import android.content.Intent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BusResponseResult {

    /* renamed from: a  reason: collision with root package name */
    private Intent f5241a;
    private int b;

    public int getCode() {
        return this.b;
    }

    public Intent getIntent() {
        return this.f5241a;
    }

    public void setCode(int i) {
        this.b = i;
    }

    public void setIntent(Intent intent) {
        this.f5241a = intent;
    }
}
