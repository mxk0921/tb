package com.vivo.push.b;

import com.taobao.android.weex_framework.MUSAppMonitor;
import com.vivo.push.d;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class t extends s {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<String> f14571a = null;
    private ArrayList<String> b = null;

    public t(int i) {
        super(i);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void c(d dVar) {
        super.c(dVar);
        dVar.a("content", this.f14571a);
        dVar.a(MUSAppMonitor.ERROR_MSG, this.b);
    }

    public final ArrayList<String> d() {
        return this.f14571a;
    }

    public final List<String> e() {
        return this.b;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final String toString() {
        return "OnSetTagsCommand";
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void d(d dVar) {
        super.d(dVar);
        this.f14571a = dVar.c("content");
        this.b = dVar.c(MUSAppMonitor.ERROR_MSG);
    }
}
