package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ld5 implements bmj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596644);
    }

    public View b(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4e880eb9", new Object[]{this, view, str});
        }
        ex5 a2 = kl6.a(view);
        if (a2 == null) {
            if (DinamicXEngine.j0()) {
                h36.r("未找到" + str + "对应的view  原因为： 拍平节点是空flattenNode == null ");
            }
            return null;
        }
        DXWidgetNode B = a2.B();
        if (B != view.getTag(u86.b)) {
            if (DinamicXEngine.j0()) {
                h36.r("未找到" + str + "对应的view  原因为： expandWidget != view.getTag(DXPublicConstant.TAG_ANIMATION_EXPANDED_WIDGET_ON_VIEW)");
            }
            return null;
        } else if (od5.a(B)) {
            if (DinamicXEngine.j0()) {
                h36.r("未找到" + str + "对应的view  原因为： 当前rootview已经被复用");
            }
            return null;
        } else {
            String z = kd5.z(str);
            if (!"this".equalsIgnoreCase(z)) {
                DXWidgetNode queryWTByUserId = !zg5.w5(B.getDXRuntimeContext()) ? B.queryWTByUserId(z) : null;
                if (queryWTByUserId == null || queryWTByUserId.getFlattenNode() == null) {
                    queryWTByUserId = B.queryWidgetNodeByUserId(z);
                }
                if (queryWTByUserId != null && queryWTByUserId.getFlattenNode() != null && queryWTByUserId.getFlattenNode().z() != null) {
                    return queryWTByUserId.getFlattenNode().z();
                }
                if (DinamicXEngine.j0()) {
                    h36.r("未找到" + str + "对应的view  原因为： 找不到对应的节点，或者对应节点的view不存，请检查模版bindingX.json是否书写正确");
                }
                return null;
            } else if (B.getReferenceNode() != null && B.getReferenceNode().getWRView() != null) {
                return a2.z();
            } else {
                if (DinamicXEngine.j0()) {
                    h36.r("未找到" + str + "对应的view  原因为： 对应的节点上面的view已经不存在");
                }
                return null;
            }
        }
    }

    public final DXWidgetNode c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("93fbae18", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        if (view instanceof DXRootView) {
            return ((DXRootView) view).getFlattenWidgetNode();
        }
        DXWidgetNode b = kl6.b(view);
        if (!(b instanceof DXWidgetNode)) {
            return null;
        }
        return b;
    }

    @Override // tb.bmj
    public View a(View view, String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("21670ce2", new Object[]{this, view, str});
        }
        if (view == null || TextUtils.isEmpty(str)) {
            if (DinamicXEngine.j0()) {
                h36.r("未找到" + str + "对应的view  原因为：  view == null || TextUtils.isEmpty(ref)");
            }
            return null;
        }
        DXWidgetNode c = c(view);
        if (c != null) {
            z = c.isEnableButter();
        }
        if (!z && eb5.w()) {
            return b(view, str);
        }
        if (c == null || c.getReferenceNode() == null) {
            if (DinamicXEngine.j0()) {
                h36.r("未找到" + str + "对应的view  原因为： 拍平节点是空或者其对应的展开节点是空flattenWidget == null || flattenWidget.getReferenceNode() == null");
            }
            return null;
        }
        DXWidgetNode referenceNode = c.getReferenceNode();
        if (referenceNode != view.getTag(u86.b)) {
            if (DinamicXEngine.j0()) {
                h36.r("未找到" + str + "对应的view  原因为： expandWidget != view.getTag(DXPublicConstant.TAG_ANIMATION_EXPANDED_WIDGET_ON_VIEW)");
            }
            return null;
        } else if (od5.a(referenceNode)) {
            if (DinamicXEngine.j0()) {
                h36.r("未找到" + str + "对应的view  原因为： 当前rootview已经被复用");
            }
            return null;
        } else {
            String z2 = kd5.z(str);
            if (!"this".equalsIgnoreCase(z2)) {
                DXWidgetNode queryWTByUserId = !zg5.w5(referenceNode.getDXRuntimeContext()) ? referenceNode.queryWTByUserId(z2) : null;
                if (queryWTByUserId == null || queryWTByUserId.getReferenceNode() == null) {
                    queryWTByUserId = referenceNode.queryWidgetNodeByUserId(z2);
                }
                if (queryWTByUserId != null && queryWTByUserId.getReferenceNode() != null && queryWTByUserId.getReferenceNode().getWRView() != null) {
                    return queryWTByUserId.getReferenceNode().getWRView().get();
                }
                if (DinamicXEngine.j0()) {
                    h36.r("未找到" + str + "对应的view  原因为： 找不到对应的节点，或者对应节点的view不存，请检查模版bindingX.json是否书写正确");
                }
                return null;
            } else if (referenceNode.getReferenceNode() != null && referenceNode.getReferenceNode().getWRView() != null) {
                return referenceNode.getReferenceNode().getWRView().get();
            } else {
                if (DinamicXEngine.j0()) {
                    h36.r("未找到" + str + "对应的view  原因为： 对应的节点上面的view已经不存在");
                }
                return null;
            }
        }
    }
}
