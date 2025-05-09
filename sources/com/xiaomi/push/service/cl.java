package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class cl extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f15101a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(XMPushService xMPushService, int i) {
        super(i);
        this.f15101a = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "disconnect for service destroy.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        if (this.f15101a.f1503a != null) {
            this.f15101a.f1503a.b(15, (Exception) null);
            this.f15101a.f1503a = null;
        }
    }
}
