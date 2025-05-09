package com.mobile.auth;

import androidx.core.view.InputDeviceCompat;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import tb.ohh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O000o000 {
    private static final String O000000o = "O000o000";
    private static final char[] O00000Oo = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] O00000o0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F'};
    private static final char[] O00000o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F'};

    public static String O000000o(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            if (bArr.length == 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArr.length; i++) {
                char[] cArr = O00000o;
                sb.append(cArr[(bArr[i] >> 4) & 15]);
                sb.append(cArr[bArr[i] & 15]);
            }
            return sb.toString();
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

    public static byte[] O00000Oo(String str) {
        byte[] bArr;
        try {
            byte[] bArr2 = new byte[0];
            try {
                return str.getBytes("UTF-8");
            } catch (Throwable unused) {
                return bArr;
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

    public static byte[] O000000o(String str) {
        if (str == null) {
            return null;
        }
        try {
            char[] charArray = str.toCharArray();
            int length = charArray.length / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                int digit = Character.digit(charArray[i2 + 1], 16) | (Character.digit(charArray[i2], 16) << 4);
                if (digit > 127) {
                    digit += InputDeviceCompat.SOURCE_ANY;
                }
                bArr[i] = (byte) digit;
            }
            return bArr;
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
