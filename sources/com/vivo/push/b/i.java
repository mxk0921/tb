package com.vivo.push.b;

import com.vivo.push.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class i extends s {

    /* renamed from: a  reason: collision with root package name */
    private String f14562a;
    private String b;
    private String c;
    private String d;

    public i(int i) {
        super(i);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void c(d dVar) {
        super.c(dVar);
        dVar.a("app_id", this.f14562a);
        dVar.a("client_id", this.b);
        dVar.a("client_token", this.c);
        dVar.a("client_token_validity_period", this.d);
    }

    public final String d() {
        return this.f14562a;
    }

    public final String e() {
        return this.c;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final String toString() {
        return "OnBindCommand";
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void d(d dVar) {
        super.d(dVar);
        this.f14562a = dVar.a("app_id");
        this.b = dVar.a("client_id");
        this.c = dVar.a("client_token");
        this.d = dVar.a("client_token_validity_period");
    }
}
