package com.alibaba.android.umf.node.service.parse;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocolException;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.ComponentView;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Delta;
import com.alibaba.android.umf.datamodel.service.parse.UMFParseIO;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.welcome.f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.c4e;
import tb.dxu;
import tb.fxu;
import tb.j1i;
import tb.jn;
import tb.mu1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ParseProcess {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public c4e d;
    public JSONObject f;
    public String g;
    public final Map<String, RenderComponent> b = new HashMap();
    public final CopyOnWriteArrayList<c> c = new CopyOnWriteArrayList<>();
    public UltronProtocol e = new UltronProtocol();

    /* renamed from: a  reason: collision with root package name */
    public final j1i f2395a = new j1i();

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface ProtocolType {
        public static final String ALL = "ALL";
        public static final String DELTA = "DELTA";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements TreeNode.e<TreeNode<RenderComponent>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MultiTreeNode f2396a;

        public a(ParseProcess parseProcess, MultiTreeNode multiTreeNode) {
            this.f2396a = multiTreeNode;
        }

        @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.e
        public void a(TreeNode<RenderComponent> treeNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("432c49c5", new Object[]{this, treeNode});
            } else if (treeNode != null && treeNode.data() != null && treeNode.data().getComponentView() != null && "layout".equals(treeNode.data().getComponentView().getContainerType()) && "popup_window".equals(treeNode.data().getComponentView().getName())) {
                Component component = treeNode.data().getComponent();
                if (!(component == null || component.getFields() == null)) {
                    Object obj = component.getFields().get("code");
                    if ((obj instanceof String) && !TextUtils.isEmpty(treeNode.data().getKey()) && treeNode.parent() != null && treeNode.parent().data() != null) {
                        Component component2 = treeNode.parent().data().getComponent();
                        if (component2 == null) {
                            component2 = new Component();
                        }
                        component2.addCodePopupWindow((String) obj, treeNode.data());
                    }
                }
                this.f2396a.add(treeNode);
            }
        }

        @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.e
        public boolean isCompleted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8c6bb44c", new Object[]{this})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface c {
        void a(List<AURARenderComponent> list, List<Map<String, String>> list2);
    }

    static {
        t2o.a(80740697);
    }

    public static /* synthetic */ JSONObject a(ParseProcess parseProcess) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("55c52bcd", new Object[]{parseProcess});
        }
        return parseProcess.f;
    }

    public void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32852569", new Object[]{this, cVar});
        } else {
            this.c.add(cVar);
        }
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b3999b0", new Object[]{this, jSONObject});
            return;
        }
        this.f = jSONObject;
        UltronProtocol ultronProtocol = (UltronProtocol) JSON.toJavaObject(jSONObject, UltronProtocol.class);
        this.e = ultronProtocol;
        h(jSONObject, ultronProtocol);
    }

    public final void d(MultiTreeNode multiTreeNode, MultiTreeNode multiTreeNode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9ccb52", new Object[]{this, multiTreeNode, multiTreeNode2});
        } else if (multiTreeNode != null) {
            TreeNode<RenderComponent> clone = multiTreeNode.clone();
            for (TreeNode<RenderComponent> treeNode : m(clone).subtrees()) {
                clone.remove(treeNode);
            }
            multiTreeNode2.add(clone);
        }
    }

    public final void e(JSONObject jSONObject) throws UltronProtocolException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cd2b89", new Object[]{this, jSONObject});
        } else if (!jSONObject.containsKey(AURASubmitEvent.RPC_ENDPOINT)) {
            throw new UltronProtocolException("ultron protocol[endpoint] is NULL!");
        } else if (!jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT).containsKey("protocolVersion")) {
            throw new UltronProtocolException("ultron protocol[protocolVersion] is NULL!");
        } else if (jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT).getString("protocolVersion").compareTo("4.0") < 0) {
            throw new UltronProtocolException("ultron protocol[endpoint] is < 4.0!");
        } else if (!jSONObject.containsKey("data")) {
            throw new UltronProtocolException("ultron protocol[data] is NULL!");
        } else if (!jSONObject.containsKey("container")) {
            throw new UltronProtocolException("ultron protocol[container] is NULL!");
        } else if (!jSONObject.getJSONObject("hierarchy").containsKey("structure")) {
            throw new UltronProtocolException("ultron protocol[hierarchy.structure] is NULL!");
        }
    }

    public final RenderComponent f(String str, Component component, ComponentView componentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderComponent) ipChange.ipc$dispatch("26217f12", new Object[]{this, str, component, componentView});
        }
        RenderComponent renderComponent = new RenderComponent();
        renderComponent.key = str;
        renderComponent.component = component;
        renderComponent.componentView = componentView;
        return renderComponent;
    }

    public final List<AURARenderComponent> g(jn jnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f3a432af", new Object[]{this, jnVar});
        }
        MultiTreeNode i = jnVar.i();
        if (i != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends TreeNode<RenderComponent>> it = i.subtrees().iterator();
            while (it.hasNext()) {
                TreeNode treeNode = (TreeNode) it.next();
                AURARenderComponent b2 = fxu.b(treeNode, null);
                fxu.m(treeNode, b2, new b());
                arrayList.add(b2);
            }
            return arrayList;
        }
        throw new StateStoreException("StateTree is NULL !!");
    }

    public final void h(JSONObject jSONObject, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2b1a63", new Object[]{this, jSONObject, ultronProtocol});
            return;
        }
        String root = ultronProtocol.getHierarchy().getRoot();
        this.g = root;
        if (!TextUtils.isEmpty(root)) {
            Component n = n(this.g);
            ComponentView componentView = new ComponentView();
            if (n != null) {
                componentView = o(n.getType());
            }
            RenderComponent f = f(this.g, n, componentView);
            MultiTreeNode multiTreeNode = new MultiTreeNode(f);
            ((HashMap) this.b).put(this.g, f);
            c4e c4eVar = this.d;
            if (c4eVar != null) {
                c4eVar.m(f);
            }
            JSONObject structure = ultronProtocol.getHierarchy().getStructure();
            if (structure != null) {
                r(multiTreeNode, structure, this.g);
                MultiTreeNode multiTreeNode2 = new MultiTreeNode(new RenderComponent());
                d(multiTreeNode, multiTreeNode2);
                this.f2395a.c(jn.c(this.g, jSONObject, ultronProtocol, multiTreeNode, multiTreeNode2, this.b, null, null));
                return;
            }
            throw new UltronProtocolException("ultron protocol[hierarchy.structure] is NULL!");
        }
        throw new UltronProtocolException("ultron protocol[hierarchy.root] is NULL!");
    }

    public final void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4971ce47", new Object[]{this, jSONObject});
        } else {
            u((UltronDeltaProtocol) JSON.toJavaObject(jSONObject, UltronDeltaProtocol.class));
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public void k(AURAInputData<UMFParseIO> aURAInputData, JSONObject jSONObject, c4e c4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a4bd24", new Object[]{this, aURAInputData, jSONObject, c4eVar});
            return;
        }
        this.d = c4eVar;
        JSONObject t = t(jSONObject);
        String p = p(t);
        p.hashCode();
        if (p.equals("ALL")) {
            c(t);
        } else if (p.equals("DELTA")) {
            i(t);
        }
        q(this.f2395a.b());
    }

    @Deprecated
    public void l(JSONObject jSONObject, c4e c4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcd1f7b", new Object[]{this, jSONObject, c4eVar});
        } else {
            k(null, jSONObject, c4eVar);
        }
    }

    public final TreeNode<RenderComponent> m(TreeNode<RenderComponent> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeNode) ipChange.ipc$dispatch("d79a6bf9", new Object[]{this, treeNode});
        }
        MultiTreeNode multiTreeNode = new MultiTreeNode(new RenderComponent());
        treeNode.traversePreOrder(new a(this, multiTreeNode));
        return multiTreeNode;
    }

    public final Component n(String str) {
        Map<String, Component> data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("162a42e7", new Object[]{this, str});
        }
        UltronProtocol ultronProtocol = this.e;
        if (ultronProtocol == null || (data = ultronProtocol.getData()) == null) {
            return null;
        }
        return data.get(str);
    }

    public final ComponentView o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentView) ipChange.ipc$dispatch("383d9f5d", new Object[]{this, str});
        }
        for (ComponentView componentView : this.e.getContainer().getData()) {
            if (componentView.getType().contains(str)) {
                return componentView;
            }
        }
        return new ComponentView();
    }

    public final String p(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8a0e6df", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            throw new UltronProtocolException("protocol is NULL!");
        } else if (!jSONObject.containsKey("hierarchy")) {
            throw new UltronProtocolException("protocol[hierarchy] is NULL!");
        } else if (jSONObject.getJSONObject("hierarchy").containsKey("delta")) {
            return "DELTA";
        } else {
            e(jSONObject);
            return "ALL";
        }
    }

    public final void q(jn jnVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97674738", new Object[]{this, jnVar});
            return;
        }
        c4e c4eVar = this.d;
        if (c4eVar != null) {
            c4eVar.A(this.e, jnVar.i());
        }
        List<AURARenderComponent> g = g(jnVar);
        c4e c4eVar2 = this.d;
        if (c4eVar2 != null) {
            str = c4eVar2.q0();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(this.g)) {
                str = this.g;
            } else {
                return;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put(f.TYPE_GENERAL, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hashMap);
        Iterator<c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a(g, arrayList);
        }
    }

    public final void r(TreeNode<RenderComponent> treeNode, JSONObject jSONObject, String str) {
        ComponentView componentView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("449d3363", new Object[]{this, treeNode, jSONObject, str});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    Component n = n(string);
                    if (n != null) {
                        componentView = o(n.getType());
                    } else {
                        componentView = null;
                    }
                    RenderComponent f = f(string, n, componentView);
                    ((HashMap) this.b).put(string, f);
                    c4e c4eVar = this.d;
                    if (c4eVar != null) {
                        c4eVar.m(f);
                    }
                    MultiTreeNode multiTreeNode = new MultiTreeNode(f);
                    treeNode.add(multiTreeNode);
                    r(multiTreeNode, jSONObject, string);
                }
            }
        }
    }

    public void s(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e71966", new Object[]{this, cVar});
        } else {
            this.c.remove(cVar);
        }
    }

    public final JSONObject t(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2ce00f27", new Object[]{this, jSONObject});
        }
        if (jSONObject.containsKey(AURASubmitEvent.RPC_ENDPOINT) || jSONObject.containsKey("hierarchy")) {
            return jSONObject;
        }
        return jSONObject.getJSONObject("data");
    }

    public final void u(UltronDeltaProtocol ultronDeltaProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27dfb8e", new Object[]{this, ultronDeltaProtocol});
            return;
        }
        for (Delta delta : ultronDeltaProtocol.getHierarchy().getDelta()) {
            try {
                this.f2395a.f(delta.getOpType(), new mu1(delta, ultronDeltaProtocol, true), null);
            } catch (Throwable th) {
                dxu.a().e("ProtocolProcess", th.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements fxu.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public boolean a(TreeNode<RenderComponent> treeNode, AURARenderComponent aURARenderComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1384b50c", new Object[]{this, treeNode, aURARenderComponent})).booleanValue();
            }
            if (treeNode == null || treeNode.data() == null || treeNode.data().getComponentView() == null || !"rax-container".equals(treeNode.data().getComponentView().getContainerType())) {
                return false;
            }
            if (treeNode.data().getComponent() == null) {
                new Component().fields = new HashMap();
            }
            aURARenderComponent.protocol = fxu.l(ParseProcess.a(ParseProcess.this), treeNode.data().getKey());
            return true;
        }
    }
}
