package com.vivo.push.b;

import com.vivo.push.d;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<String> f14556a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(boolean r1, java.lang.String r2, java.util.ArrayList<java.lang.String> r3) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x0005
            r1 = 2002(0x7d2, float:2.805E-42)
            goto L_0x0007
        L_0x0005:
            r1 = 2003(0x7d3, float:2.807E-42)
        L_0x0007:
            r0.<init>(r1, r2)
            r0.f14556a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.b.a.<init>(boolean, java.lang.String, java.util.ArrayList):void");
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    public final void c(d dVar) {
        super.c(dVar);
        dVar.a("tags", this.f14556a);
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    public final void d(d dVar) {
        super.d(dVar);
        this.f14556a = dVar.c("tags");
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    public final String toString() {
        return "AliasCommand:" + b();
    }
}
