package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class l9o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982516264);
    }

    public static float a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff3f5797", new Object[]{context, new Float(f)})).floatValue();
        }
        return (f / context.getResources().getDisplayMetrics().density) + 0.5f;
    }
}
