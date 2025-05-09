package com.vivo.push.model;

import android.content.Intent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class NotifyArriveCallbackByUser {
    private Intent mIntent;
    private boolean mIsIntercept;

    public NotifyArriveCallbackByUser(Intent intent, boolean z) {
        this.mIntent = intent;
        this.mIsIntercept = z;
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public boolean isIntercept() {
        return this.mIsIntercept;
    }
}
