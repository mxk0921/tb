package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.TabType;
import com.taobao.android.order.bundle.ultron.module.ReallyPayFiles;
import java.util.ArrayList;
import tb.ptg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ar0 extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "alipayV2";

    static {
        t2o.a(713031902);
    }

    public static /* synthetic */ Object ipc$super(ar0 ar0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/ultron/event/AliPaySubscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "1060987294545483898";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        lor.c("AliPaySubscriber", "onHandleEventChain", "----");
        if (b8vVar == null || E(b8vVar) == null || E(b8vVar).getString("fromConfirmGood") == null) {
            str = "";
        } else {
            str = E(b8vVar).getString("fromConfirmGood");
        }
        ReallyPayFiles reallyPayFiles = (ReallyPayFiles) v9o.a(b8vVar.k(m6v.KEY_EVENT_CHAIN_DATA), ReallyPayFiles.class);
        if (reallyPayFiles == null) {
            uvl.e(str, false, 5, "doPayResult is null");
            return;
        }
        ArrayList<String> arrayList = reallyPayFiles.orderIds;
        if (arrayList != null && arrayList.size() > 1) {
            reallyPayFiles.orderIds = null;
        }
        if (!uvl.c((Activity) b8vVar.e(), reallyPayFiles, str)) {
            uvl.e(str, false, 5, "act == null || dataObj == null");
        }
        if (!UltronTradeHybridSwitcherHelper.e("waitPay", "")) {
            return;
        }
        if (!(b8vVar.e() instanceof ptg.c)) {
            hav.d("AliPaySubscriber", "not in orderList");
            return;
        }
        try {
            String z = ((ptg.c) b8vVar.e()).z();
            if (!TextUtils.equals(z, TabType.WAIT_PAY.getValue()) && !TextUtils.equals(z, TabType.ALL.getValue())) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("context", (Object) b8vVar.e());
            qbv.j().a(UltronTradeHybridStage.ON_RENDER_END, "waitPay", jSONObject);
        } catch (Throwable th) {
            hav.d("AliPaySubscriber", "throwable: " + th.toString());
        }
    }
}
