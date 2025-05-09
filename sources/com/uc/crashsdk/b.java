package com.uc.crashsdk;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.uc.crashsdk.a.a;
import com.uc.crashsdk.a.e;
import com.uc.crashsdk.a.f;
import com.uc.crashsdk.a.g;
import com.uc.crashsdk.a.h;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import tb.c0z;
import tb.xg4;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class b {
    private static volatile boolean A = false;
    private static boolean B = false;
    private static boolean C = false;
    private static boolean D = false;
    private static boolean E = false;
    private static boolean F = false;
    private static boolean G = false;
    private static String I = null;
    private static int J = 0;
    private static String K = null;
    private static boolean L = false;
    private static boolean M = false;
    private static boolean N = true;
    private static RandomAccessFile O = null;
    private static boolean P = false;
    private static String R = null;
    private static boolean S = false;
    private static volatile Object[] T = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f14237a = false;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static volatile boolean f = false;
    public static boolean g = true;
    public static boolean h = false;
    static final /* synthetic */ boolean i = true;
    private static String j;
    private static String k;
    private static String l;
    private static String m;
    private static String n;
    private static String o;
    private static String p;
    private static String q;
    private static String r;
    private static String s;
    private static String t;
    private static String u;
    private static String v;
    private static String w;
    private static String x;
    private static boolean y;
    private static boolean z;
    public static final Object e = new Object();
    private static final Object H = new Object();
    private static final Object Q = new Object();
    private static Runnable U = new e(101);
    private static boolean V = false;
    private static long W = 0;
    private static final Object X = new Object();
    private static long Y = 0;
    private static boolean Z = false;
    private static boolean aa = false;
    private static boolean ab = false;
    private static long ac = 0;
    private static final WeakHashMap<Activity, Integer> ad = new WeakHashMap<>();
    private static boolean ae = false;
    private static String af = null;
    private static boolean ag = false;
    private static boolean ah = false;
    private static boolean ai = false;
    private static boolean aj = false;
    private static boolean ak = false;
    private static final Object al = new Object();
    private static PendingIntent am = null;

    public static boolean A() {
        if (Z || !ag()) {
            return true;
        }
        return false;
    }

    public static boolean B() {
        if (aa || !ag()) {
            return true;
        }
        return false;
    }

    public static boolean C() {
        if (!aa || y) {
            return false;
        }
        return true;
    }

    public static void D() {
        f.a(2, new e(100));
    }

    public static void E() {
        String str;
        if (d && (str = af) != null) {
            JNIBridge.set(129, str);
        }
    }

    public static String F() {
        String str = af;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static boolean G() {
        if (!ag) {
            if (!g.a(a.f14228a) && a.f14228a.equals(e.h())) {
                ah = true;
                if (d) {
                    JNIBridge.set(2, true);
                }
            }
            ag = true;
        }
        return ah;
    }

    public static void H() {
        ai = true;
        if (d) {
            JNIBridge.set(34, true);
        }
    }

    public static boolean I() {
        return ai;
    }

    public static int J() {
        boolean X2 = X();
        if (u()) {
            if (X2) {
                return 3;
            }
            return 6;
        } else if (t()) {
            if (X2) {
                return 2;
            }
            return 5;
        } else if (X2) {
            return 4;
        } else {
            return 1;
        }
    }

    public static int K() {
        boolean Y2 = Y();
        boolean Z2 = Z();
        boolean aa2 = aa();
        if (u()) {
            if (Y2) {
                return 12;
            }
            if (Z2) {
                return 14;
            }
            if (aa2) {
                return 16;
            }
            return 98;
        } else if (!t()) {
            return 1;
        } else {
            if (Y2) {
                return 11;
            }
            if (Z2) {
                return 13;
            }
            if (aa2) {
                return 15;
            }
            return 97;
        }
    }

    public static void L() {
        if (d) {
            JNIBridge.nativeSet(27, J, "12", null);
            JNIBridge.set(30, N);
        }
    }

    public static boolean M() {
        if (!ak) {
            synchronized (al) {
                try {
                    if (!ak) {
                        aj = ah();
                        ak = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return aj;
    }

    public static void N() {
        if (!e.F() && !M() && am == null && g.h() >= 0) {
            try {
                Context a2 = g.a();
                Intent launchIntentForPackage = a2.getPackageManager().getLaunchIntentForPackage(a2.getPackageName());
                launchIntentForPackage.addFlags(335544320);
                am = ya.c(a2, 0, launchIntentForPackage, 0);
            } catch (Throwable th) {
                g.a(th);
            }
        }
    }

    public static boolean O() {
        if (am == null) {
            a.b("Restart intent is null!");
            return false;
        }
        try {
            a.a("crashsdk", "restarting ...");
            ((AlarmManager) g.a().getSystemService("alarm")).set(1, System.currentTimeMillis() + 200, am);
            return true;
        } catch (Throwable th) {
            g.a(th);
            return false;
        }
    }

    private static String R() {
        if (j == null) {
            j = e(EnvironmentSwitcher.SPKEY_SS);
        }
        return j;
    }

    private static String S() {
        if (l == null) {
            l = e("ctn");
        }
        return l;
    }

    private static String T() {
        if (m == null) {
            m = e("cta");
        }
        return m;
    }

    private static String U() {
        if (o == null) {
            o = e("exitextrainfo");
        }
        return o;
    }

    private static void V() {
        FileReader fileReader;
        Throwable th;
        BufferedReader bufferedReader;
        File file = new File(U());
        if (file.exists()) {
            try {
                fileReader = new FileReader(file);
                try {
                    bufferedReader = new BufferedReader(fileReader, 512);
                    int i2 = 0;
                    do {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            } else if (readLine.startsWith("native_crash_lib_name:")) {
                                K = readLine.substring(readLine.indexOf(":") + 1).trim();
                                i2++;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                g.a(th);
                                return;
                            } finally {
                                g.a(fileReader);
                                g.a(bufferedReader);
                            }
                        }
                    } while (i2 < 100);
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                }
            } catch (Throwable th4) {
                th = th4;
                fileReader = null;
                bufferedReader = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #2 {all -> 0x0013, blocks: (B:8:0x000d, B:10:0x0011, B:14:0x0015, B:16:0x0057, B:21:0x005f, B:23:0x0063, B:25:0x0067, B:27:0x006b, B:31:0x0081, B:32:0x0083, B:28:0x0073, B:30:0x0079), top: B:37:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void W() {
        /*
            boolean r0 = com.uc.crashsdk.b.A
            if (r0 != 0) goto L_0x0087
            boolean r0 = com.uc.crashsdk.b.z
            if (r0 == 0) goto L_0x000a
            goto L_0x0087
        L_0x000a:
            java.lang.Object r0 = com.uc.crashsdk.b.H
            monitor-enter(r0)
            boolean r1 = com.uc.crashsdk.b.A     // Catch: all -> 0x0013
            if (r1 == 0) goto L_0x0015
            monitor-exit(r0)     // Catch: all -> 0x0013
            return
        L_0x0013:
            r1 = move-exception
            goto L_0x0085
        L_0x0015:
            java.lang.String r1 = com.uc.crashsdk.g.V()     // Catch: all -> 0x0013
            g(r1)     // Catch: all -> 0x0013
            java.lang.String r1 = p()     // Catch: all -> 0x0013
            java.io.File r2 = new java.io.File     // Catch: all -> 0x0013
            java.lang.String r3 = b()     // Catch: all -> 0x0013
            r2.<init>(r3)     // Catch: all -> 0x0013
            java.io.File r3 = new java.io.File     // Catch: all -> 0x0013
            java.lang.String r4 = S()     // Catch: all -> 0x0013
            r3.<init>(r4)     // Catch: all -> 0x0013
            java.lang.String r4 = "f"
            boolean r4 = r4.equals(r1)     // Catch: all -> 0x0013
            com.uc.crashsdk.b.B = r4     // Catch: all -> 0x0013
            java.lang.String r4 = "b"
            boolean r1 = r4.equals(r1)     // Catch: all -> 0x0013
            com.uc.crashsdk.b.C = r1     // Catch: all -> 0x0013
            boolean r1 = r2.exists()     // Catch: all -> 0x0013
            com.uc.crashsdk.b.E = r1     // Catch: all -> 0x0013
            boolean r1 = r3.exists()     // Catch: all -> 0x0013
            com.uc.crashsdk.b.F = r1     // Catch: all -> 0x0013
            V()     // Catch: all -> 0x0013
            boolean r1 = com.uc.crashsdk.b.E     // Catch: all -> 0x0013
            r2 = 1
            if (r1 != 0) goto L_0x005e
            boolean r1 = com.uc.crashsdk.b.F     // Catch: all -> 0x0013
            if (r1 == 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r1 = 0
            goto L_0x005f
        L_0x005e:
            r1 = 1
        L_0x005f:
            com.uc.crashsdk.b.D = r1     // Catch: all -> 0x0013
            if (r1 != 0) goto L_0x0073
            boolean r1 = com.uc.crashsdk.b.B     // Catch: all -> 0x0013
            if (r1 != 0) goto L_0x006b
            boolean r1 = com.uc.crashsdk.b.C     // Catch: all -> 0x0013
            if (r1 == 0) goto L_0x0073
        L_0x006b:
            boolean r1 = s()     // Catch: all -> 0x0013
            com.uc.crashsdk.b.G = r1     // Catch: all -> 0x0013
            com.uc.crashsdk.b.D = r1     // Catch: all -> 0x0013
        L_0x0073:
            boolean r1 = A()     // Catch: all -> 0x007d
            if (r1 == 0) goto L_0x0081
            ac()     // Catch: all -> 0x007d
            goto L_0x0081
        L_0x007d:
            r1 = move-exception
            com.uc.crashsdk.a.g.a(r1)     // Catch: all -> 0x0013
        L_0x0081:
            com.uc.crashsdk.b.A = r2     // Catch: all -> 0x0013
            monitor-exit(r0)     // Catch: all -> 0x0013
            return
        L_0x0085:
            monitor-exit(r0)     // Catch: all -> 0x0013
            throw r1
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.b.W():void");
    }

    private static boolean X() {
        W();
        return D;
    }

    private static boolean Y() {
        W();
        return E;
    }

    private static boolean Z() {
        W();
        return F;
    }

    public static String a() {
        String str = I;
        if (str != null) {
            return str;
        }
        String h2 = e.h();
        if (g.a(h2)) {
            I = "LLUN";
        } else {
            int i2 = 0;
            if (h2.length() > 48) {
                i2 = h2.length() - 48;
                h2 = h2.substring(0, 48);
            }
            StringBuilder sb = new StringBuilder();
            byte[] bytes = h2.getBytes();
            for (int length = bytes.length - 1; length >= 0; length--) {
                byte b2 = bytes[length];
                if (b2 == 46) {
                    sb.append('0');
                } else if (b2 == 58) {
                    sb.append('1');
                } else if (b2 >= 97 && b2 <= 122) {
                    sb.append((char) (b2 + c0z.FIX_STR_MASK));
                } else if (b2 >= 65 && b2 <= 90) {
                    sb.append((char) b2);
                } else if (b2 < 48 || b2 > 57) {
                    sb.append('2');
                } else {
                    sb.append((char) b2);
                }
            }
            if (i2 > 0) {
                sb.append(String.valueOf(i2));
            }
            I = sb.toString();
        }
        return I;
    }

    private static boolean aa() {
        W();
        return G;
    }

    private static void ab() {
        if (d) {
            JNIBridge.set(26, y);
        }
    }

    private static void ac() {
        if (!V) {
            V = true;
            try {
                new File(b()).delete();
            } catch (Throwable th) {
                g.a(th);
            }
            try {
                new File(S()).delete();
            } catch (Throwable th2) {
                g.a(th2);
            }
            try {
                if (d) {
                    JNIBridge.cmd(16);
                } else {
                    new File(T()).delete();
                }
            } catch (Throwable th3) {
                g.a(th3);
            }
            try {
                new File(U()).delete();
            } catch (Throwable th4) {
                g.a(th4);
            }
        }
        Object[] ae2 = ae();
        if (ae2[0].equals(R) || T != null) {
            S = true;
            ad();
            return;
        }
        a(ae2);
    }

    private static void ad() {
        if (!f.b(U)) {
            f.a(1, U);
            return;
        }
        Object[] objArr = T;
        if (objArr == null || !ae()[0].equals(objArr[0])) {
            f.a(U);
            f.a(1, U);
        }
    }

    private static Object af() {
        Object a2;
        Object a3 = a((Application) g.a(), Application.class, "mLoadedApk");
        if (a3 != null && (a2 = a(a3, (Class<?>) null, "mActivityThread")) != null) {
            return a2;
        }
        try {
            Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(null, new Object[0]);
            }
        } catch (Throwable th) {
            g.a(th);
        }
        return null;
    }

    private static boolean ag() {
        String a2 = g.a(new File("/proc/self/cgroup"), 512, false);
        if (g.a(a2)) {
            return false;
        }
        if (a2.contains("/bg_non_interactive") || a2.contains("/background")) {
            return true;
        }
        return false;
    }

    public static String b() {
        if (k == null) {
            k = e("ctj");
        }
        return k;
    }

    public static String c() {
        if (n == null) {
            n = e("st");
        }
        return n;
    }

    private static String e(String str) {
        return g.V() + a() + "." + str;
    }

    private static File[] f(String str) {
        if (i || str.length() > 0) {
            File[] listFiles = new File(g.V()).listFiles();
            if (listFiles == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (File file : listFiles) {
                if (file.getPath().endsWith(str)) {
                    arrayList.add(file);
                }
            }
            return (File[]) arrayList.toArray(new File[arrayList.size()]);
        }
        throw new AssertionError();
    }

    public static String g() {
        if (w == null) {
            w = e("bati");
        }
        return w;
    }

    public static String h() {
        if (x == null) {
            x = e("hdr");
        }
        return x;
    }

    public static String i() {
        if (r == null) {
            r = g.V() + "up";
        }
        return r;
    }

    public static String j() {
        if (s == null) {
            s = g.V() + "authu";
        }
        return s;
    }

    public static String k() {
        if (t == null) {
            t = g.V() + "statu";
        }
        return t;
    }

    public static String l() {
        if (u == null) {
            u = g.V() + "poli";
        }
        return u;
    }

    public static String m() {
        if (v == null) {
            v = g.V() + MspDBHelper.RecordEntry.COLUMN_NAME_VERSION;
        }
        return v;
    }

    public static String n() {
        return g.V() + "bvu";
    }

    public static String o() {
        return g.V() + "fds";
    }

    public static String p() {
        return g.a(new File(R()), 8, false);
    }

    public static boolean q() {
        return z;
    }

    public static void r() {
        f.a(1, new e(105));
    }

    public static boolean s() {
        boolean z2;
        if (!L) {
            if (d) {
                if (JNIBridge.cmd(15) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                M = z2;
            } else {
                M = new File(T()).exists();
            }
            L = true;
        }
        return M;
    }

    public static boolean t() {
        W();
        return B;
    }

    public static boolean u() {
        W();
        return C;
    }

    public static boolean v() {
        return y;
    }

    public static void w() {
        boolean z2;
        g(g.V());
        z = true;
        B = false;
        C = false;
        D = false;
        E = false;
        F = false;
        G = false;
        String[] strArr = {".st", ".wa", ".callback", ".ctn", ".ctj", ".cta", ".signal"};
        String[] strArr2 = {"up", "authu", "statu", "poli"};
        File[] listFiles = new File(g.V()).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                String name = file.getName();
                int i2 = 0;
                while (true) {
                    if (i2 >= 7) {
                        z2 = false;
                        break;
                    } else if (name.endsWith(strArr[i2])) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z2) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 4) {
                            break;
                        } else if (name.equals(strArr2[i3])) {
                            z2 = true;
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                if (z2) {
                    a.a("crashsdk", "delete file: " + file.getPath());
                    g.a(file);
                }
            }
        }
        ac();
    }

    public static void x() {
        if (!y) {
            y = true;
            if (!M() && !e.u()) {
                g(g.V());
                ab();
                ac();
            }
        }
    }

    public static boolean y() {
        return g(g.V());
    }

    public static boolean z() {
        return g(g.W());
    }

    public static File[] d() {
        return f(".st");
    }

    public static String e() {
        if (p == null) {
            p = e("stcb");
        }
        return p;
    }

    private static boolean ah() {
        try {
            Method declaredMethod = Process.class.getDeclaredMethod("isIsolated", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke != null && (invoke instanceof Boolean)) {
                    return ((Boolean) invoke).booleanValue();
                }
            }
        } catch (Throwable th) {
            g.a(th);
        }
        int myUid = Process.myUid() % 100000;
        return myUid >= 99000 && myUid <= 99999;
    }

    private static Object[] ae() {
        synchronized (X) {
            try {
                long j2 = Y + 1;
                Y = j2;
                if (y) {
                    return new Object[]{"e", Long.valueOf(j2)};
                } else if (C()) {
                    return new Object[]{"f", Long.valueOf(Y)};
                } else {
                    return new Object[]{TplMsg.VALUE_T_NATIVE_RETURN, Long.valueOf(Y)};
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String b(String str) {
        W();
        if (str != null && str.equals("nativeCrashLibName")) {
            return K;
        }
        return null;
    }

    public static String c(String str) {
        return "debug.crs." + str;
    }

    private static boolean g(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.isDirectory()) {
            return true;
        }
        a.a("crashsdk", "Crash log directory was placed by a file!", null);
        if (!file.delete()) {
            return false;
        }
        file.mkdirs();
        return true;
    }

    public static boolean c(int i2) {
        return (i2 & J) != 0;
    }

    public static void b(boolean z2) {
        if (!e.u()) {
            if (z2 && y) {
                if (g.M()) {
                    a.a(0, "crashsdk", "setForeground, reset sExited to false!!!", null);
                }
                y = false;
                ab();
            }
            boolean z3 = e.F() || M();
            long currentTimeMillis = System.currentTimeMillis();
            if (Z && !aa && z2) {
                long j2 = ac;
                if (j2 != 0 && !z3 && currentTimeMillis - j2 > xg4.DEFAULT_SMALL_MAX_AGE) {
                    f.a(1, new e(104), 1000L);
                }
            }
            ac = currentTimeMillis;
            aa = z2;
            if (z2) {
                Z = true;
            }
            if (d) {
                JNIBridge.nativeSetForeground(z2);
            }
            if (!y && !z3) {
                W();
                ac();
                if (z2) {
                    a.a(false);
                    if (!ab) {
                        e.B();
                        ab = true;
                    }
                }
                if (!P) {
                    ad();
                }
                e.c(z2);
            }
        }
    }

    public static File[] f() {
        return f(".stcb");
    }

    public static String a(String str) {
        if (str == null || str.length() <= 0 || !str.endsWith(".st")) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(".st");
        if (i || lastIndexOf >= 0) {
            String substring = str.substring(0, lastIndexOf);
            if (substring.length() <= 0) {
                return null;
            }
            return substring.concat(".stcb");
        }
        throw new AssertionError();
    }

    public static void a(boolean z2) {
        N = z2;
        if (d) {
            JNIBridge.set(30, z2);
        }
    }

    private static void a(Object[] objArr) {
        T = objArr;
        synchronized (Q) {
            try {
                String str = (String) objArr[0];
                Long l2 = (Long) objArr[1];
                long longValue = l2.longValue();
                if (longValue < W) {
                    Locale locale = Locale.US;
                    long j2 = W;
                    a.c("crashsdk", "Update state generation " + l2 + ", last is: " + j2);
                    return;
                }
                W = longValue;
                String R2 = R();
                if (d) {
                    RandomAccessFile randomAccessFile = O;
                    if (randomAccessFile != null) {
                        g.a(randomAccessFile);
                        O = null;
                    }
                    boolean nativeChangeState = JNIBridge.nativeChangeState(R2, str, P);
                    P = false;
                    if (!nativeChangeState) {
                        a.b("write state failed: " + str);
                    }
                } else {
                    RandomAccessFile randomAccessFile2 = O;
                    if (randomAccessFile2 == null || P) {
                        if (randomAccessFile2 != null) {
                            g.a(randomAccessFile2);
                            O = null;
                        }
                        try {
                            RandomAccessFile randomAccessFile3 = new RandomAccessFile(R2, "rw");
                            O = randomAccessFile3;
                            randomAccessFile3.seek(0L);
                            P = false;
                        } catch (Exception e2) {
                            g.a(e2);
                        }
                    }
                    try {
                        O.write(str.getBytes());
                        O.seek(0L);
                    } catch (Exception e3) {
                        g.a(e3);
                    }
                }
                R = str;
                T = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(int i2) {
        J = i2;
        L();
    }

    public static void b(Context context) {
        long j2;
        boolean z2;
        a.a("Restart APP");
        if (context != null) {
            if (q == null) {
                q = e("rt");
            }
            File file = new File(q);
            try {
                j2 = Long.parseLong(g.d(file));
            } catch (Throwable th) {
                g.a(th);
                j2 = -1;
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (g.h() < 0 || (j2 > 0 && currentTimeMillis - j2 <= g.h())) {
                z2 = false;
            } else {
                g(g.V());
                g.a(file, String.valueOf(currentTimeMillis));
                z2 = true;
            }
            a.a("lastTime: " + j2 + ", currentTime: " + currentTimeMillis + ", needRestart: " + z2);
            if (z2) {
                try {
                    d.a(true);
                } catch (Throwable th2) {
                    g.a(th2);
                }
                O();
            }
        }
    }

    public static boolean a(Context context) {
        try {
            ((Application) context).registerActivityLifecycleCallbacks(new c());
            if (!g.J()) {
                return true;
            }
            D();
            return true;
        } catch (Throwable th) {
            g.a(th);
            return false;
        }
    }

    public static void a(int i2) {
        Object a2;
        Activity activity;
        int i3;
        boolean z2 = false;
        switch (i2) {
            case 100:
                Object af2 = af();
                if (af2 != null && (a2 = a(af2, (Class<?>) null, "mActivities")) != null) {
                    try {
                        boolean z3 = false;
                        for (Map.Entry entry : ((Map) a2).entrySet()) {
                            Object value = entry.getValue();
                            if (!(value == null || (activity = (Activity) a(value, (Class<?>) null, "activity")) == null)) {
                                boolean booleanValue = ((Boolean) a(value, (Class<?>) null, "paused")).booleanValue();
                                boolean booleanValue2 = ((Boolean) a(value, (Class<?>) null, DXRecyclerLayout.LOAD_MORE_STOPED)).booleanValue();
                                WeakHashMap<Activity, Integer> weakHashMap = ad;
                                synchronized (weakHashMap) {
                                    if (booleanValue || booleanValue2) {
                                        i3 = 2;
                                    } else {
                                        i3 = 1;
                                        z3 = true;
                                    }
                                    weakHashMap.put(activity, Integer.valueOf(i3));
                                }
                            }
                            z2 = true;
                        }
                        if (z2) {
                            b(z3);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        g.a(th);
                        return;
                    }
                } else {
                    return;
                }
            case 101:
                try {
                    boolean exists = new File(R()).exists();
                    P = true ^ exists;
                    if (exists && !S) {
                        return;
                    }
                    a(ae());
                    S = false;
                    return;
                } catch (Throwable th2) {
                    g.a(th2);
                    return;
                }
            case 102:
                f.a(1, new e(103));
                return;
            case 103:
                try {
                    g.a(new File(T()));
                    return;
                } catch (Throwable th3) {
                    g.a(th3);
                    return;
                }
            case 104:
                h.d();
                f.a(102);
                if (G()) {
                    e.C();
                    return;
                }
                return;
            case 105:
                if (A()) {
                    W();
                    ac();
                    return;
                }
                f.a(1, new e(105), 3000L);
                return;
            default:
                if (!i) {
                    throw new AssertionError();
                }
                return;
        }
    }

    private static Object a(Object obj, Class<?> cls, String str) {
        if (obj == null) {
            return null;
        }
        if (cls == null) {
            cls = obj.getClass();
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Throwable th) {
            g.a(th);
            return null;
        }
    }

    public static boolean a(Object obj, String str, e eVar) {
        FileChannel fileChannel;
        synchronized (obj) {
            FileLock fileLock = null;
            fileLock = null;
            FileChannel fileChannel2 = null;
            FileChannel fileChannel3 = null;
            boolean z2 = false;
            if (d) {
                int nativeOpenFile = JNIBridge.nativeOpenFile(str);
                if (nativeOpenFile < 0) {
                    a.a("crashsdk", "Can not open file: " + str, null);
                    return false;
                }
                boolean nativeLockFile = JNIBridge.nativeLockFile(nativeOpenFile, true);
                try {
                    z2 = eVar.a();
                    JNIBridge.nativeCloseFile(nativeOpenFile);
                } finally {
                    if (nativeLockFile) {
                        JNIBridge.nativeLockFile(nativeOpenFile, false);
                    }
                }
            } else {
                File file = new File(str);
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (Exception e2) {
                        g.a(e2);
                    }
                }
                try {
                    try {
                        fileChannel = new RandomAccessFile(file, "rw").getChannel();
                    } catch (Exception e3) {
                        try {
                            g.a(e3);
                            fileChannel = null;
                        } catch (Exception e4) {
                            e = e4;
                            g.a(e);
                            g.a(fileChannel3);
                            return z2;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    g.a(fileChannel2);
                    throw th;
                }
                try {
                    if (fileChannel != null) {
                        try {
                            fileLock = fileChannel.lock();
                        } catch (Exception e5) {
                            try {
                                g.a(e5);
                            } catch (Exception e6) {
                                e = e6;
                                fileChannel3 = fileChannel;
                                g.a(e);
                                g.a(fileChannel3);
                                return z2;
                            }
                        }
                    }
                    try {
                        z2 = eVar.a();
                        g.a(fileChannel);
                    } finally {
                        if (fileLock != null) {
                            try {
                                fileLock.release();
                            } catch (Exception e7) {
                                g.a(e7);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel2 = fileChannel;
                    g.a(fileChannel2);
                    throw th;
                }
            }
            return z2;
        }
    }
}
