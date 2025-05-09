package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uwo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(336593084);
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        return Math.round(f * context.getResources().getDisplayMetrics().density);
    }

    public static int b(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9c813", new Object[]{context, new Float(f)})).intValue();
        }
        return Math.round(f / context.getResources().getDisplayMetrics().density);
    }
}
