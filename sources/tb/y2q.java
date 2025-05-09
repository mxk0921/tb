package tb;

import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class y2q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SOURCE_TYPE = "sourceType";
    public static final String SKU_ADD_CART = "5";
    public static final String SKU_ADD_CART_AND_DETAIL = "4";
    public static final String SKU_ADD_CART_WITH_SURE = "1";
    public static final String SKU_BUY = "2";
    public static final String SKU_RESULT_ADDCART_SUCCESS = "1";
    public static final String SKU_RESULT_QUERAYDATA_FAIL = "8";
    public static final String SKU_SURE_AND_DETAIL = "3";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
            }
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else if (map != null) {
                String a2 = y2q.a(map, "resultCode");
                if ("1".equals(a2)) {
                    String a3 = y2q.a(map, "itemId");
                    if (!TextUtils.isEmpty(a3)) {
                        ux9 d = vx9.d();
                        sjr.g().c("com.taobao.taolive.room.addcart", a3, d != null ? d.C() : null);
                    }
                } else if ("8".equals(a2)) {
                    Toast.makeText(gq0.g().getApplication(), "加购失败", 0).show();
                }
            }
        }
    }

    static {
        t2o.a(779092359);
    }

    public static /* synthetic */ String a(Map map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("685a0228", new Object[]{map, str});
        }
        return b(map, str);
    }

    public static String b(Map<String, Object> map, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2026bba0", new Object[]{map, str});
        }
        if (map == null || (obj = map.get(str)) == null || !(obj instanceof String)) {
            return "";
        }
        return (String) obj;
    }

    public static void c(String str, String str2, JSONObject jSONObject) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ceba15", new Object[]{str, str2, jSONObject});
        } else if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("itemId", str);
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("sourceType", str2);
            } else {
                hashMap.put("sourceType", "4");
            }
            if (jSONObject != null) {
                String str3 = "";
                for (String str4 : jSONObject.keySet()) {
                    if (z) {
                        str3 = str3 + str4;
                        z = false;
                    } else {
                        str3 = str3 + "," + str4;
                    }
                }
                jSONObject.put(r4p.KEY_MSOA_TRANS_KEY, (Object) str3);
                jSONObject.put("bizName", "taobaolive_msoa");
                hashMap.put("exParams", jSONObject);
            }
            try {
                rrh.e().o(new vrh("msoa.taobao.cart.sdk", "msoa.taobao.detail.showsku", "2.0", "taobaolive_msoa", hashMap), new a());
            } catch (Exception e) {
                Log.e("SkuHelper", e.getMessage());
            }
        }
    }
}
