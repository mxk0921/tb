package com.meizu.cloud.pushsdk.e.h;

import java.nio.charset.Charset;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f5852a = Charset.forName("UTF-8");

    public static void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static void a(Throwable th) {
        b(th);
    }

    public static boolean a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    private static <T extends Throwable> void b(Throwable th) throws Throwable {
        throw th;
    }
}
