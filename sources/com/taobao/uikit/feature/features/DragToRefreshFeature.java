package com.taobao.uikit.feature.features;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.ScrollCallback;
import com.taobao.uikit.feature.callback.TouchEventCallback;
import com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge;
import com.taobao.uikit.feature.features.internal.pullrefresh.RefreshController;
import com.taobao.uikit.feature.view.TRecyclerView;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DragToRefreshFeature extends AbsFeature<RecyclerView> implements TouchEventCallback, IViewEdgeJudge, ScrollCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RecyclerView.OnScrollListener mAutoLoadScrollListener;
    private boolean mEnableNegative;
    private boolean mEnablePositive;
    private int[] mIntArray;
    private int[] mIntArray2;
    private boolean mIsAuto = false;
    private int mOrientation;
    private RefreshController mRefreshController;
    private Scroller mScroller;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnDragToRefreshListener {
        void onDragNegative();

        void onDragPositive();
    }

    static {
        t2o.a(931135538);
        t2o.a(931135572);
    }

    public DragToRefreshFeature(Context context, int i) {
        this.mOrientation = 1;
        this.mScroller = new Scroller(context, new DecelerateInterpolator());
        this.mRefreshController = new RefreshController(this, context, this.mScroller, i);
        this.mOrientation = i;
    }

    public static /* synthetic */ RefreshController access$000(DragToRefreshFeature dragToRefreshFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RefreshController) ipChange.ipc$dispatch("1ffa9c5d", new Object[]{dragToRefreshFeature});
        }
        return dragToRefreshFeature.mRefreshController;
    }

    public static /* synthetic */ int access$100(DragToRefreshFeature dragToRefreshFeature, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d35d966", new Object[]{dragToRefreshFeature, recyclerView})).intValue();
        }
        return dragToRefreshFeature.getSpanCount(recyclerView);
    }

    public static /* synthetic */ boolean access$200(DragToRefreshFeature dragToRefreshFeature, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e4f46e2", new Object[]{dragToRefreshFeature, new Integer(i)})).booleanValue();
        }
        return dragToRefreshFeature.hasArrivedBottomEdgeOffset(i);
    }

    private void addAutoLoadScrollListener(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b300d79", new Object[]{this, recyclerView});
        } else if (this.mAutoLoadScrollListener == null) {
            RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() { // from class: com.taobao.uikit.feature.features.DragToRefreshFeature.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/features/DragToRefreshFeature$1");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView2, new Integer(i), new Integer(i2)});
                    } else if (!(i == 0 && i2 == 0) && DragToRefreshFeature.access$000(DragToRefreshFeature.this).isScrollStop() && DragToRefreshFeature.access$000(DragToRefreshFeature.this).getState() == 3) {
                        DragToRefreshFeature dragToRefreshFeature = DragToRefreshFeature.this;
                        if (DragToRefreshFeature.access$200(dragToRefreshFeature, DragToRefreshFeature.access$100(dragToRefreshFeature, recyclerView2))) {
                            DragToRefreshFeature.access$000(DragToRefreshFeature.this).autoLoadingData();
                        }
                    }
                }
            };
            this.mAutoLoadScrollListener = onScrollListener;
            recyclerView.setOnScrollListener(onScrollListener);
        }
    }

    private void ensureIntArray(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a34441b", new Object[]{this, staggeredGridLayoutManager});
            return;
        }
        int[] iArr = this.mIntArray;
        if (iArr == null) {
            this.mIntArray = new int[staggeredGridLayoutManager.getSpanCount()];
        } else if (iArr.length < staggeredGridLayoutManager.getSpanCount()) {
            this.mIntArray = new int[staggeredGridLayoutManager.getSpanCount()];
        }
        int[] iArr2 = this.mIntArray2;
        if (iArr2 == null) {
            this.mIntArray2 = new int[staggeredGridLayoutManager.getSpanCount()];
        } else if (iArr2.length < staggeredGridLayoutManager.getSpanCount()) {
            this.mIntArray2 = new int[staggeredGridLayoutManager.getSpanCount()];
        }
    }

    private int getSpanCount(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5c31074", new Object[]{this, recyclerView})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).getSpanCount();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean hasArrivedBottomEdgeOffset(int r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.uikit.feature.features.DragToRefreshFeature.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0021
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r9)
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r0] = r8
            r9[r1] = r3
            java.lang.String r0 = "1510d052"
            java.lang.Object r9 = r2.ipc$dispatch(r0, r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L_0x0021:
            T extends android.view.View r2 = r8.mHost
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.getLayoutManager()
            boolean r3 = r8.mEnableNegative
            boolean r4 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x0044
            T extends android.view.View r4 = r8.mHost
            com.taobao.uikit.feature.view.TRecyclerView r4 = (com.taobao.uikit.feature.view.TRecyclerView) r4
            int r4 = r4.getTotalCount()
            int r4 = r4 - r1
            int r4 = r4 - r3
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            int r2 = r2.findLastVisibleItemPosition()
            int r2 = r2 + r9
            if (r4 > r2) goto L_0x0073
            r9 = 1
            goto L_0x0074
        L_0x0044:
            boolean r4 = r2 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r4 == 0) goto L_0x0073
            androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r2
            r8.ensureIntArray(r2)
            int[] r4 = r8.mIntArray
            r2.findLastVisibleItemPositions(r4)
            int r2 = r2.getSpanCount()
            r4 = 0
            r5 = 0
        L_0x0058:
            if (r5 >= r2) goto L_0x0071
            int[] r6 = r8.mIntArray
            r6 = r6[r5]
            r7 = -1
            if (r7 == r6) goto L_0x006f
            T extends android.view.View r7 = r8.mHost
            com.taobao.uikit.feature.view.TRecyclerView r7 = (com.taobao.uikit.feature.view.TRecyclerView) r7
            int r7 = r7.getTotalCount()
            int r7 = r7 - r1
            int r7 = r7 - r3
            int r6 = r6 + r9
            if (r7 > r6) goto L_0x006f
            r4 = 1
        L_0x006f:
            int r5 = r5 + r1
            goto L_0x0058
        L_0x0071:
            r9 = r4
            goto L_0x0074
        L_0x0073:
            r9 = 0
        L_0x0074:
            if (r9 == 0) goto L_0x007d
            boolean r9 = r8.hasArrivedTopEdge()
            if (r9 != 0) goto L_0x007d
            r0 = 1
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.feature.features.DragToRefreshFeature.hasArrivedBottomEdgeOffset(int):boolean");
    }

    public static /* synthetic */ Object ipc$super(DragToRefreshFeature dragToRefreshFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((DragToRefreshFeature) ((View) objArr[0]));
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/features/DragToRefreshFeature");
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void afterComputeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559935ef", new Object[]{this});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82badcd", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void afterOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41622bd3", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35369b32", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void beforeComputeScroll() {
        Scroller scroller;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c216ac", new Object[]{this});
            return;
        }
        Scroller scroller2 = this.mScroller;
        if (scroller2 == null || !scroller2.computeScrollOffset()) {
            RefreshController refreshController = this.mRefreshController;
            if (refreshController != null && (scroller = this.mScroller) != null) {
                if (this.mOrientation == 1) {
                    i = scroller.getCurrY();
                } else {
                    i = scroller.getCurrX();
                }
                refreshController.onScrollerStateChanged(i, false);
                return;
            }
            return;
        }
        RefreshController refreshController2 = this.mRefreshController;
        if (refreshController2 != null) {
            if (this.mOrientation == 1) {
                i2 = this.mScroller.getCurrY();
            } else {
                i2 = this.mScroller.getCurrX();
            }
            refreshController2.onScrollerStateChanged(i2, true);
        }
        ((RecyclerView) this.mHost).invalidate();
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f585f570", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void beforeOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65ccad0", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673c1915", new Object[]{this, motionEvent});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.onTouchEvent(motionEvent);
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        }
    }

    public void enableNegativeDrag(boolean z, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4dc0f0", new Object[]{this, new Boolean(z), new Integer(i), view});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            this.mEnableNegative = z;
            refreshController.enablePullUpRefresh(z, i, view);
        }
    }

    public void enablePositiveDrag(boolean z, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3cb9ac", new Object[]{this, new Boolean(z), new Integer(i), view});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            this.mEnablePositive = z;
            refreshController.enablePullDownRefresh(z, i, view);
        }
    }

    public int getPositiveDragDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c8cbed2", new Object[]{this})).intValue();
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            return refreshController.getPullDownDistance();
        }
        return -1;
    }

    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            return refreshController.getPullDirection();
        }
        return -1;
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public boolean hasArrivedBottomEdge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6cc9e66", new Object[]{this})).booleanValue();
        }
        return hasArrivedBottomEdgeOffset(0);
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public boolean hasArrivedTopEdge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3cf15ca", new Object[]{this})).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) this.mHost).getLayoutManager();
        T t = this.mHost;
        int childAdapterPosition = ((RecyclerView) t).getChildAdapterPosition(((RecyclerView) t).getChildAt(0));
        if (childAdapterPosition == 0) {
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                if (-1 == findFirstVisibleItemPosition || findFirstVisibleItemPosition < findFirstCompletelyVisibleItemPosition) {
                    return false;
                }
                return true;
            } else if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                return false;
            } else {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                ensureIntArray(staggeredGridLayoutManager);
                staggeredGridLayoutManager.findFirstVisibleItemPositions(this.mIntArray);
                staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(this.mIntArray2);
                int spanCount = staggeredGridLayoutManager.getSpanCount();
                for (int i = 0; i < spanCount; i++) {
                    int i2 = this.mIntArray[i];
                    if (-1 != i2 && i2 >= this.mIntArray2[i]) {
                        return true;
                    }
                }
                return false;
            }
        } else if (-1 == childAdapterPosition && (((TRecyclerView) this.mHost).getTotalCount() - (this.mEnablePositive ? 1 : 0)) - (this.mEnableNegative ? 1 : 0) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void isHeadViewHeightContainImage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f5a750", new Object[]{this, new Boolean(z)});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.isHeadViewHeightContainImage(z);
        }
    }

    public boolean isScrollStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c167144", new Object[]{this})).booleanValue();
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null || !refreshController.isScrollStop()) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void keepBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ff3697", new Object[]{this});
            return;
        }
        RecyclerView.Adapter adapter = ((RecyclerView) this.mHost).getAdapter();
        if (adapter != null) {
            ((RecyclerView) this.mHost).scrollToPosition(adapter.getItemCount());
        } else {
            ((RecyclerView) this.mHost).scrollToPosition(0);
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void keepTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad48f017", new Object[]{this});
        } else {
            ((RecyclerView) this.mHost).scrollToPosition(0);
        }
    }

    public void onDragRefreshComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e38d08", new Object[]{this});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.onRefreshComplete();
            ((RecyclerView) this.mHost).invalidate();
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void removeFooterView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9968de7", new Object[]{this, view});
            return;
        }
        T t = this.mHost;
        if (t != 0) {
            ((TRecyclerView) t).removeFooterView(view);
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void removeHeaderView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ddd9b5", new Object[]{this, view});
            return;
        }
        T t = this.mHost;
        if (t != 0) {
            ((TRecyclerView) t).removeHeaderView(view);
        }
    }

    public void setDownRefreshBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ff6e5e", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.setDownRefreshBackgroundColor(i);
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void setFooterView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44903dc9", new Object[]{this, view});
            return;
        }
        T t = this.mHost;
        if (t != 0) {
            ((TRecyclerView) t).addFooterView(view);
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void setHeadView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1754f9e4", new Object[]{this, view});
            return;
        }
        T t = this.mHost;
        if (t != 0) {
            ((TRecyclerView) t).addHeaderView(view);
        }
    }

    public void setIsNegativeRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae8e3c0f", new Object[]{this});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.setIsUpRefreshing();
        }
    }

    public void setIsPositiveRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827c62d3", new Object[]{this});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.setIsDownRefreshing();
        }
    }

    public void setNegativeDragAuto(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0558a93", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mRefreshController.setPullUpRefreshAuto(z);
        this.mIsAuto = z;
        if (getHost() == null) {
            return;
        }
        if (z) {
            addAutoLoadScrollListener(getHost());
        } else if (this.mAutoLoadScrollListener != null) {
            ((TRecyclerView) getHost()).removeOnScrollListener(this.mAutoLoadScrollListener);
            this.mAutoLoadScrollListener = null;
        }
    }

    public void setNegativeRefreshBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf5093eb", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.setUpRefreshBackgroundColor(i);
        }
    }

    public void setNegativeRefreshFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af52bb6", new Object[]{this, new Boolean(z)});
        } else {
            this.mRefreshController.setUpRefreshFinish(z);
        }
    }

    public void setNegativeTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e51dc9", new Object[]{this, strArr});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.setUpRefreshTips(strArr);
        }
    }

    public void setOnDragToRefreshListener(OnDragToRefreshListener onDragToRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b41bb5", new Object[]{this, onDragToRefreshListener});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.setOnRefreshListener(onDragToRefreshListener);
        }
    }

    public void setPositiveDragTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd286531", new Object[]{this, strArr});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.setDownRefreshTips(strArr);
        }
    }

    public void setPositiveRefreshBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17de8ba7", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.setDownRefreshBackgroundColor(i);
        }
    }

    public void setPositiveRefreshFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2a507a", new Object[]{this, new Boolean(z)});
        } else {
            this.mRefreshController.setDownRefreshFinish(z);
        }
    }

    public void setRefreshViewColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bd8ad7", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.setRefreshViewColor(i);
        }
    }

    public void setUpRefreshBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead3c845", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            refreshController.setUpRefreshBackgroundColor(i);
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void trigger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7573e3f", new Object[]{this});
        } else {
            ((RecyclerView) this.mHost).computeScroll();
        }
    }

    public void setHost(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1561b26", new Object[]{this, recyclerView});
            return;
        }
        super.setHost((DragToRefreshFeature) recyclerView);
        this.mRefreshController.addFooterView();
        this.mRefreshController.addHeaderView();
        recyclerView.setOverScrollMode(2);
        if (this.mIsAuto) {
            addAutoLoadScrollListener(recyclerView);
        }
    }

    public void enableNegativeDrag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ae2281", new Object[]{this, new Boolean(z)});
        } else {
            enableNegativeDrag(z, R.string.uik_refresh_arrow, null);
        }
    }

    public void enablePositiveDrag(boolean z, View view, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("664e4ff", new Object[]{this, new Boolean(z), view, new Boolean(z2)});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController != null) {
            this.mEnablePositive = z;
            refreshController.enablePullDownRefresh(z, R.string.uik_refresh_arrow, view, z2);
        }
    }

    public void enablePositiveDrag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aebd13d", new Object[]{this, new Boolean(z)});
        } else {
            enablePositiveDrag(z, R.string.uik_refresh_arrow, (View) null);
        }
    }
}
