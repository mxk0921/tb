package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wq4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782854);
    }

    public static Context a(Context context) {
        Context context2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("240efdad", new Object[]{context});
        }
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof bew) {
            context2 = ((bew) context).b();
        } else if (context instanceof cew) {
            context2 = ((cew) context).a();
        } else {
            fve.e("ContextUtils", "getRealActivityContext in else, activityContext is null");
            context2 = null;
        }
        if (context2 instanceof Activity) {
            return context2;
        }
        return null;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5377a22", new Object[0])).booleanValue();
        }
        int i = LauncherRuntime.k;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }
}
