package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.utils.TradeRealTimeDataTrace;
import java.util.UUID;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class aan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f15630a = UUID.randomUUID().toString();
    public String b;
    public String c;
    public String d;
    public final AURAGlobalData e;

    static {
        t2o.a(301990019);
    }

    public aan(AURAGlobalData aURAGlobalData) {
        this.e = aURAGlobalData;
    }

    public static String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("288ffb6b", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("realPay");
    }

    public final String a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c90745a6", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("global")) == null || (jSONObject3 = jSONObject2.getJSONObject("detect")) == null || (string = jSONObject3.getString("itemIds")) == null) {
            return null;
        }
        try {
            JSONArray parseArray = JSON.parseArray(string);
            if (parseArray == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < parseArray.size(); i++) {
                sb.append(parseArray.getString(i));
                if (i < parseArray.size() - 1) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public final String c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b78ba01", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("newTraceId");
    }

    public final String d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b953b8b3", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("global")) == null || (jSONObject3 = jSONObject2.getJSONObject("params")) == null) {
            return null;
        }
        return jSONObject3.getString("userId");
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c29df5a", new Object[]{this});
            return;
        }
        try {
            AURAGlobalData aURAGlobalData = this.e;
            if (aURAGlobalData != null) {
                JSONObject jSONObject = (JSONObject) aURAGlobalData.get("aura_data_protocol_json", JSONObject.class);
                this.b = a(jSONObject);
                this.c = d(jSONObject);
                String b = b((JSONObject) this.e.get("submitExposureItemArgs", JSONObject.class));
                this.d = b;
                TradeRealTimeDataTrace.a aVar = new TradeRealTimeDataTrace.a();
                aVar.f12962a = this.f15630a;
                aVar.c = this.b;
                aVar.b = this.c;
                aVar.e = b;
                aVar.f = "mtop.trade.createOrder/6.0";
                TradeRealTimeDataTrace.e(TradeRealTimeDataTrace.TradeStage.CREATE_ORDER_REQUEST, aVar);
            }
        } catch (Throwable unused) {
        }
    }

    public void f(MtopResponse mtopResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415e3703", new Object[]{this, mtopResponse});
            return;
        }
        try {
            TradeRealTimeDataTrace.a aVar = new TradeRealTimeDataTrace.a();
            aVar.f12962a = this.f15630a;
            aVar.c = this.b;
            aVar.b = this.c;
            aVar.e = this.d;
            aVar.f = "mtop.trade.createOrder/6.0";
            String str2 = null;
            if (mtopResponse != null) {
                str = ik.b(mtopResponse);
            } else {
                str = null;
            }
            aVar.g = str;
            if (mtopResponse != null) {
                str2 = mtopResponse.getRetMsg();
            }
            aVar.h = str2;
            TradeRealTimeDataTrace.e(TradeRealTimeDataTrace.TradeStage.CREATE_ORDER_FAIL, aVar);
        } catch (Throwable unused) {
        }
    }

    public void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4cd919", new Object[]{this, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = (JSONObject) this.e.get("submitExposureItemArgs", JSONObject.class);
            TradeRealTimeDataTrace.a aVar = new TradeRealTimeDataTrace.a();
            aVar.f12962a = this.f15630a;
            aVar.c = this.b;
            aVar.b = this.c;
            aVar.e = this.d;
            aVar.f = "mtop.trade.createOrder/6.0";
            if (jSONObject != null) {
                aVar.d = jSONObject.getString("bizOrderId");
            }
            aVar.g = c(jSONObject2);
            TradeRealTimeDataTrace.e(TradeRealTimeDataTrace.TradeStage.CREATE_ORDER_SUCCESS, aVar);
        } catch (Throwable unused) {
        }
    }
}
