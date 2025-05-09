package com.ali.user.mobile.utils;

import android.os.Build;
import android.text.TextUtils;
import com.ali.user.mobile.harmony.HarmonyLoginBackupImpl;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class HarmonyUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(68157639);
    }

    public static String getHarmonyVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("592cda11", new Object[0]);
        }
        if (!isHarmonyOs()) {
            return "-1";
        }
        return getProp("hw_sc.build.platform.version", "");
    }

    private static String getProp(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str3 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
            if (TextUtils.isEmpty(str3)) {
                return str2;
            }
            return str3;
        } catch (Throwable th) {
            th.printStackTrace();
            return str2;
        }
    }

    public static boolean isHarmonyOs() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "Harmony".equalsIgnoreCase(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]).toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isSupportInitHarmony() {
        String[] split;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f67c15c", new Object[0])).booleanValue();
        }
        try {
            AdapterForTLog.loge(HarmonyLoginBackupImpl.TAG, "isSupportInitHarmony");
            String config = LoginSwitch.getConfig("support_init_backup_harmony_brand", "huawei");
            for (String str : config.split(";")) {
                String str2 = Build.BRAND;
                String str3 = Build.MANUFACTURER;
                AdapterForTLog.loge(HarmonyLoginBackupImpl.TAG, "currentBrand:" + str2 + " manufacturer:" + str3);
                if (!str.equalsIgnoreCase(str2) && !str.equalsIgnoreCase(str3)) {
                }
                z = true;
                break;
            }
            UserTrackAdapter.sendUT(HarmonyLoginBackupImpl.TAG, "isSupportInitHarmony", String.valueOf(z), config, null);
        } catch (Exception e) {
            AdapterForTLog.loge(HarmonyLoginBackupImpl.TAG, "isSupportInitHarmony error", e);
        }
        AdapterForTLog.loge(HarmonyLoginBackupImpl.TAG, "isSupportInitHarmony " + z);
        return z;
    }
}
