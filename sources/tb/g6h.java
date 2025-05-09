package tb;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.RecycleViewHolder;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.afterbuy.NestedScrollRecyclerView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.view.item.ILoadMoreItemRender;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class g6h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final vgc f19757a;
    public final RecyclerView b;

    static {
        t2o.a(486539674);
    }

    public g6h(RecyclerView recyclerView, vgc vgcVar) {
        this.b = recyclerView;
        this.f19757a = vgcVar;
    }

    public final int a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b9a5301", new Object[]{this, iArr})).intValue();
        }
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 == 0) {
                i = iArr[i2];
            } else {
                int i3 = iArr[i2];
                if (i3 > i) {
                    i = i3;
                }
            }
        }
        return i;
    }

    public final boolean c(List<BaseSectionModel> list) {
        RecycleViewHolder recycleViewHolder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d0c4dd3", new Object[]{this, list})).booleanValue();
        }
        RecyclerView recyclerView = this.b;
        int[] findLastVisibleItemPositions = ((StaggeredGridLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPositions(null);
        if ((recyclerView instanceof NestedScrollRecyclerView) && a(findLastVisibleItemPositions) == list.size() - 1) {
            return true;
        }
        if (findLastVisibleItemPositions[0] != list.size() - 1 || (recycleViewHolder = (RecycleViewHolder) recyclerView.findViewHolderForAdapterPosition(findLastVisibleItemPositions[0])) == null || recycleViewHolder.b0() == null) {
            return false;
        }
        return true;
    }

    public final boolean b(List<BaseSectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("986ad0a", new Object[]{this, list})).booleanValue();
        }
        return list != null && !list.isEmpty() && list.size() > 1 && TextUtils.equals(list.get(list.size() - 1).getSectionBizCode(), "loading");
    }

    public void d(List<BaseSectionModel> list, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee97601e", new Object[]{this, list, new Boolean(z), str});
            return;
        }
        eve.c("LoadMoreHelper", "updateLoadMoreViewState");
        if (b(list)) {
            rgc b = this.f19757a.b(cfj.b().getSectionBizCode());
            if (!(b instanceof ILoadMoreItemRender)) {
                eve.b("LoadMoreHelper", "updateLoadMoreViewState");
                return;
            }
            ILoadMoreItemRender iLoadMoreItemRender = (ILoadMoreItemRender) b;
            iLoadMoreItemRender.a(false, str);
            if (!z) {
                eve.b("LoadMoreHelper", "updateLoadMoreViewState");
                return;
            } else if (c(list)) {
                iLoadMoreItemRender.a(true, str);
            }
        }
        eve.b("LoadMoreHelper", "updateLoadMoreViewState");
    }
}
