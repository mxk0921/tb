package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.O000000o;
import tb.l1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OO0O0o0 extends OO0O0O<l1> {
    @Override // com.mobile.auth.OO0O0O
    public boolean O000000o(String str) {
        try {
            O000000o o000000o = this.O000000o;
            if (o000000o != null) {
                return o000000o.O000000o(str);
            }
            return false;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }
}
