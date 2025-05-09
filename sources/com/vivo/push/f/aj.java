package com.vivo.push.f;

import com.vivo.push.b.c;
import com.vivo.push.b.e;
import com.vivo.push.m;
import com.vivo.push.model.b;
import com.vivo.push.restructure.a;
import com.vivo.push.s;
import com.vivo.push.util.aa;
import com.vivo.push.util.y;
import com.vivo.push.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class aj extends s {
    public aj(v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    public final void a(v vVar) {
        c cVar = (c) vVar;
        b a2 = aa.a(this.f14645a, a.a().f());
        if (a2 == null) {
            m.a().a(cVar.f(), 1005, new Object[0]);
            return;
        }
        String a3 = a2.a();
        if (a2.c()) {
            m.a().a(cVar.f(), 1004, new Object[0]);
            vVar = new e();
        } else {
            int a4 = y.a(cVar);
            if (a4 != 0) {
                m.a().a(cVar.f(), a4, new Object[0]);
                return;
            }
        }
        com.vivo.push.a.a.a(this.f14645a, a3, vVar);
    }
}
