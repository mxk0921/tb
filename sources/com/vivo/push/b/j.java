package com.vivo.push.b;

import com.vivo.push.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class j extends s {

    /* renamed from: a  reason: collision with root package name */
    private int f14563a = -1;
    private int b = -1;

    public j() {
        super(12);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void c(d dVar) {
        super.c(dVar);
        dVar.a("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.f14563a);
        dVar.a("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.b);
    }

    public final int d() {
        return this.f14563a;
    }

    public final int e() {
        return this.b;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final String toString() {
        return "OnChangePushStatusCommand";
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void d(d dVar) {
        super.d(dVar);
        this.f14563a = dVar.b("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.f14563a);
        this.b = dVar.b("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.b);
    }
}
