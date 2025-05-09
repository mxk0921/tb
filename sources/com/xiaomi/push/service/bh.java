package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class bh extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bf.b.c f15072a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bf.b.c cVar, int i) {
        super(i);
        this.f15072a = cVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "clear peer job";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        bf.b.c cVar = this.f15072a;
        if (cVar.f15069a == cVar.f1594a.f1581a) {
            b.b("clean peer, chid = " + this.f15072a.f1594a.g);
            this.f15072a.f1594a.f1581a = null;
        }
    }
}
