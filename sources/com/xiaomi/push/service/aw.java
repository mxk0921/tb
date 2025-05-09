package com.xiaomi.push.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.bh;
import com.xiaomi.push.i;
import com.xiaomi.push.ih;
import com.xiaomi.push.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import tb.u8k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class aw {

    /* renamed from: a  reason: collision with root package name */
    private static Context f15057a;

    /* renamed from: a  reason: collision with other field name */
    private static Object f1566a;

    /* renamed from: a  reason: collision with other field name */
    private static WeakHashMap<Integer, aw> f1567a = new WeakHashMap<>();

    /* renamed from: a  reason: collision with other field name */
    private static boolean f1568a;

    /* renamed from: a  reason: collision with other field name */
    private String f1569a;
    private String b;

    private aw(String str) {
        this.f1569a = str;
    }

    private static int a(String str) {
        int packageUid;
        if (Build.VERSION.SDK_INT < 24) {
            return -1;
        }
        try {
            packageUid = f15057a.getPackageManager().getPackageUid(str, 0);
            return packageUid;
        } catch (Exception unused) {
            return -1;
        }
    }

    public String b() {
        if (TextUtils.isEmpty(this.b)) {
            this.b = b("default");
        }
        return this.b;
    }

    public String toString() {
        return "NotificationManagerHelper{" + this.f1569a + "}";
    }

    private String b(String str) {
        return a(m1031a() ? "mipush|%s|%s" : "mipush_%s_%s", this.f1569a, str);
    }

    /* renamed from: a  reason: collision with other method in class */
    public NotificationChannel m1034a(String str) {
        String id;
        NotificationChannel notificationChannel = null;
        try {
            if (m1031a()) {
                List<NotificationChannel> a2 = m1038a();
                if (a2 != null) {
                    for (NotificationChannel notificationChannel2 : a2) {
                        NotificationChannel a3 = u8k.a(notificationChannel2);
                        id = a3.getId();
                        if (str.equals(id)) {
                            notificationChannel = a3;
                            break;
                        }
                    }
                }
            } else {
                notificationChannel = a().getNotificationChannel(str);
            }
        } catch (Exception e) {
            m1030a("getNotificationChannel error" + e);
        }
        return notificationChannel;
    }

    private static NotificationManager a() {
        return (NotificationManager) f15057a.getSystemService(RemoteMessageConst.NOTIFICATION);
    }

    public String b(String str, String str2) {
        return m1031a() ? str : str2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Context m1035a() {
        return f15057a;
    }

    /* renamed from: b  reason: collision with other method in class */
    public List<StatusBarNotification> m1040b() {
        Object th;
        String str = this.f1569a;
        NotificationManager a2 = a();
        ArrayList arrayList = null;
        try {
            if (m1031a()) {
                int a3 = i.a();
                if (a3 != -1) {
                    return (List) a(bh.a(f1566a, "getAppActiveNotifications", str, Integer.valueOf(a3)));
                }
                return null;
            }
            StatusBarNotification[] activeNotifications = Build.VERSION.SDK_INT >= 23 ? a2.getActiveNotifications() : m1033a();
            if (activeNotifications == null || activeNotifications.length <= 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    if (str.equals(ax.c(statusBarNotification.getNotification()))) {
                        arrayList2.add(statusBarNotification);
                    }
                }
                return arrayList2;
            } catch (Throwable th2) {
                th = th2;
                arrayList = arrayList2;
                m1030a("getActiveNotifications error " + th);
                return arrayList;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static aw a(Context context, String str) {
        a(context);
        int hashCode = str.hashCode();
        aw awVar = f1567a.get(Integer.valueOf(hashCode));
        if (awVar != null) {
            return awVar;
        }
        aw awVar2 = new aw(str);
        f1567a.put(Integer.valueOf(hashCode), awVar2);
        return awVar2;
    }

    private static <T> T a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (T) obj.getClass().getMethod("getList", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object a(List list) {
        return Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class).newInstance(list);
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m1036a() {
        return this.f1569a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m1037a(String str) {
        return TextUtils.isEmpty(str) ? b() : j.m869a(m1035a()) ? b(str) : str;
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String a2 = a("mipush|%s|%s", str2, "");
        return str.startsWith(a2) ? a("mipush_%s_%s", str2, str.replace(a2, "")) : str;
    }

    private static String a(String str, String str2, String str3) {
        return TextUtils.isEmpty(str) ? "" : String.format(str, str2, str3);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:10:0x0037
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    /* renamed from: a  reason: collision with other method in class */
    public java.util.List<android.app.NotificationChannel> m1038a() {
        /*
            r8 = this;
            java.lang.String r0 = r8.f1569a
            r1 = 0
            boolean r2 = m1031a()     // Catch: Exception -> 0x003a
            if (r2 == 0) goto L_0x003e
            int r2 = a(r0)     // Catch: Exception -> 0x003a
            r3 = -1
            if (r2 == r3) goto L_0x003c
            java.lang.Object r3 = com.xiaomi.push.service.aw.f1566a     // Catch: Exception -> 0x003a
            java.lang.String r4 = "getNotificationChannelsForPackage"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: Exception -> 0x003a
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: Exception -> 0x003a
            r6 = 0
            r5[r6] = r0     // Catch: Exception -> 0x003a
            r6 = 1
            r5[r6] = r2     // Catch: Exception -> 0x003a
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: Exception -> 0x003a
            r6 = 2
            r5[r6] = r2     // Catch: Exception -> 0x003a
            java.lang.Object r2 = com.xiaomi.push.bh.a(r3, r4, r5)     // Catch: Exception -> 0x003a
            java.lang.Object r2 = a(r2)     // Catch: Exception -> 0x003a
            java.util.List r2 = (java.util.List) r2     // Catch: Exception -> 0x003a
            java.lang.String r1 = "mipush|%s|%s"
            r7 = r2
            r2 = r1
            r1 = r7
            goto L_0x0049
        L_0x0037:
            r0 = move-exception
            r1 = r2
            goto L_0x007e
        L_0x003a:
            r0 = move-exception
            goto L_0x007e
        L_0x003c:
            r2 = r1
            goto L_0x0049
        L_0x003e:
            android.app.NotificationManager r2 = a()     // Catch: Exception -> 0x003a
            java.util.List r1 = tb.bi0.a(r2)     // Catch: Exception -> 0x003a
            java.lang.String r2 = "mipush_%s_%s"
        L_0x0049:
            boolean r3 = com.xiaomi.push.j.m868a()     // Catch: Exception -> 0x003a
            if (r3 == 0) goto L_0x008f
            if (r1 == 0) goto L_0x008f
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: Exception -> 0x003a
            r3.<init>()     // Catch: Exception -> 0x003a
            java.lang.String r4 = ""
            java.lang.String r0 = a(r2, r0, r4)     // Catch: Exception -> 0x003a
            java.util.Iterator r2 = r1.iterator()     // Catch: Exception -> 0x003a
        L_0x0060:
            boolean r4 = r2.hasNext()     // Catch: Exception -> 0x003a
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r2.next()     // Catch: Exception -> 0x003a
            android.app.NotificationChannel r4 = tb.u8k.a(r4)     // Catch: Exception -> 0x003a
            java.lang.String r5 = tb.l42.a(r4)     // Catch: Exception -> 0x003a
            boolean r5 = r5.startsWith(r0)     // Catch: Exception -> 0x003a
            if (r5 == 0) goto L_0x0060
            r3.add(r4)     // Catch: Exception -> 0x003a
            goto L_0x0060
        L_0x007c:
            r1 = r3
            goto L_0x008f
        L_0x007e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getNotificationChannels error "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            m1030a(r0)
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.aw.m1038a():java.util.List");
    }

    public void a(int i) {
        String str = this.f1569a;
        try {
            if (m1031a()) {
                int a2 = i.a();
                String packageName = m1035a().getPackageName();
                if (Build.VERSION.SDK_INT >= 30) {
                    bh.b(f1566a, "cancelNotificationWithTag", str, packageName, null, Integer.valueOf(i), Integer.valueOf(a2));
                } else {
                    bh.b(f1566a, "cancelNotificationWithTag", str, null, Integer.valueOf(i), Integer.valueOf(a2));
                }
                m1030a("cancel succ:" + i);
                return;
            }
            a().cancel(i);
        } catch (Exception e) {
            m1030a("cancel error" + e);
        }
    }

    public void a(int i, Notification notification) {
        String str = this.f1569a;
        NotificationManager a2 = a();
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (m1031a()) {
                notification.extras.putString("xmsf_target_package", str);
                if (i2 >= 29) {
                    a2.notifyAsPackage(str, null, i, notification);
                }
            }
            a2.notify(i, notification);
        } catch (Exception unused) {
        }
    }

    public void a(NotificationChannel notificationChannel) {
        String str = this.f1569a;
        try {
            if (m1031a()) {
                int a2 = a(str);
                if (a2 != -1) {
                    bh.b(f1566a, "createNotificationChannelsForPackage", str, Integer.valueOf(a2), a(Arrays.asList(notificationChannel)));
                }
            } else {
                a().createNotificationChannel(notificationChannel);
            }
        } catch (Exception e) {
            m1030a("createNotificationChannel error" + e);
        }
    }

    public void a(NotificationChannel notificationChannel, boolean z) {
        String str = this.f1569a;
        try {
            if (z) {
                int a2 = a(str);
                if (a2 != -1) {
                    bh.b(f1566a, "updateNotificationChannelForPackage", str, Integer.valueOf(a2), notificationChannel);
                }
            } else {
                a(notificationChannel);
            }
        } catch (Exception e) {
            m1030a("updateNotificationChannel error " + e);
        }
    }

    private static void a(Context context) {
        if (f15057a == null) {
            f15057a = context.getApplicationContext();
            NotificationManager a2 = a();
            Boolean bool = (Boolean) bh.a((Object) a2, "isSystemConditionProviderEnabled", "xmsf_fake_condition_provider_path");
            m1030a("fwk is support.init:" + bool);
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            f1568a = booleanValue;
            if (booleanValue) {
                f1566a = bh.a((Object) a2, "getService", new Object[0]);
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m1030a(String str) {
        b.m410a("NMHelper:" + str);
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m1031a() {
        if (j.m868a() && az.a(f15057a).a(ih.NotificationBelongToAppSwitch.a(), true)) {
            return f1568a;
        }
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1032a(Context context) {
        a(context);
        return m1031a();
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1039a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith(b(""));
        }
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    private StatusBarNotification[] m1033a() {
        if (!j.m869a(m1035a())) {
            return null;
        }
        try {
            Object a2 = bh.a(f1566a, "getActiveNotifications", m1035a().getPackageName());
            if (a2 instanceof StatusBarNotification[]) {
                return (StatusBarNotification[]) a2;
            }
            return null;
        } catch (Throwable th) {
            m1030a("getAllNotifications error " + th);
            return null;
        }
    }
}
