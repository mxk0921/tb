package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sbq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809107);
    }

    public static void a(String str, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497ea888", new Object[]{str, map, map2});
        } else {
            AlimamaAdvertising.instance().buildTanxEventTracking(Globals.getApplication(), str).b("tb_splash").d(map).e(map2).a();
        }
    }

    public static void b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435bd8fb", new Object[]{jSONObject});
        } else if (jSONObject.containsKey("clickParam") && (jSONObject2 = jSONObject.getJSONObject("clickParam")) != null && jSONObject2.containsKey("args")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
            JSONObject jSONObject4 = jSONObject2.getJSONObject("ext");
            Map<String, String> g = g(jSONObject4);
            Map<String, String> h = h(jSONObject4);
            if (jSONObject3.containsKey("advClickTracking")) {
                String string = jSONObject3.getString("advClickTracking");
                c(string, g, h);
                fve.e(obq.SPLASH_BUSINESS_TAG, "DXHTapEvent#handleEvent-> 上报广告点击埋点：" + string);
            }
            if (jSONObject3.containsKey("advEventTracking")) {
                String string2 = jSONObject3.getString("advEventTracking");
                a(string2, g, h);
                fve.e(obq.SPLASH_BUSINESS_TAG, "DXHTapEvent#handleEvent-> 上报广告互动埋点：" + string2);
            }
        }
    }

    public static void c(String str, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd2dd274", new Object[]{str, map, map2});
        } else {
            AlimamaAdvertising.instance().buildTanxClickTracking(Globals.getApplication(), str).b("tb_splash").c(map).d(map2).a();
        }
    }

    public static void d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f6bb7ef", new Object[]{jSONObject});
        } else if (jSONObject.containsKey(i2b.TRACK_EXPOSURE_PARAM) && (jSONObject2 = jSONObject.getJSONObject(i2b.TRACK_EXPOSURE_PARAM)) != null && jSONObject2.containsKey("args")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
            JSONObject jSONObject4 = jSONObject3.getJSONObject("ext");
            Map<String, String> g = g(jSONObject4);
            Map<String, String> h = h(jSONObject4);
            if (jSONObject3.containsKey("advImpTracking")) {
                String string = jSONObject3.getString("advImpTracking");
                e(string, g, h);
                fve.e(obq.SPLASH_BUSINESS_TAG, "DXAppearExposeEventHandler#handleEvent-> 上报广告曝光埋点：" + string);
            }
            if (jSONObject3.containsKey("advEventTracking")) {
                String string2 = jSONObject3.getString("advEventTracking");
                a(string2, g, h);
                fve.e(obq.SPLASH_BUSINESS_TAG, "DXAppearExposeEventHandler#handleEvent-> 上报广告互动埋点：" + string2);
            }
        }
    }

    public static void e(String str, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaa75c68", new Object[]{str, map, map2});
        } else {
            AlimamaAdvertising.instance().buildTanxImpTracking(Globals.getApplication(), str).b("tb_splash").c(map).d(map2).a();
        }
    }

    public static JSONObject f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a4216bc4", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject("advClientParam");
    }

    public static Map<String, String> h(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("588b5925", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap(2);
        JSONObject f = f(jSONObject);
        if (f == null || (jSONObject2 = f.getJSONObject("utArgs")) == null) {
            return hashMap;
        }
        try {
            return (Map) JSON.parseObject(jSONObject2.toJSONString(), Map.class);
        } catch (Throwable unused) {
            return hashMap;
        }
    }

    public static Map<String, String> g(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("76a5be4", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap(1);
        JSONObject f = f(jSONObject);
        if (f == null || (jSONObject2 = f.getJSONObject("monitorArgs")) == null) {
            return hashMap;
        }
        try {
            return (Map) JSON.parseObject(jSONObject2.toJSONString(), Map.class);
        } catch (Throwable unused) {
            return hashMap;
        }
    }
}
