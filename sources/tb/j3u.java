package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j3u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792530);
    }

    public static g3u a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g3u) ipChange.ipc$dispatch("97e2e569", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            b4p.b("TopBarParser", "parseCellBean:subListCellObject is null");
            return null;
        }
        g3u g3uVar = new g3u();
        g3uVar.f19714a = jSONObject.optString("showText");
        g3uVar.b = jSONObject.optString("tailText");
        g3uVar.d = jSONObject.optString("promptText");
        g3uVar.c = jSONObject.optString("topText");
        g3uVar.e = jSONObject.optBoolean(mf6.TYPE_SELECTED);
        g3uVar.f = jSONObject.optString("trace");
        g3uVar.g = c(jSONObject.optJSONArray("params"));
        g3uVar.h = b(jSONObject.optJSONArray("subData"));
        g(new HashMap(), jSONObject);
        return g3uVar;
    }

    public static a3u d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3u) ipChange.ipc$dispatch("f2ff7410", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            b4p.b("TopBarParser", "parseSingleTopBarCell:cellObject为空");
            return null;
        }
        a3u a3uVar = new a3u();
        a3uVar.f15530a = jSONObject.optString("type");
        a3uVar.b = jSONObject.optString("showText");
        a3uVar.c = jSONObject.optBoolean(mf6.TYPE_SELECTED);
        a3uVar.h = jSONObject.optString("trace");
        a3uVar.k = jSONObject.optBoolean("disableStyleChange");
        JSONObject optJSONObject = jSONObject.optJSONObject(m09.ICON_RENDER);
        if (optJSONObject != null) {
            a3uVar.e = optJSONObject.optString("img_normal");
            a3uVar.g = optJSONObject.optString("img_active");
            a3uVar.f = optJSONObject.optString("img_transparent_normal");
        }
        a3uVar.i = c(jSONObject.optJSONArray("params"));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("subList");
        if (optJSONObject2 != null) {
            f3u f3uVar = new f3u();
            f3uVar.f18984a = optJSONObject2.optString("tItemType");
            f3uVar.b = b(optJSONObject2.optJSONArray("data"));
            a3uVar.j = f3uVar;
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("style");
        if (optJSONObject3 != null) {
            optJSONObject3.optString("normalTextColor");
            optJSONObject3.optString("normalBgColor");
            optJSONObject3.optString("normalBorderColor");
            optJSONObject3.optString("selectedTextColor");
            optJSONObject3.optString("selectedBgColor");
            optJSONObject3.optString("selectedBorderColor");
            optJSONObject3.optString("icon");
            optJSONObject3.optBoolean("bold");
        }
        g(new HashMap(), jSONObject);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("showImage");
        if (optJSONObject4 != null) {
            a3uVar.m = optJSONObject4.optString("normalUrl");
            a3uVar.n = optJSONObject4.optString("activeUrl");
            int optInt = optJSONObject4.optInt("width");
            int optInt2 = optJSONObject4.optInt("height");
            if (optInt2 > 0) {
                a3uVar.o = (int) ((optInt / optInt2) * o1p.b(22));
            }
        }
        return a3uVar;
    }

    public static z2u e(JSONObject jSONObject, a9u a9uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z2u) ipChange.ipc$dispatch("da357e2e", new Object[]{jSONObject, a9uVar});
        }
        if (jSONObject == null) {
            b4p.b("TopBarParser", "parse:topBarObject为空");
            return null;
        }
        z2u z2uVar = new z2u();
        f(z2uVar, jSONObject, a9uVar);
        g(new HashMap(), jSONObject);
        z2uVar.f32504a = jSONObject.optBoolean("showFilter");
        z2uVar.e = jSONObject.optString("filterItemType");
        z2uVar.b = jSONObject.optBoolean("showStyle");
        jSONObject.optBoolean("needRefresh");
        z2uVar.d = jSONObject.optString("filterTitle");
        z2uVar.c = jSONObject.optBoolean("refreshAuction");
        return z2uVar;
    }

    public static void g(Map<String, String> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe2dc0a", new Object[]{map, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("traceMap");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = optJSONObject.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                    map.put(next, optString);
                }
            }
        }
    }

    public static List<g3u> b(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a2eab2af", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            b4p.b("TopBarParser", "parseTopBarDropList:subListArray为空");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            g3u a2 = a(jSONArray.optJSONObject(i));
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public static Map<String, String> c(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("58ab036f", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                hashMap.put(optJSONObject.optString("key"), optJSONObject.optString("value"));
            }
        }
        return hashMap;
    }

    public static void f(z2u z2uVar, JSONObject jSONObject, a9u a9uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50794cc2", new Object[]{z2uVar, jSONObject, a9uVar});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("main");
        if (optJSONArray == null) {
            optJSONArray = jSONObject.optJSONArray("data");
        }
        if (optJSONArray == null || optJSONArray.length() == 0) {
            b4p.b("TopBarParser", "parseTopBarCellList:cellList为空");
            return;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            a3u d = d(optJSONArray.optJSONObject(i));
            if (d != null) {
                sb.append(d.b);
                sb.append("/");
                if (!TextUtils.equals(d.f15530a, "botSearch")) {
                    arrayList.add(d);
                }
            }
        }
        if (a9uVar != null) {
            a9uVar.f15618a = sb.toString();
        }
        z2uVar.f = arrayList;
    }
}
