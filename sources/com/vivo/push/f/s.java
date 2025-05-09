package com.vivo.push.f;

import android.content.Context;
import com.vivo.push.b.n;
import com.vivo.push.sdk.PushMessageCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n f14603a;
    final /* synthetic */ r b;

    public s(r rVar, n nVar) {
        this.b = rVar;
        this.f14603a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        r rVar = this.b;
        PushMessageCallback pushMessageCallback = ((aa) rVar).b;
        context = ((com.vivo.push.s) rVar).f14645a;
        pushMessageCallback.onLog(context, this.f14603a.d(), this.f14603a.e(), this.f14603a.f());
    }
}
