package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.mqu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class wn2 {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(918552712);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final void a(qpu qpuVar, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, String str) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("157fdc27", new Object[]{this, qpuVar, map, map2, str});
                return;
            }
            ckf.g(qpuVar, "turboEngineContext");
            ckf.g(str, "type");
            Object obj2 = null;
            Object obj3 = map != null ? map.get("content") : null;
            if (!(obj3 instanceof Map)) {
                obj3 = null;
            }
            Map map3 = (Map) obj3;
            Object obj4 = map3 != null ? map3.get("id") : null;
            if (!(obj4 instanceof String)) {
                obj4 = null;
            }
            String str2 = (String) obj4;
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            mqu.a aVar = mqu.Companion;
            Map<String, Object> h = aVar.h(map2 != null ? map2.get("item") : null, null);
            Map t = h != null ? kotlin.collections.a.t(h) : null;
            Object obj5 = t != null ? t.get("itemId") : null;
            if (!(obj5 instanceof String)) {
                obj5 = null;
            }
            String str4 = (String) obj5;
            if (str4 == null) {
                str4 = str3;
            }
            if (map2 != null && map2.containsKey("index")) {
                int d = aVar.d(map2.get("index"), 0);
                List<?> f = aVar.f(map3 != null ? map3.get("itemInfos") : null, null);
                if (!(f == null || (obj = f.get(d)) == null || !(obj instanceof Map))) {
                    Map map4 = (Map) obj;
                    if (map4.get("businessInfo") != null && ((t == null || !t.containsKey("businessInfo")) && t != null)) {
                        Object obj6 = map4.get("businessInfo");
                        if (obj6 != null) {
                            t.put("businessInfo", obj6);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                        }
                    }
                }
            }
            Object obj7 = t != null ? t.get("businessInfo") : null;
            if (!(obj7 instanceof Map)) {
                obj7 = null;
            }
            Map map5 = (Map) obj7;
            Object obj8 = t != null ? t.get("sellerId") : null;
            if (!(obj8 instanceof String)) {
                obj8 = null;
            }
            String str5 = (String) obj8;
            if (str5 == null) {
                Object obj9 = map5 != null ? map5.get("sellerId") : null;
                if (!(obj9 instanceof String)) {
                    obj9 = null;
                }
                str5 = (String) obj9;
            }
            if (str5 == null) {
                str5 = str3;
            }
            Object obj10 = t != null ? t.get(gat.TCP_BID) : null;
            if (!(obj10 instanceof String)) {
                obj10 = null;
            }
            String str6 = (String) obj10;
            if (str6 == null) {
                Object obj11 = map5 != null ? map5.get(gat.TCP_BID) : null;
                if (!(obj11 instanceof String)) {
                    obj11 = null;
                }
                str6 = (String) obj11;
            }
            if (str6 != null) {
                str3 = str6;
            }
            String pageName = ((d2e) qpuVar.getService(d2e.class)).getPageName();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, Object> h2 = aVar.h(t != null ? t.get("businessInfo") : null, null);
            if (h2 != null) {
                linkedHashMap.putAll(h2);
            }
            linkedHashMap.put("appName", "taobao");
            linkedHashMap.put("livesource", pageName);
            linkedHashMap.put("track_source", pageName);
            linkedHashMap.put("itemId", str4);
            linkedHashMap.put("businessScene", "card");
            linkedHashMap.put("functionScene", str);
            linkedHashMap.put("itemCount", "1");
            linkedHashMap.put("track_sub_source", "107177");
            Object obj12 = t != null ? t.get("businessInfo") : null;
            if (!(obj12 instanceof Map)) {
                obj12 = null;
            }
            Map map6 = (Map) obj12;
            if (map6 != null) {
                Object obj13 = map6.get(gat.BIZ_TYPE);
                obj2 = obj13 == null ? map6.get("businessSceneId") : obj13;
                if (obj2 != null) {
                    linkedHashMap.put("businessSceneId", obj2);
                }
            }
            ((ikb) qpuVar.getService(ikb.class)).E0(new JSONObject(kotlin.collections.a.j(jpu.a(gat.ACCOUNT_ID, -1), jpu.a("itemId", str4), jpu.a("contentId", str2), jpu.a(gat.CT, 1), jpu.a(gat.SID, str5), jpu.a(gat.BIZ_TYPE, obj2), jpu.a(gat.TCP_BID, str3), jpu.a("sourceType", 2), jpu.a("extObject", linkedHashMap), jpu.a("context", linkedHashMap))));
        }
    }

    static {
        t2o.a(918552711);
    }
}
