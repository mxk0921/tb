package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class eo5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MERGEOBJ = 4689616238216008755L;

    static {
        t2o.a(444596760);
    }

    public static /* synthetic */ Object ipc$super(eo5 eo5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserMergeObj");
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "mergeObj";
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject jSONObject = new JSONObject();
        if (objArr == null || objArr.length == 0) {
            h36.g("DXDataParserMergeObj", "operationList 键值对数量不符合规范");
            return null;
        }
        for (Object obj : objArr) {
            if (obj instanceof JSONObject) {
                jSONObject.putAll((JSONObject) obj);
            }
        }
        return jSONObject;
    }
}
