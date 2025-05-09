package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ygn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ygn INSTANCE = new ygn();

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f00a92af", new Object[]{this})).booleanValue();
        }
        return b("useWeexUi");
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae8a1a6", new Object[]{this, str})).booleanValue();
        }
        VariationSet activate = UTABTest.activate("AB_", "rate_list_refactor_module");
        Boolean bool = null;
        Variation variation = activate != null ? activate.getVariation(str) : null;
        if (variation != null) {
            bool = Boolean.valueOf(variation.getValueAsBoolean(false));
        }
        return n9l.INSTANCE.h() && ckf.b(bool, Boolean.TRUE);
    }
}
