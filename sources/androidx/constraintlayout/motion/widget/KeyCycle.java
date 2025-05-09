package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class KeyCycle extends Key {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int KEY_TYPE = 4;
    public static final String NAME = "KeyCycle";
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    private static final String TAG = "KeyCycle";
    public static final String WAVE_OFFSET = "waveOffset";
    public static final String WAVE_PERIOD = "wavePeriod";
    public static final String WAVE_PHASE = "wavePhase";
    public static final String WAVE_SHAPE = "waveShape";
    private String mTransitionEasing = null;
    private int mCurveFit = 0;
    private int mWaveShape = -1;
    private String mCustomWaveShape = null;
    private float mWavePeriod = Float.NaN;
    private float mWaveOffset = 0.0f;
    private float mWavePhase = 0.0f;
    private float mProgress = Float.NaN;
    private int mWaveVariesBy = -1;
    private float mAlpha = Float.NaN;
    private float mElevation = Float.NaN;
    private float mRotation = Float.NaN;
    private float mTransitionPathRotate = Float.NaN;
    private float mRotationX = Float.NaN;
    private float mRotationY = Float.NaN;
    private float mScaleX = Float.NaN;
    private float mScaleY = Float.NaN;
    private float mTranslationX = Float.NaN;
    private float mTranslationY = Float.NaN;
    private float mTranslationZ = Float.NaN;

    public KeyCycle() {
        this.mType = 4;
        this.mCustomConstraints = new HashMap<>();
    }

    public static /* synthetic */ float access$1000(KeyCycle keyCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54739f8a", new Object[]{keyCycle})).floatValue();
        }
        return keyCycle.mRotation;
    }

    public static /* synthetic */ float access$1002(KeyCycle keyCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c6d6114", new Object[]{keyCycle, new Float(f)})).floatValue();
        }
        keyCycle.mRotation = f;
        return f;
    }

    public static /* synthetic */ String access$102(KeyCycle keyCycle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("427419a8", new Object[]{keyCycle, str});
        }
        keyCycle.mTransitionEasing = str;
        return str;
    }

    public static /* synthetic */ float access$1100(KeyCycle keyCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a07a88b", new Object[]{keyCycle})).floatValue();
        }
        return keyCycle.mRotationX;
    }

    public static /* synthetic */ float access$1102(KeyCycle keyCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c95a7833", new Object[]{keyCycle, new Float(f)})).floatValue();
        }
        keyCycle.mRotationX = f;
        return f;
    }

    public static /* synthetic */ float access$1200(KeyCycle keyCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f9bb18c", new Object[]{keyCycle})).floatValue();
        }
        return keyCycle.mRotationY;
    }

    public static /* synthetic */ float access$1202(KeyCycle keyCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56478f52", new Object[]{keyCycle, new Float(f)})).floatValue();
        }
        keyCycle.mRotationY = f;
        return f;
    }

    public static /* synthetic */ float access$1300(KeyCycle keyCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c52fba8d", new Object[]{keyCycle})).floatValue();
        }
        return keyCycle.mTransitionPathRotate;
    }

    public static /* synthetic */ float access$1302(KeyCycle keyCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e334a671", new Object[]{keyCycle, new Float(f)})).floatValue();
        }
        keyCycle.mTransitionPathRotate = f;
        return f;
    }

    public static /* synthetic */ float access$1400(KeyCycle keyCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eac3c38e", new Object[]{keyCycle})).floatValue();
        }
        return keyCycle.mScaleX;
    }

    public static /* synthetic */ float access$1402(KeyCycle keyCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7021bd90", new Object[]{keyCycle, new Float(f)})).floatValue();
        }
        keyCycle.mScaleX = f;
        return f;
    }

    public static /* synthetic */ float access$1500(KeyCycle keyCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1057cc8f", new Object[]{keyCycle})).floatValue();
        }
        return keyCycle.mScaleY;
    }

    public static /* synthetic */ float access$1502(KeyCycle keyCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd0ed4af", new Object[]{keyCycle, new Float(f)})).floatValue();
        }
        keyCycle.mScaleY = f;
        return f;
    }

    public static /* synthetic */ float access$1600(KeyCycle keyCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35ebd590", new Object[]{keyCycle})).floatValue();
        }
        return keyCycle.mTranslationX;
    }

    public static /* synthetic */ float access$1602(KeyCycle keyCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89fbebce", new Object[]{keyCycle, new Float(f)})).floatValue();
        }
        keyCycle.mTranslationX = f;
        return f;
    }

    public static /* synthetic */ float access$1700(KeyCycle keyCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b7fde91", new Object[]{keyCycle})).floatValue();
        }
        return keyCycle.mTranslationY;
    }

    public static /* synthetic */ float access$1702(KeyCycle keyCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16e902ed", new Object[]{keyCycle, new Float(f)})).floatValue();
        }
        keyCycle.mTranslationY = f;
        return f;
    }

    public static /* synthetic */ float access$1800(KeyCycle keyCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8113e792", new Object[]{keyCycle})).floatValue();
        }
        return keyCycle.mTranslationZ;
    }

    public static /* synthetic */ float access$1802(KeyCycle keyCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3d61a0c", new Object[]{keyCycle, new Float(f)})).floatValue();
        }
        keyCycle.mTranslationZ = f;
        return f;
    }

    public static /* synthetic */ float access$1900(KeyCycle keyCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6a7f093", new Object[]{keyCycle})).floatValue();
        }
        return keyCycle.mProgress;
    }

    public static /* synthetic */ float access$1902(KeyCycle keyCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30c3312b", new Object[]{keyCycle, new Float(f)})).floatValue();
        }
        keyCycle.mProgress = f;
        return f;
    }

    public static /* synthetic */ int access$200(KeyCycle keyCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2718e20", new Object[]{keyCycle})).intValue();
        }
        return keyCycle.mCurveFit;
    }

    public static /* synthetic */ float access$2000(KeyCycle keyCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e160b6a9", new Object[]{keyCycle})).floatValue();
        }
        return keyCycle.mWavePhase;
    }

    public static /* synthetic */ float access$2002(KeyCycle keyCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d232dd5", new Object[]{keyCycle, new Float(f)})).floatValue();
        }
        keyCycle.mWavePhase = f;
        return f;
    }

    public static /* synthetic */ int access$202(KeyCycle keyCycle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e2d5027", new Object[]{keyCycle, new Integer(i)})).intValue();
        }
        keyCycle.mCurveFit = i;
        return i;
    }

    public static /* synthetic */ String access$302(KeyCycle keyCycle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40c13866", new Object[]{keyCycle, str});
        }
        keyCycle.mCustomWaveShape = str;
        return str;
    }

    public static /* synthetic */ int access$400(KeyCycle keyCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d99a022", new Object[]{keyCycle})).intValue();
        }
        return keyCycle.mWaveShape;
    }

    public static /* synthetic */ int access$402(KeyCycle keyCycle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98077e65", new Object[]{keyCycle, new Integer(i)})).intValue();
        }
        keyCycle.mWaveShape = i;
        return i;
    }

    public static /* synthetic */ float access$500(KeyCycle keyCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("432da920", new Object[]{keyCycle})).floatValue();
        }
        return keyCycle.mWavePeriod;
    }

    public static /* synthetic */ float access$502(KeyCycle keyCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24f48a3e", new Object[]{keyCycle, new Float(f)})).floatValue();
        }
        keyCycle.mWavePeriod = f;
        return f;
    }

    public static /* synthetic */ float access$600(KeyCycle keyCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68c1b221", new Object[]{keyCycle})).floatValue();
        }
        return keyCycle.mWaveOffset;
    }

    public static /* synthetic */ float access$602(KeyCycle keyCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1e1a15d", new Object[]{keyCycle, new Float(f)})).floatValue();
        }
        keyCycle.mWaveOffset = f;
        return f;
    }

    public static /* synthetic */ int access$700(KeyCycle keyCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e55bb25", new Object[]{keyCycle})).intValue();
        }
        return keyCycle.mWaveVariesBy;
    }

    public static /* synthetic */ int access$702(KeyCycle keyCycle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ecec3c2", new Object[]{keyCycle, new Integer(i)})).intValue();
        }
        keyCycle.mWaveVariesBy = i;
        return i;
    }

    public static /* synthetic */ float access$800(KeyCycle keyCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3e9c423", new Object[]{keyCycle})).floatValue();
        }
        return keyCycle.mAlpha;
    }

    public static /* synthetic */ float access$802(KeyCycle keyCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbbbcf9b", new Object[]{keyCycle, new Float(f)})).floatValue();
        }
        keyCycle.mAlpha = f;
        return f;
    }

    public static /* synthetic */ float access$900(KeyCycle keyCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d97dcd24", new Object[]{keyCycle})).floatValue();
        }
        return keyCycle.mElevation;
    }

    public static /* synthetic */ float access$902(KeyCycle keyCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58a8e6ba", new Object[]{keyCycle, new Float(f)})).floatValue();
        }
        keyCycle.mElevation = f;
        return f;
    }

    public static /* synthetic */ Object ipc$super(KeyCycle keyCycle, String str, Object... objArr) {
        if (str.hashCode() == -843737632) {
            return super.copy((Key) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/widget/KeyCycle");
    }

    public void addCycleValues(HashMap<String, ViewOscillator> hashMap) {
        ViewOscillator viewOscillator;
        ViewOscillator viewOscillator2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5feba5", new Object[]{this, hashMap});
            return;
        }
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str.substring(7));
                if (!(constraintAttribute == null || constraintAttribute.getType() != ConstraintAttribute.AttributeType.FLOAT_TYPE || (viewOscillator = hashMap.get(str)) == null)) {
                    viewOscillator.setPoint(this.mFramePosition, this.mWaveShape, this.mCustomWaveShape, this.mWaveVariesBy, this.mWavePeriod, this.mWaveOffset, this.mWavePhase, constraintAttribute.getValueToInterpolate(), constraintAttribute);
                }
            } else {
                float value = getValue(str);
                if (!Float.isNaN(value) && (viewOscillator2 = hashMap.get(str)) != null) {
                    viewOscillator2.setPoint(this.mFramePosition, this.mWaveShape, this.mCustomWaveShape, this.mWaveVariesBy, this.mWavePeriod, this.mWaveOffset, this.mWavePhase, value);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Key) ipChange.ipc$dispatch("cdb595e0", new Object[]{this, key});
        }
        super.copy(key);
        KeyCycle keyCycle = (KeyCycle) key;
        this.mTransitionEasing = keyCycle.mTransitionEasing;
        this.mCurveFit = keyCycle.mCurveFit;
        this.mWaveShape = keyCycle.mWaveShape;
        this.mCustomWaveShape = keyCycle.mCustomWaveShape;
        this.mWavePeriod = keyCycle.mWavePeriod;
        this.mWaveOffset = keyCycle.mWaveOffset;
        this.mWavePhase = keyCycle.mWavePhase;
        this.mProgress = keyCycle.mProgress;
        this.mWaveVariesBy = keyCycle.mWaveVariesBy;
        this.mAlpha = keyCycle.mAlpha;
        this.mElevation = keyCycle.mElevation;
        this.mRotation = keyCycle.mRotation;
        this.mTransitionPathRotate = keyCycle.mTransitionPathRotate;
        this.mRotationX = keyCycle.mRotationX;
        this.mRotationY = keyCycle.mRotationY;
        this.mScaleX = keyCycle.mScaleX;
        this.mScaleY = keyCycle.mScaleY;
        this.mTranslationX = keyCycle.mTranslationX;
        this.mTranslationY = keyCycle.mTranslationY;
        this.mTranslationZ = keyCycle.mTranslationZ;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9934fc4", new Object[]{this, hashSet});
            return;
        }
        if (!Float.isNaN(this.mAlpha)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.mElevation)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.mRotation)) {
            hashSet.add(Key.ROTATION);
        }
        if (!Float.isNaN(this.mRotationX)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.mRotationY)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.mTranslationX)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.mTranslationY)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            hashSet.add("translationZ");
        }
        if (this.mCustomConstraints.size() > 0) {
            Iterator<String> it = this.mCustomConstraints.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78192133", new Object[]{this, context, attributeSet});
        } else {
            Loader.access$000(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyCycle));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Loader {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int ANDROID_ALPHA = 9;
        private static final int ANDROID_ELEVATION = 10;
        private static final int ANDROID_ROTATION = 11;
        private static final int ANDROID_ROTATION_X = 12;
        private static final int ANDROID_ROTATION_Y = 13;
        private static final int ANDROID_SCALE_X = 15;
        private static final int ANDROID_SCALE_Y = 16;
        private static final int ANDROID_TRANSLATION_X = 17;
        private static final int ANDROID_TRANSLATION_Y = 18;
        private static final int ANDROID_TRANSLATION_Z = 19;
        private static final int CURVE_FIT = 4;
        private static final int FRAME_POSITION = 2;
        private static final int PROGRESS = 20;
        private static final int TARGET_ID = 1;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 14;
        private static final int WAVE_OFFSET = 7;
        private static final int WAVE_PERIOD = 6;
        private static final int WAVE_PHASE = 21;
        private static final int WAVE_SHAPE = 5;
        private static final int WAVE_VARIES_BY = 8;
        private static SparseIntArray sAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sAttrMap = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyCycle_motionTarget, 1);
            sAttrMap.append(R.styleable.KeyCycle_framePosition, 2);
            sAttrMap.append(R.styleable.KeyCycle_transitionEasing, 3);
            sAttrMap.append(R.styleable.KeyCycle_curveFit, 4);
            sAttrMap.append(R.styleable.KeyCycle_waveShape, 5);
            sAttrMap.append(R.styleable.KeyCycle_wavePeriod, 6);
            sAttrMap.append(R.styleable.KeyCycle_waveOffset, 7);
            sAttrMap.append(R.styleable.KeyCycle_waveVariesBy, 8);
            sAttrMap.append(R.styleable.KeyCycle_android_alpha, 9);
            sAttrMap.append(R.styleable.KeyCycle_android_elevation, 10);
            sAttrMap.append(R.styleable.KeyCycle_android_rotation, 11);
            sAttrMap.append(R.styleable.KeyCycle_android_rotationX, 12);
            sAttrMap.append(R.styleable.KeyCycle_android_rotationY, 13);
            sAttrMap.append(R.styleable.KeyCycle_transitionPathRotate, 14);
            sAttrMap.append(R.styleable.KeyCycle_android_scaleX, 15);
            sAttrMap.append(R.styleable.KeyCycle_android_scaleY, 16);
            sAttrMap.append(R.styleable.KeyCycle_android_translationX, 17);
            sAttrMap.append(R.styleable.KeyCycle_android_translationY, 18);
            sAttrMap.append(R.styleable.KeyCycle_android_translationZ, 19);
            sAttrMap.append(R.styleable.KeyCycle_motionProgress, 20);
            sAttrMap.append(R.styleable.KeyCycle_wavePhase, 21);
        }

        private Loader() {
        }

        public static /* synthetic */ void access$000(KeyCycle keyCycle, TypedArray typedArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bcd18d66", new Object[]{keyCycle, typedArray});
            } else {
                read(keyCycle, typedArray);
            }
        }

        private static void read(KeyCycle keyCycle, TypedArray typedArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11fa1b8c", new Object[]{keyCycle, typedArray});
                return;
            }
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (sAttrMap.get(index)) {
                    case 1:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (typedArray.peekValue(index).type == 3) {
                                keyCycle.mTargetString = typedArray.getString(index);
                                break;
                            } else {
                                keyCycle.mTargetId = typedArray.getResourceId(index, keyCycle.mTargetId);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, keyCycle.mTargetId);
                            keyCycle.mTargetId = resourceId;
                            if (resourceId == -1) {
                                keyCycle.mTargetString = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        }
                    case 2:
                        keyCycle.mFramePosition = typedArray.getInt(index, keyCycle.mFramePosition);
                        break;
                    case 3:
                        KeyCycle.access$102(keyCycle, typedArray.getString(index));
                        break;
                    case 4:
                        KeyCycle.access$202(keyCycle, typedArray.getInteger(index, KeyCycle.access$200(keyCycle)));
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            KeyCycle.access$302(keyCycle, typedArray.getString(index));
                            KeyCycle.access$402(keyCycle, 7);
                            break;
                        } else {
                            KeyCycle.access$402(keyCycle, typedArray.getInt(index, KeyCycle.access$400(keyCycle)));
                            break;
                        }
                    case 6:
                        KeyCycle.access$502(keyCycle, typedArray.getFloat(index, KeyCycle.access$500(keyCycle)));
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            KeyCycle.access$602(keyCycle, typedArray.getDimension(index, KeyCycle.access$600(keyCycle)));
                            break;
                        } else {
                            KeyCycle.access$602(keyCycle, typedArray.getFloat(index, KeyCycle.access$600(keyCycle)));
                            break;
                        }
                    case 8:
                        KeyCycle.access$702(keyCycle, typedArray.getInt(index, KeyCycle.access$700(keyCycle)));
                        break;
                    case 9:
                        KeyCycle.access$802(keyCycle, typedArray.getFloat(index, KeyCycle.access$800(keyCycle)));
                        break;
                    case 10:
                        KeyCycle.access$902(keyCycle, typedArray.getDimension(index, KeyCycle.access$900(keyCycle)));
                        break;
                    case 11:
                        KeyCycle.access$1002(keyCycle, typedArray.getFloat(index, KeyCycle.access$1000(keyCycle)));
                        break;
                    case 12:
                        KeyCycle.access$1102(keyCycle, typedArray.getFloat(index, KeyCycle.access$1100(keyCycle)));
                        break;
                    case 13:
                        KeyCycle.access$1202(keyCycle, typedArray.getFloat(index, KeyCycle.access$1200(keyCycle)));
                        break;
                    case 14:
                        KeyCycle.access$1302(keyCycle, typedArray.getFloat(index, KeyCycle.access$1300(keyCycle)));
                        break;
                    case 15:
                        KeyCycle.access$1402(keyCycle, typedArray.getFloat(index, KeyCycle.access$1400(keyCycle)));
                        break;
                    case 16:
                        KeyCycle.access$1502(keyCycle, typedArray.getFloat(index, KeyCycle.access$1500(keyCycle)));
                        break;
                    case 17:
                        KeyCycle.access$1602(keyCycle, typedArray.getDimension(index, KeyCycle.access$1600(keyCycle)));
                        break;
                    case 18:
                        KeyCycle.access$1702(keyCycle, typedArray.getDimension(index, KeyCycle.access$1700(keyCycle)));
                        break;
                    case 19:
                        KeyCycle.access$1802(keyCycle, typedArray.getDimension(index, KeyCycle.access$1800(keyCycle)));
                        break;
                    case 20:
                        KeyCycle.access$1902(keyCycle, typedArray.getFloat(index, KeyCycle.access$1900(keyCycle)));
                        break;
                    case 21:
                        KeyCycle.access$2002(keyCycle, typedArray.getFloat(index, KeyCycle.access$2000(keyCycle)) / 360.0f);
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sAttrMap.get(index));
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Key) ipChange.ipc$dispatch("94336aea", new Object[]{this}) : new KeyCycle().copy(this);
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d03d49", new Object[]{this, hashMap});
            return;
        }
        Debug.logStack("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String str : hashMap.keySet()) {
            ViewSpline viewSpline = hashMap.get(str);
            if (viewSpline != null) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (str.equals(Key.ROTATION)) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            c = '\r';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        viewSpline.setPoint(this.mFramePosition, this.mRotationX);
                        continue;
                    case 1:
                        viewSpline.setPoint(this.mFramePosition, this.mRotationY);
                        continue;
                    case 2:
                        viewSpline.setPoint(this.mFramePosition, this.mTranslationX);
                        continue;
                    case 3:
                        viewSpline.setPoint(this.mFramePosition, this.mTranslationY);
                        continue;
                    case 4:
                        viewSpline.setPoint(this.mFramePosition, this.mTranslationZ);
                        continue;
                    case 5:
                        viewSpline.setPoint(this.mFramePosition, this.mProgress);
                        continue;
                    case 6:
                        viewSpline.setPoint(this.mFramePosition, this.mScaleX);
                        continue;
                    case 7:
                        viewSpline.setPoint(this.mFramePosition, this.mScaleY);
                        continue;
                    case '\b':
                        viewSpline.setPoint(this.mFramePosition, this.mRotation);
                        continue;
                    case '\t':
                        viewSpline.setPoint(this.mFramePosition, this.mElevation);
                        continue;
                    case '\n':
                        viewSpline.setPoint(this.mFramePosition, this.mTransitionPathRotate);
                        continue;
                    case 11:
                        viewSpline.setPoint(this.mFramePosition, this.mAlpha);
                        continue;
                    case '\f':
                        viewSpline.setPoint(this.mFramePosition, this.mWaveOffset);
                        continue;
                    case '\r':
                        viewSpline.setPoint(this.mFramePosition, this.mWavePhase);
                        continue;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            "  UNKNOWN  ".concat(str);
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
        if (r6.equals("rotationY") == false) goto L_0x0027;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public float getValue(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyCycle.getValue(java.lang.String):float");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fb, code lost:
        if (r8.equals("rotationX") == false) goto L_0x0025;
     */
    @Override // androidx.constraintlayout.motion.widget.Key
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setValue(java.lang.String r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyCycle.setValue(java.lang.String, java.lang.Object):void");
    }
}
