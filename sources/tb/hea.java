package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hea {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REQUEST_ITEM_NUM = 10;

    /* renamed from: a  reason: collision with root package name */
    public List<ItemIdentifier> f20582a = new ArrayList();
    public List<ItemIdentifier> b = new ArrayList();
    public List<ItemIdentifier> c = new ArrayList();
    public long d = -1;
    public final xea e;

    static {
        t2o.a(295699376);
    }

    public hea(xea xeaVar) {
        this.e = xeaVar;
    }

    public static int c(List<ItemIdentifier> list, ItemIdentifier itemIdentifier) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cebd0524", new Object[]{list, itemIdentifier})).intValue();
        }
        if (itemIdentifier == null) {
            return -1;
        }
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                break;
            }
            ItemIdentifier itemIdentifier2 = list.get(i);
            if (!itemIdentifier2.equals(itemIdentifier.goodsIndex, itemIdentifier.itemId)) {
                i++;
            } else if (itemIdentifier2.priority == itemIdentifier.priority) {
                return i;
            }
        }
        list.remove(itemIdentifier);
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).priority >= itemIdentifier.priority) {
                list.add(i2, itemIdentifier);
                return i2;
            }
        }
        list.add(itemIdentifier);
        return list.size() - 1;
    }

    public static ItemIdentifier f(hea heaVar, int i, String str) {
        List<ItemIdentifier> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemIdentifier) ipChange.ipc$dispatch("9aa2978d", new Object[]{heaVar, new Integer(i), str});
        }
        if (!wda.K() || heaVar == null || (list = heaVar.f20582a) == null) {
            return new ItemIdentifier(i, str);
        }
        ItemIdentifier k = k(list, i, str);
        if (k != null) {
            return k;
        }
        return new ItemIdentifier(i, str);
    }

    public static ItemIdentifier k(List<ItemIdentifier> list, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemIdentifier) ipChange.ipc$dispatch("7f8f1171", new Object[]{list, new Integer(i), str});
        }
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ItemIdentifier itemIdentifier = list.get(i2);
                if (itemIdentifier != null && itemIdentifier.equals(i, str)) {
                    return itemIdentifier;
                }
            }
        }
        return null;
    }

    public static int n(List<ItemIdentifier> list, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a375e15", new Object[]{list, new Integer(i), str})).intValue();
        }
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ItemIdentifier itemIdentifier = list.get(i2);
                if (itemIdentifier != null && itemIdentifier.equals(i, str)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static int o(List<ItemIdentifier> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e457708", new Object[]{list, str})).intValue();
        }
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                ItemIdentifier itemIdentifier = list.get(i);
                if (itemIdentifier != null && TextUtils.equals(itemIdentifier.itemId, str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void r(JSONObject jSONObject, LiveItem liveItem, boolean z) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cee9d90", new Object[]{jSONObject, liveItem, new Boolean(z)});
            return;
        }
        if (liveItem != null) {
            if (liveItem.nativeConfigInfos == null) {
                liveItem.nativeConfigInfos = new JSONObject();
            }
            liveItem.nativeConfigInfos.put("dataScene", (Object) "pm");
        }
        if (liveItem != null && jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("personalityData");
            if (jSONObject2 != null) {
                liveItem.personalityData = jSONObject2;
            }
            if (yga.x() && z) {
                if (!(jSONObject.getJSONObject("extendVal") == null || liveItem.extendVal == null || (string = jSONObject.getJSONObject("extendVal").getString("tradeParams")) == null)) {
                    liveItem.extendVal.tradeParams = string;
                }
                if (!(jSONObject.getJSONObject("extendVal") == null || liveItem.extendVal == null)) {
                    JSONObject d = fkx.d(jSONObject.getJSONObject("extendVal").getString("business"));
                    JSONObject d2 = fkx.d(liveItem.extendVal.business);
                    if (!(d == null || d2 == null || d.getJSONObject("itemBizInfo") == null)) {
                        d2.put("itemBizInfo", (Object) d.getJSONObject("itemBizInfo"));
                        liveItem.extendVal.business = fkx.i(d2);
                        liveItem.extendVal.setBusinessJSON(d2);
                    }
                }
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("itemExtData");
            if (liveItem.itemExtData == null) {
                liveItem.itemExtData = new JSONObject();
            }
            if (jSONObject3 == null) {
                liveItem.itemExtData.remove("subscribeStatus");
                return;
            }
            if (liveItem.itemExtData.isEmpty()) {
                liveItem.itemExtData = jSONObject3;
            }
            liveItem.itemExtData.put("subscribeStatus", (Object) jSONObject3.getString("subscribeStatus"));
        }
    }

    public static void s(th5 th5Var, LiveItem liveItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d835562c", new Object[]{th5Var, liveItem, new Boolean(z)});
        } else if (th5Var != null) {
            r(th5Var.b, liveItem, z);
        }
    }

    public static void t(th5 th5Var, th5 th5Var2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155a6633", new Object[]{th5Var, th5Var2});
        } else if (th5Var != null && th5Var2 != null && (jSONObject = th5Var.b) != null && th5Var2.b != null) {
            if (jSONObject.getJSONObject("personalityData") != null) {
                th5Var2.b.put("personalityData", (Object) th5Var.b.getJSONObject("personalityData"));
            }
            JSONObject jSONObject2 = th5Var.b.getJSONObject("itemExtData");
            JSONObject jSONObject3 = th5Var2.b.getJSONObject("itemExtData");
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
                th5Var2.b.put("itemExtData", (Object) jSONObject3);
            }
            if (jSONObject2 == null) {
                jSONObject3.remove("subscribeStatus");
            } else {
                jSONObject3.put("subscribeStatus", (Object) jSONObject2.getString("subscribeStatus"));
            }
        }
    }

    public void a(ItemCategory itemCategory, List<th5> list, boolean z, boolean z2, pqd pqdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b5ce7ec", new Object[]{this, itemCategory, list, new Boolean(z), new Boolean(z2), pqdVar});
        } else if (list != null && !list.isEmpty() && pqdVar != null) {
            for (th5 th5Var : list) {
                if (th5Var != null) {
                    b(itemCategory, th5Var, false, z, z2, pqdVar);
                }
            }
        }
    }

    public List<ItemIdentifier> d(ItemSortInfo itemSortInfo) {
        ItemIdentifier itemIdentifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("61e28b4a", new Object[]{this, itemSortInfo});
        }
        if (itemSortInfo == null || (itemIdentifier = itemSortInfo.currentItemSort) == null) {
            return this.f20582a;
        }
        c(this.f20582a, itemIdentifier);
        return this.f20582a;
    }

    public void e(List<x4h> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde9dd06", new Object[]{this, list});
        } else if (list != null && !list.isEmpty() && !this.f20582a.isEmpty()) {
            Collections.sort(list, new hga(this.f20582a));
        }
    }

    public List<ItemIdentifier> g(List<x4h> list, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("71fe8ecb", new Object[]{this, list, new Integer(i)});
        }
        if (list == null || this.f20582a == null || list.isEmpty() || this.f20582a.isEmpty() || i >= list.size() - 1) {
            return null;
        }
        long m = pfa.m();
        ArrayList arrayList = new ArrayList();
        while (i < list.size()) {
            if (10 == i2 && arrayList.isEmpty()) {
                return arrayList;
            }
            if (arrayList.size() >= 10) {
                return arrayList;
            }
            x4h x4hVar = list.get(i);
            if (x4hVar != null && !hga.b(x4hVar.f31139a) && !x4hVar.f) {
                long j = x4hVar.c;
                if (j > 0 && m > j && !x4hVar.d) {
                    arrayList.add(f(this, x4hVar.b, x4hVar.e));
                    x4hVar.d = true;
                }
            }
            i++;
            i2++;
        }
        return arrayList;
    }

    public final void h(List<ItemIdentifier> list, List<ItemIdentifier> list2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c6568", new Object[]{this, list, list2});
        } else if (list2 != null && !list2.isEmpty() && list != null && !list.isEmpty()) {
            Iterator<ItemIdentifier> it = list.iterator();
            while (it.hasNext()) {
                ItemIdentifier next = it.next();
                if (o(list2, next.itemId) >= 0 && (2 == (i = next.type) || 3 == i)) {
                    it.remove();
                }
            }
        }
    }

    public final int j(th5 th5Var, List<x4h> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4831a8a", new Object[]{this, th5Var, list})).intValue();
        }
        int size = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (th5Var.c > list.get(i).b) {
                return i;
            }
        }
        return size;
    }

    public List<ItemIdentifier> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("913250ce", new Object[]{this});
        }
        return this.f20582a;
    }

    public List<ItemIdentifier> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3bd499cf", new Object[]{this});
        }
        return this.b;
    }

    public void p(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41367798", new Object[]{this, new Integer(i), str});
        } else if (this.f20582a != null) {
            ItemIdentifier itemIdentifier = new ItemIdentifier();
            itemIdentifier.goodsIndex = i;
            itemIdentifier.itemId = str;
            this.f20582a.add(0, itemIdentifier);
            v();
        }
    }

    public boolean q(List<x4h> list) {
        List<ItemIdentifier> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f213de9b", new Object[]{this, list})).booleanValue();
        }
        if (list != null && !list.isEmpty() && (list2 = this.f20582a) != null && !list2.isEmpty()) {
            hga hgaVar = new hga(this.f20582a);
            x4h x4hVar = null;
            int i = 0;
            while (i < list.size()) {
                x4h x4hVar2 = list.get(i);
                if (x4hVar != null && hgaVar.compare(x4hVar2, x4hVar) < 0) {
                    return false;
                }
                i++;
                x4hVar = x4hVar2;
            }
        }
        return true;
    }

    public final void u(boolean z) {
        List<ItemIdentifier> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f37d56ac", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f20582a = new ArrayList();
        List<ItemIdentifier> list2 = this.b;
        if (list2 != null && !list2.isEmpty()) {
            this.f20582a.addAll(this.b);
        }
        if (z) {
            xea xeaVar = this.e;
            if (xeaVar == null || xeaVar.j() == null) {
                list = null;
            } else {
                list = this.e.j().E();
            }
            if (list != null && !list.isEmpty()) {
                Iterator<ItemIdentifier> it = list.iterator();
                while (it.hasNext()) {
                    ItemIdentifier next = it.next();
                    Iterator<ItemIdentifier> it2 = this.f20582a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (TextUtils.equals(next.itemId, it2.next().itemId)) {
                                it.remove();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                this.f20582a.addAll(list);
            }
        }
    }

    public final void v() {
        List<ItemIdentifier> list;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4b57d1", new Object[]{this});
        } else if (!((ArrayList) this.f20582a).isEmpty() && (list = this.c) != null && !list.isEmpty()) {
            h(this.c, this.f20582a);
            ArrayList arrayList = new ArrayList(this.f20582a);
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                ItemIdentifier itemIdentifier = this.c.get(i2);
                if (itemIdentifier != null && (i = itemIdentifier.pos) > 0) {
                    if (i <= arrayList.size()) {
                        arrayList.add(itemIdentifier.pos - 1, itemIdentifier);
                    } else {
                        arrayList.add(itemIdentifier);
                    }
                }
            }
            this.f20582a = arrayList;
        }
    }

    public List<ItemIdentifier> w(ItemSortInfo itemSortInfo, ItemSortInfo itemSortInfo2, boolean z, boolean z2) {
        List<ItemIdentifier> list;
        List<ItemIdentifier> list2;
        xea xeaVar;
        List<ItemIdentifier> list3;
        xea xeaVar2;
        xea xeaVar3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("14476dcc", new Object[]{this, itemSortInfo, itemSortInfo2, new Boolean(z), new Boolean(z2)});
        }
        if (!z2 || (xeaVar3 = this.e) == null || xeaVar3.j() == null) {
            list = null;
        } else {
            list = this.e.j().E();
        }
        if (!((list != null && !list.isEmpty()) || itemSortInfo2 == null || (list3 = itemSortInfo2.sortList) == null || list3.isEmpty() || (xeaVar2 = this.e) == null || xeaVar2.j() == null)) {
            this.e.j().Z(itemSortInfo2.sortList);
        }
        if (!(itemSortInfo == null || (list2 = itemSortInfo.sortList) == null)) {
            long j = itemSortInfo.sortTime;
            if (j > this.d) {
                this.d = j;
                this.b = list2;
                if (!z) {
                    this.c = itemSortInfo.customRules;
                }
                u(z2);
                v();
                if (z2 && (xeaVar = this.e) != null) {
                    xeaVar.j = this.f20582a;
                }
                return this.f20582a;
            }
        }
        if (!wda.p()) {
            u(z2);
        }
        return this.f20582a;
    }

    public List<ItemIdentifier> y(List<x4h> list, int i) {
        x4h x4hVar;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6f0e8aa0", new Object[]{this, list, new Integer(i)});
        }
        if (list == null || this.f20582a == null || list.isEmpty() || this.f20582a.isEmpty()) {
            return null;
        }
        long m = pfa.m();
        ArrayList arrayList = new ArrayList();
        while (i >= 0) {
            if (10 == i2 && arrayList.isEmpty()) {
                return arrayList;
            }
            if (arrayList.size() >= 10) {
                return arrayList;
            }
            if (list.size() > i && (x4hVar = list.get(i)) != null && !hga.b(x4hVar.f31139a) && !x4hVar.f) {
                long j = x4hVar.c;
                if (j > 0 && m > j && !x4hVar.d) {
                    arrayList.add(f(this, x4hVar.b, x4hVar.e));
                    x4hVar.d = true;
                }
            }
            i--;
            i2++;
        }
        return arrayList;
    }

    public List<ItemIdentifier> i(List<x4h> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a2a9f9fb", new Object[]{this, list, new Integer(i)});
        }
        List<ItemIdentifier> list2 = this.f20582a;
        if (list2 == null || list2.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int i2 = -1;
        while (i < this.f20582a.size()) {
            ItemIdentifier itemIdentifier = this.f20582a.get(i);
            if (itemIdentifier != null) {
                if (list != null && !list.isEmpty()) {
                    for (x4h x4hVar : list) {
                        if (x4hVar == null || x4hVar.b != itemIdentifier.goodsIndex || !TextUtils.equals(x4hVar.e, itemIdentifier.itemId)) {
                        }
                    }
                }
                arrayList.add(itemIdentifier);
                if (arrayList.size() >= 10) {
                    break;
                }
            } else {
                i2 = i;
            }
            i++;
        }
        if (i2 >= 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("errorIndex", "" + i2);
            hashMap.put("totalSize", "" + this.f20582a.size());
            zha.m(null, "generatorNexRequestList", hashMap);
        }
        return arrayList;
    }

    public boolean b(ItemCategory itemCategory, th5 th5Var, boolean z, boolean z2, boolean z3, pqd pqdVar) {
        List<x4h> N;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bc4a101", new Object[]{this, itemCategory, th5Var, new Boolean(z), new Boolean(z2), new Boolean(z3), pqdVar})).booleanValue();
        }
        if (th5Var == null || pqdVar == null || (N = pqdVar.getAdapter().N()) == null) {
            return false;
        }
        for (int i = 0; i < N.size(); i++) {
            x4h x4hVar = N.get(i);
            if (x4hVar != null && th5Var.c == x4hVar.b && TextUtils.equals(th5Var.e, x4hVar.e)) {
                if (z3) {
                    t(this.e.l(itemCategory, x4hVar), th5Var);
                }
                x4hVar.a(th5Var);
                this.e.W(th5Var, itemCategory);
                if (z2 && pqdVar.getAdapter() != null) {
                    hha.c("lsfzlj1234", "notifyItemChanged | i=" + i + "   goodsIndex=" + th5Var.c);
                    pqdVar.getAdapter().notifyItemChanged(i);
                }
                return true;
            }
        }
        if (z) {
            return false;
        }
        this.e.W(th5Var, itemCategory);
        int size = N.size();
        if (hga.b(th5Var.f28716a)) {
            size = j(th5Var, N);
        } else {
            int i2 = 0;
            for (int i3 = 0; i3 < N.size(); i3++) {
                x4h x4hVar2 = N.get(i3);
                if (!hga.b(x4hVar2.f31139a)) {
                    while (true) {
                        if (i2 >= ((ArrayList) this.f20582a).size()) {
                            break;
                        }
                        ItemIdentifier itemIdentifier = (ItemIdentifier) ((ArrayList) this.f20582a).get(i2);
                        i2++;
                        if (!itemIdentifier.equals(th5Var.c, th5Var.e)) {
                            if (itemIdentifier.equals(x4hVar2.b, x4hVar2.e)) {
                                break;
                            }
                        } else {
                            size = i3;
                            break;
                        }
                    }
                    if (size != N.size()) {
                        break;
                    }
                }
            }
        }
        N.add(size, pfa.Y(th5Var));
        if (size == 0) {
            pqdVar.getAdapter().notifyDataSetChanged();
            return false;
        }
        if (z2 && pqdVar.getAdapter() != null) {
            pqdVar.getAdapter().notifyItemInserted(size);
        }
        return false;
    }

    public List<ItemIdentifier> x(List<x4h> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7eef9b74", new Object[]{this, list, new Integer(i)});
        }
        if (i <= 0 || list == null || list.isEmpty()) {
            return null;
        }
        x4h x4hVar = list.get(list.size() - 1);
        if (x4hVar == null) {
            hha.b("GoodListDataSorter", "topGoodsCompensate, lastProduct empty.");
            return null;
        }
        int n = n(this.f20582a, x4hVar.b, x4hVar.e);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.f20582a.size() && i2 <= n; i2++) {
            ItemIdentifier itemIdentifier = this.f20582a.get(i2);
            Iterator<x4h> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList.add(itemIdentifier);
                    break;
                }
                x4h next = it.next();
                if (next != null && next.b == itemIdentifier.goodsIndex && TextUtils.equals(next.e, itemIdentifier.itemId)) {
                    break;
                }
            }
            if (arrayList.size() >= i) {
                return arrayList;
            }
        }
        return arrayList;
    }
}
