package tb;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.utils.UserLocation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.LBSModule;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sjg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502268180);
    }

    public static TBLocationDTO a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("67d4dd1c", new Object[0]);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cachemode", (Object) "onlycache");
            jSONObject.put("timeLimit", (Object) "1d");
            jSONObject.put(UserLocation.KEY_DOUBLE_ACCURACY, (Object) "hundredMeters");
            return TBLocationClient.e(LBSModule.b.a(jSONObject));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d02c374b", new Object[0]);
        }
        try {
            TBLocationDTO a2 = a();
            HashMap hashMap = new HashMap(10);
            if (a2 != null) {
                hashMap.put("latitude", a2.latitude);
                hashMap.put("longitude", a2.longitude);
                hashMap.put("provinceCode", a2.provinceCode);
                hashMap.put(r4p.KEY_CITY_CODE, a2.cityCode);
                hashMap.put("altitude", a2.altitude);
                hashMap.put(r4p.KEY_COUNTRY_CODE, a2.areaCode);
                hashMap.put(UserLocation.KEY_DOUBLE_ACCURACY, a2.accuracy);
                hashMap.put("type", a2.locationType);
            }
            return hashMap;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
