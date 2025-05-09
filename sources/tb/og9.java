package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class og9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final og9 INSTANCE = new og9();

    static {
        t2o.a(1022362007);
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63bc253d", new Object[]{this, str});
        }
        ckf.g(str, PopConst.BRIDGE_KEY_BUSINESS_ID);
        String a2 = wqo.a(str);
        ckf.f(a2, "getAbsolutePath(...)");
        return a2;
    }
}
