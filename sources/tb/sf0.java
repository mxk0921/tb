package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.model.AddressOpenData;
import com.taobao.android.address.wrapper.AddressParams;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.upload.domain.UploadConstants;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sf0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_NEEDFULLADDRESSINFO = "needFullAddressInfo";
    public static final String K_COMMON_ADDRESS_DATA = "data";
    public static final String K_COMMON_ADDRESS_URL = "common_address_url";
    public static final String K_DELIVERY_ID = "deliverId";
    public static final String K_SOURCE = "source";

    /* renamed from: a  reason: collision with root package name */
    public static String f28002a = "https://market.m.taobao.com/app/vip/receiver-address/pages/change?wh_weex=true";
    public static String b = "https://market.m.taobao.com/app/vip/receiver-address-weex/pages/v6-list?wh_weex=true&wx_navbar_hidden=true&switch=0220100";
    public static String c = "https://market.m.taobao.com/app/vip/receiver-address/pages/address?wh_weex=true&wx_navbar_hidden=true&newuser=true&voiceMode=true&isUnfrequent=true";
    public static String d = "https://market.m.taobao.com/app/vip/receiver-address-weex/pages/v6-map?first=true";
    public static String e = "https://market.m.taobao.com/app/vip/receiver-address-weex/pages/v6-list2?wh_weex=true&wx_navbar_hidden=true";
    public static AddressParams f;
    public static boolean g;
    public static Map<String, Object> h;
    public static Map<String, AddressOpenData> i = new HashMap();
    public static String j;

    public static void a(String str, AddressOpenData addressOpenData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74f4491", new Object[]{str, addressOpenData});
        } else if (!TextUtils.isEmpty(str) && addressOpenData != null) {
            if (i == null) {
                i = new HashMap();
            }
            i.put(str, addressOpenData);
        }
    }

    public static AddressOpenData b(String str) {
        Map<String, AddressOpenData> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AddressOpenData) ipChange.ipc$dispatch("b8ecada6", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || (map = i) == null || map.isEmpty()) {
            return null;
        }
        return i.get(str);
    }

    public static JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("79aa2de1", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            AddressParams addressParams = f;
            if (addressParams != null) {
                jSONObject.put(K_DELIVERY_ID, addressParams.deliverId);
                jSONObject.put(gf0.K_AGENCY_RECV, f.agencyReceive);
                jSONObject.put(gf0.K_AGENCY_RECV_H5, f.agencyReceiveH5Url);
                jSONObject.put(gf0.K_AGENCY_RECV_HEPL, f.agencyReceiveHelpUrl);
                jSONObject.put("abroadStation", f.abroadStation);
                jSONObject.put("supportStation", f.supportStation);
                jSONObject.put("needChangeKinship", f.needChangeKinship);
                jSONObject.put("relationId", f.relationId);
                jSONObject.put("source", f.source);
                jSONObject.put(gf0.K_SITES, f.sites);
                jSONObject.put("extMap", f.extMap);
                jSONObject.put("sellerID", f.sellerID);
                jSONObject.put("deliverAddrList", f.deliverAddrList);
                jSONObject.put("accurateAddressInfo", f.accurateAddressInfo);
                jSONObject.put(UploadConstants.BIZ_CODE, f.bizcode);
                com.alibaba.fastjson.JSONObject jSONObject2 = f.extNativeJson;
                if (jSONObject2 != null) {
                    jSONObject.put("extNativeJson", jSONObject2);
                }
                com.alibaba.fastjson.JSONObject jSONObject3 = f.extUrlJson;
                if (jSONObject3 != null) {
                    jSONObject.put("extUrlJson", jSONObject3);
                }
            }
        } catch (Throwable th) {
            AdapterForTLog.loge(ff0.TAG, "getAddressParamsJson fail", th);
        }
        return jSONObject;
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef7ae62", new Object[]{str});
            return;
        }
        h = null;
        j = str;
    }

    public static void e(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cd3172", new Object[]{map});
            return;
        }
        h = map;
        j = null;
    }
}
