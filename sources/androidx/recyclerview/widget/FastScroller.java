package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FastScroller extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANIMATION_STATE_FADING_IN = 1;
    private static final int ANIMATION_STATE_FADING_OUT = 3;
    private static final int ANIMATION_STATE_IN = 2;
    private static final int ANIMATION_STATE_OUT = 0;
    private static final int DRAG_NONE = 0;
    private static final int DRAG_X = 1;
    private static final int DRAG_Y = 2;
    private static final int HIDE_DELAY_AFTER_DRAGGING_MS = 1200;
    private static final int HIDE_DELAY_AFTER_VISIBLE_MS = 1500;
    private static final int HIDE_DURATION_MS = 500;
    private static final int SCROLLBAR_FULL_OPAQUE = 255;
    private static final int SHOW_DURATION_MS = 500;
    private static final int STATE_DRAGGING = 2;
    private static final int STATE_HIDDEN = 0;
    private static final int STATE_VISIBLE = 1;
    public float mHorizontalDragX;
    public int mHorizontalThumbCenterX;
    private final StateListDrawable mHorizontalThumbDrawable;
    private final int mHorizontalThumbHeight;
    public int mHorizontalThumbWidth;
    private final Drawable mHorizontalTrackDrawable;
    private final int mHorizontalTrackHeight;
    private final int mMargin;
    private RecyclerView mRecyclerView;
    private final int mScrollbarMinimumRange;
    public final ValueAnimator mShowHideAnimator;
    public float mVerticalDragY;
    public int mVerticalThumbCenterY;
    public final StateListDrawable mVerticalThumbDrawable;
    public int mVerticalThumbHeight;
    private final int mVerticalThumbWidth;
    public final Drawable mVerticalTrackDrawable;
    private final int mVerticalTrackWidth;
    private static final int[] PRESSED_STATE_SET = {16842919};
    private static final int[] EMPTY_STATE_SET = new int[0];
    private int mRecyclerViewWidth = 0;
    private int mRecyclerViewHeight = 0;
    private boolean mNeedVerticalScrollbar = false;
    private boolean mNeedHorizontalScrollbar = false;
    private int mState = 0;
    private int mDragState = 0;
    private final int[] mVerticalRange = new int[2];
    private final int[] mHorizontalRange = new int[2];
    public int mAnimationState = 0;
    private final Runnable mHideRunnable = new Runnable() { // from class: androidx.recyclerview.widget.FastScroller.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FastScroller.this.hide(500);
            }
        }
    };
    private final RecyclerView.OnScrollListener mOnScrollListener = new RecyclerView.OnScrollListener() { // from class: androidx.recyclerview.widget.FastScroller.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/recyclerview/widget/FastScroller$2");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            } else {
                FastScroller.this.updateScrollPosition(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class AnimatorListener extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean mCanceled = false;

        public AnimatorListener() {
        }

        public static /* synthetic */ Object ipc$super(AnimatorListener animatorListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/recyclerview/widget/FastScroller$AnimatorListener");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                this.mCanceled = true;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (this.mCanceled) {
                this.mCanceled = false;
            } else if (((Float) FastScroller.this.mShowHideAnimator.getAnimatedValue()).floatValue() == 0.0f) {
                FastScroller fastScroller = FastScroller.this;
                fastScroller.mAnimationState = 0;
                fastScroller.setState(0);
            } else {
                FastScroller fastScroller2 = FastScroller.this;
                fastScroller2.mAnimationState = 2;
                fastScroller2.requestRedraw();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class AnimatorUpdater implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnimatorUpdater() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            FastScroller.this.mVerticalThumbDrawable.setAlpha(floatValue);
            FastScroller.this.mVerticalTrackDrawable.setAlpha(floatValue);
            FastScroller.this.requestRedraw();
        }
    }

    public FastScroller(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.mShowHideAnimator = ofFloat;
        this.mVerticalThumbDrawable = stateListDrawable;
        this.mVerticalTrackDrawable = drawable;
        this.mHorizontalThumbDrawable = stateListDrawable2;
        this.mHorizontalTrackDrawable = drawable2;
        this.mVerticalThumbWidth = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.mVerticalTrackWidth = Math.max(i, drawable.getIntrinsicWidth());
        this.mHorizontalThumbHeight = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.mHorizontalTrackHeight = Math.max(i, drawable2.getIntrinsicWidth());
        this.mScrollbarMinimumRange = i2;
        this.mMargin = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new AnimatorListener());
        ofFloat.addUpdateListener(new AnimatorUpdater());
        attachToRecyclerView(recyclerView);
    }

    private void cancelHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23156963", new Object[]{this});
        } else {
            this.mRecyclerView.removeCallbacks(this.mHideRunnable);
        }
    }

    private void destroyCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b7d2c7b", new Object[]{this});
            return;
        }
        this.mRecyclerView.removeItemDecoration(this);
        this.mRecyclerView.removeOnItemTouchListener(this);
        this.mRecyclerView.removeOnScrollListener(this.mOnScrollListener);
        cancelHide();
    }

    private void drawHorizontalScrollbar(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de1c5500", new Object[]{this, canvas});
            return;
        }
        int i = this.mRecyclerViewHeight;
        int i2 = this.mHorizontalThumbHeight;
        int i3 = i - i2;
        int i4 = this.mHorizontalThumbCenterX;
        int i5 = this.mHorizontalThumbWidth;
        int i6 = i4 - (i5 / 2);
        this.mHorizontalThumbDrawable.setBounds(0, 0, i5, i2);
        this.mHorizontalTrackDrawable.setBounds(0, 0, this.mRecyclerViewWidth, this.mHorizontalTrackHeight);
        canvas.translate(0.0f, i3);
        this.mHorizontalTrackDrawable.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.mHorizontalThumbDrawable.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    private void drawVerticalScrollbar(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d252bd2", new Object[]{this, canvas});
            return;
        }
        int i = this.mRecyclerViewWidth;
        int i2 = this.mVerticalThumbWidth;
        int i3 = i - i2;
        int i4 = this.mVerticalThumbCenterY;
        int i5 = this.mVerticalThumbHeight;
        int i6 = i4 - (i5 / 2);
        this.mVerticalThumbDrawable.setBounds(0, 0, i2, i5);
        this.mVerticalTrackDrawable.setBounds(0, 0, this.mVerticalTrackWidth, this.mRecyclerViewHeight);
        if (isLayoutRTL()) {
            this.mVerticalTrackDrawable.draw(canvas);
            canvas.translate(this.mVerticalThumbWidth, i6);
            canvas.scale(-1.0f, 1.0f);
            this.mVerticalThumbDrawable.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.mVerticalThumbWidth, -i6);
            return;
        }
        canvas.translate(i3, 0.0f);
        this.mVerticalTrackDrawable.draw(canvas);
        canvas.translate(0.0f, i6);
        this.mVerticalThumbDrawable.draw(canvas);
        canvas.translate(-i3, -i6);
    }

    private int[] getHorizontalRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("ebf759da", new Object[]{this});
        }
        int[] iArr = this.mHorizontalRange;
        int i = this.mMargin;
        iArr[0] = i;
        iArr[1] = this.mRecyclerViewWidth - i;
        return iArr;
    }

    private int[] getVerticalRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("4f3a5c2c", new Object[]{this});
        }
        int[] iArr = this.mVerticalRange;
        int i = this.mMargin;
        iArr[0] = i;
        iArr[1] = this.mRecyclerViewHeight - i;
        return iArr;
    }

    private void horizontalScrollTo(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c2a992d", new Object[]{this, new Float(f)});
            return;
        }
        int[] horizontalRange = getHorizontalRange();
        float max = Math.max(horizontalRange[0], Math.min(horizontalRange[1], f));
        if (Math.abs(this.mHorizontalThumbCenterX - max) >= 2.0f) {
            int scrollTo = scrollTo(this.mHorizontalDragX, max, horizontalRange, this.mRecyclerView.computeHorizontalScrollRange(), this.mRecyclerView.computeHorizontalScrollOffset(), this.mRecyclerViewWidth);
            if (scrollTo != 0) {
                this.mRecyclerView.scrollBy(scrollTo, 0);
            }
            this.mHorizontalDragX = max;
        }
    }

    public static /* synthetic */ Object ipc$super(FastScroller fastScroller, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/recyclerview/widget/FastScroller");
    }

    private boolean isLayoutRTL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b16fe661", new Object[]{this})).booleanValue();
        }
        if (ViewCompat.getLayoutDirection(this.mRecyclerView) == 1) {
            return true;
        }
        return false;
    }

    private void resetHideDelay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4145c1ca", new Object[]{this, new Integer(i)});
            return;
        }
        cancelHide();
        this.mRecyclerView.postDelayed(this.mHideRunnable, i);
    }

    private int scrollTo(float f, float f2, int[] iArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a695f39", new Object[]{this, new Float(f), new Float(f2), iArr, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    private void setupCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf94fed8", new Object[]{this});
            return;
        }
        this.mRecyclerView.addItemDecoration(this);
        this.mRecyclerView.addOnItemTouchListener(this);
        this.mRecyclerView.addOnScrollListener(this.mOnScrollListener);
    }

    private void verticalScrollTo(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("836a331b", new Object[]{this, new Float(f)});
            return;
        }
        int[] verticalRange = getVerticalRange();
        float max = Math.max(verticalRange[0], Math.min(verticalRange[1], f));
        if (Math.abs(this.mVerticalThumbCenterY - max) >= 2.0f) {
            int scrollTo = scrollTo(this.mVerticalDragY, max, verticalRange, this.mRecyclerView.computeVerticalScrollRange(), this.mRecyclerView.computeVerticalScrollOffset(), this.mRecyclerViewHeight);
            if (scrollTo != 0) {
                this.mRecyclerView.scrollBy(0, scrollTo);
            }
            this.mVerticalDragY = max;
        }
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1828b9cc", new Object[]{this, recyclerView});
            return;
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                destroyCallbacks();
            }
            this.mRecyclerView = recyclerView;
            if (recyclerView != null) {
                setupCallbacks();
            }
        }
    }

    public Drawable getHorizontalThumbDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("1be4bff9", new Object[]{this});
        }
        return this.mHorizontalThumbDrawable;
    }

    public Drawable getHorizontalTrackDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("ead29be4", new Object[]{this});
        }
        return this.mHorizontalTrackDrawable;
    }

    public Drawable getVerticalThumbDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("ad3abbcb", new Object[]{this});
        }
        return this.mVerticalThumbDrawable;
    }

    public Drawable getVerticalTrackDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("7c2897b6", new Object[]{this});
        }
        return this.mVerticalTrackDrawable;
    }

    public void hide(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300c9b5a", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.mAnimationState;
        if (i2 == 1) {
            this.mShowHideAnimator.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.mAnimationState = 3;
        ValueAnimator valueAnimator = this.mShowHideAnimator;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.mShowHideAnimator.setDuration(i);
        this.mShowHideAnimator.start();
    }

    public boolean isDragging() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98b514a4", new Object[]{this})).booleanValue();
        }
        if (this.mState == 2) {
            return true;
        }
        return false;
    }

    public boolean isPointInsideHorizontalThumb(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa3ee45b", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        if (f2 >= this.mRecyclerViewHeight - this.mHorizontalThumbHeight) {
            int i = this.mHorizontalThumbCenterX;
            int i2 = this.mHorizontalThumbWidth;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPointInsideVerticalThumb(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a80dc949", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        if (!isLayoutRTL() ? f >= this.mRecyclerViewWidth - this.mVerticalThumbWidth : f <= this.mVerticalThumbWidth) {
            int i = this.mVerticalThumbCenterY;
            int i2 = this.mVerticalThumbHeight;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        if (this.mState == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1107a21a", new Object[]{this, canvas, recyclerView, state});
        } else if (this.mRecyclerViewWidth != this.mRecyclerView.getWidth() || this.mRecyclerViewHeight != this.mRecyclerView.getHeight()) {
            this.mRecyclerViewWidth = this.mRecyclerView.getWidth();
            this.mRecyclerViewHeight = this.mRecyclerView.getHeight();
            setState(0);
        } else if (this.mAnimationState != 0) {
            if (this.mNeedVerticalScrollbar) {
                drawVerticalScrollbar(canvas);
            }
            if (this.mNeedHorizontalScrollbar) {
                drawHorizontalScrollbar(canvas);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35491ccb", new Object[]{this, recyclerView, motionEvent})).booleanValue();
        }
        int i = this.mState;
        if (i == 1) {
            boolean isPointInsideVerticalThumb = isPointInsideVerticalThumb(motionEvent.getX(), motionEvent.getY());
            boolean isPointInsideHorizontalThumb = isPointInsideHorizontalThumb(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (isPointInsideVerticalThumb || isPointInsideHorizontalThumb)) {
                if (isPointInsideHorizontalThumb) {
                    this.mDragState = 1;
                    this.mHorizontalDragX = (int) motionEvent.getX();
                } else if (isPointInsideVerticalThumb) {
                    this.mDragState = 2;
                    this.mVerticalDragY = (int) motionEvent.getY();
                }
                setState(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1dcb2bb", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4838b0b", new Object[]{this, recyclerView, motionEvent});
        } else if (this.mState != 0) {
            if (motionEvent.getAction() == 0) {
                boolean isPointInsideVerticalThumb = isPointInsideVerticalThumb(motionEvent.getX(), motionEvent.getY());
                boolean isPointInsideHorizontalThumb = isPointInsideHorizontalThumb(motionEvent.getX(), motionEvent.getY());
                if (isPointInsideVerticalThumb || isPointInsideHorizontalThumb) {
                    if (isPointInsideHorizontalThumb) {
                        this.mDragState = 1;
                        this.mHorizontalDragX = (int) motionEvent.getX();
                    } else if (isPointInsideVerticalThumb) {
                        this.mDragState = 2;
                        this.mVerticalDragY = (int) motionEvent.getY();
                    }
                    setState(2);
                }
            } else if (motionEvent.getAction() == 1 && this.mState == 2) {
                this.mVerticalDragY = 0.0f;
                this.mHorizontalDragX = 0.0f;
                setState(1);
                this.mDragState = 0;
            } else if (motionEvent.getAction() == 2 && this.mState == 2) {
                show();
                if (this.mDragState == 1) {
                    horizontalScrollTo(motionEvent.getX());
                }
                if (this.mDragState == 2) {
                    verticalScrollTo(motionEvent.getY());
                }
            }
        }
    }

    public void requestRedraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b2c2ed", new Object[]{this});
        } else {
            this.mRecyclerView.invalidate();
        }
    }

    public void setState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfef36d", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == 2 && this.mState != 2) {
            this.mVerticalThumbDrawable.setState(PRESSED_STATE_SET);
            cancelHide();
        }
        if (i == 0) {
            requestRedraw();
        } else {
            show();
        }
        if (this.mState == 2 && i != 2) {
            this.mVerticalThumbDrawable.setState(EMPTY_STATE_SET);
            resetHideDelay(1200);
        } else if (i == 1) {
            resetHideDelay(1500);
        }
        this.mState = i;
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        int i = this.mAnimationState;
        if (i != 0) {
            if (i == 3) {
                this.mShowHideAnimator.cancel();
            } else {
                return;
            }
        }
        this.mAnimationState = 1;
        ValueAnimator valueAnimator = this.mShowHideAnimator;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.mShowHideAnimator.setDuration(500L);
        this.mShowHideAnimator.setStartDelay(0L);
        this.mShowHideAnimator.start();
    }

    public void updateScrollPosition(int i, int i2) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d58ac26", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int computeVerticalScrollRange = this.mRecyclerView.computeVerticalScrollRange();
        int i3 = this.mRecyclerViewHeight;
        if (computeVerticalScrollRange - i3 <= 0 || i3 < this.mScrollbarMinimumRange) {
            z = false;
        } else {
            z = true;
        }
        this.mNeedVerticalScrollbar = z;
        int computeHorizontalScrollRange = this.mRecyclerView.computeHorizontalScrollRange();
        int i4 = this.mRecyclerViewWidth;
        if (computeHorizontalScrollRange - i4 <= 0 || i4 < this.mScrollbarMinimumRange) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.mNeedHorizontalScrollbar = z2;
        boolean z3 = this.mNeedVerticalScrollbar;
        if (z3 || z2) {
            if (z3) {
                float f = i3;
                this.mVerticalThumbCenterY = (int) ((f * (i2 + (f / 2.0f))) / computeVerticalScrollRange);
                this.mVerticalThumbHeight = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.mNeedHorizontalScrollbar) {
                float f2 = i4;
                this.mHorizontalThumbCenterX = (int) ((f2 * (i + (f2 / 2.0f))) / computeHorizontalScrollRange);
                this.mHorizontalThumbWidth = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.mState;
            if (i5 == 0 || i5 == 1) {
                setState(1);
            }
        } else if (this.mState != 0) {
            setState(0);
        }
    }
}
