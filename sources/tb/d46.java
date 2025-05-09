package tb;

import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d46 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596691);
    }

    public static void a(kdb kdbVar, DXRuntimeContext dXRuntimeContext) {
        tk6 tk6Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ae6cf32", new Object[]{kdbVar, dXRuntimeContext});
        } else if (kdbVar != null && (dXRuntimeContext instanceof DXRuntimeContext)) {
            if (dXRuntimeContext == null || dXRuntimeContext.u() == null || !(dXRuntimeContext.u().a() instanceof tk6)) {
                tk6Var = new tk6();
                tk6Var.i(dXRuntimeContext.h());
                tk6Var.m(dXRuntimeContext.D());
                tk6Var.g(dXRuntimeContext.s().f().v());
                tk6Var.r(dXRuntimeContext.L());
                tk6Var.s(dXRuntimeContext.W());
            } else {
                tk6Var = (tk6) dXRuntimeContext.u().a();
            }
            kdbVar.c(tk6Var);
            zq g = dXRuntimeContext.r().v().g();
            g.a(dXRuntimeContext.h());
            kdbVar.j(g);
        }
    }

    public static ExecuteResult b(String str, DXRuntimeContext dXRuntimeContext, String str2, kdb kdbVar, Map<String, ?> map, s2d s2dVar) {
        hdb hdbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("59ed816d", new Object[]{str, dXRuntimeContext, str2, kdbVar, map, s2dVar});
        }
        if (dXRuntimeContext == null || dXRuntimeContext.r() == null || dXRuntimeContext.r().P() == null || (hdbVar = dXRuntimeContext.r().P().get(str)) == null) {
            return null;
        }
        return hdbVar.execute(str2, kdbVar, map, new vq(s2dVar));
    }
}
