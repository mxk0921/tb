package tb;

import android.content.Context;
import android.content.ContextWrapper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class w0j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(155189385);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32549b7c", new Object[]{context})).booleanValue();
        }
        if (context instanceof kvc) {
            return true;
        }
        if (!(context instanceof ContextWrapper) || !(((ContextWrapper) context).getBaseContext() instanceof kvc)) {
            return false;
        }
        return true;
    }
}
