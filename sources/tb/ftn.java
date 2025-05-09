package tb;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ftn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262832);
    }

    public static int a(RecyclerView recyclerView) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        int spanCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25614bac", new Object[]{recyclerView})).intValue();
        }
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof GridLayoutManager) || (layoutManager instanceof LinearLayoutManager)) {
                return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            }
            if ((layoutManager instanceof StaggeredGridLayoutManager) && (spanCount = (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager).getSpanCount()) > 0) {
                int[] iArr = new int[spanCount];
                staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
                int i = Integer.MAX_VALUE;
                for (int i2 = 0; i2 < spanCount; i2++) {
                    int i3 = iArr[i2];
                    if (i3 < i) {
                        i = i3;
                    }
                }
                if (i != Integer.MAX_VALUE) {
                    return i;
                }
            }
        }
        return -1;
    }
}
