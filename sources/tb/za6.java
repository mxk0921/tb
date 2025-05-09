package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class za6 extends uu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597795);
    }

    public static /* synthetic */ Object ipc$super(za6 za6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/expr/fuction/animation/DXRepeatableFunction");
    }

    @Override // tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "repeatable";
    }

    @Override // tb.xwb
    public uw5 execute(DXRuntimeContext dXRuntimeContext, uw5 uw5Var, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("5d66b176", new Object[]{this, dXRuntimeContext, uw5Var, new Integer(i), uw5VarArr, map});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("type", (Object) cc5.TWEEN_SPEC);
        jSONObject.put("params", (Object) jSONObject2);
        if (uw5VarArr == null || uw5VarArr.length == 0) {
            return uw5.T(jSONObject);
        }
        for (int i2 = 0; i2 < uw5VarArr.length; i2 += 2) {
            int i3 = i2 + 1;
            if (i3 < uw5VarArr.length) {
                String j = uw5VarArr[i2].j();
                if (!"animation".equals(j) || !uw5VarArr[i3].H()) {
                    jSONObject2.put(j, uw5VarArr[i3].z());
                } else {
                    JSONObject v = uw5VarArr[i3].v();
                    if (cc5.TWEEN_SPEC.equals(srf.h("type", v, null))) {
                        jSONObject2.putAll(srf.g("params", v, null));
                    }
                }
            }
        }
        return uw5.U(jSONObject);
    }
}
