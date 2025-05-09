package com.taobao.message.notification.badge;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.ShortcutBadger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MsgShortcutBadger {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String TAG = "MsgShortcutBadger";
    private static int isNewHornor = -1;
    private static ComponentName sComponentName;

    static {
        t2o.a(610271234);
    }

    public static boolean applyCount(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea42e487", new Object[]{context, new Integer(i)})).booleanValue();
        }
        String str = TAG;
        TLog.loge(str, "ShortcutBadger.applyCount:" + i);
        if (isNewHornor(context)) {
            return NewHornorHomeBadger.executeBadge(context, sComponentName, i);
        }
        if (OppoHomeBadger.isOPPO()) {
            return OppoHomeBadger.executeBadge(context, sComponentName, i);
        }
        return applyCountInner(context, i);
    }

    private static boolean isNewHornor(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f88fc49", new Object[]{context})).booleanValue();
        }
        try {
            int i = isNewHornor;
            if (i == -1 || sComponentName == null) {
                return updateComponentName(context);
            }
            if (i == 1) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            TLog.loge(TAG, Log.getStackTraceString(th));
            isNewHornor = 0;
            return false;
        }
    }

    private static boolean isOnePlus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("473c9e21", new Object[0])).booleanValue();
        }
        return Build.BRAND.toLowerCase().equals(DeviceProperty.ALIAS_ONEPLUS);
    }

    private static boolean isRealMe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff9c1a2b", new Object[0])).booleanValue();
        }
        return Build.BRAND.toLowerCase().equals("realme");
    }

    private static boolean removeCountInner(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4e92da", new Object[]{context})).booleanValue();
        }
        return applyCountInner(context, 0);
    }

    public static boolean updateComponentName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f0d92a6", new Object[]{context})).booleanValue();
        }
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                String str = TAG;
                TLog.loge(str, "Unable to find launch intent for package " + context.getPackageName());
                isNewHornor = 0;
                return false;
            }
            sComponentName = launchIntentForPackage.getComponent();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
                if (NewHornorHomeBadger.getSupportLaunchers().contains(resolveInfo.activityInfo.packageName)) {
                    String str2 = TAG;
                    TLog.loge(str2, "getSupportLaunchers() contains " + context.getPackageName());
                    isNewHornor = 1;
                    return true;
                }
            }
            String str3 = TAG;
            TLog.loge(str3, "getSupportLaunchers don't contain " + context.getPackageName());
            isNewHornor = 0;
            return false;
        } catch (Throwable th) {
            TLog.loge(TAG, Log.getStackTraceString(th));
            isNewHornor = 0;
            return false;
        }
    }

    public static boolean removeCount(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac2c0e1a", new Object[]{context})).booleanValue();
        }
        TLog.loge(TAG, "removeCount:");
        if (isNewHornor(context)) {
            return NewHornorHomeBadger.executeBadge(context, sComponentName, 0);
        }
        if (OppoHomeBadger.isOPPO()) {
            return OppoHomeBadger.executeBadge(context, sComponentName, 0);
        }
        return removeCountInner(context);
    }

    private static boolean applyCountInner(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d5a13db", new Object[]{context, new Integer(i)})).booleanValue();
        }
        try {
            ShortcutBadger.applyCountOrThrow(context, i);
            return true;
        } catch (ShortcutBadgeException e) {
            TLog.loge(TAG, Log.getStackTraceString(e));
            try {
                if (isRealMe()) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        OppoHomeBadger.executeBadge(context, sComponentName, i);
                    }
                } else if (isOnePlus() && Build.VERSION.SDK_INT >= 31) {
                    OppoHomeBadger.executeBadge(context, sComponentName, i);
                }
            } catch (Exception e2) {
                String str = TAG;
                TLog.loge(str, "pushRealMeSystemVer" + e2.toString());
            }
            return false;
        }
    }
}
