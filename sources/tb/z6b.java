package tb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotsViewHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class z6b implements View.OnAttachStateChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HotSpotsViewHolder f32569a;

    public z6b(HotSpotsViewHolder hotSpotsViewHolder) {
        this.f32569a = hotSpotsViewHolder;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            return;
        }
        HotSpotsViewHolder.C2(this.f32569a);
        RecyclerView y2 = HotSpotsViewHolder.y2(this.f32569a);
        if (y2 != null) {
            y2.getViewTreeObserver().addOnScrollChangedListener(HotSpotsViewHolder.w2(this.f32569a));
        } else {
            ckf.y(OrderConfigs.VIEWPAGER);
            throw null;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            return;
        }
        HotSpotsViewHolder.G2(this.f32569a);
        HotSpotsViewHolder.u2(this.f32569a).removeMessages(1);
        RecyclerView y2 = HotSpotsViewHolder.y2(this.f32569a);
        if (y2 != null) {
            y2.getViewTreeObserver().removeOnScrollChangedListener(HotSpotsViewHolder.w2(this.f32569a));
        } else {
            ckf.y(OrderConfigs.VIEWPAGER);
            throw null;
        }
    }
}
