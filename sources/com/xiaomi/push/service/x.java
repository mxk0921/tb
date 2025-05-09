package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.hb;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bf;
import java.util.Collection;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class x extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    private XMPushService f15133a;

    /* renamed from: a  reason: collision with other field name */
    private String f1662a;

    /* renamed from: a  reason: collision with other field name */
    private byte[] f1663a;
    private String b;
    private String c;

    public x(XMPushService xMPushService, String str, String str2, String str3, byte[] bArr) {
        super(9);
        this.f15133a = xMPushService;
        this.f1662a = str;
        this.f1663a = bArr;
        this.b = str2;
        this.c = str3;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "register app";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        bf.b bVar;
        u a2 = v.m1097a((Context) this.f15133a);
        if (a2 == null) {
            try {
                a2 = v.a(this.f15133a, this.f1662a, this.b, this.c);
            } catch (Exception e) {
                b.d("fail to register push account. " + e);
            }
        }
        if (a2 == null) {
            b.d("no account for registration.");
            y.a(this.f15133a, ErrorCode.ERROR_AUTHERICATION_ERROR, "no account.");
            return;
        }
        b.m410a("do registration now.");
        Collection<bf.b> a3 = bf.a().m1046a("5");
        if (a3.isEmpty()) {
            bVar = a2.a(this.f15133a);
            ai.a(this.f15133a, bVar);
            bf.a().a(bVar);
        } else {
            bVar = a3.iterator().next();
        }
        if (this.f15133a.m988c()) {
            try {
                bf.c cVar = bVar.f1585a;
                if (cVar == bf.c.binded) {
                    ai.a(this.f15133a, this.f1662a, this.f1663a);
                } else if (cVar == bf.c.unbind) {
                    y.a(this.f1662a, this.f1663a);
                    XMPushService xMPushService = this.f15133a;
                    Objects.requireNonNull(xMPushService);
                    xMPushService.a(new XMPushService.b(bVar));
                }
            } catch (hb e2) {
                b.d("meet error, disconnect connection. " + e2);
                this.f15133a.a(10, e2);
            }
        } else {
            y.a(this.f1662a, this.f1663a);
            this.f15133a.a(true);
        }
    }
}
