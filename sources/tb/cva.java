package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cva {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float FLING_FIX_CONTAINER_FULL_PERCENT = 1.0f;

    static {
        t2o.a(912262793);
    }

    public static float a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49d9fc33", new Object[]{new Float(f), new Float(f2), new Float(f3)})).floatValue();
        }
        return (((f / f2) - 1.0f) * f3) + 1.0f;
    }

    public static float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4eab6ae", new Object[0])).floatValue();
        }
        return 1.5384616f;
    }

    public static float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f61c03d9", new Object[0])).floatValue();
        }
        if (nj7.e() || nj7.g()) {
            return 2.0f;
        }
        return 1.0f;
    }
}
