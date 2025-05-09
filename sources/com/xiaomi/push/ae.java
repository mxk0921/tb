package com.xiaomi.push;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ae {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f14749a = "0123456789ABCDEF".toCharArray();

    public static String a(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder(i2 * 2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i + i3];
            char[] cArr = f14749a;
            sb.append(cArr[(b & 255) >> 4]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    public static boolean a(Context context) {
        return ad.f14748a;
    }
}
