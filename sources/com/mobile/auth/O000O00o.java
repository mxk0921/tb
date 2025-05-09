package com.mobile.auth;

import android.content.Context;
import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O000O00o {
    private static final String O000000o = "com.mobile.auth.O000O00o";
    private static String O00000Oo = "";

    public static String O000000o() {
        try {
            String uuid = UUID.randomUUID().toString();
            String uuid2 = UUID.nameUUIDFromBytes((uuid + System.currentTimeMillis() + Math.random()).getBytes(StandardCharsets.UTF_8)).toString();
            return !TextUtils.isEmpty(uuid2) ? uuid2.replace("-", "") : uuid2;
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

    private static String O00000Oo(Context context) {
        try {
            return O00oOooO.O00000Oo(context, "key_d_i_u", "");
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

    private static String O00000o0(Context context) {
        try {
            String uuid = UUID.randomUUID().toString();
            String O000000o2 = O000000o(uuid + "default");
            if (TextUtils.isEmpty(uuid)) {
                return "default";
            }
            return O000000o2;
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                return "default";
            } catch (Throwable th2) {
                try {
                    ExceptionProcessor.processException(th2);
                    return null;
                } catch (Throwable th3) {
                    ExceptionProcessor.processException(th3);
                    return null;
                }
            }
        }
    }

    public static String O000000o(Context context) {
        try {
            if (TextUtils.isEmpty(O00000Oo)) {
                String O00000Oo2 = O00000Oo(context);
                O00000Oo = O00000Oo2;
                if (TextUtils.isEmpty(O00000Oo2)) {
                    String O00000o0 = O00000o0(context);
                    O00000Oo = O00000o0;
                    O000000o(context, O00000o0);
                }
            }
            return O00000Oo;
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

    private static String O000000o(String str) {
        try {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            try {
                byte[] O000000o2 = O00O0Oo.O000000o(str);
                int length = O000000o2.length;
                char[] cArr2 = new char[length * 2];
                int i = 0;
                for (int i2 = 0; i2 < length / 2; i2++) {
                    byte b = O000000o2[i2];
                    int i3 = i + 1;
                    cArr2[i] = cArr[(b >>> 4) & 15];
                    i += 2;
                    cArr2[i3] = cArr[b & 15];
                }
                return new String(new String(cArr2).trim().getBytes(Charset.forName("ISO-8859-1")), Charset.forName("UTF-8"));
            } catch (Exception unused) {
                return null;
            }
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

    private static void O000000o(Context context, String str) {
        try {
            if (!TextUtils.isEmpty(str) && context != null) {
                O00oOooO.O000000o(context, "key_d_i_u", str);
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
