package com.vivo.push;

import com.vivo.push.m;
import com.vivo.push.restructure.a;
import com.vivo.push.util.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class n implements IPushActionListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m.a f14617a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ m d;

    public n(m mVar, m.a aVar, String str, String str2) {
        this.d = mVar;
        this.f14617a = aVar;
        this.b = str;
        this.c = str2;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        if (i == 0) {
            Object[] b = this.f14617a.b();
            if (b == null || b.length == 0) {
                u.a("PushClientManager", "bind app result is null");
            } else {
                a.a().h().a((String) this.f14617a.b()[0], this.b, this.c);
            }
        } else {
            a.a().h().a("");
        }
    }
}
