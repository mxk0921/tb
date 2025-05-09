package tb;

import java.security.SecureRandom;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ce8 {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f17014a = true;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0015 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.SecureRandom a() {
        /*
            java.lang.String r0 = "EncryptUtil"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: NoSuchAlgorithmException -> 0x000d
            r2 = 26
            if (r1 < r2) goto L_0x0012
            java.security.SecureRandom r1 = tb.zd8.a()     // Catch: NoSuchAlgorithmException -> 0x000d
            goto L_0x0013
        L_0x000d:
            java.lang.String r1 = "getSecureRandomBytes: NoSuchAlgorithmException"
            tb.vwx.b(r0, r1)
        L_0x0012:
            r1 = 0
        L_0x0013:
            if (r1 != 0) goto L_0x001b
            java.lang.String r2 = "SHA1PRNG"
            java.security.SecureRandom r1 = java.security.SecureRandom.getInstance(r2)     // Catch: NoSuchAlgorithmException -> 0x003b, all -> 0x0040
        L_0x001b:
            org.bouncycastle.crypto.engines.AESEngine r2 = new org.bouncycastle.crypto.engines.AESEngine     // Catch: NoSuchAlgorithmException -> 0x003b, all -> 0x0040
            r2.<init>()     // Catch: NoSuchAlgorithmException -> 0x003b, all -> 0x0040
            r3 = 32
            byte[] r3 = new byte[r3]     // Catch: NoSuchAlgorithmException -> 0x003b, all -> 0x0040
            r1.nextBytes(r3)     // Catch: NoSuchAlgorithmException -> 0x003b, all -> 0x0040
            org.bouncycastle.crypto.prng.SP800SecureRandomBuilder r4 = new org.bouncycastle.crypto.prng.SP800SecureRandomBuilder     // Catch: NoSuchAlgorithmException -> 0x003b, all -> 0x0040
            r5 = 1
            r4.<init>(r1, r5)     // Catch: NoSuchAlgorithmException -> 0x003b, all -> 0x0040
            r5 = 384(0x180, float:5.38E-43)
            org.bouncycastle.crypto.prng.SP800SecureRandomBuilder r4 = r4.setEntropyBitsRequired(r5)     // Catch: NoSuchAlgorithmException -> 0x003b, all -> 0x0040
            r5 = 256(0x100, float:3.59E-43)
            r6 = 0
            org.bouncycastle.crypto.prng.SP800SecureRandom r0 = r4.buildCTR(r2, r5, r3, r6)     // Catch: NoSuchAlgorithmException -> 0x003b, all -> 0x0040
            return r0
        L_0x003b:
            java.lang.String r2 = "NoSuchAlgorithmException"
            tb.vwx.b(r0, r2)
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ce8.a():java.security.SecureRandom");
    }

    public static byte[] b(int i) {
        SecureRandom a2 = a();
        if (a2 == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        a2.nextBytes(bArr);
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] c(int r3) {
        /*
            java.lang.String r0 = "EncryptUtil"
            boolean r1 = tb.ce8.f17014a
            if (r1 != 0) goto L_0x0047
            byte[] r3 = new byte[r3]
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: NoSuchAlgorithmException -> 0x0013
            r2 = 26
            if (r1 < r2) goto L_0x0018
            java.security.SecureRandom r1 = tb.zd8.a()     // Catch: NoSuchAlgorithmException -> 0x0013
            goto L_0x0019
        L_0x0013:
            java.lang.String r1 = "getSecureRandomBytes: NoSuchAlgorithmException"
            tb.vwx.b(r0, r1)
        L_0x0018:
            r1 = 0
        L_0x0019:
            if (r1 != 0) goto L_0x0024
            java.lang.String r1 = "SHA1PRNG"
            java.security.SecureRandom r1 = java.security.SecureRandom.getInstance(r1)     // Catch: Exception -> 0x0022, NoSuchAlgorithmException -> 0x003e
            goto L_0x0024
        L_0x0022:
            r3 = move-exception
            goto L_0x0028
        L_0x0024:
            r1.nextBytes(r3)     // Catch: Exception -> 0x0022, NoSuchAlgorithmException -> 0x003e
            return r3
        L_0x0028:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getSecureRandomBytes getInstance: exception : "
            r1.<init>(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            tb.vwx.b(r0, r3)
            goto L_0x0043
        L_0x003e:
            java.lang.String r3 = "getSecureRandomBytes getInstance: NoSuchAlgorithmException"
            tb.vwx.b(r0, r3)
        L_0x0043:
            r3 = 0
            byte[] r3 = new byte[r3]
            return r3
        L_0x0047:
            byte[] r3 = b(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ce8.c(int):byte[]");
    }

    public static String d(int i) {
        return sva.a(c(i));
    }

    public static void e(boolean z) {
        vwx.c("EncryptUtil", "setBouncycastleFlag: " + z);
        f17014a = z;
    }
}
