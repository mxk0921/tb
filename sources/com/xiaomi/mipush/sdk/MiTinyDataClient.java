package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ic;
import com.xiaomi.push.ig;
import com.xiaomi.push.ip;
import com.xiaomi.push.jb;
import com.xiaomi.push.service.ca;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MiTinyDataClient {
    public static final String PENDING_REASON_APPID = "com.xiaomi.xmpushsdk.tinydataPending.appId";
    public static final String PENDING_REASON_CHANNEL = "com.xiaomi.xmpushsdk.tinydataPending.channel";
    public static final String PENDING_REASON_INIT = "com.xiaomi.xmpushsdk.tinydataPending.init";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static volatile a f14700a;

        /* renamed from: a  reason: collision with other field name */
        private Context f658a;

        /* renamed from: a  reason: collision with other field name */
        private Boolean f660a;

        /* renamed from: a  reason: collision with other field name */
        private String f661a;

        /* renamed from: a  reason: collision with other field name */
        private C0853a f659a = new C0853a();

        /* renamed from: a  reason: collision with other field name */
        private final ArrayList<ig> f662a = new ArrayList<>();

        /* compiled from: Taobao */
        /* renamed from: com.xiaomi.mipush.sdk.MiTinyDataClient$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0853a {

            /* renamed from: a  reason: collision with other field name */
            private ScheduledFuture<?> f665a;

            /* renamed from: a  reason: collision with other field name */
            private ScheduledThreadPoolExecutor f666a = new ScheduledThreadPoolExecutor(1);

            /* renamed from: a  reason: collision with other field name */
            public final ArrayList<ig> f664a = new ArrayList<>();

            /* renamed from: a  reason: collision with other field name */
            private final Runnable f663a = new ab(this);

            public C0853a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void b() {
                ig remove = this.f664a.remove(0);
                for (jb jbVar : ca.a(Arrays.asList(remove), a.this.f658a.getPackageName(), b.m452a(a.this.f658a).m453a(), 30720)) {
                    b.c("MiTinyDataClient Send item by PushServiceClient.sendMessage(XmActionNotification)." + remove.d());
                    ao.a(a.this.f658a).a((ao) jbVar, ic.Notification, true, (ip) null);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a() {
                if (this.f665a == null) {
                    this.f665a = this.f666a.scheduleAtFixedRate(this.f663a, 1000L, 1000L, TimeUnit.MILLISECONDS);
                }
            }

            public void a(ig igVar) {
                this.f666a.execute(new aa(this, igVar));
            }
        }

        public void b(String str) {
            b.c("MiTinyDataClient.processPendingList(" + str + f7l.BRACKET_END_STR);
            ArrayList arrayList = new ArrayList();
            synchronized (this.f662a) {
                arrayList.addAll(this.f662a);
                this.f662a.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m429a((ig) it.next());
            }
        }

        public static a a() {
            if (f14700a == null) {
                synchronized (a.class) {
                    try {
                        if (f14700a == null) {
                            f14700a = new a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f14700a;
        }

        private boolean b(Context context) {
            return b.m452a(context).m453a() == null && !a(this.f658a);
        }

        private boolean b(ig igVar) {
            if (ca.a(igVar, false)) {
                return false;
            }
            if (this.f660a.booleanValue()) {
                b.c("MiTinyDataClient Send item by PushServiceClient.sendTinyData(ClientUploadDataItem)." + igVar.d());
                ao.a(this.f658a).a(igVar);
                return true;
            }
            this.f659a.a(igVar);
            return true;
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m427a(Context context) {
            if (context == null) {
                b.m410a("context is null, MiTinyDataClientImp.init() failed.");
                return;
            }
            this.f658a = context;
            this.f660a = Boolean.valueOf(a(context));
            b(MiTinyDataClient.PENDING_REASON_INIT);
        }

        private void a(ig igVar) {
            synchronized (this.f662a) {
                try {
                    if (!this.f662a.contains(igVar)) {
                        this.f662a.add(igVar);
                        if (this.f662a.size() > 100) {
                            this.f662a.remove(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public synchronized void a(String str) {
            if (TextUtils.isEmpty(str)) {
                b.m410a("channel is null, MiTinyDataClientImp.setChannel(String) failed.");
                return;
            }
            this.f661a = str;
            b(MiTinyDataClient.PENDING_REASON_CHANNEL);
        }

        /* renamed from: a  reason: collision with other method in class */
        public boolean m428a() {
            return this.f658a != null;
        }

        private boolean a(Context context) {
            if (!ao.a(context).m445a()) {
                return true;
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
                if (packageInfo == null) {
                    return false;
                }
                return packageInfo.versionCode >= 108;
            } catch (Exception unused) {
                return false;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x00aa, code lost:
            r0 = "MiTinyDataClient Pending " + r13.b() + " reason is com.xiaomi.xmpushsdk.tinydataPending.channel";
         */
        /* renamed from: a  reason: collision with other method in class */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public synchronized boolean m429a(com.xiaomi.push.ig r13) {
            /*
                r12 = this;
                java.lang.String r0 = " reason is com.xiaomi.xmpushsdk.tinydataPending.appId"
                java.lang.String r1 = "MiTinyDataClient Pending "
                java.lang.String r2 = " reason is com.xiaomi.xmpushsdk.tinydataPending.init"
                java.lang.String r3 = "MiTinyDataClient Pending "
                java.lang.String r4 = " reason is com.xiaomi.xmpushsdk.tinydataPending.channel"
                java.lang.String r5 = "MiTinyDataClient Pending "
                java.lang.String r6 = "MiTinyDataClient Send item immediately."
                monitor-enter(r12)
                r7 = 0
                if (r13 != 0) goto L_0x0014
                monitor-exit(r12)
                return r7
            L_0x0014:
                r8 = 1
                boolean r9 = com.xiaomi.push.service.ca.a(r13, r8)     // Catch: all -> 0x0031
                if (r9 == 0) goto L_0x001d
                monitor-exit(r12)
                return r7
            L_0x001d:
                java.lang.String r9 = r13.m787a()     // Catch: all -> 0x0031
                boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: all -> 0x0031
                if (r9 == 0) goto L_0x0034
                java.lang.String r9 = r12.f661a     // Catch: all -> 0x0031
                boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: all -> 0x0031
                if (r9 == 0) goto L_0x0034
                r9 = 1
                goto L_0x0035
            L_0x0031:
                r13 = move-exception
                goto L_0x00f2
            L_0x0034:
                r9 = 0
            L_0x0035:
                boolean r10 = r12.m428a()     // Catch: all -> 0x0031
                android.content.Context r11 = r12.f658a     // Catch: all -> 0x0031
                if (r11 == 0) goto L_0x0043
                boolean r11 = r12.b(r11)     // Catch: all -> 0x0031
                if (r11 == 0) goto L_0x0044
            L_0x0043:
                r7 = 1
            L_0x0044:
                if (r10 == 0) goto L_0x00a8
                if (r9 != 0) goto L_0x00a8
                if (r7 == 0) goto L_0x004b
                goto L_0x00a8
            L_0x004b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x0031
                r0.<init>(r6)     // Catch: all -> 0x0031
                java.lang.String r1 = r13.d()     // Catch: all -> 0x0031
                r0.append(r1)     // Catch: all -> 0x0031
                java.lang.String r0 = r0.toString()     // Catch: all -> 0x0031
                com.xiaomi.channel.commonutils.logger.b.c(r0)     // Catch: all -> 0x0031
                java.lang.String r0 = r13.d()     // Catch: all -> 0x0031
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: all -> 0x0031
                if (r0 == 0) goto L_0x006f
                java.lang.String r0 = com.xiaomi.push.service.bc.a()     // Catch: all -> 0x0031
                r13.f(r0)     // Catch: all -> 0x0031
            L_0x006f:
                java.lang.String r0 = r13.m787a()     // Catch: all -> 0x0031
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: all -> 0x0031
                if (r0 == 0) goto L_0x007e
                java.lang.String r0 = r12.f661a     // Catch: all -> 0x0031
                r13.a(r0)     // Catch: all -> 0x0031
            L_0x007e:
                java.lang.String r0 = r13.c()     // Catch: all -> 0x0031
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: all -> 0x0031
                if (r0 == 0) goto L_0x0091
                android.content.Context r0 = r12.f658a     // Catch: all -> 0x0031
                java.lang.String r0 = r0.getPackageName()     // Catch: all -> 0x0031
                r13.e(r0)     // Catch: all -> 0x0031
            L_0x0091:
                long r0 = r13.a()     // Catch: all -> 0x0031
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 > 0) goto L_0x00a2
                long r0 = java.lang.System.currentTimeMillis()     // Catch: all -> 0x0031
                r13.b(r0)     // Catch: all -> 0x0031
            L_0x00a2:
                boolean r13 = r12.b(r13)     // Catch: all -> 0x0031
                monitor-exit(r12)
                return r13
            L_0x00a8:
                if (r9 == 0) goto L_0x00c1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x0031
                r0.<init>(r5)     // Catch: all -> 0x0031
                java.lang.String r1 = r13.b()     // Catch: all -> 0x0031
                r0.append(r1)     // Catch: all -> 0x0031
                r0.append(r4)     // Catch: all -> 0x0031
                java.lang.String r0 = r0.toString()     // Catch: all -> 0x0031
            L_0x00bd:
                com.xiaomi.channel.commonutils.logger.b.c(r0)     // Catch: all -> 0x0031
                goto L_0x00ed
            L_0x00c1:
                if (r10 != 0) goto L_0x00d7
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x0031
                r0.<init>(r3)     // Catch: all -> 0x0031
                java.lang.String r1 = r13.b()     // Catch: all -> 0x0031
                r0.append(r1)     // Catch: all -> 0x0031
                r0.append(r2)     // Catch: all -> 0x0031
                java.lang.String r0 = r0.toString()     // Catch: all -> 0x0031
                goto L_0x00bd
            L_0x00d7:
                if (r7 == 0) goto L_0x00ed
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: all -> 0x0031
                r2.<init>(r1)     // Catch: all -> 0x0031
                java.lang.String r1 = r13.b()     // Catch: all -> 0x0031
                r2.append(r1)     // Catch: all -> 0x0031
                r2.append(r0)     // Catch: all -> 0x0031
                java.lang.String r0 = r2.toString()     // Catch: all -> 0x0031
                goto L_0x00bd
            L_0x00ed:
                r12.a(r13)     // Catch: all -> 0x0031
                monitor-exit(r12)
                return r8
            L_0x00f2:
                monitor-exit(r12)     // Catch: all -> 0x0031
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.MiTinyDataClient.a.m429a(com.xiaomi.push.ig):boolean");
        }
    }

    public static void init(Context context, String str) {
        if (context == null) {
            b.m410a("context is null, MiTinyDataClient.init(Context, String) failed.");
            return;
        }
        a.a().m427a(context);
        if (TextUtils.isEmpty(str)) {
            b.m410a("channel is null or empty, MiTinyDataClient.init(Context, String) failed.");
        } else {
            a.a().a(str);
        }
    }

    public static boolean upload(Context context, ig igVar) {
        b.c("MiTinyDataClient.upload " + igVar.d());
        if (!a.a().m428a()) {
            a.a().m427a(context);
        }
        return a.a().m429a(igVar);
    }

    public static boolean upload(Context context, String str, String str2, long j, String str3) {
        ig igVar = new ig();
        igVar.d(str);
        igVar.c(str2);
        igVar.a(j);
        igVar.b(str3);
        igVar.a(true);
        igVar.a("push_sdk_channel");
        return upload(context, igVar);
    }

    public static boolean upload(String str, String str2, long j, String str3) {
        ig igVar = new ig();
        igVar.d(str);
        igVar.c(str2);
        igVar.a(j);
        igVar.b(str3);
        return a.a().m429a(igVar);
    }
}
