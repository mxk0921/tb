package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.view.SmartLayerFrameLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qn6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699817);
    }

    public static n5q a(DXWidgetNode dXWidgetNode) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n5q) ipChange.ipc$dispatch("355d8a9", new Object[]{dXWidgetNode});
        }
        if (!(dXWidgetNode == null || (dXRuntimeContext = dXWidgetNode.getDXRuntimeContext()) == null || dXRuntimeContext.L() == null)) {
            View view = (View) dXRuntimeContext.L().getParent();
            if (view instanceof SmartLayerFrameLayout) {
                n6q layerController = ((SmartLayerFrameLayout) view).getLayerController();
                if (layerController instanceof n5q) {
                    return (n5q) layerController;
                }
            }
        }
        return null;
    }
}
