package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nk5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596736);
    }

    public static /* synthetic */ Object ipc$super(nk5 nk5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserGet");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length == 2) {
            Object obj = objArr[0];
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).get(objArr[1]);
            }
            if (obj instanceof JSONArray) {
                Number h = o66.h(objArr[1]);
                if (h == null) {
                    return null;
                }
                JSONArray jSONArray = (JSONArray) obj;
                int intValue = h.intValue();
                if (intValue < 0 || intValue >= jSONArray.size()) {
                    return null;
                }
                return jSONArray.get(intValue);
            } else if (dXRuntimeContext.j() != null) {
                return bu5.a(dXRuntimeContext, obj, objArr[1] + "");
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
        return "dict_get";
    }
}
