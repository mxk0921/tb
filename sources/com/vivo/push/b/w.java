package com.vivo.push.b;

import com.vivo.push.d;
import com.vivo.push.v;
import tb.vox;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class w extends v {

    /* renamed from: a  reason: collision with root package name */
    private int f14574a = 0;

    public w() {
        super(vox.CLASS_2011);
    }

    @Override // com.vivo.push.v
    public final boolean c() {
        return true;
    }

    public final int d() {
        return this.f14574a;
    }

    @Override // com.vivo.push.v
    public final String toString() {
        return "PushModeCommand";
    }

    @Override // com.vivo.push.v
    public final void c(d dVar) {
        dVar.a("com.bbk.push.ikey.MODE_TYPE", this.f14574a);
    }

    @Override // com.vivo.push.v
    public final void d(d dVar) {
        this.f14574a = dVar.b("com.bbk.push.ikey.MODE_TYPE", 0);
    }
}
