package com.uc.webview.internal.setup.component;

import android.text.TextUtils;
import com.taobao.tao.shop.common.ShopConstants;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.export.extension.ICoreVersion;
import com.uc.webview.internal.setup.l;
import com.uc.webview.internal.setup.o;
import com.uc.webview.internal.setup.q;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f14389a = true;
    static final String b = "5.18.6.0";
    static final String c = "250225095214";
    static boolean d = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final long f14390a = c.i();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        static final boolean[] f14391a;

        static {
            boolean[] zArr = new boolean[24];
            f14391a = zArr;
            Arrays.fill(zArr, false);
            String str = GlobalSettings.get(191, "");
            if (!TextUtils.isEmpty(str)) {
                for (String str2 : str.split(",")) {
                    int a2 = a(str2);
                    if (a2 != -1) {
                        f14391a[a2] = true;
                    }
                }
            }
        }

        private static int a(String str) {
            int parseInt;
            if (str == null) {
                return -1;
            }
            String trim = str.trim();
            if (trim.isEmpty()) {
                return -1;
            }
            try {
                parseInt = Integer.parseInt(trim);
            } catch (Throwable unused) {
            }
            if (parseInt < 0 || parseInt > 23) {
                return -1;
            }
            return parseInt;
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.uc.webview.internal.setup.component.c$c  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class C0840c {

        /* renamed from: a  reason: collision with root package name */
        static final int f14392a;

        static {
            int i = -1;
            if (EnvInfo.getContext() != null) {
                long e = com.uc.webview.base.h.e("cpnCreateTime");
                long currentTimeMillis = System.currentTimeMillis();
                int i2 = (e > 0L ? 1 : (e == 0L ? 0 : -1));
                if (i2 >= 0) {
                    if (e > currentTimeMillis) {
                        i = 0;
                    } else {
                        i = (int) TimeUnit.MILLISECONDS.toDays(currentTimeMillis - e);
                    }
                }
                if (i2 < 0 || e > currentTimeMillis) {
                    com.uc.webview.base.h.a("cpnCreateTime", currentTimeMillis);
                }
            }
            f14392a = i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        static final boolean f14393a;

        static {
            boolean z = false;
            int i = GlobalSettings.get(135, 0);
            if (i > 0 && c.b() && C0840c.f14392a < i) {
                z = true;
            }
            f14393a = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private static final String f14394a = GlobalSettings.get(172, "");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class f extends g {

        /* renamed from: a  reason: collision with root package name */
        final int f14395a = o.b().g().coreVersion().getCoreFeature();
        final int b = com.uc.webview.internal.setup.g.a(this.c, c.b);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class g {
        final String c;
        final String d;

        public g() {
            String str;
            String str2;
            l g = o.b().g();
            if (g.coreVersion() != null) {
                ICoreVersion coreVersion = g.coreVersion();
                str = coreVersion.version();
                str2 = coreVersion.buildTimestamp();
            } else {
                str = c.b;
                str2 = c.c;
            }
            this.c = str;
            this.d = str2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class h extends f {
        final int e;
        final boolean f;
        final boolean g;

        public h() {
            int i;
            boolean z = false;
            if (o.b().g().g() || GlobalSettings.get(99, false)) {
                i = 3;
            } else {
                i = q.b.f14494a;
            }
            this.e = i;
            if (!(i == 1 || i == 2)) {
                z = true;
            }
            this.f = z;
            this.g = c.h();
        }
    }

    public static String a() {
        return e.f14394a;
    }

    public static boolean b() {
        if (C0840c.f14392a < 0) {
            return true;
        }
        return false;
    }

    public static int c() {
        return com.uc.webview.base.h.d("tryPatchCount");
    }

    public static int d() {
        int d2 = com.uc.webview.base.h.d("tryPatchCount") + 1;
        com.uc.webview.base.h.a("tryPatchCount", d2);
        return d2;
    }

    public static void e() {
        com.uc.webview.base.h.a("tryPatchCount", 0);
    }

    public static int f() {
        int d2 = com.uc.webview.base.h.d("tryDLBaseCount") + 1;
        com.uc.webview.base.h.a("tryDLBaseCount", d2);
        return d2;
    }

    public static void g() {
        com.uc.webview.base.h.a("tryDLBaseCount", 0);
    }

    public static boolean h() {
        if (!d || !d.f14393a) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ long i() {
        int c2 = y.c();
        if (c2 >= 0 && c2 <= 23) {
            if (!b.f14391a[c2]) {
                return 0L;
            }
            int i = c2 + 1;
            int i2 = c2 + 24;
            while (i < i2 && b.f14391a[i % 24]) {
                i++;
            }
            if (i != i2) {
                return (((i * 3600) + new Random().nextInt(ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT)) - y.b()) * 1000;
            }
        }
        return -1L;
    }

    public static long a(long j) {
        int i;
        if (!d) {
            return 0L;
        }
        long j2 = a.f14390a;
        if (j2 > 0) {
            return j2;
        }
        if (j > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (j > currentTimeMillis) {
                j = currentTimeMillis;
            }
            i = (int) (currentTimeMillis - j);
        } else {
            i = 0;
        }
        int i2 = GlobalSettings.get(134, 10);
        if (i2 <= 0) {
            i2 = 1;
        } else if (i2 > 120) {
            i2 = 120;
        }
        long j3 = i2 * 1000;
        long j4 = i;
        if (j3 > j4) {
            return j3 - j4;
        }
        return 0L;
    }

    public static int a(int i, String str) {
        boolean z = y.b(str, "6.0.0.0") >= 0;
        int i2 = 45;
        if (i != 1 && i != 2) {
            i2 = 10;
            if (i != 3) {
                i2 = 4;
                if (!(i == 4 || i == 101 || i == 102)) {
                    if (i == 108 || i == 109) {
                        if (!z) {
                            i2 = 10;
                        }
                    }
                    return (int) (((i2 * 1024.0d) / 100.0d) * 1000.0d);
                }
            }
            if (!z) {
                i2 = 5;
            }
            return (int) (((i2 * 1024.0d) / 100.0d) * 1000.0d);
        } else if (!z) {
            i2 = 20;
        }
        return (int) (((i2 * 1024.0d) / 100.0d) * 1000.0d);
    }
}
