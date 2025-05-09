package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class od5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596647);
    }

    public static boolean a(DXWidgetNode dXWidgetNode) {
        DXRootView dXRootView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9c8ffd1", new Object[]{dXWidgetNode})).booleanValue();
        }
        DXWidgetNode b = b(dXWidgetNode);
        if (dXWidgetNode == null || dXWidgetNode.getDXRuntimeContext() == null) {
            dXRootView = null;
        } else {
            dXRootView = dXWidgetNode.getDXRuntimeContext().L();
        }
        if (dXRootView == null || dXRootView.getExpandWidgetNode() != b) {
            return true;
        }
        return false;
    }

    public static DXWidgetNode b(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("f7dabab9", new Object[]{dXWidgetNode});
        }
        if (dXWidgetNode.getParentWidget() == null) {
            return dXWidgetNode;
        }
        return b(dXWidgetNode.getParentWidget());
    }
}
