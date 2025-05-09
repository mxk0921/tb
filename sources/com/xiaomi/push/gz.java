package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class gz extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ gx f14918a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Exception f1087a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz(gx gxVar, int i, int i2, Exception exc) {
        super(i);
        this.f14918a = gxVar;
        this.b = i2;
        this.f1087a = exc;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "shutdown the connection. " + this.b + ", " + this.f1087a;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        this.f14918a.b.a(this.b, this.f1087a);
    }
}
