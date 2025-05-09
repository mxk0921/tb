package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DialogRedirectImpl extends DialogRedirect {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f5316a;
    private final int b;
    private final Intent c;

    public DialogRedirectImpl(Intent intent, Activity activity, int i) {
        this.c = intent;
        this.f5316a = activity;
        this.b = i;
    }

    @Override // com.huawei.hms.common.internal.DialogRedirect
    public final void redirect() {
        Activity activity;
        Intent intent = this.c;
        if (intent != null && (activity = this.f5316a) != null) {
            activity.startActivityForResult(intent, this.b);
        }
    }
}
