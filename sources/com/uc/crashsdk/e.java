package com.uc.crashsdk;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Debug;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StatFs;
import android.os.StrictMode;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.huawei.hms.utils.FileUtil;
import com.taobao.tao.shop.common.ShopConstants;
import com.uc.crashsdk.a.f;
import com.uc.crashsdk.a.g;
import com.uc.crashsdk.a.h;
import com.uc.crashsdk.export.LogType;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mtopsdk.common.util.SymbolExpUtil;
import org.ifaa.android.manager.face.IFAAFaceManager;
import tb.jcq;
import tb.m09;
import tb.n1s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class e implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f14240a = true;
    private static long b;
    private static String j;
    private final List<FileInputStream> f = new ArrayList();
    private static final AtomicBoolean c = new AtomicBoolean(false);
    private static boolean d = false;
    private static final Random e = new Random();
    private static long g = 0;
    private static long h = -1;
    private static boolean i = true;
    private static String k = "";
    private static String l = null;
    private static String m = null;
    private static String n = null;
    private static final Object o = new Object();
    private static final ConditionVariable p = new ConditionVariable();
    private static final Object q = new Object();
    private static final Object r = new Object();
    private static final Object s = new Object();
    private static final ArrayList<String> t = new ArrayList<>();
    private static int u = 0;
    private static String v = null;
    private static boolean w = false;
    private static String x = null;
    private static String y = null;
    private static final Object z = new Object();
    private static final Object A = new Object();
    private static Map<String, Integer> B = null;
    private static String C = null;
    private static int D = -1;
    private static int E = -1;
    private static int F = -1;
    private static int G = -1;
    private static int H = -1;
    private static int I = -1;
    private static int J = -1;
    private static String K = "?";
    private static boolean L = false;
    private static boolean M = false;
    private static int N = 0;
    private static int O = 0;
    private static boolean P = false;
    private static com.uc.crashsdk.a.e Q = new com.uc.crashsdk.a.e(405);
    private static c R = new c((byte) 0);
    private static boolean S = false;
    private static final com.uc.crashsdk.a.e T = new com.uc.crashsdk.a.e(IFAAFaceManager.STATUS_FACE_OFFSET_TOP);
    private static Thread.UncaughtExceptionHandler U = null;
    private static Throwable V = null;
    private static boolean W = false;
    private static boolean X = false;
    private static Runnable Y = null;
    private static final Object Z = new Object();
    private static int aa = 101;
    private static Runnable ab = new com.uc.crashsdk.a.e(407);
    private static final Object ac = new Object();
    private static volatile boolean ad = false;
    private static Object ae = new Object();
    private static ParcelFileDescriptor af = null;
    private static boolean ag = false;
    private static boolean ah = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements Comparator<File> {
        private b() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            File file3 = file;
            File file4 = file2;
            if (file3.lastModified() > file4.lastModified()) {
                return 1;
            }
            if (file3.lastModified() < file4.lastModified()) {
                return -1;
            }
            return 0;
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                int unused = e.D = intent.getIntExtra(m09.TASK_TYPE_LEVEL, -1);
                int unused2 = e.E = intent.getIntExtra("scale", -1);
                int unused3 = e.F = intent.getIntExtra("voltage", -1);
                int unused4 = e.G = intent.getIntExtra("health", -1);
                int unused5 = e.H = intent.getIntExtra("plugged", -1);
                int unused6 = e.I = intent.getIntExtra("status", -1);
                int unused7 = e.J = intent.getIntExtra("temperature", -1);
                String unused8 = e.K = intent.getStringExtra("technology");
                if (e.J() >= 2) {
                    e.K();
                    int unused9 = e.N = 0;
                }
            } else if ("android.intent.action.BATTERY_LOW".equals(action) || "android.intent.action.BATTERY_OKAY".equals(action)) {
                boolean unused10 = e.L = "android.intent.action.BATTERY_LOW".equals(action);
                e.K();
            } else if ("android.intent.action.ANR".equals(action)) {
                try {
                    e.d(context);
                } catch (Throwable th) {
                    g.a(th);
                }
            }
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    public e() {
        try {
            M();
        } catch (Throwable th) {
            g.a(th);
        }
    }

    public static void A() {
        if (g.q()) {
            f.a(0, new com.uc.crashsdk.a.e(403), 10000L);
        }
    }

    public static void B() {
        if (!ad && !com.uc.crashsdk.b.M()) {
            f.a(1, new com.uc.crashsdk.a.e(408), 1000L);
        }
    }

    public static void C() {
        f.a(1, new com.uc.crashsdk.a.e(IFAAFaceManager.STATUS_FACE_MOUTH_OCCLUSION), 7000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        if ((java.lang.System.currentTimeMillis() % 3) != 0) goto L_0x0011;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r0 == 1) goto L_0x0011;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void D() {
        /*
            int r0 = com.uc.crashsdk.g.L()
            r1 = 4
            r2 = 3
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0013
            if (r0 == r2) goto L_0x0013
            if (r0 != r1) goto L_0x000f
            goto L_0x0013
        L_0x000f:
            if (r0 != r4) goto L_0x003f
        L_0x0011:
            r4 = 0
            goto L_0x003f
        L_0x0013:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 25
            if (r5 > r6) goto L_0x003f
            if (r0 != 0) goto L_0x001d
            r5 = 0
            goto L_0x001e
        L_0x001d:
            r5 = 1
        L_0x001e:
            r6 = 0
            if (r0 != r2) goto L_0x0030
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 10
            long r8 = r8 % r10
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x002f
            r5 = 1
            goto L_0x0030
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r0 != r1) goto L_0x003e
            long r0 = java.lang.System.currentTimeMillis()
            r8 = 3
            long r0 = r0 % r8
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0011
            goto L_0x003f
        L_0x003e:
            r4 = r5
        L_0x003f:
            if (r4 != 0) goto L_0x0049
            java.lang.String r0 = "crashsdk"
            java.lang.String r1 = "SIG 3 is disabled by settings"
            com.uc.crashsdk.a.a.a(r0, r1)
        L_0x0049:
            boolean r0 = com.uc.crashsdk.b.M()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r1 == r2) goto L_0x0065
            if (r4 == 0) goto L_0x0065
            com.uc.crashsdk.a.e r1 = new com.uc.crashsdk.a.e
            r2 = 413(0x19d, float:5.79E-43)
            r1.<init>(r2)
            r2 = 2
            com.uc.crashsdk.a.f.a(r2, r1)
            goto L_0x0066
        L_0x0065:
            r3 = r4
        L_0x0066:
            r1 = 7
            long r4 = (long) r0
            r0 = 0
            com.uc.crashsdk.JNIBridge.nativeCmd(r1, r4, r0, r0)
            if (r3 == 0) goto L_0x0073
            r0 = 8
            com.uc.crashsdk.JNIBridge.cmd(r0)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.D():void");
    }

    public static ParcelFileDescriptor E() {
        if (!com.uc.crashsdk.b.d) {
            com.uc.crashsdk.a.a.d("crashsdk", "Crash so is not loaded!");
            return null;
        }
        synchronized (ae) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = af;
                if (parcelFileDescriptor != null) {
                    return parcelFileDescriptor;
                }
                int cmd = (int) JNIBridge.cmd(14);
                if (cmd == -1) {
                    return null;
                }
                ParcelFileDescriptor adoptFd = ParcelFileDescriptor.adoptFd(cmd);
                af = adoptFd;
                ag = true;
                return adoptFd;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean F() {
        return ah;
    }

    public static void G() {
        String W2 = g.W();
        File file = new File(W2);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                com.uc.crashsdk.a.a.b("Ucebu can not list folder: " + W2);
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isFile() && file2.getName().contains("ucebu")) {
                    a(false, false);
                    return;
                }
            }
        }
    }

    public static /* synthetic */ int J() {
        int i2 = N + 1;
        N = i2;
        return i2;
    }

    public static /* synthetic */ void K() {
        StringBuilder X2;
        if (com.uc.crashsdk.b.d && (X2 = X()) != null) {
            JNIBridge.set(125, X2.toString());
        }
        M = true;
        Y();
    }

    private void M() {
        int G2 = g.G();
        for (int i2 = 0; i2 < G2; i2++) {
            try {
                this.f.add(new FileInputStream("/dev/null"));
            } catch (Exception e2) {
                g.a(e2);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean N() {
        if (g.N()) {
            return true;
        }
        return a();
    }

    private static String O() {
        return g.e() + "_";
    }

    private static String P() {
        if (com.uc.crashsdk.b.C()) {
            return "fg";
        }
        return "bg";
    }

    private static byte[] Q() {
        byte[] bArr = null;
        int i2 = 1024;
        while (bArr == null && i2 > 0) {
            try {
                bArr = new byte[i2];
            } catch (Throwable unused) {
                i2 /= 2;
                if (i2 < 16) {
                    break;
                }
            }
        }
        return bArr;
    }

    private static String R() {
        if (!com.uc.crashsdk.b.G() || d) {
            return "java";
        }
        return "ucebujava";
    }

    private static void S() {
        String str;
        BufferedReader bufferedReader;
        FileReader fileReader;
        Throwable th;
        String str2 = "-";
        try {
            str = Build.HARDWARE;
        } catch (Throwable th2) {
            g.a(th2);
            str = str2;
        }
        try {
            fileReader = new FileReader(new File("/proc/cpuinfo"));
            try {
                bufferedReader = new BufferedReader(fileReader, 512);
                int i2 = 0;
                do {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.startsWith("Hardware")) {
                            str = readLine.substring(readLine.indexOf(":") + 1).trim();
                        } else if (readLine.startsWith("Processor")) {
                            str2 = readLine.substring(readLine.indexOf(":") + 1).trim();
                        }
                        i2++;
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            g.a(th);
                            g.a(fileReader);
                            g.a(bufferedReader);
                            l = str;
                            m = str2;
                        } catch (Throwable th4) {
                            g.a(fileReader);
                            g.a(bufferedReader);
                            throw th4;
                        }
                    }
                } while (i2 < 2);
                g.a(fileReader);
            } catch (Throwable th5) {
                bufferedReader = null;
                th = th5;
            }
        } catch (Throwable th6) {
            bufferedReader = null;
            th = th6;
            fileReader = null;
        }
        g.a(bufferedReader);
        l = str;
        m = str2;
    }

    private static String T() {
        return g.V() + "bytes";
    }

    private static boolean U() {
        if (Build.VERSION.SDK_INT < 29) {
            return true;
        }
        return false;
    }

    private static void V() {
        if (!P) {
            JNIBridge.cmd(18);
        }
    }

    private static void W() {
        f.a(3, new com.uc.crashsdk.a.e(IFAAFaceManager.STATUS_FACE_CAPTURE), 1000L);
    }

    private static StringBuilder X() {
        String str;
        String str2;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("level: ");
            sb.append(D);
            sb.append("\nscale: ");
            sb.append(E);
            sb.append("\nhealth: ");
            int i2 = G;
            String str3 = " (Unknown)";
            switch (i2) {
                case 1:
                    str = str3;
                    break;
                case 2:
                    str = " (Good)";
                    break;
                case 3:
                    str = " (Overheat)";
                    break;
                case 4:
                    str = " (Dead)";
                    break;
                case 5:
                    str = " (Over voltage)";
                    break;
                case 6:
                    str = " (Unspecified failure)";
                    break;
                case 7:
                    str = " (Cold)";
                    break;
                default:
                    str = " (?)";
                    break;
            }
            sb.append(i2);
            sb.append(str);
            sb.append("\npluged: ");
            int i3 = H;
            if (i3 == 0) {
                str2 = " (None)";
            } else if (i3 == 1) {
                str2 = " (AC charger)";
            } else if (i3 == 2) {
                str2 = " (USB port)";
            } else if (i3 != 4) {
                str2 = " (?)";
            } else {
                str2 = " (Wireless)";
            }
            sb.append(i3);
            sb.append(str2);
            sb.append("\nstatus: ");
            int i4 = I;
            if (i4 != 1) {
                if (i4 == 2) {
                    str3 = " (Charging)";
                } else if (i4 == 3) {
                    str3 = " (Discharging)";
                } else if (i4 == 4) {
                    str3 = " (Not charging)";
                } else if (i4 != 5) {
                    str3 = " (?)";
                } else {
                    str3 = " (Full)";
                }
            }
            sb.append(i4);
            sb.append(str3);
            sb.append("\nvoltage: ");
            sb.append(F);
            sb.append("\ntemperature: ");
            sb.append(J);
            sb.append("\ntechnology: ");
            sb.append(K);
            sb.append("\nbattery low: ");
            sb.append(L);
            sb.append("\n");
            return sb;
        } catch (Throwable th) {
            g.a(th);
            return null;
        }
    }

    private static void Y() {
        if (com.uc.crashsdk.b.c && M && com.uc.crashsdk.a.c) {
            M = false;
            if (!f.b(Q)) {
                f.a(0, Q, 2000L);
            }
        }
    }

    private static boolean Z() {
        if (!com.uc.crashsdk.b.d || !JNIBridge.nativeIsCrashing()) {
            return false;
        }
        return true;
    }

    public static boolean a() {
        if (g == 0) {
            g = 2L;
            if (h(com.uc.crashsdk.b.c("logs")) == 1) {
                g = 1L;
            }
        }
        return g == 1;
    }

    private static void aa() {
        int i2;
        boolean z2;
        String X2 = g.X();
        File file = new File(X2);
        if (file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 150) {
                    Arrays.sort(listFiles, new b((byte) 0));
                    int length = listFiles.length - 150;
                    if (length < 0) {
                        i2 = 0;
                    } else {
                        i2 = length;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    int i3 = 0;
                    for (int i4 = 0; i4 < listFiles.length; i4++) {
                        File file2 = listFiles[i4];
                        if (i4 < i2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2 && currentTimeMillis - file2.lastModified() >= 432000000) {
                            z2 = true;
                        }
                        if (!z2) {
                            break;
                        }
                        file2.delete();
                        i3++;
                        if (0 >= 3) {
                            break;
                        }
                    }
                    com.uc.crashsdk.a.a.a("Removed " + i3 + " logs in " + X2);
                }
            } catch (Throwable th) {
                g.a(th);
            }
        }
    }

    public static long b() {
        if (h == -1) {
            h = h(com.uc.crashsdk.b.c("local"));
        }
        return h;
    }

    private static String j(String str) {
        if (str == null) {
            str = String.valueOf(System.currentTimeMillis()) + new Random().nextInt(65536);
        }
        Locale locale = Locale.US;
        return O() + g.S() + "_" + g.U() + "_" + i(Build.MODEL) + "_" + i(Build.VERSION.RELEASE) + "_" + str + "_";
    }

    private static String k(String str) {
        Locale locale = Locale.US;
        String d2 = d();
        String n2 = n();
        String P2 = P();
        return d2 + n2 + "_" + P2 + "_" + str + ".log";
    }

    private static String l(String str) {
        if (!g.b(str)) {
            return "";
        }
        int indexOf = str.indexOf(0);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return str.trim();
    }

    private static String m(String str) {
        String a2 = com.uc.crashsdk.a.b.a(str, g.w(), g.v());
        if (!str.equals(a2)) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
        return a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r8.endsWith(r4) != false) goto L_0x0055;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (r8.indexOf(".log", r8.lastIndexOf(95)) != r8.lastIndexOf(".log")) goto L_0x0055;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean[] n(java.lang.String r8) {
        /*
            r0 = 0
            r1 = 1
            boolean r2 = com.uc.crashsdk.g.v()
            boolean r3 = com.uc.crashsdk.g.x()
            if (r2 != 0) goto L_0x000e
            if (r3 == 0) goto L_0x006d
        L_0x000e:
            java.lang.String r4 = ".tmp"
            boolean r4 = r8.endsWith(r4)
            if (r4 != 0) goto L_0x0039
            java.lang.String r4 = ".ec"
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L_0x001f
            goto L_0x0039
        L_0x001f:
            char r4 = java.io.File.separatorChar
            int r4 = r8.lastIndexOf(r4)
            if (r4 >= 0) goto L_0x0028
            r4 = 0
        L_0x0028:
            r5 = 0
        L_0x0029:
            r6 = 95
            int r4 = r8.indexOf(r6, r4)
            if (r4 < 0) goto L_0x0033
            int r5 = r5 + r1
            int r4 = r4 + r1
        L_0x0033:
            if (r4 >= 0) goto L_0x0029
            r4 = 8
            if (r5 == r4) goto L_0x003c
        L_0x0039:
            r2 = 0
            r3 = 0
            goto L_0x006d
        L_0x003c:
            java.lang.String r4 = com.uc.crashsdk.g.w()
            java.lang.String r5 = ".log"
            boolean r7 = r8.endsWith(r5)
            if (r7 != 0) goto L_0x0057
            boolean r2 = com.uc.crashsdk.a.g.a(r4)
            if (r2 != 0) goto L_0x0039
            boolean r8 = r8.endsWith(r4)
            if (r8 != 0) goto L_0x0055
            goto L_0x0039
        L_0x0055:
            r2 = 0
            goto L_0x006d
        L_0x0057:
            boolean r4 = com.uc.crashsdk.a.g.a(r4)
            if (r4 == 0) goto L_0x005e
            goto L_0x0055
        L_0x005e:
            int r4 = r8.lastIndexOf(r6)
            int r4 = r8.indexOf(r5, r4)
            int r8 = r8.lastIndexOf(r5)
            if (r4 == r8) goto L_0x006d
            goto L_0x0055
        L_0x006d:
            r8 = 2
            boolean[] r8 = new boolean[r8]
            r8[r0] = r2
            r8[r1] = r3
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.n(java.lang.String):boolean[]");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:52|4|(3:6|(3:9|(1:11)(17:60|14|15|(14:17|54|18|23|(1:27)(1:26)|28|(1:31)|32|50|33|57|34|35|44)(1:22)|21|23|(0)|27|28|(0)|32|50|33|57|34|35|44)|7)|59)|29|(0)|32|50|33|57|34|35|44) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00eb, code lost:
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ed, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f2, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f6, code lost:
        com.uc.crashsdk.a.g.a(r1);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
        com.uc.crashsdk.a.g.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fe, code lost:
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #2 {all -> 0x0056, blocks: (B:4:0x0005, B:6:0x0032, B:7:0x0040, B:9:0x0046, B:11:0x0051, B:14:0x0059, B:18:0x006c, B:20:0x0076, B:23:0x007d, B:28:0x0088, B:31:0x00b7, B:35:0x00e6, B:43:0x00f6, B:44:0x00f9, B:46:0x00fb, B:47:0x00fe), top: B:52:0x0005, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean o(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.o(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:4:0x0003, B:6:0x0008, B:9:0x001c, B:11:0x0027, B:12:0x0031, B:13:0x0037, B:15:0x003f, B:16:0x0048, B:18:0x0051, B:20:0x005a, B:22:0x0062, B:28:0x0071, B:30:0x007c, B:32:0x008a, B:34:0x0095, B:35:0x00a1, B:37:0x00ac, B:40:0x00bc, B:52:0x00e2, B:55:0x00ed, B:59:0x00fd, B:66:0x010a, B:69:0x0114), top: B:73:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:4:0x0003, B:6:0x0008, B:9:0x001c, B:11:0x0027, B:12:0x0031, B:13:0x0037, B:15:0x003f, B:16:0x0048, B:18:0x0051, B:20:0x005a, B:22:0x0062, B:28:0x0071, B:30:0x007c, B:32:0x008a, B:34:0x0095, B:35:0x00a1, B:37:0x00ac, B:40:0x00bc, B:52:0x00e2, B:55:0x00ed, B:59:0x00fd, B:66:0x010a, B:69:0x0114), top: B:73:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean p(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.p(java.lang.String):boolean");
    }

    private static Map<String, Integer> q(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split(SymbolExpUtil.SYMBOL_VERTICALBAR, 30)) {
            String[] split = str2.split(":", 3);
            if (split.length == 2) {
                String trim = split[0].trim();
                if (!g.a(trim)) {
                    int i2 = 1;
                    try {
                        i2 = Integer.parseInt(split[1].trim(), 10);
                    } catch (Throwable th) {
                        g.a(th);
                    }
                    hashMap.put(trim, Integer.valueOf(i2));
                }
            }
        }
        return hashMap;
    }

    private static void r(String str) {
        if (g.q()) {
            try {
                aa();
            } catch (Throwable th) {
                g.a(th);
            }
            if (str != null && !"".equals(str)) {
                try {
                    File file = new File(g.X());
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    com.uc.crashsdk.a.a.a("crashsdk", "copy log to: " + file);
                    g.a(new File(str), file);
                } catch (Throwable th2) {
                    g.a(th2);
                }
            }
        }
    }

    private static String s(String str) {
        return "$^" + str + "^$";
    }

    public static void t() {
        Thread.setDefaultUncaughtExceptionHandler(U);
    }

    public static boolean u() {
        if (c.get() || Z()) {
            return true;
        }
        return false;
    }

    public static Throwable v() {
        return V;
    }

    public static int w() {
        if (com.uc.crashsdk.b.J() == 5) {
            return aa;
        }
        return 100;
    }

    public static void x() {
        boolean z2;
        long o2 = g.o();
        if (o2 >= 0) {
            if (com.uc.crashsdk.b.J() == 5) {
                z2 = true;
            } else {
                z2 = false;
            }
            f.a(0, new com.uc.crashsdk.a.e(401));
            if (z2) {
                com.uc.crashsdk.a.e eVar = new com.uc.crashsdk.a.e(402);
                Y = eVar;
                f.a(0, eVar, o2);
            }
        }
    }

    public static void y() {
        if (com.uc.crashsdk.b.c && com.uc.crashsdk.a.c && !f.b(ab)) {
            f.a(0, ab, 1000L);
        }
    }

    public static boolean z() {
        synchronized (Z) {
            try {
                Runnable runnable = Y;
                if (runnable == null || X) {
                    return false;
                }
                f.a(runnable);
                Y = null;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        a(thread, th, false);
    }

    public static String d() {
        String str = j;
        if (str != null) {
            return str;
        }
        String j2 = j(null);
        j = j2;
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #5 {all -> 0x00cb, blocks: (B:33:0x0090, B:35:0x00a7), top: B:69:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db A[Catch: all -> 0x010a, TryCatch #3 {all -> 0x010a, blocks: (B:43:0x00d5, B:45:0x00db, B:47:0x00e3, B:50:0x010c, B:52:0x0112, B:54:0x011a), top: B:65:0x00d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0112 A[Catch: all -> 0x010a, TryCatch #3 {all -> 0x010a, blocks: (B:43:0x00d5, B:45:0x00db, B:47:0x00e3, B:50:0x010c, B:52:0x0112, B:54:0x011a), top: B:65:0x00d5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String e() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.e():java.lang.String");
    }

    public static String f() {
        if (g.a(l)) {
            S();
        }
        return l;
    }

    private static long h(String str) {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("getLong", String.class, Long.TYPE);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return ((Long) declaredMethod.invoke(null, str, 0L)).longValue();
            }
        } catch (Throwable th) {
            g.a(th);
        }
        return 0L;
    }

    private static String i(String str) {
        try {
            return str.replaceAll("[^0-9a-zA-Z-.]", "-");
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static void s() {
        U = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new e());
    }

    public static void c() {
        j = null;
    }

    public static boolean b(int i2, Object[] objArr) {
        if (i2 != 451) {
            if (i2 != 452) {
                if (f14240a) {
                    return false;
                }
                throw new AssertionError();
            } else if (f14240a || objArr != null) {
                d dVar = (d) objArr[1];
                Locale locale = Locale.US;
                long j2 = dVar.f14242a;
                long j3 = dVar.b;
                int i3 = dVar.c;
                int i4 = dVar.d;
                return g.a(new File((String) objArr[0]), (j2 + " " + j3 + " " + i3 + " " + i4).getBytes());
            } else {
                throw new AssertionError();
            }
        } else if (f14240a || objArr != null) {
            return a((String) objArr[0], (d) objArr[1]);
        } else {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[Catch: all -> 0x007f, TryCatch #4 {all -> 0x007f, blocks: (B:20:0x004e, B:22:0x0066, B:24:0x006c, B:26:0x006f, B:28:0x0077), top: B:42:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(java.io.OutputStream r7) {
        /*
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = "disk info:\n"
            byte[] r1 = r1.getBytes(r0)     // Catch: all -> 0x000d
            r7.write(r1)     // Catch: all -> 0x000d
            goto L_0x0011
        L_0x000d:
            r1 = move-exception
            a(r1, r7)
        L_0x0011:
            boolean r1 = com.uc.crashsdk.e.ah
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.uc.crashsdk.e.i = r2
            java.lang.String r1 = "FSSTAT"
            java.lang.String r1 = s(r1)     // Catch: all -> 0x0026
            byte[] r0 = r1.getBytes(r0)     // Catch: all -> 0x0026
            r7.write(r0)     // Catch: all -> 0x0026
            goto L_0x002a
        L_0x0026:
            r0 = move-exception
            a(r0, r7)
        L_0x002a:
            r0 = 1
            com.uc.crashsdk.e.i = r0
            goto L_0x0087
        L_0x002e:
            r0 = 0
            java.util.HashSet r1 = new java.util.HashSet     // Catch: all -> 0x0047
            r1.<init>()     // Catch: all -> 0x0047
            java.io.File r0 = new java.io.File     // Catch: all -> 0x0045
            java.lang.String r3 = com.uc.crashsdk.a.g.b()     // Catch: all -> 0x0045
            r0.<init>(r3)     // Catch: all -> 0x0045
            java.lang.String r0 = a(r0)     // Catch: all -> 0x0045
            a(r7, r0, r1)     // Catch: all -> 0x0045
            goto L_0x004e
        L_0x0045:
            r0 = move-exception
            goto L_0x004b
        L_0x0047:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x004b:
            a(r0, r7)
        L_0x004e:
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: all -> 0x007f
            java.lang.String r0 = a(r0)     // Catch: all -> 0x007f
            a(r7, r0, r1)     // Catch: all -> 0x007f
            java.io.File r0 = new java.io.File     // Catch: all -> 0x007f
            java.lang.String r3 = "/storage"
            r0.<init>(r3)     // Catch: all -> 0x007f
            boolean r3 = r0.exists()     // Catch: all -> 0x007f
            if (r3 == 0) goto L_0x0087
            java.io.File[] r0 = r0.listFiles()     // Catch: all -> 0x007f
            if (r0 == 0) goto L_0x0087
            int r3 = r0.length     // Catch: all -> 0x007f
        L_0x006d:
            if (r2 >= r3) goto L_0x0087
            r4 = r0[r2]     // Catch: all -> 0x007f
            boolean r5 = r4.isDirectory()     // Catch: all -> 0x007f
            if (r5 == 0) goto L_0x0081
            java.lang.String r4 = a(r4)     // Catch: all -> 0x007f
            a(r7, r4, r1)     // Catch: all -> 0x007f
            goto L_0x0081
        L_0x007f:
            r0 = move-exception
            goto L_0x0084
        L_0x0081:
            int r2 = r2 + 1
            goto L_0x006d
        L_0x0084:
            a(r0, r7)
        L_0x0087:
            a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.c(java.io.OutputStream):void");
    }

    public static String g() {
        try {
            StringBuilder sb = new StringBuilder("JavaMax:    ");
            sb.append(Runtime.getRuntime().maxMemory() / 1024);
            sb.append(" kB\nJavaTotal:  ");
            sb.append(Runtime.getRuntime().totalMemory() / 1024);
            sb.append(" kB\nJavaFree:   ");
            sb.append(Runtime.getRuntime().freeMemory() / 1024);
            sb.append(" kB\nNativeHeap: ");
            sb.append(Debug.getNativeHeapSize() / 1024);
            sb.append(" kB\nNativeAllocated: ");
            sb.append(Debug.getNativeHeapAllocatedSize() / 1024);
            sb.append(" kB\nNativeFree: ");
            sb.append(Debug.getNativeHeapFreeSize() / 1024);
            sb.append(" kB\n");
            ActivityManager activityManager = (ActivityManager) g.a().getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                sb.append("availMem:   ");
                sb.append(memoryInfo.availMem / 1024);
                sb.append(" kB\n");
                sb.append("threshold:  ");
                sb.append(memoryInfo.threshold / 1024);
                sb.append(" kB\n");
                sb.append("lowMemory:  ");
                sb.append(memoryInfo.lowMemory);
                sb.append("\n");
            }
            return sb.toString();
        } catch (Throwable th) {
            g.a(th);
            return "";
        }
    }

    public static boolean i() {
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(java.io.OutputStream r7) {
        /*
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = "opened file count: "
            boolean r2 = com.uc.crashsdk.b.d
            r3 = 0
            if (r2 == 0) goto L_0x0040
            java.lang.String r0 = com.uc.crashsdk.b.o()
            com.uc.crashsdk.e.i = r3
            r1 = 17
            long r1 = com.uc.crashsdk.JNIBridge.cmd(r1, r0)
            r3 = 1
            r4 = 1
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x003d
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            byte[] r0 = com.uc.crashsdk.a.g.e(r1)     // Catch: all -> 0x002c
            if (r0 == 0) goto L_0x0030
            r7.write(r0)     // Catch: all -> 0x002c
            goto L_0x0030
        L_0x002c:
            r0 = move-exception
            a(r0, r7)
        L_0x0030:
            r1.delete()     // Catch: all -> 0x0034
            goto L_0x0038
        L_0x0034:
            r0 = move-exception
            a(r0, r7)
        L_0x0038:
            com.uc.crashsdk.e.i = r3
            a(r7)
        L_0x003d:
            com.uc.crashsdk.e.i = r3
            return
        L_0x0040:
            r2 = 0
            int r4 = com.uc.crashsdk.g.H()     // Catch: all -> 0x0082
            java.io.File r5 = new java.io.File     // Catch: all -> 0x0076
            java.lang.String r6 = "/proc/self/fd"
            r5.<init>(r6)     // Catch: all -> 0x0076
            java.io.File[] r2 = r5.listFiles()     // Catch: all -> 0x0076
            if (r2 == 0) goto L_0x0078
            java.util.Locale r5 = java.util.Locale.US     // Catch: all -> 0x0076
            int r5 = r2.length     // Catch: all -> 0x0076
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x0076
            r6.<init>(r1)     // Catch: all -> 0x0076
            r6.append(r5)     // Catch: all -> 0x0076
            java.lang.String r1 = ", write limit: "
            r6.append(r1)     // Catch: all -> 0x0076
            r6.append(r4)     // Catch: all -> 0x0076
            java.lang.String r1 = ".\n"
            r6.append(r1)     // Catch: all -> 0x0076
            java.lang.String r1 = r6.toString()     // Catch: all -> 0x0076
            byte[] r1 = r1.getBytes(r0)     // Catch: all -> 0x0076
            r7.write(r1)     // Catch: all -> 0x0076
            goto L_0x0088
        L_0x0076:
            r1 = move-exception
            goto L_0x0085
        L_0x0078:
            java.lang.String r1 = "[DEBUG] listFiles failed!\n"
            byte[] r1 = r1.getBytes(r0)     // Catch: all -> 0x0076
            r7.write(r1)     // Catch: all -> 0x0076
            goto L_0x0088
        L_0x0082:
            r1 = move-exception
            r4 = 900(0x384, float:1.261E-42)
        L_0x0085:
            a(r1, r7)
        L_0x0088:
            if (r2 == 0) goto L_0x00d0
            int r1 = r2.length     // Catch: all -> 0x00cc
            if (r1 < r4) goto L_0x00d0
            java.lang.String r1 = "opened files:\n"
            byte[] r1 = r1.getBytes(r0)     // Catch: all -> 0x00cc
            r7.write(r1)     // Catch: all -> 0x00cc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x00cc
            r1.<init>()     // Catch: all -> 0x00cc
            int r4 = r2.length     // Catch: all -> 0x00bc
        L_0x009d:
            if (r3 >= r4) goto L_0x00c0
            r5 = r2[r3]     // Catch: all -> 0x00bc
            java.lang.String r6 = r5.getName()     // Catch: all -> 0x00bc
            r1.append(r6)     // Catch: all -> 0x00bc
            java.lang.String r6 = " -> "
            r1.append(r6)     // Catch: all -> 0x00bc
            java.lang.String r5 = r5.getCanonicalPath()     // Catch: all -> 0x00bc
            r1.append(r5)     // Catch: all -> 0x00bc
            java.lang.String r5 = "\n"
            r1.append(r5)     // Catch: all -> 0x00bc
            int r3 = r3 + 1
            goto L_0x009d
        L_0x00bc:
            r2 = move-exception
            a(r2, r7)     // Catch: all -> 0x00cc
        L_0x00c0:
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x00cc
            byte[] r0 = r1.getBytes(r0)     // Catch: all -> 0x00cc
            r7.write(r0)     // Catch: all -> 0x00cc
            goto L_0x00d0
        L_0x00cc:
            r0 = move-exception
            a(r0, r7)
        L_0x00d0:
            a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.d(java.io.OutputStream):void");
    }

    private static void f(OutputStream outputStream) {
        BufferedReader bufferedReader;
        Throwable th;
        int indexOf;
        if (com.uc.crashsdk.b.d) {
            try {
                outputStream.write("solib build id:\n".getBytes("UTF-8"));
            } catch (Throwable th2) {
                a(th2, outputStream);
            }
            FileReader fileReader = null;
            try {
                ArrayList arrayList = new ArrayList();
                FileReader fileReader2 = new FileReader(new File("/proc/self/maps"));
                try {
                    bufferedReader = new BufferedReader(fileReader2, 512);
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            } else if (readLine.endsWith(jcq.SO_EXTENSION) && (indexOf = readLine.indexOf(47)) != -1) {
                                String substring = readLine.substring(indexOf);
                                if (!substring.contains("/data/") && !substring.contains(com.uc.crashsdk.a.f14228a)) {
                                }
                                if (!arrayList.contains(substring)) {
                                    arrayList.add(substring);
                                    if (ah) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("$^SOBUILDID`" + substring + "^$");
                                        sb.append("\n");
                                        outputStream.write(sb.toString().getBytes("UTF-8"));
                                    } else {
                                        String nativeGet = JNIBridge.nativeGet(3, 0L, substring);
                                        Locale locale = Locale.US;
                                        outputStream.write((substring + ": " + nativeGet + "\n").getBytes("UTF-8"));
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileReader = fileReader2;
                            try {
                                a(th, outputStream);
                                g.a(fileReader);
                                g.a(bufferedReader);
                                a(outputStream);
                            } catch (Throwable th4) {
                                g.a(fileReader);
                                g.a(bufferedReader);
                                throw th4;
                            }
                        }
                    }
                    g.a(fileReader2);
                } catch (Throwable th5) {
                    th = th5;
                    bufferedReader = null;
                }
            } catch (Throwable th6) {
                th = th6;
                bufferedReader = null;
            }
            g.a(bufferedReader);
            a(outputStream);
        }
    }

    public static String k() {
        String str = y;
        if (g.a(str)) {
            synchronized (z) {
                try {
                    str = g.a(com.uc.crashsdk.b.i(), g.Q() == 1 ? "https://px.wpk.quark.cn/upload" : g.P() ? "https://up4-intl.ucweb.com/upload" : "https://up4.ucweb.com/upload", true);
                    y = str;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(int i2, Object[] objArr) {
        int i3;
        switch (i2) {
            case 401:
                JNIBridge.nativeCmd(10, com.uc.crashsdk.b.J() == 5 ? 1L : 0L, null, null);
                com.uc.crashsdk.a.c = true;
                com.uc.crashsdk.a.a(false);
                M = true;
                Y();
                y();
                return;
            case 402:
                Object obj = Z;
                synchronized (obj) {
                    try {
                        if (Y != null) {
                            X = true;
                            if (com.uc.crashsdk.b.q()) {
                                return;
                            }
                            if (!com.uc.crashsdk.a.d.e()) {
                                com.uc.crashsdk.a.a.c("DEBUG", com.uc.crashsdk.a.d.b());
                                return;
                            } else if (!d(LogType.UNEXP_TYPE)) {
                                com.uc.crashsdk.a.a.d("DEBUG", "unexp sample miss");
                                return;
                            } else {
                                int nativeGenerateUnexpLog = JNIBridge.nativeGenerateUnexpLog(g.o(), g.p());
                                if (nativeGenerateUnexpLog != 0) {
                                    f.a(11);
                                    if ((nativeGenerateUnexpLog & LogType.UNEXP_KILL_PROCESS) != 0) {
                                        aa = 105;
                                        i3 = 30;
                                    } else if ((nativeGenerateUnexpLog & 8448) != 0) {
                                        aa = 104;
                                        i3 = 31;
                                    } else if ((nativeGenerateUnexpLog & LogType.UNEXP_RESTART) != 0) {
                                        aa = 106;
                                        i3 = 32;
                                    } else {
                                        if ((nativeGenerateUnexpLog & 1280) != 0) {
                                            aa = 103;
                                            f.a(10);
                                        } else if ((nativeGenerateUnexpLog & 2304) != 0) {
                                            aa = 107;
                                            f.a(29);
                                        } else {
                                            aa = 102;
                                        }
                                        a(true);
                                    }
                                    f.a(i3);
                                    a(true);
                                }
                                synchronized (obj) {
                                    Y = null;
                                }
                                return;
                            }
                        } else {
                            return;
                        }
                    } finally {
                    }
                }
            case 403:
                aa();
                return;
            case 404:
            default:
                if (!f14240a) {
                    throw new AssertionError();
                }
                return;
            case 405:
                M = false;
                StringBuilder X2 = X();
                String g2 = com.uc.crashsdk.b.g();
                if (X2 != null) {
                    g.a(new File(g2), X2.toString());
                    return;
                }
                return;
            case 406:
                if (f14240a || objArr != null) {
                    a((String) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue());
                    return;
                }
                throw new AssertionError();
            case 407:
                try {
                    com.uc.crashsdk.a.d();
                    return;
                } catch (Throwable th) {
                    g.a(th);
                    return;
                }
            case 408:
                synchronized (ac) {
                    try {
                        if (!ad && g.O() && com.uc.crashsdk.b.A()) {
                            com.uc.crashsdk.b.t();
                            h.f();
                            f.c();
                            if (com.uc.crashsdk.b.G()) {
                                C();
                            }
                            if (g.O()) {
                                a(Calendar.getInstance());
                            }
                            ad = true;
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case IFAAFaceManager.STATUS_FACE_MOUTH_OCCLUSION /* 409 */:
                d(false);
                return;
            case IFAAFaceManager.STATUS_FACE_OFFSET_LEFT /* 410 */:
                a(false, true);
                return;
            case IFAAFaceManager.STATUS_FACE_OFFSET_RIGHT /* 411 */:
                if (com.uc.crashsdk.b.d) {
                    JNIBridge.set(28, d(LogType.NATIVE_TYPE));
                    JNIBridge.set(29, d("anr"));
                    return;
                }
                return;
            case IFAAFaceManager.STATUS_FACE_OFFSET_TOP /* 412 */:
                if (!S && com.uc.crashsdk.b.C() && g.K()) {
                    b(g.a());
                    return;
                } else if (!S) {
                    return;
                } else {
                    if (!com.uc.crashsdk.b.C() || !g.K()) {
                        try {
                            g.a().unregisterReceiver(R);
                            S = false;
                            return;
                        } catch (Throwable th2) {
                            g.a(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            case IFAAFaceManager.STATUS_FACE_OFFSET_BOTTOM /* 413 */:
                JNIBridge.cmd(8);
                return;
            case IFAAFaceManager.STATUS_FACE_CAPTURE /* 414 */:
                try {
                    if (!d(g.a())) {
                        int i4 = O + 1;
                        O = i4;
                        if (i4 < 22) {
                            W();
                            return;
                        } else if (com.uc.crashsdk.b.d) {
                            JNIBridge.set(130, "(get failed)");
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th3) {
                    g.a(th3);
                    return;
                }
            case IFAAFaceManager.STATUS_FACE_NO_FACE /* 415 */:
                if (f14240a || objArr != null) {
                    long longValue = ((Long) objArr[0]).longValue();
                    Calendar instance = Calendar.getInstance();
                    if (instance.getTimeInMillis() >= longValue) {
                        h.g();
                        f.a(100);
                        d(true);
                        f.a(true);
                        h.b();
                    } else {
                        h.h();
                        h.i();
                        h.c();
                    }
                    a(instance);
                    break;
                } else {
                    throw new AssertionError();
                }
            case 416:
                break;
        }
        V();
    }

    public static void l() {
        synchronized (z) {
            y = null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        private final long f14241a;
        private final OutputStream b;
        private int c = 0;
        private int d = 0;
        private boolean e = false;

        public a(long j, OutputStream outputStream) {
            this.f14241a = j;
            this.b = outputStream;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private int a(byte[] r7, int r8, int r9) {
            /*
                r6 = this;
                int r0 = r6.d
                int r0 = r0 + r9
                r6.d = r0
                boolean r0 = r6.e
                if (r0 == 0) goto L_0x000b
                r7 = 0
                return r7
            L_0x000b:
                int r0 = com.uc.crashsdk.g.y()
                if (r0 <= 0) goto L_0x0019
                int r1 = r6.c
                int r2 = r1 + r9
                if (r2 <= r0) goto L_0x0019
                int r0 = r0 - r1
                goto L_0x001a
            L_0x0019:
                r0 = r9
            L_0x001a:
                int r1 = r6.c
                int r1 = r1 + r0
                r6.c = r1
                long r1 = r6.f14241a
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L_0x0030
                java.lang.String r1 = new java.lang.String
                r1.<init>(r7, r8, r0)
                r6.b(r1)
                goto L_0x0035
            L_0x0030:
                java.io.OutputStream r1 = r6.b
                r1.write(r7, r8, r0)
            L_0x0035:
                if (r0 >= r9) goto L_0x003a
                r7 = 1
                r6.e = r7
            L_0x003a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a.a(byte[], int, int):int");
        }

        private void b(String str) {
            if (com.uc.crashsdk.b.d) {
                JNIBridge.nativeClientWriteData(this.f14241a, str);
            }
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            if (e.i && e.N()) {
                com.uc.crashsdk.a.a.d("DEBUG", String.format(Locale.US, "%c", Integer.valueOf(i)));
            }
            if (this.f14241a != 0) {
                b(String.format(Locale.US, "%c", Integer.valueOf(i)));
            } else {
                this.b.write(i);
            }
            this.c++;
            this.d++;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            if (e.i && e.N()) {
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                if (!(i2 == 1 && bArr2[0] == 10)) {
                    try {
                        com.uc.crashsdk.a.a.d("DEBUG", new String(bArr2));
                    } catch (Throwable unused) {
                    }
                }
            }
            a(bArr, i, i2);
        }

        public final void a() {
            try {
                if (this.d - this.c > 0) {
                    a("\n");
                    a("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
                }
                int y = g.y();
                Locale locale = Locale.US;
                int i = this.d;
                int i2 = this.c;
                int i3 = this.d - this.c;
                a("Full: " + i + " bytes, write: " + i2 + " bytes, limit: " + y + " bytes, reject: " + i3 + " bytes.\n");
            } catch (Throwable th) {
                g.a(th);
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            if (e.i && e.N() && !(bArr.length == 1 && bArr[0] == 10)) {
                try {
                    com.uc.crashsdk.a.a.d("DEBUG", new String(bArr));
                } catch (Throwable unused) {
                }
            }
            a(bArr, 0, bArr.length);
        }

        public final void a(String str) {
            if (e.i && e.N()) {
                com.uc.crashsdk.a.a.d("DEBUG", str);
            }
            if (this.f14241a != 0) {
                b(str);
            } else {
                this.b.write(str.getBytes("UTF-8"));
            }
        }
    }

    public static String h() {
        String str = n;
        if (str != null) {
            return str;
        }
        String a2 = a(Process.myPid());
        n = a2;
        return a2;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        long f14242a;
        long b;
        int c;
        int d;
        boolean e;
        boolean f;
        boolean g;

        private d() {
            this.f14242a = 0L;
            this.b = 0L;
            this.c = 0;
            this.d = 0;
            this.e = false;
            this.f = false;
            this.g = false;
        }

        public /* synthetic */ d(byte b) {
            this();
        }
    }

    public static void j() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitNetwork().build());
        } catch (Throwable th) {
            g.a(th);
        }
    }

    public static void m() {
        if (!ah) {
            f.a(1, new com.uc.crashsdk.a.e(IFAAFaceManager.STATUS_FACE_OFFSET_RIGHT), 1000L);
        }
    }

    public static void p() {
        Throwable th;
        if (g.a(C)) {
            String str = null;
            try {
                File file = new File(g.V() + "unique");
                if (file.exists()) {
                    str = g.a(file, 48, false);
                    try {
                        if (str != null) {
                            try {
                                if (str.length() == 36) {
                                    str = str.replaceAll("[^0-9a-zA-Z-]", "-");
                                }
                            } catch (Exception e2) {
                                g.a(e2);
                            }
                        }
                        str = str;
                    } catch (Throwable th2) {
                        th = th2;
                        g.a(th);
                        C = str;
                    }
                }
                if (g.a(str)) {
                    com.uc.crashsdk.b.H();
                    str = UUID.randomUUID().toString();
                    if (!g.a(str)) {
                        g.a(file, str.getBytes());
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
            C = str;
        }
    }

    public static String q() {
        return C;
    }

    public static void r() {
        P = false;
        if (!com.uc.crashsdk.b.C()) {
            f.a(3, new com.uc.crashsdk.a.e(416), 23000L);
        }
        if (!U()) {
            O = 0;
            W();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:2|(2:65|3)|(3:75|6|7)|(4:77|8|(1:10)|13)|71|17|(1:19)(1:22)|23|25|73|26|27|(2:29|30)(1:33)|34|(1:36)(1:37)|38|63|40|(1:42)(1:45)|46|69|48|(1:50)|53|55|67|56|(1:58)|61|62|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(32:2|65|3|(3:75|6|7)|(4:77|8|(1:10)|13)|71|17|(1:19)(1:22)|23|25|73|26|27|(2:29|30)(1:33)|34|(1:36)(1:37)|38|63|40|(1:42)(1:45)|46|69|48|(1:50)|53|55|67|56|(1:58)|61|62|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x010c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x013f, code lost:
        a(r0, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x019d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e5, code lost:
        a(r0, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x022a, code lost:
        a(r0, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x023a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0255, code lost:
        a(r0, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0275, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0276, code lost:
        a(r0, r18);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ec A[Catch: all -> 0x01f3, TryCatch #0 {all -> 0x01f3, blocks: (B:40:0x01e8, B:42:0x01ec, B:45:0x01f5, B:46:0x01f7), top: B:63:0x01e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f5 A[Catch: all -> 0x01f3, TryCatch #0 {all -> 0x01f3, blocks: (B:40:0x01e8, B:42:0x01ec, B:45:0x01f5, B:46:0x01f7), top: B:63:0x01e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0262 A[Catch: all -> 0x0275, TRY_LEAVE, TryCatch #2 {all -> 0x0275, blocks: (B:56:0x025b, B:58:0x0262), top: B:67:0x025b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(java.io.OutputStream r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.b(java.io.OutputStream, java.lang.String, java.lang.String):void");
    }

    public static String n() {
        return a(new Date());
    }

    private static void g(OutputStream outputStream) {
        String str;
        try {
            outputStream.write("recent status:\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            a(th, outputStream);
        }
        try {
            if (ah) {
                str = s("LASTVER");
            } else {
                str = com.uc.crashsdk.a.m();
            }
            Locale locale = Locale.US;
            outputStream.write(("last version: '" + str + "'\n").getBytes("UTF-8"));
        } catch (Throwable th2) {
            a(th2, outputStream);
        }
        try {
            ArrayList<String> arrayList = t;
            synchronized (arrayList) {
                if (v != null) {
                    Locale locale2 = Locale.US;
                    String str2 = v;
                    outputStream.write(("generating log: " + str2 + "\n").getBytes("UTF-8"));
                }
                if (u > 0 || arrayList.size() > 0) {
                    Locale locale3 = Locale.US;
                    int i2 = u;
                    outputStream.write(("generated " + i2 + " logs, recent are:\n").getBytes("UTF-8"));
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        Locale locale4 = Locale.US;
                        outputStream.write(("* " + it.next() + "\n").getBytes("UTF-8"));
                    }
                }
            }
            Locale locale5 = Locale.US;
            boolean z2 = w;
            outputStream.write(("dumping all threads: " + z2 + "\n").getBytes("UTF-8"));
            String str3 = x;
            if (str3 != null) {
                outputStream.write(("dumping threads: " + str3 + "\n").getBytes("UTF-8"));
            }
        } catch (Throwable th3) {
            a(th3, outputStream);
        }
        a(outputStream);
    }

    public static void c(String str) {
        synchronized (A) {
            String l2 = com.uc.crashsdk.b.l();
            com.uc.crashsdk.a.b.a(l2, str + "\n");
        }
    }

    public static void a(boolean z2) {
        File[] listFiles;
        try {
            if (com.uc.crashsdk.b.z() && (listFiles = new File(g.W()).listFiles()) != null) {
                int l2 = g.l();
                int m2 = g.m();
                if (listFiles.length >= Math.min(l2, m2)) {
                    int i2 = 0;
                    int i3 = 0;
                    for (File file : listFiles) {
                        if (b(file)) {
                            i2++;
                        } else {
                            i3++;
                        }
                    }
                    int i4 = (!z2 || i2 < l2) ? 0 : (i2 - l2) + 1;
                    int i5 = (z2 || i3 < m2) ? 0 : (i3 - m2) + 1;
                    if (!(i4 == 0 && i5 == 0)) {
                        Arrays.sort(listFiles, new b((byte) 0));
                        int i6 = i4;
                        int i7 = i5;
                        for (File file2 : listFiles) {
                            boolean b2 = b(file2);
                            if (b2 && i6 > 0) {
                                com.uc.crashsdk.a.a.a("crashsdk", "Delete oldest crash log: " + file2.getPath());
                                file2.delete();
                                i6 += -1;
                            } else if (!b2 && i7 > 0) {
                                com.uc.crashsdk.a.a.a("crashsdk", "Delete oldest custom log: " + file2.getPath());
                                file2.delete();
                                i7 += -1;
                            }
                            if (i6 == 0 && i7 == 0) {
                                break;
                            }
                        }
                        f.a(16, i4 + i5);
                        if (i4 > 0) {
                            f.a(22, i4);
                        }
                        if (i5 > 0) {
                            f.a(23, i5);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            g.a(th);
        }
    }

    public static void c(boolean z2) {
        if (S) {
            if (z2 && g.K()) {
                return;
            }
        } else if (!z2 || !g.K()) {
            return;
        }
        com.uc.crashsdk.a.e eVar = T;
        if (f.b(eVar)) {
            f.a(eVar);
        }
        f.a(0, eVar, 3000L);
    }

    public static void o() {
        b = System.currentTimeMillis();
    }

    public static int f(boolean z2) {
        int i2;
        if (z2) {
            i2 = f.a(com.uc.crashsdk.b.c()) ? 1 : 0;
        } else {
            i2 = f.b();
        }
        int b2 = f.b(z2);
        return b2 > i2 ? b2 : i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(java.io.OutputStream r11) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "UTF-8"
            java.lang.String r3 = "threads count: "
            r4 = 0
            int r5 = com.uc.crashsdk.g.I()     // Catch: all -> 0x0020
            java.io.File r6 = new java.io.File     // Catch: all -> 0x001e
            java.lang.String r7 = "/proc/self/task"
            r6.<init>(r7)     // Catch: all -> 0x001e
            java.io.File[] r4 = r6.listFiles()     // Catch: all -> 0x001e
            if (r4 != 0) goto L_0x001a
            return
        L_0x001a:
            int r6 = r4.length     // Catch: all -> 0x001e
            if (r6 >= r5) goto L_0x0027
            return
        L_0x001e:
            r6 = move-exception
            goto L_0x0023
        L_0x0020:
            r6 = move-exception
            r5 = 300(0x12c, float:4.2E-43)
        L_0x0023:
            com.uc.crashsdk.a.g.a(r6)
            r6 = 0
        L_0x0027:
            if (r4 != 0) goto L_0x002a
            return
        L_0x002a:
            java.lang.String r7 = "threads info:\n"
            byte[] r7 = r7.getBytes(r2)     // Catch: all -> 0x0097
            r11.write(r7)     // Catch: all -> 0x0097
            java.util.Locale r7 = java.util.Locale.US     // Catch: all -> 0x0097
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: all -> 0x0097
            r7.<init>(r3)     // Catch: all -> 0x0097
            r7.append(r6)     // Catch: all -> 0x0097
            java.lang.String r3 = ", dump limit: "
            r7.append(r3)     // Catch: all -> 0x0097
            r7.append(r5)     // Catch: all -> 0x0097
            java.lang.String r3 = ".\n"
            r7.append(r3)     // Catch: all -> 0x0097
            java.lang.String r3 = r7.toString()     // Catch: all -> 0x0097
            byte[] r3 = r3.getBytes(r2)     // Catch: all -> 0x0097
            r11.write(r3)     // Catch: all -> 0x0097
            java.lang.String r3 = " tid     name\n"
            byte[] r3 = r3.getBytes(r2)     // Catch: all -> 0x0097
            r11.write(r3)     // Catch: all -> 0x0097
            int r3 = r4.length     // Catch: all -> 0x0097
            r5 = 0
        L_0x0061:
            if (r5 >= r3) goto L_0x009b
            r6 = r4[r5]     // Catch: all -> 0x0097
            java.io.File r7 = new java.io.File     // Catch: all -> 0x0097
            java.lang.String r8 = r6.getPath()     // Catch: all -> 0x0097
            java.lang.String r9 = "comm"
            r7.<init>(r8, r9)     // Catch: all -> 0x0097
            r8 = 128(0x80, float:1.794E-43)
            java.lang.String r7 = com.uc.crashsdk.a.g.a(r7, r8, r1)     // Catch: all -> 0x0097
            java.lang.String r7 = l(r7)     // Catch: all -> 0x0097
            java.util.Locale r8 = java.util.Locale.US     // Catch: all -> 0x0097
            java.lang.String r9 = "%5s %s\n"
            java.lang.String r6 = r6.getName()     // Catch: all -> 0x0097
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: all -> 0x0097
            r10[r1] = r6     // Catch: all -> 0x0097
            r10[r0] = r7     // Catch: all -> 0x0097
            java.lang.String r6 = java.lang.String.format(r8, r9, r10)     // Catch: all -> 0x0097
            byte[] r6 = r6.getBytes(r2)     // Catch: all -> 0x0097
            r11.write(r6)     // Catch: all -> 0x0097
            int r5 = r5 + r0
            goto L_0x0061
        L_0x0097:
            r0 = move-exception
            a(r0, r11)
        L_0x009b:
            a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.e(java.io.OutputStream):void");
    }

    public static StringBuilder f(String str) {
        return a(Thread.currentThread().getStackTrace(), str);
    }

    public static boolean d(String str) {
        if (ah) {
            return true;
        }
        try {
            return p(str);
        } catch (Throwable th) {
            g.a(th);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(Context context) {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (processesInErrorState = activityManager.getProcessesInErrorState()) == null) {
            return false;
        }
        int myPid = Process.myPid();
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (true) {
            if (it.hasNext()) {
                ActivityManager.ProcessErrorStateInfo next = it.next();
                if (next.pid == myPid) {
                    P = true;
                    if (N()) {
                        com.uc.crashsdk.a.a.d("crashsdk", "ANR occurred in process: " + next.processName);
                    }
                    if (com.uc.crashsdk.b.d) {
                        JNIBridge.set(130, next.longMsg);
                    }
                }
            } else if (com.uc.crashsdk.b.d) {
                V();
            }
        }
        return true;
    }

    public static String a(String str, String str2) {
        String[] strArr;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                strArr = new String[]{"ps", "-ef"};
            } else {
                strArr = new String[]{"ps"};
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(strArr).getInputStream()));
            boolean b2 = g.b(str);
            boolean b3 = g.b(str2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return byteArrayOutputStream.toString("UTF-8");
                }
                if (b2) {
                    if (readLine.contains(str)) {
                        byteArrayOutputStream.write(readLine.getBytes("UTF-8"));
                        byteArrayOutputStream.write("\n".getBytes("UTF-8"));
                    }
                }
                if (b3) {
                    if (readLine.contains(str2)) {
                        byteArrayOutputStream.write(readLine.getBytes("UTF-8"));
                        byteArrayOutputStream.write("\n".getBytes("UTF-8"));
                    }
                }
                if (readLine.indexOf(47) < 0 && readLine.indexOf(46) > 0) {
                    byteArrayOutputStream.write(readLine.getBytes("UTF-8"));
                    byteArrayOutputStream.write("\n".getBytes("UTF-8"));
                }
            }
        } catch (Throwable th) {
            g.a(th);
            return "exception exists.";
        }
    }

    public static void d(boolean z2) {
        f.d(false);
        if (z2) {
            f.a(com.uc.crashsdk.b.c(), false);
            h.i();
            return;
        }
        f.a();
        h.i();
    }

    public static boolean e(String str) {
        try {
            if (!g.b(str) || !str.startsWith("lib") || !str.endsWith(jcq.SO_EXTENSION)) {
                return false;
            }
            System.loadLibrary(str.substring(3, str.length() - 3));
            return true;
        } catch (Throwable th) {
            g.a(th);
            return false;
        }
    }

    public static int e(boolean z2) {
        return f.a(z2);
    }

    private static BufferedReader a(InputStreamReader inputStreamReader) {
        BufferedReader bufferedReader = null;
        int i2 = 8192;
        while (bufferedReader == null && i2 > 0) {
            try {
                bufferedReader = new BufferedReader(inputStreamReader, i2);
            } catch (Throwable unused) {
                i2 /= 2;
                if (i2 < 512) {
                    break;
                }
            }
        }
        return bufferedReader;
    }

    private static void a(OutputStream outputStream) {
        try {
            outputStream.write("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            a(th, outputStream);
        }
    }

    private static String a(File file) {
        String str;
        try {
            str = file.getCanonicalPath();
        } catch (Throwable unused) {
            str = null;
        }
        return g.a(str) ? file.getPath() : str;
    }

    private static void a(OutputStream outputStream, String str, Set<String> set) {
        if (!g.a(str) && !set.contains(str) && !str.equals("/storage/emulated")) {
            set.add(str);
            try {
                StatFs statFs = new StatFs(str);
                long a2 = a(statFs, "getBlockCountLong", "getBlockCount");
                long a3 = a(statFs, "getBlockSizeLong", "getBlockSize");
                if ((a2 / 1024) * a3 >= FileUtil.LOCAL_REPORT_FILE_MAX_SIZE) {
                    long a4 = a(statFs, "getAvailableBlocksLong", "getAvailableBlocks");
                    long a5 = a(statFs, "getFreeBlocksLong", "getFreeBlocks");
                    try {
                        Locale locale = Locale.US;
                        outputStream.write(str.concat(":\n").getBytes("UTF-8"));
                        double d2 = a3;
                        outputStream.write(("  total:      " + ((long) (((a2 * 1.0d) * d2) / 1024.0d)) + " kB\n").getBytes("UTF-8"));
                        outputStream.write(("  available:  " + ((long) (((((double) a4) * 1.0d) * d2) / 1024.0d)) + " kB\n").getBytes("UTF-8"));
                        outputStream.write(("  free:       " + ((long) (((((double) a5) * 1.0d) * d2) / 1024.0d)) + " kB\n").getBytes("UTF-8"));
                        outputStream.write(("  block size: " + a3 + " B\n\n").getBytes("UTF-8"));
                    } catch (Throwable th) {
                        a(th, outputStream);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static void b(OutputStream outputStream) {
        BufferedReader bufferedReader = null;
        try {
            outputStream.write("logcat:\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            try {
                i = true;
                a(th, outputStream);
            } finally {
                g.a((Closeable) null);
            }
        }
        if (g.n() <= 0) {
            outputStream.write("[DEBUG] custom java logcat lines count is 0!\n".getBytes("UTF-8"));
            a(outputStream);
            return;
        }
        int n2 = g.n();
        bufferedReader = a(new InputStreamReader(Runtime.getRuntime().exec(new String[]{LogCategory.CATEGORY_LOGCAT, "-d", "-b", "events", "-b", "main", "-v", "threadtime", "-t", String.valueOf(n2)}).getInputStream()));
        if (bufferedReader == null) {
            outputStream.write("[DEBUG] alloc buffer failed!\n".getBytes("UTF-8"));
            a(outputStream);
            return;
        }
        int i2 = 0;
        i = false;
        int i3 = 0;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            i2++;
            if (i3 < n2 && !readLine.contains(" I auditd ") && !readLine.contains(" I liblog ")) {
                outputStream.write(readLine.getBytes("UTF-8"));
                outputStream.write("\n".getBytes("UTF-8"));
                i3++;
            }
        }
        Locale locale = Locale.US;
        outputStream.write(("[DEBUG] Read " + i2 + " lines, wrote " + i3 + " lines.\n").getBytes("UTF-8"));
        i = true;
        a(outputStream);
    }

    private static long a(StatFs statFs, String str, String str2) {
        try {
            Method declaredMethod = StatFs.class.getDeclaredMethod(str, new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(statFs, new Object[0]);
            if (invoke != null && (invoke instanceof Long)) {
                return ((Long) invoke).longValue();
            }
        } catch (Throwable unused) {
        }
        try {
            Method declaredMethod2 = StatFs.class.getDeclaredMethod(str2, new Class[0]);
            declaredMethod2.setAccessible(true);
            Object invoke2 = declaredMethod2.invoke(statFs, new Object[0]);
            if (invoke2 == null || !(invoke2 instanceof Integer)) {
                return 0L;
            }
            return ((Integer) invoke2).intValue();
        } catch (Throwable th) {
            g.a(th);
            return 0L;
        }
    }

    private static void b(a aVar) {
        i = false;
        try {
            aVar.write((s("LOG_END") + "\n").getBytes("UTF-8"));
        } catch (Throwable th) {
            g.a(th);
        }
        i = true;
    }

    private static void a(a aVar) {
        try {
            Locale locale = Locale.US;
            String n2 = n();
            aVar.a("log end: " + n2 + "\n");
        } catch (Throwable th) {
            a(th, aVar);
        }
    }

    public static int b(OutputStream outputStream, String str, int i2) {
        Throwable th;
        int i3;
        DataInputStream dataInputStream = null;
        int i4 = 0;
        try {
            File file = new File(str);
            if (file.exists()) {
                byte[] Q2 = Q();
                if (Q2 == null) {
                    outputStream.write("(alloc buffer failed!)\n".getBytes("UTF-8"));
                    return 0;
                }
                DataInputStream dataInputStream2 = new DataInputStream(new FileInputStream(file));
                int i5 = 0;
                int i6 = 0;
                loop0: while (true) {
                    boolean z2 = false;
                    while (true) {
                        try {
                            int read = dataInputStream2.read(Q2);
                            if (read == -1) {
                                break loop0;
                            }
                            i5 += read;
                            int i7 = i2 - i6;
                            if (read <= i7 + 32) {
                                i7 = read;
                            }
                            if (i7 > 0 && !z2) {
                                outputStream.write(Q2, 0, i7);
                                i6 += i7;
                            }
                            if (!z2) {
                                if (i7 < read || i6 >= i2) {
                                    z2 = true;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i4 = i6;
                            dataInputStream = dataInputStream2;
                            try {
                                a(th, outputStream);
                                a(outputStream);
                                return i4;
                            } finally {
                                g.a(dataInputStream);
                            }
                        }
                    }
                }
                i3 = i5;
                i4 = i6;
                dataInputStream = dataInputStream2;
            } else {
                outputStream.write(("file: '" + str + "' not exists!\n").getBytes("UTF-8"));
                i3 = 0;
            }
            if (i4 > 0) {
                outputStream.write("\n".getBytes("UTF-8"));
            }
            if (i4 < i3) {
                Locale locale = Locale.US;
                outputStream.write(("(truncated " + (i3 - i4) + " bytes)\n").getBytes("UTF-8"));
            }
        } catch (Throwable th3) {
            th = th3;
        }
        a(outputStream);
        return i4;
    }

    public static int a(OutputStream outputStream, String str, int i2) {
        Throwable th;
        i2 = 0;
        if (str == null) {
            a(outputStream);
            return 0;
        }
        try {
            String a2 = com.uc.crashsdk.a.b.a(str);
            if (a2 == null) {
                a2 = "file: '" + str + "' not found or decode failed!";
            }
            int length = a2.length();
            if (length <= i2 + 32) {
                i2 = length;
            }
            if (i2 > 0) {
                try {
                    outputStream.write(a2.getBytes("UTF-8"), 0, i2);
                    outputStream.write("\n".getBytes("UTF-8"));
                } catch (Throwable th2) {
                    th = th2;
                    i2 = i2;
                    a(th, outputStream);
                    a(outputStream);
                    return i2;
                }
            }
            if (i2 < a2.length()) {
                Locale locale = Locale.US;
                outputStream.write(("(truncated " + (a2.length() - i2) + " bytes)\n").getBytes("UTF-8"));
            }
        } catch (Throwable th3) {
            th = th3;
        }
        a(outputStream);
        return i2;
    }

    public static void b(boolean z2) {
        try {
            boolean z3 = g.r() && com.uc.crashsdk.b.G() && !d;
            if (!z3) {
                z3 = g.s();
            }
            if (z3) {
                if (z2) {
                    String k2 = k();
                    if (!g.a(k2)) {
                        j();
                        a(k2, false, false);
                        return;
                    }
                    return;
                }
                a(true, false);
            }
        } catch (Throwable th) {
            g.a(th);
        }
    }

    public static String a(int i2) {
        try {
            Locale locale = Locale.US;
            String a2 = g.a(new File("/proc/" + i2 + "/cmdline"), 128, false);
            if (g.b(a2)) {
                return l(a2);
            }
            return "unknown";
        } catch (Throwable th) {
            g.a(th);
            return "unknown";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0331 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #14 {all -> 0x006b, blocks: (B:19:0x0057, B:37:0x0128, B:46:0x01a3, B:49:0x01b3, B:51:0x01b8, B:54:0x01ce, B:56:0x01d9, B:65:0x0221, B:67:0x0236, B:71:0x024f, B:88:0x02ea, B:91:0x02fd, B:93:0x0301, B:96:0x0317, B:100:0x032d, B:102:0x0331, B:105:0x0347, B:106:0x0349, B:57:0x01dc, B:36:0x011a, B:21:0x0060, B:99:0x0324, B:48:0x01aa, B:23:0x0071, B:58:0x01e5, B:38:0x012b, B:66:0x0227, B:90:0x02f4, B:39:0x0134, B:103:0x0333, B:44:0x015e, B:41:0x013f, B:52:0x01ba, B:24:0x00b2, B:29:0x00dd, B:30:0x00e0, B:32:0x00e6, B:34:0x00f0, B:59:0x01f3, B:61:0x01f7, B:62:0x020c, B:64:0x0212, B:94:0x0303, B:107:0x034f, B:16:0x0049, B:18:0x004d, B:55:0x01d0, B:35:0x010d, B:43:0x014a, B:97:0x0319, B:45:0x0187), top: B:146:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0378 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x038c A[Catch: all -> 0x0395, TryCatch #10 {all -> 0x0395, blocks: (B:123:0x0388, B:125:0x038c, B:129:0x0399), top: B:154:0x0388 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0301 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #14 {all -> 0x006b, blocks: (B:19:0x0057, B:37:0x0128, B:46:0x01a3, B:49:0x01b3, B:51:0x01b8, B:54:0x01ce, B:56:0x01d9, B:65:0x0221, B:67:0x0236, B:71:0x024f, B:88:0x02ea, B:91:0x02fd, B:93:0x0301, B:96:0x0317, B:100:0x032d, B:102:0x0331, B:105:0x0347, B:106:0x0349, B:57:0x01dc, B:36:0x011a, B:21:0x0060, B:99:0x0324, B:48:0x01aa, B:23:0x0071, B:58:0x01e5, B:38:0x012b, B:66:0x0227, B:90:0x02f4, B:39:0x0134, B:103:0x0333, B:44:0x015e, B:41:0x013f, B:52:0x01ba, B:24:0x00b2, B:29:0x00dd, B:30:0x00e0, B:32:0x00e6, B:34:0x00f0, B:59:0x01f3, B:61:0x01f7, B:62:0x020c, B:64:0x0212, B:94:0x0303, B:107:0x034f, B:16:0x0049, B:18:0x004d, B:55:0x01d0, B:35:0x010d, B:43:0x014a, B:97:0x0319, B:45:0x0187), top: B:146:0x0049 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a(java.lang.Throwable r22, java.lang.String r23, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.Throwable, java.lang.String, long, boolean):java.lang.String");
    }

    private static boolean b(File file) {
        int indexOf;
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(95);
        if (lastIndexOf <= 0 || (indexOf = name.indexOf(46, lastIndexOf)) <= 0) {
            return false;
        }
        String substring = name.substring(lastIndexOf + 1, indexOf);
        return "java".equals(substring) || "ucebujava".equals(substring) || LogType.NATIVE_TYPE.equals(substring) || "ucebujni".equals(substring) || LogType.UNEXP_TYPE.equals(substring) || "anr".equals(substring);
    }

    private static String b(String str, boolean z2, boolean z3) {
        if (z2) {
            try {
                str = m(str);
            } catch (Throwable th) {
                g.a(th);
            }
        }
        if (!z3) {
            return str;
        }
        try {
            return a(str);
        } catch (Throwable th2) {
            g.a(th2);
            return str;
        }
    }

    public static void b(String str, String str2, boolean z2) {
        h.a(str, str2, false, z2);
    }

    public static void b(String str) {
        synchronized (z) {
            y = str;
            com.uc.crashsdk.a.b.a(com.uc.crashsdk.b.i(), str + "\n");
        }
    }

    private static void b(String str, String str2) {
        try {
            com.uc.crashsdk.d.a(str, h(), str2);
        } catch (Throwable th) {
            g.a(th);
        }
    }

    public static void b(Context context) {
        if (g.K()) {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                context.registerReceiver(R, intentFilter, null, f.a(1));
                S = true;
            } catch (Throwable th) {
                g.a(th);
            }
        }
    }

    public static void b(int i2) {
        f.a(0, new com.uc.crashsdk.a.e(IFAAFaceManager.STATUS_FACE_OFFSET_LEFT), i2 * 1000);
    }

    public static String a(String str) {
        int lastIndexOf;
        int indexOf;
        int i2;
        int indexOf2;
        File file;
        byte[] e2;
        byte[] bArr;
        if (!g.x() || (lastIndexOf = str.lastIndexOf(47)) <= 0 || (indexOf = str.indexOf(95, lastIndexOf)) <= lastIndexOf || (indexOf2 = str.indexOf(95, (i2 = indexOf + 1))) <= indexOf) {
            return str;
        }
        String d2 = g.d(n1s.a._MAGIC + str.substring(lastIndexOf + 1, indexOf) + str.substring(i2, indexOf2));
        if (d2 == null || (e2 = g.e((file = new File(str)))) == null || e2.length <= 0) {
            return str;
        }
        try {
            bArr = com.uc.crashsdk.a.c.b(e2, d2.substring(0, 16).getBytes());
        } catch (Throwable th) {
            g.a(th);
            bArr = null;
        }
        if (bArr == null) {
            return str;
        }
        String concat = str.concat(".ec");
        File file2 = new File(concat + ".tmp");
        if (!g.a(file2, bArr)) {
            return str;
        }
        if (!file2.renameTo(new File(concat))) {
            file2.delete();
            return str;
        }
        file.delete();
        return concat;
    }

    public static void a(Throwable th, OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.write("[DEBUG] CrashHandler occurred new exception:\n".getBytes("UTF-8"));
                th.printStackTrace(new PrintStream(outputStream));
                outputStream.write("\n\n".getBytes("UTF-8"));
            } catch (Throwable th2) {
                g.a(th2);
            }
        }
        g.a(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0318 A[Catch: all -> 0x0037, TryCatch #2 {, blocks: (B:167:0x0454, B:168:0x0456, B:170:0x0464, B:4:0x000c, B:6:0x0012, B:8:0x0021, B:9:0x003a, B:11:0x0040, B:12:0x0053, B:14:0x0065, B:16:0x006d, B:17:0x0071, B:19:0x007f, B:21:0x0091, B:23:0x00b7, B:25:0x00c4, B:29:0x00d8, B:36:0x00f6, B:40:0x0104, B:54:0x01ea, B:56:0x01fe, B:58:0x0202, B:59:0x0203, B:61:0x0207, B:62:0x0208, B:63:0x020d, B:67:0x0218, B:69:0x0226, B:71:0x022c, B:73:0x0231, B:75:0x024b, B:77:0x0251, B:79:0x025a, B:80:0x0260, B:82:0x027f, B:83:0x0292, B:85:0x02a4, B:87:0x02b4, B:88:0x02c5, B:90:0x02cd, B:92:0x02d3, B:95:0x02db, B:97:0x02df, B:99:0x02f3, B:101:0x02f7, B:102:0x0309, B:105:0x0318, B:108:0x0327, B:111:0x0336, B:113:0x0344, B:115:0x0351, B:118:0x0358, B:122:0x0365, B:124:0x0371, B:126:0x038b, B:127:0x0390, B:129:0x03a0, B:130:0x03a7, B:131:0x03ad, B:132:0x03ca, B:134:0x03d0, B:137:0x03d8, B:139:0x03e8, B:142:0x03f7, B:144:0x03fe, B:146:0x0407, B:148:0x040e, B:150:0x0415, B:152:0x041c, B:156:0x0427, B:158:0x042e, B:160:0x0435, B:162:0x043c, B:164:0x0443, B:165:0x0449, B:45:0x0141, B:47:0x0147, B:49:0x015b), top: B:174:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0371 A[Catch: all -> 0x0037, TryCatch #2 {, blocks: (B:167:0x0454, B:168:0x0456, B:170:0x0464, B:4:0x000c, B:6:0x0012, B:8:0x0021, B:9:0x003a, B:11:0x0040, B:12:0x0053, B:14:0x0065, B:16:0x006d, B:17:0x0071, B:19:0x007f, B:21:0x0091, B:23:0x00b7, B:25:0x00c4, B:29:0x00d8, B:36:0x00f6, B:40:0x0104, B:54:0x01ea, B:56:0x01fe, B:58:0x0202, B:59:0x0203, B:61:0x0207, B:62:0x0208, B:63:0x020d, B:67:0x0218, B:69:0x0226, B:71:0x022c, B:73:0x0231, B:75:0x024b, B:77:0x0251, B:79:0x025a, B:80:0x0260, B:82:0x027f, B:83:0x0292, B:85:0x02a4, B:87:0x02b4, B:88:0x02c5, B:90:0x02cd, B:92:0x02d3, B:95:0x02db, B:97:0x02df, B:99:0x02f3, B:101:0x02f7, B:102:0x0309, B:105:0x0318, B:108:0x0327, B:111:0x0336, B:113:0x0344, B:115:0x0351, B:118:0x0358, B:122:0x0365, B:124:0x0371, B:126:0x038b, B:127:0x0390, B:129:0x03a0, B:130:0x03a7, B:131:0x03ad, B:132:0x03ca, B:134:0x03d0, B:137:0x03d8, B:139:0x03e8, B:142:0x03f7, B:144:0x03fe, B:146:0x0407, B:148:0x040e, B:150:0x0415, B:152:0x041c, B:156:0x0427, B:158:0x042e, B:160:0x0435, B:162:0x043c, B:164:0x0443, B:165:0x0449, B:45:0x0141, B:47:0x0147, B:49:0x015b), top: B:174:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ca A[Catch: all -> 0x0037, TryCatch #2 {, blocks: (B:167:0x0454, B:168:0x0456, B:170:0x0464, B:4:0x000c, B:6:0x0012, B:8:0x0021, B:9:0x003a, B:11:0x0040, B:12:0x0053, B:14:0x0065, B:16:0x006d, B:17:0x0071, B:19:0x007f, B:21:0x0091, B:23:0x00b7, B:25:0x00c4, B:29:0x00d8, B:36:0x00f6, B:40:0x0104, B:54:0x01ea, B:56:0x01fe, B:58:0x0202, B:59:0x0203, B:61:0x0207, B:62:0x0208, B:63:0x020d, B:67:0x0218, B:69:0x0226, B:71:0x022c, B:73:0x0231, B:75:0x024b, B:77:0x0251, B:79:0x025a, B:80:0x0260, B:82:0x027f, B:83:0x0292, B:85:0x02a4, B:87:0x02b4, B:88:0x02c5, B:90:0x02cd, B:92:0x02d3, B:95:0x02db, B:97:0x02df, B:99:0x02f3, B:101:0x02f7, B:102:0x0309, B:105:0x0318, B:108:0x0327, B:111:0x0336, B:113:0x0344, B:115:0x0351, B:118:0x0358, B:122:0x0365, B:124:0x0371, B:126:0x038b, B:127:0x0390, B:129:0x03a0, B:130:0x03a7, B:131:0x03ad, B:132:0x03ca, B:134:0x03d0, B:137:0x03d8, B:139:0x03e8, B:142:0x03f7, B:144:0x03fe, B:146:0x0407, B:148:0x040e, B:150:0x0415, B:152:0x041c, B:156:0x0427, B:158:0x042e, B:160:0x0435, B:162:0x043c, B:164:0x0443, B:165:0x0449, B:45:0x0141, B:47:0x0147, B:49:0x015b), top: B:174:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fe A[Catch: all -> 0x0037, TryCatch #2 {, blocks: (B:167:0x0454, B:168:0x0456, B:170:0x0464, B:4:0x000c, B:6:0x0012, B:8:0x0021, B:9:0x003a, B:11:0x0040, B:12:0x0053, B:14:0x0065, B:16:0x006d, B:17:0x0071, B:19:0x007f, B:21:0x0091, B:23:0x00b7, B:25:0x00c4, B:29:0x00d8, B:36:0x00f6, B:40:0x0104, B:54:0x01ea, B:56:0x01fe, B:58:0x0202, B:59:0x0203, B:61:0x0207, B:62:0x0208, B:63:0x020d, B:67:0x0218, B:69:0x0226, B:71:0x022c, B:73:0x0231, B:75:0x024b, B:77:0x0251, B:79:0x025a, B:80:0x0260, B:82:0x027f, B:83:0x0292, B:85:0x02a4, B:87:0x02b4, B:88:0x02c5, B:90:0x02cd, B:92:0x02d3, B:95:0x02db, B:97:0x02df, B:99:0x02f3, B:101:0x02f7, B:102:0x0309, B:105:0x0318, B:108:0x0327, B:111:0x0336, B:113:0x0344, B:115:0x0351, B:118:0x0358, B:122:0x0365, B:124:0x0371, B:126:0x038b, B:127:0x0390, B:129:0x03a0, B:130:0x03a7, B:131:0x03ad, B:132:0x03ca, B:134:0x03d0, B:137:0x03d8, B:139:0x03e8, B:142:0x03f7, B:144:0x03fe, B:146:0x0407, B:148:0x040e, B:150:0x0415, B:152:0x041c, B:156:0x0427, B:158:0x042e, B:160:0x0435, B:162:0x043c, B:164:0x0443, B:165:0x0449, B:45:0x0141, B:47:0x0147, B:49:0x015b), top: B:174:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0231 A[Catch: all -> 0x0037, TryCatch #2 {, blocks: (B:167:0x0454, B:168:0x0456, B:170:0x0464, B:4:0x000c, B:6:0x0012, B:8:0x0021, B:9:0x003a, B:11:0x0040, B:12:0x0053, B:14:0x0065, B:16:0x006d, B:17:0x0071, B:19:0x007f, B:21:0x0091, B:23:0x00b7, B:25:0x00c4, B:29:0x00d8, B:36:0x00f6, B:40:0x0104, B:54:0x01ea, B:56:0x01fe, B:58:0x0202, B:59:0x0203, B:61:0x0207, B:62:0x0208, B:63:0x020d, B:67:0x0218, B:69:0x0226, B:71:0x022c, B:73:0x0231, B:75:0x024b, B:77:0x0251, B:79:0x025a, B:80:0x0260, B:82:0x027f, B:83:0x0292, B:85:0x02a4, B:87:0x02b4, B:88:0x02c5, B:90:0x02cd, B:92:0x02d3, B:95:0x02db, B:97:0x02df, B:99:0x02f3, B:101:0x02f7, B:102:0x0309, B:105:0x0318, B:108:0x0327, B:111:0x0336, B:113:0x0344, B:115:0x0351, B:118:0x0358, B:122:0x0365, B:124:0x0371, B:126:0x038b, B:127:0x0390, B:129:0x03a0, B:130:0x03a7, B:131:0x03ad, B:132:0x03ca, B:134:0x03d0, B:137:0x03d8, B:139:0x03e8, B:142:0x03f7, B:144:0x03fe, B:146:0x0407, B:148:0x040e, B:150:0x0415, B:152:0x041c, B:156:0x0427, B:158:0x042e, B:160:0x0435, B:162:0x043c, B:164:0x0443, B:165:0x0449, B:45:0x0141, B:47:0x0147, B:49:0x015b), top: B:174:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024b A[Catch: all -> 0x0037, TryCatch #2 {, blocks: (B:167:0x0454, B:168:0x0456, B:170:0x0464, B:4:0x000c, B:6:0x0012, B:8:0x0021, B:9:0x003a, B:11:0x0040, B:12:0x0053, B:14:0x0065, B:16:0x006d, B:17:0x0071, B:19:0x007f, B:21:0x0091, B:23:0x00b7, B:25:0x00c4, B:29:0x00d8, B:36:0x00f6, B:40:0x0104, B:54:0x01ea, B:56:0x01fe, B:58:0x0202, B:59:0x0203, B:61:0x0207, B:62:0x0208, B:63:0x020d, B:67:0x0218, B:69:0x0226, B:71:0x022c, B:73:0x0231, B:75:0x024b, B:77:0x0251, B:79:0x025a, B:80:0x0260, B:82:0x027f, B:83:0x0292, B:85:0x02a4, B:87:0x02b4, B:88:0x02c5, B:90:0x02cd, B:92:0x02d3, B:95:0x02db, B:97:0x02df, B:99:0x02f3, B:101:0x02f7, B:102:0x0309, B:105:0x0318, B:108:0x0327, B:111:0x0336, B:113:0x0344, B:115:0x0351, B:118:0x0358, B:122:0x0365, B:124:0x0371, B:126:0x038b, B:127:0x0390, B:129:0x03a0, B:130:0x03a7, B:131:0x03ad, B:132:0x03ca, B:134:0x03d0, B:137:0x03d8, B:139:0x03e8, B:142:0x03f7, B:144:0x03fe, B:146:0x0407, B:148:0x040e, B:150:0x0415, B:152:0x041c, B:156:0x0427, B:158:0x042e, B:160:0x0435, B:162:0x043c, B:164:0x0443, B:165:0x0449, B:45:0x0141, B:47:0x0147, B:49:0x015b), top: B:174:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.String, boolean, boolean):void");
    }

    public static boolean a(boolean z2, boolean z3) {
        if (!d) {
            if (com.uc.crashsdk.b.d) {
                JNIBridge.set(1, true);
            }
            d = true;
        }
        try {
            String k2 = k();
            if (g.a(k2)) {
                com.uc.crashsdk.a.a.a("crashsdk", "CrashHandler url is empty!");
                return false;
            }
            if (f.a(z2 ? 1 : 0, new com.uc.crashsdk.a.e(406, new Object[]{k2, Boolean.valueOf(z3), Boolean.valueOf(z2)})) && z2) {
                ConditionVariable conditionVariable = p;
                conditionVariable.close();
                if (!conditionVariable.block(3000L)) {
                    com.uc.crashsdk.a.a.a("crashsdk", "timeout to wait for uploading");
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            g.a(th);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(java.lang.String r5, com.uc.crashsdk.a.e r6) {
        /*
            java.lang.Object r0 = com.uc.crashsdk.e.q
            monitor-enter(r0)
            java.io.File r1 = new java.io.File     // Catch: all -> 0x0012
            r1.<init>(r5)     // Catch: all -> 0x0012
            boolean r5 = r1.exists()     // Catch: all -> 0x0012
            if (r5 != 0) goto L_0x0018
            r1.createNewFile()     // Catch: all -> 0x0012, Exception -> 0x0014
            goto L_0x0018
        L_0x0012:
            r5 = move-exception
            goto L_0x006a
        L_0x0014:
            r5 = move-exception
            com.uc.crashsdk.a.g.a(r5)     // Catch: all -> 0x0012
        L_0x0018:
            r5 = 0
            r2 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: all -> 0x0027, Exception -> 0x0029
            java.lang.String r4 = "rw"
            r3.<init>(r1, r4)     // Catch: all -> 0x0027, Exception -> 0x0029
            java.nio.channels.FileChannel r1 = r3.getChannel()     // Catch: all -> 0x0027, Exception -> 0x0029
            goto L_0x002e
        L_0x0027:
            r6 = move-exception
            goto L_0x0066
        L_0x0029:
            r1 = move-exception
            com.uc.crashsdk.a.g.a(r1)     // Catch: all -> 0x0027, Exception -> 0x005d
            r1 = r5
        L_0x002e:
            if (r1 == 0) goto L_0x003f
            java.nio.channels.FileLock r5 = r1.lock()     // Catch: all -> 0x0035, Exception -> 0x0038
            goto L_0x003f
        L_0x0035:
            r6 = move-exception
            r5 = r1
            goto L_0x0066
        L_0x0038:
            r3 = move-exception
            com.uc.crashsdk.a.g.a(r3)     // Catch: all -> 0x0035, Exception -> 0x003d
            goto L_0x003f
        L_0x003d:
            r5 = move-exception
            goto L_0x0060
        L_0x003f:
            boolean r2 = r6.a()     // Catch: all -> 0x0051
            if (r5 == 0) goto L_0x004d
            r5.release()     // Catch: all -> 0x0035, Exception -> 0x0049
            goto L_0x004d
        L_0x0049:
            r5 = move-exception
            com.uc.crashsdk.a.g.a(r5)     // Catch: all -> 0x0035, Exception -> 0x003d
        L_0x004d:
            com.uc.crashsdk.a.g.a(r1)     // Catch: all -> 0x0012
            goto L_0x0064
        L_0x0051:
            r6 = move-exception
            if (r5 == 0) goto L_0x005c
            r5.release()     // Catch: all -> 0x0035, Exception -> 0x0058
            goto L_0x005c
        L_0x0058:
            r5 = move-exception
            com.uc.crashsdk.a.g.a(r5)     // Catch: all -> 0x0035, Exception -> 0x003d
        L_0x005c:
            throw r6     // Catch: all -> 0x0035, Exception -> 0x003d
        L_0x005d:
            r6 = move-exception
            r1 = r5
            r5 = r6
        L_0x0060:
            com.uc.crashsdk.a.g.a(r5)     // Catch: all -> 0x0035
            goto L_0x004d
        L_0x0064:
            monitor-exit(r0)     // Catch: all -> 0x0012
            return r2
        L_0x0066:
            com.uc.crashsdk.a.g.a(r5)     // Catch: all -> 0x0012
            throw r6     // Catch: all -> 0x0012
        L_0x006a:
            monitor-exit(r0)     // Catch: all -> 0x0012
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.String, com.uc.crashsdk.a.e):boolean");
    }

    private static boolean a(String str, d dVar) {
        String a2 = g.a(new File(str), 64, false);
        if (a2 == null) {
            return false;
        }
        try {
            Matcher matcher = Pattern.compile("(\\d+)\\s+(\\d+)\\s+(\\d+)\\s+(\\d+)").matcher(a2);
            if (matcher.find()) {
                long parseLong = Long.parseLong(matcher.group(1));
                if (System.currentTimeMillis() - parseLong < 86400000) {
                    dVar.b = Long.parseLong(matcher.group(2));
                    dVar.c = Integer.parseInt(matcher.group(3));
                    dVar.d = Integer.parseInt(matcher.group(4));
                    dVar.f14242a = parseLong;
                }
            }
        } catch (Throwable th) {
            g.a(th);
        }
        return true;
    }

    public static boolean a(StringBuffer stringBuffer, String str, long j2, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, String str2) {
        long j3;
        boolean a2;
        long j4;
        if (c.get()) {
            com.uc.crashsdk.a.a.b("Processing java crash, skip generate custom log: " + str);
            return false;
        }
        boolean z2 = ah || com.uc.crashsdk.b.M();
        if (!z2 && !com.uc.crashsdk.a.d.e()) {
            com.uc.crashsdk.a.a.c("DEBUG", com.uc.crashsdk.a.d.b());
            return false;
        } else if (!d(str)) {
            com.uc.crashsdk.a.a.d("DEBUG", "custom log sample miss: " + str);
            return false;
        } else if (Z()) {
            com.uc.crashsdk.a.a.b("Processing native crash, skip generate custom log: " + str);
            return false;
        } else if (stringBuffer == null || str == null) {
            return false;
        } else {
            String str3 = g.W() + k(str);
            boolean z3 = (j2 & 32) != 0;
            if (z2) {
                if (com.uc.crashsdk.b.d) {
                    int i2 = z3 ? 1 : 0;
                    int i3 = z3 ? 1 : 0;
                    j4 = JNIBridge.nativeClientCreateConnection(str3, "custom", str, i2);
                } else {
                    j4 = 0;
                }
                if (j4 == 0) {
                    com.uc.crashsdk.a.a.d("DEBUG", "skip custom log: ".concat(str));
                    return false;
                }
                j3 = j4;
            } else if (a(h(), str, z3)) {
                return false;
            } else {
                g.a();
                a(false);
                j3 = 0;
            }
            synchronized (r) {
                a2 = a(str3, j3, stringBuffer, str, j2, arrayList, arrayList2, arrayList3, str2);
            }
            if (a2 && !z2) {
                b(h(), str, z3);
            }
            if (j3 != 0) {
                JNIBridge.nativeClientCloseConnection(j3);
            }
            if (!a2) {
                return false;
            }
            if (!z2) {
                r(str3);
            }
            if (!z2) {
                str3 = a(m(str3));
            }
            b(str3, str);
            if (!z3 || z2) {
                return true;
            }
            try {
                a(true, false);
                return true;
            } catch (Throwable th) {
                g.a(th);
                return true;
            }
        }
    }

    public static boolean a(String str, String str2, boolean z2) {
        if (!o(str2)) {
            return false;
        }
        h.a(str, str2, true, z2);
        Locale locale = Locale.US;
        com.uc.crashsdk.a.a.b("Custom log '" + str2 + "' has reach max count!");
        return true;
    }

    private static void a(a aVar, String str, long j2) {
        String str2 = null;
        if (com.uc.crashsdk.b.d) {
            try {
                aVar.flush();
            } catch (Throwable th) {
                g.a(th);
            }
            str2 = JNIBridge.nativeDumpThreads(str, j2);
            if (ah || str2 == null || str2.length() >= 512 || !str2.startsWith("/") || str2.indexOf(10) >= 0) {
                str2 = str2;
            } else {
                if (!new File(str2).exists()) {
                    str2 = "Can not found ".concat(str2);
                }
                str2 = str2;
            }
        } else {
            str2 = "Native not initialized, skip dump!";
        }
        if (str2 != null) {
            try {
                aVar.write(str2.getBytes("UTF-8"));
                aVar.write("\n".getBytes("UTF-8"));
            } catch (Throwable th2) {
                g.a(th2);
            }
            a((OutputStream) aVar);
        } else if (str2 != null && !ah) {
            b(aVar, str2, 1048576);
            File file = new File(str2);
            if (file.exists()) {
                file.delete();
            }
        }
        try {
            aVar.flush();
        } catch (Throwable th3) {
            g.a(th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(java.lang.String r18, long r19, java.lang.StringBuffer r21, java.lang.String r22, long r23, java.util.ArrayList<java.lang.String> r25, java.util.ArrayList<java.lang.String> r26, java.util.ArrayList<java.lang.String> r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.String, long, java.lang.StringBuffer, java.lang.String, long, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.String):boolean");
    }

    private static String a(Date date) {
        return String.format(Locale.US, "%d%02d%02d%02d%02d%02d", Integer.valueOf(date.getYear() + 1900), Integer.valueOf(date.getMonth() + 1), Integer.valueOf(date.getDate()), Integer.valueOf(date.getHours()), Integer.valueOf(date.getMinutes()), Integer.valueOf(date.getSeconds()));
    }

    public static void a(OutputStream outputStream, String str, String str2, int i2, boolean z2, boolean z3) {
        i = false;
        try {
            Locale locale = Locale.US;
            outputStream.write(("$^" + str + "`" + str2 + "`" + i2 + "`" + (z2 ? 1 : 0) + "," + (z3 ? 1 : 0) + "^$").getBytes("UTF-8"));
        } catch (Throwable th) {
            g.a(th);
        }
        i = true;
        a(outputStream);
    }

    public static void a(OutputStream outputStream, String str, String str2) {
        i = false;
        try {
            Locale locale = Locale.US;
            outputStream.write(("$^" + str + "`" + str2 + "^$").getBytes("UTF-8"));
        } catch (Throwable th) {
            g.a(th);
        }
        i = true;
    }

    public static void a(Context context) {
        try {
            if (U()) {
                context.registerReceiver(new c((byte) 0), new IntentFilter("android.intent.action.ANR"), null, f.a(3));
            }
        } catch (Throwable th) {
            g.a(th);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:67|(3:535|69|(15:531|72|73|(1:82)|543|83|491|86|(1:88)|89|(1:93)|96|(1:99)|101|(2:103|104)(1:561)))|79|(1:82)|543|83|491|86|(0)|89|(2:91|93)|96|(1:99)|101|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:(1:278)|(3:511|280|(17:283|509|284|285|(1:294)|527|295|549|298|(1:300)|301|(1:305)|308|(1:311)|312|314|(2:316|317)(1:565)))|291|(1:294)|527|295|549|298|(0)|301|(2:303|305)|308|(1:311)|312|314|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:135|(3:477|137|(17:140|553|141|142|(1:151)|494|152|513|155|(1:157)|158|(1:162)|165|(1:168)|169|171|(2:173|174)(1:562)))|148|(1:151)|494|152|513|155|(0)|158|(2:160|162)|165|(1:168)|169|171|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:178|(3:487|180|(17:183|479|184|185|(1:194)|500|195|523|198|(1:200)|201|(1:205)|208|(1:211)|212|214|(2:216|217)(1:563)))|191|(1:194)|500|195|523|198|(0)|201|(2:203|205)|208|(1:211)|212|214|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:228|(1:232)|(3:507|234|(17:237|504|238|239|(1:248)|519|249|547|252|(1:254)|255|(1:259)|262|(1:265)|266|268|(2:270|271)(1:564)))|245|(1:248)|519|249|547|252|(0)|255|(2:257|259)|262|(1:265)|266|268|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:14|(5:17|18|19|(2:557|21)|15)|558|25|(3:533|27|(15:529|30|31|(1:40)|541|41|485|44|(1:46)|47|(1:51)|54|(1:57)|59|(2:61|62)(1:560)))|37|(1:40)|541|41|485|44|(0)|47|(2:49|51)|54|(1:57)|59|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(21:383|384|430|(1:434)|(3:481|436|(19:439|475|440|441|(0)|451|498|452|521|455|(0)|458|(2:460|462)|465|(1:468)|469|471|(0)|474))|447|(0)|451|498|452|521|455|(0)|458|(0)|465|(0)|469|471|(0)|474) */
    /* JADX WARN: Can't wrap try/catch for region: R(22:537|379|(1:381)|382|385|(1:389)|(3:555|391|(17:394|551|395|396|(1:406)(1:405)|496|407|515|410|(1:412)|413|(1:417)|420|(1:423)|424|426|(2:428|429)(1:567)))|402|(0)|406|496|407|515|410|(0)|413|(2:415|417)|420|(1:423)|424|426|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(26:(2:545|112)|(28:114|(1:116)|120|121|126|493|(5:128|129|(1:131)(1:132)|133|(16:135|(3:477|137|(17:140|553|141|142|(1:151)|494|152|513|155|(1:157)|158|(1:162)|165|(1:168)|169|171|(2:173|174)(1:562)))|148|(1:151)|494|152|513|155|(0)|158|(2:160|162)|165|(1:168)|169|171|(0)(0))(2:176|(16:178|(3:487|180|(17:183|479|184|185|(1:194)|500|195|523|198|(1:200)|201|(1:205)|208|(1:211)|212|214|(2:216|217)(1:563)))|191|(1:194)|500|195|523|198|(0)|201|(2:203|205)|208|(1:211)|212|214|(0)(0))(1:218)))(6:(1:220)|221|(1:223)(1:225)|224|226|(17:228|(1:232)|(3:507|234|(17:237|504|238|239|(1:248)|519|249|547|252|(1:254)|255|(1:259)|262|(1:265)|266|268|(2:270|271)(1:564)))|245|(1:248)|519|249|547|252|(0)|255|(2:257|259)|262|(1:265)|266|268|(0)(0))(1:(16:(1:278)|(3:511|280|(17:283|509|284|285|(1:294)|527|295|549|298|(1:300)|301|(1:305)|308|(1:311)|312|314|(2:316|317)(1:565)))|291|(1:294)|527|295|549|298|(0)|301|(2:303|305)|308|(1:311)|312|314|(0)(0))))|318|(1:333)(8:323|(1:325)|326|327|328|329|502|330)|331|334|(2:336|(1:338))|(3:525|340|(17:343|517|344|345|(1:355)(1:354)|539|356|483|359|(1:361)|362|(1:366)|369|(1:372)|373|375|(2:377|378)(1:566)))|351|(0)|355|539|356|483|359|(0)|362|(2:364|366)|369|(1:372)|373|375|(0)(0))|493|(0)(0)|318|(0)|333|331|334|(0)|(0)|351|(0)|355|539|356|483|359|(0)|362|(0)|369|(0)|373|375|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0144, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x023c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x023d, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0265, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0278, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02c4, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x02ec, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02ff, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x036b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x036c, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0394, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x03a7, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x03f1, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x03f2, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x041a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x042d, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x05bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x05be, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x05e6, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x05f9, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0643, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0644, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x066c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x067f, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00af, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c1, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0109, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010a, code lost:
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0132, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e3 A[Catch: all -> 0x01fb, TRY_ENTER, TRY_LEAVE, TryCatch #45 {all -> 0x028c, blocks: (B:135:0x0212, B:176:0x0290, B:178:0x0296, B:220:0x0319, B:221:0x031f, B:223:0x0323, B:128:0x01e3, B:129:0x01e6, B:131:0x01ec, B:132:0x01f3, B:133:0x01ff), top: B:493:0x01e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0233 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x025d A[Catch: all -> 0x0265, TryCatch #25 {all -> 0x0265, blocks: (B:155:0x0241, B:158:0x024c, B:160:0x025d, B:162:0x0261, B:165:0x0267, B:168:0x026f), top: B:513:0x0241 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x026d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02e4 A[Catch: all -> 0x02ec, TryCatch #30 {all -> 0x02ec, blocks: (B:198:0x02c8, B:201:0x02d3, B:203:0x02e4, B:205:0x02e8, B:208:0x02ee, B:211:0x02f6), top: B:523:0x02c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0362 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x038c A[Catch: all -> 0x0394, TryCatch #47 {all -> 0x0394, blocks: (B:252:0x0370, B:255:0x037b, B:257:0x038c, B:259:0x0390, B:262:0x0396, B:265:0x039e), top: B:547:0x0370 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x039c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0412 A[Catch: all -> 0x041a, TryCatch #48 {all -> 0x041a, blocks: (B:298:0x03f6, B:301:0x0401, B:303:0x0412, B:305:0x0416, B:308:0x041c, B:311:0x0424), top: B:549:0x03f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0422 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0452 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x04d3 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x04f9 A[ADDED_TO_REGION, DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0514 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0526 A[Catch: all -> 0x052e, DONT_GENERATE, TryCatch #8 {all -> 0x052e, blocks: (B:359:0x050a, B:362:0x0515, B:364:0x0526, B:366:0x052a, B:369:0x0530, B:372:0x0538), top: B:483:0x050a }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0536 A[ADDED_TO_REGION, DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x054d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x05b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x05de A[Catch: all -> 0x05e6, TryCatch #26 {all -> 0x05e6, blocks: (B:410:0x05c2, B:413:0x05cd, B:415:0x05de, B:417:0x05e2, B:420:0x05e8, B:423:0x05f0), top: B:515:0x05c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x05ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0637 A[ADDED_TO_REGION, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0652 A[FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0664 A[Catch: all -> 0x066c, FINALLY_INSNS, TryCatch #29 {all -> 0x066c, blocks: (B:455:0x0648, B:458:0x0653, B:460:0x0664, B:462:0x0668, B:465:0x066e, B:468:0x0676), top: B:521:0x0648 }] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0674 A[ADDED_TO_REGION, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x068b A[FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7 A[Catch: all -> 0x00af, TryCatch #9 {all -> 0x00af, blocks: (B:44:0x008b, B:47:0x0096, B:49:0x00a7, B:51:0x00ab, B:54:0x00b1, B:57:0x00b9), top: B:485:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:525:0x04dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:560:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:561:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:562:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:563:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:564:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:565:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:566:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:567:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012a A[Catch: all -> 0x0132, TryCatch #12 {all -> 0x0132, blocks: (B:86:0x010e, B:89:0x0119, B:91:0x012a, B:93:0x012e, B:96:0x0134, B:99:0x013c), top: B:491:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013a A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [long] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Thread r23, java.lang.Throwable r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.Thread, java.lang.Throwable, boolean):void");
    }

    private static void a(Throwable th) {
        try {
            com.uc.crashsdk.a.a.d("DEBUG", a(th.getStackTrace(), (String) null).toString());
        } catch (Throwable unused) {
        }
    }

    private static void a(Calendar calendar) {
        if (g.R()) {
            long timeInMillis = calendar.getTimeInMillis();
            calendar.add(5, 1);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            long timeInMillis2 = calendar.getTimeInMillis();
            long j2 = timeInMillis2 - timeInMillis;
            long j3 = 3600000;
            if (j2 <= 3600000) {
                j3 = 1000 + j2;
            }
            f.a(0, new com.uc.crashsdk.a.e(IFAAFaceManager.STATUS_FACE_NO_FACE, new Object[]{Long.valueOf(timeInMillis2)}), j3 + (e.nextInt(ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT) * 1000));
        }
    }

    public static StringBuilder a(StackTraceElement[] stackTraceElementArr, String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            boolean z2 = str == null;
            int i3 = 0;
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                i3++;
                sb.append("  at ");
                sb.append(stackTraceElement.toString());
                sb.append("\n");
                if (!z2 && stackTraceElement.getMethodName().contains(str)) {
                    sb.delete(0, sb.length());
                    z2 = true;
                    i3 = 0;
                }
            }
            i2 = i3;
        }
        if (i2 == 0) {
            sb.append("  (no java stack)\n");
        }
        return sb;
    }

    public static boolean a(ParcelFileDescriptor parcelFileDescriptor) {
        if (ag) {
            com.uc.crashsdk.a.a.d("crashsdk", "Can not call setHostFd and getHostFd in the same process!");
            return false;
        } else if (!com.uc.crashsdk.b.d) {
            com.uc.crashsdk.a.a.d("crashsdk", "Crash so is not loaded!");
            return false;
        } else {
            if (af != null) {
                com.uc.crashsdk.a.a.c("crashsdk", "Has already set host fd!");
            }
            af = parcelFileDescriptor;
            int fd = parcelFileDescriptor.getFd();
            int nativeCmd = (int) JNIBridge.nativeCmd(13, fd, null, null);
            ah = nativeCmd != -1;
            return fd == -1 || nativeCmd != -1;
        }
    }
}
