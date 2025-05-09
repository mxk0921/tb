package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hb;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ck extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f15100a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f1624a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ byte[] f1625a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(XMPushService xMPushService, int i, String str, byte[] bArr) {
        super(i);
        this.f15100a = xMPushService;
        this.f1624a = str;
        this.f1625a = bArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "send mi push message";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        try {
            ai.a(this.f15100a, this.f1624a, this.f1625a);
        } catch (hb e) {
            b.a(e);
            this.f15100a.a(10, e);
        }
    }
}
