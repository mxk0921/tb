package com.taobao.tao.recommend4.recyclerview;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nestedscroll.recyclerview.layoutmanager.InternalStaggeredGridLayoutManager;
import com.taobao.tao.recommend4.recyclerview.a;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class R4StaggeredGridLayoutManager extends InternalStaggeredGridLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a b;
    public RecyclerView c;
    public boolean d = true;
    public boolean e = false;
    public boolean f = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    static {
        t2o.a(729810035);
    }

    public R4StaggeredGridLayoutManager(int i, int i2, com.taobao.tao.recommend4.manager.a aVar) {
        super(i, i2);
    }

    public static /* synthetic */ Object ipc$super(R4StaggeredGridLayoutManager r4StaggeredGridLayoutManager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2118595250:
                return r4StaggeredGridLayoutManager.y((RecyclerView) objArr[0]);
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
            case 1264382833:
                super.onItemsAdded((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case 1951908722:
                return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend4/recyclerview/R4StaggeredGridLayoutManager");
        }
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("862a0214", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final void B(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            ((a.c) aVar).a(z, z2);
        }
    }

    public void C(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cf84f67", new Object[]{this, aVar});
            return;
        }
        this.b = aVar;
        B(this.d, this.e);
    }

    public final void D(boolean z, boolean z2) {
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf817255", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (this.d == z && this.e == z2) {
            z3 = false;
        }
        this.d = z;
        this.e = z2;
        if (z3) {
            B(z, z2);
        }
    }

    public R4StaggeredGridLayoutManager E(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R4StaggeredGridLayoutManager) ipChange.ipc$dispatch("e94aa354", new Object[]{this, recyclerView});
        }
        y(recyclerView);
        this.c = recyclerView;
        return this;
    }

    public void F(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public final void G(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7908db5", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            if (i == 0) {
                D(true, false);
                return;
            }
            if (i != recyclerView.getAdapter().getItemCount() - 1) {
                z = false;
            }
            D(false, z);
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
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

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
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

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
            return;
        }
        G(i);
        super.scrollToPosition(i);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager
    public void scrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5c5ef1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        G(i);
        super.scrollToPositionWithOffset(i, i2);
    }

    @Override // com.taobao.nestedscroll.recyclerview.layoutmanager.InternalStaggeredGridLayoutManager, androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7457c372", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        if (!this.f) {
            return 0;
        }
        int scrollVerticallyBy = super.scrollVerticallyBy(i, recycler, state);
        if (scrollVerticallyBy == 0) {
            if (i > 0) {
                D(false, true);
            } else if (i < 0) {
                D(true, false);
            }
        } else if (i != 0) {
            D(z(scrollVerticallyBy), false);
        }
        return scrollVerticallyBy;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a873752a", new Object[]{this, recyclerView, state, new Integer(i)});
            return;
        }
        G(i);
        super.smoothScrollToPosition(recyclerView, state, i);
    }

    public final boolean z(int i) {
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
}
