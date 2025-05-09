package tb;

import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.taobao.adapter.extension.performance.model.AURAPerformanceStageModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class fn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f19415a;

    static {
        t2o.a(81789191);
    }

    public fn(AURAParseIO aURAParseIO) {
        JSONObject b;
        JSONObject jSONObject;
        List<rl> data = aURAParseIO.getData();
        if (!bh.a(data) && (b = data.get(0).b()) != null && (jSONObject = b.getJSONObject("global")) != null) {
            this.f19415a = jSONObject.getJSONObject("performanceStage");
        }
    }

    public final Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a78eb88c", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            hashMap.put(str, jSONObject.getString(str));
        }
        return hashMap;
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8b2b7c5a", new Object[]{this});
        }
        JSONObject jSONObject = this.f19415a;
        if (jSONObject == null) {
            return null;
        }
        return a(jSONObject.getJSONObject("commonArgs"));
    }

    public List<AURAPerformanceStageModel> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("44b610d5", new Object[]{this});
        }
        JSONObject jSONObject = this.f19415a;
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("stages");
        if (bh.a(jSONArray)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                try {
                    arrayList.add(JSON.toJavaObject((JSONObject) next, AURAPerformanceStageModel.class));
                } catch (Exception e) {
                    rbb g = ck.g();
                    g.f("解析服务端透传性能数据结构出错:" + e.getMessage(), ck.b.b().l("AURAServerPerformanceModel").a());
                }
            }
        }
        return arrayList;
    }
}
