package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ib3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199339);
    }

    public static Map<String, String> a(Activity activity, QueryParamsManager queryParamsManager, String str, Map<String, String> map) {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9e983e5e", new Object[]{activity, queryParamsManager, str, map});
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            jSONObject.putAll(map);
        }
        jSONObject.put(RequestConfig.IS_ICART_IS_FIRST_REQUEST, (Object) "true");
        jSONObject.put("globalSell", (Object) "1");
        jSONObject.put("mergeCombo", (Object) "true");
        jSONObject.put("version", (Object) "1.1.1");
        if (kjf.a()) {
            jSONObject.put(v4s.PARAM_IS_INNER, (Object) String.valueOf(kjf.a()));
        }
        String c = o6g.c(activity);
        if (!TextUtils.isEmpty(c)) {
            jSONObject.put("shopIdInfoStr", (Object) c);
        }
        String q = xap.q(queryParamsManager.f());
        if (!TextUtils.isEmpty(q)) {
            jSONObject.put("divisionCode", (Object) q);
        }
        if (queryParamsManager.t()) {
            jSONObject.put(RequestConfig.IS_FULL_DATA_QUERY, (Object) "true");
        }
        if (queryParamsManager.w() && !queryParamsManager.u()) {
            if (!CheckHoldManager.i().f().isEmpty()) {
                jSONObject.put("iCheckedCartIds", (Object) CheckHoldManager.i().g());
            }
            if (!CheckHoldManager.i().l().isEmpty()) {
                jSONObject.put("iCheckedCartIdsForRepeatBuy", (Object) CheckHoldManager.i().l());
            }
        }
        if (!TextUtils.isEmpty(ziq.c().b())) {
            jSONObject.put("addressId", (Object) ziq.c().b());
        }
        if (queryParamsManager.g() != null) {
            jSONObject.put("cartSortParams", (Object) queryParamsManager.g());
        }
        String e = queryParamsManager.e();
        if (!TextUtils.isEmpty(e)) {
            jSONObject.put("cartCustomExParam", (Object) e);
        }
        String l = queryParamsManager.l();
        if (!TextUtils.isEmpty(l)) {
            jSONObject.put("holdCustomExParams", (Object) l);
        }
        if (str != null) {
            jSONObject.put("instanceId", (Object) str);
        }
        jSONObject.put(RequestConfig.sKeyRequestTimestamp, (Object) Long.valueOf(System.currentTimeMillis()));
        try {
            z = false;
            for (String str2 : h0r.j()) {
                try {
                    if (!z2) {
                        z2 = rcx.b(str2);
                    }
                    if (!z) {
                        z = rcx.c(str2);
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            z = false;
        }
        jSONObject.put(RequestConfig.IS_SUPPORT_WIDGET, (Object) String.valueOf(z2));
        jSONObject.put(RequestConfig.IS_WIDGET_INSTALLED, (Object) String.valueOf(z));
        HashMap hashMap = new HashMap();
        hashMap.put("exParams", jSONObject.toJSONString());
        return hashMap;
    }
}
