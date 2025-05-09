package com.taobao.search.searchdoor.activate.hotspot.impl;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.search.searchdoor.ChildLayoutManager;
import com.taobao.search.searchdoor.activate.hotspot.HotSpots;
import java.util.List;
import tb.ckf;
import tb.k6b;
import tb.t2o;
import tb.x6b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class HotSpotAdapter extends RecyclerView.Adapter<HotSpotTabViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HotSpots f11620a;
    public final k6b b;
    public final boolean c;

    static {
        t2o.a(815793010);
    }

    public HotSpotAdapter(HotSpots hotSpots, k6b k6bVar, boolean z) {
        ckf.g(k6bVar, DataReceiveMonitor.CB_LISTENER);
        this.f11620a = hotSpots;
        this.b = k6bVar;
        this.c = z;
    }

    public static /* synthetic */ Object ipc$super(HotSpotAdapter hotSpotAdapter, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 430758011) {
            super.onViewDetachedFromWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        } else if (hashCode == 1995301502) {
            super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/searchdoor/activate/hotspot/impl/HotSpotAdapter");
        }
    }

    public final HotSpots M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HotSpots) ipChange.ipc$dispatch("d6481c89", new Object[]{this});
        }
        return this.f11620a;
    }

    /* renamed from: N */
    public void onBindViewHolder(HotSpotTabViewHolder hotSpotTabViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10330e25", new Object[]{this, hotSpotTabViewHolder, new Integer(i)});
            return;
        }
        ckf.g(hotSpotTabViewHolder, "vh");
        HotSpots hotSpots = this.f11620a;
        if (hotSpots != null) {
            List<x6b> tabs = hotSpots.getTabs();
            ckf.d(tabs);
            hotSpotTabViewHolder.b0(tabs.get(i), hotSpots, i, this.b);
        }
    }

    /* renamed from: P */
    public void onViewAttachedToWindow(HotSpotTabViewHolder hotSpotTabViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecff8198", new Object[]{this, hotSpotTabViewHolder});
            return;
        }
        super.onViewAttachedToWindow(hotSpotTabViewHolder);
        if (hotSpotTabViewHolder != null) {
            hotSpotTabViewHolder.f0();
        }
    }

    /* renamed from: Q */
    public void onViewDetachedFromWindow(HotSpotTabViewHolder hotSpotTabViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29b487b", new Object[]{this, hotSpotTabViewHolder});
            return;
        }
        super.onViewDetachedFromWindow(hotSpotTabViewHolder);
        if (hotSpotTabViewHolder != null) {
            hotSpotTabViewHolder.g0();
        }
    }

    public final void S(HotSpots hotSpots) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b55b61", new Object[]{this, hotSpots});
        } else {
            this.f11620a = hotSpots;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<x6b> tabs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        HotSpots hotSpots = this.f11620a;
        if (hotSpots == null || (tabs = hotSpots.getTabs()) == null) {
            return 0;
        }
        return tabs.size();
    }

    /* renamed from: O */
    public HotSpotTabViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HotSpotTabViewHolder) ipChange.ipc$dispatch("d5f5413", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, a.MSG_SOURCE_PARENT);
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
        ViewCompat.setNestedScrollingEnabled(recyclerView, false);
        recyclerView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        recyclerView.setLayoutManager(new ChildLayoutManager(viewGroup.getContext(), 1, false));
        recyclerView.setAdapter(new HotSpotItemAdapter(this.c, this.b));
        recyclerView.addItemDecoration(new HotSpotDecoration(this.c));
        Context context = viewGroup.getContext();
        ckf.e(context, "null cannot be cast to non-null type android.app.Activity");
        return new HotSpotTabViewHolder(recyclerView, (Activity) context);
    }
}
