package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class abv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286931);
    }

    public static boolean a(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6446d9c6", new Object[]{str, str2, str3, new Boolean(z)})).booleanValue();
        }
        VariationSet activate = UTABTest.activate(str, str2);
        if (activate == null) {
            UnifyLog.e("UltronTradeHybridABUtils.getABTestAsString", "variationSet is null");
            return z;
        }
        Variation variation = activate.getVariation(str3);
        if (variation != null) {
            return variation.getValueAsBoolean(z);
        }
        UnifyLog.e("UltronTradeHybridABUtils.getABTestAsString", "variation is null");
        return z;
    }
}
