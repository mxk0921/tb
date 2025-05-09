package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class g7z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598737515);
    }

    public static final long a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d2a0558", new Object[]{new Float(f), new Float(f2)})).longValue();
        }
        return f7z.b((Float.floatToRawIntBits(f2) & tiv.INT_MASK) | (Float.floatToRawIntBits(f) << 32));
    }
}
