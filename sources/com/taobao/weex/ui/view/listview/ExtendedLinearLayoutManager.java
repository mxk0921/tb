package com.taobao.weex.ui.view.listview;

import android.content.Context;
import android.graphics.PointF;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ExtendedLinearLayoutManager extends LinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private OnSmoothScrollEndListener onScrollEndListener;
    private RecyclerView.SmoothScroller smoothScroller;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnSmoothScrollEndListener {
        void onStop();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class TopSnappedSmoothScroller extends LinearSmoothScroller {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(985661758);
        }

        public TopSnappedSmoothScroller(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(TopSnappedSmoothScroller topSnappedSmoothScroller, String str, Object... objArr) {
            if (str.hashCode() == 188604040) {
                super.onStop();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/view/listview/ExtendedLinearLayoutManager$TopSnappedSmoothScroller");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public PointF computeScrollVectorForPosition(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PointF) ipChange.ipc$dispatch("d3d13928", new Object[]{this, new Integer(i)});
            }
            return ExtendedLinearLayoutManager.this.computeScrollVectorForPosition(i);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ecfe2c4b", new Object[]{this})).intValue();
            }
            return -1;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                return;
            }
            super.onStop();
            if (ExtendedLinearLayoutManager.access$000(ExtendedLinearLayoutManager.this) != null) {
                ExtendedLinearLayoutManager.access$000(ExtendedLinearLayoutManager.this).onStop();
                ExtendedLinearLayoutManager.access$002(ExtendedLinearLayoutManager.this, null);
            }
        }
    }

    static {
        t2o.a(985661756);
    }

    public ExtendedLinearLayoutManager(Context context) {
        super(context, 1, false);
    }

    public static /* synthetic */ OnSmoothScrollEndListener access$000(ExtendedLinearLayoutManager extendedLinearLayoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSmoothScrollEndListener) ipChange.ipc$dispatch("fe15a0ae", new Object[]{extendedLinearLayoutManager});
        }
        return extendedLinearLayoutManager.onScrollEndListener;
    }

    public static /* synthetic */ OnSmoothScrollEndListener access$002(ExtendedLinearLayoutManager extendedLinearLayoutManager, OnSmoothScrollEndListener onSmoothScrollEndListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSmoothScrollEndListener) ipChange.ipc$dispatch("15282e91", new Object[]{extendedLinearLayoutManager, onSmoothScrollEndListener});
        }
        extendedLinearLayoutManager.onScrollEndListener = onSmoothScrollEndListener;
        return onSmoothScrollEndListener;
    }

    public static /* synthetic */ Object ipc$super(ExtendedLinearLayoutManager extendedLinearLayoutManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1027840325) {
            super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
            return null;
        } else if (hashCode == 1951908722) {
            return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/weex/ui/view/listview/ExtendedLinearLayoutManager");
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d439945", new Object[]{this, recycler, state});
            return;
        }
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7457c372", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        try {
            return super.scrollVerticallyBy(i, recycler, state);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void setOnScrollEndListener(OnSmoothScrollEndListener onSmoothScrollEndListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f2a0ec3", new Object[]{this, onSmoothScrollEndListener});
        } else {
            this.onScrollEndListener = onSmoothScrollEndListener;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a873752a", new Object[]{this, recyclerView, state, new Integer(i)});
            return;
        }
        if (this.smoothScroller == null) {
            this.smoothScroller = new TopSnappedSmoothScroller(recyclerView.getContext());
        }
        this.smoothScroller.setTargetPosition(i);
        startSmoothScroll(this.smoothScroller);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4fda0d0", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public ExtendedLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }
}
