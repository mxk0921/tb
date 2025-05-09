package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class x4z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598737154);
    }

    public static final v4z a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v4z) ipChange.ipc$dispatch("6d9ffb01", new Object[]{new Float(f), new Float(f2)});
        }
        return new w4z(f, f2);
    }

    public static /* synthetic */ v4z b(float f, float f2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v4z) ipChange.ipc$dispatch("cc2ea8dd", new Object[]{new Float(f), new Float(f2), new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        return a(f, f2);
    }
}
