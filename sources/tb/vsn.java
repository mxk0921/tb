package tb;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vsn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(632291387);
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

    public static int b(RecyclerView recyclerView) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        int spanCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99a26d24", new Object[]{recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) || (layoutManager instanceof LinearLayoutManager)) {
            return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || (spanCount = (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager).getSpanCount()) <= 0) {
            return -1;
        }
        int[] iArr = new int[spanCount];
        staggeredGridLayoutManager.findLastVisibleItemPositions(iArr);
        int i = -1;
        for (int i2 = 0; i2 < spanCount; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        if (i != -1) {
            return i;
        }
        return -1;
    }

    public static int c(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("430093f3", new Object[]{recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return 1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) || (layoutManager instanceof LinearLayoutManager)) {
            return ((LinearLayoutManager) layoutManager).getOrientation();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).getOrientation();
        }
        return 1;
    }

    public static boolean d(RecyclerView recyclerView, int i) {
        View childAt;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("374ea84c", new Object[]{recyclerView, new Integer(i)})).booleanValue();
        }
        if (recyclerView == null || (childAt = recyclerView.getChildAt(i)) == null) {
            return false;
        }
        if (childAt.getBottom() > recyclerView.getHeight()) {
            z = false;
        }
        return z;
    }

    public static boolean e(RecyclerView recyclerView, int i) {
        View childAt;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f241a670", new Object[]{recyclerView, new Integer(i)})).booleanValue();
        }
        if (recyclerView == null || (childAt = recyclerView.getChildAt(i)) == null) {
            return false;
        }
        if (childAt.getLeft() < 0) {
            z = false;
        }
        return z;
    }

    public static boolean f(RecyclerView recyclerView, int i) {
        View childAt;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a48bbd5f", new Object[]{recyclerView, new Integer(i)})).booleanValue();
        }
        if (recyclerView == null || (childAt = recyclerView.getChildAt(i)) == null) {
            return false;
        }
        if (childAt.getRight() > recyclerView.getWidth()) {
            z = false;
        }
        return z;
    }

    public static boolean g(RecyclerView recyclerView, int i) {
        View childAt;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8e17686", new Object[]{recyclerView, new Integer(i)})).booleanValue();
        }
        if (recyclerView == null || (childAt = recyclerView.getChildAt(i)) == null) {
            return false;
        }
        if (childAt.getTop() < 0) {
            z = false;
        }
        return z;
    }

    public static boolean h(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4ef66ba", new Object[]{recyclerView})).booleanValue();
        }
        if (recyclerView == null) {
            return false;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || adapter.getItemCount() == 0) {
            return true;
        }
        int a2 = a(recyclerView);
        if (a2 == -1 || a2 > 0) {
            return false;
        }
        int c = c(recyclerView);
        if (c == 0) {
            return e(recyclerView, a2);
        }
        if (c != 1) {
            return false;
        }
        return g(recyclerView, a2);
    }

    public static boolean i(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a7c2ec0", new Object[]{recyclerView})).booleanValue();
        }
        if (recyclerView == null) {
            return false;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || adapter.getItemCount() == 0) {
            return true;
        }
        int itemCount = adapter.getItemCount() - 1;
        int b = b(recyclerView);
        if (b == -1 || b < itemCount) {
            return false;
        }
        int a2 = b - a(recyclerView);
        int c = c(recyclerView);
        if (c == 0) {
            return f(recyclerView, a2);
        }
        if (c != 1) {
            return false;
        }
        return d(recyclerView, a2);
    }
}
