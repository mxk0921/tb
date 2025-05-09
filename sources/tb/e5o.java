package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend.util.UTABTestUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e5o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809937);
    }

    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de8eaa58", new Object[]{this, str, new Integer(i)})).intValue();
        }
        return UTABTestUtil.b("recommend", str, "lazyLoadOffset", i);
    }

    public boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("828b16e5", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        return UTABTestUtil.a("recommend", str, "lazyLoadEnable", z);
    }
}
