package com.xiaomi.push.service;

import android.os.SystemClock;
import com.xiaomi.push.gf;
import com.xiaomi.push.gv;
import com.xiaomi.push.hh;
import com.xiaomi.push.service.XMPushService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class cj implements gv {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f15099a;

    public cj(XMPushService xMPushService) {
        this.f15099a = xMPushService;
    }

    @Override // com.xiaomi.push.gv
    public void a(gf gfVar) {
        if (e.a(gfVar)) {
            bq.a().a(gfVar.e(), SystemClock.elapsedRealtime(), this.f15099a.m979a());
        }
        XMPushService xMPushService = this.f15099a;
        xMPushService.a(new XMPushService.d(gfVar));
    }

    @Override // com.xiaomi.push.gv, com.xiaomi.push.hd
    /* renamed from: a */
    public void mo734a(hh hhVar) {
        XMPushService xMPushService = this.f15099a;
        xMPushService.a(new XMPushService.m(hhVar));
    }
}
