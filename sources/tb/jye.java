package tb;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.speed.TBSpeed;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jye extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String e = "next_launch";
    private static final String f = "InitComponents";
    private static final String g = "key_huawei_content_provider_load_on_demand";
    private static final String h = "key_huawei_content_provider_restore";

    public jye(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(jye jyeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitComponents");
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
        } else {
            t(application, application.getPackageName());
        }
    }

    private boolean r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd4f932c", new Object[]{this, context})).booleanValue();
        }
        String str = Build.BRAND;
        if ("OPPO".equalsIgnoreCase(str) || "VIVO".equalsIgnoreCase(str) || "REDMI".equalsIgnoreCase(str) || "IQOO".equalsIgnoreCase(str) || "samsung".equalsIgnoreCase(str) || "REALME".equalsIgnoreCase(str) || "XIAOMI".equalsIgnoreCase(str)) {
            return TBSpeed.isSpeedEdition(context, g);
        }
        return false;
    }

    private void s(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43ec109d", new Object[]{this, context, str, str2});
            return;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(str, str2);
            if (packageManager.getComponentEnabledSetting(componentName) == 2) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
                TLog.loge("next_launch", f, "component " + componentName + " recovered");
            }
        } catch (Exception e2) {
            TLog.loge("next_launch", f, "try to change component state failed, component:" + str2, e2);
        }
    }

    private void q(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab4f1b0", new Object[]{this, context, str});
        } else if (r(context)) {
            String[] strArr = {"com.huawei.agconnect.core.provider.AGConnectInitializeProvider", "com.huawei.hms.aaid.InitProvider"};
            try {
                PackageManager packageManager = context.getPackageManager();
                for (int i = 0; i < 2; i++) {
                    ComponentName componentName = new ComponentName(str, strArr[i]);
                    int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
                    if (componentEnabledSetting == 0 || componentEnabledSetting == 1) {
                        packageManager.setComponentEnabledSetting(componentName, 2, 1);
                        TLog.loge("next_launch", f, "component " + componentName + " disabled");
                    } else if (componentEnabledSetting == 2 && TBSpeed.isSpeedEdition(context, h)) {
                        packageManager.setComponentEnabledSetting(componentName, 0, 1);
                        TLog.loge("next_launch", f, "component " + componentName + " enabled");
                    }
                }
            } catch (Exception e2) {
                TLog.loge("next_launch", f, "try to disable content provider component state failed", e2);
            }
        }
    }

    private void t(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea10ff0", new Object[]{this, context, str});
            return;
        }
        String[] strArr = {"com.taobao.android.shop.activity.ShopUrlRouterActivity", "com.taobao.browser.BrowserActivity", "com.taobao.android.auth.AuthEntranceActivity"};
        for (int i = 0; i < 3; i++) {
            s(context, str, strArr[i]);
        }
        try {
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(str, 2).receivers;
            if (activityInfoArr != null) {
                for (ActivityInfo activityInfo : activityInfoArr) {
                    s(context, str, activityInfo.name);
                }
            }
        } catch (Throwable th) {
            TLog.loge("next_launch", f, "recover receivers info failed:", th);
        }
        q(context, str);
    }
}
