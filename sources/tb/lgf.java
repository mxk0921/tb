package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.taolive.room.business.tcpouter.MtopTaobaoContentInteractionGatewayLiveRequest;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lgf extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092832);
    }

    public lgf(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(lgf lgfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/tcpouter/InteractionGatewayBusiness");
    }

    public void K(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("554b9d6e", new Object[]{this, str, str2, str3});
            return;
        }
        MtopTaobaoContentInteractionGatewayLiveRequest mtopTaobaoContentInteractionGatewayLiveRequest = new MtopTaobaoContentInteractionGatewayLiveRequest();
        mtopTaobaoContentInteractionGatewayLiveRequest.setBizType("live");
        mtopTaobaoContentInteractionGatewayLiveRequest.setModels("[{\"ability\":\"biz-assist-record\", \"subType\":\"default\"}]");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fromSource", (Object) "LIVE");
        jSONObject.put(BaseOuterComponent.b.SOURCE_COMPONENT_ID, (Object) str);
        jSONObject.put("liveSource", (Object) str2);
        mtopTaobaoContentInteractionGatewayLiveRequest.setExParams(jSONObject.toJSONString());
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("asac", str3);
        A(hashMap);
        C(0, mtopTaobaoContentInteractionGatewayLiveRequest, null);
    }
}
