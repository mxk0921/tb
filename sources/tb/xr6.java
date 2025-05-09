package tb;

import android.text.TextUtils;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class xr6 implements hdb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_DATA_SPLIT = "split";
    public static final a Companion = new a(null);
    public static final long DATA_PROCESS_ENGINE = -6435166934211554155L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public final b8 a(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8) ipChange.ipc$dispatch("1a6d1799", new Object[]{this, new Integer(i), str, new Boolean(z)});
        }
        return new b8(new a8(i, str), z);
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        if (!ckf.b(str, "split")) {
            return new ErrorResult("501");
        }
        List<Object> n = MegaUtils.n(map, "dataSourceArray");
        if (!(n instanceof JSONArray)) {
            ExecuteResult f = pr.f(a(-10010, "dataSourceArray is null or is not jsonArray", true));
            ckf.f(f, "AbilityUtils.toMegaResul…is not jsonArray\", true))");
            return f;
        }
        List<Object> n2 = MegaUtils.n(map, "splitRules");
        if (!(n2 instanceof JSONArray)) {
            ExecuteResult f2 = pr.f(a(-10010, "splitRule is null or is not jsonArray", true));
            ckf.f(f2, "AbilityUtils.toMegaResul…is not jsonArray\", true))");
            return f2;
        }
        int size = n.size();
        JSONArray jSONArray = new JSONArray(n2.size() * size);
        for (int i = 0; i < size; i++) {
            Object obj = n.get(i);
            if (obj instanceof JSONObject) {
                for (Object obj2 : n2) {
                    if (obj2 instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) obj2;
                        if (!TextUtils.isEmpty(jSONObject.getString(hpl.VIEW_TYPE))) {
                            Boolean bool = jSONObject.getBoolean("isSplit");
                            if (bool == null) {
                                bool = Boolean.TRUE;
                            }
                            if (bool.booleanValue()) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.putAll((Map) obj);
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.putAll((Map) obj2);
                                jSONObject3.put((JSONObject) "index", (String) Integer.valueOf(i));
                                jSONObject2.put((JSONObject) "__splitRule__", (String) jSONObject3);
                                jSONArray.add(jSONObject2);
                            }
                        }
                    }
                }
            }
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((JSONObject) "result", (String) jSONArray);
        ExecuteResult f3 = pr.f(new f8(jSONObject4));
        ckf.f(f3, "AbilityUtils.toMegaResul…nishedResult(resultJSON))");
        return f3;
    }
}
