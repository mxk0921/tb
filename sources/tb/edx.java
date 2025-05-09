package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class edx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(437256353);
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12c31c8f", new Object[]{str, str2, str3});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter(str2, str3);
        buildUpon.build();
        return buildUpon.toString();
    }

    public static int b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88b66f1e", new Object[]{new Float(f)})).intValue();
        }
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f579da9", new Object[]{context, str});
            return;
        }
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            ComponentName componentName = new ComponentName(context.getPackageName(), str);
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            hgh.d("setWidgetDisable enabledSetting" + componentEnabledSetting);
            if (componentEnabledSetting == 1 || componentEnabledSetting == 0) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
                hgh.d("setWidgetDisable receiverName" + str);
            }
        } catch (Throwable th) {
            hgh.d("setWidgetDisable error" + th.getMessage());
        }
    }
}
