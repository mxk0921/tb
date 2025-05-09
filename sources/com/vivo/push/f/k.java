package com.vivo.push.f;

import com.vivo.push.util.af;
import com.vivo.push.util.u;
import com.vivo.push.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class k extends aa {
    public k(v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    public final void a(v vVar) {
        u.d("OnClearCacheTask", "delete push info " + this.f14645a.getPackageName());
        af.b(this.f14645a).a();
    }
}
