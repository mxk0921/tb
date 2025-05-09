package com.vivo.push.b;

import com.vivo.push.d;
import com.vivo.push.v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class f extends v {

    /* renamed from: a  reason: collision with root package name */
    private int f14560a;

    public f() {
        super(0);
    }

    @Override // com.vivo.push.v
    public final void c(d dVar) {
        if (dVar != null) {
            dVar.a("APP_CLIENT_SWITCH_FLAG", this.f14560a);
        }
    }

    public final void d() {
        this.f14560a = 3;
    }

    @Override // com.vivo.push.v
    public final String toString() {
        return "DefaultCommand";
    }

    @Override // com.vivo.push.v
    public final void d(d dVar) {
        if (dVar != null) {
            this.f14560a = dVar.b("APP_CLIENT_SWITCH_FLAG", 0);
        }
    }
}
