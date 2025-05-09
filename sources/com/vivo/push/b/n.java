package com.vivo.push.b;

import com.vivo.push.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class n extends s {

    /* renamed from: a  reason: collision with root package name */
    private String f14566a;
    private int b = 0;
    private boolean c = false;

    public n() {
        super(7);
    }

    public final void a(int i) {
        this.b = i;
    }

    public final void b(String str) {
        this.f14566a = str;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void c(d dVar) {
        super.c(dVar);
        dVar.a("content", this.f14566a);
        dVar.a("log_level", this.b);
        dVar.a("is_server_log", this.c);
    }

    public final String d() {
        return this.f14566a;
    }

    public final int e() {
        return this.b;
    }

    public final boolean f() {
        return this.c;
    }

    public final void g() {
        this.c = false;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final String toString() {
        return "OnLogCommand";
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void d(d dVar) {
        super.d(dVar);
        this.f14566a = dVar.a("content");
        this.b = dVar.b("log_level", 0);
        this.c = dVar.e("is_server_log");
    }
}
