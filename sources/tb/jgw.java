package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jgw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(573571218);
    }

    public static boolean a(View view, float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42fb4289", new Object[]{view, new Float(f), new Float(f2), new Float(f3)})).booleanValue();
        }
        if (view != null && f >= view.getLeft() - f3 && f2 >= view.getTop() - f3 && f < view.getRight() + f3 && f2 < view.getBottom() + f3) {
            return true;
        }
        return false;
    }
}
