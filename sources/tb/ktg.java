package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.GoodsTopBannerBean;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.GoodsLiveStateListAdapter2;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ktg extends wga {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean n = yga.t();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22908a;

        public a(String str) {
            this.f22908a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((v0d) ktg.g0(ktg.this)).moveToTargetItem(this.f22908a);
            }
        }
    }

    static {
        t2o.a(295699350);
    }

    public ktg(xea xeaVar, ItemCategory itemCategory) {
        super(xeaVar, itemCategory);
    }

    public static /* synthetic */ r9e g0(ktg ktgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r9e) ipChange.ipc$dispatch("5c62543", new Object[]{ktgVar});
        }
        return ktgVar.f29980a;
    }

    public static /* synthetic */ Object ipc$super(ktg ktgVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 812644252) {
            super.I((r9e) objArr[0]);
            return null;
        } else if (hashCode == 985537887) {
            super.p();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/ListAllPresenter");
        }
    }

    @Override // tb.uzp, tb.vfa, tb.bdd
    public void I(r9e r9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("306ff79c", new Object[]{this, r9eVar});
            return;
        }
        super.I(r9eVar);
        xea xeaVar = this.d;
        if (xeaVar != null && xeaVar.I() != null) {
            this.d.I().j().r((GoodsLiveStateListAdapter2) ((v0d) this.f29980a).getAdapter());
        }
    }

    @Override // tb.uzp
    public boolean P(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e89a3146", new Object[]{this, new Long(j), new Boolean(z)})).booleanValue();
        }
        if (TextUtils.isEmpty(this.h) || !zga.a()) {
            if (j <= 0) {
                return false;
            }
            ((v0d) this.f29980a).moveToTargetItem(Long.toString(j));
            return true;
        } else if (!i0()) {
            boolean h0 = h0();
            String str = this.h;
            if (h0) {
                ((v0d) this.f29980a).getRecyclerView().postDelayed(new a(str), 500L);
            } else {
                ((v0d) this.f29980a).moveToTargetItem(str);
            }
            this.h = null;
            return true;
        } else if (!z) {
            return false;
        } else {
            hha.b("ListAllPresenter", "checkNeedScroll | recover to " + this.h);
            ((v0d) this.f29980a).moveToTargetItem(this.h);
            this.h = null;
            return true;
        }
    }

    @Override // tb.uzp
    public boolean Q(ItemSortInfo itemSortInfo, ArrayList<th5> arrayList) {
        List<ItemCategory> f;
        List<ItemIdentifier> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e5f4b20", new Object[]{this, itemSortInfo, arrayList})).booleanValue();
        }
        if (!this.n || (f = jga.f(this.d)) == null || f.isEmpty()) {
            return false;
        }
        for (ItemCategory itemCategory : f) {
            if (itemCategory != null && itemCategory.isPreheatTab()) {
                if (arrayList == null || arrayList.isEmpty() || itemSortInfo == null || (list = itemSortInfo.sortList) == null || list.isEmpty()) {
                    hha.c("ListAllPresenter", "checkoutToBottom | add bottom button 1.");
                    return ((v0d) this.f29980a).getAdapter().P(false);
                }
                ItemIdentifier itemIdentifier = itemSortInfo.sortList.get(itemSortInfo.sortList.size() - 1);
                th5 th5Var = arrayList.get(arrayList.size() - 1);
                if (itemIdentifier == null || th5Var == null || !itemIdentifier.equals(th5Var.c, th5Var.e)) {
                    return false;
                }
                hha.c("ListAllPresenter", "checkoutToBottom | add bottom button 2.");
                return ((v0d) this.f29980a).getAdapter().P(true);
            }
        }
        return ((v0d) this.f29980a).getAdapter().P(false);
    }

    @Override // tb.uzp
    public th5 U(ItemlistV2ResponseData.TopCardItem topCardItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (th5) ipChange.ipc$dispatch("e0e83559", new Object[]{this, topCardItem});
        }
        return null;
    }

    @Override // tb.uzp
    public boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d780fc7", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.uzp
    public boolean Y(ArrayList<th5> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74347192", new Object[]{this, arrayList})).booleanValue();
        }
        return false;
    }

    @Override // tb.uzp, tb.nqd
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39138ca3", new Object[]{this});
        } else if (this.l && wda.d()) {
            ((cbc) this.b).b();
        }
    }

    @Override // tb.wga, tb.ibc
    public void d() {
        xea xeaVar;
        GoodsTopBannerBean r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84150132", new Object[]{this});
        } else if (!ijr.c()) {
            hha.c("ListAllPresenter", "enableGoodsTopInteractBanner false return");
        } else if ("全部".equals(this.e) && "0".equals(this.f) && (xeaVar = this.d) != null && (r = xeaVar.r()) != null) {
            if (TextUtils.equals(r.visible, "show")) {
                k0(r);
            } else {
                j0();
            }
        }
    }

    @Override // tb.wga, tb.ibc
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ab8f7b", new Object[]{this});
            return;
        }
        kkr i = kkr.i();
        xea xeaVar = this.d;
        fea k = i.k(xeaVar, xeaVar.u());
        List<th5> c = k == null ? null : k.c();
        if (c == null || c.isEmpty()) {
            hha.c("ListAllPresenter", "recoverFromCache | cache is empty.");
            return;
        }
        if (kkr.i().o() != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("cacheSize", Integer.toString(c.size()));
            kkr.i().o().c("kandianGLRecover", hashMap);
        }
        this.k.a(this.j, c, false, false, (pqd) this.f29980a);
        this.h = k.d();
        kkr.i().x(this.d, null);
    }

    public final boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2d57283", new Object[]{this})).booleanValue();
        }
        if (!this.l || !wda.d()) {
            return false;
        }
        return true;
    }

    public void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7660b2c6", new Object[]{this});
        } else {
            R(new th5("2topBannerInteractive", 2, null, 1000000, 0L));
        }
    }

    @Override // tb.wga, tb.vfa, tb.bdd
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abe1d5f", new Object[]{this});
            return;
        }
        super.p();
        xea xeaVar = this.d;
        if (xeaVar != null && xeaVar.I() != null) {
            this.d.I().j().r(null);
        }
    }

    public void k0(GoodsTopBannerBean goodsTopBannerBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25199020", new Object[]{this, goodsTopBannerBean});
        } else if (goodsTopBannerBean == null) {
            hha.c("ListAllPresenter", "showTopBanner data is null");
        } else {
            a0(new th5("2topBannerInteractive", 2, goodsTopBannerBean.data, 1000000, 0L), false);
            hha.c("ListAllPresenter", "showTopBanner:" + goodsTopBannerBean.type + " " + goodsTopBannerBean.liveId + " " + goodsTopBannerBean.timestamp);
        }
    }

    public final boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58756acf", new Object[]{this})).booleanValue();
        }
        if (!yga.b()) {
            return false;
        }
        List<ItemIdentifier> x = this.k.x(T(), 50);
        if (x == null || x.isEmpty()) {
            hha.c("ListAllPresenter", "checkNeedDeepCompensate | not need.");
            return false;
        }
        if (kkr.i().o() != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("size", Integer.toString(x.size()));
            kkr.i().o().c("GLCompensate", hashMap);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < x.size(); i++) {
            if (i % 15 == 0 && arrayList.size() > 0) {
                ((cbc) this.b).g(this.k.m(), arrayList, this.j, false, false, "");
                arrayList = new ArrayList();
            }
            arrayList.add(x.get(i));
        }
        if (arrayList.size() > 0) {
            ((cbc) this.b).g(this.k.m(), arrayList, this.j, false, false, "");
        }
        return true;
    }
}
