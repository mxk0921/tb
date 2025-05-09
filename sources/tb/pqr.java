package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pqr implements rtd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "removePathData";

    static {
        t2o.a(745538135);
        t2o.a(157286534);
    }

    public static void b(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3640f72e", new Object[]{jSONArray, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tag", (Object) EVENT_TYPE);
        jSONObject.put("type", (Object) EVENT_TYPE);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("path", (Object) str);
        jSONObject.put("fields", (Object) jSONObject2);
        jSONArray.add(jSONObject);
    }

    public final JSONObject a(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("93f99a26", new Object[]{this, b8vVar});
        }
        Object f = b8vVar.f();
        if (f instanceof gsb) {
            return ((gsb) f).getFields();
        }
        if (f instanceof JSONObject) {
            return ((JSONObject) f).getJSONObject("fields");
        }
        return null;
    }

    public final int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30a5cf23", new Object[]{this, str})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return -1;
        }
    }

    public final String[] e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("a877f7ac", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("\\.");
    }

    public final boolean f(JSONObject jSONObject, String[] strArr) {
        Object obj;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3168059", new Object[]{this, jSONObject, strArr})).booleanValue();
        }
        if (strArr != null && strArr.length >= 1) {
            int i = 0;
            Object obj2 = jSONObject;
            while (i < strArr.length) {
                String str = strArr[i];
                if (i == strArr.length - 1) {
                    if (obj2 instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) obj2;
                        if (jSONObject2.containsKey(str)) {
                            jSONObject2.remove(str);
                            return true;
                        }
                    }
                    if (!(obj2 instanceof JSONArray)) {
                        return false;
                    }
                    int d = d(str);
                    JSONArray jSONArray = (JSONArray) obj2;
                    if (d == -1) {
                        return false;
                    }
                    for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                        if (jSONObject3 != null && jSONObject3.containsKey("index") && d == jSONObject3.getInteger("index").intValue()) {
                            jSONArray.remove(jSONObject3);
                            return true;
                        }
                    }
                    jSONArray.remove(d);
                    return true;
                }
                if (!(obj2 instanceof JSONObject)) {
                    if (!(obj2 instanceof JSONArray)) {
                        break;
                    }
                    int d2 = d(str);
                    JSONArray jSONArray2 = (JSONArray) obj2;
                    if (d2 == -1) {
                        return false;
                    }
                    int i3 = 0;
                    while (true) {
                        if (i3 >= jSONArray2.size()) {
                            z = false;
                            obj = obj2;
                            break;
                        }
                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i3);
                        if (jSONObject4 != null && jSONObject4.containsKey("index") && d2 == jSONObject4.getInteger("index").intValue()) {
                            obj = jSONObject4;
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    if (!z) {
                        obj = ((JSONArray) obj).get(d2);
                    }
                } else {
                    obj = ((JSONObject) obj2).get(str);
                }
                i++;
                obj2 = obj;
            }
        }
        return false;
    }

    @Override // tb.rtd
    public void c(b8v b8vVar) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8797ded1", new Object[]{this, b8vVar});
        } else if (b8vVar != null) {
            JSONObject a2 = a(b8vVar);
            IDMComponent d = b8vVar.d();
            if (a2 != null && d != null && a2.containsKey("path") && (fields = d.getFields()) != null && f(fields, e(a2.getString("path")))) {
                d.writeBackFields(fields, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(d);
                b8vVar.n().e(arrayList);
            }
        }
    }
}
