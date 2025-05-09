package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import mtopsdk.mtop.intf.MtopPrefetch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class brm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16570a;
    public final String b;

    static {
        t2o.a(729809732);
    }

    public brm(String str, String str2) {
        this.f16570a = str;
        this.b = str2;
    }

    public static void a(z4a z4aVar, String str, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600fc16a", new Object[]{z4aVar, str, jSONObject, str2, str3});
        } else if (z4aVar != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            String a2 = n7l.a();
            if (!TextUtils.isEmpty(a2)) {
                jSONObject.put("experimentType", (Object) a2);
            }
            jSONObject.put("optimizeType", (Object) str2);
            jSONObject.put("from", (Object) str3);
            jSONObject.put("deviceLevel", (Object) m0b.d());
            uqa.b("recmdPrefetch", "commitCurrentStagePrefetch", str + ": " + jSONObject);
            r5a.j(z4aVar.c, 19999, "tradeInfoflowPrefetchRequest", z4aVar.f32522a, str, jSONObject);
        }
    }

    public void b(AwesomeGetRequestParams awesomeGetRequestParams, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af620d3a", new Object[]{this, awesomeGetRequestParams, str, map});
            return;
        }
        d(awesomeGetRequestParams, str, map, this.b, this.f16570a);
        g(awesomeGetRequestParams, str, map, this.b, this.f16570a);
    }

    public void c(AwesomeGetRequestParams awesomeGetRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aa9a47a", new Object[]{this, awesomeGetRequestParams});
            return;
        }
        e(awesomeGetRequestParams, this.b, this.f16570a);
        h(awesomeGetRequestParams, this.b, this.f16570a);
    }

    public final void d(AwesomeGetRequestParams awesomeGetRequestParams, String str, Map<String, String> map, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbd3ab9", new Object[]{this, awesomeGetRequestParams, str, map, str2, str3});
            return;
        }
        z4a c = z4a.c(f(awesomeGetRequestParams));
        if (c != null) {
            JSONObject jSONObject = new JSONObject();
            if ("TYPE_HIT".equals(str) || "TYPE_MERGE".equals(str)) {
                str4 = "success";
            } else {
                if (map != null) {
                    map.remove(MtopPrefetch.IPrefetchCallback.DATA_REQ_PARAM);
                    jSONObject.put("errorMsg", (Object) map);
                    jSONObject.put("errorCode", (Object) str);
                }
                str4 = "failed";
            }
            jSONObject.put("result", (Object) str4);
            a(c, "preRequestEnd", new JSONObject(jSONObject), str2, str3);
        }
    }

    public final void e(AwesomeGetRequestParams awesomeGetRequestParams, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5577d883", new Object[]{this, awesomeGetRequestParams, str, str2});
        } else {
            a(z4a.c(f(awesomeGetRequestParams)), "preRequestStart", null, str, str2);
        }
    }

    public final String f(AwesomeGetRequestParams awesomeGetRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6c9af25", new Object[]{this, awesomeGetRequestParams});
        }
        Set<String> keySet = awesomeGetRequestParams.containerParams.keySet();
        if (!keySet.isEmpty()) {
            return keySet.iterator().next();
        }
        return null;
    }

    public final void g(AwesomeGetRequestParams awesomeGetRequestParams, String str, Map<String, String> map, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1781ed5b", new Object[]{this, awesomeGetRequestParams, str, map, str2, str3});
            return;
        }
        z4a c = z4a.c(f(awesomeGetRequestParams));
        if (c != null) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                String str5 = map.get(MtopPrefetch.IPrefetchCallback.DATA_API);
                String str6 = map.get(MtopPrefetch.IPrefetchCallback.DATA_VERSION);
                if (!(str5 == null || str6 == null)) {
                    hashMap.put("apiName", str5);
                    hashMap.put("apiVersion", str6);
                }
            }
            if ("TYPE_HIT".equals(str) || "TYPE_MERGE".equals(str)) {
                str4 = "success";
            } else {
                if (map != null) {
                    map.remove(MtopPrefetch.IPrefetchCallback.DATA_REQ_PARAM);
                    hashMap.put("errorMsg", map.toString());
                    hashMap.put("errorCode", str);
                }
                str4 = "failed";
            }
            hashMap.put("result", str4);
            hashMap.put("concreteType", str);
            hashMap.put("optimizeType", str2);
            hashMap.put("from", str3);
            uqa.b("recmdPrefetch", "umbrellaTrackerWhenEnd", "receiveParams:" + hashMap);
            hrg.b(c.f32522a, "prefetchRequestResult", null, "infoflowPrefetchRequest", null, hashMap);
        }
    }

    public final void h(AwesomeGetRequestParams awesomeGetRequestParams, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c77221", new Object[]{this, awesomeGetRequestParams, str, str2});
            return;
        }
        z4a c = z4a.c(f(awesomeGetRequestParams));
        if (c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("optimizeType", str);
            hashMap.put("from", str2);
            uqa.b("recmdPrefetch", "umbrellaTrackerWhenStart", "receiveParams:" + hashMap);
            hrg.b(c.f32522a, "prefetchRequestStart", null, "infoflowPrefetchRequest", null, hashMap);
        }
    }
}
