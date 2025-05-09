package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import java.util.List;
import tb.pfa;
import tb.t2o;
import tb.th5;
import tb.x4h;
import tb.xea;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GoodsLiveStateListAdapter2 extends BaseGoodStateAdapter2<x4h> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699362);
    }

    public GoodsLiveStateListAdapter2(xea xeaVar, ItemCategory itemCategory, List<x4h> list, CloseRecyclerView closeRecyclerView) {
        super(xeaVar, itemCategory, list, closeRecyclerView);
    }

    public static /* synthetic */ Object ipc$super(GoodsLiveStateListAdapter2 goodsLiveStateListAdapter2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/adapter/GoodsLiveStateListAdapter2");
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.AbstractGoodsRecyclerAdapter
    public th5 M(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (th5) ipChange.ipc$dispatch("b2f729b5", new Object[]{this, new Integer(i)});
        }
        List<DataType> list = this.e;
        if (list == 0 || list.size() <= i) {
            return null;
        }
        x4h x4hVar = (x4h) this.e.get(i);
        th5 l = this.f8550a.l(this.b, x4hVar);
        if (x4hVar == null || l == null) {
            return null;
        }
        return l;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.BaseGoodStateAdapter2
    public int S() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d624f2a8", new Object[]{this})).intValue();
        }
        List<DataType> list = this.e;
        if (list != 0) {
            int i2 = 0;
            for (DataType datatype : list) {
                i += pfa.O(datatype.f31139a) ? 1 : 0;
                i2++;
                if (i2 >= 3) {
                    break;
                }
            }
        }
        return i;
    }
}
