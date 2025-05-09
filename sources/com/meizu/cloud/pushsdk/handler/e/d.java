package com.meizu.cloud.pushsdk.handler.e;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.NotificationService;
import com.meizu.cloud.pushsdk.b;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d extends a<MessageV3> {
    public d(Context context, a aVar) {
        super(context, aVar);
    }

    private boolean b(Context context, MessageV3 messageV3) {
        if (!PushConstants.PUSH_PACKAGE_NAME.equalsIgnoreCase(context.getPackageName())) {
            return true;
        }
        boolean a2 = com.meizu.cloud.pushsdk.handler.e.h.a.a().a(context, messageV3.getUploadDataPackageName());
        DebugLogger.i("AbstractMessageHandler", "check message effective result: " + a2);
        if (a2) {
            return true;
        }
        com.meizu.cloud.pushsdk.util.d.e(context, context.getPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp());
        return false;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 4;
    }

    /* renamed from: d  reason: avoid collision after fix types in other method */
    public void a(MessageV3 messageV3) {
        Intent intent = new Intent(c(), NotificationService.class);
        intent.setPackage(messageV3.getPackageName());
        intent.addCategory(messageV3.getPackageName());
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra("command_type", "reflect_receiver");
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        intent.putExtra(PushConstants.EXTRA_APP_PUSH_BRIGHT_NOTIFICATION_MESSAGE, messageV3);
        intent.putExtra("method", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_BRIGHT_NOTIFICATION_MESSAGE);
        com.meizu.cloud.pushsdk.handler.e.m.a b = b.a(c()).b();
        if (b != null) {
            b.a(intent, messageV3.getUploadDataPackageName());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* renamed from: g */
    public void c(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.util.d.f(c(), messageV3.getUploadDataPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp(), messageV3.getDelayedReportMillis());
    }

    /* renamed from: h */
    public void d(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.util.d.d(c(), messageV3.getUploadDataPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp(), messageV3.getDelayedReportMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.meizu.cloud.pushsdk.notification.c e(com.meizu.cloud.pushsdk.handler.MessageV3 r6) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.handler.e.d.e(com.meizu.cloud.pushsdk.handler.MessageV3):com.meizu.cloud.pushsdk.notification.c");
    }

    /* renamed from: j */
    public int f(MessageV3 messageV3) {
        if (messageV3.getBrightRemindSetting() != null && messageV3.getBrightRemindSetting().getIsBrightRemind() && !MzSystemUtils.isInteractive(c())) {
            return 4;
        }
        if (messageV3.getAdvertisementOption() != null && !TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdInstallPackage())) {
            com.meizu.cloud.pushsdk.util.d.a(c(), messageV3.getAdvertisementOption().getAdInstallPackage(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp());
            return 5;
        } else if (messageV3.getTimeDisplaySetting() == null || !messageV3.getTimeDisplaySetting().isTimeDisplay()) {
            return 0;
        } else {
            if (System.currentTimeMillis() > Long.valueOf(messageV3.getTimeDisplaySetting().getEndShowTime()).longValue()) {
                com.meizu.cloud.pushsdk.util.d.a(c(), "schedule notification expire", 2200, messageV3.getTaskId(), messageV3.getDeviceId());
                return 1;
            }
            int i = (System.currentTimeMillis() > Long.valueOf(messageV3.getTimeDisplaySetting().getStartShowTime()).longValue() ? 1 : (System.currentTimeMillis() == Long.valueOf(messageV3.getTimeDisplaySetting().getStartShowTime()).longValue() ? 0 : -1));
            Context c = c();
            String taskId = messageV3.getTaskId();
            String deviceId = messageV3.getDeviceId();
            if (i > 0) {
                com.meizu.cloud.pushsdk.util.d.a(c, "schedule notification on time", 2201, taskId, deviceId);
                return 2;
            }
            com.meizu.cloud.pushsdk.util.d.a(c, "schedule notification delay", 2202, taskId, deviceId);
            return 3;
        }
    }

    /* renamed from: k */
    public void g(MessageV3 messageV3) {
        AlarmManager alarmManager = (AlarmManager) c().getSystemService("alarm");
        Intent intent = new Intent(c(), NotificationService.class);
        intent.setPackage(messageV3.getPackageName());
        intent.addCategory(messageV3.getPackageName());
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra("command_type", "reflect_receiver");
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        intent.putExtra(PushConstants.EXTRA_APP_PUSH_SCHEDULE_NOTIFICATION_MESSAGE, messageV3);
        intent.putExtra("method", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_SCHEDULE_NOTIFICATION);
        PendingIntent g = ya.g(c(), 0, intent, MinSdkChecker.isSupportSetDrawableSmallIcon() ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 1140850688);
        String startShowTime = messageV3.getTimeDisplaySetting().getStartShowTime();
        String format = !TextUtils.isEmpty(startShowTime) ? new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(Long.valueOf(startShowTime).longValue())) : null;
        long longValue = Long.valueOf(startShowTime).longValue() - System.currentTimeMillis();
        DebugLogger.i("AbstractMessageHandler", "after " + (longValue / 1000) + " seconds Notification AlarmManager execute At " + format);
        if (alarmManager != null) {
            DebugLogger.i("AbstractMessageHandler", "setAlarmManager setExact ELAPSED_REALTIME_WAKEUP");
            alarmManager.setExact(2, SystemClock.elapsedRealtime() + longValue, g);
        } else if (alarmManager != null) {
            DebugLogger.i("AbstractMessageHandler", "setAlarmManager set ELAPSED_REALTIME_WAKEUP");
            alarmManager.set(2, SystemClock.elapsedRealtime() + longValue, g);
        }
    }

    /* renamed from: l */
    public MessageV3 f(Intent intent) {
        String str;
        if (PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_SHOW_V3.equals(e(intent))) {
            str = PushConstants.MZ_PUSH_PRIVATE_MESSAGE;
        } else {
            str = "message";
        }
        return MessageV3.parse(c().getPackageName(), g(intent), h(intent), d(intent), j(intent), i(intent), intent.getStringExtra(str), k(intent), c(intent));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    public void a(MessageV3 messageV3, c cVar) {
        if (cVar != null) {
            cVar.a(messageV3);
            c(messageV3);
        }
    }

    /* renamed from: b */
    public boolean a(MessageV3 messageV3, String str) {
        return a(messageV3, str) && b(c(), messageV3);
    }

    /* renamed from: e  reason: avoid collision after fix types in other method */
    public boolean b(MessageV3 messageV3) {
        String uriPackageName = messageV3.getUriPackageName();
        if (!TextUtils.isEmpty(uriPackageName) && !MzSystemUtils.isPackageInstalled(c(), uriPackageName)) {
            DebugLogger.i("AbstractMessageHandler", "canSendMessage isPackageInstalled false");
            return false;
        } else if (Build.VERSION.SDK_INT < 31 || messageV3.getClickType() != 3) {
            return true;
        } else {
            DebugLogger.i("AbstractMessageHandler", "canSendMessage android 12 and clickType == 3 return false");
            com.meizu.cloud.pushsdk.util.d.f(c(), messageV3.getUploadDataPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp());
            return false;
        }
    }

    /* renamed from: f  reason: avoid collision after fix types in other method */
    private String f2(MessageV3 messageV3) {
        String selfDefineContentString = MzPushMessage.fromMessageV3(messageV3).getSelfDefineContentString();
        if (!TextUtils.isEmpty(selfDefineContentString)) {
            try {
                return new JSONObject(selfDefineContentString).getString("package_name");
            } catch (JSONException unused) {
                DebugLogger.e("AbstractMessageHandler", "no quick json message");
            }
        }
        return null;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start MessageV3Handler match");
        if (!a(0, g(intent))) {
            return false;
        }
        if (PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_SHOW_V3.equals(e(intent))) {
            return true;
        }
        if (TextUtils.isEmpty(e(intent))) {
            String stringExtra = intent.getStringExtra("message");
            if (!TextUtils.isEmpty(stringExtra) && b(stringExtra)) {
                DebugLogger.e("AbstractMessageHandler", "old cloud notification message");
                return true;
            }
        }
        return false;
    }
}
