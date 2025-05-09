package tb;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.RecycleViewAdapter;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class asn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539696);
    }

    public final int a(RecyclerView.Adapter adapter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("560ca0b2", new Object[]{this, adapter, new Integer(i)})).intValue();
        }
        int i2 = i + 2;
        if (i2 < adapter.getItemCount()) {
            return i2;
        }
        return -1;
    }

    public int b(RecyclerView recyclerView, int i, boolean z) {
        View findViewByPosition;
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("779e06c7", new Object[]{this, recyclerView, new Integer(i), new Boolean(z)})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || (findViewByPosition = layoutManager.findViewByPosition(i)) == null) {
            return -1;
        }
        int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) findViewByPosition.getLayoutParams()).getSpanIndex();
        for (int i2 = 1; i2 < 6; i2++) {
            int i3 = i + i2;
            View findViewByPosition2 = layoutManager.findViewByPosition(i3);
            if (findViewByPosition2 == null && z && (a2 = a(recyclerView.getAdapter(), i)) > 0) {
                return a2;
            }
            if (findViewByPosition2 != null && findViewByPosition2.getLayoutParams() != null && findViewByPosition2.getMeasuredHeight() > 0 && ((StaggeredGridLayoutManager.LayoutParams) findViewByPosition2.getLayoutParams()).getSpanIndex() == spanIndex) {
                return i3;
            }
        }
        return -1;
    }

    public BaseSectionModel<?> c(RecycleViewAdapter recycleViewAdapter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("6478241d", new Object[]{this, recycleViewAdapter, new Integer(i)});
        }
        if (recycleViewAdapter == null) {
            return null;
        }
        return recycleViewAdapter.S(i);
    }

    public View d(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b5f3b366", new Object[]{this, recyclerView, new Integer(i)});
        }
        if (recyclerView == null) {
            return null;
        }
        return recyclerView.getLayoutManager().findViewByPosition(i);
    }

    public int e(RecyclerView recyclerView, int i) {
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7132438b", new Object[]{this, recyclerView, new Integer(i)})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || (findViewByPosition = layoutManager.findViewByPosition(i)) == null) {
            return -1;
        }
        int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) findViewByPosition.getLayoutParams()).getSpanIndex();
        for (int i2 = 1; i2 < 6; i2++) {
            int i3 = i - i2;
            View findViewByPosition2 = layoutManager.findViewByPosition(i3);
            if (findViewByPosition2 != null && findViewByPosition2.getLayoutParams() != null && findViewByPosition2.getMeasuredHeight() > 0 && ((StaggeredGridLayoutManager.LayoutParams) findViewByPosition2.getLayoutParams()).getSpanIndex() == spanIndex) {
                return i3;
            }
        }
        return -1;
    }

    public final int f(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bc4e063", new Object[]{this, iArr})).intValue();
        }
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    public final int g(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c186035", new Object[]{this, iArr})).intValue();
        }
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    public int h(RecycleViewAdapter recycleViewAdapter, String str) {
        List<BaseSectionModel> data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("376249da", new Object[]{this, recycleViewAdapter, str})).intValue();
        }
        if (recycleViewAdapter == null || TextUtils.isEmpty(str) || (data = recycleViewAdapter.getData()) == null) {
            return -1;
        }
        for (int i = 0; i < data.size(); i++) {
            BaseSectionModel baseSectionModel = data.get(i);
            if (baseSectionModel != null && TextUtils.equals(str, baseSectionModel.getSectionBizCode())) {
                return i;
            }
        }
        return -1;
    }

    public double i(RecyclerView recyclerView, int i) {
        RecyclerView.LayoutManager layoutManager;
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ee41d4a", new Object[]{this, recyclerView, new Integer(i)})).doubleValue();
        }
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (findViewByPosition = layoutManager.findViewByPosition(i)) == null || findViewByPosition.getMeasuredHeight() <= 0) {
            return -1.0d;
        }
        return lue.d(lue.b(recyclerView), lue.b(findViewByPosition));
    }

    public int[] j(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("b11f580c", new Object[]{this, recyclerView});
        }
        if (recyclerView == null) {
            return null;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) recyclerView.getLayoutManager();
        int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
        staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
        int g = g(iArr);
        staggeredGridLayoutManager.findLastVisibleItemPositions(iArr);
        return new int[]{g, f(iArr)};
    }

    public void k(RecyclerView recyclerView, BaseSectionModel baseSectionModel) {
        RecycleViewAdapter recycleViewAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3976a9dc", new Object[]{this, recyclerView, baseSectionModel});
            return;
        }
        if (recyclerView.getAdapter() instanceof RecycleViewAdapter) {
            recycleViewAdapter = (RecycleViewAdapter) recyclerView.getAdapter();
        } else if (recyclerView instanceof TRecyclerView) {
            recycleViewAdapter = (RecycleViewAdapter) ((TRecyclerView) recyclerView).getRawAdapter();
        } else {
            recycleViewAdapter = null;
        }
        if (recycleViewAdapter != null) {
            recycleViewAdapter.b0(baseSectionModel);
        }
    }
}
