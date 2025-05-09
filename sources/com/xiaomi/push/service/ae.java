package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hb;
import com.xiaomi.push.iy;
import com.xiaomi.push.service.XMPushService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class ae extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ iy f15036a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f1539a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f1540a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(int i, XMPushService xMPushService, iy iyVar, String str) {
        super(i);
        this.f1539a = xMPushService;
        this.f15036a = iyVar;
        this.f1540a = str;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "send app absent ack message for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        try {
            iy a2 = z.a((Context) this.f1539a, this.f15036a);
            a2.m853a().a("absent_target_package", this.f1540a);
            ai.a(this.f1539a, a2);
        } catch (hb e) {
            b.a(e);
            this.f1539a.a(10, e);
        }
    }
}
