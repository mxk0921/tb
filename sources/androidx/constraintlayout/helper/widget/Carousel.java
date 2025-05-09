package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Carousel extends MotionHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final String TAG = "Carousel";
    public static final int TOUCH_UP_CARRY_ON = 2;
    public static final int TOUCH_UP_IMMEDIATE_STOP = 1;
    private MotionLayout mMotionLayout;
    private Adapter mAdapter = null;
    private final ArrayList<View> mList = new ArrayList<>();
    private int mPreviousIndex = 0;
    private int mIndex = 0;
    private int mFirstViewReference = -1;
    private boolean mInfiniteCarousel = false;
    private int mBackwardTransition = -1;
    private int mForwardTransition = -1;
    private int mPreviousState = -1;
    private int mNextState = -1;
    private float mDampening = 0.9f;
    private int mStartIndex = 0;
    private int mEmptyViewBehavior = 4;
    private int mTouchUpMode = 1;
    private float mVelocityThreshold = 2.0f;
    private int mTargetIndex = -1;
    private int mAnimateTargetDelay = 200;
    public int mLastStartId = -1;
    public Runnable mUpdateRunnable = new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Carousel.access$000(Carousel.this).setProgress(0.0f);
            Carousel.access$100(Carousel.this);
            Carousel.access$300(Carousel.this).onNewItem(Carousel.access$200(Carousel.this));
            float velocity = Carousel.access$000(Carousel.this).getVelocity();
            if (Carousel.access$400(Carousel.this) == 2 && velocity > Carousel.access$500(Carousel.this) && Carousel.access$200(Carousel.this) < Carousel.access$300(Carousel.this).count() - 1) {
                final float access$600 = velocity * Carousel.access$600(Carousel.this);
                if (Carousel.access$200(Carousel.this) == 0 && Carousel.access$700(Carousel.this) > Carousel.access$200(Carousel.this)) {
                    return;
                }
                if (Carousel.access$200(Carousel.this) != Carousel.access$300(Carousel.this).count() - 1 || Carousel.access$700(Carousel.this) >= Carousel.access$200(Carousel.this)) {
                    Carousel.access$000(Carousel.this).post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                Carousel.access$000(Carousel.this).touchAnimateTo(5, 1.0f, access$600);
                            }
                        }
                    });
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface Adapter {
        int count();

        void onNewItem(int i);

        void populate(View view, int i);
    }

    public Carousel(Context context) {
        super(context);
    }

    public static /* synthetic */ MotionLayout access$000(Carousel carousel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionLayout) ipChange.ipc$dispatch("d4370a77", new Object[]{carousel});
        }
        return carousel.mMotionLayout;
    }

    public static /* synthetic */ void access$100(Carousel carousel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5863fbfb", new Object[]{carousel});
        } else {
            carousel.updateItems();
        }
    }

    public static /* synthetic */ int access$200(Carousel carousel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7df804ef", new Object[]{carousel})).intValue();
        }
        return carousel.mIndex;
    }

    public static /* synthetic */ Adapter access$300(Carousel carousel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Adapter) ipChange.ipc$dispatch("a97595d1", new Object[]{carousel});
        }
        return carousel.mAdapter;
    }

    public static /* synthetic */ int access$400(Carousel carousel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c92016f1", new Object[]{carousel})).intValue();
        }
        return carousel.mTouchUpMode;
    }

    public static /* synthetic */ float access$500(Carousel carousel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eeb41fef", new Object[]{carousel})).floatValue();
        }
        return carousel.mVelocityThreshold;
    }

    public static /* synthetic */ float access$600(Carousel carousel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("144828f0", new Object[]{carousel})).floatValue();
        }
        return carousel.mDampening;
    }

    public static /* synthetic */ int access$700(Carousel carousel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39dc31f4", new Object[]{carousel})).intValue();
        }
        return carousel.mPreviousIndex;
    }

    private void enableAllTransitions(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d3f96d", new Object[]{this, new Boolean(z)});
            return;
        }
        Iterator<MotionScene.Transition> it = this.mMotionLayout.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            it.next().setEnabled(z);
        }
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
        } else if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Carousel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.Carousel_carousel_firstView) {
                    this.mFirstViewReference = obtainStyledAttributes.getResourceId(index, this.mFirstViewReference);
                } else if (index == R.styleable.Carousel_carousel_backwardTransition) {
                    this.mBackwardTransition = obtainStyledAttributes.getResourceId(index, this.mBackwardTransition);
                } else if (index == R.styleable.Carousel_carousel_forwardTransition) {
                    this.mForwardTransition = obtainStyledAttributes.getResourceId(index, this.mForwardTransition);
                } else if (index == R.styleable.Carousel_carousel_emptyViewsBehavior) {
                    this.mEmptyViewBehavior = obtainStyledAttributes.getInt(index, this.mEmptyViewBehavior);
                } else if (index == R.styleable.Carousel_carousel_previousState) {
                    this.mPreviousState = obtainStyledAttributes.getResourceId(index, this.mPreviousState);
                } else if (index == R.styleable.Carousel_carousel_nextState) {
                    this.mNextState = obtainStyledAttributes.getResourceId(index, this.mNextState);
                } else if (index == R.styleable.Carousel_carousel_touchUp_dampeningFactor) {
                    this.mDampening = obtainStyledAttributes.getFloat(index, this.mDampening);
                } else if (index == R.styleable.Carousel_carousel_touchUpMode) {
                    this.mTouchUpMode = obtainStyledAttributes.getInt(index, this.mTouchUpMode);
                } else if (index == R.styleable.Carousel_carousel_touchUp_velocityThreshold) {
                    this.mVelocityThreshold = obtainStyledAttributes.getFloat(index, this.mVelocityThreshold);
                } else if (index == R.styleable.Carousel_carousel_infinite) {
                    this.mInfiniteCarousel = obtainStyledAttributes.getBoolean(index, this.mInfiniteCarousel);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ Object ipc$super(Carousel carousel, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/constraintlayout/helper/widget/Carousel");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateItems$0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0d71ead", new Object[]{this});
            return;
        }
        this.mMotionLayout.setTransitionDuration(this.mAnimateTargetDelay);
        if (this.mTargetIndex < this.mIndex) {
            this.mMotionLayout.transitionToState(this.mPreviousState, this.mAnimateTargetDelay);
        } else {
            this.mMotionLayout.transitionToState(this.mNextState, this.mAnimateTargetDelay);
        }
    }

    private void updateItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c934457e", new Object[]{this});
            return;
        }
        Adapter adapter = this.mAdapter;
        if (!(adapter == null || this.mMotionLayout == null || adapter.count() == 0)) {
            int size = this.mList.size();
            for (int i = 0; i < size; i++) {
                View view = this.mList.get(i);
                int i2 = (this.mIndex + i) - this.mStartIndex;
                if (this.mInfiniteCarousel) {
                    if (i2 < 0) {
                        int i3 = this.mEmptyViewBehavior;
                        if (i3 != 4) {
                            updateViewVisibility(view, i3);
                        } else {
                            updateViewVisibility(view, 0);
                        }
                        if (i2 % this.mAdapter.count() == 0) {
                            this.mAdapter.populate(view, 0);
                        } else {
                            Adapter adapter2 = this.mAdapter;
                            adapter2.populate(view, adapter2.count() + (i2 % this.mAdapter.count()));
                        }
                    } else if (i2 >= this.mAdapter.count()) {
                        if (i2 == this.mAdapter.count()) {
                            i2 = 0;
                        } else if (i2 > this.mAdapter.count()) {
                            i2 %= this.mAdapter.count();
                        }
                        int i4 = this.mEmptyViewBehavior;
                        if (i4 != 4) {
                            updateViewVisibility(view, i4);
                        } else {
                            updateViewVisibility(view, 0);
                        }
                        this.mAdapter.populate(view, i2);
                    } else {
                        updateViewVisibility(view, 0);
                        this.mAdapter.populate(view, i2);
                    }
                } else if (i2 < 0) {
                    updateViewVisibility(view, this.mEmptyViewBehavior);
                } else if (i2 >= this.mAdapter.count()) {
                    updateViewVisibility(view, this.mEmptyViewBehavior);
                } else {
                    updateViewVisibility(view, 0);
                    this.mAdapter.populate(view, i2);
                }
            }
            int i5 = this.mTargetIndex;
            if (i5 != -1 && i5 != this.mIndex) {
                this.mMotionLayout.post(new Runnable() { // from class: tb.m93
                    @Override // java.lang.Runnable
                    public final void run() {
                        Carousel.this.lambda$updateItems$0();
                    }
                });
            } else if (i5 == this.mIndex) {
                this.mTargetIndex = -1;
            }
            if (!(this.mBackwardTransition == -1 || this.mForwardTransition == -1 || this.mInfiniteCarousel)) {
                int count = this.mAdapter.count();
                if (this.mIndex == 0) {
                    enableTransition(this.mBackwardTransition, false);
                } else {
                    enableTransition(this.mBackwardTransition, true);
                    this.mMotionLayout.setTransition(this.mBackwardTransition);
                }
                if (this.mIndex == count - 1) {
                    enableTransition(this.mForwardTransition, false);
                    return;
                }
                enableTransition(this.mForwardTransition, true);
                this.mMotionLayout.setTransition(this.mForwardTransition);
            }
        }
    }

    private boolean updateViewVisibility(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ef9303c", new Object[]{this, view, new Integer(i)})).booleanValue();
        }
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout == null) {
            return false;
        }
        boolean z = false;
        for (int i2 : motionLayout.getConstraintSetIds()) {
            z |= updateViewVisibility(i2, view, i);
        }
        return z;
    }

    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        Adapter adapter = this.mAdapter;
        if (adapter != null) {
            return adapter.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue();
        }
        return this.mIndex;
    }

    public boolean isInfinite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3adbb6e9", new Object[]{this})).booleanValue();
        }
        return this.mInfiniteCarousel;
    }

    public void jumpToIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b267c9f3", new Object[]{this, new Integer(i)});
            return;
        }
        this.mIndex = Math.max(0, Math.min(getCount() - 1, i));
        refresh();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            this.mList.clear();
            for (int i = 0; i < this.mCount; i++) {
                int i2 = this.mIds[i];
                View viewById = motionLayout.getViewById(i2);
                if (this.mFirstViewReference == i2) {
                    this.mStartIndex = i;
                }
                this.mList.add(viewById);
            }
            this.mMotionLayout = motionLayout;
            if (this.mTouchUpMode == 2) {
                MotionScene.Transition transition = motionLayout.getTransition(this.mForwardTransition);
                if (transition != null) {
                    transition.setOnTouchUp(5);
                }
                MotionScene.Transition transition2 = this.mMotionLayout.getTransition(this.mBackwardTransition);
                if (transition2 != null) {
                    transition2.setOnTouchUp(5);
                }
            }
            updateItems();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mList.clear();
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1065845a", new Object[]{this, motionLayout, new Integer(i), new Integer(i2), new Float(f)});
        } else {
            this.mLastStartId = i;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionCompleted(MotionLayout motionLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61feabea", new Object[]{this, motionLayout, new Integer(i)});
            return;
        }
        int i2 = this.mIndex;
        this.mPreviousIndex = i2;
        if (i == this.mNextState) {
            this.mIndex = i2 + 1;
        } else if (i == this.mPreviousState) {
            this.mIndex = i2 - 1;
        }
        if (this.mInfiniteCarousel) {
            if (this.mIndex >= this.mAdapter.count()) {
                this.mIndex = 0;
            }
            if (this.mIndex < 0) {
                this.mIndex = this.mAdapter.count() - 1;
            }
        } else {
            if (this.mIndex >= this.mAdapter.count()) {
                this.mIndex = this.mAdapter.count() - 1;
            }
            if (this.mIndex < 0) {
                this.mIndex = 0;
            }
        }
        if (this.mPreviousIndex != this.mIndex) {
            this.mMotionLayout.post(this.mUpdateRunnable);
        }
    }

    public void refresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
            return;
        }
        int size = this.mList.size();
        for (int i = 0; i < size; i++) {
            View view = this.mList.get(i);
            if (this.mAdapter.count() == 0) {
                updateViewVisibility(view, this.mEmptyViewBehavior);
            } else {
                updateViewVisibility(view, 0);
            }
        }
        this.mMotionLayout.rebuildScene();
        updateItems();
    }

    public void setAdapter(Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a971136c", new Object[]{this, adapter});
        } else {
            this.mAdapter = adapter;
        }
    }

    public void setInfinite(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef92a457", new Object[]{this, new Boolean(z)});
        } else {
            this.mInfiniteCarousel = z;
        }
    }

    private boolean enableTransition(int i, boolean z) {
        MotionLayout motionLayout;
        MotionScene.Transition transition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3d87c34", new Object[]{this, new Integer(i), new Boolean(z)})).booleanValue();
        }
        if (i == -1 || (motionLayout = this.mMotionLayout) == null || (transition = motionLayout.getTransition(i)) == null || z == transition.isEnabled()) {
            return false;
        }
        transition.setEnabled(z);
        return true;
    }

    public void transitionToIndex(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f53ec5a9", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mTargetIndex = Math.max(0, Math.min(getCount() - 1, i));
        int max = Math.max(0, i2);
        this.mAnimateTargetDelay = max;
        this.mMotionLayout.setTransitionDuration(max);
        if (i < this.mIndex) {
            this.mMotionLayout.transitionToState(this.mPreviousState, this.mAnimateTargetDelay);
        } else {
            this.mMotionLayout.transitionToState(this.mNextState, this.mAnimateTargetDelay);
        }
    }

    private boolean updateViewVisibility(int i, View view, int i2) {
        ConstraintSet.Constraint constraint;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5557c511", new Object[]{this, new Integer(i), view, new Integer(i2)})).booleanValue();
        }
        ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(i);
        if (constraintSet == null || (constraint = constraintSet.getConstraint(view.getId())) == null) {
            return false;
        }
        constraint.propertySet.mVisibilityMode = 1;
        view.setVisibility(i2);
        return true;
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
