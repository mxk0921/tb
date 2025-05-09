package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.atomic.CallAblAbility;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.RuntimeUtils;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e28 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262782);
    }

    public static String a(RuntimeAbilityParam... runtimeAbilityParamArr) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d52881e", new Object[]{runtimeAbilityParamArr});
        }
        Object[] e = e(runtimeAbilityParamArr);
        if (e == null || e.length <= 0) {
            return null;
        }
        for (Object obj : e) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.contains("=") && (split = str.split("=")) != null && split.length == 2 && TextUtils.equals("component_name", split[0])) {
                    return split[1];
                }
            }
        }
        return null;
    }

    public static RuntimeAbilityParam[] b(Object[] objArr, DXRuntimeContext dXRuntimeContext, ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuntimeAbilityParam[]) ipChange.ipc$dispatch("8e58fb6d", new Object[]{objArr, dXRuntimeContext, ze7Var});
        }
        return (RuntimeAbilityParam[]) d(objArr, dXRuntimeContext, ze7Var).toArray(new RuntimeAbilityParam[0]);
    }

    public static RuntimeAbilityParam[] c(Object[] objArr, DXRuntimeContext dXRuntimeContext, ze7 ze7Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuntimeAbilityParam[]) ipChange.ipc$dispatch("ad19a39c", new Object[]{objArr, dXRuntimeContext, ze7Var, u8Var});
        }
        List<RuntimeAbilityParam> d = d(objArr, dXRuntimeContext, ze7Var);
        d.add(new RuntimeAbilityParam(CallAblAbility.DX_CALLBACK, u8Var));
        return (RuntimeAbilityParam[]) d.toArray(new RuntimeAbilityParam[0]);
    }

    public static Object[] e(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("c97311f3", new Object[]{runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            return null;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if ("dxEventExtraArgs".equals(runtimeAbilityParam.getKey())) {
                Object value = runtimeAbilityParam.getValue();
                if (value instanceof Object[]) {
                    return (Object[]) value;
                }
            }
        }
        return null;
    }

    public static List<RuntimeAbilityParam> d(Object[] objArr, DXRuntimeContext dXRuntimeContext, ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("163f3801", new Object[]{objArr, dXRuntimeContext, ze7Var});
        }
        ArrayList arrayList = new ArrayList();
        if (objArr != null && objArr.length > 1) {
            Object[] objArr2 = new Object[objArr.length - 1];
            for (int i = 1; i < objArr.length; i++) {
                objArr2[i - 1] = objArr[i];
            }
            arrayList.add(new RuntimeAbilityParam("dxEventExtraArgs", objArr2));
        }
        if (dXRuntimeContext != null) {
            JSONObject i2 = dXRuntimeContext.i();
            if (!(i2 == null || ze7Var == null)) {
                arrayList.add(new RuntimeAbilityParam("ttTriggerComponent", ze7Var.h().d(new nb4(i2).g())));
            }
            arrayList.add(new RuntimeAbilityParam("ttTriggerView", dXRuntimeContext.D()));
            arrayList.add(new RuntimeAbilityParam("ttTriggerRootView", dXRuntimeContext.L()));
            arrayList.add(new RuntimeAbilityParam("_client_ut_args_", RuntimeUtils.b(i2)));
        }
        return arrayList;
    }
}
