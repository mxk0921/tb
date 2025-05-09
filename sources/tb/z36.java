package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class z36 implements evb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MAPTOARRAY = -3345730451001032950L;
    public static final String TAG = "mapToArray";

    static {
        t2o.a(473956369);
        t2o.a(444596865);
    }

    @Override // tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || dXRuntimeContext == null) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        JSONArray jSONArray = new JSONArray();
        while (true) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(String.valueOf(i));
            if (jSONObject2 == null) {
                return jSONArray;
            }
            jSONArray.add(jSONObject2);
            i++;
        }
    }
}
