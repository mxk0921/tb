package tb;

import android.app.Activity;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class s13 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481296842);
    }

    public static int a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0b11f02", new Object[]{activity})).intValue();
        }
        WindowManager windowManager = (WindowManager) activity.getSystemService(pg1.ATOM_EXT_window);
        if (windowManager == null) {
            return 90;
        }
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation != 1) {
            if (rotation == 2) {
                return 180;
            }
            if (rotation == 3) {
                return 270;
            }
        }
        return 90;
    }
}
