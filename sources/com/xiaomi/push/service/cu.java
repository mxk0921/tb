package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class cu implements v.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService.j f15110a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f1626a;

    public cu(XMPushService xMPushService, XMPushService.j jVar) {
        this.f1626a = xMPushService;
        this.f15110a = jVar;
    }

    @Override // com.xiaomi.push.service.v.a
    public void a() {
        this.f1626a.a(this.f15110a);
    }
}
