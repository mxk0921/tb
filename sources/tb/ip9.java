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

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ip9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_KEY_FLOAT_WINDOW_X = "SP_KEY_FLOAT_WINDOW_X1";
    public static final String SP_KEY_FLOAT_WINDOW_Y = "SP_KEY_FLOAT_WINDOW_Y1";
    public static final int FLOAT_WINDOW_PADDING = pr9.c(p91.a(), 10);
    public static final int FLOAT_WINDOW_BOTTOM_PADDING = pr9.c(p91.a(), 60);

    static {
        t2o.a(468714546);
    }

    public static WindowManager.LayoutParams a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("ecbb7b5d", new Object[0]);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = b();
        layoutParams.format = 1;
        layoutParams.flags = 16777256;
        layoutParams.gravity = 51;
        layoutParams.width = -2;
        layoutParams.height = -2;
        return layoutParams;
    }

    public static int b() {
        boolean canDrawOverlays;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb3903ba", new Object[0])).intValue();
        }
        Application a2 = p91.a();
        if (Build.VERSION.SDK_INT >= 23) {
            canDrawOverlays = Settings.canDrawOverlays(a2);
            if (!canDrawOverlays) {
                Toast.makeText(p91.a(), "当前无权限，请授权！", 0).show();
                Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + p91.g()));
                intent.setFlags(268435456);
                a2.startActivity(intent);
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
            ContextCompat.checkSelfPermission(p91.a(), "android.permission.SYSTEM_ALERT_WINDOW");
        } catch (NoSuchMethodError unused) {
        }
        return false;
    }
}
