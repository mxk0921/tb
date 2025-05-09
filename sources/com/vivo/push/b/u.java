package com.vivo.push.b;

import com.vivo.push.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class u extends v {

    /* renamed from: a  reason: collision with root package name */
    private long f14572a = -1;
    private int b;

    public u() {
        super(20);
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.v
    public final void c(d dVar) {
        super.c(dVar);
        dVar.a("undo_msg_v1", this.f14572a);
        dVar.a("undo_msg_type_v1", this.b);
    }

    public final long d() {
        return this.f14572a;
    }

    public final String e() {
        long j = this.f14572a;
        if (j != -1) {
            return String.valueOf(j);
        }
        return null;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final String toString() {
        return "OnUndoMsgCommand";
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.v
    public final void d(d dVar) {
        super.d(dVar);
        this.f14572a = dVar.b("undo_msg_v1", this.f14572a);
        this.b = dVar.b("undo_msg_type_v1", 0);
    }
}
