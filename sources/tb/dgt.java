package tb;

import android.app.Application;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dgt implements yec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782150);
        t2o.a(486539295);
    }

    @Override // tb.yec
    public void a(Application application, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0e0026", new Object[]{this, application, str, str2, str3, map});
        } else {
            AlimamaAdvertising.instance().buildIfsExposure(application, str).withArgPid(str2).withArgNamespace(str3).withArgs(map).commit();
        }
    }

    @Override // tb.yec
    public void b(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff0f85f", new Object[]{this, str, str2, str3, map});
        } else {
            AlimamaAdvertising.instance().commitIfsArrayExposure(str, str2, str3, map);
        }
    }

    @Override // tb.yec
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f6bb7ef", new Object[]{this, jSONObject});
        } else if (jSONObject != null && jSONObject.containsKey("args")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("ext");
            Map<String, String> j = j(jSONObject3);
            Map<String, String> k = k(jSONObject3);
            if (jSONObject2.containsKey("advImpTracking")) {
                String string = jSONObject2.getString("advImpTracking");
                h(string, j, k);
                fve.e(obq.SPLASH_BUSINESS_TAG, "DXAppearExposeEventHandler#handleEvent-> 上报广告曝光埋点：" + string);
            }
            if (jSONObject2.containsKey("advEventTracking")) {
                String string2 = jSONObject2.getString("advEventTracking");
                f(string2, j, k);
                fve.e(obq.SPLASH_BUSINESS_TAG, "DXAppearExposeEventHandler#handleEvent-> 上报广告互动埋点：" + string2);
            }
        }
    }

    @Override // tb.yec
    public void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435bd8fb", new Object[]{this, jSONObject});
        } else if (jSONObject != null && jSONObject.containsKey("args")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            JSONObject jSONObject3 = jSONObject.getJSONObject("ext");
            Map<String, String> j = j(jSONObject3);
            Map<String, String> k = k(jSONObject3);
            if (jSONObject2.containsKey("advClickTracking")) {
                String string = jSONObject2.getString("advClickTracking");
                g(string, j, k);
                fve.e(obq.SPLASH_BUSINESS_TAG, "DXHTapEvent#handleEvent-> 上报广告点击埋点：" + string);
            }
            if (jSONObject2.containsKey("advEventTracking")) {
                String string2 = jSONObject2.getString("advEventTracking");
                f(string2, j, k);
                fve.e(obq.SPLASH_BUSINESS_TAG, "DXHTapEvent#handleEvent-> 上报广告互动埋点：" + string2);
            }
        }
    }

    @Override // tb.yec
    public void e(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6011d732", new Object[]{this, str, str2, str3, map});
        } else {
            AlimamaAdvertising.instance().buildTanxClickArrayTracking(str).c(str2).b(str3).d(map).a();
        }
    }

    public final void f(String str, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497ea888", new Object[]{this, str, map, map2});
        } else {
            AlimamaAdvertising.instance().buildTanxEventTracking(Globals.getApplication(), str).b("tb_splash").d(map).e(map2).a();
        }
    }

    public final void g(String str, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd2dd274", new Object[]{this, str, map, map2});
        } else {
            AlimamaAdvertising.instance().buildTanxClickTracking(Globals.getApplication(), str).b("tb_splash").c(map).d(map2).a();
        }
    }

    public final void h(String str, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaa75c68", new Object[]{this, str, map, map2});
        } else {
            AlimamaAdvertising.instance().buildTanxImpTracking(Globals.getApplication(), str).b("tb_splash").c(map).d(map2).a();
        }
    }

    public final JSONObject i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a4216bc4", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject("advClientParam");
    }

    public final Map<String, String> j(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("76a5be4", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap(1);
        JSONObject i = i(jSONObject);
        if (i == null || (jSONObject2 = i.getJSONObject("monitorArgs")) == null) {
            return hashMap;
        }
        try {
            return (Map) JSON.parseObject(jSONObject2.toJSONString(), Map.class);
        } catch (Throwable unused) {
            return hashMap;
        }
    }

    public final Map<String, String> k(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("588b5925", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap(2);
        JSONObject i = i(jSONObject);
        if (i == null || (jSONObject2 = i.getJSONObject("utArgs")) == null) {
            return hashMap;
        }
        try {
            return (Map) JSON.parseObject(jSONObject2.toJSONString(), Map.class);
        } catch (Throwable unused) {
            return hashMap;
        }
    }
}
