package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.service.bf;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ak implements bf.b.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f15041a;

    public ak(XMPushService xMPushService) {
        this.f15041a = xMPushService;
    }

    @Override // com.xiaomi.push.service.bf.b.a
    public void a(bf.c cVar, bf.c cVar2, int i) {
        if (cVar2 == bf.c.binded) {
            y.a(this.f15041a, true);
            y.a(this.f15041a);
        } else if (cVar2 == bf.c.unbind) {
            b.m410a("onChange unbind");
            y.a(this.f15041a, ErrorCode.ERROR_SERVICE_UNAVAILABLE, " the push is not connected.");
        }
    }
}
