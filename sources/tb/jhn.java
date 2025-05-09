package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class jhn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AB_COMPONENT = "rate_preview_performance_component";
    public static final String AB_KEY_RATE_PREVIEW_ENABLE_CACHE = "enable_load_with_cache";
    public static final String AB_KEY_RATE_PREVIEW_ENABLE_V2 = "enable_rate_preview_v2";
    public static final String AB_MODULE = "rate_preview_performance_module";
    public static final jhn INSTANCE = new jhn();

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("200f125e", new Object[]{this})).booleanValue();
        }
        return c(AB_KEY_RATE_PREVIEW_ENABLE_CACHE);
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fa20eac", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad60e23c", new Object[]{this, str})).booleanValue();
        }
        VariationSet activate = UTABTest.activate(AB_COMPONENT, AB_MODULE);
        Boolean bool = null;
        Variation variation = activate != null ? activate.getVariation(str) : null;
        if (variation != null) {
            bool = Boolean.valueOf(variation.getValueAsBoolean(false));
        }
        return ckf.b(bool, Boolean.TRUE);
    }
}
