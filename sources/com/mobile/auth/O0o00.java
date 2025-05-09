package com.mobile.auth;

import android.content.Context;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.utils.O0000Oo0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0o00 {
    public static int O000000o(Context context, int i) {
        try {
            try {
                return Integer.parseInt(O00O00o0.O000000o(context).O00000Oo(context).optString("operatortype"));
            } catch (Exception e) {
                O0000Oo0.O000000o(e);
                return i;
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1;
            }
        }
    }

    public static String O000000o(Context context) {
        try {
            try {
                O0o0000.O000000o(context);
                O0OO00O.O000000o(context);
                return O0OO00O.O000000o().O00000Oo();
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        } catch (Exception e) {
            e.toString();
            return null;
        }
    }
}
