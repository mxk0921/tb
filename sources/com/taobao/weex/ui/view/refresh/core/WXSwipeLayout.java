package com.taobao.weex.ui.view.refresh.core;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewParentCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXSwipeLayout extends FrameLayout implements NestedScrollingParent, NestedScrollingChild {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float DAMPING = 0.4f;
    private static final int INVALID = -1;
    private static final int LOAD_MORE = 1;
    private static final int PULL_REFRESH = 0;
    private static final float overFlow = 1.0f;
    private WXRefreshView footerView;
    private WXRefreshView headerView;
    private boolean isConfirm;
    private volatile float loadingViewFlowHeight;
    private volatile float loadingViewHeight;
    private int mCurrentAction;
    private ViewParent mNestedScrollAcceptedParent;
    private boolean mNestedScrollInProgress;
    private NestedScrollingChildHelper mNestedScrollingChildHelper;
    private NestedScrollingParentHelper mNestedScrollingParentHelper;
    private final int[] mParentOffsetInWindow;
    private final int[] mParentScrollConsumed;
    private int mProgressBgColor;
    private int mProgressColor;
    private boolean mPullLoadEnable;
    private boolean mPullRefreshEnable;
    private final List<OnRefreshOffsetChangedListener> mRefreshOffsetChangedListeners;
    private int mRefreshViewBgColor;
    private volatile boolean mRefreshing;
    private View mTargetView;
    private WXOnLoadingListener onLoadingListener;
    private WXOnRefreshListener onRefreshListener;
    private volatile float refreshViewFlowHeight;
    private volatile float refreshViewHeight;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnRefreshOffsetChangedListener {
        void onOffsetChanged(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface WXOnLoadingListener {
        void onLoading();

        void onPullingUp(float f, int i, float f2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface WXOnRefreshListener {
        void onPullingDown(float f, int i, float f2);

        void onRefresh();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class WXRefreshAnimatorListener implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(985661789);
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

    static {
        t2o.a(985661777);
    }

    public WXSwipeLayout(Context context) {
        super(context);
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        this.mRefreshOffsetChangedListeners = new LinkedList();
        this.mPullRefreshEnable = false;
        this.mPullLoadEnable = false;
        this.mRefreshing = false;
        this.refreshViewHeight = 0.0f;
        this.loadingViewHeight = 0.0f;
        this.refreshViewFlowHeight = 0.0f;
        this.loadingViewFlowHeight = 0.0f;
        this.mCurrentAction = -1;
        this.isConfirm = false;
        initAttrs(context, null);
    }

    public static /* synthetic */ WXRefreshView access$000(WXSwipeLayout wXSwipeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXRefreshView) ipChange.ipc$dispatch("64f42d63", new Object[]{wXSwipeLayout});
        }
        return wXSwipeLayout.headerView;
    }

    public static /* synthetic */ void access$100(WXSwipeLayout wXSwipeLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96881f8d", new Object[]{wXSwipeLayout, new Integer(i)});
        } else {
            wXSwipeLayout.notifyOnRefreshOffsetChangedListener(i);
        }
    }

    public static /* synthetic */ void access$200(WXSwipeLayout wXSwipeLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c8bdfa9", new Object[]{wXSwipeLayout, new Float(f)});
        } else {
            wXSwipeLayout.moveTargetView(f);
        }
    }

    public static /* synthetic */ WXOnRefreshListener access$300(WXSwipeLayout wXSwipeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXOnRefreshListener) ipChange.ipc$dispatch("afc30971", new Object[]{wXSwipeLayout});
        }
        return wXSwipeLayout.onRefreshListener;
    }

    public static /* synthetic */ void access$400(WXSwipeLayout wXSwipeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("790d0079", new Object[]{wXSwipeLayout});
        } else {
            wXSwipeLayout.resetRefreshState();
        }
    }

    public static /* synthetic */ WXRefreshView access$500(WXSwipeLayout wXSwipeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXRefreshView) ipChange.ipc$dispatch("a75b997e", new Object[]{wXSwipeLayout});
        }
        return wXSwipeLayout.footerView;
    }

    public static /* synthetic */ WXOnLoadingListener access$600(WXSwipeLayout wXSwipeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXOnLoadingListener) ipChange.ipc$dispatch("72cd888d", new Object[]{wXSwipeLayout});
        }
        return wXSwipeLayout.onLoadingListener;
    }

    public static /* synthetic */ void access$700(WXSwipeLayout wXSwipeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2e66bc", new Object[]{wXSwipeLayout});
        } else {
            wXSwipeLayout.resetLoadmoreState();
        }
    }

    private double calculateDistanceY(View view, int i) {
        int measuredHeight;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15e5f7a4", new Object[]{this, view, new Integer(i)})).doubleValue();
        }
        double abs = (((measuredHeight - Math.abs(view.getY())) / 1.0d) / view.getMeasuredHeight()) * 0.4000000059604645d;
        if (abs <= 0.01d) {
            abs = 0.01d;
        }
        return abs * i;
    }

    private void handlerAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8716a7", new Object[]{this});
        } else if (!isRefreshing()) {
            this.isConfirm = false;
            if (this.mPullRefreshEnable && this.mCurrentAction == 0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.headerView.getLayoutParams();
                if (layoutParams.height >= this.refreshViewHeight) {
                    startRefresh(layoutParams.height);
                } else {
                    int i = layoutParams.height;
                    if (i > 0) {
                        resetHeaderView(i);
                    } else {
                        resetRefreshState();
                    }
                }
            }
            if (this.mPullLoadEnable && this.mCurrentAction == 1) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.footerView.getLayoutParams();
                if (layoutParams2.height >= this.loadingViewHeight) {
                    startLoadmore(layoutParams2.height);
                    return;
                }
                int i2 = layoutParams2.height;
                if (i2 > 0) {
                    resetFootView(i2);
                } else {
                    resetLoadmoreState();
                }
            }
        }
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266d01bf", new Object[]{this, context, attributeSet});
        } else if (getChildCount() <= 1) {
            this.mNestedScrollingParentHelper = new NestedScrollingParentHelper(this);
            this.mNestedScrollingChildHelper = new NestedScrollingChildHelper(this);
            setNestedScrollingEnabled(false);
            if (!isInEditMode() || attributeSet != null) {
                this.mRefreshViewBgColor = 0;
                this.mProgressBgColor = 0;
                this.mProgressColor = -65536;
            }
        } else {
            throw new RuntimeException("WXSwipeLayout should not have more than one child");
        }
    }

    public static /* synthetic */ Object ipc$super(WXSwipeLayout wXSwipeLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/weex/ui/view/refresh/core/WXSwipeLayout");
    }

    private boolean moveSpinner(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8138815", new Object[]{this, new Float(f)})).booleanValue();
        }
        if (this.mRefreshing) {
            return false;
        }
        if (!canChildScrollUp() && this.mPullRefreshEnable && this.mCurrentAction == 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.headerView.getLayoutParams();
            int i = (int) (layoutParams.height + f);
            layoutParams.height = i;
            if (i < 0) {
                layoutParams.height = 0;
            }
            if (layoutParams.height == 0) {
                this.isConfirm = false;
                this.mCurrentAction = -1;
            }
            this.headerView.setLayoutParams(layoutParams);
            this.onRefreshListener.onPullingDown(f, layoutParams.height, this.refreshViewFlowHeight);
            notifyOnRefreshOffsetChangedListener(layoutParams.height);
            this.headerView.setProgressRotation(layoutParams.height / this.refreshViewFlowHeight);
            moveTargetView(layoutParams.height);
            return true;
        } else if (canChildScrollDown() || !this.mPullLoadEnable || this.mCurrentAction != 1) {
            return false;
        } else {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.footerView.getLayoutParams();
            int i2 = (int) (layoutParams2.height - f);
            layoutParams2.height = i2;
            if (i2 < 0) {
                layoutParams2.height = 0;
            }
            if (layoutParams2.height == 0) {
                this.isConfirm = false;
                this.mCurrentAction = -1;
            }
            this.footerView.setLayoutParams(layoutParams2);
            this.onLoadingListener.onPullingUp(f, layoutParams2.height, this.loadingViewFlowHeight);
            this.footerView.setProgressRotation(layoutParams2.height / this.loadingViewFlowHeight);
            moveTargetView(-layoutParams2.height);
            return true;
        }
    }

    private void moveTargetView(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfdc39f2", new Object[]{this, new Float(f)});
        } else {
            this.mTargetView.setTranslationY(f);
        }
    }

    private void notifyOnRefreshOffsetChangedListener(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c0eff1a", new Object[]{this, new Integer(i)});
            return;
        }
        int size = this.mRefreshOffsetChangedListeners.size();
        for (int i2 = 0; i2 < size && i2 < this.mRefreshOffsetChangedListeners.size(); i2++) {
            OnRefreshOffsetChangedListener onRefreshOffsetChangedListener = this.mRefreshOffsetChangedListeners.get(i2);
            if (onRefreshOffsetChangedListener != null) {
                onRefreshOffsetChangedListener.onOffsetChanged(i);
            }
        }
    }

    private void resetFootView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b7bdfa", new Object[]{this, new Integer(i)});
            return;
        }
        this.footerView.stopAnimation();
        this.footerView.setStartEndTrim(0.5f, 1.25f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(i, 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.weex.ui.view.refresh.core.WXSwipeLayout.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) WXSwipeLayout.access$500(WXSwipeLayout.this).getLayoutParams();
                layoutParams.height = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                WXSwipeLayout.access$500(WXSwipeLayout.this).setLayoutParams(layoutParams);
                WXSwipeLayout.access$200(WXSwipeLayout.this, -layoutParams.height);
            }
        });
        ofFloat.addListener(new WXRefreshAnimatorListener() { // from class: com.taobao.weex.ui.view.refresh.core.WXSwipeLayout.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass8 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/view/refresh/core/WXSwipeLayout$8");
            }

            @Override // com.taobao.weex.ui.view.refresh.core.WXSwipeLayout.WXRefreshAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    WXSwipeLayout.access$700(WXSwipeLayout.this);
                }
            }
        });
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    private void resetHeaderView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f9627b", new Object[]{this, new Integer(i)});
            return;
        }
        this.headerView.stopAnimation();
        this.headerView.setStartEndTrim(0.0f, 0.75f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(i, 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.weex.ui.view.refresh.core.WXSwipeLayout.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) WXSwipeLayout.access$000(WXSwipeLayout.this).getLayoutParams();
                int floatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                layoutParams.height = floatValue;
                WXSwipeLayout.access$100(WXSwipeLayout.this, floatValue);
                WXSwipeLayout.access$000(WXSwipeLayout.this).setLayoutParams(layoutParams);
                WXSwipeLayout.access$200(WXSwipeLayout.this, layoutParams.height);
            }
        });
        ofFloat.addListener(new WXRefreshAnimatorListener() { // from class: com.taobao.weex.ui.view.refresh.core.WXSwipeLayout.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/view/refresh/core/WXSwipeLayout$4");
            }

            @Override // com.taobao.weex.ui.view.refresh.core.WXSwipeLayout.WXRefreshAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    WXSwipeLayout.access$400(WXSwipeLayout.this);
                }
            }
        });
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    private void resetLoadmoreState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b90cd80e", new Object[]{this});
            return;
        }
        this.mRefreshing = false;
        this.isConfirm = false;
        this.mCurrentAction = -1;
    }

    private void resetRefreshState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8abd0f6c", new Object[]{this});
            return;
        }
        this.mRefreshing = false;
        this.isConfirm = false;
        this.mCurrentAction = -1;
    }

    private void setRefreshView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2d33be5", new Object[]{this});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
        WXRefreshView wXRefreshView = new WXRefreshView(getContext());
        this.headerView = wXRefreshView;
        wXRefreshView.setStartEndTrim(0.0f, 0.75f);
        this.headerView.setBackgroundColor(this.mRefreshViewBgColor);
        this.headerView.setProgressBgColor(this.mProgressBgColor);
        this.headerView.setProgressColor(this.mProgressColor);
        this.headerView.setContentGravity(80);
        addView(this.headerView, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, 0);
        layoutParams2.gravity = 80;
        WXRefreshView wXRefreshView2 = new WXRefreshView(getContext());
        this.footerView = wXRefreshView2;
        wXRefreshView2.setStartEndTrim(0.5f, 1.25f);
        this.footerView.setBackgroundColor(this.mRefreshViewBgColor);
        this.footerView.setProgressBgColor(this.mProgressBgColor);
        this.footerView.setProgressColor(this.mProgressColor);
        this.footerView.setContentGravity(48);
        addView(this.footerView, layoutParams2);
    }

    private void startLoadmore(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("148089bf", new Object[]{this, new Integer(i)});
            return;
        }
        this.mRefreshing = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(i, this.loadingViewHeight);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.weex.ui.view.refresh.core.WXSwipeLayout.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) WXSwipeLayout.access$500(WXSwipeLayout.this).getLayoutParams();
                layoutParams.height = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                WXSwipeLayout.access$500(WXSwipeLayout.this).setLayoutParams(layoutParams);
                WXSwipeLayout.access$200(WXSwipeLayout.this, -layoutParams.height);
            }
        });
        ofFloat.addListener(new WXRefreshAnimatorListener() { // from class: com.taobao.weex.ui.view.refresh.core.WXSwipeLayout.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/view/refresh/core/WXSwipeLayout$6");
            }

            @Override // com.taobao.weex.ui.view.refresh.core.WXSwipeLayout.WXRefreshAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                WXSwipeLayout.access$500(WXSwipeLayout.this).startAnimation();
                if (WXSwipeLayout.access$600(WXSwipeLayout.this) != null) {
                    WXSwipeLayout.access$600(WXSwipeLayout.this).onLoading();
                }
            }
        });
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    private void startRefresh(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ae212e3", new Object[]{this, new Integer(i)});
            return;
        }
        this.mRefreshing = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(i, this.refreshViewHeight);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.weex.ui.view.refresh.core.WXSwipeLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) WXSwipeLayout.access$000(WXSwipeLayout.this).getLayoutParams();
                int floatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                layoutParams.height = floatValue;
                WXSwipeLayout.access$100(WXSwipeLayout.this, floatValue);
                WXSwipeLayout.access$000(WXSwipeLayout.this).setLayoutParams(layoutParams);
                WXSwipeLayout.access$200(WXSwipeLayout.this, layoutParams.height);
            }
        });
        ofFloat.addListener(new WXRefreshAnimatorListener() { // from class: com.taobao.weex.ui.view.refresh.core.WXSwipeLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/view/refresh/core/WXSwipeLayout$2");
            }

            @Override // com.taobao.weex.ui.view.refresh.core.WXSwipeLayout.WXRefreshAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                WXSwipeLayout.access$000(WXSwipeLayout.this).startAnimation();
                if (WXSwipeLayout.access$300(WXSwipeLayout.this) != null) {
                    WXSwipeLayout.access$300(WXSwipeLayout.this).onRefresh();
                }
            }
        });
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public void addOnRefreshOffsetChangedListener(OnRefreshOffsetChangedListener onRefreshOffsetChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dcb4314", new Object[]{this, onRefreshOffsetChangedListener});
        } else if (onRefreshOffsetChangedListener != null && !this.mRefreshOffsetChangedListeners.contains(onRefreshOffsetChangedListener)) {
            this.mRefreshOffsetChangedListeners.add(onRefreshOffsetChangedListener);
        }
    }

    public void addTargetView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6609bfb4", new Object[]{this, view});
            return;
        }
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        setRefreshView();
    }

    public boolean canChildScrollDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3886c66", new Object[]{this})).booleanValue();
        }
        View view = this.mTargetView;
        if (view == null) {
            return false;
        }
        return ViewCompat.canScrollVertically(view, 1);
    }

    public boolean canChildScrollUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e81f6c1f", new Object[]{this})).booleanValue();
        }
        View view = this.mTargetView;
        if (view == null) {
            return false;
        }
        return ViewCompat.canScrollVertically(view, -1);
    }

    public float dipToPx(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ed5033d", new Object[]{this, context, new Float(f)})).floatValue();
        }
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcc718c6", new Object[]{this, new Float(f), new Float(f2), new Boolean(z)})).booleanValue();
        }
        return this.mNestedScrollingChildHelper.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd6a38f5", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        return this.mNestedScrollingChildHelper.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb2ad7c6", new Object[]{this, new Integer(i), new Integer(i2), iArr, iArr2})).booleanValue();
        }
        return this.mNestedScrollingChildHelper.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2320a5d7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr})).booleanValue();
        }
        return this.mNestedScrollingChildHelper.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    public void finishPullLoad() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d020005", new Object[]{this});
        } else if (this.mCurrentAction == 1) {
            WXRefreshView wXRefreshView = this.footerView;
            if (wXRefreshView != null) {
                i = wXRefreshView.getMeasuredHeight();
            }
            resetFootView(i);
        }
    }

    public void finishPullRefresh() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22bd114a", new Object[]{this});
        } else if (this.mCurrentAction == 0) {
            WXRefreshView wXRefreshView = this.headerView;
            if (wXRefreshView != null) {
                i = wXRefreshView.getMeasuredHeight();
            }
            resetHeaderView(i);
        }
    }

    public WXRefreshView getFooterView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXRefreshView) ipChange.ipc$dispatch("276ca17b", new Object[]{this});
        }
        return this.footerView;
    }

    public WXRefreshView getHeaderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXRefreshView) ipChange.ipc$dispatch("3d613549", new Object[]{this});
        }
        return this.headerView;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ae0ec59", new Object[]{this})).intValue();
        }
        return this.mNestedScrollingParentHelper.getNestedScrollAxes();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1f74419", new Object[]{this})).booleanValue();
        }
        return this.mNestedScrollingChildHelper.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c534e78", new Object[]{this})).booleanValue();
        }
        return this.mNestedScrollingChildHelper.isNestedScrollingEnabled();
    }

    public boolean isPullLoadEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36239a83", new Object[]{this})).booleanValue();
        }
        return this.mPullLoadEnable;
    }

    public boolean isPullRefreshEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84c04efa", new Object[]{this})).booleanValue();
        }
        return this.mPullRefreshEnable;
    }

    public boolean isRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56d673fc", new Object[]{this})).booleanValue();
        }
        return this.mRefreshing;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.mTargetView == null && getChildCount() > 0) {
            this.mTargetView = getChildAt(0);
        }
        if (this.mTargetView == null) {
            return;
        }
        if (this.headerView == null || this.footerView == null) {
            setRefreshView();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if ((this.mPullRefreshEnable || this.mPullLoadEnable) && isEnabled() && !canChildScrollUp() && !this.mRefreshing && !this.mNestedScrollInProgress) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e04e9d3", new Object[]{this, view, new Float(f), new Float(f2), new Boolean(z)})).booleanValue();
        }
        if (isNestedScrollingEnabled()) {
            return dispatchNestedFling(f, f2, z);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a49f72c0", new Object[]{this, view, new Float(f), new Float(f2)})).booleanValue();
        }
        if (isNestedScrollingEnabled()) {
            return dispatchNestedPreFling(f, f2);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        ViewParent viewParent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8de25f", new Object[]{this, view, new Integer(i), new Integer(i2), iArr});
            return;
        }
        int[] iArr2 = this.mParentScrollConsumed;
        if (isNestedScrollingEnabled() && dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        } else if (this.mPullRefreshEnable || this.mPullLoadEnable) {
            if (!canChildScrollUp() && isNestedScrollingEnabled() && (viewParent = this.mNestedScrollAcceptedParent) != null && viewParent != this.mTargetView) {
                ViewGroup viewGroup = (ViewGroup) viewParent;
                if (viewGroup.getChildCount() > 0) {
                    int childCount = viewGroup.getChildCount();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= childCount) {
                            break;
                        }
                        View childAt = viewGroup.getChildAt(i3);
                        if (childAt.getVisibility() == 8 || childAt.getMeasuredHeight() <= 0) {
                            i3++;
                        } else if (childAt.getTop() < 0) {
                            return;
                        }
                    }
                }
            }
            int calculateDistanceY = (int) calculateDistanceY(view, i2);
            this.mRefreshing = false;
            if (!this.isConfirm) {
                if (calculateDistanceY < 0 && !canChildScrollUp()) {
                    this.mCurrentAction = 0;
                    this.isConfirm = true;
                } else if (calculateDistanceY > 0 && !canChildScrollDown() && !this.mRefreshing) {
                    this.mCurrentAction = 1;
                    this.isConfirm = true;
                }
            }
            if (!moveSpinner(-calculateDistanceY)) {
                return;
            }
            if (!canChildScrollUp() && this.mPullRefreshEnable && this.mTargetView.getTranslationY() > 0.0f && i2 > 0) {
                iArr[1] = iArr[1] + i2;
            } else if (canChildScrollDown() || !this.mPullLoadEnable || this.mTargetView.getTranslationY() >= 0.0f || i2 >= 0) {
                iArr[1] = iArr[1] + calculateDistanceY;
            } else {
                iArr[1] = iArr[1] + i2;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12f5428", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (isNestedScrollingEnabled()) {
            dispatchNestedScroll(i, i2, i3, i4, this.mParentOffsetInWindow);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491be8b2", new Object[]{this, view, view2, new Integer(i)});
            return;
        }
        this.mNestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i);
        if (isNestedScrollingEnabled()) {
            startNestedScroll(i & 2);
            this.mNestedScrollInProgress = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d9f1379", new Object[]{this, view, view2, new Integer(i)})).booleanValue();
        }
        if (!isEnabled() || this.mRefreshing || (i & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a4d786", new Object[]{this, view});
            return;
        }
        this.mNestedScrollingParentHelper.onStopNestedScroll(view);
        handlerAction();
        if (isNestedScrollingEnabled()) {
            this.mNestedScrollInProgress = true;
            stopNestedScroll();
        }
    }

    public boolean removeOnRefreshOffsetChangedListener(OnRefreshOffsetChangedListener onRefreshOffsetChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4d60315", new Object[]{this, onRefreshOffsetChangedListener})).booleanValue();
        }
        if (onRefreshOffsetChangedListener != null) {
            return this.mRefreshOffsetChangedListeners.remove(onRefreshOffsetChangedListener);
        }
        return false;
    }

    public void setLoadingBgColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d69d6398", new Object[]{this, new Integer(i)});
        } else {
            this.footerView.setBackgroundColor(i);
        }
    }

    public void setLoadingHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7f5bbb", new Object[]{this, new Integer(i)});
            return;
        }
        this.loadingViewHeight = i;
        this.loadingViewFlowHeight = this.loadingViewHeight * 1.0f;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9739c0a8", new Object[]{this, new Boolean(z)});
        } else {
            this.mNestedScrollingChildHelper.setNestedScrollingEnabled(z);
        }
    }

    public void setOnLoadingListener(WXOnLoadingListener wXOnLoadingListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff03e748", new Object[]{this, wXOnLoadingListener});
        } else {
            this.onLoadingListener = wXOnLoadingListener;
        }
    }

    public void setOnRefreshListener(WXOnRefreshListener wXOnRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac1e8068", new Object[]{this, wXOnRefreshListener});
        } else {
            this.onRefreshListener = wXOnRefreshListener;
        }
    }

    public void setPullLoadEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a13dfd", new Object[]{this, new Boolean(z)});
        } else {
            this.mPullLoadEnable = z;
        }
    }

    public void setPullRefreshEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf2837d6", new Object[]{this, new Boolean(z)});
        } else {
            this.mPullRefreshEnable = z;
        }
    }

    public void setRefreshBgColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49e9eb7", new Object[]{this, new Integer(i)});
        } else {
            this.headerView.setBackgroundColor(i);
        }
    }

    public void setRefreshHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eeac0bc", new Object[]{this, new Integer(i)});
            return;
        }
        this.refreshViewHeight = i;
        this.refreshViewFlowHeight = this.refreshViewHeight * 1.0f;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ced332fa", new Object[]{this, new Integer(i)})).booleanValue();
        }
        boolean startNestedScroll = this.mNestedScrollingChildHelper.startNestedScroll(i);
        if (startNestedScroll && this.mNestedScrollAcceptedParent == null) {
            ViewParent parent = getParent();
            View view = this;
            while (true) {
                if (parent == null) {
                    break;
                } else if (ViewParentCompat.onStartNestedScroll(parent, view, this, i)) {
                    this.mNestedScrollAcceptedParent = parent;
                    break;
                } else {
                    if (parent instanceof View) {
                        view = (View) parent;
                    }
                    parent = parent.getParent();
                    view = view;
                }
            }
        }
        return startNestedScroll;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("299bf94d", new Object[]{this});
            return;
        }
        this.mNestedScrollingChildHelper.stopNestedScroll();
        if (this.mNestedScrollAcceptedParent != null) {
            this.mNestedScrollAcceptedParent = null;
        }
    }

    public WXSwipeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        this.mRefreshOffsetChangedListeners = new LinkedList();
        this.mPullRefreshEnable = false;
        this.mPullLoadEnable = false;
        this.mRefreshing = false;
        this.refreshViewHeight = 0.0f;
        this.loadingViewHeight = 0.0f;
        this.refreshViewFlowHeight = 0.0f;
        this.loadingViewFlowHeight = 0.0f;
        this.mCurrentAction = -1;
        this.isConfirm = false;
        initAttrs(context, attributeSet);
    }

    public WXSwipeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        this.mRefreshOffsetChangedListeners = new LinkedList();
        this.mPullRefreshEnable = false;
        this.mPullLoadEnable = false;
        this.mRefreshing = false;
        this.refreshViewHeight = 0.0f;
        this.loadingViewHeight = 0.0f;
        this.refreshViewFlowHeight = 0.0f;
        this.loadingViewFlowHeight = 0.0f;
        this.mCurrentAction = -1;
        this.isConfirm = false;
        initAttrs(context, attributeSet);
    }

    public WXSwipeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        this.mRefreshOffsetChangedListeners = new LinkedList();
        this.mPullRefreshEnable = false;
        this.mPullLoadEnable = false;
        this.mRefreshing = false;
        this.refreshViewHeight = 0.0f;
        this.loadingViewHeight = 0.0f;
        this.refreshViewFlowHeight = 0.0f;
        this.loadingViewFlowHeight = 0.0f;
        this.mCurrentAction = -1;
        this.isConfirm = false;
        initAttrs(context, attributeSet);
    }
}
