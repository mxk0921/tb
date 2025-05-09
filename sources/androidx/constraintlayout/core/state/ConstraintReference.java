package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConstraintReference implements Reference {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mCircularAngle;
    private float mCircularDistance;
    private ConstraintWidget mConstraintWidget;
    public Dimension mHorizontalDimension;
    private Object mKey;
    public final State mState;
    public Dimension mVerticalDimension;
    private Object mView;
    public String mTag = null;
    public Facade mFacade = null;
    public int mHorizontalChainStyle = 0;
    public int mVerticalChainStyle = 0;
    public float mHorizontalChainWeight = -1.0f;
    public float mVerticalChainWeight = -1.0f;
    public float mHorizontalBias = 0.5f;
    public float mVerticalBias = 0.5f;
    public int mMarginLeft = 0;
    public int mMarginRight = 0;
    public int mMarginStart = 0;
    public int mMarginEnd = 0;
    public int mMarginTop = 0;
    public int mMarginBottom = 0;
    public int mMarginLeftGone = 0;
    public int mMarginRightGone = 0;
    public int mMarginStartGone = 0;
    public int mMarginEndGone = 0;
    public int mMarginTopGone = 0;
    public int mMarginBottomGone = 0;
    public int mMarginBaseline = 0;
    public int mMarginBaselineGone = 0;
    public float mPivotX = Float.NaN;
    public float mPivotY = Float.NaN;
    public float mRotationX = Float.NaN;
    public float mRotationY = Float.NaN;
    public float mRotationZ = Float.NaN;
    public float mTranslationX = Float.NaN;
    public float mTranslationY = Float.NaN;
    public float mTranslationZ = Float.NaN;
    public float mAlpha = Float.NaN;
    public float mScaleX = Float.NaN;
    public float mScaleY = Float.NaN;
    public int mVisibility = 0;
    public Object mLeftToLeft = null;
    public Object mLeftToRight = null;
    public Object mRightToLeft = null;
    public Object mRightToRight = null;
    public Object mStartToStart = null;
    public Object mStartToEnd = null;
    public Object mEndToStart = null;
    public Object mEndToEnd = null;
    public Object mTopToTop = null;
    public Object mTopToBottom = null;
    public Object mTopToBaseline = null;
    public Object mBottomToTop = null;
    public Object mBottomToBottom = null;
    public Object mBottomToBaseline = null;
    public Object mBaselineToBaseline = null;
    public Object mBaselineToTop = null;
    public Object mBaselineToBottom = null;
    public Object mCircularConstraint = null;
    public State.Constraint mLast = null;
    private HashMap<String, Integer> mCustomColors = new HashMap<>();
    private HashMap<String, Float> mCustomFloats = new HashMap<>();
    public TypedBundle mMotionProperties = null;

    /* compiled from: Taobao */
    /* renamed from: androidx.constraintlayout.core.state.ConstraintReference$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;

        static {
            int[] iArr = new int[State.Constraint.values().length];
            $SwitchMap$androidx$constraintlayout$core$state$State$Constraint = iArr;
            try {
                iArr[State.Constraint.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.TOP_TO_BASELINE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.BOTTOM_TO_TOP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.BOTTOM_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.BOTTOM_TO_BASELINE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.BASELINE_TO_BOTTOM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.BASELINE_TO_TOP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.BASELINE_TO_BASELINE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.CIRCULAR_CONSTRAINT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.CENTER_HORIZONTALLY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.CENTER_VERTICALLY.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface ConstraintReferenceFactory {
        ConstraintReference create(State state);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class IncorrectConstraintException extends Exception {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final ArrayList<String> mErrors;

        public IncorrectConstraintException(ArrayList<String> arrayList) {
            this.mErrors = arrayList;
        }

        public static /* synthetic */ Object ipc$super(IncorrectConstraintException incorrectConstraintException, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/state/ConstraintReference$IncorrectConstraintException");
        }

        public ArrayList<String> getErrors() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("4ae39e42", new Object[]{this});
            }
            return this.mErrors;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
            }
            return toString();
        }

        @Override // java.lang.Throwable
        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "IncorrectConstraintException: " + this.mErrors.toString();
        }
    }

    public ConstraintReference(State state) {
        Object obj = Dimension.WRAP_DIMENSION;
        this.mHorizontalDimension = Dimension.createFixed(obj);
        this.mVerticalDimension = Dimension.createFixed(obj);
        this.mState = state;
    }

    private void applyConnection(ConstraintWidget constraintWidget, Object obj, State.Constraint constraint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcb89b6a", new Object[]{this, constraintWidget, obj, constraint});
            return;
        }
        ConstraintWidget target = getTarget(obj);
        if (target != null) {
            int[] iArr = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
            int i = iArr[constraint.ordinal()];
            switch (iArr[constraint.ordinal()]) {
                case 1:
                    ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                    constraintWidget.getAnchor(type).connect(target.getAnchor(type), this.mMarginLeft, this.mMarginLeftGone, false);
                    return;
                case 2:
                    constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT).connect(target.getAnchor(ConstraintAnchor.Type.RIGHT), this.mMarginLeft, this.mMarginLeftGone, false);
                    return;
                case 3:
                    constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(target.getAnchor(ConstraintAnchor.Type.LEFT), this.mMarginRight, this.mMarginRightGone, false);
                    return;
                case 4:
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                    constraintWidget.getAnchor(type2).connect(target.getAnchor(type2), this.mMarginRight, this.mMarginRightGone, false);
                    return;
                case 5:
                    ConstraintAnchor.Type type3 = ConstraintAnchor.Type.LEFT;
                    constraintWidget.getAnchor(type3).connect(target.getAnchor(type3), this.mMarginStart, this.mMarginStartGone, false);
                    return;
                case 6:
                    constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT).connect(target.getAnchor(ConstraintAnchor.Type.RIGHT), this.mMarginStart, this.mMarginStartGone, false);
                    return;
                case 7:
                    constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(target.getAnchor(ConstraintAnchor.Type.LEFT), this.mMarginEnd, this.mMarginEndGone, false);
                    return;
                case 8:
                    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.RIGHT;
                    constraintWidget.getAnchor(type4).connect(target.getAnchor(type4), this.mMarginEnd, this.mMarginEndGone, false);
                    return;
                case 9:
                    ConstraintAnchor.Type type5 = ConstraintAnchor.Type.TOP;
                    constraintWidget.getAnchor(type5).connect(target.getAnchor(type5), this.mMarginTop, this.mMarginTopGone, false);
                    return;
                case 10:
                    constraintWidget.getAnchor(ConstraintAnchor.Type.TOP).connect(target.getAnchor(ConstraintAnchor.Type.BOTTOM), this.mMarginTop, this.mMarginTopGone, false);
                    return;
                case 11:
                    constraintWidget.immediateConnect(ConstraintAnchor.Type.TOP, target, ConstraintAnchor.Type.BASELINE, this.mMarginTop, this.mMarginTopGone);
                    return;
                case 12:
                    constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM).connect(target.getAnchor(ConstraintAnchor.Type.TOP), this.mMarginBottom, this.mMarginBottomGone, false);
                    return;
                case 13:
                    ConstraintAnchor.Type type6 = ConstraintAnchor.Type.BOTTOM;
                    constraintWidget.getAnchor(type6).connect(target.getAnchor(type6), this.mMarginBottom, this.mMarginBottomGone, false);
                    return;
                case 14:
                    constraintWidget.immediateConnect(ConstraintAnchor.Type.BOTTOM, target, ConstraintAnchor.Type.BASELINE, this.mMarginBottom, this.mMarginBottomGone);
                    return;
                case 15:
                    constraintWidget.immediateConnect(ConstraintAnchor.Type.BASELINE, target, ConstraintAnchor.Type.BOTTOM, this.mMarginBaseline, this.mMarginBaselineGone);
                    return;
                case 16:
                    constraintWidget.immediateConnect(ConstraintAnchor.Type.BASELINE, target, ConstraintAnchor.Type.TOP, this.mMarginBaseline, this.mMarginBaselineGone);
                    return;
                case 17:
                    ConstraintAnchor.Type type7 = ConstraintAnchor.Type.BASELINE;
                    constraintWidget.immediateConnect(type7, target, type7, this.mMarginBaseline, this.mMarginBaselineGone);
                    return;
                case 18:
                    constraintWidget.connectCircularConstraint(target, this.mCircularAngle, (int) this.mCircularDistance);
                    return;
                default:
                    return;
            }
        }
    }

    private void dereference() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95903371", new Object[]{this});
            return;
        }
        this.mLeftToLeft = get(this.mLeftToLeft);
        this.mLeftToRight = get(this.mLeftToRight);
        this.mRightToLeft = get(this.mRightToLeft);
        this.mRightToRight = get(this.mRightToRight);
        this.mStartToStart = get(this.mStartToStart);
        this.mStartToEnd = get(this.mStartToEnd);
        this.mEndToStart = get(this.mEndToStart);
        this.mEndToEnd = get(this.mEndToEnd);
        this.mTopToTop = get(this.mTopToTop);
        this.mTopToBottom = get(this.mTopToBottom);
        this.mBottomToTop = get(this.mBottomToTop);
        this.mBottomToBottom = get(this.mBottomToBottom);
        this.mBaselineToBaseline = get(this.mBaselineToBaseline);
        this.mBaselineToTop = get(this.mBaselineToTop);
        this.mBaselineToBottom = get(this.mBaselineToBottom);
    }

    private Object get(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, obj});
        }
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof ConstraintReference)) {
            return this.mState.reference(obj);
        }
        return obj;
    }

    private ConstraintWidget getTarget(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidget) ipChange.ipc$dispatch("6cce0f6c", new Object[]{this, obj});
        }
        if (obj instanceof Reference) {
            return ((Reference) obj).getConstraintWidget();
        }
        return null;
    }

    public void addCustomColor(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa14461", new Object[]{this, str, new Integer(i)});
        } else {
            this.mCustomColors.put(str, Integer.valueOf(i));
        }
    }

    public void addCustomFloat(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340bfe05", new Object[]{this, str, new Float(f)});
            return;
        }
        if (this.mCustomFloats == null) {
            this.mCustomFloats = new HashMap<>();
        }
        this.mCustomFloats.put(str, Float.valueOf(f));
    }

    public ConstraintReference alpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("dc6df9a8", new Object[]{this, new Float(f)});
        }
        this.mAlpha = f;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void apply() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
        } else if (this.mConstraintWidget != null) {
            Facade facade = this.mFacade;
            if (facade != null) {
                facade.apply();
            }
            this.mHorizontalDimension.apply(this.mState, this.mConstraintWidget, 0);
            this.mVerticalDimension.apply(this.mState, this.mConstraintWidget, 1);
            dereference();
            applyWidgetConstraints();
            int i = this.mHorizontalChainStyle;
            if (i != 0) {
                this.mConstraintWidget.setHorizontalChainStyle(i);
            }
            int i2 = this.mVerticalChainStyle;
            if (i2 != 0) {
                this.mConstraintWidget.setVerticalChainStyle(i2);
            }
            float f = this.mHorizontalChainWeight;
            if (f != -1.0f) {
                this.mConstraintWidget.setHorizontalWeight(f);
            }
            float f2 = this.mVerticalChainWeight;
            if (f2 != -1.0f) {
                this.mConstraintWidget.setVerticalWeight(f2);
            }
            this.mConstraintWidget.setHorizontalBiasPercent(this.mHorizontalBias);
            this.mConstraintWidget.setVerticalBiasPercent(this.mVerticalBias);
            ConstraintWidget constraintWidget = this.mConstraintWidget;
            WidgetFrame widgetFrame = constraintWidget.frame;
            widgetFrame.pivotX = this.mPivotX;
            widgetFrame.pivotY = this.mPivotY;
            widgetFrame.rotationX = this.mRotationX;
            widgetFrame.rotationY = this.mRotationY;
            widgetFrame.rotationZ = this.mRotationZ;
            widgetFrame.translationX = this.mTranslationX;
            widgetFrame.translationY = this.mTranslationY;
            widgetFrame.translationZ = this.mTranslationZ;
            widgetFrame.scaleX = this.mScaleX;
            widgetFrame.scaleY = this.mScaleY;
            widgetFrame.alpha = this.mAlpha;
            int i3 = this.mVisibility;
            widgetFrame.visibility = i3;
            constraintWidget.setVisibility(i3);
            this.mConstraintWidget.frame.setMotionAttributes(this.mMotionProperties);
            HashMap<String, Integer> hashMap = this.mCustomColors;
            if (hashMap != null) {
                for (String str : hashMap.keySet()) {
                    this.mConstraintWidget.frame.setCustomAttribute(str, 902, this.mCustomColors.get(str).intValue());
                }
            }
            HashMap<String, Float> hashMap2 = this.mCustomFloats;
            if (hashMap2 != null) {
                for (String str2 : hashMap2.keySet()) {
                    this.mConstraintWidget.frame.setCustomAttribute(str2, 901, this.mCustomFloats.get(str2).floatValue());
                }
            }
        }
    }

    public void applyWidgetConstraints() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609e0a0b", new Object[]{this});
            return;
        }
        applyConnection(this.mConstraintWidget, this.mLeftToLeft, State.Constraint.LEFT_TO_LEFT);
        applyConnection(this.mConstraintWidget, this.mLeftToRight, State.Constraint.LEFT_TO_RIGHT);
        applyConnection(this.mConstraintWidget, this.mRightToLeft, State.Constraint.RIGHT_TO_LEFT);
        applyConnection(this.mConstraintWidget, this.mRightToRight, State.Constraint.RIGHT_TO_RIGHT);
        applyConnection(this.mConstraintWidget, this.mStartToStart, State.Constraint.START_TO_START);
        applyConnection(this.mConstraintWidget, this.mStartToEnd, State.Constraint.START_TO_END);
        applyConnection(this.mConstraintWidget, this.mEndToStart, State.Constraint.END_TO_START);
        applyConnection(this.mConstraintWidget, this.mEndToEnd, State.Constraint.END_TO_END);
        applyConnection(this.mConstraintWidget, this.mTopToTop, State.Constraint.TOP_TO_TOP);
        applyConnection(this.mConstraintWidget, this.mTopToBottom, State.Constraint.TOP_TO_BOTTOM);
        applyConnection(this.mConstraintWidget, this.mTopToBaseline, State.Constraint.TOP_TO_BASELINE);
        applyConnection(this.mConstraintWidget, this.mBottomToTop, State.Constraint.BOTTOM_TO_TOP);
        applyConnection(this.mConstraintWidget, this.mBottomToBottom, State.Constraint.BOTTOM_TO_BOTTOM);
        applyConnection(this.mConstraintWidget, this.mBottomToBaseline, State.Constraint.BOTTOM_TO_BASELINE);
        applyConnection(this.mConstraintWidget, this.mBaselineToBaseline, State.Constraint.BASELINE_TO_BASELINE);
        applyConnection(this.mConstraintWidget, this.mBaselineToTop, State.Constraint.BASELINE_TO_TOP);
        applyConnection(this.mConstraintWidget, this.mBaselineToBottom, State.Constraint.BASELINE_TO_BOTTOM);
        applyConnection(this.mConstraintWidget, this.mCircularConstraint, State.Constraint.CIRCULAR_CONSTRAINT);
    }

    public ConstraintReference baseline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("390847f7", new Object[]{this});
        }
        this.mLast = State.Constraint.BASELINE_TO_BASELINE;
        return this;
    }

    public ConstraintReference baselineToBaseline(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("2a2e02db", new Object[]{this, obj});
        }
        this.mLast = State.Constraint.BASELINE_TO_BASELINE;
        this.mBaselineToBaseline = obj;
        return this;
    }

    public ConstraintReference baselineToBottom(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("988f8635", new Object[]{this, obj});
        }
        this.mLast = State.Constraint.BASELINE_TO_BOTTOM;
        this.mBaselineToBottom = obj;
        return this;
    }

    public ConstraintReference baselineToTop(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("4e4e5d4b", new Object[]{this, obj});
        }
        this.mLast = State.Constraint.BASELINE_TO_TOP;
        this.mBaselineToTop = obj;
        return this;
    }

    public ConstraintReference bias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("fd76adc3", new Object[]{this, new Float(f)});
        }
        State.Constraint constraint = this.mLast;
        if (constraint == null) {
            return this;
        }
        int i = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[constraint.ordinal()];
        if (i != 19) {
            if (i != 20) {
                switch (i) {
                }
                return this;
            }
            this.mVerticalBias = f;
            return this;
        }
        this.mHorizontalBias = f;
        return this;
    }

    public ConstraintReference bottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("91cebdd1", new Object[]{this});
        }
        if (this.mBottomToTop != null) {
            this.mLast = State.Constraint.BOTTOM_TO_TOP;
        } else {
            this.mLast = State.Constraint.BOTTOM_TO_BOTTOM;
        }
        return this;
    }

    public ConstraintReference bottomToBaseline(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("ef6b8db5", new Object[]{this, obj});
        }
        this.mLast = State.Constraint.BOTTOM_TO_BASELINE;
        this.mBottomToBaseline = obj;
        return this;
    }

    public ConstraintReference bottomToBottom(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("c185ff8f", new Object[]{this, obj});
        }
        this.mLast = State.Constraint.BOTTOM_TO_BOTTOM;
        this.mBottomToBottom = obj;
        return this;
    }

    public ConstraintReference bottomToTop(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("c667f231", new Object[]{this, obj});
        }
        this.mLast = State.Constraint.BOTTOM_TO_TOP;
        this.mBottomToTop = obj;
        return this;
    }

    public ConstraintReference centerHorizontally(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("41e3691a", new Object[]{this, obj});
        }
        Object obj2 = get(obj);
        this.mStartToStart = obj2;
        this.mEndToEnd = obj2;
        this.mLast = State.Constraint.CENTER_HORIZONTALLY;
        this.mHorizontalBias = 0.5f;
        return this;
    }

    public ConstraintReference centerVertically(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("19a8ac8", new Object[]{this, obj});
        }
        Object obj2 = get(obj);
        this.mTopToTop = obj2;
        this.mBottomToBottom = obj2;
        this.mLast = State.Constraint.CENTER_VERTICALLY;
        this.mVerticalBias = 0.5f;
        return this;
    }

    public ConstraintReference circularConstraint(Object obj, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("dd0505e4", new Object[]{this, obj, new Float(f), new Float(f2)});
        }
        this.mCircularConstraint = get(obj);
        this.mCircularAngle = f;
        this.mCircularDistance = f2;
        this.mLast = State.Constraint.CIRCULAR_CONSTRAINT;
        return this;
    }

    public ConstraintReference clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("3536f4ef", new Object[]{this});
        }
        State.Constraint constraint = this.mLast;
        if (constraint != null) {
            switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.mLeftToLeft = null;
                    this.mLeftToRight = null;
                    this.mMarginLeft = 0;
                    this.mMarginLeftGone = 0;
                    break;
                case 3:
                case 4:
                    this.mRightToLeft = null;
                    this.mRightToRight = null;
                    this.mMarginRight = 0;
                    this.mMarginRightGone = 0;
                    break;
                case 5:
                case 6:
                    this.mStartToStart = null;
                    this.mStartToEnd = null;
                    this.mMarginStart = 0;
                    this.mMarginStartGone = 0;
                    break;
                case 7:
                case 8:
                    this.mEndToStart = null;
                    this.mEndToEnd = null;
                    this.mMarginEnd = 0;
                    this.mMarginEndGone = 0;
                    break;
                case 9:
                case 10:
                case 11:
                    this.mTopToTop = null;
                    this.mTopToBottom = null;
                    this.mTopToBaseline = null;
                    this.mMarginTop = 0;
                    this.mMarginTopGone = 0;
                    break;
                case 12:
                case 13:
                case 14:
                    this.mBottomToTop = null;
                    this.mBottomToBottom = null;
                    this.mBottomToBaseline = null;
                    this.mMarginBottom = 0;
                    this.mMarginBottomGone = 0;
                    break;
                case 17:
                    this.mBaselineToBaseline = null;
                    break;
                case 18:
                    this.mCircularConstraint = null;
                    break;
            }
        } else {
            clearAll();
        }
        return this;
    }

    public ConstraintReference clearAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("6fab0488", new Object[]{this});
        }
        this.mLeftToLeft = null;
        this.mLeftToRight = null;
        this.mMarginLeft = 0;
        this.mRightToLeft = null;
        this.mRightToRight = null;
        this.mMarginRight = 0;
        this.mStartToStart = null;
        this.mStartToEnd = null;
        this.mMarginStart = 0;
        this.mEndToStart = null;
        this.mEndToEnd = null;
        this.mMarginEnd = 0;
        this.mTopToTop = null;
        this.mTopToBottom = null;
        this.mMarginTop = 0;
        this.mBottomToTop = null;
        this.mBottomToBottom = null;
        this.mMarginBottom = 0;
        this.mBaselineToBaseline = null;
        this.mCircularConstraint = null;
        this.mHorizontalBias = 0.5f;
        this.mVerticalBias = 0.5f;
        this.mMarginLeftGone = 0;
        this.mMarginRightGone = 0;
        this.mMarginStartGone = 0;
        this.mMarginEndGone = 0;
        this.mMarginTopGone = 0;
        this.mMarginBottomGone = 0;
        return this;
    }

    public ConstraintReference clearHorizontal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("dc2a876b", new Object[]{this});
        }
        start().clear();
        end().clear();
        left().clear();
        right().clear();
        return this;
    }

    public ConstraintReference clearVertical() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("8984ee19", new Object[]{this});
        }
        top().clear();
        baseline().clear();
        bottom().clear();
        return this;
    }

    public ConstraintWidget createConstraintWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidget) ipChange.ipc$dispatch("a976d126", new Object[]{this});
        }
        return new ConstraintWidget(getWidth().getValue(), getHeight().getValue());
    }

    public ConstraintReference end() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("9aee4d21", new Object[]{this});
        }
        if (this.mEndToStart != null) {
            this.mLast = State.Constraint.END_TO_START;
        } else {
            this.mLast = State.Constraint.END_TO_END;
        }
        return this;
    }

    public ConstraintReference endToEnd(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("856cd49b", new Object[]{this, obj});
        }
        this.mLast = State.Constraint.END_TO_END;
        this.mEndToEnd = obj;
        return this;
    }

    public ConstraintReference endToStart(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("98d174b4", new Object[]{this, obj});
        }
        this.mLast = State.Constraint.END_TO_START;
        this.mEndToStart = obj;
        return this;
    }

    public float getAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbf8c81f", new Object[]{this})).floatValue();
        }
        return this.mAlpha;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public ConstraintWidget getConstraintWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidget) ipChange.ipc$dispatch("d3c63880", new Object[]{this});
        }
        if (this.mConstraintWidget == null) {
            ConstraintWidget createConstraintWidget = createConstraintWidget();
            this.mConstraintWidget = createConstraintWidget;
            createConstraintWidget.setCompanionWidget(this.mView);
        }
        return this.mConstraintWidget;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Facade getFacade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Facade) ipChange.ipc$dispatch("d208bb78", new Object[]{this});
        }
        return this.mFacade;
    }

    public Dimension getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("22892b27", new Object[]{this});
        }
        return this.mVerticalDimension;
    }

    public int getHorizontalChainStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9be48ea4", new Object[]{this})).intValue();
        }
        return this.mHorizontalChainStyle;
    }

    public float getHorizontalChainWeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("843a3d16", new Object[]{this})).floatValue();
        }
        return this.mHorizontalChainWeight;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Object getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("24024602", new Object[]{this});
        }
        return this.mKey;
    }

    public float getPivotX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3af1ddc3", new Object[]{this})).floatValue();
        }
        return this.mPivotX;
    }

    public float getPivotY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3afff544", new Object[]{this})).floatValue();
        }
        return this.mPivotY;
    }

    public float getRotationX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc08445b", new Object[]{this})).floatValue();
        }
        return this.mRotationX;
    }

    public float getRotationY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc165bdc", new Object[]{this})).floatValue();
        }
        return this.mRotationY;
    }

    public float getRotationZ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc24735d", new Object[]{this})).floatValue();
        }
        return this.mRotationZ;
    }

    public float getScaleX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("606f85bb", new Object[]{this})).floatValue();
        }
        return this.mScaleX;
    }

    public float getScaleY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("607d9d3c", new Object[]{this})).floatValue();
        }
        return this.mScaleY;
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return this.mTag;
    }

    public float getTranslationX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42ed1434", new Object[]{this})).floatValue();
        }
        return this.mTranslationX;
    }

    public float getTranslationY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42fb2bb5", new Object[]{this})).floatValue();
        }
        return this.mTranslationY;
    }

    public float getTranslationZ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43094336", new Object[]{this})).floatValue();
        }
        return this.mTranslationZ;
    }

    public int getVerticalChainStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e95b53", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.mVerticalChainStyle;
    }

    public float getVerticalChainWeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a875de04", new Object[]{this})).floatValue();
        }
        return this.mVerticalChainWeight;
    }

    public Object getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("aeb03d50", new Object[]{this});
        }
        return this.mView;
    }

    public Dimension getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dimension) ipChange.ipc$dispatch("25493454", new Object[]{this});
        }
        return this.mHorizontalDimension;
    }

    public ConstraintReference height(Dimension dimension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("59a1ee80", new Object[]{this, dimension});
        }
        return setHeight(dimension);
    }

    public ConstraintReference horizontalBias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("bfdd9d07", new Object[]{this, new Float(f)});
        }
        this.mHorizontalBias = f;
        return this;
    }

    public ConstraintReference left() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("f1fc575", new Object[]{this});
        }
        if (this.mLeftToLeft != null) {
            this.mLast = State.Constraint.LEFT_TO_LEFT;
        } else {
            this.mLast = State.Constraint.LEFT_TO_RIGHT;
        }
        return this;
    }

    public ConstraintReference leftToLeft(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("97c4e057", new Object[]{this, obj});
        }
        this.mLast = State.Constraint.LEFT_TO_LEFT;
        this.mLeftToLeft = obj;
        return this;
    }

    public ConstraintReference leftToRight(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("e11fa9e6", new Object[]{this, obj});
        }
        this.mLast = State.Constraint.LEFT_TO_RIGHT;
        this.mLeftToRight = obj;
        return this;
    }

    public ConstraintReference margin(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConstraintReference) ipChange.ipc$dispatch("9146fc12", new Object[]{this, obj}) : margin(this.mState.convertDimension(obj));
    }

    public ConstraintReference marginGone(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConstraintReference) ipChange.ipc$dispatch("faf4f073", new Object[]{this, obj}) : marginGone(this.mState.convertDimension(obj));
    }

    public ConstraintReference pivotX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("5f34a2a0", new Object[]{this, new Float(f)});
        }
        this.mPivotX = f;
        return this;
    }

    public ConstraintReference pivotY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("52c426e1", new Object[]{this, new Float(f)});
        }
        this.mPivotY = f;
        return this;
    }

    public ConstraintReference right() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("52ed0b80", new Object[]{this});
        }
        if (this.mRightToLeft != null) {
            this.mLast = State.Constraint.RIGHT_TO_LEFT;
        } else {
            this.mLast = State.Constraint.RIGHT_TO_RIGHT;
        }
        return this;
    }

    public ConstraintReference rightToLeft(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("67b37562", new Object[]{this, obj});
        }
        this.mLast = State.Constraint.RIGHT_TO_LEFT;
        this.mRightToLeft = obj;
        return this;
    }

    public ConstraintReference rightToRight(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("f03b63b", new Object[]{this, obj});
        }
        this.mLast = State.Constraint.RIGHT_TO_RIGHT;
        this.mRightToRight = obj;
        return this;
    }

    public ConstraintReference rotationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("7717e7e4", new Object[]{this, new Float(f)});
        }
        this.mRotationX = f;
        return this;
    }

    public ConstraintReference rotationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("6aa76c25", new Object[]{this, new Float(f)});
        }
        this.mRotationY = f;
        return this;
    }

    public ConstraintReference rotationZ(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("5e36f066", new Object[]{this, new Float(f)});
        }
        this.mRotationZ = f;
        return this;
    }

    public ConstraintReference scaleX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("721e498", new Object[]{this, new Float(f)});
        }
        this.mScaleX = f;
        return this;
    }

    public ConstraintReference scaleY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("fab168d9", new Object[]{this, new Float(f)});
        }
        this.mScaleY = f;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(ConstraintWidget constraintWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c4df308", new Object[]{this, constraintWidget});
        } else if (constraintWidget != null) {
            this.mConstraintWidget = constraintWidget;
            constraintWidget.setCompanionWidget(this.mView);
        }
    }

    public void setFacade(Facade facade) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e7b2eae", new Object[]{this, facade});
            return;
        }
        this.mFacade = facade;
        if (facade != null) {
            setConstraintWidget(facade.getConstraintWidget());
        }
    }

    public ConstraintReference setHeight(Dimension dimension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("c22522be", new Object[]{this, dimension});
        }
        this.mVerticalDimension = dimension;
        return this;
    }

    public void setHorizontalChainStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a7a12e6", new Object[]{this, new Integer(i)});
        } else {
            this.mHorizontalChainStyle = i;
        }
    }

    public void setHorizontalChainWeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cc8566", new Object[]{this, new Float(f)});
        } else {
            this.mHorizontalChainWeight = f;
        }
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setKey(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62eaf380", new Object[]{this, obj});
        } else {
            this.mKey = obj;
        }
    }

    public void setTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9be069", new Object[]{this, str});
        } else {
            this.mTag = str;
        }
    }

    public void setVerticalChainStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1940d4", new Object[]{this, new Integer(i)});
        } else {
            this.mVerticalChainStyle = i;
        }
    }

    public void setVerticalChainWeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16131538", new Object[]{this, new Float(f)});
        } else {
            this.mVerticalChainWeight = f;
        }
    }

    public void setView(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3ee438a", new Object[]{this, obj});
            return;
        }
        this.mView = obj;
        ConstraintWidget constraintWidget = this.mConstraintWidget;
        if (constraintWidget != null) {
            constraintWidget.setCompanionWidget(obj);
        }
    }

    public ConstraintReference setWidth(Dimension dimension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("54228c43", new Object[]{this, dimension});
        }
        this.mHorizontalDimension = dimension;
        return this;
    }

    public ConstraintReference start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("a1abcefa", new Object[]{this});
        }
        if (this.mStartToStart != null) {
            this.mLast = State.Constraint.START_TO_START;
        } else {
            this.mLast = State.Constraint.START_TO_END;
        }
        return this;
    }

    public ConstraintReference startToEnd(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("a0604ea2", new Object[]{this, obj});
        }
        this.mLast = State.Constraint.START_TO_END;
        this.mStartToEnd = obj;
        return this;
    }

    public ConstraintReference startToStart(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("c4ce88fb", new Object[]{this, obj});
        }
        this.mLast = State.Constraint.START_TO_START;
        this.mStartToStart = obj;
        return this;
    }

    public ConstraintReference top() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("e91a46e7", new Object[]{this});
        }
        if (this.mTopToTop != null) {
            this.mLast = State.Constraint.TOP_TO_TOP;
        } else {
            this.mLast = State.Constraint.TOP_TO_BOTTOM;
        }
        return this;
    }

    public ConstraintReference topToBaseline(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("65d39cb", new Object[]{this, obj});
        }
        this.mLast = State.Constraint.TOP_TO_BASELINE;
        this.mTopToBaseline = obj;
        return this;
    }

    public ConstraintReference topToBottom(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("8fffb925", new Object[]{this, obj});
        }
        this.mLast = State.Constraint.TOP_TO_BOTTOM;
        this.mTopToBottom = obj;
        return this;
    }

    public ConstraintReference topToTop(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("e854905b", new Object[]{this, obj});
        }
        this.mLast = State.Constraint.TOP_TO_TOP;
        this.mTopToTop = obj;
        return this;
    }

    public ConstraintReference translationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("402a6a51", new Object[]{this, new Float(f)});
        }
        this.mTranslationX = f;
        return this;
    }

    public ConstraintReference translationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("33b9ee92", new Object[]{this, new Float(f)});
        }
        this.mTranslationY = f;
        return this;
    }

    public ConstraintReference translationZ(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("274972d3", new Object[]{this, new Float(f)});
        }
        this.mTranslationZ = f;
        return this;
    }

    public void validate() throws IncorrectConstraintException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4060229d", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!(this.mLeftToLeft == null || this.mLeftToRight == null)) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (!(this.mRightToLeft == null || this.mRightToRight == null)) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (!(this.mStartToStart == null || this.mStartToEnd == null)) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (!(this.mEndToStart == null || this.mEndToEnd == null)) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if (!((this.mLeftToLeft == null && this.mLeftToRight == null && this.mRightToLeft == null && this.mRightToRight == null) || (this.mStartToStart == null && this.mStartToEnd == null && this.mEndToStart == null && this.mEndToEnd == null))) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new IncorrectConstraintException(arrayList);
        }
    }

    public ConstraintReference verticalBias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("63b5bd9", new Object[]{this, new Float(f)});
        }
        this.mVerticalBias = f;
        return this;
    }

    public ConstraintReference visibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("12ff4a79", new Object[]{this, new Integer(i)});
        }
        this.mVisibility = i;
        return this;
    }

    public ConstraintReference width(Dimension dimension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("b3dc4041", new Object[]{this, dimension});
        }
        return setWidth(dimension);
    }

    public ConstraintReference margin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("275a8415", new Object[]{this, new Integer(i)});
        }
        State.Constraint constraint = this.mLast;
        if (constraint != null) {
            switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.mMarginLeft = i;
                    break;
                case 3:
                case 4:
                    this.mMarginRight = i;
                    break;
                case 5:
                case 6:
                    this.mMarginStart = i;
                    break;
                case 7:
                case 8:
                    this.mMarginEnd = i;
                    break;
                case 9:
                case 10:
                case 11:
                    this.mMarginTop = i;
                    break;
                case 12:
                case 13:
                case 14:
                    this.mMarginBottom = i;
                    break;
                case 15:
                case 16:
                case 17:
                    this.mMarginBaseline = i;
                    break;
                case 18:
                    this.mCircularDistance = i;
                    break;
            }
        } else {
            this.mMarginLeft = i;
            this.mMarginRight = i;
            this.mMarginStart = i;
            this.mMarginEnd = i;
            this.mMarginTop = i;
            this.mMarginBottom = i;
        }
        return this;
    }

    public ConstraintReference marginGone(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintReference) ipChange.ipc$dispatch("5768dd94", new Object[]{this, new Integer(i)});
        }
        State.Constraint constraint = this.mLast;
        if (constraint != null) {
            switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.mMarginLeftGone = i;
                    break;
                case 3:
                case 4:
                    this.mMarginRightGone = i;
                    break;
                case 5:
                case 6:
                    this.mMarginStartGone = i;
                    break;
                case 7:
                case 8:
                    this.mMarginEndGone = i;
                    break;
                case 9:
                case 10:
                case 11:
                    this.mMarginTopGone = i;
                    break;
                case 12:
                case 13:
                case 14:
                    this.mMarginBottomGone = i;
                    break;
                case 15:
                case 16:
                case 17:
                    this.mMarginBaselineGone = i;
                    break;
            }
        } else {
            this.mMarginLeftGone = i;
            this.mMarginRightGone = i;
            this.mMarginStartGone = i;
            this.mMarginEndGone = i;
            this.mMarginTopGone = i;
            this.mMarginBottomGone = i;
        }
        return this;
    }
}
