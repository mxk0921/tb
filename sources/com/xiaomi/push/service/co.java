package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import com.xiaomi.channel.commonutils.logger.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class co implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f15104a;

    public co(XMPushService xMPushService) {
        this.f15104a = xMPushService;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            PackageManager packageManager = this.f15104a.getApplicationContext().getPackageManager();
            ComponentName componentName = new ComponentName(this.f15104a.getApplicationContext(), "com.xiaomi.push.service.receivers.PingReceiver");
            if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
            }
        } catch (Throwable th) {
            b.m410a("[Alarm] disable ping receiver may be failure. " + th);
        }
    }
}
