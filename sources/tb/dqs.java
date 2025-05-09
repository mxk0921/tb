package tb;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXButterRootView;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.view.DXNativeRecyclerView;
import com.taobao.android.dinamicx.widget.DXScrollerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dqs implements oxd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int b;

    /* renamed from: a  reason: collision with root package name */
    public int f18017a = -1;
    public int c = 0;

    static {
        t2o.a(479199621);
        t2o.a(479199620);
    }

    @Override // tb.oxd
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970a00aa", new Object[]{this})).intValue();
        }
        return this.c;
    }

    @Override // tb.oxd
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c0b4f4", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public final int e(RecyclerView.LayoutManager layoutManager, int i) {
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75059c16", new Object[]{this, layoutManager, new Integer(i)})).intValue();
        }
        int a2 = a();
        if (this.b != a2 || (findViewByPosition = layoutManager.findViewByPosition(this.f18017a)) == null) {
            return a2;
        }
        return (a2 + ((i - findViewByPosition.getWidth()) / 2)) - findViewByPosition.getLeft();
    }

    @Override // tb.oxd
    public void b(lcu lcuVar, int i) {
        DXWidgetNode flattenWidgetNode;
        RecyclerView.LayoutManager layoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8f8be17", new Object[]{this, lcuVar, new Integer(i)});
            return;
        }
        Object e = lcuVar.e("triggerView");
        if (e instanceof DXButterRootView) {
            try {
                d((DXButterRootView) e, i);
            } catch (Throwable th) {
                ub3.g("TabCenterOffsetImpl", "calculateOffsetOfNewScrollLayoutError:" + th.getMessage());
            }
        } else if ((e instanceof DXRootView) && (flattenWidgetNode = ((DXRootView) e).getFlattenWidgetNode()) != null) {
            DXWidgetNode queryWidgetNodeByUserId = flattenWidgetNode.queryWidgetNodeByUserId("tabScroller");
            if (queryWidgetNodeByUserId instanceof DXScrollerLayout) {
                View view = queryWidgetNodeByUserId.getWRView().get();
                if ((view instanceof DXNativeRecyclerView) && (layoutManager = ((DXNativeRecyclerView) view).getLayoutManager()) != null && i < layoutManager.getItemCount()) {
                    int e2 = e(layoutManager, queryWidgetNodeByUserId.getWidth());
                    this.f18017a = i;
                    View findViewByPosition = layoutManager.findViewByPosition(i);
                    int left = e2 + (findViewByPosition.getLeft() - ((queryWidgetNodeByUserId.getWidth() - findViewByPosition.getWidth()) / 2));
                    this.b = left;
                    this.c = left;
                }
            }
        }
    }

    public final void d(DXButterRootView dXButterRootView, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1198c054", new Object[]{this, dXButterRootView, new Integer(i)});
            return;
        }
        View view = dXButterRootView.getFlattenWidgetNode().queryWidgetNodeByUserId("tabScroller").getWRView().get();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                    if (viewGroup2.getChildCount() > i) {
                        View childAt2 = viewGroup2.getChildAt(i);
                        int left = childAt2.getLeft();
                        int width = childAt2.getWidth();
                        int width2 = view.getWidth();
                        int i3 = left + (width / 2);
                        int i4 = this.c;
                        int i5 = i4 - ((width2 / 2) - (i3 - i4));
                        if (i5 >= 0) {
                            i2 = i5;
                        }
                        this.f18017a = i;
                        this.b = i2;
                        this.c = i2;
                    }
                }
            }
        }
    }
}
