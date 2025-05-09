package com.taobao.android.searchbaseframe.business.srp.list.uikit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.MotionEventCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.SmoothRecyclerScrollFeature;
import com.taobao.uikit.feature.view.TRecyclerView;
import tb.c4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PartnerRecyclerView extends TRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PartnerRecyclerView";
    private boolean cancelTouch;
    private boolean disableScrollListener;
    private int mAccumulated;
    private View mBlankView;
    private Path mClipPath;
    private int mDrawOffset;
    private float mExposeFactor;
    private boolean mFirstScrollChanged;
    private boolean mFixConfiged;
    private boolean mFixPagingProblem;
    private boolean mFixTrigger;
    private float mFlingFactor;
    private FrameLayout mFooterFrame;
    private FrameLayout mHeaderFrame;
    private boolean mHeaderFrameAdded;
    private boolean mIsScrolling;
    private boolean mIsTabOut;
    private b mLayoutCompleteListener;
    private a mListEventListener;
    private int mPreRequestCellThreshold;
    private boolean mScrollDown;
    private int mScrollSpeed;
    private boolean mStopWhenCantScroll;
    private int[] mTmpArray;
    private int mTopRadius;
    private int mTotalScrollY;
    private float mTouchRawX;
    private float mTouchRawY;
    private int mTriggerScrollDistance;
    private boolean mUsingBlank;
    private boolean mUsingHeader;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void B0(int i);

        void U(int i);

        void a();

        void c1();

        void m0();

        void q1();

        void r();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a();
    }

    static {
        t2o.a(993001668);
    }

    public PartnerRecyclerView(Context context) {
        super(context);
        this.mAccumulated = 0;
        this.mIsScrolling = false;
        this.mTmpArray = new int[2];
        this.mPreRequestCellThreshold = 0;
        this.mFixPagingProblem = false;
        this.mFixConfiged = false;
        this.mIsTabOut = false;
        this.mFlingFactor = 1.0f;
        this.mExposeFactor = 0.0f;
        this.mUsingHeader = true;
        this.mScrollDown = true;
        this.mScrollSpeed = 0;
        this.mStopWhenCantScroll = false;
        this.mDrawOffset = 0;
        this.mTopRadius = 0;
        this.mClipPath = null;
        this.mHeaderFrameAdded = true;
        this.mFixTrigger = false;
        this.mFirstScrollChanged = false;
        this.cancelTouch = false;
        init(true);
    }

    private void init(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcf041d", new Object[]{this, new Boolean(z)});
            return;
        }
        setRecycledViewPool(new XSRecyclerPool());
        this.mUsingBlank = z;
        if (z) {
            View view = new View(getContext());
            this.mBlankView = view;
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
            this.mBlankView.setId(R.id.libsf_srp_list_blank);
            super.addHeaderView(this.mBlankView);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.mHeaderFrame = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.mHeaderFrame.setId(R.id.libsf_srp_list_header_container);
        super.addHeaderView(this.mHeaderFrame);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.mFooterFrame = frameLayout2;
        frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.mFooterFrame.setId(R.id.libsf_srp_list_footer_container);
        super.addFooterView(this.mFooterFrame);
        try {
            addFeature(new SmoothRecyclerScrollFeature());
        } catch (Throwable unused) {
            c4p.p(TAG, "No SmoothRecyclerScrollFeature for TRecyclerView");
        }
    }

    public static /* synthetic */ Object ipc$super(PartnerRecyclerView partnerRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -548846230:
                super.addFooterView((View) objArr[0]);
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1502646584:
                super.addHeaderView((View) objArr[0]);
                return null;
            case 1659846701:
                super.onScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            case 1852077959:
                return new Boolean(super.fling(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
            case 1893018130:
                super.onScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1943919033:
                return new Boolean(partnerRecyclerView.removeHeaderView((View) objArr[0]));
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/business/srp/list/uikit/PartnerRecyclerView");
        }
    }

    private void updatePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5f1215", new Object[]{this});
        } else if (this.mTopRadius == 0 && this.mDrawOffset == 0) {
            this.mClipPath = null;
        } else if (getWidth() != 0 && getHeight() != 0) {
            Path path = this.mClipPath;
            if (path == null) {
                this.mClipPath = new Path();
            } else {
                path.reset();
            }
            if (this.mTopRadius != 0) {
                Path path2 = this.mClipPath;
                RectF rectF = new RectF(0.0f, this.mDrawOffset, getWidth(), getHeight());
                int i = this.mTopRadius;
                path2.addRoundRect(rectF, new float[]{i, i, i, i, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
                return;
            }
            this.mClipPath.addRect(new RectF(0.0f, this.mDrawOffset, getWidth(), getHeight()), Path.Direction.CW);
        }
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView
    public void addFooterView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df49456a", new Object[]{this, view});
        } else {
            this.mFooterFrame.addView(view);
        }
    }

    public void addHeaderFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fca94486", new Object[]{this});
        } else if (!this.mHeaderFrameAdded) {
            super.addHeaderView(this.mHeaderFrame);
            this.mHeaderFrameAdded = true;
        }
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView
    public void addHeaderView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59909138", new Object[]{this, view});
        } else {
            this.mHeaderFrame.addView(view);
        }
    }

    public void backToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e79b3a", new Object[]{this});
        } else {
            scrollToPosition(0);
        }
    }

    public void cancelTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252846ec", new Object[]{this});
        } else {
            this.cancelTouch = true;
        }
    }

    public void disableScrollFeature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d24d68", new Object[]{this});
        } else {
            removeFeature(SmoothRecyclerScrollFeature.class);
        }
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getActionMasked() == 0) {
            this.cancelTouch = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        if (this.mClipPath != null) {
            canvas.save();
            canvas.clipPath(this.mClipPath);
        }
        super.draw(canvas);
        if (this.mClipPath != null) {
            canvas.restore();
        }
    }

    public int findCompletelyLastVisibleItemPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53b95253", new Object[]{this})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return -1;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        int spanCount = staggeredGridLayoutManager.getSpanCount();
        if (spanCount >= this.mTmpArray.length) {
            this.mTmpArray = new int[spanCount];
        }
        staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(this.mTmpArray);
        int[] iArr = this.mTmpArray;
        if (iArr == null || iArr.length <= 0) {
            return -1;
        }
        int i = Integer.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 != -1 && i2 > i) {
                i = i2;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cd99b4b", new Object[]{this})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return -1;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        int spanCount = staggeredGridLayoutManager.getSpanCount();
        if (spanCount >= this.mTmpArray.length) {
            this.mTmpArray = new int[spanCount];
        }
        staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(this.mTmpArray);
        int[] iArr = this.mTmpArray;
        if (iArr == null || iArr.length <= 0) {
            return -1;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 : iArr) {
            if (i2 != -1 && i2 < i) {
                i = i2;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }

    public int findFirstPartlyVisibleItemPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85b9a51", new Object[]{this})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return -1;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        int spanCount = staggeredGridLayoutManager.getSpanCount();
        if (spanCount >= this.mTmpArray.length) {
            this.mTmpArray = new int[spanCount];
        }
        staggeredGridLayoutManager.findFirstVisibleItemPositions(this.mTmpArray);
        int[] iArr = this.mTmpArray;
        if (iArr == null || iArr.length <= 0) {
            return -1;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 : iArr) {
            if (i2 != -1 && i2 < i) {
                i = i2;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }

    public int findPartlyLastVisibleItemPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9b60d59", new Object[]{this})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return -1;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        int spanCount = staggeredGridLayoutManager.getSpanCount();
        if (spanCount >= this.mTmpArray.length) {
            this.mTmpArray = new int[spanCount];
        }
        staggeredGridLayoutManager.findLastVisibleItemPositions(this.mTmpArray);
        int[] iArr = this.mTmpArray;
        if (iArr == null || iArr.length <= 0) {
            return -1;
        }
        int i = Integer.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 != -1 && i2 > i) {
                i = i2;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e647787", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int i3 = (int) (i2 * this.mFlingFactor);
        if (!this.mStopWhenCantScroll || i3 <= 0 || canScrollVertically(i3)) {
            return super.fling(i, i3);
        }
        stopScroll();
        return false;
    }

    public int getBlankHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d17d05f", new Object[]{this})).intValue();
        }
        return this.mBlankView.getHeight();
    }

    public View getBlankView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("73a8942c", new Object[]{this});
        }
        return this.mBlankView;
    }

    public int getBlankVisibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eddb65ca", new Object[]{this})).intValue();
        }
        View view = this.mBlankView;
        if (view == null) {
            return 8;
        }
        return view.getVisibility();
    }

    public Path getClipPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("f3e86dba", new Object[]{this});
        }
        return this.mClipPath;
    }

    public void getCurrentDisplayedPositions(int i, SparseArrayCompat<Boolean> sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c1d941", new Object[]{this, new Integer(i), sparseArrayCompat});
        } else {
            getCurrentDisplayedPositions(0, i, sparseArrayCompat);
        }
    }

    public FrameLayout getFooterFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ba7fe916", new Object[]{this});
        }
        return this.mFooterFrame;
    }

    public FrameLayout getHeaderFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f7560508", new Object[]{this});
        }
        return this.mHeaderFrame;
    }

    public int getLeadingItemOffset() {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d93189f0", new Object[]{this})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || (childAt = layoutManager.getChildAt(0)) == null || layoutManager.getPosition(childAt) != 0) {
            return Integer.MAX_VALUE;
        }
        return childAt.getTop();
    }

    public int getPreRequestCellThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("686adee1", new Object[]{this})).intValue();
        }
        return this.mPreRequestCellThreshold;
    }

    public int getScrollSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c076abe", new Object[]{this})).intValue();
        }
        return this.mScrollSpeed;
    }

    public int getTopRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccbccb8b", new Object[]{this})).intValue();
        }
        return this.mTopRadius;
    }

    public int getTotalScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2555b7e8", new Object[]{this})).intValue();
        }
        return this.mTotalScrollY;
    }

    public void goToBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f5a315", new Object[]{this});
        } else {
            scrollToPosition(getAdapter().getItemCount() - 1);
        }
    }

    public void invalidateScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7e6da2", new Object[]{this});
            return;
        }
        int leadingItemOffset = getLeadingItemOffset();
        if (leadingItemOffset == Integer.MAX_VALUE || leadingItemOffset < (-this.mTriggerScrollDistance)) {
            a aVar = this.mListEventListener;
            if (aVar != null) {
                aVar.U(leadingItemOffset);
                return;
            }
            return;
        }
        a aVar2 = this.mListEventListener;
        if (aVar2 != null) {
            aVar2.c1();
        }
    }

    public boolean isScrollDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4af03de4", new Object[]{this})).booleanValue();
        }
        return this.mScrollDown;
    }

    public boolean isScrolling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad3ffaf6", new Object[]{this})).booleanValue();
        }
        return this.mIsScrolling;
    }

    public void notifyLayoutComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d24bc4b3", new Object[]{this});
            return;
        }
        b bVar = this.mLayoutCompleteListener;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (MotionEventCompat.getActionMasked(motionEvent) == 0) {
            this.mAccumulated = 0;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.mFirstScrollChanged) {
            this.mFirstScrollChanged = false;
        } else {
            super.onScrollChanged(i, i2, i3, i4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(i);
        if (!this.disableScrollListener) {
            int findCompletelyLastVisibleItemPosition = findCompletelyLastVisibleItemPosition();
            if (i == 1) {
                this.mIsScrolling = true;
                a aVar2 = this.mListEventListener;
                if (aVar2 != null) {
                    aVar2.a();
                }
            } else if (i == 0) {
                this.mIsScrolling = false;
                this.mAccumulated = 0;
                if (findCompletelyLastVisibleItemPosition >= (getLayoutManager().getItemCount() - this.mPreRequestCellThreshold) - 2 && (aVar = this.mListEventListener) != null) {
                    aVar.q1();
                }
                a aVar3 = this.mListEventListener;
                if (aVar3 != null) {
                    aVar3.r();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d52a12", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(i, i2);
        if (!this.disableScrollListener) {
            if (i2 != 0) {
                if (i2 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.mScrollDown = z;
            }
            this.mScrollSpeed = Math.abs(i2);
            a aVar = this.mListEventListener;
            if (aVar != null) {
                aVar.m0();
            }
            int i3 = this.mTotalScrollY + i2;
            this.mTotalScrollY = i3;
            int i4 = -1;
            if (i3 <= 0) {
                this.mTotalScrollY = 0;
            } else if (!canScrollVertically(-1)) {
                this.mTotalScrollY = 0;
            }
            this.mAccumulated += i2;
            int findCompletelyLastVisibleItemPosition = findCompletelyLastVisibleItemPosition();
            if (findCompletelyLastVisibleItemPosition < 0) {
                findCompletelyLastVisibleItemPosition = -1;
            }
            int leadingItemOffset = getLeadingItemOffset();
            if (!this.mFixTrigger || getScrollState() != 0) {
                if (leadingItemOffset == Integer.MAX_VALUE || leadingItemOffset < (-this.mTriggerScrollDistance)) {
                    a aVar2 = this.mListEventListener;
                    if (aVar2 != null) {
                        aVar2.U(leadingItemOffset);
                    }
                } else {
                    a aVar3 = this.mListEventListener;
                    if (aVar3 != null) {
                        aVar3.c1();
                    }
                }
            }
            if (this.mListEventListener != null) {
                int itemCount = getAdapter().getItemCount();
                int headerViewsCount = findCompletelyLastVisibleItemPosition - getHeaderViewsCount();
                if (findCompletelyLastVisibleItemPosition >= itemCount - getFooterViewsCount()) {
                    headerViewsCount = ((itemCount - getFooterViewsCount()) - getHeaderViewsCount()) - 1;
                }
                if (headerViewsCount >= -1) {
                    i4 = headerViewsCount;
                }
                this.mListEventListener.B0(i4);
            }
            if (this.mFixPagingProblem && !canScrollVertically(1)) {
                stopScroll();
            }
            if (this.mStopWhenCantScroll && i2 > 0 && !canScrollVertically(i2)) {
                stopScroll();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        updatePath();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r2 != 2) goto L_0x0038;
     */
    @Override // com.taobao.uikit.feature.view.TRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 2
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "a9b14c3a"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            r0 = 1
            r1[r0] = r5
            java.lang.Object r5 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x001c:
            boolean r2 = r4.cancelTouch
            if (r2 == 0) goto L_0x0021
            return r0
        L_0x0021:
            int r2 = androidx.core.view.MotionEventCompat.getActionMasked(r5)
            if (r2 == 0) goto L_0x002a
            if (r2 == r1) goto L_0x002c
            goto L_0x0038
        L_0x002a:
            r4.mAccumulated = r0
        L_0x002c:
            float r1 = r5.getRawX()
            r4.mTouchRawX = r1
            float r1 = r5.getRawY()
            r4.mTouchRawY = r1
        L_0x0038:
            boolean r5 = super.onTouchEvent(r5)     // Catch: Exception -> 0x003d
            return r5
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removeHeaderFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa9a243", new Object[]{this});
        } else if (this.mHeaderFrameAdded) {
            removeHeaderView(this.mHeaderFrame);
            this.mHeaderFrameAdded = false;
        }
    }

    public void restrainFirstScrollChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("603f012c", new Object[]{this});
        } else {
            this.mFirstScrollChanged = true;
        }
    }

    public void setBlankHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9df4523", new Object[]{this, new Integer(i)});
        } else if (this.mUsingBlank) {
            ViewGroup.LayoutParams layoutParams = this.mBlankView.getLayoutParams();
            if (i <= 0) {
                i = 1;
            }
            if (i != layoutParams.height) {
                layoutParams.height = i;
                this.mBlankView.setLayoutParams(layoutParams);
            }
        }
    }

    public void setBlankViewVisibility(int i) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8102beb3", new Object[]{this, new Integer(i)});
        } else if (this.mUsingBlank && (view = this.mBlankView) != null) {
            view.setVisibility(i);
        }
    }

    public DefaultItemAnimator setDefaultAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultItemAnimator) ipChange.ipc$dispatch("236aef43", new Object[]{this});
        }
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() { // from class: com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == 1817284429) {
                    super.onMoveFinished((RecyclerView.ViewHolder) objArr[0]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/business/srp/list/uikit/PartnerRecyclerView$1");
            }

            @Override // androidx.recyclerview.widget.SimpleItemAnimator
            public void onMoveFinished(RecyclerView.ViewHolder viewHolder) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6c518f4d", new Object[]{this, viewHolder});
                    return;
                }
                super.onMoveFinished(viewHolder);
                PartnerRecyclerView partnerRecyclerView = PartnerRecyclerView.this;
                partnerRecyclerView.onScrollChanged(partnerRecyclerView.getScrollX(), PartnerRecyclerView.this.getScrollY(), PartnerRecyclerView.this.getScrollX(), PartnerRecyclerView.this.getScrollY());
            }
        };
        setItemAnimator(defaultItemAnimator);
        return defaultItemAnimator;
    }

    public void setDrawOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698fb203", new Object[]{this, new Integer(i)});
        } else if (this.mDrawOffset != i) {
            this.mDrawOffset = i;
            updatePath();
            invalidate();
        }
    }

    public void setExposeFactor(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f1dd984", new Object[]{this, new Float(f)});
        } else {
            this.mExposeFactor = f;
        }
    }

    public void setFixPagingProblem(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba6c134d", new Object[]{this, new Boolean(z)});
        } else if (!this.mFixConfiged) {
            this.mFixConfiged = true;
            this.mFixPagingProblem = z;
        }
    }

    public void setFixTrigger(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77641068", new Object[]{this, new Boolean(z)});
        } else {
            this.mFixTrigger = z;
        }
    }

    public void setFlingFactor(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b115d9b0", new Object[]{this, new Float(f)});
        } else {
            this.mFlingFactor = f;
        }
    }

    public void setLayoutCompleteListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792e6374", new Object[]{this, bVar});
        } else {
            this.mLayoutCompleteListener = bVar;
        }
    }

    public void setListEventListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15113a2b", new Object[]{this, aVar});
        } else {
            this.mListEventListener = aVar;
        }
    }

    public void setPreRequestCellThreshold(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdad4e1", new Object[]{this, new Integer(i)});
        } else {
            this.mPreRequestCellThreshold = i;
        }
    }

    public void setScrollListenerEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbe33cf", new Object[]{this, new Boolean(z)});
        } else {
            this.disableScrollListener = !z;
        }
    }

    public void setStopWhenCantScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a009a7e", new Object[]{this, new Boolean(z)});
        } else {
            this.mStopWhenCantScroll = z;
        }
    }

    public void setTopRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d38277", new Object[]{this, new Integer(i)});
        } else if (this.mTopRadius != i) {
            this.mTopRadius = i;
            updatePath();
            invalidate();
        }
    }

    public void setTotalScrollOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a555ba", new Object[]{this, new Integer(i)});
        } else {
            this.mTotalScrollY = i;
        }
    }

    public void setTriggerScrollDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c2cbe4", new Object[]{this, new Integer(i)});
        } else {
            this.mTriggerScrollDistance = i;
        }
    }

    public void getCurrentDisplayedPositions(int i, int i2, SparseArrayCompat<Boolean> sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e335163e", new Object[]{this, new Integer(i), new Integer(i2), sparseArrayCompat});
            return;
        }
        sparseArrayCompat.clear();
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        int childCount = layoutManager.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = layoutManager.getChildAt(i3);
            int position = layoutManager.getPosition(childAt);
            int headerViewsCount = getHeaderViewsCount();
            if (position >= headerViewsCount && position < layoutManager.getItemCount() - getFooterViewsCount()) {
                int i4 = position - headerViewsCount;
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                float height = childAt.getHeight();
                float f = this.mExposeFactor;
                if (top + (height * f) < i2 && bottom - (height * f) > i) {
                    sparseArrayCompat.put(i4, Boolean.TRUE);
                }
            }
        }
    }

    public PartnerRecyclerView(Context context, boolean z) {
        super(context);
        this.mAccumulated = 0;
        this.mIsScrolling = false;
        this.mTmpArray = new int[2];
        this.mPreRequestCellThreshold = 0;
        this.mFixPagingProblem = false;
        this.mFixConfiged = false;
        this.mIsTabOut = false;
        this.mFlingFactor = 1.0f;
        this.mExposeFactor = 0.0f;
        this.mUsingHeader = true;
        this.mScrollDown = true;
        this.mScrollSpeed = 0;
        this.mStopWhenCantScroll = false;
        this.mDrawOffset = 0;
        this.mTopRadius = 0;
        this.mClipPath = null;
        this.mHeaderFrameAdded = true;
        this.mFixTrigger = false;
        this.mFirstScrollChanged = false;
        this.cancelTouch = false;
        init(z);
    }

    public PartnerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAccumulated = 0;
        this.mIsScrolling = false;
        this.mTmpArray = new int[2];
        this.mPreRequestCellThreshold = 0;
        this.mFixPagingProblem = false;
        this.mFixConfiged = false;
        this.mIsTabOut = false;
        this.mFlingFactor = 1.0f;
        this.mExposeFactor = 0.0f;
        this.mUsingHeader = true;
        this.mScrollDown = true;
        this.mScrollSpeed = 0;
        this.mStopWhenCantScroll = false;
        this.mDrawOffset = 0;
        this.mTopRadius = 0;
        this.mClipPath = null;
        this.mHeaderFrameAdded = true;
        this.mFixTrigger = false;
        this.mFirstScrollChanged = false;
        this.cancelTouch = false;
        init(true);
    }

    public PartnerRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAccumulated = 0;
        this.mIsScrolling = false;
        this.mTmpArray = new int[2];
        this.mPreRequestCellThreshold = 0;
        this.mFixPagingProblem = false;
        this.mFixConfiged = false;
        this.mIsTabOut = false;
        this.mFlingFactor = 1.0f;
        this.mExposeFactor = 0.0f;
        this.mUsingHeader = true;
        this.mScrollDown = true;
        this.mScrollSpeed = 0;
        this.mStopWhenCantScroll = false;
        this.mDrawOffset = 0;
        this.mTopRadius = 0;
        this.mClipPath = null;
        this.mHeaderFrameAdded = true;
        this.mFixTrigger = false;
        this.mFirstScrollChanged = false;
        this.cancelTouch = false;
        init(true);
    }
}
