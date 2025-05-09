package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class iaz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598737523);
    }

    public static final long a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e2dbf8b", new Object[]{new Integer(i), new Integer(i2)})).longValue();
        }
        return haz.b((i2 & tiv.INT_MASK) | (i << 32));
    }
}
