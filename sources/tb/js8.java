package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class js8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378714);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70814e2f", new Object[0]);
        }
        return BUFS.getFeature(new BUFS.QueryArgs(), "mtop.mediaplatform.alive.recommend.lives", "Page_TaobaoLive", "Page_TaobaoLive");
    }

    public static JSONObject d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6eb656e9", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject();
        if (!lrq.a(str)) {
            try {
                for (String str2 : str.split("&")) {
                    String[] split = str2.split("=");
                    if (split.length >= 2) {
                        jSONObject.put(split[0], (Object) split[1]);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject c(Context context, b0h b0hVar, String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("24e188d4", new Object[]{context, b0hVar, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageName", (Object) "Page_TaobaoLive");
        jSONObject.put("abBucketId", (Object) "3");
        jSONObject.put("enableInsertAbBucketId", (Object) "true");
        jSONObject.put("itemAtmosphereVersion", (Object) 1);
        jSONObject.put("followCardTemplateName", (Object) "taolive_live_card");
        jSONObject.put("sessionId", (Object) wca.b());
        jSONObject.put("spmPre", (Object) b0hVar.g);
        jSONObject.put("livesourcePre", (Object) b0hVar.f);
        TBLocationDTO d = TBLocationClient.d();
        if (d != null) {
            jSONObject.put(r4p.KEY_CITY_CODE, (Object) d.cityCode);
            jSONObject.put(r4p.KEY_CITY_NAME, (Object) d.cityName);
        } else {
            mbu.l("Page_TaobaoLive", "getCacheLocationNull", new HashMap());
        }
        JSONObject d2 = d(str);
        jSONObject.put("queryParams", (Object) d2);
        jSONObject.put("utparamPre", d2.get(yj4.PARAM_UT_PARAMS));
        jSONObject.put("deviceLevel", (Object) Integer.valueOf(sj7.c()));
        if (nvs.m()) {
            jSONObject.put("bxFeature", (Object) a());
        }
        jSONObject.put("currentSceneUUID", (Object) UUID.randomUUID());
        if (sj7.s(context) || sj7.w(context)) {
            z = true;
        }
        jSONObject.put("isPad", (Object) Boolean.valueOf(z));
        jSONObject.put("itemAtmosphereVersion", (Object) 1);
        return jSONObject;
    }

    public static JSONObject b(Context context, b0h b0hVar) {
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5c585ad5", new Object[]{context, b0hVar});
        }
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            if (sj7.s(context) || sj7.w(context)) {
                z = false;
            }
            jSONObject.put("nAbtest", (Object) Boolean.valueOf(z));
        }
        if (b0hVar != null) {
            jSONObject.put("screenHeight", (Object) Float.valueOf(b0hVar.n));
        }
        jSONObject.put("os", (Object) "android");
        int c = sj7.c();
        if (c == 3) {
            str = "low";
        } else if (c == 2) {
            str = "medium";
        } else {
            str = "high";
        }
        jSONObject.put("deviceLevel", (Object) str);
        return jSONObject;
    }
}
