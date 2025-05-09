package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class al implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f14713a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Intent f674a;

    public al(Context context, Intent intent) {
        this.f14713a = context;
        this.f674a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        PushMessageHandler.b(this.f14713a, this.f674a);
    }
}
