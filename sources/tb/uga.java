package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.goods.list.IDMComponentsFrameLayout;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModel;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModelFactory;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import tb.bn7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uga {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f29357a;
    public final Context b;
    public final xea c;
    public final rew d;
    public RecyclerView e;
    public final HashMap<Integer, LinkedList<RecyclerViewHolder>> f = new HashMap<>();

    static {
        t2o.a(295699207);
    }

    public uga(xea xeaVar, rew rewVar, a aVar) {
        this.b = xeaVar.i();
        this.c = xeaVar;
        this.d = rewVar;
        this.f29357a = aVar;
    }

    public static String d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4b44823", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("ultronItemData")) == null) {
            return "";
        }
        return jSONObject2.getString("itemId");
    }

    public IDMComponentsFrameLayout a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponentsFrameLayout) ipChange.ipc$dispatch("3202b52c", new Object[]{this});
        }
        IDMComponentsFrameLayout iDMComponentsFrameLayout = new IDMComponentsFrameLayout(this.b);
        iDMComponentsFrameLayout.setId(R.id.item_root);
        iDMComponentsFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return iDMComponentsFrameLayout;
    }

    public final RecyclerViewHolder b(int i, IDMComponent iDMComponent, ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewHolder) ipChange.ipc$dispatch("b789c786", new Object[]{this, new Integer(i), iDMComponent, viewGroup, new Boolean(z)});
        }
        if (!wda.J().booleanValue() || !z) {
            return this.d.c(viewGroup, i);
        }
        if (this.c.I() == null || this.c.I().j() == null) {
            return null;
        }
        return this.c.I().j().i(this.d, viewGroup, i, iDMComponent, false);
    }

    public final int[] c(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("6e67e059", new Object[]{this, iDMComponent});
        }
        JSONObject fields = iDMComponent.getFields();
        DinamicXEngine e = ikr.f().e();
        return new int[]{nw0.c(e, this.b, fields.getIntValue("h")), nw0.c(e, this.b, fields.getIntValue("w")), nw0.c(e, this.b, fields.getIntValue("x")), nw0.c(e, this.b, fields.getIntValue("y"))};
    }

    public final RecyclerViewHolder e(IDMComponent iDMComponent, ViewGroup viewGroup, boolean z) {
        RecyclerViewHolder recyclerViewHolder;
        LinkedList<RecyclerViewHolder> linkedList;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewHolder) ipChange.ipc$dispatch("41ecc619", new Object[]{this, iDMComponent, viewGroup, new Boolean(z)});
        }
        int f = this.d.f(iDMComponent);
        View view = null;
        if (!this.f.containsKey(Integer.valueOf(f)) || (linkedList = this.f.get(Integer.valueOf(f))) == null || linkedList.isEmpty()) {
            recyclerViewHolder = null;
        } else {
            recyclerViewHolder = linkedList.removeFirst();
        }
        if (recyclerViewHolder == null) {
            recyclerViewHolder = b(this.d.f(iDMComponent), iDMComponent, viewGroup, z);
        } else {
            z2 = false;
        }
        StringBuilder sb = new StringBuilder("getViewHolderByType:");
        sb.append(iDMComponent.getKey());
        sb.append("  result=");
        if (recyclerViewHolder != null) {
            view = recyclerViewHolder.itemView;
        }
        sb.append(view);
        sb.append("   create=");
        sb.append(z2);
        Log.e("GoodsItemViewAdapter", sb.toString());
        return recyclerViewHolder;
    }

    public final boolean g(IDMComponent iDMComponent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2a225ef", new Object[]{this, iDMComponent, jSONObject})).booleanValue();
        }
        String string = iDMComponent.getFields().getString("dependency");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        return o66.d(qm7.a(string, "", new bn7.b().j(jSONObject).f()));
    }

    public final boolean h(Set<IDMComponent> set, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f34e99f", new Object[]{this, set, iDMComponent})).booleanValue();
        }
        for (IDMComponent iDMComponent2 : set) {
            if (iDMComponent2.getChildren().contains(iDMComponent)) {
                return true;
            }
        }
        return false;
    }

    public void j(IDMComponentsFrameLayout iDMComponentsFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80174bb", new Object[]{this, iDMComponentsFrameLayout});
            return;
        }
        for (RecyclerViewHolder recyclerViewHolder : iDMComponentsFrameLayout.getRecyclerViewHolders()) {
            if (recyclerViewHolder != null && (recyclerViewHolder.itemView instanceof DXRootView)) {
                ikr.f().h((DXRootView) recyclerViewHolder.itemView);
            }
        }
    }

    public void k(RecyclerViewHolder recyclerViewHolder, IDMComponent iDMComponent, boolean z) {
        LinkedList<RecyclerViewHolder> linkedList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7230058e", new Object[]{this, recyclerViewHolder, iDMComponent, new Boolean(z)});
            return;
        }
        View view = recyclerViewHolder.itemView;
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        int f = this.d.f(iDMComponent);
        if (this.f.containsKey(Integer.valueOf(f))) {
            linkedList = this.f.get(Integer.valueOf(f));
        } else {
            linkedList = new LinkedList<>();
        }
        if (linkedList != null) {
            if (z) {
                linkedList.addFirst(recyclerViewHolder);
            } else {
                linkedList.addLast(recyclerViewHolder);
            }
        }
        if (!pfa.A(iDMComponent) || (recyclerViewHolder.itemView instanceof DXRootView)) {
            this.f.put(Integer.valueOf(f), linkedList);
        }
    }

    public void m(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af5ca40", new Object[]{this, recyclerView});
        } else if (this.e == null) {
            this.e = recyclerView;
        }
    }

    public final boolean i(IDMComponent iDMComponent) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a25d865", new Object[]{this, iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent.getData() == null || (jSONObject = iDMComponent.getData().getJSONObject("fields")) == null || !jSONObject.containsKey("parsefields")) {
            return false;
        }
        return "true".equalsIgnoreCase(jSONObject.getString("parsefields"));
    }

    public final boolean f(IDMComponent iDMComponent) {
        IDMComponent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb07428c", new Object[]{this, iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || (parent = iDMComponent.getParent()) == null) {
            return false;
        }
        JSONObject containerInfo = parent.getContainerInfo();
        return "sub_section".equals(containerInfo.getString("name")) && "layout".equals(containerInfo.getString("containerType"));
    }

    public void n(xea xeaVar, IDMComponentsFrameLayout iDMComponentsFrameLayout, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fb2c4f7", new Object[]{this, xeaVar, iDMComponentsFrameLayout, jSONObject, str});
            return;
        }
        this.f29357a.D().q(fkx.d(((UltronInstanceViewModel) new ViewModelProvider((ViewModelStoreOwner) this.b, new UltronInstanceViewModelFactory()).get(UltronInstanceViewModel.class)).b));
        this.f29357a.T(new sga(str));
        List<IDMComponent> c = this.f29357a.z().c();
        if (c == null) {
            v7t.d("GoodsItemViewAdapter", "卡片渲染失败，奥创接口失败");
            return;
        }
        int size = iDMComponentsFrameLayout.getRecyclerViewHolders().size();
        if (size > 0) {
            List<IDMComponent> components = iDMComponentsFrameLayout.getComponents();
            List<RecyclerViewHolder> recyclerViewHolders = iDMComponentsFrameLayout.getRecyclerViewHolders();
            for (int i = 0; i < size; i++) {
                k(recyclerViewHolders.get(i), components.get(i), true);
            }
        }
        iDMComponentsFrameLayout.clearRecyclerViewHolders();
        iDMComponentsFrameLayout.clearIDMComponents();
        iDMComponentsFrameLayout.removeAllViews();
        HashSet hashSet = new HashSet();
        for (IDMComponent iDMComponent : c) {
            JSONObject containerInfo = iDMComponent.getContainerInfo();
            if (containerInfo != null) {
                String jSONString = containerInfo.toJSONString();
                if (!h(hashSet, iDMComponent)) {
                    if (f(iDMComponent)) {
                        Log.e("GoodsItemViewAdapter", jSONString + " 作为SubSection 子Item 渲染");
                        IDMComponent parent = iDMComponent.getParent();
                        if (l(xeaVar, parent, iDMComponentsFrameLayout, jSONObject)) {
                            hashSet.add(parent);
                        }
                    } else if (g(iDMComponent, jSONObject)) {
                        RecyclerViewHolder e = e(iDMComponent, iDMComponentsFrameLayout, true);
                        iDMComponent.getData().put("ultronItemData", (Object) jSONObject);
                        ArrayMap<String, Object> extMap = iDMComponent.getExtMap();
                        if (extMap != null) {
                            extMap.put("gl_ultron_context", xeaVar);
                        }
                        if (i(iDMComponent)) {
                            k7v.a(iDMComponent.getData().getJSONObject("fields"), jSONObject);
                        }
                        this.d.b(e, iDMComponent);
                        iDMComponentsFrameLayout.addRecyclerViewHolder(e);
                        iDMComponentsFrameLayout.addIDMComponent(iDMComponent);
                        iDMComponentsFrameLayout.addView(e.itemView);
                    }
                }
            }
        }
        if (w2s.j()) {
            TextView textView = new TextView(this.b);
            textView.setText("u");
            textView.setTextColor(-65536);
            textView.setTextSize(12.0f);
            iDMComponentsFrameLayout.addView(textView, new ViewGroup.LayoutParams(-2, -2));
        }
    }

    public final boolean l(xea xeaVar, IDMComponent iDMComponent, IDMComponentsFrameLayout iDMComponentsFrameLayout, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8492eac", new Object[]{this, xeaVar, iDMComponent, iDMComponentsFrameLayout, jSONObject})).booleanValue();
        }
        if (!g(iDMComponent, jSONObject)) {
            return false;
        }
        String string = iDMComponent.getFields().getString("exclusion");
        boolean parseBoolean = !TextUtils.isEmpty(string) ? Boolean.parseBoolean(string) : false;
        for (IDMComponent iDMComponent2 : iDMComponent.getChildren()) {
            if (g(iDMComponent2, jSONObject)) {
                RecyclerViewHolder e = e(iDMComponent2, iDMComponentsFrameLayout, true);
                iDMComponentsFrameLayout.addIDMComponent(iDMComponent2);
                iDMComponentsFrameLayout.addRecyclerViewHolder(e);
                iDMComponent2.getData().put("ultronItemData", (Object) jSONObject);
                boolean i = i(iDMComponent2);
                ArrayMap<String, Object> extMap = iDMComponent2.getExtMap();
                if (extMap != null) {
                    extMap.put("gl_ultron_context", xeaVar);
                }
                if (i) {
                    k7v.a(iDMComponent2.getData().getJSONObject("fields"), jSONObject);
                }
                this.d.b(e, iDMComponent2);
                int[] c = c(iDMComponent2.getParent());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c[1], c[0]);
                layoutParams.leftMargin = c[2];
                layoutParams.topMargin = c[3];
                e.itemView.setLayoutParams(layoutParams);
                iDMComponentsFrameLayout.addView(e.itemView);
                if (parseBoolean) {
                    break;
                }
            }
        }
        return parseBoolean;
    }
}
