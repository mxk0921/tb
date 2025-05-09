package tb;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jp9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321833);
    }

    public static WindowManager.LayoutParams a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("31e81c7d", new Object[]{new Integer(i), new Integer(i2)});
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = b();
        layoutParams.format = 1;
        layoutParams.flags = 16777256;
        layoutParams.gravity = 51;
        layoutParams.width = i;
        layoutParams.height = i2;
        Application application = Global.getApplication();
        int f = oj7.f(application);
        int a2 = ec7.a(application, 10.0f);
        int a3 = ec7.a(application, 60.0f);
        int min = Math.min(ec7.b(application), ec7.c(application));
        int max = Math.max(ec7.b(application), ec7.c(application));
        layoutParams.x = (min - i) - a2;
        layoutParams.y = ((max - f) - i2) - a3;
        return layoutParams;
    }

    public static int b() {
        boolean canDrawOverlays;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb3903ba", new Object[0])).intValue();
        }
        Application application = Global.getApplication();
        if (Build.VERSION.SDK_INT >= 23) {
            canDrawOverlays = Settings.canDrawOverlays(application);
            if (!canDrawOverlays) {
                Toast.makeText(Global.getApplication(), "当前无权限，请授权！", 0).show();
                Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + Global.getPackageName()));
                intent.setFlags(268435456);
                application.startActivity(intent);
            }
        }
        if (c()) {
            return 2038;
        }
        return d() ? 2003 : 2005;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b68c6bb2", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77142181", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        try {
            ContextCompat.checkSelfPermission(Global.getApplication(), "android.permission.SYSTEM_ALERT_WINDOW");
        } catch (NoSuchMethodError unused) {
        }
        return false;
    }
}
