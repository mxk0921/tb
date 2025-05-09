package com.uc.webview.internal.stats;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.h;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.task.d;
import com.uc.webview.export.Build;
import com.uc.webview.export.extension.ICoreVersion;
import com.uc.webview.internal.e;
import com.uc.webview.internal.setup.component.y;
import com.uc.webview.internal.setup.g;
import com.uc.webview.internal.setup.l;
import com.uc.webview.internal.setup.o;
import com.uc.webview.stat.a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import tb.a2n;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14514a = "i";
    private static int h = -1;
    private j b;
    private volatile boolean c;
    private final SimpleDateFormat d;
    private final List<d> e;
    private final b f;
    private final c g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final i f14518a = new i((byte) 0);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b {
        private final SimpleDateFormat b = new SimpleDateFormat("yyyyMMdd");
        private int c = -1;
        private String d = null;
        private Random e = null;

        public b() {
            d.b("inisr", new Runnable() { // from class: com.uc.webview.internal.stats.i.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.b();
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0057, TryCatch #2 {all -> 0x00e1, blocks: (B:3:0x0001, B:46:0x00e3, B:5:0x0005, B:7:0x0018, B:9:0x0020, B:13:0x002c, B:15:0x0039, B:17:0x003f, B:19:0x0043, B:21:0x004d, B:24:0x005a, B:25:0x005e, B:27:0x0064, B:28:0x006a, B:29:0x007a, B:30:0x007c, B:34:0x0088, B:35:0x0099, B:39:0x00a4, B:40:0x00a8, B:43:0x00cc), top: B:51:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[Catch: all -> 0x0057, TryCatch #2 {all -> 0x00e1, blocks: (B:3:0x0001, B:46:0x00e3, B:5:0x0005, B:7:0x0018, B:9:0x0020, B:13:0x002c, B:15:0x0039, B:17:0x003f, B:19:0x0043, B:21:0x004d, B:24:0x005a, B:25:0x005e, B:27:0x0064, B:28:0x006a, B:29:0x007a, B:30:0x007c, B:34:0x0088, B:35:0x0099, B:39:0x00a4, B:40:0x00a8, B:43:0x00cc), top: B:51:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized int a() {
            /*
                r12 = this;
                monitor-enter(r12)
                int r0 = r12.c     // Catch: all -> 0x00e1
                if (r0 >= 0) goto L_0x00e3
                java.text.SimpleDateFormat r0 = r12.b     // Catch: all -> 0x0057
                java.util.Date r1 = new java.util.Date     // Catch: all -> 0x0057
                r1.<init>()     // Catch: all -> 0x0057
                java.lang.String r0 = r0.format(r1)     // Catch: all -> 0x0057
                boolean r1 = r0.isEmpty()     // Catch: all -> 0x0057
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x00a8
                java.lang.String r1 = r12.d     // Catch: all -> 0x0057
                boolean r1 = r0.equals(r1)     // Catch: all -> 0x0057
                if (r1 != 0) goto L_0x00a8
                boolean r1 = com.uc.webview.base.EnvInfo.j()     // Catch: all -> 0x0057
                r4 = 100
                if (r1 == 0) goto L_0x002a
                r1 = 2
                goto L_0x002c
            L_0x002a:
                r1 = 100
            L_0x002c:
                java.lang.String r5 = "srt"
                java.lang.String r5 = com.uc.webview.base.h.c(r5)     // Catch: all -> 0x0057
                boolean r5 = r0.equals(r5)     // Catch: all -> 0x0057
                if (r5 != 0) goto L_0x0099
                com.uc.webview.base.h$a r5 = com.uc.webview.base.h.a()     // Catch: all -> 0x0057
                if (r5 == 0) goto L_0x0099
                java.util.Random r6 = r12.e     // Catch: all -> 0x0057
                if (r6 != 0) goto L_0x007c
                java.lang.String r6 = com.uc.webview.base.EnvInfo.n()     // Catch: all -> 0x0057
                boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: all -> 0x0057
                if (r7 != 0) goto L_0x005a
                java.lang.String r7 = "null"
                boolean r7 = r7.equals(r6)     // Catch: all -> 0x0057
                if (r7 == 0) goto L_0x005e
                goto L_0x005a
            L_0x0057:
                r0 = move-exception
                goto L_0x00d7
            L_0x005a:
                java.lang.String r6 = com.uc.webview.base.EnvInfo.m()     // Catch: all -> 0x0057
            L_0x005e:
                boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: all -> 0x0057
                if (r7 == 0) goto L_0x006a
                java.util.Random r6 = new java.util.Random     // Catch: all -> 0x0057
                r6.<init>()     // Catch: all -> 0x0057
                goto L_0x007a
            L_0x006a:
                java.util.Random r7 = new java.util.Random     // Catch: all -> 0x0057
                int r6 = r6.hashCode()     // Catch: all -> 0x0057
                long r8 = (long) r6     // Catch: all -> 0x0057
                long r10 = java.lang.System.nanoTime()     // Catch: all -> 0x0057
                long r8 = r8 ^ r10
                r7.<init>(r8)     // Catch: all -> 0x0057
                r6 = r7
            L_0x007a:
                r12.e = r6     // Catch: all -> 0x0057
            L_0x007c:
                java.util.Random r6 = r12.e     // Catch: all -> 0x0057
                int r4 = r6.nextInt(r4)     // Catch: all -> 0x0057
                int r4 = r4 + r3
                if (r4 > r1) goto L_0x0087
                r4 = 1
                goto L_0x0088
            L_0x0087:
                r4 = 0
            L_0x0088:
                java.lang.String r6 = "srt"
                com.uc.webview.base.h$a r5 = r5.a(r6, r0)     // Catch: all -> 0x0057
                java.lang.String r6 = "srh"
                com.uc.webview.base.h$a r4 = r5.a(r6, r4)     // Catch: all -> 0x0057
                r4.a()     // Catch: all -> 0x0057
            L_0x0099:
                java.lang.String r4 = "srh"
                boolean r4 = com.uc.webview.base.h.a(r4)     // Catch: all -> 0x0057
                if (r4 == 0) goto L_0x00a3
                goto L_0x00a4
            L_0x00a3:
                r1 = 0
            L_0x00a4:
                r12.c = r1     // Catch: all -> 0x0057
                r12.d = r0     // Catch: all -> 0x0057
            L_0x00a8:
                java.lang.String r0 = com.uc.webview.internal.stats.i.b()     // Catch: all -> 0x0057
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x0057
                java.lang.String r4 = "initRate date="
                r1.<init>(r4)     // Catch: all -> 0x0057
                java.lang.String r4 = r12.d     // Catch: all -> 0x0057
                r1.append(r4)     // Catch: all -> 0x0057
                java.lang.String r4 = ", rate="
                r1.append(r4)     // Catch: all -> 0x0057
                int r4 = r12.c     // Catch: all -> 0x0057
                r1.append(r4)     // Catch: all -> 0x0057
                java.lang.String r4 = ", hit="
                r1.append(r4)     // Catch: all -> 0x0057
                int r4 = r12.c     // Catch: all -> 0x0057
                if (r4 <= 0) goto L_0x00cc
                r2 = 1
            L_0x00cc:
                r1.append(r2)     // Catch: all -> 0x0057
                java.lang.String r1 = r1.toString()     // Catch: all -> 0x0057
                com.uc.webview.base.Log.d(r0, r1)     // Catch: all -> 0x0057
                goto L_0x00e3
            L_0x00d7:
                java.lang.String r1 = com.uc.webview.internal.stats.i.b()     // Catch: all -> 0x00e1
                java.lang.String r2 = "initRate failed"
                com.uc.webview.base.Log.d(r1, r2, r0)     // Catch: all -> 0x00e1
                goto L_0x00e3
            L_0x00e1:
                r0 = move-exception
                goto L_0x00e7
            L_0x00e3:
                int r0 = r12.c     // Catch: all -> 0x00e1
                monitor-exit(r12)
                return r0
            L_0x00e7:
                monitor-exit(r12)     // Catch: all -> 0x00e1
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.stats.i.b.a():int");
        }

        public final boolean b() {
            int a2 = a();
            if (!GlobalSettings.getBoolValue(98) || a2 > 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        long f14521a = 0;
        long b = 0;

        public c() {
        }
    }

    public /* synthetic */ i(byte b2) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        if (!this.f.b()) {
            Log.d(f14514a, "save failed: by sampling");
        } else if (!f()) {
            Log.b();
        } else if (this.e.isEmpty()) {
            Log.b();
        } else {
            Log.b();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.e);
            this.e.clear();
            this.b.a(arrayList);
        }
    }

    private synchronized boolean f() {
        if (this.b == null) {
            Context context = EnvInfo.getContext();
            if (context == null) {
                Log.w(f14514a, "initStorage failed: ctx is null");
                return false;
            }
            this.b = new j(PathUtils.a(context));
        }
        return true;
    }

    private static int g() {
        l g;
        if (h == -1 && (g = o.b().g()) != null) {
            h = g.a(g.coreVersion());
        }
        return h;
    }

    private i() {
        this.b = null;
        this.c = false;
        this.d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.e = Collections.synchronizedList(new ArrayList());
        this.f = new b();
        this.g = new c();
    }

    public static i a() {
        return a.f14518a;
    }

    private void c() {
        if (!this.c) {
            this.c = true;
            d.a("uldsts", new Runnable() { // from class: com.uc.webview.internal.stats.i.3
                @Override // java.lang.Runnable
                public final void run() {
                    i.this.d();
                    i.this.e();
                    i.this.c = false;
                }
            });
        }
    }

    public static void b(Map<String, String> map) {
        map.put("u_sv", Build.Version.NAME);
        map.put("u_bt", Build.TIME);
        ICoreVersion iCoreVersion = ICoreVersion.Instance.get();
        map.put("u_cv", iCoreVersion != null ? iCoreVersion.version() : Build.CORE_VERSION);
        map.put("u_cbt", iCoreVersion != null ? iCoreVersion.buildTimestamp() : Build.CORE_TIME);
        map.put("u_arch", EnvInfo.is64Bit() ? a2n.ARCH_BIT64 : a2n.ARCH_BIT32);
        int g = g();
        if (g != -1) {
            map.put("u_funm", Integer.toString(g));
        }
        map.put("u_clib", y.a() ? "1" : "0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void e() {
        h.a a2;
        boolean z = true;
        synchronized (this) {
            try {
                c cVar = this.g;
                if (!com.uc.webview.base.timing.a.b) {
                    cVar.b = System.currentTimeMillis();
                    long b2 = h.b("upl");
                    cVar.f14521a = b2;
                    if (b2 > 0) {
                        if (cVar.b - b2 >= GlobalSettings.getIntValue(165)) {
                            Calendar instance = Calendar.getInstance();
                            instance.setTimeInMillis(cVar.b);
                            int i = instance.get(11);
                            String stringValue = GlobalSettings.getStringValue(224);
                            if (TextUtils.isEmpty(stringValue) ? false : stringValue.contains(String.format("|%d|", Integer.valueOf(i)))) {
                                Log.b();
                            }
                        } else {
                            Log.b();
                        }
                        z = false;
                    }
                }
                if (!z) {
                    Log.b();
                } else if (!f()) {
                    Log.b();
                } else {
                    Log.b();
                    List<d> a3 = this.b.a();
                    if (a3 != null && !a3.isEmpty()) {
                        new com.uc.webview.internal.stats.a();
                        boolean a4 = com.uc.webview.internal.stats.a.a(a3);
                        if (!a4) {
                            a4 = new k().a(a3);
                            "uploadToWA result:".concat(String.valueOf(a4));
                            Log.b();
                        }
                        c cVar2 = this.g;
                        if (a4 && (a2 = h.a()) != null) {
                            a2.a("upl", cVar2.b).a();
                        }
                        if (!a4) {
                            Log.w(f14514a, "upload failed: Uploaders failed");
                            this.e.addAll(a3);
                        }
                        return;
                    }
                    Log.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(final int i, final String str, final boolean z) {
        if (i < 0 || i > 2) {
            String str2 = f14514a;
            Log.e(str2, "onPageView invalid type:" + i + ", url:" + str);
            return;
        }
        d.b("cmpv", new Runnable() { // from class: com.uc.webview.internal.stats.i.1
            @Override // java.lang.Runnable
            public final void run() {
                long j;
                long j2;
                if (TextUtils.isEmpty(str) || (!str.startsWith("ext:") && !str.startsWith("about:"))) {
                    a.ax axVar = new a.ax();
                    axVar.b = i;
                    boolean z2 = z;
                    long j3 = 1;
                    if (z2) {
                        j = 0;
                    } else {
                        j = 1;
                    }
                    axVar.c = j;
                    if (z2) {
                        j2 = 1;
                    } else {
                        j2 = 0;
                    }
                    axVar.d = j2;
                    if (i.a(str)) {
                        j3 = 0;
                    }
                    axVar.e = j3;
                    axVar.l();
                }
            }
        });
    }

    private void c(Map<String, String> map) {
        map.put("tm", this.d.format(new Date(System.currentTimeMillis())));
        map.put("u_se", GlobalSettings.getBoolValue(98) ? "1" : "0");
        map.put("u_sr", String.valueOf(this.f.a()));
        map.put("u_ct", String.valueOf(e.c()));
        map.put("u_cr", String.valueOf(e.d()));
        map.put("u_eve", GlobalSettings.getStringValue(181));
        map.put("u_ebt", GlobalSettings.getStringValue(219));
        map.put("u_pf", EnvInfo.e());
        map.put("u_arq", GlobalSettings.getStringValue(154));
        map.put("u_apd", GlobalSettings.getStringValue(218));
        map.put("u_aet", GlobalSettings.getStringValue(217));
        b(map);
    }

    public final void a(String str, Map<String, String> map) {
        c(map);
        this.e.add(new d(str, map));
        if ("sdkpv".equals(str)) {
            c();
        }
    }

    public final void a(boolean z) {
        d.a("ssts", new Runnable() { // from class: com.uc.webview.internal.stats.i.2
            @Override // java.lang.Runnable
            public final void run() {
                i.this.d();
            }
        });
        b(z);
    }

    public static void a(Map<String, String> map) {
        map.put("u_pkg", EnvInfo.f());
        map.put("u_pm", EnvInfo.k());
        map.put("u_bd", EnvInfo.l());
        map.put("u_osv", Build.VERSION.RELEASE);
        map.put("u_uud", EnvInfo.m());
        map.put("u_utd", EnvInfo.n());
    }

    private static void b(boolean z) {
        if (z) {
            try {
                Thread.sleep(20L);
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.startsWith(h1p.HTTP_PREFIX) || lowerCase.startsWith(h1p.HTTPS_PREFIX);
    }
}
