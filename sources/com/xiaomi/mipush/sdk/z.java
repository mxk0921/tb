package com.xiaomi.mipush.sdk;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f14745a;

    public z(Context context) {
        this.f14745a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        MessageHandleService.c(this.f14745a);
    }
}
