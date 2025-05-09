package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ia1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705595);
    }

    public static synchronized Application a() {
        synchronized (ia1.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
            }
            return Globals.getApplication();
        }
    }

    public static void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76728ae", new Object[]{activity});
            return;
        }
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addFlags(268435456);
            intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
            activity.startActivity(intent);
        } catch (Exception e) {
            odg.c("LCPermissionManager", "open setting page error: " + e.getMessage());
        }
    }
}
