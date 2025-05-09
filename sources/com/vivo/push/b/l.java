package com.vivo.push.b;

import com.vivo.push.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class l extends s {

    /* renamed from: a  reason: collision with root package name */
    private int f14564a = -1;
    private int b = -1;

    public l() {
        super(2016);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void c(d dVar) {
        super.c(dVar);
        dVar.a("key_dispatch_environment", this.f14564a);
        dVar.a("key_dispatch_area", this.b);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void d(d dVar) {
        super.d(dVar);
        this.f14564a = dVar.b("key_dispatch_environment", 1);
        this.b = dVar.b("key_dispatch_area", 1);
    }

    public final int e() {
        return this.b;
    }

    public final int d() {
        return this.f14564a;
    }
}
