package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hb;
import com.xiaomi.push.iy;
import com.xiaomi.push.j;
import com.xiaomi.push.service.XMPushService;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class ab extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ iy f15033a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f1536a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(int i, XMPushService xMPushService, iy iyVar) {
        super(i);
        this.f1536a = xMPushService;
        this.f15033a = iyVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "send ack message for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        Map<String, String> a2;
        try {
            if (j.m869a((Context) this.f1536a)) {
                try {
                    a2 = ah.a((Context) this.f1536a, this.f15033a);
                } catch (Throwable unused) {
                }
                ai.a(this.f1536a, z.a(this.f1536a, this.f15033a, a2));
            }
            a2 = null;
            ai.a(this.f1536a, z.a(this.f1536a, this.f15033a, a2));
        } catch (hb e) {
            b.a(e);
            this.f1536a.a(10, e);
        }
    }
}
