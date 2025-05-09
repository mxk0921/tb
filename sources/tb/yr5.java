package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yr5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLRECYCLERDELETEARRAY = 5177303841495911651L;

    static {
        t2o.a(806355436);
    }

    public static /* synthetic */ Object ipc$super(yr5 yr5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/parser/DXDataParserTblRecyclerDeleteArray");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof Long) || !(objArr[1] instanceof Long) || !(objArr[2] instanceof String)) {
            return null;
        }
        try {
            int longValue = (int) ((Long) obj).longValue();
            int longValue2 = (int) ((Long) objArr[1]).longValue();
            String str = (String) objArr[2];
            if (longValue2 <= longValue) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            while (longValue <= longValue2) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("offset", (Object) String.valueOf(longValue));
                    jSONObject.put("isRelative", (Object) str);
                    jSONArray.add(jSONObject);
                    longValue++;
                } catch (Exception unused) {
                }
            }
            return jSONArray;
        } catch (Exception unused2) {
            return null;
        }
    }
}
