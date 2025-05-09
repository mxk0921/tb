package com.taobao.search.searchdoor.activate.hotspot.impl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.searchdoor.activate.ActivateViewLoader;
import com.taobao.search.searchdoor.activate.hotspot.HotSpots;
import com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotItemAdapter;
import com.taobao.taobao.R;
import java.util.List;
import tb.ckf;
import tb.k6b;
import tb.t2o;
import tb.v6b;
import tb.x6b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class HotSpotItemAdapter extends RecyclerView.Adapter<BaseHotSpotViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11622a;
    public final k6b b;
    public x6b c;
    public HotSpots d;

    static {
        t2o.a(815793013);
    }

    public HotSpotItemAdapter(boolean z, k6b k6bVar) {
        ckf.g(k6bVar, DataReceiveMonitor.CB_LISTENER);
        this.f11622a = z;
        this.b = k6bVar;
    }

    public static final void b(HotSpotItemAdapter hotSpotItemAdapter, int i, v6b v6bVar, x6b x6bVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc61c3c5", new Object[]{hotSpotItemAdapter, new Integer(i), v6bVar, x6bVar, view});
            return;
        }
        ckf.g(hotSpotItemAdapter, "this$0");
        ckf.g(v6bVar, "$item");
        ckf.g(x6bVar, "$tab");
        hotSpotItemAdapter.b.Q0(i, v6bVar, x6bVar);
    }

    public static /* synthetic */ Object ipc$super(HotSpotItemAdapter hotSpotItemAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/hotspot/impl/HotSpotItemAdapter");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<v6b> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        x6b x6bVar = this.c;
        if (x6bVar == null || (f = x6bVar.f()) == null) {
            return 1;
        }
        return f.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i < getItemCount() - 1) {
            return 0;
        }
        return 1;
    }

    /* renamed from: N */
    public void onBindViewHolder(BaseHotSpotViewHolder baseHotSpotViewHolder, final int i) {
        int i2 = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786ecd57", new Object[]{this, baseHotSpotViewHolder, new Integer(i)});
            return;
        }
        ckf.g(baseHotSpotViewHolder, "vh");
        if (baseHotSpotViewHolder instanceof HotSpotItemViewHolder) {
            final x6b x6bVar = this.c;
            if (x6bVar != null) {
                final v6b v6bVar = x6bVar.f().get(i);
                HotSpotItemViewHolder hotSpotItemViewHolder = (HotSpotItemViewHolder) baseHotSpotViewHolder;
                if (x6bVar.b() > 0) {
                    i2 = x6bVar.b();
                }
                hotSpotItemViewHolder.g0(v6bVar, i, i2);
                ViewProxy.setOnClickListener(baseHotSpotViewHolder.itemView, new View.OnClickListener() { // from class: tb.n8z
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HotSpotItemAdapter.b(HotSpotItemAdapter.this, i, v6bVar, x6bVar, view);
                    }
                });
                return;
            }
            return;
        }
        HotSpots hotSpots = this.d;
        if (hotSpots != null) {
            ((HotspotFootViewHolder) baseHotSpotViewHolder).h0(hotSpots, this.b);
        }
    }

    /* renamed from: O */
    public BaseHotSpotViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseHotSpotViewHolder) ipChange.ipc$dispatch("e464c15d", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, a.MSG_SOURCE_PARENT);
        if (i == 0) {
            ActivateViewLoader.a aVar = ActivateViewLoader.Companion;
            Context context = viewGroup.getContext();
            ckf.f(context, "getContext(...)");
            return new HotSpotItemViewHolder(aVar.a(context, this.f11622a));
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tbsearchdoor_hotspot_footer, viewGroup, false);
        ckf.f(inflate, "inflate(...)");
        return new HotspotFootViewHolder(inflate, this.f11622a);
    }

    public final void P(x6b x6bVar, HotSpots hotSpots) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc869459", new Object[]{this, x6bVar, hotSpots});
            return;
        }
        ckf.g(x6bVar, "item");
        ckf.g(hotSpots, "totalItem");
        this.d = hotSpots;
        int itemCount = getItemCount();
        if (itemCount > 1) {
            notifyItemRangeRemoved(0, itemCount - 1);
        }
        this.c = x6bVar;
        int itemCount2 = getItemCount();
        if (itemCount2 > 1) {
            notifyItemRangeInserted(0, itemCount2 - 1);
        }
    }
}
