package com.alibaba.android.aura.taobao.adapter.extension.event.locator;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ck;
import tb.hbb;
import tb.j1i;
import tb.lo;
import tb.nbb;
import tb.rxu;
import tb.t2o;
import tb.tcb;
import tb.vaj;
import tb.why;
import tb.yi;
import tb.ym;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.render.scroll.component.blink")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class a implements tcb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GLOBAL_DATA_BLINK_DATA = "global_data_Blink_data";

    /* renamed from: a  reason: collision with root package name */
    public AURAGlobalData f2151a;
    public lo b;
    public Handler c;
    public Runnable d;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.android.aura.taobao.adapter.extension.event.locator.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class RunnableC0061a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nbb f2152a;
        public final /* synthetic */ List b;
        public final /* synthetic */ String c;

        public RunnableC0061a(nbb nbbVar, List list, String str) {
            this.f2152a = nbbVar;
            this.b = list;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                a aVar = a.this;
                nbb nbbVar = this.f2152a;
                List list = this.b;
                if (TextUtils.isEmpty(this.c)) {
                    str = why.DEFAULT_MASK_BACKGROUND_COLOR;
                } else {
                    str = this.c;
                }
                a.r(aVar, nbbVar, list, str);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final AURARenderComponent f2153a;
        public final JSONObject b;

        static {
            t2o.a(81789063);
        }

        public b(JSONObject jSONObject, AURARenderComponent aURARenderComponent) {
            this.f2153a = aURARenderComponent;
            this.b = jSONObject;
        }
    }

    static {
        t2o.a(81789061);
        t2o.a(80740553);
    }

    public static /* synthetic */ void r(a aVar, nbb nbbVar, List list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f39b7c2", new Object[]{aVar, nbbVar, list, str});
        } else {
            aVar.L0(nbbVar, list, str);
        }
    }

    public final AURARenderComponent B(List<AURARenderComponent> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("7be2913b", new Object[]{this, list, str});
        }
        if (list == null) {
            return null;
        }
        for (AURARenderComponent aURARenderComponent : list) {
            if (aURARenderComponent != null && str.equals(aURARenderComponent.key)) {
                return aURARenderComponent;
            }
        }
        return null;
    }

    public final List<AURARenderComponent> J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f6443ede", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.f2151a;
        if (aURAGlobalData == null) {
            return null;
        }
        return (List) aURAGlobalData.get("render_view_item_models", List.class);
    }

    public final MultiTreeNode K0() {
        j1i j1iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiTreeNode) ipChange.ipc$dispatch("38e22b47", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.f2151a;
        if (aURAGlobalData == null || (j1iVar = (j1i) aURAGlobalData.get("aura_parse_global_data_parse", j1i.class)) == null) {
            return null;
        }
        return j1iVar.b().i();
    }

    public final TreeNode<RenderComponent> L(MultiTreeNode multiTreeNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeNode) ipChange.ipc$dispatch("2022686", new Object[]{this, multiTreeNode, str});
        }
        if (multiTreeNode == null) {
            return null;
        }
        for (TreeNode<RenderComponent> treeNode : multiTreeNode.preOrdered()) {
            RenderComponent data = treeNode.data();
            if (data != null && str.equals(data.key)) {
                return treeNode;
            }
        }
        return null;
    }

    public final void L0(nbb nbbVar, List<AURARenderComponent> list, String str) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e507533f", new Object[]{this, nbbVar, list, str});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AURARenderComponent aURARenderComponent : list) {
            AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
            if (aURARenderComponentData != null && (map = aURARenderComponentData.fields) != null) {
                rxu rxuVar = new rxu();
                rxuVar.f27667a = RuleType.PROPS_WRITE_BACK;
                rxuVar.b = aURARenderComponent.key;
                rxuVar.d = new ym(map, aURARenderComponentData.events, aURARenderComponentData.localFields);
                HashMap hashMap = new HashMap();
                hashMap.putAll(map);
                hashMap.put(vaj.KEY_BG_COLOR, str);
                rxuVar.c = new ym(hashMap, null, null);
                arrayList.add(rxuVar);
            } else {
                return;
            }
        }
        UMFRuleIO uMFRuleIO = new UMFRuleIO(arrayList);
        if (nbbVar != null) {
            nbbVar.c("aura.workflow.adjustRules", uMFRuleIO, null);
        } else {
            ck.g().e("modifyBgColor fail! auraInstance is null");
        }
    }

    public final List<AURARenderComponent> m0(AURARenderComponent aURARenderComponent, String str) {
        String str2;
        AURARenderComponent B;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("64f33810", new Object[]{this, aURARenderComponent, str});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(aURARenderComponent);
        if (str == null) {
            return arrayList;
        }
        TreeNode<RenderComponent> L = L(K0(), str);
        if (L == null) {
            return arrayList;
        }
        for (TreeNode<RenderComponent> treeNode : L.preOrdered()) {
            RenderComponent data = treeNode.data();
            if (!(data == null || (str2 = data.key) == null || (B = B(J0(), str2)) == null || str2.equals(aURARenderComponent.key))) {
                arrayList.add(B);
            }
        }
        return arrayList;
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.b = loVar;
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        } else {
            this.f2151a = aURAGlobalData;
        }
    }

    @Override // tb.ybb
    public void onDestroy() {
        Runnable runnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Handler handler = this.c;
        if (handler != null && (runnable = this.d) != null) {
            handler.removeCallbacks(runnable);
        }
    }

    @Override // tb.tcb
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        AURAGlobalData aURAGlobalData;
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
        } else if (this.b != null && (aURAGlobalData = this.f2151a) != null && i == 0 && (bVar = (b) aURAGlobalData.get(GLOBAL_DATA_BLINK_DATA, b.class)) != null) {
            JSONObject jSONObject = bVar.b;
            String string = jSONObject.getString("duration");
            String string2 = jSONObject.getString(vaj.KEY_BG_COLOR);
            String string3 = jSONObject.getString("originColor");
            String string4 = jSONObject.getString("componentRoot");
            if (!TextUtils.isEmpty(string2)) {
                x(this.b.c(), m0(bVar.f2153a, string4), string, string3, string2);
                this.f2151a.update(GLOBAL_DATA_BLINK_DATA, null);
            }
        }
    }

    @Override // tb.tcb
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        }
    }

    public final void x(nbb nbbVar, List<AURARenderComponent> list, String str, String str2, String str3) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6422883", new Object[]{this, nbbVar, list, str, str2, str3});
            return;
        }
        L0(nbbVar, list, str3);
        if (TextUtils.isEmpty(str)) {
            j = 1000;
        } else {
            j = Long.parseLong(str);
        }
        this.d = new RunnableC0061a(nbbVar, list, str2);
        Handler handler = new Handler(Looper.getMainLooper());
        this.c = handler;
        handler.postDelayed(this.d, j);
    }
}
