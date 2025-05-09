package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private volatile b f5750a = new b((byte) 0);
    private bd b = new bd("HttpsDecisionUtil");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static q f5751a = new q();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        protected boolean f5752a;
        private int b;
        private final boolean c;
        private boolean d;

        private b() {
            this.b = 0;
            this.f5752a = true;
            this.c = true;
            this.d = false;
        }

        public final void a(Context context) {
            if (context != null && this.b <= 0) {
                this.b = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
            }
        }

        public /* synthetic */ b(byte b) {
            this();
        }

        public final void a(boolean z) {
            this.f5752a = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x002e A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a() {
            /*
                r5 = this;
                boolean r0 = r5.d
                r1 = 1
                if (r0 != 0) goto L_0x002f
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 28
                r3 = 0
                if (r0 < r2) goto L_0x000e
                r0 = 1
                goto L_0x000f
            L_0x000e:
                r0 = 0
            L_0x000f:
                boolean r4 = r5.f5752a
                if (r4 == 0) goto L_0x0023
                int r4 = r5.b
                if (r4 > 0) goto L_0x0019
                r4 = 28
            L_0x0019:
                if (r4 < r2) goto L_0x001d
                r2 = 1
                goto L_0x001e
            L_0x001d:
                r2 = 0
            L_0x001e:
                if (r2 == 0) goto L_0x0021
                goto L_0x0023
            L_0x0021:
                r2 = 0
                goto L_0x0024
            L_0x0023:
                r2 = 1
            L_0x0024:
                if (r0 == 0) goto L_0x002a
                if (r2 == 0) goto L_0x002a
                r0 = 1
                goto L_0x002b
            L_0x002a:
                r0 = 0
            L_0x002b:
                if (r0 == 0) goto L_0x002e
                goto L_0x002f
            L_0x002e:
                return r3
            L_0x002f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.loc.q.b.a():boolean");
        }
    }

    public static q a() {
        return a.f5751a;
    }

    public static void b(Context context) {
        b(context, true);
    }

    private static boolean c() {
        return false;
    }

    public static String a(String str) {
        Uri.Builder buildUpon;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!str.startsWith("https")) {
            try {
                buildUpon = Uri.parse(str).buildUpon();
                buildUpon.scheme("https");
            } catch (Throwable unused) {
                return str;
            }
        }
        return buildUpon.build().toString();
    }

    private static void b(Context context, boolean z) {
        SharedPreferences.Editor a2 = bd.a(context, "open_common");
        bd.a(a2, "a3", z);
        bd.a(a2);
    }

    public final void a(Context context) {
        if (this.f5750a == null) {
            this.f5750a = new b((byte) 0);
        }
        this.f5750a.a(bd.a(context, "open_common", "a3", true));
        this.f5750a.a(context);
        ah.a(context).a();
    }

    public final boolean b() {
        if (this.f5750a == null) {
            this.f5750a = new b((byte) 0);
        }
        return this.f5750a.a();
    }

    public final void a(Context context, boolean z) {
        if (this.f5750a == null) {
            this.f5750a = new b((byte) 0);
        }
        b(context, z);
        this.f5750a.a(z);
    }

    public final boolean a(boolean z) {
        if (c()) {
            return false;
        }
        return z || b();
    }
}
