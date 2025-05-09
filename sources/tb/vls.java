package tb;

import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vls {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPTIMIZATION_CONFIG = "optimizationConfig";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f30093a;

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2e324d9", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (String) ((HashMap) f30093a).get(str);
    }

    public static JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a6d08771", new Object[0]);
        }
        try {
            String string = PreferenceManager.getDefaultSharedPreferences(Global.getApplication()).getString("MyTaobaoOrderNumberCacheV2", null);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return JSON.parseObject(string);
        } catch (Throwable th) {
            bqa.b("home.TSParserUtils", "getOrderCache error", th);
            return null;
        }
    }

    public static String c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ca383b0", new Object[]{uri});
        }
        if (uri != null) {
            return a(uri.getQueryParameter(jql.IN_PARAM_ORDER_LIST_TYPE));
        }
        return null;
    }

    public static int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e201814", new Object[]{str})).intValue();
        }
        JSONObject b = b();
        if (b != null) {
            return g(b, str);
        }
        return 0;
    }

    public static JSONObject e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ed8a9484", new Object[]{str});
        }
        if (TextUtils.equals(z4a.REC_ORDER_LIST_CATAPULT.f32522a, str)) {
            return f(1);
        }
        if (TextUtils.equals(z4a.REC_ORDER_LIST.f32522a, str)) {
            return f(0);
        }
        return null;
    }

    public static JSONObject f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dfe7f17a", new Object[]{new Integer(i)});
        }
        if (i > 0) {
            JSONObject a2 = xsl.a(z4a.REC_ORDER_LIST_CATAPULT.f32522a);
            if (a2 == null) {
                return null;
            }
            return a2.getJSONObject(OPTIMIZATION_CONFIG);
        }
        JSONObject a3 = xsl.a(z4a.REC_ORDER_LIST.f32522a);
        if (a3 == null) {
            return null;
        }
        return a3.getJSONObject(OPTIMIZATION_CONFIG);
    }

    public static int g(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44ed2cd2", new Object[]{jSONObject, str})).intValue();
        }
        if (jSONObject.isEmpty()) {
            uqa.b("recmdPrefetch", "home.TSParserUtils", "我淘返回订单的接口为空");
            return 0;
        }
        try {
            return jSONObject.getJSONObject(str).getIntValue("count");
        } catch (Exception e) {
            uqa.b("recmdPrefetch", "home.TSParserUtils", "解析订单数出现异常：" + e);
            return 0;
        }
    }

    static {
        t2o.a(729809728);
        HashMap hashMap = new HashMap();
        f30093a = hashMap;
        hashMap.put("wait_to_pay", "waitPay");
        hashMap.put("wait_to_shipments", "waitSend");
        hashMap.put("wait_to_confirm", "waitConfirm");
    }
}
