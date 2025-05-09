package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.gf;
import com.xiaomi.push.hb;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class c extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    private XMPushService f15091a;

    /* renamed from: a  reason: collision with other field name */
    private gf[] f1615a;

    public c(XMPushService xMPushService, gf[] gfVarArr) {
        super(4);
        this.f15091a = xMPushService;
        this.f1615a = gfVarArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "batch send message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        try {
            gf[] gfVarArr = this.f1615a;
            if (gfVarArr != null) {
                this.f15091a.a(gfVarArr);
            }
        } catch (hb e) {
            b.a(e);
            this.f15091a.a(10, e);
        }
    }
}
