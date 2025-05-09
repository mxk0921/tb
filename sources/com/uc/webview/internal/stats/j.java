package com.uc.webview.internal.stats;

import android.text.TextUtils;
import com.uc.webview.base.Log;
import com.uc.webview.base.io.a;
import com.uc.webview.base.io.d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14522a = "j";
    private final File b;
    private final long c;
    private final a.AbstractC0831a d;

    public j(File file) {
        this(file, (byte) 0);
    }

    private a c() {
        return new a(this.b, this.c, this.d);
    }

    public final synchronized List<d> a() {
        List<d> b;
        b = b();
        d.c(f14522a + "-cl", this.b);
        return b;
    }

    private j(File file, byte b) {
        this.b = file;
        this.c = Long.MAX_VALUE;
        this.d = new a.b();
    }

    private List<d> b() {
        ArrayList arrayList;
        Throwable th;
        a c;
        a aVar = null;
        try {
            c = c();
            try {
            } catch (Throwable th2) {
                th = th2;
                arrayList = null;
                aVar = c;
            }
        } catch (Throwable th3) {
            th = th3;
            arrayList = null;
        }
        if (!c.a()) {
            c.b();
            Log.b();
            c.d();
            return null;
        }
        arrayList = new ArrayList();
        while (true) {
            try {
                String c2 = c.c();
                if (c2 == null) {
                    break;
                }
                String[] split = c2.trim().split("`");
                if (split != null && split.length >= 3) {
                    int i = 1;
                    if (split.length % 2 == 1) {
                        String str = split[0];
                        HashMap hashMap = new HashMap();
                        do {
                            String str2 = split[i];
                            String str3 = split[i + 1];
                            i += 2;
                            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                                hashMap.put(str2, str3);
                            }
                        } while (i < split.length);
                        if (!hashMap.isEmpty()) {
                            arrayList.add(new d(str, hashMap));
                        }
                    }
                }
                Log.w(f14522a, "load error line data:".concat(c2));
            } catch (Throwable th4) {
                th = th4;
                aVar = c;
                try {
                    Log.w(f14522a, "load failed", th);
                    return arrayList;
                } finally {
                    if (aVar != null) {
                        aVar.d();
                    }
                }
            }
        }
        c.d();
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
        if (r2 == null) goto L_0x00c3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(java.util.List<com.uc.webview.internal.stats.d> r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r9.isEmpty()     // Catch: all -> 0x000c
            if (r0 == 0) goto L_0x000f
            com.uc.webview.base.Log.b()     // Catch: all -> 0x000c
            monitor-exit(r8)
            return
        L_0x000c:
            r9 = move-exception
            goto L_0x00ee
        L_0x000f:
            r0 = 0
            com.uc.webview.base.io.a r2 = r8.c()     // Catch: all -> 0x00b6
            java.util.Iterator r9 = r9.iterator()     // Catch: all -> 0x0080
        L_0x0019:
            boolean r3 = r9.hasNext()     // Catch: all -> 0x0080
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r3 = r9.next()     // Catch: all -> 0x0080
            com.uc.webview.internal.stats.d r3 = (com.uc.webview.internal.stats.d) r3     // Catch: all -> 0x0080
            java.lang.String r4 = r3.f14511a     // Catch: all -> 0x0080
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: all -> 0x0080
            if (r4 != 0) goto L_0x0019
            java.util.Map<java.lang.String, java.lang.String> r4 = r3.b     // Catch: all -> 0x0080
            if (r4 == 0) goto L_0x0019
            boolean r4 = r4.isEmpty()     // Catch: all -> 0x0080
            if (r4 != 0) goto L_0x0019
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x0080
            r4.<init>()     // Catch: all -> 0x0080
            java.lang.String r5 = r3.f14511a     // Catch: all -> 0x0080
            r4.append(r5)     // Catch: all -> 0x0080
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.b     // Catch: all -> 0x0080
            java.util.Set r3 = r3.entrySet()     // Catch: all -> 0x0080
            java.util.Iterator r3 = r3.iterator()     // Catch: all -> 0x0080
        L_0x004b:
            boolean r5 = r3.hasNext()     // Catch: all -> 0x0080
            if (r5 == 0) goto L_0x0082
            java.lang.Object r5 = r3.next()     // Catch: all -> 0x0080
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: all -> 0x0080
            java.lang.Object r6 = r5.getKey()     // Catch: all -> 0x0080
            java.lang.String r6 = (java.lang.String) r6     // Catch: all -> 0x0080
            java.lang.Object r5 = r5.getValue()     // Catch: all -> 0x0080
            java.lang.String r5 = (java.lang.String) r5     // Catch: all -> 0x0080
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: all -> 0x0080
            if (r7 != 0) goto L_0x004b
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch: all -> 0x0080
            if (r7 != 0) goto L_0x004b
            java.lang.String r7 = "`"
            r4.append(r7)     // Catch: all -> 0x0080
            r4.append(r6)     // Catch: all -> 0x0080
            java.lang.String r6 = "`"
            r4.append(r6)     // Catch: all -> 0x0080
            r4.append(r5)     // Catch: all -> 0x0080
            goto L_0x004b
        L_0x0080:
            r9 = move-exception
            goto L_0x00b8
        L_0x0082:
            java.lang.String r3 = r4.toString()     // Catch: all -> 0x0080
            int r4 = r3.length()     // Catch: all -> 0x0080
            long r4 = (long) r4     // Catch: all -> 0x0080
            long r0 = r0 + r4
            java.lang.String r4 = "write line:"
            r4.concat(r3)     // Catch: all -> 0x0080
            com.uc.webview.base.Log.b()     // Catch: all -> 0x0080
            com.uc.webview.base.io.a$d r4 = r2.c     // Catch: all -> 0x0080
            if (r4 != 0) goto L_0x00a3
            com.uc.webview.base.io.a$d r4 = new com.uc.webview.base.io.a$d     // Catch: all -> 0x0080
            java.io.File r5 = r2.f14270a     // Catch: all -> 0x0080
            r6 = 1
            r4.<init>(r5, r6)     // Catch: all -> 0x0080
            r2.c = r4     // Catch: all -> 0x0080
        L_0x00a3:
            com.uc.webview.base.io.a$d r4 = r2.c     // Catch: all -> 0x0080
            com.uc.webview.base.io.a$a r5 = r2.b     // Catch: all -> 0x0080
            if (r5 == 0) goto L_0x00ad
            java.lang.String r3 = r5.a(r3)     // Catch: all -> 0x0080
        L_0x00ad:
            r4.a(r3)     // Catch: all -> 0x0080
            goto L_0x0019
        L_0x00b2:
            r2.d()     // Catch: all -> 0x000c
            goto L_0x00c3
        L_0x00b6:
            r9 = move-exception
            r2 = 0
        L_0x00b8:
            java.lang.String r3 = com.uc.webview.internal.stats.j.f14522a     // Catch: all -> 0x00e7
            java.lang.String r4 = "save failed"
            com.uc.webview.base.Log.w(r3, r4, r9)     // Catch: all -> 0x00e7
            if (r2 == 0) goto L_0x00c3
            goto L_0x00b2
        L_0x00c3:
            java.lang.String r9 = com.uc.webview.internal.stats.j.f14522a     // Catch: all -> 0x000c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: all -> 0x000c
            java.lang.String r3 = "save size:"
            r2.<init>(r3)     // Catch: all -> 0x000c
            r2.append(r0)     // Catch: all -> 0x000c
            java.lang.String r0 = ", total:"
            r2.append(r0)     // Catch: all -> 0x000c
            java.io.File r0 = r8.b     // Catch: all -> 0x000c
            long r0 = r0.length()     // Catch: all -> 0x000c
            r2.append(r0)     // Catch: all -> 0x000c
            java.lang.String r0 = r2.toString()     // Catch: all -> 0x000c
            com.uc.webview.base.Log.d(r9, r0)     // Catch: all -> 0x000c
            monitor-exit(r8)
            return
        L_0x00e7:
            r9 = move-exception
            if (r2 == 0) goto L_0x00ed
            r2.d()     // Catch: all -> 0x000c
        L_0x00ed:
            throw r9     // Catch: all -> 0x000c
        L_0x00ee:
            monitor-exit(r8)     // Catch: all -> 0x000c
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.stats.j.a(java.util.List):void");
    }
}
