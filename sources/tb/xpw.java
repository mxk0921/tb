package tb;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class xpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856445);
    }

    public static Context a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("ca7802fe", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        if (context instanceof MutableContextWrapper) {
            return ((MutableContextWrapper) context).getBaseContext();
        }
        return context;
    }
}
