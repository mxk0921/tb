package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hb;
import com.xiaomi.push.iy;
import com.xiaomi.push.service.XMPushService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class ad extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ iy f15035a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f1538a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(int i, XMPushService xMPushService, iy iyVar) {
        super(i);
        this.f1538a = xMPushService;
        this.f15035a = iyVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "send ack message for unrecognized new miui message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        try {
            iy a2 = z.a((Context) this.f1538a, this.f15035a);
            a2.m853a().a("miui_message_unrecognized", "1");
            ai.a(this.f1538a, a2);
        } catch (hb e) {
            b.a(e);
            this.f1538a.a(10, e);
        }
    }
}
