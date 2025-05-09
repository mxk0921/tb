package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ah;
import com.xiaomi.push.bh;
import com.xiaomi.push.ff;
import com.xiaomi.push.j;
import com.xiaomi.push.s;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class cd {
    private static int a(Map<String, String> map) {
        return Math.max(0, s.a(map.get("notification_top_period"), 0));
    }

    private static int b(Map<String, String> map) {
        return Math.max(0, s.a(map.get("notification_top_frequency"), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str, int i, String str2, Notification notification) {
        aw a2;
        Notification a3;
        boolean z;
        int groupAlertBehavior;
        int i2;
        Notification.Builder recoverBuilder;
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && Build.VERSION.SDK_INT >= 26 && (a3 = a(notification, i, str2, (a2 = aw.a(context, str)))) != null) {
            if (notification != null) {
                z = true;
            } else {
                z = false;
            }
            groupAlertBehavior = a3.getGroupAlertBehavior();
            if (groupAlertBehavior != 1) {
                bh.a((Object) a3, "mGroupAlertBehavior", (Object) 1);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = a3.extras.getLong("mipush_org_when", 0L);
            int i3 = a3.extras.getInt("mipush_n_top_fre", 0);
            int i4 = a3.extras.getInt("mipush_n_top_prd", 0);
            if (i4 > 0 && i4 >= i3) {
                long j2 = (i4 * 1000) + j;
                if (j >= currentTimeMillis || currentTimeMillis >= j2) {
                    i2 = 0;
                } else if (i3 > 0) {
                    i2 = (int) Math.min((j2 - currentTimeMillis) / 1000, i3);
                } else {
                    i2 = i4;
                }
                if (!z) {
                    if (i2 > 0) {
                        a3.when = currentTimeMillis;
                        b.m410a("update top notification: " + str2);
                        a2.a(i, a3);
                    } else {
                        recoverBuilder = Notification.Builder.recoverBuilder(context, a3);
                        recoverBuilder.setPriority(0);
                        recoverBuilder.setWhen(currentTimeMillis);
                        Bundle extras = recoverBuilder.getExtras();
                        if (extras != null) {
                            extras.remove("mipush_n_top_flag");
                            extras.remove("mipush_org_when");
                            extras.remove("mipush_n_top_fre");
                            extras.remove("mipush_n_top_prd");
                            recoverBuilder.setExtras(extras);
                        }
                        b.m410a("update top notification to common: " + str2);
                        a2.a(i, recoverBuilder.build());
                    }
                }
                if (i2 > 0) {
                    b.m410a("schedule top notification next update delay: " + i2);
                    ah.a(context).m483a(b(i, str2));
                    ah.a(context).b(a(context, str, i, str2, (Notification) null), i2);
                }
            }
        }
    }

    private static Notification a(Notification notification, int i, String str, aw awVar) {
        if (notification != null) {
            if (!str.equals(notification.extras.getString(Constant.PROP_MESSAGE_ID))) {
                notification = null;
            }
            return notification;
        }
        List<StatusBarNotification> b = awVar.m1040b();
        if (b == null) {
            return null;
        }
        for (StatusBarNotification statusBarNotification : b) {
            Notification notification2 = statusBarNotification.getNotification();
            String string = notification2.extras.getString(Constant.PROP_MESSAGE_ID);
            if (i == statusBarNotification.getId() && str.equals(string)) {
                return notification2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i, String str) {
        return "n_top_update_" + i + "_" + str;
    }

    private static ah.a a(Context context, String str, int i, String str2, Notification notification) {
        return new ce(i, str2, context, str, notification);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m1067a(Context context, String str, int i, String str2, Notification notification) {
        if (j.m869a(context) && notification != null && notification.extras.getBoolean("mipush_n_top_flag", false)) {
            c(context, str, i, str2, notification);
        }
    }

    public static void a(Context context, Map<String, String> map, ff ffVar, long j) {
        if (map != null && ffVar != null && j.m869a(context) && m1068a(map)) {
            int a2 = a(map);
            int b = b(map);
            if (a2 <= 0 || b > a2) {
                b.d("set top notification failed - period:" + a2 + " frequency:" + b);
                return;
            }
            ffVar.setPriority(2);
            Bundle bundle = new Bundle();
            bundle.putLong("mipush_org_when", j);
            bundle.putBoolean("mipush_n_top_flag", true);
            if (b > 0) {
                bundle.putInt("mipush_n_top_fre", b);
            }
            bundle.putInt("mipush_n_top_prd", a2);
            ffVar.addExtras(bundle);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m1068a(Map<String, String> map) {
        String str = map.get("notification_top_repeat");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean parseBoolean = Boolean.parseBoolean(str);
        b.c("top notification' repeat is " + parseBoolean);
        return parseBoolean;
    }
}
