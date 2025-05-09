package com.vivo.push.b;

import com.vivo.push.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class v extends s {

    /* renamed from: a  reason: collision with root package name */
    private String f14573a;
    private long b;

    public v(int i) {
        super(i);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public void c(d dVar) {
        super.c(dVar);
        dVar.a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT", this.f14573a);
        dVar.a("notify_id", this.b);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public void d(d dVar) {
        super.d(dVar);
        this.f14573a = dVar.a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT");
        this.b = dVar.b("notify_id", -1L);
    }

    public final long f() {
        return this.b;
    }

    public final String g() {
        return this.f14573a;
    }
}
