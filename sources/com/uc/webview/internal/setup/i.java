package com.uc.webview.internal.setup;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.utils.FileUtil;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.io.a;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.export.Build;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class i extends l {
    private static final AtomicBoolean C = new AtomicBoolean(false);
    private static volatile i D = null;

    /* renamed from: a  reason: collision with root package name */
    final boolean f14471a;
    int b = 1;
    private boolean E = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c extends b {
        public c(l lVar) {
            super((byte) 0);
            String str;
            this.f14473a = new String[14];
            File v = lVar.v();
            a(0, "2");
            a(1, String.valueOf(lVar.integrationType()));
            a(2, String.valueOf(lVar.f()));
            a(3, String.valueOf(lVar.l()));
            a(4, a.a());
            a(5, lVar.d());
            a(6, lVar.e());
            a(7, lVar.m());
            a(8, lVar.n());
            a(9, lVar.o());
            a(10, lVar.path());
            if (v != null) {
                str = v.getAbsolutePath();
            } else {
                str = lVar.w();
            }
            a(11, str);
            a(12, a.a(lVar.coreClassLoader()));
            a(13, a.a(lVar.l(), lVar.path()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d extends b {
        public final boolean b;
        public final int c;
        public int d;
        public int e;
        public boolean f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;

        public d(Context context) {
            super((byte) 0);
            String[] strArr;
            int i;
            e eVar = new e(context);
            String a2 = eVar.a();
            if (TextUtils.isEmpty(a2)) {
                strArr = null;
            } else {
                strArr = a2.split("`");
            }
            int i2 = 19;
            if (strArr != null && strArr.length >= 14) {
                this.f14473a = strArr;
                boolean a3 = a();
                this.b = a3;
                this.c = a3 ? 1 : i2;
            } else if (strArr == null || strArr.length != 12) {
                this.f14473a = null;
                this.b = false;
                if (TextUtils.isEmpty(a2)) {
                    i = eVar.c;
                } else {
                    i = 18;
                }
                this.c = i;
            } else {
                this.f14473a = strArr;
                boolean b = b();
                this.b = b;
                this.c = b ? 1 : i2;
            }
        }

        private boolean a() {
            try {
                if (!"2".equals(a(0))) {
                    return false;
                }
                this.d = c(1);
                this.e = c(2);
                this.f = b(3);
                this.g = a(4);
                this.h = a(5);
                this.i = a(6);
                this.j = a(7);
                this.k = a(8);
                this.l = a(9);
                this.m = a(10);
                this.n = a(11);
                this.o = a(12);
                this.p = a(13);
                if (!TextUtils.isEmpty(this.g) && !TextUtils.isEmpty(this.j) && !TextUtils.isEmpty(this.l) && !TextUtils.isEmpty(this.m)) {
                    if (TextUtils.isEmpty(this.n)) {
                        if (this.e > 0) {
                        }
                    }
                    return true;
                }
                return false;
            } catch (Throwable th) {
                Log.d("LRCI", "getSMI falied", th);
                return false;
            }
        }

        private boolean b() {
            try {
                this.d = c(0);
                this.f = b(1);
                int i = 2;
                this.g = a(2);
                this.j = a(3);
                this.l = a(4);
                this.m = a(5);
                this.n = a(6);
                this.o = a(7);
                this.p = a(8);
                if (!b(11)) {
                    i = 1;
                }
                this.e = i;
                this.k = a(10);
                this.h = a(9);
                if (!TextUtils.isEmpty(this.g) && !TextUtils.isEmpty(this.j) && !TextUtils.isEmpty(this.l) && !TextUtils.isEmpty(this.m)) {
                    if (TextUtils.isEmpty(this.n)) {
                        if (this.e > 0) {
                        }
                    }
                    return true;
                }
                return false;
            } catch (Throwable th) {
                Log.d("LRCI", "getOSMI falied", th);
                return false;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        static final AtomicInteger f14474a = new AtomicInteger(0);
        final File b;
        int c = 0;
        private final Context d;

        public e(Context context) {
            this.d = context;
            this.b = PathUtils.b(context);
        }

        public final String a() {
            com.uc.webview.base.io.a aVar;
            Throwable th;
            AtomicInteger atomicInteger = f14474a;
            synchronized (atomicInteger) {
                try {
                    if (!this.b.exists()) {
                        this.c = 0;
                        return null;
                    }
                    com.uc.webview.base.io.a b = b();
                    try {
                        if (!b.a()) {
                            this.c = 15;
                            b.d();
                            return null;
                        }
                        String c = b.c();
                        String trim = TextUtils.isEmpty(c) ? null : c.trim();
                        if (!TextUtils.isEmpty(trim)) {
                            this.c = 1;
                            atomicInteger.set(trim.hashCode());
                        } else {
                            this.c = 16;
                        }
                        Log.i("LRCI", "load:".concat(String.valueOf(trim)));
                        b.d();
                        return trim;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = b;
                        Log.w("LRCI", "load failed:", th);
                        if (aVar != null) {
                            aVar.d();
                        }
                        this.c = 17;
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    aVar = null;
                }
            }
        }

        public final com.uc.webview.base.io.a b() {
            return new com.uc.webview.base.io.a(this.b, FileUtil.LOCAL_REPORT_FILE_MAX_SIZE, new a.b());
        }
    }

    private i(d dVar) {
        this.f = true;
        this.h = false;
        this.d = dVar.e;
        this.e = dVar.d;
        this.c = dVar.f;
        this.t = dVar.j;
        this.u = dVar.k;
        this.v = dVar.l;
        this.w = dVar.o;
        this.l = new File(dVar.m);
        if (!TextUtils.isEmpty(dVar.n)) {
            if (4 == this.e) {
                this.q = dVar.n;
            } else {
                this.p = new File(dVar.n);
            }
        }
        a();
        a(this.l);
        this.f14471a = a(dVar);
    }

    public static i a(Context context) {
        b(context);
        if (GlobalSettings.getBoolValue(88)) {
            return D;
        }
        return null;
    }

    public static void c(Context context) {
        e eVar = new e(context);
        synchronized (e.f14474a) {
            com.uc.webview.base.io.d.c("LRCI-cl", eVar.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        protected String[] f14473a;

        private b() {
            this.f14473a = null;
        }

        public final void a(int i, String str) {
            String[] strArr = this.f14473a;
            if (i <= strArr.length) {
                if (str == null) {
                    str = "";
                }
                strArr[i] = str;
            }
        }

        public final boolean b(int i) {
            String a2 = a(i);
            if (!TextUtils.isEmpty(a2)) {
                return Boolean.valueOf(a2).booleanValue();
            }
            return false;
        }

        public final int c(int i) {
            String a2 = a(i);
            if (!TextUtils.isEmpty(a2)) {
                return Integer.valueOf(a2).intValue();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                String[] strArr = this.f14473a;
                if (strArr == null || i >= strArr.length) {
                    break;
                }
                sb.append(strArr[i]);
                if (i != this.f14473a.length - 1) {
                    sb.append("`");
                }
                i++;
            }
            return sb.toString();
        }

        public /* synthetic */ b(byte b) {
            this();
        }

        public final String a(int i) {
            String[] strArr = this.f14473a;
            return i > strArr.length ? "" : strArr[i];
        }
    }

    public static void b(Context context) {
        if (GlobalSettings.getBoolValue(88)) {
            AtomicBoolean atomicBoolean = C;
            if (!atomicBoolean.get()) {
                synchronized (atomicBoolean) {
                    if (!atomicBoolean.get()) {
                        try {
                            d dVar = new d(context);
                            if (dVar.b) {
                                D = new i(dVar);
                            } else {
                                com.uc.webview.base.timing.a.a((int) StartupTimingKeys.INVALID_LRCI_REASON, dVar.c);
                                Log.w("LRCI", "init failed: invalid info " + dVar.c);
                            }
                            atomicBoolean.set(true);
                        } catch (UCKnownException e2) {
                            Log.d("LRCI", "reuse failed:" + e2.errMsg(), e2);
                            C.set(true);
                        }
                    }
                }
            }
        }
    }

    public static boolean a(final Context context, final l lVar) {
        if (context == null || lVar == null) {
            Log.b();
            return false;
        } else if (lVar.v() != null || !TextUtils.isEmpty(lVar.w()) || lVar.h()) {
            com.uc.webview.base.task.d.a("saveLRCI", new Runnable() { // from class: com.uc.webview.internal.setup.i.1
                /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
                    if (r0 == null) goto L_0x006c;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        r6 = this;
                        com.uc.webview.internal.setup.i$e r0 = new com.uc.webview.internal.setup.i$e
                        android.content.Context r1 = r1
                        r0.<init>(r1)
                        com.uc.webview.internal.setup.i$c r1 = new com.uc.webview.internal.setup.i$c
                        com.uc.webview.internal.setup.l r2 = r2
                        r1.<init>(r2)
                        java.lang.String r1 = r1.toString()
                        java.util.concurrent.atomic.AtomicInteger r2 = com.uc.webview.internal.setup.i.e.f14474a
                        monitor-enter(r2)
                        boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: all -> 0x001d
                        if (r3 == 0) goto L_0x001f
                        monitor-exit(r2)     // Catch: all -> 0x001d
                        return
                    L_0x001d:
                        r0 = move-exception
                        goto L_0x0075
                    L_0x001f:
                        int r3 = r1.hashCode()     // Catch: all -> 0x001d
                        int r4 = r2.get()     // Catch: all -> 0x001d
                        if (r3 != r4) goto L_0x002b
                        monitor-exit(r2)     // Catch: all -> 0x001d
                        return
                    L_0x002b:
                        com.uc.webview.base.io.a r0 = r0.b()     // Catch: all -> 0x005f
                        com.uc.webview.base.io.a$d r3 = r0.c     // Catch: all -> 0x003e
                        if (r3 != 0) goto L_0x0040
                        com.uc.webview.base.io.a$d r3 = new com.uc.webview.base.io.a$d     // Catch: all -> 0x003e
                        java.io.File r4 = r0.f14270a     // Catch: all -> 0x003e
                        r5 = 0
                        r3.<init>(r4, r5)     // Catch: all -> 0x003e
                        r0.c = r3     // Catch: all -> 0x003e
                        goto L_0x0040
                    L_0x003e:
                        r1 = move-exception
                        goto L_0x0061
                    L_0x0040:
                        com.uc.webview.base.io.a$d r3 = r0.c     // Catch: all -> 0x003e
                        com.uc.webview.base.io.a$a r4 = r0.b     // Catch: all -> 0x003e
                        if (r4 == 0) goto L_0x004b
                        java.lang.String r4 = r4.a(r1)     // Catch: all -> 0x003e
                        goto L_0x004c
                    L_0x004b:
                        r4 = r1
                    L_0x004c:
                        r3.a(r4)     // Catch: all -> 0x003e
                        java.lang.String r3 = "LRCI"
                        java.lang.String r4 = "save:"
                        java.lang.String r1 = r4.concat(r1)     // Catch: all -> 0x003e
                        com.uc.webview.base.Log.i(r3, r1)     // Catch: all -> 0x003e
                    L_0x005b:
                        r0.d()     // Catch: all -> 0x001d
                        goto L_0x006c
                    L_0x005f:
                        r1 = move-exception
                        r0 = 0
                    L_0x0061:
                        java.lang.String r3 = "LRCI"
                        java.lang.String r4 = "save failed:"
                        com.uc.webview.base.Log.w(r3, r4, r1)     // Catch: all -> 0x006e
                        if (r0 == 0) goto L_0x006c
                        goto L_0x005b
                    L_0x006c:
                        monitor-exit(r2)     // Catch: all -> 0x001d
                        return
                    L_0x006e:
                        r1 = move-exception
                        if (r0 == 0) goto L_0x0074
                        r0.d()     // Catch: all -> 0x001d
                    L_0x0074:
                        throw r1     // Catch: all -> 0x001d
                    L_0x0075:
                        monitor-exit(r2)     // Catch: all -> 0x001d
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.i.AnonymousClass1.run():void");
                }
            });
            return true;
        } else {
            Log.d("LRCI", "save: no zip");
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static String a(ClassLoader classLoader) {
            String str = "";
            try {
                String[][] a2 = EnvInfo.a(classLoader);
                if (a2 != null && a2.length > 0) {
                    for (String[] strArr : a2) {
                        str = str + strArr[2];
                    }
                }
            } catch (Throwable th) {
                Log.e("LRCI", "lfi failed", th);
            }
            Log.i("LRCI", "nld result:".concat(String.valueOf(str)));
            return TextUtils.isEmpty(str) ? str : String.valueOf(str.hashCode());
        }

        public static String a(boolean z, String str) {
            String str2 = "";
            try {
            } catch (Throwable th) {
                Log.e("LRCI", "lfi failed", th);
            }
            if (TextUtils.isEmpty(str)) {
                return str2;
            }
            File file = new File(str);
            StringBuilder sb = new StringBuilder();
            if (!z) {
                File fileCoreDex = PathUtils.getFileCoreDex(file);
                if (fileCoreDex.exists()) {
                    sb.append("_");
                    sb.append(fileCoreDex.length());
                    sb.append("_");
                    sb.append(fileCoreDex.lastModified());
                }
            }
            File fileCoreLib = PathUtils.getFileCoreLib(PathUtils.getDirCoreLib(file));
            if (fileCoreLib.exists()) {
                sb.append("_");
                sb.append(fileCoreLib.length());
                sb.append("_");
                sb.append(fileCoreLib.lastModified());
            }
            str2 = sb.toString();
            Log.i("LRCI", "lfi result:".concat(String.valueOf(str2)));
            return TextUtils.isEmpty(str2) ? str2 : String.valueOf(str2.hashCode());
        }

        public static String a() {
            return EnvInfo.is64Bit() ? "arm64" : "arm32";
        }
    }

    private boolean a(d dVar) {
        String a2 = a.a();
        if (TextUtils.isEmpty(a2) || !a2.equals(dVar.g)) {
            Log.b();
            this.b = 6;
            return false;
        }
        if (dVar.f) {
            String a3 = a.a(a.class.getClassLoader());
            if (TextUtils.isEmpty(a3) || !a3.equals(dVar.o)) {
                Log.b();
                this.b = 7;
                return false;
            }
            this.g = true;
        } else if (!EnvInfo.isSupportedCoreVersion("LRCI", Build.Version.NAME, Build.Version.SUPPORT_U4_MIN, dVar.j, dVar.l)) {
            Log.b();
            this.b = 8;
            return false;
        }
        String a4 = a.a(dVar.f, dVar.m);
        if (TextUtils.isEmpty(a4) || !a4.equals(dVar.p)) {
            Log.b();
            this.b = TextUtils.isEmpty(a4) ? 9 : 10;
            this.E = true;
            try {
                PathUtils.b(new File(dVar.m)).b();
            } catch (Throwable unused) {
            }
        } else if (dVar.f && !EnvInfo.c()) {
            Log.b();
            this.b = 11;
            this.E = true;
        }
        if (com.uc.webview.base.io.d.a(this.l, this.c)) {
            return !this.E;
        }
        this.b = 12;
        return false;
    }
}
