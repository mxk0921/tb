package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class psl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729810335);
    }

    public final DXWidgetNode a(String str, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("a1b15733", new Object[]{this, str, dXRootView});
        }
        if (dXRootView.getVisibility() != 0) {
            bqa.d("PartialRefreshSearchBarProcessor", "组件未渲染，newSearchView INVISIBLE");
            return null;
        }
        DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
        if (expandWidgetNode != null) {
            return expandWidgetNode.queryWidgetNodeByUserId(str);
        }
        bqa.d("PartialRefreshSearchBarProcessor", "组件未渲染，newSearchView dxWidgetNode null");
        return null;
    }

    public void b(String str, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb0573e", new Object[]{this, str, dXRootView});
        } else if (dXRootView == null || TextUtils.isEmpty(str)) {
            sfh.d("PartialRefreshSearchBarProcessor", "dxRootView == null,userId: " + str);
        } else {
            DXWidgetNode a2 = a(str, dXRootView);
            if (a2 == null) {
                sfh.d("PartialRefreshSearchBarProcessor", "partialRefreshHomeWidgetNode widgetNode null ");
                return;
            }
            DinamicXEngine engine = a2.getEngine();
            if (engine == null) {
                sfh.d("PartialRefreshSearchBarProcessor", "partialRefreshSearchBarWidgetNode engine null ");
            } else {
                engine.I0(a2, 0, new DXWidgetRefreshOption.a().d(true).g(true).c(2).a());
            }
        }
    }
}
