package com.taobao.calendar.sdk.common;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import tb.ohh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class Strings {
    private static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final char[] UPPER_CASE_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F', 'G', 'H', ohh.LEVEL_I, 'J', 'K', ohh.LEVEL_L, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', ohh.LEVEL_V, ohh.LEVEL_W, 'X', 'Y', 'Z'};

    static {
        t2o.a(414187557);
    }

    public static String bytesToHexString(byte[] bArr, boolean z) {
        char[] cArr;
        if (z) {
            cArr = UPPER_CASE_DIGITS;
        } else {
            cArr = DIGITS;
        }
        char[] cArr2 = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >> 4) & 15];
            i += 2;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    public static final String construct(byte[] bArr, int i, int i2, Charset charset) {
        try {
            return new String(bArr, i, i2, charset.name());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static byte[] getBytes(String str, Charset charset) {
        try {
            return str.getBytes(charset.name());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static final boolean isEmpty(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }
}
