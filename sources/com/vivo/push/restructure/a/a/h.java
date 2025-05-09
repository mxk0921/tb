package com.vivo.push.restructure.a.a;

import android.content.Context;
import com.vivo.push.m;
import com.vivo.push.restructure.a.a;
import com.vivo.push.util.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class h extends a<a> {
    public h(a aVar, i iVar) {
        super("InitNode", aVar, iVar);
    }

    @Override // com.vivo.push.restructure.a.a.a
    public final /* synthetic */ int a(a aVar) {
        Context b = com.vivo.push.restructure.a.a().b();
        m.a().a(b);
        String c = aVar.c();
        u.d("InitNode", "PushMessageReceiver " + b.getPackageName() + " ; requestId = " + c);
        return 0;
    }
}
