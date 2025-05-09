package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenSkuImplementor;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.sku.utils.SkuLogUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class me0 implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "addToCart";
    public static final String EVENT_TYPE_ALTERNATIVE = "add_to_cart";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f23984a;

    static {
        t2o.a(912261832);
        t2o.a(912261826);
    }

    public me0(Context context, ze7 ze7Var) {
        this.f23984a = ze7Var;
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
        } else if (((jns) this.f23984a.e().e(kns.PARSER_ID)) == null) {
            return false;
        } else {
            this.f23984a.i().f("skuClickTime", String.valueOf(System.currentTimeMillis()));
            this.f23984a.i().f("skuClickTimeType", SkuLogUtils.P_CART_BTN_CLICK);
            this.f23984a.b().h(OpenSkuImplementor.h("ADDCART", "fromDetailAddCart"), runtimeAbilityParamArr);
            return true;
        }
    }
}
