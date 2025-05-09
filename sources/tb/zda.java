package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.GoodListSearchResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.common.SearchTransferInfo;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.AbstractGoodsRecyclerAdapter;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.ArrayList;
import java.util.List;
import tb.sac;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zda<T extends sac> extends vfa<T, ogc> implements qac {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int GROUP_FROM_HISTORY = 3;
    public static final int GROUP_FROM_RETRY = 1;
    public static final int GROUP_FROM_SEARCH = 2;
    public int e;
    public ItemIdentifier g;
    public boolean f = true;
    public boolean h = true;

    static {
        t2o.a(295699304);
        t2o.a(295699305);
    }

    public zda(xea xeaVar) {
        super(xeaVar);
    }

    public static /* synthetic */ Object ipc$super(zda zdaVar, String str, Object... objArr) {
        if (str.hashCode() == 812644252) {
            super.I((r9e) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/itemgroup/common/GoodGroupBasePresenter");
    }

    public void D(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e74dab", new Object[]{this, str, str2, new Integer(i)});
        } else if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            if (!TextUtils.isEmpty(trim)) {
                this.g = null;
                this.e = i;
                this.f = true;
                if (!(((sac) this.f29980a).getAdapter() == null || ((sac) this.f29980a).getAdapter().N() == null)) {
                    ((sac) this.f29980a).getAdapter().N().clear();
                    ((sac) this.f29980a).getAdapter().notifyDataSetChanged();
                }
                ((ogc) this.b).i(this.d, trim, str2, 10);
            }
        }
    }

    @Override // tb.qac
    public void H(GoodListSearchResponse.GoodListSearchResponseData goodListSearchResponseData, String str) {
        List<ItemlistV2ResponseData.ItemListv1> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("998c160d", new Object[]{this, goodListSearchResponseData, str});
        } else if (goodListSearchResponseData == null || (list = goodListSearchResponseData.itemListv1) == null || list.isEmpty()) {
            ((sac) this.f29980a).showEmpty(str);
        } else {
            S(goodListSearchResponseData.itemListv1);
            T(goodListSearchResponseData, str);
            this.f = goodListSearchResponseData.hasNext;
        }
    }

    @Override // tb.vfa, tb.bdd
    public void I(r9e r9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("306ff79c", new Object[]{this, r9eVar});
            return;
        }
        super.I(r9eVar);
        if (((sac) this.f29980a).getAdapter() != null) {
            ((sac) this.f29980a).getAdapter().O(this.c);
        }
    }

    public void O(ArrayList<th5> arrayList, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4bd5c19", new Object[]{this, arrayList, new Boolean(z), str});
        }
    }

    public final void P(List<th5> list) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6131d58", new Object[]{this, list});
            return;
        }
        ArrayList arrayList = new ArrayList();
        AbstractGoodsRecyclerAdapter adapter = ((sac) this.f29980a).getAdapter();
        int size = adapter.N().size();
        for (th5 th5Var : list) {
            if (size > 0) {
                z = false;
                for (int i = 0; i < size; i++) {
                    if (adapter.M(i) != null && adapter.M(i).c == th5Var.c) {
                        adapter.N().set(i, th5Var);
                        adapter.notifyItemChanged(i);
                        z = true;
                    }
                }
            } else {
                z = false;
            }
            if (!z) {
                arrayList.add(th5Var);
            }
        }
        if (!arrayList.isEmpty()) {
            adapter.N().addAll(arrayList);
            adapter.notifyItemRangeInserted(size, adapter.N().size());
        }
    }

    public final List<ItemIdentifier> Q(List<th5> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("81503fec", new Object[]{this, list});
        }
        SearchTransferInfo a2 = ((ogc) this.b).a();
        if (this.g == null || a2 == null || a2.algoSearchLiveItemDTOS == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ItemIdentifier itemIdentifier : a2.algoSearchLiveItemDTOS) {
            if (itemIdentifier != null) {
                if (list != null) {
                    for (th5 th5Var : list) {
                        if (th5Var != null && itemIdentifier.equals(th5Var.c, th5Var.e)) {
                            break;
                        }
                    }
                }
                arrayList.add(itemIdentifier);
                if (arrayList.size() == 10) {
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: R */
    public cof N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cof) ipChange.ipc$dispatch("41e2d21d", new Object[]{this});
        }
        return new cof();
    }

    public void S(List<ItemlistV2ResponseData.ItemListv1> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff3ef08e", new Object[]{this, list});
        }
    }

    @Override // tb.qac
    public void g(String str, String str2) {
        List<th5> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd01c76", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && this.f) {
            if (((sac) this.f29980a).getAdapter() != null) {
                list = ((sac) this.f29980a).getAdapter().N();
            } else {
                list = null;
            }
            ((ogc) this.b).d(this.d, str, str2, 10, this.g, Q(list));
        }
    }

    @Override // tb.qac
    public void h(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6899687d", new Object[]{this, liveItem});
            return;
        }
        th5 K = K(liveItem);
        List N = ((sac) this.f29980a).getAdapter().N();
        if (!(K == null || N == null)) {
            for (int i = 0; i < N.size(); i++) {
                th5 th5Var = (th5) N.get(i);
                if (th5Var != null && K.c == th5Var.c) {
                    N.set(i, K);
                    ((sac) this.f29980a).getAdapter().notifyItemChanged(i);
                }
            }
        }
    }

    @Override // tb.qac
    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2533751", new Object[]{this, str});
            return;
        }
        ItemIdentifier itemIdentifier = this.g;
        if (itemIdentifier == null || itemIdentifier.goodsIndex == 0) {
            ((sac) this.f29980a).showError(str);
        }
    }

    @Override // tb.qac
    public void a() {
        th5 th5Var;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("719385bc", new Object[]{this});
            return;
        }
        if (this.h && ((sac) this.f29980a).getAdapter().N() != null && ((sac) this.f29980a).getAdapter().N().size() > 0) {
            for (Object obj : ((sac) this.f29980a).getAdapter().N()) {
                if ((obj instanceof th5) && (jSONObject = (th5Var = (th5) obj).b) != null && jSONObject.containsKey("native_vipTagsShow") && th5Var.b.containsKey("native_canShowVipEntrance")) {
                    th5Var.b.put("native_canShowVipEntrance", (Object) Boolean.FALSE);
                }
            }
            ((sac) this.f29980a).getAdapter().notifyDataSetChanged();
        }
        this.h = false;
    }

    public final void T(GoodListSearchResponse.GoodListSearchResponseData goodListSearchResponseData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cba8e49", new Object[]{this, goodListSearchResponseData, str});
            return;
        }
        ArrayList<th5> arrayList = new ArrayList<>();
        List<ItemlistV2ResponseData.ItemListv1> list = goodListSearchResponseData.itemListv1;
        if (list != null && list.size() > 0) {
            for (ItemlistV2ResponseData.ItemListv1 itemListv1 : list) {
                itemListv1.liveItemDO.goodsIndex = zqq.g(itemListv1.goodsIndex, 0);
                th5 K = K(itemListv1.liveItemDO);
                pfa.p(itemListv1.liveItemDO);
                K.getClass();
                arrayList.add(K);
            }
            ItemlistV2ResponseData.ItemListv1 itemListv12 = list.get(list.size() - 1);
            if (!(itemListv12 == null || itemListv12.liveItemDO == null)) {
                LiveItem liveItem = itemListv12.liveItemDO;
                this.g = new ItemIdentifier(liveItem.goodsIndex, Long.toString(liveItem.itemId));
                hha.b("GoodGroupBasePresenter", "processResultData | last goodsIndex=" + this.g.goodsIndex);
            }
        }
        O(arrayList, goodListSearchResponseData.hasNext, str);
        if (!arrayList.isEmpty()) {
            P(arrayList);
            ((sac) this.f29980a).showGoodList(goodListSearchResponseData.totalNum, str);
            return;
        }
        ((sac) this.f29980a).showEmpty(str);
    }
}
