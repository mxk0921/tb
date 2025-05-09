package tb;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dhw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837630);
    }

    public static <T> T a(Activity activity, int i, Class<? extends T> cls) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("c70dbdaf", new Object[]{activity, new Integer(i), cls});
        }
        if (activity == null || (findViewById = activity.findViewById(i)) == null || cls == null || !cls.isAssignableFrom(findViewById.getClass())) {
            return null;
        }
        return (T) cls.cast(findViewById);
    }
}
