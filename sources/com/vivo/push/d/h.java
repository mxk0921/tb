package com.vivo.push.d;

import android.content.Context;
import com.vivo.push.restructure.a;
import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.restructure.request.b;
import com.vivo.push.restructure.request.d;
import com.vivo.push.util.u;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IPushRequestCallback f14588a;
    final /* synthetic */ d b;

    public h(d dVar, IPushRequestCallback iPushRequestCallback) {
        this.b = dVar;
        this.f14588a = iPushRequestCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.b("query all profileIds");
        if (a.a().g().b() != 0) {
            u.b("core not support sync profileInfo");
            IPushRequestCallback iPushRequestCallback = this.f14588a;
            if (iPushRequestCallback != null) {
                iPushRequestCallback.onError(8102);
                return;
            }
        }
        Context b = a.a().b();
        d.a().a(new b(new com.vivo.push.d.a.a(new com.vivo.push.d.a.b(b.getPackageName(), new ArrayList(), 4)), new i(this), (byte) 0));
    }
}
