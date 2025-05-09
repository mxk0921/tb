package com.vivo.push.sdk;

import android.content.Context;
import com.vivo.push.ab;
import com.vivo.push.m;
import com.vivo.push.restructure.a.a;
import com.vivo.push.util.u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f14648a;
    final /* synthetic */ a b;

    public b(a aVar, a aVar2) {
        this.b = aVar;
        this.f14648a = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        u.d("CommandWorker", " handleMessage type: ".concat(String.valueOf(this.f14648a.j())));
        m a2 = m.a();
        context = ((ab) this.b).f14553a;
        a2.a(context);
        com.vivo.push.restructure.a.a().d().a(this.f14648a);
    }
}
