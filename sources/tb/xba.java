package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.model.AddressInfo;
import com.taobao.android.address.model.RecommendedAddress;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xba extends ry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782798);
    }

    public xba(cfc cfcVar) {
        super(cfcVar);
    }

    public static /* synthetic */ Object ipc$super(xba xbaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/dataservice/impl/requestparams/bizparms/GlobalLbsBizParamsGenerator");
    }

    @Override // tb.ry
    public JSONObject a(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6bfefe96", new Object[]{this, awesomeGetContainerData, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        c(jSONObject2);
        return jSONObject2;
    }

    public final void c(JSONObject jSONObject) {
        AddressInfo addressInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20121ff7", new Object[]{this, jSONObject});
            return;
        }
        RecommendedAddress f = mf0.f(Globals.getApplication(), "tb_homepage");
        if (f != null && (addressInfo = f.recommendedAddress) != null) {
            jSONObject.put("globalProvinceCode", (Object) addressInfo.provinceDivisionCode);
            jSONObject.put("globalCityCode", (Object) addressInfo.cityDivisionCode);
            jSONObject.put("globalAreaCode", (Object) addressInfo.areaDivisionCode);
            jSONObject.put("globalTownCode", (Object) addressInfo.townDivisionCode);
            jSONObject.put("globalLng", (Object) addressInfo.lng);
            jSONObject.put("globalLat", (Object) addressInfo.lat);
        }
    }
}
