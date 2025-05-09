package com.meizu.cloud.pushsdk.notification.g;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static Field f5909a;
    private static Field b;
    private static Field c;
    private static final Object d = new Object();
    private static final Map<String, Set<String>> e = new ConcurrentHashMap();
    private static Map<String, Uri> f;

    static {
        try {
            f5909a = Notification.class.getDeclaredField("mFlymeNotification");
            Field declaredField = Class.forName("android.app.NotificationExt").getDeclaredField("internalApp");
            b = declaredField;
            declaredField.setAccessible(true);
        } catch (Exception e2) {
            DebugLogger.e("NotificationUtils", "init NotificationUtils error " + e2.getMessage());
        }
        try {
            Field declaredField2 = Notification.class.getDeclaredField("replyIntent");
            c = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception e3) {
            DebugLogger.e("NotificationUtils", "init NotificationUtils error " + e3.getMessage());
        }
    }

    public static void a(Notification notification, PendingIntent pendingIntent) {
        Field field = c;
        if (field != null) {
            try {
                field.set(notification, pendingIntent);
            } catch (IllegalAccessException e2) {
                DebugLogger.e("NotificationUtils", "setReplyIntent error " + e2.getMessage());
            }
        }
    }

    public static Uri b(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || RingtoneManager.getActualDefaultRingtoneUri(context, 2) == null) {
            return null;
        }
        if (f == null) {
            b(context);
        }
        Map<String, Uri> map = f;
        if (!(map == null || map.size() == 0)) {
            return f.get(str.toLowerCase());
        }
        return null;
    }

    public static void c(Context context, String str, int i) {
        Map<String, Set<String>> map = e;
        Set<String> set = map.get(str);
        DebugLogger.i("NotificationUtils", "store notifyId " + i);
        if (set == null) {
            HashSet hashSet = new HashSet();
            hashSet.add(String.valueOf(i));
            map.put(str, hashSet);
            return;
        }
        set.add(String.valueOf(i));
    }

    public static void a(Notification notification, boolean z) {
        Field field = f5909a;
        if (field != null && b != null) {
            try {
                b.set(field.get(notification), Integer.valueOf(z ? 1 : 0));
            } catch (IllegalAccessException e2) {
                DebugLogger.e("NotificationUtils", "setInternalApp error " + e2.getMessage());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
        if (0 == 0) goto L_0x0084;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized void b(android.content.Context r6) {
        /*
            java.lang.Class<com.meizu.cloud.pushsdk.notification.g.b> r0 = com.meizu.cloud.pushsdk.notification.g.b.class
            monitor-enter(r0)
            java.util.Map<java.lang.String, android.net.Uri> r1 = com.meizu.cloud.pushsdk.notification.g.b.f     // Catch: all -> 0x001f
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            r1 = 0
            android.media.RingtoneManager r2 = new android.media.RingtoneManager     // Catch: all -> 0x005c, Exception -> 0x005e
            r2.<init>(r6)     // Catch: all -> 0x005c, Exception -> 0x005e
            r6 = 2
            r2.setType(r6)     // Catch: all -> 0x005c, Exception -> 0x005e
            android.database.Cursor r1 = r2.getCursor()     // Catch: all -> 0x005c, Exception -> 0x005e
            if (r1 != 0) goto L_0x0023
            if (r1 == 0) goto L_0x0021
            r1.close()     // Catch: all -> 0x001f
            goto L_0x0021
        L_0x001f:
            r6 = move-exception
            goto L_0x008c
        L_0x0021:
            monitor-exit(r0)
            return
        L_0x0023:
            java.util.HashMap r2 = new java.util.HashMap     // Catch: all -> 0x005c, Exception -> 0x005e
            int r3 = r1.getCount()     // Catch: all -> 0x005c, Exception -> 0x005e
            r2.<init>(r3)     // Catch: all -> 0x005c, Exception -> 0x005e
            com.meizu.cloud.pushsdk.notification.g.b.f = r2     // Catch: all -> 0x005c, Exception -> 0x005e
            boolean r2 = r1.moveToFirst()     // Catch: all -> 0x005c, Exception -> 0x005e
        L_0x0032:
            if (r2 == 0) goto L_0x0081
            r2 = 1
            java.lang.String r2 = r1.getString(r2)     // Catch: all -> 0x005c, Exception -> 0x005e
            java.lang.String r3 = r1.getString(r6)     // Catch: all -> 0x005c, Exception -> 0x005e
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: all -> 0x005c, Exception -> 0x005e
            r4 = 0
            long r4 = r1.getLong(r4)     // Catch: all -> 0x005c, Exception -> 0x005e
            android.net.Uri r3 = android.content.ContentUris.withAppendedId(r3, r4)     // Catch: all -> 0x005c, Exception -> 0x005e
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: all -> 0x005c, Exception -> 0x005e
            if (r4 != 0) goto L_0x0060
            if (r3 == 0) goto L_0x0060
            java.util.Map<java.lang.String, android.net.Uri> r4 = com.meizu.cloud.pushsdk.notification.g.b.f     // Catch: all -> 0x005c, Exception -> 0x005e
            java.lang.String r2 = r2.toLowerCase()     // Catch: all -> 0x005c, Exception -> 0x005e
            r4.put(r2, r3)     // Catch: all -> 0x005c, Exception -> 0x005e
            goto L_0x0060
        L_0x005c:
            r6 = move-exception
            goto L_0x0086
        L_0x005e:
            r6 = move-exception
            goto L_0x0065
        L_0x0060:
            boolean r2 = r1.moveToNext()     // Catch: all -> 0x005c, Exception -> 0x005e
            goto L_0x0032
        L_0x0065:
            java.lang.String r2 = "NotificationUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x005c
            r3.<init>()     // Catch: all -> 0x005c
            java.lang.String r4 = "get ringtone info error, "
            r3.append(r4)     // Catch: all -> 0x005c
            java.lang.String r6 = r6.getMessage()     // Catch: all -> 0x005c
            r3.append(r6)     // Catch: all -> 0x005c
            java.lang.String r6 = r3.toString()     // Catch: all -> 0x005c
            com.meizu.cloud.pushinternal.DebugLogger.e(r2, r6)     // Catch: all -> 0x005c
            if (r1 == 0) goto L_0x0084
        L_0x0081:
            r1.close()     // Catch: all -> 0x001f
        L_0x0084:
            monitor-exit(r0)
            return
        L_0x0086:
            if (r1 == 0) goto L_0x008b
            r1.close()     // Catch: all -> 0x001f
        L_0x008b:
            throw r6     // Catch: all -> 0x001f
        L_0x008c:
            monitor-exit(r0)     // Catch: all -> 0x001f
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.notification.g.b.b(android.content.Context):void");
    }

    public static void a(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (notificationManager != null) {
            notificationManager.cancelAll();
        }
    }

    public static void b(Context context, String str, int i) {
        Set<String> set = e.get(str);
        if (set != null) {
            set.remove(String.valueOf(i));
            DebugLogger.i("NotificationUtils", "remove notifyId " + i);
        }
    }

    public static void a(Context context, String str) {
        Set<String> set;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (!(notificationManager == null || TextUtils.isEmpty(str) || (set = e.get(str)) == null)) {
            for (String str2 : set) {
                DebugLogger.i("NotificationUtils", "clear notifyId " + str2 + " notification");
                notificationManager.cancel(Integer.parseInt(str2));
            }
            set.clear();
        }
    }

    public static void a(Context context, String str, int i) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (notificationManager != null) {
            DebugLogger.i("NotificationUtils", "clear clearNotification notifyId " + i);
            notificationManager.cancel(i);
            Set<String> set = e.get(str);
            if (set != null) {
                set.remove(String.valueOf(i));
            }
        }
    }

    public static boolean a(Context context, String str, String str2) {
        synchronized (d) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    return false;
                }
                int c2 = com.meizu.cloud.pushsdk.util.b.c(context, str, str2);
                DebugLogger.e("NotificationUtils", "removeNotifyKey " + str2 + " notifyId " + c2);
                b(context, str, c2);
                return com.meizu.cloud.pushsdk.util.b.i(context, str, str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
