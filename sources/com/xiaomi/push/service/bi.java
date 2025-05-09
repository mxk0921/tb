package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class bi extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bf.b.c f15073a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bf.b.c cVar, int i) {
        super(i);
        this.f15073a = cVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "check peer job";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        bf a2 = bf.a();
        bf.b bVar = this.f15073a.f1594a;
        if (a2.a(bVar.g, bVar.f1590b).f1581a == null) {
            XMPushService xMPushService = bf.b.this.f1583a;
            bf.b bVar2 = this.f15073a.f1594a;
            xMPushService.a(bVar2.g, bVar2.f1590b, 2, null, null);
        }
    }
}
