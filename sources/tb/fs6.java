package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.engine.protocol.Component;
import com.alibaba.android.ultron.engine.protocol.Data;
import com.alibaba.android.ultron.engine.protocol.Event;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fs6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DataRender";

    static {
        t2o.a(157286476);
    }

    public static Data b(u1n u1nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("9584db5d", new Object[]{u1nVar});
        }
        HashMap hashMap = new HashMap();
        if (u1nVar.e()) {
            for (Map.Entry<String, ol7> entry : u1nVar.a().n().entrySet()) {
                c(hashMap, u1nVar.a().m().get(entry.getKey()));
            }
            return Data.of(hashMap);
        }
        c(hashMap, u1nVar.b());
        return Data.of(hashMap);
    }

    public static void c(Map<String, Component> map, knm knmVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84d8871", new Object[]{map, knmVar});
        } else if (knmVar != null) {
            x6v g = knmVar.g();
            Component component = new Component();
            component.id = String.valueOf(g.f31184a);
            component.tag = g.b;
            component.type = g.c;
            component.position = g.g;
            JSONObject jSONObject2 = g.d;
            if (jSONObject2 != null) {
                jSONObject = (JSONObject) JSON.parse(jSONObject2.toJSONString());
            } else {
                jSONObject = null;
            }
            component.fields = jSONObject;
            component.events = a(g);
            component.cardGroup = g.h;
            map.put(g.j, component);
            List<knm> d = knmVar.d();
            if (!(d == null || d.isEmpty())) {
                for (knm knmVar2 : d) {
                    c(map, knmVar2);
                }
            }
        }
    }

    public static Map<String, List<Event>> a(x6v x6vVar) {
        String str;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fe2bd247", new Object[]{x6vVar});
        }
        JSONObject jSONObject2 = x6vVar.e;
        JSONObject jSONObject3 = x6vVar.f;
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (TextUtils.isEmpty(key) || !(value instanceof JSONArray)) {
                if (!(value instanceof JSONArray)) {
                    str = "value is not array: " + value;
                } else {
                    str = "";
                }
                UnifyLog.e(TAG, str);
            } else {
                JSONArray jSONArray = (JSONArray) value;
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject4 = (JSONObject) jSONArray.get(i);
                    Event event = new Event();
                    String string = jSONObject4.getString("key");
                    if (!TextUtils.isEmpty(string)) {
                        event.type = string;
                        event.fields = jSONObject4.getJSONObject("params");
                    } else {
                        event.type = jSONObject4.getString("type");
                        event.fields = jSONObject4.getJSONObject("fields");
                    }
                    event.option = jSONObject4.getIntValue("option");
                    if (!(jSONObject3 == null || !jSONObject3.containsKey(event.type) || (jSONObject = jSONObject3.getJSONObject(event.type)) == null)) {
                        if (event.fields == null) {
                            event.fields = new JSONObject();
                        }
                        event.fields.putAll(jSONObject);
                    }
                    arrayList.add(event);
                }
                hashMap.put(key, arrayList);
            }
        }
        return hashMap;
    }
}
