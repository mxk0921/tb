package com.mobile.auth.gatewayauth;

import com.mobile.auth.gatewayauth.utils.O0000Oo0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ExceptionProcessor {
    public static void processException(Throwable th) {
        O0000Oo0.O000000o(th);
    }

    private static boolean isRecursionException(Throwable th) {
        StackTraceElement[] stackTrace;
        try {
            int i = 0;
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (stackTraceElement.getClassName().equals(ExceptionProcessor.class.getName()) && stackTraceElement.getMethodName().equals("processException")) {
                    i++;
                }
            }
            return i >= 4;
        } catch (Throwable th2) {
            try {
                processException(th2);
                return false;
            } catch (Throwable th3) {
                processException(th3);
                return false;
            }
        }
    }
}
