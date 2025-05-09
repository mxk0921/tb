package com.mobile.auth;

import android.text.TextUtils;
import com.cmic.sso.sdk.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00OOOo implements O00OO0O {
    private O00OO0O O000000o;
    private O0O00oO O00000Oo;
    private final O00OOo O00000o0 = new O00OOo();

    public void O00000Oo(final O00o00 o00o00, final O0O00oO o0O00oO, final a aVar) {
        if (this.O000000o != null) {
            O0O00oO o0O00oO2 = new O0O00oO() { // from class: com.mobile.auth.O00OOOo.1
                @Override // com.mobile.auth.O0O00oO
                public void O000000o(O00o o00o) {
                    if (o00o00.O0000Oo0()) {
                        O0O0O.O000000o("RetryAndRedirectInterceptor", "retry: " + o00o00.O000000o());
                        O00OOOo.this.O00000Oo(o00o00, o0O00oO, aVar);
                        return;
                    }
                    o0O00oO.O000000o(o00o);
                }

                @Override // com.mobile.auth.O0O00oO
                public void O000000o(ooooooo oooooooVar) {
                    O00o00 O00000Oo;
                    if (oooooooVar.O00000o()) {
                        O00000Oo = O00OOOo.this.O00000o0.O000000o(o00o00, oooooooVar, aVar);
                    } else if (!TextUtils.isEmpty(O00OOOo.this.O00000o0.O000000o())) {
                        O00000Oo = O00OOOo.this.O00000o0.O00000Oo(o00o00, oooooooVar, aVar);
                    } else {
                        o0O00oO.O000000o(oooooooVar);
                        return;
                    }
                    O00OOOo.this.O00000Oo(O00000Oo, o0O00oO, aVar);
                }
            };
            this.O00000Oo = o0O00oO2;
            this.O000000o.O000000o(o00o00, o0O00oO2, aVar);
        }
    }

    public void O000000o(O00OO0O o00oo0o) {
        this.O000000o = o00oo0o;
    }

    @Override // com.mobile.auth.O00OO0O
    public void O000000o(O00o00 o00o00, O0O00oO o0O00oO, a aVar) {
        O00000Oo(o00o00, o0O00oO, aVar);
    }
}
