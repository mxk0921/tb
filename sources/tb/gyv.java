package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gyv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(689963209);
    }

    public static float a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b744e8ae", new Object[]{new Float(f), new Float(f2), new Float(f3)})).floatValue();
        }
        if (f < f2) {
            return f2;
        }
        if (f > f3) {
            return f3;
        }
        return f;
    }
}
