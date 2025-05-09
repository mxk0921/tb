package tb;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.search.searchdoor.DoorListViewModel;
import com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotTabViewHolder;
import com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotsViewHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class a7b implements xqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HotSpotsViewHolder f15581a;

    public a7b(HotSpotsViewHolder hotSpotsViewHolder) {
        this.f15581a = hotSpotsViewHolder;
    }

    @Override // tb.xqd
    public void onItemSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb34d2f", new Object[]{this, new Integer(i)});
            return;
        }
        if (i >= 0) {
            DoorListViewModel.a aVar = DoorListViewModel.Companion;
            Activity activity = this.f15581a.getActivity();
            ckf.f(activity, "getActivity(...)");
            RecyclerView y2 = HotSpotsViewHolder.y2(this.f15581a);
            if (y2 != null) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = y2.findViewHolderForAdapterPosition(i);
                ckf.e(findViewHolderForAdapterPosition, "null cannot be cast to non-null type com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotTabViewHolder");
                aVar.b(activity, ((HotSpotTabViewHolder) findViewHolderForAdapterPosition).e0());
            } else {
                ckf.y(OrderConfigs.VIEWPAGER);
                throw null;
            }
        }
        HotSpotsViewHolder.B2(this.f15581a, i);
    }
}
