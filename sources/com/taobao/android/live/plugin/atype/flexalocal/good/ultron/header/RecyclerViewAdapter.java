package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.header;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.GoodsView;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.csb;
import tb.fkx;
import tb.hha;
import tb.ikr;
import tb.nw0;
import tb.pfa;
import tb.rew;
import tb.t2o;
import tb.v2s;
import tb.v7t;
import tb.wda;
import tb.xea;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<IDMComponent> f8535a;
    public final xea b;
    public final rew c;
    public final Map<Integer, RecyclerViewHolder> d = new HashMap();
    public final HashMap<String, Integer> e = new HashMap<>();
    public final GoodsView f;
    public final ViewGroup g;

    static {
        t2o.a(295699210);
        t2o.a(157286553);
    }

    public RecyclerViewAdapter(xea xeaVar, List<IDMComponent> list, GoodsView goodsView, RecyclerView recyclerView) {
        this.b = xeaVar;
        this.f8535a = list;
        this.c = xeaVar.D().G().c0();
        this.f = goodsView;
        this.g = recyclerView;
        U(list);
        for (int i = 0; i < this.f8535a.size(); i++) {
            if (this.f8535a.get(i) != null) {
                hha.c("HeaderRVAdapter", "RecyclerViewAdapter（） | name=" + this.f8535a.get(i).getKey() + " type=" + this.f8535a.get(i).getType());
            }
        }
    }

    public static /* synthetic */ Object ipc$super(RecyclerViewAdapter recyclerViewAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultron/header/RecyclerViewAdapter");
    }

    public final void M(JSONObject jSONObject) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1fb7b3", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (intValue = jSONObject.getIntValue("compressList")) > 0) {
            this.f.q(nw0.c(ikr.f().e(), this.b.i(), intValue));
        }
    }

    public final RecyclerViewHolder N(int i, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewHolder) ipChange.ipc$dispatch("af10e757", new Object[]{this, new Integer(i), iDMComponent});
        }
        if (!wda.J().booleanValue()) {
            return this.c.c(this.g, i);
        }
        if (this.b.I() != null) {
            return this.b.I().j().i(this.c, this.g, i, iDMComponent, true);
        }
        return null;
    }

    public List<IDMComponent> O(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7682ac0e", new Object[]{this, iDMComponent});
        }
        ArrayList arrayList = new ArrayList();
        if ("dinamicx".equals(iDMComponent.getContainerType()) || "native".equals(iDMComponent.getContainerType())) {
            arrayList.add(iDMComponent);
        }
        for (IDMComponent iDMComponent2 : iDMComponent.getChildren()) {
            if ("dinamicx".equals(iDMComponent2.getContainerType()) || "native".equals(iDMComponent2.getContainerType())) {
                arrayList.add(iDMComponent2);
            }
            if (iDMComponent2.getChildren() != null && !iDMComponent2.getChildren().isEmpty()) {
                arrayList.addAll(O(iDMComponent2));
            }
        }
        return arrayList;
    }

    public List<IDMComponent> P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a952e699", new Object[]{this, str});
        }
        return Q(str, this.f8535a);
    }

    public final List<IDMComponent> Q(String str, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("60dd588", new Object[]{this, str, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (IDMComponent iDMComponent : list) {
                if (V(iDMComponent, str)) {
                    arrayList.add(iDMComponent);
                }
                arrayList.addAll(Q(str, iDMComponent.getChildren()));
            }
        }
        return arrayList;
    }

    public final Pair<IDMComponent, Integer> S(String str, List<IDMComponent> list) {
        Pair<IDMComponent, Integer> S;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("de713de3", new Object[]{this, str, list});
        }
        for (int i = 0; i < list.size(); i++) {
            IDMComponent iDMComponent = list.get(i);
            if (str.equals(iDMComponent.getKey())) {
                return new Pair<>(iDMComponent, Integer.valueOf(i));
            }
            if (!(iDMComponent.getChildren() == null || (S = S(str, iDMComponent.getChildren())) == null || S.first == null || S.second == null)) {
                return new Pair<>(S.first, Integer.valueOf(i));
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Integer T(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("3dfc4f43", new Object[]{this, str});
        }
        if (this.e.containsKey(str)) {
            return this.e.get(str);
        }
        Pair<IDMComponent, Integer> S = S(str, this.f8535a);
        if (S != null) {
            this.e.put(str, S.second);
            return (Integer) S.second;
        }
        v7t.d("HeaderRVAdapter", "输入的componentName：" + str + " 错误，拿不到index");
        return -1;
    }

    public final void U(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5551253", new Object[]{this, list});
        } else if (!list.isEmpty()) {
            for (IDMComponent iDMComponent : list) {
                if ("dinamicx".equals(iDMComponent.getContainerType())) {
                    iDMComponent.getFields().put("extraGoodsTabList", fkx.h(this.b.H().extraGoodsTabList));
                    iDMComponent.getFields().put("itemListType", fkx.h(this.b.H().itemListType));
                }
                List<IDMComponent> children = iDMComponent.getChildren();
                if (!children.isEmpty()) {
                    U(children);
                }
            }
        }
    }

    public final boolean V(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a2ff245", new Object[]{this, iDMComponent, str})).booleanValue();
        }
        JSONObject jSONObject = iDMComponent.getData().getJSONObject("fields");
        if (jSONObject == null || !jSONObject.containsKey("apiName")) {
            return false;
        }
        return str.equals(jSONObject.getString("apiName"));
    }

    public void W(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18946129", new Object[]{this, iDMComponent});
            return;
        }
        String key = iDMComponent.getKey();
        int intValue = T(key).intValue();
        if (intValue >= 0) {
            hha.c("HeaderRVAdapter", "notifyComponentChange | component=" + key + "    index=" + intValue);
            notifyItemChanged(intValue, iDMComponent);
        }
    }

    public final void X(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd09fd0", new Object[]{this, jSONObject});
            return;
        }
        int t = this.f.t();
        if (this.b.H() == null || this.b.o() == null || this.b.o().size() <= t) {
            hha.b("HeaderRVAdapter", "putCurrentTabInfo | info empty. index=" + t);
            jSONObject.remove("showTopBarType");
            return;
        }
        jSONObject.put("showTopBarType", fkx.h(this.b.o().get(t).showTopBarType));
        jSONObject.put("tabIndex", (Object) Integer.valueOf(t));
    }

    public List<IDMComponent> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dbd142c0", new Object[]{this});
        }
        return this.f8535a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.f8535a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i < 0 || i >= this.f8535a.size()) {
            return -1;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee143bc", new Object[]{this, viewHolder, new Integer(i), list});
        } else if (!list.isEmpty()) {
            for (Object obj : list) {
                if (obj instanceof IDMComponent) {
                    IDMComponent iDMComponent = (IDMComponent) obj;
                    boolean a2 = csb.a(iDMComponent);
                    int f = this.c.f(iDMComponent);
                    if (((HashMap) this.d).containsKey(Integer.valueOf(f))) {
                        RecyclerViewHolder recyclerViewHolder = (RecyclerViewHolder) ((HashMap) this.d).get(Integer.valueOf(f));
                        hha.c("HeaderRVAdapter", "onBindViewHolder payloads | component name=" + iDMComponent.getKey() + "  已上屏");
                        if (a2) {
                            hha.c("HeaderRVAdapter", "component name:" + iDMComponent.getKey() + "直接刷新");
                            iDMComponent.getExtMap().put("keyViewHandler", this.f.u());
                            iDMComponent.getExtMap().put("keyTopBarHandler", this.f.e);
                            iDMComponent.getExtMap().put("gl_ultron_context", this.b);
                            X(iDMComponent.getFields());
                            M(iDMComponent.getFields());
                            this.c.b(recyclerViewHolder, iDMComponent);
                            if (!(recyclerViewHolder == null || recyclerViewHolder.getRootView() == null || recyclerViewHolder.getRootView().getParent() != null)) {
                                ((ViewGroup) viewHolder.itemView).addView(recyclerViewHolder.getRootView());
                                return;
                            }
                            return;
                        }
                        FrameLayout frameLayout = (FrameLayout) viewHolder.itemView;
                        if (recyclerViewHolder != null) {
                            frameLayout.removeView(recyclerViewHolder.itemView);
                        }
                    } else if (a2) {
                        RecyclerViewHolder N = N(f, iDMComponent);
                        if (pfa.A(iDMComponent) && N != null && (N.itemView instanceof DXRootView)) {
                            ((HashMap) this.d).put(Integer.valueOf(f), N);
                        }
                        FrameLayout frameLayout2 = (FrameLayout) viewHolder.itemView;
                        iDMComponent.getExtMap().put("keyViewHandler", this.f.u());
                        iDMComponent.getExtMap().put("keyTopBarHandler", this.f.e);
                        iDMComponent.getExtMap().put("gl_ultron_context", this.b);
                        X(iDMComponent.getFields());
                        M(iDMComponent.getFields());
                        this.c.b(N, iDMComponent);
                        if (N != null) {
                            View view = N.itemView;
                            if (view instanceof DXRootView) {
                                if (view.getParent() instanceof ViewGroup) {
                                    ((ViewGroup) N.itemView.getParent()).removeView(N.itemView);
                                }
                                frameLayout2.removeAllViews();
                                frameLayout2.addView(N.itemView);
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        } else {
            onBindViewHolder(viewHolder, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new RecyclerView.ViewHolder(this, frameLayout) { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.ultron.header.RecyclerViewAdapter.1
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerViewHolder recyclerViewHolder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        IDMComponent iDMComponent = this.f8535a.get(i);
        hha.c("HeaderRVAdapter", "onBindViewHolder | component=" + iDMComponent.getKey());
        List<IDMComponent> O = O(iDMComponent);
        int size = O.size();
        FrameLayout frameLayout = (FrameLayout) viewHolder.itemView;
        frameLayout.removeAllViews();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                IDMComponent iDMComponent2 = O.get(i2);
                hha.c("HeaderRVAdapter", "onBindViewHolder | leaf component=" + iDMComponent2.getKey());
                if (csb.a(iDMComponent2)) {
                    int f = this.c.f(iDMComponent2);
                    if (((HashMap) this.d).containsKey(Integer.valueOf(f))) {
                        recyclerViewHolder = (RecyclerViewHolder) ((HashMap) this.d).get(Integer.valueOf(f));
                    } else {
                        RecyclerViewHolder N = N(f, iDMComponent2);
                        if (pfa.A(iDMComponent) && N != null && (N.itemView instanceof DXRootView)) {
                            ((HashMap) this.d).put(Integer.valueOf(f), N);
                        }
                        recyclerViewHolder = N;
                    }
                    if (recyclerViewHolder == null) {
                        v2s.o().A().c("HeaderRVAdapter", "DX ViewHolder 失败");
                        return;
                    }
                    hha.c("HeaderRVAdapter", "onBindViewHolder | name=" + iDMComponent2.getKey());
                    iDMComponent2.getExtMap().put("keyViewHandler", this.f.u());
                    iDMComponent2.getExtMap().put("keyTopBarHandler", this.f.e);
                    iDMComponent2.getExtMap().put("gl_ultron_context", this.b);
                    X(iDMComponent2.getFields());
                    M(iDMComponent2.getFields());
                    this.c.b(recyclerViewHolder, iDMComponent2);
                    View view = recyclerViewHolder.itemView;
                    if (view instanceof DXRootView) {
                        if (view.getParent() instanceof ViewGroup) {
                            ((ViewGroup) recyclerViewHolder.itemView.getParent()).removeView(recyclerViewHolder.itemView);
                        }
                        frameLayout.removeAllViews();
                        frameLayout.addView(recyclerViewHolder.itemView);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        v7t.d("HeaderRVAdapter", "container is empty！");
    }
}
