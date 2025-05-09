package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.ComponentView;
import com.alibaba.android.umf.node.service.parse.ParseProcess;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fxu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    static {
        t2o.a(80740772);
    }

    public static AURARenderComponentLayout a(RenderComponent renderComponent) {
        Component component;
        ComponentView componentView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponentLayout) ipChange.ipc$dispatch("5ed512", new Object[]{renderComponent});
        }
        if (renderComponent == null || (component = renderComponent.getComponent()) == null || (componentView = renderComponent.getComponentView()) == null) {
            return null;
        }
        String name = componentView.getName();
        if (TextUtils.isEmpty(name) || !dm.f.equals(componentView.getContainerType())) {
            return null;
        }
        AURARenderComponentLayout aURARenderComponentLayout = new AURARenderComponentLayout();
        aURARenderComponentLayout.type = name;
        aURARenderComponentLayout.style = component.getFields();
        return aURARenderComponentLayout;
    }

    public static AURARenderComponent b(TreeNode<RenderComponent> treeNode, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("4d5aa77b", new Object[]{treeNode, aURARenderComponent});
        }
        AURARenderComponent aURARenderComponent2 = new AURARenderComponent();
        aURARenderComponent2.parent = aURARenderComponent;
        aURARenderComponent2.mirror = treeNode;
        RenderComponent data = treeNode.data();
        aURARenderComponent2.key = data.getKey();
        AURARenderComponentData d = d(data);
        aURARenderComponent2.data = d;
        d.layout = a(data);
        return aURARenderComponent2;
    }

    public static AURARenderComponentContainer c(RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponentContainer) ipChange.ipc$dispatch("c959ef42", new Object[]{renderComponent});
        }
        ComponentView componentView = renderComponent.getComponentView();
        AURARenderComponentContainer k = k(renderComponent);
        if (k != null) {
            return k;
        }
        return new AURARenderComponentContainer(componentView.getContainerType(), componentView.getName(), componentView.getVersion(), componentView.getType(), componentView.getUrl(), componentView.getMd5());
    }

    public static AURARenderComponentData d(RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponentData) ipChange.ipc$dispatch("8acb5b40", new Object[]{renderComponent});
        }
        if (renderComponent == null || renderComponent.getComponent() == null) {
            return AURARenderComponentData.CreateEmptyUMFRenderComponentData();
        }
        Component component = renderComponent.getComponent();
        return new AURARenderComponentData(component.getType(), component.getFields(), component.getEvents(), component.getFeatures(), c(renderComponent), component.getCodePopupWindowMap(), component.getLocalFields(), component.getStatus());
    }

    public static JSONObject e(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d7615df6", new Object[]{jSONObject, str});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject2;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(str);
        if (jSONObject3 != null) {
            jSONObject2.putAll(jSONObject3);
        }
        return jSONObject2;
    }

    public static AURARenderComponent f(RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("f1d192ee", new Object[]{renderComponent});
        }
        AURARenderComponent aURARenderComponent = new AURARenderComponent();
        aURARenderComponent.key = renderComponent.getKey();
        Component component = renderComponent.getComponent();
        aURARenderComponent.data = new AURARenderComponentData(component.getType(), component.getFields(), component.getEvents(), component.getFeatures(), null, component.getCodePopupWindowMap(), component.getLocalFields(), component.getStatus());
        return aURARenderComponent;
    }

    public static JSONObject g(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c2510eba", new Object[]{jSONObject, str});
        }
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            Iterator<Object> it = jSONObject.getJSONArray("data").iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if ((next instanceof JSONObject) && (jSONArray = (jSONObject2 = (JSONObject) next).getJSONArray("type")) != null && jSONArray.contains(str)) {
                    return jSONObject2;
                }
            }
        }
        return null;
    }

    public static TreeNode<RenderComponent> h(MultiTreeNode multiTreeNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeNode) ipChange.ipc$dispatch("4582a5d", new Object[]{multiTreeNode, str});
        }
        if (!TextUtils.isEmpty(str) && multiTreeNode != null) {
            for (TreeNode<RenderComponent> treeNode : multiTreeNode.preOrdered()) {
                if (str.equals(treeNode.data().getKey())) {
                    return treeNode;
                }
            }
        }
        return null;
    }

    public static List<String> i(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("64877cc7", new Object[]{jSONObject, str});
        }
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            n(jSONObject, str, arrayList);
        }
        return arrayList;
    }

    public static boolean j(RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("697ddea6", new Object[]{renderComponent})).booleanValue();
        }
        if (renderComponent == null || renderComponent.getComponent() == null) {
            return false;
        }
        return renderComponent.getComponent().isHidden();
    }

    public static void m(TreeNode<RenderComponent> treeNode, AURARenderComponent aURARenderComponent, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ab0d27", new Object[]{treeNode, aURARenderComponent, aVar});
        } else if (treeNode != null && !treeNode.isLeaf() && treeNode.subtrees() != null) {
            for (TreeNode<RenderComponent> treeNode2 : treeNode.subtrees()) {
                if (treeNode2.data() != null && !j(treeNode2.data())) {
                    AURARenderComponent b = b(treeNode2, aURARenderComponent);
                    aURARenderComponent.addChildComponent(b);
                    if (aVar == null || !((ParseProcess.b) aVar).a(treeNode2, b)) {
                        m(treeNode2, b, aVar);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void n(JSONObject jSONObject, String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab94b994", new Object[]{jSONObject, str, list});
            return;
        }
        list.add(str);
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof String) {
                    n(jSONObject, (String) next, list);
                }
            }
        }
    }

    public static AURARenderComponentContainer k(RenderComponent renderComponent) {
        ComponentView componentView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponentContainer) ipChange.ipc$dispatch("ed36717a", new Object[]{renderComponent});
        }
        Component component = renderComponent.getComponent();
        if (component == null) {
            return null;
        }
        String type = component.getType();
        if (!TextUtils.isEmpty(type) && (componentView = renderComponent.getComponentView()) != null && TextUtils.isEmpty(componentView.getContainerType()) && type.startsWith("native$")) {
            String[] split = type.split("\\$");
            if (split != null && split.length >= 2) {
                return new AURARenderComponentContainer(split[1], "", "", null, "", "");
            }
            ck.g().b("【解析】", "【独立节点】", "组件type格式不对（native$componentType）|".concat(type));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.alibaba.fastjson.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.alibaba.fastjson.JSONObject] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson.JSONObject l(com.alibaba.fastjson.JSONObject r17, java.lang.String r18) {
        /*
            r0 = r17
            r1 = r18
            com.android.alibaba.ip.runtime.IpChange r2 = tb.fxu.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "bbcd0460"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            java.lang.Object r0 = r2.ipc$dispatch(r3, r4)
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            return r0
        L_0x001c:
            r2 = 0
            if (r0 == 0) goto L_0x00db
            boolean r3 = android.text.TextUtils.isEmpty(r18)
            if (r3 == 0) goto L_0x0027
            goto L_0x00db
        L_0x0027:
            com.alibaba.fastjson.JSONObject r3 = new com.alibaba.fastjson.JSONObject
            r3.<init>()
            java.lang.String r4 = "endpoint"
            com.alibaba.fastjson.JSONObject r5 = e(r0, r4)
            r3.put(r4, r5)
            java.lang.String r4 = "global"
            com.alibaba.fastjson.JSONObject r5 = e(r0, r4)
            r3.put(r4, r5)
            java.lang.String r4 = "features"
            com.alibaba.fastjson.JSONObject r5 = e(r0, r4)
            r3.put(r4, r5)
            java.lang.String r4 = "hierarchy"
            com.alibaba.fastjson.JSONObject r5 = r0.getJSONObject(r4)
            java.lang.String r6 = "structure"
            if (r5 != 0) goto L_0x0054
            r5 = r2
            goto L_0x0058
        L_0x0054:
            com.alibaba.fastjson.JSONObject r5 = r5.getJSONObject(r6)
        L_0x0058:
            java.lang.String r7 = "data"
            com.alibaba.fastjson.JSONObject r8 = r0.getJSONObject(r7)
            java.lang.String r9 = "container"
            com.alibaba.fastjson.JSONObject r0 = r0.getJSONObject(r9)
            java.util.List r10 = i(r5, r1)
            com.alibaba.fastjson.JSONObject r11 = new com.alibaba.fastjson.JSONObject
            r11.<init>()
            com.alibaba.fastjson.JSONObject r12 = new com.alibaba.fastjson.JSONObject
            r12.<init>()
            com.alibaba.fastjson.JSONObject r13 = new com.alibaba.fastjson.JSONObject
            r13.<init>()
            com.alibaba.fastjson.JSONObject r14 = new com.alibaba.fastjson.JSONObject
            r14.<init>()
            com.alibaba.fastjson.JSONArray r15 = new com.alibaba.fastjson.JSONArray
            r15.<init>()
            if (r5 != 0) goto L_0x0084
            return r2
        L_0x0084:
            java.util.Iterator r2 = r10.iterator()
        L_0x0088:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x00c5
            java.lang.Object r10 = r2.next()
            java.lang.String r10 = (java.lang.String) r10
            r17 = r2
            java.lang.Object r2 = r5.get(r10)
            r16 = r5
            boolean r5 = r2 instanceof com.alibaba.fastjson.JSONArray
            if (r5 == 0) goto L_0x00a3
            r12.put(r10, r2)
        L_0x00a3:
            java.lang.Object r2 = r8.get(r10)
            boolean r5 = r2 instanceof com.alibaba.fastjson.JSONObject
            if (r5 == 0) goto L_0x00c0
            r13.put(r10, r2)
            com.alibaba.fastjson.JSONObject r2 = (com.alibaba.fastjson.JSONObject) r2
            java.lang.String r5 = "type"
            java.lang.String r2 = r2.getString(r5)
            com.alibaba.fastjson.JSONObject r2 = g(r0, r2)
            if (r2 == 0) goto L_0x00c0
            r15.add(r2)
        L_0x00c0:
            r2 = r17
            r5 = r16
            goto L_0x0088
        L_0x00c5:
            r11.put(r6, r12)
            r14.put(r7, r15)
            java.lang.String r0 = "root"
            r11.put(r0, r1)
            r3.put(r4, r11)
            r3.put(r7, r13)
            r3.put(r9, r14)
            return r3
        L_0x00db:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fxu.l(com.alibaba.fastjson.JSONObject, java.lang.String):com.alibaba.fastjson.JSONObject");
    }
}
