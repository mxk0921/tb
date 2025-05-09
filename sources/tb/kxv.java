package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kxv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502268182);
    }

    public static void a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cead4e6", new Object[]{activity, new Integer(i)});
        } else {
            activity.getWindow().setStatusBarColor(i);
        }
    }
}
