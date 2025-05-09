package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hb;
import com.xiaomi.push.ic;
import com.xiaomi.push.im;
import com.xiaomi.push.it;
import com.xiaomi.push.iy;
import com.xiaomi.push.jb;
import com.xiaomi.push.service.XMPushService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class ag extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ iy f15038a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ jb f1543a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f1544a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(int i, jb jbVar, iy iyVar, XMPushService xMPushService) {
        super(i);
        this.f1543a = jbVar;
        this.f15038a = iyVar;
        this.f1544a = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "send ack message for clear push message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        try {
            it itVar = new it();
            itVar.c(im.CancelPushMessageACK.f1168a);
            itVar.a(this.f1543a.m879a());
            itVar.a(this.f1543a.a());
            itVar.b(this.f1543a.b());
            itVar.e(this.f1543a.c());
            itVar.a(0L);
            itVar.d("success clear push message.");
            ai.a(this.f1544a, ai.b(this.f15038a.b(), this.f15038a.m854a(), itVar, ic.Notification));
        } catch (hb e) {
            b.d("clear push message. " + e);
            this.f1544a.a(10, e);
        }
    }
}
