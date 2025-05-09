package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x66 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final w76 f31175a;

    static {
        t2o.a(444596945);
    }

    public x66(w76 w76Var) {
        this.f31175a = w76Var;
    }

    public View a(DXWidgetNode dXWidgetNode, svb svbVar, View view, DXRuntimeContext dXRuntimeContext, int i, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("815fc38f", new Object[]{this, dXWidgetNode, svbVar, view, dXRuntimeContext, new Integer(i), dXRenderOptions});
        }
        String str = null;
        if (dXWidgetNode == null || svbVar == null || view == null) {
            return null;
        }
        try {
            ex5 ex5Var = (ex5) svbVar;
            ex5 a2 = kl6.a(view);
            long nanoTime = System.nanoTime();
            if (i == 0) {
                str = "DX-Pipeline-RenderWt-diff";
            } else if (i == 1) {
                str = "DX-SimplePipeline-RenderWt-diff";
            }
            DXTraceUtil.b(str);
            this.f31175a.a(ex5Var, a2, dXRuntimeContext);
            d(dXRuntimeContext, "Detail_RenderWidget_Diff", System.nanoTime() - nanoTime, null);
            DXTraceUtil.c();
            ex5Var.U(view);
            long nanoTime2 = System.nanoTime();
            c(dXRuntimeContext, ex5Var, dXWidgetNode, null, 0, i, dXRenderOptions);
            if (ex5Var.e() == 3) {
                view.setImportantForAccessibility(1);
            } else {
                view.setImportantForAccessibility(2);
            }
            kl6.d(ex5Var, view);
            if (!(a2 == null || a2.n() == null)) {
                a2.n().K(ex5Var, a2);
            }
            d(dXRuntimeContext, "Detail_RenderWidget_Recursion_Render_WT", System.nanoTime() - nanoTime2, null);
        } catch (Exception e) {
            xv5.b(e);
            if (!(dXRuntimeContext == null || dXRuntimeContext.m() == null || dXRuntimeContext.m().c == null)) {
                f.a aVar = new f.a("Pipeline_Detail", "Pipeline_Detail_Render_Detail", 90001);
                aVar.e = "DXLayoutManager#renderWidget " + xv5.a(e);
                ((ArrayList) dXRuntimeContext.m().c).add(aVar);
            }
        }
        return view;
    }

    public final void b(DXRuntimeContext dXRuntimeContext, ex5 ex5Var, DXWidgetNode dXWidgetNode, View view, int i, DXRenderOptions dXRenderOptions) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf8b1b74", new Object[]{this, dXRuntimeContext, ex5Var, dXWidgetNode, view, new Integer(i), dXRenderOptions});
            return;
        }
        System.nanoTime();
        if (i == 0) {
            str = "DX-Pipeline-RenderDetail(不含子节点)";
        } else if (i == 1) {
            str = "DX-SimplePipeline-RenderDetail(不含子节点";
        } else {
            str = "";
        }
        DXTraceUtil.b(str);
        if (dXRuntimeContext == null || !dXRuntimeContext.b0()) {
            ex5Var.T(view);
            ex5Var.b(dXRuntimeContext.h());
            if (dXRenderOptions != null) {
                ex5Var.c(dXRenderOptions);
            }
            ex5Var.R(dXRuntimeContext.h());
        } else if (ex5Var.v(256)) {
            ex5Var.T(view);
            ex5Var.b(dXRuntimeContext.h());
            if (dXRenderOptions != null) {
                ex5Var.c(dXRenderOptions);
            }
            ex5Var.R(dXRuntimeContext.h());
            ex5Var.V(256);
        }
        DXTraceUtil.c();
        List<ex5> i2 = ex5Var.i();
        if (i2 != null) {
            for (int i3 = 0; i3 < ex5Var.j(); i3++) {
                c(dXRuntimeContext, i2.get(i3), dXWidgetNode, view, i3, i, dXRenderOptions);
            }
        }
    }

    public final void d(DXRuntimeContext dXRuntimeContext, String str, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3626e4c", new Object[]{this, dXRuntimeContext, str, new Long(j), map});
            return;
        }
        try {
            ic5.u(3, dXRuntimeContext.c(), "Pipeline_Detail_Render_Detail", str, dXRuntimeContext.p(), map, j, true);
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    public final void c(DXRuntimeContext dXRuntimeContext, ex5 ex5Var, DXWidgetNode dXWidgetNode, View view, int i, int i2, DXRenderOptions dXRenderOptions) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22760cc2", new Object[]{this, dXRuntimeContext, ex5Var, dXWidgetNode, view, new Integer(i), new Integer(i2), dXRenderOptions});
            return;
        }
        try {
            System.nanoTime();
            String str2 = "";
            if (DXTraceUtil.f() && ex5Var != null) {
                if (i2 == 0) {
                    str = "DX-Pipeline-RenderFlatten";
                } else {
                    str = i2 == 1 ? "DX-SimplePipeline-RenderFlatten" : str2;
                }
                DXTraceUtil.b(str, "-", ex5Var.B().getClass().getSimpleName());
            }
            View z = ex5Var.z();
            if (z != null) {
                if (view == null) {
                    kl6.c(z, dXWidgetNode);
                }
                kl6.d(ex5Var, z);
                b(dXRuntimeContext, ex5Var, dXWidgetNode, z, i2, dXRenderOptions);
            } else {
                if (i2 == 0) {
                    str2 = "DX-Pipeline-CreateView";
                } else if (i2 == 1) {
                    str2 = "DX-SimplePipeline-CreateView";
                }
                if (DXTraceUtil.f()) {
                    DXTraceUtil.b(str2, "-", ex5Var.B().getClass().getSimpleName());
                }
                View d = ex5Var.d(dXRuntimeContext.h());
                if (DXTraceUtil.f()) {
                    DXTraceUtil.c();
                }
                if (d != null || !zg5.b4(ex5Var.B())) {
                    if (view == null) {
                        kl6.c(d, dXWidgetNode);
                    }
                    b(dXRuntimeContext, ex5Var, dXWidgetNode, d, i2, dXRenderOptions);
                    if (view != null && (view instanceof ViewGroup)) {
                        if (!zg5.i4()) {
                            ((ViewGroup) view).addView(d, i);
                        } else if (i <= ((ViewGroup) view).getChildCount()) {
                            ((ViewGroup) view).addView(d, i);
                        } else {
                            ((ViewGroup) view).addView(d);
                            ic5.s(dXRuntimeContext.c(), dXRuntimeContext.p(), "Render", "RENDER_ERROR", f.DX_ADD_VIEW_ERROR, "renderManager addView error");
                        }
                    }
                } else if (DXTraceUtil.f()) {
                    DXTraceUtil.c();
                    return;
                } else {
                    return;
                }
            }
            if (!DXTraceUtil.f()) {
                return;
            }
        } catch (Throwable th) {
            if (dXRuntimeContext != null) {
                try {
                    if (!(dXRuntimeContext.m() == null || dXRuntimeContext.m().c == null)) {
                        f.a aVar = new f.a("Render", "Render_Fltten_Crash", f.DXERROR_RENDER_FLATTEN);
                        aVar.e = xv5.a(th);
                        ((ArrayList) dXRuntimeContext.m().c).add(aVar);
                    }
                } catch (Throwable th2) {
                    if (DXTraceUtil.f() && ex5Var != null) {
                        DXTraceUtil.c();
                    }
                    throw th2;
                }
            }
            xv5.b(th);
            if (!DXTraceUtil.f() || ex5Var == null) {
                return;
            }
        }
        DXTraceUtil.c();
    }
}
