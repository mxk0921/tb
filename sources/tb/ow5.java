package tb;

import android.util.Log;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.Map;
import tb.qvb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ow5 implements qvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final pw5 f25705a = new pw5();

    static {
        t2o.a(444597772);
        t2o.a(444598017);
    }

    @Override // tb.qvb
    public void a(xwb xwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285aab54", new Object[]{this, xwbVar});
        } else if (xwbVar != null) {
            this.f25705a.c(xwbVar);
        }
    }

    @Override // tb.qvb
    public uw5 b(DXRuntimeContext dXRuntimeContext, String str, uw5 uw5Var, int i, uw5[] uw5VarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("6d9c64a1", new Object[]{this, dXRuntimeContext, str, uw5Var, new Integer(i), uw5VarArr, map});
        }
        uw5 a2 = this.f25705a.a(str);
        if (a2 != null) {
            try {
                return a2.r().execute(dXRuntimeContext, uw5Var, i, uw5VarArr, map);
            } catch (Exception e) {
                xv5.b(e);
            }
        }
        return uw5.V();
    }

    @Override // tb.qvb
    public qvb.a c(DXRuntimeContext dXRuntimeContext, int i, zwb zwbVar, Map map) {
        String str = "null";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qvb.a) ipChange.ipc$dispatch("4b6da5b1", new Object[]{this, dXRuntimeContext, new Integer(i), zwbVar, map});
        }
        try {
            sl6 dxv4Properties = dXRuntimeContext.W().getDxv4Properties();
            tw5 tw5Var = new tw5(this.f25705a);
            tw5Var.k(DinamicXEngine.j0());
            SparseArray<byte[]> i2 = dxv4Properties.i();
            SparseArray<Object> c = dxv4Properties.c();
            if (tw5Var.f()) {
                h36.g("dx_v4_expression", "expr start index = " + i);
            }
            uw5 i3 = tw5Var.i(dXRuntimeContext, i2.get(i), c, zwbVar, map);
            if (tw5Var.f()) {
                StringBuilder sb = new StringBuilder("expr result index:");
                sb.append(i);
                sb.append(" type:");
                sb.append(i3.x());
                sb.append(" value:");
                sb.append(i3.z() == null ? str : i3.z().toString());
                h36.g("dx_v4_expression", sb.toString());
            }
            return new qvb.a(true, "", i3);
        } catch (Throwable th) {
            DXTemplateItem p = dXRuntimeContext.p();
            StringBuilder sb2 = new StringBuilder("表达式执行异常 templateItem info:");
            if (p != null) {
                str = p.toString();
            }
            sb2.append(str);
            sb2.append(" expr index:");
            sb2.append(i);
            String str2 = sb2.toString() + " " + Log.getStackTraceString(th);
            h36.c(str2);
            return new qvb.a(false, str2, null);
        }
    }
}
