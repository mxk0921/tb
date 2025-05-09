package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class z3w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352322116);
    }

    public static float a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa61b672", new Object[]{new Integer(i)})).floatValue();
        }
        return i * 1.6666666f;
    }

    public static float b(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a1669e2", new Object[]{cxjVar})).floatValue();
        }
        return a(cxjVar.j().K().b());
    }

    public static float c(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c13a0d15", new Object[]{cxjVar})).floatValue();
        }
        return b(cxjVar) + d(cxjVar.i());
    }

    public static int d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df06b1f6", new Object[]{activity})).intValue();
        }
        if (activity == null) {
            return 0;
        }
        return (int) activity.getResources().getDimension(R.dimen.new_detail_vertical_non_full_bottom_divider_height);
    }
}
