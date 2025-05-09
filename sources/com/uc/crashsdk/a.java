package com.uc.crashsdk;

import android.content.pm.PackageInfo;
import android.util.SparseArray;
import com.uc.crashsdk.a.b;
import com.uc.crashsdk.a.e;
import com.uc.crashsdk.a.f;
import com.uc.crashsdk.a.g;
import com.uc.crashsdk.export.LogType;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f14228a = "";
    public static String b = "";
    static final /* synthetic */ boolean d = true;
    private static final Map<String, String> e = new HashMap();
    private static final List<String> f = new ArrayList();
    private static String g = "";
    private static String h = null;
    private static int i = -1;
    private static long j = 0;
    private static final HashMap<String, Object[]> k = new HashMap<>();
    private static final List<String> l = new ArrayList();
    private static int m = 0;
    private static int n = 0;
    private static int o = 0;
    private static int p = 0;
    private static final HashMap<String, Object[]> q = new HashMap<>();
    private static final List<String> r = new ArrayList();
    private static int s = 0;
    private static int t = 0;
    private static int u = 0;
    private static int v = 0;
    private static int w = 0;
    private static int x = 0;
    private static final SparseArray<Object[]> y = new SparseArray<>();
    private static final List<Integer> z = new ArrayList();
    private static final HashMap<String, Object[]> A = new HashMap<>();
    private static final List<String> B = new ArrayList();
    private static int C = 0;
    private static int D = 0;
    private static int E = 0;
    static boolean c = false;
    private static Runnable F = new e(201);
    private static boolean G = false;
    private static boolean H = false;
    private static boolean I = false;

    public static String a() {
        String str = h;
        if (str != null) {
            return str;
        }
        if (o()) {
            return h;
        }
        return "";
    }

    public static long b() {
        return j;
    }

    public static int c() {
        if (i == -1) {
            o();
        }
        return i;
    }

    public static void d() {
        StringBuilder sb = new StringBuilder();
        synchronized (e) {
            try {
                for (String str : f) {
                    String str2 = e.get(str);
                    sb.append(str);
                    sb.append(": ");
                    if (str2 != null) {
                        sb.append(str2);
                    }
                    sb.append("\n");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Locale locale = Locale.US;
        String n2 = e.n();
        sb.append("(saved at " + n2 + ")\n");
        b.a(b.h(), sb.toString());
    }

    public static void e() {
        if (d || b.d) {
            synchronized (e) {
                try {
                    for (String str : f) {
                        JNIBridge.nativeAddHeaderInfo(str, e.get(str));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new AssertionError();
    }

    public static byte[] f() {
        return new byte[]{24, 99, 121, 60};
    }

    public static void g() {
        if (d || b.d) {
            synchronized (k) {
                try {
                    for (String str : l) {
                        Object[] objArr = k.get(str);
                        int intValue = ((Integer) objArr[0]).intValue();
                        if ((1048833 & intValue) != 0) {
                            JNIBridge.nativeAddDumpFile(str, (String) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), intValue, ((Boolean) objArr[4]).booleanValue());
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new AssertionError();
    }

    public static String h() {
        StringBuilder sb = new StringBuilder();
        synchronized (k) {
            try {
                boolean z2 = true;
                for (String str : l) {
                    if (LogType.isForJava(((Integer) k.get(str)[0]).intValue())) {
                        if (!z2) {
                            sb.append("`");
                        }
                        sb.append(str);
                        z2 = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb.toString();
    }

    public static void i() {
        if (d || b.d) {
            synchronized (q) {
                try {
                    for (String str : r) {
                        Object[] objArr = q.get(str);
                        int intValue = ((Integer) objArr[0]).intValue();
                        if ((1048833 & intValue) != 0) {
                            JNIBridge.nativeAddCallbackInfo(str, intValue, ((Long) objArr[2]).longValue(), ((Integer) objArr[3]).intValue());
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new AssertionError();
    }

    public static String j() {
        String sb;
        synchronized (q) {
            StringBuilder sb2 = new StringBuilder();
            List<String> list = r;
            synchronized (list) {
                boolean z2 = true;
                for (String str : list) {
                    if (LogType.isForJava(((Integer) q.get(str)[0]).intValue())) {
                        if (!z2) {
                            sb2.append("`");
                        }
                        sb2.append(str);
                        z2 = false;
                    }
                }
            }
            sb = sb2.toString();
        }
        return sb;
    }

    public static void k() {
        if (d || b.d) {
            synchronized (A) {
                try {
                    for (String str : B) {
                        Object[] objArr = A.get(str);
                        int intValue = ((Integer) objArr[0]).intValue();
                        int intValue2 = ((Integer) objArr[1]).intValue();
                        List list = (List) objArr[2];
                        if (!((1048577 & intValue2) == 0 || JNIBridge.nativeCreateCachedInfo(str, intValue, intValue2) == 0)) {
                            Iterator it = list.iterator();
                            while (it.hasNext() && JNIBridge.nativeAddCachedInfo(str, (String) it.next())) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new AssertionError();
    }

    public static String l() {
        StringBuilder sb = new StringBuilder();
        synchronized (A) {
            try {
                boolean z2 = true;
                for (String str : B) {
                    if (LogType.isForJava(((Integer) A.get(str)[1]).intValue())) {
                        if (!z2) {
                            sb.append("`");
                        }
                        sb.append(str);
                        z2 = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb.toString();
    }

    public static String m() {
        if (!G) {
            String a2 = b.a(b.m());
            g = a2;
            G = true;
            if (a2 == null) {
                g = "";
            }
        }
        return g;
    }

    public static void n() {
        p();
        if (!H) {
            H = true;
            f.a(0, new e(202));
        } else if (b.d) {
            JNIBridge.set(128, g);
        }
    }

    private static boolean o() {
        try {
            PackageInfo packageInfo = g.a().getPackageManager().getPackageInfo(f14228a, 0);
            h = packageInfo.versionName;
            j = packageInfo.lastUpdateTime;
            i = packageInfo.versionCode;
            return true;
        } catch (Throwable th) {
            g.b(th);
            return false;
        }
    }

    private static void p() {
        if (I || !e.a()) {
            return;
        }
        if (b.d || !b.g) {
            Locale locale = Locale.US;
            com.uc.crashsdk.a.a.b("crashsdk", "UUID: " + e.q());
            com.uc.crashsdk.a.a.b("crashsdk", "Version: ".concat(g.S() + "/" + g.T() + "/" + g.U()));
            com.uc.crashsdk.a.a.b("crashsdk", "Process Name: " + e.h());
            I = true;
        }
    }

    private static StringBuilder b(String str, boolean z2) {
        String str2;
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr = q.get(str);
            if (objArr == null) {
                str2 = "Unknown callback: " + str;
            } else {
                Callable callable = (Callable) objArr[1];
                if (callable != null) {
                    str2 = (String) callable.call();
                } else {
                    str2 = d.a(str, z2);
                }
            }
            if (str2 != null) {
                sb.append(str2);
            }
        } catch (Throwable th) {
            g.a(th);
        }
        try {
            if (sb.length() == 0) {
                sb.append("(data is null)\n");
            }
        } catch (Throwable th2) {
            g.a(th2);
        }
        return sb;
    }

    public static ArrayList<String> c(String str) {
        if (g.a(str)) {
            return null;
        }
        String[] split = str.split(";", 20);
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : split) {
            if (!g.a(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static void a(String str, String str2) {
        Map<String, String> map = e;
        synchronized (map) {
            try {
                if (!map.containsKey(str)) {
                    f.add(str);
                }
                map.put(str, str2);
                if (b.d) {
                    JNIBridge.nativeAddHeaderInfo(str, str2);
                }
                e.y();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(OutputStream outputStream, String str) {
        synchronized (e) {
            try {
                for (String str2 : f) {
                    StringBuilder sb = new StringBuilder(11);
                    sb.append(str2);
                    sb.append(": ");
                    String str3 = e.get(str2);
                    if (str3 != null) {
                        sb.append(str3);
                    }
                    sb.append("\n");
                    outputStream.write(sb.toString().getBytes(str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int b(String str, String str2) {
        int i2 = 0;
        if (str == null || str2 == null) {
            return 0;
        }
        if (str2.length() > 2048) {
            str2 = str2.substring(0, 2048);
        }
        HashMap<String, Object[]> hashMap = A;
        synchronized (hashMap) {
            try {
                Object[] objArr = hashMap.get(str);
                if (objArr != null) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int intValue2 = ((Integer) objArr[1]).intValue();
                    List list = (List) objArr[2];
                    if (list.size() >= intValue) {
                        list.remove(0);
                    }
                    list.add(str2);
                    if (LogType.isForJava(intValue2)) {
                        i2 = LogType.addType(0, 16);
                    }
                    if (!b.d) {
                        if (LogType.isForNative(intValue2)) {
                            i2 = LogType.addType(i2, 1);
                        }
                        if (LogType.isForANR(intValue2)) {
                            i2 = LogType.addType(i2, 1048576);
                        }
                    }
                    i2 = intValue2;
                } else {
                    i2 = 0;
                }
                if (b.d && JNIBridge.nativeAddCachedInfo(str, str2)) {
                    if (LogType.isForNative(i2)) {
                        i2 = LogType.addType(i2, 1);
                    }
                    if (LogType.isForANR(i2)) {
                        i2 = LogType.addType(i2, 1048576);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    public static int a(String str, String str2, boolean z2, boolean z3, int i2, boolean z4) {
        int i3;
        int i4;
        if (str == null || str2 == null) {
            return 0;
        }
        if (str.length() > 256) {
            com.uc.crashsdk.a.a.a("crashsdk", "addDumpFile: description is too long!", null);
            return 0;
        }
        HashMap<String, Object[]> hashMap = k;
        synchronized (hashMap) {
            try {
                if (hashMap.containsKey(str)) {
                    i4 = ((Integer) hashMap.get(str)[0]).intValue();
                    i3 = LogType.addType(i4, i2);
                } else {
                    i3 = i2;
                    i4 = 0;
                }
                if (LogType.isForJava(i3) && !LogType.isForJava(i4)) {
                    int i5 = m;
                    if (i5 >= 10) {
                        i3 = LogType.removeType(i3, 16);
                    } else {
                        m = i5 + 1;
                    }
                }
                if (LogType.isForNative(i3) && !LogType.isForNative(i4)) {
                    int i6 = n;
                    if (i6 >= 10) {
                        i3 = LogType.removeType(i3, 1);
                    } else {
                        n = i6 + 1;
                    }
                }
                if (LogType.isForUnexp(i3) && !LogType.isForUnexp(i4)) {
                    int i7 = o;
                    if (i7 >= 10) {
                        i3 = LogType.removeType(i3, 256);
                    } else {
                        o = i7 + 1;
                    }
                }
                if (LogType.isForANR(i3) && !LogType.isForANR(i4)) {
                    int i8 = p;
                    if (i8 >= 10) {
                        i3 = LogType.removeType(i3, 1048576);
                    } else {
                        p = i8 + 1;
                    }
                }
                if ((1048849 & i3) == 0) {
                    return i3;
                }
                if (i4 == 0) {
                    l.add(str);
                }
                if (b.d && (1048833 & i2) != 0) {
                    int nativeAddDumpFile = JNIBridge.nativeAddDumpFile(str, str2, z2, z3, i2, z4);
                    if (!LogType.isForNative(nativeAddDumpFile)) {
                        i3 = LogType.removeType(i3, 1);
                    }
                    if (!LogType.isForUnexp(nativeAddDumpFile)) {
                        i3 = LogType.removeType(i3, 256);
                    }
                    if (!LogType.isForANR(nativeAddDumpFile)) {
                        i3 = LogType.removeType(i3, 1048576);
                    }
                }
                hashMap.put(str, new Object[]{Integer.valueOf(i3), str2, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4)});
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[Catch: all -> 0x0099, LOOP:1: B:18:0x007c->B:20:0x0082, LOOP_END, TRY_LEAVE, TryCatch #2 {all -> 0x003c, blocks: (B:4:0x0003, B:5:0x0009, B:7:0x000f, B:9:0x0035, B:14:0x003f, B:23:0x00b7, B:25:0x00bd, B:26:0x00c1, B:28:0x00c7, B:30:0x00d5, B:31:0x00db, B:16:0x0045, B:17:0x0078, B:18:0x007c, B:20:0x0082, B:21:0x009d), top: B:35:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(java.io.OutputStream r7, java.lang.String r8, java.lang.String r9, java.util.ArrayList<java.lang.String> r10) {
        /*
            java.util.HashMap<java.lang.String, java.lang.Object[]> r0 = com.uc.crashsdk.a.A
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = com.uc.crashsdk.a.B     // Catch: all -> 0x003c
            java.util.Iterator r1 = r1.iterator()     // Catch: all -> 0x003c
        L_0x0009:
            boolean r2 = r1.hasNext()     // Catch: all -> 0x003c
            if (r2 == 0) goto L_0x00b5
            java.lang.Object r2 = r1.next()     // Catch: all -> 0x003c
            java.lang.String r2 = (java.lang.String) r2     // Catch: all -> 0x003c
            java.util.HashMap<java.lang.String, java.lang.Object[]> r3 = com.uc.crashsdk.a.A     // Catch: all -> 0x003c
            java.lang.Object r3 = r3.get(r2)     // Catch: all -> 0x003c
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch: all -> 0x003c
            r4 = 0
            r4 = r3[r4]     // Catch: all -> 0x003c
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: all -> 0x003c
            r4.intValue()     // Catch: all -> 0x003c
            r5 = 1
            r5 = r3[r5]     // Catch: all -> 0x003c
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: all -> 0x003c
            int r5 = r5.intValue()     // Catch: all -> 0x003c
            r6 = 2
            r3 = r3[r6]     // Catch: all -> 0x003c
            java.util.List r3 = (java.util.List) r3     // Catch: all -> 0x003c
            if (r10 != 0) goto L_0x003f
            boolean r5 = com.uc.crashsdk.export.LogType.isForJava(r5)     // Catch: all -> 0x003c
            if (r5 != 0) goto L_0x0045
            goto L_0x0009
        L_0x003c:
            r7 = move-exception
            goto L_0x00dd
        L_0x003f:
            boolean r5 = a(r10, r2)     // Catch: all -> 0x003c
            if (r5 == 0) goto L_0x0009
        L_0x0045:
            java.util.Locale r5 = java.util.Locale.US     // Catch: all -> 0x0074
            int r5 = r3.size()     // Catch: all -> 0x0074
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x0074
            r6.<init>()     // Catch: all -> 0x0074
            r6.append(r2)     // Catch: all -> 0x0074
            java.lang.String r2 = " ("
            r6.append(r2)     // Catch: all -> 0x0074
            r6.append(r5)     // Catch: all -> 0x0074
            java.lang.String r2 = "/"
            r6.append(r2)     // Catch: all -> 0x0074
            r6.append(r4)     // Catch: all -> 0x0074
            java.lang.String r2 = ")\n"
            r6.append(r2)     // Catch: all -> 0x0074
            java.lang.String r2 = r6.toString()     // Catch: all -> 0x0074
            byte[] r2 = r2.getBytes(r8)     // Catch: all -> 0x0074
            r7.write(r2)     // Catch: all -> 0x0074
            goto L_0x0078
        L_0x0074:
            r2 = move-exception
            com.uc.crashsdk.e.a(r2, r7)     // Catch: all -> 0x003c
        L_0x0078:
            java.util.Iterator r2 = r3.iterator()     // Catch: all -> 0x0099
        L_0x007c:
            boolean r3 = r2.hasNext()     // Catch: all -> 0x0099
            if (r3 == 0) goto L_0x009d
            java.lang.Object r3 = r2.next()     // Catch: all -> 0x0099
            java.lang.String r3 = (java.lang.String) r3     // Catch: all -> 0x0099
            byte[] r3 = r3.getBytes(r8)     // Catch: all -> 0x0099
            r7.write(r3)     // Catch: all -> 0x0099
            java.lang.String r3 = "\n"
            byte[] r3 = r3.getBytes(r8)     // Catch: all -> 0x0099
            r7.write(r3)     // Catch: all -> 0x0099
            goto L_0x007c
        L_0x0099:
            r2 = move-exception
            com.uc.crashsdk.e.a(r2, r7)     // Catch: all -> 0x003c
        L_0x009d:
            java.lang.String r2 = "\n"
            byte[] r2 = r2.getBytes(r8)     // Catch: all -> 0x00af
            r7.write(r2)     // Catch: all -> 0x00af
            byte[] r2 = r9.getBytes(r8)     // Catch: all -> 0x00af
            r7.write(r2)     // Catch: all -> 0x00af
            goto L_0x0009
        L_0x00af:
            r2 = move-exception
            com.uc.crashsdk.e.a(r2, r7)     // Catch: all -> 0x003c
            goto L_0x0009
        L_0x00b5:
            if (r10 == 0) goto L_0x00db
            boolean r8 = com.uc.crashsdk.e.F()     // Catch: all -> 0x003c
            if (r8 == 0) goto L_0x00db
            java.util.Iterator r8 = r10.iterator()     // Catch: all -> 0x003c
        L_0x00c1:
            boolean r9 = r8.hasNext()     // Catch: all -> 0x003c
            if (r9 == 0) goto L_0x00db
            java.lang.Object r9 = r8.next()     // Catch: all -> 0x003c
            java.lang.String r9 = (java.lang.String) r9     // Catch: all -> 0x003c
            java.util.List<java.lang.String> r10 = com.uc.crashsdk.a.B     // Catch: all -> 0x003c
            boolean r10 = a(r10, r9)     // Catch: all -> 0x003c
            if (r10 != 0) goto L_0x00c1
            java.lang.String r10 = "CUSTOMCACHEDINFO"
            com.uc.crashsdk.e.a(r7, r10, r9)     // Catch: all -> 0x003c
            goto L_0x00c1
        L_0x00db:
            monitor-exit(r0)     // Catch: all -> 0x003c
            return
        L_0x00dd:
            monitor-exit(r0)     // Catch: all -> 0x003c
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.b(java.io.OutputStream, java.lang.String, java.lang.String, java.util.ArrayList):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #3 {all -> 0x003e, blocks: (B:12:0x0025, B:14:0x002f, B:19:0x0043, B:22:0x004a, B:24:0x0055), top: B:73:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb A[Catch: all -> 0x00b5, TryCatch #2 {all -> 0x00b5, blocks: (B:34:0x0084, B:36:0x00a0, B:38:0x00a8, B:43:0x00bb, B:44:0x00bf, B:45:0x00c2), top: B:71:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #2 {all -> 0x00b5, blocks: (B:34:0x0084, B:36:0x00a0, B:38:0x00a8, B:43:0x00bb, B:44:0x00bf, B:45:0x00c2), top: B:71:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0019 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.io.OutputStream r18, java.lang.String r19, java.util.ArrayList<java.lang.String> r20) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.a(java.io.OutputStream, java.lang.String, java.util.ArrayList):void");
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        HashMap<String, Object[]> hashMap = A;
        synchronized (hashMap) {
            try {
                Object[] objArr = hashMap.get(str);
                Integer num = (Integer) objArr[0];
                num.intValue();
                List<String> list = (List) objArr[2];
                Locale locale = Locale.US;
                int size = list.size();
                sb.append(str + " (" + size + "/" + num + ")\n");
                for (String str2 : list) {
                    sb.append(str2);
                    sb.append("\n");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb.toString();
    }

    public static String a(String str) {
        HashMap<String, Object[]> hashMap = k;
        synchronized (hashMap) {
            try {
                Object[] objArr = hashMap.get(str);
                if (objArr == null) {
                    return null;
                }
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
                Locale locale = Locale.US;
                return ((String) objArr[1]) + "`" + (booleanValue ? 1 : 0) + (booleanValue2 ? 1 : 0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean a(List<String> list, String str) {
        if (g.a(str)) {
            return false;
        }
        for (String str2 : list) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        if ((r10 - com.uc.crashsdk.a.w) >= 6) goto L_0x0059;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:7:0x000f, B:9:0x0015, B:11:0x0029, B:16:0x0030, B:18:0x0039, B:20:0x003f, B:25:0x004a, B:28:0x004f, B:29:0x0053, B:31:0x0059, B:32:0x0060, B:33:0x0063, B:35:0x0069, B:37:0x006f, B:43:0x007b, B:46:0x0080, B:47:0x008a, B:50:0x0091, B:52:0x0099, B:54:0x00a0, B:56:0x00a8, B:58:0x00ae, B:60:0x00b2, B:62:0x00b8, B:63:0x00bc, B:65:0x00c4, B:67:0x00ca, B:69:0x00ce, B:71:0x00d4, B:72:0x00d8, B:74:0x00de, B:77:0x00e2, B:78:0x00e7, B:80:0x00eb, B:82:0x00f1, B:84:0x00fd, B:86:0x0103, B:88:0x010a, B:89:0x010f, B:91:0x0115, B:93:0x011b, B:94:0x0120, B:96:0x0126, B:98:0x012c, B:100:0x0134, B:101:0x0150), top: B:105:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:7:0x000f, B:9:0x0015, B:11:0x0029, B:16:0x0030, B:18:0x0039, B:20:0x003f, B:25:0x004a, B:28:0x004f, B:29:0x0053, B:31:0x0059, B:32:0x0060, B:33:0x0063, B:35:0x0069, B:37:0x006f, B:43:0x007b, B:46:0x0080, B:47:0x008a, B:50:0x0091, B:52:0x0099, B:54:0x00a0, B:56:0x00a8, B:58:0x00ae, B:60:0x00b2, B:62:0x00b8, B:63:0x00bc, B:65:0x00c4, B:67:0x00ca, B:69:0x00ce, B:71:0x00d4, B:72:0x00d8, B:74:0x00de, B:77:0x00e2, B:78:0x00e7, B:80:0x00eb, B:82:0x00f1, B:84:0x00fd, B:86:0x0103, B:88:0x010a, B:89:0x010f, B:91:0x0115, B:93:0x011b, B:94:0x0120, B:96:0x0126, B:98:0x012c, B:100:0x0134, B:101:0x0150), top: B:105:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:7:0x000f, B:9:0x0015, B:11:0x0029, B:16:0x0030, B:18:0x0039, B:20:0x003f, B:25:0x004a, B:28:0x004f, B:29:0x0053, B:31:0x0059, B:32:0x0060, B:33:0x0063, B:35:0x0069, B:37:0x006f, B:43:0x007b, B:46:0x0080, B:47:0x008a, B:50:0x0091, B:52:0x0099, B:54:0x00a0, B:56:0x00a8, B:58:0x00ae, B:60:0x00b2, B:62:0x00b8, B:63:0x00bc, B:65:0x00c4, B:67:0x00ca, B:69:0x00ce, B:71:0x00d4, B:72:0x00d8, B:74:0x00de, B:77:0x00e2, B:78:0x00e7, B:80:0x00eb, B:82:0x00f1, B:84:0x00fd, B:86:0x0103, B:88:0x010a, B:89:0x010f, B:91:0x0115, B:93:0x011b, B:94:0x0120, B:96:0x0126, B:98:0x012c, B:100:0x0134, B:101:0x0150), top: B:105:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de A[Catch: all -> 0x002b, DONT_GENERATE, TryCatch #0 {all -> 0x002b, blocks: (B:7:0x000f, B:9:0x0015, B:11:0x0029, B:16:0x0030, B:18:0x0039, B:20:0x003f, B:25:0x004a, B:28:0x004f, B:29:0x0053, B:31:0x0059, B:32:0x0060, B:33:0x0063, B:35:0x0069, B:37:0x006f, B:43:0x007b, B:46:0x0080, B:47:0x008a, B:50:0x0091, B:52:0x0099, B:54:0x00a0, B:56:0x00a8, B:58:0x00ae, B:60:0x00b2, B:62:0x00b8, B:63:0x00bc, B:65:0x00c4, B:67:0x00ca, B:69:0x00ce, B:71:0x00d4, B:72:0x00d8, B:74:0x00de, B:77:0x00e2, B:78:0x00e7, B:80:0x00eb, B:82:0x00f1, B:84:0x00fd, B:86:0x0103, B:88:0x010a, B:89:0x010f, B:91:0x0115, B:93:0x011b, B:94:0x0120, B:96:0x0126, B:98:0x012c, B:100:0x0134, B:101:0x0150), top: B:105:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.String r16, int r17, java.util.concurrent.Callable<java.lang.String> r18, long r19, int r21) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.a(java.lang.String, int, java.util.concurrent.Callable, long, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[Catch: all -> 0x002f, TryCatch #2 {all -> 0x00aa, blocks: (B:4:0x0003, B:5:0x0009, B:7:0x000f, B:29:0x00ae, B:31:0x00b4, B:32:0x00b8, B:34:0x00be, B:36:0x00cc, B:37:0x00d2, B:25:0x0092, B:8:0x0015, B:10:0x0028, B:13:0x0031, B:16:0x0038, B:18:0x005f, B:19:0x006d, B:21:0x0077, B:23:0x007d, B:24:0x0085), top: B:41:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[Catch: all -> 0x002f, TryCatch #2 {all -> 0x00aa, blocks: (B:4:0x0003, B:5:0x0009, B:7:0x000f, B:29:0x00ae, B:31:0x00b4, B:32:0x00b8, B:34:0x00be, B:36:0x00cc, B:37:0x00d2, B:25:0x0092, B:8:0x0015, B:10:0x0028, B:13:0x0031, B:16:0x0038, B:18:0x005f, B:19:0x006d, B:21:0x0077, B:23:0x007d, B:24:0x0085), top: B:41:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.io.OutputStream r10, java.lang.String r11, java.lang.String r12, java.util.ArrayList<java.lang.String> r13) {
        /*
            java.util.HashMap<java.lang.String, java.lang.Object[]> r0 = com.uc.crashsdk.a.q
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = com.uc.crashsdk.a.r     // Catch: all -> 0x00aa
            java.util.Iterator r1 = r1.iterator()     // Catch: all -> 0x00aa
        L_0x0009:
            boolean r2 = r1.hasNext()     // Catch: all -> 0x00aa
            if (r2 == 0) goto L_0x00ac
            java.lang.Object r2 = r1.next()     // Catch: all -> 0x00aa
            java.lang.String r2 = (java.lang.String) r2     // Catch: all -> 0x00aa
            java.util.HashMap<java.lang.String, java.lang.Object[]> r3 = com.uc.crashsdk.a.q     // Catch: all -> 0x002f
            java.lang.Object r3 = r3.get(r2)     // Catch: all -> 0x002f
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch: all -> 0x002f
            r4 = 0
            r5 = r3[r4]     // Catch: all -> 0x002f
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: all -> 0x002f
            int r5 = r5.intValue()     // Catch: all -> 0x002f
            if (r13 != 0) goto L_0x0031
            boolean r5 = com.uc.crashsdk.export.LogType.isForJava(r5)     // Catch: all -> 0x002f
            if (r5 != 0) goto L_0x0038
            goto L_0x0009
        L_0x002f:
            r2 = move-exception
            goto L_0x008f
        L_0x0031:
            boolean r5 = a(r13, r2)     // Catch: all -> 0x002f
            if (r5 != 0) goto L_0x0038
            goto L_0x0009
        L_0x0038:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: all -> 0x002f
            r5.<init>()     // Catch: all -> 0x002f
            r5.append(r2)     // Catch: all -> 0x002f
            java.lang.String r6 = "\n"
            r5.append(r6)     // Catch: all -> 0x002f
            java.lang.String r5 = r5.toString()     // Catch: all -> 0x002f
            byte[] r5 = r5.getBytes(r11)     // Catch: all -> 0x002f
            r10.write(r5)     // Catch: all -> 0x002f
            r5 = 2
            r5 = r3[r5]     // Catch: all -> 0x002f
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: all -> 0x002f
            long r5 = r5.longValue()     // Catch: all -> 0x002f
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x006d
            r7 = 3
            r3 = r3[r7]     // Catch: all -> 0x002f
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: all -> 0x002f
            int r3 = r3.intValue()     // Catch: all -> 0x002f
            java.lang.String r2 = com.uc.crashsdk.JNIBridge.nativeGetCallbackInfo(r2, r5, r3, r4)     // Catch: all -> 0x002f
            goto L_0x0075
        L_0x006d:
            java.lang.StringBuilder r2 = b(r2, r4)     // Catch: all -> 0x002f
            java.lang.String r2 = r2.toString()     // Catch: all -> 0x002f
        L_0x0075:
            if (r2 == 0) goto L_0x0085
            int r3 = r2.length()     // Catch: all -> 0x002f
            if (r3 <= 0) goto L_0x0085
            byte[] r2 = r2.getBytes(r11)     // Catch: all -> 0x002f
            r10.write(r2)     // Catch: all -> 0x002f
            goto L_0x0092
        L_0x0085:
            java.lang.String r2 = "(data is null)\n"
            byte[] r2 = r2.getBytes(r11)     // Catch: all -> 0x002f
            r10.write(r2)     // Catch: all -> 0x002f
            goto L_0x0092
        L_0x008f:
            com.uc.crashsdk.e.a(r2, r10)     // Catch: all -> 0x00aa
        L_0x0092:
            java.lang.String r2 = "\n"
            byte[] r2 = r2.getBytes(r11)     // Catch: all -> 0x00a4
            r10.write(r2)     // Catch: all -> 0x00a4
            byte[] r2 = r12.getBytes(r11)     // Catch: all -> 0x00a4
            r10.write(r2)     // Catch: all -> 0x00a4
            goto L_0x0009
        L_0x00a4:
            r2 = move-exception
            com.uc.crashsdk.e.a(r2, r10)     // Catch: all -> 0x00aa
            goto L_0x0009
        L_0x00aa:
            r10 = move-exception
            goto L_0x00d4
        L_0x00ac:
            if (r13 == 0) goto L_0x00d2
            boolean r11 = com.uc.crashsdk.e.F()     // Catch: all -> 0x00aa
            if (r11 == 0) goto L_0x00d2
            java.util.Iterator r11 = r13.iterator()     // Catch: all -> 0x00aa
        L_0x00b8:
            boolean r12 = r11.hasNext()     // Catch: all -> 0x00aa
            if (r12 == 0) goto L_0x00d2
            java.lang.Object r12 = r11.next()     // Catch: all -> 0x00aa
            java.lang.String r12 = (java.lang.String) r12     // Catch: all -> 0x00aa
            java.util.List<java.lang.String> r13 = com.uc.crashsdk.a.r     // Catch: all -> 0x00aa
            boolean r13 = a(r13, r12)     // Catch: all -> 0x00aa
            if (r13 != 0) goto L_0x00b8
            java.lang.String r13 = "CUSTOMCALLBACKINFO"
            com.uc.crashsdk.e.a(r10, r13, r12)     // Catch: all -> 0x00aa
            goto L_0x00b8
        L_0x00d2:
            monitor-exit(r0)     // Catch: all -> 0x00aa
            return
        L_0x00d4:
            monitor-exit(r0)     // Catch: all -> 0x00aa
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.a(java.io.OutputStream, java.lang.String, java.lang.String, java.util.ArrayList):void");
    }

    public static String a(String str, boolean z2) {
        String str2;
        HashMap<String, Object[]> hashMap = q;
        synchronized (hashMap) {
            try {
                Object[] objArr = hashMap.get(str);
                long longValue = ((Long) objArr[2]).longValue();
                if (longValue != 0) {
                    str2 = JNIBridge.nativeGetCallbackInfo(str, longValue, ((Integer) objArr[3]).intValue(), z2);
                } else {
                    str2 = b(str, z2).toString();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    private static boolean a(String str, Thread thread) {
        if (thread == null) {
            return false;
        }
        SparseArray<Object[]> sparseArray = y;
        synchronized (sparseArray) {
            try {
                int id = (int) thread.getId();
                if (sparseArray.get(id) == null) {
                    z.add(Integer.valueOf(id));
                }
                sparseArray.put(id, new Object[]{new WeakReference(thread), str});
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec A[Catch: all -> 0x00f6, TryCatch #5 {all -> 0x0146, blocks: (B:4:0x0003, B:5:0x000d, B:7:0x0013, B:22:0x0064, B:42:0x0148, B:39:0x012e, B:24:0x0068, B:28:0x0094, B:29:0x00e5, B:31:0x00ec, B:32:0x00f8, B:34:0x00fc, B:36:0x0100, B:37:0x0109), top: B:50:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fc A[Catch: all -> 0x00f6, TryCatch #5 {all -> 0x0146, blocks: (B:4:0x0003, B:5:0x000d, B:7:0x0013, B:22:0x0064, B:42:0x0148, B:39:0x012e, B:24:0x0068, B:28:0x0094, B:29:0x00e5, B:31:0x00ec, B:32:0x00f8, B:34:0x00fc, B:36:0x0100, B:37:0x0109), top: B:50:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.io.OutputStream r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.a(java.io.OutputStream, java.lang.String, java.lang.String):void");
    }

    public static int a(String str, int i2, int i3) {
        int i4;
        int i5;
        if (str == null || i2 <= 0) {
            return 0;
        }
        if (i2 > 1500) {
            com.uc.crashsdk.a.a.a("crashsdk", "createCachedInfo: capacity is too large!", null);
            return 0;
        }
        HashMap<String, Object[]> hashMap = A;
        synchronized (hashMap) {
            try {
                if (hashMap.containsKey(str)) {
                    i5 = ((Integer) hashMap.get(str)[1]).intValue();
                    i4 = LogType.addType(i5, i3);
                } else {
                    i4 = i3;
                    i5 = 0;
                }
                if (LogType.isForJava(i4) && !LogType.isForJava(i5)) {
                    int i6 = C;
                    if (i6 >= 8) {
                        i4 = LogType.removeType(i4, 16);
                    } else {
                        C = i6 + 1;
                    }
                }
                if (LogType.isForNative(i4) && !LogType.isForNative(i5)) {
                    int i7 = D;
                    if (i7 >= 8) {
                        i4 = LogType.removeType(i4, 1);
                    } else {
                        D = i7 + 1;
                    }
                }
                if (LogType.isForANR(i4) && !LogType.isForANR(i5)) {
                    int i8 = E;
                    if (i8 >= 8) {
                        i4 = LogType.removeType(i4, 1048576);
                    } else {
                        E = i8 + 1;
                    }
                }
                if ((1048849 & i4) == 0) {
                    return i4;
                }
                if (i5 == 0) {
                    B.add(str);
                }
                if (b.d && (i3 & 1048577) != 0) {
                    int nativeCreateCachedInfo = JNIBridge.nativeCreateCachedInfo(str, i2, i4);
                    if (!LogType.isForNative(nativeCreateCachedInfo)) {
                        i4 = LogType.removeType(i4, 1);
                    }
                    if (!LogType.isForANR(nativeCreateCachedInfo)) {
                        i4 = LogType.removeType(i4, 1048576);
                    }
                }
                hashMap.put(str, new Object[]{Integer.valueOf(i2), Integer.valueOf(i4), new ArrayList()});
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(int r5, java.lang.String r6) {
        /*
            boolean r0 = com.uc.crashsdk.a.g.a(r6)
            if (r0 == 0) goto L_0x000e
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
        L_0x000e:
            boolean r0 = com.uc.crashsdk.export.LogType.isForNative(r5)
            if (r0 != 0) goto L_0x001a
            boolean r0 = com.uc.crashsdk.export.LogType.isForANR(r5)
            if (r0 == 0) goto L_0x0042
        L_0x001a:
            boolean r0 = com.uc.crashsdk.b.d
            r1 = 0
            if (r0 == 0) goto L_0x0039
            android.util.SparseArray<java.lang.Object[]> r0 = com.uc.crashsdk.a.y
            monitor-enter(r0)
            r2 = 4
            long r3 = (long) r5
            com.uc.crashsdk.JNIBridge.nativeCmd(r2, r3, r6, r1)     // Catch: all -> 0x0036
            monitor-exit(r0)     // Catch: all -> 0x0036
            boolean r0 = com.uc.crashsdk.export.LogType.isForNative(r5)
            boolean r1 = com.uc.crashsdk.export.LogType.isForANR(r5)
            if (r1 == 0) goto L_0x0043
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 | r1
            goto L_0x0043
        L_0x0036:
            r5 = move-exception
            monitor-exit(r0)     // Catch: all -> 0x0036
            throw r5
        L_0x0039:
            java.lang.String r0 = "crashsdk so has not loaded!"
            java.lang.String r2 = "crashsdk"
            com.uc.crashsdk.a.a.a(r2, r0, r1)
        L_0x0042:
            r0 = 0
        L_0x0043:
            boolean r5 = com.uc.crashsdk.export.LogType.isForJava(r5)
            if (r5 == 0) goto L_0x0052
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            a(r6, r5)
            r0 = r0 | 16
        L_0x0052:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.a(int, java.lang.String):int");
    }

    public static boolean a(boolean z2) {
        int i2;
        if (!b.c) {
            com.uc.crashsdk.a.a.a("crashsdk", "Unexp log not enabled, skip update unexp info!");
            return false;
        } else if (e.F() || b.M()) {
            return false;
        } else {
            if (z2) {
                f.a(F);
                i2 = 0;
            } else if (!b.C()) {
                com.uc.crashsdk.a.a.a("crashsdk", "Stop update unexp info in background!");
                return false;
            } else if (g.E() <= 0) {
                return false;
            } else {
                if (f.b(F)) {
                    return true;
                }
                i2 = g.E() * 1000;
            }
            f.a(0, F, i2);
            return true;
        }
    }

    public static void a(int i2) {
        if (i2 == 201) {
            com.uc.crashsdk.a.a.a("crashsdk", "Begin update info ...");
            long currentTimeMillis = System.currentTimeMillis();
            if (b.d && c) {
                JNIBridge.nativeCmd(11, g.E(), String.valueOf(g.F()), null);
            }
            com.uc.crashsdk.a.a.a("crashsdk", "Update info took " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            a(false);
        } else if (i2 == 202) {
            p();
            Locale locale = Locale.US;
            String str = g.S() + "/" + g.T() + "/" + g.U();
            g = m();
            if (b.d) {
                JNIBridge.set(128, g);
            }
            boolean equals = str.equals(g);
            if (!equals) {
                b.a(b.m(), str);
            }
            if (!equals && g.u()) {
                com.uc.crashsdk.a.a.a("crashsdk", "Is new version ('" + g + "' -> '" + str + "'), deleting old stats data!");
                b.w();
            }
        } else if (!d) {
            throw new AssertionError();
        }
    }
}
