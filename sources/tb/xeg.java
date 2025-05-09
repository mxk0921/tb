package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xeg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699233);
    }

    public static String b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a941856", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT)) == null) {
            return "";
        }
        return jSONObject2.getString("contextVersion");
    }

    public static void f(peg pegVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eecd20f9", new Object[]{pegVar, jSONObject, str});
        } else if (!TextUtils.isEmpty(str) && pegVar != null && jSONObject != null) {
            pegVar.d = str;
            String[] split = str.split("\\$");
            if (split != null && split.length == 4) {
                pegVar.e = new ydg(split[1], split[0], zqq.g(split[3], 0));
            }
        }
    }

    public final void a(List<peg> list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21004ccb", new Object[]{this, list, jSONObject});
        } else if (list != null && !list.isEmpty()) {
            if (jSONObject == null) {
                hha.b("LVProtocol", "fillData | null.");
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 == null) {
                hha.b("LVProtocol", "fillData | data is null.");
                return;
            }
            for (peg pegVar : list) {
                if (pegVar != null) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(pegVar.c);
                    if (jSONObject3 == null || jSONObject3.isEmpty()) {
                        hha.b("LVProtocol", "fillData | componentData is null. name=" + pegVar.c);
                    } else {
                        pegVar.f = jSONObject3.getJSONObject("fields");
                        pegVar.g = jSONObject3.getJSONObject("events");
                        if (pegVar.f == null) {
                            pegVar.f = new JSONObject();
                        }
                        if (pegVar.g == null) {
                            pegVar.g = new JSONObject();
                        }
                        f(pegVar, jSONObject3, jSONObject3.getString("type"));
                    }
                }
            }
        }
    }

    public teg e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (teg) ipChange.ipc$dispatch("405abebd", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        JSONObject d = fkx.d(str2);
        List<peg> d2 = d(d);
        a(d2, d);
        return new teg(str, d, d2, c(d), b(d));
    }

    public static List<ydg> c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9ece5f57", new Object[]{jSONObject});
        }
        ArrayList arrayList = null;
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("container")) == null) {
            return null;
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("data");
        if (jSONArray != null && !jSONArray.isEmpty()) {
            arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (jSONObject3 != null && !jSONObject3.isEmpty()) {
                    String string = jSONObject3.getString("containerType");
                    if (TextUtils.equals(string, "dinamicx")) {
                        int intValue = jSONObject3.getIntValue("version");
                        String string2 = jSONObject3.getString("url");
                        ydg ydgVar = new ydg(jSONObject3.getString("name"), string, intValue);
                        ydgVar.d = string2;
                        arrayList.add(ydgVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<peg> d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("349087a0", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            hha.b("LVProtocol", "parseHierarchy | null.");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("hierarchy");
        if (jSONObject2 == null) {
            hha.b("LVProtocol", "parseHierarchy | hierarchy is null.");
            return null;
        }
        String string = jSONObject2.getString("root");
        JSONObject jSONObject3 = jSONObject2.getJSONObject("structure");
        if (jSONObject3 == null || TextUtils.isEmpty(string)) {
            hha.b("LVProtocol", "parseHierarchy | structure is null. pageCode=" + string);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        peg pegVar = new peg(string, null);
        Stack stack = new Stack();
        stack.add(pegVar);
        while (!stack.isEmpty()) {
            peg pegVar2 = (peg) stack.pop();
            if (pegVar2 != null && !TextUtils.isEmpty(pegVar2.c)) {
                arrayList.add(pegVar2);
                JSONArray jSONArray = jSONObject3.getJSONArray(pegVar2.c);
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        String string2 = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string2)) {
                            peg pegVar3 = new peg(string2, pegVar2);
                            ((ArrayList) pegVar2.b).add(pegVar3);
                            stack.add(pegVar3);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
