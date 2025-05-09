package com.xiaomi.push.service;

import com.xiaomi.push.bg;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ct extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f15109a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct(XMPushService xMPushService, int i) {
        super(i);
        this.f15109a = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "prepare the mi push account.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        ai.a(this.f15109a);
        if (bg.b(this.f15109a)) {
            this.f15109a.a(true);
        }
    }
}
