package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.gf;
import com.xiaomi.push.hb;
import com.xiaomi.push.service.XMPushService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class bu extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    private gf f15084a;

    /* renamed from: a  reason: collision with other field name */
    private XMPushService f1603a;

    public bu(XMPushService xMPushService, gf gfVar) {
        super(4);
        this.f1603a = xMPushService;
        this.f15084a = gfVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "send a message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        try {
            gf gfVar = this.f15084a;
            if (gfVar != null) {
                if (e.a(gfVar)) {
                    this.f15084a.c(System.currentTimeMillis() - this.f15084a.m717a());
                }
                this.f1603a.a(this.f15084a);
            }
        } catch (hb e) {
            b.a(e);
            this.f1603a.a(10, e);
        }
    }
}
