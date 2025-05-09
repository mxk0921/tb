package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayoutStates;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.StateSet;
import androidx.core.view.NestedScrollingParent3;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.f7l;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    private static final float EPSILON = 1.0E-5f;
    public static boolean IS_IN_EDIT_MODE = false;
    public static final int MAX_KEY_FRAMES = 50;
    public static final String TAG = "MotionLayout";
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_NEVER_TO_END = 7;
    public static final int TOUCH_UP_NEVER_TO_START = 6;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
    private DesignTool mDesignTool;
    public DevModeDraw mDevModeDraw;
    public int mEndWrapHeight;
    public int mEndWrapWidth;
    public int mHeightMeasureMode;
    public Interpolator mInterpolator;
    public int mLastLayoutHeight;
    public int mLastLayoutWidth;
    private float mLastPos;
    private float mLastY;
    public int mOldHeight;
    public int mOldWidth;
    public float mPostInterpolationPosition;
    private int mPreRotateHeight;
    private int mPreRotateWidth;
    private int mPreviouseRotation;
    public MotionScene mScene;
    public float mScrollTargetDT;
    public float mScrollTargetDX;
    public float mScrollTargetDY;
    public long mScrollTargetTime;
    public int mStartWrapHeight;
    public int mStartWrapWidth;
    private StateCache mStateCache;
    private boolean mTransitionInstantly;
    private long mTransitionLastTime;
    private TransitionListener mTransitionListener;
    public int mWidthMeasureMode;
    public Interpolator mProgressInterpolator = null;
    public float mLastVelocity = 0.0f;
    private int mBeginState = -1;
    public int mCurrentState = -1;
    private int mEndState = -1;
    private int mLastWidthMeasureSpec = 0;
    private int mLastHeightMeasureSpec = 0;
    private boolean mInteractionEnabled = true;
    public HashMap<View, MotionController> mFrameArrayList = new HashMap<>();
    private long mAnimationStartTime = 0;
    private float mTransitionDuration = 1.0f;
    public float mTransitionPosition = 0.0f;
    public float mTransitionLastPosition = 0.0f;
    public float mTransitionGoalPosition = 0.0f;
    public boolean mInTransition = false;
    public boolean mIndirectTransition = false;
    public int mDebugPath = 0;
    private boolean mTemporalInterpolator = false;
    private StopLogic mStopLogic = new StopLogic();
    private DecelerateInterpolator mDecelerateLogic = new DecelerateInterpolator();
    public boolean mFirstDown = true;
    public boolean mUndergoingMotion = false;
    private boolean mKeepAnimating = false;
    private ArrayList<MotionHelper> mOnShowHelpers = null;
    private ArrayList<MotionHelper> mOnHideHelpers = null;
    private ArrayList<MotionHelper> mDecoratorsHelpers = null;
    private CopyOnWriteArrayList<TransitionListener> mTransitionListeners = null;
    private int mFrames = 0;
    private long mLastDrawTime = -1;
    private float mLastFps = 0.0f;
    private int mListenerState = 0;
    private float mListenerPosition = 0.0f;
    public boolean mIsAnimating = false;
    public boolean mMeasureDuringTransition = false;
    private KeyCache mKeyCache = new KeyCache();
    private boolean mInLayout = false;
    private Runnable mOnComplete = null;
    private int[] mScheduledTransitionTo = null;
    public int mScheduledTransitions = 0;
    private boolean mInRotation = false;
    public int mRotatMode = 0;
    public HashMap<View, ViewState> mPreRotate = new HashMap<>();
    public Rect mTempRect = new Rect();
    private boolean mDelayedApply = false;
    public TransitionState mTransitionState = TransitionState.UNDEFINED;
    public Model mModel = new Model();
    private boolean mNeedsFireTransitionCompleted = false;
    private RectF mBoundsCheck = new RectF();
    private View mRegionView = null;
    private Matrix mInverseMatrix = null;
    public ArrayList<Integer> mTransitionCompleted = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class DecelerateInterpolator extends MotionInterpolator {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public float mMaxA;
        public float mInitialV = 0.0f;
        public float mCurrentP = 0.0f;

        public DecelerateInterpolator() {
        }

        public static /* synthetic */ Object ipc$super(DecelerateInterpolator decelerateInterpolator, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/widget/MotionLayout$DecelerateInterpolator");
        }

        public void config(float f, float f2, float f3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47807857", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
                return;
            }
            this.mInitialV = f;
            this.mCurrentP = f2;
            this.mMaxA = f3;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            float f3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
            }
            float f4 = this.mInitialV;
            if (f4 > 0.0f) {
                float f5 = this.mMaxA;
                if (f4 / f5 < f) {
                    f = f4 / f5;
                }
                MotionLayout.this.mLastVelocity = f4 - (f5 * f);
                f2 = (f4 * f) - (((f5 * f) * f) / 2.0f);
                f3 = this.mCurrentP;
            } else {
                float f6 = this.mMaxA;
                if ((-f4) / f6 < f) {
                    f = (-f4) / f6;
                }
                MotionLayout.this.mLastVelocity = (f6 * f) + f4;
                f2 = (f4 * f) + (((f6 * f) * f) / 2.0f);
                f3 = this.mCurrentP;
            }
            return f2 + f3;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
        public float getVelocity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("aeea9d4a", new Object[]{this})).floatValue();
            }
            return MotionLayout.this.mLastVelocity;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface MotionTracker {
        void addMovement(MotionEvent motionEvent);

        void clear();

        void computeCurrentVelocity(int i);

        void computeCurrentVelocity(int i, float f);

        float getXVelocity();

        float getXVelocity(int i);

        float getYVelocity();

        float getYVelocity(int i);

        void recycle();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class StateCache {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public float mProgress = Float.NaN;
        public float mVelocity = Float.NaN;
        public int mStartState = -1;
        public int mEndState = -1;
        public final String mKeyProgress = "motion.progress";
        public final String mKeyVelocity = "motion.velocity";
        public final String mKeyStartState = "motion.StartState";
        public final String mKeyEndState = "motion.EndState";

        public StateCache() {
        }

        public void apply() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
                return;
            }
            int i = this.mStartState;
            if (!(i == -1 && this.mEndState == -1)) {
                if (i == -1) {
                    MotionLayout.this.transitionToState(this.mEndState);
                } else {
                    int i2 = this.mEndState;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i, i2);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (!Float.isNaN(this.mVelocity)) {
                MotionLayout.this.setProgress(this.mProgress, this.mVelocity);
                this.mProgress = Float.NaN;
                this.mVelocity = Float.NaN;
                this.mStartState = -1;
                this.mEndState = -1;
            } else if (!Float.isNaN(this.mProgress)) {
                MotionLayout.this.setProgress(this.mProgress);
            }
        }

        public Bundle getTransitionState() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("1b7fcb11", new Object[]{this});
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.mProgress);
            bundle.putFloat("motion.velocity", this.mVelocity);
            bundle.putInt("motion.StartState", this.mStartState);
            bundle.putInt("motion.EndState", this.mEndState);
            return bundle;
        }

        public void recordState() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("687b9747", new Object[]{this});
                return;
            }
            this.mEndState = MotionLayout.access$100(MotionLayout.this);
            this.mStartState = MotionLayout.access$200(MotionLayout.this);
            this.mVelocity = MotionLayout.this.getVelocity();
            this.mProgress = MotionLayout.this.getProgress();
        }

        public void setEndState(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47fe5f64", new Object[]{this, new Integer(i)});
            } else {
                this.mEndState = i;
            }
        }

        public void setProgress(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            } else {
                this.mProgress = f;
            }
        }

        public void setStartState(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c1666ab", new Object[]{this, new Integer(i)});
            } else {
                this.mStartState = i;
            }
        }

        public void setTransitionState(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d495c433", new Object[]{this, bundle});
                return;
            }
            this.mProgress = bundle.getFloat("motion.progress");
            this.mVelocity = bundle.getFloat("motion.velocity");
            this.mStartState = bundle.getInt("motion.StartState");
            this.mEndState = bundle.getInt("motion.EndState");
        }

        public void setVelocity(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c13fdc1a", new Object[]{this, new Float(f)});
            } else {
                this.mVelocity = f;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface TransitionListener {
        void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f);

        void onTransitionCompleted(MotionLayout motionLayout, int i);

        void onTransitionStarted(MotionLayout motionLayout, int i, int i2);

        void onTransitionTrigger(MotionLayout motionLayout, int i, boolean z, float f);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class TransitionState extends Enum<TransitionState> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final TransitionState UNDEFINED = new TransitionState("UNDEFINED", 0);
        public static final TransitionState SETUP = new TransitionState("SETUP", 1);
        public static final TransitionState MOVING = new TransitionState("MOVING", 2);
        public static final TransitionState FINISHED = new TransitionState("FINISHED", 3);
        private static final /* synthetic */ TransitionState[] $VALUES = $values();

        private static /* synthetic */ TransitionState[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TransitionState[]) ipChange.ipc$dispatch("6d471c75", new Object[0]) : new TransitionState[]{UNDEFINED, SETUP, MOVING, FINISHED};
        }

        private TransitionState(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(TransitionState transitionState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/widget/MotionLayout$TransitionState");
        }

        public static TransitionState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TransitionState) ipChange.ipc$dispatch("30553ca0", new Object[]{str});
            }
            return (TransitionState) Enum.valueOf(TransitionState.class, str);
        }

        public static TransitionState[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TransitionState[]) ipChange.ipc$dispatch("dc370451", new Object[0]);
            }
            return (TransitionState[]) $VALUES.clone();
        }
    }

    public MotionLayout(Context context) {
        super(context);
        init(null);
    }

    public static /* synthetic */ StateCache access$000(MotionLayout motionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StateCache) ipChange.ipc$dispatch("e3ad1742", new Object[]{motionLayout});
        }
        return motionLayout.mStateCache;
    }

    public static /* synthetic */ int access$100(MotionLayout motionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c758846", new Object[]{motionLayout})).intValue();
        }
        return motionLayout.mEndState;
    }

    public static /* synthetic */ void access$1000(MotionLayout motionLayout, ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf7765", new Object[]{motionLayout, constraintWidgetContainer, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            motionLayout.resolveSystem(constraintWidgetContainer, i, i2, i3);
        }
    }

    public static /* synthetic */ void access$1100(MotionLayout motionLayout, boolean z, View view, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray sparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc304d60", new Object[]{motionLayout, new Boolean(z), view, constraintWidget, layoutParams, sparseArray});
        } else {
            motionLayout.applyConstraintsFromLayoutParams(z, view, constraintWidget, layoutParams, sparseArray);
        }
    }

    public static /* synthetic */ int access$1200(MotionLayout motionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f267fcb6", new Object[]{motionLayout})).intValue();
        }
        return motionLayout.mLastWidthMeasureSpec;
    }

    public static /* synthetic */ int access$1300(MotionLayout motionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acdd9d37", new Object[]{motionLayout})).intValue();
        }
        return motionLayout.mLastHeightMeasureSpec;
    }

    public static /* synthetic */ void access$1400(MotionLayout motionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67533dc5", new Object[]{motionLayout});
        } else {
            motionLayout.setupMotionViews();
        }
    }

    public static /* synthetic */ void access$1500(MotionLayout motionLayout, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9753e506", new Object[]{motionLayout, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z), new Boolean(z2)});
        } else {
            motionLayout.resolveMeasuredDimension(i, i2, i3, i4, z, z2);
        }
    }

    public static /* synthetic */ void access$1600(MotionLayout motionLayout, ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8779d81f", new Object[]{motionLayout, constraintWidgetContainer, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            motionLayout.resolveSystem(constraintWidgetContainer, i, i2, i3);
        }
    }

    public static /* synthetic */ void access$1700(MotionLayout motionLayout, ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b98e83e", new Object[]{motionLayout, constraintWidgetContainer, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            motionLayout.resolveSystem(constraintWidgetContainer, i, i2, i3);
        }
    }

    public static /* synthetic */ void access$1800(MotionLayout motionLayout, ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb7f85d", new Object[]{motionLayout, constraintWidgetContainer, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            motionLayout.resolveSystem(constraintWidgetContainer, i, i2, i3);
        }
    }

    public static /* synthetic */ void access$1900(MotionLayout motionLayout, ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d7087c", new Object[]{motionLayout, constraintWidgetContainer, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            motionLayout.resolveSystem(constraintWidgetContainer, i, i2, i3);
        }
    }

    public static /* synthetic */ int access$200(MotionLayout motionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6eb28c7", new Object[]{motionLayout})).intValue();
        }
        return motionLayout.mBeginState;
    }

    public static /* synthetic */ Rect access$2000(MotionLayout motionLayout, ConstraintWidget constraintWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("baa463b", new Object[]{motionLayout, constraintWidget});
        }
        return motionLayout.toRect(constraintWidget);
    }

    public static /* synthetic */ int access$2100(MotionLayout motionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc30cbd4", new Object[]{motionLayout})).intValue();
        }
        return motionLayout.mPreRotateWidth;
    }

    public static /* synthetic */ int access$2200(MotionLayout motionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86a66c55", new Object[]{motionLayout})).intValue();
        }
        return motionLayout.mPreRotateHeight;
    }

    public static /* synthetic */ boolean access$300(MotionLayout motionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9160c959", new Object[]{motionLayout})).booleanValue();
        }
        return motionLayout.mInRotation;
    }

    public static /* synthetic */ boolean access$302(MotionLayout motionLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6c0aae1", new Object[]{motionLayout, new Boolean(z)})).booleanValue();
        }
        motionLayout.mInRotation = z;
        return z;
    }

    public static /* synthetic */ ConstraintWidgetContainer access$400(MotionLayout motionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidgetContainer) ipChange.ipc$dispatch("165f717d", new Object[]{motionLayout});
        }
        return motionLayout.mLayoutWidget;
    }

    public static /* synthetic */ ConstraintWidgetContainer access$500(MotionLayout motionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidgetContainer) ipChange.ipc$dispatch("991691c", new Object[]{motionLayout});
        }
        return motionLayout.mLayoutWidget;
    }

    public static /* synthetic */ ConstraintWidgetContainer access$600(MotionLayout motionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidgetContainer) ipChange.ipc$dispatch("fcc360bb", new Object[]{motionLayout});
        }
        return motionLayout.mLayoutWidget;
    }

    public static /* synthetic */ ConstraintWidgetContainer access$700(MotionLayout motionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidgetContainer) ipChange.ipc$dispatch("eff5585a", new Object[]{motionLayout});
        }
        return motionLayout.mLayoutWidget;
    }

    public static /* synthetic */ boolean access$800(MotionLayout motionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35acebde", new Object[]{motionLayout})).booleanValue();
        }
        return motionLayout.isRtl();
    }

    public static /* synthetic */ boolean access$900(MotionLayout motionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0228c5f", new Object[]{motionLayout})).booleanValue();
        }
        return motionLayout.isRtl();
    }

    private boolean callTransformedTouchEvent(View view, MotionEvent motionEvent, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a343e7fc", new Object[]{this, view, motionEvent, new Float(f), new Float(f2)})).booleanValue();
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f, f2);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f, -f2);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f, f2);
        if (this.mInverseMatrix == null) {
            this.mInverseMatrix = new Matrix();
        }
        matrix.invert(this.mInverseMatrix);
        obtain.transform(this.mInverseMatrix);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    private void checkStructure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ce7852", new Object[]{this});
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            Log.e(TAG, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int startId = motionScene.getStartId();
        MotionScene motionScene2 = this.mScene;
        checkStructure(startId, motionScene2.getConstraintSet(motionScene2.getStartId()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<MotionScene.Transition> it = this.mScene.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            MotionScene.Transition next = it.next();
            MotionScene.Transition transition = this.mScene.mCurrentTransition;
            checkStructure(next);
            int startConstraintSetId = next.getStartConstraintSetId();
            int endConstraintSetId = next.getEndConstraintSetId();
            String name = Debug.getName(getContext(), startConstraintSetId);
            String name2 = Debug.getName(getContext(), endConstraintSetId);
            if (sparseIntArray.get(startConstraintSetId) == endConstraintSetId) {
                Log.e(TAG, "CHECK: two transitions with the same start and end " + name + "->" + name2);
            }
            if (sparseIntArray2.get(endConstraintSetId) == startConstraintSetId) {
                Log.e(TAG, "CHECK: you can't have reverse transitions" + name + "->" + name2);
            }
            sparseIntArray.put(startConstraintSetId, endConstraintSetId);
            sparseIntArray2.put(endConstraintSetId, startConstraintSetId);
            if (this.mScene.getConstraintSet(startConstraintSetId) == null) {
                Log.e(TAG, " no such constraintSetStart " + name);
            }
            if (this.mScene.getConstraintSet(endConstraintSetId) == null) {
                Log.e(TAG, " no such constraintSetEnd " + name);
            }
        }
    }

    private void debugPos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e62bb08", new Object[]{this});
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            StringBuilder sb = new StringBuilder(" ");
            sb.append(Debug.getLocation());
            sb.append(" ");
            sb.append(Debug.getName(this));
            sb.append(" ");
            sb.append(Debug.getName(getContext(), this.mCurrentState));
            sb.append(" ");
            sb.append(Debug.getName(childAt));
            sb.append(childAt.getLeft());
            sb.append(" ");
            sb.append(childAt.getTop());
        }
    }

    private void evaluateLayout() {
        float f;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c89382a", new Object[]{this});
            return;
        }
        float signum = Math.signum(this.mTransitionGoalPosition - this.mTransitionLastPosition);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.mInterpolator;
        if (!(interpolator instanceof StopLogic)) {
            f = ((((float) (nanoTime - this.mTransitionLastTime)) * signum) * 1.0E-9f) / this.mTransitionDuration;
        } else {
            f = 0.0f;
        }
        float f2 = this.mTransitionLastPosition + f;
        if (this.mTransitionInstantly) {
            f2 = this.mTransitionGoalPosition;
        }
        int i = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i <= 0 || f2 < this.mTransitionGoalPosition) && (signum > 0.0f || f2 > this.mTransitionGoalPosition)) {
            z = false;
        } else {
            f2 = this.mTransitionGoalPosition;
            z = true;
        }
        if (interpolator != null && !z) {
            if (this.mTemporalInterpolator) {
                f2 = interpolator.getInterpolation(((float) (nanoTime - this.mAnimationStartTime)) * 1.0E-9f);
            } else {
                f2 = interpolator.getInterpolation(f2);
            }
        }
        if ((i > 0 && f2 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f2 <= this.mTransitionGoalPosition)) {
            f2 = this.mTransitionGoalPosition;
        }
        this.mPostInterpolationPosition = f2;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.mProgressInterpolator;
        if (interpolator2 != null) {
            f2 = interpolator2.getInterpolation(f2);
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            MotionController motionController = this.mFrameArrayList.get(childAt);
            if (motionController != null) {
                motionController.interpolate(childAt, f2, nanoTime2, this.mKeyCache);
            }
        }
        if (this.mMeasureDuringTransition) {
            requestLayout();
        }
    }

    private void fireTransitionChange() {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d596c2", new Object[]{this});
        } else if ((this.mTransitionListener != null || ((copyOnWriteArrayList = this.mTransitionListeners) != null && !copyOnWriteArrayList.isEmpty())) && this.mListenerPosition != this.mTransitionPosition) {
            if (this.mListenerState != -1) {
                fireTransitionStarted();
                this.mIsAnimating = true;
            }
            this.mListenerState = -1;
            float f = this.mTransitionPosition;
            this.mListenerPosition = f;
            TransitionListener transitionListener = this.mTransitionListener;
            if (transitionListener != null) {
                transitionListener.onTransitionChange(this, this.mBeginState, this.mEndState, f);
            }
            CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList2 = this.mTransitionListeners;
            if (copyOnWriteArrayList2 != null) {
                Iterator<TransitionListener> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().onTransitionChange(this, this.mBeginState, this.mEndState, this.mTransitionPosition);
                }
            }
            this.mIsAnimating = true;
        }
    }

    private void fireTransitionStarted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8cb175d", new Object[]{this});
            return;
        }
        TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionStarted(this, this.mBeginState, this.mEndState);
        }
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList != null) {
            Iterator<TransitionListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionStarted(this, this.mBeginState, this.mEndState);
            }
        }
    }

    private boolean handlesTouchEvent(float f, float f2, View view, MotionEvent motionEvent) {
        View childAt;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4388e2fe", new Object[]{this, new Float(f), new Float(f2), view, motionEvent})).booleanValue();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                if (handlesTouchEvent((childAt.getLeft() + f) - view.getScrollX(), (childAt.getTop() + f2) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z = true;
                    break;
                }
                childCount--;
            }
        }
        if (!z) {
            this.mBoundsCheck.set(f, f2, (view.getRight() + f) - view.getLeft(), (view.getBottom() + f2) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY())) && callTransformedTouchEvent(view, motionEvent, -f, -f2)) {
                return true;
            }
        }
        return z;
    }

    private void init(AttributeSet attributeSet) {
        MotionScene motionScene;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cba817", new Object[]{this, attributeSet});
            return;
        }
        IS_IN_EDIT_MODE = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.MotionLayout_layoutDescription) {
                    this.mScene = new MotionScene(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == R.styleable.MotionLayout_currentState) {
                    this.mCurrentState = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == R.styleable.MotionLayout_motionProgress) {
                    this.mTransitionGoalPosition = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.mInTransition = true;
                } else if (index == R.styleable.MotionLayout_applyMotionScene) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == R.styleable.MotionLayout_showPaths) {
                    if (this.mDebugPath == 0) {
                        if (obtainStyledAttributes.getBoolean(index, false)) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        this.mDebugPath = i;
                    }
                } else if (index == R.styleable.MotionLayout_motionDebug) {
                    this.mDebugPath = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.mScene == null) {
                Log.e(TAG, "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.mScene = null;
            }
        }
        if (this.mDebugPath != 0) {
            checkStructure();
        }
        if (this.mCurrentState == -1 && (motionScene = this.mScene) != null) {
            this.mCurrentState = motionScene.getStartId();
            this.mBeginState = this.mScene.getStartId();
            this.mEndState = this.mScene.getEndId();
        }
    }

    public static /* synthetic */ Object ipc$super(MotionLayout motionLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1557272881:
                super.onViewRemoved((View) objArr[0]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1361193775:
                super.onViewAdded((View) objArr[0]);
                return null;
            case 1604649632:
                super.requestLayout();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/widget/MotionLayout");
        }
    }

    private void processTransitionCompleted() {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77f81e8e", new Object[]{this});
        } else if (this.mTransitionListener != null || ((copyOnWriteArrayList = this.mTransitionListeners) != null && !copyOnWriteArrayList.isEmpty())) {
            this.mIsAnimating = false;
            Iterator<Integer> it = this.mTransitionCompleted.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                TransitionListener transitionListener = this.mTransitionListener;
                if (transitionListener != null) {
                    transitionListener.onTransitionCompleted(this, next.intValue());
                }
                CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList2 = this.mTransitionListeners;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<TransitionListener> it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().onTransitionCompleted(this, next.intValue());
                    }
                }
            }
            this.mTransitionCompleted.clear();
        }
    }

    private void setupMotionViews() {
        boolean z;
        float f;
        float f2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43ff8a2", new Object[]{this});
            return;
        }
        int childCount = getChildCount();
        this.mModel.build();
        this.mInTransition = true;
        SparseArray sparseArray = new SparseArray();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            sparseArray.put(childAt.getId(), this.mFrameArrayList.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int gatPathMotionArc = this.mScene.gatPathMotionArc();
        if (gatPathMotionArc != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                MotionController motionController = this.mFrameArrayList.get(getChildAt(i3));
                if (motionController != null) {
                    motionController.setPathMotionArc(gatPathMotionArc);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.mFrameArrayList.size()];
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            MotionController motionController2 = this.mFrameArrayList.get(getChildAt(i5));
            if (motionController2.getAnimateRelativeTo() != -1) {
                sparseBooleanArray.put(motionController2.getAnimateRelativeTo(), true);
                iArr[i4] = motionController2.getAnimateRelativeTo();
                i4++;
            }
        }
        if (this.mDecoratorsHelpers != null) {
            for (int i6 = 0; i6 < i4; i6++) {
                MotionController motionController3 = this.mFrameArrayList.get(findViewById(iArr[i6]));
                if (motionController3 != null) {
                    this.mScene.getKeyFrames(motionController3);
                }
            }
            Iterator<MotionHelper> it = this.mDecoratorsHelpers.iterator();
            while (it.hasNext()) {
                it.next().onPreSetup(this, this.mFrameArrayList);
            }
            for (int i7 = 0; i7 < i4; i7++) {
                MotionController motionController4 = this.mFrameArrayList.get(findViewById(iArr[i7]));
                if (motionController4 != null) {
                    motionController4.setup(width, height, this.mTransitionDuration, getNanoTime());
                }
            }
        } else {
            for (int i8 = 0; i8 < i4; i8++) {
                MotionController motionController5 = this.mFrameArrayList.get(findViewById(iArr[i8]));
                if (motionController5 != null) {
                    this.mScene.getKeyFrames(motionController5);
                    motionController5.setup(width, height, this.mTransitionDuration, getNanoTime());
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            MotionController motionController6 = this.mFrameArrayList.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && motionController6 != null) {
                this.mScene.getKeyFrames(motionController6);
                motionController6.setup(width, height, this.mTransitionDuration, getNanoTime());
            }
        }
        float staggered = this.mScene.getStaggered();
        if (staggered != 0.0f) {
            if (staggered < vu3.b.GEO_NOT_SUPPORT) {
                z = true;
            } else {
                z = false;
            }
            float abs = Math.abs(staggered);
            float f3 = -3.4028235E38f;
            float f4 = Float.MAX_VALUE;
            float f5 = Float.MAX_VALUE;
            float f6 = -3.4028235E38f;
            for (int i10 = 0; i10 < childCount; i10++) {
                MotionController motionController7 = this.mFrameArrayList.get(getChildAt(i10));
                if (!Float.isNaN(motionController7.mMotionStagger)) {
                    for (int i11 = 0; i11 < childCount; i11++) {
                        MotionController motionController8 = this.mFrameArrayList.get(getChildAt(i11));
                        if (!Float.isNaN(motionController8.mMotionStagger)) {
                            f4 = Math.min(f4, motionController8.mMotionStagger);
                            f3 = Math.max(f3, motionController8.mMotionStagger);
                        }
                    }
                    while (i < childCount) {
                        MotionController motionController9 = this.mFrameArrayList.get(getChildAt(i));
                        if (!Float.isNaN(motionController9.mMotionStagger)) {
                            motionController9.mStaggerScale = 1.0f / (1.0f - abs);
                            if (z) {
                                motionController9.mStaggerOffset = abs - (((f3 - motionController9.mMotionStagger) / (f3 - f4)) * abs);
                            } else {
                                motionController9.mStaggerOffset = abs - (((motionController9.mMotionStagger - f4) * abs) / (f3 - f4));
                            }
                        }
                        i++;
                    }
                    return;
                }
                float finalX = motionController7.getFinalX();
                float finalY = motionController7.getFinalY();
                if (z) {
                    f2 = finalY - finalX;
                } else {
                    f2 = finalY + finalX;
                }
                f5 = Math.min(f5, f2);
                f6 = Math.max(f6, f2);
            }
            while (i < childCount) {
                MotionController motionController10 = this.mFrameArrayList.get(getChildAt(i));
                float finalX2 = motionController10.getFinalX();
                float finalY2 = motionController10.getFinalY();
                if (z) {
                    f = finalY2 - finalX2;
                } else {
                    f = finalY2 + finalX2;
                }
                motionController10.mStaggerScale = 1.0f / (1.0f - abs);
                motionController10.mStaggerOffset = abs - (((f - f5) * abs) / (f6 - f5));
                i++;
            }
        }
    }

    private Rect toRect(ConstraintWidget constraintWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("799b6cd5", new Object[]{this, constraintWidget});
        }
        this.mTempRect.top = constraintWidget.getY();
        this.mTempRect.left = constraintWidget.getX();
        Rect rect = this.mTempRect;
        int width = constraintWidget.getWidth();
        Rect rect2 = this.mTempRect;
        rect.right = width + rect2.left;
        int height = constraintWidget.getHeight();
        Rect rect3 = this.mTempRect;
        rect2.bottom = height + rect3.top;
        return rect3;
    }

    private static boolean willJump(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("541da6bd", new Object[]{new Float(f), new Float(f2), new Float(f3)})).booleanValue();
        }
        if (f > 0.0f) {
            float f4 = f / f3;
            if (f2 + ((f * f4) - (((f3 * f4) * f4) / 2.0f)) > 1.0f) {
                return true;
            }
            return false;
        }
        float f5 = (-f) / f3;
        if (f2 + (f * f5) + (((f3 * f5) * f5) / 2.0f) < 0.0f) {
            return true;
        }
        return false;
    }

    public void addTransitionListener(TransitionListener transitionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74a06777", new Object[]{this, transitionListener});
            return;
        }
        if (this.mTransitionListeners == null) {
            this.mTransitionListeners = new CopyOnWriteArrayList<>();
        }
        this.mTransitionListeners.add(transitionListener);
    }

    public void animateTo(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d0d05d", new Object[]{this, new Float(f)});
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            float f2 = this.mTransitionLastPosition;
            float f3 = this.mTransitionPosition;
            if (f2 != f3 && this.mTransitionInstantly) {
                this.mTransitionLastPosition = f3;
            }
            float f4 = this.mTransitionLastPosition;
            if (f4 != f) {
                this.mTemporalInterpolator = false;
                this.mTransitionGoalPosition = f;
                this.mTransitionDuration = motionScene.getDuration() / 1000.0f;
                setProgress(this.mTransitionGoalPosition);
                this.mInterpolator = null;
                this.mProgressInterpolator = this.mScene.getInterpolator();
                this.mTransitionInstantly = false;
                this.mAnimationStartTime = getNanoTime();
                this.mInTransition = true;
                this.mTransitionPosition = f4;
                this.mTransitionLastPosition = f4;
                invalidate();
            }
        }
    }

    public boolean applyViewTransition(int i, MotionController motionController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c51269e1", new Object[]{this, new Integer(i), motionController})).booleanValue();
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            return motionScene.applyViewTransition(i, motionController);
        }
        return false;
    }

    public ConstraintSet cloneConstraintSet(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintSet) ipChange.ipc$dispatch("a45d7855", new Object[]{this, new Integer(i)});
        }
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        ConstraintSet constraintSet = motionScene.getConstraintSet(i);
        ConstraintSet constraintSet2 = new ConstraintSet();
        constraintSet2.clone(constraintSet);
        return constraintSet2;
    }

    public void disableAutoTransition(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b06f141", new Object[]{this, new Boolean(z)});
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.disableAutoTransition(z);
        }
    }

    public void enableViewTransition(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92db8775", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.enableViewTransition(i, z);
        }
    }

    public void endTrigger(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c968a8f0", new Object[]{this, new Boolean(z)});
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            MotionController motionController = this.mFrameArrayList.get(getChildAt(i));
            if (motionController != null) {
                motionController.endTrigger(z);
            }
        }
    }

    public void fireTransitionCompleted() {
        int i;
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34976e7", new Object[]{this});
            return;
        }
        if ((this.mTransitionListener != null || ((copyOnWriteArrayList = this.mTransitionListeners) != null && !copyOnWriteArrayList.isEmpty())) && this.mListenerState == -1) {
            this.mListenerState = this.mCurrentState;
            if (!this.mTransitionCompleted.isEmpty()) {
                ArrayList<Integer> arrayList = this.mTransitionCompleted;
                i = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i = -1;
            }
            int i2 = this.mCurrentState;
            if (!(i == i2 || i2 == -1)) {
                this.mTransitionCompleted.add(Integer.valueOf(i2));
            }
        }
        processTransitionCompleted();
        Runnable runnable = this.mOnComplete;
        if (runnable != null) {
            runnable.run();
            this.mOnComplete = null;
        }
        int[] iArr = this.mScheduledTransitionTo;
        if (iArr != null && this.mScheduledTransitions > 0) {
            transitionToState(iArr[0]);
            int[] iArr2 = this.mScheduledTransitionTo;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.mScheduledTransitions--;
        }
    }

    public void fireTrigger(int i, boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f31ee6", new Object[]{this, new Integer(i), new Boolean(z), new Float(f)});
            return;
        }
        TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionTrigger(this, i, z, f);
        }
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList != null) {
            Iterator<TransitionListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionTrigger(this, i, z, f);
            }
        }
    }

    public void getAnchorDpDt(int i, float f, float f2, float f3, float[] fArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9482f76", new Object[]{this, new Integer(i), new Float(f), new Float(f2), new Float(f3), fArr});
            return;
        }
        HashMap<View, MotionController> hashMap = this.mFrameArrayList;
        View viewById = getViewById(i);
        MotionController motionController = hashMap.get(viewById);
        if (motionController != null) {
            motionController.getDpDt(f, f2, f3, fArr);
            float y = viewById.getY();
            this.mLastPos = f;
            this.mLastY = y;
            return;
        }
        if (viewById == null) {
            str = "" + i;
        } else {
            str = viewById.getContext().getResources().getResourceName(i);
        }
        new StringBuilder("WARNING could not find view id ").append(str);
    }

    public ConstraintSet getConstraintSet(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintSet) ipChange.ipc$dispatch("72bb4d7c", new Object[]{this, new Integer(i)});
        }
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSet(i);
    }

    public int[] getConstraintSetIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("95b09034", new Object[]{this});
        }
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSetIds();
    }

    public String getConstraintSetNames(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3336efd", new Object[]{this, new Integer(i)});
        }
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.lookUpConstraintName(i);
    }

    public int getCurrentState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f537a88", new Object[]{this})).intValue();
        }
        return this.mCurrentState;
    }

    public ArrayList<MotionScene.Transition> getDefinedTransitions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("847487cc", new Object[]{this});
        }
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getDefinedTransitions();
    }

    public DesignTool getDesignTool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DesignTool) ipChange.ipc$dispatch("9472c1a8", new Object[]{this});
        }
        if (this.mDesignTool == null) {
            this.mDesignTool = new DesignTool(this);
        }
        return this.mDesignTool;
    }

    public int getEndState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc098866", new Object[]{this})).intValue();
        }
        return this.mEndState;
    }

    public int[] getMatchingConstraintSetIds(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("4ee9a772", new Object[]{this, strArr});
        }
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getMatchingStateLabels(strArr);
    }

    public MotionController getMotionController(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionController) ipChange.ipc$dispatch("fc5d308b", new Object[]{this, new Integer(i)});
        }
        return this.mFrameArrayList.get(findViewById(i));
    }

    public long getNanoTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3202612", new Object[]{this})).longValue();
        }
        return System.nanoTime();
    }

    public float getProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ba5fa9a", new Object[]{this})).floatValue();
        }
        return this.mTransitionLastPosition;
    }

    public MotionScene getScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionScene) ipChange.ipc$dispatch("3e16d62c", new Object[]{this});
        }
        return this.mScene;
    }

    public int getStartState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d128f3f", new Object[]{this})).intValue();
        }
        return this.mBeginState;
    }

    public float getTargetPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8bb0b747", new Object[]{this})).floatValue();
        }
        return this.mTransitionGoalPosition;
    }

    public MotionScene.Transition getTransition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionScene.Transition) ipChange.ipc$dispatch("9af0151d", new Object[]{this, new Integer(i)});
        }
        return this.mScene.getTransitionById(i);
    }

    public Bundle getTransitionState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("1b7fcb11", new Object[]{this});
        }
        if (this.mStateCache == null) {
            this.mStateCache = new StateCache();
        }
        this.mStateCache.recordState();
        return this.mStateCache.getTransitionState();
    }

    public long getTransitionTimeMs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5019ff9", new Object[]{this})).longValue();
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            this.mTransitionDuration = motionScene.getDuration() / 1000.0f;
        }
        return this.mTransitionDuration * 1000.0f;
    }

    public float getVelocity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeea9d4a", new Object[]{this})).floatValue();
        }
        return this.mLastVelocity;
    }

    public boolean isDelayedApplicationOfInitialState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("816a527", new Object[]{this})).booleanValue();
        }
        return this.mDelayedApply;
    }

    public boolean isInRotation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3439fe98", new Object[]{this})).booleanValue();
        }
        return this.mInRotation;
    }

    public boolean isInteractionEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff5fa4", new Object[]{this})).booleanValue();
        }
        return this.mInteractionEnabled;
    }

    public boolean isViewTransitionEnabled(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c72e9483", new Object[]{this, new Integer(i)})).booleanValue();
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            return motionScene.isViewTransitionEnabled(i);
        }
        return false;
    }

    public void jumpToState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("784ead94", new Object[]{this, new Integer(i)});
            return;
        }
        if (!isAttachedToWindow()) {
            this.mCurrentState = i;
        }
        if (this.mBeginState == i) {
            setProgress(0.0f);
        } else if (this.mEndState == i) {
            setProgress(1.0f);
        } else {
            setTransition(i, i);
        }
    }

    public int lookUpConstraintId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38349f96", new Object[]{this, str})).intValue();
        }
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return 0;
        }
        return motionScene.lookUpConstraintId(str);
    }

    public MotionTracker obtainVelocityTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionTracker) ipChange.ipc$dispatch("853c3ab6", new Object[]{this});
        }
        return MyTracker.obtain();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        MotionScene.Transition transition;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.mPreviouseRotation = display.getRotation();
        }
        MotionScene motionScene = this.mScene;
        if (!(motionScene == null || (i = this.mCurrentState) == -1)) {
            ConstraintSet constraintSet = motionScene.getConstraintSet(i);
            this.mScene.readFallback(this);
            ArrayList<MotionHelper> arrayList = this.mDecoratorsHelpers;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onFinishedMotionScene(this);
                }
            }
            if (constraintSet != null) {
                constraintSet.applyTo(this);
            }
            this.mBeginState = this.mCurrentState;
        }
        onNewStateAttachHandlers();
        StateCache stateCache = this.mStateCache;
        if (stateCache == null) {
            MotionScene motionScene2 = this.mScene;
            if (motionScene2 != null && (transition = motionScene2.mCurrentTransition) != null && transition.getAutoTransition() == 4) {
                transitionToEnd();
                setState(TransitionState.SETUP);
                setState(TransitionState.MOVING);
            }
        } else if (this.mDelayedApply) {
            post(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MotionLayout.access$000(MotionLayout.this).apply();
                    }
                }
            });
        } else {
            stateCache.apply();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mScene == null) {
            super.onMeasure(i, i2);
        } else {
            if (this.mLastWidthMeasureSpec == i && this.mLastHeightMeasureSpec == i2) {
                z = false;
            } else {
                z = true;
            }
            if (this.mNeedsFireTransitionCompleted) {
                this.mNeedsFireTransitionCompleted = false;
                onNewStateAttachHandlers();
                processTransitionCompleted();
                z = true;
            }
            if (this.mDirtyHierarchy) {
                z = true;
            }
            this.mLastWidthMeasureSpec = i;
            this.mLastHeightMeasureSpec = i2;
            int startId = this.mScene.getStartId();
            int endId = this.mScene.getEndId();
            if ((z || this.mModel.isNotConfiguredWith(startId, endId)) && this.mBeginState != -1) {
                super.onMeasure(i, i2);
                this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(startId), this.mScene.getConstraintSet(endId));
                this.mModel.reEvaluateState();
                this.mModel.setMeasuredId(startId, endId);
                z2 = false;
            } else if (z) {
                super.onMeasure(i, i2);
            }
            if (this.mMeasureDuringTransition || z2) {
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int width = this.mLayoutWidget.getWidth() + getPaddingLeft() + getPaddingRight();
                int height = this.mLayoutWidget.getHeight() + paddingTop;
                int i3 = this.mWidthMeasureMode;
                if (i3 == Integer.MIN_VALUE || i3 == 0) {
                    int i4 = this.mStartWrapWidth;
                    width = (int) (i4 + (this.mPostInterpolationPosition * (this.mEndWrapWidth - i4)));
                    requestLayout();
                }
                int i5 = this.mHeightMeasureMode;
                if (i5 == Integer.MIN_VALUE || i5 == 0) {
                    int i6 = this.mStartWrapHeight;
                    height = (int) (i6 + (this.mPostInterpolationPosition * (this.mEndWrapHeight - i6)));
                    requestLayout();
                }
                setMeasuredDimension(width, height);
            }
            evaluateLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e04e9d3", new Object[]{this, view, new Float(f), new Float(f2), new Boolean(z)})).booleanValue();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a49f72c0", new Object[]{this, view, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(final View view, int i, int i2, int[] iArr, int i3) {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        int touchRegionId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472edc84", new Object[]{this, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null && (transition = motionScene.mCurrentTransition) != null && transition.isEnabled()) {
            int i4 = -1;
            if (!transition.isEnabled() || (touchResponse = transition.getTouchResponse()) == null || (touchRegionId = touchResponse.getTouchRegionId()) == -1 || view.getId() == touchRegionId) {
                if (motionScene.getMoveWhenScrollAtTop()) {
                    TouchResponse touchResponse2 = transition.getTouchResponse();
                    if (!(touchResponse2 == null || (4 & touchResponse2.getFlags()) == 0)) {
                        i4 = i2;
                    }
                    float f = this.mTransitionPosition;
                    if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(i4)) {
                        return;
                    }
                }
                if (!(transition.getTouchResponse() == null || (transition.getTouchResponse().getFlags() & 1) == 0)) {
                    float progressDirection = motionScene.getProgressDirection(i, i2);
                    float f2 = this.mTransitionLastPosition;
                    if ((f2 <= 0.0f && progressDirection < 0.0f) || (f2 >= 1.0f && progressDirection > 0.0f)) {
                        view.setNestedScrollingEnabled(false);
                        view.post(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    view.setNestedScrollingEnabled(true);
                                }
                            }
                        });
                        return;
                    }
                }
                float f3 = this.mTransitionPosition;
                long nanoTime = getNanoTime();
                float f4 = i;
                this.mScrollTargetDX = f4;
                float f5 = i2;
                this.mScrollTargetDY = f5;
                this.mScrollTargetDT = (float) ((nanoTime - this.mScrollTargetTime) * 1.0E-9d);
                this.mScrollTargetTime = nanoTime;
                motionScene.processScrollMove(f4, f5);
                if (f3 != this.mTransitionPosition) {
                    iArr[0] = i;
                    iArr[1] = i2;
                }
                evaluate(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.mUndergoingMotion = true;
                }
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bba3db", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da61a091", new Object[]{this, view, view2, new Integer(i), new Integer(i2)});
            return;
        }
        this.mScrollTargetTime = getNanoTime();
        this.mScrollTargetDT = 0.0f;
        this.mScrollTargetDX = 0.0f;
        this.mScrollTargetDY = 0.0f;
    }

    public void onNewStateAttachHandlers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b193f745", new Object[]{this});
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            if (motionScene.autoTransition(this, this.mCurrentState)) {
                requestLayout();
                return;
            }
            int i = this.mCurrentState;
            if (i != -1) {
                this.mScene.addOnClickListeners(this, i);
            }
            if (this.mScene.supportTouch()) {
                this.mScene.setupTouch();
            }
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73380fe6", new Object[]{this, new Integer(i)});
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.setRtl(isRtl());
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        MotionScene.Transition transition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, view, view2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        MotionScene motionScene = this.mScene;
        if (motionScene == null || (transition = motionScene.mCurrentTransition) == null || transition.getTouchResponse() == null || (this.mScene.mCurrentTransition.getTouchResponse().getFlags() & 2) != 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf68c3d", new Object[]{this, view, new Integer(i)});
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            float f = this.mScrollTargetDT;
            if (f != 0.0f) {
                motionScene.processScrollUp(this.mScrollTargetDX / f, this.mScrollTargetDY / f);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        MotionScene motionScene = this.mScene;
        if (motionScene == null || !this.mInteractionEnabled || !motionScene.supportTouch()) {
            return super.onTouchEvent(motionEvent);
        }
        MotionScene.Transition transition = this.mScene.mCurrentTransition;
        if (transition != null && !transition.isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        this.mScene.processTouchEvent(motionEvent, getCurrentState(), this);
        if (this.mScene.mCurrentTransition.isTransitionFlag(4)) {
            return this.mScene.mCurrentTransition.getTouchResponse().isDragStarted();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51222b2f", new Object[]{this, view});
            return;
        }
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.mTransitionListeners == null) {
                this.mTransitionListeners = new CopyOnWriteArrayList<>();
            }
            this.mTransitionListeners.add(motionHelper);
            if (motionHelper.isUsedOnShow()) {
                if (this.mOnShowHelpers == null) {
                    this.mOnShowHelpers = new ArrayList<>();
                }
                this.mOnShowHelpers.add(motionHelper);
            }
            if (motionHelper.isUseOnHide()) {
                if (this.mOnHideHelpers == null) {
                    this.mOnHideHelpers = new ArrayList<>();
                }
                this.mOnHideHelpers.add(motionHelper);
            }
            if (motionHelper.isDecorator()) {
                if (this.mDecoratorsHelpers == null) {
                    this.mDecoratorsHelpers = new ArrayList<>();
                }
                this.mDecoratorsHelpers.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32de6cf", new Object[]{this, view});
            return;
        }
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.mOnHideHelpers;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void parseLayoutDescription(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c96c32bd", new Object[]{this, new Integer(i)});
        } else {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Deprecated
    public void rebuildMotion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1259cfb8", new Object[]{this});
            return;
        }
        Log.e(TAG, "This method is deprecated. Please call rebuildScene() instead.");
        rebuildScene();
    }

    public void rebuildScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2cae538", new Object[]{this});
            return;
        }
        this.mModel.reEvaluateState();
        invalidate();
    }

    public boolean removeTransitionListener(TransitionListener transitionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20734338", new Object[]{this, transitionListener})).booleanValue();
        }
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(transitionListener);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        MotionScene motionScene;
        MotionScene.Transition transition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
            return;
        }
        if (!this.mMeasureDuringTransition && this.mCurrentState == -1 && (motionScene = this.mScene) != null && (transition = motionScene.mCurrentTransition) != null) {
            int layoutDuringTransition = transition.getLayoutDuringTransition();
            if (layoutDuringTransition == 0) {
                return;
            }
            if (layoutDuringTransition == 2) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    this.mFrameArrayList.get(getChildAt(i)).remeasure();
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void rotateTo(int i, int i2) {
        int i3 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8c9bdd", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mInRotation = true;
        this.mPreRotateWidth = getWidth();
        this.mPreRotateHeight = getHeight();
        int rotation = getDisplay().getRotation();
        if ((rotation + 1) % 4 > (this.mPreviouseRotation + 1) % 4) {
            i3 = 1;
        }
        this.mRotatMode = i3;
        this.mPreviouseRotation = rotation;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            ViewState viewState = this.mPreRotate.get(childAt);
            if (viewState == null) {
                viewState = new ViewState();
                this.mPreRotate.put(childAt, viewState);
            }
            viewState.getState(childAt);
        }
        this.mBeginState = -1;
        this.mEndState = i;
        this.mScene.setTransition(-1, i);
        this.mModel.initFrom(this.mLayoutWidget, null, this.mScene.getConstraintSet(this.mEndState));
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        invalidate();
        transitionToEnd(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MotionLayout.access$302(MotionLayout.this, false);
                }
            }
        });
        if (i2 > 0) {
            this.mTransitionDuration = i2 / 1000.0f;
        }
    }

    public void scheduleTransitionTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f504d5", new Object[]{this, new Integer(i)});
        } else if (getCurrentState() == -1) {
            transitionToState(i);
        } else {
            int[] iArr = this.mScheduledTransitionTo;
            if (iArr == null) {
                this.mScheduledTransitionTo = new int[4];
            } else if (iArr.length <= this.mScheduledTransitions) {
                this.mScheduledTransitionTo = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.mScheduledTransitionTo;
            int i2 = this.mScheduledTransitions;
            this.mScheduledTransitions = 1 + i2;
            iArr2[i2] = i;
        }
    }

    public void setDebugMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f11ff88", new Object[]{this, new Integer(i)});
            return;
        }
        this.mDebugPath = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a80a5d9", new Object[]{this, new Boolean(z)});
        } else {
            this.mDelayedApply = z;
        }
    }

    public void setInteractionEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7cdf8fc", new Object[]{this, new Boolean(z)});
        } else {
            this.mInteractionEnabled = z;
        }
    }

    public void setInterpolatedProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a627107", new Object[]{this, new Float(f)});
            return;
        }
        if (this.mScene != null) {
            setState(TransitionState.MOVING);
            Interpolator interpolator = this.mScene.getInterpolator();
            if (interpolator != null) {
                setProgress(interpolator.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e728736", new Object[]{this, new Float(f)});
            return;
        }
        ArrayList<MotionHelper> arrayList = this.mOnHideHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mOnHideHelpers.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2155836", new Object[]{this, new Float(f), new Float(f2)});
        } else if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setProgress(f);
            this.mStateCache.setVelocity(f2);
        } else {
            setProgress(f);
            setState(TransitionState.MOVING);
            this.mLastVelocity = f2;
            float f3 = 1.0f;
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i != 0) {
                if (i <= 0) {
                    f3 = 0.0f;
                }
                animateTo(f3);
            } else if (f != 0.0f && f != 1.0f) {
                if (f <= 0.5f) {
                    f3 = 0.0f;
                }
                animateTo(f3);
            }
        }
    }

    public void setScene(MotionScene motionScene) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67854aae", new Object[]{this, motionScene});
            return;
        }
        this.mScene = motionScene;
        motionScene.setRtl(isRtl());
        rebuildScene();
    }

    public void setStartState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1666ab", new Object[]{this, new Integer(i)});
        } else if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setStartState(i);
            this.mStateCache.setEndState(i);
        } else {
            this.mCurrentState = i;
        }
    }

    public void setState(TransitionState transitionState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c0c8f9", new Object[]{this, transitionState});
            return;
        }
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState != transitionState2 || this.mCurrentState != -1) {
            TransitionState transitionState3 = this.mTransitionState;
            this.mTransitionState = transitionState;
            TransitionState transitionState4 = TransitionState.MOVING;
            if (transitionState3 == transitionState4 && transitionState == transitionState4) {
                fireTransitionChange();
            }
            int ordinal = transitionState3.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                if (transitionState == transitionState4) {
                    fireTransitionChange();
                }
                if (transitionState == transitionState2) {
                    fireTransitionCompleted();
                }
            } else if (ordinal == 2 && transitionState == transitionState2) {
                fireTransitionCompleted();
            }
        }
    }

    public void setTransition(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b551353e", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setStartState(i);
            this.mStateCache.setEndState(i2);
        } else {
            MotionScene motionScene = this.mScene;
            if (motionScene != null) {
                this.mBeginState = i;
                this.mEndState = i2;
                motionScene.setTransition(i, i2);
                this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(i), this.mScene.getConstraintSet(i2));
                rebuildScene();
                this.mTransitionLastPosition = 0.0f;
                transitionToStart();
            }
        }
    }

    public void setTransitionDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77db031", new Object[]{this, new Integer(i)});
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            Log.e(TAG, "MotionScene not defined");
        } else {
            motionScene.setDuration(i);
        }
    }

    public void setTransitionListener(TransitionListener transitionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc77396", new Object[]{this, transitionListener});
        } else {
            this.mTransitionListener = transitionListener;
        }
    }

    public void setTransitionState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d495c433", new Object[]{this, bundle});
            return;
        }
        if (this.mStateCache == null) {
            this.mStateCache = new StateCache();
        }
        this.mStateCache.setTransitionState(bundle);
        if (isAttachedToWindow()) {
            this.mStateCache.apply();
        }
    }

    @Override // android.view.View
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        Context context = getContext();
        return Debug.getName(context, this.mBeginState) + "->" + Debug.getName(context, this.mEndState) + " (pos:" + this.mTransitionLastPosition + " Dpos/Dt:" + this.mLastVelocity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (r13 != 7) goto L_0x0118;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void touchAnimateTo(int r13, float r14, float r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.touchAnimateTo(int, float, float):void");
    }

    public void transitionToEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af226312", new Object[]{this});
            return;
        }
        animateTo(1.0f);
        this.mOnComplete = null;
    }

    public void transitionToStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a27719", new Object[]{this});
        } else {
            animateTo(0.0f);
        }
    }

    public void transitionToState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0a43b", new Object[]{this, new Integer(i)});
        } else if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setEndState(i);
        } else {
            transitionToState(i, -1, -1);
        }
    }

    public void updateState(int i, ConstraintSet constraintSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c998987", new Object[]{this, new Integer(i), constraintSet});
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.setConstraintSet(i, constraintSet);
        }
        updateState();
        if (this.mCurrentState == i) {
            constraintSet.applyTo(this);
        }
    }

    public void updateStateAnimate(int i, ConstraintSet constraintSet, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5812cd", new Object[]{this, new Integer(i), constraintSet, new Integer(i2)});
        } else if (this.mScene != null && this.mCurrentState == i) {
            int i3 = R.id.view_transition;
            updateState(i3, getConstraintSet(i));
            setState(i3, -1, -1);
            updateState(i, constraintSet);
            MotionScene.Transition transition = new MotionScene.Transition(-1, this.mScene, i3, i);
            transition.setDuration(i2);
            setTransition(transition);
            transitionToEnd();
        }
    }

    public void viewTransition(int i, View... viewArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebdf0df", new Object[]{this, new Integer(i), viewArr});
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.viewTransition(i, viewArr);
        } else {
            Log.e(TAG, " no motionScene");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class Model {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mEndId;
        public int mStartId;
        public ConstraintWidgetContainer mLayoutStart = new ConstraintWidgetContainer();
        public ConstraintWidgetContainer mLayoutEnd = new ConstraintWidgetContainer();
        public ConstraintSet mStart = null;
        public ConstraintSet mEnd = null;

        public Model() {
        }

        private void computeStartEndSize(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4305a8f8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.mCurrentState == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutEnd;
                ConstraintSet constraintSet = this.mEnd;
                if (constraintSet == null || constraintSet.mRotate == 0) {
                    i6 = i;
                } else {
                    i6 = i2;
                }
                if (constraintSet == null || constraintSet.mRotate == 0) {
                    i7 = i2;
                } else {
                    i7 = i;
                }
                MotionLayout.access$1600(motionLayout2, constraintWidgetContainer, optimizationLevel, i6, i7);
                ConstraintSet constraintSet2 = this.mStart;
                if (constraintSet2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutStart;
                    int i9 = constraintSet2.mRotate;
                    if (i9 == 0) {
                        i8 = i;
                    } else {
                        i8 = i2;
                    }
                    if (i9 == 0) {
                        i = i2;
                    }
                    MotionLayout.access$1700(motionLayout3, constraintWidgetContainer2, optimizationLevel, i8, i);
                    return;
                }
                return;
            }
            ConstraintSet constraintSet3 = this.mStart;
            if (constraintSet3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                ConstraintWidgetContainer constraintWidgetContainer3 = this.mLayoutStart;
                int i10 = constraintSet3.mRotate;
                if (i10 == 0) {
                    i4 = i;
                } else {
                    i4 = i2;
                }
                if (i10 == 0) {
                    i5 = i2;
                } else {
                    i5 = i;
                }
                MotionLayout.access$1800(motionLayout4, constraintWidgetContainer3, optimizationLevel, i4, i5);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            ConstraintWidgetContainer constraintWidgetContainer4 = this.mLayoutEnd;
            ConstraintSet constraintSet4 = this.mEnd;
            if (constraintSet4 == null || constraintSet4.mRotate == 0) {
                i3 = i;
            } else {
                i3 = i2;
            }
            if (constraintSet4 == null || constraintSet4.mRotate == 0) {
                i = i2;
            }
            MotionLayout.access$1900(motionLayout5, constraintWidgetContainer4, optimizationLevel, i3, i);
        }

        private void debugLayout(String str, ConstraintWidgetContainer constraintWidgetContainer) {
            String str2;
            String str3;
            String str4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89db7dab", new Object[]{this, str, constraintWidgetContainer});
                return;
            }
            String str5 = str + " " + Debug.getName((View) constraintWidgetContainer.getCompanionWidget());
            StringBuilder sb = new StringBuilder();
            sb.append(str5);
            sb.append("  ========= ");
            sb.append(constraintWidgetContainer);
            int size = constraintWidgetContainer.getChildren().size();
            for (int i = 0; i < size; i++) {
                String str6 = str5 + "[" + i + "] ";
                ConstraintWidget constraintWidget = constraintWidgetContainer.getChildren().get(i);
                String str7 = "_";
                if (constraintWidget.mTop.mTarget != null) {
                    str2 = "T";
                } else {
                    str2 = str7;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                if (constraintWidget.mBottom.mTarget != null) {
                    str3 = "B";
                } else {
                    str3 = str7;
                }
                sb2.append(str3);
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb3);
                if (constraintWidget.mLeft.mTarget != null) {
                    str4 = "L";
                } else {
                    str4 = str7;
                }
                sb4.append(str4);
                String sb5 = sb4.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(sb5);
                if (constraintWidget.mRight.mTarget != null) {
                    str7 = "R";
                }
                sb6.append(str7);
                String sb7 = sb6.toString();
                View view = (View) constraintWidget.getCompanionWidget();
                String name = Debug.getName(view);
                if (view instanceof TextView) {
                    name = name + f7l.BRACKET_START_STR + ((Object) ((TextView) view).getText()) + f7l.BRACKET_END_STR;
                }
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str6);
                sb8.append("  ");
                sb8.append(name);
                sb8.append(" ");
                sb8.append(constraintWidget);
                sb8.append(" ");
                sb8.append(sb7);
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str5);
            sb9.append(" done. ");
        }

        private void debugLayoutParam(String str, ConstraintLayout.LayoutParams layoutParams) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e44d08ec", new Object[]{this, str, layoutParams});
                return;
            }
            if (layoutParams.startToStart != -1) {
                str2 = "SS";
            } else {
                str2 = "__";
            }
            String concat = " ".concat(str2);
            StringBuilder sb = new StringBuilder();
            sb.append(concat);
            String str3 = "|__";
            sb.append(layoutParams.startToEnd != -1 ? "|SE" : str3);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(layoutParams.endToStart != -1 ? "|ES" : str3);
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(layoutParams.endToEnd != -1 ? "|EE" : str3);
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append(layoutParams.leftToLeft != -1 ? "|LL" : str3);
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(sb8);
            sb9.append(layoutParams.leftToRight != -1 ? "|LR" : str3);
            String sb10 = sb9.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(sb10);
            sb11.append(layoutParams.rightToLeft != -1 ? "|RL" : str3);
            String sb12 = sb11.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append(sb12);
            sb13.append(layoutParams.rightToRight != -1 ? "|RR" : str3);
            String sb14 = sb13.toString();
            StringBuilder sb15 = new StringBuilder();
            sb15.append(sb14);
            sb15.append(layoutParams.topToTop != -1 ? "|TT" : str3);
            String sb16 = sb15.toString();
            StringBuilder sb17 = new StringBuilder();
            sb17.append(sb16);
            sb17.append(layoutParams.topToBottom != -1 ? "|TB" : str3);
            String sb18 = sb17.toString();
            StringBuilder sb19 = new StringBuilder();
            sb19.append(sb18);
            sb19.append(layoutParams.bottomToTop != -1 ? "|BT" : str3);
            String sb20 = sb19.toString();
            StringBuilder sb21 = new StringBuilder();
            sb21.append(sb20);
            if (layoutParams.bottomToBottom != -1) {
                str3 = "|BB";
            }
            sb21.append(str3);
            String sb22 = sb21.toString();
            StringBuilder sb23 = new StringBuilder();
            sb23.append(str);
            sb23.append(sb22);
        }

        private void debugWidget(String str, ConstraintWidget constraintWidget) {
            String str2;
            String str3;
            String str4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1a27d0a", new Object[]{this, str, constraintWidget});
                return;
            }
            StringBuilder sb = new StringBuilder(" ");
            ConstraintAnchor constraintAnchor = constraintWidget.mTop.mTarget;
            String str5 = "T";
            String str6 = "__";
            if (constraintAnchor != null) {
                str2 = str5.concat(constraintAnchor.mType == ConstraintAnchor.Type.TOP ? str5 : "B");
            } else {
                str2 = str6;
            }
            sb.append(str2);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            ConstraintAnchor constraintAnchor2 = constraintWidget.mBottom.mTarget;
            if (constraintAnchor2 != null) {
                if (constraintAnchor2.mType != ConstraintAnchor.Type.TOP) {
                    str5 = "B";
                }
                str3 = "B".concat(str5);
            } else {
                str3 = str6;
            }
            sb3.append(str3);
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            ConstraintAnchor constraintAnchor3 = constraintWidget.mLeft.mTarget;
            String str7 = "L";
            if (constraintAnchor3 != null) {
                str4 = str7.concat(constraintAnchor3.mType == ConstraintAnchor.Type.LEFT ? str7 : "R");
            } else {
                str4 = str6;
            }
            sb5.append(str4);
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            ConstraintAnchor constraintAnchor4 = constraintWidget.mRight.mTarget;
            if (constraintAnchor4 != null) {
                if (constraintAnchor4.mType != ConstraintAnchor.Type.LEFT) {
                    str7 = "R";
                }
                str6 = "R".concat(str7);
            }
            sb7.append(str6);
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            sb9.append(sb8);
            sb9.append(" ---  ");
            sb9.append(constraintWidget);
        }

        private void setupConstraintWidget(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afe030d5", new Object[]{this, constraintWidgetContainer, constraintSet});
                return;
            }
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, constraintWidgetContainer);
            sparseArray.put(MotionLayout.this.getId(), constraintWidgetContainer);
            if (!(constraintSet == null || constraintSet.mRotate == 0)) {
                MotionLayout motionLayout = MotionLayout.this;
                MotionLayout.access$1000(motionLayout, this.mLayoutEnd, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            Iterator<ConstraintWidget> it = constraintWidgetContainer.getChildren().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.setAnimated(true);
                sparseArray.put(((View) next.getCompanionWidget()).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = constraintWidgetContainer.getChildren().iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.getCompanionWidget();
                constraintSet.applyToLayoutParams(view.getId(), layoutParams);
                next2.setWidth(constraintSet.getWidth(view.getId()));
                next2.setHeight(constraintSet.getHeight(view.getId()));
                if (view instanceof ConstraintHelper) {
                    constraintSet.applyToHelper((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).validateParams();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.access$1100(MotionLayout.this, false, view, next2, layoutParams, sparseArray);
                if (constraintSet.getVisibilityMode(view.getId()) == 1) {
                    next2.setVisibility(view.getVisibility());
                } else {
                    next2.setVisibility(constraintSet.getVisibility(view.getId()));
                }
            }
            Iterator<ConstraintWidget> it3 = constraintWidgetContainer.getChildren().iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof VirtualLayout) {
                    Helper helper = (Helper) next3;
                    ((ConstraintHelper) next3.getCompanionWidget()).updatePreLayout(constraintWidgetContainer, helper, sparseArray);
                    ((VirtualLayout) helper).captureWidgets();
                }
            }
        }

        public void copy(ConstraintWidgetContainer constraintWidgetContainer, ConstraintWidgetContainer constraintWidgetContainer2) {
            ConstraintWidget constraintWidget;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79ac2e36", new Object[]{this, constraintWidgetContainer, constraintWidgetContainer2});
                return;
            }
            ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
            HashMap<ConstraintWidget, ConstraintWidget> hashMap = new HashMap<>();
            hashMap.put(constraintWidgetContainer, constraintWidgetContainer2);
            constraintWidgetContainer2.getChildren().clear();
            constraintWidgetContainer2.copy(constraintWidgetContainer, hashMap);
            Iterator<ConstraintWidget> it = children.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                if (next instanceof androidx.constraintlayout.core.widgets.Barrier) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.Barrier();
                } else if (next instanceof Guideline) {
                    constraintWidget = new Guideline();
                } else if (next instanceof Flow) {
                    constraintWidget = new Flow();
                } else if (next instanceof Placeholder) {
                    constraintWidget = new Placeholder();
                } else if (next instanceof Helper) {
                    constraintWidget = new HelperWidget();
                } else {
                    constraintWidget = new ConstraintWidget();
                }
                constraintWidgetContainer2.add(constraintWidget);
                hashMap.put(next, constraintWidget);
            }
            Iterator<ConstraintWidget> it2 = children.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                hashMap.get(next2).copy(next2, hashMap);
            }
        }

        public ConstraintWidget getWidget(ConstraintWidgetContainer constraintWidgetContainer, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConstraintWidget) ipChange.ipc$dispatch("41337816", new Object[]{this, constraintWidgetContainer, view});
            }
            if (constraintWidgetContainer.getCompanionWidget() == view) {
                return constraintWidgetContainer;
            }
            ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
            int size = children.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = children.get(i);
                if (constraintWidget.getCompanionWidget() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public void initFrom(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet, ConstraintSet constraintSet2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47ace04", new Object[]{this, constraintWidgetContainer, constraintSet, constraintSet2});
                return;
            }
            this.mStart = constraintSet;
            this.mEnd = constraintSet2;
            this.mLayoutStart = new ConstraintWidgetContainer();
            this.mLayoutEnd = new ConstraintWidgetContainer();
            this.mLayoutStart.setMeasurer(MotionLayout.access$400(MotionLayout.this).getMeasurer());
            this.mLayoutEnd.setMeasurer(MotionLayout.access$500(MotionLayout.this).getMeasurer());
            this.mLayoutStart.removeAllChildren();
            this.mLayoutEnd.removeAllChildren();
            copy(MotionLayout.access$600(MotionLayout.this), this.mLayoutStart);
            copy(MotionLayout.access$700(MotionLayout.this), this.mLayoutEnd);
            if (MotionLayout.this.mTransitionLastPosition > 0.5d) {
                if (constraintSet != null) {
                    setupConstraintWidget(this.mLayoutStart, constraintSet);
                }
                setupConstraintWidget(this.mLayoutEnd, constraintSet2);
            } else {
                setupConstraintWidget(this.mLayoutEnd, constraintSet2);
                if (constraintSet != null) {
                    setupConstraintWidget(this.mLayoutStart, constraintSet);
                }
            }
            this.mLayoutStart.setRtl(MotionLayout.access$800(MotionLayout.this));
            this.mLayoutStart.updateHierarchy();
            this.mLayoutEnd.setRtl(MotionLayout.access$900(MotionLayout.this));
            this.mLayoutEnd.updateHierarchy();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutStart;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    constraintWidgetContainer2.setHorizontalDimensionBehaviour(dimensionBehaviour);
                    this.mLayoutEnd.setHorizontalDimensionBehaviour(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    ConstraintWidgetContainer constraintWidgetContainer3 = this.mLayoutStart;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    constraintWidgetContainer3.setVerticalDimensionBehaviour(dimensionBehaviour2);
                    this.mLayoutEnd.setVerticalDimensionBehaviour(dimensionBehaviour2);
                }
            }
        }

        public boolean isNotConfiguredWith(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7c2dd738", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (i == this.mStartId && i2 == this.mEndId) {
                return false;
            }
            return true;
        }

        public void reEvaluateState() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efff260c", new Object[]{this});
                return;
            }
            measure(MotionLayout.access$1200(MotionLayout.this), MotionLayout.access$1300(MotionLayout.this));
            MotionLayout.access$1400(MotionLayout.this);
        }

        public void setMeasuredId(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c1dad6a", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            this.mStartId = i;
            this.mEndId = i2;
        }

        public void measure(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3bc8605", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.mWidthMeasureMode = mode;
            motionLayout.mHeightMeasureMode = mode2;
            computeStartEndSize(i, i2);
            if (!((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824)) {
                computeStartEndSize(i, i2);
                MotionLayout.this.mStartWrapWidth = this.mLayoutStart.getWidth();
                MotionLayout.this.mStartWrapHeight = this.mLayoutStart.getHeight();
                MotionLayout.this.mEndWrapWidth = this.mLayoutEnd.getWidth();
                MotionLayout.this.mEndWrapHeight = this.mLayoutEnd.getHeight();
                MotionLayout motionLayout2 = MotionLayout.this;
                motionLayout2.mMeasureDuringTransition = (motionLayout2.mStartWrapWidth == motionLayout2.mEndWrapWidth && motionLayout2.mStartWrapHeight == motionLayout2.mEndWrapHeight) ? false : true;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i3 = motionLayout3.mStartWrapWidth;
            int i4 = motionLayout3.mStartWrapHeight;
            int i5 = motionLayout3.mWidthMeasureMode;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                i3 = (int) (i3 + (motionLayout3.mPostInterpolationPosition * (motionLayout3.mEndWrapWidth - i3)));
            }
            int i6 = motionLayout3.mHeightMeasureMode;
            MotionLayout.access$1500(MotionLayout.this, i, i2, i3, (i6 == Integer.MIN_VALUE || i6 == 0) ? (int) (i4 + (motionLayout3.mPostInterpolationPosition * (motionLayout3.mEndWrapHeight - i4))) : i4, this.mLayoutStart.isWidthMeasuredTooSmall() || this.mLayoutEnd.isWidthMeasuredTooSmall(), this.mLayoutStart.isHeightMeasuredTooSmall() || this.mLayoutEnd.isHeightMeasuredTooSmall());
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0100  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void build() {
            /*
                Method dump skipped, instructions count: 387
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.Model.build():void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class MyTracker implements MotionTracker {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static MyTracker sMe = new MyTracker();
        public VelocityTracker mTracker;

        private MyTracker() {
        }

        public static MyTracker obtain() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MyTracker) ipChange.ipc$dispatch("e83f7e5d", new Object[0]);
            }
            sMe.mTracker = VelocityTracker.obtain();
            return sMe;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void addMovement(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6e61c4c", new Object[]{this, motionEvent});
                return;
            }
            VelocityTracker velocityTracker = this.mTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            VelocityTracker velocityTracker = this.mTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd421e7d", new Object[]{this, new Integer(i)});
                return;
            }
            VelocityTracker velocityTracker = this.mTracker;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e28e27b6", new Object[]{this})).floatValue();
            }
            VelocityTracker velocityTracker = this.mTracker;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1112e37", new Object[]{this})).floatValue();
            }
            VelocityTracker velocityTracker = this.mTracker;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void recycle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51af759a", new Object[]{this});
                return;
            }
            VelocityTracker velocityTracker = this.mTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.mTracker = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab0218e3", new Object[]{this, new Integer(i), new Float(f)});
                return;
            }
            VelocityTracker velocityTracker = this.mTracker;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i, f);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6f3743ed", new Object[]{this, new Integer(i)})).floatValue();
            }
            VelocityTracker velocityTracker = this.mTracker;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("51150d8c", new Object[]{this, new Integer(i)})).floatValue();
            }
            if (this.mTracker != null) {
                return getYVelocity(i);
            }
            return 0.0f;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i) {
        MotionScene.Transition transition;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6ce4b0", new Object[]{this, new Integer(i)});
        } else if (i != 0) {
            try {
                MotionScene motionScene = new MotionScene(getContext(), this, i);
                this.mScene = motionScene;
                if (this.mCurrentState == -1) {
                    this.mCurrentState = motionScene.getStartId();
                    this.mBeginState = this.mScene.getStartId();
                    this.mEndState = this.mScene.getEndId();
                }
                if (isAttachedToWindow()) {
                    try {
                        Display display = getDisplay();
                        if (display != null) {
                            i2 = display.getRotation();
                        }
                        this.mPreviouseRotation = i2;
                        MotionScene motionScene2 = this.mScene;
                        if (motionScene2 != null) {
                            ConstraintSet constraintSet = motionScene2.getConstraintSet(this.mCurrentState);
                            this.mScene.readFallback(this);
                            ArrayList<MotionHelper> arrayList = this.mDecoratorsHelpers;
                            if (arrayList != null) {
                                Iterator<MotionHelper> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    it.next().onFinishedMotionScene(this);
                                }
                            }
                            if (constraintSet != null) {
                                constraintSet.applyTo(this);
                            }
                            this.mBeginState = this.mCurrentState;
                        }
                        onNewStateAttachHandlers();
                        StateCache stateCache = this.mStateCache;
                        if (stateCache == null) {
                            MotionScene motionScene3 = this.mScene;
                            if (motionScene3 != null && (transition = motionScene3.mCurrentTransition) != null && transition.getAutoTransition() == 4) {
                                transitionToEnd();
                                setState(TransitionState.SETUP);
                                setState(TransitionState.MOVING);
                            }
                        } else if (this.mDelayedApply) {
                            post(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        MotionLayout.access$000(MotionLayout.this).apply();
                                    }
                                }
                            });
                        } else {
                            stateCache.apply();
                        }
                    } catch (Exception e) {
                        throw new IllegalArgumentException("unable to parse MotionScene file", e);
                    }
                } else {
                    this.mScene = null;
                }
            } catch (Exception e2) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e2);
            }
        } else {
            this.mScene = null;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        TouchResponse touchResponse;
        int touchRegionId;
        RectF touchRegion;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null && this.mInteractionEnabled) {
            ViewTransitionController viewTransitionController = motionScene.mViewTransitionController;
            if (viewTransitionController != null) {
                viewTransitionController.touchEvent(motionEvent);
            }
            MotionScene.Transition transition = this.mScene.mCurrentTransition;
            if (transition != null && transition.isEnabled() && (touchResponse = transition.getTouchResponse()) != null && ((motionEvent.getAction() != 0 || (touchRegion = touchResponse.getTouchRegion(this, new RectF())) == null || touchRegion.contains(motionEvent.getX(), motionEvent.getY())) && (touchRegionId = touchResponse.getTouchRegionId()) != -1)) {
                View view = this.mRegionView;
                if (view == null || view.getId() != touchRegionId) {
                    this.mRegionView = findViewById(touchRegionId);
                }
                View view2 = this.mRegionView;
                if (view2 != null) {
                    this.mBoundsCheck.set(view2.getLeft(), this.mRegionView.getTop(), this.mRegionView.getRight(), this.mRegionView.getBottom());
                    if (this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY()) && !handlesTouchEvent(this.mRegionView.getLeft(), this.mRegionView.getTop(), this.mRegionView, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2478a829", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), iArr});
            return;
        }
        if (!(!this.mUndergoingMotion && i == 0 && i2 == 0)) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.mUndergoingMotion = false;
    }

    public void transitionToStart(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb1fdb17", new Object[]{this, runnable});
            return;
        }
        animateTo(0.0f);
        this.mOnComplete = runnable;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class DevModeDraw {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int DEBUG_PATH_TICKS_PER_MS = 16;
        public DashPathEffect mDashPathEffect;
        public Paint mFillPaint;
        public int mKeyFrameCount;
        public Paint mPaint;
        public Paint mPaintGraph;
        public Paint mPaintKeyframes;
        public Path mPath;
        public float[] mPoints;
        public int mShadowTranslate;
        public Paint mTextPaint;
        public final int mRedColor = -21965;
        public final int mKeyframeColor = -2067046;
        public final int mGraphColor = -13391360;
        public final int mShadowColor = 1996488704;
        public final int mDiamondSize = 10;
        public Rect mBounds = new Rect();
        public boolean mPresentationMode = false;
        private float[] mRectangle = new float[8];
        public float[] mKeyFramePoints = new float[100];
        public int[] mPathMode = new int[50];

        public DevModeDraw() {
            this.mShadowTranslate = 1;
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setAntiAlias(true);
            this.mPaint.setColor(-21965);
            this.mPaint.setStrokeWidth(2.0f);
            Paint paint2 = this.mPaint;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.mPaintKeyframes = paint3;
            paint3.setAntiAlias(true);
            this.mPaintKeyframes.setColor(-2067046);
            this.mPaintKeyframes.setStrokeWidth(2.0f);
            this.mPaintKeyframes.setStyle(style);
            Paint paint4 = new Paint();
            this.mPaintGraph = paint4;
            paint4.setAntiAlias(true);
            this.mPaintGraph.setColor(-13391360);
            this.mPaintGraph.setStrokeWidth(2.0f);
            this.mPaintGraph.setStyle(style);
            Paint paint5 = new Paint();
            this.mTextPaint = paint5;
            paint5.setAntiAlias(true);
            this.mTextPaint.setColor(-13391360);
            this.mTextPaint.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            Paint paint6 = new Paint();
            this.mFillPaint = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.mDashPathEffect = dashPathEffect;
            this.mPaintGraph.setPathEffect(dashPathEffect);
            if (this.mPresentationMode) {
                this.mPaint.setStrokeWidth(8.0f);
                this.mFillPaint.setStrokeWidth(8.0f);
                this.mPaintKeyframes.setStrokeWidth(8.0f);
                this.mShadowTranslate = 4;
            }
        }

        private void drawBasicPath(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8fa648f", new Object[]{this, canvas});
            } else {
                canvas.drawLines(this.mPoints, this.mPaint);
            }
        }

        private void drawPathAsConfigured(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c67ea325", new Object[]{this, canvas});
                return;
            }
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.mKeyFrameCount; i++) {
                int i2 = this.mPathMode[i];
                if (i2 == 1) {
                    z = true;
                }
                if (i2 == 0) {
                    z2 = true;
                }
            }
            if (z) {
                drawPathRelative(canvas);
            }
            if (z2) {
                drawPathCartesian(canvas);
            }
        }

        private void drawPathCartesian(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94b24df", new Object[]{this, canvas});
                return;
            }
            float[] fArr = this.mPoints;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.mPaintGraph);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.mPaintGraph);
        }

        private void drawPathCartesianTicks(Canvas canvas, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6a2fce7", new Object[]{this, canvas, new Float(f), new Float(f2)});
                return;
            }
            float[] fArr = this.mPoints;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f5 - f3)) + 0.5d)) / 100.0f);
            getTextBounds(str, this.mTextPaint);
            canvas.drawText(str, ((min2 / 2.0f) - (this.mBounds.width() / 2)) + min, f2 - 20.0f, this.mTextPaint);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.mPaintGraph);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
            getTextBounds(str2, this.mTextPaint);
            canvas.drawText(str2, 5.0f + f, max - ((max2 / 2.0f) - (this.mBounds.height() / 2)), this.mTextPaint);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.mPaintGraph);
        }

        private void drawPathRelative(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24fa1169", new Object[]{this, canvas});
                return;
            }
            float[] fArr = this.mPoints;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.mPaintGraph);
        }

        private void drawPathRelativeTicks(Canvas canvas, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ff4c11d", new Object[]{this, canvas, new Float(f), new Float(f2)});
                return;
            }
            float[] fArr = this.mPoints;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            getTextBounds(str, this.mTextPaint);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.mBounds.width() / 2), -20.0f, this.mTextPaint);
            canvas.drawLine(f, f2, f10, f11, this.mPaintGraph);
        }

        private void drawPathScreenTicks(Canvas canvas, float f, float f2, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bfac21d", new Object[]{this, canvas, new Float(f), new Float(f2), new Integer(i), new Integer(i2)});
                return;
            }
            String str = "" + (((int) ((((f - (i / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i)) + 0.5d)) / 100.0f);
            getTextBounds(str, this.mTextPaint);
            canvas.drawText(str, ((f / 2.0f) - (this.mBounds.width() / 2)) + 0.0f, f2 - 20.0f, this.mTextPaint);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.mPaintGraph);
            String str2 = "" + (((int) ((((f2 - (i2 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i2)) + 0.5d)) / 100.0f);
            getTextBounds(str2, this.mTextPaint);
            canvas.drawText(str2, 5.0f + f, 0.0f - ((f2 / 2.0f) - (this.mBounds.height() / 2)), this.mTextPaint);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.mPaintGraph);
        }

        private void drawRectangle(Canvas canvas, MotionController motionController) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f5b23bc", new Object[]{this, canvas, motionController});
                return;
            }
            this.mPath.reset();
            for (int i = 0; i <= 50; i++) {
                motionController.buildRect(i / 50, this.mRectangle, 0);
                Path path = this.mPath;
                float[] fArr = this.mRectangle;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.mPath;
                float[] fArr2 = this.mRectangle;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.mPath;
                float[] fArr3 = this.mRectangle;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.mPath;
                float[] fArr4 = this.mRectangle;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.mPath.close();
            }
            this.mPaint.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.mPath, this.mPaint);
            canvas.translate(-2.0f, -2.0f);
            this.mPaint.setColor(-65536);
            canvas.drawPath(this.mPath, this.mPaint);
        }

        private void drawTicks(Canvas canvas, int i, int i2, MotionController motionController) {
            int i3;
            int i4;
            int i5;
            float f;
            float f2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ec0be35", new Object[]{this, canvas, new Integer(i), new Integer(i2), motionController});
                return;
            }
            View view = motionController.mView;
            if (view != null) {
                i4 = view.getWidth();
                i3 = motionController.mView.getHeight();
            } else {
                i4 = 0;
                i3 = 0;
            }
            int i6 = 1;
            while (i6 < i2 - 1) {
                if (i == 4 && this.mPathMode[i6 - 1] == 0) {
                    i5 = i6;
                } else {
                    float[] fArr = this.mKeyFramePoints;
                    int i7 = i6 * 2;
                    float f3 = fArr[i7];
                    float f4 = fArr[i7 + 1];
                    this.mPath.reset();
                    this.mPath.moveTo(f3, f4 + 10.0f);
                    this.mPath.lineTo(f3 + 10.0f, f4);
                    this.mPath.lineTo(f3, f4 - 10.0f);
                    this.mPath.lineTo(f3 - 10.0f, f4);
                    this.mPath.close();
                    int i8 = i6 - 1;
                    motionController.getKeyFrame(i8);
                    if (i == 4) {
                        int i9 = this.mPathMode[i8];
                        if (i9 == 1) {
                            drawPathRelativeTicks(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (i9 == 0) {
                            drawPathCartesianTicks(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (i9 == 2) {
                            f = f4;
                            f2 = f3;
                            i5 = i6;
                            drawPathScreenTicks(canvas, f3 - 0.0f, f4 - 0.0f, i4, i3);
                            canvas.drawPath(this.mPath, this.mFillPaint);
                        }
                        f = f4;
                        f2 = f3;
                        i5 = i6;
                        canvas.drawPath(this.mPath, this.mFillPaint);
                    } else {
                        f = f4;
                        f2 = f3;
                        i5 = i6;
                    }
                    if (i == 2) {
                        drawPathRelativeTicks(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 3) {
                        drawPathCartesianTicks(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 6) {
                        drawPathScreenTicks(canvas, f2 - 0.0f, f - 0.0f, i4, i3);
                    }
                    canvas.drawPath(this.mPath, this.mFillPaint);
                }
                i6 = i5 + 1;
            }
            float[] fArr2 = this.mPoints;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.mPaintKeyframes);
                float[] fArr3 = this.mPoints;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.mPaintKeyframes);
            }
        }

        private void drawTranslation(Canvas canvas, float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("459bfe91", new Object[]{this, canvas, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
                return;
            }
            canvas.drawRect(f, f2, f3, f4, this.mPaintGraph);
            canvas.drawLine(f, f2, f3, f4, this.mPaintGraph);
        }

        public void drawAll(Canvas canvas, int i, int i2, MotionController motionController) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c06f1e6a", new Object[]{this, canvas, new Integer(i), new Integer(i2), motionController});
                return;
            }
            if (i == 4) {
                drawPathAsConfigured(canvas);
            }
            if (i == 2) {
                drawPathRelative(canvas);
            }
            if (i == 3) {
                drawPathCartesian(canvas);
            }
            drawBasicPath(canvas);
            drawTicks(canvas, i, i2, motionController);
        }

        public void getTextBounds(String str, Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19e0c7de", new Object[]{this, str, paint});
            } else {
                paint.getTextBounds(str, 0, str.length(), this.mBounds);
            }
        }

        public void draw(Canvas canvas, HashMap<View, MotionController> hashMap, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f90b5d99", new Object[]{this, canvas, hashMap, new Integer(i), new Integer(i2)});
            } else if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.access$100(MotionLayout.this)) + ":" + MotionLayout.this.getProgress();
                    canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.mTextPaint);
                    canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.mPaint);
                }
                for (MotionController motionController : hashMap.values()) {
                    int drawPath = motionController.getDrawPath();
                    if (i2 > 0 && drawPath == 0) {
                        drawPath = 1;
                    }
                    if (drawPath != 0) {
                        this.mKeyFrameCount = motionController.buildKeyFrames(this.mKeyFramePoints, this.mPathMode);
                        if (drawPath >= 1) {
                            int i3 = i / 16;
                            float[] fArr = this.mPoints;
                            if (fArr == null || fArr.length != i3 * 2) {
                                this.mPoints = new float[i3 * 2];
                                this.mPath = new Path();
                            }
                            int i4 = this.mShadowTranslate;
                            canvas.translate(i4, i4);
                            this.mPaint.setColor(1996488704);
                            this.mFillPaint.setColor(1996488704);
                            this.mPaintKeyframes.setColor(1996488704);
                            this.mPaintGraph.setColor(1996488704);
                            motionController.buildPath(this.mPoints, i3);
                            drawAll(canvas, drawPath, this.mKeyFrameCount, motionController);
                            this.mPaint.setColor(-21965);
                            this.mPaintKeyframes.setColor(-2067046);
                            this.mFillPaint.setColor(-2067046);
                            this.mPaintGraph.setColor(-13391360);
                            int i5 = this.mShadowTranslate;
                            canvas.translate(-i5, -i5);
                            drawAll(canvas, drawPath, this.mKeyFrameCount, motionController);
                            if (drawPath == 5) {
                                drawRectangle(canvas, motionController);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }
    }

    private void computeCurrentPositions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccbe25cf", new Object[]{this});
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            MotionController motionController = this.mFrameArrayList.get(childAt);
            if (motionController != null) {
                motionController.setStartCurrentState(childAt);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        String str;
        long j;
        ViewTransitionController viewTransitionController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        ArrayList<MotionHelper> arrayList = this.mDecoratorsHelpers;
        if (arrayList != null) {
            Iterator<MotionHelper> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onPreDraw(canvas);
            }
        }
        evaluate(false);
        MotionScene motionScene = this.mScene;
        if (!(motionScene == null || (viewTransitionController = motionScene.mViewTransitionController) == null)) {
            viewTransitionController.animate();
        }
        super.dispatchDraw(canvas);
        if (this.mScene != null) {
            if ((this.mDebugPath & 1) == 1 && !isInEditMode()) {
                this.mFrames++;
                long nanoTime = getNanoTime();
                long j2 = this.mLastDrawTime;
                if (j2 != -1) {
                    if (nanoTime - j2 > 200000000) {
                        this.mLastFps = ((int) ((this.mFrames / (((float) j) * 1.0E-9f)) * 100.0f)) / 100.0f;
                        this.mFrames = 0;
                        this.mLastDrawTime = nanoTime;
                    }
                } else {
                    this.mLastDrawTime = nanoTime;
                }
                Paint paint = new Paint();
                paint.setTextSize(42.0f);
                StringBuilder sb = new StringBuilder();
                sb.append(this.mLastFps + " fps " + Debug.getState(this, this.mBeginState) + " -> ");
                sb.append(Debug.getState(this, this.mEndState));
                sb.append(" (progress: ");
                sb.append(((int) (getProgress() * 1000.0f)) / 10.0f);
                sb.append(" ) state=");
                int i = this.mCurrentState;
                if (i == -1) {
                    str = "undefined";
                } else {
                    str = Debug.getState(this, i);
                }
                sb.append(str);
                String sb2 = sb.toString();
                paint.setColor(-16777216);
                canvas.drawText(sb2, 11.0f, getHeight() - 29, paint);
                paint.setColor(-7864184);
                canvas.drawText(sb2, 10.0f, getHeight() - 30, paint);
            }
            if (this.mDebugPath > 1) {
                if (this.mDevModeDraw == null) {
                    this.mDevModeDraw = new DevModeDraw();
                }
                this.mDevModeDraw.draw(canvas, this.mFrameArrayList, this.mScene.getDuration(), this.mDebugPath);
            }
            ArrayList<MotionHelper> arrayList2 = this.mDecoratorsHelpers;
            if (arrayList2 != null) {
                Iterator<MotionHelper> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().onPostDraw(canvas);
                }
            }
        }
    }

    public void enableTransition(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d87c30", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        MotionScene.Transition transition = getTransition(i);
        if (z) {
            transition.setEnabled(true);
            return;
        }
        MotionScene motionScene = this.mScene;
        if (transition == motionScene.mCurrentTransition) {
            Iterator<MotionScene.Transition> it = motionScene.getTransitionsWithState(this.mCurrentState).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MotionScene.Transition next = it.next();
                if (next.isEnabled()) {
                    this.mScene.mCurrentTransition = next;
                    break;
                }
            }
        }
        transition.setEnabled(false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.mInLayout = true;
        try {
            if (this.mScene == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (!(this.mLastLayoutWidth == i5 && this.mLastLayoutHeight == i6)) {
                rebuildScene();
                evaluate(true);
            }
            this.mLastLayoutWidth = i5;
            this.mLastLayoutHeight = i6;
            this.mOldWidth = i5;
            this.mOldHeight = i6;
        } finally {
            this.mInLayout = false;
        }
    }

    public void setOnShow(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa1de65b", new Object[]{this, new Float(f)});
            return;
        }
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mOnShowHelpers.get(i).setProgress(f);
            }
        }
    }

    public void touchSpringTo(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f69174e", new Object[]{this, new Float(f), new Float(f2)});
        } else if (this.mScene != null && this.mTransitionLastPosition != f) {
            this.mTemporalInterpolator = true;
            this.mAnimationStartTime = getNanoTime();
            this.mTransitionDuration = this.mScene.getDuration() / 1000.0f;
            this.mTransitionGoalPosition = f;
            this.mInTransition = true;
            this.mStopLogic.springConfig(this.mTransitionLastPosition, f, f2, this.mScene.getSpringMass(), this.mScene.getSpringStiffiness(), this.mScene.getSpringDamping(), this.mScene.getSpringStopThreshold(), this.mScene.getSpringBoundary());
            int i = this.mCurrentState;
            this.mTransitionGoalPosition = f;
            this.mCurrentState = i;
            this.mInterpolator = this.mStopLogic;
            this.mTransitionInstantly = false;
            this.mAnimationStartTime = getNanoTime();
            invalidate();
        }
    }

    public void transitionToEnd(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a431090", new Object[]{this, runnable});
            return;
        }
        animateTo(1.0f);
        this.mOnComplete = runnable;
    }

    public void transitionToState(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec345628", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setEndState(i);
        } else {
            transitionToState(i, -1, -1, i2);
        }
    }

    public void updateState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7451cf", new Object[]{this});
            return;
        }
        this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
        rebuildScene();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void evaluate(boolean r24) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.evaluate(boolean):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e2c8d", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        setState(TransitionState.SETUP);
        this.mCurrentState = i;
        this.mBeginState = -1;
        this.mEndState = -1;
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.updateConstraints(i, i2, i3);
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.getConstraintSet(i).applyTo(this);
        }
    }

    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i >= 0) {
            int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        }
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setProgress(f);
            return;
        }
        if (i <= 0) {
            if (this.mTransitionLastPosition == 1.0f && this.mCurrentState == this.mEndState) {
                setState(TransitionState.MOVING);
            }
            this.mCurrentState = this.mBeginState;
            if (this.mTransitionLastPosition == 0.0f) {
                setState(TransitionState.FINISHED);
            }
        } else if (f >= 1.0f) {
            if (this.mTransitionLastPosition == 0.0f && this.mCurrentState == this.mBeginState) {
                setState(TransitionState.MOVING);
            }
            this.mCurrentState = this.mEndState;
            if (this.mTransitionLastPosition == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.mCurrentState = -1;
            setState(TransitionState.MOVING);
        }
        if (this.mScene != null) {
            this.mTransitionInstantly = true;
            this.mTransitionGoalPosition = f;
            this.mTransitionPosition = f;
            this.mTransitionLastTime = -1L;
            this.mAnimationStartTime = -1L;
            this.mInterpolator = null;
            this.mInTransition = true;
            invalidate();
        }
    }

    public void transitionToState(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a56e1db", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            transitionToState(i, i2, i3, -1);
        }
    }

    public void transitionToState(int i, int i2, int i3, int i4) {
        StateSet stateSet;
        int convertToConstraintSet;
        int i5 = i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b085cc88", new Object[]{this, new Integer(i5), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        MotionScene motionScene = this.mScene;
        if (!(motionScene == null || (stateSet = motionScene.mStateSet) == null || (convertToConstraintSet = stateSet.convertToConstraintSet(this.mCurrentState, i5, i2, i3)) == -1)) {
            i5 = convertToConstraintSet;
        }
        int i6 = this.mCurrentState;
        if (i6 != i5) {
            if (this.mBeginState == i5) {
                animateTo(0.0f);
                if (i4 > 0) {
                    this.mTransitionDuration = i4 / 1000.0f;
                }
            } else if (this.mEndState == i5) {
                animateTo(1.0f);
                if (i4 > 0) {
                    this.mTransitionDuration = i4 / 1000.0f;
                }
            } else {
                this.mEndState = i5;
                if (i6 != -1) {
                    setTransition(i6, i5);
                    animateTo(1.0f);
                    this.mTransitionLastPosition = 0.0f;
                    transitionToEnd();
                    if (i4 > 0) {
                        this.mTransitionDuration = i4 / 1000.0f;
                        return;
                    }
                    return;
                }
                this.mTemporalInterpolator = false;
                this.mTransitionGoalPosition = 1.0f;
                this.mTransitionPosition = 0.0f;
                this.mTransitionLastPosition = 0.0f;
                this.mTransitionLastTime = getNanoTime();
                this.mAnimationStartTime = getNanoTime();
                this.mTransitionInstantly = false;
                this.mInterpolator = null;
                if (i4 == -1) {
                    this.mTransitionDuration = this.mScene.getDuration() / 1000.0f;
                }
                this.mBeginState = -1;
                this.mScene.setTransition(-1, this.mEndState);
                SparseArray sparseArray = new SparseArray();
                if (i4 == 0) {
                    this.mTransitionDuration = this.mScene.getDuration() / 1000.0f;
                } else if (i4 > 0) {
                    this.mTransitionDuration = i4 / 1000.0f;
                }
                int childCount = getChildCount();
                this.mFrameArrayList.clear();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = getChildAt(i7);
                    this.mFrameArrayList.put(childAt, new MotionController(childAt));
                    sparseArray.put(childAt.getId(), this.mFrameArrayList.get(childAt));
                }
                this.mInTransition = true;
                this.mModel.initFrom(this.mLayoutWidget, null, this.mScene.getConstraintSet(i5));
                rebuildScene();
                this.mModel.build();
                computeCurrentPositions();
                int width = getWidth();
                int height = getHeight();
                if (this.mDecoratorsHelpers != null) {
                    for (int i8 = 0; i8 < childCount; i8++) {
                        MotionController motionController = this.mFrameArrayList.get(getChildAt(i8));
                        if (motionController != null) {
                            this.mScene.getKeyFrames(motionController);
                        }
                    }
                    Iterator<MotionHelper> it = this.mDecoratorsHelpers.iterator();
                    while (it.hasNext()) {
                        it.next().onPreSetup(this, this.mFrameArrayList);
                    }
                    for (int i9 = 0; i9 < childCount; i9++) {
                        MotionController motionController2 = this.mFrameArrayList.get(getChildAt(i9));
                        if (motionController2 != null) {
                            motionController2.setup(width, height, this.mTransitionDuration, getNanoTime());
                        }
                    }
                } else {
                    for (int i10 = 0; i10 < childCount; i10++) {
                        MotionController motionController3 = this.mFrameArrayList.get(getChildAt(i10));
                        if (motionController3 != null) {
                            this.mScene.getKeyFrames(motionController3);
                            motionController3.setup(width, height, this.mTransitionDuration, getNanoTime());
                        }
                    }
                }
                float staggered = this.mScene.getStaggered();
                if (staggered != 0.0f) {
                    float f = Float.MAX_VALUE;
                    float f2 = -3.4028235E38f;
                    for (int i11 = 0; i11 < childCount; i11++) {
                        MotionController motionController4 = this.mFrameArrayList.get(getChildAt(i11));
                        float finalY = motionController4.getFinalY() + motionController4.getFinalX();
                        f = Math.min(f, finalY);
                        f2 = Math.max(f2, finalY);
                    }
                    for (int i12 = 0; i12 < childCount; i12++) {
                        MotionController motionController5 = this.mFrameArrayList.get(getChildAt(i12));
                        float finalX = motionController5.getFinalX();
                        float finalY2 = motionController5.getFinalY();
                        motionController5.mStaggerScale = 1.0f / (1.0f - staggered);
                        motionController5.mStaggerOffset = staggered - ((((finalX + finalY2) - f) * staggered) / (f2 - f));
                    }
                }
                this.mTransitionPosition = 0.0f;
                this.mTransitionLastPosition = 0.0f;
                this.mInTransition = true;
                invalidate();
            }
        }
    }

    public void getViewVelocity(View view, float f, float f2, float[] fArr, int i) {
        float f3;
        float f4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f46fa5", new Object[]{this, view, new Float(f), new Float(f2), fArr, new Integer(i)});
            return;
        }
        float f5 = this.mLastVelocity;
        float f6 = this.mTransitionLastPosition;
        if (this.mInterpolator != null) {
            float signum = Math.signum(this.mTransitionGoalPosition - f6);
            float interpolation = this.mInterpolator.getInterpolation(this.mTransitionLastPosition + EPSILON);
            float interpolation2 = this.mInterpolator.getInterpolation(this.mTransitionLastPosition);
            f3 = (signum * ((interpolation - interpolation2) / EPSILON)) / this.mTransitionDuration;
            f4 = interpolation2;
        } else {
            f3 = f5;
            f4 = f6;
        }
        Interpolator interpolator = this.mInterpolator;
        if (interpolator instanceof MotionInterpolator) {
            f3 = ((MotionInterpolator) interpolator).getVelocity();
        }
        MotionController motionController = this.mFrameArrayList.get(view);
        if ((i & 1) == 0) {
            motionController.getPostLayoutDvDp(f4, view.getWidth(), view.getHeight(), f, f2, fArr);
        } else {
            motionController.getDpDt(f4, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * f3;
            fArr[1] = fArr[1] * f3;
        }
    }

    public void setTransition(int i) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c08a65", new Object[]{this, new Integer(i)});
        } else if (this.mScene != null) {
            MotionScene.Transition transition = getTransition(i);
            this.mBeginState = transition.getStartConstraintSetId();
            this.mEndState = transition.getEndConstraintSetId();
            if (!isAttachedToWindow()) {
                if (this.mStateCache == null) {
                    this.mStateCache = new StateCache();
                }
                this.mStateCache.setStartState(this.mBeginState);
                this.mStateCache.setEndState(this.mEndState);
                return;
            }
            int i2 = this.mCurrentState;
            float f2 = 0.0f;
            if (i2 == this.mBeginState) {
                f = 0.0f;
            } else {
                f = i2 == this.mEndState ? 1.0f : Float.NaN;
            }
            this.mScene.setTransition(transition);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
            rebuildScene();
            if (this.mTransitionLastPosition != f) {
                if (f == 0.0f) {
                    endTrigger(true);
                    this.mScene.getConstraintSet(this.mBeginState).applyTo(this);
                } else if (f == 1.0f) {
                    endTrigger(false);
                    this.mScene.getConstraintSet(this.mEndState).applyTo(this);
                }
            }
            if (!Float.isNaN(f)) {
                f2 = f;
            }
            this.mTransitionLastPosition = f2;
            if (Float.isNaN(f)) {
                StringBuilder sb = new StringBuilder();
                sb.append(Debug.getLocation());
                sb.append(" transitionToStart ");
                transitionToStart();
                return;
            }
            setProgress(f);
        }
    }

    private void checkStructure(int i, ConstraintSet constraintSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f82564", new Object[]{this, new Integer(i), constraintSet});
            return;
        }
        String name = Debug.getName(getContext(), i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            if (id == -1) {
                StringBuilder sb = new StringBuilder("CHECK: ");
                sb.append(name);
                sb.append(" ALL VIEWS SHOULD HAVE ID's ");
                sb.append(childAt.getClass().getName());
                sb.append(" does not!");
            }
            if (constraintSet.getConstraint(id) == null) {
                StringBuilder sb2 = new StringBuilder("CHECK: ");
                sb2.append(name);
                sb2.append(" NO CONSTRAINTS for ");
                sb2.append(Debug.getName(childAt));
            }
        }
        int[] knownIds = constraintSet.getKnownIds();
        for (int i3 = 0; i3 < knownIds.length; i3++) {
            int i4 = knownIds[i3];
            String name2 = Debug.getName(getContext(), i4);
            if (findViewById(knownIds[i3]) == null) {
                StringBuilder sb3 = new StringBuilder("CHECK: ");
                sb3.append(name);
                sb3.append(" NO View matches id ");
                sb3.append(name2);
            }
            if (constraintSet.getHeight(i4) == -1) {
                StringBuilder sb4 = new StringBuilder("CHECK: ");
                sb4.append(name);
                sb4.append(f7l.BRACKET_START_STR);
                sb4.append(name2);
                sb4.append(") no LAYOUT_HEIGHT");
            }
            if (constraintSet.getWidth(i4) == -1) {
                StringBuilder sb5 = new StringBuilder("CHECK: ");
                sb5.append(name);
                sb5.append(f7l.BRACKET_START_STR);
                sb5.append(name2);
                sb5.append(") no LAYOUT_HEIGHT");
            }
        }
    }

    private void checkStructure(MotionScene.Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1517976a", new Object[]{this, transition});
        } else if (transition.getStartConstraintSetId() == transition.getEndConstraintSetId()) {
            Log.e(TAG, "CHECK: start and end constraint set should not be the same!");
        }
    }

    public void setTransition(MotionScene.Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9713376", new Object[]{this, transition});
            return;
        }
        this.mScene.setTransition(transition);
        setState(TransitionState.SETUP);
        if (this.mCurrentState == this.mScene.getEndId()) {
            this.mTransitionLastPosition = 1.0f;
            this.mTransitionPosition = 1.0f;
            this.mTransitionGoalPosition = 1.0f;
        } else {
            this.mTransitionLastPosition = 0.0f;
            this.mTransitionPosition = 0.0f;
            this.mTransitionGoalPosition = 0.0f;
        }
        this.mTransitionLastTime = transition.isTransitionFlag(1) ? -1L : getNanoTime();
        int startId = this.mScene.getStartId();
        int endId = this.mScene.getEndId();
        if (startId != this.mBeginState || endId != this.mEndState) {
            this.mBeginState = startId;
            this.mEndState = endId;
            this.mScene.setTransition(startId, endId);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
            this.mModel.setMeasuredId(this.mBeginState, this.mEndState);
            this.mModel.reEvaluateState();
            rebuildScene();
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }
}
