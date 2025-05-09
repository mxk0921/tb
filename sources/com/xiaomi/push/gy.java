package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class gy extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f14917a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ gx f1086a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy(gx gxVar, int i, long j, long j2) {
        super(i);
        this.f1086a = gxVar;
        this.f14917a = j;
        this.b = j2;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "check the ping-pong." + this.b;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        Thread.yield();
        if (this.f1086a.m743c() && !this.f1086a.a(this.f14917a)) {
            p.a(this.f1086a.b).m1083b();
            this.f1086a.b.a(22, (Exception) null);
        }
    }
}
