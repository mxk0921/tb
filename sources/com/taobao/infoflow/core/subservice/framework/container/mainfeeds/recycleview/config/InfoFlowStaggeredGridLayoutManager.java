package com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config;

import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.afterbuy.NestedScrollRecyclerView;
import tb.fjg;
import tb.fve;
import tb.h6c;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InfoFlowStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f10678a;
    public h6c.c e;
    public boolean b = true;
    public boolean c = true;
    public boolean d = false;
    public Parcelable f = null;

    static {
        t2o.a(486539693);
    }

    public InfoFlowStaggeredGridLayoutManager(int i, int i2) {
        super(i, i2);
        setItemPrefetchEnabled(true);
    }

    public static /* synthetic */ Object ipc$super(InfoFlowStaggeredGridLayoutManager infoFlowStaggeredGridLayoutManager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1889771791:
                super.scrollToPositionWithOffset(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1468828374:
                super.smoothScrollToPosition((RecyclerView) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            case 371177099:
                super.scrollToPosition(((Number) objArr[0]).intValue());
                return null;
            case 1027840325:
                super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                return null;
            case 1050392251:
                super.onDetachedFromWindow((RecyclerView) objArr[0], (RecyclerView.Recycler) objArr[1]);
                return null;
            case 1242672066:
                super.onAttachedToWindow((RecyclerView) objArr[0]);
                return null;
            case 1264382833:
                super.onItemsAdded((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case 1659846701:
                super.onScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            case 1951908722:
                return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/framework/container/mainfeeds/recycleview/config/InfoFlowStaggeredGridLayoutManager");
        }
    }

    public void B(h6c.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7085eead", new Object[]{this, cVar});
            return;
        }
        this.e = cVar;
        z(this.c, this.d);
    }

    public InfoFlowStaggeredGridLayoutManager C(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InfoFlowStaggeredGridLayoutManager) ipChange.ipc$dispatch("105c1e54", new Object[]{this, recyclerView});
        }
        this.f10678a = recyclerView;
        return this;
    }

    public void D(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a11abc2", new Object[]{this, recyclerView});
            return;
        }
        onRestoreInstanceState(this.f);
        super.onAttachedToWindow(recyclerView);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9bb6bb", new Object[]{this, recyclerView, recycler});
            return;
        }
        this.f = onSaveInstanceState();
        super.onDetachedFromWindow(recyclerView, recycler);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        boolean b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5cf371", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            super.onItemsAdded(recyclerView, i, i2);
        } finally {
            if (!b) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d439945", new Object[]{this, recycler, state});
            return;
        }
        try {
            super.onLayoutChildren(recycler, state);
        } finally {
            if (!b) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (getChildCount() > 0) {
                super.onScrollStateChanged(i);
            } else {
                fve.e("InfoFlowStaggeredGridLayoutManager", "childView is empty");
            }
        } catch (Throwable th) {
            fve.c("InfoFlowStaggeredGridLayoutManager", "onScrollStateChanged error: " + th.getMessage(), th);
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
            return;
        }
        E(i);
        super.scrollToPosition(i);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager
    public void scrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5c5ef1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        E(i);
        super.scrollToPositionWithOffset(i, i2);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a873752a", new Object[]{this, recyclerView, state, new Integer(i)});
            return;
        }
        E(i);
        super.smoothScrollToPosition(recyclerView, state, i);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4fda0d0", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final boolean y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5883d8dd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        View findViewByPosition = findViewByPosition(0);
        if (findViewByPosition == null || findViewByPosition.getTop() < 0 || i >= 0) {
            return false;
        }
        return true;
    }

    public final void z(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        h6c.c cVar = this.e;
        if (cVar != null) {
            cVar.n(z, z2);
        }
    }

    public final void A(boolean z, boolean z2) {
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf817255", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (this.c == z && this.d == z2) {
            z3 = false;
        }
        this.c = z;
        this.d = z2;
        if (z3) {
            z(z, z2);
        }
    }

    public final void E(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7908db5", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView recyclerView = this.f10678a;
        if (recyclerView != null) {
            if (i == 0) {
                A(true, false);
                return;
            }
            if (i != recyclerView.getAdapter().getItemCount() - 1) {
                z = false;
            }
            A(false, z);
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7457c372", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        if (!this.b) {
            return 0;
        }
        try {
            int scrollVerticallyBy = super.scrollVerticallyBy(i, recycler, state);
            if (scrollVerticallyBy == 0) {
                if (i > 0) {
                    A(false, true);
                } else if (i < 0) {
                    A(true, false);
                }
            } else if (i != 0) {
                A(y(scrollVerticallyBy), false);
            }
            RecyclerView recyclerView = this.f10678a;
            if (!(recyclerView instanceof NestedScrollRecyclerView)) {
                return scrollVerticallyBy;
            }
            fjg.b(this.f10678a, i, scrollVerticallyBy, fjg.a(recyclerView));
            if (fjg.c(this.f10678a, i, scrollVerticallyBy) != 0) {
                return 0;
            }
            return scrollVerticallyBy;
        } catch (NullPointerException e) {
            fve.c("InfoFlowStaggeredGridLayoutManager", "scrollVerticallyBy error :" + e.getMessage(), e);
            return 0;
        }
    }
}
