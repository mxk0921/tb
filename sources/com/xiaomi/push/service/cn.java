package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.bh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class cn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f15103a;

    public cn(XMPushService xMPushService) {
        this.f15103a = xMPushService;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f15103a.f1518a = true;
        try {
            b.m410a("try to trigger the wifi digest broadcast.");
            Object systemService = this.f15103a.getApplicationContext().getSystemService("MiuiWifiService");
            if (systemService != null) {
                bh.b(systemService, "sendCurrentWifiDigestInfo", new Object[0]);
            }
        } catch (Throwable unused) {
        }
    }
}
