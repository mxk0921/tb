package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class cr implements bf.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f15107a;

    public cr(XMPushService xMPushService) {
        this.f15107a = xMPushService;
    }

    @Override // com.xiaomi.push.service.bf.a
    public void a() {
        this.f15107a.e();
        if (bf.a().m1044a() <= 0) {
            XMPushService xMPushService = this.f15107a;
            xMPushService.a(new XMPushService.g(12, null));
        }
    }
}
