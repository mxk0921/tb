package tb;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tq4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262759);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fecba3", new Object[]{context})).booleanValue();
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        ((Activity) context).finish();
        return true;
    }

    public static Context b(Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("adc32049", new Object[]{dialog});
        }
        if (dialog == null) {
            return null;
        }
        Context context = dialog.getContext();
        if (context instanceof zdw) {
            return ((zdw) context).getBaseContext();
        }
        return context;
    }

    public static Context c(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("487f0f00", new Object[]{fragment});
        }
        if (fragment == null) {
            return null;
        }
        Context context = fragment.getContext();
        if (context instanceof zdw) {
            return ((zdw) context).getBaseContext();
        }
        return context;
    }

    public static Context d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("85c22e4f", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        Context context = view.getContext();
        if (context instanceof zdw) {
            return ((zdw) context).getBaseContext();
        }
        return context;
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf13c565", new Object[]{context})).booleanValue();
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return true;
            }
        }
        return false;
    }
}
