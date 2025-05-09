package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r26 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597321);
    }

    public static void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a74a59", new Object[]{dXWidgetNode});
            return;
        }
        DXWidgetNode sourceWidget = dXWidgetNode.getSourceWidget();
        if (sourceWidget != null) {
            dXWidgetNode.setAutoId(d(sourceWidget));
            sourceWidget.setLastAutoId(sourceWidget.getLastAutoId() + 1);
            List<DXWidgetNode> children = dXWidgetNode.getChildren();
            if (children != null) {
                children.size();
            }
        }
    }

    public static DXWidgetNode b(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("c1bbe73b", new Object[]{dXWidgetNode, dXRuntimeContext});
        }
        DXWidgetNode dXWidgetNode2 = (DXWidgetNode) dXWidgetNode.shallowClone(dXRuntimeContext, true);
        dXWidgetNode2.setSourceWidget(dXWidgetNode.getSourceWidget());
        a(dXWidgetNode2);
        if (dXWidgetNode.getChildren() != null) {
            dXWidgetNode2.children = new ArrayList();
            for (int i = 0; i < dXWidgetNode.getChildrenCount(); i++) {
                dXWidgetNode2.addChild(b(dXWidgetNode.getChildAt(i), dXRuntimeContext));
            }
        }
        return dXWidgetNode2;
    }

    public static DXWidgetNode c(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, boolean z) {
        DXWidgetNode dXWidgetNode2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("c016b41b", new Object[]{dXWidgetNode, dXRuntimeContext, new Boolean(z)});
        }
        DXWidgetNode dXWidgetNode3 = (DXWidgetNode) dXWidgetNode.shallowClone(dXRuntimeContext, true);
        dXWidgetNode3.setSourceWidget(dXWidgetNode.getSourceWidget());
        a(dXWidgetNode3);
        if (dXWidgetNode.getChildren() != null) {
            dXWidgetNode3.children = new ArrayList();
            for (int i = 0; i < dXWidgetNode.getChildrenCount(); i++) {
                DXWidgetNode childAt = dXWidgetNode.getChildAt(i);
                if (childAt instanceof bi6) {
                    dXWidgetNode2 = ((bi6) childAt).u(dXRuntimeContext);
                } else {
                    dXWidgetNode2 = c(childAt, dXRuntimeContext, z);
                }
                dXWidgetNode3.addChild(dXWidgetNode2, z);
            }
        }
        return dXWidgetNode3;
    }

    public static int d(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fadfcde1", new Object[]{dXWidgetNode})).intValue();
        }
        if (dXWidgetNode == null) {
            return 0;
        }
        return (dXWidgetNode.getAutoId() << 16) + dXWidgetNode.getLastAutoId();
    }
}
