package com.taobao.message.notification.system.base;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.message.annotation.aspectjx.MethodSpy;
import com.taobao.message.notification.banner.util.MergeCallback;
import com.taobao.message.notification.base.VibratorAndMediaManager;
import com.taobao.message.notification.system.base.BasicLocalPush;
import com.taobao.message.notification.system.base.ILocalPush;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Random;
import tb.ad2;
import tb.aig;
import tb.s0m;
import tb.s8d;
import tb.t2o;
import tb.u8k;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class BasicLocalPush implements ILocalPush {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NOTIFICATION_CHANNEL_DESC = "消息默认通知";
    public static final String NOTIFICATION_CHANNEL_ID = "taobao_agoo_channel_id";
    public static final String NOTIFICATION_CHANNEL_NAME = "消息";
    public static final String NOTIFICATION_CHANNEL_OTHER_NAME = "其他通知";
    private static final String ORANGE_CONFIG_BUSINESS = "mpm_business_switch";
    public static final int RANDOM_MAX = 1000000;
    public static final String TAG = "BasicLocalPush";
    public static long[] VIBRATE = {0, 140, 80, 140};
    public static Random notificationRandom = new Random();
    private String mErrorMsg = "";
    private Notification mNotification;
    private int mUniqueId;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class BroadcastIntent extends Intent {
        static {
            t2o.a(610271311);
        }

        private BroadcastIntent() {
        }
    }

    static {
        t2o.a(610271305);
        t2o.a(610271312);
    }

    private MergeCallback.MergeCallbackTask assembleCustomView(final NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MergeCallback.MergeCallbackTask) ipChange.ipc$dispatch("67f9a30b", new Object[]{this, builder});
        }
        return new MergeCallback.MergeCallbackTask() { // from class: com.taobao.message.notification.system.base.BasicLocalPush.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.notification.banner.util.MergeCallback.MergeCallbackTask
            public void run(final MergeCallback mergeCallback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a53dc4a5", new Object[]{this, mergeCallback});
                    return;
                }
                ILocalPush.RemoteViewsHolder customView = BasicLocalPush.this.getCustomView();
                if (customView != null) {
                    customView.fetch(new ILocalPush.RemoteViewListener() { // from class: com.taobao.message.notification.system.base.BasicLocalPush.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.message.notification.system.base.ILocalPush.RemoteViewListener
                        public void on(RemoteViews remoteViews) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("ccf0d8f8", new Object[]{this, remoteViews});
                                return;
                            }
                            builder.setCustomContentView(remoteViews);
                            builder.setCustomBigContentView(remoteViews);
                            mergeCallback.complete();
                        }
                    });
                } else {
                    mergeCallback.complete();
                }
            }
        };
    }

    private MergeCallback.MergeCallbackTask assembleSmallAndLargeIcon(final NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MergeCallback.MergeCallbackTask) ipChange.ipc$dispatch("bc75bd95", new Object[]{this, builder});
        }
        return new MergeCallback.MergeCallbackTask() { // from class: tb.q42
            @Override // com.taobao.message.notification.banner.util.MergeCallback.MergeCallbackTask
            public final void run(MergeCallback mergeCallback) {
                BasicLocalPush.this.lambda$assembleSmallAndLargeIcon$2(builder, mergeCallback);
            }
        };
    }

    private MergeCallback.MergeCallbackTask assembleSound(final NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MergeCallback.MergeCallbackTask) ipChange.ipc$dispatch("54bef580", new Object[]{this, builder});
        }
        return new MergeCallback.MergeCallbackTask() { // from class: tb.o42
            @Override // com.taobao.message.notification.banner.util.MergeCallback.MergeCallbackTask
            public final void run(MergeCallback mergeCallback) {
                BasicLocalPush.this.lambda$assembleSound$5(builder, mergeCallback);
            }
        };
    }

    private MergeCallback.MergeCallbackTask assembleVibrate(final NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MergeCallback.MergeCallbackTask) ipChange.ipc$dispatch("1d893e60", new Object[]{this, builder});
        }
        return new MergeCallback.MergeCallbackTask() { // from class: tb.n42
            @Override // com.taobao.message.notification.banner.util.MergeCallback.MergeCallbackTask
            public final void run(MergeCallback mergeCallback) {
                BasicLocalPush.lambda$assembleVibrate$4(NotificationCompat.Builder.this, mergeCallback);
            }
        };
    }

    public static Intent getBroadcastIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("c8ac6bc5", new Object[0]);
        }
        return new BroadcastIntent();
    }

    private static NotificationManager getNotifyManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationManager) ipChange.ipc$dispatch("be3c7512", new Object[0]);
        }
        return (NotificationManager) EnvUtil.getApplication().getSystemService(RemoteMessageConst.NOTIFICATION);
    }

    private static boolean isVibrate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5aca46f0", new Object[0])).booleanValue();
        }
        AudioManager audioManager = (AudioManager) EnvUtil.getApplication().getSystemService("audio");
        if (audioManager != null && audioManager.getRingerMode() == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$assembleAutoCancel$3(NotificationCompat.Builder builder, MergeCallback mergeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42103096", new Object[]{builder, mergeCallback});
            return;
        }
        builder.setAutoCancel(true);
        mergeCallback.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$assembleContentIntent$7(NotificationCompat.Builder builder, MergeCallback mergeCallback) {
        PendingIntent pendingIntent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35e6f24", new Object[]{this, builder, mergeCallback});
            return;
        }
        int requestId = getRequestId();
        Intent genClickIntent = genClickIntent();
        if (genClickIntent instanceof BroadcastIntent) {
            pendingIntent = ya.e(EnvUtil.getApplication(), requestId, genClickIntent, 134217728);
        } else if (genClickIntent != null) {
            pendingIntent = ya.c(EnvUtil.getApplication(), requestId, genClickIntent, 134217728);
        } else {
            pendingIntent = null;
        }
        builder.setContentIntent(pendingIntent);
        Intent genDeleteIntent = genDeleteIntent();
        if (genDeleteIntent != null) {
            builder.setDeleteIntent(ya.e(EnvUtil.getApplication(), requestId + 1, genDeleteIntent, 134217728));
        }
        mergeCallback.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$assembleSound$5(NotificationCompat.Builder builder, MergeCallback mergeCallback) {
        Uri notificationSound;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c75b230c", new Object[]{this, builder, mergeCallback});
            return;
        }
        if (EnvUtil.isAppBackGround(TAG) && (notificationSound = getNotificationSound()) != null) {
            builder.setSound(notificationSound);
        }
        mergeCallback.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$assembleTickerAndContent$6(NotificationCompat.Builder builder, MergeCallback mergeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed23210", new Object[]{this, builder, mergeCallback});
            return;
        }
        ILocalPush.Content pushContent = getPushContent();
        if (pushContent != null) {
            pushContent.setData(builder);
        }
        mergeCallback.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$assembleVibrate$4(NotificationCompat.Builder builder, MergeCallback mergeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df9254d", new Object[]{builder, mergeCallback});
            return;
        }
        if (!isVibrate() || !EnvUtil.isAppBackGround(TAG)) {
            builder.setVibrate(VibratorAndMediaManager.SILENT_MSG_VIBRATE_TIME);
        } else {
            builder.setVibrate(VibratorAndMediaManager.CURRENT_MSG_VIBRATE_TIME);
        }
        mergeCallback.complete();
    }

    private void log(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1175515f", new Object[]{this, str, str2});
            return;
        }
        try {
            TLog.loge(TAG, getClass().getSimpleName() + str + str2);
        } catch (Throwable th) {
            TLog.loge(TAG, Log.getStackTraceString(th));
        }
    }

    public static void preCreateChannel(NotificationChannel notificationChannel, AudioAttributes audioAttributes, Context context) {
        CharSequence name;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8cc6b5", new Object[]{notificationChannel, audioAttributes, context});
        } else if (Build.VERSION.SDK_INT < 26 || context == null) {
            TLog.loge(TAG, "ctx is null");
        } else {
            notificationChannel.enableLights(true);
            notificationChannel.enableVibration(true);
            notificationChannel.setShowBadge(true);
            notificationChannel.setLockscreenVisibility(0);
            notificationChannel.setVibrationPattern(VIBRATE);
            notificationChannel.setBypassDnd(true);
            getNotifyManager().createNotificationChannel(notificationChannel);
            StringBuilder sb = new StringBuilder();
            name = notificationChannel.getName();
            sb.append((Object) name);
            sb.append("init finished");
            TLog.loge(TAG, sb.toString());
        }
    }

    public MergeCallback.MergeCallbackTask assembleAutoCancel(final NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MergeCallback.MergeCallbackTask) ipChange.ipc$dispatch("4bb6cb1e", new Object[]{this, builder});
        }
        return new MergeCallback.MergeCallbackTask() { // from class: tb.p42
            @Override // com.taobao.message.notification.banner.util.MergeCallback.MergeCallbackTask
            public final void run(MergeCallback mergeCallback) {
                BasicLocalPush.lambda$assembleAutoCancel$3(NotificationCompat.Builder.this, mergeCallback);
            }
        };
    }

    public final MergeCallback.MergeCallbackTask assembleContentIntent(final NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MergeCallback.MergeCallbackTask) ipChange.ipc$dispatch("4f841866", new Object[]{this, builder});
        }
        return new MergeCallback.MergeCallbackTask() { // from class: tb.s42
            @Override // com.taobao.message.notification.banner.util.MergeCallback.MergeCallbackTask
            public final void run(MergeCallback mergeCallback) {
                BasicLocalPush.this.lambda$assembleContentIntent$7(builder, mergeCallback);
            }
        };
    }

    public final MergeCallback.MergeCallbackTask assembleTickerAndContent(final NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MergeCallback.MergeCallbackTask) ipChange.ipc$dispatch("fbf3ea1", new Object[]{this, builder});
        }
        return new MergeCallback.MergeCallbackTask() { // from class: tb.r42
            @Override // com.taobao.message.notification.banner.util.MergeCallback.MergeCallbackTask
            public final void run(MergeCallback mergeCallback) {
                BasicLocalPush.this.lambda$assembleTickerAndContent$6(builder, mergeCallback);
            }
        };
    }

    public abstract Intent genClickIntent();

    public Intent genDeleteIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("4f8922b5", new Object[]{this});
        }
        return null;
    }

    public int genPushRequestId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aaa3991a", new Object[]{this})).intValue();
        }
        return notificationRandom.nextInt(1000000) + 999900;
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public String getCategory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6c70505", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public ILocalPush.RemoteViewsHolder getCustomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILocalPush.RemoteViewsHolder) ipChange.ipc$dispatch("f880f0ff", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public int getImportance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cac5d1e4", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public Bitmap getLargeIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6c36bd03", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public Pair<String, ad2> getLargeIconURL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("790c3d42", new Object[]{this});
        }
        return null;
    }

    public Notification getNotification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notification) ipChange.ipc$dispatch("f8086fe4", new Object[]{this});
        }
        return this.mNotification;
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public NotificationChannel getNotificationChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return u8k.a(ipChange.ipc$dispatch("b23daa70", new Object[]{this}));
        }
        NotificationChannel a2 = aig.a("taobao_agoo_channel_id", "消息", 3);
        a2.setDescription(NOTIFICATION_CHANNEL_DESC);
        Uri notificationSound = getNotificationSound();
        if (notificationSound != null) {
            a2.setSound(notificationSound, new AudioAttributes.Builder().setUsage(5).build());
        }
        AudioAttributes build = new AudioAttributes.Builder().setUsage(5).build();
        if (getImportance() >= 0) {
            a2.setImportance(getImportance());
        }
        preCreateChannel(a2, build, EnvUtil.getApplication());
        return a2;
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public ILocalPush.Content getPushContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILocalPush.Content) ipChange.ipc$dispatch("efefee7d", new Object[]{this});
        }
        return new ILocalPush.Content(ILocalPush.Content.DIS_PLAY_TITLE, ILocalPush.Content.DIS_PLAY_TITLE);
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public final int getRequestId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fef4bfce", new Object[]{this})).intValue();
        }
        return this.mUniqueId;
    }

    public boolean isCloseLocalPush() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ac716e2", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals("true", OrangeConfig.getInstance().getConfig("mpm_business_switch", "isCloseLocalPush", "true"));
    }

    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean isForegroundSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b556c8d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean onBeforeNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("453f0c32", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void onReject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a01c4a6f", new Object[]{this, str});
            return;
        }
        this.mErrorMsg += str;
        String str2 = this.mErrorMsg + ";";
        this.mErrorMsg = str2;
        log("onReject", str2);
    }

    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
        }
    }

    @MethodSpy(name = "showNotification")
    public void showSystemNotification(NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4565fd1", new Object[]{this, builder});
            return;
        }
        NotificationManager notifyManager = getNotifyManager();
        this.mNotification = builder.build();
        try {
            notifyManager.notify(getRequestId(), this.mNotification);
            onShow();
        } catch (SecurityException e) {
            log(Log.getStackTraceString(e));
        }
        log("showSystemNotification");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$assembleSmallAndLargeIcon$2(final NotificationCompat.Builder builder, final MergeCallback mergeCallback) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0bdf3a", new Object[]{this, builder, mergeCallback});
            return;
        }
        builder.setSmallIcon(getSmallIcon());
        Pair<String, ad2> largeIconURL = getLargeIconURL();
        if (largeIconURL == null || TextUtils.isEmpty((CharSequence) largeIconURL.first)) {
            Bitmap largeIcon = getLargeIcon();
            if (largeIcon != null) {
                builder.setLargeIcon(largeIcon);
            }
            TLog.loge(TAG, "pair empty, " + largeIconURL);
            mergeCallback.complete();
            return;
        }
        PhenixCreator failListener = s0m.B().T((String) largeIconURL.first).succListener(new s8d<SuccPhenixEvent>() { // from class: com.taobao.message.notification.system.base.BasicLocalPush.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                Bitmap bitmap;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                if (!(succPhenixEvent.getDrawable() == null || succPhenixEvent.isIntermediate() || (bitmap = succPhenixEvent.getDrawable().getBitmap()) == null)) {
                    builder.setLargeIcon(bitmap);
                }
                mergeCallback.complete();
                return true;
            }
        }).failListener(new s8d<FailPhenixEvent>() { // from class: com.taobao.message.notification.system.base.BasicLocalPush.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                TLog.loge(BasicLocalPush.TAG, "头像加载失败:" + failPhenixEvent.getResultCode());
                mergeCallback.complete();
                return false;
            }
        });
        if (!(failListener == null || (obj = largeIconURL.second) == null)) {
            failListener.bitmapProcessors((ad2) obj);
        }
        failListener.fetch();
    }

    private void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else {
            log("", str);
        }
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public void performNotify() {
        final NotificationCompat.Builder builder;
        String id;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98d0d91", new Object[]{this});
            return;
        }
        log("performNotify start");
        if (!isEnabled()) {
            onReject("isEnabled is false");
            return;
        }
        this.mUniqueId = genPushRequestId();
        if (!isForegroundSupport() && !EnvUtil.isAppBackGround(TAG)) {
            onReject("isForegroundSupport is false");
        } else if (!onBeforeNotify()) {
            onReject("init failed");
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = getNotificationChannel();
                if (notificationChannel == null) {
                    onReject("channel is null");
                    return;
                }
                Application application = EnvUtil.getApplication();
                id = notificationChannel.getId();
                builder = new NotificationCompat.Builder(application, id);
            } else {
                builder = new NotificationCompat.Builder(EnvUtil.getApplication());
            }
            try {
                if (!EnvUtil.isAppBackGround(TAG)) {
                    builder.setPriority(0);
                    TLog.loge(TAG, "use default priority");
                }
            } catch (Throwable th) {
                TLog.loge(TAG, Log.getStackTraceString(th));
            }
            builder.setVisibility(1);
            builder.setFullScreenIntent(null, true);
            String category = getCategory();
            if (!TextUtils.isEmpty(category)) {
                builder.setCategory(category);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(assembleSmallAndLargeIcon(builder));
            arrayList.add(assembleSound(builder));
            arrayList.add(assembleAutoCancel(builder));
            arrayList.add(assembleTickerAndContent(builder));
            arrayList.add(assembleVibrate(builder));
            arrayList.add(assembleContentIntent(builder));
            arrayList.add(assembleCustomView(builder));
            new MergeCallback(arrayList, new MergeCallback.AllCompleteCallback() { // from class: com.taobao.message.notification.system.base.BasicLocalPush.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.notification.banner.util.MergeCallback.AllCompleteCallback
                public void onAllComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("912b25a2", new Object[]{this});
                    } else {
                        BasicLocalPush.this.showSystemNotification(builder);
                    }
                }
            }).run();
        }
    }
}
