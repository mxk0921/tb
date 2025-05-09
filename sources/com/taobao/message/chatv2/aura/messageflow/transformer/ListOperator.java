package com.taobao.message.chatv2.aura.messageflow.transformer;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ListOperator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(551550985);
    }

    public static JSONObject moveRecyclerLayoutHeader(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("968fac18", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "moveRecyclerLayoutHeader");
        jSONObject.put("widgetNodeId", (Object) str);
        return jSONObject;
    }

    public static JSONObject scrollBottom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7374cf09", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "scrollBottom");
        jSONObject.put("widgetNodeId", (Object) str);
        return jSONObject;
    }

    public static JSONObject scrollOffset(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a2754bf2", new Object[]{str, new Integer(i)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "scrollOffset");
        jSONObject.put("widgetNodeId", (Object) str);
        jSONObject.put(yj4.PARAM_SEARCH_KEYWORD_POS, (Object) Integer.valueOf(i));
        return jSONObject;
    }

    public static JSONObject shimmerItem(String str, List<Integer> list, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1dac0da0", new Object[]{str, list, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "shimmerItem");
        jSONObject.put("widgetNodeId", (Object) str);
        JSONArray jSONArray = new JSONArray();
        jSONArray.addAll(list);
        jSONObject.put("list", (Object) jSONArray);
        jSONObject.put("partShimmerNodeId", (Object) str2);
        return jSONObject;
    }

    public static JSONObject updateLoadMoreStatus(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ca836991", new Object[]{str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "updateLoadMoreStatus");
        jSONObject.put("widgetNodeId", (Object) str);
        jSONObject.put("status", (Object) str2);
        return jSONObject;
    }

    public static JSONObject updatePullLoadMoreStatus(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("773aadb6", new Object[]{str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "updatePullLoadMoreStatus");
        jSONObject.put("widgetNodeId", (Object) str);
        jSONObject.put("status", (Object) str2);
        return jSONObject;
    }

    public static JSONObject updateRecyclerLayoutHeader(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d097c20", new Object[]{str, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", (Object) "updateRecyclerLayoutHeader");
        jSONObject2.put("widgetNodeId", (Object) str);
        jSONObject2.put("data", (Object) jSONObject);
        return jSONObject2;
    }

    public static JSONObject scrollOffset(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cc3c8762", new Object[]{str, new Integer(i), new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "scrollOffset");
        jSONObject.put("widgetNodeId", (Object) str);
        jSONObject.put(yj4.PARAM_SEARCH_KEYWORD_POS, (Object) Integer.valueOf(i));
        jSONObject.put("animation", (Object) Boolean.valueOf(z));
        return jSONObject;
    }

    public static JSONObject scrollOffset(String str, int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("db5cb9f2", new Object[]{str, new Integer(i), new Boolean(z), new Boolean(z2)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "scrollOffset");
        jSONObject.put("widgetNodeId", (Object) str);
        jSONObject.put(yj4.PARAM_SEARCH_KEYWORD_POS, (Object) Integer.valueOf(i));
        jSONObject.put("animation", (Object) Boolean.valueOf(z));
        jSONObject.put("delay", (Object) Boolean.valueOf(z2));
        return jSONObject;
    }
}
