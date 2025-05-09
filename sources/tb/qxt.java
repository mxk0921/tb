package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qxt implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "titleExpandOrFold";

    static {
        t2o.a(912261950);
        t2o.a(912261826);
    }

    public qxt(Context context, ze7 ze7Var) {
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject f;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        oa4 i = yc4.i(runtimeAbilityParamArr);
        if (i == null || (f = i.getComponentData().f()) == null || (obj = f.get(mop.KEY_HEADER_EXPANDED)) == null) {
            return false;
        }
        boolean z = !"true".equals(obj.toString());
        f.put(mop.KEY_HEADER_EXPANDED, (Object) String.valueOf(z));
        b(f.get("title"), z);
        i.updateComponent();
        return true;
    }

    public final void b(Object obj, boolean z) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddebf25", new Object[]{this, obj, new Boolean(z)});
        } else if (obj != null && (obj instanceof JSONArray)) {
            JSONArray jSONArray = (JSONArray) obj;
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (!(jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("style")) == null)) {
                    jSONObject.put("tailIndent", (Object) String.valueOf(z));
                }
            }
        }
    }
}
