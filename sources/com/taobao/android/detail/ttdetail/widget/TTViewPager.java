package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.viewpager.widget.PagerAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import tb.t2o;
import tb.tq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTViewPager extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 0;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int MODE_SCROLL_FLING = 1;
    public static final int MODE_SCROLL_PAGE = 0;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "TTViewPager";
    public PagerAdapter mAdapter;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    public int mCurItem;
    private int mDefaultGutterSize;
    private boolean mEnableCycleScroll;
    private Scroller mEstimateScroller;
    private int mExpectedAdapterCount;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    public boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private float mLastMotionX;
    private float mLastMotionY;
    private EdgeEffect mLeftEdge;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private f mObserver;
    private List<d> mOnItemVisibleChangeListeners;
    private List<e> mOnPageChangeListeners;
    private int mPageMargin;
    private EdgeEffect mRightEdge;
    public Scroller mScroller;
    private int mTouchSlop;
    public VelocityTracker mVelocityTracker;
    public static final int[] LAYOUT_ATTRS = {16842931};
    private static final Comparator<c> COMPARATOR = new a();
    private static final Interpolator sInterpolator = new DecelerateInterpolator();
    public final ArrayList<c> mItems = new ArrayList<>();
    public final c mTempItem = new c();
    private final Rect mTempRect = new Rect();
    private int mRestoredCurItem = -1;
    private Parcelable mRestoredAdapterState = null;
    private ClassLoader mRestoredClassLoader = null;
    public float mFirstOffset = -3.4028235E38f;
    public float mLastOffset = Float.MAX_VALUE;
    private int mOffscreenPageLimit = 0;
    private int mActivePointerId = -1;
    private boolean mFirstLayout = true;
    private int mModeScroll = 0;
    private final Runnable mEndScrollRunnable = new b();
    public int mScrollState = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class MyAccessibilityDelegate extends AccessibilityDelegateCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262949);
        }

        public MyAccessibilityDelegate() {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/widget/TTViewPager$MyAccessibilityDelegate");
            }
        }

        public final boolean canScroll() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9bf314c8", new Object[]{this})).booleanValue();
            }
            PagerAdapter pagerAdapter = TTViewPager.this.mAdapter;
            if (pagerAdapter == null || pagerAdapter.getCount() <= 1) {
                return false;
            }
            return true;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            PagerAdapter pagerAdapter;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e316cc3a", new Object[]{this, view, accessibilityEvent});
                return;
            }
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(TTViewPager.class.getName());
            accessibilityEvent.setScrollable(canScroll());
            if (accessibilityEvent.getEventType() == 4096 && (pagerAdapter = TTViewPager.this.mAdapter) != null) {
                accessibilityEvent.setItemCount(pagerAdapter.getCount());
                accessibilityEvent.setFromIndex(TTViewPager.this.mCurItem);
                accessibilityEvent.setToIndex(TTViewPager.this.mCurItem);
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
            accessibilityNodeInfoCompat.setClassName(TTViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(canScroll());
            if (TTViewPager.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (TTViewPager.this.canScrollHorizontally(-1)) {
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
                if (i != 8192 || !TTViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                TTViewPager tTViewPager = TTViewPager.this;
                tTViewPager.setCurrentItem(tTViewPager.mCurItem - 1);
                return true;
            } else if (!TTViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                TTViewPager tTViewPager2 = TTViewPager.this;
                tTViewPager2.setCurrentItem(tTViewPager2.mCurItem + 1);
                return true;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SavedState) ipChange.ipc$dispatch("9bbe2fe6", new Object[]{this, parcel});
                }
                return new SavedState(parcel, null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SavedState) ipChange.ipc$dispatch("bde5544a", new Object[]{this, parcel, classLoader});
                }
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SavedState[]) ipChange.ipc$dispatch("d2b3c8f", new Object[]{this, new Integer(i)});
                }
                return new SavedState[i];
            }
        }

        static {
            t2o.a(912262953);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.adapterState, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.position = parcel.readInt();
            this.adapterState = parcel.readParcelable(classLoader);
            this.loader = classLoader;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Comparator<c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("aeeb87bf", new Object[]{this, cVar, cVar2})).intValue();
            }
            return cVar.b - cVar2.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TTViewPager.this.setScrollState(0);
            TTViewPager.this.populate();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public Object f6995a;
        public int b;
        public float c;
        public float d;

        static {
            t2o.a(912262947);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d {
        void a(int i);

        void b(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface e {
        void a(int i, int i2, float f, int i3);

        void onPageScrollStateChanged(int i);

        void onPageSelected(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f extends DataSetObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262952);
        }

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/TTViewPager$PagerObserver");
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            } else {
                TTViewPager.this.dataSetChanged();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
            } else {
                TTViewPager.this.dataSetChanged();
            }
        }
    }

    static {
        t2o.a(912262943);
    }

    public TTViewPager(Context context) {
        super(context);
        initViewPager();
    }

    private void calculatePageOffsets(c cVar, int i, c cVar2) {
        float f2;
        float f3;
        float f4;
        int i2;
        int i3;
        c cVar3;
        c cVar4;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce762d1", new Object[]{this, cVar, new Integer(i), cVar2});
            return;
        }
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f2 = this.mPageMargin / clientWidth;
        } else {
            f2 = 0.0f;
        }
        if (cVar2 != null) {
            int i5 = cVar2.b;
            int i6 = cVar.b;
            if (i5 < i6) {
                float f5 = cVar2.d + cVar2.c + f2;
                while (true) {
                    i5++;
                    if (i5 > cVar.b || i4 >= this.mItems.size()) {
                        break;
                    }
                    c cVar5 = this.mItems.get(i4);
                    while (true) {
                        cVar4 = cVar5;
                        if (i5 <= cVar4.b || i4 >= this.mItems.size() - 1) {
                            break;
                        }
                        i4++;
                        cVar5 = this.mItems.get(i4);
                    }
                    while (i5 < cVar4.b) {
                        f5 += this.mAdapter.getPageWidth(i5) + f2;
                        i5++;
                    }
                    cVar4.d = f5;
                    f5 += cVar4.c + f2;
                }
            } else if (i5 > i6) {
                int size = this.mItems.size() - 1;
                float f6 = cVar2.d;
                int i7 = i5 - 1;
                while (i7 >= cVar.b && size >= 0) {
                    c cVar6 = this.mItems.get(size);
                    while (true) {
                        cVar3 = cVar6;
                        if (i7 >= cVar3.b || size <= 0) {
                            break;
                        }
                        size--;
                        cVar6 = this.mItems.get(size);
                    }
                    while (i7 > cVar3.b) {
                        f6 -= this.mAdapter.getPageWidth(i7) + f2;
                        i7--;
                    }
                    f6 -= cVar3.c + f2;
                    cVar3.d = f6;
                    i7--;
                }
            }
        }
        int size2 = this.mItems.size();
        float f7 = cVar.d;
        int i8 = cVar.b;
        int i9 = i8 - 1;
        if (i8 == 0) {
            f3 = f7;
        } else {
            f3 = -3.4028235E38f;
        }
        this.mFirstOffset = f3;
        int i10 = count - 1;
        if (i8 == i10) {
            f4 = Math.max(f3, (cVar.c + f7) - 1.0f);
        } else {
            f4 = Float.MAX_VALUE;
        }
        this.mLastOffset = f4;
        int i11 = i - 1;
        while (i11 >= 0) {
            c cVar7 = this.mItems.get(i11);
            while (true) {
                i3 = cVar7.b;
                if (i9 <= i3) {
                    break;
                }
                f7 -= this.mAdapter.getPageWidth(i9) + f2;
                i9--;
            }
            f7 -= cVar7.c + f2;
            cVar7.d = f7;
            if (i3 == 0) {
                this.mFirstOffset = f7;
            }
            i11--;
            i9--;
        }
        float f8 = cVar.d + cVar.c + f2;
        int i12 = cVar.b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            c cVar8 = this.mItems.get(i13);
            while (true) {
                i2 = cVar8.b;
                if (i12 >= i2) {
                    break;
                }
                f8 += this.mAdapter.getPageWidth(i12) + f2;
                i12++;
            }
            if (i2 == i10) {
                this.mLastOffset = Math.max(this.mFirstOffset, (cVar8.c + f8) - 1.0f);
            }
            cVar8.d = f8;
            f8 += cVar8.c + f2;
            i13++;
            i12++;
        }
        this.mLastOffset = Math.max(this.mFirstOffset, this.mLastOffset);
    }

    private void checkSelectedPositionChangedWhenFling(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5baabbc1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = this.mCurItem;
        populateWithDx(i, false, i2 - getScrollX());
        if (i != i3) {
            dispatchOnPageSelected(i);
        }
    }

    private int determineFlingTargetPosition(float f2, int i, int i2) {
        int clientWidth;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cbcf5c9", new Object[]{this, new Float(f2), new Integer(i), new Integer(i2)})).intValue();
        }
        if (this.mItems.isEmpty() || (clientWidth = getClientWidth()) <= 0) {
            return 0;
        }
        float f3 = clientWidth;
        float f4 = (f2 / f3) + 0.5f;
        float f5 = this.mPageMargin / f3;
        int infoIndexOrCenterPosition = infoIndexOrCenterPosition(this.mCurItem);
        int findPreviousPosition = findPreviousPosition(infoIndexOrCenterPosition, f4, f5);
        if (findPreviousPosition != -1 && findPreviousPosition != this.mCurItem) {
            return findPreviousPosition;
        }
        int findNextPosition = findNextPosition(infoIndexOrCenterPosition, f4, f5);
        if (findNextPosition != -1 && findNextPosition != this.mCurItem) {
            return findNextPosition;
        }
        int i3 = this.mCurItem;
        if (Math.abs(i2) <= this.mFlingDistance || Math.abs(i) <= this.mMinimumVelocity) {
            return i3;
        }
        int i4 = this.mCurItem;
        if (i > 0) {
            return i4 - 1;
        }
        return i4 + 1;
    }

    private int determineTargetPage(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77a23cdc", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) {
            return i;
        }
        if (i2 > 0) {
            return i - 1;
        }
        return i + 1;
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

    private int findNextPosition(int i, float f2, float f3) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f26ad1a", new Object[]{this, new Integer(i), new Float(f2), new Float(f3)})).intValue();
        }
        c cVar2 = this.mItems.get(i);
        int size = this.mItems.size();
        float f4 = cVar2.d;
        float f5 = this.mLastOffset;
        float f6 = cVar2.c;
        int i2 = cVar2.b;
        int count = this.mAdapter.getCount() - 1;
        while (i2 <= count) {
            if (Float.compare(f4, f2) <= 0 && Float.compare(f6 + f4 + f3, f2) >= 0) {
                return i2;
            }
            int i3 = i + 1;
            i2++;
            if (i3 < size) {
                cVar = this.mItems.get(i3);
            } else {
                cVar = null;
            }
            if (cVar != null && i3 == size - 1) {
                f5 = cVar.d;
            }
            if (i2 > count) {
                if (f2 >= this.mLastOffset || f2 >= f5) {
                    return count;
                }
                return -1;
            } else if (cVar == null || i2 != cVar.b) {
                f6 = this.mAdapter.getPageWidth(i2);
                f4 += f6 + f3;
            } else {
                float f7 = cVar.c;
                f4 += f7 + f3;
                f6 = f7;
                i = i3;
            }
        }
        return -1;
    }

    private int findPreviousPosition(int i, float f2, float f3) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("227fd916", new Object[]{this, new Integer(i), new Float(f2), new Float(f3)})).intValue();
        }
        c cVar2 = this.mItems.get(i);
        float f4 = cVar2.d;
        float f5 = this.mFirstOffset;
        float f6 = cVar2.c;
        int i2 = cVar2.b;
        while (i2 >= 0) {
            if (Float.compare(f4, f2) <= 0 && Float.compare(f6 + f4 + f3, f2) >= 0) {
                return i2;
            }
            int i3 = i - 1;
            i2--;
            if (i3 >= 0) {
                cVar = this.mItems.get(i3);
            } else {
                cVar = null;
            }
            if (cVar != null && i3 == 0) {
                f5 = cVar.d;
            }
            if (i2 < 0) {
                if (f2 <= this.mFirstOffset || f2 <= f5) {
                    return 0;
                }
                return -1;
            } else if (cVar == null || i2 != cVar.b) {
                f6 = this.mAdapter.getPageWidth(i2);
                f4 -= f6 + f3;
            } else {
                float f7 = cVar.c;
                f4 -= f7 + f3;
                f6 = f7;
                i = i3;
            }
        }
        return -1;
    }

    private int findScrollPosition(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac92483d", new Object[]{this, new Float(f2)})).intValue();
        }
        return infoForScrollPosition(f2).b;
    }

    private int fixPosition(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("769e5b1", new Object[]{this, new Integer(i)})).intValue();
        }
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            i2 = pagerAdapter.getCount();
        }
        if (!this.mEnableCycleScroll || i2 <= 2) {
            return i;
        }
        if (i == 0) {
            i = i2 - 2;
        } else if (i == i2 - 1) {
            i = 1;
        }
        return i - 1;
    }

    private int fixedItem2Center(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f548918a", new Object[]{this, cVar})).intValue();
        }
        int clientWidth = getClientWidth();
        if (clientWidth <= 0) {
            return 0;
        }
        return (int) (clientWidth * Math.max(this.mFirstOffset, Math.min((cVar.d + (cVar.c / 2.0f)) - 0.5f, this.mLastOffset)));
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

    private float getEventX(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0349823", new Object[]{this, motionEvent, new Integer(i)})).floatValue();
        }
        try {
            return motionEvent.getX(i);
        } catch (Throwable unused) {
            return motionEvent.getX(0);
        }
    }

    private float getEventY(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7864d802", new Object[]{this, motionEvent, new Integer(i)})).floatValue();
        }
        try {
            return motionEvent.getY(i);
        } catch (Throwable unused) {
            return motionEvent.getY(0);
        }
    }

    private int getTargetOffset(int i, c cVar) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71beb805", new Object[]{this, new Integer(i), cVar})).intValue();
        }
        int clientWidth = getClientWidth();
        if (clientWidth <= 0) {
            return 0;
        }
        if (cVar != null) {
            return fixedItem2Center(cVar);
        }
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null && pagerAdapter.getCount() > 0 && !this.mItems.isEmpty()) {
            int count = this.mAdapter.getCount();
            if (i >= 0 && i < count) {
                float f2 = this.mPageMargin / clientWidth;
                int size = this.mItems.size();
                c cVar2 = this.mItems.get(0);
                float f3 = cVar2.d;
                int i3 = cVar2.b;
                if (i < i3) {
                    while (i < i3) {
                        i3--;
                        f3 -= this.mAdapter.getPageWidth(i3) + f2;
                    }
                    c cVar3 = this.mTempItem;
                    cVar3.d = f3;
                    cVar3.c = this.mAdapter.getPageWidth(i);
                    cVar2 = this.mTempItem;
                    cVar2.b = i;
                } else if (i3 < i) {
                    int i4 = i3;
                    while (i3 < i) {
                        while (i3 < i4 && i3 < i) {
                            f3 += this.mAdapter.getPageWidth(i3) + f2;
                            i3++;
                        }
                        f3 += cVar2.c + f2;
                        i2++;
                        cVar2 = null;
                        if (i2 < size) {
                            c cVar4 = this.mItems.get(i2);
                            int i5 = cVar4.b;
                            if (i5 > i) {
                                i4 = i3;
                            } else {
                                cVar2 = cVar4;
                                i4 = i5;
                            }
                        }
                        if (cVar2 == null) {
                            cVar2 = this.mTempItem;
                            cVar2.d = f3;
                            i4++;
                            cVar2.c = this.mAdapter.getPageWidth(i4);
                            cVar2.b = i4;
                        }
                        i3++;
                    }
                }
                return fixedItem2Center(cVar2);
            }
        }
        return 0;
    }

    private c infoForScrollPosition(float f2) {
        float f3;
        float f4;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("47c924fe", new Object[]{this, new Float(f2)});
        }
        int clientWidth = getClientWidth();
        float f5 = 0.0f;
        if (clientWidth > 0) {
            f3 = f2 / clientWidth;
        } else {
            f3 = 0.0f;
        }
        if (clientWidth > 0) {
            f4 = this.mPageMargin / clientWidth;
        } else {
            f4 = 0.0f;
        }
        float f6 = f3 + 0.5f;
        c cVar = new c();
        float f7 = 0.0f;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        boolean z = true;
        int i4 = -1;
        while (i3 < this.mItems.size()) {
            c cVar2 = this.mItems.get(i3);
            if (!z && cVar2.b != (i = i4 + 1)) {
                cVar2 = this.mTempItem;
                cVar2.d = f5 + f7 + f4;
                cVar2.b = i;
                cVar2.c = this.mAdapter.getPageWidth(i);
                i3--;
            }
            f5 = cVar2.d;
            float f8 = cVar2.c + f5 + f4;
            if (z && i3 == this.mItems.size() - 1) {
                return cVar2;
            }
            if (f5 < f6 && f6 < f8) {
                return cVar2;
            }
            int abs = (int) Math.abs((f6 - (((f8 - f5) / 2.0f) + f5)) * clientWidth);
            if (abs <= i2) {
                cVar.d = f5;
                cVar.b = cVar2.b;
                cVar.c = cVar2.c;
                i2 = abs;
            }
            i4 = cVar2.b;
            f7 = cVar2.c;
            i3++;
            z = false;
        }
        return cVar;
    }

    private int infoIndexForPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc3e7661", new Object[]{this, new Integer(i)})).intValue();
        }
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            if (this.mItems.get(i2).b == i) {
                return i2;
            }
        }
        return 0;
    }

    private int infoIndexOrCenterPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab58602a", new Object[]{this, new Integer(i)})).intValue();
        }
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            if (this.mItems.get(i2).b == i) {
                return i2;
            }
        }
        if (this.mItems.size() == 1) {
            return 0;
        }
        return this.mItems.size() / 2;
    }

    public static /* synthetic */ Object ipc$super(TTViewPager tTViewPager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1145345097:
                return new Boolean(super.dispatchPopulateAccessibilityEvent((AccessibilityEvent) objArr[0]));
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/TTViewPager");
        }
    }

    private boolean isGutterDrag(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f6f81c4", new Object[]{this, new Float(f2), new Float(f3)})).booleanValue();
        }
        if (f2 < this.mGutterSize && f3 > 0.0f) {
            return true;
        }
        if (f2 <= getWidth() - this.mGutterSize || f3 >= 0.0f) {
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
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex != 0) {
                i = 0;
            }
            this.mLastMotionX = getEventX(motionEvent, i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean performDrag(float r11) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.TTViewPager.performDrag(float):boolean");
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b766a1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        c infoForPosition = infoForPosition(this.mCurItem);
        if (infoForPosition != null) {
            i5 = fixedItem2Center(infoForPosition);
        } else {
            i5 = 0;
        }
        if (i2 > 0 && infoForPosition != null && !this.mScroller.isFinished()) {
            this.mScroller.setFinalX(i5);
        } else if (i5 != getScrollX()) {
            completeScroll(false);
            scrollTo(i5, getScrollY());
        }
    }

    private void removeNonDecorViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c659ec19", new Object[]{this});
            return;
        }
        while (getChildCount() > 0) {
            removeViewAt(0);
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

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        c infoForChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60d7d1e1", new Object[]{this, arrayList, new Integer(i), new Integer(i2)});
            return;
        }
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.b == this.mCurItem) {
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

    public c addNewItem(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("b70535cd", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        c cVar = new c();
        cVar.b = i;
        cVar.c = this.mAdapter.getPageWidth(i);
        cVar.f6995a = this.mAdapter.instantiateItem((ViewGroup) this, i);
        dispatchOnItemVisibleChanged(cVar.b, true);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(cVar);
        } else {
            this.mItems.add(i2, cVar);
        }
        return cVar;
    }

    public void addOnItemVisibleChangeListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564821d1", new Object[]{this, dVar});
            return;
        }
        if (this.mOnItemVisibleChangeListeners == null) {
            this.mOnItemVisibleChangeListeners = new ArrayList();
        }
        this.mOnItemVisibleChangeListeners.add(dVar);
    }

    public void addOnPageChangeListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea3a0df9", new Object[]{this, eVar});
            return;
        }
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        c infoForChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6a79e8", new Object[]{this, arrayList});
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.b == this.mCurItem) {
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
        if (this.mInLayout) {
            layoutParams2.b = true;
            addViewInLayout(view, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
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
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.detail.ttdetail.widget.TTViewPager.$ipChange
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
            goto L_0x003c
        L_0x002a:
            if (r3 == 0) goto L_0x003c
            android.view.ViewParent r5 = r3.getParent()
        L_0x0030:
            boolean r6 = r5 instanceof android.view.ViewGroup
            if (r6 == 0) goto L_0x0028
            if (r5 != r7) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            android.view.ViewParent r5 = r5.getParent()
            goto L_0x0030
        L_0x003c:
            android.view.FocusFinder r4 = android.view.FocusFinder.getInstance()
            android.view.View r4 = r4.findNextFocus(r7, r3, r8)
            r5 = 66
            r6 = 17
            if (r4 == 0) goto L_0x008d
            if (r4 == r3) goto L_0x008d
            if (r8 != r6) goto L_0x006d
            android.graphics.Rect r0 = r7.mTempRect
            android.graphics.Rect r0 = r7.getChildRectInPagerCoordinates(r0, r4)
            int r0 = r0.left
            android.graphics.Rect r1 = r7.mTempRect
            android.graphics.Rect r1 = r7.getChildRectInPagerCoordinates(r1, r3)
            int r1 = r1.left
            if (r3 == 0) goto L_0x0068
            if (r0 < r1) goto L_0x0068
            boolean r0 = r7.pageLeft()
        L_0x0066:
            r1 = r0
            goto L_0x009f
        L_0x0068:
            boolean r0 = r4.requestFocus()
            goto L_0x0066
        L_0x006d:
            if (r8 != r5) goto L_0x009f
            android.graphics.Rect r0 = r7.mTempRect
            android.graphics.Rect r0 = r7.getChildRectInPagerCoordinates(r0, r4)
            int r0 = r0.left
            android.graphics.Rect r1 = r7.mTempRect
            android.graphics.Rect r1 = r7.getChildRectInPagerCoordinates(r1, r3)
            int r1 = r1.left
            if (r3 == 0) goto L_0x0088
            if (r0 > r1) goto L_0x0088
            boolean r0 = r7.pageRight()
            goto L_0x0066
        L_0x0088:
            boolean r0 = r4.requestFocus()
            goto L_0x0066
        L_0x008d:
            if (r8 == r6) goto L_0x009b
            if (r8 != r0) goto L_0x0092
            goto L_0x009b
        L_0x0092:
            if (r8 == r5) goto L_0x0096
            if (r8 != r2) goto L_0x009f
        L_0x0096:
            boolean r1 = r7.pageRight()
            goto L_0x009f
        L_0x009b:
            boolean r1 = r7.pageLeft()
        L_0x009f:
            if (r1 == 0) goto L_0x00a8
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        L_0x00a8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.TTViewPager.arrowScroll(int):boolean");
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
        if (!z || !view.canScrollHorizontally(-i)) {
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

    public void clearOnItemVisibleChangeListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f42d43", new Object[]{this});
            return;
        }
        List<d> list = this.mOnItemVisibleChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnPageChangeListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b191a7bb", new Object[]{this});
            return;
        }
        List<e> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void completeScroll(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c980b987", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.mScrollState != 2) {
            z2 = false;
        }
        if (z2 && !this.mScroller.isFinished()) {
            this.mScroller.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                checkSelectedPositionChangedWhenFling(currX);
                scrollTo(currX, currY);
                if (currX != scrollX) {
                    pageScrolled(currX);
                }
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

    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void computeScroll() {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.detail.ttdetail.widget.TTViewPager.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "cab3086b"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r9
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            r9.mIsScrollStarted = r1
            android.widget.Scroller r2 = r9.mScroller
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto L_0x00b6
            android.widget.Scroller r2 = r9.mScroller
            boolean r2 = r2.computeScrollOffset()
            if (r2 == 0) goto L_0x00b6
            int r2 = r9.getScrollX()
            int r3 = r9.getScrollY()
            android.widget.Scroller r4 = r9.mScroller
            int r4 = r4.getCurrX()
            android.widget.Scroller r5 = r9.mScroller
            int r5 = r5.getCurrY()
            if (r2 != r4) goto L_0x003c
            if (r3 == r5) goto L_0x00b2
        L_0x003c:
            int r2 = r9.mCurItem
            int r3 = r9.mModeScroll
            if (r3 != r1) goto L_0x0097
            int r3 = r9.getClientWidth()
            float r3 = (float) r3
            float r6 = r9.mFirstOffset
            float r6 = r6 * r3
            float r7 = r9.mLastOffset
            float r3 = r3 * r7
            float r7 = (float) r4
            int r8 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0062
            int r4 = (int) r6
            int r3 = r9.mCurItem
            if (r3 != r1) goto L_0x005b
            r2 = 0
            goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            android.widget.Scroller r3 = r9.mScroller
            r3.abortAnimation()
            goto L_0x0098
        L_0x0062:
            int r6 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x0097
            int r4 = (int) r3
            androidx.viewpager.widget.PagerAdapter r3 = r9.mAdapter
            if (r3 == 0) goto L_0x0073
            int r3 = r3.getCount()
            if (r3 <= 0) goto L_0x0073
            r3 = 1
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            int r6 = r9.mCurItem
            if (r3 == 0) goto L_0x0081
            androidx.viewpager.widget.PagerAdapter r7 = r9.mAdapter
            int r7 = r7.getCount()
            int r7 = r7 + (-2)
            goto L_0x0082
        L_0x0081:
            r7 = 0
        L_0x0082:
            if (r6 != r7) goto L_0x0090
            if (r3 == 0) goto L_0x008e
            androidx.viewpager.widget.PagerAdapter r2 = r9.mAdapter
            int r2 = r2.getCount()
            int r2 = r2 - r1
            goto L_0x0091
        L_0x008e:
            r2 = 0
            goto L_0x0091
        L_0x0090:
            r1 = 0
        L_0x0091:
            android.widget.Scroller r3 = r9.mScroller
            r3.abortAnimation()
            goto L_0x0098
        L_0x0097:
            r1 = 0
        L_0x0098:
            if (r1 == 0) goto L_0x009e
            r9.checkSelectedPositionChangedWhenFling(r2, r4)
            goto L_0x00a1
        L_0x009e:
            r9.checkSelectedPositionChangedWhenFling(r4)
        L_0x00a1:
            r9.scrollTo(r4, r5)
            boolean r1 = r9.pageScrolled(r4)
            if (r1 != 0) goto L_0x00b2
            android.widget.Scroller r1 = r9.mScroller
            r1.abortAnimation()
            r9.scrollTo(r0, r5)
        L_0x00b2:
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r9)
            return
        L_0x00b6:
            r9.completeScroll(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.TTViewPager.computeScroll():void");
    }

    public void dataSetChanged() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da031c3", new Object[]{this});
            return;
        }
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
            c cVar = this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(cVar.f6995a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z2) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, cVar.b, cVar.f6995a);
                    dispatchOnItemVisibleChanged(cVar.b, false);
                    int i3 = this.mCurItem;
                    if (i3 == cVar.b) {
                        i = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = cVar.b;
                    if (i4 != itemPosition) {
                        if (i4 == this.mCurItem) {
                            i = itemPosition;
                        }
                        cVar.b = itemPosition;
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
                ((LayoutParams) getChildAt(i5).getLayoutParams()).f6993a = 0.0f;
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mItems.size(); i++) {
            dispatchOnItemVisibleChanged(this.mItems.get(i).b, false);
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

    public void dispatchOnItemVisibleChanged(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89b3c26", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.mOnItemVisibleChangeListeners != null) {
            int fixPosition = fixPosition(i);
            int size = this.mOnItemVisibleChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                d dVar = this.mOnItemVisibleChangeListeners.get(i2);
                if (dVar != null) {
                    if (z) {
                        dVar.a(fixPosition);
                    } else {
                        dVar.b(fixPosition);
                    }
                }
            }
        }
    }

    public void dispatchOnPageScrolled(int i, int i2, float f2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b697b1e", new Object[]{this, new Integer(i), new Integer(i2), new Float(f2), new Integer(i3)});
        } else if (this.mOnPageChangeListeners != null) {
            if (this.mEnableCycleScroll) {
                i = fixPosition(i);
            }
            int size = this.mOnPageChangeListeners.size();
            for (int i4 = 0; i4 < size; i4++) {
                e eVar = this.mOnPageChangeListeners.get(i4);
                if (eVar != null) {
                    eVar.a(i, i2, f2, i3);
                }
            }
        }
    }

    public void dispatchOnPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35799c59", new Object[]{this, new Integer(i)});
        } else if (this.mOnPageChangeListeners != null) {
            if (this.mEnableCycleScroll) {
                i = fixPosition(i);
            }
            int size = this.mOnPageChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = this.mOnPageChangeListeners.get(i2);
                if (eVar != null) {
                    eVar.onPageSelected(i);
                }
            }
        }
    }

    public void dispatchOnScrollStateChanged(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41b278d3", new Object[]{this, new Integer(i)});
        } else if (this.mOnPageChangeListeners != null) {
            PagerAdapter pagerAdapter = this.mAdapter;
            if (pagerAdapter != null) {
                i2 = pagerAdapter.getCount();
            } else {
                i2 = 0;
            }
            if (this.mEnableCycleScroll && i == 0 && i2 > 2) {
                int i3 = this.mCurItem;
                if (i3 == 0) {
                    setCurrentItem(i2 - 3, false);
                } else if (i3 == i2 - 1) {
                    setCurrentItem(0, false);
                }
            }
            int size = this.mOnPageChangeListeners.size();
            for (int i4 = 0; i4 < size; i4++) {
                e eVar = this.mOnPageChangeListeners.get(i4);
                if (eVar != null) {
                    eVar.onPageScrollStateChanged(i);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        c infoForChild;
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
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96b34422", new Object[]{this, new Float(f2)})).floatValue();
        }
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.mAdapter) != null && pagerAdapter.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                z = this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                z |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (z) {
            ViewCompat.postInvalidateOnAnimation(this);
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
        if (keyCode != 21) {
            if (keyCode != 22) {
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
            } else if (keyEvent.hasModifiers(2)) {
                return pageRight();
            } else {
                return arrowScroll(66);
            }
        } else if (keyEvent.hasModifiers(2)) {
            return pageLeft();
        } else {
            return arrowScroll(17);
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

    public int getCurrentItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0d0a870", new Object[]{this})).intValue();
        }
        return fixPosition(this.mCurItem);
    }

    public int[] getInstantiatedItemsPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("338ee324", new Object[]{this});
        }
        int size = this.mItems.size();
        if (size <= 0) {
            return null;
        }
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.mItems.get(i).b;
        }
        return iArr;
    }

    public int getModeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf28afc0", new Object[]{this})).intValue();
        }
        return this.mModeScroll;
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

    public int getScrollState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("199fa08", new Object[]{this})).intValue();
        }
        return this.mScrollState;
    }

    public c infoForAnyChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("b6fdebe6", new Object[]{this, view});
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

    public c infoForChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("d2f171c", new Object[]{this, view});
        }
        for (int i = 0; i < this.mItems.size(); i++) {
            c cVar = this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, cVar.f6995a)) {
                return cVar;
            }
        }
        return null;
    }

    public c infoForCurrentScrollPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("1399d72b", new Object[]{this});
        }
        return infoForScrollPosition(getScrollX());
    }

    public c infoForPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("2d23862e", new Object[]{this, new Integer(i)});
        }
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            c cVar = this.mItems.get(i2);
            if (cVar.b == i) {
                return cVar;
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
        Context d2 = tq4.d(this);
        Interpolator interpolator = sInterpolator;
        this.mScroller = new Scroller(d2, interpolator);
        this.mEstimateScroller = new Scroller(d2, interpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(d2);
        float f2 = d2.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f2);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(d2);
        this.mRightEdge = new EdgeEffect(d2);
        this.mFlingDistance = (int) (25.0f * f2);
        this.mCloseEnough = (int) (2.0f * f2);
        this.mDefaultGutterSize = (int) (f2 * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new MyAccessibilityDelegate());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: com.taobao.android.detail.ttdetail.widget.TTViewPager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final Rect f6992a = new Rect();

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (WindowInsetsCompat) ipChange2.ipc$dispatch("eb890e0c", new Object[]{this, view, windowInsetsCompat});
                }
                WindowInsetsCompat onApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                if (onApplyWindowInsets.isConsumed()) {
                    return onApplyWindowInsets;
                }
                Rect rect = this.f6992a;
                rect.left = onApplyWindowInsets.getSystemWindowInsetLeft();
                rect.top = onApplyWindowInsets.getSystemWindowInsetTop();
                rect.right = onApplyWindowInsets.getSystemWindowInsetRight();
                rect.bottom = onApplyWindowInsets.getSystemWindowInsetBottom();
                int childCount = TTViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    WindowInsetsCompat dispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(TTViewPager.this.getChildAt(i), onApplyWindowInsets);
                    rect.left = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                    rect.top = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                    rect.right = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                    rect.bottom = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
                }
                return onApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
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
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
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
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                completeScroll(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.mActivePointerId;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float eventX = getEventX(motionEvent, findPointerIndex);
                float f3 = eventX - this.mLastMotionX;
                float abs = Math.abs(f3);
                float eventY = getEventY(motionEvent, findPointerIndex);
                float abs2 = Math.abs(eventY - this.mInitialMotionY);
                int i2 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
                if (i2 == 0 || isGutterDrag(this.mLastMotionX, f3) || !canScroll(this, false, (int) f3, (int) eventX, (int) eventY)) {
                    int i3 = this.mTouchSlop;
                    if (abs > i3 && abs * 0.5f > abs2) {
                        this.mIsBeingDragged = true;
                        requestParentDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        float f4 = this.mInitialMotionX;
                        float f5 = this.mTouchSlop;
                        if (i2 > 0) {
                            f2 = f4 + f5;
                        } else {
                            f2 = f4 - f5;
                        }
                        this.mLastMotionX = f2;
                        this.mLastMotionY = eventY;
                    } else if (abs2 > i3) {
                        this.mIsUnableToDrag = true;
                    }
                    if (this.mIsBeingDragged && performDrag(eventX)) {
                        ViewCompat.postInvalidateOnAnimation(this);
                    }
                } else {
                    this.mLastMotionX = eventX;
                    this.mLastMotionY = eventY;
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

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i7 = (i5 - paddingLeft) - paddingRight;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                c infoForChild = infoForChild(childAt);
                if (infoForChild != null) {
                    float f2 = i7;
                    int i9 = ((int) (infoForChild.d * f2)) + paddingLeft;
                    if (layoutParams.b) {
                        layoutParams.b = false;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * layoutParams.f6993a), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt.layout(i9, paddingTop, childAt.getMeasuredWidth() + i9, childAt.getMeasuredHeight() + paddingTop);
                }
            }
        }
        if (this.mFirstLayout) {
            scrollToItem(this.mCurItem, false, 0, true);
        }
        this.mFirstLayout = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!(childAt.getVisibility() == 8 || (layoutParams = (LayoutParams) childAt.getLayoutParams()) == null)) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f6993a), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    public void onPageScrolled(int i, int i2, float f2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a38f8204", new Object[]{this, new Integer(i), new Integer(i2), new Float(f2), new Integer(i3)});
            return;
        }
        dispatchOnPageScrolled(i, i2, f2, i3);
        this.mCalledSuper = true;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        c infoForChild;
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
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.b == this.mCurItem && childAt.requestFocus(i, rect)) {
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
        float f2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
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
            populate();
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.mIsBeingDragged) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex == -1) {
                        z = resetTouch();
                    } else {
                        float eventX = getEventX(motionEvent, findPointerIndex);
                        float abs = Math.abs(eventX - this.mLastMotionX);
                        float eventY = getEventY(motionEvent, findPointerIndex);
                        float abs2 = Math.abs(eventY - this.mLastMotionY);
                        if (abs > this.mTouchSlop && abs > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            float f3 = this.mInitialMotionX;
                            if (eventX - f3 > 0.0f) {
                                f2 = f3 + this.mTouchSlop;
                            } else {
                                f2 = f3 - this.mTouchSlop;
                            }
                            this.mLastMotionX = f2;
                            this.mLastMotionY = eventY;
                            setScrollState(1);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.mIsBeingDragged) {
                    z = performDrag(getEventX(motionEvent, motionEvent.findPointerIndex(this.mActivePointerId)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.mLastMotionX = getEventX(motionEvent, actionIndex);
                    this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                    this.mLastMotionX = getEventX(motionEvent, motionEvent.findPointerIndex(this.mActivePointerId));
                }
            } else if (this.mIsBeingDragged) {
                scrollToItem(this.mCurItem, true, 0, false);
                z = resetTouch();
            }
        } else if (this.mIsBeingDragged) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            if (this.mModeScroll == 1) {
                this.mEstimateScroller.computeScrollOffset();
                this.mEstimateScroller.abortAnimation();
                this.mEstimateScroller.fling(getScrollX(), getScrollY(), -xVelocity, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                int finalX = this.mEstimateScroller.getFinalX();
                this.mEstimateScroller.abortAnimation();
                setCurrentItemInternal(determineFlingTargetPosition(finalX, xVelocity, (int) (getEventX(motionEvent, motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true);
            } else {
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition().b, xVelocity, (int) (getEventX(motionEvent, motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true);
            }
            z = resetTouch();
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

    public boolean pageScrolled(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a2f7465", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.mItems.size() != 0) {
            c infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            int clientWidth = getClientWidth();
            int i2 = this.mPageMargin;
            int i3 = clientWidth + i2;
            float f2 = clientWidth;
            int i4 = infoForCurrentScrollPosition.b;
            float f3 = (((i / f2) + 0.5f) - infoForCurrentScrollPosition.d) / (infoForCurrentScrollPosition.c + (i2 / f2));
            this.mCalledSuper = false;
            onPageScrolled(i4, i3, f3, (int) (i3 * f3));
            if (this.mCalledSuper) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.mFirstLayout) {
            return false;
        } else {
            this.mCalledSuper = false;
            onPageScrolled(0, 0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public void populate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1c6871", new Object[]{this});
        } else {
            populate(this.mCurItem);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (r12 == r13) goto L_0x0088;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void populateWithDx(int r21, boolean r22, float r23) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.TTViewPager.populateWithDx(int, boolean, float):void");
    }

    public void removeOnItemVisibleChangeListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a14aaf4", new Object[]{this, dVar});
            return;
        }
        List<d> list = this.mOnItemVisibleChangeListeners;
        if (list != null) {
            list.remove(dVar);
        }
    }

    public void removeOnPageChangeListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97c005c", new Object[]{this, eVar});
            return;
        }
        List<e> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(eVar);
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

    public boolean resetTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fd337bb", new Object[]{this})).booleanValue();
        }
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        if (this.mLeftEdge.isFinished() || this.mRightEdge.isFinished()) {
            return true;
        }
        return false;
    }

    public void scrollToItem(int i, boolean z, int i2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e636384", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2), new Boolean(z2)});
            return;
        }
        int targetOffset = getTargetOffset(i, infoForPosition(i));
        if (z) {
            smoothScrollTo(targetOffset, 0, i2);
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(targetOffset, 0);
        pageScrolled(targetOffset);
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d478923", new Object[]{this, pagerAdapter});
            return;
        }
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            f fVar = this.mObserver;
            if (fVar != null) {
                pagerAdapter2.unregisterDataSetObserver(fVar);
            }
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                c cVar = this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, cVar.b, cVar.f6995a);
                dispatchOnItemVisibleChanged(cVar.b, false);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        if (!this.mEnableCycleScroll || pagerAdapter == null) {
            this.mAdapter = pagerAdapter;
        } else {
            this.mAdapter = new CycleScrollPagerAdapter(pagerAdapter);
        }
        this.mExpectedAdapterCount = 0;
        if (this.mAdapter != null) {
            f fVar2 = new f();
            this.mObserver = fVar2;
            this.mAdapter.registerDataSetObserver(fVar2);
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
    }

    public void setCurrentItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
        } else {
            setCurrentItemInternal(i, true ^ this.mFirstLayout, false);
        }
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ea61b5", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else {
            setCurrentItemInternal(i, z, z2, 0);
        }
    }

    public void setModeScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc4564a", new Object[]{this, new Integer(i)});
        } else if (this.mModeScroll != i) {
            this.mModeScroll = 0;
            if (i == 0 || i == 1) {
                this.mModeScroll = i;
            }
            setCurrentItemInternal(this.mCurItem, false, false);
        }
    }

    public void setOffscreenPageLimit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b63529", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
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

    public void setScrollCycle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef22936", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableCycleScroll = z;
        }
    }

    public void setScrollState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a2509a", new Object[]{this, new Integer(i)});
        } else if (this.mScrollState != i) {
            this.mScrollState = i;
            dispatchOnScrollStateChanged(i);
        }
    }

    public void smoothScrollTo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a1cc9d", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            smoothScrollTo(i, i2, 0);
        }
    }

    public void updateItemsWidth() {
        float f2;
        float f3;
        float f4;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e3c096", new Object[]{this});
        } else if (this.mAdapter != null && !this.mItems.isEmpty()) {
            int infoIndexForPosition = infoIndexForPosition(this.mCurItem);
            int count = this.mAdapter.getCount();
            int clientWidth = getClientWidth();
            if (clientWidth > 0) {
                f2 = this.mPageMargin / clientWidth;
            } else {
                f2 = 0.0f;
            }
            c cVar = this.mItems.get(infoIndexForPosition);
            int size = this.mItems.size();
            float f5 = cVar.d;
            int i3 = cVar.b;
            if (i3 == 0) {
                f3 = f5;
            } else {
                f3 = -3.4028235E38f;
            }
            this.mFirstOffset = f3;
            int i4 = count - 1;
            if (i3 == i4) {
                f4 = Math.max(f3, (cVar.c + f5) - 1.0f);
            } else {
                f4 = Float.MAX_VALUE;
            }
            this.mLastOffset = f4;
            int i5 = infoIndexForPosition;
            while (i5 >= 0) {
                c cVar2 = this.mItems.get(i5);
                while (true) {
                    i2 = cVar2.b;
                    if (i3 <= i2) {
                        break;
                    }
                    f5 -= this.mAdapter.getPageWidth(i3) + f2;
                    i3--;
                }
                if (i2 == 0) {
                    this.mFirstOffset = f5;
                }
                cVar2.d = f5;
                float pageWidth = this.mAdapter.getPageWidth(i3);
                cVar2.c = pageWidth;
                f5 -= pageWidth + f2;
                i5--;
                i3--;
            }
            float f6 = cVar.d;
            int i6 = cVar.b;
            while (infoIndexForPosition < size) {
                c cVar3 = this.mItems.get(infoIndexForPosition);
                while (true) {
                    i = cVar3.b;
                    if (i6 >= i) {
                        break;
                    }
                    f6 += this.mAdapter.getPageWidth(i6) + f2;
                    i6++;
                }
                if (i == i4) {
                    this.mLastOffset = Math.max(this.mFirstOffset, (cVar3.c + f6) - 1.0f);
                }
                cVar3.d = f6;
                float pageWidth2 = this.mAdapter.getPageWidth(i6);
                cVar3.c = pageWidth2;
                f6 += pageWidth2 + f2;
                infoIndexForPosition++;
                i6++;
            }
            this.mLastOffset = Math.max(this.mFirstOffset, this.mLastOffset);
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                c infoForChild = infoForChild(childAt);
                if (infoForChild != null) {
                    layoutParams.f6993a = infoForChild.c;
                }
            }
            int width = getWidth();
            int i8 = this.mPageMargin;
            recomputeScrollPosition(width, width, i8, i8);
            populate();
            requestLayout();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public float f6993a = 0.0f;
        public boolean b;
        public boolean c;

        static {
            t2o.a(912262948);
        }

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TTViewPager.LAYOUT_ATTRS);
            obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("84bf71af", new Object[]{this, attributeSet}) : new LayoutParams(tq4.d(this), attributeSet);
    }

    public void populate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97118b2", new Object[]{this, new Integer(i)});
        } else {
            populateWithDx(i, false, 0.0f);
        }
    }

    public void setCurrentItem(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aed29e2", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        if (this.mEnableCycleScroll) {
            i++;
        }
        setCurrentItemInternal(i, z, false);
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e96247ee", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2), new Integer(i2)});
            return;
        }
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null && pagerAdapter.getCount() > 0) {
            if (z2 || this.mCurItem != i || this.mItems.size() == 0) {
                if (i < 0) {
                    i = 0;
                } else if (i >= this.mAdapter.getCount()) {
                    i = this.mAdapter.getCount() - 1;
                }
                if (this.mCurItem != i) {
                    z3 = true;
                }
                if (this.mFirstLayout) {
                    this.mCurItem = i;
                    if (z3) {
                        dispatchOnPageSelected(i);
                    }
                    requestLayout();
                    return;
                }
                if (!z) {
                    populateWithDx(i, true, 0.0f);
                }
                scrollToItem(i, z, i2, z3);
            }
        }
    }

    public void smoothScrollTo(int i, int i2, int i3) {
        int scrollX;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42983a06", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (getChildCount() != 0) {
            Scroller scroller = this.mScroller;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
                this.mScroller.abortAnimation();
            }
            int scrollY = getScrollY();
            int i5 = i - scrollX;
            int i6 = i2 - scrollY;
            if (i5 == 0 && i6 == 0) {
                completeScroll(false);
                populate();
                setScrollState(0);
                return;
            }
            setScrollState(2);
            int clientWidth = getClientWidth();
            int i7 = clientWidth / 2;
            float f2 = clientWidth;
            float f3 = i7;
            float distanceInfluenceForSnapDuration = f3 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f2)) * f3);
            int abs = Math.abs(i3);
            if (abs > 0) {
                i4 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
            } else {
                i4 = (int) (((Math.abs(i5) / ((f2 * this.mAdapter.getPageWidth(this.mCurItem)) + this.mPageMargin)) + 1.0f) * 100.0f);
            }
            int min = Math.min(i4, 600);
            this.mIsScrollStarted = false;
            this.mScroller.startScroll(scrollX, scrollY, i5, i6, min);
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    private void checkSelectedPositionChangedWhenFling(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9aaa782", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.mCurItem;
        int findScrollPosition = this.mItems.size() > 0 ? findScrollPosition(1 + i) : i2;
        populateWithDx(findScrollPosition, false, i - getScrollX());
        if (findScrollPosition != i2) {
            dispatchOnPageSelected(findScrollPosition);
        }
    }

    public TTViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViewPager();
    }
}
