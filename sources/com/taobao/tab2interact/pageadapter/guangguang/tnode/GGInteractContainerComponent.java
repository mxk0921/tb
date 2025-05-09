package com.taobao.tab2interact.pageadapter.guangguang.tnode;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.tab2interact.core.component.browser.BrowserBadge;
import com.taobao.tab2interact.core.layer.h5.H5InteractLayer;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.j;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.akt;
import tb.cpa;
import tb.em2;
import tb.hgf;
import tb.hk8;
import tb.jfw;
import tb.jmi;
import tb.piw;
import tb.sff;
import tb.t2o;
import tb.vgh;
import tb.vv1;
import tb.yps;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class GGInteractContainerComponent extends Component<View, jfw> implements piw, j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FLUID_BIZ_NAME_SEPARATOR = "_";
    private static final String FLUID_BIZ_TYPE = "ggtab3";
    private static final int LEVEL_INTERACT_CONTAINER_VIEW = 100;
    private static final String PAGE_QUERY_CHANGE_ARGS_QUERY = "query";
    private static final String TAB_APPEAR_DISAPPEAR_ARGS_TRIGGER_TYPE_NAVIGATION = "navigation";
    private static final String TAB_APPEAR_DISAPPEAR_ARGS_TRIGGER_TYPE_OTHER = "other";
    private static final String TAB_APPEAR_DISAPPEAR_ARGS_TRIGGER_TYPE_TAB = "tab";
    private static final String TAB_LIFE_CYCLE_ARGS_ID = "id";
    private static final String TAB_LIFE_CYCLE_ARGS_TRIGGER_TYPE = "triggerType";
    private static final String TAB_LIFE_CYCLE_ARGS_TYPE = "type";
    private static final String TAG = "GGInteractContainerComponent";
    private sff interactContainer;
    private hgf interactTabAdapterManager;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements n.e<n> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11865a;

        public a(GGInteractContainerComponent gGInteractContainerComponent, String str) {
            this.f11865a = str;
        }

        /* renamed from: c */
        public boolean a(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e13bdd0a", new Object[]{this, nVar})).booleanValue();
            }
            return this.f11865a.equals(nVar.H("tab-id"));
        }

        /* renamed from: d */
        public boolean b(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("429eb190", new Object[]{this, nVar})).booleanValue();
            }
            return false;
        }
    }

    static {
        t2o.a(689963215);
        t2o.a(503317209);
        t2o.a(503317092);
    }

    private void attachInteractContainerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d75c39f2", new Object[]{this});
            return;
        }
        TNodeView tNodeView = getTNodeView();
        if (tNodeView != null && this.interactContainer != null) {
            vgh.c(this, TAG, "将互动容器View添加到TNode根节点上，满足添加条件");
            tNodeView.addUpperView(this.interactContainer.e(), new FrameLayout.LayoutParams(-1, -1), 100, null);
        }
    }

    private void createInteractInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255f8f0e", new Object[]{this});
            return;
        }
        Context N = this.node.N();
        if (N != null) {
            jmi jmiVar = new jmi();
            vv1 vv1Var = new vv1();
            this.interactContainer = new sff(N, jmiVar, vv1Var);
            BrowserBadge browserBadge = new BrowserBadge(N, this.interactContainer.e(), jmiVar, vv1Var);
            this.interactContainer.a(browserBadge);
            H5InteractLayer h5InteractLayer = new H5InteractLayer(N, this.interactContainer.e(), jmiVar, vv1Var);
            this.interactContainer.b(h5InteractLayer);
            yps ypsVar = new yps();
            this.interactTabAdapterManager = new hgf(jmiVar, ypsVar);
            em2 em2Var = new em2(jmiVar, vv1Var, ypsVar, browserBadge);
            cpa cpaVar = new cpa(jmiVar, vv1Var, ypsVar, h5InteractLayer);
            this.interactTabAdapterManager.a(em2Var);
            this.interactTabAdapterManager.a(cpaVar);
            this.interactContainer.f();
            this.interactTabAdapterManager.c();
        }
    }

    private void detachInteractContainerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf88464", new Object[]{this});
            return;
        }
        TNodeView tNodeView = getTNodeView();
        if (tNodeView != null && this.interactContainer != null) {
            vgh.c(this, TAG, "将互动容器View从TNode根节点上移除，满足移除条件");
            tNodeView.removeUpperView(this.interactContainer.e());
        }
    }

    private String getArgsId(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5458710", new Object[]{this, map});
        }
        return getArgsString(map, "id");
    }

    private String getArgsString(Map map, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba1c7b7c", new Object[]{this, map, str});
        }
        if (map == null || (obj = map.get(str)) == null) {
            return null;
        }
        return obj.toString();
    }

    private String getArgsTriggerType(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9451281", new Object[]{this, map});
        }
        return getArgsString(map, "triggerType");
    }

    private String getArgsType(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7aea4ef", new Object[]{this, map});
        }
        return getArgsString(map, "type");
    }

    private String getEngineId() {
        o P;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ca44c66", new Object[]{this});
        }
        n nVar = this.node;
        if (nVar == null || (P = nVar.P()) == null) {
            return null;
        }
        return P.R();
    }

    private TNodeView getTNodeView() {
        o P;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("e1b19e09", new Object[]{this});
        }
        n tNode = getTNode();
        if (tNode == null || (P = tNode.P()) == null) {
            return null;
        }
        return P.L();
    }

    private void handleDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bce839", new Object[]{this});
            return;
        }
        vgh.c(this, TAG, "处理销毁的消息");
        sff sffVar = this.interactContainer;
        if (sffVar == null || this.interactTabAdapterManager == null) {
            vgh.c(this, TAG, "处理销毁的消息，不满足条件");
            return;
        }
        sffVar.g();
        this.interactTabAdapterManager.d();
    }

    private void handlePageQueryChange(Map map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfc293d", new Object[]{this, map});
            return;
        }
        vgh.c(this, TAG, "处理页面URL参数发生改变的消息，args=" + map);
        if (map == null) {
            vgh.c(this, TAG, "处理页面URL参数发生改变的消息，args无效");
            return;
        }
        Object obj = map.get("query");
        if (!(obj instanceof Map)) {
            vgh.c(this, TAG, "处理页面URL参数发生改变的消息，query无效");
            return;
        }
        Set<Map.Entry> entrySet = ((Map) obj).entrySet();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && !TextUtils.isEmpty(key.toString())) {
                String obj2 = key.toString();
                if (value != null) {
                    str = value.toString();
                } else {
                    str = "";
                }
                hashMap.put(obj2, str);
            }
        }
        if (this.interactContainer == null || hashMap.isEmpty()) {
            vgh.c(this, TAG, "处理页面URL参数发生改变的消息，interactContainer或copyQuery为空");
        } else {
            this.interactContainer.j(hashMap);
        }
    }

    private void handleTabAppear(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158ac89c", new Object[]{this, map});
            return;
        }
        vgh.c(this, TAG, "处理Tab可见的消息，args=" + map);
        String argsId = getArgsId(map);
        String argsTriggerType = getArgsTriggerType(map);
        if (this.interactContainer == null || TextUtils.isEmpty(argsId) || TextUtils.isEmpty(argsTriggerType)) {
            vgh.c(this, TAG, "处理Tab可见的消息，不满足条件");
        } else if (TextUtils.equals(argsTriggerType, "tab")) {
            this.interactContainer.m(argsId, "tab");
        } else if (TextUtils.equals(argsTriggerType, "navigation")) {
            this.interactContainer.h("navigation");
            this.interactContainer.m(argsId, "navigation");
        } else if (TextUtils.equals(argsTriggerType, "other")) {
            this.interactContainer.h("other");
            this.interactContainer.m(argsId, "other");
        }
    }

    private void handleTabDestroy(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2ad2011", new Object[]{this, map});
            return;
        }
        vgh.c(this, TAG, "处理Tab销毁的消息，args=" + map);
        String argsId = getArgsId(map);
        if (this.interactContainer == null || this.interactTabAdapterManager == null || TextUtils.isEmpty(argsId)) {
            vgh.c(this, TAG, "处理Tab销毁的消息，不满足条件");
            return;
        }
        this.interactContainer.l(argsId);
        this.interactTabAdapterManager.f(argsId);
    }

    private void handleTabDisappear(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ebde88", new Object[]{this, map});
            return;
        }
        vgh.c(this, TAG, "处理Tab不可见的消息，args=" + map);
        String argsId = getArgsId(map);
        String argsTriggerType = getArgsTriggerType(map);
        if (this.interactContainer == null || TextUtils.isEmpty(argsId) || TextUtils.isEmpty(argsTriggerType)) {
            vgh.c(this, TAG, "处理Tab不可见的消息，不满足条件");
        } else if (TextUtils.equals(argsTriggerType, "tab")) {
            this.interactContainer.n(argsId, "tab");
        } else if (TextUtils.equals(argsTriggerType, "navigation")) {
            this.interactContainer.n(argsId, "navigation");
            this.interactContainer.i("navigation");
        } else if (TextUtils.equals(argsTriggerType, "other")) {
            this.interactContainer.n(argsId, "other");
            this.interactContainer.i("other");
        }
    }

    public static /* synthetic */ Object ipc$super(GGInteractContainerComponent gGInteractContainerComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1375152011) {
            super.onAttach();
            return null;
        } else if (hashCode == 1604521168) {
            super.onCreate((n) objArr[0]);
            return null;
        } else if (hashCode == 2127624665) {
            super.onDetach();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tab2interact/pageadapter/guangguang/tnode/GGInteractContainerComponent");
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onAttach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f7278b", new Object[]{this});
            return;
        }
        super.onAttach();
        vgh.c(this, TAG, "互动容器组件attach的时机");
        attachInteractContainerView();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onCreate(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa30cd0", new Object[]{this, nVar});
            return;
        }
        super.onCreate(nVar);
        vgh.c(this, TAG, "互动容器组件创建的时机");
        createInteractInstance();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        vgh.c(this, TAG, "互动容器组件detach的时机");
        detachInteractContainerView();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        return false;
    }

    private void handleTabCreate(Map map, n nVar) {
        n z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e99921d", new Object[]{this, map, nVar});
            return;
        }
        vgh.c(this, TAG, "处理Tab创建的消息，args=" + map);
        String argsId = getArgsId(map);
        String argsType = getArgsType(map);
        if (this.interactContainer == null || this.interactTabAdapterManager == null || TextUtils.isEmpty(argsId) || TextUtils.isEmpty(argsType) || nVar == null) {
            vgh.c(this, TAG, "处理Tab创建的消息，不满足条件");
            return;
        }
        if (TextUtils.equals(argsType, "video")) {
            String str = "ggtab3_" + argsId;
            if (akt.A0()) {
                str = FluidInstanceConfig.appendBizName("ggtab3", argsId, getEngineId());
            }
            if (!TextUtils.isEmpty(str)) {
                this.interactTabAdapterManager.e(argsId, str);
            }
        }
        if (TextUtils.equals(argsType, "live") && (z = getNode().h0().z(com.taobao.android.tab2liveroom.liveroom.a.class, new a(this, argsId), false)) != null && (z.K() instanceof com.taobao.android.tab2liveroom.liveroom.a)) {
            this.interactTabAdapterManager.b(argsId, (com.taobao.android.tab2liveroom.liveroom.a) z.K());
        }
        this.interactContainer.k(argsId, argsType);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r3.equals("ontabdisappear") == false) goto L_0x002b;
     */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onHandleMessage(com.taobao.tao.flexbox.layoutmanager.core.n.g r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tab2interact.pageadapter.guangguang.tnode.GGInteractContainerComponent.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "1e782cf4"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r1[r0] = r7
            java.lang.Object r7 = r3.ipc$dispatch(r4, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001c:
            if (r7 == 0) goto L_0x0099
            java.lang.String r3 = r7.d
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -1191392038: goto L_0x0067;
                case -870097139: goto L_0x005d;
                case -32250261: goto L_0x0051;
                case 26524114: goto L_0x0045;
                case 1228998971: goto L_0x0039;
                case 1351066084: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            r0 = -1
            goto L_0x0072
        L_0x002d:
            java.lang.String r0 = "ontabdestroy"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0037
            goto L_0x002b
        L_0x0037:
            r0 = 5
            goto L_0x0072
        L_0x0039:
            java.lang.String r0 = "ondestroy"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0043
            goto L_0x002b
        L_0x0043:
            r0 = 4
            goto L_0x0072
        L_0x0045:
            java.lang.String r0 = "ontabcreate"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x004f
            goto L_0x002b
        L_0x004f:
            r0 = 3
            goto L_0x0072
        L_0x0051:
            java.lang.String r0 = "ontabappear"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x005b
            goto L_0x002b
        L_0x005b:
            r0 = 2
            goto L_0x0072
        L_0x005d:
            java.lang.String r1 = "ontabdisappear"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0072
            goto L_0x002b
        L_0x0067:
            java.lang.String r0 = "onpagequerychanged"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0071
            goto L_0x002b
        L_0x0071:
            r0 = 0
        L_0x0072:
            switch(r0) {
                case 0: goto L_0x0094;
                case 1: goto L_0x008e;
                case 2: goto L_0x0088;
                case 3: goto L_0x0080;
                case 4: goto L_0x007c;
                case 5: goto L_0x0076;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x0099
        L_0x0076:
            java.util.Map r7 = r7.e
            r6.handleTabDestroy(r7)
            goto L_0x0099
        L_0x007c:
            r6.handleDestroy()
            goto L_0x0099
        L_0x0080:
            java.util.Map r0 = r7.e
            com.taobao.tao.flexbox.layoutmanager.core.n r7 = r7.b
            r6.handleTabCreate(r0, r7)
            goto L_0x0099
        L_0x0088:
            java.util.Map r7 = r7.e
            r6.handleTabAppear(r7)
            goto L_0x0099
        L_0x008e:
            java.util.Map r7 = r7.e
            r6.handleTabDisappear(r7)
            goto L_0x0099
        L_0x0094:
            java.util.Map r7 = r7.e
            r6.handlePageQueryChange(r7)
        L_0x0099:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tab2interact.pageadapter.guangguang.tnode.GGInteractContainerComponent.onHandleMessage(com.taobao.tao.flexbox.layoutmanager.core.n$g):boolean");
    }
}
