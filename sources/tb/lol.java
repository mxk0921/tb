package tb;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.welcome.Welcome;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(736100478);
    }

    public static boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1e12dd5", new Object[]{activity})).booleanValue();
        }
        if (TBMainHost.fromActivity(activity) == null) {
            return false;
        }
        Fragment currentFragment = TBMainHost.b().getCurrentFragment();
        if (currentFragment == null || TextUtils.equals(currentFragment.getClass().getName(), "com.taobao.tao.homepage.HomepageFragment")) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e44ec488", new Object[0])).booleanValue();
        }
        boolean z = c21.g().getBoolean("isInBackground", false);
        tm1.a(oh2.TAG, "on activity stop. background stat: " + z);
        return z;
    }

    public static boolean c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("815ddd95", new Object[]{activity})).booleanValue();
        }
        if (TBMainHost.fromActivity(activity) != null || !TextUtils.equals(activity.getLocalClassName(), Welcome.class.getName())) {
            return false;
        }
        return true;
    }
}
