package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xka extends rql {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ITEMS = "items";
    public static final String KEY_LOCATOR_ID = "locatorId";

    static {
        t2o.a(912261535);
    }

    public xka(JSONObject jSONObject, qdb qdbVar) {
        super(jSONObject, qdbVar);
        s(jSONObject, qdbVar);
    }

    public static /* synthetic */ Object ipc$super(xka xkaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/GroupComponentData");
    }

    public final void s(JSONObject jSONObject, qdb qdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8396a", new Object[]{this, jSONObject, qdbVar});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    o(new tx9(jSONObject2, qdbVar));
                }
            }
        }
    }

    public List<tx9> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("46e3e096", new Object[]{this});
        }
        return r();
    }

    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("978e443e", new Object[]{this});
        }
        return this.f24614a.getString(KEY_LOCATOR_ID);
    }
}
