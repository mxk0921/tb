package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nha {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699167);
    }

    public static void a(Map<String, String> map) {
        Map<String, String> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32028fc", new Object[]{map});
            return;
        }
        g2e D = v2s.o().D();
        if (!(D == null || (e = D.e()) == null)) {
            for (Map.Entry<String, String> entry : e.entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public static void b(JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a850f4ad", new Object[]{jSONObject, map});
        } else if (wda.j().booleanValue() && jSONObject != null) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("carouselListV3");
                if (jSONArray != null && !jSONArray.isEmpty()) {
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof JSONObject) {
                            String string = ((JSONObject) next).getString("type");
                            f("request_liveitemtopinfo_" + string, map);
                        }
                    }
                }
            } catch (Exception e) {
                hha.b("GoodsMonitorUtils", e.toString());
            }
        }
    }

    public static void c(ItemlistV2ResponseData itemlistV2ResponseData, Map<String, String> map) {
        ItemlistV2ResponseData.TopCardItem topCardItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd0e1e69", new Object[]{itemlistV2ResponseData, map});
        } else if (wda.q().booleanValue() && itemlistV2ResponseData != null && (topCardItem = itemlistV2ResponseData.popLayerEntance) != null) {
            String str = topCardItem.type;
            f("request_popLayerEntance_" + str, map);
        }
    }

    public static void d(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8f6f9a", new Object[]{str, map});
        } else if (wda.v().booleanValue()) {
            f(str, map);
        }
    }

    public static void e(JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2842b3", new Object[]{jSONObject, map});
        } else if (wda.t().booleanValue() && jSONObject != null) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("rightsList");
                JSONObject jSONObject2 = jSONObject.getJSONObject("separateRight");
                if (jSONArray != null && !jSONArray.isEmpty()) {
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof JSONObject) {
                            JSONObject jSONObject3 = (JSONObject) next;
                            String string = jSONObject3.getString("type");
                            JSONObject jSONObject4 = jSONObject3.getJSONObject("utParams");
                            HashMap hashMap = new HashMap();
                            hashMap.putAll(map);
                            hashMap.putAll(m3s.b(jSONObject4));
                            f("request_right_" + string, hashMap);
                        }
                    }
                }
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    String string2 = jSONObject2.getString("type");
                    JSONObject jSONObject5 = jSONObject2.getJSONObject("utParams");
                    HashMap hashMap2 = new HashMap();
                    hashMap2.putAll(map);
                    hashMap2.putAll(m3s.b(jSONObject5));
                    f("request_right_" + string2, hashMap2);
                }
            } catch (Exception e) {
                hha.b("GoodsMonitorUtils", e.toString());
            }
        }
    }

    public static void f(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a17684", new Object[]{str, map});
        } else if (wda.C().booleanValue() && !TextUtils.isEmpty(str)) {
            try {
                if (v2s.o().s() != null && !TextUtils.isEmpty(str)) {
                    if (map == null) {
                        map = new HashMap<>();
                    }
                    a(map);
                    v2s.o().s().a(str, "Page_TaobaoLiveWatch", map);
                }
            } catch (Exception e) {
                hha.b("GoodsMonitorUtils", e.toString());
            }
        }
    }

    public static void g(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4689e69", new Object[]{str, map});
        } else if (wda.s().booleanValue()) {
            try {
                v2s.o().E().track4Click("Page_TaobaoLiveWatch", str, map);
            } catch (Exception e) {
                hha.b("GoodsMonitorUtils", e.toString());
            }
        }
    }

    public static void h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793214f3", new Object[]{map});
        } else {
            g("tlglMonitor", map);
        }
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14f4395e", new Object[0]);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("monitorKey", "tlgl_itemHold_insideDetail");
        g("tlglMonitor", hashMap);
    }

    public static void j(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3542a6ce", new Object[]{new Integer(i), new Integer(i2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("monitorKey", "tlgl_urltron_dx_download");
        hashMap.put("finishCount", String.valueOf(i));
        hashMap.put("failedCount", String.valueOf(i2));
        h(hashMap);
    }

    public static void k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262fdb95", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("monitorKey", str);
        hashMap.put("monitorStatus", "-1");
        hashMap.put("errorInfo", str2);
        h(hashMap);
    }

    public static void l(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16da9642", new Object[]{map});
        } else if (map != null) {
            map.put("monitorKey", "tlgl_lv_config_hit");
            h(map);
        }
    }

    public static void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c1119f8", new Object[]{str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("monitorKey", "tlgl_goodsIsNotCurrentLive");
        hashMap.put("pmTypeStr", str);
        h(hashMap);
    }

    public static void n(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b496900", new Object[]{map});
        } else if (map != null) {
            map.put("monitorKey", "tlgl_ultron_render_error");
            h(map);
        }
    }

    public static void o(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1250d5", new Object[]{str, new Integer(i)});
            return;
        }
        String valueOf = String.valueOf(i);
        HashMap hashMap = new HashMap();
        hashMap.put("monitorKey", str);
        hashMap.put("monitorStatus", valueOf);
        h(hashMap);
    }

    public static void p(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f8bfb5", new Object[]{new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("monitorKey", "tlgl_config_task_error");
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        hashMap.put("isShutdown", str);
        h(hashMap);
    }
}
