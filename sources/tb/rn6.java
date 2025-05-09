package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.m;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXViewPager;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rn6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(DXWidgetNode dXWidgetNode, boolean z) {
        j jVar;
        List<DXWidgetNode> originItems;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d278b795", new Object[]{dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null) {
            dXWidgetNode.setVisibility(0);
            dXWidgetNode.unsetStatFlag(2);
            dXWidgetNode.setStatFlag(1);
            dXWidgetNode.setStatFlag(4);
            dXWidgetNode.setStatFlag(256);
            dXWidgetNode.unsetStatFlag(2048);
            dXWidgetNode.unsetStatFlag(4096);
            if (!z) {
                dXWidgetNode.setStatFlag(16384);
                dXWidgetNode.unsetStatFlag(4);
                dXWidgetNode.unsetStatFlag(32);
            }
            if ((dXWidgetNode instanceof j) && (originItems = (jVar = (j) dXWidgetNode).getOriginItems()) != null && !originItems.isEmpty() && (dXWidgetNode.getChildren() == null || dXWidgetNode.getChildren().isEmpty() || (jVar.isHandleListData() && jVar.getListData() != null && !jVar.getListData().isEmpty()))) {
                dXWidgetNode.removeAllChild();
                for (DXWidgetNode dXWidgetNode2 : originItems) {
                    dXWidgetNode.addChild(dXWidgetNode2, false);
                }
            }
            for (int i = 0; i < dXWidgetNode.getChildrenCount(); i++) {
                a(dXWidgetNode.getChildAt(i), z);
            }
        }
    }

    public static DXWidgetNode b(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("78813ab5", new Object[]{dXWidgetNode, new Boolean(z)});
        }
        if (dXWidgetNode == null) {
            return null;
        }
        DXWidgetNode parentWidget = dXWidgetNode.getParentWidget();
        if (parentWidget != null) {
            parentWidget.setStatFlag(16384);
            parentWidget.unsetStatFlag(8);
            parentWidget.unsetStatFlag(32);
            return b(parentWidget, z);
        }
        if (z) {
            dXWidgetNode.updateRefreshType(1);
        }
        return dXWidgetNode;
    }

    public static JSONArray c(DXRuntimeContext dXRuntimeContext) {
        DXWidgetNode queryRootWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("e599538a", new Object[]{dXRuntimeContext});
        }
        if (dXRuntimeContext == null || dXRuntimeContext.W() == null || (queryRootWidgetNode = dXRuntimeContext.W().queryRootWidgetNode()) == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        d(queryRootWidgetNode, jSONArray);
        return jSONArray;
    }

    public static void d(DXWidgetNode dXWidgetNode, JSONArray jSONArray) {
        List<DXWidgetNode> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c07c1600", new Object[]{dXWidgetNode, jSONArray});
        } else if (dXWidgetNode != null) {
            String ref = dXWidgetNode.getRef();
            JSONArray exportMethods = dXWidgetNode.exportMethods();
            if (!TextUtils.isEmpty(ref)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ref", (Object) ref);
                if (exportMethods == null) {
                    exportMethods = new JSONArray();
                }
                jSONObject.put("methods", (Object) exportMethods);
                jSONArray.add(jSONObject);
            }
            if (dXWidgetNode instanceof DXViewPager) {
                list = ((DXViewPager) dXWidgetNode).y();
            } else {
                list = dXWidgetNode.getChildren();
            }
            if (list != null) {
                for (DXWidgetNode dXWidgetNode2 : list) {
                    d(dXWidgetNode2, jSONArray);
                }
            }
        }
    }

    public static void e(JSONObject jSONObject, DXWidgetNode dXWidgetNode, boolean z) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7141d353", new Object[]{jSONObject, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && jSONObject != null) {
            DXWidgetNode queryRootWidgetNode = dXWidgetNode.queryRootWidgetNode();
            if (!(queryRootWidgetNode == null || (dXRuntimeContext = queryRootWidgetNode.getDXRuntimeContext()) == null)) {
                JSONObject i = dXRuntimeContext.i();
                if (i != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        if (entry != null) {
                            i.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else {
                    dXRuntimeContext.f0(jSONObject);
                }
            }
            if (!z) {
                dXWidgetNode = queryRootWidgetNode;
            }
            g(dXWidgetNode, queryRootWidgetNode, z);
        }
    }

    public static void f(JSONObject jSONObject, DXWidgetNode dXWidgetNode, boolean z) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60bf1a38", new Object[]{jSONObject, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null) {
            DXWidgetNode queryRootWidgetNode = dXWidgetNode.queryRootWidgetNode();
            if (!(queryRootWidgetNode == null || (dXRuntimeContext = queryRootWidgetNode.getDXRuntimeContext()) == null)) {
                JSONObject i = dXRuntimeContext.i();
                if (i != null) {
                    i.clear();
                    if (jSONObject != null) {
                        i.putAll(jSONObject);
                    }
                } else {
                    dXRuntimeContext.f0(jSONObject);
                }
            }
            if (!z) {
                dXWidgetNode = queryRootWidgetNode;
            }
            g(dXWidgetNode, queryRootWidgetNode, z);
        }
    }

    public static void g(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, boolean z) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb8eadd", new Object[]{dXWidgetNode, dXWidgetNode2, new Boolean(z)});
        } else if (dXWidgetNode != null && dXWidgetNode2 != null && (dXRuntimeContext = dXWidgetNode.getDXRuntimeContext()) != null) {
            if (dXWidgetNode2.getParentWidget() instanceof bi6) {
                bi6 bi6Var = (bi6) dXWidgetNode2.getParentWidget();
                bi6Var.updateRefreshType(1);
                a(bi6Var, z);
                for (DXWidgetNode dXWidgetNode3 = bi6Var; dXWidgetNode3.getParentWidget() != null; dXWidgetNode3 = dXWidgetNode3.getParentWidget()) {
                    if (dXWidgetNode3.getParentWidget() instanceof DXRecyclerLayout) {
                        ((DXRecyclerLayout) dXWidgetNode3.getParentWidget()).r1(bi6Var);
                        return;
                    }
                }
                return;
            }
            DXWidgetNode b = b(dXWidgetNode, z);
            a(dXWidgetNode, z);
            h(b, dXRuntimeContext.L(), dXRuntimeContext);
        }
    }

    public static void h(DXWidgetNode dXWidgetNode, DXRootView dXRootView, DXRuntimeContext dXRuntimeContext) {
        m o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9238f00", new Object[]{dXWidgetNode, dXRootView, dXRuntimeContext});
        } else if (dXWidgetNode != null && dXRuntimeContext != null && dXRootView != null && (o = dXRuntimeContext.o()) != null) {
            o.y(dXWidgetNode, dXRootView.getFlattenWidgetNode(), dXRootView, dXWidgetNode.getDXRuntimeContext().b(dXWidgetNode), new DXRenderOptions.b().v(true).s(2).B(9).G(dXRuntimeContext.M()).t(dXRuntimeContext.K()).q());
        }
    }
}
