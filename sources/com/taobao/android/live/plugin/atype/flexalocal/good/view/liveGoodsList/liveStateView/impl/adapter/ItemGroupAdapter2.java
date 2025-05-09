package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;
import tb.th5;
import tb.xea;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ItemGroupAdapter2 extends BaseGoodStateAdapter2<th5> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699366);
    }

    public ItemGroupAdapter2(xea xeaVar, List<th5> list, RecyclerView recyclerView) {
        super(xeaVar, null, list, recyclerView);
    }

    public static /* synthetic */ Object ipc$super(ItemGroupAdapter2 itemGroupAdapter2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/adapter/ItemGroupAdapter2");
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
        return (th5) this.e.get(i);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.BaseGoodStateAdapter2
    public int S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d624f2a8", new Object[]{this})).intValue();
        }
        return 0;
    }
}
