package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jg5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597685);
    }

    public static DXWidgetNode a(DXRuntimeContext dXRuntimeContext, DXWidgetNode dXWidgetNode) {
        DXWidgetNode dXWidgetNode2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("15efc08", new Object[]{dXRuntimeContext, dXWidgetNode});
        }
        if (dXWidgetNode == null || (dXWidgetNode2 = (DXWidgetNode) b(dXRuntimeContext, dXWidgetNode, true)) == null) {
            return null;
        }
        if (dXWidgetNode.getChildren() != null) {
            dXWidgetNode2.removeAllChild();
            for (int i = 0; i < dXWidgetNode.getChildren().size(); i++) {
                dXWidgetNode2.addChild(a(dXRuntimeContext, dXWidgetNode.getChildren().get(i)), false);
            }
        }
        return dXWidgetNode2;
    }

    public static Object b(DXRuntimeContext dXRuntimeContext, DXWidgetNode dXWidgetNode, boolean z) {
        DXWidgetNode build;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("59218049", new Object[]{dXRuntimeContext, dXWidgetNode, new Boolean(z)});
        }
        if (dXWidgetNode == null || (build = dXWidgetNode.build(null)) == null) {
            return null;
        }
        if (dXWidgetNode.getDXRuntimeContext() != null) {
            build.setDXRuntimeContext(dXWidgetNode.getDXRuntimeContext().b(build));
        } else if (dXRuntimeContext != null) {
            build.setDXRuntimeContext(dXRuntimeContext.b(build));
        }
        build.onClone(dXWidgetNode, z);
        return build;
    }
}
