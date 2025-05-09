package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u0q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(155189388);
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a48ebe0", new Object[]{context, new Float(f)})).intValue();
        }
        if (context == null) {
            return 0;
        }
        return (int) (context.getResources().getDisplayMetrics().density * f);
    }
}
