package com.xiaomi.push;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class bc implements ar {

    /* renamed from: a  reason: collision with root package name */
    private static String f14772a = "content://com.vivo.vms.IdProvider/IdentifierId/";
    private static String b = f14772a + "OAID";
    private static String c = f14772a + "VAID_";
    private static String d = f14772a + "AAID_";
    private static String e = f14772a + "OAIDSTATUS";
    private static String f = "persist.sys.identifierid.supported";

    /* renamed from: a  reason: collision with other field name */
    private Context f762a;

    public bc(Context context) {
        this.f762a = context;
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a */
    public String mo506a() {
        return a(b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r10 != null) goto L_0x002d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r10 == null) goto L_0x0042;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 0
            android.content.Context r1 = r9.f762a     // Catch: all -> 0x0031, Exception -> 0x0036
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch: all -> 0x0031, Exception -> 0x0036
            android.net.Uri r3 = android.net.Uri.parse(r10)     // Catch: all -> 0x0031, Exception -> 0x0036
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch: all -> 0x0031, Exception -> 0x0036
            if (r10 == 0) goto L_0x002b
            boolean r1 = r10.moveToNext()     // Catch: all -> 0x0027, Exception -> 0x0029
            if (r1 == 0) goto L_0x002b
            java.lang.String r1 = "value"
            int r1 = r10.getColumnIndex(r1)     // Catch: all -> 0x0027, Exception -> 0x0029
            java.lang.String r0 = r10.getString(r1)     // Catch: all -> 0x0027, Exception -> 0x0029
            goto L_0x002b
        L_0x0027:
            r0 = move-exception
            goto L_0x0039
        L_0x0029:
            goto L_0x003f
        L_0x002b:
            if (r10 == 0) goto L_0x0042
        L_0x002d:
            r10.close()
            goto L_0x0042
        L_0x0031:
            r10 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto L_0x0039
        L_0x0036:
            r10 = r0
            goto L_0x003f
        L_0x0039:
            if (r10 == 0) goto L_0x003e
            r10.close()
        L_0x003e:
            throw r0
        L_0x003f:
            if (r10 == 0) goto L_0x0042
            goto L_0x002d
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.bc.a(java.lang.String):java.lang.String");
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo506a() {
        return "1".equals(q.a(f, "0"));
    }

    public static boolean a(Context context) {
        try {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(Uri.parse(f14772a).getAuthority(), 128);
            if (resolveContentProvider != null) {
                return (resolveContentProvider.applicationInfo.flags & 1) != 0;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
