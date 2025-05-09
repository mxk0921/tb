package com.xiaomi.push.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.push.bh;
import com.xiaomi.push.ih;
import com.xiaomi.push.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aig;
import tb.big;
import tb.e73;
import tb.uvx;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class at {

    /* renamed from: a  reason: collision with root package name */
    private static at f15051a = new at();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a {

        /* renamed from: a  reason: collision with other field name */
        List<b> f1561a;
        List<b> b;

        private a() {
            this.f1561a = new ArrayList();
            this.b = new ArrayList();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        int f15053a;

        /* renamed from: a  reason: collision with other field name */
        Notification f1562a;

        public b(int i, Notification notification) {
            this.f15053a = i;
            this.f1562a = notification;
        }

        public String toString() {
            return "id:" + this.f15053a;
        }
    }

    private at() {
    }

    private int a(String str, String str2) {
        return ("GroupSummary" + str + str2).hashCode();
    }

    private String b(Notification notification) {
        if (notification == null) {
            return null;
        }
        return m1029b(notification) ? a(notification) : notification.getGroup();
    }

    public static at a() {
        return f15051a;
    }

    private void b(Context context, int i, Notification notification) {
        Notification.Builder recoverBuilder;
        String str;
        String c = ax.c(notification);
        if (TextUtils.isEmpty(c)) {
            str = "group restore not extract pkg from notification:" + i;
        } else {
            aw a2 = aw.a(context, c);
            List<StatusBarNotification> a3 = a(a2);
            if (a3 == null) {
                str = "group restore not get notifications";
            } else {
                for (StatusBarNotification statusBarNotification : a3) {
                    Notification notification2 = statusBarNotification.getNotification();
                    if (!(notification2 == null || !m1029b(notification2) || statusBarNotification.getId() == i)) {
                        recoverBuilder = Notification.Builder.recoverBuilder(context, statusBarNotification.getNotification());
                        recoverBuilder.setGroup(a(notification2));
                        ax.a(recoverBuilder, m1028a(notification2));
                        a2.a(statusBarNotification.getId(), recoverBuilder.build());
                        com.xiaomi.channel.commonutils.logger.b.b("group restore notification:" + statusBarNotification.getId());
                    }
                }
                return;
            }
        }
        com.xiaomi.channel.commonutils.logger.b.m410a(str);
    }

    private String a(Notification notification) {
        Bundle bundle;
        if (notification == null || (bundle = notification.extras) == null) {
            return null;
        }
        return bundle.getString("push_src_group_name");
    }

    /* renamed from: b  reason: collision with other method in class */
    private boolean m1029b(Notification notification) {
        Bundle bundle;
        if (notification == null || notification.getGroup() == null || (bundle = notification.extras) == null) {
            return false;
        }
        long j = bundle.getLong("push_src_group_time");
        String a2 = a(notification);
        String group = notification.getGroup();
        return group.equals("pushmask_" + j + "_" + a2);
    }

    private boolean b(Context context) {
        return az.a(context).a(ih.NotificationAutoGroupSwitch.a(), true);
    }

    public String a(Context context, Notification.Builder builder, String str) {
        if (!m1027a() || !a(context)) {
            return str;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bundle extras = builder.getExtras();
        extras.putString("push_src_group_name", str);
        extras.putLong("push_src_group_time", currentTimeMillis);
        return "pushmask_" + currentTimeMillis + "_" + str;
    }

    private List<StatusBarNotification> a(aw awVar) {
        List<StatusBarNotification> b2 = awVar != null ? awVar.m1040b() : null;
        if (b2 == null || b2.size() == 0) {
            return null;
        }
        return b2;
    }

    public void a(Context context, int i, Notification notification) {
        if (m1027a()) {
            if (a(context)) {
                try {
                    b(context, i, notification);
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.b.m410a("group notify handle restore error " + e);
                }
            }
            if (b(context)) {
                try {
                    a(context, i, notification, true);
                } catch (Exception e2) {
                    com.xiaomi.channel.commonutils.logger.b.m410a("group notify handle auto error " + e2);
                }
            }
        }
    }

    private void a(Context context, int i, Notification notification, boolean z) {
        Notification notification2;
        String str;
        String c = ax.c(notification);
        if (TextUtils.isEmpty(c)) {
            str = "group auto not extract pkg from notification:" + i;
        } else {
            List<StatusBarNotification> a2 = a(aw.a(context, c));
            if (a2 == null) {
                str = "group auto not get notifications";
            } else {
                String b2 = b(notification);
                HashMap hashMap = new HashMap();
                for (StatusBarNotification statusBarNotification : a2) {
                    if (!(statusBarNotification.getNotification() == null || statusBarNotification.getId() == i)) {
                        a(hashMap, statusBarNotification);
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    if (!TextUtils.isEmpty(str2)) {
                        a aVar = (a) entry.getValue();
                        if (z && str2.equals(b2) && !m1029b(notification)) {
                            (m1028a(notification) ? aVar.b : aVar.f1561a).add(new b(i, notification));
                        }
                        int size = aVar.f1561a.size();
                        if (aVar.b.size() <= 0) {
                            if (z && size >= 2) {
                                notification2 = aVar.f1561a.get(0).f1562a;
                                a(context, c, str2, notification2);
                            }
                        } else if (size <= 0) {
                            a(context, c, str2);
                        } else if (az.a(context).a(ih.NotificationGroupUpdateTimeSwitch.a(), false) && (notification2 = aVar.b.get(0).f1562a) != null) {
                            notification2.when = System.currentTimeMillis();
                            a(context, c, str2, notification2);
                        }
                    }
                }
                return;
            }
        }
        com.xiaomi.channel.commonutils.logger.b.m410a(str);
    }

    private void a(Context context, String str, String str2) {
        com.xiaomi.channel.commonutils.logger.b.b("group cancel summary:" + str2);
        aw.a(context, str).a(a(str, str2));
    }

    private void a(Context context, String str, String str2, Notification notification) {
        Notification.Builder builder;
        Icon createWithResource;
        Notification.Builder smallIcon;
        String channelId;
        try {
            if (TextUtils.isEmpty(str2)) {
                com.xiaomi.channel.commonutils.logger.b.m410a("group show summary group is null");
                return;
            }
            int a2 = ax.a(context, str);
            if (a2 == 0) {
                com.xiaomi.channel.commonutils.logger.b.m410a("group show summary not get icon from " + str);
                return;
            }
            aw a3 = aw.a(context, str);
            if (Build.VERSION.SDK_INT >= 26) {
                channelId = notification.getChannelId();
                String b2 = a3.b(channelId, "groupSummary");
                NotificationChannel a4 = a3.m1034a(b2);
                if ("groupSummary".equals(b2) && a4 == null) {
                    e73.a();
                    a3.a(aig.a(b2, "group_summary", 3));
                }
                uvx.a();
                builder = big.a(context, b2);
            } else {
                builder = new Notification.Builder(context).setPriority(0).setDefaults(-1);
            }
            ax.a(builder, true);
            Notification.Builder contentText = builder.setContentTitle("GroupSummary").setContentText("GroupSummary");
            createWithResource = Icon.createWithResource(str, a2);
            smallIcon = contentText.setSmallIcon(createWithResource);
            Notification build = smallIcon.setAutoCancel(true).setGroup(str2).setGroupSummary(true).build();
            if (!j.m873c() && "com.xiaomi.xmsf".equals(context.getPackageName())) {
                ax.m1041a(build, str);
            }
            int a5 = a(str, str2);
            a3.a(a5, build);
            com.xiaomi.channel.commonutils.logger.b.b("group show summary notify:" + a5);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m410a("group show summary error " + e);
        }
    }

    private void a(Map<String, a> map, StatusBarNotification statusBarNotification) {
        String b2 = b(statusBarNotification.getNotification());
        a aVar = map.get(b2);
        if (aVar == null) {
            aVar = new a();
            map.put(b2, aVar);
        }
        (m1028a(statusBarNotification.getNotification()) ? aVar.b : aVar.f1561a).add(new b(statusBarNotification.getId(), statusBarNotification.getNotification()));
    }

    /* renamed from: a  reason: collision with other method in class */
    private boolean m1027a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: a  reason: collision with other method in class */
    private boolean m1028a(Notification notification) {
        if (notification == null) {
            return false;
        }
        Object a2 = bh.a((Object) notification, "isGroupSummary", (Object[]) null);
        if (a2 instanceof Boolean) {
            return ((Boolean) a2).booleanValue();
        }
        return false;
    }

    private boolean a(Context context) {
        if (b(context) && aw.m1032a(context)) {
            return az.a(context).a(ih.LatestNotificationNotIntoGroupSwitch.a(), false);
        }
        return false;
    }
}
