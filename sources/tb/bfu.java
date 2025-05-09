package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bfu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321716);
    }

    public static JSONObject a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("63702a5", new Object[]{str, jSONObject});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(hxj.EVENT_KEY, (Object) str);
        jSONObject2.put("params", (Object) jSONObject);
        return jSONObject2;
    }

    public static void c(List<JSONObject> list, dh7 dh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61814c2", new Object[]{list, dh7Var});
        } else if (list != null && !list.isEmpty() && dh7Var != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("params", (Object) list);
            dh7Var.M0("clientActionCallBack", jSONObject);
        }
    }

    public static void d(List<JSONObject> list, dh7 dh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d4f812b", new Object[]{list, dh7Var});
        } else if (list != null && !list.isEmpty() && dh7Var != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("params", (Object) list);
            dh7Var.L0("clientActionCallBack", jSONObject);
        }
    }

    public static void b(JSONArray jSONArray, dh7 dh7Var) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d81b60", new Object[]{jSONArray, dh7Var});
        } else if (jSONArray != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String string = jSONObject.getString(hxj.EVENT_KEY);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                    String string2 = jSONObject.getString("target");
                    if (!TextUtils.isEmpty(string2)) {
                        for (String str : string2.split(",")) {
                            if (TextUtils.equals(str, "weexMain")) {
                                JSONObject a2 = a(string, jSONObject2);
                                if (a2 != null) {
                                    arrayList.add(a2);
                                }
                            } else if (TextUtils.equals(str, "weexNavi")) {
                                JSONObject a3 = a(string, jSONObject2);
                                if (a3 != null) {
                                    arrayList2.add(a3);
                                }
                            } else if (TextUtils.equals(str, "default")) {
                                JSONObject a4 = a(string, jSONObject2);
                                if (a4 != null) {
                                    arrayList.add(a4);
                                }
                                JSONObject a5 = a(string, jSONObject2);
                                if (a5 != null) {
                                    arrayList2.add(a5);
                                }
                            }
                        }
                    }
                }
            }
            c(arrayList, dh7Var);
            d(arrayList2, dh7Var);
        }
    }
}
