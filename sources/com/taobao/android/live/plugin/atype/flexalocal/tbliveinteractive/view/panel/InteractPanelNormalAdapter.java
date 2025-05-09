package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.panel;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.utils.TypeDX;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.jbu;
import tb.ll6;
import tb.s60;
import tb.t2o;
import tb.tws;
import tb.ukr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class InteractPanelNormalAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8692a;
    public final List<IInteractiveProxy.e> b = new ArrayList();
    public final String c;
    public final ukr d;
    public final String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Comparator<IInteractiveProxy.e> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(InteractPanelNormalAdapter interactPanelNormalAdapter) {
        }

        /* renamed from: a */
        public int compare(IInteractiveProxy.e eVar, IInteractiveProxy.e eVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("90a845bb", new Object[]{this, eVar, eVar2})).intValue();
            }
            int showOrder = eVar.getShowOrder();
            int showOrder2 = eVar.getShowOrder();
            if (showOrder < 0) {
                showOrder2 += 10000;
            }
            int showOrder3 = eVar2.getShowOrder();
            int showOrder4 = eVar2.getShowOrder();
            if (showOrder3 < 0) {
                showOrder4 += 10000;
            }
            return showOrder2 - showOrder4;
        }
    }

    static {
        t2o.a(295699963);
    }

    public InteractPanelNormalAdapter(String str, Context context, ukr ukrVar, String str2) {
        this.c = str;
        this.f8692a = context;
        this.d = ukrVar;
        this.e = str2;
    }

    public static /* synthetic */ Object ipc$super(InteractPanelNormalAdapter interactPanelNormalAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/view/panel/InteractPanelNormalAdapter");
    }

    public void M(IInteractiveProxy.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40609f51", new Object[]{this, eVar});
        } else if (N(eVar)) {
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < ((ArrayList) this.b).size(); i3++) {
                IInteractiveProxy.e eVar2 = (IInteractiveProxy.e) ((ArrayList) this.b).get(i3);
                if (i2 < 0 && ((eVar.getShowOrder() > 0 && eVar2.getShowOrder() > eVar.getShowOrder()) || (eVar.getShowOrder() > 0 && eVar2.getShowOrder() < 0))) {
                    i2 = i3;
                }
                if (TextUtils.equals(eVar.getFedName(), eVar2.getFedName()) || TextUtils.equals(eVar.getName(), eVar2.getName())) {
                    i = i3;
                    break;
                }
            }
            if (i < 0) {
                if (!eVar.isNeedShowEntrance()) {
                    return;
                }
                if (i2 < 0) {
                    ((ArrayList) this.b).add(eVar);
                    notifyItemInserted(((ArrayList) this.b).size() - 1);
                    return;
                }
                ((ArrayList) this.b).add(i2, eVar);
                notifyItemInserted(i2);
            } else if (eVar.isNeedShowEntrance()) {
                ((ArrayList) this.b).set(i, eVar);
                notifyItemChanged(i);
            } else {
                ((ArrayList) this.b).remove(i);
                notifyItemRemoved(i);
            }
        }
    }

    public final boolean N(IInteractiveProxy.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("294cd89e", new Object[]{this, eVar})).booleanValue();
        }
        if (eVar == null || !eVar.isMigrationFlag() || TextUtils.isEmpty(eVar.getPanelTitle()) || !tws.E(eVar.getFedName())) {
            return false;
        }
        return true;
    }

    public JSONArray O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("2af5141a", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            IInteractiveProxy.e eVar = (IInteractiveProxy.e) it.next();
            if (eVar != null && N(eVar)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", (Object) eVar.getId());
                jSONObject.put("fedName", (Object) eVar.getFedName());
                jSONArray.add(jSONObject);
            }
        }
        return jSONArray;
    }

    public void P(IInteractiveProxy.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df95ac4e", new Object[]{this, eVar});
            return;
        }
        for (int i = 0; i < ((ArrayList) this.b).size(); i++) {
            IInteractiveProxy.e eVar2 = (IInteractiveProxy.e) ((ArrayList) this.b).get(i);
            if (TextUtils.equals(eVar.getFedName(), eVar2.getFedName()) || TextUtils.equals(eVar.getName(), eVar2.getName())) {
                ((ArrayList) this.b).remove(i);
                notifyItemRemoved(i);
                return;
            }
        }
    }

    public void Q(List<IInteractiveProxy.e> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28dd1dc1", new Object[]{this, list});
            return;
        }
        ((ArrayList) this.b).clear();
        if (list != null && list.size() > 0) {
            for (IInteractiveProxy.e eVar : list) {
                if (N(eVar) && eVar.isNeedShowEntrance()) {
                    ((ArrayList) this.b).add(eVar);
                }
            }
        }
        Collections.sort(this.b, new a(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<IInteractiveProxy.e> list = this.b;
        if (list == null) {
            return 0;
        }
        return ((ArrayList) list).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        DXRootView b = ll6.b(this.d, this.f8692a, this.e);
        if (b == null) {
            return new TypeDX(new View(this.f8692a));
        }
        return new TypeDX(b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IInteractiveProxy.e eVar;
        String str = "native";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
        } else if (i >= 0 && i < getItemCount() && (eVar = (IInteractiveProxy.e) ((ArrayList) this.b).get(i)) != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("dataComp", eVar.parseJsonTBLiveInteractiveComponent().toJSONString());
                hashMap.put("compName", eVar.getFedName());
                hashMap.put("name", eVar.getFedName());
                if (!str.equals(eVar.getType())) {
                    str = "interact";
                }
                hashMap.put("type", str);
                hashMap.put("comppos", "1");
                jbu.g(this.d, "Show-RightEntrance", hashMap);
                ll6.e(this.d, (DXRootView) viewHolder.itemView, eVar.parseJsonTBLiveInteractiveComponent(), this.c);
                View view = viewHolder.itemView;
                if (view != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    view.setImportantForAccessibility(1);
                    if (i2 >= 26) {
                        viewHolder.itemView.setFocusable(1);
                    }
                    if (eVar.getLabel() != null) {
                        viewHolder.itemView.setContentDescription(eVar.getLabel());
                    }
                    s60.a(viewHolder.itemView);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
