package com.uc.webview.base;

import android.text.TextUtils;
import android.util.Base64;
import com.uc.webview.base.io.d;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Locale;
import tb.c0z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14256a = "a";
    private static final byte[] b = {38, 40, 85, 99, 83, 100, 107, c0z.MAP32, c0z.MAP32, 40, c0z.MAP32, c0z.MAP32, 35, 61, 61, 61};

    /* compiled from: Taobao */
    /* renamed from: com.uc.webview.base.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class C0830a {

        /* renamed from: a  reason: collision with root package name */
        protected byte[] f14257a;

        public C0830a(byte[] bArr) {
            this.f14257a = bArr;
        }

        public byte[] a() {
            return this.f14257a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        private final String c;
        private final String d;

        /* renamed from: a  reason: collision with root package name */
        public byte[] f14258a = null;
        public File b = null;
        private String e = null;

        public b(String str, String str2) {
            this.c = str;
            this.d = str2;
        }

        public static b a() {
            return new b("MD5", "%032x");
        }

        public static b b() {
            return new b("SHA-1", "%040x");
        }

        private String d() {
            try {
                MessageDigest instance = MessageDigest.getInstance(this.c);
                instance.update(this.f14258a);
                return String.format(Locale.CHINA, this.d, new BigInteger(1, instance.digest()));
            } catch (Throwable th) {
                Log.e(a.f14256a, "dataDigest failed", th);
                return null;
            }
        }

        private String e() {
            BufferedInputStream bufferedInputStream;
            Throwable th;
            byte[] bArr = new byte[131072];
            try {
                MessageDigest instance = MessageDigest.getInstance(this.c);
                bufferedInputStream = new BufferedInputStream(new FileInputStream(this.b));
                while (true) {
                    try {
                        int read = bufferedInputStream.read(bArr, 0, 131072);
                        if (read != -1) {
                            instance.update(bArr, 0, read);
                        } else {
                            return String.format(Locale.CHINA, this.d, new BigInteger(1, instance.digest()));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            Log.e(a.f14256a, "fileDigest failed", th);
                            return null;
                        } finally {
                            d.a(bufferedInputStream);
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = null;
            }
        }

        public final String c() {
            String str;
            if (TextUtils.isEmpty(this.e)) {
                if (this.b != null) {
                    str = e();
                } else {
                    str = d();
                }
                this.e = str;
            }
            return this.e;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private static final int[] f14259a = {126, 147, 115, 241, 101, 198, 215, 134};

        public static String a(String str) {
            try {
                return new String(Base64.encode(a(str.getBytes()), 2), Charset.forName("UTF-8"));
            } catch (Throwable th) {
                Log.d(a.f14256a, "encode failed", th);
                return null;
            }
        }

        public static String b(String str) {
            try {
                return new String(b(Base64.decode(str, 2)), Charset.forName("UTF-8"));
            } catch (Throwable th) {
                Log.d(a.f14256a, "decode failed", th);
                return null;
            }
        }

        private static byte[] a(byte[] bArr) {
            byte[] bArr2 = null;
            if (bArr == null) {
                return null;
            }
            int length = bArr.length;
            try {
                bArr2 = new byte[length + 2];
                byte b = 0;
                for (int i = 0; i < length; i++) {
                    byte b2 = bArr[i];
                    bArr2[i] = (byte) (f14259a[i % 8] ^ b2);
                    b = (byte) (b ^ b2);
                }
                int[] iArr = f14259a;
                bArr2[length] = (byte) (iArr[0] ^ b);
                bArr2[length + 1] = (byte) (iArr[1] ^ b);
            } catch (Exception unused) {
            }
            return bArr2;
        }

        private static byte[] b(byte[] bArr) {
            if (bArr != null && bArr.length >= 2) {
                int length = bArr.length;
                int i = length - 2;
                try {
                    byte[] bArr2 = new byte[i];
                    byte b = 0;
                    for (int i2 = 0; i2 < i; i2++) {
                        byte b2 = (byte) (bArr[i2] ^ f14259a[i2 % 8]);
                        bArr2[i2] = b2;
                        b = (byte) (b ^ b2);
                    }
                    byte b3 = bArr[i];
                    int[] iArr = f14259a;
                    if (b3 == ((byte) ((iArr[0] ^ b) & 255)) && bArr[length - 1] == ((byte) ((iArr[1] ^ b) & 255))) {
                        return bArr2;
                    }
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }
}
