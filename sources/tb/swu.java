package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.calander.DXOnSelectDateEvent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class swu implements t3e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f28331a;

    static {
        t2o.a(80740745);
        t2o.a(80740742);
    }

    public swu(String str) {
        this.f28331a = str;
    }

    @Override // tb.t3e
    public void a(AURARenderComponent aURARenderComponent, DXEvent dXEvent, Object[] objArr, Map<String, Object> map) {
        AURARenderComponentData aURARenderComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f14a738", new Object[]{this, aURARenderComponent, dXEvent, objArr, map});
        } else if ((dXEvent instanceof DXOnSelectDateEvent) && (aURARenderComponentData = aURARenderComponent.data) != null && aURARenderComponentData.fields != null) {
            HashMap hashMap = new HashMap(aURARenderComponent.data.fields);
            Map<String, String> data = ((DXOnSelectDateEvent) dXEvent).getData();
            if (data != null) {
                hashMap.putAll(data);
            }
            String str = (String) fk.b(hashMap, "selectedDate", String.class, null);
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = (JSONObject) fk.b(hashMap, "group", JSONObject.class, new JSONObject());
                c(hashMap, jSONObject, str);
                e((JSONObject) fk.b(hashMap, "disabled", JSONObject.class, null), jSONObject, str);
                jSONObject.put("selectedId", (Object) Collections.EMPTY_LIST);
                f(jSONObject);
            }
            map.putAll(hashMap);
        }
    }

    @Override // tb.t3e
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b15bf757", new Object[]{this});
        }
        return this.f28331a;
    }

    public final void c(Map<String, Object> map, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad49c97c", new Object[]{this, map, jSONObject, str});
            return;
        }
        JSONObject jSONObject2 = (JSONObject) fk.b(map, "itemsOption", JSONObject.class, null);
        if (jSONObject2 != null) {
            Object obj = jSONObject2.get(str);
            if (obj != null) {
                jSONObject.put("items", obj);
                return;
            }
            Object obj2 = jSONObject2.get("default");
            if (obj2 != null) {
                jSONObject.put("items", obj2);
            }
        }
    }

    public Class<? extends DXEvent> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f6fea672", new Object[]{this});
        }
        return DXOnSelectDateEvent.class;
    }

    public final void e(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5cc2e2e", new Object[]{this, jSONObject, jSONObject2, str});
        } else if (jSONObject != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray != null) {
                jSONObject2.put("disabled", (Object) jSONArray);
            } else {
                jSONObject2.remove("disabled");
            }
        }
    }

    public final void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ee041f", new Object[]{this, jSONObject});
        } else if (fj.d("enableSelectFirstData", true)) {
            JSONArray jSONArray = jSONObject.getJSONArray("items");
            if (bh.a(jSONArray)) {
                ck.g().d("items is empty");
                return;
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("disabled");
            JSONArray jSONArray3 = new JSONArray();
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (!bh.b(jSONObject2)) {
                    String string = jSONObject2.getString("id");
                    if (!TextUtils.isEmpty(string) && (jSONArray2 == null || !jSONArray2.contains(string))) {
                        jSONArray3.add(string);
                        break;
                    }
                }
            }
            jSONObject.put("selectedId", (Object) jSONArray3);
        }
    }
}
