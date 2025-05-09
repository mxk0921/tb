package com.xiaomi.mipush.sdk;

import com.xiaomi.channel.commonutils.logger.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class ac implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NotificationClickedActivity f14707a;

    public ac(NotificationClickedActivity notificationClickedActivity) {
        this.f14707a = notificationClickedActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        b.e("clicked activity finish by timeout.");
        this.f14707a.finish();
    }
}
