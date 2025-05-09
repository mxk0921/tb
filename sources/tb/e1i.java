package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e1i extends xql {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CHILDREN = "children";

    static {
        t2o.a(912261657);
    }

    public e1i(JSONObject jSONObject, ob4 ob4Var) {
        super(jSONObject, ob4Var);
        n(jSONObject, ob4Var);
    }

    public static /* synthetic */ Object ipc$super(e1i e1iVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/layout/MainScreenLayoutNode");
    }

    public final void n(JSONObject jSONObject, ob4 ob4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a5d2b5", new Object[]{this, jSONObject, ob4Var});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("children");
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    j(new z4k(jSONObject2, ob4Var));
                }
            }
        }
    }
}
