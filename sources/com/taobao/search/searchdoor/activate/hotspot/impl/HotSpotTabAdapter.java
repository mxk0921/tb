package com.taobao.search.searchdoor.activate.hotspot.impl;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.searchdoor.activate.hotspot.HotSpots;
import com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotTabAdapter;
import com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotTopTabViewHolder;
import java.util.List;
import tb.ckf;
import tb.sda;
import tb.t2o;
import tb.x6b;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class HotSpotTabAdapter extends RecyclerView.Adapter<HotSpotTopTabViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HotSpots f11623a;
    public final HotSpotsViewHolder b;
    public final boolean c;

    static {
        t2o.a(815793015);
    }

    public HotSpotTabAdapter(HotSpots hotSpots, HotSpotsViewHolder hotSpotsViewHolder, boolean z) {
        ckf.g(hotSpotsViewHolder, a.MSG_SOURCE_PARENT);
        this.f11623a = hotSpots;
        this.b = hotSpotsViewHolder;
        this.c = z;
    }

    public static final void d(HotSpotTopTabViewHolder hotSpotTopTabViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab3cf59", new Object[]{hotSpotTopTabViewHolder});
            return;
        }
        ckf.g(hotSpotTopTabViewHolder, "$vh");
        hotSpotTopTabViewHolder.c0();
    }

    public static /* synthetic */ Object ipc$super(HotSpotTabAdapter hotSpotTabAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/hotspot/impl/HotSpotTabAdapter");
    }

    /* renamed from: N */
    public void onBindViewHolder(final HotSpotTopTabViewHolder hotSpotTopTabViewHolder, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735f7f48", new Object[]{this, hotSpotTopTabViewHolder, new Integer(i)});
            return;
        }
        ckf.g(hotSpotTopTabViewHolder, "vh");
        HotSpots hotSpots = this.f11623a;
        ckf.d(hotSpots);
        List<x6b> tabs = hotSpots.getTabs();
        ckf.d(tabs);
        final x6b x6bVar = tabs.get(i);
        HotSpots hotSpots2 = this.f11623a;
        ckf.d(hotSpots2);
        List<x6b> tabs2 = hotSpots2.getTabs();
        ckf.d(tabs2);
        hotSpotTopTabViewHolder.b0(tabs2.get(i));
        ViewProxy.setOnClickListener(hotSpotTopTabViewHolder.itemView, new View.OnClickListener() { // from class: tb.o8z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HotSpotTabAdapter.c(HotSpotTabAdapter.this, x6bVar, i, view);
            }
        });
        if (!x6bVar.c()) {
            HotSpots hotSpots3 = this.f11623a;
            ckf.d(hotSpots3);
            if (!hotSpots3.getPreload()) {
                hotSpotTopTabViewHolder.itemView.post(new Runnable() { // from class: tb.p8z
                    @Override // java.lang.Runnable
                    public final void run() {
                        HotSpotTabAdapter.d(HotSpotTopTabViewHolder.this);
                    }
                });
            }
        }
    }

    /* renamed from: O */
    public HotSpotTopTabViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HotSpotTopTabViewHolder) ipChange.ipc$dispatch("5928c58c", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, a.MSG_SOURCE_PARENT);
        Context context = viewGroup.getContext();
        ckf.f(context, "getContext(...)");
        return new HotSpotTopTabViewHolder(new HotSpotTabItemView(context, this.c), this.c);
    }

    public final void P(HotSpots hotSpots) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b55b61", new Object[]{this, hotSpots});
        } else {
            this.f11623a = hotSpots;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<x6b> tabs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        HotSpots hotSpots = this.f11623a;
        if (hotSpots == null || (tabs = hotSpots.getTabs()) == null) {
            return 0;
        }
        return tabs.size();
    }

    public static final void c(HotSpotTabAdapter hotSpotTabAdapter, x6b x6bVar, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a0c0c7", new Object[]{hotSpotTabAdapter, x6bVar, new Integer(i), view});
            return;
        }
        ckf.g(hotSpotTabAdapter, "this$0");
        ckf.g(x6bVar, "$item");
        Activity activity = hotSpotTabAdapter.b.getActivity();
        ckf.f(activity, "getActivity(...)");
        sda sdaVar = new sda(activity);
        sdaVar.b("/trend_guide.jihuoye.tab", "CLK", z9u.ARG_TABNAME + x6bVar.j());
        hotSpotTabAdapter.b.X2(i, true);
    }
}
