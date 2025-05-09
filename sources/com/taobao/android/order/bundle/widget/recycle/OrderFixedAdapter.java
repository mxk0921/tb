package com.taobao.android.order.bundle.widget.recycle;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.ptr.views.recycler.accessories.FixedViewAdapter;
import java.util.ArrayList;
import tb.dbl;
import tb.jk9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class OrderFixedAdapter extends FixedViewAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final OrderConfigs.BizNameType e;

    static {
        t2o.a(713032009);
    }

    public OrderFixedAdapter(ArrayList<jk9> arrayList, ArrayList<jk9> arrayList2, RecyclerView.Adapter adapter, OrderConfigs.BizNameType bizNameType) {
        super(arrayList, arrayList2, adapter);
        this.e = bizNameType;
        W(dbl.s());
    }

    public static /* synthetic */ Object ipc$super(OrderFixedAdapter orderFixedAdapter, String str, Object... objArr) {
        if (str.hashCode() == -1640234647) {
            return super.onCreateViewHolder((ViewGroup) objArr[0], ((Number) objArr[1]).intValue());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/widget/recycle/OrderFixedAdapter");
    }

    @Override // com.taobao.ptr.views.recycler.accessories.FixedViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        RecyclerView.ViewHolder onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
        if (this.e == OrderConfigs.BizNameType.ORDER_DETAIL && (onCreateViewHolder instanceof FixedViewAdapter.FixedViewHolder) && (view = onCreateViewHolder.itemView) != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) onCreateViewHolder.itemView.getParent()).removeView(onCreateViewHolder.itemView);
        }
        return onCreateViewHolder;
    }
}
