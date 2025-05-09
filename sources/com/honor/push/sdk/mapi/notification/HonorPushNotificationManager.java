package com.honor.push.sdk.mapi.notification;

import android.app.Activity;
import android.app.NotificationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class HonorPushNotificationManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static HonorPushNotificationManager f5226a = new HonorPushNotificationManager();

    public static HonorPushNotificationManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HonorPushNotificationManager) ipChange.ipc$dispatch("db04288c", new Object[0]);
        }
        return f5226a;
    }

    public void enableNotification(Activity activity, ResultCallback<NotificationStatus> resultCallback) {
        Bundle bundle;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7130febf", new Object[]{this, activity, resultCallback});
        } else if (activity != null && resultCallback != null) {
            NotificationManager notificationManager = (NotificationManager) activity.getSystemService(RemoteMessageConst.NOTIFICATION);
            if (Build.VERSION.SDK_INT >= 24) {
                z = notificationManager.areNotificationsEnabled();
            }
            if (z) {
                resultCallback.onCallback(new NotificationStatus(10000, 0, a.SUCCESS.b));
                return;
            }
            try {
                Bundle bundle2 = new Bundle();
                bundle2.putString("pkg_name", activity.getPackageName());
                bundle2.putString("app_name", activity.getPackageManager().getApplicationLabel(activity.getApplicationInfo()).toString());
                bundle2.putInt("uid", activity.getApplicationInfo().uid);
                bundle = activity.getContentResolver().call(Uri.parse("content://com.hihonor.android.pushagent.provider.MessageBoxProvider/"), "request_notification_permission", "", bundle2);
            } catch (Exception e) {
                Log.e("MAPI", "queryEnableShowNotification error = " + e.getMessage());
                bundle = null;
            }
            if (bundle == null) {
                resultCallback.onCallback(new NotificationStatus(10002, 8002012, a.ERROR_VERSION_NOT_SUPPORT.b));
            } else {
                resultCallback.onCallback(new NotificationStatus(bundle));
            }
        }
    }
}
