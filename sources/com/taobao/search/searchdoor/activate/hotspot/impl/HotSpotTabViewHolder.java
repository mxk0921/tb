package com.taobao.search.searchdoor.activate.hotspot.impl;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.search.searchdoor.activate.hotspot.HotSpots;
import com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotTabViewHolder;
import tb.ckf;
import tb.k6b;
import tb.oxb;
import tb.t2o;
import tb.x6b;
import tb.zo6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class HotSpotTabViewHolder extends RecyclerView.ViewHolder implements zo6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView f11624a;
    public final Activity b;
    public final Rect c = new Rect();
    public final int[] d = new int[2];
    public x6b e;

    static {
        t2o.a(815793018);
        t2o.a(993002134);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotSpotTabViewHolder(RecyclerView recyclerView, Activity activity) {
        super(recyclerView);
        ckf.g(recyclerView, "view");
        ckf.g(activity, "activity");
        this.f11624a = recyclerView;
        this.b = activity;
    }

    public static final void c(HotSpotTabViewHolder hotSpotTabViewHolder, int i, x6b x6bVar, k6b k6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb1fee8", new Object[]{hotSpotTabViewHolder, new Integer(i), x6bVar, k6bVar});
            return;
        }
        ckf.g(hotSpotTabViewHolder, "this$0");
        ckf.g(x6bVar, "$tabItem");
        ckf.g(k6bVar, "$listener");
        hotSpotTabViewHolder.c0(i, x6bVar, k6bVar);
    }

    public static /* synthetic */ Object ipc$super(HotSpotTabViewHolder hotSpotTabViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/hotspot/impl/HotSpotTabViewHolder");
    }

    public final void b0(final x6b x6bVar, HotSpots hotSpots, final int i, final k6b k6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5ca23f", new Object[]{this, x6bVar, hotSpots, new Integer(i), k6bVar});
            return;
        }
        ckf.g(x6bVar, "tabItem");
        ckf.g(hotSpots, "hotSpots");
        ckf.g(k6bVar, DataReceiveMonitor.CB_LISTENER);
        this.e = x6bVar;
        RecyclerView.Adapter adapter = this.f11624a.getAdapter();
        ckf.e(adapter, "null cannot be cast to non-null type com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotItemAdapter");
        ((HotSpotItemAdapter) adapter).P(x6bVar, hotSpots);
        if (!hotSpots.getPreload()) {
            this.f11624a.post(new Runnable() { // from class: tb.q8z
                @Override // java.lang.Runnable
                public final void run() {
                    HotSpotTabViewHolder.c(HotSpotTabViewHolder.this, i, x6bVar, k6bVar);
                }
            });
        }
    }

    public final void d0(int i, x6b x6bVar, k6b k6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9dd5202", new Object[]{this, new Integer(i), x6bVar, k6bVar});
            return;
        }
        x6bVar.q(true);
        k6bVar.N(i, x6bVar);
    }

    public final RecyclerView e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("e0a039c9", new Object[]{this});
        }
        return this.f11624a;
    }

    public final void f0() {
        oxb oxbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        Activity activity = this.b;
        if (activity instanceof oxb) {
            oxbVar = (oxb) activity;
        } else {
            oxbVar = null;
        }
        if (oxbVar != null) {
            oxbVar.P(this);
        }
    }

    public final void g0() {
        oxb oxbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        Activity activity = this.b;
        if (activity instanceof oxb) {
            oxbVar = (oxb) activity;
        } else {
            oxbVar = null;
        }
        if (oxbVar != null) {
            oxbVar.j0(this);
        }
    }

    public final void h0(x6b x6bVar, k6b k6bVar) {
        BaseHotSpotViewHolder baseHotSpotViewHolder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8900dfa1", new Object[]{this, x6bVar, k6bVar});
            return;
        }
        int itemCount = this.f11624a.getLayoutManager().getItemCount();
        for (int i = 0; i < itemCount; i++) {
            View childAt = this.f11624a.getLayoutManager().getChildAt(i);
            if (childAt != null) {
                RecyclerView.ViewHolder childViewHolder = this.f11624a.getChildViewHolder(childAt);
                if (childViewHolder instanceof BaseHotSpotViewHolder) {
                    baseHotSpotViewHolder = (BaseHotSpotViewHolder) childViewHolder;
                } else {
                    baseHotSpotViewHolder = null;
                }
                if (baseHotSpotViewHolder != null && !baseHotSpotViewHolder.f0(this.c, baseHotSpotViewHolder.getAdapterPosition(), x6bVar, k6bVar)) {
                    return;
                }
            }
        }
    }

    public final void i0(int i, x6b x6bVar, k6b k6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2379ed7c", new Object[]{this, new Integer(i), x6bVar, k6bVar});
        } else if (x6bVar != null && !x6bVar.h() && this.c.width() > 0 && this.c.height() > 0) {
            d0(i, x6bVar, k6bVar);
        }
    }

    @Override // tb.zo6
    public void onHitDarkMode() {
        BaseHotSpotViewHolder baseHotSpotViewHolder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
            return;
        }
        int itemCount = this.f11624a.getLayoutManager().getItemCount();
        for (int i = 0; i < itemCount; i++) {
            View childAt = this.f11624a.getLayoutManager().getChildAt(i);
            if (childAt != null) {
                RecyclerView.ViewHolder childViewHolder = this.f11624a.getChildViewHolder(childAt);
                if (childViewHolder instanceof BaseHotSpotViewHolder) {
                    baseHotSpotViewHolder = (BaseHotSpotViewHolder) childViewHolder;
                } else {
                    baseHotSpotViewHolder = null;
                }
                if (baseHotSpotViewHolder != null) {
                    baseHotSpotViewHolder.onHitDarkMode();
                }
            }
        }
    }

    public final void c0(int i, x6b x6bVar, k6b k6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ac757", new Object[]{this, new Integer(i), x6bVar, k6bVar});
            return;
        }
        ckf.g(x6bVar, "tabItem");
        ckf.g(k6bVar, DataReceiveMonitor.CB_LISTENER);
        if (ckf.b(x6bVar, this.e) && !k6bVar.Y0(i)) {
            this.f11624a.getGlobalVisibleRect(this.c);
            this.f11624a.getLocationInWindow(this.d);
            int height = this.c.height();
            Rect rect = this.c;
            int i2 = rect.top - this.d[1];
            rect.top = i2;
            rect.bottom = i2 + height;
            h0(x6bVar, k6bVar);
            i0(i, x6bVar, k6bVar);
        }
    }
}
