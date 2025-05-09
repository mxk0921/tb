package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(416284709);
    }

    public static float a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("971d5557", new Object[]{context})).floatValue();
        }
        return context.getResources().getDisplayMetrics().widthPixels / 750.0f;
    }
}
