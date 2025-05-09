package com.vivo.push.restructure.a.a;

import android.os.SystemClock;
import com.vivo.push.restructure.a.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class g extends a<a> {
    private long b;

    public g(a aVar, i iVar) {
        super("IPCNode", aVar, iVar);
        this.b = 0L;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long d = aVar.d();
        if (d > 0 && elapsedRealtime > d) {
            this.b = elapsedRealtime - d;
        }
    }

    @Override // com.vivo.push.restructure.a.a.a
    public final /* bridge */ /* synthetic */ int a(a aVar) {
        return 0;
    }

    @Override // com.vivo.push.restructure.a.a.a
    public final synchronized String b() {
        a(this.b);
        return super.b();
    }
}
