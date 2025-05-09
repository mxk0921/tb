package tb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class r91 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1030750339);
    }

    public static Intent a(PackageManager packageManager, String str) {
        ActivityInfo[] activityInfoArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("faab1517", new Object[]{packageManager, str});
        }
        try {
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                Intent cloneFilter = launchIntentForPackage.cloneFilter();
                cloneFilter.addFlags(272629760);
                return cloneFilter;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null || (activityInfoArr = packageInfo.activities) == null || activityInfoArr.length != 1) {
                return null;
            }
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addFlags(272629760);
            intent.setClassName(packageInfo.packageName, packageInfo.activities[0].name);
            return intent;
        } catch (Exception e) {
            irg.c("AppUtils", e.getMessage(), e);
            return null;
        }
    }

    public static boolean b(Context context, String str) {
        Exception e;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1cc7181", new Object[]{context, str})).booleanValue();
        }
        Intent a2 = a(context.getPackageManager(), str);
        if (a2 == null) {
            return false;
        }
        try {
            context.startActivity(a2);
            try {
                rrg.c(rrg.APP_LAUNCH, str);
                return true;
            } catch (Exception e2) {
                e = e2;
                irg.b("AppUtils", "'" + str + "' application failed to launch");
                rrg.b(rrg.APP_LAUNCH, str, "0", e.getMessage());
                return z;
            }
        } catch (Exception e3) {
            e = e3;
            z = false;
        }
    }
}
