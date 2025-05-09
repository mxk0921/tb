package com.vivo.push.b;

import com.vivo.push.d;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class z extends c {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<String> f14577a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z(boolean r1, java.lang.String r2, java.util.ArrayList<java.lang.String> r3) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x0005
            r1 = 2004(0x7d4, float:2.808E-42)
            goto L_0x0007
        L_0x0005:
            r1 = 2005(0x7d5, float:2.81E-42)
        L_0x0007:
            r0.<init>(r1, r2)
            r0.f14577a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.b.z.<init>(boolean, java.lang.String, java.util.ArrayList):void");
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    public final void c(d dVar) {
        super.c(dVar);
        dVar.a("tags", (Serializable) this.f14577a);
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    public final void d(d dVar) {
        super.d(dVar);
        this.f14577a = dVar.c("tags");
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    public final String toString() {
        return "TagCommand";
    }
}
