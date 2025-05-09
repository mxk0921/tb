package com.vivo.push.f;

import android.content.Context;
import com.vivo.push.b.m;
import com.vivo.push.s;
import com.vivo.push.sdk.PushMessageCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f14602a;
    final /* synthetic */ p b;

    public q(p pVar, m mVar) {
        this.b = pVar;
        this.f14602a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        p pVar = this.b;
        PushMessageCallback pushMessageCallback = ((aa) pVar).b;
        context = ((s) pVar).f14645a;
        pushMessageCallback.onListTags(context, this.f14602a.i(), this.f14602a.d(), this.f14602a.h());
    }
}
