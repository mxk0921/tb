package com.mobile.auth;

import android.util.Log;
import com.mobile.auth.gatewayauth.ExceptionProcessor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class OOO {
    private static boolean O000000o = false;
    private static int O00000Oo = 2;
    private static int O00000o;
    private static long O00000o0;

    public static void O000000o() {
        try {
            O00000o = 0;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000Oo() {
    }

    public static void O00000o(String str) {
        try {
            if (O000000o) {
                Log.e("UniAccount", OOO0OO0.O00000Oo() + " " + str);
                O00000Oo(str);
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000o0(String str) {
        try {
            if (O000000o) {
                StringBuilder sb = new StringBuilder();
                sb.append(OOO0OO0.O00000Oo());
                sb.append(" ");
                sb.append(str);
                O00000Oo(str);
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000oO(String str) {
        try {
            Log.e("UniAccount", OOO0OO0.O00000Oo() + " " + str);
            O00000Oo(str);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O000000o(String str) {
        try {
            O00000Oo("\n" + str + "\n");
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000Oo(String str) {
        try {
            O00000o++;
            System.currentTimeMillis();
            System.currentTimeMillis();
            O00000o0 = System.currentTimeMillis();
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
