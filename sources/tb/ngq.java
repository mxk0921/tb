package tb;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ngq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(919601434);
    }

    public static float a(Context context) {
        float f;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2635eefa", new Object[]{context})).floatValue();
        }
        float b = r6o.Companion.b(context);
        if (Build.VERSION.SDK_INT >= 24) {
            i = DisplayMetrics.DENSITY_DEVICE_STABLE;
            f = i / 160.0f;
        } else {
            f = 0.0f;
        }
        if (f > 0.0f) {
            return Math.min(f, b);
        }
        return b;
    }
}
