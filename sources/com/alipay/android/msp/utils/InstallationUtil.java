package com.alipay.android.msp.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.msp.framework.taskscheduler.ConditionVariableUtil;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class InstallationUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ boolean access$000(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1253e7bf", new Object[]{context, str})).booleanValue();
        }
        return isAppInstalledAndEnabled(context, str);
    }

    private static void checkInstalled(Context context, List<String> list) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec8f2a00", new Object[]{context, list});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (isAppInstalledAndEnabled(context, "cn.gov.pbc.dcep")) {
            list.add("DCEP");
        }
        String valueOf = String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
        if (list.contains("DCEP")) {
            str = "1";
        } else {
            str = "0";
        }
        EventLogUtil.logPayEvent("103634", "packageName", "cn.gov.pbc.dcep", "costTime", valueOf, "enable", str);
    }

    private static void checkInstalledWithTimeCheck(final Context context, final List<String> list) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92186b0f", new Object[]{context, list});
            return;
        }
        long j = 5;
        try {
            String walletConfig = PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_gray_check_dcep_install_timeout_10570");
            if (!TextUtils.isEmpty(walletConfig)) {
                j = Long.parseLong(walletConfig);
            }
        } catch (Throwable unused) {
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean run = ConditionVariableUtil.run(j, new Runnable() { // from class: com.alipay.android.msp.utils.InstallationUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (InstallationUtil.access$000(context, "cn.gov.pbc.dcep")) {
                    list.add("DCEP");
                }
            }
        });
        String valueOf = String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
        if (!run) {
            str = "-1";
        } else if (list.contains("DCEP")) {
            str = "1";
        } else {
            str = "0";
        }
        EventLogUtil.logPayEvent("103634", "packageName", "cn.gov.pbc.dcep", "costTime", valueOf, "enable", str);
    }

    public static List<String> getInstalledThirdPayTypes(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1f84d9da", new Object[]{context});
        }
        return new ArrayList();
    }

    private static boolean isAppInstalledAndEnabled(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65a102a2", new Object[]{context, str})).booleanValue();
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.getApplicationInfo(str, 0) != null) {
                if (packageManager.getApplicationEnabledSetting(str) != 2) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
