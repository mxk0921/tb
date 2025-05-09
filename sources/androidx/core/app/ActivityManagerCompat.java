package androidx.core.app;

import android.app.ActivityManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ActivityManagerCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private ActivityManagerCompat() {
    }

    public static boolean isLowRamDevice(ActivityManager activityManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7124104", new Object[]{activityManager})).booleanValue();
        }
        return activityManager.isLowRamDevice();
    }
}
