package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.core.widget.ScrollerCompat;
import androidx.viewpager.widget.PagerAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.FlexibleContainerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.bg6;
import tb.c4a;
import tb.nuk;
import tb.nvs;
import tb.r0h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class AbsFlexibleMarqueeGallery extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLING_DELAY = 16;
    private static final float SCALE_ANIM_a = 1.0f;
    private static final float SCALE_ANIM_axis = 0.5f;
    private static final float SCALE_ANIM_b = -1.0f;
    public long animationDuration;
    public int backwardsLoopSpacing;
    public int childrenCount;
    public float density;
    public boolean enableScale;
    public int forwardsLoopSpacing;
    public boolean init;
    public View lastAnimateView;
    public int lastMotionEventAction;
    public int lastSelectedItem;
    public int lastVirtualEnd;
    public int lastVirtualStart;
    public boolean loopScrollEnable;
    public int mActiveFeature;
    public int mActualVisibleCardCount;
    public PagerAdapter mAdapter;
    public c4a mAutoRunner;
    public int mAutoScrollAnimationOnStart;
    public float mCardCornerRadius;
    public int mCardHeight;
    public int mCardSpacing;
    public int mCurrentItem;
    public int mCurrentItemBeforeTouchDown;
    public int mCurrentVirtualItemBeforeTouchDown;
    public HashSet<Integer> mCurrentVisibleViewIndexes;
    public HashSet<Integer> mCurrentVisibleVirtualIndexes;
    public ScrollerCompat mCustomScroller;
    public float mDynamicBlockFactor;
    public int mExpandedCardWidth;
    public int mExpectedAdapterCount;
    public float mFlingFactor;
    public int mFoldedCardVisibleCount;
    public int mFoldedCardWidth;
    public int mGalleryDisplayWidth;
    public float mHorizontalScrollFactor;
    public c mInterceptCondition;
    public boolean mIsFling;
    public boolean mIsOnScrollStarted;
    public boolean mIsRunnerScrollStarted;
    public boolean mIsTouching;
    public List<d> mItems;
    public int mLastContentOffset;
    public boolean mManualScrollEnable;
    public b mObserver;
    public e mOnCardAnimatePerformListener;
    public f mOnGalleryScrollListener;
    public nuk mOnScrollListener;
    public ViewGroup mScrollContent;
    public int mScrollOffsetOnTouchDown;
    public Runnable mScrollerTask;
    public Handler mSetVisibleIndexedHandler;
    public int mTouchDownPointer;
    public float mTriggerOffset;
    public Set<Integer> mVisibleIndexes;
    public final boolean magnetPosition;
    public int mainContentWidth;
    private boolean needIntercept;
    public boolean notifyOnSwitch;
    public Runnable setVisibleIndexTask;
    private static final String TAG = AbsFlexibleMarqueeGallery.class.getSimpleName();
    public static Comparator<Integer> INTEGER_COMPARATOR = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Comparator<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(Integer num, Integer num2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dc099c7f", new Object[]{this, num, num2})).intValue();
            }
            return num.intValue() - num2.intValue();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends DataSetObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(310378586);
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/flexible/view/AbsFlexibleMarqueeGallery$GalleryObserver");
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            } else {
                AbsFlexibleMarqueeGallery.this.dataSetChanged();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
            } else {
                AbsFlexibleMarqueeGallery.this.dataSetChanged();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public View f8793a;
        public Object b;

        static {
            t2o.a(310378588);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface e {
        void onAnimatePerform(View view, int i, float f, boolean z, int i2, int i3);

        void onAnimateUpdate(float f);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface f {
    }

    static {
        t2o.a(310378584);
    }

    public AbsFlexibleMarqueeGallery(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(AbsFlexibleMarqueeGallery absFlexibleMarqueeGallery, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -381850951:
                return new Boolean(super.overScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            case -355898496:
                super.fling(((Number) objArr[0]).intValue());
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/flexible/view/AbsFlexibleMarqueeGallery");
        }
    }

    public void adjustPositionX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4569dc", new Object[]{this, new Integer(i)});
        } else if (this.childrenCount > 0) {
            int round = Math.round((getScrollX() * 1.0f) / getInternalWidth());
            int round2 = Math.round((this.mScrollOffsetOnTouchDown * 1.0f) / getInternalWidth());
            int max = Math.max(-1, Math.min(1, getFlingCount(i, getInternalWidth())));
            if (max != 0) {
                round = round2 + max;
            }
            scrollToPage(safeTargetPosition(Math.max(round, 0), this.childrenCount));
        }
    }

    public void autoScrollToNext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8c7011", new Object[]{this});
        }
    }

    public void autoScrollToPrevious() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f81a95", new Object[]{this});
        } else if (!this.mIsTouching) {
            int i = this.mCurrentItem;
            int i2 = i - 1;
            if (!this.loopScrollEnable) {
                if (i2 < 0) {
                    i = this.childrenCount - 1;
                } else {
                    i = i2;
                }
            }
            smoothScrollToRectWithAnim(rectForIndex(i).left, true);
        }
    }

    public abstract boolean checkViewHasInVisibleRect(View view);

    public abstract boolean checkViewHasInVisibleRect(View view, boolean z);

    public int computeCurrentItemByScroll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4ec4a093", new Object[]{this})).intValue() : computeCurrentItemByScroll(getScrollX());
    }

    public ScrollerCompat createScroller(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollerCompat) ipChange.ipc$dispatch("5b7807bf", new Object[]{this, context});
        }
        return ScrollerCompat.create(context, new DecelerateInterpolator());
    }

    public abstract Runnable createScrollerTask();

    public void dataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da031c3", new Object[]{this});
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mCustomScroller.abortAnimation();
            this.mScrollOffsetOnTouchDown = getScrollX();
            if (this.mManualScrollEnable) {
                this.mIsTouching = true;
            }
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (action == 1 || action == 3) {
            this.mIsTouching = false;
            this.mIsFling = false;
        }
        return dispatchTouchEvent;
    }

    public c4a getAutoRunner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c4a) ipChange.ipc$dispatch("b82faca6", new Object[]{this});
        }
        return this.mAutoRunner;
    }

    public ViewGroup getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("5180f326", new Object[]{this});
        }
        return this.mScrollContent;
    }

    public int getCurrentSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bbc3278", new Object[]{this})).intValue();
        }
        return this.mCurrentItem;
    }

    public int getFlingCount(int i, int i2) {
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c283963", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i == 0) {
            return 0;
        }
        if (i <= 0) {
            i3 = -1;
        }
        return (int) (i3 * Math.ceil((((i * i3) * this.mFlingFactor) / i2) - this.mTriggerOffset));
    }

    public int getGalleryDisplayWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3375fda", new Object[]{this})).intValue();
        }
        return this.mGalleryDisplayWidth;
    }

    public int getInternalWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c19844d", new Object[]{this})).intValue();
        }
        if (this.mExpectedAdapterCount > 2) {
            return this.mFoldedCardWidth;
        }
        return getWidth();
    }

    public <T> T getItemInfo(int i, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("62bbc63a", new Object[]{this, new Integer(i), cls});
        }
        if (i >= 0 && i < this.mItems.size()) {
            d dVar = this.mItems.get(i);
            if (cls.isInstance(dVar)) {
                return cls.cast(dVar);
            }
        }
        return null;
    }

    public boolean getLoopScrollEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1429675", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public abstract int getScrollLimit();

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.needIntercept = false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.mManualScrollEnable) {
            return false;
        }
        if (this.needIntercept && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (!this.init) {
            setCurrentSelected(this.mCurrentItem, true);
            this.init = true;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        c4a c4aVar;
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!nvs.F()) {
            return true;
        }
        if (!this.mManualScrollEnable) {
            this.lastMotionEventAction = motionEvent.getActionMasked();
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        this.mCustomScroller.abortAnimation();
        if (actionMasked == 2) {
            int scrollX = getScrollX() - this.mScrollOffsetOnTouchDown;
            if (Math.abs(scrollX) < (getScrollLimit() * 2.0f) / 3.0f) {
                this.mDynamicBlockFactor = this.mHorizontalScrollFactor;
            } else {
                float abs = Math.abs(1.0f - ((scrollX - getScrollLimit()) / (getScrollLimit() / 2.0f)));
                this.mDynamicBlockFactor = Math.max(0.0f, Math.min(abs * abs * abs, this.mHorizontalScrollFactor));
            }
            z = super.onTouchEvent(motionEvent);
            if (!(this.lastMotionEventAction == 2 || (fVar = this.mOnGalleryScrollListener) == null)) {
                ((bg6.a) fVar).e(getScrollX(), true);
                this.mIsOnScrollStarted = true;
            }
        } else {
            this.mDynamicBlockFactor = this.mHorizontalScrollFactor;
            z = super.onTouchEvent(motionEvent);
        }
        this.lastMotionEventAction = actionMasked;
        if (z && actionMasked == 0) {
            int scrollX2 = getScrollX();
            this.mTouchDownPointer = scrollX2;
            int computeCurrentItemByScroll = computeCurrentItemByScroll(scrollX2);
            this.mCurrentItemBeforeTouchDown = computeCurrentItemByScroll;
            this.mCurrentVirtualItemBeforeTouchDown = virtualIndexForViewIndex(computeCurrentItemByScroll);
            c4a c4aVar2 = this.mAutoRunner;
            if (c4aVar2 != null && c4aVar2.l()) {
                this.mAutoRunner.m();
            }
        }
        if (z && actionMasked == 1) {
            String str = TAG;
            r0h.b(str, "MarqueeGallery >> check fling and scroll. fling=" + this.mIsFling);
            removeCallbacks(this.mScrollerTask);
            postDelayed(this.mScrollerTask, 16L);
            c4a c4aVar3 = this.mAutoRunner;
            if (c4aVar3 != null && !c4aVar3.l()) {
                this.mAutoRunner.n(false);
            }
        }
        if (actionMasked == 3 && (c4aVar = this.mAutoRunner) != null && !c4aVar.l()) {
            this.mAutoRunner.n(false);
        }
        return z;
    }

    public void originOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8caf49", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onScrollChanged(i, i2, i3, i4);
        }
    }

    public void originalFling(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac8031", new Object[]{this, new Integer(i)});
        } else {
            super.fling(i);
        }
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e93d6ab9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
        }
        return super.overScrollBy(Math.round(i * Math.min(this.mHorizontalScrollFactor, this.mDynamicBlockFactor)), i2, i3, i4, i5, i6, i7, i8, z);
    }

    public Rect rectForIndex(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("9f9e77f8", new Object[]{this, new Integer(i)}) : rectForIndex(i, this.mCurrentItem);
    }

    public abstract void reloadViews(int i, ViewGroup viewGroup);

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2625ad52", new Object[]{this, view, view2});
        } else {
            r0h.b(TAG, "MarqueeGallery >> requestChildFocus");
        }
    }

    public int safeTargetPosition(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3878ca1", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (this.loopScrollEnable) {
            return i;
        }
        if (i < 0) {
            return 0;
        }
        if (i >= i2) {
            return i2 - 1;
        }
        return i;
    }

    public void scrollToPage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8fdf8e5", new Object[]{this, new Integer(i)});
        } else {
            smoothScrollToRect(rectForIndex(i).left);
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d478923", new Object[]{this, pagerAdapter});
            return;
        }
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            pagerAdapter2.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                d dVar = this.mItems.get(i);
                PagerAdapter pagerAdapter3 = this.mAdapter;
                dVar.getClass();
                pagerAdapter3.destroyItem((ViewGroup) this, 0, dVar.b);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            this.mCurrentItem = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter4 = this.mAdapter;
        List<d> list = this.mItems;
        if (list == null || list.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.mItems);
        }
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (pagerAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new b();
            }
            int count = this.mAdapter.getCount();
            this.mExpectedAdapterCount = count;
            reloadViews(count, null);
        } else {
            this.mOnGalleryScrollListener = null;
            this.mOnCardAnimatePerformListener = null;
            removeAllViews();
        }
        if (!(pagerAdapter4 == null || arrayList == null)) {
            int count2 = pagerAdapter4.getCount();
            for (int i2 = 0; i2 < count2; i2++) {
                pagerAdapter4.destroyItem((ViewGroup) this, i2, ((d) arrayList.get(i2)).b);
            }
            arrayList.clear();
        }
    }

    public void setAutoRunner(c4a c4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("498ffe54", new Object[]{this, c4aVar});
        } else {
            this.mAutoRunner = c4aVar;
        }
    }

    public void setCardCornerRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd4c803", new Object[]{this, new Integer(i)});
        } else {
            this.mCardCornerRadius = i;
        }
    }

    public void setCardHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae59ca3", new Object[]{this, new Integer(i)});
        } else {
            this.mCardHeight = i;
        }
    }

    public void setCardSpacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ec80ab", new Object[]{this, new Integer(i)});
        } else {
            this.mCardSpacing = i;
        }
    }

    public abstract void setCurrentSelected(int i, boolean z);

    public void setEnableScaleAnime(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f35eb8de", new Object[]{this, new Boolean(z)});
        } else {
            this.enableScale = z;
        }
    }

    public void setFoldedCardVisibleCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93f5a4d", new Object[]{this, new Integer(i)});
        } else {
            this.mFoldedCardVisibleCount = i;
        }
    }

    public void setFoldedCardWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50286c88", new Object[]{this, new Integer(i)});
        } else {
            this.mFoldedCardWidth = i;
        }
    }

    public void setGalleryDisplayWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7381d908", new Object[]{this, new Integer(i)});
        } else {
            this.mGalleryDisplayWidth = i;
        }
    }

    public void setInterceptCondition(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf63a290", new Object[]{this, cVar});
        }
    }

    public void setLoopScrollEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7239cf7", new Object[]{this, new Boolean(z)});
        }
    }

    public void setOnCardAnimatePerformListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1e9c3c", new Object[]{this, eVar});
        } else {
            this.mOnCardAnimatePerformListener = eVar;
        }
    }

    public void setOnGalleryScrollListener(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a772ef0a", new Object[]{this, fVar});
        } else {
            this.mOnGalleryScrollListener = fVar;
        }
    }

    public void setOnScrollListener(nuk nukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4261c2b9", new Object[]{this, nukVar});
        }
    }

    public void setScrollAnimDuration(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04d1d69", new Object[]{this, new Long(j)});
            return;
        }
        this.animationDuration = j;
        if (j <= 0) {
            this.animationDuration = 300L;
        }
    }

    public void setScrollEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
        } else {
            this.mManualScrollEnable = z;
        }
    }

    public abstract void smoothScrollToRect(int i);

    public abstract void smoothScrollToRectWithAnim(int i, boolean z);

    public abstract void updateCurrentSelected(int i, boolean z);

    public abstract int viewIndexForVirtualIndex(int i);

    public abstract int virtualIndexForViewIndex(int i);

    public AbsFlexibleMarqueeGallery(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.magnetPosition = true;
        this.enableScale = true;
        this.mFoldedCardVisibleCount = 2;
        this.mFoldedCardWidth = 250;
        this.mExpandedCardWidth = 0;
        this.mCardSpacing = 10;
        this.mFlingFactor = 0.3f;
        this.mTriggerOffset = 0.25f;
        this.mScrollOffsetOnTouchDown = -1;
        this.mAutoScrollAnimationOnStart = -1;
        this.mManualScrollEnable = true;
        this.mIsTouching = false;
        this.mIsFling = false;
        this.mVisibleIndexes = new HashSet();
        this.mHorizontalScrollFactor = 1.0f;
        this.mDynamicBlockFactor = 0.5f;
        this.mActiveFeature = 0;
        this.mTouchDownPointer = 0;
        this.mCurrentItemBeforeTouchDown = 0;
        this.mCurrentVirtualItemBeforeTouchDown = 0;
        this.lastMotionEventAction = 3;
        this.mIsOnScrollStarted = false;
        this.mIsRunnerScrollStarted = false;
        this.loopScrollEnable = true;
        this.init = false;
        this.childrenCount = 0;
        this.animationDuration = 300L;
        this.mSetVisibleIndexedHandler = new Handler(Looper.getMainLooper());
        this.needIntercept = false;
        this.mAdapter = null;
        this.mObserver = null;
        this.mExpectedAdapterCount = 0;
        this.mActualVisibleCardCount = 1;
        this.backwardsLoopSpacing = 0;
        this.forwardsLoopSpacing = 0;
        this.mainContentWidth = 0;
        this.mItems = new ArrayList();
        this.mGalleryDisplayWidth = 0;
        this.density = 1.0f;
        this.mCardCornerRadius = 0.0f;
        this.mAutoRunner = null;
        this.lastSelectedItem = 0;
        this.lastAnimateView = null;
        this.lastVirtualStart = 0;
        this.lastVirtualEnd = 0;
        this.mCurrentVisibleVirtualIndexes = new HashSet<>();
        this.mCurrentVisibleViewIndexes = new HashSet<>();
        this.setVisibleIndexTask = null;
        this.notifyOnSwitch = false;
        setImportantForAccessibility(2);
        this.mCustomScroller = createScroller(context);
        this.mScrollerTask = createScrollerTask();
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
    }

    public Rect rectForIndex(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("1ec0ff3d", new Object[]{this, new Integer(i), new Integer(i2)}) : rectForIndex(i, i2, false);
    }

    public void setVisibleIndexes(Set<Integer> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c08c28", new Object[]{this, set});
            return;
        }
        HashSet hashSet = new HashSet(set);
        if (this.loopScrollEnable) {
            int intValue = ((Integer) Collections.min(set, INTEGER_COMPARATOR)).intValue();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                Rect rectForIndex = rectForIndex(intValue2, intValue, true);
                View childAt = this.mScrollContent.getChildAt(viewIndexForVirtualIndex(intValue2));
                if (childAt == null) {
                    String str = TAG;
                    r0h.b(str, "setVisibleIndexes fail. mParent.count:" + this.mScrollContent.getChildCount() + ", viewIndex:" + viewIndexForVirtualIndex(intValue2));
                    return;
                }
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof FlexibleContainerView.LayoutParams) {
                    FlexibleContainerView.LayoutParams layoutParams2 = (FlexibleContainerView.LayoutParams) layoutParams;
                    layoutParams2.fillLayoutResult(rectForIndex);
                    childAt.layout(layoutParams2.left, layoutParams2.top, layoutParams2.right, layoutParams2.bottom);
                } else if (layoutParams instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams3.leftMargin = rectForIndex.left;
                    layoutParams3.width = rectForIndex.width();
                    childAt.setLayoutParams(layoutParams3);
                } else {
                    childAt.layout(rectForIndex.left, rectForIndex.top, rectForIndex.right, rectForIndex.bottom);
                }
            }
        }
        this.mVisibleIndexes.clear();
        this.mVisibleIndexes.addAll(set);
    }

    public int computeCurrentItemByScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89cfe656", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = this.mExpandedCardWidth;
        int i3 = this.mFoldedCardWidth;
        int i4 = (int) (((i - (i2 - i3)) * 1.0f) / (i3 + this.mCardSpacing));
        int i5 = this.mActualVisibleCardCount;
        return (i4 > i5 + 1 ? i4 - (i5 + 1) : i4 + ((this.mExpectedAdapterCount - i5) - 1)) % this.mExpectedAdapterCount;
    }

    public Rect rectForIndex(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("4b247da9", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)}) : rectForIndex(i, i2, z, null);
    }

    public Rect rectForIndex(int i, int i2, boolean z, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("c5a782c2", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), rect});
        }
        if (rect == null) {
            rect = new Rect();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i3 = this.mCardHeight;
        if (i3 <= 0) {
            i3 = layoutParams instanceof FlexibleContainerView.LayoutParams ? ((FlexibleContainerView.LayoutParams) layoutParams).height() : layoutParams.height;
        }
        if (this.mExpectedAdapterCount > 2) {
            if (!z) {
                i2 = virtualIndexForViewIndex(i2);
            }
            if (i == i2) {
                rect.set(0, 0, this.mExpandedCardWidth, i3);
                int i4 = this.mExpandedCardWidth;
                int i5 = this.mFoldedCardWidth;
                rect.offset((i4 - i5) + (i * (i5 + this.mCardSpacing)), 0);
            } else if (i < i2) {
                rect.set(0, 0, this.mExpandedCardWidth, i3);
                int i6 = this.mExpandedCardWidth;
                int i7 = this.mFoldedCardWidth;
                int i8 = this.mCardSpacing;
                rect.offset((((i6 - i7) + (i * (i7 + i8))) - (i6 - i7)) - i8, 0);
            } else {
                rect.set(0, 0, this.mFoldedCardWidth, i3);
                int i9 = this.mExpandedCardWidth;
                int i10 = this.mFoldedCardWidth;
                int i11 = this.mCardSpacing;
                rect.offset((i9 - i10) + ((i10 + i11) * i2) + i9 + i11 + (((i - i2) - 1) * (i10 + i11)), 0);
            }
        } else {
            rect.set(0, 0, this.mExpandedCardWidth, i3);
            rect.offset((this.mExpandedCardWidth + this.mCardSpacing) * i, 0);
        }
        return rect;
    }
}
