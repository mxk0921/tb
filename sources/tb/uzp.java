package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.pqd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class uzp<T extends pqd> extends vfa<T, cbc> implements nqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Deprecated
    public String e;
    @Deprecated
    public String f;
    public String h;
    public final ItemCategory j;
    public final hea k;
    public final boolean l;
    public boolean i = true;
    public final z4o m = new z4o(this);
    public boolean g = false;

    static {
        t2o.a(295699354);
        t2o.a(295699337);
    }

    public uzp(xea xeaVar, ItemCategory itemCategory) {
        super(xeaVar);
        this.j = itemCategory;
        this.k = new hea(xeaVar);
        this.l = yga.u(jga.g(xeaVar));
    }

    public static /* synthetic */ Object ipc$super(uzp uzpVar, String str, Object... objArr) {
        if (str.hashCode() == 812644252) {
            super.I((r9e) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/SingleTabBasePresenter");
    }

    @Override // tb.nqd
    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83c30c62", new Object[]{this});
            return;
        }
        List N = ((pqd) this.f29980a).getAdapter().N();
        if (N == null || N.isEmpty()) {
            ((pqd) this.f29980a).showErrorView(new pxg(this.e, 0));
        }
        hha.a("MultiTabBasePresenter", "itemListV2Error: | tabName=" + this.e);
        this.g = false;
        kkr.i().f = null;
    }

    @Override // tb.vfa, tb.bdd
    public void I(r9e r9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("306ff79c", new Object[]{this, r9eVar});
            return;
        }
        super.I(r9eVar);
        if (((pqd) this.f29980a).getAdapter() != null) {
            ((pqd) this.f29980a).getAdapter().O(this.c);
        }
    }

    public boolean O(LiveItem liveItem, boolean z, boolean z2, boolean z3) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55447c9d", new Object[]{this, liveItem, new Boolean(z), new Boolean(z2), new Boolean(z3)})).booleanValue();
        }
        if (((pqd) this.f29980a).getAdapter().N() != null) {
            ((pqd) this.f29980a).hideEmptyView(new pxg(this.e, 0));
        }
        hea heaVar = this.k;
        ItemCategory itemCategory = this.j;
        if (itemCategory == null) {
            str = null;
        } else {
            str = itemCategory.categoryId;
        }
        return heaVar.b(itemCategory, L(liveItem, str), z, z2, z3, (pqd) this.f29980a);
    }

    public abstract boolean P(long j, boolean z);

    public boolean Q(ItemSortInfo itemSortInfo, ArrayList<th5> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e5f4b20", new Object[]{this, itemSortInfo, arrayList})).booleanValue();
        }
        return false;
    }

    public boolean R(th5 th5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bd56d35", new Object[]{this, th5Var})).booleanValue();
        }
        List N = ((pqd) this.f29980a).getAdapter().N();
        if (N.size() > 0) {
            for (int i = 0; i < N.size(); i++) {
                th5 M = ((pqd) this.f29980a).getAdapter().M(i);
                if (M != null && M.c == th5Var.c) {
                    N.remove(i);
                    if (((pqd) this.f29980a).getRecyclerView().getAdapter() != null) {
                        ((pqd) this.f29980a).getRecyclerView().getAdapter().notifyDataSetChanged();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public boolean S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b739e57e", new Object[]{this, str})).booleanValue();
        }
        List N = ((pqd) this.f29980a).getAdapter().N();
        if (N.size() > 0) {
            for (int i = 0; i < N.size(); i++) {
                th5 M = ((pqd) this.f29980a).getAdapter().M(i);
                if (M != null && TextUtils.equals(M.e, str)) {
                    N.remove(i);
                    if (((pqd) this.f29980a).getRecyclerView().getAdapter() != null) {
                        ((pqd) this.f29980a).getRecyclerView().getAdapter().notifyDataSetChanged();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public List<x4h> T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8bc307f6", new Object[]{this});
        }
        if (((pqd) this.f29980a).getAdapter() == null) {
            return null;
        }
        return ((pqd) this.f29980a).getAdapter().N();
    }

    public th5 U(ItemlistV2ResponseData.TopCardItem topCardItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (th5) ipChange.ipc$dispatch("e0e83559", new Object[]{this, topCardItem});
        }
        if (topCardItem == null || !ijr.k() || this.d.N()) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) fkx.h(topCardItem);
        return new th5(topCardItem.type + "topcard", 8, jSONObject, 999999, 0L);
    }

    public boolean V(List<ItemIdentifier> list, List<ItemlistV2ResponseData.ItemListv1> list2, LiveItem liveItem, boolean z) {
        LiveItem liveItem2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8a2bbc1", new Object[]{this, list, list2, liveItem, new Boolean(z)})).booleanValue();
        }
        if (!X() || !this.d.c()) {
            if (!wda.I()) {
                return false;
            }
            if (!z) {
                boolean n = wda.n();
                boolean X = pfa.X(liveItem);
                if (!n && !X) {
                    return false;
                }
            }
        }
        hha.b("MultiTabBasePresenter", "handleDelete | isListAllTab=" + X() + " isMtop=" + z);
        ArrayList arrayList = new ArrayList();
        List N = ((pqd) this.f29980a).getAdapter().N();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < N.size(); i2++) {
            x4h x4hVar = (x4h) N.get(i2);
            if (x4hVar != null && (((i = x4hVar.f31139a) == 4 || i == 7) && hea.n(list, x4hVar.b, x4hVar.e) < 0)) {
                sb.append("&" + x4hVar.b);
                arrayList.add(x4hVar);
            }
        }
        if (arrayList.size() > 0) {
            hha.c("MultiTabBasePresenter", "handleDelete | toBeDelete=" + sb.toString());
            N.removeAll(arrayList);
        }
        if (list2 != null && list2.size() > 0) {
            Iterator<ItemlistV2ResponseData.ItemListv1> it = list2.iterator();
            while (it.hasNext()) {
                ItemlistV2ResponseData.ItemListv1 next = it.next();
                if (next == null) {
                    liveItem2 = null;
                } else {
                    liveItem2 = next.liveItemDO;
                }
                if (qfa.f(liveItem2) && this.d.c() && hea.n(list, liveItem2.goodsIndex, Long.toString(liveItem2.itemId)) < 0) {
                    it.remove();
                }
            }
        }
        if (arrayList.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public cbc N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cbc) ipChange.ipc$dispatch("78a06af5", new Object[]{this});
        }
        return new bha(this.d);
    }

    public abstract boolean X();

    public abstract boolean Y(ArrayList<th5> arrayList);

    public void Z(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef75c6a3", new Object[]{this, str, str2, str3});
            return;
        }
        this.e = str;
        this.f = str2;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39138ca3", new Object[]{this});
        }
    }

    @Override // tb.nqd
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        ((pqd) this.f29980a).hideEmptyView(new pxg(this.e, 0));
        ((pqd) this.f29980a).hideErrorView(new pxg(this.e, 0));
    }

    @Override // tb.nqd
    public boolean loadMore() {
        List<ItemIdentifier> i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f65f066", new Object[]{this})).booleanValue();
        }
        StringBuilder sb = new StringBuilder("loadMore: tab=");
        sb.append(this.e);
        sb.append("   mIsLoading=");
        sb.append(this.g);
        sb.append(" result=");
        sb.append(!this.g);
        hha.a("MultiTabBasePresenter", sb.toString());
        if (this.g || (i = this.k.i(((pqd) this.f29980a).getAdapter().N(), 0)) == null || i.isEmpty()) {
            return false;
        }
        this.g = true;
        ((cbc) this.b).g(this.k.m(), i, this.j, false, this.i, "");
        return true;
    }

    @Override // tb.nqd
    public hea o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hea) ipChange.ipc$dispatch("aa68a4a0", new Object[]{this});
        }
        return this.k;
    }

    @Override // tb.nqd
    public void A(boolean z, List<ItemIdentifier> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1760ccaa", new Object[]{this, new Boolean(z), list});
            return;
        }
        hha.a("MultiTabBasePresenter", "requestLastPage: tab=" + this.e + "    liveId=" + this.d.u() + "    mIsLoading=" + this.g);
        if (!wda.G()) {
            try {
                List<th5> e = this.d.e();
                if (e != null && !e.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("switchTab", String.valueOf(z));
                    hashMap.put("topItemId", String.valueOf(this.d.m.b));
                    hashMap.put("session_id", this.d.p());
                    hashMap.put("timestampT", String.valueOf(System.currentTimeMillis()));
                    v2s.o().E().track4Show("Page_TaobaoLiveWatch", "GoodListFirstScreenDataRender", hashMap);
                }
            } catch (Throwable th) {
                hha.b("MultiTabBasePresenter", th.getMessage());
            }
        }
        if (!this.g) {
            ((pqd) this.f29980a).hideEmptyView(new pxg(this.e, 0));
            ((pqd) this.f29980a).hideErrorView(new pxg(this.e, 0));
            ((cbc) this.b).f(this.k.m(), list, this.j, true, this.i, "showGoodsList", true);
        }
    }

    @Override // tb.nqd
    public boolean c(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b664598b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (!this.l || i3 == 0) {
            return false;
        }
        if (i3 > 0) {
            List<ItemIdentifier> g = this.k.g(((pqd) this.f29980a).getAdapter().N(), i);
            if (g == null || g.isEmpty()) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < g.size(); i4++) {
                sb.append("/" + g.get(i4).goodsIndex);
            }
            hha.c("MultiTabBasePresenter", "checkNeedCompensate ｜ down compensate=" + sb.toString());
            this.m.d(this.k.m(), g, this.d, this.j);
            iha.l(g.size(), "down");
        } else {
            List<ItemIdentifier> y = this.k.y(((pqd) this.f29980a).getAdapter().N(), i2);
            if (y != null && !y.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                for (int i5 = 0; i5 < y.size(); i5++) {
                    sb2.append("/" + y.get(i5).itemId + "_" + y.get(i5).goodsIndex);
                }
                hha.c("MultiTabBasePresenter", "checkNeedCompensate | up compensate=" + sb2.toString());
                this.m.d(this.k.m(), y, this.d, this.j);
                iha.l(y.size(), "up");
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028a A[Catch: Exception -> 0x018e, TRY_LEAVE, TryCatch #0 {Exception -> 0x018e, blocks: (B:59:0x0168, B:61:0x016e, B:63:0x017a, B:68:0x0198, B:71:0x01a3, B:73:0x01a9, B:74:0x01b2, B:81:0x01c2, B:87:0x01ce, B:103:0x0281, B:105:0x028a), top: B:112:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0217 A[Catch: Exception -> 0x0223, TryCatch #2 {Exception -> 0x0223, blocks: (B:89:0x020d, B:91:0x0217, B:94:0x0228, B:96:0x023d, B:97:0x024c, B:101:0x0265), top: B:116:0x020d }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023d A[Catch: Exception -> 0x0223, TryCatch #2 {Exception -> 0x0223, blocks: (B:89:0x020d, B:91:0x0217, B:94:0x0228, B:96:0x023d, B:97:0x024c, B:101:0x0265), top: B:116:0x020d }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0262  */
    @Override // tb.nqd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void G(com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData r28, boolean r29, boolean r30, long r31, long r33, java.lang.String r35) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.uzp.G(com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData, boolean, boolean, long, long, java.lang.String):void");
    }
}
