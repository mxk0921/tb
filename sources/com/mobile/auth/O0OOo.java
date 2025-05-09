package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.PnsLoggerHandler;
import com.mobile.auth.gatewayauth.PnsReporter;
import com.mobile.auth.gatewayauth.manager.O000000o;
import com.mobile.auth.gatewayauth.manager.O00000o;
import com.mobile.auth.gatewayauth.manager.O0000OOo;
import com.mobile.auth.gatewayauth.utils.O0000Oo0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0OOo implements PnsReporter {
    private O0Oo000 O000000o;
    private O00000o O00000Oo;
    private O0000OOo O00000o0;

    public O0OOo(O0Oo000 o0Oo000, O00000o o00000o) {
        this.O000000o = o0Oo000;
        this.O00000Oo = o00000o;
    }

    public void O000000o(O0000OOo o0000OOo) {
        try {
            this.O00000o0 = o0000OOo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    @Override // com.mobile.auth.gatewayauth.PnsReporter
    public void setLogExtension(String str) {
        try {
            this.O00000Oo.O00000o0(str);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    @Override // com.mobile.auth.gatewayauth.PnsReporter
    public void setLoggerEnable(boolean z) {
        try {
            System.currentTimeMillis();
            O0000Oo0.O000000o(z);
            O000000o();
            O0000OOo o0000OOo = this.O00000o0;
            if (o0000OOo != null) {
                for (O000000o o000000o : o0000OOo.O000000o()) {
                    if (o000000o != null) {
                        o000000o.O000000o(z);
                    }
                }
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    @Override // com.mobile.auth.gatewayauth.PnsReporter
    public void setLoggerHandler(PnsLoggerHandler pnsLoggerHandler) {
        try {
            this.O000000o.O000000o(pnsLoggerHandler);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    @Override // com.mobile.auth.gatewayauth.PnsReporter
    public void setUploadEnable(boolean z) {
        try {
            System.currentTimeMillis();
            O0000Oo0.O00000Oo(z);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private static boolean O000000o() {
        return true;
    }
}
