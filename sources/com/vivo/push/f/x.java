package com.vivo.push.f;

import android.content.Context;
import com.vivo.push.util.aa;
import com.vivo.push.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class x extends aa {
    public x(v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    public final void a(v vVar) {
        Context context = this.f14645a;
        if (aa.c(context, context.getPackageName())) {
            e eVar = new e(vVar);
            eVar.a(((aa) this).b);
            eVar.a(vVar);
            return;
        }
        d dVar = new d(vVar);
        dVar.a(((aa) this).b);
        dVar.a(vVar);
    }
}
