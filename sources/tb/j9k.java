package tb;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.heytap.msp.push.notification.PushNotification;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class j9k {
    static {
        t2o.a(612368409);
    }

    public static Notification a(Context context, String str, PushNotification.Builder builder) {
        Notification.Builder builder2 = new Notification.Builder(context);
        if (Build.VERSION.SDK_INT >= 26) {
            builder2.setChannelId(x9k.DEFAULT_NOTIFICATION_CHANNEL_ID);
        }
        builder2.setGroup(str);
        builder2.setGroupSummary(true);
        if (e(builder2, builder)) {
            return builder2.build();
        }
        return null;
    }

    public static StatusBarNotification[] b(NotificationManager notificationManager, String str) {
        StatusBarNotification[] activeNotifications;
        if (Build.VERSION.SDK_INT < 23) {
            return null;
        }
        activeNotifications = notificationManager.getActiveNotifications();
        return activeNotifications;
    }

    public static boolean d(NotificationManager notificationManager, String str, int i) {
        StatusBarNotification[] b = b(notificationManager, str);
        if (!(b == null || b.length == 0)) {
            for (StatusBarNotification statusBarNotification : b) {
                if (statusBarNotification.getId() == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean e(Notification.Builder builder, PushNotification.Builder builder2) {
        int iconRes = builder2.getIconRes();
        int iconLevel = builder2.getIconLevel();
        Icon icon = builder2.getIcon();
        if (icon != null && Build.VERSION.SDK_INT >= 23) {
            builder.setSmallIcon(icon);
            return true;
        } else if (iconRes != 0 && iconLevel != 0) {
            builder.setSmallIcon(iconRes, iconLevel);
            return true;
        } else if (iconRes == 0) {
            return false;
        } else {
            builder.setSmallIcon(iconRes);
            return true;
        }
    }

    public static NotificationManager c(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        } catch (Throwable unused) {
            return null;
        }
    }
}
