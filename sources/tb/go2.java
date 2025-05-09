package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenSkuImplementor;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.sku.utils.SkuLogUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class go2 implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "buyNow";
    public static final String EVENT_TYPE_ALTERNATIVE = "buy_now";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f20125a;

    static {
        t2o.a(912261849);
        t2o.a(912261826);
    }

    public go2(Context context, ze7 ze7Var) {
        this.f20125a = ze7Var;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null) {
            return false;
        }
        if (!hjh.c()) {
            hjh.d(true);
            return true;
        } else if (((jns) this.f20125a.e().e(kns.PARSER_ID)) == null) {
            return false;
        } else {
            this.f20125a.i().f("skuClickTime", String.valueOf(System.currentTimeMillis()));
            this.f20125a.i().f("skuClickTimeType", SkuLogUtils.P_BUY_BTN_CLICK);
            this.f20125a.b().h(OpenSkuImplementor.h("BUYNOW", "fromDetailBuyNow"), runtimeAbilityParamArr);
            return true;
        }
    }
}
