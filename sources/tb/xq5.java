package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xq5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_SUB_ARRAY = -6848818898485245999L;

    static {
        t2o.a(444596784);
    }

    public static /* synthetic */ Object ipc$super(xq5 xq5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserSubArray");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int i;
        List<Object> subList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length == 3) {
            try {
                Object obj = objArr[0];
                if (!(obj instanceof JSONArray)) {
                    return null;
                }
                JSONArray jSONArray = (JSONArray) obj;
                try {
                    int parseInt = Integer.parseInt(objArr[1].toString());
                    int parseInt2 = Integer.parseInt(objArr[2].toString());
                    int size = jSONArray.size();
                    if (size > 0 && parseInt <= size && parseInt >= 0 && (i = parseInt2 + parseInt) <= jSONArray.size() && (subList = jSONArray.subList(parseInt, i)) != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.addAll(subList);
                        return jSONArray2;
                    }
                } catch (NumberFormatException unused) {
                }
                return null;
            } catch (Exception e) {
                xv5.b(e);
            }
        }
        return null;
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "sub_array";
    }
}
