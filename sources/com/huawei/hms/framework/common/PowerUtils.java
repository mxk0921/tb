package com.huawei.hms.framework.common;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.PowerManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PowerUtils {
    private static final String TAG = "PowerUtils";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class PowerMode {
        static final int POWER_MODE_DEFAULT_RETURN_VALUE = 0;
        static final int POWER_SAVER_MODE = 4;
        static final String SMART_MODE_STATUS = "SmartModeStatus";
    }

    public static boolean isAppIdleMode(Context context) {
        UsageStatsManager usageStatsManager;
        boolean isAppInactive;
        if (context != null) {
            String packageName = context.getPackageName();
            int i = Build.VERSION.SDK_INT;
            if (i >= 22) {
                Object systemService = context.getSystemService("usagestats");
                if (!(systemService instanceof UsageStatsManager)) {
                    return false;
                }
                usageStatsManager = (UsageStatsManager) systemService;
            } else {
                usageStatsManager = null;
            }
            if (usageStatsManager == null) {
                Logger.i(TAG, "isAppIdleMode statsManager is null!");
                return false;
            } else if (i < 23) {
                return false;
            } else {
                isAppInactive = usageStatsManager.isAppInactive(packageName);
                return isAppInactive;
            }
        } else {
            Logger.i(TAG, "isAppIdleMode Context is null!");
            return false;
        }
    }

    public static boolean isDozeIdleMode(Context context) {
        boolean isDeviceIdleMode;
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            if (powerManager == null) {
                Logger.i(TAG, "isDozeIdleMode powerManager is null!");
                return false;
            } else if (Build.VERSION.SDK_INT >= 23) {
                try {
                    isDeviceIdleMode = powerManager.isDeviceIdleMode();
                    return isDeviceIdleMode;
                } catch (RuntimeException e) {
                    Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
                    return false;
                }
            } else {
                Logger.i(TAG, "isDozeIdleMode is version control state!");
                return false;
            }
        } else {
            Logger.i(TAG, "isDozeIdleMode Context is null!");
            return false;
        }
    }

    public static int readDataSaverMode(Context context) {
        int restrictBackgroundStatus;
        if (context != null) {
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                int i = Build.VERSION.SDK_INT;
                if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    return 0;
                }
                if (!connectivityManager.isActiveNetworkMetered()) {
                    Logger.v(TAG, "ConnectType is not Mobile Network!");
                    return 0;
                } else if (i < 24) {
                    return 0;
                } else {
                    restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
                    return restrictBackgroundStatus;
                }
            } else {
                Logger.i(TAG, "readDataSaverMode Context is null!");
                return 0;
            }
        } else {
            Logger.i(TAG, "readDataSaverMode manager is null!");
            return 0;
        }
    }

    public static int readPowerSaverMode(Context context) {
        if (context != null) {
            int systemInt = SettingUtil.getSystemInt(context.getContentResolver(), "SmartModeStatus", 0);
            if (systemInt == 0) {
                Object systemService = ContextCompat.getSystemService(context, "power");
                PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
                if (powerManager != null) {
                    try {
                        return powerManager.isPowerSaveMode() ? 4 : 0;
                    } catch (RuntimeException e) {
                        Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
                    }
                }
            }
            return systemInt;
        }
        Logger.i(TAG, "readPowerSaverMode Context is null!");
        return 0;
    }

    public static boolean isInteractive(Context context) {
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            if (systemService instanceof PowerManager) {
                try {
                    return ((PowerManager) systemService).isInteractive();
                } catch (RuntimeException e) {
                    Logger.i(TAG, "getActiveNetworkInfo failed, exception:" + e.getClass().getSimpleName() + e.getMessage());
                }
            }
        }
        return false;
    }

    public static boolean isWhilteList(Context context) {
        boolean isIgnoringBatteryOptimizations;
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            String packageName = context.getPackageName();
            if (powerManager != null && Build.VERSION.SDK_INT >= 23) {
                try {
                    isIgnoringBatteryOptimizations = powerManager.isIgnoringBatteryOptimizations(packageName);
                    return isIgnoringBatteryOptimizations;
                } catch (RuntimeException e) {
                    Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
                }
            }
        }
        return false;
    }
}
