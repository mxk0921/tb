package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.event.adjust.judge.dataChange")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wj extends is {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789116);
    }

    public static /* synthetic */ Object ipc$super(wj wjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/linkage/AURALinkageAdjustJudgeExtension");
    }

    public final JSONObject J0(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6dab4911", new Object[]{this, jSONObject, str});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 == null) {
            return null;
        }
        return jSONObject2.getJSONObject(str);
    }

    public final boolean K0(JSONObject jSONObject, JSONObject jSONObject2, List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6f756ff", new Object[]{this, jSONObject, jSONObject2, list})).booleanValue();
        }
        for (AURARenderComponent aURARenderComponent : list) {
            String str = aURARenderComponent.key;
            if (!TextUtils.isEmpty(str)) {
                JSONObject J0 = J0(jSONObject, str);
                JSONObject J02 = J0(jSONObject2, str);
                if (J0 == null || J02 == null || O0(J0, J02, m0())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean L0(UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26e0e75b", new Object[]{this, uMFLinkageTrigger})).booleanValue();
        }
        return Boolean.parseBoolean(uMFLinkageTrigger.getNeedAdjustOptimize());
    }

    public final boolean M0(Object obj, Object obj2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("956f88ae", new Object[]{this, obj, obj2, map})).booleanValue();
        }
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            return O0((JSONObject) obj, (JSONObject) obj2, map);
        }
        if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
            return !obj.equals(obj2);
        }
        return N0((JSONArray) obj, (JSONArray) obj2, map);
    }

    public final boolean N0(JSONArray jSONArray, JSONArray jSONArray2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11e33ead", new Object[]{this, jSONArray, jSONArray2, map})).booleanValue();
        }
        if (jSONArray.size() != jSONArray2.size()) {
            return true;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            if (M0(jSONArray.get(i), jSONArray2.get(i), map)) {
                return true;
            }
        }
        return false;
    }

    public final boolean O0(JSONObject jSONObject, JSONObject jSONObject2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e38f1200", new Object[]{this, jSONObject, jSONObject2, map})).booleanValue();
        }
        P0(jSONObject);
        P0(jSONObject2);
        if (jSONObject.keySet().size() != jSONObject2.keySet().size()) {
            for (String str : jSONObject.keySet()) {
                if (!jSONObject2.containsKey(str)) {
                    return true;
                }
            }
            for (String str2 : jSONObject2.keySet()) {
                String string = jSONObject2.getString(str2);
                if (!(jSONObject.containsKey(str2) || string == null || string.equals(map.get(str2)))) {
                    return true;
                }
            }
        }
        for (String str3 : jSONObject.keySet()) {
            if (M0(jSONObject.get(str3), jSONObject2.get(str3), map)) {
                return true;
            }
        }
        return false;
    }

    public final void P0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9e5c47", new Object[]{this, jSONObject});
            return;
        }
        Iterator<Map.Entry<String, Object>> it = jSONObject.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue() == null) {
                it.remove();
            }
        }
    }

    public final Map<String, String> m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d7db462c", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("optional", "force");
        return hashMap;
    }

    @Override // tb.is
    public boolean L(UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8d1f9f7", new Object[]{this, uMFLinkageTrigger})).booleanValue();
        }
        if (!xk.a("enableAdjustOptimize", false) || !L0(uMFLinkageTrigger)) {
            return true;
        }
        List<AURARenderComponent> list = (List) x().get("render_view_item_models", List.class);
        JSONObject jSONObject = (JSONObject) x().get("floatRawProtocol", JSONObject.class);
        JSONObject jSONObject2 = (JSONObject) x().get("aura_data_protocol_json", JSONObject.class);
        if (list == null || jSONObject == null || jSONObject2 == null) {
            return true;
        }
        return K0(jSONObject, jSONObject2, list);
    }
}
