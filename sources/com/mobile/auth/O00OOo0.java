package com.mobile.auth;

import android.content.Context;
import android.net.Network;
import com.cmic.sso.sdk.a;
import com.mobile.auth.O0OOO00;
import com.mobile.auth.O0OOOOO;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00OOo0 implements O00OO0O {
    private O00OO0O O000000o;

    public void O000000o(O00OO0O o00oo0o) {
        this.O000000o = o00oo0o;
    }

    public void O00000Oo(O00o00 o00o00, final O0O00oO o0O00oO, a aVar) {
        O00OO0O o00oo0o = this.O000000o;
        if (o00oo0o != null) {
            o00oo0o.O000000o(o00o00, new O0O00oO() { // from class: com.mobile.auth.O00OOo0.2
                @Override // com.mobile.auth.O0O00oO
                public void O000000o(O00o o00o) {
                    o0O00oO.O000000o(o00o);
                }

                @Override // com.mobile.auth.O0O00oO
                public void O000000o(ooooooo oooooooVar) {
                    o0O00oO.O000000o(oooooooVar);
                }
            }, aVar);
        }
    }

    @Override // com.mobile.auth.O00OO0O
    public void O000000o(final O00o00 o00o00, final O0O00oO o0O00oO, final a aVar) {
        if (!o00o00.O00000Oo()) {
            O00000Oo(o00o00, o0O00oO, aVar);
        } else {
            O0OOOOO.O000000o((Context) null).O000000o(new O0OOOOO.O000000o() { // from class: com.mobile.auth.O00OOo0.1
                private final AtomicBoolean O00000oO = new AtomicBoolean(false);

                @Override // com.mobile.auth.O0OOOOO.O000000o
                public void O000000o(final Network network) {
                    if (!this.O00000oO.getAndSet(true)) {
                        O0OOO00.O000000o(new O0OOO00.O000000o(null, aVar) { // from class: com.mobile.auth.O00OOo0.1.1
                            @Override // com.mobile.auth.O0OOO00.O000000o
                            public void O000000o() {
                                if (network != null) {
                                    O0O0O.O00000Oo("WifiChangeInterceptor", "onAvailable");
                                    o00o00.O000000o(network);
                                    AnonymousClass1 r0 = AnonymousClass1.this;
                                    O00OOo0.this.O00000Oo(o00o00, o0O00oO, aVar);
                                    return;
                                }
                                o0O00oO.O000000o(O00o.O000000o(102508));
                            }
                        });
                    }
                }
            });
        }
    }
}
