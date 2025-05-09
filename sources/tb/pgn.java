package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class pgn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final pgn INSTANCE = new pgn();

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2696a91", new Object[]{this})).booleanValue();
        }
        if (!a("enable_image_reload_in_nav") || !n9l.INSTANCE.d()) {
            return false;
        }
        return true;
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("baea6f7d", new Object[]{this, str})).booleanValue();
        }
        VariationSet activate = UTABTest.activate("rate_list_image_performance_component", "rate_list_image_performance_module");
        Boolean bool = null;
        Variation variation = activate != null ? activate.getVariation(str) : null;
        if (variation != null) {
            bool = Boolean.valueOf(variation.getValueAsBoolean(false));
        }
        return ckf.b(bool, Boolean.TRUE);
    }
}
