package com.vivo.push.f;

import com.vivo.push.b.i;
import com.vivo.push.m;
import com.vivo.push.t;
import com.vivo.push.util.u;
import com.vivo.push.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class h extends aa {
    public h(v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    public final void a(v vVar) {
        i iVar = (i) vVar;
        String e = iVar.e();
        u.d("OnBindTask", "doTask,订阅APP结果 = " + iVar.i() + " clientToken= " + e);
        m.a().a(iVar.h(), iVar.i(), e);
        t.b(new i(this, e, iVar));
    }
}
