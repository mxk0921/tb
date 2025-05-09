package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t2q implements lfb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "sku_dismiss";

    static {
        t2o.a(442499137);
        t2o.a(442499194);
    }

    @Override // tb.lfb
    public void a(v2q v2qVar, pr0 pr0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e5704a", new Object[]{this, v2qVar, pr0Var});
            return;
        }
        if (cjz.a()) {
            SkuLogUtils.x("SkuDismissHandler.handleEvent");
        }
        pr0Var.a();
    }
}
