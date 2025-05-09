package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ViewDragHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BASE_SETTLE_DURATION = 256;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    private static final int EDGE_SIZE = 20;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "ViewDragHelper";
    private static final Interpolator sInterpolator = new Interpolator() { // from class: androidx.customview.widget.ViewDragHelper.1
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
    private final Callback mCallback;
    private View mCapturedView;
    private final int mDefaultEdgeSize;
    private int mDragState;
    private int[] mEdgeDragsInProgress;
    private int[] mEdgeDragsLocked;
    private int mEdgeSize;
    private int[] mInitialEdgesTouched;
    private float[] mInitialMotionX;
    private float[] mInitialMotionY;
    private float[] mLastMotionX;
    private float[] mLastMotionY;
    private float mMaxVelocity;
    private float mMinVelocity;
    private final ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private OverScroller mScroller;
    private int mTouchSlop;
    private int mTrackingEdges;
    private VelocityTracker mVelocityTracker;
    private int mActivePointerId = -1;
    private final Runnable mSetIdleRunnable = new Runnable() { // from class: androidx.customview.widget.ViewDragHelper.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ViewDragHelper.this.setDragState(0);
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public int clampViewPositionVertical(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53c1297f", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
            }
            return 0;
        }

        public int getOrderedChildIndex(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("955ed6c2", new Object[]{this, new Integer(i)})).intValue();
            }
            return i;
        }

        public int getViewHorizontalDragRange(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c2378c14", new Object[]{this, view})).intValue();
            }
            return 0;
        }

        public int getViewVerticalDragRange(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("896fc226", new Object[]{this, view})).intValue();
            }
            return 0;
        }

        public void onEdgeDragStarted(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ceb6938", new Object[]{this, new Integer(i), new Integer(i2)});
            }
        }

        public void onEdgeTouched(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("127471e9", new Object[]{this, new Integer(i), new Integer(i2)});
            }
        }

        public void onViewCaptured(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faa1e09a", new Object[]{this, view, new Integer(i)});
            }
        }

        public void onViewDragStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i)});
            }
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bc6f844", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        public void onViewReleased(View view, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32d03eca", new Object[]{this, view, new Float(f), new Float(f2)});
            }
        }

        public abstract boolean tryCaptureView(View view, int i);

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dcd272d1", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
            }
            return 0;
        }

        public boolean onEdgeLock(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d450f839", new Object[]{this, new Integer(i)})).booleanValue();
            }
            return false;
        }
    }

    private ViewDragHelper(Context context, ViewGroup viewGroup, Callback callback) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (callback != null) {
            this.mParentView = viewGroup;
            this.mCallback = callback;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.mDefaultEdgeSize = i;
            this.mEdgeSize = i;
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
            this.mMaxVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            this.mMinVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
            this.mScroller = new OverScroller(context, sInterpolator);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private boolean checkTouchSlop(View view, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f7bd99e", new Object[]{this, view, new Float(f), new Float(f2)})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        boolean z = this.mCallback.getViewHorizontalDragRange(view) > 0;
        boolean z2 = this.mCallback.getViewVerticalDragRange(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.mTouchSlop) : z2 && Math.abs(f2) > ((float) this.mTouchSlop);
        }
        int i = this.mTouchSlop;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    private int clampMag(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1127d717", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    private void clearMotionHistory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdd066b8", new Object[]{this});
            return;
        }
        float[] fArr = this.mInitialMotionX;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.mInitialMotionY, 0.0f);
            Arrays.fill(this.mLastMotionX, 0.0f);
            Arrays.fill(this.mLastMotionY, 0.0f);
            Arrays.fill(this.mInitialEdgesTouched, 0);
            Arrays.fill(this.mEdgeDragsInProgress, 0);
            Arrays.fill(this.mEdgeDragsLocked, 0);
            this.mPointersDown = 0;
        }
    }

    private int computeAxisDuration(int i, int i2, int i3) {
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdbb4503", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i == 0) {
            return 0;
        }
        int width = this.mParentView.getWidth();
        float f = width / 2;
        float distanceInfluenceForSnapDuration = f + (distanceInfluenceForSnapDuration(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
        } else {
            i4 = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    private int computeSettleDuration(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7bfae48", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).intValue();
        }
        int clampMag = clampMag(i3, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int clampMag2 = clampMag(i4, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(clampMag);
        int abs4 = Math.abs(clampMag2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (clampMag != 0) {
            f = abs3;
            f2 = i5;
        } else {
            f = abs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (clampMag2 != 0) {
            f3 = abs4;
            f4 = i5;
        } else {
            f3 = abs2;
            f4 = i6;
        }
        return (int) ((computeAxisDuration(i, clampMag, this.mCallback.getViewHorizontalDragRange(view)) * f5) + (computeAxisDuration(i2, clampMag2, this.mCallback.getViewVerticalDragRange(view)) * (f3 / f4)));
    }

    public static ViewDragHelper create(ViewGroup viewGroup, Callback callback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewDragHelper) ipChange.ipc$dispatch("82570319", new Object[]{viewGroup, callback}) : new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    private float distanceInfluenceForSnapDuration(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96b34422", new Object[]{this, new Float(f)})).floatValue();
        }
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private void dragTo(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243c8d96", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        if (i3 != 0) {
            i = this.mCallback.clampViewPositionHorizontal(this.mCapturedView, i, i3);
            ViewCompat.offsetLeftAndRight(this.mCapturedView, i - left);
        }
        if (i4 != 0) {
            i2 = this.mCallback.clampViewPositionVertical(this.mCapturedView, i2, i4);
            ViewCompat.offsetTopAndBottom(this.mCapturedView, i2 - top);
        }
        if (i3 != 0 || i4 != 0) {
            this.mCallback.onViewPositionChanged(this.mCapturedView, i, i2, i - left, i2 - top);
        }
    }

    private void ensureMotionHistorySizeForId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64ef179", new Object[]{this, new Integer(i)});
            return;
        }
        float[] fArr = this.mInitialMotionX;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.mInitialMotionY;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.mLastMotionX;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.mLastMotionY;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.mInitialEdgesTouched;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.mEdgeDragsInProgress;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.mEdgeDragsLocked;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.mInitialMotionX = fArr2;
            this.mInitialMotionY = fArr3;
            this.mLastMotionX = fArr4;
            this.mLastMotionY = fArr5;
            this.mInitialEdgesTouched = iArr;
            this.mEdgeDragsInProgress = iArr2;
            this.mEdgeDragsLocked = iArr3;
        }
    }

    private boolean forceSettleCapturedViewAt(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92b9cb7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).booleanValue();
        }
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.mScroller.abortAnimation();
            setDragState(0);
            return false;
        }
        this.mScroller.startScroll(left, top, i5, i6, computeSettleDuration(this.mCapturedView, i5, i6, i3, i4));
        setDragState(2);
        return true;
    }

    private int getEdgesTouched(int i, int i2) {
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f812bf8", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i >= this.mParentView.getLeft() + this.mEdgeSize) {
            i3 = 0;
        }
        if (i2 < this.mParentView.getTop() + this.mEdgeSize) {
            i3 |= 4;
        }
        if (i > this.mParentView.getRight() - this.mEdgeSize) {
            i3 |= 2;
        }
        if (i2 > this.mParentView.getBottom() - this.mEdgeSize) {
            return i3 | 8;
        }
        return i3;
    }

    private boolean isValidPointerForActionMove(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ecd18db", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (isPointerDown(i)) {
            return true;
        }
        Log.e(TAG, "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void releaseViewForPointerUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e99af62", new Object[]{this});
            return;
        }
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxVelocity);
        dispatchViewReleased(clampMag(this.mVelocityTracker.getXVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity), clampMag(this.mVelocityTracker.getYVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity));
    }

    private void reportNewEdgeDrags(float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fca50c6", new Object[]{this, new Float(f), new Float(f2), new Integer(i)});
            return;
        }
        boolean checkNewEdgeDrag = checkNewEdgeDrag(f, f2, i, 1);
        if (checkNewEdgeDrag(f2, f, i, 4)) {
            checkNewEdgeDrag |= true;
        }
        if (checkNewEdgeDrag(f, f2, i, 2)) {
            boolean z = checkNewEdgeDrag ? 1 : 0;
            char c = checkNewEdgeDrag ? 1 : 0;
            checkNewEdgeDrag = z | true;
        }
        if (checkNewEdgeDrag(f2, f, i, 8)) {
            boolean z2 = checkNewEdgeDrag ? 1 : 0;
            char c2 = checkNewEdgeDrag ? 1 : 0;
            checkNewEdgeDrag = z2 | true;
        }
        if (checkNewEdgeDrag) {
            int[] iArr = this.mEdgeDragsInProgress;
            iArr[i] = iArr[i] | (checkNewEdgeDrag ? 1 : 0);
            Callback callback = this.mCallback;
            int i2 = checkNewEdgeDrag ? 1 : 0;
            int i3 = checkNewEdgeDrag ? 1 : 0;
            int i4 = checkNewEdgeDrag ? 1 : 0;
            callback.onEdgeDragStarted(i2, i);
        }
    }

    private void saveInitialMotion(float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326738df", new Object[]{this, new Float(f), new Float(f2), new Integer(i)});
            return;
        }
        ensureMotionHistorySizeForId(i);
        float[] fArr = this.mInitialMotionX;
        this.mLastMotionX[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.mInitialMotionY;
        this.mLastMotionY[i] = f2;
        fArr2[i] = f2;
        this.mInitialEdgesTouched[i] = getEdgesTouched((int) f, (int) f2);
        this.mPointersDown |= 1 << i;
    }

    private void saveLastMotion(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5314c965", new Object[]{this, motionEvent});
            return;
        }
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (isValidPointerForActionMove(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.mLastMotionX[pointerId] = x;
                this.mLastMotionY[pointerId] = y;
            }
        }
    }

    public void abort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf58fb7", new Object[]{this});
            return;
        }
        cancel();
        if (this.mDragState == 2) {
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            this.mScroller.abortAnimation();
            int currX2 = this.mScroller.getCurrX();
            int currY2 = this.mScroller.getCurrY();
            this.mCallback.onViewPositionChanged(this.mCapturedView, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        setDragState(0);
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b0954ca", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).booleanValue();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount() - 1;
            while (childCount >= 0) {
                View childAt = viewGroup.getChildAt(childCount);
                int i7 = i3 + scrollX;
                if (i7 < childAt.getLeft() || i7 >= childAt.getRight() || (i6 = i4 + scrollY) < childAt.getTop() || i6 >= childAt.getBottom()) {
                    i5 = childCount;
                } else {
                    i5 = childCount;
                    if (canScroll(childAt, true, i, i2, i7 - childAt.getLeft(), i6 - childAt.getTop())) {
                        return true;
                    }
                }
                childCount = i5 - 1;
            }
        }
        if (!z || (!view.canScrollHorizontally(-i) && !view.canScrollVertically(-i2))) {
            return false;
        }
        return true;
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.mActivePointerId = -1;
        clearMotionHistory();
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    public void captureChildView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e446bb3", new Object[]{this, view, new Integer(i)});
        } else if (view.getParent() == this.mParentView) {
            this.mCapturedView = view;
            this.mActivePointerId = i;
            this.mCallback.onViewCaptured(view, i);
            setDragState(1);
        } else {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.mParentView + f7l.BRACKET_END_STR);
        }
    }

    public boolean continueSettling(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc50f82", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.mDragState == 2) {
            boolean computeScrollOffset = this.mScroller.computeScrollOffset();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            int left = currX - this.mCapturedView.getLeft();
            int top = currY - this.mCapturedView.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.mCapturedView, left);
            }
            if (top != 0) {
                ViewCompat.offsetTopAndBottom(this.mCapturedView, top);
            }
            if (!(left == 0 && top == 0)) {
                this.mCallback.onViewPositionChanged(this.mCapturedView, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.mScroller.getFinalX() && currY == this.mScroller.getFinalY()) {
                this.mScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.mParentView.post(this.mSetIdleRunnable);
                } else {
                    setDragState(0);
                }
            }
        }
        if (this.mDragState == 2) {
            return true;
        }
        return false;
    }

    public void flingCapturedView(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29706be6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.mReleaseInProgress) {
            this.mScroller.fling(this.mCapturedView.getLeft(), this.mCapturedView.getTop(), (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId), i, i3, i2, i4);
            setDragState(2);
        } else {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
    }

    public int getActivePointerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("775fc16", new Object[]{this})).intValue();
        }
        return this.mActivePointerId;
    }

    public View getCapturedView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f405e462", new Object[]{this});
        }
        return this.mCapturedView;
    }

    public int getDefaultEdgeSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("817eee83", new Object[]{this})).intValue();
        }
        return this.mDefaultEdgeSize;
    }

    public int getEdgeSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("922ed34e", new Object[]{this})).intValue();
        }
        return this.mEdgeSize;
    }

    public float getMinVelocity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ed5ec10", new Object[]{this})).floatValue();
        }
        return this.mMinVelocity;
    }

    public int getTouchSlop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa4b321d", new Object[]{this})).intValue();
        }
        return this.mTouchSlop;
    }

    public int getViewDragState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef27d65c", new Object[]{this})).intValue();
        }
        return this.mDragState;
    }

    public boolean isCapturedViewUnder(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e9cddd6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return isViewUnder(this.mCapturedView, i, i2);
    }

    public boolean isEdgeTouched(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d2395a9", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int length = this.mInitialEdgesTouched.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (isEdgeTouched(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPointerDown(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b5438b", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (((1 << i) & this.mPointersDown) != 0) {
            return true;
        }
        return false;
    }

    public boolean isViewUnder(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e91c986", new Object[]{this, view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    public void processTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63068cc6", new Object[]{this, motionEvent});
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View findTopChildUnder = findTopChildUnder((int) x, (int) y);
            saveInitialMotion(x, y, pointerId);
            tryCaptureViewForDrag(findTopChildUnder, pointerId);
            int i3 = this.mInitialEdgesTouched[pointerId];
            int i4 = this.mTrackingEdges;
            if ((i3 & i4) != 0) {
                this.mCallback.onEdgeTouched(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.mDragState == 1) {
                releaseViewForPointerUp();
            }
            cancel();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.mDragState == 1) {
                    dispatchViewReleased(0.0f, 0.0f);
                }
                cancel();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                saveInitialMotion(x2, y2, pointerId2);
                if (this.mDragState == 0) {
                    tryCaptureViewForDrag(findTopChildUnder((int) x2, (int) y2), pointerId2);
                    int i5 = this.mInitialEdgesTouched[pointerId2];
                    int i6 = this.mTrackingEdges;
                    if ((i5 & i6) != 0) {
                        this.mCallback.onEdgeTouched(i5 & i6, pointerId2);
                    }
                } else if (isCapturedViewUnder((int) x2, (int) y2)) {
                    tryCaptureViewForDrag(this.mCapturedView, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.mDragState == 1 && pointerId3 == this.mActivePointerId) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.mActivePointerId) {
                            View findTopChildUnder2 = findTopChildUnder((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.mCapturedView;
                            if (findTopChildUnder2 == view && tryCaptureViewForDrag(view, pointerId4)) {
                                i = this.mActivePointerId;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        releaseViewForPointerUp();
                    }
                }
                clearMotionHistory(pointerId3);
            }
        } else if (this.mDragState != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (isValidPointerForActionMove(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.mInitialMotionX[pointerId5];
                    float f2 = y3 - this.mInitialMotionY[pointerId5];
                    reportNewEdgeDrags(f, f2, pointerId5);
                    if (this.mDragState != 1) {
                        View findTopChildUnder3 = findTopChildUnder((int) x3, (int) y3);
                        if (checkTouchSlop(findTopChildUnder3, f, f2) && tryCaptureViewForDrag(findTopChildUnder3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            saveLastMotion(motionEvent);
        } else if (isValidPointerForActionMove(this.mActivePointerId)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.mLastMotionX;
            int i7 = this.mActivePointerId;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.mLastMotionY[i7]);
            dragTo(this.mCapturedView.getLeft() + i8, this.mCapturedView.getTop() + i9, i8, i9);
            saveLastMotion(motionEvent);
        }
    }

    public void setDragState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60493ac1", new Object[]{this, new Integer(i)});
            return;
        }
        this.mParentView.removeCallbacks(this.mSetIdleRunnable);
        if (this.mDragState != i) {
            this.mDragState = i;
            this.mCallback.onViewDragStateChanged(i);
            if (this.mDragState == 0) {
                this.mCapturedView = null;
            }
        }
    }

    public void setEdgeSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4682717c", new Object[]{this, new Integer(i)});
        } else {
            this.mEdgeSize = i;
        }
    }

    public void setEdgeTrackingEnabled(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("892aa8f1", new Object[]{this, new Integer(i)});
        } else {
            this.mTrackingEdges = i;
        }
    }

    public void setMinVelocity(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfe494ac", new Object[]{this, new Float(f)});
        } else {
            this.mMinVelocity = f;
        }
    }

    public boolean settleCapturedViewAt(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dfd2dcc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.mReleaseInProgress) {
            return forceSettleCapturedViewAt(i, i2, (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f7, code lost:
        if (r12 != r11) goto L_0x0100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean shouldInterceptTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.shouldInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    private float clampMag(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10fc2831", new Object[]{this, new Float(f), new Float(f2), new Float(f3)})).floatValue();
        }
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    public static ViewDragHelper create(ViewGroup viewGroup, float f, Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewDragHelper) ipChange.ipc$dispatch("d871ac95", new Object[]{viewGroup, new Float(f), callback});
        }
        ViewDragHelper create = create(viewGroup, callback);
        create.mTouchSlop = (int) (create.mTouchSlop * (1.0f / f));
        return create;
    }

    public View findTopChildUnder(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e92ec8c1", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        for (int childCount = this.mParentView.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.mParentView.getChildAt(this.mCallback.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean smoothSlideViewTo(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e49516c", new Object[]{this, view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        this.mCapturedView = view;
        this.mActivePointerId = -1;
        boolean forceSettleCapturedViewAt = forceSettleCapturedViewAt(i, i2, 0, 0);
        if (!forceSettleCapturedViewAt && this.mDragState == 0 && this.mCapturedView != null) {
            this.mCapturedView = null;
        }
        return forceSettleCapturedViewAt;
    }

    private boolean checkNewEdgeDrag(float f, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebf42c94", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2)})).booleanValue();
        }
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (!((this.mInitialEdgesTouched[i] & i2) != i2 || (this.mTrackingEdges & i2) == 0 || (this.mEdgeDragsLocked[i] & i2) == i2 || (this.mEdgeDragsInProgress[i] & i2) == i2)) {
            int i3 = this.mTouchSlop;
            if (abs > i3 || abs2 > i3) {
                if (abs >= abs2 * 0.5f || !this.mCallback.onEdgeLock(i2)) {
                    return (this.mEdgeDragsInProgress[i] & i2) == 0 && abs > ((float) this.mTouchSlop);
                }
                int[] iArr = this.mEdgeDragsLocked;
                iArr[i] = iArr[i] | i2;
                return false;
            }
        }
        return false;
    }

    private void dispatchViewReleased(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd2f4663", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.mReleaseInProgress = true;
        this.mCallback.onViewReleased(this.mCapturedView, f, f2);
        this.mReleaseInProgress = false;
        if (this.mDragState == 1) {
            setDragState(0);
        }
    }

    public boolean isEdgeTouched(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("174f9202", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : isPointerDown(i2) && (i & this.mInitialEdgesTouched[i2]) != 0;
    }

    public boolean tryCaptureViewForDrag(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0261a9", new Object[]{this, view, new Integer(i)})).booleanValue();
        }
        if (view == this.mCapturedView && this.mActivePointerId == i) {
            return true;
        }
        if (view == null || !this.mCallback.tryCaptureView(view, i)) {
            return false;
        }
        this.mActivePointerId = i;
        captureChildView(view, i);
        return true;
    }

    public boolean checkTouchSlop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7614fc4f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int length = this.mInitialMotionX.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (checkTouchSlop(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkTouchSlop(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c8b001c", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!isPointerDown(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.mLastMotionX[i2] - this.mInitialMotionX[i2];
        float f2 = this.mLastMotionY[i2] - this.mInitialMotionY[i2];
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.mTouchSlop) : z2 && Math.abs(f2) > ((float) this.mTouchSlop);
        }
        int i3 = this.mTouchSlop;
        return (f * f) + (f2 * f2) > ((float) (i3 * i3));
    }

    private void clearMotionHistory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3ce34b", new Object[]{this, new Integer(i)});
        } else if (this.mInitialMotionX != null && isPointerDown(i)) {
            this.mInitialMotionX[i] = 0.0f;
            this.mInitialMotionY[i] = 0.0f;
            this.mLastMotionX[i] = 0.0f;
            this.mLastMotionY[i] = 0.0f;
            this.mInitialEdgesTouched[i] = 0;
            this.mEdgeDragsInProgress[i] = 0;
            this.mEdgeDragsLocked[i] = 0;
            this.mPointersDown = (~(1 << i)) & this.mPointersDown;
        }
    }
}
