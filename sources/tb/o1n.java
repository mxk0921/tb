package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o1n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BigInteger FEATURE_TAG_ID = new BigInteger("1");
    public static final BigInteger FEATURE_CONTAINER_CACHE = new BigInteger("2");
    public static final BigInteger FEATURE_SIMPLE_POPUP = new BigInteger("4");

    static {
        t2o.a(83886203);
    }

    public static boolean a(BigInteger bigInteger, BigInteger bigInteger2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bc14335", new Object[]{bigInteger, bigInteger2})).booleanValue();
        }
        if (bigInteger == null || bigInteger2 == null) {
            return false;
        }
        return bigInteger2.equals(bigInteger.and(bigInteger2));
    }
}
