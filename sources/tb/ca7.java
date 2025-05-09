package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.constants.OrderBizCode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ca7 extends i24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465752);
    }

    public static /* synthetic */ Object ipc$super(ca7 ca7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/DelOrderV2Subscriber");
    }

    @Override // tb.i24
    public JSONObject K(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3d13c9e0", new Object[]{this, jSONObject});
        }
        if (!(jSONObject.get("alert") instanceof JSONObject)) {
            uj8.b(ca7.class.getSimpleName(), "buildCombineEvent", "EVENT_CHAIN_PARAMS_VALID_ERROR", "没有alert");
            idl.d(OrderBizCode.orderList, "删除订单失败#缺少Alert字段", "没有alert");
            return null;
        }
        JSONObject J = zk0.J(axf.b(jSONObject));
        if (J == null) {
            uj8.b(ca7.class.getSimpleName(), "buildCombineEvent", "EVENT_CHAIN_PARAMS_VALID_ERROR", "构建alert事件失败");
            idl.d(OrderBizCode.orderList, "删除订单失败#构建alert事件失败", "构建alert事件失败");
            return null;
        }
        JSONObject b = axf.b(jSONObject);
        b.remove("alert");
        JSONObject J2 = J(J, "confirm", "refreshMtopV2", b);
        J(J2, "success", "refreshPageV2", null);
        if ((jSONObject.get("from") instanceof String) && ae2.BizKeyOrderDetail.equals(jSONObject.getString("from"))) {
            J(J2, "success", "closePageV2", null);
        }
        return J;
    }
}
