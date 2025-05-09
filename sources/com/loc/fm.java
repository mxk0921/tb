package com.loc;

import android.content.Context;
import com.loc.bt;
import com.uc.webview.export.media.CommandID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fm {
    private static fm b;

    /* renamed from: a  reason: collision with root package name */
    bo f5704a;
    private Context c;
    private int d = fr.i;
    private boolean e = false;
    private int f = 0;

    private fm(Context context) {
        this.f5704a = null;
        this.c = null;
        try {
            q.a().a(context);
        } catch (Throwable unused) {
        }
        this.c = context;
        this.f5704a = bo.a();
    }

    public final bu a(fn fnVar) throws Throwable {
        if (this.e) {
            fnVar.a(bt.c.HTTPS);
        }
        return bo.a(fnVar);
    }

    public static fm a(Context context) {
        if (b == null) {
            b = new fm(context);
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x010c A[Catch: all -> 0x0113, TRY_LEAVE, TryCatch #1 {all -> 0x0113, blocks: (B:4:0x001b, B:6:0x0085, B:7:0x008d, B:10:0x009b, B:16:0x00ee, B:18:0x00f4, B:20:0x00fb, B:22:0x010c), top: B:27:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.loc.fn a(android.content.Context r15, byte[] r16, java.lang.String r17, java.lang.String r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fm.a(android.content.Context, byte[], java.lang.String, java.lang.String, boolean):com.loc.fn");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d5 A[Catch: all -> 0x00db, TryCatch #2 {all -> 0x00f4, blocks: (B:2:0x0000, B:8:0x0049, B:10:0x004f, B:12:0x0057, B:16:0x0066, B:17:0x00c7, B:19:0x00d5, B:20:0x00dd), top: B:23:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(android.content.Context r8, double r9, double r11) {
        /*
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap     // Catch: all -> 0x00f4
            r1 = 16
            r0.<init>(r1)     // Catch: all -> 0x00f4
            com.loc.fn r2 = new com.loc.fn     // Catch: all -> 0x00f4
            com.loc.w r3 = com.loc.fr.c()     // Catch: all -> 0x00f4
            r2.<init>(r8, r3)     // Catch: all -> 0x00f4
            r0.clear()     // Catch: all -> 0x00f4
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/x-www-form-urlencoded"
            r0.put(r3, r4)     // Catch: all -> 0x00f4
            java.lang.String r3 = "Connection"
            java.lang.String r4 = "Keep-Alive"
            r0.put(r3, r4)     // Catch: all -> 0x00f4
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = "AMAP_Location_SDK_Android 6.2.0"
            r0.put(r3, r4)     // Catch: all -> 0x00f4
            java.util.HashMap r3 = new java.util.HashMap     // Catch: all -> 0x00f4
            r3.<init>(r1)     // Catch: all -> 0x00f4
            java.lang.String r1 = "custom"
            java.lang.String r4 = "26260A1F00020002"
            r3.put(r1, r4)     // Catch: all -> 0x00f4
            java.lang.String r1 = "key"
            java.lang.String r4 = com.loc.l.f(r8)     // Catch: all -> 0x00f4
            r3.put(r1, r4)     // Catch: all -> 0x00f4
            int r1 = r7.f     // Catch: all -> 0x00f4
            r4 = 1
            java.lang.String r5 = "language"
            if (r1 == 0) goto L_0x0049
            if (r1 == r4) goto L_0x0053
            r6 = 2
            if (r1 == r6) goto L_0x004d
        L_0x0049:
            r3.remove(r5)     // Catch: all -> 0x00f4
            goto L_0x0057
        L_0x004d:
            java.lang.String r1 = "en"
        L_0x004f:
            r3.put(r5, r1)     // Catch: all -> 0x00f4
            goto L_0x0057
        L_0x0053:
            java.lang.String r1 = "zh-CN"
            goto L_0x004f
        L_0x0057:
            java.lang.String r1 = "curLocationType"
            android.content.Context r5 = r7.c     // Catch: all -> 0x00f4
            boolean r5 = com.loc.fy.m(r5)     // Catch: all -> 0x00f4
            if (r5 == 0) goto L_0x0064
            java.lang.String r5 = "coarseLoc"
            goto L_0x0066
        L_0x0064:
            java.lang.String r5 = "fineLoc"
        L_0x0066:
            r3.put(r1, r5)     // Catch: all -> 0x00f4
            java.lang.String r1 = com.loc.n.a()     // Catch: all -> 0x00f4
            java.lang.String r5 = com.loc.x.b(r3)     // Catch: all -> 0x00f4
            java.lang.String r5 = com.loc.n.a(r8, r1, r5)     // Catch: all -> 0x00f4
            java.lang.String r6 = "ts"
            r3.put(r6, r1)     // Catch: all -> 0x00f4
            java.lang.String r1 = "scode"
            r3.put(r1, r5)     // Catch: all -> 0x00f4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x00f4
            java.lang.String r5 = "output=json&radius=1000&extensions=all&location="
            r1.<init>(r5)     // Catch: all -> 0x00f4
            r1.append(r11)     // Catch: all -> 0x00f4
            java.lang.String r11 = ","
            r1.append(r11)     // Catch: all -> 0x00f4
            r1.append(r9)     // Catch: all -> 0x00f4
            java.lang.String r9 = r1.toString()     // Catch: all -> 0x00f4
            java.lang.String r10 = "UTF-8"
            byte[] r9 = r9.getBytes(r10)     // Catch: all -> 0x00f4
            r2.b(r9)     // Catch: all -> 0x00f4
            r9 = 0
            r2.c(r9)     // Catch: all -> 0x00f4
            r2.b(r4)     // Catch: all -> 0x00f4
            java.util.Locale r9 = java.util.Locale.US     // Catch: all -> 0x00f4
            java.lang.String r9 = "platform=Android&sdkversion=6.2.0&product=loc&loc_channel=3"
            r2.b(r9)     // Catch: all -> 0x00f4
            r2.a(r3)     // Catch: all -> 0x00f4
            r2.b(r0)     // Catch: all -> 0x00f4
            java.net.Proxy r8 = com.loc.v.a(r8)     // Catch: all -> 0x00f4
            r2.a(r8)     // Catch: all -> 0x00f4
            int r8 = com.loc.fr.i     // Catch: all -> 0x00f4
            r2.a(r8)     // Catch: all -> 0x00f4
            int r8 = com.loc.fr.i     // Catch: all -> 0x00f4
            r2.b(r8)     // Catch: all -> 0x00f4
            java.lang.String r8 = "http://restsdk.amap.com/v3/geocode/regeo"
            java.lang.String r9 = "http://dualstack-arestapi.amap.com/v3/geocode/regeo"
            r2.d(r9)     // Catch: all -> 0x00db
            r2.c(r8)     // Catch: all -> 0x00db
            boolean r8 = r7.e     // Catch: all -> 0x00db
            if (r8 == 0) goto L_0x00dd
            com.loc.bt$c r8 = com.loc.bt.c.HTTPS     // Catch: all -> 0x00db
            r2.a(r8)     // Catch: all -> 0x00db
            goto L_0x00dd
        L_0x00db:
            r8 = move-exception
            goto L_0x00ec
        L_0x00dd:
            com.loc.bu r8 = com.loc.bo.a(r2)     // Catch: all -> 0x00db
            java.lang.String r9 = new java.lang.String     // Catch: all -> 0x00db
            byte[] r8 = r8.f5615a     // Catch: all -> 0x00db
            java.lang.String r10 = "utf-8"
            r9.<init>(r8, r10)     // Catch: all -> 0x00db
            goto L_0x00f5
        L_0x00ec:
            java.lang.String r9 = "LocNetManager"
            java.lang.String r10 = "post"
            com.loc.fr.a(r8, r9, r10)     // Catch: all -> 0x00f4
        L_0x00f4:
            r9 = 0
        L_0x00f5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fm.a(android.content.Context, double, double):java.lang.String");
    }

    public final void a(long j, boolean z, int i) {
        try {
            this.e = z;
            this.d = Long.valueOf(j).intValue();
            this.f = i;
        } catch (Throwable th) {
            fr.a(th, "LocNetManager", CommandID.setOption);
        }
    }
}
