package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.XMJobService;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class fj {

    /* renamed from: a  reason: collision with other field name */
    private static a f985a;

    /* renamed from: a  reason: collision with other field name */
    private static final String f986a = XMJobService.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    private static int f14877a = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        /* renamed from: a */
        void mo693a();

        void a(boolean z);

        /* renamed from: a  reason: collision with other method in class */
        boolean m691a();
    }

    public static synchronized void a() {
        synchronized (fj.class) {
            if (f985a != null) {
                b.m410a("[Alarm] stop alarm.");
                f985a.mo693a();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r6.equals(com.xiaomi.push.r.a(r9, r5.name).getSuperclass().getCanonicalName()) != false) goto L_0x0046;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r9) {
        /*
            java.lang.String r0 = "android.permission.BIND_JOB_SERVICE"
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.String r1 = r9.getPackageName()
            java.lang.String r2 = "com.xiaomi.xmsf"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x001b
            com.xiaomi.push.fk r0 = new com.xiaomi.push.fk
            r0.<init>(r9)
        L_0x0017:
            com.xiaomi.push.fj.f985a = r0
            goto L_0x00bd
        L_0x001b:
            android.content.pm.PackageManager r1 = r9.getPackageManager()
            r2 = 0
            java.lang.String r3 = r9.getPackageName()     // Catch: Exception -> 0x007c
            r4 = 4
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r3, r4)     // Catch: Exception -> 0x007c
            android.content.pm.ServiceInfo[] r1 = r1.services     // Catch: Exception -> 0x007c
            if (r1 == 0) goto L_0x0092
            int r3 = r1.length     // Catch: Exception -> 0x007c
            r4 = 0
        L_0x002f:
            if (r2 >= r3) goto L_0x0060
            r5 = r1[r2]     // Catch: Exception -> 0x0062
            java.lang.String r6 = r5.permission     // Catch: Exception -> 0x0062
            boolean r6 = r0.equals(r6)     // Catch: Exception -> 0x0062
            r7 = 1
            if (r6 == 0) goto L_0x0065
            java.lang.String r6 = com.xiaomi.push.fj.f986a     // Catch: Exception -> 0x0062
            java.lang.String r8 = r5.name     // Catch: Exception -> 0x0062
            boolean r8 = r6.equals(r8)     // Catch: Exception -> 0x0062
            if (r8 == 0) goto L_0x0048
        L_0x0046:
            r4 = 1
            goto L_0x005e
        L_0x0048:
            java.lang.String r8 = r5.name     // Catch: Exception -> 0x005d
            java.lang.Class r8 = com.xiaomi.push.r.a(r9, r8)     // Catch: Exception -> 0x005d
            java.lang.Class r8 = r8.getSuperclass()     // Catch: Exception -> 0x005d
            java.lang.String r8 = r8.getCanonicalName()     // Catch: Exception -> 0x005d
            boolean r6 = r6.equals(r8)     // Catch: Exception -> 0x005d
            if (r6 == 0) goto L_0x005e
            goto L_0x0046
        L_0x005d:
        L_0x005e:
            if (r4 != r7) goto L_0x0065
        L_0x0060:
            r2 = r4
            goto L_0x0092
        L_0x0062:
            r0 = move-exception
            r2 = r4
            goto L_0x007d
        L_0x0065:
            java.lang.String r6 = com.xiaomi.push.fj.f986a     // Catch: Exception -> 0x0062
            java.lang.String r8 = r5.name     // Catch: Exception -> 0x0062
            boolean r6 = r6.equals(r8)     // Catch: Exception -> 0x0062
            if (r6 == 0) goto L_0x0079
            java.lang.String r5 = r5.permission     // Catch: Exception -> 0x0062
            boolean r5 = r0.equals(r5)     // Catch: Exception -> 0x0062
            if (r5 == 0) goto L_0x0079
            r2 = 1
            goto L_0x0092
        L_0x0079:
            int r2 = r2 + 1
            goto L_0x002f
        L_0x007c:
            r0 = move-exception
        L_0x007d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "check service err : "
            r1.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.xiaomi.channel.commonutils.logger.b.m410a(r0)
        L_0x0092:
            if (r2 != 0) goto L_0x00b6
            boolean r0 = com.xiaomi.push.r.m966a(r9)
            if (r0 != 0) goto L_0x009b
            goto L_0x00b6
        L_0x009b:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Should export service: "
            r0.<init>(r1)
            java.lang.String r1 = com.xiaomi.push.fj.f986a
            r0.append(r1)
            java.lang.String r1 = " with permission android.permission.BIND_JOB_SERVICE in AndroidManifest.xml file"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x00b6:
            com.xiaomi.push.fk r0 = new com.xiaomi.push.fk
            r0.<init>(r9)
            goto L_0x0017
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.fj.a(android.content.Context):void");
    }

    public static synchronized void a(Context context, int i) {
        synchronized (fj.class) {
            try {
                int i2 = f14877a;
                if (!"com.xiaomi.xmsf".equals(context.getPackageName())) {
                    if (i == 2) {
                        f14877a = 2;
                    } else {
                        f14877a = 0;
                    }
                }
                int i3 = f14877a;
                if (i2 != i3 && i3 == 2) {
                    a();
                    f985a = new fm(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void a(boolean z) {
        synchronized (fj.class) {
            if (f985a == null) {
                b.m410a("timer is not initialized");
                return;
            }
            b.m410a("[Alarm] register alarm. (" + z + f7l.BRACKET_END_STR);
            f985a.a(z);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static synchronized boolean m690a() {
        synchronized (fj.class) {
            a aVar = f985a;
            if (aVar == null) {
                return false;
            }
            return aVar.m691a();
        }
    }
}
