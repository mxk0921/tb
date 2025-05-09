package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ua2 extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "alipayBindV2";

    static {
        t2o.a(713031903);
    }

    public static /* synthetic */ Object ipc$super(ua2 ua2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/ultron/event/BindAliPaySubscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "6582404051474426395";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        String str;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        lor.c("BindAliPaySubcriber", "onHandleEventChain", "----");
        if (b8vVar == null || E(b8vVar) == null || E(b8vVar).getString("fromConfirmGood") == null) {
            str = "";
        } else {
            str = E(b8vVar).getString("fromConfirmGood");
        }
        try {
            JSONObject jSONObject = E(b8vVar).getJSONObject("doPay");
            if (jSONObject != null && (jSONArray = jSONObject.getJSONArray(rb.RESULT_KEY)) != null) {
                String str2 = (String) jSONArray.get(0);
                String[] split = str2.split("::");
                if (split != null && split.length > 1) {
                    if (CoreConstants.MTOP_BIZ_DOPAY_ERROR_CODE.equals(split[0])) {
                        uvl.b(b8vVar.e(), jSONObject.getJSONObject("data").getString("signStr"));
                        uvl.e(str, false, 4, CoreConstants.MTOP_BIZ_DOPAY_ERROR_CODE);
                    } else {
                        new HashMap().put(jk.KEY_RET_MSG, str2);
                        z4v.a(this.b, split[1]);
                        uvl.e(str, false, 4, "onHandleEventChain:".concat(str2));
                    }
                }
            }
        } catch (Throwable th) {
            uvl.e(str, false, 4, "onHandleEventChain:" + th.toString());
        }
    }
}
