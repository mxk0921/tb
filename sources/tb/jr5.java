package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jr5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLVTOARRAY = -6113565926232048891L;

    static {
        t2o.a(806355434);
    }

    public static /* synthetic */ Object ipc$super(jr5 jr5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/parser/DXDataParserTBLVToArray");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Object obj = objArr[0];
        if (obj instanceof JSONArray) {
            JSONArray jSONArray2 = (JSONArray) obj;
            JSONObject jSONObject = new JSONObject();
            Object obj2 = objArr[1];
            if (obj2 instanceof JSONObject) {
                jSONObject = (JSONObject) obj2;
            }
            for (int i = 0; i < jSONArray2.size(); i++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                JSONObject parseObject = JSON.parseObject(jSONObject.toJSONString());
                parseObject.put("itemInfo", (Object) jSONObject2);
                parseObject.put("index", (Object) Integer.valueOf(i));
                jSONArray.add(i, parseObject);
            }
        }
        Object obj3 = objArr[0];
        if (!(obj3 instanceof String)) {
            return jSONArray;
        }
        String str = (String) obj3;
        JSONObject jSONObject3 = new JSONObject();
        Object obj4 = objArr[1];
        if (obj4 instanceof JSONObject) {
            jSONObject3 = (JSONObject) obj4;
        }
        try {
            int parseInt = Integer.parseInt(str);
            JSONArray jSONArray3 = new JSONArray();
            for (int i2 = 0; i2 < parseInt; i2++) {
                try {
                    jSONArray3.add(jSONObject3);
                } catch (Exception unused) {
                }
            }
            return jSONArray3;
        } catch (Exception unused2) {
            return jSONArray;
        }
    }
}
