package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hb;
import com.xiaomi.push.iy;
import com.xiaomi.push.service.XMPushService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class ac extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ iy f15034a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f1537a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(int i, XMPushService xMPushService, iy iyVar) {
        super(i);
        this.f1537a = xMPushService;
        this.f15034a = iyVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "send ack message for obsleted message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        try {
            iy a2 = z.a((Context) this.f1537a, this.f15034a);
            a2.m853a().a("message_obsleted", "1");
            ai.a(this.f1537a, a2);
        } catch (hb e) {
            b.a(e);
            this.f1537a.a(10, e);
        }
    }
}
