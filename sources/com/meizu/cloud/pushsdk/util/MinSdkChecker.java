package com.meizu.cloud.pushsdk.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MinSdkChecker {
    public static boolean isSupportBigTextStyleAndAction() {
        return true;
    }

    public static boolean isSupportDeviceDefaultLight() {
        return true;
    }

    public static boolean isSupportKeyguardState() {
        return true;
    }

    public static boolean isSupportNotificationBuild() {
        return true;
    }

    public static boolean isSupportNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean isSupportNotificationSort() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean isSupportSendNotification() {
        return true;
    }

    public static boolean isSupportSetDrawableSmallIcon() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    public static boolean isSupportTransmitMessageValue(Context context, String str) {
        return !TextUtils.isEmpty(MzSystemUtils.findReceiver(context, PushConstants.MZ_PUSH_SYSTEM_RECEIVER_ACTION, str));
    }

    public static boolean isSupportVideoNotification() {
        return true;
    }
}
