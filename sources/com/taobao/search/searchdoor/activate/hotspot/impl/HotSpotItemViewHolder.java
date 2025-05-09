package com.taobao.search.searchdoor.activate.hotspot.impl;

import android.graphics.Rect;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import tb.ckf;
import tb.k6b;
import tb.t2o;
import tb.v6b;
import tb.x6b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class HotSpotItemViewHolder extends BaseHotSpotViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final HotSpotsItemView b;
    public v6b c;

    static {
        t2o.a(815793014);
    }

    public HotSpotItemViewHolder(View view) {
        super(view);
        ckf.e(view, "null cannot be cast to non-null type com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotsItemView");
        this.b = (HotSpotsItemView) view;
    }

    public static /* synthetic */ Object ipc$super(HotSpotItemViewHolder hotSpotItemViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/hotspot/impl/HotSpotItemViewHolder");
    }

    public final void g0(v6b v6bVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f6f445", new Object[]{this, v6bVar, new Integer(i), new Integer(i2)});
            return;
        }
        ckf.g(v6bVar, "item");
        this.b.bind(v6bVar, i, i2);
        this.c = v6bVar;
    }

    public final void h0(int i, v6b v6bVar, x6b x6bVar, k6b k6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9258d101", new Object[]{this, new Integer(i), v6bVar, x6bVar, k6bVar});
            return;
        }
        v6bVar.p(true);
        k6bVar.N0(i, v6bVar, x6bVar);
    }

    @Override // com.taobao.search.searchdoor.activate.hotspot.impl.BaseHotSpotViewHolder
    public void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
        } else {
            this.b.onHitDarkMode();
        }
    }

    @Override // com.taobao.search.searchdoor.activate.hotspot.impl.BaseHotSpotViewHolder
    public boolean f0(Rect rect, int i, x6b x6bVar, k6b k6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("288f152e", new Object[]{this, rect, new Integer(i), x6bVar, k6bVar})).booleanValue();
        }
        ckf.g(rect, "parentRect");
        ckf.g(x6bVar, "tabItem");
        ckf.g(k6bVar, DataReceiveMonitor.CB_LISTENER);
        v6b v6bVar = this.c;
        if (v6bVar == null) {
            return true;
        }
        this.itemView.getGlobalVisibleRect(b0());
        b0().top = this.itemView.getTop();
        b0().bottom = this.itemView.getBottom();
        v6b v6bVar2 = this.c;
        ckf.d(v6bVar2);
        if (!v6bVar2.d() && e0(b0(), rect) && d0(b0(), rect)) {
            h0(i, v6bVar, x6bVar, k6bVar);
        }
        return this.itemView.getTop() <= rect.bottom;
    }
}
