package tb;

import android.view.View;
import android.widget.AbsListView;
import android.widget.Adapter;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(632291375);
    }

    public static boolean a(AbsListView absListView) {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30bba26a", new Object[]{absListView})).booleanValue();
        }
        if (absListView == null) {
            return false;
        }
        Adapter adapter = absListView.getAdapter();
        if (adapter == null || adapter.isEmpty() || (absListView.getFirstVisiblePosition() <= 0 && (childAt = absListView.getChildAt(0)) != null && childAt.getTop() >= 0)) {
            return true;
        }
        return false;
    }

    public static boolean b(AbsListView absListView) {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8b48f24", new Object[]{absListView})).booleanValue();
        }
        if (absListView == null) {
            return false;
        }
        Adapter adapter = absListView.getAdapter();
        if (adapter != null && !adapter.isEmpty()) {
            int count = absListView.getCount() - 1;
            int lastVisiblePosition = absListView.getLastVisiblePosition();
            if (lastVisiblePosition < count || (childAt = absListView.getChildAt(lastVisiblePosition - absListView.getFirstVisiblePosition())) == null || childAt.getBottom() > absListView.getHeight()) {
                return false;
            }
        }
        return true;
    }
}
