package com.taobao.android.dinamicx.widget.recycler.refresh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.WaterfallLayout;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBLoadMoreFooter;
import com.taobao.taobao.R;
import tb.nb6;
import tb.s56;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBSwipeRefreshLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANIMATE_TO_BOTTOM_DURATION = 300;
    private static final int ANIMATE_TO_START_DURATION = 300;
    private static final int ANIMATE_TO_TRIGGER_DURATION = 300;
    private static final float DECELERATE_INTERPOLATION_FACTOR = 2.0f;
    private static final float DRAG_RATE = 1.0f;
    private static final int INVALID_POINTER = -1;
    private static final String TAG = "TBSwipeRefreshLayout";
    private int mActivePointerId;
    private long mAutoRefreshDuration;
    private int mContentHeight;
    public int mCurrentTargetOffsetTop;
    private DecelerateInterpolator mDecelerateInterpolator;
    public float mDensity;
    public DisplayMetrics mDisplayMetrics;
    private int mDistance;
    private float mDragRate;
    private boolean mEnableTargetOffset;
    private TBLoadMoreFooter mFooterView;
    public int mFooterViewHeight;
    private int mFooterViewIndex;
    public int mFooterViewWidth;
    public int mFrom;
    private TBAbsRefreshHeader mHeaderView;
    public int mHeaderViewHeight;
    private int mHeaderViewIndex;
    public int mHeaderViewWidth;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    private boolean mIsMultiPointer;
    private float mLastMotionY;
    private boolean mLazyLoadMoreEnable;
    private boolean mLazyPullRefreshEnable;
    private boolean mLoadMoreEnabled;
    private boolean mLoadingMore;
    private int mMaxPullDistance;
    private int mMaxPushDistance;
    private int mNavigationBarHeight;
    private boolean mNotify;
    private i mOnChildScrollUpCallback;
    private k mOnPushLoadMoreListener;
    private boolean mOriginalOffsetCalculated;
    public int mOriginalOffsetTop;
    private int mPositionY;
    private int mPreActivePointerId;
    private int mPreDistance;
    private int mPrePositionY;
    private boolean mPullRefreshEnabled;
    private j mPullRefreshListener;
    private int mPushDistance;
    private Animator.AnimatorListener mRefreshListener;
    public int mRefreshOffset;
    private boolean mRefreshing;
    private int mSecondFloorDistance;
    private boolean mSecondFloorEnabled;
    private int mStartY;
    private View mTarget;
    private boolean mTargetScrollWithLayout;
    private int mTotalDragDistance;
    public int mTouchSlop;
    private static int HEADER_VIEW_HEIGHT = 72;
    private static int FOOTER_VIEW_HEIGHT = 50;
    private static int FOOTER_VIEW_MAX_HEIGHT = 100;
    private static int MIN_GAP_DISTANCE_TO_SECOND_FLOOR = 20;
    private static final int[] LAYOUT_ATTRS = {R.attr.uik_swipeRefreshPullRefresh, R.attr.uik_swipeRefreshPushLoad, R.attr.uik_swipeRefreshSecondFloor, R.attr.uik_swipeRefreshHeaderHeight, R.attr.uik_swipeRefreshFooterHeight, R.attr.uik_swipeRefreshLazyPullRefresh, R.attr.uik_swipeRefreshLazyPushLoad};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (TBSwipeRefreshLayout.access$000(TBSwipeRefreshLayout.this) != null) {
                if (TBSwipeRefreshLayout.access$100(TBSwipeRefreshLayout.this)) {
                    if (TBSwipeRefreshLayout.access$200(TBSwipeRefreshLayout.this) && TBSwipeRefreshLayout.access$300(TBSwipeRefreshLayout.this) != null) {
                        TBSwipeRefreshLayout.access$300(TBSwipeRefreshLayout.this).onRefresh();
                    }
                    TBSwipeRefreshLayout.access$000(TBSwipeRefreshLayout.this).changeToState(TBAbsRefreshHeader.RefreshState.REFRESHING);
                } else {
                    TBSwipeRefreshLayout tBSwipeRefreshLayout = TBSwipeRefreshLayout.this;
                    TBSwipeRefreshLayout.access$400(tBSwipeRefreshLayout, tBSwipeRefreshLayout.mOriginalOffsetTop - tBSwipeRefreshLayout.mCurrentTargetOffsetTop);
                }
                TBSwipeRefreshLayout tBSwipeRefreshLayout2 = TBSwipeRefreshLayout.this;
                tBSwipeRefreshLayout2.mCurrentTargetOffsetTop = TBSwipeRefreshLayout.access$000(tBSwipeRefreshLayout2).getTop();
                TBSwipeRefreshLayout.access$500(TBSwipeRefreshLayout.this);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                TBSwipeRefreshLayout.access$000(TBSwipeRefreshLayout.this).changeToState(TBAbsRefreshHeader.RefreshState.SECOND_FLOOR_END);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TBSwipeRefreshLayout.this.setRefreshing(false);
                }
            }
        }

        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            TBSwipeRefreshLayout.access$600(TBSwipeRefreshLayout.this).onAnimationEnd(animator);
            new Handler(Looper.getMainLooper()).postDelayed(new a(), TBSwipeRefreshLayout.access$700(TBSwipeRefreshLayout.this));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            TBSwipeRefreshLayout.access$802(TBSwipeRefreshLayout.this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            TBSwipeRefreshLayout.access$900(TBSwipeRefreshLayout.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7487a;

        public e(int i) {
            this.f7487a = i;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/refresh/TBSwipeRefreshLayout$5");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (this.f7487a <= 0 || TBSwipeRefreshLayout.access$1000(TBSwipeRefreshLayout.this) == null) {
                TBSwipeRefreshLayout.access$1102(TBSwipeRefreshLayout.this, false);
                TBSwipeRefreshLayout.access$1200(TBSwipeRefreshLayout.this).changeToState(TBLoadMoreFooter.LoadMoreState.NONE);
            } else {
                TBSwipeRefreshLayout.access$1102(TBSwipeRefreshLayout.this, true);
                TBSwipeRefreshLayout.access$1200(TBSwipeRefreshLayout.this).changeToState(TBLoadMoreFooter.LoadMoreState.LOADING);
                TBSwipeRefreshLayout.access$1000(TBSwipeRefreshLayout.this).onLoadMore();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                TBSwipeRefreshLayout.access$400(TBSwipeRefreshLayout.this, ((Integer) valueAnimator.getAnimatedValue()).intValue() - TBSwipeRefreshLayout.access$000(TBSwipeRefreshLayout.this).getTop());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            TBAbsRefreshHeader access$000 = TBSwipeRefreshLayout.access$000(TBSwipeRefreshLayout.this);
            TBSwipeRefreshLayout tBSwipeRefreshLayout = TBSwipeRefreshLayout.this;
            int i = tBSwipeRefreshLayout.mFrom;
            access$000.setProgress((intValue - i) / ((tBSwipeRefreshLayout.mOriginalOffsetTop - i) * 1.0f));
            TBSwipeRefreshLayout tBSwipeRefreshLayout2 = TBSwipeRefreshLayout.this;
            TBSwipeRefreshLayout.access$400(tBSwipeRefreshLayout2, intValue - TBSwipeRefreshLayout.access$000(tBSwipeRefreshLayout2).getTop());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ValueAnimator f7490a;

        public h(ValueAnimator valueAnimator) {
            this.f7490a = valueAnimator;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                TBSwipeRefreshLayout.access$400(TBSwipeRefreshLayout.this, ((Integer) this.f7490a.getAnimatedValue()).intValue() - TBSwipeRefreshLayout.access$000(TBSwipeRefreshLayout.this).getTop());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface i {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface j {
        void a(TBAbsRefreshHeader.RefreshState refreshState, TBAbsRefreshHeader.RefreshState refreshState2);

        void onPullDistance(int i);

        void onRefresh();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface k {
        void a(TBLoadMoreFooter.LoadMoreState loadMoreState, TBLoadMoreFooter.LoadMoreState loadMoreState2);

        void onLoadMore();

        void onPushDistance(int i);
    }

    static {
        t2o.a(444597592);
    }

    public TBSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ TBAbsRefreshHeader access$000(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBAbsRefreshHeader) ipChange.ipc$dispatch("917a4834", new Object[]{tBSwipeRefreshLayout});
        }
        return tBSwipeRefreshLayout.mHeaderView;
    }

    public static /* synthetic */ boolean access$100(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28960666", new Object[]{tBSwipeRefreshLayout})).booleanValue();
        }
        return tBSwipeRefreshLayout.mRefreshing;
    }

    public static /* synthetic */ k access$1000(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("29f4537a", new Object[]{tBSwipeRefreshLayout});
        }
        return tBSwipeRefreshLayout.mOnPushLoadMoreListener;
    }

    public static /* synthetic */ boolean access$1102(TBSwipeRefreshLayout tBSwipeRefreshLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fc08be5", new Object[]{tBSwipeRefreshLayout, new Boolean(z)})).booleanValue();
        }
        tBSwipeRefreshLayout.mLoadingMore = z;
        return z;
    }

    public static /* synthetic */ TBLoadMoreFooter access$1200(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLoadMoreFooter) ipChange.ipc$dispatch("fcbfa743", new Object[]{tBSwipeRefreshLayout});
        }
        return tBSwipeRefreshLayout.mFooterView;
    }

    public static /* synthetic */ boolean access$200(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f5c67", new Object[]{tBSwipeRefreshLayout})).booleanValue();
        }
        return tBSwipeRefreshLayout.mNotify;
    }

    public static /* synthetic */ j access$300(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("33e0fa35", new Object[]{tBSwipeRefreshLayout});
        }
        return tBSwipeRefreshLayout.mPullRefreshListener;
    }

    public static /* synthetic */ void access$400(TBSwipeRefreshLayout tBSwipeRefreshLayout, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763f773e", new Object[]{tBSwipeRefreshLayout, new Integer(i2)});
        } else {
            tBSwipeRefreshLayout.updateHeaderPosition(i2);
        }
    }

    public static /* synthetic */ void access$500(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa7b5e66", new Object[]{tBSwipeRefreshLayout});
        } else {
            tBSwipeRefreshLayout.updatePullListenerCallBack();
        }
    }

    public static /* synthetic */ Animator.AnimatorListener access$600(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator.AnimatorListener) ipChange.ipc$dispatch("634e2c4b", new Object[]{tBSwipeRefreshLayout});
        }
        return tBSwipeRefreshLayout.mRefreshListener;
    }

    public static /* synthetic */ long access$700(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b6e0a5c", new Object[]{tBSwipeRefreshLayout})).longValue();
        }
        return tBSwipeRefreshLayout.mAutoRefreshDuration;
    }

    public static /* synthetic */ int access$802(TBSwipeRefreshLayout tBSwipeRefreshLayout, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecebeb6b", new Object[]{tBSwipeRefreshLayout, new Integer(i2)})).intValue();
        }
        tBSwipeRefreshLayout.mPushDistance = i2;
        return i2;
    }

    public static /* synthetic */ void access$900(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c60b66a", new Object[]{tBSwipeRefreshLayout});
        } else {
            tBSwipeRefreshLayout.updateFooterPosition();
        }
    }

    private void animateOffsetToBottomPosition(int i2, Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24531edb", new Object[]{this, new Integer(i2), animatorListener});
            return;
        }
        this.mFrom = i2;
        new ValueAnimator();
        ValueAnimator ofInt = ValueAnimator.ofInt(this.mFrom, 0);
        ofInt.addUpdateListener(new h(ofInt));
        ofInt.setDuration(300L);
        ofInt.setInterpolator(this.mDecelerateInterpolator);
        if (animatorListener != null) {
            ofInt.addListener(animatorListener);
        }
        ofInt.start();
    }

    private void animateOffsetToCorrectPosition(int i2, Animator.AnimatorListener animatorListener) {
        int i3;
        int abs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d2e911c", new Object[]{this, new Integer(i2), animatorListener});
            return;
        }
        this.mFrom = i2;
        if (this.mEnableTargetOffset) {
            i3 = this.mHeaderViewHeight - Math.abs(this.mOriginalOffsetTop);
            abs = this.mRefreshOffset;
        } else {
            i3 = this.mHeaderViewHeight;
            abs = Math.abs(this.mOriginalOffsetTop);
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.mFrom, i3 - abs);
        if (animatorListener != null) {
            ofInt.addListener(animatorListener);
        }
        ofInt.addUpdateListener(new f());
        ofInt.setDuration(300L);
        ofInt.setInterpolator(this.mDecelerateInterpolator);
        ofInt.start();
    }

    private void animateOffsetToStartPosition(int i2, Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0556754", new Object[]{this, new Integer(i2), animatorListener});
            return;
        }
        this.mFrom = i2;
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, this.mOriginalOffsetTop);
        ofInt.addUpdateListener(new g());
        ofInt.setDuration(300L);
        ofInt.setInterpolator(this.mDecelerateInterpolator);
        if (animatorListener != null) {
            ofInt.addListener(animatorListener);
        }
        ofInt.start();
    }

    private void animatorFooterToBottom(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d76b2f", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, i3);
        ofInt.setDuration(150L);
        ofInt.addUpdateListener(new d());
        ofInt.addListener(new e(i3));
        ofInt.setInterpolator(this.mDecelerateInterpolator);
        ofInt.start();
    }

    private void ensureTarget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d26e8876", new Object[]{this});
        } else if (this.mTarget == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.mHeaderView) && !childAt.equals(this.mFooterView)) {
                    this.mTarget = childAt;
                    return;
                }
            }
        }
    }

    private float getMotionEventY(MotionEvent motionEvent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e85026c", new Object[]{this, motionEvent, new Integer(i2)})).floatValue();
        }
        int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i2);
        if (findPointerIndex < 0) {
            return -1.0f;
        }
        return MotionEventCompat.getY(motionEvent, findPointerIndex);
    }

    private int getPointerIndex(MotionEvent motionEvent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6128e2f", new Object[]{this, motionEvent, new Integer(i2)})).intValue();
        }
        int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i2);
        if (findPointerIndex == -1) {
            this.mActivePointerId = -1;
        }
        return findPointerIndex;
    }

    private boolean handlePullTouchEvent(MotionEvent motionEvent, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53f95aa3", new Object[]{this, motionEvent, new Integer(i2)})).booleanValue();
        }
        if (i2 != 1) {
            if (i2 == 2) {
                if (this.mActivePointerId == -1) {
                    this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, MotionEventCompat.getActionIndex(motionEvent));
                    this.mLastMotionY = motionEvent.getY();
                    this.mPreActivePointerId = this.mActivePointerId;
                }
                try {
                    int y = (int) MotionEventCompat.getY(motionEvent, getPointerIndex(motionEvent, this.mActivePointerId));
                    if (this.mIsMultiPointer) {
                        int i4 = this.mPreActivePointerId;
                        int i5 = this.mActivePointerId;
                        if (i4 == i5) {
                            float f2 = y - this.mLastMotionY;
                            i3 = (int) (this.mDistance + f2);
                            this.mPreDistance = i3;
                            this.mPrePositionY = (int) (this.mPositionY + f2);
                        } else {
                            int i6 = this.mPreDistance;
                            int i7 = (int) (i6 + (y - this.mLastMotionY));
                            int i8 = this.mPrePositionY;
                            this.mPreActivePointerId = i5;
                            this.mDistance = i6;
                            this.mPositionY = i8;
                            i3 = i7;
                        }
                    } else {
                        i3 = y - this.mStartY;
                        this.mDistance = i3;
                        this.mPreDistance = i3;
                        this.mPositionY = y;
                        this.mPrePositionY = y;
                    }
                    if (this.mIsBeingDragged) {
                        int i9 = (int) (i3 * this.mDragRate);
                        int i10 = this.mDisplayMetrics.heightPixels;
                        int min = Math.min(i10, (int) (i9 * ((float) ((i10 / (i10 + i9)) / 1.1d))));
                        int i11 = this.mMaxPullDistance;
                        if (i11 > 0) {
                            min = Math.min(min, i11);
                        }
                        float f3 = (min * 1.0f) / this.mTotalDragDistance;
                        if (f3 < 0.0f) {
                            return false;
                        }
                        float min2 = Math.min(1.0f, Math.abs(f3));
                        if (min < this.mTotalDragDistance) {
                            this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.PULL_TO_REFRESH);
                        } else if (!this.mSecondFloorEnabled) {
                            this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.RELEASE_TO_REFRESH);
                        } else if (min > this.mSecondFloorDistance) {
                            this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR);
                        } else {
                            this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.RELEASE_TO_REFRESH);
                        }
                        this.mHeaderView.setProgress(min2);
                        updateHeaderPosition(min - (this.mCurrentTargetOffsetTop - this.mOriginalOffsetTop));
                    }
                } catch (IllegalArgumentException e2) {
                    e2.printStackTrace();
                }
            } else if (i2 != 3) {
                if (i2 == 5) {
                    int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                    if (actionIndex < 0) {
                        return false;
                    }
                    this.mLastMotionY = MotionEventCompat.getY(motionEvent, actionIndex);
                    this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                    this.mIsMultiPointer = true;
                } else if (i2 == 6) {
                    onSecondaryPointerUp(motionEvent);
                }
            }
            return true;
        }
        if (this.mActivePointerId == -1) {
            if (i2 == 1) {
                Log.e(TAG, "Got ACTION_UP event but don't have an active pointer id.");
            }
            return false;
        }
        this.mIsBeingDragged = false;
        if (this.mHeaderView.getCurrentState() == TBAbsRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR && this.mSecondFloorEnabled) {
            this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.SECOND_FLOOR_START);
            animateOffsetToBottomPosition(this.mCurrentTargetOffsetTop, new b());
        } else if (this.mHeaderView.getCurrentState() == TBAbsRefreshHeader.RefreshState.RELEASE_TO_REFRESH) {
            setRefreshing(true, true);
        } else {
            this.mRefreshing = false;
            this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.NONE);
            animateOffsetToStartPosition(this.mCurrentTargetOffsetTop, null);
        }
        this.mActivePointerId = -1;
        this.mIsMultiPointer = false;
        this.mDistance = 0;
        this.mPositionY = 0;
        return false;
    }

    private boolean handlePushTouchEvent(MotionEvent motionEvent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b2e8d6e", new Object[]{this, motionEvent, new Integer(i2)})).booleanValue();
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId);
                    if (findPointerIndex < 0) {
                        Log.e(TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y = (this.mInitialMotionY - MotionEventCompat.getY(motionEvent, findPointerIndex)) * this.mDragRate;
                    if (this.mIsBeingDragged) {
                        this.mPushDistance = Math.min((int) y, this.mMaxPushDistance);
                        updateFooterPosition();
                        if (this.mOnPushLoadMoreListener != null) {
                            if (this.mPushDistance >= this.mFooterViewHeight) {
                                this.mFooterView.changeToState(TBLoadMoreFooter.LoadMoreState.RELEASE_TO_LOAD);
                            } else {
                                this.mFooterView.changeToState(TBLoadMoreFooter.LoadMoreState.PUSH_TO_LOAD);
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 5) {
                        this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, MotionEventCompat.getActionIndex(motionEvent));
                    } else if (i2 == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                }
            }
            int i3 = this.mActivePointerId;
            if (i3 == -1) {
                if (i2 == 1) {
                    Log.e(TAG, "Got ACTION_UP event but don't have an active pointer id.");
                }
                return false;
            }
            int findPointerIndex2 = MotionEventCompat.findPointerIndex(motionEvent, i3);
            if (findPointerIndex2 < 0) {
                return false;
            }
            float min = Math.min((this.mInitialMotionY - MotionEventCompat.getY(motionEvent, findPointerIndex2)) * this.mDragRate, this.mMaxPushDistance);
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
            int i4 = this.mFooterViewHeight;
            if (min < i4 || this.mOnPushLoadMoreListener == null) {
                this.mPushDistance = 0;
            } else {
                this.mPushDistance = i4;
            }
            animatorFooterToBottom((int) min, this.mPushDistance);
            return false;
        }
        this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
        this.mIsBeingDragged = false;
        return true;
    }

    public static /* synthetic */ Object ipc$super(TBSwipeRefreshLayout tBSwipeRefreshLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -349229044) {
            super.onConfigurationChanged((Configuration) objArr[0]);
            return null;
        } else if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/recycler/refresh/TBSwipeRefreshLayout");
        }
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24b537f", new Object[]{this, motionEvent});
            return;
        }
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.mActivePointerId) {
            if (actionIndex != 0) {
                i2 = 0;
            }
            this.mLastMotionY = MotionEventCompat.getY(motionEvent, i2);
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, i2);
        }
        int pointerIndex = getPointerIndex(motionEvent, this.mActivePointerId);
        if (this.mActivePointerId != -1) {
            this.mLastMotionY = MotionEventCompat.getY(motionEvent, pointerIndex);
        }
    }

    private void startScaleUpAnimation(Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e96edac", new Object[]{this, animatorListener});
            return;
        }
        this.mHeaderView.setVisibility(0);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(getResources().getInteger(17694721));
        if (animatorListener != null) {
            ofInt.addListener(animatorListener);
        }
        ofInt.start();
    }

    private void updateFooterPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf98f14", new Object[]{this});
            return;
        }
        this.mFooterView.setVisibility(0);
        this.mFooterView.bringToFront();
        this.mFooterView.offsetTopAndBottom(-this.mPushDistance);
        updateLoadMoreListener();
    }

    private void updateHeaderPosition(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e72b2bd", new Object[]{this, new Integer(i2)});
            return;
        }
        this.mHeaderView.bringToFront();
        this.mHeaderView.offsetTopAndBottom(i2);
        this.mTarget.offsetTopAndBottom(i2);
        this.mCurrentTargetOffsetTop = this.mHeaderView.getTop();
        updatePullListenerCallBack();
    }

    private void updateLoadMoreListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d6b29f", new Object[]{this});
            return;
        }
        k kVar = this.mOnPushLoadMoreListener;
        if (kVar != null) {
            kVar.onPushDistance(this.mPushDistance);
        }
    }

    private void updatePullListenerCallBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("562ee90e", new Object[]{this});
            return;
        }
        int i2 = this.mCurrentTargetOffsetTop - this.mOriginalOffsetTop;
        j jVar = this.mPullRefreshListener;
        if (jVar != null) {
            jVar.onPullDistance(i2);
        }
    }

    public void createFooterView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea93783", new Object[]{this});
            return;
        }
        TBDefaultLoadMoreFooter tBDefaultLoadMoreFooter = new TBDefaultLoadMoreFooter(getContext());
        this.mFooterView = tBDefaultLoadMoreFooter;
        k kVar = this.mOnPushLoadMoreListener;
        if (kVar != null) {
            tBDefaultLoadMoreFooter.setPushLoadMoreListener(kVar);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.mFooterViewHeight);
        layoutParams.addRule(14);
        layoutParams.addRule(10);
        addView(this.mFooterView, layoutParams);
    }

    public void createHeaderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57445275", new Object[]{this});
            return;
        }
        TBRefreshHeader tBRefreshHeader = new TBRefreshHeader(getContext());
        this.mHeaderView = tBRefreshHeader;
        j jVar = this.mPullRefreshListener;
        if (jVar != null) {
            tBRefreshHeader.setPullRefreshListener(jVar);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        addView(this.mHeaderView, layoutParams);
    }

    public void enableLoadMore(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("672525ef", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mLoadMoreEnabled = z;
        if (z && this.mFooterView == null) {
            createFooterView();
        }
    }

    public void enablePullRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388183ba", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mPullRefreshEnabled = z;
        if (z && this.mHeaderView == null) {
            createHeaderView();
        }
    }

    public void enableSecondFloor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64165d8", new Object[]{this, new Boolean(z)});
        } else {
            this.mSecondFloorEnabled = z;
        }
    }

    public void enableTargetOffset(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed28f0e6", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableTargetOffset = z;
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7aaf12f0", new Object[]{this, new Integer(i2), new Integer(i3)})).intValue();
        }
        int i6 = this.mHeaderViewIndex;
        if (i6 < 0 && this.mFooterViewIndex < 0) {
            return i3;
        }
        if (i6 < 0 || (i4 = this.mFooterViewIndex) < 0) {
            if (i6 < 0) {
                i6 = this.mFooterViewIndex;
            }
            if (i3 == i2 - 1) {
                return i6;
            }
            if (i3 >= i6) {
                return i3 + 1;
            }
            return i3;
        } else if (i3 == i2 - 2) {
            return i6;
        } else {
            if (i3 == i2 - 1) {
                return i4;
            }
            if (i4 > i6) {
                i5 = i4;
            } else {
                i5 = i6;
            }
            if (i4 < i6) {
                i6 = i4;
            }
            if (i3 >= i6 && i3 < i5 - 1) {
                return i3 + 1;
            }
            if (i3 >= i5 || i3 == i5 - 1) {
                return i3 + 2;
            }
            return i3;
        }
    }

    public float getDistanceToRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7181ccac", new Object[]{this})).floatValue();
        }
        return this.mTotalDragDistance;
    }

    public float getDistanceToSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6efe49", new Object[]{this})).floatValue();
        }
        return this.mSecondFloorDistance;
    }

    public int getFooterViewHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2dcc997", new Object[]{this})).intValue();
        }
        return this.mFooterViewHeight;
    }

    public int getHeaderViewHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aee06709", new Object[]{this})).intValue();
        }
        return this.mHeaderViewHeight;
    }

    public TBLoadMoreFooter getLoadMoreFooter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLoadMoreFooter) ipChange.ipc$dispatch("cf4c0c62", new Object[]{this});
        }
        return this.mFooterView;
    }

    public TBAbsRefreshHeader getRefresHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBAbsRefreshHeader) ipChange.ipc$dispatch("9df234be", new Object[]{this});
        }
        return this.mHeaderView;
    }

    public int getRefreshOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fae1c812", new Object[]{this})).intValue();
        }
        return this.mRefreshOffset;
    }

    public boolean isChildScrollToBottom() {
        int lastVisiblePosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e398b30", new Object[]{this})).booleanValue();
        }
        if (isChildScrollToTop()) {
            return false;
        }
        View view = this.mTarget;
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            int itemCount = recyclerView.getAdapter().getItemCount();
            if (!(layoutManager instanceof LinearLayoutManager) || itemCount <= 0) {
                if (layoutManager instanceof StaggeredGridLayoutManager) {
                    int[] iArr = new int[2];
                    ((StaggeredGridLayoutManager) layoutManager).findLastCompletelyVisibleItemPositions(iArr);
                    if (Math.max(iArr[0], iArr[1]) == itemCount - 1) {
                        return true;
                    }
                }
            } else if (((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() == itemCount - 1) {
                return true;
            }
            return false;
        } else if (view instanceof AbsListView) {
            AbsListView absListView = (AbsListView) view;
            int count = ((ListAdapter) absListView.getAdapter()).getCount();
            if ((absListView.getFirstVisiblePosition() != 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop()) && (lastVisiblePosition = absListView.getLastVisiblePosition()) > 0 && count > 0 && lastVisiblePosition == count - 1) {
                return true;
            }
            return false;
        } else {
            if (view instanceof ScrollView) {
                ScrollView scrollView = (ScrollView) view;
                View childAt = scrollView.getChildAt(scrollView.getChildCount() - 1);
                if (childAt != null && childAt.getBottom() - (scrollView.getHeight() + scrollView.getScrollY()) == 0) {
                    return true;
                }
            } else if (view instanceof NestedScrollView) {
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                View childAt2 = nestedScrollView.getChildAt(nestedScrollView.getChildCount() - 1);
                if (childAt2 != null && childAt2.getBottom() - (nestedScrollView.getHeight() + nestedScrollView.getScrollY()) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean isChildScrollToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7da7eba6", new Object[]{this})).booleanValue();
        }
        i iVar = this.mOnChildScrollUpCallback;
        if (iVar != null) {
            return true ^ ((WaterfallLayout) iVar).a(this);
        }
        return true ^ ViewCompat.canScrollVertically(this.mTarget, -1);
    }

    public boolean isRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56d673fc", new Object[]{this})).booleanValue();
        }
        if (getRefresHeader() == null || getRefresHeader().getCurrentState() == TBAbsRefreshHeader.RefreshState.NONE) {
            return false;
        }
        return true;
    }

    public boolean isTargetScrollWithLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63314c43", new Object[]{this})).booleanValue();
        }
        return this.mTargetScrollWithLayout;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mDensity = displayMetrics.density;
        if (nb6.i()) {
            int i2 = displayMetrics.widthPixels;
            this.mHeaderViewHeight = i2;
            this.mFooterViewHeight = i2;
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        TBLoadMoreFooter tBLoadMoreFooter;
        TBAbsRefreshHeader tBAbsRefreshHeader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        ensureTarget();
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.mPullRefreshEnabled) {
            z = isChildScrollToTop();
        } else {
            z = false;
        }
        if (!(z || (tBAbsRefreshHeader = this.mHeaderView) == null || tBAbsRefreshHeader.getCurrentState() == TBAbsRefreshHeader.RefreshState.NONE)) {
            z = true;
        }
        TBAbsRefreshHeader tBAbsRefreshHeader2 = this.mHeaderView;
        if (tBAbsRefreshHeader2 == null || tBAbsRefreshHeader2.getCurrentState() == TBAbsRefreshHeader.RefreshState.SECOND_FLOOR_START || this.mHeaderView.getCurrentState() == TBAbsRefreshHeader.RefreshState.SECOND_FLOOR_END) {
            z = false;
        }
        if (this.mFooterView != null && this.mLoadMoreEnabled) {
            z2 = isChildScrollToBottom();
        } else {
            z2 = false;
        }
        if (!(z2 || (tBLoadMoreFooter = this.mFooterView) == null || tBLoadMoreFooter.getCurrentState() == TBLoadMoreFooter.LoadMoreState.NONE)) {
            z2 = true;
        }
        if (!z && !z2) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.mActivePointerId;
                    if (i2 == -1) {
                        Log.e(TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    float motionEventY = getMotionEventY(motionEvent, i2);
                    if (motionEventY == -1.0f) {
                        return false;
                    }
                    if (isChildScrollToBottom()) {
                        if (this.mInitialMotionY - motionEventY > this.mTouchSlop && !this.mIsBeingDragged) {
                            this.mIsBeingDragged = true;
                        }
                    } else if (isChildScrollToTop() && motionEventY - this.mInitialMotionY > this.mTouchSlop && !this.mIsBeingDragged) {
                        this.mIsBeingDragged = true;
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                }
            }
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
        } else {
            this.mStartY = (int) motionEvent.getY();
            int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
            if (this.mActivePointerId == -1) {
                this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                this.mLastMotionY = motionEvent.getY();
                this.mPreActivePointerId = this.mActivePointerId;
            }
            this.mIsBeingDragged = false;
            float motionEventY2 = getMotionEventY(motionEvent, this.mActivePointerId);
            if (motionEventY2 == -1.0f) {
                return false;
            }
            this.mInitialMotionY = motionEventY2;
            TBAbsRefreshHeader tBAbsRefreshHeader3 = this.mHeaderView;
            if (tBAbsRefreshHeader3 != null && tBAbsRefreshHeader3.getCurrentState() == TBAbsRefreshHeader.RefreshState.REFRESHING) {
                setRefreshing(false);
            }
            TBLoadMoreFooter tBLoadMoreFooter2 = this.mFooterView;
            if (tBLoadMoreFooter2 != null && tBLoadMoreFooter2.getCurrentState() == TBLoadMoreFooter.LoadMoreState.LOADING) {
                setLoadMore(false);
            }
        }
        return this.mIsBeingDragged;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        TBAbsRefreshHeader tBAbsRefreshHeader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.mTarget == null) {
                ensureTarget();
            }
            View view = this.mTarget;
            if (view != null) {
                int i7 = this.mCurrentTargetOffsetTop + this.mContentHeight;
                if (!this.mTargetScrollWithLayout) {
                    i7 = 0;
                }
                int paddingLeft = getPaddingLeft();
                int paddingTop = (getPaddingTop() + i7) - this.mPushDistance;
                int paddingLeft2 = (measuredWidth - getPaddingLeft()) - getPaddingRight();
                int paddingTop2 = (measuredHeight - getPaddingTop()) - getPaddingBottom();
                if (this.mEnableTargetOffset) {
                    i6 = paddingTop;
                } else {
                    i6 = paddingTop - this.mRefreshOffset;
                }
                view.layout(paddingLeft, i6, paddingLeft2 + paddingLeft, (paddingTop + paddingTop2) - this.mRefreshOffset);
                int i8 = getResources().getDisplayMetrics().widthPixels;
                TBAbsRefreshHeader tBAbsRefreshHeader2 = this.mHeaderView;
                if (tBAbsRefreshHeader2 != null) {
                    this.mHeaderViewWidth = i8;
                    int i9 = this.mCurrentTargetOffsetTop;
                    tBAbsRefreshHeader2.layout(0, i9, i8, this.mContentHeight + i9);
                }
                if (!this.mSecondFloorEnabled && (tBAbsRefreshHeader = this.mHeaderView) != null) {
                    tBAbsRefreshHeader.getSecondFloorView().setVisibility(8);
                }
                TBLoadMoreFooter tBLoadMoreFooter = this.mFooterView;
                if (tBLoadMoreFooter != null) {
                    this.mFooterViewWidth = i8;
                    int i10 = this.mPushDistance;
                    tBLoadMoreFooter.layout(0, measuredHeight - i10, i8, (measuredHeight + this.mMaxPushDistance) - i10);
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        super.onMeasure(i2, i3);
        if (this.mTarget == null) {
            ensureTarget();
        }
        View view = this.mTarget;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.mHeaderViewIndex = -1;
            int i4 = getResources().getDisplayMetrics().widthPixels;
            TBAbsRefreshHeader tBAbsRefreshHeader = this.mHeaderView;
            if (tBAbsRefreshHeader != null) {
                this.mHeaderViewWidth = i4;
                tBAbsRefreshHeader.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mContentHeight, 1073741824));
                int i5 = 0;
                while (true) {
                    if (i5 >= getChildCount()) {
                        break;
                    } else if (getChildAt(i5) == this.mHeaderView) {
                        this.mHeaderViewIndex = i5;
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.mFooterViewIndex = -1;
            TBLoadMoreFooter tBLoadMoreFooter = this.mFooterView;
            if (tBLoadMoreFooter != null) {
                this.mFooterViewWidth = i4;
                tBLoadMoreFooter.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mMaxPushDistance, 1073741824));
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    if (getChildAt(i6) == this.mFooterView) {
                        this.mFooterViewIndex = i6;
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        TBLoadMoreFooter tBLoadMoreFooter;
        TBAbsRefreshHeader tBAbsRefreshHeader;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.mPullRefreshEnabled) {
            z = isChildScrollToTop();
        } else {
            z = false;
        }
        if (!(z || (tBAbsRefreshHeader = this.mHeaderView) == null || tBAbsRefreshHeader.getCurrentState() == TBAbsRefreshHeader.RefreshState.NONE)) {
            z = true;
        }
        TBAbsRefreshHeader tBAbsRefreshHeader2 = this.mHeaderView;
        if (tBAbsRefreshHeader2 == null || tBAbsRefreshHeader2.getCurrentState() == TBAbsRefreshHeader.RefreshState.SECOND_FLOOR_START || this.mHeaderView.getCurrentState() == TBAbsRefreshHeader.RefreshState.SECOND_FLOOR_END) {
            z = false;
        }
        if (this.mFooterView != null && this.mLoadMoreEnabled) {
            z2 = isChildScrollToBottom();
        } else {
            z2 = false;
        }
        if (z2 || (tBLoadMoreFooter = this.mFooterView) == null || tBLoadMoreFooter.getCurrentState() == TBLoadMoreFooter.LoadMoreState.NONE) {
            z3 = z2;
        }
        if (!z && !z3) {
            return false;
        }
        if (z) {
            return handlePullTouchEvent(motionEvent, actionMasked);
        }
        if (z3) {
            return handlePushTouchEvent(motionEvent, actionMasked);
        }
        return false;
    }

    public void setAutoRefreshing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfadcef5", new Object[]{this, new Boolean(z)});
        } else if (this.mHeaderView != null) {
            this.mNotify = z;
            ensureTarget();
            this.mRefreshing = true;
            this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.REFRESHING);
            animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, new c());
        }
    }

    public void setAutoRefreshingDuration(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b83589b1", new Object[]{this, new Long(j2)});
        } else if (j2 > 0) {
            this.mAutoRefreshDuration = j2;
        }
    }

    public void setCustomRefreshHeight(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("935ee48d", new Object[]{this, new Integer(i2)});
            return;
        }
        int i3 = (int) (i2 * this.mDensity);
        this.mHeaderViewHeight = i3;
        this.mTotalDragDistance = i3;
        if (this.mSecondFloorDistance < i3) {
            this.mSecondFloorDistance = i3 + MIN_GAP_DISTANCE_TO_SECOND_FLOOR;
        }
    }

    public void setDistanceToRefresh(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0fbd9d3", new Object[]{this, new Integer(i2)});
            return;
        }
        float f2 = i2;
        float f3 = this.mDensity;
        if (((int) (f2 * f3)) >= this.mHeaderViewHeight) {
            int i3 = (int) (f2 * f3);
            this.mTotalDragDistance = i3;
            int i4 = this.mSecondFloorDistance - i3;
            int i5 = MIN_GAP_DISTANCE_TO_SECOND_FLOOR;
            if (i4 < i5) {
                this.mSecondFloorDistance = i3 + i5;
            }
        }
    }

    public void setDistanceToSecondFloor(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902ff5d6", new Object[]{this, new Integer(i2)});
            return;
        }
        float f2 = i2;
        float f3 = this.mDensity;
        if (((int) (f2 * f3)) - this.mTotalDragDistance < MIN_GAP_DISTANCE_TO_SECOND_FLOOR) {
            Log.e(TAG, "Distance to second floor must be more than 50dp longer than distance to refresh");
        } else {
            this.mSecondFloorDistance = (int) (f2 * f3);
        }
    }

    public void setDragRate(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e39e323", new Object[]{this, new Float(f2)});
        } else if (f2 <= 0.0f || f2 >= 1.0f) {
            Log.e(TAG, "Drag rate must be larger than 0 and smaller than 1!");
        } else {
            this.mDragRate = f2;
        }
    }

    public void setFooterView(TBLoadMoreFooter tBLoadMoreFooter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ae72be8", new Object[]{this, tBLoadMoreFooter});
        } else if (tBLoadMoreFooter != null) {
            int indexOfChild = indexOfChild(this.mFooterView);
            TBLoadMoreFooter tBLoadMoreFooter2 = this.mFooterView;
            if (!(tBLoadMoreFooter2 == null || indexOfChild == -1)) {
                removeView(tBLoadMoreFooter2);
            }
            this.mFooterView = tBLoadMoreFooter;
            tBLoadMoreFooter.setPushLoadMoreListener(this.mOnPushLoadMoreListener);
            addView(this.mFooterView, indexOfChild, new ViewGroup.LayoutParams(-1, this.mFooterViewHeight));
        }
    }

    public void setFooterViewHeight(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78cf9053", new Object[]{this, new Integer(i2)});
            return;
        }
        float f2 = i2;
        float f3 = this.mDensity;
        if (((int) (f2 * f3)) > this.mMaxPushDistance) {
            this.mMaxPushDistance = (int) (f2 * f3);
        }
        this.mFooterViewHeight = (int) (f2 * f3);
    }

    public void setHeaderView(TBAbsRefreshHeader tBAbsRefreshHeader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d45f2c3a", new Object[]{this, tBAbsRefreshHeader});
        } else if (tBAbsRefreshHeader != null) {
            int indexOfChild = indexOfChild(this.mHeaderView);
            TBAbsRefreshHeader tBAbsRefreshHeader2 = this.mHeaderView;
            if (!(tBAbsRefreshHeader2 == null || indexOfChild == -1)) {
                removeView(tBAbsRefreshHeader2);
            }
            this.mHeaderView = tBAbsRefreshHeader;
            tBAbsRefreshHeader.setPullRefreshListener(this.mPullRefreshListener);
            addView(this.mHeaderView, indexOfChild, new ViewGroup.LayoutParams(-1, this.mHeaderViewHeight));
        }
    }

    public void setHeaderViewHeight(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3fa121", new Object[]{this, new Integer(i2)});
            return;
        }
        float f2 = i2;
        float f3 = this.mDensity;
        if (((int) (f2 * f3)) >= this.mRefreshOffset) {
            int i3 = (int) (f2 * f3);
            this.mHeaderViewHeight = i3;
            if (this.mTotalDragDistance < i3) {
                this.mTotalDragDistance = i3;
            }
            int i4 = this.mSecondFloorDistance;
            int i5 = this.mTotalDragDistance;
            if (i4 < i5) {
                this.mSecondFloorDistance = i5 + MIN_GAP_DISTANCE_TO_SECOND_FLOOR;
            }
        }
    }

    public void setLoadMore(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8ef170", new Object[]{this, new Boolean(z)});
        } else if (this.mFooterView != null && !z && this.mLoadingMore) {
            animatorFooterToBottom(this.mFooterViewHeight, 0);
        }
    }

    public void setLoadMoreTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4990e3", new Object[]{this, strArr});
            return;
        }
        TBLoadMoreFooter tBLoadMoreFooter = this.mFooterView;
        if (tBLoadMoreFooter != null) {
            tBLoadMoreFooter.setLoadMoreTips(strArr);
        }
    }

    public void setMaxPullDistance(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("643538c0", new Object[]{this, new Integer(i2)});
        } else {
            this.mMaxPullDistance = (int) (i2 * this.mDensity);
        }
    }

    public void setMaxPushDistance(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51bdfa0b", new Object[]{this, new Integer(i2)});
            return;
        }
        float f2 = i2;
        float f3 = this.mDensity;
        if (((int) (f2 * f3)) < this.mFooterViewHeight) {
            Log.e(TAG, "Max push distance must be larger than footer view height!");
        } else {
            this.mMaxPushDistance = (int) (f2 * f3);
        }
    }

    public void setOnChildScrollUpCallback(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811d90b3", new Object[]{this, iVar});
        } else {
            this.mOnChildScrollUpCallback = iVar;
        }
    }

    public void setOnPullRefreshListener(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a52153", new Object[]{this, jVar});
            return;
        }
        this.mPullRefreshListener = jVar;
        TBAbsRefreshHeader tBAbsRefreshHeader = this.mHeaderView;
        if (tBAbsRefreshHeader != null) {
            tBAbsRefreshHeader.setPullRefreshListener(jVar);
        }
    }

    public void setOnPushLoadMoreListener(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("913df6a9", new Object[]{this, kVar});
            return;
        }
        this.mOnPushLoadMoreListener = kVar;
        TBLoadMoreFooter tBLoadMoreFooter = this.mFooterView;
        if (tBLoadMoreFooter != null) {
            tBLoadMoreFooter.setPushLoadMoreListener(kVar);
        }
    }

    public void setRefreshOffset(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f88330d0", new Object[]{this, new Integer(i2)});
        } else {
            setRefreshOffset(i2, false);
        }
    }

    public void setRefreshTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e253df27", new Object[]{this, strArr});
            return;
        }
        TBAbsRefreshHeader tBAbsRefreshHeader = this.mHeaderView;
        if (tBAbsRefreshHeader != null) {
            tBAbsRefreshHeader.setRefreshTips(strArr);
        }
    }

    public void setRefreshing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706bb7a4", new Object[]{this, new Boolean(z)});
        } else if (this.mHeaderView != null) {
            if (!z || this.mRefreshing == z) {
                setRefreshing(z, false);
                return;
            }
            this.mRefreshing = z;
            updateHeaderPosition((this.mHeaderViewHeight + this.mOriginalOffsetTop) - this.mCurrentTargetOffsetTop);
            this.mNotify = false;
            startScaleUpAnimation(this.mRefreshListener);
        }
    }

    public void setTargetScrollWithLayout(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c1b7c3d", new Object[]{this, new Boolean(z)});
        } else {
            this.mTargetScrollWithLayout = z;
        }
    }

    public TBSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHeaderViewIndex = -1;
        this.mFooterViewIndex = -1;
        this.mLazyPullRefreshEnable = false;
        this.mLazyLoadMoreEnable = false;
        this.mTargetScrollWithLayout = true;
        this.mActivePointerId = -1;
        this.mDragRate = 1.0f;
        this.mTotalDragDistance = -1;
        this.mSecondFloorDistance = -1;
        this.mEnableTargetOffset = true;
        this.mPushDistance = 0;
        this.mAutoRefreshDuration = 2000L;
        this.mIsMultiPointer = false;
        this.mPositionY = 0;
        this.mPrePositionY = 0;
        this.mPreActivePointerId = -1;
        this.mContentHeight = -1;
        this.mNavigationBarHeight = -1;
        this.mRefreshListener = new a();
        setWillNotDraw(false);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mDisplayMetrics = displayMetrics;
        this.mDensity = displayMetrics.density;
        HEADER_VIEW_HEIGHT = (int) getResources().getDimension(R.dimen.uik_refresh_header_height);
        MIN_GAP_DISTANCE_TO_SECOND_FLOOR = (int) getResources().getDimension(R.dimen.uik_refresh_second_floor_gap);
        FOOTER_VIEW_HEIGHT = (int) getResources().getDimension(R.dimen.uik_refresh_footer_height);
        FOOTER_VIEW_MAX_HEIGHT = (int) getResources().getDimension(R.dimen.uik_refresh_footer_max_height);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        this.mPullRefreshEnabled = obtainStyledAttributes.getBoolean(0, false);
        this.mLoadMoreEnabled = obtainStyledAttributes.getBoolean(1, false);
        this.mSecondFloorEnabled = obtainStyledAttributes.getBoolean(2, false);
        this.mLazyPullRefreshEnable = obtainStyledAttributes.getBoolean(5, false);
        this.mLazyLoadMoreEnable = obtainStyledAttributes.getBoolean(6, false);
        if (!this.mSecondFloorEnabled || this.mPullRefreshEnabled) {
            this.mHeaderViewWidth = this.mDisplayMetrics.widthPixels;
            this.mHeaderViewHeight = (int) obtainStyledAttributes.getDimension(3, HEADER_VIEW_HEIGHT);
            this.mFooterViewWidth = this.mDisplayMetrics.widthPixels;
            this.mFooterViewHeight = (int) obtainStyledAttributes.getDimension(4, FOOTER_VIEW_HEIGHT);
            obtainStyledAttributes.recycle();
            if (this.mNavigationBarHeight == -1) {
                this.mNavigationBarHeight = s56.c(getContext());
            }
            if (this.mContentHeight == -1) {
                this.mContentHeight = s56.a(getContext());
            }
            this.mDecelerateInterpolator = new DecelerateInterpolator(2.0f);
            this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            if (!this.mLazyPullRefreshEnable) {
                createHeaderView();
            }
            if (!this.mLazyLoadMoreEnable) {
                createFooterView();
            }
            ViewCompat.setChildrenDrawingOrderEnabled(this, true);
            this.mRefreshOffset = 0;
            int i2 = HEADER_VIEW_HEIGHT;
            this.mTotalDragDistance = i2;
            this.mSecondFloorDistance = i2 + MIN_GAP_DISTANCE_TO_SECOND_FLOOR;
            this.mMaxPushDistance = FOOTER_VIEW_MAX_HEIGHT;
            int i3 = -this.mContentHeight;
            this.mOriginalOffsetTop = i3;
            this.mCurrentTargetOffsetTop = i3;
            return;
        }
        Log.e(TAG, "Cannot enable second floor when pull to refresh disabled!");
    }

    public void setRefreshOffset(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e39c04", new Object[]{this, new Integer(i2), new Boolean(z)});
            return;
        }
        if (z) {
            int d2 = s56.d(getContext());
            this.mRefreshOffset = ((int) (i2 * getResources().getDisplayMetrics().density)) + d2;
            this.mHeaderViewHeight += d2;
        } else {
            this.mRefreshOffset = (int) (i2 * getResources().getDisplayMetrics().density);
        }
        int i3 = this.mRefreshOffset;
        int i4 = (-this.mContentHeight) + i3;
        this.mOriginalOffsetTop = i4;
        this.mCurrentTargetOffsetTop = i4;
        if (this.mHeaderViewHeight < i3) {
            Log.e(TAG, "Refresh offset cannot be larger than header view height.");
            this.mHeaderViewHeight = this.mRefreshOffset + ((int) (getResources().getDisplayMetrics().density * 24.0f));
        }
        int i5 = this.mTotalDragDistance;
        int i6 = this.mHeaderViewHeight;
        if (i5 < i6) {
            this.mTotalDragDistance = i6;
        }
        int i7 = this.mSecondFloorDistance;
        int i8 = this.mTotalDragDistance;
        if (i7 < i8) {
            this.mSecondFloorDistance = i8 + MIN_GAP_DISTANCE_TO_SECOND_FLOOR;
        }
    }

    public void setRefreshing(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0befb0", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        TBAbsRefreshHeader tBAbsRefreshHeader = this.mHeaderView;
        if (tBAbsRefreshHeader != null) {
            if (this.mRefreshing != z) {
                this.mNotify = z2;
                ensureTarget();
                this.mRefreshing = z;
                if (z) {
                    this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.REFRESHING);
                    animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
                    return;
                }
                this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.NONE);
                animateOffsetToStartPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
            } else if (tBAbsRefreshHeader.getCurrentState() == TBAbsRefreshHeader.RefreshState.SECOND_FLOOR_END) {
                this.mRefreshing = false;
                this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.NONE);
                animateOffsetToStartPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
            }
        }
    }
}
