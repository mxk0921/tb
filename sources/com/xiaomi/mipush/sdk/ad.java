package com.xiaomi.mipush.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.logger.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class ad extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NotificationClickedActivity f14708a;

    public ad(NotificationClickedActivity notificationClickedActivity) {
        this.f14708a = notificationClickedActivity;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        b.b("clicked activity finish by normal.");
        this.f14708a.finish();
    }
}
