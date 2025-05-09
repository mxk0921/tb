package tb;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.utils.DeviceUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class duy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(689963157);
    }

    public static void a(Activity activity, Window window) {
        WindowInsets rootWindowInsets;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1efe74e", new Object[]{activity, window});
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (DeviceUtil.Companion.h(activity)) {
            attributes.x = r6o.Companion.h(activity) / 4;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            z = nwv.Q(activity, rootWindowInsets);
        }
        if (z) {
            window.getDecorView().setSystemUiVisibility(1280);
            if (i >= 28) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
            }
        }
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 80;
        attributes.flags = 1280 | attributes.flags;
        window.setAttributes(attributes);
    }
}
