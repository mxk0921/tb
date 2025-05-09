package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.model.AddressInfo;
import com.taobao.android.address.model.RecommendedAddress;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809852);
    }

    public static Map<String, String> a(AddressInfo addressInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("867d6b11", new Object[]{addressInfo});
        }
        HashMap hashMap = new HashMap(10);
        hashMap.put("globalProvinceCode", addressInfo.provinceDivisionCode);
        hashMap.put("globalCityCode", addressInfo.cityDivisionCode);
        hashMap.put("globalAreaCode", addressInfo.areaDivisionCode);
        hashMap.put("globalTownCode", addressInfo.townDivisionCode);
        hashMap.put("globalLng", addressInfo.lng);
        hashMap.put("globalLat", addressInfo.lat);
        return hashMap;
    }

    @Deprecated
    public static void b(JSONObject jSONObject) {
        AddressInfo addressInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20121ff7", new Object[]{jSONObject});
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

    public static String c() {
        AddressInfo addressInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a41d4515", new Object[0]);
        }
        RecommendedAddress f = mf0.f(Globals.getApplication(), "tb_homepage");
        if (f == null || (addressInfo = f.recommendedAddress) == null) {
            return null;
        }
        try {
            return JSON.toJSONString(a(addressInfo));
        } catch (Exception e) {
            uqa.b("MTopRequest", "getGlobalLbs", "数据转换出现异常：" + e);
            return "";
        }
    }
}
