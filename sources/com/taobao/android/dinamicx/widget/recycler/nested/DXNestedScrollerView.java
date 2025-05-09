package com.taobao.android.dinamicx.widget.recycler.nested;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.RecyclerAdapter;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import tb.bi6;
import tb.eb5;
import tb.kl6;
import tb.s96;
import tb.t2o;
import tb.xv5;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXNestedScrollerView extends FrameLayout implements NestedScrollingParent2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float downY;
    private int mAxes;
    private RecyclerView mChildList;
    private a mOnScrollListener;
    private RecyclerView mRootList;
    private boolean fixVerticalScrollConflict = true;
    private int mListHeadY = 0;
    public boolean isDraggingToRefresh = false;
    private int childIndex = -1;
    private int mAction = -1;
    private SparseIntArray tabHeightMap = new SparseIntArray();
    private int stickyHeight = 0;
    private int childScrollState = 0;
    private boolean isChildReachTop = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
    }

    static {
        t2o.a(444597576);
        t2o.a(444597579);
    }

    public DXNestedScrollerView(Context context) {
        super(context);
    }

    public static /* synthetic */ void access$000(DXNestedScrollerView dXNestedScrollerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af62de3", new Object[]{dXNestedScrollerView, new Integer(i)});
        } else {
            dXNestedScrollerView.handlerRootScroll(i);
        }
    }

    private int getViewTop(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da4fe5b4", new Object[]{this, view, view2})).intValue();
        }
        if (view2 == null) {
            return Integer.MAX_VALUE;
        }
        if (view2.getParent() == view) {
            return view2.getTop();
        }
        if (view2.getParent() instanceof View) {
            return getViewTop(view, (View) view2.getParent());
        }
        return getViewTop(view, null);
    }

    private void handlerExposure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1513278", new Object[]{this});
        }
    }

    private void handlerRootScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85799c3", new Object[]{this, new Integer(i)});
        }
    }

    private void handlerScrolled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b0f1d", new Object[]{this});
        }
    }

    private void handlerScrolling(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad9fb11", new Object[]{this, viewGroup});
            return;
        }
        int i = this.mAction;
        if (i == 2) {
            if (viewGroup != null && viewGroup == this.mChildList) {
                onChildScrollStateChange(1);
            }
        } else if (i == 1 && viewGroup != null && viewGroup == this.mChildList) {
            onChildScrollStateChange(2);
        }
    }

    public static /* synthetic */ Object ipc$super(DXNestedScrollerView dXNestedScrollerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1533054272:
                return new Boolean(super.onNestedPreFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue()));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            case 2114251219:
                return new Boolean(super.onNestedFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Boolean) objArr[3]).booleanValue()));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/nested/DXNestedScrollerView");
        }
    }

    private boolean isOpenChildScrollStateChange() {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49638f17", new Object[]{this})).booleanValue();
        }
        if (eb5.k()) {
            return true;
        }
        RecyclerView recyclerView = this.mChildList;
        if (!(recyclerView instanceof DXRecyclerView)) {
            return false;
        }
        DXWidgetNode b = kl6.b((DXRecyclerView) recyclerView);
        if ((b instanceof DXRecyclerLayout) && (dXRuntimeContext = ((DXRecyclerLayout) b).getDXRuntimeContext()) != null) {
            return zg5.z4(dXRuntimeContext.c());
        }
        return false;
    }

    private boolean isReachTop(RecyclerView recyclerView) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44d8a5e8", new Object[]{this, recyclerView})).booleanValue();
        }
        if (recyclerView == null) {
            return false;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || !(adapter instanceof RecyclerAdapter)) {
            return false;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
        staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
        int i = iArr[0];
        for (int i2 = 0; i2 < layoutManager.getChildCount(); i2++) {
            View findViewByPosition = layoutManager.findViewByPosition(i2);
            DXWidgetNode item = ((RecyclerAdapter) adapter).getItem(i2);
            if (findViewByPosition != null && !(item instanceof s96)) {
                if (i > i2 || findViewByPosition.getTop() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!zg5.o4()) {
                    return z;
                }
                if (i2 == 0 && (item instanceof bi6)) {
                    if (!((bi6) item).L()) {
                        return z;
                    }
                    View D = item.getDXRuntimeContext().D();
                    if (D == null) {
                        return z;
                    }
                    ViewGroup.LayoutParams layoutParams = D.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        return z;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int measuredHeight = marginLayoutParams.topMargin + D.getMeasuredHeight() + marginLayoutParams.bottomMargin;
                    if (layoutManager.findViewByPosition(i2 + 1) != null) {
                        if (i > i2 || findViewByPosition.getTop() != measuredHeight) {
                            return false;
                        }
                        return true;
                    }
                }
                return z;
            }
        }
        if (iArr[0] == 0) {
            return true;
        }
        return false;
    }

    private void onChildScrollStateChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5a40425", new Object[]{this, new Integer(i)});
        } else if (isOpenChildScrollStateChange() && this.childScrollState != i) {
            this.childScrollState = i;
            RecyclerView recyclerView = this.mChildList;
            if (recyclerView instanceof DXRecyclerView) {
                ((DXRecyclerView) recyclerView).onScrollStateChangedExtra(i);
            }
        }
    }

    private void onParentScrolling(int i, int i2, int[] iArr) {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85b89d01", new Object[]{this, new Integer(i), new Integer(i2), iArr});
            return;
        }
        int i3 = this.stickyHeight;
        if (i == i3) {
            if (i2 > 0 && (recyclerView = this.mChildList) != null) {
                if (recyclerView.canScrollVertically(i2)) {
                    scrollBy(this.mChildList, i2);
                } else {
                    RecyclerView recyclerView2 = this.mRootList;
                    if (recyclerView2 != null) {
                        recyclerView2.stopScroll();
                    }
                    this.mChildList.stopScroll();
                }
                iArr[1] = i2;
            } else if (i2 < 0) {
                RecyclerView recyclerView3 = this.mChildList;
                if (recyclerView3 == null || isReachTop(recyclerView3)) {
                    this.isChildReachTop = true;
                    RecyclerView recyclerView4 = this.mChildList;
                    if (recyclerView4 != null) {
                        ViewCompat.stopNestedScroll(recyclerView4, 1);
                    }
                    ViewCompat.stopNestedScroll(this.mRootList, 1);
                    onChildScrollStateChange(0);
                    return;
                }
                iArr[1] = i2;
                scrollBy(this.mChildList, i2);
            } else {
                RecyclerView recyclerView5 = this.mChildList;
                if (recyclerView5 != null) {
                    ViewCompat.stopNestedScroll(recyclerView5, 1);
                }
                ViewCompat.stopNestedScroll(this.mRootList, 1);
            }
        } else if (i < i3) {
            iArr[1] = i2;
            this.mRootList.scrollBy(0, i - i3);
            this.isChildReachTop = false;
        } else {
            if (i2 > 0) {
                int i4 = i - i3;
                if (i4 < i2) {
                    if (zg5.M2()) {
                        scrollBy(this.mRootList, i4);
                        scrollBy(this.mChildList, i2 - i4);
                        iArr[1] = i2;
                    } else {
                        iArr[1] = i2 - i4;
                    }
                }
            } else if (i2 < 0 && !isReachTop(this.mChildList)) {
                if (!zg5.G2()) {
                    this.mRootList.scrollBy(0, i - this.stickyHeight);
                }
                scrollBy(this.mChildList, i2);
                iArr[1] = i2;
            }
            this.isChildReachTop = true;
        }
    }

    private void scrollBy(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea85e79", new Object[]{this, viewGroup, new Integer(i)});
            return;
        }
        if (viewGroup == this.mChildList) {
            this.isChildReachTop = false;
        }
        viewGroup.scrollBy(0, i);
        handlerScrolling(viewGroup);
        handlerExposure();
    }

    public void clearChildList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("977f1214", new Object[]{this});
        } else {
            this.mChildList = null;
        }
    }

    public void dispatchChildScrollStateChange(int i) {
        int viewTop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f72884aa", new Object[]{this, new Integer(i)});
        } else if (!isOpenChildScrollStateChange() || (viewTop = getViewTop(this.mRootList, this.mChildList)) == Integer.MAX_VALUE) {
        } else {
            if (viewTop < this.stickyHeight) {
                onChildScrollStateChange(0);
            } else {
                onChildScrollStateChange(i);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        this.mAction = motionEvent.getAction();
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getChildIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8ddeb86", new Object[]{this})).intValue();
        }
        return this.childIndex;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ae0ec59", new Object[]{this})).intValue();
        }
        return this.mAxes;
    }

    public int getStickyHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb5c1060", new Object[]{this})).intValue();
        }
        return this.stickyHeight;
    }

    public RecyclerView getmChildList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("a5788271", new Object[]{this});
        }
        return this.mChildList;
    }

    public RecyclerView getmRootList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("7611fb45", new Object[]{this});
        }
        return this.mRootList;
    }

    public boolean isChildReachTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25fbc59f", new Object[]{this})).booleanValue();
        }
        return this.isChildReachTop;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.fixVerticalScrollConflict) {
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.downY = y;
            } else if (action == 2) {
                requestDisallowInterceptTouchEvent(this.mRootList.canScrollVertically(((int) (y - this.downY)) * (-1)));
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (!this.isDraggingToRefresh) {
            handlerExposure();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e04e9d3", new Object[]{this, view, new Float(f), new Float(f2), new Boolean(z)})).booleanValue();
        }
        return super.onNestedFling(view, f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a49f72c0", new Object[]{this, view, new Float(f), new Float(f2)})).booleanValue();
        }
        return super.onNestedPreFling(view, f, f2);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int viewTop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472edc84", new Object[]{this, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
            return;
        }
        try {
            RecyclerView recyclerView = this.mChildList;
            if (recyclerView != null && (viewTop = getViewTop(this.mRootList, recyclerView)) != Integer.MAX_VALUE && view == this.mRootList) {
                onParentScrolling(viewTop, i2, iArr);
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bba3db", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else if (i2 == 0 && i4 != 0) {
            ViewCompat.stopNestedScroll(view, 1);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da61a091", new Object[]{this, view, view2, new Integer(i), new Integer(i2)});
        } else {
            this.mAxes = i;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, view, view2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i != 2 || this.mRootList == null || this.mChildList == null) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf68c3d", new Object[]{this, view, new Integer(i)});
            return;
        }
        this.mAxes = 0;
        if (i == 0) {
            handlerScrolled();
        }
        if (1 == i) {
            handlerScrolled();
        }
    }

    public void resetStickyHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e4f8c66", new Object[]{this});
        } else {
            this.stickyHeight = 0;
        }
    }

    public void setChildIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b69344", new Object[]{this, new Integer(i)});
        } else {
            this.childIndex = i;
        }
    }

    public void setChildReachTop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7156f1d1", new Object[]{this, new Boolean(z)});
        } else {
            this.isChildReachTop = z;
        }
    }

    public void setCurrentChild(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57966aeb", new Object[]{this, viewGroup});
        } else if (viewGroup != null) {
            this.mChildList = (RecyclerView) viewGroup;
        }
    }

    public void setFixVerticalScrollConflict(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d237dd25", new Object[]{this, new Boolean(z)});
        } else {
            this.fixVerticalScrollConflict = z;
        }
    }

    public void setOnScrollListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3d26be", new Object[]{this, aVar});
        }
    }

    public void setRoot(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcefbe2a", new Object[]{this, viewGroup});
            return;
        }
        RecyclerView recyclerView = (RecyclerView) viewGroup;
        this.mRootList = recyclerView;
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.dinamicx.widget.recycler.nested.DXNestedScrollerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == 1361287682) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/nested/DXNestedScrollerView$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView2, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView2, i);
                DXNestedScrollerView.access$000(DXNestedScrollerView.this, i);
            }
        });
    }

    public void setStickyHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbc7caa", new Object[]{this, new Integer(i)});
        } else {
            setStickyHeight(i, false);
        }
    }

    public void stopAllScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f77873", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.mChildList;
        if (recyclerView != null) {
            recyclerView.stopScroll();
        }
        RecyclerView recyclerView2 = this.mRootList;
        if (recyclerView2 != null) {
            recyclerView2.stopScroll();
        }
    }

    public void setStickyHeight(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bd3cb6a", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.stickyHeight <= 0 || z) {
            this.stickyHeight = i;
        }
    }

    public DXNestedScrollerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DXNestedScrollerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
