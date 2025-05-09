package com.vivo.push.f;

import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.s;
import com.vivo.push.util.u;
import com.vivo.push.v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class c extends s {
    public c(v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    public final void a(v vVar) {
        u.a(ClientConfigManagerImpl.getInstance(this.f14645a).isDebug());
    }
}
