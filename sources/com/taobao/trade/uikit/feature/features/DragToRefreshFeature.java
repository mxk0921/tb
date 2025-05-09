package com.taobao.trade.uikit.feature.features;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.trade.uikit.feature.view.TRecyclerView;
import tb.h5u;
import tb.hv;
import tb.kun;
import tb.qxo;
import tb.t2o;
import tb.t9e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DragToRefreshFeature extends hv<RecyclerView> implements h5u, t9e, qxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RecyclerView.OnScrollListener mAutoLoadScrollListener;
    private boolean mEnableNegative;
    private boolean mEnablePositive;
    private boolean mIsAuto = false;
    private int mOrientation;
    private kun mRefreshController;
    private Scroller mScroller;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
    }

    static {
        t2o.a(724566080);
        t2o.a(724566078);
        t2o.a(724566089);
        t2o.a(724566076);
    }

    public DragToRefreshFeature(Context context, int i) {
        this.mOrientation = 1;
        this.mScroller = new Scroller(context, new DecelerateInterpolator());
        this.mRefreshController = new kun(this, context, this.mScroller, i);
        this.mOrientation = i;
    }

    public static /* synthetic */ kun access$000(DragToRefreshFeature dragToRefreshFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kun) ipChange.ipc$dispatch("bbe9f9cf", new Object[]{dragToRefreshFeature});
        }
        return dragToRefreshFeature.mRefreshController;
    }

    public static /* synthetic */ int access$100(DragToRefreshFeature dragToRefreshFeature, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c46f55fb", new Object[]{dragToRefreshFeature, recyclerView})).intValue();
        }
        return dragToRefreshFeature.getSpanCount(recyclerView);
    }

    public static /* synthetic */ boolean access$200(DragToRefreshFeature dragToRefreshFeature, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adc27a77", new Object[]{dragToRefreshFeature, new Integer(i)})).booleanValue();
        }
        return dragToRefreshFeature.hasArrivedBottomEdgeOffset(i);
    }

    private void addAutoLoadScrollListener(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b300d79", new Object[]{this, recyclerView});
        } else if (this.mAutoLoadScrollListener == null) {
            RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() { // from class: com.taobao.trade.uikit.feature.features.DragToRefreshFeature.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trade/uikit/feature/features/DragToRefreshFeature$1");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView2, new Integer(i), new Integer(i2)});
                    } else if (DragToRefreshFeature.access$000(DragToRefreshFeature.this).t() && DragToRefreshFeature.access$000(DragToRefreshFeature.this).q() == 3) {
                        DragToRefreshFeature dragToRefreshFeature = DragToRefreshFeature.this;
                        if (DragToRefreshFeature.access$200(dragToRefreshFeature, DragToRefreshFeature.access$100(dragToRefreshFeature, recyclerView2))) {
                            DragToRefreshFeature.access$000(DragToRefreshFeature.this).d();
                        }
                    }
                }
            };
            this.mAutoLoadScrollListener = onScrollListener;
            recyclerView.setOnScrollListener(onScrollListener);
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean hasArrivedBottomEdgeOffset(int r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.trade.uikit.feature.features.DragToRefreshFeature.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0021
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r10)
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r0] = r9
            r10[r1] = r3
            java.lang.String r0 = "1510d052"
            java.lang.Object r10 = r2.ipc$dispatch(r0, r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L_0x0021:
            T extends android.view.View r2 = r9.mHost
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.getLayoutManager()
            boolean r3 = r9.mEnableNegative
            boolean r4 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x0044
            T extends android.view.View r4 = r9.mHost
            com.taobao.trade.uikit.feature.view.TRecyclerView r4 = (com.taobao.trade.uikit.feature.view.TRecyclerView) r4
            int r4 = r4.getTotalCount()
            int r4 = r4 - r1
            int r4 = r4 - r3
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            int r2 = r2.findLastVisibleItemPosition()
            int r2 = r2 + r10
            if (r4 > r2) goto L_0x006b
            r10 = 1
            goto L_0x006c
        L_0x0044:
            boolean r4 = r2 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r4 == 0) goto L_0x006b
            androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r2
            r4 = 0
            int[] r2 = r2.findLastVisibleItemPositions(r4)
            int r4 = r2.length
            r5 = 0
            r6 = 0
        L_0x0052:
            if (r6 >= r4) goto L_0x0069
            r7 = r2[r6]
            r8 = -1
            if (r8 == r7) goto L_0x0067
            T extends android.view.View r8 = r9.mHost
            com.taobao.trade.uikit.feature.view.TRecyclerView r8 = (com.taobao.trade.uikit.feature.view.TRecyclerView) r8
            int r8 = r8.getTotalCount()
            int r8 = r8 - r1
            int r8 = r8 - r3
            int r7 = r7 + r10
            if (r8 > r7) goto L_0x0067
            r5 = 1
        L_0x0067:
            int r6 = r6 + r1
            goto L_0x0052
        L_0x0069:
            r10 = r5
            goto L_0x006c
        L_0x006b:
            r10 = 0
        L_0x006c:
            if (r10 == 0) goto L_0x0075
            boolean r10 = r9.hasArrivedTopEdge()
            if (r10 != 0) goto L_0x0075
            r0 = 1
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.trade.uikit.feature.features.DragToRefreshFeature.hasArrivedBottomEdgeOffset(int):boolean");
    }

    public static /* synthetic */ Object ipc$super(DragToRefreshFeature dragToRefreshFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((DragToRefreshFeature) ((View) objArr[0]));
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trade/uikit/feature/features/DragToRefreshFeature");
    }

    @Override // tb.qxo
    public void afterComputeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559935ef", new Object[]{this});
        }
    }

    @Override // tb.h5u
    public void afterDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82badcd", new Object[]{this, motionEvent});
        }
    }

    public void afterOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41622bd3", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // tb.h5u
    public void afterOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35369b32", new Object[]{this, motionEvent});
        }
    }

    @Override // tb.qxo
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
            kun kunVar = this.mRefreshController;
            if (kunVar != null && (scroller = this.mScroller) != null) {
                if (this.mOrientation == 1) {
                    i = scroller.getCurrY();
                } else {
                    i = scroller.getCurrX();
                }
                kunVar.w(i, false);
                return;
            }
            return;
        }
        kun kunVar2 = this.mRefreshController;
        if (kunVar2 != null) {
            if (this.mOrientation == 1) {
                i2 = this.mScroller.getCurrY();
            } else {
                i2 = this.mScroller.getCurrX();
            }
            kunVar2.w(i2, true);
        }
        ((RecyclerView) this.mHost).invalidate();
    }

    @Override // tb.h5u
    public void beforeDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f585f570", new Object[]{this, motionEvent});
        }
    }

    public void beforeOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65ccad0", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // tb.h5u
    public void beforeOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673c1915", new Object[]{this, motionEvent});
            return;
        }
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.x(motionEvent);
        }
    }

    @Override // tb.hv
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
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            this.mEnableNegative = z;
            kunVar.k(z, i, view);
        }
    }

    public void enablePositiveDrag(boolean z, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3cb9ac", new Object[]{this, new Boolean(z), new Integer(i), view});
            return;
        }
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            this.mEnablePositive = z;
            kunVar.i(z, i, view);
        }
    }

    public int getPositiveDragDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c8cbed2", new Object[]{this})).intValue();
        }
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            return kunVar.p();
        }
        return -1;
    }

    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            return kunVar.o();
        }
        return -1;
    }

    @Override // tb.t9e
    public boolean hasArrivedBottomEdge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6cc9e66", new Object[]{this})).booleanValue();
        }
        return hasArrivedBottomEdgeOffset(0);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int, boolean] */
    /* JADX WARN: Unknown variable types count: 2 */
    @Override // tb.t9e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean hasArrivedTopEdge() {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.trade.uikit.feature.features.DragToRefreshFeature.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "a3cf15ca"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r11
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0019:
            T extends android.view.View r2 = r11.mHost
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.getLayoutManager()
            boolean r3 = r11.mEnablePositive
            boolean r4 = r11.mEnableNegative
            boolean r5 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r6 = -1
            if (r5 == 0) goto L_0x004c
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            int r5 = r2.findFirstVisibleItemPosition()
            int r2 = r2.findFirstCompletelyVisibleItemPosition()
            if (r6 == r5) goto L_0x003e
            int r3 = r5 - r3
            if (r3 > 0) goto L_0x003d
            if (r5 < r2) goto L_0x003d
            r0 = 1
        L_0x003d:
            return r0
        L_0x003e:
            T extends android.view.View r2 = r11.mHost
            com.taobao.trade.uikit.feature.view.TRecyclerView r2 = (com.taobao.trade.uikit.feature.view.TRecyclerView) r2
            int r2 = r2.getTotalCount()
            int r2 = r2 - r3
            int r2 = r2 - r4
            if (r2 != 0) goto L_0x004b
            r0 = 1
        L_0x004b:
            return r0
        L_0x004c:
            boolean r5 = r2 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r5 == 0) goto L_0x007b
            androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r2
            r5 = 0
            int[] r7 = r2.findFirstVisibleItemPositions(r5)
            int[] r2 = r2.findFirstCompletelyVisibleItemPositions(r5)
            int r5 = r7.length
            r8 = 0
        L_0x005d:
            if (r8 >= r5) goto L_0x007b
            r9 = r7[r8]
            if (r6 == r9) goto L_0x006c
            int r10 = r9 - r3
            if (r10 > 0) goto L_0x0079
            r10 = r2[r8]
            if (r9 < r10) goto L_0x0079
            return r1
        L_0x006c:
            T extends android.view.View r9 = r11.mHost
            com.taobao.trade.uikit.feature.view.TRecyclerView r9 = (com.taobao.trade.uikit.feature.view.TRecyclerView) r9
            int r9 = r9.getTotalCount()
            int r9 = r9 - r3
            int r9 = r9 - r4
            if (r9 != 0) goto L_0x0079
            return r1
        L_0x0079:
            int r8 = r8 + r1
            goto L_0x005d
        L_0x007b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.trade.uikit.feature.features.DragToRefreshFeature.hasArrivedTopEdge():boolean");
    }

    public void isHeadViewHeightContainImage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f5a750", new Object[]{this, new Boolean(z)});
            return;
        }
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.s(z);
        }
    }

    public boolean isScrollStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c167144", new Object[]{this})).booleanValue();
        }
        kun kunVar = this.mRefreshController;
        if (kunVar == null || !kunVar.t()) {
            return false;
        }
        return true;
    }

    @Override // tb.t9e
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

    @Override // tb.t9e
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
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.v();
            ((RecyclerView) this.mHost).invalidate();
        }
    }

    @Override // tb.t9e
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

    @Override // tb.t9e
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

    @Override // tb.t9e
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

    @Override // tb.t9e
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
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.H();
        }
    }

    public void setIsPositiveRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827c62d3", new Object[]{this});
            return;
        }
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.G();
        }
    }

    public void setNegativeDragAuto(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0558a93", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mRefreshController.K(z);
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
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.M(i);
        }
    }

    public void setNegativeRefreshFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af52bb6", new Object[]{this, new Boolean(z)});
        } else {
            this.mRefreshController.N(z);
        }
    }

    public void setNegativeTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e51dc9", new Object[]{this, strArr});
            return;
        }
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.O(strArr);
        }
    }

    public void setOnDragToRefreshListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f56812c0", new Object[]{this, aVar});
            return;
        }
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.I(aVar);
        }
    }

    public void setPositiveDragTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd286531", new Object[]{this, strArr});
            return;
        }
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.F(strArr);
        }
    }

    public void setPositiveRefreshBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17de8ba7", new Object[]{this, new Integer(i)});
            return;
        }
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            kunVar.D(i);
        }
    }

    public void setPositiveRefreshFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2a507a", new Object[]{this, new Boolean(z)});
        } else {
            this.mRefreshController.E(z);
        }
    }

    @Override // tb.t9e
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
        this.mRefreshController.b();
        this.mRefreshController.c();
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
        kun kunVar = this.mRefreshController;
        if (kunVar != null) {
            this.mEnablePositive = z;
            kunVar.j(z, R.string.uik_refresh_arrow, view, z2);
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
