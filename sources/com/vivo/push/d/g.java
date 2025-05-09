package com.vivo.push.d;

import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.util.u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IPushRequestCallback f14587a;
    final /* synthetic */ d b;

    public g(d dVar, IPushRequestCallback iPushRequestCallback) {
        this.b = dVar;
        this.f14587a = iPushRequestCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.b("delete all profileIds");
        d.a(this.b, "", this.f14587a, 3);
    }
}
