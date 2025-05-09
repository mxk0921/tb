package com.meizu.cloud.pushsdk.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.e.b.c;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.d;
import com.meizu.cloud.pushsdk.notification.g.b;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSettingEx;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.util.Objects;
import org.json.JSONObject;
import tb.aig;
import tb.ya;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class a implements c {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f5906a;
    protected final PushNotificationBuilder b;
    private final NotificationManager c;
    private final Handler d;

    public a(Context context, PushNotificationBuilder pushNotificationBuilder) {
        this.b = pushNotificationBuilder;
        this.f5906a = context;
        this.d = new Handler(context.getMainLooper());
        this.c = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
    }

    private Notification a(MessageV3 messageV3, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
        Notification.Builder builder = new Notification.Builder(this.f5906a);
        a(builder, messageV3, pendingIntent, pendingIntent2);
        a(builder, messageV3);
        b(builder, messageV3);
        c(builder, messageV3);
        d(builder, messageV3);
        Notification build = MinSdkChecker.isSupportNotificationBuild() ? builder.build() : builder.getNotification();
        b(build, messageV3);
        a(build, messageV3);
        a(build, messageV3, pendingIntent3);
        return build;
    }

    private Icon b(String str) {
        Icon createWithResource;
        try {
            int identifier = this.f5906a.getPackageManager().getResourcesForApplication(str).getIdentifier(PushConstants.MZ_PUSH_NOTIFICATION_SMALL_ICON, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, str);
            if (identifier != 0) {
                DebugLogger.i("AbstractPushNotification", "get " + str + " smallIcon success resId " + identifier);
                createWithResource = Icon.createWithResource(str, identifier);
                return createWithResource;
            }
        } catch (Exception e) {
            DebugLogger.e("AbstractPushNotification", "cannot load smallIcon form package " + str + " Error message " + e.getMessage());
        }
        return null;
    }

    private PendingIntent d(MessageV3 messageV3) {
        return a(messageV3, c(messageV3) ? messageV3.getPackageName() : messageV3.getUploadDataPackageName());
    }

    private PendingIntent e(MessageV3 messageV3) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, messageV3);
        intent.putExtra("method", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_CLOSE);
        intent.setClassName(messageV3.getPackageName(), MzSystemUtils.findReceiver(this.f5906a, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, messageV3.getPackageName()));
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        return ya.e(this.f5906a, 0, intent, 1140850688);
    }

    private PendingIntent f(MessageV3 messageV3) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, messageV3);
        intent.putExtra("method", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_DELETE);
        intent.setClassName(messageV3.getPackageName(), MzSystemUtils.findReceiver(this.f5906a, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, messageV3.getPackageName()));
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        return ya.e(this.f5906a, 0, intent, 1140850688);
    }

    private PendingIntent g(MessageV3 messageV3) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra(PushConstants.MZ_PUSH_NOTIFICATION_STATE_MESSAGE, messageV3.getNotificationMessage());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_TASK_ID, messageV3.getTaskId());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_SEQ_ID, messageV3.getSeqId());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_DEVICE_ID, messageV3.getDeviceId());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_PUSH_TIMESTAMP, messageV3.getPushTimestamp());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_SHOW_PACKAGE_NAME, messageV3.getUploadDataPackageName());
        intent.putExtra(PushConstants.MZ_PUSH_WHITE_LIST, messageV3.getWhiteList());
        intent.putExtra(PushConstants.MZ_PUSH_DELAYED_REPORT_MILLIS, messageV3.getDelayedReportMillis());
        intent.putExtra("method", "notification_state");
        intent.setClassName(messageV3.getPackageName(), MzSystemUtils.findReceiver(this.f5906a, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, messageV3.getPackageName()));
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        return ya.e(this.f5906a, 0, intent, 1107296256);
    }

    public void c(Notification.Builder builder, MessageV3 messageV3) {
    }

    public String h(MessageV3 messageV3) {
        String str;
        try {
        } catch (Exception e) {
            DebugLogger.e("AbstractPushNotification", "parse flyme notification setting error " + e.getMessage());
        }
        if (!TextUtils.isEmpty(messageV3.getNotificationMessage())) {
            str = new JSONObject(messageV3.getNotificationMessage()).getJSONObject("data").getJSONObject("extra").getString("fns");
            DebugLogger.i("AbstractPushNotification", "current FlymeGreen notification setting is " + str);
            return str;
        }
        str = null;
        DebugLogger.i("AbstractPushNotification", "current FlymeGreen notification setting is " + str);
        return str;
    }

    private PendingIntent a(MessageV3 messageV3, String str) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        if (MinSdkChecker.isSupportTransmitMessageValue(this.f5906a, str)) {
            intent.putExtra(PushConstants.MZ_MESSAGE_VALUE, d.a(messageV3));
        } else {
            intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, messageV3);
        }
        intent.putExtra("method", "private");
        intent.putExtra("package_name", str);
        String findReceiver = MzSystemUtils.findReceiver(this.f5906a, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, str);
        Objects.requireNonNull(findReceiver);
        intent.setClassName(str, findReceiver);
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        intent.setFlags(32);
        return ya.e(this.f5906a, 0, intent, 1140850688);
    }

    private String b(Context context, String str) {
        CharSequence applicationLabel;
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            if (!(applicationInfo == null || (applicationLabel = packageManager.getApplicationLabel(applicationInfo)) == null)) {
                return (String) applicationLabel;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            DebugLogger.e("AbstractPushNotification", "can not find " + str + " application info");
        }
        return null;
    }

    private boolean c(MessageV3 messageV3) {
        if (messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) {
            return messageV3.getWhiteList() && !MzSystemUtils.isExistReceiver(this.f5906a, messageV3.getUploadDataPackageName(), PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        }
        return true;
    }

    private void d(Notification.Builder builder, MessageV3 messageV3) {
        int i;
        String str;
        String str2;
        if (MinSdkChecker.isSupportNotificationChannel()) {
            AdvanceSetting advanceSetting = messageV3.getAdvanceSetting();
            AdvanceSettingEx advanceSettingEx = messageV3.getAdvanceSettingEx();
            int priorityDisplay = advanceSettingEx != null ? advanceSettingEx.getPriorityDisplay() : 0;
            if (Build.VERSION.SDK_INT >= 29 && advanceSetting.isHeadUpNotification() && advanceSettingEx.getPriorityDisplay() < 1) {
                priorityDisplay = 1;
            }
            if (priorityDisplay != -2) {
                i = 2;
                if (priorityDisplay == -1) {
                    str2 = "mz_push_notification_channel_low";
                    str = "MEIZUPUSHLOW";
                } else if (priorityDisplay == 1) {
                    str2 = "mz_push_notification_channel_high";
                    str = "MEIZUPUSHHIGH";
                    i = 4;
                } else if (priorityDisplay != 2) {
                    str2 = "mz_push_notification_channel";
                    str = "MEIZUPUSH";
                    i = 3;
                } else {
                    str2 = "mz_push_notification_channel_max";
                    str = "MEIZUPUSHMAX";
                    i = 5;
                }
            } else {
                str2 = "mz_push_notification_channel_min";
                str = "MEIZUPUSHMIN";
                i = 1;
            }
            Uri b = advanceSettingEx.getSoundTitle() != null ? b.b(this.f5906a, advanceSettingEx.getSoundTitle()) : null;
            if (!advanceSetting.getNotifyType().isSound() && advanceSettingEx.getSoundTitle() == null) {
                str2 = str2.concat("_mute");
                str = str.concat("_MUTE");
            } else if (b != null) {
                str2 = str2 + "_" + advanceSettingEx.getSoundTitle().toLowerCase();
                str = str + "_" + advanceSettingEx.getSoundTitle().toUpperCase();
            }
            DebugLogger.e("AbstractPushNotification", "notification channel builder, channelId: " + str2 + ", channelName: " + str + ", importance:" + i + ", sound: " + b);
            NotificationChannel a2 = aig.a(str2, str, i);
            a2.enableLights(true);
            a2.setLightColor(-16711936);
            a2.setShowBadge(true);
            a2.enableVibration(true);
            if (!advanceSetting.getNotifyType().isSound() && advanceSettingEx.getSoundTitle() == null) {
                a2.setSound(null, Notification.AUDIO_ATTRIBUTES_DEFAULT);
            } else if (b != null) {
                a2.setSound(b, Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
            this.c.createNotificationChannel(a2);
            builder.setChannelId(str2);
        }
    }

    private String b(MessageV3 messageV3) {
        if (messageV3 == null || messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) {
            return null;
        }
        String uploadDataPackageName = messageV3.getUploadDataPackageName();
        String adPackage = messageV3.getAdvertisementOption().getAdPackage();
        DebugLogger.e("AbstractPushNotification", "again show old ad and replace package, uploadDataPackageName:" + uploadDataPackageName + ", adPackageName:" + adPackage);
        com.meizu.cloud.pushsdk.handler.e.b.a a2 = com.meizu.cloud.pushsdk.b.a(this.f5906a).a();
        if (a2 != null) {
            a2.a();
        }
        messageV3.setUploadDataPackageName(adPackage);
        return uploadDataPackageName;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:2:0x0000, B:4:0x000f, B:7:0x0014, B:9:0x001a, B:13:0x0043, B:15:0x0047), top: B:18:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap a(android.content.Context r7, java.lang.String r8) {
        /*
            r6 = this;
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch: Exception -> 0x003f
            android.graphics.drawable.Drawable r8 = r0.getApplicationIcon(r8)     // Catch: Exception -> 0x003f
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x003f
            r1 = 26
            r2 = 0
            if (r0 < r1) goto L_0x0043
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable     // Catch: Exception -> 0x003f
            if (r0 == 0) goto L_0x0014
            goto L_0x0043
        L_0x0014:
            boolean r0 = tb.krx.a(r8)     // Catch: Exception -> 0x003f
            if (r0 == 0) goto L_0x0041
            int r0 = r8.getIntrinsicWidth()     // Catch: Exception -> 0x003f
            int r1 = r8.getIntrinsicHeight()     // Catch: Exception -> 0x003f
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: Exception -> 0x003f
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r3)     // Catch: Exception -> 0x003f
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: Exception -> 0x003f
            r1.<init>(r0)     // Catch: Exception -> 0x003f
            int r3 = r1.getWidth()     // Catch: Exception -> 0x003f
            int r4 = r1.getHeight()     // Catch: Exception -> 0x003f
            r5 = 0
            r8.setBounds(r5, r5, r3, r4)     // Catch: Exception -> 0x003f
            r8.draw(r1)     // Catch: Exception -> 0x003f
            r8 = r2
            r2 = r0
            goto L_0x0045
        L_0x003f:
            r8 = move-exception
            goto L_0x004c
        L_0x0041:
            r8 = r2
            goto L_0x0045
        L_0x0043:
            android.graphics.drawable.BitmapDrawable r8 = (android.graphics.drawable.BitmapDrawable) r8     // Catch: Exception -> 0x003f
        L_0x0045:
            if (r2 != 0) goto L_0x0075
            android.graphics.Bitmap r2 = r8.getBitmap()     // Catch: Exception -> 0x003f
            goto L_0x0075
        L_0x004c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "get app icon error "
            r0.<init>(r1)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "AbstractPushNotification"
            com.meizu.cloud.pushinternal.DebugLogger.i(r0, r8)
            android.content.pm.ApplicationInfo r8 = r7.getApplicationInfo()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.graphics.drawable.Drawable r7 = r8.loadIcon(r7)
            android.graphics.drawable.BitmapDrawable r7 = (android.graphics.drawable.BitmapDrawable) r7
            android.graphics.Bitmap r2 = r7.getBitmap()
        L_0x0075:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.notification.a.a(android.content.Context, java.lang.String):android.graphics.Bitmap");
    }

    public Bitmap a(String str) {
        c a2 = com.meizu.cloud.pushsdk.e.a.a(str).a().a();
        if (!a2.c() || a2.b() == null) {
            DebugLogger.i("AbstractPushNotification", "ANRequest On other Thread down load largeIcon " + str + "image fail");
            return null;
        }
        StringBuilder sb = new StringBuilder("ANRequest On other Thread down load largeIcon ");
        sb.append(str);
        sb.append("image ");
        sb.append(a2.b() != null ? "success" : "fail");
        DebugLogger.i("AbstractPushNotification", sb.toString());
        return (Bitmap) a2.b();
    }

    public void b(Notification.Builder builder, MessageV3 messageV3) {
    }

    private void a(int i, String str, MessageV3 messageV3) {
        if (messageV3 != null && messageV3.getAdvertisementOption() != null && !TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) {
            DebugLogger.e("AbstractPushNotification", "save ad and recovery package, uploadDataPackageName:" + str);
            com.meizu.cloud.pushsdk.handler.e.b.a a2 = com.meizu.cloud.pushsdk.b.a(this.f5906a).a();
            if (a2 != null) {
                int priorityValidTime = messageV3.getAdvertisementOption().getPriorityValidTime();
                a2.a(messageV3);
                a2.a(i, a(messageV3, d(messageV3), f(messageV3), e(messageV3)), priorityValidTime);
            }
            messageV3.setUploadDataPackageName(str);
        }
    }

    private void b(Notification notification, MessageV3 messageV3) {
        b.a(notification, true);
        b.a(notification, g(messageV3));
        notification.extras.putString(PushConstants.EXTRA_ORIGINAL_NOTIFICATION_PACKAGE_NAME, messageV3.getUploadDataPackageName());
        notification.extras.putString(PushConstants.EXTRA_FLYME_GREEN_NOTIFICATION_SETTING, h(messageV3));
        notification.extras.putString(PushConstants.NOTIFICATION_EXTRA_TASK_ID, messageV3.getTaskId());
        notification.extras.putString(PushConstants.NOTIFICATION_EXTRA_SEQ_ID, messageV3.getSeqId());
        notification.extras.putString(PushConstants.NOTIFICATION_EXTRA_DEVICE_ID, messageV3.getDeviceId());
        notification.extras.putString(PushConstants.NOTIFICATION_EXTRA_PUSH_TIMESTAMP, messageV3.getPushTimestamp());
        if (!TextUtils.isEmpty(this.b.getAppLabel())) {
            DebugLogger.e("AbstractPushNotification", "set app label " + this.b.getAppLabel());
            notification.extras.putString(PushConstants.EXTRA_SUBSTITUTE_APP_NAME, this.b.getAppLabel());
            return;
        }
        String b = b(this.f5906a, messageV3.getUploadDataPackageName());
        DebugLogger.e("AbstractPushNotification", "current package " + messageV3.getUploadDataPackageName() + " label is " + b);
        if (!TextUtils.isEmpty(b)) {
            notification.extras.putString(PushConstants.EXTRA_SUBSTITUTE_APP_NAME, b);
        }
    }

    private void a(Notification.Builder builder, MessageV3 messageV3) {
        boolean z;
        AdvanceSetting advanceSetting = messageV3.getAdvanceSetting();
        AdvanceSettingEx advanceSettingEx = messageV3.getAdvanceSettingEx();
        if (advanceSetting != null) {
            int i = 0;
            if (advanceSettingEx == null || TextUtils.isEmpty(advanceSettingEx.getSoundTitle())) {
                z = advanceSetting.getNotifyType().isSound();
            } else {
                Uri b = b.b(this.f5906a, advanceSettingEx.getSoundTitle());
                if (b != null) {
                    DebugLogger.e("AbstractPushNotification", "advance setting builder, sound:" + b);
                    builder.setSound(b);
                    z = false;
                } else {
                    z = true;
                }
            }
            if (advanceSetting.getNotifyType() != null) {
                boolean isVibrate = advanceSetting.getNotifyType().isVibrate();
                boolean isLights = advanceSetting.getNotifyType().isLights();
                if (isVibrate || isLights || z) {
                    if (isVibrate) {
                        i = 2;
                    }
                    if (isLights) {
                        i |= 4;
                    }
                    if (z) {
                        i |= 1;
                    }
                    DebugLogger.e("AbstractPushNotification", "advance setting builder, defaults:" + i);
                    builder.setDefaults(i);
                }
            }
            StringBuilder sb = new StringBuilder("advance setting builder, ongoing:");
            sb.append(!advanceSetting.isClearNotification());
            DebugLogger.e("AbstractPushNotification", sb.toString());
            builder.setOngoing(!advanceSetting.isClearNotification());
            if (advanceSettingEx != null && MinSdkChecker.isSupportNotificationBuild()) {
                DebugLogger.e("AbstractPushNotification", "advance setting builder, priority:" + advanceSettingEx.getPriorityDisplay());
                builder.setPriority(advanceSettingEx.getPriorityDisplay());
            }
        }
    }

    private void a(Notification.Builder builder, MessageV3 messageV3, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        int statusBarIcon;
        builder.setContentTitle(messageV3.getTitle());
        builder.setContentText(messageV3.getContent());
        builder.setTicker(messageV3.getTitle());
        builder.setAutoCancel(true);
        if (MinSdkChecker.isSupportSendNotification()) {
            builder.setVisibility(1);
        }
        if (MinSdkChecker.isSupportSetDrawableSmallIcon()) {
            Icon b = b(messageV3.getUploadDataPackageName());
            if (b != null) {
                builder.setSmallIcon(b);
                builder.setContentIntent(pendingIntent);
                builder.setDeleteIntent(pendingIntent2);
            }
            DebugLogger.e("AbstractPushNotification", "cannot get " + messageV3.getUploadDataPackageName() + " smallIcon");
        } else {
            PushNotificationBuilder pushNotificationBuilder = this.b;
            if (!(pushNotificationBuilder == null || pushNotificationBuilder.getStatusBarIcon() == 0)) {
                statusBarIcon = this.b.getStatusBarIcon();
                builder.setSmallIcon(statusBarIcon);
                builder.setContentIntent(pendingIntent);
                builder.setDeleteIntent(pendingIntent2);
            }
        }
        statusBarIcon = com.meizu.cloud.pushsdk.notification.g.c.m(this.f5906a);
        builder.setSmallIcon(statusBarIcon);
        builder.setContentIntent(pendingIntent);
        builder.setDeleteIntent(pendingIntent2);
    }

    public void a(Notification notification, MessageV3 messageV3) {
    }

    public void a(Notification notification, MessageV3 messageV3, PendingIntent pendingIntent) {
    }

    @Override // com.meizu.cloud.pushsdk.notification.c
    public void a(MessageV3 messageV3) {
        String b = (messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) ? null : b(messageV3);
        Notification a2 = a(messageV3, d(messageV3), f(messageV3), e(messageV3));
        int abs = Math.abs((int) System.currentTimeMillis());
        com.meizu.cloud.pushsdk.notification.model.a b2 = com.meizu.cloud.pushsdk.notification.model.a.b(messageV3);
        if (!(b2 == null || b2.a() == 0)) {
            abs = b2.a();
            DebugLogger.e("AbstractPushNotification", "server notify id " + abs);
            if (!TextUtils.isEmpty(b2.b())) {
                int c = com.meizu.cloud.pushsdk.util.b.c(this.f5906a, messageV3.getUploadDataPackageName(), b2.b());
                DebugLogger.e("AbstractPushNotification", "notifyKey " + b2.b() + " preference notifyId is " + c);
                if (c != 0) {
                    DebugLogger.e("AbstractPushNotification", "use preference notifyId " + c + " and cancel it");
                    this.c.cancel(c);
                }
                DebugLogger.e("AbstractPushNotification", "store new notifyId " + abs + " by notifyKey " + b2.b());
                com.meizu.cloud.pushsdk.util.b.b(this.f5906a, messageV3.getUploadDataPackageName(), b2.b(), abs);
            }
        }
        DebugLogger.e("AbstractPushNotification", "current notify id " + abs);
        if (messageV3.isDiscard()) {
            if (com.meizu.cloud.pushsdk.util.b.b(this.f5906a, messageV3.getPackageName()) == 0) {
                com.meizu.cloud.pushsdk.util.b.a(this.f5906a, messageV3.getPackageName(), abs);
                DebugLogger.i("AbstractPushNotification", "no notification show so put notification id " + abs);
            }
            if (!TextUtils.isEmpty(messageV3.getTaskId())) {
                if (com.meizu.cloud.pushsdk.util.b.c(this.f5906a, messageV3.getPackageName()) == 0) {
                    com.meizu.cloud.pushsdk.util.b.b(this.f5906a, messageV3.getPackageName(), Integer.valueOf(messageV3.getTaskId()).intValue());
                } else if (Integer.valueOf(messageV3.getTaskId()).intValue() < com.meizu.cloud.pushsdk.util.b.c(this.f5906a, messageV3.getPackageName())) {
                    DebugLogger.i("AbstractPushNotification", "current package " + messageV3.getPackageName() + " task id " + messageV3.getTaskId() + " don't show notification");
                    return;
                } else {
                    com.meizu.cloud.pushsdk.util.b.b(this.f5906a, messageV3.getPackageName(), Integer.valueOf(messageV3.getTaskId()).intValue());
                    abs = com.meizu.cloud.pushsdk.util.b.b(this.f5906a, messageV3.getPackageName());
                }
            }
            DebugLogger.i("AbstractPushNotification", "current package " + messageV3.getPackageName() + " notificationId=" + abs + " taskId=" + messageV3.getTaskId());
        }
        if (messageV3.getAdvertisementOption() != null && !TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) {
            a(abs, b, messageV3);
        }
        this.c.notify(abs, a2);
    }

    public boolean a() {
        return Thread.currentThread() == this.f5906a.getMainLooper().getThread();
    }
}
