package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ad6 extends uu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597796);
    }

    public static /* synthetic */ Object ipc$super(ad6 ad6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/expr/fuction/animation/DXSpringFunction");
    }

    @Override // tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return cc5.SPRING_SPEC;
    }

    @Override // tb.xwb
    public uw5 execute(DXRuntimeContext dXRuntimeContext, uw5 uw5Var, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("5d66b176", new Object[]{this, dXRuntimeContext, uw5Var, new Integer(i), uw5VarArr, map});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("type", (Object) cc5.SPRING_SPEC);
        jSONObject.put("params", (Object) jSONObject2);
        if (uw5VarArr == null || uw5VarArr.length == 0) {
            return uw5.U(jSONObject);
        }
        for (int i2 = 0; i2 < uw5VarArr.length; i2 += 2) {
            int i3 = i2 + 1;
            if (i3 < uw5VarArr.length) {
                jSONObject2.put(uw5VarArr[i2].j(), uw5VarArr[i3].z());
            }
        }
        return uw5.U(jSONObject);
    }
}
