package com.vivo.push.b;

import com.vivo.push.d;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class m extends s {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<String> f14565a;

    public m() {
        super(8);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void c(d dVar) {
        super.c(dVar);
        dVar.a("tags_list", this.f14565a);
    }

    public final ArrayList<String> d() {
        return this.f14565a;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final String toString() {
        return "OnListTagCommand";
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void d(d dVar) {
        super.d(dVar);
        this.f14565a = dVar.c("tags_list");
    }
}
