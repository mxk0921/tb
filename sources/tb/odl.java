package tb;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.HybridPreRenderHelper;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.jump.JumpAbility;
import com.taobao.android.order.bundle.TBOrderListFragment;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.constants.OrderType;
import com.taobao.android.order.bundle.weex2.AsyncInstanceLoadManager;
import com.taobao.android.order.bundle.weex2.TBRefundInstanceManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class odl implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ut7<Intent> listDowngradeProcess = new ut7<>();

    static {
        t2o.a(713032025);
        t2o.a(578814049);
    }

    public odl() {
        this.listDowngradeProcess.a(new oax(), new vug(), new wt7(), new qda());
    }

    public final void a(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e888121", new Object[]{this, intent, zmjVar});
        } else if (zmjVar.d() != null && intent != null) {
            Bundle bundle = new Bundle();
            bundle.putString(qxq.KEY_FRAGMENT_JUMP, "true");
            bundle.putString(qxq.KEY_FRAGMENT_NAME, TBOrderListFragment.class.getName());
            zmjVar.v(JumpAbility.NAV_JUMP_ABILITY_FRAGMENT);
            intent.putExtra(qxq.KEY_FRAGMENT_BUNDLE, bundle);
        }
    }

    public final String b(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71eb0064", new Object[]{this, intent});
        }
        if (!TextUtils.isEmpty(jql.m(intent, "searchKey"))) {
            str = OrderType.ORDERSEARCH.getValue();
        } else {
            str = jql.l(intent, CoreConstants.USER_ORDER_TYPE);
            if (TextUtils.isEmpty(str)) {
                str = OrderType.ORDERLIST.getValue();
            }
        }
        intent.putExtra(eel.ORDER_TYPE, str);
        return str;
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "OrderListNavProcessor";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        lor.c(CoreConstants.NAV_TAG, "OrderListNavProcessor", new String[0]);
        if (intent == null || intent.getData() == null || !intent.getData().isOpaque()) {
            if (dbl.q()) {
                String b = b(intent);
                boolean z2 = !v9v.i(wbl.NEW_BABEL_ORDER, "enableOrderFragment", true) ? OrderType.ORDERLIST.equals(b) || OrderType.MAOCHAO.getValue().equals(b) : OrderType.ORDERLIST.getValue().equals(b) || OrderType.MAOCHAO.getValue().equals(b);
                if (OrderType.ORDERSEARCH.getValue().equals(b) || OrderType.ORDERFILTER.getValue().equals(b)) {
                    zmjVar.x("com.taobao.taobao");
                    zmjVar.r("com.taobao.android.order.bundle.TBOrderSearchOrFilterActivity");
                } else {
                    if (z2 && "reFund".equals(jql.l(intent, jql.IN_PARAM_ORDER_LIST_TYPE))) {
                        TBRefundInstanceManager.startPreRequestOnIdle(zmjVar.d());
                        if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enableNavImageDataChange", true)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(ccv.PARAM_ASYNC_DATA_SOURCE, (Object) "true");
                            qbv.j().a(UltronTradeHybridStage.ON_DATA_CHANGED, "refundList", jSONObject);
                        }
                        if (HybridPreRenderHelper.i()) {
                            AsyncInstanceLoadManager asyncInstanceLoadManager = AsyncInstanceLoadManager.INSTANCE;
                            if (asyncInstanceLoadManager.g() == AsyncInstanceLoadManager.LoadState.INIT) {
                                asyncInstanceLoadManager.e(zmjVar.d());
                            }
                        }
                    }
                    ldl ldlVar = ldl.INSTANCE;
                    if (ldlVar.d() != null) {
                        z = true;
                    }
                    intent.putExtra("enableTouchDown", z);
                    if (z2 && uel.l("useOLFragmentV2", true)) {
                        a(intent, zmjVar);
                    }
                    if (!z) {
                        hav.d("OrderListNavProcessor", "asyncTask onNav");
                        ldlVar.b(intent, null, zmjVar.d());
                    }
                    this.listDowngradeProcess.b(intent);
                }
            }
            return true;
        }
        hav.d(CoreConstants.NAV_TAG, "uri is opaque");
        return false;
    }
}
