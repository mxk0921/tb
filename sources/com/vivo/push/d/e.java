package com.vivo.push.d;

import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.util.u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f14585a;
    final /* synthetic */ IPushRequestCallback b;
    final /* synthetic */ d c;

    public e(d dVar, String str, IPushRequestCallback iPushRequestCallback) {
        this.c = dVar;
        this.f14585a = str;
        this.b = iPushRequestCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.b("add profileId");
        d.a(this.c, this.f14585a, this.b, 1);
    }
}
