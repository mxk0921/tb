package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.navigation.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.xpj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class iof {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static xpj.b a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpj.b) ipChange.ipc$dispatch("5781ffad", new Object[]{bVar});
        }
        xpj.b bVar2 = new xpj.b();
        bVar2.f(bVar.f()).g(bVar.g()).h("").i(bVar.j()).k(bVar.k().second).m(bVar.k().first).l(bVar.l().ordinal()).r(bVar.v()).n(bVar.y()).o("").p("").q(bVar.m()).s("");
        return bVar2;
    }

    public static xpj b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpj) ipChange.ipc$dispatch("831e452c", new Object[]{bVar});
        }
        if (bVar != null) {
            return a(bVar).a();
        }
        jhj.b("ItemInfoUtil", "getTabInfoFromTab failed. tab is null");
        return null;
    }

    public static xpj c(b bVar, tqs tqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpj) ipChange.ipc$dispatch("14ab554a", new Object[]{bVar, tqsVar});
        }
        if (bVar == null) {
            jhj.b("ItemInfoUtil", "getTabInfoFromTab failed. tab is null");
            return null;
        }
        xpj a2 = a(bVar).c(tqsVar.j()).d(tqsVar.k()).j(tqsVar.m()).e(tqsVar.l()).k(Integer.valueOf(tqsVar.n().second.hashCode())).m(Integer.valueOf(tqsVar.n().first.hashCode())).a();
        a2.Z(String.valueOf(System.currentTimeMillis()));
        return a2;
    }

    public static JSONObject d(xpj xpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("24ab55f8", new Object[]{xpjVar});
        }
        JSONObject jSONObject = new JSONObject();
        if (xpjVar == null) {
            jhj.b("ItemInfoUtil", "tab config is null");
            return jSONObject;
        }
        jSONObject.put("nav_tab_icon_selected", xpjVar.L());
        jSONObject.put("nav_tab_icon_unselected", xpjVar.O());
        jSONObject.put("nav_tab_icon_type", (Object) Integer.valueOf(xpjVar.N()));
        jSONObject.put("nav_tab_index", (Object) Integer.valueOf(xpjVar.S()));
        jSONObject.put("nav_tab_title", (Object) xpjVar.T());
        jSONObject.put("nav_tab_fragment_name", (Object) xpjVar.I());
        jSONObject.put("nav_tab_biz_code", (Object) xpjVar.E());
        jSONObject.put("nav_tab_apply_tab_host_version", (Object) Integer.valueOf(xpjVar.D()));
        jSONObject.put("nav_tab_filter_mode", (Object) Integer.valueOf(xpjVar.J()));
        jSONObject.put("nav_tab_apply_style_type", (Object) Integer.valueOf(xpjVar.C()));
        jSONObject.put("nav_tab_cache_icon_id", (Object) xpjVar.K());
        return jSONObject;
    }

    public static String e(xpj xpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da7a286b", new Object[]{xpjVar});
        }
        return d(xpjVar).toJSONString();
    }

    public static String f(Map<String, xpj> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34ab13e", new Object[]{map});
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String str : map.keySet()) {
            jSONArray.add(e(map.get(str)));
        }
        jSONObject.put("nav_tab_configs", (Object) jSONArray);
        return jSONObject.toJSONString();
    }

    public static String g(Map<String, List<xpj>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee6927e8", new Object[]{map});
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String str : map.keySet()) {
            for (xpj xpjVar : map.get(str)) {
                jSONArray.add(d(xpjVar));
            }
        }
        jSONObject.put("nav_tab_configs_with_version", (Object) jSONArray);
        return jSONObject.toJSONString();
    }

    public static Map<String, List<xpj>> i(String str) {
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("18fbfdc8", new Object[]{str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                jhj.b("ItemInfoUtil", " parseTabFromJson failed. tabJsonInfo string is null");
                return null;
            }
            jhj.b("ItemInfoUtil", "parse tab json info: " + str);
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject == null) {
                jhj.b("ItemInfoUtil", " parseTabFromJson failed. jsonTabs is null");
                return null;
            }
            JSONArray jSONArray = parseObject.getJSONArray("nav_tab_configs_with_version");
            if (jSONArray != null && !jSONArray.isEmpty()) {
                HashMap hashMap = new HashMap(jSONArray.size());
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if ((next instanceof JSONObject) && (string = (jSONObject = (JSONObject) next).getString("nav_tab_biz_code")) != null) {
                        List list = (List) hashMap.get(string);
                        if (list == null) {
                            list = new ArrayList();
                            hashMap.put(string, list);
                        }
                        xpj b = new xpj.b().q(jSONObject.getInteger("nav_tab_index").intValue()).r(jSONObject.getString("nav_tab_title")).m(jSONObject.getInteger("nav_tab_icon_unselected")).k(jSONObject.getInteger("nav_tab_icon_selected")).j(jSONObject.getInteger("nav_tab_filter_mode").intValue()).i(jSONObject.getString("nav_tab_fragment_name")).c(jSONObject.getIntValue("nav_tab_apply_style_type")).d(jSONObject.getIntValue("nav_tab_apply_tab_host_version")).e(string).l(jSONObject.getIntValue("nav_tab_icon_type")).b();
                        b.Z(jSONObject.getString("nav_tab_cache_icon_id"));
                        list.add(b);
                    }
                }
                return hashMap;
            }
            jhj.b("ItemInfoUtil", " parseTabFromJson failed. jsonArray is null");
            return null;
        } catch (Exception e) {
            jhj.b("ItemInfoUtil", " parseTabFromJson failed. exception is " + e + " error str is " + str);
            rpj.a("cache_error", e.toString());
            return null;
        }
    }

    public static boolean j(xpj xpjVar, xpj xpjVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eed636b9", new Object[]{xpjVar, xpjVar2})).booleanValue();
        }
        if (xpjVar == null || xpjVar2 == null || xpjVar.S() != xpjVar2.S() || !TextUtils.equals(xpjVar.T(), xpjVar2.T()) || xpjVar.L() != xpjVar2.L() || xpjVar.O() != xpjVar2.O() || !TextUtils.equals(xpjVar.I(), xpjVar2.I()) || xpjVar.N() != xpjVar2.N()) {
            return false;
        }
        return true;
    }

    public static Map<String, xpj> h(String str) {
        JSONObject parseObject;
        Integer integer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c43c72ba", new Object[]{str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                jhj.b("ItemInfoUtil", " parseTabFromJson failed. tabJsonInfo string is null");
                return null;
            }
            jhj.b("ItemInfoUtil", "parse tab json info: " + str);
            JSONObject parseObject2 = JSON.parseObject(str);
            if (parseObject2 == null) {
                jhj.b("ItemInfoUtil", " parseTabFromJson failed. jsonTabs is null");
                return null;
            }
            JSONArray jSONArray = parseObject2.getJSONArray("nav_tab_configs");
            if (jSONArray == null) {
                jhj.b("ItemInfoUtil", " parseTabFromJson failed. jsonArray is null");
                return null;
            }
            HashMap hashMap = new HashMap(1);
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if ((next instanceof String) && (integer = (parseObject = JSON.parseObject((String) next)).getInteger("nav_tab_index")) != null) {
                    xpj.b bVar = new xpj.b();
                    bVar.q(integer.intValue()).r(parseObject.getString("nav_tab_title")).m(parseObject.get("nav_tab_icon_unselected")).k(parseObject.get("nav_tab_icon_selected")).i(parseObject.getString("nav_tab_fragment_name")).j(parseObject.getInteger("nav_tab_filter_mode").intValue()).l(parseObject.getIntValue("nav_tab_icon_type"));
                    hashMap.put(String.valueOf(integer), bVar.b());
                }
            }
            return hashMap;
        } catch (Exception e) {
            jhj.b("ItemInfoUtil", " parseTabFromJson failed. exception is " + e.toString() + " error str is " + str);
            StringBuilder sb = new StringBuilder();
            sb.append(e.toString());
            sb.append(str);
            rpj.a("cache_error", sb.toString());
            return null;
        }
    }
}
