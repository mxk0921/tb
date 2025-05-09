package tb;

import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class iqu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final iqu INSTANCE = new iqu();

    static {
        t2o.a(1002438740);
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f4847ba", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "value");
        return tsq.x(str, "true", true) || tsq.x(str, Constants.VAL_YES, true);
    }
}
