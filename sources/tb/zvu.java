package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zvu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = zvu.class.getSimpleName();

    static {
        t2o.a(764411998);
    }

    public static View a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ee2e0fdf", new Object[]{view, new Integer(i)});
        }
        if (view != null) {
            return view.findViewById(i);
        }
        return null;
    }

    public static void b(View view, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d11a67", new Object[]{view, new Integer(i), new Boolean(z)});
            return;
        }
        View a2 = a(view, i);
        if (a2 == null) {
            return;
        }
        if (z) {
            a2.setVisibility(0);
        } else {
            a2.setVisibility(8);
        }
    }
}
