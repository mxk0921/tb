package com.taobao.tao.combo.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
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
import androidx.core.view.MotionEventCompat;
import androidx.core.view.VelocityTrackerCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import tb.a4w;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class VerticalViewPager extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "VerticalViewPager";
    private static final boolean USE_CACHE = false;
    private a4w mAdapter;
    private d mAdapterChangeListener;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCurItem;
    private int mDecorChildCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private int mFlingDistance;
    private boolean mInLayout;
    private float mInitialMotionY;
    private e mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsUnableToDrag;
    private float mLastMotionX;
    private float mLastMotionY;
    private int mLeftPageBounds;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private f mObserver;
    private e mOnPageChangeListener;
    private int mPageMargin;
    private boolean mPopulatePending;
    private int mRightPageBounds;
    private Scroller mScroller;
    private boolean mScrolling;
    private boolean mScrollingCacheEnabled;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    private static final int[] LAYOUT_ATTRS = {16842931};
    private static final Comparator<c> COMPARATOR = new a();
    private static final Interpolator sInterpolator = new b();
    private final ArrayList<c> mItems = new ArrayList<>();
    private int mRestoredCurItem = -1;
    private Parcelable mRestoredAdapterState = null;
    private ClassLoader mRestoredClassLoader = null;
    private int mOffscreenPageLimit = 1;
    private int mActivePointerId = -1;
    private boolean mFirstLayout = true;
    private int mScrollState = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f11946a;
        public final int b;

        static {
            t2o.a(764412097);
        }

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VerticalViewPager.access$100());
            this.b = obtainStyledAttributes.getInteger(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks<SavedState>() { // from class: com.taobao.tao.combo.ui.VerticalViewPager.SavedState.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SavedState) ipChange.ipc$dispatch("bc028912", new Object[]{this, parcel, classLoader});
                }
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SavedState[]) ipChange.ipc$dispatch("66d6f0d7", new Object[]{this, new Integer(i)});
                }
                return new SavedState[i];
            }
        });
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        static {
            t2o.a(764412101);
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Comparator<c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b131794f", new Object[]{this, cVar, cVar2})).intValue();
            }
            return cVar.b - cVar2.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Interpolator {
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public Object f11947a;
        public int b;
        public boolean c;

        static {
            t2o.a(764412096);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f extends DataSetObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(764412100);
        }

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/combo/ui/VerticalViewPager$PagerObserver");
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            } else {
                VerticalViewPager.this.dataSetChanged();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
            } else {
                VerticalViewPager.this.dataSetChanged();
            }
        }

        public /* synthetic */ f(VerticalViewPager verticalViewPager, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class g implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(764412103);
            t2o.a(764412099);
        }

        @Override // com.taobao.tao.combo.ui.VerticalViewPager.e
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // com.taobao.tao.combo.ui.VerticalViewPager.e
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            }
        }

        @Override // com.taobao.tao.combo.ui.VerticalViewPager.e
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            }
        }
    }

    static {
        t2o.a(764412092);
    }

    public VerticalViewPager(Context context) {
        super(context);
        initViewPager();
    }

    public static /* synthetic */ int[] access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("45cc152c", new Object[0]);
        }
        return LAYOUT_ATTRS;
    }

    private void completeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71dad6ed", new Object[]{this});
            return;
        }
        boolean z = this.mScrolling;
        if (z) {
            setScrollingCacheEnabled(false);
            this.mScroller.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
            setScrollState(0);
        }
        this.mPopulatePending = false;
        this.mScrolling = false;
        for (int i = 0; i < this.mItems.size(); i++) {
            c cVar = this.mItems.get(i);
            if (cVar.c) {
                cVar.c = false;
                z = true;
            }
        }
        if (z) {
            populate();
        }
    }

    private int determineTargetPage(int i, float f2, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c7b8caa", new Object[]{this, new Integer(i), new Float(f2), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) {
            return (int) (i + f2 + 0.5f);
        }
        if (i2 > 0) {
            return i;
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

    public static /* synthetic */ Object ipc$super(VerticalViewPager verticalViewPager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1894755994:
                return new Boolean(super.verifyDrawable((Drawable) objArr[0]));
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
            case 1246973220:
                return new Boolean(super.dispatchKeyEvent((KeyEvent) objArr[0]));
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            case 2043983618:
                return new Boolean(super.checkLayoutParams((ViewGroup.LayoutParams) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/combo/ui/VerticalViewPager");
        }
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
            this.mLastMotionY = MotionEventCompat.getY(motionEvent, i);
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void pageScrolled(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2f7461", new Object[]{this, new Integer(i)});
            return;
        }
        int height = getHeight() + this.mPageMargin;
        int i2 = i / height;
        int i3 = i % height;
        this.mCalledSuper = false;
        onPageScrolled(i2, i3 / height, i3);
        if (!this.mCalledSuper) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b766a1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int i5 = i + i3;
        if (i2 > 0) {
            int scrollY = getScrollY();
            int i6 = i2 + i4;
            int i7 = (int) (((scrollY / i6) + ((scrollY % i6) / i6)) * i5);
            scrollTo(getScrollX(), i7);
            if (!this.mScroller.isFinished()) {
                this.mScroller.startScroll(0, i7, this.mCurItem * i5, 0, this.mScroller.getDuration() - this.mScroller.timePassed());
                return;
            }
            return;
        }
        int i8 = this.mCurItem * i5;
        if (i8 != getScrollY()) {
            completeScroll();
            scrollTo(getScrollX(), i8);
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
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f11946a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void setScrollState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a2509a", new Object[]{this, new Integer(i)});
        } else if (this.mScrollState != i) {
            this.mScrollState = i;
            e eVar = this.mOnPageChangeListener;
            if (eVar != null) {
                eVar.onPageScrollStateChanged(i);
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

    public void addNewItem(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62950299", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        c cVar = new c();
        cVar.b = i;
        cVar.f11947a = this.mAdapter.h(this, i);
        if (i2 < 0) {
            this.mItems.add(cVar);
        } else {
            this.mItems.add(i2, cVar);
        }
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
        boolean z = layoutParams2.f11946a;
        layoutParams2.f11946a = z;
        if (!this.mInLayout) {
            super.addView(view, i, layoutParams);
        } else if (!z) {
            addViewInLayout(view, i, layoutParams);
            view.measure(this.mChildWidthMeasureSpec, this.mChildHeightMeasureSpec);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public boolean arrowScroll(int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ead254ea", new Object[]{this, new Integer(i)})).booleanValue();
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (findNextFocus == null || findNextFocus == findFocus) {
            if (i == 33 || i == 1) {
                z = pageUp();
            } else if (i == 130 || i == 2) {
                z = pageDown();
            }
        } else if (i == 33) {
            z = (findFocus == null || findNextFocus.getTop() < findFocus.getTop()) ? findNextFocus.requestFocus() : pageUp();
        } else if (i == 130) {
            z = (findFocus == null || findNextFocus.getTop() > findFocus.getTop()) ? findNextFocus.requestFocus() : pageDown();
        }
        if (z) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z;
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
        this.mLastMotionY = 0.0f;
        this.mInitialMotionY = 0.0f;
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
        if (!z || !ViewCompat.canScrollVertically(view, -i)) {
            return false;
        }
        return true;
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
            completeScroll();
        } else {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
                pageScrolled(currY);
            }
            invalidate();
        }
    }

    public void dataSetChanged() {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da031c3", new Object[]{this});
            return;
        }
        if (this.mItems.size() >= 3 || this.mItems.size() >= this.mAdapter.e()) {
            z = false;
        } else {
            z = true;
        }
        int i = 0;
        boolean z3 = false;
        int i2 = -1;
        while (i < this.mItems.size()) {
            c cVar = this.mItems.get(i);
            int f2 = this.mAdapter.f(cVar.f11947a);
            if (f2 != -1) {
                if (f2 == -2) {
                    this.mItems.remove(i);
                    i--;
                    if (!z3) {
                        this.mAdapter.q(this);
                        z3 = true;
                    }
                    this.mAdapter.b(this, cVar.b, cVar.f11947a);
                    int i3 = this.mCurItem;
                    if (i3 == cVar.b) {
                        i2 = Math.max(0, Math.min(i3, this.mAdapter.e() - 1));
                    }
                } else {
                    int i4 = cVar.b;
                    if (i4 != f2) {
                        if (i4 == this.mCurItem) {
                            i2 = f2;
                        }
                        cVar.b = f2;
                    }
                }
                z = true;
            }
            i++;
        }
        if (z3) {
            this.mAdapter.d(this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (i2 >= 0) {
            setCurrentItemInternal(i2, false, true);
        } else {
            z2 = z;
        }
        if (z2) {
            populate();
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
        c infoForChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbbb6bb7", new Object[]{this, accessibilityEvent})).booleanValue();
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
        return (float) Math.sin((float) ((f2 - 0.5f) * 0.4712389167638204d));
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
            int scrollY = getScrollY();
            int height = getHeight() + this.mPageMargin;
            setCurrentItemInternal(determineTargetPage(scrollY / height, (scrollY % height) / height, xVelocity, (int) (this.mLastMotionY - this.mInitialMotionY)), true, true, xVelocity);
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
        if (keyCode == 19) {
            return arrowScroll(33);
        }
        if (keyCode == 20) {
            return arrowScroll(130);
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

    public void fakeDragBy(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfbbc7b9", new Object[]{this, new Float(f2)});
        } else if (this.mFakeDragging) {
            this.mLastMotionY += f2;
            float scrollY = getScrollY() - f2;
            int height = getHeight() + this.mPageMargin;
            float max = Math.max(0, (this.mCurItem - 1) * height);
            float min = Math.min(this.mCurItem + 1, this.mAdapter.e() - 1) * height;
            if (scrollY < max) {
                scrollY = max;
            } else if (scrollY > min) {
                scrollY = min;
            }
            int i = (int) scrollY;
            this.mLastMotionY += scrollY - i;
            scrollTo(getScrollX(), i);
            pageScrolled(i);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, 0.0f, this.mLastMotionY, 0);
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

    public a4w getAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a4w) ipChange.ipc$dispatch("312c1a09", new Object[]{this});
        }
        return this.mAdapter;
    }

    public int getCurrentItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0d0a870", new Object[]{this})).intValue();
        }
        return this.mCurItem;
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

    public c infoForAnyChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f882b72e", new Object[]{this, view});
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
            return (c) ipChange.ipc$dispatch("6c628364", new Object[]{this, view});
        }
        for (int i = 0; i < this.mItems.size(); i++) {
            c cVar = this.mItems.get(i);
            if (this.mAdapter.i(view, cVar.f11947a)) {
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
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mFlingDistance = (int) (context.getResources().getDisplayMetrics().density * 25.0f);
    }

    public boolean isFakeDragging() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e770b399", new Object[]{this})).booleanValue();
        }
        return this.mFakeDragging;
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

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null) {
            int scrollY = getScrollY();
            int height = getHeight();
            int i = this.mPageMargin;
            int i2 = scrollY % (height + i);
            if (i2 != 0) {
                int i3 = (scrollY - i2) + height;
                this.mMarginDrawable.setBounds(this.mLeftPageBounds, i3, this.mRightPageBounds, i + i3);
                this.mMarginDrawable.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
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
            this.mLastMotionX = motionEvent.getX();
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
            if (this.mScrollState == 2) {
                this.mIsBeingDragged = true;
                this.mIsUnableToDrag = false;
                setScrollState(1);
            } else {
                completeScroll();
                this.mIsBeingDragged = false;
                this.mIsUnableToDrag = false;
            }
        } else if (action == 2) {
            int i = this.mActivePointerId;
            if (i != -1) {
                int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
                float x = MotionEventCompat.getX(motionEvent, findPointerIndex);
                float abs = Math.abs(x - this.mLastMotionX);
                float y2 = MotionEventCompat.getY(motionEvent, findPointerIndex);
                float f2 = y2 - this.mLastMotionY;
                float abs2 = Math.abs(f2);
                if (canScroll(this, false, (int) f2, (int) x, (int) y2)) {
                    this.mLastMotionY = y2;
                    this.mInitialMotionY = y2;
                    this.mLastMotionX = x;
                    return false;
                }
                int i2 = this.mTouchSlop;
                if (abs2 > i2 && abs2 > abs) {
                    this.mIsBeingDragged = true;
                    setScrollState(1);
                    this.mLastMotionY = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs > i2) {
                    this.mIsUnableToDrag = true;
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (!this.mIsBeingDragged) {
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
        }
        return this.mIsBeingDragged;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.combo.ui.VerticalViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i3 = 0;
        while (true) {
            int i4 = 1073741824;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (!(childAt.getVisibility() == 8 || (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) == null || !layoutParams2.f11946a)) {
                int i5 = layoutParams2.b;
                int i6 = i5 & 7;
                int i7 = i5 & 112;
                StringBuilder sb = new StringBuilder("gravity: ");
                sb.append(layoutParams2.b);
                sb.append(" hgrav: ");
                sb.append(i6);
                sb.append(" vgrav: ");
                sb.append(i7);
                if (i7 == 48 || i7 == 80) {
                    z = true;
                } else {
                    z = false;
                }
                if (i6 == 3 || i6 == 5) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i8 = Integer.MIN_VALUE;
                if (!z) {
                    i4 = Integer.MIN_VALUE;
                    if (z2) {
                        i8 = 1073741824;
                    }
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, i4), View.MeasureSpec.makeMeasureSpec(measuredHeight, i8));
                if (z) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    measuredWidth -= childAt.getMeasuredWidth();
                }
            }
            i3++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            View childAt2 = getChildAt(i9);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f11946a)) {
                childAt2.measure(this.mChildWidthMeasureSpec, this.mChildHeightMeasureSpec);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPageScrolled(int r13, float r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tao.combo.ui.VerticalViewPager.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x002b
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r13)
            java.lang.Float r13 = new java.lang.Float
            r13.<init>(r14)
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r15)
            r15 = 4
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r15[r1] = r12
            r15[r2] = r4
            r15[r0] = r13
            r13 = 3
            r15[r13] = r14
            java.lang.String r13 = "f4c13b05"
            r3.ipc$dispatch(r13, r15)
            return
        L_0x002b:
            int r3 = r12.mDecorChildCount
            if (r3 <= 0) goto L_0x0094
            int r3 = r12.getScrollY()
            int r4 = r12.getPaddingTop()
            int r5 = r12.getPaddingBottom()
            int r6 = r12.getHeight()
            int r7 = r12.getChildCount()
        L_0x0043:
            if (r1 >= r7) goto L_0x0094
            android.view.View r8 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.taobao.tao.combo.ui.VerticalViewPager$LayoutParams r9 = (com.taobao.tao.combo.ui.VerticalViewPager.LayoutParams) r9
            boolean r10 = r9.f11946a
            if (r10 != 0) goto L_0x0054
            goto L_0x0092
        L_0x0054:
            int r9 = r9.b
            r9 = r9 & 112(0x70, float:1.57E-43)
            if (r9 == r2) goto L_0x007a
            r10 = 48
            if (r9 == r10) goto L_0x0074
            r10 = 80
            if (r9 == r10) goto L_0x0064
            r9 = r4
            goto L_0x0086
        L_0x0064:
            int r9 = r6 - r5
            int r10 = r8.getMeasuredHeight()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredHeight()
            int r5 = r5 + r10
        L_0x0070:
            r11 = r9
            r9 = r4
            r4 = r11
            goto L_0x0086
        L_0x0074:
            int r9 = r8.getHeight()
            int r9 = r9 + r4
            goto L_0x0086
        L_0x007a:
            int r9 = r8.getMeasuredHeight()
            int r9 = r6 - r9
            int r9 = r9 / r0
            int r9 = java.lang.Math.max(r9, r4)
            goto L_0x0070
        L_0x0086:
            int r4 = r4 + r3
            int r10 = r8.getTop()
            int r4 = r4 - r10
            if (r4 == 0) goto L_0x0091
            r8.offsetTopAndBottom(r4)
        L_0x0091:
            r4 = r9
        L_0x0092:
            int r1 = r1 + r2
            goto L_0x0043
        L_0x0094:
            com.taobao.tao.combo.ui.VerticalViewPager$e r0 = r12.mOnPageChangeListener
            if (r0 == 0) goto L_0x009b
            r0.onPageScrolled(r13, r14, r15)
        L_0x009b:
            com.taobao.tao.combo.ui.VerticalViewPager$e r0 = r12.mInternalPageChangeListener
            if (r0 == 0) goto L_0x00a2
            r0.onPageScrolled(r13, r14, r15)
        L_0x00a2:
            r12.mCalledSuper = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.combo.ui.VerticalViewPager.onPageScrolled(int, float, int):void");
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
            a4w a4wVar = this.mAdapter;
            if (a4wVar != null) {
                a4wVar.l(savedState.adapterState, savedState.loader);
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
        a4w a4wVar = this.mAdapter;
        if (a4wVar != null) {
            savedState.adapterState = a4wVar.m();
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
        if (i2 != i4) {
            int i5 = this.mPageMargin;
            recomputeScrollPosition(i2, i4, i5, i5);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a4w a4wVar;
        int scrollY;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mFakeDragging) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (a4wVar = this.mAdapter) == null || a4wVar.e() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            completeScroll();
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
        } else if (action != 1) {
            if (action == 2) {
                try {
                    if (!this.mIsBeingDragged) {
                        int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId);
                        if (findPointerIndex != -1) {
                            float abs = Math.abs(MotionEventCompat.getX(motionEvent, findPointerIndex) - this.mLastMotionX);
                            float y2 = MotionEventCompat.getY(motionEvent, findPointerIndex);
                            float abs2 = Math.abs(y2 - this.mLastMotionY);
                            if (abs2 > this.mTouchSlop && abs2 > abs) {
                                this.mIsBeingDragged = true;
                                this.mLastMotionY = y2;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                            }
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (this.mIsBeingDragged) {
                    float y3 = MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId));
                    float f2 = this.mLastMotionY - y3;
                    this.mLastMotionY = y3;
                    float scrollY2 = getScrollY() + f2;
                    int height = getHeight() + this.mPageMargin;
                    float max = Math.max(0, (this.mCurItem - 1) * height);
                    float min = Math.min(this.mCurItem + 1, this.mAdapter.e() - 1) * height;
                    if (scrollY2 < max) {
                        scrollY2 = max;
                    } else if (scrollY2 > min) {
                        scrollY2 = min;
                    }
                    int i = (int) scrollY2;
                    this.mLastMotionY += scrollY2 - i;
                    scrollTo(getScrollX(), i);
                    pageScrolled(i);
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                    this.mLastMotionY = MotionEventCompat.getY(motionEvent, actionIndex);
                    this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                } else if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                    this.mLastMotionY = MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId));
                }
            } else if (this.mIsBeingDragged) {
                setCurrentItemInternal(this.mCurItem, true, true);
                this.mActivePointerId = -1;
                endDrag();
            }
        } else if (this.mIsBeingDragged) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int yVelocity = (int) VelocityTrackerCompat.getYVelocity(velocityTracker, this.mActivePointerId);
            this.mPopulatePending = true;
            int height2 = getHeight() + this.mPageMargin;
            setCurrentItemInternal(determineTargetPage(getScrollY() / height2, (scrollY % height2) / height2, yVelocity, (int) (MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId)) - this.mInitialMotionY)), true, true, yVelocity);
            this.mActivePointerId = -1;
            endDrag();
        }
        return true;
    }

    public boolean pageDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9c44fdc", new Object[]{this})).booleanValue();
        }
        a4w a4wVar = this.mAdapter;
        if (a4wVar == null || this.mCurItem >= a4wVar.e() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    public boolean pageUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fc9b515", new Object[]{this})).booleanValue();
        }
        int i = this.mCurItem;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    public void populate() {
        int i;
        c cVar;
        c cVar2;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1c6871", new Object[]{this});
        } else if (this.mAdapter != null && !this.mPopulatePending && getWindowToken() != null) {
            this.mAdapter.q(this);
            int i2 = this.mOffscreenPageLimit;
            int max = Math.max(0, this.mCurItem - i2);
            int min = Math.min(this.mAdapter.e() - 1, this.mCurItem + i2);
            int i3 = 0;
            int i4 = -1;
            while (i3 < this.mItems.size()) {
                c cVar3 = this.mItems.get(i3);
                int i5 = cVar3.b;
                if ((i5 < max || i5 > min) && !cVar3.c) {
                    this.mItems.remove(i3);
                    i3--;
                    this.mAdapter.b(this, cVar3.b, cVar3.f11947a);
                } else if (i4 < min && i5 > max) {
                    int i6 = i4 + 1;
                    if (i6 < max) {
                        i6 = max;
                    }
                    while (i6 <= min && i6 < cVar3.b) {
                        addNewItem(i6, i3);
                        i6++;
                        i3++;
                    }
                }
                i4 = cVar3.b;
                i3++;
            }
            if (this.mItems.size() > 0) {
                ArrayList<c> arrayList = this.mItems;
                i = arrayList.get(arrayList.size() - 1).b;
            } else {
                i = -1;
            }
            if (i < min) {
                int i7 = i + 1;
                if (i7 > max) {
                    max = i7;
                }
                while (max <= min) {
                    addNewItem(max, -1);
                    max++;
                }
            }
            int i8 = 0;
            while (true) {
                cVar = null;
                if (i8 >= this.mItems.size()) {
                    cVar2 = null;
                    break;
                } else if (this.mItems.get(i8).b == this.mCurItem) {
                    cVar2 = this.mItems.get(i8);
                    break;
                } else {
                    i8++;
                }
            }
            a4w a4wVar = this.mAdapter;
            int i9 = this.mCurItem;
            if (cVar2 != null) {
                obj = cVar2.f11947a;
            } else {
                obj = null;
            }
            a4wVar.o(this, i9, obj);
            this.mAdapter.d(this);
            if (hasFocus()) {
                View findFocus = findFocus();
                if (findFocus != null) {
                    cVar = infoForAnyChild(findFocus);
                }
                if (cVar == null || cVar.b != this.mCurItem) {
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        View childAt = getChildAt(i10);
                        c infoForChild = infoForChild(childAt);
                        if (infoForChild != null && infoForChild.b == this.mCurItem && childAt.requestFocus(2)) {
                            return;
                        }
                    }
                }
            }
        }
    }

    public void setAdapter(a4w a4wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97df6e27", new Object[]{this, a4wVar});
            return;
        }
        a4w a4wVar2 = this.mAdapter;
        if (a4wVar2 != null) {
            a4wVar2.r(this.mObserver);
            this.mAdapter.q(this);
            for (int i = 0; i < this.mItems.size(); i++) {
                c cVar = this.mItems.get(i);
                this.mAdapter.b(this, cVar.b, cVar.f11947a);
            }
            this.mAdapter.d(this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        this.mAdapter = a4wVar;
        if (a4wVar != null) {
            if (this.mObserver == null) {
                this.mObserver = new f(this, null);
            }
            this.mAdapter.k(this.mObserver);
            this.mPopulatePending = false;
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.l(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
                return;
            }
            populate();
        }
    }

    public void setCurrentItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
            return;
        }
        this.mPopulatePending = false;
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

    public e setInternalPageChangeListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("566dcbd", new Object[]{this, eVar});
        }
        e eVar2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = eVar;
        return eVar2;
    }

    public void setOffscreenPageLimit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b63529", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 1) {
            StringBuilder sb = new StringBuilder("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to 1");
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    public void setOnAdapterChangeListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e218682a", new Object[]{this, dVar});
        }
    }

    public void setOnPageChangeListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f25e82", new Object[]{this, eVar});
        } else {
            this.mOnPageChangeListener = eVar;
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
        int height = getHeight();
        recomputeScrollPosition(height, height, i, i2);
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

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("84bf71af", new Object[]{this, attributeSet}) : new LayoutParams(getContext(), attributeSet);
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        e eVar;
        e eVar2;
        e eVar3;
        e eVar4;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e96247ee", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2), new Integer(i2)});
            return;
        }
        a4w a4wVar = this.mAdapter;
        if (a4wVar == null || a4wVar.e() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.mCurItem != i || this.mItems.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.mAdapter.e()) {
                i = this.mAdapter.e() - 1;
            }
            int i3 = this.mOffscreenPageLimit;
            int i4 = this.mCurItem;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                    this.mItems.get(i5).c = true;
                }
            }
            if (this.mCurItem == i) {
                z3 = false;
            }
            this.mCurItem = i;
            populate();
            int height = (getHeight() + this.mPageMargin) * i;
            if (z) {
                smoothScrollTo(0, height, i2);
                if (z3 && (eVar4 = this.mOnPageChangeListener) != null) {
                    eVar4.onPageSelected(i);
                }
                if (z3 && (eVar3 = this.mInternalPageChangeListener) != null) {
                    eVar3.onPageSelected(i);
                    return;
                }
                return;
            }
            if (z3 && (eVar2 = this.mOnPageChangeListener) != null) {
                eVar2.onPageSelected(i);
            }
            if (z3 && (eVar = this.mInternalPageChangeListener) != null) {
                eVar.onPageSelected(i);
            }
            completeScroll();
            scrollTo(0, height);
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
                completeScroll();
                setScrollState(0);
                return;
            }
            setScrollingCacheEnabled(true);
            this.mScrolling = true;
            setScrollState(2);
            int height = getHeight();
            float f2 = height / 2;
            float distanceInfluenceForSnapDuration = f2 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i6) * 1.0f) / height)) * f2);
            int abs = Math.abs(i3);
            if (abs > 0) {
                i4 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
            } else {
                i4 = (int) (((Math.abs(i6) / (height + this.mPageMargin)) + 1.0f) * 100.0f);
            }
            this.mScroller.startScroll(scrollX, scrollY, i5, i6, Math.min(i4, 600));
            invalidate();
        }
    }

    public void setCurrentItem(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aed29e2", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.mPopulatePending = false;
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

    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViewPager();
    }
}
