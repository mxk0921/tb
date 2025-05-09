package tb;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.ScrollStaggeredGridLayoutManager;
import com.taobao.android.dinamicx.widget.recycler.WaterfallLayout;
import com.taobao.android.dinamicx.widget.recycler.loadmore.DXAbsOnLoadMoreView;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ih5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596478);
    }

    public TBSwipeRefreshLayout.j getExtraPullRefreshListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSwipeRefreshLayout.j) ipChange.ipc$dispatch("19b19778", new Object[]{this, str});
        }
        return null;
    }

    public RecyclerView.OnScrollListener getExtraScrollerListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("6f6adbf2", new Object[]{this, str});
        }
        return null;
    }

    public DXAbsOnLoadMoreView getOnLoadMoreView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXAbsOnLoadMoreView) ipChange.ipc$dispatch("83838a3e", new Object[]{this, str});
        }
        return null;
    }

    public DXAbsOnLoadMoreView getOnRefreshLoadMoreView(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXAbsOnLoadMoreView) ipChange.ipc$dispatch("ce97201f", new Object[]{this, context, str});
        }
        return null;
    }

    public TBAbsRefreshHeader getRefreshHeaderView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBAbsRefreshHeader) ipChange.ipc$dispatch("1ba7f00d", new Object[]{this, str});
        }
        return null;
    }

    public ScrollStaggeredGridLayoutManager getWaterFallLayoutCustomLayoutManager(int i, int i2, WaterfallLayout waterfallLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollStaggeredGridLayoutManager) ipChange.ipc$dispatch("ff117905", new Object[]{this, new Integer(i), new Integer(i2), waterfallLayout});
        }
        return null;
    }

    public DXRecyclerView getWaterFallLayoutCustomRecyclerView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerView) ipChange.ipc$dispatch("9e4bff2d", new Object[]{this, context});
        }
        return null;
    }
}
