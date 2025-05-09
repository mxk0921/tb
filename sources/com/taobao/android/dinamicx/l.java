package com.taobao.android.dinamicx;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.ic5;
import tb.kl6;
import tb.mb5;
import tb.t2o;
import tb.v76;
import tb.xv5;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PIPELINE = 0;
    public static final int SIMPLE_PIPELINE = 1;

    /* renamed from: a  reason: collision with root package name */
    public mb5 f7316a = new v76();

    static {
        t2o.a(444596536);
    }

    public final View a(DXWidgetNode dXWidgetNode) {
        WeakReference<View> wRView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1e598ad1", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode == null || (wRView = dXWidgetNode.getWRView()) == null) {
            return null;
        }
        return wRView.get();
    }

    public final void b(DXRuntimeContext dXRuntimeContext, DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, View view, int i, DXRenderOptions dXRenderOptions) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50d70050", new Object[]{this, dXRuntimeContext, dXWidgetNode, dXWidgetNode2, view, new Integer(i), dXRenderOptions});
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
            dXWidgetNode.setRealViewLayoutParam(view);
            dXWidgetNode.bindEvent(dXRuntimeContext.h());
            if (!(dXRenderOptions == null || dXWidgetNode.getReferenceNode() == null)) {
                dXWidgetNode.getReferenceNode().bindRenderOptions(dXRenderOptions);
            }
            dXWidgetNode.setNeedRender(dXRuntimeContext.h());
        } else if (dXWidgetNode.getStatInPrivateFlags(256)) {
            dXWidgetNode.setRealViewLayoutParam(view);
            dXWidgetNode.bindEvent(dXRuntimeContext.h());
            if (!(dXRenderOptions == null || dXWidgetNode.getReferenceNode() == null)) {
                dXWidgetNode.getReferenceNode().bindRenderOptions(dXRenderOptions);
            }
            dXWidgetNode.setNeedRender(dXRuntimeContext.h());
            dXWidgetNode.unsetStatFlag(256);
            if (dXWidgetNode.getReferenceNode() != null) {
                dXWidgetNode.getReferenceNode().unsetStatFlag(256);
            }
        }
        DXTraceUtil.c();
        List<DXWidgetNode> children = dXWidgetNode.getChildren();
        if (children != null) {
            for (int i2 = 0; i2 < dXWidgetNode.getChildrenCount(); i2++) {
                c(dXRuntimeContext, children.get(i2), dXWidgetNode2, view, i2, i, dXRenderOptions);
            }
        }
    }

    public View d(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, View view, DXRuntimeContext dXRuntimeContext, int i, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8d003a01", new Object[]{this, dXWidgetNode, dXWidgetNode2, view, dXRuntimeContext, new Integer(i), dXRenderOptions});
        }
        String str = null;
        if (dXWidgetNode == null || dXWidgetNode2 == null || view == null) {
            return null;
        }
        try {
            DXWidgetNode b = kl6.b(view);
            long nanoTime = System.nanoTime();
            if (i == 0) {
                str = "DX-Pipeline-RenderWt-diff";
            } else if (i == 1) {
                str = "DX-SimplePipeline-RenderWt-diff";
            }
            DXTraceUtil.b(str);
            this.f7316a.a(dXWidgetNode2, b, dXRuntimeContext);
            e(dXRuntimeContext, "Detail_RenderWidget_Diff", System.nanoTime() - nanoTime, null);
            DXTraceUtil.c();
            dXWidgetNode2.setWRView(new WeakReference<>(view));
            long nanoTime2 = System.nanoTime();
            c(dXRuntimeContext, dXWidgetNode2, dXWidgetNode, null, 0, i, dXRenderOptions);
            if (dXWidgetNode2.getAccessibility() == 3) {
                view.setImportantForAccessibility(1);
            } else {
                view.setImportantForAccessibility(2);
            }
            kl6.e(view, dXWidgetNode2);
            if (!(b == null || b.getParentWidget() == null)) {
                b.getParentWidget().replaceChild(dXWidgetNode2, b);
            }
            e(dXRuntimeContext, "Detail_RenderWidget_Recursion_Render_WT", System.nanoTime() - nanoTime2, null);
        } catch (Exception e) {
            xv5.b(e);
            if (!(dXRuntimeContext == null || dXRuntimeContext.m() == null || dXRuntimeContext.m().c == null)) {
                f.a aVar = new f.a("Pipeline_Detail", "Pipeline_Detail_Render_Detail", 90001);
                aVar.e = "DXLayoutManager#renderWidget " + xv5.a(e);
                dXRuntimeContext.m().c.add(aVar);
            }
        }
        return view;
    }

    public final void e(DXRuntimeContext dXRuntimeContext, String str, long j, Map<String, String> map) {
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

    public final void c(DXRuntimeContext dXRuntimeContext, DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, View view, int i, int i2, DXRenderOptions dXRenderOptions) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed14814", new Object[]{this, dXRuntimeContext, dXWidgetNode, dXWidgetNode2, view, new Integer(i), new Integer(i2), dXRenderOptions});
            return;
        }
        try {
            System.nanoTime();
            String str2 = "";
            if (DXTraceUtil.f() && dXWidgetNode != null) {
                if (i2 == 0) {
                    str = "DX-Pipeline-RenderFlatten";
                } else {
                    str = i2 == 1 ? "DX-SimplePipeline-RenderFlatten" : str2;
                }
                DXTraceUtil.b(str, "-", dXWidgetNode.getClass().getSimpleName());
            }
            View a2 = a(dXWidgetNode);
            if (a2 != null) {
                if (view == null) {
                    kl6.c(a2, dXWidgetNode2);
                }
                kl6.e(a2, dXWidgetNode);
                b(dXRuntimeContext, dXWidgetNode, dXWidgetNode2, a2, i2, dXRenderOptions);
            } else {
                if (i2 == 0) {
                    str2 = "DX-Pipeline-CreateView";
                } else if (i2 == 1) {
                    str2 = "DX-SimplePipeline-CreateView";
                }
                if (DXTraceUtil.f()) {
                    DXTraceUtil.b(str2, "-", dXWidgetNode.getClass().getSimpleName());
                }
                View createView = dXWidgetNode.createView(dXRuntimeContext.h());
                if (DXTraceUtil.f()) {
                    DXTraceUtil.c();
                }
                if (createView != null || !zg5.b4(dXWidgetNode)) {
                    if (view == null) {
                        kl6.c(createView, dXWidgetNode2);
                    }
                    b(dXRuntimeContext, dXWidgetNode, dXWidgetNode2, createView, i2, dXRenderOptions);
                    if (view != null && (view instanceof ViewGroup)) {
                        if (!zg5.i4()) {
                            ((ViewGroup) view).addView(createView, i);
                        } else if (i <= ((ViewGroup) view).getChildCount()) {
                            ((ViewGroup) view).addView(createView, i);
                        } else {
                            ((ViewGroup) view).addView(createView);
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
        } catch (Throwable th) {
            if (dXRuntimeContext != null) {
                try {
                    if (!(dXRuntimeContext.m() == null || dXRuntimeContext.m().c == null)) {
                        f.a aVar = new f.a("Render", "Render_Fltten_Crash", f.DXERROR_RENDER_FLATTEN);
                        aVar.e = xv5.a(th);
                        ((ArrayList) dXRuntimeContext.m().c).add(aVar);
                    }
                } finally {
                    if (DXTraceUtil.f() && dXWidgetNode != null) {
                        DXTraceUtil.c();
                    }
                }
            }
            xv5.b(th);
            if (!DXTraceUtil.f() || dXWidgetNode == null) {
            }
        }
    }
}
