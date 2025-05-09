package tb;

import android.view.View;
import android.view.ViewParent;
import android.widget.ListView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend2.view.widget.weex.AutoDispatchScrollView;
import com.taobao.tao.recommend4.manager.a;
import java.lang.ref.WeakReference;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yhx implements jee {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<a> f32105a;

    static {
        t2o.a(729810073);
        t2o.a(729808919);
        t2o.a(729809945);
    }

    public yhx(a aVar) {
        this.f32105a = new WeakReference<>(aVar);
    }

    @Override // tb.jee
    public int a(String str, int i, boolean z) {
        RecyclerView recyclerView;
        View findViewByPosition;
        int d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3422ea02", new Object[]{this, str, new Integer(i), new Boolean(z)})).intValue();
        }
        a e = e();
        if (e == null || (recyclerView = e.getRecyclerView()) == null) {
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
            if (findViewByPosition2 == null && z && (d = d(e.getRecyclerView().getAdapter(), i)) > 0) {
                return d;
            }
            if (findViewByPosition2 != null && findViewByPosition2.getLayoutParams() != null && findViewByPosition2.getMeasuredHeight() > 0 && ((StaggeredGridLayoutManager.LayoutParams) findViewByPosition2.getLayoutParams()).getSpanIndex() == spanIndex) {
                return i3;
            }
        }
        return -1;
    }

    @Override // tb.jee
    public double b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fa11477", new Object[]{this, str, new Integer(i)})).doubleValue();
        }
        return j(i);
    }

    @Override // tb.jee
    public int c(String str, int i) {
        RecyclerView recyclerView;
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abecc2c0", new Object[]{this, str, new Integer(i)})).intValue();
        }
        a e = e();
        if (e == null || (recyclerView = e.getRecyclerView()) == null) {
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

    public int d(RecyclerView.Adapter adapter, int i) {
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

    public a e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9e35f81e", new Object[]{this});
        }
        WeakReference<a> weakReference = this.f32105a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final RecyclerView f(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("a654d8a0", new Object[]{this, recyclerView});
        }
        if (recyclerView == null) {
            return null;
        }
        for (ViewParent parent = recyclerView.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RecyclerView) {
                return (RecyclerView) parent;
            }
        }
        return null;
    }

    public final ViewParent g(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("c8de74c6", new Object[]{this, recyclerView});
        }
        if (recyclerView == null) {
            return null;
        }
        for (ViewParent parent = recyclerView.getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof CoordinatorLayout) || (parent instanceof ListView) || (parent instanceof AutoDispatchScrollView)) {
                return parent;
            }
        }
        return null;
    }

    public final int h(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0bb835f", new Object[]{this, recyclerView})).intValue();
        }
        RecyclerView f = f(recyclerView);
        if (!(f instanceof RecyclerView)) {
            return i(recyclerView);
        }
        return f.getHeight();
    }

    public final int i(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c7f8e2e", new Object[]{this, recyclerView})).intValue();
        }
        ViewParent g = g(recyclerView);
        if (g == null) {
            return recyclerView.getHeight();
        }
        return ((View) g).getHeight();
    }

    public double j(int i) {
        RecyclerView recyclerView;
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99ec6901", new Object[]{this, new Integer(i)})).doubleValue();
        }
        a e = e();
        if (e == null || (recyclerView = e.getRecyclerView()) == null || (findViewByPosition = recyclerView.getLayoutManager().findViewByPosition(i)) == null || findViewByPosition.getMeasuredHeight() <= 0) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        float h = (h(recyclerView) - recyclerView.getTop()) - findViewByPosition.getTop();
        if (h <= 0.0f) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        return h / findViewByPosition.getMeasuredHeight();
    }
}
