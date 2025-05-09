package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class ll6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String sTokenTag = "token";

    static {
        t2o.a(295699949);
    }

    public static DXRootView a(ub5 ub5Var, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("2c6c76aa", new Object[]{ub5Var, context, str});
        }
        if (ub5Var != null) {
            return ub5Var.a(context, str);
        }
        return null;
    }

    public static DXRootView b(ukr ukrVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("da3e433", new Object[]{ukrVar, context, str});
        }
        if (ukrVar != null) {
            return ukrVar.O().a(context, str);
        }
        return null;
    }

    public static void c(ub5 ub5Var, Context context, String str, bvb bvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff6ad38", new Object[]{ub5Var, context, str, bvbVar});
        } else if (ub5Var != null) {
            ub5Var.b(context, str, bvbVar);
        }
    }

    public static void d(ub5 ub5Var, DXRootView dXRootView, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c199093a", new Object[]{ub5Var, dXRootView, jSONObject, str});
        } else if (ub5Var != null) {
            jSONObject.put("token", (Object) str);
            ub5Var.e(dXRootView, jSONObject, str);
        }
    }

    public static void e(ukr ukrVar, DXRootView dXRootView, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f786e4d1", new Object[]{ukrVar, dXRootView, jSONObject, str});
        } else if (ukrVar != null) {
            jSONObject.put("token", (Object) str);
            ukrVar.O().e(dXRootView, jSONObject, str);
        }
    }
}
