package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w66 extends x76 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596944);
    }

    public static /* synthetic */ Object ipc$super(w66 w66Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/pipeline/opt/DXOptPipelineFlatten");
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.taobao.android.dinamicx.widget.DXWidgetNode r30, int r31, int r32, int r33, int r34, tb.ex5 r35, tb.ex5 r36, boolean r37, boolean r38, boolean r39, int r40, float r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.w66.b(com.taobao.android.dinamicx.widget.DXWidgetNode, int, int, int, int, tb.ex5, tb.ex5, boolean, boolean, boolean, int, float, boolean):void");
    }

    public svb c(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, boolean z) {
        Exception e;
        fx5 fx5Var;
        ex5 ex5Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (svb) ipChange.ipc$dispatch("9f141fae", new Object[]{this, dXWidgetNode, dXRuntimeContext, new Boolean(z)});
        }
        ex5 ex5Var2 = null;
        if (dXWidgetNode == null) {
            return null;
        }
        try {
            fx5Var = new fx5();
            ex5Var = new ex5(fx5Var);
            try {
                fx5Var.setFlattenNode(ex5Var);
                fx5Var.setDXRuntimeContext(dXRuntimeContext.b(fx5Var));
            } catch (Exception e2) {
                e = e2;
                ex5Var2 = ex5Var;
                if (DinamicXEngine.j0()) {
                    e.printStackTrace();
                }
                if (!(dXRuntimeContext == null || dXRuntimeContext.m() == null || dXRuntimeContext.m().c == null)) {
                    f.a aVar = new f.a("Pipeline_Detail", "Pipeline_Detail_PerformFlatten", 80004);
                    aVar.e = "DXLayoutManager#performFlatten " + xv5.a(e);
                    ((ArrayList) dXRuntimeContext.m().c).add(aVar);
                }
                return ex5Var2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        if (dXWidgetNode.getVisibility() != 0) {
            fx5Var.setMeasuredDimension(0, 0);
            return ex5Var;
        }
        fx5Var.setLayoutWidth(dXWidgetNode.getLayoutWidth());
        fx5Var.setLayoutHeight(dXWidgetNode.getLayoutHeight());
        fx5Var.setClipChildren(dXWidgetNode.isClipChildren());
        fx5Var.setMeasuredDimension(dXWidgetNode.getMeasuredWidthAndState(), dXWidgetNode.getMeasuredHeightAndState());
        fx5Var.setStatFlag(256);
        ex5Var2 = ex5Var;
        b(dXWidgetNode, 0, 0, dXWidgetNode.getMeasuredWidth(), dXWidgetNode.getMeasuredHeight(), ex5Var, ex5Var, false, false, z, 1, 1.0f, false);
        return ex5Var2;
    }
}
