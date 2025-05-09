package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hb;
import com.xiaomi.push.iy;
import com.xiaomi.push.service.XMPushService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class af extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ iy f15037a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f1541a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f1542a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(int i, XMPushService xMPushService, iy iyVar, String str, String str2) {
        super(i);
        this.f1541a = xMPushService;
        this.f15037a = iyVar;
        this.f1542a = str;
        this.b = str2;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "send wrong message ack for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        try {
            iy a2 = z.a((Context) this.f1541a, this.f15037a);
            a2.f1289a.a("error", this.f1542a);
            a2.f1289a.a("reason", this.b);
            ai.a(this.f1541a, a2);
        } catch (hb e) {
            b.a(e);
            this.f1541a.a(10, e);
        }
    }
}
