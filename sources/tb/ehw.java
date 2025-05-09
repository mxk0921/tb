package tb;

import android.os.SystemClock;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ehw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long MIN_CLICK_INTERVAL = 800;

    static {
        t2o.a(491782862);
    }

    public static boolean a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55b1273d", new Object[]{new Long(j)})).booleanValue();
        }
        if (SystemClock.uptimeMillis() - j < 800) {
            return true;
        }
        return false;
    }

    public static void b(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88543911", new Object[]{view, new Integer(i)});
        } else if (view != null) {
            view.setVisibility(i);
        }
    }
}
