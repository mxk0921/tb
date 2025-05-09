package com.taobao.android.detail.ttdetail.widget.scrollerlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.fzo;
import tb.hjg;
import tb.hrj;
import tb.lnd;
import tb.lyo;
import tb.ozc;
import tb.q84;
import tb.t2o;
import tb.tgh;
import tb.tq4;
import tb.vbl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTDetailScrollerLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_CYCLE_COUNT = 1000;
    private static final int SCROLL_HORIZONTAL = 2;
    private static final int SCROLL_NONE = 0;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final int SCROLL_VERTICAL = 1;
    private static final String TAG = "TTDetailScrollerLayout";
    public static final Interpolator sQuinticInterpolator = new a();
    private int SCROLL_ORIENTATION;
    private boolean disableChildHorizontalScroll;
    private boolean isBrake;
    private boolean isDisallowInterceptTouchEvent;
    private boolean isIntercept;
    private int mActivePointerId;
    private int mAdjust;
    private VelocityTracker mAdjustVelocityTracker;
    private int mAdjustYVelocity;
    public int mCurrentVelocity;
    private int mCycleCount;
    private final int[] mDownLocation;
    private int mEventX;
    private int mEventY;
    private HashMap<Integer, Float> mFixedYMap;
    private int mLastScrollerY;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private int mNestedYOffset;
    private int mOldScrollY;
    public c mOnScrollChangeListener;
    public int mScreenHeightPixels;
    public int mScrollRange;
    private int mScrollState;
    private int mScrollToIndex;
    private int mScrollToIndexWithOffset;
    private View mScrollToTopView;
    private OverScroller mScroller;
    private int mSecondScrollY;
    private int mSmoothScrollOffset;
    private int mTouchSlop;
    private int mTouchY;
    private boolean mTouching;
    private VelocityTracker mVelocityTracker;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public ozc f7033a;

        static {
            t2o.a(912263094);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Interpolator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f7034a;

        public b(boolean z) {
            this.f7034a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!tq4.e(tq4.d(TTDetailScrollerLayout.this))) {
                TTDetailScrollerLayout.this.checkLayoutChange(this.f7034a, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
        void m(View view, int i, int i2, int i3);
    }

    static {
        t2o.a(912263091);
    }

    public TTDetailScrollerLayout(Context context) {
        this(context, null);
    }

    private boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue() : !isScrollTop() || !isScrollBottom();
    }

    private void computeOwnScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0c4436", new Object[]{this});
            return;
        }
        this.mSecondScrollY = computeVerticalScrollOffset();
        lyo.a(TAG, "computeOwnScrollOffset: mSecondScrollY" + this.mSecondScrollY);
    }

    private void disableChildScroll(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10eec8ca", new Object[]{this, view});
            return;
        }
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        view.setOverScrollMode(2);
        ViewCompat.setNestedScrollingEnabled(view, false);
    }

    private void dispatchScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fad83d5", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            scrollUp(i);
        } else if (i < 0) {
            scrollDown(i);
        }
    }

    private void fling(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac96b80", new Object[]{this, new Integer(i)});
            return;
        }
        lyo.a(TAG, "fling");
        int i2 = (int) (i * 1.25d);
        if (Math.abs(i2) > this.mMinimumVelocity) {
            this.mScroller.fling(0, this.mSecondScrollY, 1, i2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            setScrollState(2);
            this.mLastScrollerY = this.mSecondScrollY;
            invalidate();
            return;
        }
        lyo.a(TAG, "no fling");
        checkTargetsScroll(true, false);
    }

    private View getBottomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("47876bef", new Object[]{this});
        }
        List<View> effectiveChildren = getEffectiveChildren();
        if (!effectiveChildren.isEmpty()) {
            return effectiveChildren.get(effectiveChildren.size() - 1);
        }
        return null;
    }

    private int getChildLeft(View view, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f12f818", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        return i2 + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
    }

    private int getContentWidth(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d82c63b", new Object[]{this, view})).intValue();
        }
        int measuredWidth = view.getMeasuredWidth();
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    private int getScrollRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("512138b4", new Object[]{this})).intValue();
        }
        if (getChildCount() > 0) {
            return Math.max(0, computeVerticalScrollRange() - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    private View getTouchTarget(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fc812623", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        for (View view : getNonGoneChildren()) {
            if (com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.s(view, i, i2)) {
                return view;
            }
        }
        return null;
    }

    private int getViewsScrollOffset(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0fd73b7", new Object[]{this, new Integer(i)})).intValue();
        }
        int childCount = getChildCount();
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                i2 += com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.f(childAt);
            }
            i++;
        }
        return i2;
    }

    private void initAdjustVelocityTrackerIfNotExists() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57cb8f7d", new Object[]{this});
        } else if (this.mAdjustVelocityTracker == null) {
            this.mAdjustVelocityTracker = VelocityTracker.obtain();
        }
    }

    private void initOrResetAdjustVelocityTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b5bbf7", new Object[]{this});
            return;
        }
        VelocityTracker velocityTracker = this.mAdjustVelocityTracker;
        if (velocityTracker == null) {
            this.mAdjustVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void initOrResetVelocityTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f090a706", new Object[]{this});
            return;
        }
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void initVelocityTrackerIfNotExists() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8ad40e", new Object[]{this});
        } else if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
    }

    public static /* synthetic */ Object ipc$super(TTDetailScrollerLayout tTDetailScrollerLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1577577649:
                super.scrollTo(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -836842708:
                return new Integer(super.computeHorizontalScrollExtent());
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 320377877:
                return new Integer(super.computeHorizontalScrollOffset());
            case 1356790191:
                return new Integer(super.computeHorizontalScrollRange());
            case 1604649632:
                super.requestLayout();
                return null;
            case 1907907562:
                super.measureChildWithMargins((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/scrollerlayout/TTDetailScrollerLayout");
        }
    }

    private boolean isIntercept(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f6da498", new Object[]{this, motionEvent})).booleanValue();
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
        if (findPointerIndex < 0 || findPointerIndex >= motionEvent.getPointerCount()) {
            return true;
        }
        return isIntercept(com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.i(this, motionEvent, findPointerIndex), com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.j(this, motionEvent, findPointerIndex));
    }

    private int measureSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbb7de59", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            i2 = size;
        } else if (mode == Integer.MIN_VALUE) {
            i2 = Math.min(i2, size);
        }
        return View.resolveSizeAndState(Math.max(i2, getSuggestedMinimumWidth()), i, 0);
    }

    private void recycleAdjustVelocityTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc38740", new Object[]{this});
            return;
        }
        VelocityTracker velocityTracker = this.mAdjustVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mAdjustVelocityTracker = null;
        }
    }

    private void recycleVelocityTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a86dd0f", new Object[]{this});
            return;
        }
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void resetScrollToTopView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("199640a", new Object[]{this});
            return;
        }
        View findFirstVisibleView = findFirstVisibleView();
        this.mScrollToTopView = findFirstVisibleView;
        if (findFirstVisibleView != null) {
            this.mAdjust = getScrollY() - this.mScrollToTopView.getTop();
        }
    }

    private void scrollChange(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920ede44", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        c cVar = this.mOnScrollChangeListener;
        if (cVar != null) {
            cVar.m(this, i, i2, this.mScrollState);
        }
    }

    public void addNestedComponent(hrj hrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("236be36d", new Object[]{this, hrjVar});
            return;
        }
        View componentView = hrjVar.getComponentView(null);
        if (componentView != null) {
            LayoutParams u = hrjVar.u();
            u.f7033a = hrjVar;
            addView(componentView, u);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        List<View> b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
            return;
        }
        if (layoutParams instanceof LayoutParams) {
            hjg.a((LayoutParams) layoutParams);
        }
        super.addView(view, i, layoutParams);
        View l = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.l(view);
        disableChildScroll(l);
        if ((l instanceof lnd) && (b2 = ((lnd) l).b()) != null && !b2.isEmpty()) {
            int size = b2.size();
            for (int i2 = 0; i2 < size; i2++) {
                disableChildScroll(b2.get(i2));
            }
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipToPadding(false);
        }
    }

    public void checkLayoutChange(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6812b869", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        lyo.a(TAG, "checkLayoutChange: mSecondScrollY;" + this.mSecondScrollY);
        lyo.a(TAG, "mScrollToTopView;" + this.mScrollToTopView + "changed:" + z);
        View view = this.mScrollToTopView;
        if (view == null || !z) {
            lyo.a(TAG, "getScrollY;" + getScrollY());
            scrollSelf(getScrollY());
        } else if (indexOfChild(view) != -1) {
            scrollSelf(this.mScrollToTopView.getTop() + this.mAdjust);
        }
        checkTargetsScroll(z, z2);
        this.mScrollToTopView = null;
        this.mAdjust = 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce1ecb2c", new Object[]{this})).intValue();
        }
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13189415", new Object[]{this})).intValue();
        }
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50def9af", new Object[]{this})).intValue();
        }
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
        } else if (this.mScrollToIndex == -1 || (i = this.mSmoothScrollOffset) == 0) {
            if (this.mScroller.computeScrollOffset()) {
                int currY = this.mScroller.getCurrY();
                int i2 = currY - this.mLastScrollerY;
                this.mLastScrollerY = currY;
                int i3 = this.mSecondScrollY;
                dispatchScroll(i2);
                int i4 = i2 - (this.mSecondScrollY - i3);
                if ((i4 < 0 && isScrollTop()) || (i4 > 0 && isScrollBottom())) {
                    stopScroll();
                }
                invalidate();
            }
            if (this.mScrollState == 2 && this.mScroller.isFinished()) {
                checkTargetsScroll(false, false);
                setScrollState(0);
            }
        } else {
            if (i > 0 && i < 200) {
                this.mSmoothScrollOffset = i + 1;
            }
            int i5 = this.mSmoothScrollOffset;
            if (i5 < 0 && i5 > -200) {
                this.mSmoothScrollOffset = i5 - 1;
            }
            dispatchScroll(this.mSmoothScrollOffset);
            this.mCycleCount++;
            invalidate();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17293c3e", new Object[]{this})).intValue();
        }
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c230527", new Object[]{this})).intValue();
        }
        int scrollY = getScrollY();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        for (int i = 0; i < size; i++) {
            scrollY += com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.f(nonGoneChildren.get(i));
        }
        return scrollY;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf191e5d", new Object[]{this})).intValue();
        }
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            View view = nonGoneChildren.get(i2);
            if (com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.b(view)) {
                View n = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.n(view);
                i += com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.g(n) + n.getPaddingTop() + n.getPaddingBottom();
            } else {
                i += view.getHeight();
            }
        }
        return i;
    }

    public View findFirstVisibleView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7a133e49", new Object[]{this});
        }
        int scrollY = getScrollY() + getPaddingTop();
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        for (int i = 0; i < size; i++) {
            View view = effectiveChildren.get(i);
            if (view.getTop() <= scrollY && view.getBottom() > scrollY) {
                return view;
            }
        }
        return null;
    }

    public View findLastVisibleView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7dcc2dd1", new Object[]{this});
        }
        int height = (getHeight() - getPaddingBottom()) + getScrollY();
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        for (int i = 0; i < size; i++) {
            View view = effectiveChildren.get(i);
            if (view.getTop() < height && view.getBottom() >= height) {
                return view;
            }
        }
        return null;
    }

    public void fixTargetsScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9905ef13", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            lyo.a(TAG, "fixTargetsScroll start");
            if (z || (!this.mTouching && this.mScroller.isFinished() && this.mScrollToIndex == -1)) {
                int computeVerticalScrollOffset = computeVerticalScrollOffset();
                lyo.a(TAG, "oldScrollY:" + computeVerticalScrollOffset);
                View findFirstVisibleView = findFirstVisibleView();
                if (findFirstVisibleView != null) {
                    lyo.a(TAG, "target:" + findFirstVisibleView);
                    int indexOfChild = indexOfChild(findFirstVisibleView);
                    lyo.a(TAG, "isLayoutChange: 第" + indexOfChild + "个");
                    while (true) {
                        int k = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.k(findFirstVisibleView);
                        int top = findFirstVisibleView.getTop() - getScrollY();
                        if (k <= 0 || top >= 0) {
                            break;
                        }
                        int min = Math.min(k, -top);
                        scrollSelf(getScrollY() - min);
                        scrollChild(findFirstVisibleView, min);
                    }
                    lyo.a(TAG, "fixTargetsScroll end");
                }
            }
        } catch (Exception e) {
            tgh.c(TAG, "fixTargetsScroll error", e);
        }
    }

    public List<View> getEffectiveChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3f60d8d0", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8 && childAt.getHeight() > 0) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public List<View> getNonGoneChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("38c8bfcb", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public c getOnVerticalScrollChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("49900fd6", new Object[]{this});
        }
        return this.mOnScrollChangeListener;
    }

    public int getOwnScrollY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e90ff736", new Object[]{this})).intValue();
        }
        return computeVerticalScrollOffset();
    }

    public int getScrollState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("199fa08", new Object[]{this})).intValue();
        }
        return this.mScrollState;
    }

    public boolean isDisableChildHorizontalScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38a9069a", new Object[]{this})).booleanValue();
        }
        return this.disableChildHorizontalScroll;
    }

    public boolean isScrollBottom() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfc0352d", new Object[]{this})).booleanValue();
        }
        lyo.a(TAG, "isScrollBottom");
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        if (size <= 0) {
            return true;
        }
        View view = effectiveChildren.get(effectiveChildren.size() - 1);
        if (getScrollY() < this.mScrollRange || com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.c(view, 1)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            for (int i = size - 1; i >= 0; i--) {
                if (com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.c(effectiveChildren.get(i), 1)) {
                    return false;
                }
            }
        }
        return z;
    }

    public boolean isScrollTop() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5890cac9", new Object[]{this})).booleanValue();
        }
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        if (size <= 0) {
            return true;
        }
        View view = effectiveChildren.get(0);
        if (getScrollY() > 0 || com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.c(view, -1)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            for (int i = size - 1; i >= 0; i--) {
                if (com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.c(effectiveChildren.get(i), -1)) {
                    return false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b85bea", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        hjg.a((LayoutParams) view.getLayoutParams());
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (r2 != 3) goto L_0x0062;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 2
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "e7b587fe"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4 = 0
            r1[r4] = r5
            r1[r0] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onInterceptTouchEvent:"
            r2.<init>(r3)
            int r3 = r6.getAction()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "TTDetailScrollerLayout"
            tb.lyo.a(r3, r2)
            int r2 = r6.getActionMasked()
            if (r2 == 0) goto L_0x005a
            if (r2 == r0) goto L_0x0051
            if (r2 == r1) goto L_0x0042
            r1 = 3
            if (r2 == r1) goto L_0x0051
            goto L_0x0062
        L_0x0042:
            int r2 = r5.SCROLL_ORIENTATION
            if (r2 == r1) goto L_0x0062
            boolean r1 = r5.isIntercept
            if (r1 != 0) goto L_0x0050
            boolean r1 = r5.isIntercept(r6)
            if (r1 == 0) goto L_0x0062
        L_0x0050:
            return r0
        L_0x0051:
            boolean r1 = r5.isBrake
            if (r1 == 0) goto L_0x0062
            int r1 = r5.SCROLL_ORIENTATION
            if (r1 != 0) goto L_0x0062
            return r0
        L_0x005a:
            r5.initOrResetVelocityTracker()
            android.view.VelocityTracker r0 = r5.mVelocityTracker
            r0.addMovement(r6)
        L_0x0062:
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.mScrollRange = 0;
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int measuredWidth = getMeasuredWidth();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i5 = 0;
        while (i5 < size) {
            View view = nonGoneChildren.get(i5);
            int measuredHeight = view.getMeasuredHeight() + paddingTop;
            int childLeft = getChildLeft(view, measuredWidth, paddingLeft, paddingRight);
            view.layout(childLeft, paddingTop, view.getMeasuredWidth() + childLeft, measuredHeight);
            this.mScrollRange += view.getHeight();
            i5++;
            paddingTop = measuredHeight;
        }
        int measuredHeight2 = this.mScrollRange - ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        this.mScrollRange = measuredHeight2;
        if (measuredHeight2 < 0) {
            this.mScrollRange = 0;
        }
        if (z) {
            post(new b(z));
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        resetScrollToTopView();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            View view = nonGoneChildren.get(i5);
            measureChildWithMargins(view, i, 0, i2, 0);
            i3 = Math.max(i3, getContentWidth(view));
            i4 += view.getMeasuredHeight();
        }
        setMeasuredDimension(measureSize(i, i3 + getPaddingLeft() + getPaddingRight()), measureSize(i2, i4 + getPaddingTop() + getPaddingBottom()));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ab759a", new Object[]{this, new Boolean(z)});
            return;
        }
        super.requestDisallowInterceptTouchEvent(z);
        this.isDisallowInterceptTouchEvent = z;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65213c2b", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            scrollTo(0, this.mSecondScrollY + i2);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f8134f", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            dispatchScroll(i2 - this.mSecondScrollY);
        }
    }

    public void scrollToChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef20697", new Object[]{this, view});
        } else {
            scrollToChildWithOffset(view, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.c(r9, -1) != false) goto L_0x0036;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (((getScrollY() + getPaddingTop()) + r9) < r5) goto L_0x0043;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void scrollToChildWithOffset(android.view.View r9, int r10) {
        /*
            r8 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001d
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r10)
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r2] = r8
            r10[r1] = r9
            r10[r0] = r4
            java.lang.String r9 = "971cbc65"
            r3.ipc$dispatch(r9, r10)
            return
        L_0x001d:
            int r3 = r8.indexOfChild(r9)
            r4 = -1
            if (r3 == r4) goto L_0x008c
            int r5 = r9.getTop()
            int r5 = r5 - r10
            if (r10 < 0) goto L_0x004c
            int r6 = r8.getScrollY()
            int r7 = r8.getPaddingTop()
            int r6 = r6 + r7
            if (r6 <= r5) goto L_0x0038
        L_0x0036:
            r2 = -1
            goto L_0x006a
        L_0x0038:
            int r6 = r8.getScrollY()
            int r7 = r8.getPaddingTop()
            int r6 = r6 + r7
            if (r6 >= r5) goto L_0x0045
        L_0x0043:
            r2 = 1
            goto L_0x006a
        L_0x0045:
            boolean r9 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.c(r9, r4)
            if (r9 == 0) goto L_0x006a
            goto L_0x0036
        L_0x004c:
            int r9 = r8.getViewsScrollOffset(r3)
            int r6 = r8.getScrollY()
            int r7 = r8.getPaddingTop()
            int r6 = r6 + r7
            int r6 = r6 + r9
            if (r6 <= r5) goto L_0x005d
            goto L_0x0036
        L_0x005d:
            int r6 = r8.getScrollY()
            int r7 = r8.getPaddingTop()
            int r6 = r6 + r7
            int r6 = r6 + r9
            if (r6 >= r5) goto L_0x006a
            goto L_0x0043
        L_0x006a:
            if (r2 == 0) goto L_0x008c
            r8.mScrollToIndex = r3
            r8.stopScroll()
            r8.mScrollToIndexWithOffset = r10
            r8.setScrollState(r0)
        L_0x0076:
            if (r2 >= 0) goto L_0x007e
            r9 = -200(0xffffffffffffff38, float:NaN)
            r8.dispatchScroll(r9)
            goto L_0x0083
        L_0x007e:
            r9 = 200(0xc8, float:2.8E-43)
            r8.dispatchScroll(r9)
        L_0x0083:
            int r9 = r8.mCycleCount
            int r9 = r9 + r1
            r8.mCycleCount = r9
            int r9 = r8.mScrollToIndex
            if (r9 != r4) goto L_0x0076
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.scrollToChildWithOffset(android.view.View, int):void");
    }

    public void setDisableChildHorizontalScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69b96c6", new Object[]{this, new Boolean(z)});
        } else {
            this.disableChildHorizontalScroll = z;
        }
    }

    @Override // android.view.View
    @Deprecated
    public void setOnScrollChangeListener(View.OnScrollChangeListener onScrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b49b03", new Object[]{this, onScrollChangeListener});
        }
    }

    public void setOnVerticalScrollChangeListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("151647f2", new Object[]{this, cVar});
        } else {
            this.mOnScrollChangeListener = cVar;
        }
    }

    public void setScrollState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a2509a", new Object[]{this, new Integer(i)});
        } else if (i != this.mScrollState) {
            this.mScrollState = i;
            int computeVerticalScrollOffset = computeVerticalScrollOffset();
            scrollChange(computeVerticalScrollOffset, computeVerticalScrollOffset);
            if (this.mScrollState == 0) {
                checkLayoutChange(false, false);
            }
        }
    }

    public void smoothScrollToChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb7b165", new Object[]{this, view});
        } else {
            smoothScrollToChildWithOffset(view, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.c(r9, -1) != false) goto L_0x0036;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (((getScrollY() + getPaddingTop()) + r9) < r5) goto L_0x006a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
        r1 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void smoothScrollToChildWithOffset(android.view.View r9, int r10) {
        /*
            r8 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001d
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r10)
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r2] = r8
            r10[r1] = r9
            r10[r0] = r4
            java.lang.String r9 = "34fbe4d7"
            r3.ipc$dispatch(r9, r10)
            return
        L_0x001d:
            int r3 = r8.indexOfChild(r9)
            r4 = -1
            if (r3 == r4) goto L_0x0084
            int r5 = r9.getTop()
            int r5 = r5 - r10
            if (r10 < 0) goto L_0x004b
            int r6 = r8.getScrollY()
            int r7 = r8.getPaddingTop()
            int r6 = r6 + r7
            if (r6 <= r5) goto L_0x0038
        L_0x0036:
            r1 = -1
            goto L_0x006a
        L_0x0038:
            int r6 = r8.getScrollY()
            int r7 = r8.getPaddingTop()
            int r6 = r6 + r7
            if (r6 >= r5) goto L_0x0044
            goto L_0x006a
        L_0x0044:
            boolean r9 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.c(r9, r4)
            if (r9 == 0) goto L_0x0069
            goto L_0x0036
        L_0x004b:
            int r9 = r8.getViewsScrollOffset(r3)
            int r6 = r8.getScrollY()
            int r7 = r8.getPaddingTop()
            int r6 = r6 + r7
            int r6 = r6 + r9
            if (r6 <= r5) goto L_0x005c
            goto L_0x0036
        L_0x005c:
            int r4 = r8.getScrollY()
            int r6 = r8.getPaddingTop()
            int r4 = r4 + r6
            int r4 = r4 + r9
            if (r4 >= r5) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            if (r1 == 0) goto L_0x0084
            r8.mScrollToIndex = r3
            r8.stopScroll()
            r8.mScrollToIndexWithOffset = r10
            r8.setScrollState(r0)
            if (r1 >= 0) goto L_0x007d
            r9 = -50
            r8.mSmoothScrollOffset = r9
            goto L_0x0081
        L_0x007d:
            r9 = 50
            r8.mSmoothScrollOffset = r9
        L_0x0081:
            r8.invalidate()
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.smoothScrollToChildWithOffset(android.view.View, int):void");
    }

    public void stopScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec88676", new Object[]{this});
        } else if (!this.mScroller.isFinished()) {
            this.mScroller.abortAnimation();
            if (this.mScrollToIndex == -1) {
                setScrollState(0);
            }
        }
    }

    public TTDetailScrollerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void scrollChild(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f3fe8c7", new Object[]{this, view, new Integer(i)});
            return;
        }
        lyo.a(TAG, "scrollChild:" + i);
        View n = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.n(view);
        if (n instanceof AbsListView) {
            ((AbsListView) n).scrollListBy(i);
        } else {
            n.scrollBy(0, i);
        }
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6c2d940", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i > 0) {
            boolean isScrollBottom = isScrollBottom();
            lyo.a(TAG, "canScrollVertically:" + isScrollBottom);
            return !isScrollBottom;
        }
        boolean isScrollTop = isScrollTop();
        lyo.a(TAG, "canScrollVertically:" + isScrollTop);
        return !isScrollTop;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LayoutParams) ipChange.ipc$dispatch("179a26b6", new Object[]{this}) : new LayoutParams(-2, -2);
    }

    public void scrollChildContentToBottom(View view) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7b811b", new Object[]{this, view});
            return;
        }
        lyo.a(TAG, "scrollChildContentToBottom:" + view);
        do {
            int k = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.k(view);
            if (k > 0) {
                int f = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.f(view);
                scrollChild(view, k);
                i = f - com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.f(view);
                continue;
            } else {
                i = 0;
                continue;
            }
        } while (i != 0);
    }

    public void scrollChildContentToTop(View view) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c9271b", new Object[]{this, view});
            return;
        }
        lyo.a(TAG, "scrollChildContentToTop:" + view);
        do {
            int m = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.m(view);
            if (m < 0) {
                int f = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.f(view);
                scrollChild(view, m);
                i = f - com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.f(view);
                continue;
            } else {
                i = 0;
                continue;
            }
        } while (i != 0);
    }

    public void scrollSelf(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31fdef43", new Object[]{this, new Integer(i)});
            return;
        }
        lyo.a(TAG, "scrollSelf:" + i);
        if (i < 0) {
            i = 0;
        } else {
            int i2 = this.mScrollRange;
            if (i > i2) {
                i = i2;
            }
        }
        super.scrollTo(0, i);
    }

    public TTDetailScrollerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mFixedYMap = new HashMap<>();
        this.mDownLocation = new int[2];
        this.mTouching = false;
        this.SCROLL_ORIENTATION = 0;
        this.mActivePointerId = -1;
        this.mScrollToIndex = -1;
        this.mSmoothScrollOffset = 0;
        this.mScrollToIndexWithOffset = 0;
        this.mCycleCount = 0;
        this.mOldScrollY = 0;
        this.mNestedYOffset = 0;
        this.mScrollState = 0;
        this.isIntercept = false;
        this.isBrake = false;
        this.isDisallowInterceptTouchEvent = false;
        this.mScroller = new OverScroller(tq4.d(this), sQuinticInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mTouchSlop = ViewConfiguration.getTouchSlop();
        this.mScreenHeightPixels = getResources().getDisplayMetrics().heightPixels;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0132 A[EDGE_INSN: B:66:0x0132->B:62:0x0132 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void scrollDown(int r10) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.scrollDown(int):void");
    }

    private void scrollUp(int i) {
        int i2;
        int i3;
        int i4;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a483a14", new Object[]{this, new Integer(i)});
            return;
        }
        lyo.a(TAG, "scrollUp:" + i);
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        do {
            int i5 = this.mScrollToIndex;
            if (i5 != -1) {
                int top = getChildAt(i5).getTop();
                int i6 = this.mScrollToIndexWithOffset;
                i3 = top - i6;
                i2 = i6 < 0 ? getViewsScrollOffset(this.mScrollToIndex) : 0;
                if (this.mCycleCount >= 1000 || getScrollY() + getPaddingTop() + i2 >= i3 || isScrollBottom()) {
                    this.mScrollToIndex = -1;
                    this.mSmoothScrollOffset = 0;
                    this.mScrollToIndexWithOffset = 0;
                    this.mCycleCount = 0;
                    setScrollState(0);
                    break;
                }
            } else {
                i3 = 0;
                i2 = 0;
            }
            int scrollY = getScrollY();
            if (isScrollBottom() || scrollY < 0) {
                if (this.mTouching) {
                    if (scrollY >= 0 || i <= Math.abs(scrollY)) {
                        i = 0;
                    } else {
                        i4 = i - Math.abs(scrollY);
                        i -= i4;
                    }
                } else if (!this.mScroller.isFinished() && this.mScroller.getFinalY() > 0 && scrollY < 0) {
                    if (i > Math.abs(scrollY)) {
                        int abs = i - Math.abs(scrollY);
                        i -= abs;
                        i = abs;
                    } else {
                        i = 0;
                    }
                    this.mSecondScrollY += i;
                    scrollSelf(scrollY + i);
                    i4 = i;
                } else if (scrollY < 0) {
                    this.mScroller.forceFinished(true);
                }
                i4 = 0;
            } else {
                if (getScrollY() < this.mScrollRange) {
                    view = findFirstVisibleView();
                } else {
                    view = getBottomView();
                }
                if (view != null) {
                    awakenScrollBars();
                    int k = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.k(view);
                    lyo.a(TAG, "bottomOffset:" + k);
                    if (k > 0) {
                        i4 = Math.min(i, k);
                        if (this.mScrollToIndex != -1) {
                            i4 = Math.min(i4, i3 - ((getScrollY() + getPaddingTop()) + i2));
                        }
                        scrollChild(view, i4);
                    } else {
                        int min = Math.min(i, (view.getBottom() - getPaddingTop()) - getScrollY());
                        int min2 = this.mScrollToIndex != -1 ? Math.min(min, i3 - ((getScrollY() + getPaddingTop()) + i2)) : min;
                        scrollSelf(scrollY + min2);
                        i4 = min2;
                    }
                    this.mSecondScrollY += i4;
                    i -= i4;
                }
                i4 = 0;
            }
            if (i4 <= 0) {
                break;
            }
        } while (i > 0);
        int computeVerticalScrollOffset2 = computeVerticalScrollOffset();
        if (computeVerticalScrollOffset != computeVerticalScrollOffset2) {
            scrollChange(computeVerticalScrollOffset2, computeVerticalScrollOffset);
        }
    }

    public void checkTargetsScroll(boolean z, boolean z2) {
        int computeVerticalScrollOffset;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b25ca4e", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        lyo.a(TAG, "checkTargetsScroll================================================");
        if (z2 || (!this.mTouching && this.mScroller.isFinished() && this.mScrollToIndex == -1)) {
            int computeVerticalScrollOffset2 = computeVerticalScrollOffset();
            lyo.a(TAG, "oldScrollY:" + computeVerticalScrollOffset2);
            View findFirstVisibleView = findFirstVisibleView();
            if (findFirstVisibleView != null) {
                lyo.a(TAG, "target:" + findFirstVisibleView);
                int indexOfChild = indexOfChild(findFirstVisibleView);
                lyo.a(TAG, "isLayoutChange:" + z + "第" + indexOfChild + "个");
                if (z) {
                    while (true) {
                        int k = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.k(findFirstVisibleView);
                        int top = findFirstVisibleView.getTop() - getScrollY();
                        if (k <= 0 || top >= 0) {
                            break;
                        }
                        int min = Math.min(k, -top);
                        scrollSelf(getScrollY() - min);
                        scrollChild(findFirstVisibleView, min);
                    }
                }
                View findLastVisibleView = findLastVisibleView();
                if (findFirstVisibleView.getVisibility() != 8) {
                    if (findLastVisibleView != findFirstVisibleView) {
                        int k2 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.k(findFirstVisibleView);
                        ozc o = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.o(findFirstVisibleView);
                        if (o != null && k2 > 0) {
                            o.k(Integer.MAX_VALUE);
                        }
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < indexOfChild; i++) {
                    View childAt = getChildAt(i);
                    if (childAt.getVisibility() != 8) {
                        int k3 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.k(childAt);
                        ozc o2 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.o(childAt);
                        if (o2 != null && k3 > 0) {
                            o2.k(Integer.MAX_VALUE);
                        }
                    }
                }
                while (true) {
                    indexOfChild++;
                    if (indexOfChild >= getChildCount()) {
                        break;
                    }
                    View childAt2 = getChildAt(indexOfChild);
                    if (childAt2.getVisibility() != 8 && (indexOfChild != getChildCount() - 1 || childAt2.getHeight() >= getHeight() || getScrollY() < this.mScrollRange)) {
                        int m = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.m(childAt2);
                        ozc o3 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.o(childAt2);
                        if (o3 != null && m < 0) {
                            o3.k(0);
                        }
                    }
                }
                computeOwnScrollOffset();
                if (z && computeVerticalScrollOffset2 != (computeVerticalScrollOffset = computeVerticalScrollOffset())) {
                    scrollChange(computeVerticalScrollOffset, computeVerticalScrollOffset2);
                }
            }
        }
    }

    public void findAllVisibleView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b55864f6", new Object[]{this});
            return;
        }
        int scrollY = getScrollY() + getPaddingTop();
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        for (int i = 0; i < size; i++) {
            View view = effectiveChildren.get(i);
            lyo.a("www", "findFirstVisibleView 第" + i + "个 offset:" + scrollY + "getTop:" + view.getTop() + "getBottom:" + view.getBottom());
            if (view.getTop() <= scrollY && view.getBottom() > scrollY) {
                lyo.a("www", "findFirstVisibleView 第" + i + "个");
            }
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LayoutParams) ipChange.ipc$dispatch("92b849c8", new Object[]{this, layoutParams}) : new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        lyo.a(TAG, "dispatchTouchEvent:" + motionEvent.getAction());
        int actionIndex = motionEvent.getActionIndex();
        if (!(this.SCROLL_ORIENTATION != 2 || (i = this.mActivePointerId) == -1 || this.mFixedYMap.get(Integer.valueOf(i)) == null)) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.mActivePointerId);
            if (findPointerIndex2 < 0 || findPointerIndex2 >= motionEvent.getPointerCount()) {
                return false;
            }
            motionEvent.offsetLocation(0.0f, this.mFixedYMap.get(Integer.valueOf(this.mActivePointerId)).floatValue() - motionEvent.getY(findPointerIndex2));
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (obtain.getActionMasked() == 0) {
            this.mNestedYOffset = 0;
        }
        obtain.offsetLocation(0.0f, this.mNestedYOffset);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex3 = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex3 < 0 || findPointerIndex3 >= motionEvent.getPointerCount()) {
                        return false;
                    }
                    initAdjustVelocityTrackerIfNotExists();
                    this.mAdjustVelocityTracker.addMovement(obtain);
                    int y = ((int) motionEvent.getY(findPointerIndex3)) - this.mEventY;
                    int x = ((int) motionEvent.getX(findPointerIndex3)) - this.mEventX;
                    if (this.SCROLL_ORIENTATION == 0 && (this.isIntercept || isIntercept(motionEvent))) {
                        if (this.disableChildHorizontalScroll) {
                            if (Math.abs(y) >= this.mTouchSlop) {
                                this.SCROLL_ORIENTATION = 1;
                            }
                        } else if (Math.abs(x) > Math.abs(y)) {
                            if (Math.abs(x) >= this.mTouchSlop) {
                                this.SCROLL_ORIENTATION = 2;
                                int i2 = this.mActivePointerId;
                                if (i2 != -1 && this.mFixedYMap.get(Integer.valueOf(i2)) != null && (findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId)) >= 0 && findPointerIndex3 < motionEvent.getPointerCount()) {
                                    motionEvent.offsetLocation(0.0f, this.mFixedYMap.get(Integer.valueOf(this.mActivePointerId)).floatValue() - motionEvent.getY(findPointerIndex));
                                }
                            }
                        } else if (Math.abs(y) >= this.mTouchSlop) {
                            this.SCROLL_ORIENTATION = 1;
                        }
                        if (this.SCROLL_ORIENTATION == 0) {
                            return true;
                        }
                    }
                    this.mEventY = (int) motionEvent.getY(findPointerIndex3);
                    this.mEventX = (int) motionEvent.getX(findPointerIndex3);
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId = motionEvent.getPointerId(actionIndex);
                        this.mActivePointerId = pointerId;
                        this.mFixedYMap.put(Integer.valueOf(pointerId), Float.valueOf(motionEvent.getY(actionIndex)));
                        this.mEventY = (int) motionEvent.getY(actionIndex);
                        this.mEventX = (int) motionEvent.getX(actionIndex);
                        if (!this.isDisallowInterceptTouchEvent) {
                            requestDisallowInterceptTouchEvent(false);
                        }
                        this.mDownLocation[0] = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.i(this, motionEvent, actionIndex);
                        this.mDownLocation[1] = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.j(this, motionEvent, actionIndex);
                        int[] iArr = this.mDownLocation;
                        this.isIntercept = isIntercept(iArr[0], iArr[1]);
                        initAdjustVelocityTrackerIfNotExists();
                        this.mAdjustVelocityTracker.addMovement(obtain);
                    } else if (actionMasked == 6) {
                        this.mFixedYMap.remove(Integer.valueOf(motionEvent.getPointerId(actionIndex)));
                        if (this.mActivePointerId == motionEvent.getPointerId(actionIndex)) {
                            int i3 = actionIndex == 0 ? 1 : 0;
                            int pointerId2 = motionEvent.getPointerId(i3);
                            this.mActivePointerId = pointerId2;
                            this.mFixedYMap.put(Integer.valueOf(pointerId2), Float.valueOf(motionEvent.getY(i3)));
                            this.mEventY = (int) motionEvent.getY(i3);
                            this.mEventX = (int) motionEvent.getX(i3);
                            this.mDownLocation[0] = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.i(this, motionEvent, i3);
                            this.mDownLocation[1] = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.j(this, motionEvent, i3);
                            int[] iArr2 = this.mDownLocation;
                            this.isIntercept = isIntercept(iArr2[0], iArr2[1]);
                        }
                        initAdjustVelocityTrackerIfNotExists();
                        this.mAdjustVelocityTracker.addMovement(obtain);
                    }
                }
            }
            VelocityTracker velocityTracker = this.mAdjustVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(obtain);
                this.mAdjustVelocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int yVelocity = (int) this.mAdjustVelocityTracker.getYVelocity();
                this.mCurrentVelocity = yVelocity;
                int i4 = this.mMaximumVelocity;
                this.mAdjustYVelocity = Math.max(-i4, Math.min(yVelocity, i4));
                recycleAdjustVelocityTracker();
                int i5 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.i(this, motionEvent, actionIndex);
                int j = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.j(this, motionEvent, actionIndex);
                boolean b2 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.b(getTouchTarget(i5, j));
                boolean r = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.r(this, i5, j);
                if (this.SCROLL_ORIENTATION != 1 && b2 && Math.abs(yVelocity) >= this.mMinimumVelocity && !r) {
                    motionEvent.setAction(3);
                }
                if (this.SCROLL_ORIENTATION != 1 && !com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.q(this) && isIntercept(motionEvent) && Math.abs(yVelocity) >= this.mMinimumVelocity && (this.SCROLL_ORIENTATION == 0 || !r)) {
                    lyo.a(TAG, "dispatchTouchEvent up");
                    fling(-this.mAdjustYVelocity);
                }
            }
            this.mEventY = 0;
            this.mEventX = 0;
            this.mTouching = false;
            int[] iArr3 = this.mDownLocation;
            iArr3[0] = 0;
            iArr3[1] = 0;
            this.isIntercept = false;
        } else {
            this.mCurrentVelocity = 0;
            this.isBrake = this.mScrollState == 2;
            if (!vbl.r0()) {
                stopScroll();
            } else if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                if (this.mScrollToIndex == -1) {
                    setScrollState(0);
                }
                q84.f(tq4.d(this), new fzo(fzo.SCROLLING));
            } else {
                q84.f(tq4.d(this), new fzo("idle"));
            }
            this.mTouching = true;
            checkTargetsScroll(false, false);
            this.SCROLL_ORIENTATION = 0;
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            this.mActivePointerId = pointerId3;
            this.mFixedYMap.put(Integer.valueOf(pointerId3), Float.valueOf(motionEvent.getY(actionIndex)));
            this.mEventY = (int) motionEvent.getY(actionIndex);
            this.mEventX = (int) motionEvent.getX(actionIndex);
            initOrResetAdjustVelocityTracker();
            this.mAdjustVelocityTracker.addMovement(obtain);
            this.mDownLocation[0] = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.i(this, motionEvent, actionIndex);
            this.mDownLocation[1] = com.taobao.android.detail.ttdetail.widget.scrollerlayout.a.j(this, motionEvent, actionIndex);
            int[] iArr4 = this.mDownLocation;
            this.isIntercept = isIntercept(iArr4[0], iArr4[1]);
        }
        obtain.recycle();
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 1 || actionMasked2 == 3) {
            this.SCROLL_ORIENTATION = 0;
            this.mAdjustYVelocity = 0;
            this.mFixedYMap.clear();
            this.mActivePointerId = -1;
            if (this.mScroller.isFinished()) {
                setScrollState(0);
            }
        }
        return dispatchTouchEvent;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LayoutParams) ipChange.ipc$dispatch("3dd8fcf7", new Object[]{this, attributeSet}) : new LayoutParams(tq4.d(this), attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (r6 != 6) goto L_0x00f6;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void addNestedComponent(hrj hrjVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a10fd36", new Object[]{this, hrjVar, new Integer(i)});
            return;
        }
        View componentView = hrjVar.getComponentView(null);
        if (componentView != null) {
            LayoutParams u = hrjVar.u();
            u.f7033a = hrjVar;
            addView(componentView, i, u);
        }
    }

    private boolean isIntercept(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("346f57e3", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : getTouchTarget(i, i2) != null;
    }
}
