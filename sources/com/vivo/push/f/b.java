package com.vivo.push.f;

import com.vivo.push.b.d;
import com.vivo.push.b.f;
import com.vivo.push.b.y;
import com.vivo.push.restructure.a;
import com.vivo.push.s;
import com.vivo.push.util.aa;
import com.vivo.push.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class b extends s {
    public b(v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    public final void a(v vVar) {
        boolean z;
        com.vivo.push.model.b a2 = aa.a(this.f14645a, a.a().f());
        try {
            if (((d) vVar).d()) {
                z = j.a(this.f14645a);
            } else {
                z = j.b(this.f14645a);
            }
            if (z) {
                com.vivo.push.model.b a3 = aa.a(this.f14645a, a.a().f());
                if (a2 == null || a3 == null || a3.a() == null || !a3.a().equals(a2.a())) {
                    if (!(a2 == null || a2.a() == null)) {
                        com.vivo.push.a.a.a(this.f14645a, a2.a(), new y(a2.a()));
                    }
                    if (a3 != null && a3.a() != null) {
                        f fVar = new f();
                        a.a();
                        fVar.d();
                        com.vivo.push.a.a.a(this.f14645a, a3.a(), fVar);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
