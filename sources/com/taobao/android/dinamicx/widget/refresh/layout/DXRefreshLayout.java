package com.taobao.android.dinamicx.widget.refresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.WaterfallLayout;
import com.taobao.android.dinamicx.widget.refresh.layout.constant.DXRefreshState;
import com.taobao.taobao.R;
import tb.ba6;
import tb.bsk;
import tb.ca6;
import tb.da6;
import tb.ea6;
import tb.ha6;
import tb.iu5;
import tb.ntk;
import tb.sb6;
import tb.t2o;
import tb.vu3;
import tb.yc6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXRefreshLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ViewGroup.MarginLayoutParams sDefaultMarginLP = new ViewGroup.MarginLayoutParams(-1, -1);
    public Runnable animationRunnable;
    public boolean mAttachedToWindow;
    public int mCurrentVelocity;
    public boolean mDisableContentWhenLoading;
    public boolean mDisableContentWhenRefresh;
    public char mDragDirection;
    public float mDragRate;
    public boolean mEnableAutoLoadMore;
    public boolean mEnableAutoPullLoadMore;
    public boolean mEnableClipFooterWhenFixedBehind;
    public boolean mEnableClipHeaderWhenFixedBehind;
    public boolean mEnableDisallowIntercept;
    public boolean mEnableFooterFollowWhenNoMoreData;
    public boolean mEnableFooterTranslationContent;
    public boolean mEnableHeaderTranslationContent;
    public boolean mEnableLoadMore;
    public boolean mEnableLoadMoreWhenContentNotFull;
    public boolean mEnableNestedScrolling;
    public boolean mEnableOverScrollBounce;
    public boolean mEnableOverScrollDrag;
    public boolean mEnablePreviewInEditMode;
    public boolean mEnablePullLoadMore;
    public boolean mEnablePureScrollMode;
    public boolean mEnableRefresh;
    public boolean mEnableScrollContentWhenLoaded;
    public boolean mEnableScrollContentWhenRefreshed;
    public MotionEvent mFalsifyEvent;
    public int mFloorDuration;
    public int mFooterBackgroundColor;
    public int mFooterHeight;
    public iu5 mFooterHeightStatus;
    public int mFooterInsetStart;
    public boolean mFooterLocked;
    public float mFooterMaxDragRate;
    public boolean mFooterNeedTouchEventWhenLoading;
    public boolean mFooterNoMoreData;
    public boolean mFooterNoMoreDataEffective;
    public float mFooterTriggerRate;
    public Handler mHandler;
    public int mHeaderBackgroundColor;
    public int mHeaderHeight;
    public iu5 mHeaderHeightStatus;
    public int mHeaderInsetStart;
    public float mHeaderMaxDragRate;
    public boolean mHeaderNeedTouchEventWhenRefreshing;
    public float mHeaderTriggerRate;
    public boolean mIsBeingDragged;
    public i mKernel;
    public long mLastOpenTime;
    public int mLastSpinner;
    public float mLastTouchX;
    public float mLastTouchY;
    public bsk mLoadMoreListener;
    public boolean mManualFooterTranslationContent;
    public boolean mManualHeaderTranslationContent;
    public boolean mManualLoadMore;
    public int mMaximumVelocity;
    public int mMinimumVelocity;
    public NestedScrollingChildHelper mNestedChild;
    public boolean mNestedInProgress;
    public NestedScrollingParentHelper mNestedParent;
    public Paint mPaint;
    public int[] mParentOffsetInWindow;
    public int[] mPrimaryColors;
    public int mReboundDuration;
    public Interpolator mReboundInterpolator;
    public ca6 mRefreshContent;
    public ba6 mRefreshHeader;
    public ntk mRefreshListener;
    public int mScreenHeightPixels;
    public sb6 mScrollBoundaryDecider;
    public Scroller mScroller;
    public int mSpinner;
    public DXRefreshState mState;
    public boolean mSuperDispatchTouchEvent;
    public int mTotalUnconsumed;
    public int mTouchSlop;
    public int mTouchSpinner;
    public float mTouchX;
    public float mTouchY;
    public float mTwoLevelBottomPullUpToCloseRate;
    public VelocityTracker mVelocityTracker;
    public boolean mVerticalPermit;
    public DXRefreshState mViceState;
    public ValueAnimator reboundAnimator;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        static {
            t2o.a(444597633);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f7495a;

        public a(boolean z) {
            this.f7495a = z;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/refresh/layout/DXRefreshLayout$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (animator == null || animator.getDuration() != 0) {
                DXRefreshLayout.this.mLastOpenTime = System.currentTimeMillis();
                DXRefreshLayout.this.notifyStateChanged(DXRefreshState.Refreshing);
                DXRefreshLayout dXRefreshLayout = DXRefreshLayout.this;
                ntk ntkVar = dXRefreshLayout.mRefreshListener;
                if (ntkVar != null && this.f7495a) {
                    ((WaterfallLayout.b) ntkVar).k(dXRefreshLayout);
                }
                DXRefreshLayout dXRefreshLayout2 = DXRefreshLayout.this;
                ba6 ba6Var = dXRefreshLayout2.mRefreshHeader;
                if (ba6Var != null) {
                    float f = dXRefreshLayout2.mHeaderMaxDragRate;
                    if (f < 10.0f) {
                        f *= dXRefreshLayout2.mHeaderHeight;
                    }
                    ba6Var.g(dXRefreshLayout2, dXRefreshLayout2.mHeaderHeight, (int) f);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/refresh/layout/DXRefreshLayout$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DXRefreshState dXRefreshState;
            DXRefreshState dXRefreshState2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (animator == null || animator.getDuration() != 0) {
                DXRefreshLayout dXRefreshLayout = DXRefreshLayout.this;
                dXRefreshLayout.reboundAnimator = null;
                if (dXRefreshLayout.mSpinner != 0 || (dXRefreshState = dXRefreshLayout.mState) == (dXRefreshState2 = DXRefreshState.None) || dXRefreshState.isOpening || dXRefreshState.isDragging) {
                    DXRefreshState dXRefreshState3 = dXRefreshLayout.mState;
                    if (dXRefreshState3 != dXRefreshLayout.mViceState) {
                        dXRefreshLayout.setViceState(dXRefreshState3);
                        return;
                    }
                    return;
                }
                dXRefreshLayout.notifyStateChanged(dXRefreshState2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                DXRefreshLayout.this.mKernel.c(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f7498a = 0;
        public final /* synthetic */ int b;
        public final /* synthetic */ Boolean c;
        public final /* synthetic */ boolean d;

        public d(int i, Boolean bool, boolean z) {
            this.b = i;
            this.c = bool;
            this.d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int i = this.f7498a;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
            if (i == 0) {
                DXRefreshLayout dXRefreshLayout = DXRefreshLayout.this;
                DXRefreshState dXRefreshState = dXRefreshLayout.mState;
                DXRefreshState dXRefreshState2 = DXRefreshState.None;
                if (dXRefreshState == dXRefreshState2 && dXRefreshLayout.mViceState == DXRefreshState.Refreshing) {
                    dXRefreshLayout.mViceState = dXRefreshState2;
                } else {
                    ValueAnimator valueAnimator = dXRefreshLayout.reboundAnimator;
                    if (valueAnimator != null && dXRefreshState.isHeader && (dXRefreshState.isDragging || dXRefreshState == DXRefreshState.RefreshReleased)) {
                        valueAnimator.setDuration(0L);
                        DXRefreshLayout.this.reboundAnimator.cancel();
                        DXRefreshLayout dXRefreshLayout2 = DXRefreshLayout.this;
                        dXRefreshLayout2.reboundAnimator = null;
                        if (dXRefreshLayout2.mKernel.a(0) == null) {
                            DXRefreshLayout.this.notifyStateChanged(dXRefreshState2);
                        } else {
                            DXRefreshLayout.this.notifyStateChanged(DXRefreshState.PullDownCanceled);
                        }
                    } else if (!(dXRefreshState != DXRefreshState.Refreshing || dXRefreshLayout.mRefreshHeader == null || dXRefreshLayout.mRefreshContent == null)) {
                        this.f7498a = i + 1;
                        dXRefreshLayout.mHandler.postDelayed(this, this.b);
                        DXRefreshLayout.this.notifyStateChanged(DXRefreshState.RefreshFinish);
                        if (this.c == Boolean.FALSE) {
                            DXRefreshLayout.this.setNoMoreData(false);
                        }
                    }
                }
                if (this.c == Boolean.TRUE) {
                    DXRefreshLayout.this.setNoMoreData(true);
                    return;
                }
                return;
            }
            DXRefreshLayout dXRefreshLayout3 = DXRefreshLayout.this;
            int b = dXRefreshLayout3.mRefreshHeader.b(dXRefreshLayout3, this.d);
            if (b < Integer.MAX_VALUE) {
                DXRefreshLayout dXRefreshLayout4 = DXRefreshLayout.this;
                if (dXRefreshLayout4.mIsBeingDragged || dXRefreshLayout4.mNestedInProgress) {
                    long currentTimeMillis = System.currentTimeMillis();
                    DXRefreshLayout dXRefreshLayout5 = DXRefreshLayout.this;
                    if (dXRefreshLayout5.mIsBeingDragged) {
                        float f = dXRefreshLayout5.mLastTouchY;
                        dXRefreshLayout5.mTouchY = f;
                        dXRefreshLayout5.mTouchSpinner = 0;
                        dXRefreshLayout5.mIsBeingDragged = false;
                        DXRefreshLayout.access$301(dXRefreshLayout5, MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 0, dXRefreshLayout5.mLastTouchX, (f + dXRefreshLayout5.mSpinner) - (dXRefreshLayout5.mTouchSlop * 2), 0));
                        DXRefreshLayout dXRefreshLayout6 = DXRefreshLayout.this;
                        DXRefreshLayout.access$401(dXRefreshLayout6, MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 2, dXRefreshLayout6.mLastTouchX, dXRefreshLayout6.mLastTouchY + dXRefreshLayout6.mSpinner, 0));
                    }
                    DXRefreshLayout dXRefreshLayout7 = DXRefreshLayout.this;
                    if (dXRefreshLayout7.mNestedInProgress) {
                        dXRefreshLayout7.mTotalUnconsumed = 0;
                        DXRefreshLayout.access$501(dXRefreshLayout7, MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 1, dXRefreshLayout7.mLastTouchX, dXRefreshLayout7.mLastTouchY, 0));
                        DXRefreshLayout dXRefreshLayout8 = DXRefreshLayout.this;
                        dXRefreshLayout8.mNestedInProgress = false;
                        dXRefreshLayout8.mTouchSpinner = 0;
                    }
                }
                DXRefreshLayout dXRefreshLayout9 = DXRefreshLayout.this;
                int i2 = dXRefreshLayout9.mSpinner;
                if (i2 > 0) {
                    ValueAnimator animSpinner = dXRefreshLayout9.animSpinner(0, b, dXRefreshLayout9.mReboundInterpolator, dXRefreshLayout9.mReboundDuration);
                    DXRefreshLayout dXRefreshLayout10 = DXRefreshLayout.this;
                    if (dXRefreshLayout10.mEnableScrollContentWhenRefreshed) {
                        animatorUpdateListener = dXRefreshLayout10.mRefreshContent.b(dXRefreshLayout10.mSpinner);
                    }
                    if (animSpinner != null && animatorUpdateListener != null) {
                        animSpinner.addUpdateListener(animatorUpdateListener);
                    }
                } else if (i2 < 0) {
                    dXRefreshLayout9.animSpinner(0, b, dXRefreshLayout9.mReboundInterpolator, dXRefreshLayout9.mReboundDuration);
                } else {
                    dXRefreshLayout9.mKernel.c(0, false);
                    DXRefreshLayout.this.mKernel.d(DXRefreshState.None);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f7499a;
        public final /* synthetic */ int b;
        public final /* synthetic */ boolean c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                DXRefreshLayout dXRefreshLayout = DXRefreshLayout.this;
                if (dXRefreshLayout.reboundAnimator != null && dXRefreshLayout.mRefreshHeader != null) {
                    dXRefreshLayout.mKernel.c(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b extends AnimatorListenerAdapter {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/refresh/layout/DXRefreshLayout$5$2");
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (animator == null || animator.getDuration() != 0) {
                    DXRefreshLayout dXRefreshLayout = DXRefreshLayout.this;
                    dXRefreshLayout.reboundAnimator = null;
                    if (dXRefreshLayout.mRefreshHeader != null) {
                        DXRefreshState dXRefreshState = dXRefreshLayout.mState;
                        DXRefreshState dXRefreshState2 = DXRefreshState.ReleaseToRefresh;
                        if (dXRefreshState != dXRefreshState2) {
                            dXRefreshLayout.mKernel.d(dXRefreshState2);
                        }
                        e eVar = e.this;
                        DXRefreshLayout.this.setStateRefreshing(!eVar.c);
                        return;
                    }
                    dXRefreshLayout.mKernel.d(DXRefreshState.None);
                }
            }
        }

        public e(float f, int i, boolean z) {
            this.f7499a = f;
            this.b = i;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            DXRefreshLayout dXRefreshLayout;
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DXRefreshLayout dXRefreshLayout2 = DXRefreshLayout.this;
            if (dXRefreshLayout2.mViceState == DXRefreshState.Refreshing) {
                ValueAnimator valueAnimator = dXRefreshLayout2.reboundAnimator;
                if (valueAnimator != null) {
                    valueAnimator.setDuration(0L);
                    DXRefreshLayout.this.reboundAnimator.cancel();
                    DXRefreshLayout.this.reboundAnimator = null;
                }
                DXRefreshLayout.this.mLastTouchX = dXRefreshLayout.getMeasuredWidth() / 2.0f;
                DXRefreshLayout.this.mKernel.d(DXRefreshState.PullDownToRefresh);
                DXRefreshLayout dXRefreshLayout3 = DXRefreshLayout.this;
                int i = dXRefreshLayout3.mHeaderHeight;
                if (i == 0) {
                    f = dXRefreshLayout3.mHeaderTriggerRate;
                } else {
                    f = i;
                }
                float f2 = this.f7499a;
                if (f2 < 10.0f) {
                    f2 *= f;
                }
                dXRefreshLayout3.reboundAnimator = ValueAnimator.ofInt(dXRefreshLayout3.mSpinner, (int) f2);
                DXRefreshLayout.this.reboundAnimator.setDuration(this.b);
                DXRefreshLayout.this.reboundAnimator.setInterpolator(new ha6(0));
                DXRefreshLayout.this.reboundAnimator.addUpdateListener(new a());
                DXRefreshLayout.this.reboundAnimator.addListener(new b());
                DXRefreshLayout.this.reboundAnimator.start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static /* synthetic */ class f {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$dinamicx$widget$refresh$layout$constant$DXRefreshState;

        static {
            int[] iArr = new int[DXRefreshState.values().length];
            $SwitchMap$com$taobao$android$dinamicx$widget$refresh$layout$constant$DXRefreshState = iArr;
            try {
                iArr[DXRefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$dinamicx$widget$refresh$layout$constant$DXRefreshState[DXRefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$dinamicx$widget$refresh$layout$constant$DXRefreshState[DXRefreshState.ReleaseToRefresh.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$dinamicx$widget$refresh$layout$constant$DXRefreshState[DXRefreshState.ReleaseToTwoLevel.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$dinamicx$widget$refresh$layout$constant$DXRefreshState[DXRefreshState.RefreshReleased.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$android$dinamicx$widget$refresh$layout$constant$DXRefreshState[DXRefreshState.Refreshing.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int c;
        public float f;

        /* renamed from: a  reason: collision with root package name */
        public int f7502a = 0;
        public int b = 10;
        public float e = 0.0f;
        public long d = AnimationUtils.currentAnimationTimeMillis();

        static {
            t2o.a(444597631);
        }

        public g(float f, int i) {
            this.f = f;
            this.c = i;
            DXRefreshLayout.this.mHandler.postDelayed(this, this.b);
            if (f > 0.0f) {
                DXRefreshLayout.this.mKernel.d(DXRefreshState.PullDownToRefresh);
            } else {
                DXRefreshLayout.this.mKernel.d(DXRefreshState.PullUpToLoad);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DXRefreshLayout dXRefreshLayout = DXRefreshLayout.this;
            if (dXRefreshLayout.animationRunnable == this && !dXRefreshLayout.mState.isFinishing) {
                if (Math.abs(dXRefreshLayout.mSpinner) < Math.abs(this.c)) {
                    int i = this.f7502a + 1;
                    this.f7502a = i;
                    this.f = (float) (this.f * Math.pow(0.949999988079071d, i * 2));
                } else if (this.c != 0) {
                    int i2 = this.f7502a + 1;
                    this.f7502a = i2;
                    this.f = (float) (this.f * Math.pow(0.44999998807907104d, i2 * 2));
                } else {
                    int i3 = this.f7502a + 1;
                    this.f7502a = i3;
                    this.f = (float) (this.f * Math.pow(0.8500000238418579d, i3 * 2));
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float f = this.f * ((((float) (currentAnimationTimeMillis - this.d)) * 1.0f) / 1000.0f);
                if (Math.abs(f) >= 1.0f) {
                    this.d = currentAnimationTimeMillis;
                    float f2 = this.e + f;
                    this.e = f2;
                    DXRefreshLayout.this.moveSpinnerInfinitely(f2);
                    DXRefreshLayout.this.mHandler.postDelayed(this, this.b);
                    return;
                }
                DXRefreshLayout dXRefreshLayout2 = DXRefreshLayout.this;
                DXRefreshState dXRefreshState = dXRefreshLayout2.mViceState;
                boolean z = dXRefreshState.isDragging;
                if (z && dXRefreshState.isHeader) {
                    dXRefreshLayout2.mKernel.d(DXRefreshState.PullDownCanceled);
                } else if (z && dXRefreshState.isFooter) {
                    dXRefreshLayout2.mKernel.d(DXRefreshState.PullUpCanceled);
                }
                DXRefreshLayout dXRefreshLayout3 = DXRefreshLayout.this;
                dXRefreshLayout3.animationRunnable = null;
                if (Math.abs(dXRefreshLayout3.mSpinner) >= Math.abs(this.c)) {
                    DXRefreshLayout dXRefreshLayout4 = DXRefreshLayout.this;
                    dXRefreshLayout4.animSpinner(this.c, 0, dXRefreshLayout4.mReboundInterpolator, Math.min(Math.max((int) ha6.h(Math.abs(DXRefreshLayout.this.mSpinner - this.c)), 30), 100) * 10);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f7503a;
        public float d;
        public int b = 0;
        public int c = 10;
        public float e = 0.98f;
        public long f = 0;
        public long g = AnimationUtils.currentAnimationTimeMillis();

        static {
            t2o.a(444597632);
        }

        public h(float f) {
            this.d = f;
            this.f7503a = DXRefreshLayout.this.mSpinner;
        }

        public Runnable a() {
            DXRefreshState dXRefreshState;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Runnable) ipChange.ipc$dispatch("1401b0b", new Object[]{this});
            }
            DXRefreshLayout dXRefreshLayout = DXRefreshLayout.this;
            DXRefreshState dXRefreshState2 = dXRefreshLayout.mState;
            if (dXRefreshState2.isFinishing) {
                return null;
            }
            int i2 = dXRefreshLayout.mSpinner;
            if (i2 != 0 && (!dXRefreshState2.isOpening || (dXRefreshState2 == DXRefreshState.Refreshing && i2 > dXRefreshLayout.mHeaderHeight))) {
                float f = this.d;
                int i3 = i2;
                while (true) {
                    if (i2 * i3 <= 0) {
                        break;
                    }
                    i++;
                    f = (float) (f * Math.pow(this.e, (this.c * i) / 10.0f));
                    float f2 = ((this.c * 1.0f) / 1000.0f) * f;
                    if (Math.abs(f2) < 1.0f) {
                        DXRefreshLayout dXRefreshLayout2 = DXRefreshLayout.this;
                        DXRefreshState dXRefreshState3 = dXRefreshLayout2.mState;
                        if (!dXRefreshState3.isOpening || ((dXRefreshState3 == (dXRefreshState = DXRefreshState.Refreshing) && i3 > dXRefreshLayout2.mHeaderHeight) || (dXRefreshState3 != dXRefreshState && i3 < (-dXRefreshLayout2.mFooterHeight)))) {
                            return null;
                        }
                    } else {
                        i3 = (int) (i3 + f2);
                    }
                }
            }
            this.f = AnimationUtils.currentAnimationTimeMillis();
            DXRefreshLayout.this.mHandler.postDelayed(this, this.c);
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DXRefreshLayout dXRefreshLayout = DXRefreshLayout.this;
            if (dXRefreshLayout.animationRunnable == this && !dXRefreshLayout.mState.isFinishing) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float pow = (float) (this.d * Math.pow(this.e, ((float) (currentAnimationTimeMillis - this.f)) / (1000.0f / this.c)));
                this.d = pow;
                float f = pow * ((((float) (currentAnimationTimeMillis - this.g)) * 1.0f) / 1000.0f);
                if (Math.abs(f) > 1.0f) {
                    this.g = currentAnimationTimeMillis;
                    int i = (int) (this.f7503a + f);
                    this.f7503a = i;
                    DXRefreshLayout dXRefreshLayout2 = DXRefreshLayout.this;
                    if (dXRefreshLayout2.mSpinner * i > 0) {
                        dXRefreshLayout2.mKernel.c(i, true);
                        DXRefreshLayout.this.mHandler.postDelayed(this, this.c);
                        return;
                    }
                    dXRefreshLayout2.animationRunnable = null;
                    dXRefreshLayout2.mKernel.c(0, true);
                    ha6.d(DXRefreshLayout.this.mRefreshContent.i(), (int) (-this.d));
                    DXRefreshLayout dXRefreshLayout3 = DXRefreshLayout.this;
                    if (dXRefreshLayout3.mFooterLocked && f > 0.0f) {
                        dXRefreshLayout3.mFooterLocked = false;
                        return;
                    }
                    return;
                }
                DXRefreshLayout.this.animationRunnable = null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597634);
        }

        public i() {
        }

        public ValueAnimator a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ValueAnimator) ipChange.ipc$dispatch("2fe7d2f8", new Object[]{this, new Integer(i)});
            }
            DXRefreshLayout dXRefreshLayout = DXRefreshLayout.this;
            return dXRefreshLayout.animSpinner(i, 0, dXRefreshLayout.mReboundInterpolator, dXRefreshLayout.mReboundDuration);
        }

        public i b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i) ipChange.ipc$dispatch("ab89d417", new Object[]{this});
            }
            DXRefreshLayout dXRefreshLayout = DXRefreshLayout.this;
            if (dXRefreshLayout.mState == DXRefreshState.TwoLevel) {
                dXRefreshLayout.mKernel.d(DXRefreshState.TwoLevelFinish);
                if (DXRefreshLayout.this.mSpinner == 0) {
                    c(0, false);
                    DXRefreshLayout.this.notifyStateChanged(DXRefreshState.None);
                } else {
                    a(0).setDuration(DXRefreshLayout.this.mFloorDuration);
                }
            }
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:72:0x00f8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.i c(int r13, boolean r14) {
            /*
                Method dump skipped, instructions count: 545
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.i.c(int, boolean):com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout$i");
        }

        public i d(DXRefreshState dXRefreshState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i) ipChange.ipc$dispatch("d30679b4", new Object[]{this, dXRefreshState});
            }
            if (dXRefreshState.isPullDownLoadState()) {
                DXRefreshLayout.this.notifyStateChanged(dXRefreshState);
                return null;
            }
            switch (f.$SwitchMap$com$taobao$android$dinamicx$widget$refresh$layout$constant$DXRefreshState[dXRefreshState.ordinal()]) {
                case 1:
                    DXRefreshLayout dXRefreshLayout = DXRefreshLayout.this;
                    DXRefreshState dXRefreshState2 = dXRefreshLayout.mState;
                    DXRefreshState dXRefreshState3 = DXRefreshState.None;
                    if (dXRefreshState2 == dXRefreshState3 || dXRefreshLayout.mSpinner != 0) {
                        if (dXRefreshLayout.mSpinner != 0) {
                            a(0);
                            break;
                        }
                    } else {
                        dXRefreshLayout.notifyStateChanged(dXRefreshState3);
                        break;
                    }
                    break;
                case 2:
                    DXRefreshLayout dXRefreshLayout2 = DXRefreshLayout.this;
                    if (!dXRefreshLayout2.mState.isOpening && dXRefreshLayout2.isEnableRefreshOrLoadMore(dXRefreshLayout2.mEnableRefresh)) {
                        DXRefreshLayout.this.notifyStateChanged(DXRefreshState.PullDownToRefresh);
                        break;
                    } else {
                        DXRefreshLayout.this.setViceState(DXRefreshState.PullDownToRefresh);
                        break;
                    }
                    break;
                case 3:
                    DXRefreshLayout dXRefreshLayout3 = DXRefreshLayout.this;
                    if (!dXRefreshLayout3.mState.isOpening && dXRefreshLayout3.isEnableRefreshOrLoadMore(dXRefreshLayout3.mEnableRefresh)) {
                        DXRefreshLayout.this.notifyStateChanged(DXRefreshState.ReleaseToRefresh);
                        break;
                    } else {
                        DXRefreshLayout.this.setViceState(DXRefreshState.ReleaseToRefresh);
                        break;
                    }
                    break;
                case 4:
                    DXRefreshLayout dXRefreshLayout4 = DXRefreshLayout.this;
                    if (!dXRefreshLayout4.mState.isOpening && dXRefreshLayout4.isEnableRefreshOrLoadMore(dXRefreshLayout4.mEnableRefresh)) {
                        DXRefreshLayout.this.notifyStateChanged(DXRefreshState.ReleaseToTwoLevel);
                        break;
                    } else {
                        DXRefreshLayout.this.setViceState(DXRefreshState.ReleaseToTwoLevel);
                        break;
                    }
                    break;
                case 5:
                    DXRefreshLayout dXRefreshLayout5 = DXRefreshLayout.this;
                    if (!dXRefreshLayout5.mState.isOpening && dXRefreshLayout5.isEnableRefreshOrLoadMore(dXRefreshLayout5.mEnableRefresh)) {
                        DXRefreshLayout.this.notifyStateChanged(DXRefreshState.RefreshReleased);
                        break;
                    } else {
                        DXRefreshLayout.this.setViceState(DXRefreshState.RefreshReleased);
                        break;
                    }
                    break;
                case 6:
                    DXRefreshLayout.this.setStateRefreshing(true);
                    break;
                default:
                    DXRefreshLayout.this.notifyStateChanged(dXRefreshState);
                    break;
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f7505a;
        private int b;
        private int c;
        private final OverScroller d;
        private int e = 10;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Interpolator {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(j jVar, DXRefreshLayout dXRefreshLayout) {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
                }
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        static {
            t2o.a(444597635);
        }

        public j(Context context, int i) {
            OverScroller overScroller = new OverScroller(context, new a(this, DXRefreshLayout.this));
            this.d = overScroller;
            this.f7505a = DXRefreshLayout.this.mSpinner;
            overScroller.fling(0, 0, 0, i, 0, 0, -2147483647, Integer.MAX_VALUE);
            overScroller.computeScrollOffset();
            DXRefreshLayout.this.mHandler.postDelayed(this, this.e);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35b99284", new Object[]{this});
                return;
            }
            this.d.forceFinished(true);
            DXRefreshLayout.this.animationRunnable = null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
            if (r5.mState.isPullDownLoadState() == false) goto L_0x0077;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r7 = this;
                r0 = 0
                r1 = 1
                com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.j.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x0012
                java.lang.String r3 = "5c510192"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r7
                r2.ipc$dispatch(r3, r1)
                return
            L_0x0012:
                com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout r2 = com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.this
                java.lang.Runnable r2 = r2.animationRunnable
                if (r2 == r7) goto L_0x0019
                return
            L_0x0019:
                android.widget.OverScroller r2 = r7.d
                boolean r2 = r2.computeScrollOffset()
                r3 = 0
                if (r2 == 0) goto L_0x00af
                android.widget.OverScroller r2 = r7.d
                int r2 = r2.getCurrY()
                int r4 = r7.c
                int r4 = r2 - r4
                r7.c = r2
                int r2 = r7.f7505a
                int r2 = r2 + r4
                if (r2 <= 0) goto L_0x0077
                com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout r5 = com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.this
                tb.ca6 r5 = r5.mRefreshContent
                if (r5 == 0) goto L_0x0077
                boolean r5 = r5.canRefresh()
                if (r5 == 0) goto L_0x0077
                com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout r5 = com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.this
                boolean r5 = r5.isEnablePullLoadMore()
                if (r5 == 0) goto L_0x004f
                com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout r5 = com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.this
                int r5 = r5.mHeaderHeight
                int r2 = java.lang.Math.min(r2, r5)
            L_0x004f:
                int r5 = r7.f7505a
                if (r5 != r2) goto L_0x0058
                com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout r0 = com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.this
                r0.animationRunnable = r3
                return
            L_0x0058:
                r7.f7505a = r2
                com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout r5 = com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.this
                boolean r5 = r5.isEnablePullLoadMore()
                if (r5 == 0) goto L_0x0070
                com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout r5 = com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.this
                boolean r6 = r5.mEnableAutoPullLoadMore
                if (r6 != 0) goto L_0x0070
                com.taobao.android.dinamicx.widget.refresh.layout.constant.DXRefreshState r5 = r5.mState
                boolean r5 = r5.isPullDownLoadState()
                if (r5 == 0) goto L_0x0077
            L_0x0070:
                com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout r5 = com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.this
                com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout$i r5 = r5.mKernel
                r5.c(r2, r1)
            L_0x0077:
                int r5 = r7.f7505a
                if (r5 < 0) goto L_0x00a4
                if (r2 > 0) goto L_0x00a4
                if (r4 >= 0) goto L_0x00a4
                com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout r2 = com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.this
                r2.animationRunnable = r3
                if (r5 <= 0) goto L_0x008a
                com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout$i r2 = r2.mKernel
                r2.c(r0, r1)
            L_0x008a:
                com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout r0 = com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.this
                tb.ca6 r0 = r0.mRefreshContent
                if (r0 == 0) goto L_0x009e
                android.view.View r0 = r0.i()
                android.widget.OverScroller r2 = r7.d
                float r2 = r2.getCurrVelocity()
                int r2 = (int) r2
                tb.ha6.d(r0, r2)
            L_0x009e:
                android.widget.OverScroller r0 = r7.d
                r0.forceFinished(r1)
                return
            L_0x00a4:
                com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout r0 = com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.this
                android.os.Handler r0 = r0.mHandler
                int r1 = r7.e
                long r1 = (long) r1
                r0.postDelayed(r7, r1)
                goto L_0x00b3
            L_0x00af:
                com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout r0 = com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.this
                r0.animationRunnable = r3
            L_0x00b3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.j.run():void");
        }
    }

    static {
        t2o.a(444597622);
    }

    public DXRefreshLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ boolean access$001(DXRefreshLayout dXRefreshLayout, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4a31faa", new Object[]{dXRefreshLayout, motionEvent})).booleanValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static /* synthetic */ boolean access$101(DXRefreshLayout dXRefreshLayout, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d2fe009", new Object[]{dXRefreshLayout, motionEvent})).booleanValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static /* synthetic */ boolean access$201(DXRefreshLayout dXRefreshLayout, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15bca068", new Object[]{dXRefreshLayout, motionEvent})).booleanValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static /* synthetic */ boolean access$301(DXRefreshLayout dXRefreshLayout, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce4960c7", new Object[]{dXRefreshLayout, motionEvent})).booleanValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static /* synthetic */ boolean access$401(DXRefreshLayout dXRefreshLayout, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86d62126", new Object[]{dXRefreshLayout, motionEvent})).booleanValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static /* synthetic */ boolean access$501(DXRefreshLayout dXRefreshLayout, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f62e185", new Object[]{dXRefreshLayout, motionEvent})).booleanValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private boolean canPullDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39ec2182", new Object[]{this})).booleanValue();
        }
        if (this.mEnableOverScrollDrag || this.mEnableRefresh || isEnablePullLoadMore()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(DXRefreshLayout dXRefreshLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1952076612:
                return new Boolean(super.drawChild((Canvas) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue()));
            case -1838743131:
                super.setMeasuredDimension(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -913029150:
                return new Integer(super.getSuggestedMinimumHeight());
            case 8324447:
                return new Integer(super.getSuggestedMinimumWidth());
            case 64333381:
                return super.getChildAt(((Number) objArr[0]).intValue());
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1502719299:
                return new Integer(super.getChildCount());
            case 1600372231:
                super.bringChildToFront((View) objArr[0]);
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1811093890:
                super.removeView((View) objArr[0]);
                return null;
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            case 2041279898:
                super.requestDisallowInterceptTouchEvent(((Boolean) objArr[0]).booleanValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/refresh/layout/DXRefreshLayout");
        }
    }

    public ValueAnimator animSpinner(int i2, int i3, Interpolator interpolator, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("a830fc91", new Object[]{this, new Integer(i2), new Integer(i3), interpolator, new Integer(i4)});
        }
        if (this.mSpinner == i2) {
            return null;
        }
        ValueAnimator valueAnimator = this.reboundAnimator;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            this.reboundAnimator.cancel();
            this.reboundAnimator = null;
        }
        this.animationRunnable = null;
        ValueAnimator ofInt = ValueAnimator.ofInt(this.mSpinner, i2);
        this.reboundAnimator = ofInt;
        ofInt.setDuration(i4);
        this.reboundAnimator.setInterpolator(interpolator);
        this.reboundAnimator.addListener(new b());
        this.reboundAnimator.addUpdateListener(new c());
        this.reboundAnimator.setStartDelay(i3);
        this.reboundAnimator.start();
        return this.reboundAnimator;
    }

    public void animSpinnerBounce(float f2) {
        DXRefreshState dXRefreshState;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f8aaa9", new Object[]{this, new Float(f2)});
        } else if (this.reboundAnimator != null) {
        } else {
            if (f2 > 0.0f && ((dXRefreshState = this.mState) == DXRefreshState.Refreshing || dXRefreshState == DXRefreshState.TwoLevel)) {
                this.animationRunnable = new g(f2, this.mHeaderHeight);
            } else if (this.mSpinner == 0 && this.mEnableOverScrollBounce) {
                this.animationRunnable = new g(f2, 0);
            }
        }
    }

    public DXRefreshLayout autoPullDownLoadMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("28501ad1", new Object[]{this});
        }
        this.mKernel.d(DXRefreshState.PullDownLoading);
        return this;
    }

    public boolean autoRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c08ce8b7", new Object[]{this})).booleanValue();
        }
        return autoRefresh(this.mAttachedToWindow ? 0 : 400, this.mReboundDuration, (this.mHeaderMaxDragRate + this.mHeaderTriggerRate) / 2.0f, false);
    }

    public boolean autoRefreshAnimationOnly() {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3abad0f", new Object[]{this})).booleanValue();
        }
        if (!this.mAttachedToWindow) {
            i2 = 400;
        }
        return autoRefresh(i2, this.mReboundDuration, (this.mHeaderMaxDragRate + this.mHeaderTriggerRate) / 2.0f, true);
    }

    public DXRefreshLayout closeHeaderOrFooter() {
        DXRefreshState dXRefreshState;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("d82d41a3", new Object[]{this});
        }
        DXRefreshState dXRefreshState2 = this.mState;
        DXRefreshState dXRefreshState3 = DXRefreshState.None;
        if (dXRefreshState2 == dXRefreshState3 && ((dXRefreshState = this.mViceState) == DXRefreshState.Refreshing || dXRefreshState == DXRefreshState.Loading)) {
            this.mViceState = dXRefreshState3;
        }
        if (dXRefreshState2 == DXRefreshState.PullDownLoadNoData) {
            this.mKernel.c(0, true);
            return this;
        }
        if (dXRefreshState2 == DXRefreshState.Refreshing) {
            finishRefresh();
        } else if (this.mKernel.a(0) == null) {
            notifyStateChanged(dXRefreshState3);
        } else if (this.mState.isHeader) {
            notifyStateChanged(DXRefreshState.PullDownCanceled);
        } else {
            notifyStateChanged(DXRefreshState.PullUpCanceled);
        }
        return this;
    }

    @Override // android.view.View
    public void computeScroll() {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        this.mScroller.getCurrY();
        if (this.mScroller.computeScrollOffset()) {
            int finalY = this.mScroller.getFinalY();
            if ((finalY >= 0 || ((!this.mEnableRefresh && !this.mEnableOverScrollDrag) || !this.mRefreshContent.canRefresh())) && (finalY <= 0 || !this.mEnableOverScrollDrag || !this.mRefreshContent.c())) {
                this.mVerticalPermit = true;
                invalidate();
                return;
            }
            if (this.mVerticalPermit) {
                if (finalY > 0) {
                    f2 = -this.mScroller.getCurrVelocity();
                } else {
                    f2 = this.mScroller.getCurrVelocity();
                }
                animSpinnerBounce(f2);
            }
            this.mScroller.forceFinished(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:
        if (r5.isFinishing == false) goto L_0x00c7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c5, code lost:
        if (r5.isHeader == false) goto L_0x00c7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
        if (r5.isFinishing == false) goto L_0x00db;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d7, code lost:
        if (r5.isFooter == false) goto L_0x00db;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0103, code lost:
        if (r9 != 3) goto L_0x02fa;
     */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02ff  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        View view2;
        Paint paint;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ba5acbc", new Object[]{this, canvas, view, new Long(j2)})).booleanValue();
        }
        ca6 ca6Var = this.mRefreshContent;
        if (ca6Var != null) {
            view2 = ca6Var.getView();
        } else {
            view2 = null;
        }
        ba6 ba6Var = this.mRefreshHeader;
        if (ba6Var != null && ba6Var.getView() == view) {
            if ((!isEnableRefreshOrLoadMore(this.mEnableRefresh) && !isEnablePullLoadMore()) || (!this.mEnablePreviewInEditMode && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int max = Math.max(view2.getTop() + view2.getPaddingTop() + this.mSpinner, view.getTop());
                int i2 = this.mHeaderBackgroundColor;
                if (!(i2 == 0 || (paint = this.mPaint) == null)) {
                    paint.setColor(i2);
                    if (this.mRefreshHeader.e().b) {
                        max = view.getBottom();
                    } else if (this.mRefreshHeader.e() == yc6.Translate) {
                        max = view.getBottom() + this.mSpinner;
                    }
                    canvas.drawRect(0.0f, view.getTop(), getWidth(), max, this.mPaint);
                }
                if ((this.mEnableClipHeaderWhenFixedBehind && this.mRefreshHeader.e() == yc6.FixedBehind) || this.mRefreshHeader.e().b) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), max);
                    boolean drawChild = super.drawChild(canvas, view, j2);
                    canvas.restore();
                    return drawChild;
                }
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    public DXRefreshLayout failPullDownLoadMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("85e9cf00", new Object[]{this});
        }
        this.mKernel.d(DXRefreshState.PullDownLoadFail);
        return this;
    }

    public DXRefreshLayout finishPullDownLoadMore() {
        int i2;
        ca6 ca6Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("9bf0a6b5", new Object[]{this});
        }
        ba6 ba6Var = this.mRefreshHeader;
        if (ba6Var != null) {
            i2 = ba6Var.b(this, true);
        } else {
            i2 = 0;
        }
        if (i2 < Integer.MAX_VALUE) {
            if (this.mIsBeingDragged || this.mNestedInProgress) {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.mIsBeingDragged) {
                    float f2 = this.mLastTouchY;
                    this.mTouchY = f2;
                    this.mTouchSpinner = 0;
                    this.mIsBeingDragged = false;
                    access$001(this, MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 0, this.mLastTouchX, (f2 + this.mSpinner) - (this.mTouchSlop * 2), 0));
                    access$101(this, MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 2, this.mLastTouchX, this.mLastTouchY + this.mSpinner, 0));
                }
                if (this.mNestedInProgress) {
                    this.mTotalUnconsumed = 0;
                    access$201(this, MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 1, this.mLastTouchX, this.mLastTouchY, 0));
                    this.mNestedInProgress = false;
                    this.mTouchSpinner = 0;
                }
            }
            if (this.mEnableScrollContentWhenRefreshed && (ca6Var = this.mRefreshContent) != null) {
                ca6Var.g(this.mSpinner);
            }
            this.mKernel.c(0, true);
            this.mKernel.d(DXRefreshState.None);
        }
        return this;
    }

    public DXRefreshLayout finishRefresh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRefreshLayout) ipChange.ipc$dispatch("55fb188", new Object[]{this}) : finishRefresh(true);
    }

    public DXRefreshLayout finishRefreshWithNoMoreData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("f46a4e0e", new Object[]{this});
        }
        return finishRefresh(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.mLastOpenTime))), 300) << 16, true, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("84bf71af", new Object[]{this, attributeSet});
        }
        return new LayoutParams(getContext(), attributeSet);
    }

    public ViewGroup getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("7c097b8e", new Object[]{this});
        }
        return this;
    }

    public ea6 getRefreshHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ea6) ipChange.ipc$dispatch("39033d24", new Object[]{this});
        }
        ba6 ba6Var = this.mRefreshHeader;
        if (ba6Var instanceof ea6) {
            return (ea6) ba6Var;
        }
        return null;
    }

    public DXRefreshState getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshState) ipChange.ipc$dispatch("b7157d97", new Object[]{this});
        }
        return this.mState;
    }

    public boolean interceptAnimatorByAction(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ac92ca", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        if (i2 == 0) {
            if (this.reboundAnimator != null) {
                DXRefreshState dXRefreshState = this.mState;
                if (dXRefreshState.isFinishing || dXRefreshState == DXRefreshState.TwoLevelReleased || dXRefreshState == DXRefreshState.RefreshReleased || dXRefreshState == DXRefreshState.LoadReleased) {
                    return true;
                }
                if (dXRefreshState == DXRefreshState.PullDownCanceled) {
                    this.mKernel.d(DXRefreshState.PullDownToRefresh);
                } else if (dXRefreshState == DXRefreshState.PullUpCanceled) {
                    this.mKernel.d(DXRefreshState.PullUpToLoad);
                }
                this.reboundAnimator.setDuration(0L);
                this.reboundAnimator.cancel();
                this.reboundAnimator = null;
            }
            this.animationRunnable = null;
        }
        if (this.reboundAnimator != null) {
            return true;
        }
        return false;
    }

    public boolean isEnablePullLoadMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5db1d4b8", new Object[]{this})).booleanValue();
        }
        return this.mEnablePullLoadMore;
    }

    public boolean isEnableRefreshOrLoadMore(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc0c28e5", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!z || this.mEnablePureScrollMode) {
            return false;
        }
        return true;
    }

    public boolean isEnableTranslationContent(boolean z, ba6 ba6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("766667c7", new Object[]{this, new Boolean(z), ba6Var})).booleanValue();
        }
        if (z || this.mEnablePureScrollMode || ba6Var == null || ba6Var.e() == yc6.FixedBehind) {
            return true;
        }
        return false;
    }

    public boolean isPullDownLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5c2ef36", new Object[]{this})).booleanValue();
        }
        if (this.mState == DXRefreshState.PullDownLoading) {
            return true;
        }
        return false;
    }

    public boolean isPullDownNoData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e047fec7", new Object[]{this})).booleanValue();
        }
        if (this.mState == DXRefreshState.PullDownLoadNoData) {
            return true;
        }
        return false;
    }

    public boolean isRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56d673fc", new Object[]{this})).booleanValue();
        }
        if (this.mState == DXRefreshState.Refreshing) {
            return true;
        }
        return false;
    }

    public void moveSpinnerInfinitely(float f2) {
        double d2;
        double d3;
        double d4;
        float f3 = f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cace3f0", new Object[]{this, new Float(f3)});
            return;
        }
        if (this.mNestedInProgress && !this.mEnableLoadMoreWhenContentNotFull && f3 < 0.0f && !this.mRefreshContent.c()) {
            f3 = 0.0f;
        }
        DXRefreshState dXRefreshState = this.mState;
        if (dXRefreshState == DXRefreshState.TwoLevel && f3 > 0.0f) {
            this.mKernel.c(Math.min((int) f3, getMeasuredHeight()), true);
        } else if (dXRefreshState == DXRefreshState.Refreshing && f3 >= 0.0f) {
            int i2 = this.mHeaderHeight;
            if (f3 < i2) {
                this.mKernel.c((int) f3, true);
                return;
            }
            float f4 = this.mHeaderMaxDragRate;
            if (f4 < 10.0f) {
                f4 *= i2;
            }
            double d5 = f4 - i2;
            int max = Math.max((this.mScreenHeightPixels * 4) / 3, getHeight());
            int i3 = this.mHeaderHeight;
            double d6 = max - i3;
            double max2 = Math.max(0.0f, (f3 - i3) * this.mDragRate);
            double d7 = -max2;
            if (d6 == vu3.b.GEO_NOT_SUPPORT) {
                d6 = 1.0d;
            }
            this.mKernel.c(((int) Math.min(d5 * (1.0d - Math.pow(100.0d, d7 / d6)), max2)) + this.mHeaderHeight, true);
        } else if (f3 < 0.0f) {
            float f5 = this.mFooterMaxDragRate;
            if (f5 < 10.0f) {
                d2 = this.mFooterHeight * f5;
            } else {
                d2 = f5;
            }
            double max3 = Math.max(this.mScreenHeightPixels / 2, getHeight());
            double d8 = -Math.min(0.0f, f3 * this.mDragRate);
            double d9 = -d8;
            if (max3 == vu3.b.GEO_NOT_SUPPORT) {
                d3 = 1.0d;
            } else {
                d3 = max3;
            }
            this.mKernel.c((int) (-Math.min(d2 * (1.0d - Math.pow(100.0d, d9 / d3)), d8)), true);
        } else if (!isEnablePullLoadMore()) {
            float f6 = this.mHeaderMaxDragRate;
            if (f6 < 10.0f) {
                d4 = this.mHeaderHeight * f6;
            } else {
                d4 = f6;
            }
            double max4 = Math.max(this.mScreenHeightPixels / 2, getHeight());
            double max5 = Math.max(0.0f, f3 * this.mDragRate);
            double d10 = -max5;
            if (max4 == vu3.b.GEO_NOT_SUPPORT) {
                max4 = 1.0d;
            }
            this.mKernel.c((int) Math.min(d4 * (1.0d - Math.pow(100.0d, d10 / max4)), max5), true);
        } else if (this.mEnableAutoPullLoadMore || this.mState.isPullDownLoadState()) {
            this.mKernel.c(Math.min((int) f3, this.mHeaderHeight), true);
        }
    }

    public DXRefreshLayout noDataPullDownLoadMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("210bd92d", new Object[]{this});
        }
        this.mKernel.d(DXRefreshState.PullDownLoadNoData);
        this.mKernel.c(0, true);
        return this;
    }

    public void notifyStateChanged(DXRefreshState dXRefreshState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b31d2", new Object[]{this, dXRefreshState});
            return;
        }
        DXRefreshState dXRefreshState2 = this.mState;
        if (dXRefreshState2 != dXRefreshState) {
            this.mState = dXRefreshState;
            this.mViceState = dXRefreshState;
            ba6 ba6Var = this.mRefreshHeader;
            if (ba6Var != null) {
                ba6Var.d(this, dXRefreshState2, dXRefreshState);
            }
            if (dXRefreshState == DXRefreshState.LoadFinish) {
                this.mFooterLocked = false;
            }
        } else if (this.mViceState != dXRefreshState2) {
            this.mViceState = dXRefreshState2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ba6 ba6Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        if (!isInEditMode()) {
            if (this.mRefreshContent == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    ba6 ba6Var2 = this.mRefreshHeader;
                    if (ba6Var2 == null || childAt != ba6Var2.getView()) {
                        this.mRefreshContent = new da6(childAt);
                    }
                }
            }
            if (this.mRefreshContent == null) {
                int c2 = ha6.c(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(R.string.dx_refresh_layout_content_empty);
                super.addView(textView, 0, new LayoutParams(-1, -1));
                da6 da6Var = new da6(textView);
                this.mRefreshContent = da6Var;
                da6Var.getView().setPadding(c2, c2, c2, c2);
            }
            this.mRefreshContent.h(this.mScrollBoundaryDecider);
            this.mRefreshContent.d(this.mEnableLoadMoreWhenContentNotFull);
            this.mRefreshContent.e(this.mKernel, null, null);
            if (this.mSpinner != 0) {
                notifyStateChanged(DXRefreshState.None);
                ca6 ca6Var = this.mRefreshContent;
                this.mSpinner = 0;
                ca6Var.f(0, -1, -1);
            }
        }
        int[] iArr = this.mPrimaryColors;
        if (!(iArr == null || (ba6Var = this.mRefreshHeader) == null)) {
            ba6Var.a(iArr);
        }
        ca6 ca6Var2 = this.mRefreshContent;
        if (ca6Var2 != null) {
            super.bringChildToFront(ca6Var2.getView());
        }
        ba6 ba6Var3 = this.mRefreshHeader;
        if (ba6Var3 != null && ba6Var3.e().f31977a) {
            super.bringChildToFront(this.mRefreshHeader.getView());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mAttachedToWindow = false;
        this.mManualLoadMore = true;
        this.animationRunnable = null;
        ValueAnimator valueAnimator = this.reboundAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.reboundAnimator.removeAllUpdateListeners();
            this.reboundAnimator.setDuration(0L);
            this.reboundAnimator.cancel();
            this.reboundAnimator = null;
        }
        ba6 ba6Var = this.mRefreshHeader;
        if (ba6Var != null && this.mState == DXRefreshState.Refreshing) {
            ba6Var.b(this, false);
        }
        if (this.mSpinner != 0) {
            this.mKernel.c(0, true);
        }
        DXRefreshState dXRefreshState = this.mState;
        DXRefreshState dXRefreshState2 = DXRefreshState.None;
        if (dXRefreshState != dXRefreshState2) {
            notifyStateChanged(dXRefreshState2);
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.mFooterLocked = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = super.getChildAt(i6);
            if (childAt.getVisibility() != 8 && !"GONE".equals(childAt.getTag(R.id.dx_refresh_layout_tag))) {
                ca6 ca6Var = this.mRefreshContent;
                if (ca6Var != null && ca6Var.getView() == childAt) {
                    if (!isInEditMode() || !this.mEnablePreviewInEditMode || ((!isEnableRefreshOrLoadMore(this.mEnableRefresh) && !isEnablePullLoadMore()) || this.mRefreshHeader == null)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    View view = this.mRefreshContent.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                    } else {
                        marginLayoutParams2 = sDefaultMarginLP;
                    }
                    int i7 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i8 = marginLayoutParams2.topMargin + paddingTop;
                    int measuredWidth = view.getMeasuredWidth() + i7;
                    int measuredHeight = view.getMeasuredHeight() + i8;
                    if (z3 && isEnableTranslationContent(this.mEnableHeaderTranslationContent, this.mRefreshHeader)) {
                        int i9 = this.mHeaderHeight;
                        i8 += i9;
                        measuredHeight += i9;
                    }
                    view.layout(i7, i8, measuredWidth, measuredHeight);
                }
                ba6 ba6Var = this.mRefreshHeader;
                if (ba6Var != null && ba6Var.getView() == childAt) {
                    if (!isInEditMode() || !this.mEnablePreviewInEditMode || (!isEnableRefreshOrLoadMore(this.mEnableRefresh) && !isEnablePullLoadMore())) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    View view2 = this.mRefreshHeader.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    } else {
                        marginLayoutParams = sDefaultMarginLP;
                    }
                    int i10 = marginLayoutParams.leftMargin;
                    int i11 = marginLayoutParams.topMargin + this.mHeaderInsetStart;
                    int measuredWidth2 = view2.getMeasuredWidth() + i10;
                    int measuredHeight2 = view2.getMeasuredHeight() + i11;
                    if (!z2 && this.mRefreshHeader.e() == yc6.Translate) {
                        i11 -= view2.getMeasuredHeight();
                        measuredHeight2 = 0;
                    }
                    view2.layout(i10, i11, measuredWidth2, measuredHeight2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.onMeasure(int, int):void");
    }

    public void overSpinner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fe860ac", new Object[]{this});
        } else if (!isEnablePullLoadMore()) {
            DXRefreshState dXRefreshState = this.mState;
            if (dXRefreshState != DXRefreshState.TwoLevel) {
                DXRefreshState dXRefreshState2 = DXRefreshState.Refreshing;
                if (dXRefreshState == dXRefreshState2) {
                    int i2 = this.mSpinner;
                    int i3 = this.mHeaderHeight;
                    if (i2 > i3) {
                        this.mKernel.a(i3);
                    } else if (i2 < 0) {
                        this.mKernel.a(0);
                    }
                } else if (dXRefreshState == DXRefreshState.PullDownToRefresh) {
                    this.mKernel.d(DXRefreshState.PullDownCanceled);
                } else if (dXRefreshState == DXRefreshState.PullUpToLoad) {
                    this.mKernel.d(DXRefreshState.PullUpCanceled);
                } else if (dXRefreshState == DXRefreshState.ReleaseToRefresh) {
                    this.mKernel.d(dXRefreshState2);
                } else if (dXRefreshState == DXRefreshState.ReleaseToLoad) {
                    this.mKernel.d(DXRefreshState.Loading);
                } else if (dXRefreshState == DXRefreshState.ReleaseToTwoLevel) {
                    this.mKernel.d(DXRefreshState.TwoLevelReleased);
                } else if (dXRefreshState == DXRefreshState.RefreshReleased) {
                    if (this.reboundAnimator == null) {
                        this.mKernel.a(this.mHeaderHeight);
                    }
                } else if (dXRefreshState == DXRefreshState.LoadReleased) {
                    if (this.reboundAnimator == null) {
                        this.mKernel.a(-this.mFooterHeight);
                    }
                } else if (dXRefreshState != DXRefreshState.LoadFinish && this.mSpinner != 0) {
                    this.mKernel.a(0);
                }
            } else if (this.mCurrentVelocity > -1000 && this.mSpinner > getHeight() / 2) {
                ValueAnimator a2 = this.mKernel.a(getHeight());
                if (a2 != null) {
                    a2.setDuration(this.mFloorDuration);
                }
            } else if (this.mIsBeingDragged) {
                this.mKernel.b();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ab759a", new Object[]{this, new Boolean(z)});
        } else if (ViewCompat.isNestedScrollingEnabled(this.mRefreshContent.i())) {
            this.mEnableDisallowIntercept = z;
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public DXRefreshLayout resetNoMoreData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("e3d21daf", new Object[]{this});
        }
        return setNoMoreData(false);
    }

    public DXRefreshLayout setDisableContentWhenLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("46b9b1d7", new Object[]{this, new Boolean(z)});
        }
        this.mDisableContentWhenLoading = z;
        return this;
    }

    public DXRefreshLayout setDisableContentWhenRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("ee6d3758", new Object[]{this, new Boolean(z)});
        }
        this.mDisableContentWhenRefresh = z;
        return this;
    }

    public DXRefreshLayout setDragRate(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("34e08c5c", new Object[]{this, new Float(f2)});
        }
        this.mDragRate = f2;
        return this;
    }

    public DXRefreshLayout setEnableAutoLoadMore(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("8efd89b7", new Object[]{this, new Boolean(z)});
        }
        this.mEnableAutoLoadMore = z;
        return this;
    }

    public DXRefreshLayout setEnableAutoPullLoadMore(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("7af9a2b2", new Object[]{this, new Boolean(z)});
        }
        this.mEnableAutoPullLoadMore = z;
        return this;
    }

    public DXRefreshLayout setEnableClipFooterWhenFixedBehind(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("e43360c2", new Object[]{this, new Boolean(z)});
        }
        this.mEnableClipFooterWhenFixedBehind = z;
        return this;
    }

    public DXRefreshLayout setEnableClipHeaderWhenFixedBehind(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("852edc34", new Object[]{this, new Boolean(z)});
        }
        this.mEnableClipHeaderWhenFixedBehind = z;
        return this;
    }

    public DXRefreshLayout setEnableFooterFollowWhenNoMoreData(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("6106f67b", new Object[]{this, new Boolean(z)});
        }
        this.mEnableFooterFollowWhenNoMoreData = z;
        return this;
    }

    public DXRefreshLayout setEnableFooterTranslationContent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("e0837dbe", new Object[]{this, new Boolean(z)});
        }
        this.mEnableFooterTranslationContent = z;
        this.mManualFooterTranslationContent = true;
        return this;
    }

    public DXRefreshLayout setEnableHeaderTranslationContent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("91c5f50c", new Object[]{this, new Boolean(z)});
        }
        this.mEnableHeaderTranslationContent = z;
        this.mManualHeaderTranslationContent = true;
        return this;
    }

    public DXRefreshLayout setEnableLoadMore(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("70db80e6", new Object[]{this, new Boolean(z)});
        }
        this.mManualLoadMore = true;
        this.mEnableLoadMore = z;
        return this;
    }

    public DXRefreshLayout setEnableLoadMoreWhenContentNotFull(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("b4d77843", new Object[]{this, new Boolean(z)});
        }
        this.mEnableLoadMoreWhenContentNotFull = z;
        ca6 ca6Var = this.mRefreshContent;
        if (ca6Var != null) {
            ca6Var.d(z);
        }
        return this;
    }

    public DXRefreshLayout setEnableOverScrollBounce(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("ef6f4d8", new Object[]{this, new Boolean(z)});
        }
        this.mEnableOverScrollBounce = z;
        return this;
    }

    public DXRefreshLayout setEnableOverScrollDrag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("eb85db2c", new Object[]{this, new Boolean(z)});
        }
        this.mEnableOverScrollDrag = z;
        return this;
    }

    public DXRefreshLayout setEnablePullLoadMore(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("c19a6a61", new Object[]{this, new Boolean(z)});
        }
        this.mEnablePullLoadMore = z;
        if (z) {
            setEnableRefresh(false);
        }
        return this;
    }

    public DXRefreshLayout setEnablePureScrollMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("50157639", new Object[]{this, new Boolean(z)});
        }
        this.mEnablePureScrollMode = z;
        return this;
    }

    public DXRefreshLayout setEnableRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("37d3fa90", new Object[]{this, new Boolean(z)});
        }
        this.mEnableRefresh = z;
        if (z) {
            setEnablePullLoadMore(false);
        }
        return this;
    }

    public DXRefreshLayout setEnableScrollContentWhenLoaded(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("261a6380", new Object[]{this, new Boolean(z)});
        }
        this.mEnableScrollContentWhenLoaded = z;
        return this;
    }

    public DXRefreshLayout setEnableScrollContentWhenRefreshed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("f5398a4d", new Object[]{this, new Boolean(z)});
        }
        this.mEnableScrollContentWhenRefreshed = z;
        return this;
    }

    public DXRefreshLayout setHeaderHeight(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("bd5f137c", new Object[]{this, new Float(f2)});
        }
        return setHeaderHeightPx(ha6.c(f2));
    }

    public DXRefreshLayout setHeaderHeightPx(int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("733c7857", new Object[]{this, new Integer(i2)});
        }
        if (i2 == this.mHeaderHeight) {
            return this;
        }
        iu5 iu5Var = this.mHeaderHeightStatus;
        iu5 iu5Var2 = iu5.CodeExact;
        if (iu5Var.a(iu5Var2)) {
            this.mHeaderHeight = i2;
            ba6 ba6Var = this.mRefreshHeader;
            if (ba6Var == null || !this.mAttachedToWindow || !this.mHeaderHeightStatus.b) {
                this.mHeaderHeightStatus = iu5.CodeExactUnNotify;
            } else {
                yc6 e2 = ba6Var.e();
                if (e2 != yc6.MatchLayout && !e2.b) {
                    View view = this.mRefreshHeader.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    } else {
                        marginLayoutParams = sDefaultMarginLP;
                    }
                    view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((this.mHeaderHeight - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                    int i4 = marginLayoutParams.leftMargin;
                    int i5 = marginLayoutParams.topMargin + this.mHeaderInsetStart;
                    if (e2 == yc6.Translate) {
                        i3 = this.mHeaderHeight;
                    }
                    int i6 = i5 - i3;
                    view.layout(i4, i6, view.getMeasuredWidth() + i4, view.getMeasuredHeight() + i6);
                }
                float f2 = this.mHeaderMaxDragRate;
                if (f2 < 10.0f) {
                    f2 *= this.mHeaderHeight;
                }
                this.mHeaderHeightStatus = iu5Var2;
                this.mRefreshHeader.f(this.mKernel, this.mHeaderHeight, (int) f2);
            }
        }
        return this;
    }

    public DXRefreshLayout setHeaderInsetStart(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("3cecf91e", new Object[]{this, new Float(f2)});
        }
        this.mHeaderInsetStart = ha6.c(f2);
        return this;
    }

    public DXRefreshLayout setHeaderInsetStartPx(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("46e77d79", new Object[]{this, new Integer(i2)});
        }
        this.mHeaderInsetStart = i2;
        return this;
    }

    public DXRefreshLayout setHeaderMaxDragRate(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("675ea709", new Object[]{this, new Float(f2)});
        }
        this.mHeaderMaxDragRate = f2;
        ba6 ba6Var = this.mRefreshHeader;
        if (ba6Var == null || !this.mAttachedToWindow) {
            this.mHeaderHeightStatus = this.mHeaderHeightStatus.c();
        } else {
            if (f2 < 10.0f) {
                f2 *= this.mHeaderHeight;
            }
            ba6Var.f(this.mKernel, this.mHeaderHeight, (int) f2);
        }
        return this;
    }

    public DXRefreshLayout setHeaderTriggerRate(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("56c5a609", new Object[]{this, new Float(f2)});
        }
        this.mHeaderTriggerRate = f2;
        return this;
    }

    public DXRefreshLayout setNoMoreData(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("cb20a424", new Object[]{this, new Boolean(z)});
        }
        if (this.mState == DXRefreshState.Refreshing && z) {
            finishRefreshWithNoMoreData();
        } else if (this.mFooterNoMoreData != z) {
            this.mFooterNoMoreData = z;
        }
        return this;
    }

    public DXRefreshLayout setOnRefreshListener(ntk ntkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("ef82c1cf", new Object[]{this, ntkVar});
        }
        this.mRefreshListener = ntkVar;
        return this;
    }

    public DXRefreshLayout setReboundDuration(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("3788be98", new Object[]{this, new Integer(i2)});
        }
        this.mReboundDuration = i2;
        return this;
    }

    public DXRefreshLayout setReboundInterpolator(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("bcd5c5a7", new Object[]{this, interpolator});
        }
        this.mReboundInterpolator = interpolator;
        return this;
    }

    public DXRefreshLayout setRefreshContent(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRefreshLayout) ipChange.ipc$dispatch("eaddea04", new Object[]{this, view}) : setRefreshContent(view, 0, 0);
    }

    public DXRefreshLayout setRefreshHeader(ea6 ea6Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRefreshLayout) ipChange.ipc$dispatch("65b13de7", new Object[]{this, ea6Var}) : setRefreshHeader(ea6Var, 0, 0);
    }

    public DXRefreshLayout setScrollBoundaryDecider(sb6 sb6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("72982403", new Object[]{this, sb6Var});
        }
        this.mScrollBoundaryDecider = sb6Var;
        ca6 ca6Var = this.mRefreshContent;
        if (ca6Var != null) {
            ca6Var.h(sb6Var);
        }
        return this;
    }

    public void setStateDirectLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6c9a9", new Object[]{this, new Boolean(z)});
            return;
        }
        DXRefreshState dXRefreshState = this.mState;
        DXRefreshState dXRefreshState2 = DXRefreshState.Loading;
        if (dXRefreshState != dXRefreshState2) {
            this.mLastOpenTime = System.currentTimeMillis();
            this.mFooterLocked = true;
            notifyStateChanged(dXRefreshState2);
        }
    }

    public void setStateRefreshing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87985717", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = new a(z);
        notifyStateChanged(DXRefreshState.RefreshReleased);
        ValueAnimator a2 = this.mKernel.a(this.mHeaderHeight);
        if (a2 != null) {
            a2.addListener(aVar);
        }
        ba6 ba6Var = this.mRefreshHeader;
        if (ba6Var != null) {
            float f2 = this.mHeaderMaxDragRate;
            if (f2 < 10.0f) {
                f2 *= this.mHeaderHeight;
            }
            ba6Var.c(this, this.mHeaderHeight, (int) f2);
        }
        if (a2 == null) {
            aVar.onAnimationEnd(null);
        }
    }

    public void setViceState(DXRefreshState dXRefreshState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3ade4", new Object[]{this, dXRefreshState});
            return;
        }
        DXRefreshState dXRefreshState2 = this.mState;
        if (dXRefreshState2.isDragging && dXRefreshState2.isHeader != dXRefreshState.isHeader) {
            notifyStateChanged(DXRefreshState.None);
        }
        if (this.mViceState != dXRefreshState) {
            this.mViceState = dXRefreshState;
        }
    }

    public boolean startFlingIfNeed(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("effb4a30", new Object[]{this, new Float(f2)})).booleanValue();
        }
        if (f2 == 0.0f) {
            f2 = this.mCurrentVelocity;
        }
        if (Math.abs(f2) > this.mMinimumVelocity) {
            int i2 = this.mSpinner;
            if (i2 * f2 < 0.0f) {
                DXRefreshState dXRefreshState = this.mState;
                if (dXRefreshState == DXRefreshState.Refreshing || dXRefreshState == DXRefreshState.Loading || (i2 < 0 && this.mFooterNoMoreData)) {
                    this.animationRunnable = new h(f2).a();
                    return true;
                } else if (dXRefreshState.isReleaseToOpening) {
                    return true;
                }
            }
            if (isEnablePullLoadMore() && (this.mViceState.isHeader || (this.mSpinner >= 0 && f2 > 0.0f))) {
                this.animationRunnable = new j(getContext(), (int) f2);
                return true;
            } else if (f2 > 0.0f && ((this.mEnableOverScrollBounce && this.mEnableRefresh) || this.mEnableOverScrollDrag || (this.mState == DXRefreshState.Refreshing && this.mSpinner <= 0))) {
                this.mVerticalPermit = false;
                this.mScroller.fling(0, 0, 0, (int) (-f2), 0, 0, -2147483647, Integer.MAX_VALUE);
                this.mScroller.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    public DXRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFloorDuration = 300;
        this.mReboundDuration = 300;
        this.mDragRate = 0.5f;
        this.mDragDirection = 'n';
        this.mEnableRefresh = true;
        this.mEnableLoadMore = false;
        this.mEnableClipHeaderWhenFixedBehind = true;
        this.mEnableClipFooterWhenFixedBehind = true;
        this.mEnableHeaderTranslationContent = true;
        this.mEnableFooterTranslationContent = true;
        this.mEnableFooterFollowWhenNoMoreData = false;
        this.mEnablePreviewInEditMode = true;
        this.mEnableOverScrollBounce = true;
        this.mEnableOverScrollDrag = false;
        this.mEnableAutoLoadMore = true;
        this.mEnablePureScrollMode = false;
        this.mEnableScrollContentWhenLoaded = true;
        this.mEnableScrollContentWhenRefreshed = true;
        this.mEnableLoadMoreWhenContentNotFull = true;
        this.mEnableNestedScrolling = false;
        this.mDisableContentWhenRefresh = false;
        this.mDisableContentWhenLoading = false;
        this.mFooterNoMoreData = false;
        this.mFooterNoMoreDataEffective = false;
        this.mManualLoadMore = false;
        this.mManualHeaderTranslationContent = false;
        this.mManualFooterTranslationContent = false;
        this.mEnablePullLoadMore = false;
        this.mEnableAutoPullLoadMore = false;
        this.mParentOffsetInWindow = new int[2];
        this.mNestedChild = new NestedScrollingChildHelper(this);
        this.mNestedParent = new NestedScrollingParentHelper(this);
        iu5 iu5Var = iu5.DefaultUnNotify;
        this.mHeaderHeightStatus = iu5Var;
        this.mFooterHeightStatus = iu5Var;
        this.mHeaderMaxDragRate = 2.5f;
        this.mFooterMaxDragRate = 2.5f;
        this.mHeaderTriggerRate = 1.0f;
        this.mFooterTriggerRate = 1.0f;
        this.mTwoLevelBottomPullUpToCloseRate = 0.16666667f;
        this.mKernel = new i();
        DXRefreshState dXRefreshState = DXRefreshState.None;
        this.mState = dXRefreshState;
        this.mViceState = dXRefreshState;
        this.mLastOpenTime = 0L;
        this.mHeaderBackgroundColor = 0;
        this.mFooterBackgroundColor = 0;
        this.mFooterLocked = false;
        this.mVerticalPermit = false;
        this.mFalsifyEvent = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mScroller = new Scroller(context);
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mScreenHeightPixels = context.getResources().getDisplayMetrics().heightPixels;
        this.mReboundInterpolator = new ha6(0);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mFooterHeight = ha6.c(60.0f);
        this.mHeaderHeight = ha6.c(100.0f);
    }

    public boolean autoRefresh(int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5110a0b4", new Object[]{this, new Integer(i2)})).booleanValue() : autoRefresh(i2, this.mReboundDuration, (this.mHeaderMaxDragRate + this.mHeaderTriggerRate) / 2.0f, false);
    }

    public DXRefreshLayout finishRefresh(int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRefreshLayout) ipChange.ipc$dispatch("66f1e28d", new Object[]{this, new Integer(i2)}) : finishRefresh(i2, true, Boolean.FALSE);
    }

    public DXRefreshLayout setRefreshContent(View view, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("b677dba4", new Object[]{this, view, new Integer(i2), new Integer(i3)});
        }
        ca6 ca6Var = this.mRefreshContent;
        if (ca6Var != null) {
            super.removeView(ca6Var.getView());
        }
        if (i2 == 0) {
            i2 = -1;
        }
        if (i3 == 0) {
            i3 = -1;
        }
        LayoutParams layoutParams = new LayoutParams(i2, i3);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        super.addView(view, getChildCount(), layoutParams);
        da6 da6Var = new da6(view);
        this.mRefreshContent = da6Var;
        if (this.mAttachedToWindow) {
            da6Var.h(this.mScrollBoundaryDecider);
            this.mRefreshContent.d(this.mEnableLoadMoreWhenContentNotFull);
            this.mRefreshContent.e(this.mKernel, null, null);
        }
        ba6 ba6Var = this.mRefreshHeader;
        if (ba6Var != null && ba6Var.e().f31977a) {
            super.bringChildToFront(this.mRefreshHeader.getView());
        }
        return this;
    }

    public DXRefreshLayout setRefreshHeader(ea6 ea6Var, int i2, int i3) {
        ba6 ba6Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("c9c5c2c7", new Object[]{this, ea6Var, new Integer(i2), new Integer(i3)});
        }
        ba6 ba6Var2 = this.mRefreshHeader;
        if (ba6Var2 != null) {
            super.removeView(ba6Var2.getView());
        }
        this.mRefreshHeader = ea6Var;
        this.mHeaderBackgroundColor = 0;
        this.mHeaderNeedTouchEventWhenRefreshing = false;
        this.mHeaderHeightStatus = iu5.DefaultUnNotify;
        if (i2 == 0) {
            i2 = -1;
        }
        if (i3 == 0) {
            i3 = -2;
        }
        LayoutParams layoutParams = new LayoutParams(i2, i3);
        ViewGroup.LayoutParams layoutParams2 = ea6Var.getView().getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        if (this.mRefreshHeader.e().f31977a) {
            super.addView(this.mRefreshHeader.getView(), getChildCount(), layoutParams);
        } else {
            super.addView(this.mRefreshHeader.getView(), 0, layoutParams);
        }
        int[] iArr = this.mPrimaryColors;
        if (!(iArr == null || (ba6Var = this.mRefreshHeader) == null)) {
            ba6Var.a(iArr);
        }
        return this;
    }

    public boolean autoRefresh(int i2, int i3, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fb862ab", new Object[]{this, new Integer(i2), new Integer(i3), new Float(f2), new Boolean(z)})).booleanValue();
        }
        if (this.mState != DXRefreshState.None || !isEnableRefreshOrLoadMore(this.mEnableRefresh)) {
            return false;
        }
        e eVar = new e(f2, i3, z);
        setViceState(DXRefreshState.Refreshing);
        if (i2 > 0) {
            this.mHandler.postDelayed(eVar, i2);
        } else {
            eVar.run();
        }
        return true;
    }

    public DXRefreshLayout finishRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("6d5c6a1e", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return finishRefresh(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.mLastOpenTime))), 300) << 16, true, Boolean.FALSE);
        }
        return finishRefresh(0, false, null);
    }

    public DXRefreshLayout finishRefresh(int i2, boolean z, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("afc5d246", new Object[]{this, new Integer(i2), new Boolean(z), bool});
        }
        int i3 = i2 >> 16;
        int i4 = (i2 << 16) >> 16;
        d dVar = new d(i3, bool, z);
        if (i4 > 0) {
            this.mHandler.postDelayed(dVar, i4);
        } else {
            dVar.run();
        }
        return this;
    }
}
