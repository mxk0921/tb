package tb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nestedscroll.recyclerview.ParentRecyclerView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fjg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(RecyclerView recyclerView) {
        jrj nestedScrollChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc7ee9de", new Object[]{recyclerView})).booleanValue();
        }
        if (!(recyclerView instanceof ParentRecyclerView) || (nestedScrollChild = ((ParentRecyclerView) recyclerView).getNestedScrollChild()) == null) {
            return false;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt == nestedScrollChild && (childAt.getTop() > 0 || childAt.getBottom() < recyclerView.getHeight())) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(RecyclerView recyclerView, int i, int i2, boolean z) {
        ParentRecyclerView parentRecyclerView;
        jrj nestedScrollChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a891aeab", new Object[]{recyclerView, new Integer(i), new Integer(i2), new Boolean(z)})).booleanValue();
        }
        if (!((recyclerView instanceof ParentRecyclerView) && (nestedScrollChild = (parentRecyclerView = (ParentRecyclerView) recyclerView).getNestedScrollChild()) != null && i - i2 == 0)) {
            return false;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            if (childAt == nestedScrollChild && (childAt.getTop() > 0 || childAt.getBottom() < recyclerView.getHeight() || ((z && childAt.getTop() <= 0 && childAt.getBottom() >= recyclerView.getHeight()) || parentRecyclerView.acceptNestedScroll(i)))) {
                nestedScrollChild.onScrolledByNestedParent(parentRecyclerView);
                return true;
            }
        }
        return false;
    }

    public static int c(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3c01a1c", new Object[]{recyclerView, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 != 0 && (recyclerView instanceof t4d)) {
            ((t4d) recyclerView).onDisabledDirection(0);
        }
        int i3 = i - i2;
        if (i3 != 0 && (recyclerView instanceof t4d)) {
            t4d t4dVar = (t4d) recyclerView;
            t4dVar.onDisabledDirection(i);
            t4dVar.onReachedEdge(i3, 0);
        }
        return i3;
    }
}
