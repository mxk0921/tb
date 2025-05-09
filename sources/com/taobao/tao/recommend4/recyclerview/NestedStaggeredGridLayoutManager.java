package com.taobao.tao.recommend4.recyclerview;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config.InfoFlowStaggeredGridLayoutManager;
import com.taobao.tao.recommend4.manager.b;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NestedStaggeredGridLayoutManager extends InfoFlowStaggeredGridLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a g;
    public RecyclerView h;
    public boolean i;
    public boolean j;
    public boolean k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    static {
        t2o.a(729810032);
    }

    public NestedStaggeredGridLayoutManager(int i, int i2) {
        this(i, i2, null);
    }

    public static /* synthetic */ Object ipc$super(NestedStaggeredGridLayoutManager nestedStaggeredGridLayoutManager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1889771791:
                super.scrollToPositionWithOffset(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1468828374:
                super.smoothScrollToPosition((RecyclerView) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            case 274472532:
                return super.C((RecyclerView) objArr[0]);
            case 371177099:
                super.scrollToPosition(((Number) objArr[0]).intValue());
                return null;
            case 1027840325:
                super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                return null;
            case 1264382833:
                super.onItemsAdded((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case 1951908722:
                return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend4/recyclerview/NestedStaggeredGridLayoutManager");
        }
    }

    @Override // com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config.InfoFlowStaggeredGridLayoutManager
    public void D(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public final boolean F(int i) {
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

    public final void G(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        a aVar = this.g;
        if (aVar != null) {
            ((b.e) aVar).a(z, z2);
        }
    }

    public void H(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48293592", new Object[]{this, aVar});
            return;
        }
        this.g = aVar;
        G(this.i, this.j);
    }

    public final void I(boolean z, boolean z2) {
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf817255", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (this.i == z && this.j == z2) {
            z3 = false;
        }
        this.i = z;
        this.j = z2;
        if (z3) {
            G(z, z2);
        }
    }

    /* renamed from: J */
    public NestedStaggeredGridLayoutManager C(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NestedStaggeredGridLayoutManager) ipChange.ipc$dispatch("153293f", new Object[]{this, recyclerView});
        }
        super.C(recyclerView);
        this.h = recyclerView;
        return this;
    }

    public final void K(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7908db5", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            if (i == 0) {
                I(true, false);
                return;
            }
            if (i != recyclerView.getAdapter().getItemCount() - 1) {
                z = false;
            }
            I(false, z);
        }
    }

    @Override // com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config.InfoFlowStaggeredGridLayoutManager, androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5cf371", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            super.onItemsAdded(recyclerView, i, i2);
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config.InfoFlowStaggeredGridLayoutManager, androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean isDebug;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d439945", new Object[]{this, recycler, state});
            return;
        }
        try {
            super.onLayoutChildren(recycler, state);
        } finally {
            if (!isDebug) {
            }
        }
    }

    @Override // com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config.InfoFlowStaggeredGridLayoutManager, androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
            return;
        }
        K(i);
        super.scrollToPosition(i);
    }

    @Override // com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config.InfoFlowStaggeredGridLayoutManager, androidx.recyclerview.widget.StaggeredGridLayoutManager
    public void scrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5c5ef1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        K(i);
        super.scrollToPositionWithOffset(i, i2);
    }

    @Override // com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config.InfoFlowStaggeredGridLayoutManager, androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7457c372", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        if (!this.k) {
            return 0;
        }
        int scrollVerticallyBy = super.scrollVerticallyBy(i, recycler, state);
        if (scrollVerticallyBy == 0) {
            if (i > 0) {
                I(false, true);
            } else if (i < 0) {
                I(true, false);
            }
        } else if (i != 0) {
            I(F(scrollVerticallyBy), false);
        }
        return scrollVerticallyBy;
    }

    @Override // com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config.InfoFlowStaggeredGridLayoutManager, androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a873752a", new Object[]{this, recyclerView, state, new Integer(i)});
            return;
        }
        K(i);
        super.smoothScrollToPosition(recyclerView, state, i);
    }

    public NestedStaggeredGridLayoutManager(int i, int i2, com.taobao.tao.recommend4.manager.a aVar) {
        super(i, i2);
        this.i = true;
        this.j = false;
        this.k = true;
    }
}
