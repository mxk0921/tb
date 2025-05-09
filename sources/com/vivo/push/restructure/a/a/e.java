package com.vivo.push.restructure.a.a;

import android.text.TextUtils;
import com.vivo.push.m;
import com.vivo.push.restructure.a.a;
import com.vivo.push.restructure.request.d;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.util.g;
import com.vivo.push.util.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class e extends a<a> {
    public e(a aVar, i iVar) {
        super("ClientDispatchNode", aVar, iVar);
    }

    private static PushMessageCallback b(a aVar) {
        try {
            return (PushMessageCallback) Class.forName(com.vivo.push.restructure.a.a().e().a(com.vivo.push.restructure.a.a().b(), aVar.b().getAction())).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            u.b("DispatchNode", "reflect e: ", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(a aVar) {
        PushMessageCallback b = b(aVar);
        if (b == null) {
            return 2804;
        }
        int i = 0;
        if (aVar == null || !aVar.g()) {
            if (aVar != null) {
                int k = aVar.k();
                String l = aVar.l();
                if (k == 3) {
                    String i2 = m.a().i();
                    if (TextUtils.isEmpty(i2) || !TextUtils.equals(i2, l)) {
                        i = 2810;
                    }
                } else if (k == 4) {
                    m.a();
                    if (!m.c().contains(l)) {
                        i = 2811;
                    }
                }
                if (i != 0) {
                    g.a().execute(new f(this, k, l));
                    return i;
                }
            }
            try {
                return m.a().a(aVar.b(), b);
            } catch (Exception unused) {
                return 2808;
            }
        } else {
            d.a().a(aVar);
            return 0;
        }
    }
}
