package com.meizu.flyme.openidsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.text.TextUtils;
import tb.rxq;
import tb.t2o;
import tb.t3l;
import tb.x1w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {
    public static volatile b g;
    public BroadcastReceiver f;

    /* renamed from: a  reason: collision with root package name */
    public final t3l f5925a = new t3l("udid");
    public final t3l b = new t3l("oaid");
    public final t3l d = new t3l("vaid");
    public final t3l c = new t3l("aaid");
    public final rxq e = new rxq();

    static {
        t2o.a(147849260);
    }

    public static final b a() {
        if (g == null) {
            synchronized (b.class) {
                try {
                    if (g == null) {
                        g = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public static String c(PackageManager packageManager, String str) {
        ProviderInfo resolveContentProvider;
        if (packageManager == null || (resolveContentProvider = packageManager.resolveContentProvider(str, 0)) == null || (resolveContentProvider.applicationInfo.flags & 1) == 0) {
            return null;
        }
        return resolveContentProvider.packageName;
    }

    public static x1w d(Cursor cursor) {
        x1w x1wVar = new x1w(null, 0);
        if (cursor == null || cursor.isClosed()) {
            return x1wVar;
        }
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("value");
        if (columnIndex >= 0) {
            x1wVar.f31082a = cursor.getString(columnIndex);
        }
        int columnIndex2 = cursor.getColumnIndex("code");
        if (columnIndex2 >= 0) {
            x1wVar.b = cursor.getInt(columnIndex2);
        }
        int columnIndex3 = cursor.getColumnIndex("expired");
        if (columnIndex3 >= 0) {
            x1wVar.c = cursor.getLong(columnIndex3);
        }
        return x1wVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r7 != null) goto L_0x003c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r7 == null) goto L_0x0046;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean f(android.content.Context r8) {
        /*
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r0 = 0
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: all -> 0x0031, Exception -> 0x0033
            java.lang.String r8 = "supported"
            java.lang.String[] r5 = new java.lang.String[]{r8}     // Catch: all -> 0x0031, Exception -> 0x0033
            r3 = 0
            r4 = 0
            r6 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: all -> 0x0031, Exception -> 0x0033
            if (r7 == 0) goto L_0x003a
            tb.x1w r8 = d(r7)     // Catch: all -> 0x0031, Exception -> 0x0033
            int r1 = r8.b     // Catch: all -> 0x0031, Exception -> 0x0033
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r1) goto L_0x0035
            java.lang.String r1 = "0"
            java.lang.String r8 = r8.f31082a     // Catch: all -> 0x0031, Exception -> 0x0033
            boolean r8 = r1.equals(r8)     // Catch: all -> 0x0031, Exception -> 0x0033
            if (r8 == 0) goto L_0x0036
            goto L_0x0035
        L_0x0031:
            r8 = move-exception
            goto L_0x0047
        L_0x0033:
            r8 = move-exception
            goto L_0x0040
        L_0x0035:
            r0 = 1
        L_0x0036:
            r7.close()
            return r0
        L_0x003a:
            if (r7 == 0) goto L_0x0046
        L_0x003c:
            r7.close()
            goto L_0x0046
        L_0x0040:
            r8.getMessage()     // Catch: all -> 0x0031
            if (r7 == 0) goto L_0x0046
            goto L_0x003c
        L_0x0046:
            return r0
        L_0x0047:
            if (r7 == 0) goto L_0x004c
            r7.close()
        L_0x004c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.flyme.openidsdk.b.f(android.content.Context):boolean");
    }

    public static String i(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            new StringBuilder("getAppVersion, Exception : ").append(e.getMessage());
            return null;
        }
    }

    public final String b(Context context, t3l t3lVar) {
        if (t3lVar == null) {
            return null;
        }
        if (t3lVar.a()) {
            return t3lVar.b;
        }
        if (!g(context, true)) {
            return null;
        }
        return h(context, t3lVar);
    }

    public final boolean g(Context context, boolean z) {
        rxq rxqVar = this.e;
        if (rxqVar.a() && !z) {
            return rxqVar.c();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        String c = c(packageManager, "com.meizu.flyme.openidsdk");
        if (TextUtils.isEmpty(c)) {
            return false;
        }
        String i = i(packageManager, c);
        if (!rxqVar.a() || !rxqVar.b(i)) {
            rxqVar.e(i);
            boolean f = f(context);
            "query support, result : ".concat(String.valueOf(f));
            rxqVar.d(f);
            return f;
        }
        "use same version cache, safeVersion : ".concat(String.valueOf(i));
        return rxqVar.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String h(android.content.Context r9, tb.t3l r10) {
        /*
            r8 = this;
            java.lang.String r0 = r10.c
            java.lang.String r1 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r3 = android.net.Uri.parse(r1)
            r1 = 0
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch: all -> 0x006b, Exception -> 0x006d
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch: all -> 0x006b, Exception -> 0x006d
            r4 = 0
            r5 = 0
            r7 = 0
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7)     // Catch: all -> 0x006b, Exception -> 0x006d
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0054
            tb.x1w r4 = d(r0)     // Catch: all -> 0x004d, Exception -> 0x0050
            java.lang.String r1 = r4.f31082a     // Catch: all -> 0x004d, Exception -> 0x0050
            r10.e(r1)     // Catch: all -> 0x004d, Exception -> 0x0050
            long r5 = r4.c     // Catch: all -> 0x004d, Exception -> 0x0050
            r10.d(r5)     // Catch: all -> 0x004d, Exception -> 0x0050
            int r5 = r4.b     // Catch: all -> 0x004d, Exception -> 0x0050
            r10.c(r5)     // Catch: all -> 0x004d, Exception -> 0x0050
            int r10 = r4.b     // Catch: all -> 0x004d, Exception -> 0x0050
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r10 == r4) goto L_0x0065
            r8.j(r9)     // Catch: all -> 0x004d, Exception -> 0x0050
            boolean r10 = r8.g(r9, r3)     // Catch: all -> 0x004d, Exception -> 0x0050
            if (r10 != 0) goto L_0x0065
            boolean r9 = r8.g(r9, r2)     // Catch: all -> 0x004d, Exception -> 0x0050
            java.lang.String r10 = "not support, forceQuery isSupported: "
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: all -> 0x004d, Exception -> 0x0050
        L_0x0049:
            r10.concat(r9)     // Catch: all -> 0x004d, Exception -> 0x0050
            goto L_0x0065
        L_0x004d:
            r9 = move-exception
            r1 = r0
            goto L_0x0079
        L_0x0050:
            r9 = move-exception
            r10 = r1
            r1 = r0
            goto L_0x006f
        L_0x0054:
            boolean r10 = r8.g(r9, r3)     // Catch: all -> 0x004d, Exception -> 0x0050
            if (r10 == 0) goto L_0x0065
            boolean r9 = r8.g(r9, r2)     // Catch: all -> 0x004d, Exception -> 0x0050
            java.lang.String r10 = "forceQuery isSupported : "
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: all -> 0x004d, Exception -> 0x0050
            goto L_0x0049
        L_0x0065:
            if (r0 == 0) goto L_0x0078
            r0.close()
            goto L_0x0078
        L_0x006b:
            r9 = move-exception
            goto L_0x0079
        L_0x006d:
            r9 = move-exception
            r10 = r1
        L_0x006f:
            r9.getMessage()     // Catch: all -> 0x006b
            if (r1 == 0) goto L_0x0077
            r1.close()
        L_0x0077:
            r1 = r10
        L_0x0078:
            return r1
        L_0x0079:
            if (r1 == 0) goto L_0x007e
            r1.close()
        L_0x007e:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.flyme.openidsdk.b.h(android.content.Context, tb.t3l):java.lang.String");
    }

    public final synchronized void j(Context context) {
        if (this.f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
            a aVar = new a();
            this.f = aVar;
            context.registerReceiver(aVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
        }
    }

    public static void e(String str) {
    }
}
