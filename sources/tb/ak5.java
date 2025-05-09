package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ak5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DXAB = 33582044307L;

    static {
        t2o.a(444596726);
    }

    public static /* synthetic */ Object ipc$super(ak5 ak5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserDxAB");
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "dxAB";
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject jSONObject = new JSONObject();
        if (objArr != null && objArr.length > 1) {
            String obj = objArr[0].toString();
            String obj2 = objArr[1].toString();
            hub a2 = g.a();
            if (a2 != null) {
                try {
                    jSONObject.putAll(a2.a(obj, obj2));
                } catch (Throwable th) {
                    h36.g("DXDataParserDxAB", "获取ABTest信息错误: \n" + th.getMessage());
                }
            }
        }
        return jSONObject;
    }
}
