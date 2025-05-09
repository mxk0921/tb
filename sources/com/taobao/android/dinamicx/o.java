package com.taobao.android.dinamicx;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.view.DXRootNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import tb.av5;
import tb.bi6;
import tb.eb5;
import tb.h36;
import tb.hyp;
import tb.ic5;
import tb.rh5;
import tb.s76;
import tb.t2o;
import tb.wa6;
import tb.z66;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o extends DXRenderPipelineBase {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RENDER_TEMPLATE = "renderTemplateTime";
    public final boolean d;

    static {
        t2o.a(444596564);
    }

    public o(av5 av5Var, int i, String str) {
        this(av5Var, i, str, false);
    }

    public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
        if (str.hashCode() == -324580131) {
            return new Integer(oVar.g((DXWidgetNode) objArr[0], ((Number) objArr[1]).intValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXSimpleRenderPipeline");
    }

    public View i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3c60e237", new Object[]{this, context});
        }
        if (this.d) {
            return new DXRootNativeFrameLayout(context);
        }
        return new DXNativeFrameLayout(context);
    }

    public int j(DXWidgetNode dXWidgetNode, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a843031d", new Object[]{this, dXWidgetNode, new Integer(i), new Boolean(z)})).intValue();
        }
        if (!zg5.B4()) {
            return g(dXWidgetNode, i);
        }
        if (!(dXWidgetNode instanceof bi6) || (!(dXWidgetNode.getParentWidget() instanceof DXAbsContainerBaseLayout) && !z)) {
            return g(dXWidgetNode, i);
        }
        if (dXWidgetNode.getChildrenCount() <= 0 || g(dXWidgetNode, i) == 2) {
            return 2;
        }
        return g(dXWidgetNode.getChildAt(0), i);
    }

    public void m(DXRuntimeContext dXRuntimeContext, String str, long j, hyp hypVar, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb17fd10", new Object[]{this, dXRuntimeContext, str, new Long(j), hypVar, dXWidgetNode});
            return;
        }
        try {
            if (dXWidgetNode instanceof bi6) {
                bi6 bi6Var = (bi6) dXWidgetNode;
                DXTemplateItem dXTemplateItem = new DXTemplateItem();
                dXTemplateItem.f7343a = bi6Var.getName();
                dXTemplateItem.b = Long.parseLong(bi6Var.getVersion());
                dXTemplateItem.c = bi6Var.G();
                ic5.v(0, dXRuntimeContext.c(), "SimplePipeline", str, dXTemplateItem, hypVar, j, true);
            } else {
                ic5.v(0, dXRuntimeContext.c(), "SimplePipeline", str, dXRuntimeContext.p(), hypVar, j, true);
            }
        } catch (Exception e) {
            if (DinamicXEngine.j0()) {
                e.printStackTrace();
            }
        }
    }

    public final void n(View view, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b078a85", new Object[]{this, view, dXRuntimeContext});
        } else if (dXRuntimeContext != null && zg5.V3(dXRuntimeContext.c())) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                measuredWidth = layoutParams.width;
                measuredHeight = layoutParams.height;
            }
            if (measuredWidth > 0 && measuredHeight > 0 && (view instanceof ViewGroup) && ((ViewGroup) view).getChildCount() == 0) {
                f fVar = new f(dXRuntimeContext.c());
                fVar.b = dXRuntimeContext.p();
                fVar.c = new ArrayList();
                f.a aVar = new f.a("Render", "Render_RenderWidget", f.DX_SIMPLE_RENDER_VIEW_CHILD_EMPTY);
                aVar.e = "view 宽高不为 0，但 childrenCount == 0";
                ((ArrayList) fVar.c).add(aVar);
                if (!(dXRuntimeContext.m() == null || dXRuntimeContext.m().c == null)) {
                    ((ArrayList) fVar.c).addAll(dXRuntimeContext.m().c);
                }
                ic5.p(fVar);
                if (DinamicXEngine.j0()) {
                    h36.g("DXSimpleRenderMonitor", aVar.e);
                }
            }
        }
    }

    public o(av5 av5Var, int i, String str, boolean z) {
        super(av5Var, i, str);
        if (eb5.w()) {
            h(new z66());
        } else {
            h(new wa6());
        }
        this.d = z;
    }

    public View k(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, View view, DXRuntimeContext dXRuntimeContext, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7c3d64e5", new Object[]{this, dXWidgetNode, dXWidgetNode2, view, dXRuntimeContext, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        }
        if (!(dXRuntimeContext == null || dXRuntimeContext.p() == null)) {
            rh5.b(dXRuntimeContext.p().e(), dXRuntimeContext.p().h(), dXRuntimeContext.c(), Thread.currentThread().getName(), "simple");
        }
        return l(dXWidgetNode, dXWidgetNode2, view, dXRuntimeContext, new DXRenderOptions.b().s(i).B(i2).G(i3).t(i4).q(), i5);
    }

    public View l(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, View view, DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("86a48885", new Object[]{this, dXWidgetNode, dXWidgetNode2, view, dXRuntimeContext, dXRenderOptions, new Integer(i)});
        }
        DXTraceUtil.b("DX-SimplePipeline-RenderWt", " : ", dXWidgetNode.getDXRuntimeContext().R());
        long nanoTime = System.nanoTime();
        View i2 = view == null ? i(dXRuntimeContext.h()) : view;
        int a2 = dXRenderOptions.a();
        if (dXRenderOptions.f() != 1) {
            z = false;
        }
        int j = j(dXWidgetNode, a2, z);
        this.c.g = dXRenderOptions.i();
        this.c.h = dXRenderOptions.b();
        this.c.q(i2);
        DXRenderPipelineFlow dXRenderPipelineFlow = this.c;
        dXRenderPipelineFlow.f = dXRuntimeContext;
        dXRenderPipelineFlow.d = dXWidgetNode;
        dXRenderPipelineFlow.e = dXWidgetNode2;
        if (eb5.B()) {
            Log.e("RecyclerPrefetch", "node hash " + dXWidgetNode.hashCode() + " pos " + i + " 开始渲染 from " + j + "  to  " + dXRenderOptions.g() + "  thread " + Thread.currentThread().getName());
        }
        hyp hypVar = new hyp();
        this.c.p(j, dXRenderOptions.g(), dXRenderOptions, hypVar);
        hypVar.a("renderTemplateTime", Long.valueOf(System.nanoTime() - nanoTime));
        m(dXRuntimeContext, "Engine_Render", System.nanoTime() - nanoTime, hypVar, dXWidgetNode);
        s76.b("DX-SimplePipeline-RenderWt", System.nanoTime() - nanoTime, dXRuntimeContext.p());
        DXTraceUtil.c();
        n(i2, dXRuntimeContext);
        return i2;
    }
}
