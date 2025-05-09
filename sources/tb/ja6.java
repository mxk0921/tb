package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ja6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539394);
    }

    public static DXWidgetNode a(String str, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("a1b15733", new Object[]{str, dXRootView});
        }
        if (dXRootView.getVisibility() != 0) {
            bqa.d("DXRefreshUtils", "组件未渲染，newSearchView INVISIBLE");
            return null;
        }
        DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
        if (expandWidgetNode != null) {
            return expandWidgetNode.queryWidgetNodeByUserId(str);
        }
        bqa.d("DXRefreshUtils", "组件未渲染，newSearchView dxWidgetNode null");
        return null;
    }

    public static void b(String str, DXRootView dXRootView) {
        DXWidgetNode a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba7a1b5", new Object[]{str, dXRootView});
        } else if (dXRootView != null && (a2 = a(str, dXRootView)) != null) {
            DinamicXEngine engine = a2.getEngine();
            if (engine == null) {
                fve.e("DXRefreshUtils", "partialRefreshSearchBarWidgetNode engine null ");
            } else {
                engine.I0(a2, 0, new DXWidgetRefreshOption.a().d(true).g(true).c(2).a());
            }
        }
    }
}
