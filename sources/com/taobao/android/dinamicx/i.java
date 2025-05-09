package com.taobao.android.dinamicx;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.h;
import com.taobao.android.dinamicx.widget.j;
import tb.ex5;
import tb.pb6;
import tb.t2o;
import tb.x76;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596509);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.taobao.android.dinamicx.widget.DXWidgetNode r25, int r26, int r27, int r28, int r29, com.taobao.android.dinamicx.widget.DXWidgetNode r30, boolean r31, boolean r32, boolean r33, int r34, float r35) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.i.a(com.taobao.android.dinamicx.widget.DXWidgetNode, int, int, int, int, com.taobao.android.dinamicx.widget.DXWidgetNode, boolean, boolean, boolean, int, float):void");
    }

    public boolean b(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64f94d6c", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        return x76.a(dXWidgetNode);
    }

    public h c(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, boolean z) {
        Exception e;
        h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("d1eb8ab6", new Object[]{this, dXWidgetNode, dXRuntimeContext, new Boolean(z)});
        }
        h hVar2 = null;
        if (dXWidgetNode == null) {
            return null;
        }
        try {
            hVar = new h();
        } catch (Exception e2) {
            e = e2;
        }
        try {
            hVar.setFlatten(true);
            hVar.setReferenceNode(hVar);
            hVar.setDXRuntimeContext(dXRuntimeContext.b(hVar));
            if (dXWidgetNode.getVisibility() != 0) {
                hVar.setMeasuredDimension(0, 0);
                return hVar;
            }
            hVar.setLayoutWidth(dXWidgetNode.getLayoutWidth());
            hVar.setLayoutHeight(dXWidgetNode.getLayoutHeight());
            hVar.setClipChildren(dXWidgetNode.isClipChildren());
            hVar.setMeasuredDimension(dXWidgetNode.getMeasuredWidthAndState(), dXWidgetNode.getMeasuredHeightAndState());
            hVar.setStatFlag(256);
            new ex5(hVar);
            a(dXWidgetNode, 0, 0, dXWidgetNode.getMeasuredWidth(), dXWidgetNode.getMeasuredHeight(), hVar, false, false, z, 1, 1.0f);
            return hVar;
        } catch (Exception e3) {
            e = e3;
            hVar2 = hVar;
            if (DinamicXEngine.j0()) {
                e.printStackTrace();
            }
            if (!(dXRuntimeContext == null || dXRuntimeContext.m() == null || dXRuntimeContext.m().c == null)) {
                f.a aVar = new f.a("Pipeline_Detail", "Pipeline_Detail_PerformFlatten", 80004);
                aVar.e = "DXLayoutManager#performFlatten " + xv5.a(e);
                dXRuntimeContext.m().c.add(aVar);
            }
            return hVar2;
        }
    }

    public void d(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54f612e", new Object[]{this, dXWidgetNode, dXRuntimeContext});
        } else if (dXWidgetNode != null) {
            try {
                if (dXWidgetNode.getVisibility() == 0) {
                    dXWidgetNode.layout(0, 0, dXWidgetNode.getMeasuredWidth(), dXWidgetNode.getMeasuredHeight());
                }
            } catch (Exception e) {
                if (DinamicXEngine.j0()) {
                    e.printStackTrace();
                }
                if (dXRuntimeContext != null && dXRuntimeContext.m() != null && dXRuntimeContext.m().c != null) {
                    f.a aVar = new f.a("Pipeline_Detail", "Pipeline_Detail_PerformLayout", 80003);
                    aVar.e = "DXLayoutManager#performLayout " + xv5.a(e);
                    dXRuntimeContext.m().c.add(aVar);
                }
            }
        }
    }

    public void e(DXWidgetNode dXWidgetNode, int i, int i2, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("654db4bc", new Object[]{this, dXWidgetNode, new Integer(i), new Integer(i2), dXRuntimeContext});
            return;
        }
        if (dXWidgetNode != null) {
            try {
                if (dXWidgetNode instanceof j) {
                    if (f(i)) {
                        i = pb6.j();
                    }
                    if (f(i2)) {
                        i2 = pb6.i();
                    }
                    int childMeasureSpec = j.getChildMeasureSpec(i, 0, dXWidgetNode.getLayoutWidth());
                    int childMeasureSpec2 = j.getChildMeasureSpec(i2, 0, dXWidgetNode.getLayoutHeight());
                    if (dXWidgetNode.getVisibility() == 0) {
                        dXWidgetNode.measure(childMeasureSpec, childMeasureSpec2);
                        return;
                    }
                    return;
                }
            } catch (Exception e) {
                if (DinamicXEngine.j0()) {
                    e.printStackTrace();
                }
                if (dXRuntimeContext != null && dXRuntimeContext.m() != null && dXRuntimeContext.m().c != null) {
                    f.a aVar = new f.a("Pipeline_Detail", "Pipeline_Detail_PerformMeasure", 80002);
                    aVar.e = "DXLayoutManager#performMeasure" + xv5.a(e);
                    dXRuntimeContext.m().c.add(aVar);
                    return;
                }
                return;
            }
        }
        f.a aVar2 = new f.a("Pipeline_Detail", "Pipeline_Detail_PerformMeasure", 80001);
        aVar2.e = "DXLayoutManager#performMeasure widgetNode == null || !(widgetNode instanceof DXLayout)";
        dXRuntimeContext.m().c.add(aVar2);
    }

    public final boolean f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a0fc56e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0 && size == 0) {
            return true;
        }
        return false;
    }
}
