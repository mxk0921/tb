package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bf;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class bg implements bf.b.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bf.b f15071a;

    public bg(bf.b bVar) {
        this.f15071a = bVar;
    }

    @Override // com.xiaomi.push.service.bf.b.a
    public void a(bf.c cVar, bf.c cVar2, int i) {
        XMPushService.c cVar3;
        XMPushService.c cVar4;
        if (cVar2 == bf.c.binding) {
            XMPushService xMPushService = this.f15071a.f1583a;
            cVar4 = this.f15071a.f1582a;
            xMPushService.a(cVar4, 60000L);
            return;
        }
        XMPushService xMPushService2 = this.f15071a.f1583a;
        cVar3 = this.f15071a.f1582a;
        xMPushService2.b(cVar3);
    }
}
