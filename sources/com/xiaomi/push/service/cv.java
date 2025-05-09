package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.aa;
import com.xiaomi.push.gr;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class cv extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f15111a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f1627a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ byte[] f1628a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(XMPushService xMPushService, int i, int i2, String str, byte[] bArr) {
        super(i);
        this.f15111a = xMPushService;
        this.b = i2;
        this.f1627a = str;
        this.f1628a = bArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "clear account cache.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        gr grVar;
        v.m1099a((Context) this.f15111a);
        bf.a().m1049a("5");
        aa.a(this.b);
        grVar = this.f15111a.f1504a;
        grVar.c(gr.a());
        b.m410a("clear account and start registration. " + this.f1627a);
        this.f15111a.a(this.f1628a, this.f1627a);
    }
}
