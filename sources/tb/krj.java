package tb;

import android.view.View;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class krj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(lrj lrjVar, jrj jrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d958ea22", new Object[]{lrjVar, jrjVar})).booleanValue();
        }
        if ((lrjVar instanceof View) && (jrjVar instanceof View)) {
            View view = (View) jrjVar;
            if (view.getVisibility() == 0) {
                View view2 = (View) lrjVar;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == view2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
