package com.taobao.uikit.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.core.os.ParcelableCompat;
import androidx.core.os.ParcelableCompatCreatorCallbacks;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.VelocityTrackerCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LoopViewPager extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CLOSE_ENOUGH = 2;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "LoopViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    private PagerAdapter mAdapter;
    private OnAdapterChangeListener mAdapterChangeListener;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    private int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsLeftToRight;
    private boolean mIsUnableToDrag;
    private final ArrayList<ItemInfo> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private OnPageChangeListener mOnPageChangeListener;
    private int mPageMargin;
    private PageTransformer mPageTransformer;
    private boolean mPopulatePending;
    private float mRatio;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private Method mSetChildrenDrawingOrderEnabled;
    private final ItemInfo mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    private static final int[] LAYOUT_ATTRS = {16842931};
    private static final Comparator<ItemInfo> COMPARATOR = new Comparator<ItemInfo>() { // from class: com.taobao.uikit.component.LoopViewPager.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5329975f", new Object[]{this, itemInfo, itemInfo2})).intValue() : itemInfo.position - itemInfo2.position;
        }
    };
    private static final Interpolator sInterpolator = new Interpolator() { // from class: com.taobao.uikit.component.LoopViewPager.2
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
    };
    private static final ViewPositionComparator sPositionComparator = new ViewPositionComparator();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface Decor {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ItemInfo {
        public Object object;
        public float offset;
        public int position;
        public boolean scrolling;
        public float widthFactor;

        static {
            t2o.a(931135509);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class MyAccessibilityDelegate extends AccessibilityDelegateCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(931135511);
        }

        public MyAccessibilityDelegate() {
        }

        private boolean canScroll() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9bf314c8", new Object[]{this})).booleanValue();
            }
            if (LoopViewPager.access$200(LoopViewPager.this) == null || LoopViewPager.access$200(LoopViewPager.this).getCount() <= 1) {
                return false;
            }
            return true;
        }

        public static /* synthetic */ Object ipc$super(MyAccessibilityDelegate myAccessibilityDelegate, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1476904323) {
                return new Boolean(super.performAccessibilityAction((View) objArr[0], ((Number) objArr[1]).intValue(), (Bundle) objArr[2]));
            }
            if (hashCode == -672710132) {
                super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                return null;
            } else if (hashCode == -485045190) {
                super.onInitializeAccessibilityEvent((View) objArr[0], (AccessibilityEvent) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/uikit/component/LoopViewPager$MyAccessibilityDelegate");
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e316cc3a", new Object[]{this, view, accessibilityEvent});
                return;
            }
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            AccessibilityRecordCompat obtain = AccessibilityRecordCompat.obtain();
            obtain.setScrollable(canScroll());
            if (accessibilityEvent.getEventType() == 4096 && LoopViewPager.access$200(LoopViewPager.this) != null) {
                obtain.setItemCount(LoopViewPager.access$200(LoopViewPager.this).getCount());
                obtain.setFromIndex(LoopViewPager.access$300(LoopViewPager.this));
                obtain.setToIndex(LoopViewPager.access$300(LoopViewPager.this));
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7e7420c", new Object[]{this, view, accessibilityNodeInfoCompat});
                return;
            }
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(canScroll());
            if (LoopViewPager.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (LoopViewPager.this.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a7f83a7d", new Object[]{this, view, new Integer(i), bundle})).booleanValue();
            }
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !LoopViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                LoopViewPager loopViewPager = LoopViewPager.this;
                loopViewPager.setCurrentItem(LoopViewPager.access$300(loopViewPager) - 1);
                return true;
            } else if (!LoopViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                LoopViewPager loopViewPager2 = LoopViewPager.this;
                loopViewPager2.setCurrentItem(LoopViewPager.access$300(loopViewPager2) + 1);
                return true;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnAdapterChangeListener {
        void onAdapterChanged(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface PageTransformer {
        void transformPage(View view, float f);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class PagerObserver extends DataSetObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(931135515);
        }

        private PagerObserver() {
        }

        public static /* synthetic */ Object ipc$super(PagerObserver pagerObserver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/component/LoopViewPager$PagerObserver");
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            } else {
                LoopViewPager.this.dataSetChanged();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
            } else {
                LoopViewPager.this.dataSetChanged();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks<SavedState>() { // from class: com.taobao.uikit.component.LoopViewPager.SavedState.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.core.os.ParcelableCompatCreatorCallbacks
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (SavedState) ipChange.ipc$dispatch("ba0553e", new Object[]{this, parcel, classLoader}) : new SavedState(parcel, classLoader);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.core.os.ParcelableCompatCreatorCallbacks
            public SavedState[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (SavedState[]) ipChange.ipc$dispatch("3a6d60d9", new Object[]{this, new Integer(i)}) : new SavedState[i];
            }
        });
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        static {
            t2o.a(931135516);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.adapterState, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.position = parcel.readInt();
            this.adapterState = parcel.readParcelable(classLoader);
            this.loader = classLoader;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(931135518);
            t2o.a(931135513);
        }

        @Override // com.taobao.uikit.component.LoopViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // com.taobao.uikit.component.LoopViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            }
        }

        @Override // com.taobao.uikit.component.LoopViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ViewPositionComparator implements Comparator<View> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(931135519);
        }

        public int compare(View view, View view2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("78d0109f", new Object[]{this, view, view2})).intValue();
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.isDecor;
            if (z != layoutParams2.isDecor) {
                return z ? 1 : -1;
            }
            return layoutParams.position - layoutParams2.position;
        }
    }

    static {
        t2o.a(931135504);
    }

    public LoopViewPager(Context context) {
        super(context);
        this.mRatio = 0.0f;
        this.mItems = new ArrayList<>();
        this.mTempItem = new ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mEndScrollRunnable = new Runnable() { // from class: com.taobao.uikit.component.LoopViewPager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LoopViewPager.access$000(LoopViewPager.this, 0);
                LoopViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    public static /* synthetic */ void access$000(LoopViewPager loopViewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab97ea5", new Object[]{loopViewPager, new Integer(i)});
        } else {
            loopViewPager.setScrollState(i);
        }
    }

    public static /* synthetic */ PagerAdapter access$200(LoopViewPager loopViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PagerAdapter) ipChange.ipc$dispatch("398a9645", new Object[]{loopViewPager});
        }
        return loopViewPager.mAdapter;
    }

    public static /* synthetic */ int access$300(LoopViewPager loopViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4a2c614", new Object[]{loopViewPager})).intValue();
        }
        return loopViewPager.mCurItem;
    }

    public static /* synthetic */ int[] access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("7d6f9bc9", new Object[0]);
        }
        return LAYOUT_ATTRS;
    }

    private void calculatePageOffsets(ItemInfo itemInfo, int i, ItemInfo itemInfo2) {
        float f;
        float f2;
        float f3;
        ItemInfo itemInfo3;
        ItemInfo itemInfo4;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e49bc5f3", new Object[]{this, itemInfo, new Integer(i), itemInfo2});
            return;
        }
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f = this.mPageMargin / clientWidth;
        } else {
            f = 0.0f;
        }
        if (itemInfo2 != null) {
            int i3 = itemInfo2.position;
            int i4 = itemInfo.position;
            if (i3 < i4) {
                float f4 = itemInfo2.offset + itemInfo2.widthFactor + f;
                while (true) {
                    i3++;
                    if (i3 > itemInfo.position || i2 >= this.mItems.size()) {
                        break;
                    }
                    ItemInfo itemInfo5 = this.mItems.get(i2);
                    while (true) {
                        itemInfo4 = itemInfo5;
                        if (i3 <= itemInfo4.position || i2 >= this.mItems.size() - 1) {
                            break;
                        }
                        i2++;
                        itemInfo5 = this.mItems.get(i2);
                    }
                    while (i3 < itemInfo4.position) {
                        f4 += this.mAdapter.getPageWidth(i3) + f;
                        i3++;
                    }
                    itemInfo4.offset = f4;
                    f4 += itemInfo4.widthFactor + f;
                }
            } else if (i3 > i4) {
                int size = this.mItems.size() - 1;
                float f5 = itemInfo2.offset;
                int i5 = i3 - 1;
                while (i5 >= itemInfo.position && size >= 0) {
                    ItemInfo itemInfo6 = this.mItems.get(size);
                    while (true) {
                        itemInfo3 = itemInfo6;
                        if (i5 >= itemInfo3.position || size <= 0) {
                            break;
                        }
                        size--;
                        itemInfo6 = this.mItems.get(size);
                    }
                    while (i5 > itemInfo3.position) {
                        f5 -= this.mAdapter.getPageWidth(i5) + f;
                        i5--;
                    }
                    f5 -= itemInfo3.widthFactor + f;
                    itemInfo3.offset = f5;
                    i5--;
                }
            }
        }
        int size2 = this.mItems.size();
        float f6 = itemInfo.offset;
        int i6 = itemInfo.position - 1;
        if (!canLoop()) {
            int i7 = itemInfo.position;
            if (i7 == 0) {
                f2 = itemInfo.offset;
            } else {
                f2 = -3.4028235E38f;
            }
            this.mFirstOffset = f2;
            if (i7 == count - 1) {
                f3 = (itemInfo.offset + itemInfo.widthFactor) - 1.0f;
            } else {
                f3 = Float.MAX_VALUE;
            }
            this.mLastOffset = f3;
        }
        int i8 = i - 1;
        while (i8 >= 0) {
            ItemInfo itemInfo7 = this.mItems.get(i8);
            while (i6 > itemInfo7.position) {
                f6 -= this.mAdapter.getPageWidth(i6) + f;
                i6--;
            }
            f6 -= itemInfo7.widthFactor + f;
            itemInfo7.offset = f6;
            if (!canLoop() && itemInfo7.position == 0) {
                this.mFirstOffset = f6;
            }
            i8--;
            i6--;
        }
        float f7 = itemInfo.offset + itemInfo.widthFactor + f;
        int i9 = itemInfo.position + 1;
        int i10 = i + 1;
        while (i10 < size2) {
            ItemInfo itemInfo8 = this.mItems.get(i10);
            while (i9 < itemInfo8.position) {
                f7 += this.mAdapter.getPageWidth(i9) + f;
                i9++;
            }
            if (!canLoop() && itemInfo8.position == count - 1) {
                this.mLastOffset = (itemInfo8.widthFactor + f7) - 1.0f;
            }
            itemInfo8.offset = f7;
            f7 += itemInfo8.widthFactor + f;
            i10++;
            i9++;
        }
    }

    private void completeScroll(boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c980b987", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.mScrollState == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            setScrollingCacheEnabled(false);
            this.mScroller.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.mPopulatePending = false;
        for (int i = 0; i < this.mItems.size(); i++) {
            ItemInfo itemInfo = this.mItems.get(i);
            if (itemInfo.scrolling) {
                itemInfo.scrolling = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            ViewCompat.postOnAnimation(this, this.mEndScrollRunnable);
        } else {
            this.mEndScrollRunnable.run();
        }
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c7b8caa", new Object[]{this, new Integer(i), new Float(f), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) {
            float f2 = 0.6f;
            if (!canLoop() ? i >= this.mCurItem : i == getRightPos(this.mCurItem)) {
                f2 = 0.4f;
            }
            i = (int) (i + f + f2);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.mItems.size() > 0) {
            ItemInfo itemInfo = this.mItems.get(0);
            ArrayList<ItemInfo> arrayList = this.mItems;
            ItemInfo itemInfo2 = arrayList.get(arrayList.size() - 1);
            if (!canLoop()) {
                return Math.max(itemInfo.position, Math.min(i, itemInfo2.position));
            }
            if (i >= this.mAdapter.getCount()) {
                return 0;
            }
        }
        return i;
    }

    private void enableLayers(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1460e5a8", new Object[]{this, new Boolean(z)});
            return;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (z) {
                i = 2;
            } else {
                i = 0;
            }
            ViewCompat.setLayerType(getChildAt(i2), i, null);
        }
    }

    private void endDrag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7221d9b6", new Object[]{this});
            return;
        }
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("596ff4b0", new Object[]{this, rect, view});
        }
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private int getClientWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea7a717f", new Object[]{this})).intValue();
        }
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private ItemInfo infoForCurrentScrollPosition() {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemInfo) ipChange.ipc$dispatch("f6746a6f", new Object[]{this});
        }
        int clientWidth = getClientWidth();
        float f3 = 0.0f;
        if (clientWidth > 0) {
            f = getScrollX() / clientWidth;
        } else {
            f = 0.0f;
        }
        if (clientWidth > 0) {
            f2 = this.mPageMargin / clientWidth;
        } else {
            f2 = 0.0f;
        }
        ItemInfo itemInfo = null;
        float f4 = 0.0f;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        while (i < this.mItems.size()) {
            ItemInfo itemInfo2 = this.mItems.get(i);
            if (!z && itemInfo2.position != getRightPosCompat(i2)) {
                itemInfo2 = this.mTempItem;
                itemInfo2.offset = f3 + f4 + f2;
                int rightPosCompat = getRightPosCompat(i2);
                itemInfo2.position = rightPosCompat;
                itemInfo2.widthFactor = this.mAdapter.getPageWidth(rightPosCompat);
                i--;
            }
            f3 = itemInfo2.offset;
            float f5 = itemInfo2.widthFactor + f3 + f2;
            if (!z && f < f3) {
                return itemInfo;
            }
            if (f < f5 || i == this.mItems.size() - 1) {
                return itemInfo2;
            }
            i2 = itemInfo2.position;
            f4 = itemInfo2.widthFactor;
            i++;
            itemInfo = itemInfo2;
            z = false;
        }
        return itemInfo;
    }

    public static /* synthetic */ Object ipc$super(LoopViewPager loopViewPager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1894755994:
                return new Boolean(super.verifyDrawable((Drawable) objArr[0]));
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1145345097:
                return new Boolean(super.dispatchPopulateAccessibilityEvent((AccessibilityEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 448480424:
                super.drawableStateChanged();
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1246973220:
                return new Boolean(super.dispatchKeyEvent((KeyEvent) objArr[0]));
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
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
            case 2043983618:
                return new Boolean(super.checkLayoutParams((ViewGroup.LayoutParams) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/component/LoopViewPager");
        }
    }

    private boolean isGutterDrag(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f6f81c4", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        if (f < this.mGutterSize && f2 > 0.0f) {
            return true;
        }
        if (f <= getWidth() - this.mGutterSize || f2 >= 0.0f) {
            return false;
        }
        return true;
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24b537f", new Object[]{this, motionEvent});
            return;
        }
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.mActivePointerId) {
            if (actionIndex != 0) {
                i = 0;
            }
            this.mLastMotionX = MotionEventCompat.getX(motionEvent, i);
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean performDrag(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c98c5d08", new Object[]{this, new Float(f)})).booleanValue();
        }
        float f2 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        ItemInfo itemInfo = this.mItems.get(0);
        ArrayList<ItemInfo> arrayList = this.mItems;
        ItemInfo itemInfo2 = arrayList.get(arrayList.size() - 1);
        if (itemInfo.position != 0) {
            f3 = itemInfo.offset * clientWidth;
        }
        if (itemInfo2.position != this.mAdapter.getCount() - 1) {
            f4 = itemInfo2.offset * clientWidth;
        }
        if (scrollX < f3) {
            scrollX = f3;
        } else if (scrollX > f4) {
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.mLastMotionX += scrollX - i;
        scrollTo(i, getScrollY());
        pageScrolled(i);
        return false;
    }

    private int populateLeftToRight(int i) {
        ItemInfo itemInfo;
        ItemInfo itemInfo2;
        ItemInfo itemInfo3;
        ItemInfo itemInfo4;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46e4b63f", new Object[]{this, new Integer(i)})).intValue();
        }
        int i3 = i - 1;
        if (i3 >= 0) {
            itemInfo = this.mItems.get(i3);
        } else {
            itemInfo = null;
        }
        int i4 = this.mCurItem;
        int i5 = 0;
        while (true) {
            int i6 = this.mOffscreenPageLimit;
            if (i5 >= i6 + 1) {
                break;
            }
            if (i3 >= (-i6)) {
                if (itemInfo == null) {
                    int leftPos = getLeftPos(i4);
                    addNewItem(leftPos, 0);
                    i++;
                    i3--;
                    if (i3 >= 0) {
                        itemInfo4 = this.mItems.get(i3);
                    } else {
                        itemInfo4 = null;
                    }
                    i4 = leftPos;
                    itemInfo = itemInfo4;
                } else if (i5 == i6) {
                    this.mItems.remove(i3);
                    this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
                    i--;
                    int i7 = i3 - 1;
                    if (i7 >= 0) {
                        this.mItems.get(i7);
                    }
                } else {
                    i3--;
                    if (i3 >= 0) {
                        itemInfo = this.mItems.get(i3);
                    } else {
                        itemInfo = null;
                    }
                    if (itemInfo == null) {
                        break;
                    }
                }
            }
            i5++;
        }
        int i8 = i + 1;
        if (i8 < this.mItems.size()) {
            itemInfo2 = this.mItems.get(i8);
        } else {
            itemInfo2 = null;
        }
        int i9 = this.mCurItem;
        while (true) {
            int i10 = this.mOffscreenPageLimit;
            if (i2 >= i10 + 1) {
                break;
            }
            if (i8 <= (i10 * 2) + 1) {
                if (itemInfo2 == null) {
                    int rightPos = getRightPos(i9);
                    addNewItem(rightPos, i8);
                    i8++;
                    if (i8 < this.mItems.size()) {
                        itemInfo3 = this.mItems.get(i8);
                    } else {
                        itemInfo3 = null;
                    }
                    if (i8 >= (this.mOffscreenPageLimit * 2) + 1) {
                        break;
                    }
                    i9 = rightPos;
                    itemInfo2 = itemInfo3;
                } else if (i2 == i10) {
                    this.mItems.remove(i8);
                    this.mAdapter.destroyItem((ViewGroup) this, itemInfo2.position, itemInfo2.object);
                    int i11 = i8 + 1;
                    if (i11 < this.mItems.size()) {
                        this.mItems.get(i11);
                    }
                } else {
                    i8++;
                    if (i8 < this.mItems.size()) {
                        itemInfo2 = this.mItems.get(i8);
                    } else {
                        itemInfo2 = null;
                    }
                    if (itemInfo2 == null) {
                        break;
                    }
                }
            }
            i2++;
        }
        return i;
    }

    private int populateNoLoop(int i, int i2, int i3, int i4, ItemInfo itemInfo) {
        ItemInfo itemInfo2;
        float f;
        ItemInfo itemInfo3;
        ItemInfo itemInfo4;
        int i5 = i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bbf0e21", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i5), itemInfo})).intValue();
        }
        int i6 = i5 - 1;
        if (i6 >= 0) {
            itemInfo2 = this.mItems.get(i6);
        } else {
            itemInfo2 = null;
        }
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        if (clientWidth <= 0) {
            f = 0.0f;
        } else {
            f = (2.0f - itemInfo.widthFactor) + (getPaddingLeft() / clientWidth);
        }
        float f3 = 0.0f;
        for (int i7 = this.mCurItem - 1; i7 >= 0; i7--) {
            if (f3 < f || i7 >= i2) {
                if (itemInfo2 == null || i7 != itemInfo2.position) {
                    f3 += addNewItem(i7, i6 + 1).widthFactor;
                    i5++;
                    if (i6 >= 0) {
                        itemInfo4 = this.mItems.get(i6);
                        itemInfo2 = itemInfo4;
                    }
                    itemInfo4 = null;
                    itemInfo2 = itemInfo4;
                } else {
                    f3 += itemInfo2.widthFactor;
                    i6--;
                    if (i6 >= 0) {
                        itemInfo4 = this.mItems.get(i6);
                        itemInfo2 = itemInfo4;
                    }
                    itemInfo4 = null;
                    itemInfo2 = itemInfo4;
                }
            } else if (itemInfo2 == null) {
                break;
            } else if (i7 == itemInfo2.position && !itemInfo2.scrolling) {
                this.mItems.remove(i6);
                this.mAdapter.destroyItem((ViewGroup) this, i7, itemInfo2.object);
                i6--;
                i5--;
                if (i6 >= 0) {
                    itemInfo4 = this.mItems.get(i6);
                    itemInfo2 = itemInfo4;
                }
                itemInfo4 = null;
                itemInfo2 = itemInfo4;
            }
        }
        float f4 = itemInfo.widthFactor;
        int i8 = i5 + 1;
        if (f4 < 2.0f) {
            if (i8 < this.mItems.size()) {
                itemInfo3 = this.mItems.get(i8);
            } else {
                itemInfo3 = null;
            }
            if (clientWidth > 0) {
                f2 = (getPaddingRight() / clientWidth) + 2.0f;
            }
            int i9 = this.mCurItem;
            while (true) {
                i9++;
                if (i9 >= i) {
                    break;
                } else if (f4 < f2 || i9 <= i3) {
                    if (itemInfo3 == null || i9 != itemInfo3.position) {
                        ItemInfo addNewItem = addNewItem(i9, i8);
                        i8++;
                        f4 += addNewItem.widthFactor;
                        if (i8 < this.mItems.size()) {
                            itemInfo3 = this.mItems.get(i8);
                        } else {
                            itemInfo3 = null;
                        }
                    } else {
                        f4 += itemInfo3.widthFactor;
                        i8++;
                        if (i8 < this.mItems.size()) {
                            itemInfo3 = this.mItems.get(i8);
                        } else {
                            itemInfo3 = null;
                        }
                    }
                } else if (itemInfo3 == null) {
                    break;
                } else if (i9 == itemInfo3.position && !itemInfo3.scrolling) {
                    this.mItems.remove(i8);
                    this.mAdapter.destroyItem((ViewGroup) this, i9, itemInfo3.object);
                    if (i8 < this.mItems.size()) {
                        itemInfo3 = this.mItems.get(i8);
                    } else {
                        itemInfo3 = null;
                    }
                }
            }
        }
        return i5;
    }

    private int populateRightToLeft(int i) {
        ItemInfo itemInfo;
        ItemInfo itemInfo2;
        ItemInfo itemInfo3;
        ItemInfo itemInfo4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("948f4cbb", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = i + 1;
        if (i2 < this.mItems.size()) {
            itemInfo = this.mItems.get(i2);
        } else {
            itemInfo = null;
        }
        int i3 = this.mCurItem;
        int i4 = 0;
        while (true) {
            int i5 = this.mOffscreenPageLimit;
            if (i4 >= i5 + 1) {
                break;
            }
            if (i2 <= (i5 * 2) + 1) {
                if (itemInfo == null) {
                    int rightPos = getRightPos(i3);
                    addNewItem(rightPos, i2);
                    i2++;
                    if (i2 < this.mItems.size()) {
                        itemInfo4 = this.mItems.get(i2);
                    } else {
                        itemInfo4 = null;
                    }
                    if (i2 >= (this.mOffscreenPageLimit * 2) + 1) {
                        break;
                    }
                    i3 = rightPos;
                    itemInfo = itemInfo4;
                } else if (i4 == i5) {
                    this.mItems.remove(i2);
                    this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
                    int i6 = i2 + 1;
                    if (i6 < this.mItems.size()) {
                        this.mItems.get(i6);
                    }
                } else {
                    i2++;
                    if (i2 < this.mItems.size()) {
                        itemInfo = this.mItems.get(i2);
                    } else {
                        itemInfo = null;
                    }
                    if (itemInfo == null) {
                        break;
                    }
                }
            }
            i4++;
        }
        int i7 = i - 1;
        if (i7 >= 0) {
            itemInfo2 = this.mItems.get(i7);
        } else {
            itemInfo2 = null;
        }
        int i8 = this.mCurItem;
        int i9 = 0;
        while (true) {
            int i10 = this.mOffscreenPageLimit;
            if (i9 >= i10 + 1) {
                break;
            }
            if (i7 >= (-i10)) {
                if (itemInfo2 == null) {
                    int leftPos = getLeftPos(i8);
                    addNewItem(leftPos, 0);
                    i++;
                    i7--;
                    if (i7 >= 0) {
                        itemInfo3 = this.mItems.get(i7);
                    } else {
                        itemInfo3 = null;
                    }
                    i8 = leftPos;
                    itemInfo2 = itemInfo3;
                } else if (i9 == i10) {
                    this.mItems.remove(i7);
                    this.mAdapter.destroyItem((ViewGroup) this, itemInfo2.position, itemInfo2.object);
                    i--;
                    int i11 = i7 - 1;
                    if (i11 >= 0) {
                        this.mItems.get(i11);
                    }
                } else {
                    i7--;
                    if (i7 >= 0) {
                        itemInfo2 = this.mItems.get(i7);
                    } else {
                        itemInfo2 = null;
                    }
                    if (itemInfo2 == null) {
                        break;
                    }
                }
            }
            i9++;
        }
        return i;
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b766a1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (i2 <= 0 || this.mItems.isEmpty()) {
            ItemInfo infoForPosition = infoForPosition(this.mCurItem);
            if (infoForPosition != null) {
                f = Math.min(infoForPosition.offset, this.mLastOffset);
            } else {
                f = 0.0f;
            }
            int paddingLeft = (int) (f * ((i - getPaddingLeft()) - getPaddingRight()));
            if (paddingLeft != getScrollX()) {
                completeScroll(false);
                scrollTo(paddingLeft, getScrollY());
            }
        } else {
            int scrollX = (int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3));
            scrollTo(scrollX, getScrollY());
            if (!this.mScroller.isFinished()) {
                this.mScroller.startScroll(scrollX, 0, (int) (infoForPosition(this.mCurItem).offset * i), 0, this.mScroller.getDuration() - this.mScroller.timePassed());
            }
        }
    }

    private void removeNonDecorViews() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c659ec19", new Object[]{this});
            return;
        }
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).isDecor) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ab05b24", new Object[]{this, new Boolean(z)});
            return;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        int i3;
        OnPageChangeListener onPageChangeListener;
        OnPageChangeListener onPageChangeListener2;
        OnPageChangeListener onPageChangeListener3;
        OnPageChangeListener onPageChangeListener4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e636384", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2), new Boolean(z2)});
            return;
        }
        ItemInfo infoForPosition = infoForPosition(i);
        if (infoForPosition != null) {
            i3 = (int) (getClientWidth() * Math.max(this.mFirstOffset, Math.min(infoForPosition.offset, this.mLastOffset)));
        } else {
            i3 = 0;
        }
        if (z) {
            smoothScrollTo(i3, 0, i2);
            if (z2 && (onPageChangeListener4 = this.mOnPageChangeListener) != null) {
                onPageChangeListener4.onPageSelected(i);
            }
            if (z2 && (onPageChangeListener3 = this.mInternalPageChangeListener) != null) {
                onPageChangeListener3.onPageSelected(i);
                return;
            }
            return;
        }
        if (z2 && (onPageChangeListener2 = this.mOnPageChangeListener) != null) {
            onPageChangeListener2.onPageSelected(i);
        }
        if (z2 && (onPageChangeListener = this.mInternalPageChangeListener) != null) {
            onPageChangeListener.onPageSelected(i);
        }
        completeScroll(false);
        scrollTo(i3, 0);
        pageScrolled(i3);
    }

    private void setScrollState(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a2509a", new Object[]{this, new Integer(i)});
        } else if (this.mScrollState != i) {
            this.mScrollState = i;
            if (this.mPageTransformer != null) {
                if (i == 0) {
                    z = false;
                }
                enableLayers(z);
            }
            OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrollStateChanged(i);
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4a4dbb", new Object[]{this, new Boolean(z)});
        } else if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    private void sortChildDrawingOrder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba8c95", new Object[]{this});
        } else if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        ItemInfo infoForChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60d7d1e1", new Object[]{this, arrayList, new Integer(i), new Integer(i2)});
        } else if (arrayList != null) {
            int size = arrayList.size();
            int descendantFocusability = getDescendantFocusability();
            if (descendantFocusability != 393216) {
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurItem) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
            if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
                return;
            }
            if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
                arrayList.add(this);
            }
        }
    }

    public ItemInfo addNewItem(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemInfo) ipChange.ipc$dispatch("5589ec8d", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.position = i;
        itemInfo.object = this.mAdapter.instantiateItem((ViewGroup) this, i);
        itemInfo.widthFactor = this.mAdapter.getPageWidth(i);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(itemInfo);
        } else {
            this.mItems.add(i2, itemInfo);
        }
        return itemInfo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        ItemInfo infoForChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6a79e8", new Object[]{this, arrayList});
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
            return;
        }
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            boolean z = layoutParams2.isDecor | (view instanceof Decor);
            layoutParams2.isDecor = z;
            if (!this.mInLayout) {
                super.addView(view, i, layoutParams);
            } else if (!z) {
                layoutParams2.needsMeasure = true;
                addViewInLayout(view, i, layoutParams);
            } else {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean arrowScroll(int r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.uikit.component.LoopViewPager.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0021
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r8)
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r1] = r7
            r8[r0] = r4
            java.lang.String r0 = "ead254ea"
            java.lang.Object r8 = r3.ipc$dispatch(r0, r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x0021:
            android.view.View r3 = r7.findFocus()
            r4 = 0
            if (r3 != r7) goto L_0x002a
        L_0x0028:
            r3 = r4
            goto L_0x004c
        L_0x002a:
            if (r3 == 0) goto L_0x004c
            android.view.ViewParent r5 = r3.getParent()
        L_0x0030:
            boolean r6 = r5 instanceof android.view.ViewGroup
            if (r6 == 0) goto L_0x003c
            if (r5 != r7) goto L_0x0037
            goto L_0x004c
        L_0x0037:
            android.view.ViewParent r5 = r5.getParent()
            goto L_0x0030
        L_0x003c:
            android.view.ViewParent r3 = r3.getParent()
        L_0x0040:
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x0028
            r3.getClass()
            android.view.ViewParent r3 = r3.getParent()
            goto L_0x0040
        L_0x004c:
            android.view.FocusFinder r4 = android.view.FocusFinder.getInstance()
            android.view.View r4 = r4.findNextFocus(r7, r3, r8)
            r5 = 66
            r6 = 17
            if (r4 == 0) goto L_0x009d
            if (r4 == r3) goto L_0x009d
            if (r8 != r6) goto L_0x007d
            android.graphics.Rect r0 = r7.mTempRect
            android.graphics.Rect r0 = r7.getChildRectInPagerCoordinates(r0, r4)
            int r0 = r0.left
            android.graphics.Rect r1 = r7.mTempRect
            android.graphics.Rect r1 = r7.getChildRectInPagerCoordinates(r1, r3)
            int r1 = r1.left
            if (r3 == 0) goto L_0x0078
            if (r0 < r1) goto L_0x0078
            boolean r0 = r7.pageLeft()
        L_0x0076:
            r1 = r0
            goto L_0x00af
        L_0x0078:
            boolean r0 = r4.requestFocus()
            goto L_0x0076
        L_0x007d:
            if (r8 != r5) goto L_0x00af
            android.graphics.Rect r0 = r7.mTempRect
            android.graphics.Rect r0 = r7.getChildRectInPagerCoordinates(r0, r4)
            int r0 = r0.left
            android.graphics.Rect r1 = r7.mTempRect
            android.graphics.Rect r1 = r7.getChildRectInPagerCoordinates(r1, r3)
            int r1 = r1.left
            if (r3 == 0) goto L_0x0098
            if (r0 > r1) goto L_0x0098
            boolean r0 = r7.pageRight()
            goto L_0x0076
        L_0x0098:
            boolean r0 = r4.requestFocus()
            goto L_0x0076
        L_0x009d:
            if (r8 == r6) goto L_0x00ab
            if (r8 != r0) goto L_0x00a2
            goto L_0x00ab
        L_0x00a2:
            if (r8 == r5) goto L_0x00a6
            if (r8 != r2) goto L_0x00af
        L_0x00a6:
            boolean r1 = r7.pageRight()
            goto L_0x00af
        L_0x00ab:
            boolean r1 = r7.pageLeft()
        L_0x00af:
            if (r1 == 0) goto L_0x00b8
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        L_0x00b8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.component.LoopViewPager.arrowScroll(int):boolean");
    }

    public boolean beginFakeDrag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17aa257d", new Object[]{this})).booleanValue();
        }
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    public boolean canLoop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64036d1f", new Object[]{this})).booleanValue();
        }
        if (this.mAdapter.getCount() >= (this.mOffscreenPageLimit * 2) + 1) {
            return true;
        }
        return false;
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount() - 1;
            while (childCount >= 0) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i2 + scrollX;
                if (i6 < childAt.getLeft() || i6 >= childAt.getRight() || (i5 = i3 + scrollY) < childAt.getTop() || i5 >= childAt.getBottom()) {
                    i4 = childCount;
                } else {
                    i4 = childCount;
                    if (canScroll(childAt, true, i, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
                childCount = i4 - 1;
            }
        }
        if (!z || !ViewCompat.canScrollHorizontally(view, -i)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (clientWidth * this.mFirstOffset))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (clientWidth * this.mLastOffset))) {
            return false;
        } else {
            return true;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79d4b702", new Object[]{this, layoutParams})).booleanValue();
        }
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
        } else if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
        } else {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
                if (!pageScrolled(currX)) {
                    this.mScroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void dataSetChanged() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da031c3", new Object[]{this});
            return;
        }
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        if (this.mItems.size() >= (this.mOffscreenPageLimit * 2) + 1 || this.mItems.size() >= count) {
            z = false;
        } else {
            z = true;
        }
        int i = this.mCurItem;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.mItems.size()) {
            ItemInfo itemInfo = this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(itemInfo.object);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z2) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
                    int i3 = this.mCurItem;
                    if (i3 == itemInfo.position) {
                        i = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = itemInfo.position;
                    if (i4 != itemPosition) {
                        if (i4 == this.mCurItem) {
                            i = itemPosition;
                        }
                        itemInfo.position = itemPosition;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.isDecor) {
                    layoutParams.widthFactor = 0.0f;
                }
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
        }
        if (super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ItemInfo infoForChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbbb6bb7", new Object[]{this, accessibilityEvent})).booleanValue();
        }
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96b34422", new Object[]{this, new Float(f)})).floatValue();
        }
        return (float) Math.sin((float) ((f - 0.5f) * 0.4712389167638204d));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else {
            super.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1abb44a8", new Object[]{this});
            return;
        }
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public void endFakeDrag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c967aab", new Object[]{this});
        } else if (this.mFakeDragging) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) VelocityTrackerCompat.getXVelocity(velocityTracker, this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.position, ((scrollX / clientWidth) - infoForCurrentScrollPosition.offset) / infoForCurrentScrollPosition.widthFactor, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            endDrag();
            this.mFakeDragging = false;
        } else {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84c2a049", new Object[]{this, keyEvent})).booleanValue();
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return arrowScroll(17);
        }
        if (keyCode == 22) {
            return arrowScroll(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return arrowScroll(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return arrowScroll(1);
        }
        return false;
    }

    public void fakeDragBy(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfbbc7b9", new Object[]{this, new Float(f)});
        } else if (this.mFakeDragging) {
            this.mLastMotionX += f;
            float scrollX = getScrollX() - f;
            float clientWidth = getClientWidth();
            float f2 = this.mFirstOffset * clientWidth;
            float f3 = this.mLastOffset * clientWidth;
            ItemInfo itemInfo = this.mItems.get(0);
            ArrayList<ItemInfo> arrayList = this.mItems;
            ItemInfo itemInfo2 = arrayList.get(arrayList.size() - 1);
            if (itemInfo.position != 0) {
                f2 = itemInfo.offset * clientWidth;
            }
            if (itemInfo2.position != this.mAdapter.getCount() - 1) {
                f3 = itemInfo2.offset * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.mLastMotionX += scrollX - i;
            scrollTo(i, getScrollY());
            pageScrolled(i);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
        } else {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("6dca2b10", new Object[]{this});
        }
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("ce603fbe", new Object[]{this, layoutParams}) : generateDefaultLayoutParams();
    }

    public PagerAdapter getAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PagerAdapter) ipChange.ipc$dispatch("18ee3345", new Object[]{this});
        }
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7aaf12f0", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.mDrawingOrderedChildren.get(i2).getLayoutParams()).childIndex;
    }

    public int getCurrentItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0d0a870", new Object[]{this})).intValue();
        }
        return this.mCurItem;
    }

    public int getLeftPos(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6ec118", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = i - 1;
        if (i2 < 0) {
            return this.mAdapter.getCount() - 1;
        }
        return i2;
    }

    public int getOffscreenPageLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bd2c501", new Object[]{this})).intValue();
        }
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e236e80d", new Object[]{this})).intValue();
        }
        return this.mPageMargin;
    }

    public int getRightPos(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d7c2801", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = i + 1;
        if (i2 > this.mAdapter.getCount() - 1) {
            return 0;
        }
        return i2;
    }

    public int getRightPosCompat(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cfbb01f", new Object[]{this, new Integer(i)})).intValue();
        }
        if (canLoop()) {
            return getRightPos(i);
        }
        return i + 1;
    }

    public ItemInfo infoForAnyChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemInfo) ipChange.ipc$dispatch("b78641d4", new Object[]{this, view});
        }
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public ItemInfo infoForChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemInfo) ipChange.ipc$dispatch("b30116de", new Object[]{this, view});
        }
        for (int i = 0; i < this.mItems.size(); i++) {
            ItemInfo itemInfo = this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, itemInfo.object)) {
                return itemInfo;
            }
        }
        return null;
    }

    public ItemInfo infoForPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemInfo) ipChange.ipc$dispatch("f3eb928c", new Object[]{this, new Integer(i)});
        }
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            ItemInfo itemInfo = this.mItems.get(i2);
            if (itemInfo.position == i) {
                return itemInfo;
            }
        }
        return null;
    }

    public void initViewPager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77226e75", new Object[]{this});
            return;
        }
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new MyAccessibilityDelegate());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
    }

    public boolean isFakeDragging() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e770b399", new Object[]{this})).booleanValue();
        }
        return this.mFakeDragging;
    }

    public boolean isLeftToRight(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fe0e9fb", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i == getLeftPos(i2)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        removeCallbacks(this.mEndScrollRunnable);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i;
        float f;
        float f2;
        int i2;
        int i3 = 0;
        int i4 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            float width2 = getWidth();
            float f3 = this.mPageMargin / width2;
            ItemInfo itemInfo = this.mItems.get(0);
            float f4 = itemInfo.offset;
            int size = this.mItems.size();
            int i5 = itemInfo.position;
            int i6 = this.mItems.get(size - 1).position;
            while (i5 < i6) {
                while (true) {
                    i = itemInfo.position;
                    if (i5 <= i || i3 >= size) {
                        break;
                    }
                    i3 += i4;
                    itemInfo = this.mItems.get(i3);
                }
                if (i5 == i) {
                    float f5 = itemInfo.offset;
                    float f6 = itemInfo.widthFactor;
                    f = (f5 + f6) * width2;
                    f4 = f5 + f6 + f3;
                } else {
                    float pageWidth = this.mAdapter.getPageWidth(i5);
                    f = (f4 + pageWidth) * width2;
                    f4 += pageWidth + f3;
                }
                int i7 = this.mPageMargin;
                if (i7 + f > scrollX) {
                    i2 = i3;
                    f2 = f3;
                    this.mMarginDrawable.setBounds((int) f, this.mTopPageBounds, (int) (i7 + f + 0.5f), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                } else {
                    i2 = i3;
                    f2 = f3;
                }
                if (f <= scrollX + width) {
                    i5++;
                    i3 = i2;
                    f3 = f2;
                    i4 = 1;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.mIsBeingDragged = false;
            this.mIsUnableToDrag = false;
            this.mActivePointerId = -1;
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.mVelocityTracker = null;
            }
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
            this.mIsUnableToDrag = false;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                completeScroll(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.mActivePointerId;
            if (i != -1) {
                int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
                float x2 = MotionEventCompat.getX(motionEvent, findPointerIndex);
                float f2 = x2 - this.mLastMotionX;
                float abs = Math.abs(f2);
                float y2 = MotionEventCompat.getY(motionEvent, findPointerIndex);
                float abs2 = Math.abs(y2 - this.mInitialMotionY);
                int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i2 == 0 || isGutterDrag(this.mLastMotionX, f2) || !canScroll(this, false, (int) f2, (int) x2, (int) y2)) {
                    int i3 = this.mTouchSlop;
                    if (abs > i3 && abs * 0.5f > abs2) {
                        this.mIsBeingDragged = true;
                        requestParentDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        float f3 = this.mInitialMotionX;
                        float f4 = this.mTouchSlop;
                        if (i2 > 0) {
                            f = f3 + f4;
                        } else {
                            f = f3 - f4;
                        }
                        this.mLastMotionX = f;
                        this.mLastMotionY = y2;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > i3) {
                        this.mIsUnableToDrag = true;
                    }
                    if (this.mIsBeingDragged && performDrag(x2)) {
                        ViewCompat.postInvalidateOnAnimation(this);
                    }
                } else {
                    this.mLastMotionX = x2;
                    this.mLastMotionY = y2;
                    this.mIsUnableToDrag = true;
                    return false;
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.component.LoopViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.component.LoopViewPager.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPageScrolled(int r18, float r19, int r20) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.component.LoopViewPager.onPageScrolled(int, float, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        ItemInfo infoForChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e8386ca", new Object[]{this, new Integer(i), rect})).booleanValue();
        }
        int childCount = getChildCount();
        if ((2 & i) != 0) {
            i2 = childCount;
            i4 = 1;
            i3 = 0;
        } else {
            i3 = childCount - 1;
            i4 = -1;
            i2 = -1;
        }
        while (i3 != i2) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurItem && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
        } else if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            PagerAdapter pagerAdapter = this.mAdapter;
            if (pagerAdapter != null) {
                pagerAdapter.restoreState(savedState.adapterState, savedState.loader);
                setCurrentItemInternal(savedState.position, false, true);
                return;
            }
            this.mRestoredCurItem = savedState.position;
            this.mRestoredAdapterState = savedState.adapterState;
            this.mRestoredClassLoader = savedState.loader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.position = this.mCurItem;
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            savedState.adapterState = pagerAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.mPageMargin;
            recomputeScrollPosition(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        float f;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mFakeDragging) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.mAdapter) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.mIsBeingDragged) {
                    int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId);
                    float x2 = MotionEventCompat.getX(motionEvent, findPointerIndex);
                    float abs = Math.abs(x2 - this.mLastMotionX);
                    float y2 = MotionEventCompat.getY(motionEvent, findPointerIndex);
                    float abs2 = Math.abs(y2 - this.mLastMotionY);
                    if (abs > this.mTouchSlop && abs > abs2) {
                        this.mIsBeingDragged = true;
                        requestParentDisallowInterceptTouchEvent(true);
                        float f2 = this.mInitialMotionX;
                        if (x2 - f2 > 0.0f) {
                            f = f2 + this.mTouchSlop;
                        } else {
                            f = f2 - this.mTouchSlop;
                        }
                        this.mLastMotionX = f;
                        this.mLastMotionY = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.mIsBeingDragged) {
                    z = performDrag(MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                    this.mLastMotionX = MotionEventCompat.getX(motionEvent, actionIndex);
                    this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                } else if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                    this.mLastMotionX = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId));
                }
            } else if (this.mIsBeingDragged) {
                scrollToItem(this.mCurItem, true, 0, false);
                this.mActivePointerId = -1;
                endDrag();
            }
        } else if (this.mIsBeingDragged) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) VelocityTrackerCompat.getXVelocity(velocityTracker, this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.position, ((scrollX / clientWidth) - infoForCurrentScrollPosition.offset) / infoForCurrentScrollPosition.widthFactor, xVelocity, (int) (MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
            this.mActivePointerId = -1;
            endDrag();
        }
        if (z) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
    }

    public boolean pageLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb2190c1", new Object[]{this})).booleanValue();
        }
        int i = this.mCurItem;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    public boolean pageRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a67906d8", new Object[]{this})).booleanValue();
        }
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || this.mCurItem >= pagerAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    public void populate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1c6871", new Object[]{this});
        } else {
            populate(this.mCurItem);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
        } else if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d478923", new Object[]{this, pagerAdapter});
            return;
        }
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            pagerAdapter2.unregisterDataSetObserver(this.mObserver);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                ItemInfo itemInfo = this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
            this.mFirstOffset = -3.4028235E38f;
            this.mLastOffset = Float.MAX_VALUE;
        }
        PagerAdapter pagerAdapter3 = this.mAdapter;
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (pagerAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new PagerObserver();
            }
            this.mAdapter.registerDataSetObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z) {
                populate();
            } else {
                requestLayout();
            }
        }
        OnAdapterChangeListener onAdapterChangeListener = this.mAdapterChangeListener;
        if (!(onAdapterChangeListener == null || pagerAdapter3 == pagerAdapter)) {
            onAdapterChangeListener.onAdapterChanged(pagerAdapter3, pagerAdapter);
        }
    }

    public void setCurrentItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
            return;
        }
        this.mPopulatePending = false;
        this.mIsLeftToRight = isLeftToRight(i, this.mCurItem);
        setCurrentItemInternal(i, true ^ this.mFirstLayout, false);
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ea61b5", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else {
            setCurrentItemInternal(i, z, z2, 0);
        }
    }

    public OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onPageChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnPageChangeListener) ipChange.ipc$dispatch("7926e01d", new Object[]{this, onPageChangeListener});
        }
        OnPageChangeListener onPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = onPageChangeListener;
        return onPageChangeListener2;
    }

    public void setOffscreenPageLimit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b63529", new Object[]{this, new Integer(i)});
        }
    }

    public void setOnAdapterChangeListener(OnAdapterChangeListener onAdapterChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ae75b0", new Object[]{this, onAdapterChangeListener});
        } else {
            this.mAdapterChangeListener = onAdapterChangeListener;
        }
    }

    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("916447b8", new Object[]{this, onPageChangeListener});
        } else {
            this.mOnPageChangeListener = onPageChangeListener;
        }
    }

    public void setPageMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7d279d", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c21808", new Object[]{this, drawable});
            return;
        }
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        if (drawable != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setPageTransformer(boolean z, PageTransformer pageTransformer) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8cfc106", new Object[]{this, new Boolean(z), pageTransformer});
            return;
        }
        if (pageTransformer != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.mPageTransformer != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mPageTransformer = pageTransformer;
        setChildrenDrawingOrderEnabledCompat(z2);
        if (z2) {
            if (!z) {
                i = 1;
            }
            this.mDrawingOrder = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z4) {
            populate();
        }
    }

    public void setRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978378f0", new Object[]{this, new Float(f)});
            return;
        }
        this.mRatio = f;
        requestLayout();
    }

    public void smoothScrollTo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a1cc9d", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            smoothScrollTo(i, i2, 0);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        if (super.verifyDrawable(drawable) || drawable == this.mMarginDrawable) {
            return true;
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {
        public int childIndex;
        public int gravity;
        public boolean isDecor;
        public boolean needsMeasure;
        public int position;
        public float widthFactor = 0.0f;

        static {
            t2o.a(931135510);
        }

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LoopViewPager.access$400());
            this.gravity = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("84bf71af", new Object[]{this, attributeSet}) : new LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
        if (r5 == r6) goto L_0x009c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009b, code lost:
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void populate(int r13) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.component.LoopViewPager.populate(int):void");
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        OnPageChangeListener onPageChangeListener;
        OnPageChangeListener onPageChangeListener2;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e96247ee", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2), new Integer(i2)});
            return;
        }
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.mCurItem != i || this.mItems.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.mAdapter.getCount()) {
                i = this.mAdapter.getCount() - 1;
            }
            int i3 = this.mOffscreenPageLimit;
            int i4 = this.mCurItem;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                    this.mItems.get(i5).scrolling = true;
                }
            }
            if (this.mCurItem != i) {
                z3 = true;
            }
            if (this.mFirstLayout) {
                this.mCurItem = i;
                if (z3 && (onPageChangeListener2 = this.mOnPageChangeListener) != null) {
                    onPageChangeListener2.onPageSelected(i);
                }
                if (z3 && (onPageChangeListener = this.mInternalPageChangeListener) != null) {
                    onPageChangeListener.onPageSelected(i);
                }
                requestLayout();
                return;
            }
            populate(i);
            scrollToItem(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public void smoothScrollTo(int i, int i2, int i3) {
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42983a06", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int i5 = i - scrollX;
            int i6 = i2 - scrollY;
            if (i5 == 0 && i6 == 0) {
                completeScroll(false);
                populate();
                setScrollState(0);
                return;
            }
            setScrollingCacheEnabled(true);
            setScrollState(2);
            int clientWidth = getClientWidth();
            int i7 = clientWidth / 2;
            float f = clientWidth;
            float f2 = i7;
            float distanceInfluenceForSnapDuration = f2 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2);
            int abs = Math.abs(i3);
            if (abs > 0) {
                i4 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
            } else {
                i4 = (int) (((Math.abs(i5) / ((f * this.mAdapter.getPageWidth(this.mCurItem)) + this.mPageMargin)) + 1.0f) * 100.0f);
            }
            this.mScroller.startScroll(scrollX, scrollY, i5, i6, Math.min(i4, 600));
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    private boolean pageScrolled(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a2f7465", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.mItems.size() == 0) {
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i2 = this.mPageMargin;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = infoForCurrentScrollPosition.position;
        float f2 = ((i / f) - infoForCurrentScrollPosition.offset) / (infoForCurrentScrollPosition.widthFactor + (i2 / f));
        this.mCalledSuper = false;
        onPageScrolled(i4, f2, (int) (i3 * f2));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (this.mSetChildrenDrawingOrderEnabled == null) {
            try {
                this.mSetChildrenDrawingOrderEnabled = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
        }
        try {
            Method method = this.mSetChildrenDrawingOrderEnabled;
            if (method != null) {
                method.invoke(this, Boolean.valueOf(z));
            }
        } catch (Exception unused2) {
        }
    }

    public void setCurrentItem(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aed29e2", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.mPopulatePending = false;
        this.mIsLeftToRight = isLeftToRight(i, this.mCurItem);
        setCurrentItemInternal(i, z, false);
    }

    public void setPageMarginDrawable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6905b89f", new Object[]{this, new Integer(i)});
        } else {
            setPageMarginDrawable(getContext().getResources().getDrawable(i));
        }
    }

    public LoopViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRatio = 0.0f;
        this.mItems = new ArrayList<>();
        this.mTempItem = new ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mEndScrollRunnable = new Runnable() { // from class: com.taobao.uikit.component.LoopViewPager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LoopViewPager.access$000(LoopViewPager.this, 0);
                LoopViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LoopViewPager);
        if (obtainStyledAttributes != null) {
            this.mRatio = obtainStyledAttributes.getFloat(R.styleable.LoopViewPager_uik_ratio, 0.0f);
            obtainStyledAttributes.recycle();
        }
        initViewPager();
    }
}
