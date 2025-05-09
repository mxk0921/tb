package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vrg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dae34773", new Object[]{context})).booleanValue();
        }
        return LauncherRuntime.n;
    }

    public static boolean a(Context context, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeda4cec", new Object[]{context, componentName})).booleanValue();
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.getComponentEnabledSetting(componentName) == 2) {
                TLog.loge(erj.MODULE, "LinkOptAbility", componentName + " is disabled, try re-enable it");
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
            }
            return packageManager.getComponentEnabledSetting(componentName) != 2;
        } catch (Exception e) {
            TLog.loge(erj.MODULE, "LinkOptAbility", "try to change component state failed, component:" + componentName, e);
            return false;
        }
    }
}
