package tb;

import android.text.TextUtils;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class wr0 extends xs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301989951);
    }

    public static /* synthetic */ Object ipc$super(wr0 wr0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/ability/AlibuySequenceDataExtension");
    }

    @Override // tb.xs
    public ExecuteResult f(JSONObject jSONObject, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("8431950a", new Object[]{this, jSONObject, vqVar});
        }
        JSONObject j = j();
        if (j == null) {
            ck.g().d("fields is null");
            return null;
        }
        String string = j.getString("id");
        String k = k(j, string);
        if (TextUtils.isEmpty(k)) {
            ck.g().d("循环导航，未找到目标组件");
            vqVar.c(new FinishResult(new HashMap(jSONObject), "failure"));
        } else {
            HashMap hashMap = new HashMap(jSONObject);
            hashMap.put("result", k);
            vqVar.c(new FinishResult(hashMap, "success"));
            g(string, k);
        }
        return new FinishResult();
    }

    public final void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ced0900", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            JSONObject i = i(e());
            if (i == null) {
                i = new JSONObject();
            }
            i.put(str, (Object) str2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("curLocatorInfo", (Object) i.toJSONString());
            l(b().c(), e(), jSONObject);
        }
    }

    public final Object h(List<Object> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9eaf755a", new Object[]{this, list, str});
        }
        if (TextUtils.isEmpty(str)) {
            return list.get(0);
        }
        int size = list.size();
        for (int i = 0; size > i; i++) {
            if (str.equals(list.get(i))) {
                int i2 = i + 1;
                if (size > i2) {
                    return list.get(i2);
                }
                return list.get(0);
            }
        }
        return list.get(0);
    }

    public final JSONObject i(AURARenderComponent aURARenderComponent) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3acbb7ba", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null || (map = aURARenderComponentData.fields) == null) {
            return null;
        }
        Object obj = map.get("curLocatorInfo");
        if (obj instanceof String) {
            return tj.a((String) obj);
        }
        return null;
    }

    public final JSONObject j() {
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

    public final String k(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a8cf4ae", new Object[]{this, jSONObject, str});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("componentKeys");
        if (bh.a(jSONArray)) {
            return null;
        }
        JSONObject i = i(e());
        if (i != null) {
            return (String) h(jSONArray, i.getString(str));
        }
        return (String) h(jSONArray, null);
    }

    public final void l(nbb nbbVar, AURARenderComponent aURARenderComponent, JSONObject jSONObject) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c684314c", new Object[]{this, nbbVar, aURARenderComponent, jSONObject});
            return;
        }
        rxu rxuVar = new rxu();
        rxuVar.f27667a = RuleType.PROPS_WRITE_BACK;
        rxuVar.b = aURARenderComponent.key;
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        Map<String, Object> map = aURARenderComponentData == null ? null : aURARenderComponentData.fields;
        rxuVar.d = new ym(map, aURARenderComponentData == null ? null : aURARenderComponentData.events, null);
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = new HashMap();
        }
        hashMap.putAll(jSONObject);
        rxuVar.c = new ym(hashMap, null, null);
        nbbVar.c("aura.workflow.adjustRules", new UMFRuleIO(Collections.singletonList(rxuVar)), null);
    }
}
