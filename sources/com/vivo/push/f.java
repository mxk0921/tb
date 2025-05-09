package com.vivo.push;

import com.vivo.push.restructure.request.a.a.a;
import com.vivo.push.restructure.request.a.a.c;
import com.vivo.push.util.u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class f implements c.a<e> {
    private static e b(String str) {
        try {
            return new e(new a(str));
        } catch (Exception e) {
            u.a(8101, e.getMessage());
            return null;
        }
    }

    @Override // com.vivo.push.restructure.request.a.a.c.a
    public final /* synthetic */ e a(String str) {
        return b(str);
    }
}
