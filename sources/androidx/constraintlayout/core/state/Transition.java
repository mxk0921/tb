package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.Transition;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.cc5;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Transition implements TypedValues {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ANTICIPATE = 6;
    public static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    public static final int EASE_IN = 1;
    public static final int EASE_IN_OUT = 0;
    public static final int EASE_OUT = 2;
    public static final int END = 1;
    public static final int INTERPOLATED = 2;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    public static final int LINEAR = 3;
    public static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    public static final int START = 0;
    public int mParentEndHeight;
    public int mParentEndWidth;
    public int mParentInterpolateHeight;
    public int mParentInterpolatedWidth;
    public int mParentStartHeight;
    public int mParentStartWidth;
    public final CorePixelDp mToPixel;
    public boolean mWrap;
    private HashMap<Integer, HashMap<String, KeyPosition>> mKeyPositions = new HashMap<>();
    private HashMap<String, WidgetState> mState = new HashMap<>();
    private TypedBundle mBundle = new TypedBundle();
    private int mDefaultInterpolator = 0;
    private String mDefaultInterpolatorString = null;
    private Easing mEasing = null;
    private int mAutoTransition = 0;
    private int mDuration = 400;
    private float mStagger = 0.0f;
    private OnSwipe mOnSwipe = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class KeyPosition {
        public int mFrame;
        public String mTarget;
        public int mType;
        public float mX;
        public float mY;

        public KeyPosition(String str, int i, int i2, float f, float f2) {
            this.mTarget = str;
            this.mFrame = i;
            this.mType = i2;
            this.mX = f;
            this.mY = f2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class WidgetState {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Motion mMotionControl;
        public boolean mNeedSetup = true;
        public KeyCache mKeyCache = new KeyCache();
        public int mParentHeight = -1;
        public int mParentWidth = -1;
        public WidgetFrame mStart = new WidgetFrame();
        public WidgetFrame mEnd = new WidgetFrame();
        public WidgetFrame mInterpolated = new WidgetFrame();
        public MotionWidget mMotionWidgetStart = new MotionWidget(this.mStart);
        public MotionWidget mMotionWidgetEnd = new MotionWidget(this.mEnd);
        public MotionWidget mMotionWidgetInterpolated = new MotionWidget(this.mInterpolated);

        public WidgetState() {
            Motion motion = new Motion(this.mMotionWidgetStart);
            this.mMotionControl = motion;
            motion.setStart(this.mMotionWidgetStart);
            this.mMotionControl.setEnd(this.mMotionWidgetEnd);
        }

        public String getPathRelativeId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("613dc037", new Object[]{this});
            }
            return this.mMotionControl.getAnimateRelativeTo();
        }

        public void setKeyAttribute(TypedBundle typedBundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77e57598", new Object[]{this, typedBundle});
                return;
            }
            MotionKeyAttributes motionKeyAttributes = new MotionKeyAttributes();
            typedBundle.applyDelta(motionKeyAttributes);
            this.mMotionControl.addKey(motionKeyAttributes);
        }

        public void setKeyCycle(TypedBundle typedBundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b916920e", new Object[]{this, typedBundle});
                return;
            }
            MotionKeyCycle motionKeyCycle = new MotionKeyCycle();
            typedBundle.applyDelta(motionKeyCycle);
            this.mMotionControl.addKey(motionKeyCycle);
        }

        public void setKeyPosition(TypedBundle typedBundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42d28c91", new Object[]{this, typedBundle});
                return;
            }
            MotionKeyPosition motionKeyPosition = new MotionKeyPosition();
            typedBundle.applyDelta(motionKeyPosition);
            this.mMotionControl.addKey(motionKeyPosition);
        }

        public void setPathRelative(WidgetState widgetState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc5e28fd", new Object[]{this, widgetState});
            } else {
                this.mMotionControl.setupRelative(widgetState.mMotionControl);
            }
        }

        public void update(ConstraintWidget constraintWidget, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("892de441", new Object[]{this, constraintWidget, new Integer(i)});
                return;
            }
            if (i == 0) {
                this.mStart.update(constraintWidget);
                MotionWidget motionWidget = this.mMotionWidgetStart;
                motionWidget.updateMotion(motionWidget);
                this.mMotionControl.setStart(this.mMotionWidgetStart);
                this.mNeedSetup = true;
            } else if (i == 1) {
                this.mEnd.update(constraintWidget);
                this.mMotionControl.setEnd(this.mMotionWidgetEnd);
                this.mNeedSetup = true;
            }
            this.mParentWidth = -1;
        }

        public WidgetFrame getFrame(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WidgetFrame) ipChange.ipc$dispatch("f6c3b123", new Object[]{this, new Integer(i)});
            }
            if (i == 0) {
                return this.mStart;
            }
            if (i == 1) {
                return this.mEnd;
            }
            return this.mInterpolated;
        }

        public void interpolate(int i, int i2, float f, Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3d90188", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), transition});
                return;
            }
            this.mParentHeight = i2;
            this.mParentWidth = i;
            if (this.mNeedSetup) {
                this.mMotionControl.setup(i, i2, 1.0f, System.nanoTime());
                this.mNeedSetup = false;
            }
            WidgetFrame.interpolate(i, i2, this.mInterpolated, this.mStart, this.mEnd, transition, f);
            this.mInterpolated.interpolatedPos = f;
            this.mMotionControl.interpolate(this.mMotionWidgetInterpolated, f, System.nanoTime(), this.mKeyCache);
        }

        public void setKeyAttribute(TypedBundle typedBundle, CustomVariable[] customVariableArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3356bd4", new Object[]{this, typedBundle, customVariableArr});
                return;
            }
            MotionKeyAttributes motionKeyAttributes = new MotionKeyAttributes();
            typedBundle.applyDelta(motionKeyAttributes);
            if (customVariableArr != null) {
                for (int i = 0; i < customVariableArr.length; i++) {
                    motionKeyAttributes.mCustom.put(customVariableArr[i].getName(), customVariableArr[i]);
                }
            }
            this.mMotionControl.addKey(motionKeyAttributes);
        }
    }

    public Transition(CorePixelDp corePixelDp) {
        this.mToPixel = corePixelDp;
    }

    private void calculateParentDimensions(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a9a9a9c", new Object[]{this, new Float(f)});
            return;
        }
        int i = this.mParentStartWidth;
        this.mParentInterpolatedWidth = (int) (i + 0.5f + ((this.mParentEndWidth - i) * f));
        int i2 = this.mParentStartHeight;
        this.mParentInterpolateHeight = (int) (i2 + 0.5f + ((this.mParentEndHeight - i2) * f));
    }

    public static Interpolator getInterpolator(int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("1f0da867", new Object[]{new Integer(i), str});
        }
        switch (i) {
            case -1:
                return new Interpolator() { // from class: tb.eeu
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        float lambda$getInterpolator$0;
                        lambda$getInterpolator$0 = Transition.lambda$getInterpolator$0(str, f);
                        return lambda$getInterpolator$0;
                    }
                };
            case 0:
                return new Interpolator() { // from class: tb.feu
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        float lambda$getInterpolator$1;
                        lambda$getInterpolator$1 = Transition.lambda$getInterpolator$1(f);
                        return lambda$getInterpolator$1;
                    }
                };
            case 1:
                return new Interpolator() { // from class: tb.geu
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        float lambda$getInterpolator$2;
                        lambda$getInterpolator$2 = Transition.lambda$getInterpolator$2(f);
                        return lambda$getInterpolator$2;
                    }
                };
            case 2:
                return new Interpolator() { // from class: tb.heu
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        float lambda$getInterpolator$3;
                        lambda$getInterpolator$3 = Transition.lambda$getInterpolator$3(f);
                        return lambda$getInterpolator$3;
                    }
                };
            case 3:
                return new Interpolator() { // from class: tb.ieu
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        float lambda$getInterpolator$4;
                        lambda$getInterpolator$4 = Transition.lambda$getInterpolator$4(f);
                        return lambda$getInterpolator$4;
                    }
                };
            case 4:
                return new Interpolator() { // from class: tb.leu
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        float lambda$getInterpolator$7;
                        lambda$getInterpolator$7 = Transition.lambda$getInterpolator$7(f);
                        return lambda$getInterpolator$7;
                    }
                };
            case 5:
                return new Interpolator() { // from class: tb.keu
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        float lambda$getInterpolator$6;
                        lambda$getInterpolator$6 = Transition.lambda$getInterpolator$6(f);
                        return lambda$getInterpolator$6;
                    }
                };
            case 6:
                return new Interpolator() { // from class: tb.jeu
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        float lambda$getInterpolator$5;
                        lambda$getInterpolator$5 = Transition.lambda$getInterpolator$5(f);
                        return lambda$getInterpolator$5;
                    }
                };
            default:
                return null;
        }
    }

    private WidgetState getWidgetState(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WidgetState) ipChange.ipc$dispatch("3d5ad88f", new Object[]{this, str}) : this.mState.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$0(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d58d4d3", new Object[]{str, new Float(f)})).floatValue();
        }
        return (float) Easing.getInterpolator(str).get(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$1(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa4c9f3c", new Object[]{new Float(f)})).floatValue();
        }
        return (float) Easing.getInterpolator("standard").get(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$2(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc0177db", new Object[]{new Float(f)})).floatValue();
        }
        return (float) Easing.getInterpolator("accelerate").get(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$3(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fdb6507a", new Object[]{new Float(f)})).floatValue();
        }
        return (float) Easing.getInterpolator("decelerate").get(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$4(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff6b2919", new Object[]{new Float(f)})).floatValue();
        }
        return (float) Easing.getInterpolator("linear").get(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$5(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("12001b8", new Object[]{new Float(f)})).floatValue();
        }
        return (float) Easing.getInterpolator("anticipate").get(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$6(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d4da57", new Object[]{new Float(f)})).floatValue();
        }
        return (float) Easing.getInterpolator("overshoot").get(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$7(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("489b2f6", new Object[]{new Float(f)})).floatValue();
        }
        return (float) Easing.getInterpolator("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").get(f);
    }

    public void addCustomColor(int i, String str, String str2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcdf0864", new Object[]{this, new Integer(i), str, str2, new Integer(i2)});
        } else {
            getWidgetState(str, null, i).getFrame(i).addCustomColor(str2, i2);
        }
    }

    public void addCustomFloat(int i, String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25e28da", new Object[]{this, new Integer(i), str, str2, new Float(f)});
        } else {
            getWidgetState(str, null, i).getFrame(i).addCustomFloat(str2, f);
        }
    }

    public void addKeyAttribute(String str, TypedBundle typedBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b69cef", new Object[]{this, str, typedBundle});
        } else {
            getWidgetState(str, null, 0).setKeyAttribute(typedBundle);
        }
    }

    public void addKeyCycle(String str, TypedBundle typedBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62d12065", new Object[]{this, str, typedBundle});
        } else {
            getWidgetState(str, null, 0).setKeyCycle(typedBundle);
        }
    }

    public void addKeyPosition(String str, TypedBundle typedBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3f9ec6", new Object[]{this, str, typedBundle});
        } else {
            getWidgetState(str, null, 0).setKeyPosition(typedBundle);
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.mState.clear();
        }
    }

    public boolean contains(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue();
        }
        return this.mState.containsKey(str);
    }

    public OnSwipe createOnSwipe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("1122ef1f", new Object[]{this});
        }
        OnSwipe onSwipe = new OnSwipe();
        this.mOnSwipe = onSwipe;
        return onSwipe;
    }

    public float dragToProgress(float f, int i, int i2, float f2, float f3) {
        WidgetState widgetState;
        float f4;
        float scale;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6e17d4d", new Object[]{this, new Float(f), new Integer(i), new Integer(i2), new Float(f2), new Float(f3)})).floatValue();
        }
        Iterator<WidgetState> it = this.mState.values().iterator();
        if (it.hasNext()) {
            widgetState = it.next();
        } else {
            widgetState = null;
        }
        OnSwipe onSwipe = this.mOnSwipe;
        if (onSwipe != null && widgetState != null) {
            String str = onSwipe.mAnchorId;
            if (str == null) {
                float[] direction = onSwipe.getDirection();
                int i3 = widgetState.mParentHeight;
                float f5 = i3;
                float f6 = i3;
                float f7 = direction[0];
                if (f7 != 0.0f) {
                    f4 = (f2 * Math.abs(f7)) / f5;
                } else {
                    f4 = (f3 * Math.abs(direction[1])) / f6;
                }
                scale = this.mOnSwipe.getScale();
            } else {
                WidgetState widgetState2 = this.mState.get(str);
                float[] direction2 = this.mOnSwipe.getDirection();
                float[] side = this.mOnSwipe.getSide();
                float[] fArr = new float[2];
                widgetState2.interpolate(i, i2, f, this);
                widgetState2.mMotionControl.getDpDt(f, side[0], side[1], fArr);
                float f8 = direction2[0];
                if (f8 != 0.0f) {
                    f4 = (f2 * Math.abs(f8)) / fArr[0];
                } else {
                    f4 = (f3 * Math.abs(direction2[1])) / fArr[1];
                }
                scale = this.mOnSwipe.getScale();
            }
            return f4 * scale;
        } else if (widgetState != null) {
            return (-f3) / widgetState.mParentHeight;
        } else {
            return 1.0f;
        }
    }

    public KeyPosition findNextPosition(String str, int i) {
        KeyPosition keyPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KeyPosition) ipChange.ipc$dispatch("53d62909", new Object[]{this, str, new Integer(i)});
        }
        while (i <= 100) {
            HashMap<String, KeyPosition> hashMap = this.mKeyPositions.get(Integer.valueOf(i));
            if (hashMap != null && (keyPosition = hashMap.get(str)) != null) {
                return keyPosition;
            }
            i++;
        }
        return null;
    }

    public KeyPosition findPreviousPosition(String str, int i) {
        KeyPosition keyPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KeyPosition) ipChange.ipc$dispatch("dc335b05", new Object[]{this, str, new Integer(i)});
        }
        while (i >= 0) {
            HashMap<String, KeyPosition> hashMap = this.mKeyPositions.get(Integer.valueOf(i));
            if (hashMap != null && (keyPosition = hashMap.get(str)) != null) {
                return keyPosition;
            }
            i--;
        }
        return null;
    }

    public int getAutoTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5482cd4", new Object[]{this})).intValue();
        }
        return this.mAutoTransition;
    }

    public WidgetFrame getEnd(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetFrame) ipChange.ipc$dispatch("84b8f4d2", new Object[]{this, str});
        }
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.mEnd;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eeb42d5", new Object[]{this, str})).intValue();
        }
        return 0;
    }

    public WidgetFrame getInterpolated(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetFrame) ipChange.ipc$dispatch("ce6badfe", new Object[]{this, str});
        }
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.mInterpolated;
    }

    public int getInterpolatedHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e707cfa", new Object[]{this})).intValue();
        }
        return this.mParentInterpolateHeight;
    }

    public int getInterpolatedWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d33bcd47", new Object[]{this})).intValue();
        }
        return this.mParentInterpolatedWidth;
    }

    public int getKeyFrames(String str, float[] fArr, int[] iArr, int[] iArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8613f35a", new Object[]{this, str, fArr, iArr, iArr2})).intValue();
        }
        return this.mState.get(str).mMotionControl.buildKeyFrames(fArr, iArr, iArr2);
    }

    public Motion getMotion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Motion) ipChange.ipc$dispatch("9e322c87", new Object[]{this, str});
        }
        return getWidgetState(str, null, 0).mMotionControl;
    }

    public int getNumberKeyPositions(WidgetFrame widgetFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a434996", new Object[]{this, widgetFrame})).intValue();
        }
        int i = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            HashMap<String, KeyPosition> hashMap = this.mKeyPositions.get(Integer.valueOf(i2));
            if (!(hashMap == null || hashMap.get(widgetFrame.widget.stringId) == null)) {
                i++;
            }
        }
        return i;
    }

    public float[] getPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("98744d75", new Object[]{this, str});
        }
        float[] fArr = new float[124];
        this.mState.get(str).mMotionControl.buildPath(fArr, 62);
        return fArr;
    }

    public WidgetFrame getStart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetFrame) ipChange.ipc$dispatch("cdc295eb", new Object[]{this, str});
        }
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.mStart;
    }

    public float getTouchUpProgress(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ddc595c", new Object[]{this, new Long(j)})).floatValue();
        }
        OnSwipe onSwipe = this.mOnSwipe;
        if (onSwipe != null) {
            return onSwipe.getTouchUpProgress(j);
        }
        return 0.0f;
    }

    public boolean hasOnSwipe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53bc24ac", new Object[]{this})).booleanValue();
        }
        if (this.mOnSwipe != null) {
            return true;
        }
        return false;
    }

    public boolean hasPositionKeyframes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d7f7cad", new Object[]{this})).booleanValue();
        }
        if (this.mKeyPositions.size() > 0) {
            return true;
        }
        return false;
    }

    public void interpolate(int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b89a158", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)});
            return;
        }
        if (this.mWrap) {
            calculateParentDimensions(f);
        }
        Easing easing = this.mEasing;
        if (easing != null) {
            f = (float) easing.get(f);
        }
        for (String str : this.mState.keySet()) {
            this.mState.get(str).interpolate(i, i2, f, this);
        }
    }

    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.mState.isEmpty();
    }

    public boolean isTouchNotDone(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acf15d1d", new Object[]{this, new Float(f)})).booleanValue();
        }
        return this.mOnSwipe.isNotDone(f);
    }

    public void resetProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1f3369", new Object[]{this});
            return;
        }
        this.mOnSwipe = null;
        this.mBundle.clear();
    }

    public void setTouchUp(float f, long j, float f2, float f3) {
        float f4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb5de83", new Object[]{this, new Float(f), new Long(j), new Float(f2), new Float(f3)});
            return;
        }
        OnSwipe onSwipe = this.mOnSwipe;
        if (onSwipe != null) {
            float[] fArr = new float[2];
            float[] direction = this.mOnSwipe.getDirection();
            float[] side = this.mOnSwipe.getSide();
            this.mState.get(onSwipe.mAnchorId).mMotionControl.getDpDt(f, side[0], side[1], fArr);
            if (Math.abs((direction[0] * fArr[0]) + (direction[1] * fArr[1])) < 0.01d) {
                fArr[0] = 0.01f;
                fArr[1] = 0.01f;
            }
            if (direction[0] != 0.0f) {
                f4 = f2 / fArr[0];
            } else {
                f4 = f3 / fArr[1];
            }
            this.mOnSwipe.config(f, f4 * this.mOnSwipe.getScale(), j, this.mDuration * 0.001f);
        }
    }

    public void setTransitionProperties(TypedBundle typedBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a09160d", new Object[]{this, typedBundle});
            return;
        }
        typedBundle.applyDelta(this.mBundle);
        typedBundle.applyDelta(this);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ec921a", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return false;
    }

    public void updateFrom(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4eb24c", new Object[]{this, constraintWidgetContainer, new Integer(i)});
            return;
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidgetContainer.mListDimensionBehaviors;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour == dimensionBehaviour2) {
            z = true;
        } else {
            z = false;
        }
        this.mWrap = z;
        if (dimensionBehaviourArr[1] == dimensionBehaviour2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mWrap = z2 | z;
        if (i == 0) {
            int width = constraintWidgetContainer.getWidth();
            this.mParentStartWidth = width;
            this.mParentInterpolatedWidth = width;
            int height = constraintWidgetContainer.getHeight();
            this.mParentStartHeight = height;
            this.mParentInterpolateHeight = height;
        } else {
            this.mParentEndWidth = constraintWidgetContainer.getWidth();
            this.mParentEndHeight = constraintWidgetContainer.getHeight();
        }
        ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        WidgetState[] widgetStateArr = new WidgetState[size];
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = children.get(i2);
            WidgetState widgetState = getWidgetState(constraintWidget.stringId, null, i);
            widgetStateArr[i2] = widgetState;
            widgetState.update(constraintWidget, i);
            String pathRelativeId = widgetState.getPathRelativeId();
            if (pathRelativeId != null) {
                widgetState.setPathRelative(getWidgetState(pathRelativeId, null, i));
            }
        }
        calcStagger();
    }

    public void addKeyAttribute(String str, TypedBundle typedBundle, CustomVariable[] customVariableArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5a8e9d", new Object[]{this, str, typedBundle, customVariableArr});
        } else {
            getWidgetState(str, null, 0).setKeyAttribute(typedBundle, customVariableArr);
        }
    }

    public void addKeyPosition(String str, int i, int i2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de53acf8", new Object[]{this, str, new Integer(i), new Integer(i2), new Float(f), new Float(f2)});
            return;
        }
        TypedBundle typedBundle = new TypedBundle();
        typedBundle.add(TypedValues.PositionType.TYPE_POSITION_TYPE, 2);
        typedBundle.add(100, i);
        typedBundle.add(506, f);
        typedBundle.add(507, f2);
        getWidgetState(str, null, 0).setKeyPosition(typedBundle);
        KeyPosition keyPosition = new KeyPosition(str, i, i2, f, f2);
        HashMap<String, KeyPosition> hashMap = this.mKeyPositions.get(Integer.valueOf(i));
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.mKeyPositions.put(Integer.valueOf(i), hashMap);
        }
        hashMap.put(str, keyPosition);
    }

    public WidgetState getWidgetState(String str, ConstraintWidget constraintWidget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetState) ipChange.ipc$dispatch("3787fe80", new Object[]{this, str, constraintWidget, new Integer(i)});
        }
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            widgetState = new WidgetState();
            this.mBundle.applyDelta(widgetState.mMotionControl);
            widgetState.mMotionWidgetStart.updateMotion(widgetState.mMotionControl);
            this.mState.put(str, widgetState);
            if (constraintWidget != null) {
                widgetState.update(constraintWidget, i);
            }
        }
        return widgetState;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ecd1eb", new Object[]{this, new Integer(i), new Boolean(z)})).booleanValue();
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class OnSwipe {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int ANCHOR_SIDE_BOTTOM = 3;
        public static final int ANCHOR_SIDE_END = 6;
        public static final int ANCHOR_SIDE_LEFT = 1;
        public static final int ANCHOR_SIDE_MIDDLE = 4;
        public static final int ANCHOR_SIDE_RIGHT = 2;
        public static final int ANCHOR_SIDE_START = 5;
        public static final int ANCHOR_SIDE_TOP = 0;
        public static final int BOUNDARY_BOUNCE_BOTH = 3;
        public static final int BOUNDARY_BOUNCE_END = 2;
        public static final int BOUNDARY_BOUNCE_START = 1;
        public static final int BOUNDARY_OVERSHOOT = 0;
        public static final int DRAG_ANTICLOCKWISE = 7;
        public static final int DRAG_CLOCKWISE = 6;
        public static final int DRAG_DOWN = 1;
        public static final int DRAG_END = 5;
        public static final int DRAG_LEFT = 2;
        public static final int DRAG_RIGHT = 3;
        public static final int DRAG_START = 4;
        public static final int DRAG_UP = 0;
        public static final int MODE_CONTINUOUS_VELOCITY = 0;
        public static final int MODE_SPRING = 1;
        public static final int ON_UP_AUTOCOMPLETE = 0;
        public static final int ON_UP_AUTOCOMPLETE_TO_END = 2;
        public static final int ON_UP_AUTOCOMPLETE_TO_START = 1;
        public static final int ON_UP_DECELERATE = 4;
        public static final int ON_UP_DECELERATE_AND_COMPLETE = 5;
        public static final int ON_UP_NEVER_COMPLETE_TO_END = 7;
        public static final int ON_UP_NEVER_COMPLETE_TO_START = 6;
        public static final int ON_UP_STOP = 3;
        public String mAnchorId;
        private int mAnchorSide;
        private StopEngine mEngine;
        public String mLimitBoundsTo;
        private String mRotationCenterId;
        private long mStart;
        public static final String[] SIDES = {"top", "left", "right", "bottom", "middle", "start", "end"};
        private static final float[][] TOUCH_SIDES = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
        public static final String[] DIRECTIONS = {"up", "down", "left", "right", "start", "end", "clockwise", "anticlockwise"};
        public static final String[] MODE = {"velocity", cc5.SPRING_SPEC};
        public static final String[] TOUCH_UP = {"autocomplete", "toStart", "toEnd", "stop", "decelerate", "decelerateComplete", "neverCompleteStart", "neverCompleteEnd"};
        public static final String[] BOUNDARY = {"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};
        private static final float[][] TOUCH_DIRECTION = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
        private boolean mDragVertical = true;
        private int mDragDirection = 0;
        private float mDragScale = 1.0f;
        private float mDragThreshold = 10.0f;
        private int mAutoCompleteMode = 0;
        private float mMaxVelocity = 4.0f;
        private float mMaxAcceleration = 1.2f;
        private int mOnTouchUp = 0;
        private float mSpringMass = 1.0f;
        private float mSpringStiffness = 400.0f;
        private float mSpringDamping = 10.0f;
        private float mSpringStopThreshold = 0.01f;
        private float mDestination = 0.0f;
        private int mSpringBoundary = 0;

        public void config(float f, float f2, long j, float f3) {
            SpringStopEngine springStopEngine;
            StopLogicEngine stopLogicEngine;
            StopLogicEngine.Decelerate decelerate;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a890cbc5", new Object[]{this, new Float(f), new Float(f2), new Long(j), new Float(f3)});
                return;
            }
            this.mStart = j;
            float abs = Math.abs(f2);
            float f4 = this.mMaxVelocity;
            if (abs > f4) {
                f2 = Math.signum(f2) * f4;
            }
            float destinationPosition = getDestinationPosition(f, f2, f3);
            this.mDestination = destinationPosition;
            if (destinationPosition == f) {
                this.mEngine = null;
            } else if (this.mOnTouchUp == 4 && this.mAutoCompleteMode == 0) {
                StopEngine stopEngine = this.mEngine;
                if (stopEngine instanceof StopLogicEngine.Decelerate) {
                    decelerate = (StopLogicEngine.Decelerate) stopEngine;
                } else {
                    decelerate = new StopLogicEngine.Decelerate();
                    this.mEngine = decelerate;
                }
                decelerate.config(f, this.mDestination, f2);
            } else if (this.mAutoCompleteMode == 0) {
                StopEngine stopEngine2 = this.mEngine;
                if (stopEngine2 instanceof StopLogicEngine) {
                    stopLogicEngine = (StopLogicEngine) stopEngine2;
                } else {
                    stopLogicEngine = new StopLogicEngine();
                    this.mEngine = stopLogicEngine;
                }
                stopLogicEngine.config(f, this.mDestination, f2, f3, this.mMaxAcceleration, this.mMaxVelocity);
            } else {
                StopEngine stopEngine3 = this.mEngine;
                if (stopEngine3 instanceof SpringStopEngine) {
                    springStopEngine = (SpringStopEngine) stopEngine3;
                } else {
                    springStopEngine = new SpringStopEngine();
                    this.mEngine = springStopEngine;
                }
                springStopEngine.springConfig(f, this.mDestination, f2, this.mSpringMass, this.mSpringStiffness, this.mSpringDamping, this.mSpringStopThreshold, this.mSpringBoundary);
            }
        }

        public float getDestinationPosition(float f, float f2, float f3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d4cf6288", new Object[]{this, new Float(f), new Float(f2), new Float(f3)})).floatValue();
            }
            float abs = (((Math.abs(f2) * 0.5f) * f2) / this.mMaxAcceleration) + f;
            switch (this.mOnTouchUp) {
                case 1:
                    return f >= 1.0f ? 1.0f : 0.0f;
                case 2:
                    return f <= 0.0f ? 0.0f : 1.0f;
                case 3:
                    return Float.NaN;
                case 4:
                    return Math.max(0.0f, Math.min(1.0f, abs));
                case 5:
                    return (abs <= 0.2f || abs >= 0.8f) ? abs > 0.5f ? 1.0f : 0.0f : abs;
                case 6:
                    return 1.0f;
                case 7:
                    return 0.0f;
                default:
                    return ((double) abs) > 0.5d ? 1.0f : 0.0f;
            }
        }

        public float[] getDirection() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("1936aa11", new Object[]{this});
            }
            return TOUCH_DIRECTION[this.mDragDirection];
        }

        public float getScale() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8f6c4a0b", new Object[]{this})).floatValue();
            }
            return this.mDragScale;
        }

        public float[] getSide() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("8e6a5f8d", new Object[]{this});
            }
            return TOUCH_SIDES[this.mAnchorSide];
        }

        public float getTouchUpProgress(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7ddc595c", new Object[]{this, new Long(j)})).floatValue();
            }
            float interpolation = this.mEngine.getInterpolation(((float) (j - this.mStart)) * 1.0E-9f);
            if (this.mEngine.isStopped()) {
                return this.mDestination;
            }
            return interpolation;
        }

        public boolean isNotDone(float f) {
            StopEngine stopEngine;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("38171692", new Object[]{this, new Float(f)})).booleanValue();
            }
            if (this.mOnTouchUp == 3 || (stopEngine = this.mEngine) == null || stopEngine.isStopped()) {
                return false;
            }
            return true;
        }

        public void printInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2ffc02", new Object[]{this});
            } else if (this.mAutoCompleteMode == 0) {
                PrintStream printStream = System.out;
                printStream.println("velocity = " + this.mEngine.getVelocity());
                printStream.println("mMaxAcceleration = " + this.mMaxAcceleration);
                printStream.println("mMaxVelocity = " + this.mMaxVelocity);
            } else {
                PrintStream printStream2 = System.out;
                printStream2.println("mSpringMass          = " + this.mSpringMass);
                printStream2.println("mSpringStiffness     = " + this.mSpringStiffness);
                printStream2.println("mSpringDamping       = " + this.mSpringDamping);
                printStream2.println("mSpringStopThreshold = " + this.mSpringStopThreshold);
                printStream2.println("mSpringBoundary      = " + this.mSpringBoundary);
            }
        }

        public void setAnchorId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6bc7fa43", new Object[]{this, str});
            } else {
                this.mAnchorId = str;
            }
        }

        public void setAnchorSide(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efcc646e", new Object[]{this, new Integer(i)});
            } else {
                this.mAnchorSide = i;
            }
        }

        public void setAutoCompleteMode(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("665c2d2f", new Object[]{this, new Integer(i)});
            } else {
                this.mAutoCompleteMode = i;
            }
        }

        public void setDragScale(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e08bf665", new Object[]{this, new Float(f)});
            } else if (!Float.isNaN(f)) {
                this.mDragScale = f;
            }
        }

        public void setDragThreshold(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ddb4ce4", new Object[]{this, new Float(f)});
            } else if (!Float.isNaN(f)) {
                this.mDragThreshold = f;
            }
        }

        public void setLimitBoundsTo(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e75357a", new Object[]{this, str});
            } else {
                this.mLimitBoundsTo = str;
            }
        }

        public void setMaxAcceleration(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b676a17", new Object[]{this, new Float(f)});
            } else if (!Float.isNaN(f)) {
                this.mMaxAcceleration = f;
            }
        }

        public void setMaxVelocity(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3b322da", new Object[]{this, new Float(f)});
            } else if (!Float.isNaN(f)) {
                this.mMaxVelocity = f;
            }
        }

        public void setOnTouchUp(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b926fde3", new Object[]{this, new Integer(i)});
            } else {
                this.mOnTouchUp = i;
            }
        }

        public void setRotationCenterId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8236ed01", new Object[]{this, str});
            } else {
                this.mRotationCenterId = str;
            }
        }

        public void setSpringBoundary(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("755a68a3", new Object[]{this, new Integer(i)});
            } else {
                this.mSpringBoundary = i;
            }
        }

        public void setSpringDamping(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f40e1706", new Object[]{this, new Float(f)});
            } else if (!Float.isNaN(f)) {
                this.mSpringDamping = f;
            }
        }

        public void setSpringMass(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b052d56", new Object[]{this, new Float(f)});
            } else if (!Float.isNaN(f)) {
                this.mSpringMass = f;
            }
        }

        public void setSpringStiffness(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3cff0b29", new Object[]{this, new Float(f)});
            } else if (!Float.isNaN(f)) {
                this.mSpringStiffness = f;
            }
        }

        public void setSpringStopThreshold(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7948d29f", new Object[]{this, new Float(f)});
            } else if (!Float.isNaN(f)) {
                this.mSpringStopThreshold = f;
            }
        }

        public void setDragDirection(int i) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed9c0193", new Object[]{this, new Integer(i)});
                return;
            }
            this.mDragDirection = i;
            if (i >= 2) {
                z = false;
            }
            this.mDragVertical = z;
        }
    }

    public void calcStagger() {
        float f;
        float f2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da28cc1f", new Object[]{this});
            return;
        }
        float f3 = this.mStagger;
        if (f3 != 0.0f) {
            if (f3 < vu3.b.GEO_NOT_SUPPORT) {
                z = true;
            }
            float abs = Math.abs(f3);
            Iterator<String> it = this.mState.keySet().iterator();
            do {
                f = Float.MAX_VALUE;
                f2 = -3.4028235E38f;
                if (!it.hasNext()) {
                    for (String str : this.mState.keySet()) {
                        Motion motion = this.mState.get(str).mMotionControl;
                        float finalX = motion.getFinalX() + motion.getFinalY();
                        f = Math.min(f, finalX);
                        f2 = Math.max(f2, finalX);
                    }
                    for (String str2 : this.mState.keySet()) {
                        Motion motion2 = this.mState.get(str2).mMotionControl;
                        float finalX2 = motion2.getFinalX() + motion2.getFinalY();
                        float f4 = f2 - f;
                        float f5 = abs - (((finalX2 - f) * abs) / f4);
                        if (z) {
                            f5 = abs - (((f2 - finalX2) / f4) * abs);
                        }
                        motion2.setStaggerScale(1.0f / (1.0f - abs));
                        motion2.setStaggerOffset(f5);
                    }
                    return;
                }
            } while (Float.isNaN(this.mState.get(it.next()).mMotionControl.getMotionStagger()));
            for (String str3 : this.mState.keySet()) {
                float motionStagger = this.mState.get(str3).mMotionControl.getMotionStagger();
                if (!Float.isNaN(motionStagger)) {
                    f = Math.min(f, motionStagger);
                    f2 = Math.max(f2, motionStagger);
                }
            }
            for (String str4 : this.mState.keySet()) {
                Motion motion3 = this.mState.get(str4).mMotionControl;
                float motionStagger2 = motion3.getMotionStagger();
                if (!Float.isNaN(motionStagger2)) {
                    float f6 = 1.0f / (1.0f - abs);
                    float f7 = f2 - f;
                    float f8 = abs - (((motionStagger2 - f) * abs) / f7);
                    if (z) {
                        f8 = abs - (((f2 - motionStagger2) / f7) * abs);
                    }
                    motion3.setStaggerScale(f6);
                    motion3.setStaggerOffset(f8);
                }
            }
        }
    }

    public void fillKeyPositions(WidgetFrame widgetFrame, float[] fArr, float[] fArr2, float[] fArr3) {
        KeyPosition keyPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e92f7dc8", new Object[]{this, widgetFrame, fArr, fArr2, fArr3});
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            HashMap<String, KeyPosition> hashMap = this.mKeyPositions.get(Integer.valueOf(i2));
            if (!(hashMap == null || (keyPosition = hashMap.get(widgetFrame.widget.stringId)) == null)) {
                fArr[i] = keyPosition.mX;
                fArr2[i] = keyPosition.mY;
                fArr3[i] = keyPosition.mFrame;
                i++;
            }
        }
    }

    public WidgetFrame getEnd(ConstraintWidget constraintWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WidgetFrame) ipChange.ipc$dispatch("93a459a2", new Object[]{this, constraintWidget}) : getWidgetState(constraintWidget.stringId, null, 1).mEnd;
    }

    public WidgetFrame getInterpolated(ConstraintWidget constraintWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WidgetFrame) ipChange.ipc$dispatch("41e8e6f6", new Object[]{this, constraintWidget}) : getWidgetState(constraintWidget.stringId, null, 2).mInterpolated;
    }

    public WidgetFrame getStart(ConstraintWidget constraintWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WidgetFrame) ipChange.ipc$dispatch("f8e41e69", new Object[]{this, constraintWidget}) : getWidgetState(constraintWidget.stringId, null, 0).mStart;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ec86d7", new Object[]{this, new Integer(i), new Float(f)})).booleanValue();
        }
        if (i == 706) {
            this.mStagger = f;
        }
        return false;
    }

    public boolean isFirstDownAccepted(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b91488ba", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        OnSwipe onSwipe = this.mOnSwipe;
        if (onSwipe == null) {
            return false;
        }
        String str = onSwipe.mLimitBoundsTo;
        if (str == null) {
            return true;
        }
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            System.err.println("mLimitBoundsTo target is null");
            return false;
        }
        WidgetFrame frame = widgetState.getFrame(2);
        return f >= ((float) frame.left) && f < ((float) frame.right) && f2 >= ((float) frame.top) && f2 < ((float) frame.bottom);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("418eb31b", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (i == 705) {
            this.mDefaultInterpolatorString = str;
            this.mEasing = Easing.getInterpolator(str);
        }
        return false;
    }

    public Interpolator getInterpolator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Interpolator) ipChange.ipc$dispatch("ce32f2a2", new Object[]{this}) : getInterpolator(this.mDefaultInterpolator, this.mDefaultInterpolatorString);
    }
}
