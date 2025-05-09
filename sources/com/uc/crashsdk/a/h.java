package com.uc.crashsdk.a;

import android.os.Build;
import android.os.Process;
import android.util.SparseArray;
import com.alibaba.security.realidentity.g4;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.taobao.adaemon.power.APower;
import com.uc.crashsdk.JNIBridge;
import com.uc.crashsdk.b;
import com.uc.crashsdk.e;
import com.uc.crashsdk.g;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import tb.y1r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f14235a = true;
    private static final Object b = new Object();
    private static final Map<String, String> c = new HashMap();
    private static int d = 0;
    private static final Map<String, a> e = new HashMap();
    private static final Object f = new Object();
    private static final Object g = new Object();
    private static final SparseArray<String> h = new SparseArray<>();
    private static boolean i = false;
    private static boolean j = false;
    private static final Object k = new Object();
    private static String l = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f14236a = 0;
        int b = 0;
        Map<String, String> c = new HashMap();
        private String d;
        private boolean e;
        private boolean f;

        public a(String str, boolean z, boolean z2) {
            this.e = false;
            this.f = false;
            this.d = str;
            this.e = z;
            this.f = z2;
        }

        private long d(String str) {
            return g.c(a(str));
        }

        public final void a(String str, String str2) {
            this.c.put(str, str2);
        }

        public final String b(String str) {
            String a2 = a(str);
            if (a2 == null) {
                return "";
            }
            return a2;
        }

        public final boolean c(String str) {
            if (g.a(str)) {
                return false;
            }
            HashMap hashMap = new HashMap();
            Map c = h.c(str);
            String str2 = null;
            long j = 0;
            int i = 0;
            for (String str3 : c.keySet()) {
                String str4 = (String) c.get(str3);
                if (str3.equals("lt")) {
                    str2 = str4;
                } else if (this.e && str3.equals("up")) {
                    j = g.c(str4);
                } else if (!this.e || !str3.equals(MspDBHelper.BizEntry.COLUMN_NAME_PID)) {
                    hashMap.put(str3, str4);
                } else {
                    i = (int) g.c(str4);
                }
            }
            String str5 = this.d;
            if (!(str5 == null || str5.equals(str2))) {
                return false;
            }
            this.f14236a = j;
            this.b = i;
            this.d = str2;
            this.c = hashMap;
            return true;
        }

        public final void a(String str, long j) {
            long d = d(str) + j;
            if (d <= 100) {
                j = 0;
                if (d >= 0) {
                    j = d;
                }
            }
            a(str, String.valueOf(j));
        }

        public final boolean a(a aVar) {
            if (!this.f) {
                Locale locale = Locale.US;
                String str = this.d;
                com.uc.crashsdk.a.a.a("crashsdk", "WaItem '" + str + "' is not mergable!", null);
                return false;
            }
            for (String str2 : aVar.c.keySet()) {
                if (str2.startsWith("c_")) {
                    a(str2, aVar.a(str2));
                } else {
                    long d = aVar.d(str2);
                    if (d == 0) {
                        a(str2, aVar.a(str2));
                    } else if (d < 100) {
                        a(str2, d);
                    }
                }
            }
            return true;
        }

        public final String a(String str) {
            return this.c.get(str);
        }

        public final String a(boolean z, boolean z2, boolean z3) {
            if (this.d == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            if (z) {
                h.b(sb, "lt", "uc");
                h.b(sb, "pre", g.e());
                h.b(sb, "pkg", com.uc.crashsdk.a.f14228a);
                h.b(sb, "rom", Build.VERSION.RELEASE);
                h.b(sb, "brd", Build.BRAND);
                h.b(sb, "model", Build.MODEL);
                h.a(sb, g4.a.f2721a, Build.VERSION.SDK_INT);
                h.b(sb, APower.TYPE_CPU, e.e());
                h.b(sb, "hdw", e.f());
                long o = h.o();
                h.a(sb, "ram", o);
                h.b(sb, "aram", h.a(o));
                h.b(sb, "cver", "3.5.2.1");
                h.b(sb, "cseq", "230821205034");
                h.b(sb, "ctag", "release");
                h.b(sb, "aver", com.uc.crashsdk.a.a());
                h.b(sb, MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, g.S());
                h.b(sb, "sver", g.T());
                h.b(sb, y1r.COL_SEQ, g.U());
                h.b(sb, "grd", b.B() ? "fg" : "bg");
                h.b(sb, "os", "android");
                sb.append("\n");
            }
            h.b(sb, "lt", this.d);
            h.a(sb, this.c);
            if (this.e && !z2) {
                long j = this.f14236a;
                if (j != 0) {
                    h.b(sb, "up", String.valueOf(j));
                }
                if (z3) {
                    Locale locale = Locale.US;
                    int myPid = Process.myPid();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(myPid);
                    h.b(sb, MspDBHelper.BizEntry.COLUMN_NAME_PID, sb2.toString());
                } else {
                    int i = this.b;
                    if (i != 0) {
                        Locale locale2 = Locale.US;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i);
                        h.b(sb, MspDBHelper.BizEntry.COLUMN_NAME_PID, sb3.toString());
                    }
                }
            }
            sb.append("\n");
            return sb.toString();
        }
    }

    public static /* synthetic */ String a(long j2) {
        if (j2 < 524288) {
            return "512M";
        }
        Locale locale = Locale.US;
        return (((j2 / 1024) + 512) / 1024) + "G";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        sb.append("`");
    }

    public static /* synthetic */ Map c(String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("`")) {
            if (str2.length() > 1) {
                String[] split2 = str2.split("=", 3);
                if (split2.length == 2) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        return hashMap;
    }

    public static void d() {
        b(2, 2000L);
        a(1, 70000L);
    }

    public static boolean e() {
        return j;
    }

    public static void f() {
        b(1, 2000L);
    }

    public static void g() {
        b(3, 0L);
    }

    public static void h() {
        b(4, 0L);
    }

    public static void i() {
        if (g.O()) {
            f.a(1, new e(303));
        }
    }

    public static byte[] j() {
        return new byte[]{Byte.MAX_VALUE, 100, 110, 31};
    }

    public static void k() {
        synchronized (k) {
            l = null;
        }
    }

    private static String m() {
        return g.V() + "pv.wa";
    }

    private static String n() {
        return g.V() + "cdt.wa";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long o() {
        Iterator<String> it = g.a(new File("/proc/meminfo"), 2).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (next.contains("MemTotal:")) {
                try {
                    return Long.parseLong(next.replaceAll("\\D+", ""));
                } catch (NumberFormatException e2) {
                    g.a(e2);
                }
            }
        }
        return 0L;
    }

    private static String p() {
        String str = l;
        if (g.a(str)) {
            synchronized (k) {
                try {
                    String str2 = "https://applog.uc.cn/collect";
                    if (g.Q() == 1) {
                        str2 = "https://applog.lc.quark.cn/collect";
                    } else if (g.P()) {
                        str2 = "https://gjapplog.ucweb.com/collect";
                    }
                    str = g.a(b.k(), str2, true);
                    l = str;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return str;
    }

    public static /* synthetic */ void a(StringBuilder sb, String str, long j2) {
        b(sb, str, String.valueOf(j2));
    }

    public static void b() {
        a(2, 0L);
    }

    public static void c() {
        a(3, 0L);
    }

    private static void b(int i2, long j2) {
        if (g.O()) {
            f.a(1, new e(301, new Object[]{Integer.valueOf(i2)}), j2);
        }
    }

    private static boolean d(String str) {
        File file = new File(str);
        Iterator<a> it = a(file, "cst", 30).iterator();
        while (it.hasNext()) {
            a next = it.next();
            String a2 = next.a("prc");
            if (!g.a(a2)) {
                Map<String, a> map = e;
                a aVar = map.get(a2);
                if (aVar != null) {
                    aVar.a(next);
                } else {
                    map.put(a2, next);
                }
            }
        }
        Map<String, a> map2 = e;
        boolean b2 = b(e.q(), a((Iterable<a>) map2.values(), true, false).toString());
        g.b(file);
        if (b2 || g.a(file, a((Iterable<a>) map2.values(), false, true).toString())) {
            map2.clear();
        }
        return true;
    }

    public static /* synthetic */ void a(StringBuilder sb, Map map) {
        for (String str : map.keySet()) {
            b(sb, str, (String) map.get(str));
        }
    }

    public static void a(String str) {
        synchronized (b) {
            try {
                File file = new File(m());
                a aVar = new a("pv", true, true);
                String c2 = g.c(file);
                if (!g.a(c2)) {
                    aVar.c(c2);
                }
                aVar.a(str, 1L);
                aVar.a("aujv", 1L);
                g.a(file, aVar.a(false, false, false));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean b(int i2, Object[] objArr) {
        switch (i2) {
            case 351:
                if (f14235a || objArr != null) {
                    String str = (String) objArr[0];
                    int intValue = ((Integer) objArr[1]).intValue();
                    if (intValue == 1) {
                        if (j) {
                            return false;
                        }
                        j = true;
                    }
                    File file = new File(str);
                    ArrayList<a> a2 = a(file, "crp", 100);
                    if (intValue != 4) {
                        a aVar = new a("crp", false, false);
                        String str2 = "1";
                        if (intValue == 1) {
                            aVar.a("et", String.valueOf(b.J()));
                            aVar.a("ete", String.valueOf(b.K()));
                        } else if (intValue == 3) {
                            aVar.a("et", str2);
                            aVar.a("ete", str2);
                        } else if (intValue == 2) {
                            aVar.a("hpv", str2);
                        }
                        aVar.a("prc", e.h());
                        if (!b.G()) {
                            str2 = "0";
                        }
                        aVar.a("imp", str2);
                        a(aVar);
                        a2.add(0, aVar);
                    }
                    if (!a2.isEmpty()) {
                        boolean b2 = b(e.q(), a((Iterable<a>) a2, true, false).toString());
                        g.b(file);
                        if (!b2) {
                            g.a(file, a((Iterable<a>) a2, false, true).toString());
                        }
                    }
                    return true;
                }
                throw new AssertionError();
            case 352:
                if (f14235a || objArr != null) {
                    return d((String) objArr[0]);
                }
                throw new AssertionError();
            case 353:
                if (f14235a || objArr != null) {
                    return b((String) objArr[0], (String) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue());
                }
                throw new AssertionError();
            case 354:
                if (f14235a || objArr != null) {
                    File file2 = new File((String) objArr[0]);
                    boolean b3 = b(e.q(), a((Iterable<a>) a(file2, "cst", 30), true, false).toString());
                    if (b3) {
                        g.b(file2);
                    }
                    return b3;
                }
                throw new AssertionError();
            default:
                return false;
        }
    }

    public static void a() {
        a(0, b.I() ? 700000L : 70000L);
    }

    private static void a(int i2, long j2) {
        if (b.G()) {
            f.a(0, new e(302, new Object[]{Integer.valueOf(i2)}), j2);
        }
    }

    public static boolean a(String str, String str2) {
        String str3;
        try {
            String str4 = "c_" + str.replaceAll("[^0-9a-zA-Z-_]", "-");
            if (g.a(str2)) {
                str3 = "";
            } else {
                str3 = str2.replaceAll("[`=]", "-");
            }
            Map<String, String> map = c;
            synchronized (map) {
                try {
                    if (map.get(str4) == null) {
                        int i2 = d;
                        if (i2 >= 20) {
                            return false;
                        }
                        d = i2 + 1;
                    }
                    map.put(str4, str3);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            g.a(th2);
            return false;
        }
    }

    public static void b(boolean z) {
        if (!a(z, "crash detail upload")) {
            String str = g.V() + "dt.wa";
            b.a(f, str, new e(352, new Object[]{str}));
            String n = n();
            b.a(g, n, new e(354, new Object[]{n}));
        }
    }

    private static boolean b(String str, String str2, boolean z, boolean z2) {
        a aVar;
        File file = new File(n());
        ArrayList<a> a2 = a(file, "cst", 30);
        String str3 = str + str2;
        Iterator<a> it = a2.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (str3.equals(aVar.b("prc") + aVar.b("typ"))) {
                break;
            }
        }
        if (aVar == null) {
            aVar = new a("cst", false, true);
            aVar.a("prc", str);
            aVar.a("typ", str2);
            a(aVar);
            a2.add(aVar);
        }
        aVar.a("cnt", 1L);
        if (z) {
            aVar.a("lim", 1L);
        }
        if (z2) {
            aVar.a("syu", 1L);
        }
        return g.a(file, a((Iterable<a>) a2, false, false).toString());
    }

    private static void a(a aVar) {
        Map<String, String> map = c;
        synchronized (map) {
            try {
                for (String str : map.keySet()) {
                    aVar.a(str, c.get(str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(boolean z) {
        a(1, z);
    }

    public static boolean a(boolean z, String str) {
        if (!b.d || z || !JNIBridge.nativeIsCrashing()) {
            return false;
        }
        com.uc.crashsdk.a.a.b("crashsdk", "Native is crashing, skip stat for " + str);
        return true;
    }

    private static void a(int i2, boolean z) {
        if (!a(z, "crash rate")) {
            String str = g.V() + "cr.wa";
            b.a(b, str, new e(351, new Object[]{str, Integer.valueOf(i2)}));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean b(java.lang.String r9, java.lang.String r10) {
        /*
            boolean r0 = com.uc.crashsdk.a.g.a(r10)
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            byte[] r10 = r10.getBytes()
            r0 = 16
            r2 = 8
            r3 = 0
            byte[] r0 = new byte[r0]     // Catch: all -> 0x003b
            byte[] r4 = com.uc.crashsdk.a.c.a()     // Catch: all -> 0x003b
            com.uc.crashsdk.a.c.a(r0, r3, r4)     // Catch: all -> 0x003b
            byte[] r4 = j()     // Catch: all -> 0x003b
            r5 = 4
            com.uc.crashsdk.a.c.a(r0, r5, r4)     // Catch: all -> 0x003b
            byte[] r4 = com.uc.crashsdk.a.f()     // Catch: all -> 0x003b
            com.uc.crashsdk.a.c.a(r0, r2, r4)     // Catch: all -> 0x003b
            byte[] r4 = com.uc.crashsdk.a.d.d()     // Catch: all -> 0x003b
            r5 = 12
            com.uc.crashsdk.a.c.a(r0, r5, r4)     // Catch: all -> 0x003b
            byte[] r0 = com.uc.crashsdk.a.c.a(r10, r0)     // Catch: all -> 0x003b
            if (r0 == 0) goto L_0x003f
            r10 = r0
            r0 = 1
            goto L_0x0040
        L_0x003b:
            r0 = move-exception
            com.uc.crashsdk.a.g.a(r0)
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r9 != 0) goto L_0x0045
            java.lang.String r9 = "unknown"
        L_0x0045:
            boolean r4 = com.uc.crashsdk.g.P()
            if (r4 == 0) goto L_0x004e
            java.lang.String r4 = "4ea4e41a3993"
            goto L_0x0050
        L_0x004e:
            java.lang.String r4 = "28ef1713347d"
        L_0x0050:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r9)
            r6.append(r5)
            java.lang.String r7 = "AppChk#2014"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = com.uc.crashsdk.a.g.d(r6)
            if (r6 != 0) goto L_0x0077
            r9 = 0
            goto L_0x00bb
        L_0x0077:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = p()
            r7.append(r8)
            java.lang.String r8 = "?chk="
            r7.append(r8)
            int r8 = r6.length()
            int r8 = r8 - r2
            int r2 = r6.length()
            java.lang.String r2 = r6.substring(r8, r2)
            r7.append(r2)
            java.lang.String r2 = "&vno="
            r7.append(r2)
            r7.append(r5)
            java.lang.String r2 = "&uuid="
            r7.append(r2)
            r7.append(r9)
            java.lang.String r9 = "&app="
            r7.append(r9)
            r7.append(r4)
            if (r0 == 0) goto L_0x00b7
            java.lang.String r9 = "&enc=aes"
            r7.append(r9)
        L_0x00b7:
            java.lang.String r9 = r7.toString()
        L_0x00bb:
            if (r9 != 0) goto L_0x00be
            return r3
        L_0x00be:
            byte[] r9 = com.uc.crashsdk.a.c.a(r9, r10)
            if (r9 != 0) goto L_0x00c5
            return r3
        L_0x00c5:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r9)
            java.lang.String r9 = "retcode=0"
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L_0x00d4
            return r1
        L_0x00d4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.h.b(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:18:0x0023, B:20:0x002e, B:22:0x0032, B:25:0x0038, B:27:0x0042, B:29:0x004a, B:31:0x0065, B:33:0x006a, B:38:0x0077, B:39:0x0080, B:44:0x008d, B:45:0x0097, B:47:0x00a3, B:50:0x00b1, B:52:0x00bb, B:53:0x00ce, B:54:0x00d5), top: B:65:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(int r9, java.lang.Object[] r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.h.a(int, java.lang.Object[]):void");
    }

    private static StringBuilder a(Iterable<a> iterable, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        boolean z3 = true;
        for (a aVar : iterable) {
            if (z3) {
                sb.append(aVar.a(z, z, z2));
                z3 = false;
            } else {
                sb.append(aVar.a(false, z, z2));
            }
        }
        return sb;
    }

    public static void b(String str) {
        synchronized (k) {
            l = str;
            String k2 = b.k();
            b.a(k2, str + "\n");
        }
    }

    public static void a(String str, int i2, int i3) {
        if (g.O()) {
            synchronized (f) {
                try {
                    Map<String, a> map = e;
                    a aVar = map.get(str);
                    if (aVar == null) {
                        aVar = new a("cst", false, true);
                        map.put(str, aVar);
                        a(aVar);
                    }
                    SparseArray<String> sparseArray = h;
                    synchronized (sparseArray) {
                        if (sparseArray.size() == 0) {
                            a(100, "pv");
                            a(102, "hpv");
                            a(1, "all");
                            a(2, "afg");
                            a(101, "abg");
                            a(3, "jfg");
                            a(4, "jbg");
                            a(7, "nfg");
                            a(8, "nbg");
                            a(27, "nafg");
                            a(28, "nabg");
                            a(9, "nho");
                            a(10, "uar");
                            a(29, "ulm");
                            a(30, "ukt");
                            a(31, "uet");
                            a(32, "urs");
                            a(11, "ufg");
                            a(12, "ubg");
                            a(40, "anf");
                            a(41, "anb");
                            a(42, "ancf");
                            a(43, "ancb");
                            a(44, "anff");
                            a(45, "anfb");
                            a(13, "lup");
                            a(14, "luf");
                            a(15, "lef");
                            a(200, "ltf");
                            a(16, "laf");
                            a(22, "lac");
                            a(23, "lau");
                            a(17, "llf");
                            a(18, "lul");
                            a(19, "lub");
                            a(20, "luc");
                            a(21, "luu");
                            a(24, "lzc");
                            a(201, "lec");
                            a(25, "lrc");
                            a(26, "lss");
                        }
                    }
                    String str2 = sparseArray.get(i2);
                    if (str2 == null) {
                        com.uc.crashsdk.a.a.a("crashsdk", "map key is not set with: " + i2, null);
                    }
                    aVar.a("prc", str);
                    if (str2 != null) {
                        aVar.a(str2, String.valueOf(i3));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static boolean a(String str, String str2, boolean z, boolean z2) {
        if (!g.O()) {
            return false;
        }
        return b.a(g, n(), new e(353, new Object[]{str, str2, Boolean.valueOf(z), Boolean.valueOf(z2)}));
    }

    private static void a(int i2, String str) {
        h.put(i2, str);
    }

    private static ArrayList<a> a(File file, String str, int i2) {
        ArrayList<String> a2 = g.a(file, i2);
        ArrayList<a> arrayList = new ArrayList<>();
        Iterator<String> it = a2.iterator();
        while (it.hasNext()) {
            a aVar = new a(str, false, false);
            if (aVar.c(it.next())) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
