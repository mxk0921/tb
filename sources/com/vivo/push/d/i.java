package com.vivo.push.d;

import com.vivo.push.d.a.b;
import com.vivo.push.restructure.request.c;
import com.vivo.push.util.u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class i implements c<b> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f14589a;

    public i(h hVar) {
        this.f14589a = hVar;
    }

    @Override // com.vivo.push.restructure.request.c
    public final /* synthetic */ void a(b bVar) {
        b bVar2 = bVar;
        if (this.f14589a.f14588a != null) {
            u.b("query success");
            this.f14589a.f14588a.onSuccess(bVar2.a());
        }
    }

    @Override // com.vivo.push.restructure.request.c
    public final void a(int i) {
        if (this.f14589a.f14588a != null) {
            u.b("query err : ".concat(String.valueOf(i)));
            this.f14589a.f14588a.onError(i);
        }
    }
}
