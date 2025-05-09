package com.uc.webview.internal.setup;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.ali.user.mobile.app.constant.UTConstant;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.build.CoreType;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.io.d;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    final o f14378a;
    boolean c;
    boolean d;
    a e;
    private boolean g;
    private b h;
    private final AtomicBoolean f = new AtomicBoolean(false);
    final AtomicInteger b = new AtomicInteger(0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final File f14381a;
        private final String b;
        private final int c;
        private final File d;

        public a(File file) {
            this.d = file;
            String b = PathUtils.b();
            this.b = b;
            int a2 = a(b);
            File a3 = a(b, a2);
            String str = "index:" + String.valueOf(a2);
            if (a3.exists() && a3.lastModified() + 3600000 < System.currentTimeMillis()) {
                Log.d("NCD", "CFlag: expired and reset");
                str = str + ", expired";
                b();
                a2 = 1;
                a3 = a(b, 1);
            }
            this.c = a2;
            this.f14381a = a3;
            Log.d("NCD", "CFlag: " + a3.getAbsolutePath());
            com.uc.webview.base.b.a("ucbsNCDFlag", str);
        }

        public final boolean a() {
            return this.c > 3;
        }

        public final void b() {
            Log.d("NCD", "CFlag: clear");
            for (int i = 1; i <= 3; i++) {
                d.c("NCD-c", a(this.b, i));
            }
        }

        private int a(String str) {
            for (int i = 1; i <= 3; i++) {
                if (!a(str, i).exists()) {
                    return i;
                }
            }
            return 4;
        }

        private File a(String str, int i) {
            File file = this.d;
            return new File(file, str + "_" + String.valueOf(i));
        }
    }

    public c(o oVar) {
        this.f14378a = oVar;
    }

    public final void a() {
        int b2;
        if (!this.f.get()) {
            synchronized (this.f) {
                try {
                    if (!this.f.get()) {
                        boolean boolValue = GlobalSettings.getBoolValue(85);
                        this.c = boolValue;
                        boolean z = false;
                        boolean z2 = boolValue && (13 == (b2 = com.uc.webview.base.b.b()) || 14 == b2);
                        boolean b3 = (!z2 || !this.c) ? false : b(com.uc.webview.base.b.a("nativeCrashLibName"));
                        this.d = b3;
                        if (z2 || b3) {
                            z = true;
                        }
                        this.g = z;
                        String str = "enabled: " + this.c + ", nativeCrash: " + this.g + ", coreLibCrash: " + this.d;
                        Log.d("NCD", str);
                        com.uc.webview.base.b.a("ucbsNCDFeat", str);
                        if (GlobalSettings.getBoolValue(83)) {
                            com.uc.webview.base.b.a("u4sdk-init-logs", new Callable<String>() { // from class: com.uc.webview.internal.setup.c.2
                                @Override // java.util.concurrent.Callable
                                public final /* synthetic */ String call() throws Exception {
                                    String str2;
                                    c cVar = c.this;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    StringBuilder sb = new StringBuilder();
                                    l g = cVar.f14378a.g();
                                    String a2 = g != null ? f.a(g.coreClassLoader()) : null;
                                    sb.append("!!runningCore:\n");
                                    if (g != null) {
                                        str2 = g.toString();
                                    } else {
                                        str2 = "null";
                                    }
                                    sb.append(str2);
                                    sb.append("\n!!nativeLibsInfo:\n");
                                    if (TextUtils.isEmpty(a2)) {
                                        a2 = "null";
                                    }
                                    sb.append(a2);
                                    sb.append("\n!!rootDirFiles:\n");
                                    sb.append(d.a(EnvInfo.getContext()));
                                    sb.append("\n\ninit logs start:\n");
                                    Log.a(sb);
                                    sb.append("\n !!total time:" + (System.currentTimeMillis() - currentTimeMillis));
                                    return sb.toString();
                                }
                            });
                        }
                        this.f.set(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean b() {
        a();
        boolean z = false;
        if (!this.c || !this.g) {
            return false;
        }
        synchronized (this.b) {
            try {
                a aVar = this.e;
                if (aVar != null) {
                    z = aVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void c() {
        a();
        if (this.c) {
            synchronized (this.b) {
                try {
                    a aVar = this.e;
                    if (aVar != null) {
                        aVar.b();
                    }
                    this.e = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean d() {
        if (this.b.get() == 0) {
            return true;
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicInteger f14382a;
        final com.uc.webview.base.c b;
        long c;

        private b() {
            this.f14382a = new AtomicInteger(0);
            this.b = new com.uc.webview.base.c();
            this.c = 0L;
        }

        public /* synthetic */ b(c cVar, byte b) {
            this();
        }
    }

    private static boolean b(String str) {
        return !TextUtils.isEmpty(str) && str.contains("webviewuc");
    }

    public final void a(final int i, final boolean z) {
        a();
        if (!this.c) {
            return;
        }
        if (i == 1 || i == 2 || i == 4 || i == 8 || i == 16) {
            com.uc.webview.base.task.d.b("NCD", new Runnable() { // from class: com.uc.webview.internal.setup.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    c cVar = c.this;
                    int i2 = i;
                    boolean z2 = z;
                    synchronized (cVar.b) {
                        try {
                            if (cVar.e != null) {
                                int i3 = cVar.b.get();
                                StringBuilder sb = new StringBuilder("onInitNative");
                                if (z2) {
                                    str = UTConstant.Args.UT_SUCCESS_F;
                                } else {
                                    str = ExifInterface.LATITUDE_SOUTH;
                                }
                                sb.append(str);
                                sb.append(": ");
                                String sb2 = sb.toString();
                                Log.d("NCD", sb2 + i2 + ", now:" + i3);
                                boolean z3 = (i3 & i2) != 0;
                                if (z2) {
                                    if (!z3) {
                                        Log.d("NCD", sb2 + FactoryType.TYPE_INVALID);
                                        return;
                                    }
                                    cVar.b.set(i2 ^ i3);
                                    if (cVar.d() && !cVar.d) {
                                        a aVar = cVar.e;
                                        Log.d("NCD", "CFlag: fin");
                                        d.c("NCD-f", aVar.f14381a);
                                    }
                                } else if (z3) {
                                    Log.d("NCD", sb2 + pg1.ATOM_EXT_repeat);
                                } else {
                                    cVar.b.set(i2 | i3);
                                    if (!cVar.d()) {
                                        a aVar2 = cVar.e;
                                        Log.d("NCD", "CFlag: sta");
                                        d.b("NCD-s", aVar2.f14381a);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c6, code lost:
        if (r4.h.c > 60000) goto L_0x00c8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r4.a()     // Catch: all -> 0x002c
            java.lang.String r0 = "NCD"
            java.lang.String r1 = "PFlag: process crashed on "
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch: all -> 0x002c
            java.lang.String r1 = r1.concat(r2)     // Catch: all -> 0x002c
            com.uc.webview.base.Log.d(r0, r1)     // Catch: all -> 0x002c
            boolean r0 = r4.c     // Catch: all -> 0x002c
            if (r0 == 0) goto L_0x00d4
            boolean r5 = b(r5)     // Catch: all -> 0x002c
            if (r5 != 0) goto L_0x001f
            goto L_0x00d4
        L_0x001f:
            com.uc.webview.internal.setup.c$b r5 = r4.h     // Catch: all -> 0x002c
            if (r5 != 0) goto L_0x002f
            com.uc.webview.internal.setup.c$b r5 = new com.uc.webview.internal.setup.c$b     // Catch: all -> 0x002c
            r0 = 0
            r5.<init>(r4, r0)     // Catch: all -> 0x002c
            r4.h = r5     // Catch: all -> 0x002c
            goto L_0x002f
        L_0x002c:
            r5 = move-exception
            goto L_0x00d6
        L_0x002f:
            com.uc.webview.internal.setup.c$b r5 = r4.h     // Catch: all -> 0x002c
            java.util.concurrent.atomic.AtomicInteger r0 = r5.f14382a     // Catch: all -> 0x002c
            r0.incrementAndGet()     // Catch: all -> 0x002c
            com.uc.webview.base.c r0 = r5.b     // Catch: all -> 0x002c
            long r0 = r0.a()     // Catch: all -> 0x002c
            r5.c = r0     // Catch: all -> 0x002c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x002c
            java.lang.String r1 = "count:"
            r0.<init>(r1)     // Catch: all -> 0x002c
            java.util.concurrent.atomic.AtomicInteger r1 = r5.f14382a     // Catch: all -> 0x002c
            int r1 = r1.get()     // Catch: all -> 0x002c
            r0.append(r1)     // Catch: all -> 0x002c
            java.lang.String r1 = ", "
            r0.append(r1)     // Catch: all -> 0x002c
            long r1 = r5.c     // Catch: all -> 0x002c
            r0.append(r1)     // Catch: all -> 0x002c
            java.lang.String r5 = r0.toString()     // Catch: all -> 0x002c
            java.lang.String r0 = "NCD"
            java.lang.String r1 = "PFlag: crashed "
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch: all -> 0x002c
            java.lang.String r1 = r1.concat(r2)     // Catch: all -> 0x002c
            com.uc.webview.base.Log.d(r0, r1)     // Catch: all -> 0x002c
            java.lang.String r0 = "ucbsNCDProc"
            com.uc.webview.base.b.a(r0, r5)     // Catch: all -> 0x002c
            com.uc.webview.internal.setup.c$b r5 = r4.h     // Catch: all -> 0x002c
            java.util.concurrent.atomic.AtomicInteger r0 = r5.f14382a     // Catch: all -> 0x002c
            int r0 = r0.get()     // Catch: all -> 0x002c
            r1 = 4
            r2 = 60000(0xea60, double:2.9644E-319)
            if (r0 < r1) goto L_0x00c0
            long r0 = r5.c     // Catch: all -> 0x002c
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L_0x00c0
            java.lang.String r5 = "NCD"
            java.lang.String r0 = "PFlag: maybe damaged"
            com.uc.webview.base.Log.w(r5, r0)     // Catch: all -> 0x002c
            java.lang.String r5 = "ucbsProcNativeMaybeDamaged"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x002c
            java.lang.String r1 = "crashedCnt:"
            r0.<init>(r1)     // Catch: all -> 0x002c
            com.uc.webview.internal.setup.c$b r1 = r4.h     // Catch: all -> 0x002c
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f14382a     // Catch: all -> 0x002c
            int r1 = r1.get()     // Catch: all -> 0x002c
            r0.append(r1)     // Catch: all -> 0x002c
            java.lang.String r1 = ", crashedInterval:"
            r0.append(r1)     // Catch: all -> 0x002c
            com.uc.webview.internal.setup.c$b r1 = r4.h     // Catch: all -> 0x002c
            long r1 = r1.c     // Catch: all -> 0x002c
            r0.append(r1)     // Catch: all -> 0x002c
            java.lang.String r0 = r0.toString()     // Catch: all -> 0x002c
            com.uc.webview.base.b.a(r5, r0)     // Catch: all -> 0x002c
            com.uc.webview.internal.setup.o r5 = r4.f14378a     // Catch: all -> 0x002c
            com.uc.webview.internal.setup.l r5 = r5.g()     // Catch: all -> 0x002c
            if (r5 == 0) goto L_0x00c8
            com.uc.webview.internal.setup.verify.d.b(r5)     // Catch: all -> 0x002c
            goto L_0x00c8
        L_0x00c0:
            com.uc.webview.internal.setup.c$b r5 = r4.h     // Catch: all -> 0x002c
            long r0 = r5.c     // Catch: all -> 0x002c
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x00d2
        L_0x00c8:
            java.lang.String r5 = "NCD"
            java.lang.String r0 = "PFlag: reset"
            com.uc.webview.base.Log.d(r5, r0)     // Catch: all -> 0x002c
            r5 = 0
            r4.h = r5     // Catch: all -> 0x002c
        L_0x00d2:
            monitor-exit(r4)
            return
        L_0x00d4:
            monitor-exit(r4)
            return
        L_0x00d6:
            monitor-exit(r4)     // Catch: all -> 0x002c
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.c.a(java.lang.String):void");
    }

    public static boolean a(File file) {
        try {
            if (CoreType.CORE_THICK != CoreType.Type) {
                return false;
            }
            if (file != null) {
                return EnvInfo.d().startsWith(file.getAbsolutePath());
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
