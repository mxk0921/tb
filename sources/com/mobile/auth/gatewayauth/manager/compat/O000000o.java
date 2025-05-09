package com.mobile.auth.gatewayauth.manager.compat;

import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.TokenRet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O000000o implements ResultCodeProcessor {
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String O000000o(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.manager.compat.O000000o.O000000o(java.lang.String):java.lang.String");
    }

    @Override // com.mobile.auth.gatewayauth.manager.compat.ResultCodeProcessor
    public String convertCode(String str) {
        try {
            return O000000o(str);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    @Override // com.mobile.auth.gatewayauth.manager.compat.ResultCodeProcessor
    public TokenRet convertErrorInfo(String str, String str2, String str3) {
        try {
            TokenRet tokenRet = new TokenRet();
            tokenRet.setCode(O000000o(str));
            tokenRet.setMsg(str2);
            if (Constant.VENDOR_CUCC.equals(str3)) {
                tokenRet.setVendorName(Constant.VENDOR_CUXZ);
            } else {
                tokenRet.setVendorName(str3);
            }
            return tokenRet;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    @Override // com.mobile.auth.gatewayauth.manager.compat.ResultCodeProcessor
    public String getApiLevel() {
        try {
            return String.valueOf(1);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }
}
