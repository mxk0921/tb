package tb;

import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class as0 extends xs {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public yr0 f15969a = null;
        public AURARenderComponent b = null;

        static {
            t2o.a(301989957);
        }
    }

    static {
        t2o.a(301989956);
    }

    public static /* synthetic */ Object ipc$super(as0 as0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/ability/validate/AlibuyValidatesExtension");
    }

    @Override // tb.xs
    public ExecuteResult f(JSONObject jSONObject, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("8431950a", new Object[]{this, jSONObject, vqVar});
        }
        JSONObject h = h();
        if (h == null) {
            ck.g().d("fields is null");
            return null;
        }
        a i = i(g(), h.getJSONArray("componentKeys"));
        yr0 yr0Var = i.f15969a;
        if (yr0Var == null || yr0Var.c()) {
            vqVar.c(new FinishResult(null, "failure"));
        } else {
            HashMap hashMap = new HashMap(jSONObject);
            hashMap.put("result", i.b.key);
            vqVar.c(new FinishResult(hashMap, "success"));
        }
        return new FinishResult();
    }

    public final List<AURARenderComponent> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9f56a17b", new Object[]{this});
        }
        if (d() != null) {
            return (List) d().get("render_view_item_models", List.class);
        }
        return null;
    }

    public final JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c1e22f1d", new Object[]{this});
        }
        Object[] c = c();
        if (c == null) {
            return null;
        }
        Object obj = c[1];
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        ck.g().d("fields is null");
        return null;
    }

    public final a i(List<AURARenderComponent> list, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b8df5f71", new Object[]{this, list, jSONArray});
        }
        a aVar = new a();
        if (list != null && !bh.a(jSONArray)) {
            Iterator<AURARenderComponent> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AURARenderComponent next = it.next();
                yr0 j = j(next, jSONArray);
                if (!j.c()) {
                    aVar.f15969a = j;
                    aVar.b = next;
                    break;
                }
            }
        }
        return aVar;
    }

    public final yr0 j(AURARenderComponent aURARenderComponent, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yr0) ipChange.ipc$dispatch("1a7a2b38", new Object[]{this, aURARenderComponent, jSONArray});
        }
        if (!jSONArray.contains(aURARenderComponent.key)) {
            return yr0.a();
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            return yr0.a();
        }
        return xr0.d(aURARenderComponentData.fields, xr0.b(aURARenderComponentData.features));
    }
}
