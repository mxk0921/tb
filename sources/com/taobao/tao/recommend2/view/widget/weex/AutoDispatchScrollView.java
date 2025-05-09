package com.taobao.tao.recommend2.view.widget.weex;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.view.refresh.wrapper.BounceRecyclerView;
import tb.bqa;
import tb.t2o;
import tb.y9n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AutoDispatchScrollView extends ScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long ACTION_DOWN_DURATION_THRESHOLD = 300;
    private static final int SCROLL_OFFSET_THRESHOLD = 0;
    public static final String TAG = "scroll_info";
    private int curActViewIndex;
    private float initActionY;
    private boolean isBugFixSwitcher;
    private boolean isCancelActionDown;
    private boolean isRecReady;
    private boolean isTransiting;
    private long lastActionDownTime;
    private float lastActionY;
    private int mAdditionalHeight;
    public RecLinearLayoutContainer mLinearLayout;
    private int mMaxVelocity;
    private int mMinVelocity;
    private Scroller mScroller;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    public int originHeight;
    private NestedScrollingParentHelper parentHelper;
    private int[] position;
    public BounceRecyclerView rv1;
    public FrameLayout rv2;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            AutoDispatchScrollView autoDispatchScrollView = AutoDispatchScrollView.this;
            BounceRecyclerView bounceRecyclerView = autoDispatchScrollView.rv1;
            if (bounceRecyclerView != null && autoDispatchScrollView.rv2 != null) {
                bounceRecyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                AutoDispatchScrollView.this.rv1.setOverScrollMode(2);
                if (AutoDispatchScrollView.this.rv2.getChildCount() != 0) {
                    if (AutoDispatchScrollView.this.rv2.getTag() == "show" && !AutoDispatchScrollView.access$200(AutoDispatchScrollView.this)) {
                        AutoDispatchScrollView.this.rv2.setOverScrollMode(2);
                        AutoDispatchScrollView autoDispatchScrollView2 = AutoDispatchScrollView.this;
                        autoDispatchScrollView2.mLinearLayout.addView(autoDispatchScrollView2.rv2, new LinearLayout.LayoutParams(-1, AutoDispatchScrollView.this.getHeight()));
                        AutoDispatchScrollView.access$202(AutoDispatchScrollView.this, true);
                    }
                    AutoDispatchScrollView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements ViewTreeObserver.OnScrollChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d815a80f", new Object[]{this});
                return;
            }
            AutoDispatchScrollView.this.getViewTreeObserver().removeOnScrollChangedListener(this);
            AutoDispatchScrollView.this.scrollTo(0, 0);
            AutoDispatchScrollView.this.setOverScrollMode(2);
            AutoDispatchScrollView.this.setVerticalScrollBarEnabled(false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            if (AutoDispatchScrollView.this.rv1.getInnerView().getTranslationY() <= 0.0f) {
                AutoDispatchScrollView.this.rv1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            ViewGroup.LayoutParams layoutParams = AutoDispatchScrollView.this.rv1.getLayoutParams();
            AutoDispatchScrollView autoDispatchScrollView = AutoDispatchScrollView.this;
            layoutParams.height = autoDispatchScrollView.originHeight + ((int) autoDispatchScrollView.rv1.getInnerView().getTranslationY());
        }
    }

    static {
        t2o.a(729809637);
    }

    public AutoDispatchScrollView(Context context) {
        super(context);
        this.mAdditionalHeight = 0;
        this.lastActionY = Float.MIN_VALUE;
        this.initActionY = Float.MIN_VALUE;
        this.lastActionDownTime = -1L;
        this.position = new int[2];
        this.isBugFixSwitcher = false;
        init(context);
    }

    public static /* synthetic */ boolean access$000(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cc258a4", new Object[]{recyclerView})).booleanValue();
        }
        return hasReachTop(recyclerView);
    }

    public static /* synthetic */ boolean access$100(AutoDispatchScrollView autoDispatchScrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("720c827e", new Object[]{autoDispatchScrollView})).booleanValue();
        }
        return autoDispatchScrollView.isTransiting;
    }

    public static /* synthetic */ boolean access$200(AutoDispatchScrollView autoDispatchScrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c7d7b9d", new Object[]{autoDispatchScrollView})).booleanValue();
        }
        return autoDispatchScrollView.isRecReady;
    }

    public static /* synthetic */ boolean access$202(AutoDispatchScrollView autoDispatchScrollView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("914a7861", new Object[]{autoDispatchScrollView, new Boolean(z)})).booleanValue();
        }
        autoDispatchScrollView.isRecReady = z;
        return z;
    }

    private void acquireVelocityTracker(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54cf501", new Object[]{this, motionEvent});
            return;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
    }

    private View getFirstOnTopView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("228cb92a", new Object[]{this});
        }
        return this.mLinearLayout.getChildAt(this.curActViewIndex);
    }

    private float getScrollDelta(MotionEvent motionEvent) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28398cc1", new Object[]{this, motionEvent})).floatValue();
        }
        float y = motionEvent.getY();
        float f2 = this.lastActionY;
        if (f2 != -2.14748365E9f) {
            f = y - f2;
        } else {
            f = 0.0f;
        }
        return getScrollY() - f;
    }

    private int getViewIndexOnTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("317dbbb9", new Object[]{this})).intValue();
        }
        int childCount = this.mLinearLayout.getChildCount();
        if (childCount == 0) {
            return -1;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = this.mLinearLayout.getChildAt(i);
            StringBuilder sb = new StringBuilder("getViewIndexOnTop getScrollY ");
            sb.append(getScrollY());
            sb.append(" get top ");
            sb.append(getTop());
            sb.append(" child scrollY ");
            sb.append(childAt.getScrollY());
            sb.append(" child top ");
            sb.append(childAt.getTop());
            if (Math.abs(getScrollY() - childAt.getTop()) <= 0) {
                new StringBuilder("getViewIndexOnTop index ").append(i);
                return i;
            }
        }
        return -1;
    }

    private static boolean hasReachBottom(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10de7a90", new Object[]{recyclerView})).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == recyclerView.getAdapter().getItemCount() - 1 || linearLayoutManager.findLastCompletelyVisibleItemPosition() == recyclerView.getChildCount() - 1) {
                return true;
            }
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            int[] findLastCompletelyVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findLastCompletelyVisibleItemPositions(null);
            int itemCount = recyclerView.getAdapter().getItemCount() - 1;
            if (findLastCompletelyVisibleItemPositions[0] == itemCount || findLastCompletelyVisibleItemPositions[1] == itemCount) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasReachTop(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889c278", new Object[]{recyclerView})).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == 0) {
                return true;
            }
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            int[] findFirstCompletelyVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPositions(null);
            if (findFirstCompletelyVisibleItemPositions.length > 0 && findFirstCompletelyVisibleItemPositions[0] == 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(AutoDispatchScrollView autoDispatchScrollView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1556944264:
                super.addView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
                return null;
            case -894236565:
                super.computeScroll();
                return null;
            case -579605410:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -572887227:
                super.addView((View) objArr[0]);
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend2/view/widget/weex/AutoDispatchScrollView");
        }
    }

    private boolean isFingerMovingDown(MotionEvent motionEvent) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bee2c43", new Object[]{this, motionEvent})).booleanValue();
        }
        float y = motionEvent.getY();
        float f2 = this.lastActionY;
        if (f2 != -2.14748365E9f) {
            f = y - f2;
        } else {
            f = 0.0f;
        }
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i > 0) {
            return true;
        }
        if (i != 0 || y >= 0.0f) {
            return false;
        }
        return true;
    }

    private boolean isFingerMovingUp(MotionEvent motionEvent) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5e3f8bc", new Object[]{this, motionEvent})).booleanValue();
        }
        float y = motionEvent.getY();
        float f2 = this.lastActionY;
        if (f2 != -2.14748365E9f) {
            f = y - f2;
        } else {
            f = 0.0f;
        }
        if (f < 0.0f) {
            return true;
        }
        if (f != 0.0f || y <= 0.0f) {
            return false;
        }
        return true;
    }

    private boolean isScrollable(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7283475e", new Object[]{this, view})).booleanValue();
        }
        BounceRecyclerView bounceRecyclerView = this.rv1;
        if (view != bounceRecyclerView || bounceRecyclerView.getHeight() - this.rv1.getInnerView().getTranslationY() >= getHeight() || !hasReachTop(this.rv1.getInnerView())) {
            return true;
        }
        return false;
    }

    private void onFling(MotionEvent motionEvent, boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39480b05", new Object[]{this, motionEvent, new Boolean(z), new Float(f)});
            return;
        }
        this.mScroller.forceFinished(true);
        if (z) {
            fling(getScrollX(), getScrollY(), 0, (int) (-f), 0, 0, 0, this.rv1.getHeight());
        } else {
            fling(getScrollX(), getScrollY(), 0, (int) (-f), 0, 0, 0, getScrollY());
        }
        invalidate();
    }

    private void releaseVelocityTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d82b1b", new Object[]{this});
            return;
        }
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void updateCurrentActivatingIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9cedab9", new Object[]{this});
            return;
        }
        int childCount = this.mLinearLayout.getChildCount();
        if (childCount != 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = this.mLinearLayout.getChildAt(i);
                if (i == 0) {
                    if (getScrollY() >= childAt.getTop() && getScrollY() < childAt.getBottom() - this.mAdditionalHeight) {
                        this.curActViewIndex = i;
                    }
                } else if (getScrollY() >= childAt.getTop() - this.mAdditionalHeight && getScrollY() < childAt.getBottom() - this.mAdditionalHeight) {
                    this.curActViewIndex = i;
                }
            }
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public void addView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
        } else if (view == this.mLinearLayout) {
            super.addView(view);
        } else {
            addView(view, (ViewGroup.LayoutParams) null);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        if (this.mScroller.computeScrollOffset()) {
            scrollTo(this.mScroller.getCurrX(), this.mScroller.getCurrY());
            postInvalidate();
        }
        super.computeScroll();
    }

    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ece263", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
        } else {
            this.mScroller.fling(i, i2, i3, i4, i5, i6, i7, i8);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.isRecReady) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        super.onInterceptTouchEvent(motionEvent);
        return false;
    }

    public void onTrackerEvent(MotionEvent motionEvent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c05dd", new Object[]{this, motionEvent});
            return;
        }
        int action = motionEvent.getAction();
        acquireVelocityTracker(motionEvent);
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (action == 0) {
            this.mScroller.abortAnimation();
        } else if (action == 1 || action == 3) {
            if (this.isTransiting) {
                velocityTracker.computeCurrentVelocity(1000, this.mMaxVelocity);
                if (Math.abs(velocityTracker.getYVelocity()) > this.mMinVelocity) {
                    if (velocityTracker.getYVelocity() >= 0.0f) {
                        z = false;
                    }
                    onFling(motionEvent, z, velocityTracker.getYVelocity());
                }
            }
            releaseVelocityTracker();
        }
    }

    public void setShowParam(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc00a9f", new Object[]{this, new Boolean(z)});
            return;
        }
        FrameLayout frameLayout = this.rv2;
        if (frameLayout != null) {
            if (z) {
                str = "show";
            } else {
                str = "";
            }
            frameLayout.setTag(str);
            postDelayed(new a(z), 200L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f12641a = false;
        public final /* synthetic */ boolean b;

        public a(boolean z) {
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BounceRecyclerView bounceRecyclerView = AutoDispatchScrollView.this.rv1;
            if (bounceRecyclerView != null && bounceRecyclerView.getInnerView() != null) {
                AutoDispatchScrollView autoDispatchScrollView = AutoDispatchScrollView.this;
                if (autoDispatchScrollView.rv2 != null) {
                    if (AutoDispatchScrollView.access$000(autoDispatchScrollView.rv1.getInnerView()) && AutoDispatchScrollView.this.getScrollY() > 0 && AutoDispatchScrollView.this.getScrollY() < AutoDispatchScrollView.this.rv2.getY()) {
                        AutoDispatchScrollView.this.scrollTo(0, 0);
                        y9n.a(AutoDispatchScrollView.TAG, "setShowParam, scrollToTop scrollY");
                    }
                    if (!AutoDispatchScrollView.access$100(AutoDispatchScrollView.this) || this.f12641a) {
                        if (this.b && AutoDispatchScrollView.this.rv2.getParent() == null) {
                            AutoDispatchScrollView.this.rv2.setOverScrollMode(2);
                            AutoDispatchScrollView autoDispatchScrollView2 = AutoDispatchScrollView.this;
                            autoDispatchScrollView2.mLinearLayout.addView(autoDispatchScrollView2.rv2, new LinearLayout.LayoutParams(-1, AutoDispatchScrollView.this.getHeight()));
                            AutoDispatchScrollView.access$202(AutoDispatchScrollView.this, true);
                        }
                        FrameLayout frameLayout = AutoDispatchScrollView.this.rv2;
                        if (!this.b) {
                            i = 8;
                        }
                        frameLayout.setVisibility(i);
                        y9n.a(AutoDispatchScrollView.TAG, "setShowParam:" + this.b);
                        return;
                    }
                    AutoDispatchScrollView.this.postDelayed(this, 100L);
                    this.f12641a = true;
                }
            }
        }
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        bqa.a(TAG, "init");
        ViewConfiguration.get(context);
        this.mMaxVelocity = ViewConfiguration.getMaximumFlingVelocity();
        this.mMinVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.mScroller = new Scroller(context);
        this.isBugFixSwitcher = true;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.parentHelper = new NestedScrollingParentHelper(this);
        if (getViewTreeObserver().isAlive()) {
            getViewTreeObserver().addOnGlobalLayoutListener(new b());
            getViewTreeObserver().addOnScrollChangedListener(new c());
        }
        this.mLinearLayout = new RecLinearLayoutContainer(getContext());
        this.mLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(this.mLinearLayout, 0);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd73ec5e", new Object[]{this, view, new Integer(i)});
        } else if (view == this.mLinearLayout) {
            super.addView(view, 0);
        } else {
            addView(view, (ViewGroup.LayoutParams) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0212  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.recommend2.view.widget.weex.AutoDispatchScrollView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a332ea78", new Object[]{this, view, layoutParams});
            return;
        }
        this.mLinearLayout.getChildCount();
        if (view instanceof LinearLayout) {
            super.addView(view, layoutParams);
        } else if (view instanceof BounceRecyclerView) {
            this.rv1 = (BounceRecyclerView) view;
            this.mLinearLayout.addView(view, new LinearLayout.LayoutParams(-1, -2));
            this.rv1.requestFocus();
        } else if (view instanceof FrameLayout) {
            this.rv2 = (FrameLayout) view;
        }
    }

    public AutoDispatchScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAdditionalHeight = 0;
        this.lastActionY = Float.MIN_VALUE;
        this.initActionY = Float.MIN_VALUE;
        this.lastActionDownTime = -1L;
        this.position = new int[2];
        this.isBugFixSwitcher = false;
        init(context);
    }

    public AutoDispatchScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAdditionalHeight = 0;
        this.lastActionY = Float.MIN_VALUE;
        this.initActionY = Float.MIN_VALUE;
        this.lastActionDownTime = -1L;
        this.position = new int[2];
        this.isBugFixSwitcher = false;
        init(context);
    }
}
