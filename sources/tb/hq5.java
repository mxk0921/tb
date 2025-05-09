package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hq5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_SPLITJSONARRAY = -2241466443830917517L;

    static {
        t2o.a(573571185);
    }

    public static /* synthetic */ Object ipc$super(hq5 hq5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/render/dx/dataparser/DXDataParserSplitJSONArray");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2) {
            JSONArray parseArray = JSON.parseArray(String.valueOf(objArr[0]));
            int parseInt = Integer.parseInt(String.valueOf(objArr[1]));
            if (parseArray != null && !parseArray.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < parseArray.size(); i++) {
                    JSONObject jSONObject = parseArray.getJSONObject(i);
                    jSONArray2.add(jSONObject);
                    String string = jSONObject.getString("text");
                    if (string.contains("[n]")) {
                        jSONObject.put("text", (Object) string.replace("[n]", ""));
                        jSONArray.add(jSONArray2);
                        jSONArray2 = new JSONArray();
                    }
                }
                if (!jSONArray2.isEmpty()) {
                    jSONArray.add(jSONArray2);
                }
                if (parseInt >= jSONArray.size()) {
                    return null;
                }
                return jSONArray.get(parseInt);
            }
        }
        return null;
    }
}
