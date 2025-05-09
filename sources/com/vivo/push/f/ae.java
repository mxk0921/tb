package com.vivo.push.f;

import com.vivo.push.b.i;
import com.vivo.push.m;
import com.vivo.push.t;
import com.vivo.push.util.u;
import com.vivo.push.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ae extends aa {
    public ae(v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    public final void a(v vVar) {
        i iVar = (i) vVar;
        u.c("OnUnBindTask", "doTask,解订阅APP结果 = " + iVar.i() + " clientToken= " + iVar.e());
        m.a().a(iVar.h(), iVar.i(), new Object[0]);
        t.b(new af(this, iVar));
    }
}
