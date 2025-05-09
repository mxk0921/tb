package com.mobile.auth;

import com.cmic.sso.sdk.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00o000 extends O00o00 {
    private final O00Oo0o0 O00000Oo;
    private boolean O00000o0 = false;

    public O00o000(String str, O00Oo0o0 o00Oo0o0, String str2, String str3) {
        super(str, o00Oo0o0, str2, str3);
        this.O00000Oo = o00Oo0o0;
    }

    public void O000000o(a aVar) {
        String[] strArr;
        O00Oo00 O00000o0 = this.O00000Oo.O00000o0();
        O00000o0.O0000oOo(aVar.b("socketip"));
        O0O0O.O00000Oo("HttpGetPrephoneRequest", "socket socketip = " + aVar.b("socketip"));
        if (!this.O00000o0) {
            if (!aVar.b("isCloseIpv4", false)) {
                strArr = O0OOO0O.O000000o(true);
                O00000o0.O0000o(strArr[0]);
            } else {
                strArr = null;
            }
            if (!aVar.b("isCloseIpv6", false)) {
                if (strArr == null) {
                    strArr = O0OOO0O.O000000o(true);
                }
                O00000o0.O0000oO0(strArr[1]);
            }
            this.O00000o0 = true;
        }
        O00000o0.O0000o0(O00000o0.O0000oo(aVar.b("appkey")));
        this.O00000Oo.O000000o(O00000o0);
        this.O00000Oo.O000000o(true);
        this.O000000o = this.O00000Oo.O00000Oo().toString();
    }
}
