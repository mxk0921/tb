package tb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.service.quicksettings.TileService;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class yvo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297652);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fdad300f", new Object[]{context})).intValue();
        }
        ApplicationInfo applicationInfo = context.getApplicationContext().getApplicationInfo();
        if (applicationInfo == null) {
            return -1;
        }
        return applicationInfo.targetSdkVersion;
    }

    public static void b(TileService tileService, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76bbf39b", new Object[]{tileService, intent});
        } else if (Build.VERSION.SDK_INT < 34 || a(tileService) < 34) {
            tileService.startActivityAndCollapse(intent);
        } else {
            tileService.startActivityAndCollapse(ya.c(tileService, 0, intent, 201326592));
        }
    }
}
