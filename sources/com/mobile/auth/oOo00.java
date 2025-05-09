package com.mobile.auth;

import android.util.Log;
import com.mobile.auth.gatewayauth.ExceptionProcessor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class oOo00 {
    private static boolean O000000o;

    public static void O000000o() {
    }

    public static void O000000o(String str) {
        try {
            Log.e("uniaccount", "6.1.3 ".concat(String.valueOf(str)));
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O000000o(boolean z) {
        try {
            O000000o = z;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }
}
