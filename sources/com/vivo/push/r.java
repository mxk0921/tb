package com.vivo.push;

import com.vivo.push.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f14621a;
    final /* synthetic */ m b;

    public r(m mVar, String str) {
        this.b = mVar;
        this.f14621a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.a b;
        b = this.b.b(this.f14621a);
        if (b != null) {
            b.a(1003, new Object[0]);
        }
    }
}
