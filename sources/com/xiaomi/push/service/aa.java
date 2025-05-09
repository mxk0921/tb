package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hb;
import com.xiaomi.push.iy;
import com.xiaomi.push.service.XMPushService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class aa extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ iy f15032a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f1535a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(int i, XMPushService xMPushService, iy iyVar) {
        super(i);
        this.f1535a = xMPushService;
        this.f15032a = iyVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "send app absent message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        try {
            ai.a(this.f1535a, ai.a(this.f15032a.b(), this.f15032a.m854a()));
        } catch (hb e) {
            b.a(e);
            this.f1535a.a(10, e);
        }
    }
}
