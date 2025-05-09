package com.mobile.auth;

import android.text.TextUtils;
import com.cmic.sso.sdk.a;
import java.security.SecureRandom;
import java.util.UUID;
import tb.ohh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OO0oO {
    private static final char[] O000000o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F'};

    public static String O000000o(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = O000000o;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static String O00000Oo() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    private static String O00000o() {
        return UUID.randomUUID().toString();
    }

    public static String O00000o0() {
        return O00000o().replace("-", "");
    }

    public static void O000000o(a aVar, String str) {
        if (!TextUtils.isEmpty(aVar.b("interfaceType", ""))) {
            str = aVar.b("interfaceType") + ";" + str;
        }
        aVar.a("interfaceType", str);
    }

    public static void O00000Oo(a aVar, String str) {
        if (!TextUtils.isEmpty(aVar.b("interfaceCode", ""))) {
            str = aVar.b("interfaceCode") + ";" + str;
        }
        aVar.a("interfaceCode", str);
    }

    public static void O00000o0(a aVar, String str) {
        if (!TextUtils.isEmpty(aVar.b("interfaceElasped", ""))) {
            str = aVar.b("interfaceElasped") + ";" + str;
        }
        aVar.a("interfaceElasped", str);
    }

    public static boolean O000000o(O000o o000o) {
        return O0OO0O.O000000o("logCloseTime", 0L) + ((long) (o000o.O0000Ooo() * 3600000)) >= System.currentTimeMillis();
    }

    public static byte[] O000000o() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }
}
