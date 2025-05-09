package com.xiaomi.push.service;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.XMPushService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class cs extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f15108a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs(XMPushService xMPushService, Handler handler) {
        super(handler);
        this.f15108a = xMPushService;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        boolean g;
        super.onChange(z);
        g = this.f15108a.m976g();
        b.m410a("SuperPowerMode:" + g);
        this.f15108a.e();
        if (g) {
            XMPushService xMPushService = this.f15108a;
            xMPushService.a(new XMPushService.g(24, null));
            return;
        }
        this.f15108a.a(true);
    }
}
