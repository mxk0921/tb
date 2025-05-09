package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class cx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886117);
    }

    public void a(u55 u55Var, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("201b66af", new Object[]{this, u55Var, jSONObject});
        } else if (jSONObject != null && u55Var != null) {
            if ((!u55Var.T("container") || u55Var.N().isEmpty()) && (jSONObject2 = jSONObject.getJSONObject("container")) != null && (jSONArray = jSONObject2.getJSONArray("data")) != null) {
                ArrayList arrayList = new ArrayList();
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    if (jSONObject3 != null) {
                        arrayList.add(new o58(jSONObject3));
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("type");
                        if (jSONArray2 != null) {
                            int size2 = jSONArray2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                u55Var.N().put(jSONArray2.getString(i2), jSONObject3);
                            }
                        }
                    }
                }
                if (u55Var.h() == null) {
                    u55Var.G0(arrayList);
                } else {
                    u55Var.h().addAll(arrayList);
                }
            }
        }
    }
}
