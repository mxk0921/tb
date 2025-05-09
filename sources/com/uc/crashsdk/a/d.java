package com.uc.crashsdk.a;

import com.taobao.login4android.qrcode.data.QrCodeData;
import com.uc.crashsdk.a;
import com.uc.crashsdk.b;
import com.uc.crashsdk.e;
import com.uc.crashsdk.g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f14231a = true;
    private static boolean b = true;
    private static boolean d = false;
    private static String e = "hsdk";
    private static String f = "alid ";
    private static String g;
    private static String i;
    private static final Object c = new Object();
    private static final Object h = new Object();

    public static void a() {
        f.a(0, new e(500), b.I() ? QrCodeData.QR_CODE_VALID_PERIOD : 90000L);
    }

    public static String b() {
        try {
            return "inv" + f + "cras" + e;
        } catch (Throwable th) {
            g.b(th);
            return "";
        }
    }

    public static void c() {
        synchronized (h) {
            i = null;
        }
    }

    public static byte[] d() {
        return new byte[]{6, 0, 23, 8};
    }

    public static boolean e() {
        if (!e.F() && !b.M()) {
            a(true);
            return b;
        }
        return true;
    }

    private static String f() {
        String str = i;
        if (g.a(str)) {
            synchronized (h) {
                try {
                    String str2 = "https://woodpecker.uc.cn";
                    if (g.Q() == 1) {
                        str2 = "https://auth.wpk.quark.cn";
                    } else if (g.P()) {
                        str2 = "https://wpk-auth.ucweb.com";
                    }
                    str = g.a(b.j(), str2.concat("/api/crashsdk/validate"), true);
                    i = str;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return str;
    }

    private static String g() {
        String str;
        byte[] bArr;
        String f2;
        byte[] a2;
        byte[] bArr2;
        StringBuilder sb = new StringBuilder();
        a(sb, "platform", g.e());
        a(sb, "pkgname", a.f14228a);
        a(sb, "process", e.h());
        a(sb, "version", a.a());
        a(sb, "cver", "3.5.2.1");
        a(sb, "ctag", "release");
        if (g.P()) {
            str = "true";
        } else {
            str = "false";
        }
        a(sb, "inter", str);
        a(sb, "os", "android");
        String sb2 = sb.toString();
        byte[] bArr3 = new byte[16];
        c.a(bArr3, 0, h.j());
        c.a(bArr3, 4, c.a());
        c.a(bArr3, 8, d());
        c.a(bArr3, 12, a.f());
        try {
            bArr = c.a(sb2.getBytes(), bArr3, true);
        } catch (Throwable th) {
            g.a(th);
            bArr = null;
        }
        if (bArr == null || (f2 = f()) == null || (a2 = c.a(f2, bArr)) == null) {
            return null;
        }
        try {
            bArr2 = c.a(a2, bArr3, false);
        } catch (Throwable th2) {
            g.a(th2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            return new String(bArr2);
        }
        return null;
    }

    public static void a(int i2) {
        if (i2 == 500) {
            synchronized (c) {
                try {
                    g = null;
                    a(!b.G());
                    if (g.b(g)) {
                        h.a(g);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (!f14231a) {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(boolean r11) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.d.a(boolean):boolean");
    }

    private static StringBuilder a(StringBuilder sb, String str, String str2) {
        if (sb.length() > 0) {
            sb.append("`");
        }
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb;
    }
}
