package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class skn extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "reallyPayV2";

    static {
        t2o.a(713031904);
    }

    public static /* synthetic */ Object ipc$super(skn sknVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/ultron/event/ReallyPaySubscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "2496968488994613456";
    }

    public final String J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ab72718", new Object[]{this});
        }
        o5e o5eVar = this.c;
        if (o5eVar != null && !TextUtils.isEmpty(o5eVar.getBizName())) {
            if (this.c.getBizName().equalsIgnoreCase("orderList")) {
                return "orderList";
            }
            if (this.c.getBizName().equalsIgnoreCase(ae2.BizKeyOrderDetail)) {
                return ae2.BizKeyOrderDetail;
            }
        }
        return "";
    }

    public final JSONObject K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5baab6ef", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageType", (Object) "H5");
        jSONObject.put("url", (Object) str);
        return jSONObject;
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        String str;
        String str2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (uel.l("doPayClickDebounce", true) && zt3.a()) {
        } else {
            if (b8vVar == null || b8vVar.f() == null) {
                if (b8vVar == null) {
                    str = "ultronEvent 为空";
                } else {
                    str = "ultronEvent.getEventParams() 为空";
                }
                uj8.a(skn.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", str);
            } else if (b8vVar.f() instanceof DMEvent) {
                if (E(b8vVar) == null || E(b8vVar).getString("fromConfirmGood") == null) {
                    str2 = "";
                } else {
                    str2 = E(b8vVar).getString("fromConfirmGood");
                }
                try {
                    JSONObject jSONObject2 = E(b8vVar).getJSONObject("doPay").getJSONObject("data");
                    if (jSONObject2 != null) {
                        String string = jSONObject2.getString("actionUrl");
                        if (!TextUtils.isEmpty(string)) {
                            z(b8vVar, "openUrl", K(string));
                            uvl.e(str2, true, 1, "openActionUrl: " + string);
                        } else {
                            if (!TextUtils.isEmpty(str2)) {
                                jSONObject = new JSONObject();
                                jSONObject.put("fromConfirmGood", (Object) str2);
                            } else {
                                jSONObject = null;
                            }
                            A(b8vVar, ar0.SUBSCRIBER_ID, jSONObject, jSONObject2);
                        }
                        qbv.j().a(UltronTradeHybridStage.ON_DATA_PRE_LOAD, J(), jSONObject2);
                        return;
                    }
                    uvl.e(str2, false, 3, "缺少  doPay 信息" + E(b8vVar).toJSONString());
                } catch (Throwable th) {
                    uj8.a("ReallyPaySubscriber", "reallyPayV2-parseDataError", th.toString());
                    uvl.e(str2, false, 3, "reallyPayV2-parseDataError" + th.toString());
                }
            }
        }
    }
}
