package com.vivo.push;

import com.vivo.push.b.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f14618a;
    final /* synthetic */ String b;
    final /* synthetic */ m c;

    public o(m mVar, b bVar, String str) {
        this.c = mVar;
        this.f14618a = bVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.f14618a);
        this.c.c(this.b);
    }
}
