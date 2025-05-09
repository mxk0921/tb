package tb;

import com.alibaba.ut.abtest.internal.util.hash.Murmur3_32HashFunction;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class iua {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int GOOD_FAST_HASH_SEED = (int) System.currentTimeMillis();
    public static final eua MURMUR3_32 = new Murmur3_32HashFunction(1526958062);

    static {
        t2o.a(961544395);
    }

    public static eua a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eua) ipChange.ipc$dispatch("f85c825a", new Object[0]);
        }
        return MURMUR3_32;
    }
}
