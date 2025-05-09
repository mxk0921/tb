package tb;

import android.text.TextUtils;
import android.util.Log;
import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.ComponentView;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Delta;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import tb.ck;
import tb.dl;
import tb.j1i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cl implements bcb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final acb b;
    public final yi c;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public boolean j;

    /* renamed from: a  reason: collision with root package name */
    public final MultiTreeNode f17124a = new MultiTreeNode(new RenderComponent(), 50);
    public List<dcb> d = new ArrayList();
    public List<gt> e = new ArrayList();
    public List<ccb> f = new ArrayList();
    public final ExecutorService k = dn.d(2, 4, 1, TimeUnit.MINUTES, "aura-parse-service");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements j1i.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j1i f17125a;

        public a(j1i j1iVar) {
            this.f17125a = j1iVar;
        }

        public void a(TreeNode<RenderComponent> treeNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6a973c0", new Object[]{this, treeNode});
                return;
            }
            cl.a(cl.this, this.f17125a.b().e().get(treeNode.data().key), treeNode.data());
            MultiTreeNode multiTreeNode = (MultiTreeNode) treeNode;
            cl.b(cl.this, multiTreeNode, this.f17125a.b().g(), null);
            cl.c(cl.this, multiTreeNode);
            cl.d(cl.this, this.f17125a, multiTreeNode);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MultiTreeNode f17126a;
        public final /* synthetic */ UltronProtocol b;
        public final /* synthetic */ List c;

        public b(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol, List list) {
            this.f17126a = multiTreeNode;
            this.b = ultronProtocol;
            this.c = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cl.e(cl.this, this.f17126a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(80740490);
        t2o.a(80740501);
    }

    public cl(lo loVar, acb acbVar, yi yiVar) {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        this.g = bool.equals(loVar.h("enableParsePerf", Boolean.class, bool2));
        this.h = bool.equals(loVar.h("enableParsePerfV2", Boolean.class, bool2));
        this.i = bool.equals(loVar.h("enableFilterEmptyNode", Boolean.class, bool2));
        this.b = acbVar;
        this.c = yiVar;
    }

    public static /* synthetic */ void a(cl clVar, RenderComponent renderComponent, RenderComponent renderComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2e50f5", new Object[]{clVar, renderComponent, renderComponent2});
        } else {
            clVar.x(renderComponent, renderComponent2);
        }
    }

    public static /* synthetic */ void b(cl clVar, MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a2cb90f", new Object[]{clVar, multiTreeNode, ultronProtocol, jSONObject});
        } else {
            clVar.A(multiTreeNode, ultronProtocol, jSONObject);
        }
    }

    public static /* synthetic */ void c(cl clVar, MultiTreeNode multiTreeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("904f1755", new Object[]{clVar, multiTreeNode});
        } else {
            clVar.C(multiTreeNode);
        }
    }

    public static /* synthetic */ void d(cl clVar, j1i j1iVar, MultiTreeNode multiTreeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8317b6b0", new Object[]{clVar, j1iVar, multiTreeNode});
        } else {
            clVar.y(j1iVar, multiTreeNode);
        }
    }

    public static /* synthetic */ void e(cl clVar, MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4caa8ff5", new Object[]{clVar, multiTreeNode, ultronProtocol, list});
        } else {
            clVar.u(multiTreeNode, ultronProtocol, list);
        }
    }

    public final void A(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ef1a4d", new Object[]{this, multiTreeNode, ultronProtocol, jSONObject});
        } else if (!fj.d("disableStreamParseEach", true) || jSONObject == null || jSONObject.containsKey(multiTreeNode.data().getKey())) {
            for (dcb dcbVar : this.d) {
                AURATraceUtil.a(3, dcbVar.getClass().getSimpleName(), " 扩展点执行");
                dcbVar.w0(multiTreeNode, ultronProtocol);
                AURATraceUtil.b(3);
            }
        }
    }

    public final void C(MultiTreeNode multiTreeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d660eb", new Object[]{this, multiTreeNode});
            return;
        }
        try {
            if (multiTreeNode.data() != null && multiTreeNode.data().isPopupWindowNode() && !multiTreeNode.isRoot()) {
                L(multiTreeNode);
                synchronized (this.f17124a) {
                    this.f17124a.add(multiTreeNode);
                }
            }
        } catch (Throwable th) {
            ck.g().e("AURAParseProcessor", Log.getStackTraceString(th));
        }
    }

    public final boolean D(JSONObject jSONObject, TreeNode<RenderComponent> treeNode, AURARenderComponent aURARenderComponent) {
        Component component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d4e0686", new Object[]{this, jSONObject, treeNode, aURARenderComponent})).booleanValue();
        }
        RenderComponent data = treeNode.data();
        if (data == null || (component = data.component) == null || !component.isIndependentNode()) {
            return false;
        }
        aURARenderComponent.protocol = fxu.l(jSONObject, treeNode.data().key);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
        if (r12.equals(com.alibaba.android.umf.datamodel.protocol.ultron.ProtocolType.COMPLETE) == false) goto L_0x005f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E(tb.j1i r10, com.alibaba.fastjson.JSONObject r11, java.lang.String r12, boolean r13, java.lang.String r14) {
        /*
            r9 = this;
            java.lang.String r0 = "COMPLETE"
            java.lang.String r1 = "DELTA"
            r2 = 2
            r3 = 1
            r4 = 0
            com.android.alibaba.ip.runtime.IpChange r5 = tb.cl.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x0031
            java.lang.Boolean r0 = new java.lang.Boolean
            r0.<init>(r13)
            r13 = 6
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r4] = r9
            r13[r3] = r10
            r13[r2] = r11
            r10 = 3
            r13[r10] = r12
            r10 = 4
            r13[r10] = r0
            r10 = 5
            r13[r10] = r14
            java.lang.String r10 = "d0e31647"
            java.lang.Object r10 = r5.ipc$dispatch(r10, r13)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L_0x0031:
            if (r12 != 0) goto L_0x0044
            java.lang.String r12 = "hierarchy"
            com.alibaba.fastjson.JSONObject r12 = r11.getJSONObject(r12)
            java.lang.String r5 = "delta"
            java.lang.Object r12 = r12.get(r5)
            if (r12 == 0) goto L_0x0043
            r12 = r1
            goto L_0x0044
        L_0x0043:
            r12 = r0
        L_0x0044:
            tb.rbb r5 = tb.ck.g()
            java.lang.String r6 = "protocolType="
            java.lang.String r6 = r6.concat(r12)
            java.lang.String r7 = "AURAParseProcessor"
            java.lang.String r8 = "protocolType"
            r5.c(r7, r8, r6)
            r5 = -1
            int r6 = r12.hashCode()
            switch(r6) {
                case -1838660736: goto L_0x0071;
                case 64930712: goto L_0x0068;
                case 183181625: goto L_0x0061;
                default: goto L_0x005f;
            }
        L_0x005f:
            r2 = -1
            goto L_0x007b
        L_0x0061:
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L_0x007b
            goto L_0x005f
        L_0x0068:
            boolean r12 = r12.equals(r1)
            if (r12 != 0) goto L_0x006f
            goto L_0x005f
        L_0x006f:
            r2 = 1
            goto L_0x007b
        L_0x0071:
            java.lang.String r0 = "STREAM"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L_0x007a
            goto L_0x005f
        L_0x007a:
            r2 = 0
        L_0x007b:
            switch(r2) {
                case 0: goto L_0x008e;
                case 1: goto L_0x0087;
                case 2: goto L_0x007f;
                default: goto L_0x007e;
            }
        L_0x007e:
            return r4
        L_0x007f:
            r9.j = r3
            r12 = 0
            boolean r10 = r9.h(r10, r11, r14, r12)
            return r10
        L_0x0087:
            r9.j = r4
            boolean r10 = r9.m(r10, r11, r13)
            return r10
        L_0x008e:
            java.lang.Object r12 = r10.b()
            tb.jn r12 = (tb.jn) r12
            com.alibaba.fastjson.JSONObject r12 = r12.h()
            com.alibaba.fastjson.JSONObject r12 = r9.G(r12, r11)
            java.lang.String r13 = "data"
            com.alibaba.fastjson.JSONObject r11 = r11.getJSONObject(r13)
            boolean r10 = r9.h(r10, r12, r14, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cl.E(tb.j1i, com.alibaba.fastjson.JSONObject, java.lang.String, boolean, java.lang.String):boolean");
    }

    public final void F(String str, jn jnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b325cda8", new Object[]{this, str, jnVar});
        } else if (str != null) {
            if (str.equals("rollback")) {
                jnVar.m();
            } else if (str.equals("default")) {
                jnVar.b();
            }
        }
    }

    public final JSONObject G(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3793078b", new Object[]{this, jSONObject, jSONObject2});
        }
        if (jSONObject == null) {
            return jSONObject2;
        }
        return h9v.b(jSONObject2, jSONObject);
    }

    public final void H(TreeNode<RenderComponent> treeNode, AURARenderComponent aURARenderComponent, Map<String, AURARenderComponent> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a12f566", new Object[]{this, treeNode, aURARenderComponent, map, jSONObject});
        } else if (aURARenderComponent != null && treeNode != null && !treeNode.isLeaf() && treeNode.subtrees() != null) {
            for (TreeNode<RenderComponent> treeNode2 : treeNode.subtrees()) {
                RenderComponent data = treeNode2.data();
                if (data != null && !fxu.j(data) && !p(treeNode2)) {
                    if (!this.f.isEmpty()) {
                        for (ccb ccbVar : this.f) {
                            if (ccbVar.Y(data)) {
                                break;
                            }
                        }
                    }
                    AURARenderComponent r = r(aURARenderComponent, treeNode2, map);
                    if (!data.isPopupWindowNode()) {
                        ComponentView componentView = data.componentView;
                        if (componentView != null && "rax-container".equals(componentView.getContainerType())) {
                            r.protocol = fxu.l(jSONObject, data.key);
                            return;
                        } else if (!D(jSONObject, treeNode2, r)) {
                            H(treeNode2, r, map, jSONObject);
                        } else {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public final void I(TreeNode<RenderComponent> treeNode, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e198d33c", new Object[]{this, treeNode, aURARenderComponent});
            return;
        }
        RenderComponent data = treeNode.data();
        aURARenderComponent.key = data.key;
        AURARenderComponentData d = fxu.d(data);
        aURARenderComponent.data = d;
        d.layout = fxu.a(data);
    }

    public final void K(AURAGlobalData aURAGlobalData, TreeNode<RenderComponent> treeNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86773959", new Object[]{this, aURAGlobalData, treeNode, str});
        } else if (!TextUtils.isEmpty(str) && str.equals(treeNode.data().key)) {
            aURAGlobalData.update("global_data_render_root", treeNode);
        }
    }

    public final void L(TreeNode<RenderComponent> treeNode) {
        RenderComponent data;
        RenderComponent data2;
        Component component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da27a787", new Object[]{this, treeNode});
            return;
        }
        TreeNode<RenderComponent> parent = treeNode.parent();
        if (parent != null && (data = parent.data()) != null && (data2 = treeNode.data()) != null && !TextUtils.isEmpty(data2.key) && (component = data2.component) != null && component.getFields() != null) {
            Object obj = component.getFields().get("code");
            if (obj instanceof String) {
                data.getComponent().addCodePopupWindow((String) obj, data2);
            }
        }
    }

    public final void f(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol, List<gt> list, List<gt> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a772c7", new Object[]{this, multiTreeNode, ultronProtocol, list, list2});
            return;
        }
        cn.c(new b(multiTreeNode, ultronProtocol, list2));
        u(multiTreeNode, ultronProtocol, list);
    }

    public final void g(MultiTreeNode multiTreeNode, MultiTreeNode multiTreeNode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9ccb52", new Object[]{this, multiTreeNode, multiTreeNode2});
        } else if (multiTreeNode != null) {
            synchronized (this.f17124a) {
                try {
                    for (TreeNode<RenderComponent> treeNode : this.f17124a.subtrees()) {
                        multiTreeNode2.add(treeNode);
                    }
                    multiTreeNode2.add(multiTreeNode);
                    this.f17124a.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean h(j1i j1iVar, JSONObject jSONObject, String str, JSONObject jSONObject2) {
        UltronProtocol ultronProtocol;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c16f9e5", new Object[]{this, j1iVar, jSONObject, str, jSONObject2})).booleanValue();
        }
        if (k(jSONObject)) {
            return false;
        }
        if (this.g) {
            ultronProtocol = new UltronProtocol(jSONObject);
        } else {
            ultronProtocol = (UltronProtocol) JSON.toJavaObject(jSONObject, UltronProtocol.class);
        }
        ultronProtocol.setOriginData(jSONObject);
        j1iVar.c(jn.p(j1iVar.b(), jSONObject, ultronProtocol));
        j(j1iVar, jSONObject, ultronProtocol, str, jSONObject2);
        return true;
    }

    public final Map<String, AURARenderComponent> i(jn jnVar, AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fb02e02f", new Object[]{this, jnVar, aURAGlobalData});
        }
        HashMap hashMap = new HashMap();
        MultiTreeNode i = jnVar.i();
        if (i == null) {
            return hashMap;
        }
        Map<String, AURARenderComponent> j = jnVar.j();
        JSONObject h = jnVar.h();
        for (TreeNode<RenderComponent> treeNode : i.subtrees()) {
            RenderComponent data = treeNode.data();
            if (data != null) {
                String str = data.key;
                if (!TextUtils.isEmpty(str)) {
                    AURATraceUtil.a(3, str);
                    K(aURAGlobalData, treeNode, jnVar.k());
                    AURARenderComponent r = r(null, treeNode, j);
                    H(treeNode, r, j, h);
                    hashMap.put(str, r);
                    AURATraceUtil.b(3);
                }
            }
        }
        jnVar.n(j);
        return hashMap;
    }

    public final boolean l(j1i j1iVar, UltronDeltaProtocol ultronDeltaProtocol, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9257bb2f", new Object[]{this, j1iVar, ultronDeltaProtocol, new Boolean(z)})).booleanValue();
        }
        for (Delta delta : ultronDeltaProtocol.getHierarchy().getDelta()) {
            try {
                j1iVar.f(delta.getOpType(), new mu1(delta, ultronDeltaProtocol, z), new a(j1iVar));
            } catch (Throwable th) {
                ((dl.a) this.b).e(new mi(0, "AURAParseServiceDomain", "-4000_DELTA_MERGER_EXCEPTION", th.toString()));
                return false;
            }
        }
        return true;
    }

    public final void n(int i, String str, String str2, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5c8a30", new Object[]{this, new Integer(i), str, str2, hashMap});
        } else if (this.b != null) {
            mi miVar = new mi(i, "AURAParseServiceDomain", str, str2);
            if (hashMap != null) {
                miVar.i(hashMap);
            }
            ((dl.a) this.b).e(miVar);
        }
    }

    public final boolean p(TreeNode<RenderComponent> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96211ebd", new Object[]{this, treeNode})).booleanValue();
        }
        if (!this.i || !treeNode.isLeaf()) {
            return false;
        }
        RenderComponent data = treeNode.data();
        if (data == null) {
            return true;
        }
        Component component = data.component;
        if (component.getFields() == null || component.getFields().isEmpty()) {
            return true;
        }
        return false;
    }

    public final AURARenderComponent q(String str, jn jnVar, AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("9e6ed1e1", new Object[]{this, str, jnVar, aURAGlobalData});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        AURARenderComponent aURARenderComponent = i(jnVar, aURAGlobalData).get(str);
        if (aURARenderComponent == null) {
            ck.g().e("渲染树为null", ck.b.b().l("AURAParseProcessor").i("AURA/error").g("renderRootKey", str).a());
        }
        return aURARenderComponent;
    }

    public final AURARenderComponent r(AURARenderComponent aURARenderComponent, TreeNode<RenderComponent> treeNode, Map<String, AURARenderComponent> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("595f98b3", new Object[]{this, aURARenderComponent, treeNode, map});
        }
        String str = treeNode.data().key;
        AURARenderComponent aURARenderComponent2 = map.get(str);
        if (aURARenderComponent2 == null) {
            aURARenderComponent2 = fxu.b(treeNode, aURARenderComponent);
            if (!TextUtils.isEmpty(str)) {
                map.put(str, aURARenderComponent2);
            }
            if (aURARenderComponent != null) {
                aURARenderComponent.addChildComponent(aURARenderComponent2);
            }
        } else {
            I(treeNode, aURARenderComponent2);
        }
        return aURARenderComponent2;
    }

    public final j1i s(AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j1i) ipChange.ipc$dispatch("1fed1e8f", new Object[]{this, aURAGlobalData});
        }
        j1i j1iVar = (j1i) aURAGlobalData.get("aura_parse_global_data_parse", j1i.class);
        if (j1iVar != null) {
            return j1iVar;
        }
        return j1i.e();
    }

    public final void t(j1i j1iVar, UltronProtocol ultronProtocol, TreeNode<RenderComponent> treeNode, JSONObject jSONObject, String str, Map<String, RenderComponent> map, JSONObject jSONObject2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70cde545", new Object[]{this, j1iVar, ultronProtocol, treeNode, jSONObject, str, map, jSONObject2});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray != null) {
            int i2 = 0;
            while (i2 < jSONArray.size()) {
                String string = jSONArray.getString(i2);
                if (TextUtils.isEmpty(string)) {
                    i = i2;
                } else {
                    AURATraceUtil.a(3, string);
                    RenderComponent a2 = el.a(ultronProtocol, string);
                    x(j1iVar.b().e().get(string), a2);
                    map.put(string, a2);
                    MultiTreeNode multiTreeNode = new MultiTreeNode(a2);
                    treeNode.add(multiTreeNode);
                    if (!this.h) {
                        A(multiTreeNode, ultronProtocol, jSONObject2);
                        C(multiTreeNode);
                    }
                    AURATraceUtil.b(3);
                    i = i2;
                    t(j1iVar, ultronProtocol, multiTreeNode, jSONObject, string, map, jSONObject2);
                }
                i2 = i + 1;
            }
        }
    }

    public final void u(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol, List<gt> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d53897ca", new Object[]{this, multiTreeNode, ultronProtocol, list});
            return;
        }
        AURATraceUtil.a(3, multiTreeNode.data().key, " parseEach扩展点执行");
        for (gt gtVar : list) {
            gtVar.w0(multiTreeNode, ultronProtocol);
        }
        C(multiTreeNode);
        AURATraceUtil.b(3);
    }

    public final void v(jn jnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79570463", new Object[]{this, jnVar});
            return;
        }
        MultiTreeNode i = jnVar.i();
        UltronProtocol g = jnVar.g();
        if (i != null) {
            for (dcb dcbVar : this.d) {
                AURATraceUtil.a(3, dcbVar.getClass().getSimpleName().concat(" OnFinishParse扩展点执行"));
                dcbVar.p(i, g);
                AURATraceUtil.b(3);
            }
        }
    }

    public final boolean w(List<rl> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9215aff0", new Object[]{this, list})).booleanValue();
        }
        for (rl rlVar : list) {
            JSONObject b2 = rlVar.b();
            if (b2 != null && el.c(b2)) {
                n(0, "-3003_PROTOCOL_DEGRADE", "endpoint包含degrade，协议降级", null);
                return false;
            }
        }
        return true;
    }

    public final void x(RenderComponent renderComponent, RenderComponent renderComponent2) {
        Component component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3130241e", new Object[]{this, renderComponent, renderComponent2});
        } else if (renderComponent != null && (component = renderComponent.component) != null && component.getLocalFields() != null) {
            if (renderComponent2.component == null) {
                renderComponent2.component = new Component();
            }
            renderComponent2.component.localFields = renderComponent.component.getLocalFields();
            if (renderComponent2.component.getLocalFields() != null) {
                for (Map.Entry<String, Object> entry : renderComponent2.component.getLocalFields().entrySet()) {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(key)) {
                        renderComponent2.component.getFields().put(key, entry.getValue());
                    }
                }
            }
        }
    }

    public final void y(j1i j1iVar, MultiTreeNode multiTreeNode) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b94f6263", new Object[]{this, j1iVar, multiTreeNode});
        } else if (!multiTreeNode.isValid()) {
            ck.g().a("AURAParseProcessor", "mergeDeltaData", "current node is not valid!");
        } else {
            String str = multiTreeNode.data().key;
            UltronProtocol g = j1iVar.b().g();
            Component component = multiTreeNode.data().component;
            if (component != null) {
                g.getData().put(str, component);
            }
            JSONObject h = j1iVar.b().h();
            if (h != null && (jSONObject = h.getJSONObject("data")) != null) {
                jSONObject.put(str, (Object) component);
            }
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.k.shutdown();
        }
    }

    public final void B(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f9ba4aa", new Object[]{this, multiTreeNode, ultronProtocol, jSONObject});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (gt gtVar : this.e) {
            if (gtVar.r()) {
                arrayList.add(gtVar);
            } else {
                arrayList2.add(gtVar);
            }
        }
        for (TreeNode<RenderComponent> treeNode : multiTreeNode.preOrdered()) {
            if (!fj.d("disableStreamParseEach", true) || jSONObject == null || jSONObject.containsKey(treeNode.data().getKey())) {
                f((MultiTreeNode) treeNode, ultronProtocol, arrayList, arrayList2);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        ck.g().e("执行扩展点共 耗时 = " + (currentTimeMillis2 - currentTimeMillis), ck.b.b().i("AURA/performance").g("message", "主线程任务：" + arrayList.size() + " 工作线程任务：" + arrayList2.size()).d("start", currentTimeMillis).d("end", currentTimeMillis2).a());
    }

    public final void J(AURAGlobalData aURAGlobalData, j1i j1iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943b7bc5", new Object[]{this, aURAGlobalData, j1iVar});
            return;
        }
        jn b2 = j1iVar.b();
        String k = b2.k();
        if (this.b != null) {
            long currentTimeMillis = System.currentTimeMillis();
            AURARenderComponent q = q(k, b2, aURAGlobalData);
            aURAGlobalData.update("aura_parse_global_data_parse", j1iVar);
            aURAGlobalData.update("aura_data_protocol_json", j1iVar.b().h());
            aURAGlobalData.update("aura_data_protocol_bean", j1iVar.b().g());
            long currentTimeMillis2 = System.currentTimeMillis();
            if (this.j) {
                rbb g = ck.g();
                g.e("生成渲染树 耗时 = " + (currentTimeMillis2 - currentTimeMillis), ck.b.b().i("AURA/performance").d("start", currentTimeMillis).d("end", currentTimeMillis2).a());
            }
            AURATraceUtil.b(3);
            ((dl.a) this.b).f(q);
        }
    }

    public final boolean k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a324604", new Object[]{this, jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT);
        if (jSONObject2 == null) {
            n(0, "-2003_EMPTY_ENDPOINT", "全量协议protocol[endpoint]为空", null);
            return true;
        }
        String string = jSONObject2.getString("protocolVersion");
        if (TextUtils.isEmpty(string) || string.compareTo("4.0") < 0) {
            HashMap<String, Object> hashMap = new HashMap<>();
            if (string.compareTo(k75.VIDEOCONFIG_API_VERSION_3) == 0) {
                hashMap.put("NextRPCRemoteResponseJson", jSONObject);
            }
            n(0, "-3000_EMPTY_PROTOCOL_VERSION_BELOW_4", "全量协议endpoint[protocolVersion]小于4.0版本", hashMap);
            return true;
        }
        for (dcb dcbVar : this.d) {
            String s = dcbVar.s(jSONObject2);
            if (!"0".equals(s)) {
                n(0, s, "自定义error", null);
                return true;
            }
        }
        return false;
    }

    public final boolean m(j1i j1iVar, JSONObject jSONObject, boolean z) {
        UltronDeltaProtocol ultronDeltaProtocol;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39677674", new Object[]{this, j1iVar, jSONObject, new Boolean(z)})).booleanValue();
        }
        if (j1iVar.b().i() == null) {
            n(1, "-5001_DELTA_STATE_TREE_EMPTY", "状态树为空，不执行差量操作", null);
            return false;
        }
        if (this.g) {
            ultronDeltaProtocol = new UltronDeltaProtocol(jSONObject);
        } else {
            ultronDeltaProtocol = (UltronDeltaProtocol) JSON.toJavaObject(jSONObject, UltronDeltaProtocol.class);
        }
        return l(j1iVar, ultronDeltaProtocol, z);
    }

    public void o(AURAGlobalData aURAGlobalData, AURAParseIO aURAParseIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d05f83c", new Object[]{this, aURAGlobalData, aURAParseIO});
            return;
        }
        yi yiVar = this.c;
        if (yiVar != null) {
            this.d = yiVar.f(dcb.class);
            this.e = this.c.f(gt.class);
            this.f = this.c.f(ccb.class);
        }
        j1i s = s(aURAGlobalData);
        String action = aURAParseIO.getAction();
        F(action, s.b());
        long currentTimeMillis = System.currentTimeMillis();
        AURATraceUtil.a(3, "aura-parse-createStateTree");
        if (!"rollback".equals(action)) {
            List<rl> data = aURAParseIO.getData();
            if (w(data)) {
                for (rl rlVar : data) {
                    JSONObject b2 = rlVar.b();
                    if (b2 != null && !E(s, b2, rlVar.c(), rlVar.a(), aURAParseIO.getRootKey())) {
                        ck.g().c("AURAParseProcessor", BaseExecutor.EXECUTOR_SUFFIX, "protocolDispatch false ");
                        return;
                    }
                }
            } else {
                return;
            }
        }
        AURATraceUtil.b(3);
        AURATraceUtil.a(3, "invokeOnFinishParseWithRootExtensions");
        long currentTimeMillis2 = System.currentTimeMillis();
        if (this.j) {
            rbb g = ck.g();
            g.e("生成状态树 耗时 = " + (currentTimeMillis2 - currentTimeMillis), ck.b.b().i("AURA/performance").d("start", currentTimeMillis).d("end", currentTimeMillis2).a());
        }
        if (s.b().l() == null || TextUtils.isEmpty(s.b().k())) {
            ck.g().a("AURAParseProcessor", BaseExecutor.EXECUTOR_SUFFIX, "stateTree is empty");
            n(1, "-5000_RENDER_STATE_TREE_EMPTY", "状态树为空，不执行渲染", null);
            return;
        }
        v(s.b());
        AURATraceUtil.b(3);
        AURATraceUtil.a(3, "aura-parse-createRenderTree");
        J(aURAGlobalData, s);
    }

    public final void j(j1i j1iVar, JSONObject jSONObject, UltronProtocol ultronProtocol, String str, JSONObject jSONObject2) {
        String str2;
        String str3;
        MultiTreeNode multiTreeNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527d5949", new Object[]{this, j1iVar, jSONObject, ultronProtocol, str, jSONObject2});
            return;
        }
        String root = ultronProtocol.getHierarchy().getRoot();
        if (TextUtils.isEmpty(root)) {
            ck.g().c("AURAParseProcessor", "createStateTree", "protocol[hierarchy.root] is NULL!");
        }
        long currentTimeMillis = System.currentTimeMillis();
        RenderComponent a2 = el.a(ultronProtocol, root);
        long currentTimeMillis2 = System.currentTimeMillis();
        MultiTreeNode multiTreeNode2 = new MultiTreeNode(a2);
        if (this.j) {
            rbb g = ck.g();
            str3 = "createStateTree";
            str2 = "AURAParseProcessor";
            g.e("t1 耗时 = " + (currentTimeMillis2 - currentTimeMillis), ck.b.b().i("AURA/performance").d("start", currentTimeMillis).d("end", currentTimeMillis2).a());
        } else {
            str3 = "createStateTree";
            str2 = "AURAParseProcessor";
        }
        HashMap hashMap = new HashMap();
        hashMap.put(root, a2);
        if (!this.h) {
            A(multiTreeNode2, ultronProtocol, jSONObject2);
            C(multiTreeNode2);
        }
        JSONObject structure = ultronProtocol.getHierarchy().getStructure();
        long currentTimeMillis3 = System.currentTimeMillis();
        t(j1iVar, ultronProtocol, multiTreeNode2, structure, root, hashMap, jSONObject2);
        long currentTimeMillis4 = System.currentTimeMillis();
        if (this.j) {
            rbb g2 = ck.g();
            g2.e("状态树遍历 耗时 = " + (currentTimeMillis4 - currentTimeMillis3), ck.b.b().i("AURA/performance").d("start", currentTimeMillis3).d("end", currentTimeMillis4).d("树节点数量", multiTreeNode2.size()).a());
        }
        if (this.h) {
            multiTreeNode = multiTreeNode2;
            B(multiTreeNode, ultronProtocol, jSONObject2);
        } else {
            multiTreeNode = multiTreeNode2;
        }
        AURATraceUtil.a(3, "buildRenderStateTree");
        long currentTimeMillis5 = System.currentTimeMillis();
        MultiTreeNode multiTreeNode3 = new MultiTreeNode(new RenderComponent());
        g(multiTreeNode, multiTreeNode3);
        rbb g3 = ck.g();
        g3.c(str2, str3, "状态树总长：" + multiTreeNode.size() + ";渲染状态树总长：" + multiTreeNode3.size());
        long currentTimeMillis6 = System.currentTimeMillis();
        if (this.j) {
            rbb g4 = ck.g();
            g4.e("渲染状态树遍历 耗时 = " + (currentTimeMillis6 - currentTimeMillis5), ck.b.b().i("AURA/performance").d("start", currentTimeMillis5).d("end", currentTimeMillis6).a());
        }
        AURATraceUtil.b(3);
        String k = j1iVar.b().k();
        if (!TextUtils.isEmpty(str)) {
            k = str;
        } else if (TextUtils.isEmpty(k)) {
            k = root;
        }
        j1iVar.d(jn.c(k, jSONObject, ultronProtocol, multiTreeNode, multiTreeNode3, hashMap, null, null));
    }
}
