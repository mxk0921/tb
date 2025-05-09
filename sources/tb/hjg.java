package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hjg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262901);
    }

    public static void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920f32b6", new Object[]{marginLayoutParams});
        } else if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
        }
    }
}
