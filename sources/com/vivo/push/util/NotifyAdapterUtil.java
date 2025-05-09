package com.vivo.push.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.vivo.push.b.p;
import com.vivo.push.f.u;
import com.vivo.push.m;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import com.vivo.push.restructure.a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import tb.aig;
import tb.big;
import tb.e73;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class NotifyAdapterUtil {
    private static final String EXTRA_VPUSH_TYPE = "extra_vpush_type";
    private static final int HIDE_TITLE = 1;
    public static final int NOTIFY_MULTITERM_STYLE = 1;
    public static final int NOTIFY_SINGLE_STYLE = 0;
    public static final String PRIMARY_CHANNEL = "vivo_push_channel";
    private static final String PUSH_EN = "PUSH";
    private static final String PUSH_ID = "pushId";
    private static final String PUSH_ZH = "推送通知";
    private static final String TAG = "NotifyManager";
    private static final String USER_ID = "sysUserId";
    private static NotificationManager sNotificationManager = null;
    private static int sNotifyId = 20000000;

    private static boolean cancelNotify(Context context, int i) {
        initAdapter(context);
        NotificationManager notificationManager = sNotificationManager;
        if (notificationManager == null) {
            return false;
        }
        notificationManager.cancel(i);
        return true;
    }

    private static synchronized void initAdapter(Context context) {
        NotificationManager notificationManager;
        NotificationChannel notificationChannel;
        String str;
        CharSequence name;
        synchronized (NotifyAdapterUtil.class) {
            try {
                if (sNotificationManager == null) {
                    sNotificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
                }
                if (Build.VERSION.SDK_INT >= 26 && (notificationManager = sNotificationManager) != null) {
                    notificationChannel = notificationManager.getNotificationChannel("default");
                    if (notificationChannel != null) {
                        name = notificationChannel.getName();
                        if (PUSH_ZH.equals(name) || PUSH_EN.equals(name)) {
                            sNotificationManager.deleteNotificationChannel("default");
                        }
                    }
                    if (isZh(context)) {
                        str = PUSH_ZH;
                    } else {
                        str = PUSH_EN;
                    }
                    e73.a();
                    NotificationChannel a2 = aig.a(PRIMARY_CHANNEL, str, 4);
                    a2.setLightColor(-16711936);
                    a2.enableVibration(true);
                    a2.setLockscreenVisibility(1);
                    sNotificationManager.createNotificationChannel(a2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean isPullService() {
        if (n.f14669a) {
            if (Build.VERSION.SDK_INT < 31) {
                return true;
            }
            return false;
        } else if (Build.VERSION.SDK_INT < 28) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isZh(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage().endsWith("zh");
    }

    public static void pushNotification(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j, int i, NotifyArriveCallbackByUser notifyArriveCallbackByUser, u.a aVar) {
        u.d(TAG, "pushNotification");
        initAdapter(context);
        int notifyMode = NotifyUtil.getNotifyDataAdapter(context).getNotifyMode(insideNotificationItem);
        if (!TextUtils.isEmpty(insideNotificationItem.getPurePicUrl()) && list != null && list.size() > 1 && list.get(1) != null) {
            notifyMode = 1;
        }
        if (notifyMode == 2) {
            pushNotificationBySystem(context, list, insideNotificationItem, j, i, notifyArriveCallbackByUser, aVar);
        } else if (notifyMode == 1) {
            pushNotificationByCustom(context, list, insideNotificationItem, j, notifyArriveCallbackByUser, aVar);
        }
    }

    public static boolean repealNotifyById(Context context, long j) {
        int j2 = m.a().j();
        if (j2 == 0) {
            long b = ad.b().b("com.vivo.push.notify_key", -1L);
            if (b == j) {
                u.d(TAG, "undo showed message ".concat(String.valueOf(j)));
                u.a(context, "回收已展示的通知： ".concat(String.valueOf(j)));
                return cancelNotify(context, sNotifyId);
            }
            u.d(TAG, "current showing message id " + b + " not match " + j);
            u.a(context, "与已展示的通知" + b + "与待回收的通知" + j + "不匹配");
            return false;
        } else if (j2 == 1) {
            return cancelNotify(context, (int) j);
        } else {
            u.a(TAG, "unknow cancle notify style ".concat(String.valueOf(j2)));
            return false;
        }
    }

    public static void setNotifyId(int i) {
        sNotifyId = i;
    }

    public static void cancelNotify(Context context) {
        cancelNotify(context, sNotifyId);
    }

    private static void pushNotificationByCustom(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j, NotifyArriveCallbackByUser notifyArriveCallbackByUser, u.a aVar) {
        Notification build;
        Bitmap bitmap;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        String title = insideNotificationItem.getTitle();
        int defaultNotifyIcon = NotifyUtil.getNotifyDataAdapter(context).getDefaultNotifyIcon();
        int i = context.getApplicationInfo().icon;
        Bundle bundle = new Bundle();
        bundle.putLong("pushId", j);
        if (a.a().e().l().isOpenMultiUser()) {
            bundle.putInt(USER_ID, w.a());
        }
        bundle.putInt(EXTRA_VPUSH_TYPE, 1);
        if (Build.VERSION.SDK_INT >= 26) {
            Notification.Builder a2 = big.a(context, PRIMARY_CHANNEL);
            if (defaultNotifyIcon > 0) {
                bundle.putInt("vivo.summaryIconRes", defaultNotifyIcon);
            }
            a2.setExtras(bundle);
            build = a2.build();
        } else {
            Notification.Builder builder = new Notification.Builder(context);
            builder.setExtras(bundle);
            build = builder.build();
        }
        build.priority = 2;
        build.flags = 16;
        build.tickerText = title;
        int defaultSmallIconId = NotifyUtil.getNotifyDataAdapter(context).getDefaultSmallIconId();
        if (defaultSmallIconId <= 0) {
            defaultSmallIconId = i;
        }
        build.icon = defaultSmallIconId;
        RemoteViews remoteViews = new RemoteViews(packageName, NotifyUtil.getNotifyLayoutAdapter(context).getNotificationLayout());
        remoteViews.setTextViewText(resources.getIdentifier("notify_title", "id", packageName), title);
        remoteViews.setTextColor(resources.getIdentifier("notify_title", "id", packageName), NotifyUtil.getNotifyLayoutAdapter(context).getTitleColor());
        remoteViews.setTextViewText(resources.getIdentifier("notify_msg", "id", packageName), insideNotificationItem.getContent());
        if (insideNotificationItem.isShowTime()) {
            remoteViews.setTextViewText(resources.getIdentifier("notify_when", "id", packageName), new SimpleDateFormat("HH:mm", Locale.CHINA).format(new Date()));
            remoteViews.setViewVisibility(resources.getIdentifier("notify_when", "id", packageName), 0);
        } else {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_when", "id", packageName), 8);
        }
        int suitIconId = NotifyUtil.getNotifyLayoutAdapter(context).getSuitIconId();
        remoteViews.setViewVisibility(suitIconId, 0);
        if (list == null || list.isEmpty() || (bitmap = list.get(0)) == null) {
            if (defaultNotifyIcon <= 0) {
                defaultNotifyIcon = i;
            }
            remoteViews.setImageViewResource(suitIconId, defaultNotifyIcon);
        } else {
            remoteViews.setImageViewBitmap(suitIconId, bitmap);
        }
        Bitmap bitmap2 = (list == null || list.size() <= 1) ? null : list.get(1);
        if (bitmap2 == null) {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 8);
        } else if (!TextUtils.isEmpty(insideNotificationItem.getPurePicUrl())) {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_content", "id", packageName), 8);
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 8);
            remoteViews.setViewVisibility(resources.getIdentifier("notify_pure_cover", "id", packageName), 0);
            remoteViews.setImageViewBitmap(resources.getIdentifier("notify_pure_cover", "id", packageName), bitmap2);
        } else {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 0);
            remoteViews.setImageViewBitmap(resources.getIdentifier("notify_cover", "id", packageName), bitmap2);
        }
        build.contentView = remoteViews;
        if (TextUtils.isEmpty(insideNotificationItem.getPurePicUrl())) {
            build.bigContentView = remoteViews;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int ringerMode = audioManager.getRingerMode();
        int vibrateSetting = audioManager.getVibrateSetting(0);
        u.d(TAG, "ringMode=" + ringerMode + " callVibrateSetting=" + vibrateSetting);
        int notifyType = insideNotificationItem.getNotifyType();
        if (notifyType != 2) {
            if (notifyType != 3) {
                if (notifyType == 4) {
                    if (ringerMode == 2) {
                        build.defaults = 1;
                    }
                    if (vibrateSetting == 1) {
                        build.defaults |= 2;
                        build.vibrate = new long[]{0, 100, 200, 300};
                    }
                }
            } else if (vibrateSetting == 1) {
                build.defaults = 2;
                build.vibrate = new long[]{0, 100, 200, 300};
            }
        } else if (ringerMode == 2) {
            build.defaults = 1;
        }
        i iVar = new i();
        Intent a3 = iVar.a(context, packageName, j, insideNotificationItem, notifyArriveCallbackByUser);
        if (a3 != null) {
            if (isPullService()) {
                build.contentIntent = ya.g(context, (int) SystemClock.uptimeMillis(), b.a(context, packageName, j, a3, insideNotificationItem), 201326592);
            } else {
                new p(packageName, j, insideNotificationItem).b(a3);
                build.contentIntent = iVar.a(context, a3);
            }
            if (sNotificationManager != null) {
                int j2 = m.a().j();
                try {
                    if (j2 == 0) {
                        sNotificationManager.notify(sNotifyId, build);
                        if (aVar != null) {
                            aVar.a();
                        }
                    } else if (j2 == 1) {
                        sNotificationManager.notify((int) j, build);
                        if (aVar != null) {
                            aVar.a();
                        }
                    } else {
                        u.a(TAG, "unknow notify style ".concat(String.valueOf(j2)));
                    }
                } catch (Exception e) {
                    u.a(TAG, e);
                    if (aVar != null) {
                        aVar.b();
                    }
                }
            }
        } else {
            u.a(TAG, "make notify intent error  ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void pushNotificationBySystem(android.content.Context r17, java.util.List<android.graphics.Bitmap> r18, com.vivo.push.model.InsideNotificationItem r19, long r20, int r22, com.vivo.push.model.NotifyArriveCallbackByUser r23, com.vivo.push.f.u.a r24) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.NotifyAdapterUtil.pushNotificationBySystem(android.content.Context, java.util.List, com.vivo.push.model.InsideNotificationItem, long, int, com.vivo.push.model.NotifyArriveCallbackByUser, com.vivo.push.f.u$a):void");
    }
}
