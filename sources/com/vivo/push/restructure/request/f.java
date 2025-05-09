package com.vivo.push.restructure.request;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f14644a;
    final /* synthetic */ e b;

    public f(e eVar, b bVar) {
        this.b = eVar;
        this.f14644a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.f14644a;
        if (bVar != null && bVar.b() != null) {
            this.f14644a.b().a(1003);
        }
    }
}
