package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class x76 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596941);
    }

    public static boolean a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64f94d6c", new Object[]{dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode == null) {
            return false;
        }
        if (dXWidgetNode.isV4Node()) {
            if (dXWidgetNode.getDxv4Properties().h() == null || dXWidgetNode.getDxv4Properties().h().size() <= 0) {
                return false;
            }
            return true;
        } else if (dXWidgetNode.getEventHandlersExprNode() == null || dXWidgetNode.getEventHandlersExprNode().size() <= 0) {
            return false;
        } else {
            return true;
        }
    }
}
