package com.uc.webview.internal;

import com.taobao.orange.OConstant;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.c;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.extension.UCExtension;
import com.uc.webview.internal.interfaces.IWebView;
import com.uc.webview.internal.setup.o;
import java.util.concurrent.atomic.AtomicInteger;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f14370a;
    private static final AtomicInteger b = new AtomicInteger(0);
    private static final AtomicInteger c = new AtomicInteger(0);
    private static final AtomicInteger d = new AtomicInteger(0);
    private static final a e = new a((byte) 0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f14372a;
        public final IWebView b;
        public final f c;
        public final WebSettings d;
        public final UCExtension e;

        public /* synthetic */ b(int i, IWebView iWebView, f fVar, WebSettings webSettings, UCExtension uCExtension, byte b) {
            this(i, iWebView, fVar, webSettings, uCExtension);
        }

        private b(int i, IWebView iWebView, f fVar, WebSettings webSettings, UCExtension uCExtension) {
            this.f14372a = i;
            this.b = iWebView;
            this.c = fVar;
            this.d = webSettings;
            this.e = uCExtension;
        }
    }

    public static void a(int i, int i2) {
        if (i != 0) {
            String str = String.valueOf(i) + f7l.BRACKET_START_STR + i2 + f7l.BRACKET_END_STR;
            Log.rInfo("WebViewFactory", "setCoreType:".concat(String.valueOf(str)));
            com.uc.webview.base.b.a("wk_ucbsCoreType" + d.getAndIncrement(), str);
            b.set(i);
            c.set(i2);
            a aVar = e;
            synchronized (aVar.f14371a) {
                try {
                    aVar.f14371a.notifyAll();
                } catch (Exception e2) {
                    Log.i("WebViewFactory", OConstant.DIMEN_FILE_LOCK, e2);
                }
            }
        }
    }

    public static void b() {
        e.b();
    }

    public static int c() {
        return b.get();
    }

    public static int d() {
        return c.get();
    }

    public static boolean e() {
        if (a() == 2) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        if (b.get() != 0) {
            return true;
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Object f14371a;

        private a() {
            this.f14371a = new Object();
        }

        public static boolean a() {
            return e.f();
        }

        private static boolean d() {
            if (e.f()) {
                return true;
            }
            o b = o.b();
            if (b.f14486a.a(4096) || b.f14486a.a(8192)) {
                return true;
            }
            return false;
        }

        private void e() {
            synchronized (this.f14371a) {
                try {
                    this.f14371a.wait(200L);
                } catch (Exception e) {
                    Log.i("WebViewFactory", OConstant.DIMEN_FILE_LOCK, e);
                }
            }
        }

        public final void b() {
            if (!e.f()) {
                c();
            }
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final void c() {
            int intValue = GlobalSettings.getIntValue(160);
            boolean boolValue = GlobalSettings.getBoolValue(95);
            boolean z = intValue < 0;
            String format = String.format("maxWaitMillis:%d, untilFinished:%b, canFallbackSystem:%b", Integer.valueOf(intValue), Boolean.valueOf(z), Boolean.valueOf(boolValue));
            Log.w("WebViewFactory", "waitForInit ".concat(format));
            long j = intValue;
            com.uc.webview.base.b.a("ucbsInitWait", format + ", ts:" + com.uc.webview.base.klog.a.b(j));
            c cVar = new c();
            while (!d()) {
                e();
                if (!z && cVar.a() >= j) {
                    break;
                }
            }
            long a2 = cVar.a();
            synchronized (a.class) {
                try {
                    if (!e.f()) {
                        if (boolValue) {
                            Log.w("WebViewFactory", "waitForInit timeout fallback to system");
                            e.a(2, 4);
                        } else {
                            Log.w("WebViewFactory", "Thread [" + Thread.currentThread().getName() + "] waitting for init is up to [" + String.valueOf(intValue) + "] milis.");
                            ErrorCode.INIT_WAIT_TIMEOUT.report();
                        }
                    }
                    Log.d("WebViewFactory", "waitForInit(untilFinished:" + z + ", maxWaitMillis:" + intValue + ", realWaiMillist:" + a2 + ")=" + e.b.get());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void a(boolean z) {
        f14370a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r12 == 0) goto L_0x005b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.uc.webview.internal.e.b a(android.content.Context r8, com.uc.webview.export.WebView r9, android.util.AttributeSet r10, boolean r11, boolean r12, java.util.Map<java.lang.String, java.lang.Object> r13) {
        /*
            java.lang.String r0 = "WebViewFactory.createWebView"
            com.uc.webview.base.timing.TraceEvent r0 = com.uc.webview.base.timing.TraceEvent.scoped(r0)
            boolean r1 = com.uc.webview.internal.e.f14370a     // Catch: all -> 0x0034
            java.lang.String r2 = "WebViewFactory"
            r3 = 2
            if (r1 != 0) goto L_0x005b
            if (r11 == 0) goto L_0x0010
            goto L_0x005b
        L_0x0010:
            if (r12 != 0) goto L_0x0053
            com.uc.webview.internal.e$a r12 = com.uc.webview.internal.e.e     // Catch: all -> 0x0034
            boolean r1 = com.uc.webview.internal.e.a.a()     // Catch: all -> 0x0034
            if (r1 != 0) goto L_0x0053
            com.uc.webview.internal.setup.o r1 = com.uc.webview.internal.setup.o.b()     // Catch: all -> 0x0034
            boolean r1 = r1.f()     // Catch: all -> 0x0034
            if (r1 != 0) goto L_0x0037
            java.lang.String r12 = "no init task fallback to system"
            java.lang.Throwable r1 = new java.lang.Throwable     // Catch: all -> 0x0034
            r1.<init>()     // Catch: all -> 0x0034
            com.uc.webview.base.Log.rInfo(r2, r12, r1)     // Catch: all -> 0x0034
            r12 = 5
            a(r3, r12)     // Catch: all -> 0x0034
            goto L_0x0053
        L_0x0034:
            r8 = move-exception
            goto L_0x00d7
        L_0x0037:
            r1 = 65502094(0x3e77b8e, float:1.36053265E-36)
            com.uc.webview.base.timing.TraceEvent r1 = com.uc.webview.base.timing.TraceEvent.scoped(r1)     // Catch: all -> 0x0034
            r12.c()     // Catch: all -> 0x0047
            if (r1 == 0) goto L_0x0053
            r1.close()     // Catch: all -> 0x0034
            goto L_0x0053
        L_0x0047:
            r8 = move-exception
            if (r1 == 0) goto L_0x0052
            r1.close()     // Catch: all -> 0x004e
            goto L_0x0052
        L_0x004e:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: all -> 0x0034
        L_0x0052:
            throw r8     // Catch: all -> 0x0034
        L_0x0053:
            java.util.concurrent.atomic.AtomicInteger r12 = com.uc.webview.internal.e.b     // Catch: all -> 0x0034
            int r12 = r12.get()     // Catch: all -> 0x0034
            if (r12 != 0) goto L_0x005c
        L_0x005b:
            r12 = 2
        L_0x005c:
            r1 = 0
            if (r3 != r12) goto L_0x0061
            r3 = 1
            goto L_0x0062
        L_0x0061:
            r3 = 0
        L_0x0062:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x0034
            java.lang.String r5 = "createWebView(forceSys="
            r4.<init>(r5)     // Catch: all -> 0x0034
            r4.append(r11)     // Catch: all -> 0x0034
            java.lang.String r11 = ", creatingSysWin="
            r4.append(r11)     // Catch: all -> 0x0034
            boolean r11 = com.uc.webview.internal.e.f14370a     // Catch: all -> 0x0034
            r4.append(r11)     // Catch: all -> 0x0034
            java.lang.String r11 = ", useSys="
            r4.append(r11)     // Catch: all -> 0x0034
            r4.append(r3)     // Catch: all -> 0x0034
            java.lang.String r11 = ")="
            r4.append(r11)     // Catch: all -> 0x0034
            r4.append(r12)     // Catch: all -> 0x0034
            java.lang.String r11 = r4.toString()     // Catch: all -> 0x0034
            com.uc.webview.base.Log.d(r2, r11)     // Catch: all -> 0x0034
            if (r3 == 0) goto L_0x0094
            com.uc.webview.internal.android.WebViewAndroid r10 = com.uc.webview.internal.android.WebViewAndroid.create(r8, r10, r9)     // Catch: all -> 0x0034
            goto L_0x0098
        L_0x0094:
            com.uc.webview.internal.interfaces.IWebView r10 = com.uc.webview.internal.b.a(r8, r10, r13)     // Catch: all -> 0x0034
        L_0x0098:
            r10.setOverrideObject(r9)     // Catch: all -> 0x0034
            com.uc.webview.internal.interfaces.IWebViewExtension r9 = r10.getExtension()     // Catch: all -> 0x0034
            if (r9 == 0) goto L_0x00ad
            com.uc.webview.internal.interfaces.IWebViewExtension r9 = r10.getExtension()     // Catch: all -> 0x0034
            com.uc.webview.export.extension.UCClient r11 = new com.uc.webview.export.extension.UCClient     // Catch: all -> 0x0034
            r11.<init>()     // Catch: all -> 0x0034
            r9.setClient(r11)     // Catch: all -> 0x0034
        L_0x00ad:
            com.uc.webview.export.WebSettings r5 = r10.getSettingsInner()     // Catch: all -> 0x0034
            r5.setMixedContentMode(r1)     // Catch: all -> 0x0034
            com.uc.webview.internal.e$b r9 = new com.uc.webview.internal.e$b     // Catch: all -> 0x0034
            com.uc.webview.internal.f r4 = new com.uc.webview.internal.f     // Catch: all -> 0x0034
            android.content.Context r8 = r8.getApplicationContext()     // Catch: all -> 0x0034
            r4.<init>(r8, r10)     // Catch: all -> 0x0034
            if (r3 == 0) goto L_0x00c4
            r8 = 0
        L_0x00c2:
            r6 = r8
            goto L_0x00ca
        L_0x00c4:
            com.uc.webview.export.extension.UCExtension r8 = new com.uc.webview.export.extension.UCExtension     // Catch: all -> 0x0034
            r8.<init>(r10)     // Catch: all -> 0x0034
            goto L_0x00c2
        L_0x00ca:
            r7 = 0
            r1 = r9
            r2 = r12
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: all -> 0x0034
            if (r0 == 0) goto L_0x00d6
            r0.close()
        L_0x00d6:
            return r9
        L_0x00d7:
            if (r0 == 0) goto L_0x00e1
            r0.close()     // Catch: all -> 0x00dd
            goto L_0x00e1
        L_0x00dd:
            r9 = move-exception
            r8.addSuppressed(r9)
        L_0x00e1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.e.a(android.content.Context, com.uc.webview.export.WebView, android.util.AttributeSet, boolean, boolean, java.util.Map):com.uc.webview.internal.e$b");
    }

    public static int a() {
        e.b();
        return b.get();
    }
}
