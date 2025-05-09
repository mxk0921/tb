package com.xiaomi.push.service.receivers;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f15127a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ NetworkStatusReceiver f1655a;

    public a(NetworkStatusReceiver networkStatusReceiver, Context context) {
        this.f1655a = networkStatusReceiver;
        this.f15127a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1655a.a(this.f15127a);
    }
}
