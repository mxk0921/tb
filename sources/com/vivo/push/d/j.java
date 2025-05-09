package com.vivo.push.d;

import com.vivo.push.d.a.b;
import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.restructure.request.c;
import com.vivo.push.util.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class j implements c<b> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IPushRequestCallback f14590a;
    final /* synthetic */ int b;
    final /* synthetic */ d c;

    public j(d dVar, IPushRequestCallback iPushRequestCallback, int i) {
        this.c = dVar;
        this.f14590a = iPushRequestCallback;
        this.b = i;
    }

    @Override // com.vivo.push.restructure.request.c
    public final void a(int i) {
        if (this.f14590a != null) {
            u.b(this.b + " sync err : " + i);
            this.f14590a.onError(i);
        }
    }

    @Override // com.vivo.push.restructure.request.c
    public final /* synthetic */ void a(b bVar) {
        if (this.f14590a != null) {
            u.b(this.b + " sync success");
            this.f14590a.onSuccess(0);
        }
    }
}
