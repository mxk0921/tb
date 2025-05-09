package com.huawei.hms.hatool;

import android.util.Pair;
import java.nio.charset.Charset;
import tb.ig0;
import tb.kg0;
import tb.sva;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f5395a = Charset.forName("UTF-8");

    public static Pair<byte[], String> a(String str, int i) {
        if (str == null || str.length() < i) {
            return new Pair<>(new byte[0], str);
        }
        String substring = str.substring(0, i);
        return new Pair<>(sva.b(substring), str.substring(i));
    }

    public static String b(String str, String str2) {
        return sva.a(ig0.l(str.getBytes(f5395a), sva.b(str2)));
    }

    public static String a(String str, String str2) {
        Pair<byte[], String> a2 = a(str, 32);
        return new String(ig0.i(sva.b((String) a2.second), sva.b(str2), (byte[]) a2.first), f5395a);
    }

    public static String a(byte[] bArr, String str) {
        String str2;
        if (bArr == null || bArr.length == 0 || str == null) {
            str2 = "cbc encrypt(byte) param is not right";
        } else {
            byte[] b = sva.b(str);
            if (b.length >= 16) {
                return sva.a(kg0.b(bArr, b));
            }
            str2 = "key length is not right";
        }
        v.b("AesCipher", str2);
        return "";
    }
}
