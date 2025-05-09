package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class tiv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long INT_MASK = 4294967295L;

    static {
        t2o.a(961544401);
    }

    public static long a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfb89219", new Object[]{new Integer(i)})).longValue();
        }
        return i & INT_MASK;
    }
}
