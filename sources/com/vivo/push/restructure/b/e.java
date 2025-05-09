package com.vivo.push.restructure.b;

import android.content.Context;
import com.vivo.push.PushConfig;
import com.vivo.push.util.ag;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f14634a;
    final /* synthetic */ PushConfig b;
    final /* synthetic */ d c;

    public e(d dVar, Context context, PushConfig pushConfig) {
        this.c = dVar;
        this.f14634a = context;
        this.b = pushConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f14634a;
        ag.a(context, context.getPackageName(), this.b.isAgreePrivacyStatement());
    }
}
