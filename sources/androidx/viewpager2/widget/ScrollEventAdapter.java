package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ScrollEventAdapter extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int NO_POSITION = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_PROGRESS_FAKE_DRAG = 4;
    private static final int STATE_IN_PROGRESS_IMMEDIATE_SCROLL = 3;
    private static final int STATE_IN_PROGRESS_MANUAL_DRAG = 1;
    private static final int STATE_IN_PROGRESS_SMOOTH_SCROLL = 2;
    private int mAdapterState;
    private ViewPager2.OnPageChangeCallback mCallback;
    private boolean mDataSetChangeHappened;
    private boolean mDispatchSelected;
    private int mDragStartPosition;
    private boolean mFakeDragging;
    private final LinearLayoutManager mLayoutManager;
    private final RecyclerView mRecyclerView;
    private boolean mScrollHappened;
    private int mScrollState;
    private ScrollEventValues mScrollValues = new ScrollEventValues();
    private int mTarget;
    private final ViewPager2 mViewPager;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class ScrollEventValues {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public float mOffset;
        public int mOffsetPx;
        public int mPosition;

        public void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            this.mPosition = -1;
            this.mOffset = 0.0f;
            this.mOffsetPx = 0;
        }
    }

    public ScrollEventAdapter(ViewPager2 viewPager2) {
        this.mViewPager = viewPager2;
        RecyclerView recyclerView = viewPager2.mRecyclerView;
        this.mRecyclerView = recyclerView;
        this.mLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        resetState();
    }

    private void dispatchScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfd48e19", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.mCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrolled(i, f, i2);
        }
    }

    private void dispatchSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c827747", new Object[]{this, new Integer(i)});
            return;
        }
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.mCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageSelected(i);
        }
    }

    private void dispatchStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("468db2ff", new Object[]{this, new Integer(i)});
        } else if ((this.mAdapterState != 3 || this.mScrollState != 0) && this.mScrollState != i) {
            this.mScrollState = i;
            ViewPager2.OnPageChangeCallback onPageChangeCallback = this.mCallback;
            if (onPageChangeCallback != null) {
                onPageChangeCallback.onPageScrollStateChanged(i);
            }
        }
    }

    private int getPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
        }
        return this.mLayoutManager.findFirstVisibleItemPosition();
    }

    public static /* synthetic */ Object ipc$super(ScrollEventAdapter scrollEventAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/viewpager2/widget/ScrollEventAdapter");
    }

    private boolean isInAnyDraggingState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8ed1a10", new Object[]{this})).booleanValue();
        }
        int i = this.mAdapterState;
        if (i == 1 || i == 4) {
            return true;
        }
        return false;
    }

    private void resetState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd02409", new Object[]{this});
            return;
        }
        this.mAdapterState = 0;
        this.mScrollState = 0;
        this.mScrollValues.reset();
        this.mDragStartPosition = -1;
        this.mTarget = -1;
        this.mDispatchSelected = false;
        this.mScrollHappened = false;
        this.mFakeDragging = false;
        this.mDataSetChangeHappened = false;
    }

    private void startDrag(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57ddc37", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mFakeDragging = z;
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        this.mAdapterState = i;
        int i2 = this.mTarget;
        if (i2 != -1) {
            this.mDragStartPosition = i2;
            this.mTarget = -1;
        } else if (this.mDragStartPosition == -1) {
            this.mDragStartPosition = getPosition();
        }
        dispatchStateChanged(1);
    }

    private void updateScrollEventValues() {
        int i;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ef730d", new Object[]{this});
            return;
        }
        ScrollEventValues scrollEventValues = this.mScrollValues;
        int findFirstVisibleItemPosition = this.mLayoutManager.findFirstVisibleItemPosition();
        scrollEventValues.mPosition = findFirstVisibleItemPosition;
        if (findFirstVisibleItemPosition == -1) {
            scrollEventValues.reset();
            return;
        }
        View findViewByPosition = this.mLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
        if (findViewByPosition == null) {
            scrollEventValues.reset();
            return;
        }
        int leftDecorationWidth = this.mLayoutManager.getLeftDecorationWidth(findViewByPosition);
        int rightDecorationWidth = this.mLayoutManager.getRightDecorationWidth(findViewByPosition);
        int topDecorationHeight = this.mLayoutManager.getTopDecorationHeight(findViewByPosition);
        int bottomDecorationHeight = this.mLayoutManager.getBottomDecorationHeight(findViewByPosition);
        ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = findViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = findViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.mLayoutManager.getOrientation() == 0) {
            i = (findViewByPosition.getLeft() - leftDecorationWidth) - this.mRecyclerView.getPaddingLeft();
            if (this.mViewPager.isRtl()) {
                i = -i;
            }
            height = width;
        } else {
            i = (findViewByPosition.getTop() - topDecorationHeight) - this.mRecyclerView.getPaddingTop();
        }
        int i2 = -i;
        scrollEventValues.mOffsetPx = i2;
        if (i2 >= 0) {
            if (height == 0) {
                f = 0.0f;
            } else {
                f = i2 / height;
            }
            scrollEventValues.mOffset = f;
        } else if (new AnimateLayoutChangeDetector(this.mLayoutManager).mayHaveInterferingAnimations()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            Locale locale = Locale.US;
            int i3 = scrollEventValues.mOffsetPx;
            throw new IllegalStateException("Page can only be offset by a positive amount, not by " + i3);
        }
    }

    public double getRelativeScrollPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("194af86d", new Object[]{this})).doubleValue();
        }
        updateScrollEventValues();
        ScrollEventValues scrollEventValues = this.mScrollValues;
        return scrollEventValues.mPosition + scrollEventValues.mOffset;
    }

    public int getScrollState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("199fa08", new Object[]{this})).intValue();
        }
        return this.mScrollState;
    }

    public boolean isDragging() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98b514a4", new Object[]{this})).booleanValue();
        }
        if (this.mScrollState == 1) {
            return true;
        }
        return false;
    }

    public boolean isFakeDragging() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e770b399", new Object[]{this})).booleanValue();
        }
        return this.mFakeDragging;
    }

    public boolean isIdle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3f261a9", new Object[]{this})).booleanValue();
        }
        if (this.mScrollState == 0) {
            return true;
        }
        return false;
    }

    public void notifyBeginFakeDrag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9412930", new Object[]{this});
            return;
        }
        this.mAdapterState = 4;
        startDrag(true);
    }

    public void notifyDataSetChangeHappened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("561e9a47", new Object[]{this});
        } else {
            this.mDataSetChangeHappened = true;
        }
    }

    public void notifyEndFakeDrag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb90022", new Object[]{this});
        } else if (!isDragging() || this.mFakeDragging) {
            this.mFakeDragging = false;
            updateScrollEventValues();
            ScrollEventValues scrollEventValues = this.mScrollValues;
            if (scrollEventValues.mOffsetPx == 0) {
                int i = scrollEventValues.mPosition;
                if (i != this.mDragStartPosition) {
                    dispatchSelected(i);
                }
                dispatchStateChanged(0);
                resetState();
                return;
            }
            dispatchStateChanged(2);
        }
    }

    public void notifyProgrammaticScroll(int i, boolean z) {
        boolean z2 = true;
        int i2 = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5172a04", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        if (z) {
            i2 = 2;
        }
        this.mAdapterState = i2;
        this.mFakeDragging = false;
        if (this.mTarget == i) {
            z2 = false;
        }
        this.mTarget = i;
        dispatchStateChanged(2);
        if (z2) {
            dispatchSelected(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
        } else if (!(this.mAdapterState == 1 && this.mScrollState == 1) && i == 1) {
            startDrag(false);
        } else if (!isInAnyDraggingState() || i != 2) {
            if (isInAnyDraggingState() && i == 0) {
                updateScrollEventValues();
                if (!this.mScrollHappened) {
                    int i2 = this.mScrollValues.mPosition;
                    if (i2 != -1) {
                        dispatchScrolled(i2, 0.0f, 0);
                    }
                } else {
                    ScrollEventValues scrollEventValues = this.mScrollValues;
                    if (scrollEventValues.mOffsetPx == 0) {
                        int i3 = this.mDragStartPosition;
                        int i4 = scrollEventValues.mPosition;
                        if (i3 != i4) {
                            dispatchSelected(i4);
                        }
                    }
                }
                dispatchStateChanged(0);
                resetState();
            }
            if (this.mAdapterState == 2 && i == 0 && this.mDataSetChangeHappened) {
                updateScrollEventValues();
                ScrollEventValues scrollEventValues2 = this.mScrollValues;
                if (scrollEventValues2.mOffsetPx == 0) {
                    int i5 = this.mTarget;
                    int i6 = scrollEventValues2.mPosition;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        dispatchSelected(i6);
                    }
                    dispatchStateChanged(0);
                    resetState();
                }
            }
        } else if (this.mScrollHappened) {
            dispatchStateChanged(2);
            this.mDispatchSelected = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r5 == r4.mViewPager.isRtl()) goto L_0x0042;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.viewpager2.widget.ScrollEventAdapter.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0025
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r6)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r7)
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r4
            r7[r0] = r5
            r5 = 2
            r7[r5] = r3
            r5 = 3
            r7[r5] = r6
            java.lang.String r5 = "b9d7be25"
            r2.ipc$dispatch(r5, r7)
            return
        L_0x0025:
            r4.mScrollHappened = r0
            r4.updateScrollEventValues()
            boolean r5 = r4.mDispatchSelected
            r2 = -1
            if (r5 == 0) goto L_0x005a
            r4.mDispatchSelected = r1
            if (r7 > 0) goto L_0x0042
            if (r7 != 0) goto L_0x004c
            if (r6 >= 0) goto L_0x0039
            r5 = 1
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            androidx.viewpager2.widget.ViewPager2 r6 = r4.mViewPager
            boolean r6 = r6.isRtl()
            if (r5 != r6) goto L_0x004c
        L_0x0042:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r4.mScrollValues
            int r6 = r5.mOffsetPx
            if (r6 == 0) goto L_0x004c
            int r5 = r5.mPosition
            int r5 = r5 + r0
            goto L_0x0050
        L_0x004c:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r4.mScrollValues
            int r5 = r5.mPosition
        L_0x0050:
            r4.mTarget = r5
            int r6 = r4.mDragStartPosition
            if (r6 == r5) goto L_0x0068
            r4.dispatchSelected(r5)
            goto L_0x0068
        L_0x005a:
            int r5 = r4.mAdapterState
            if (r5 != 0) goto L_0x0068
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r4.mScrollValues
            int r5 = r5.mPosition
            if (r5 != r2) goto L_0x0065
            r5 = 0
        L_0x0065:
            r4.dispatchSelected(r5)
        L_0x0068:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r4.mScrollValues
            int r6 = r5.mPosition
            if (r6 != r2) goto L_0x006f
            r6 = 0
        L_0x006f:
            float r7 = r5.mOffset
            int r5 = r5.mOffsetPx
            r4.dispatchScrolled(r6, r7, r5)
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r4.mScrollValues
            int r6 = r5.mPosition
            int r7 = r4.mTarget
            if (r6 == r7) goto L_0x0080
            if (r7 != r2) goto L_0x008e
        L_0x0080:
            int r5 = r5.mOffsetPx
            if (r5 != 0) goto L_0x008e
            int r5 = r4.mScrollState
            if (r5 == r0) goto L_0x008e
            r4.dispatchStateChanged(r1)
            r4.resetState()
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ScrollEventAdapter.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public void setOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0a5f7e", new Object[]{this, onPageChangeCallback});
        } else {
            this.mCallback = onPageChangeCallback;
        }
    }
}
