package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class KeyTimeCycle extends Key {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int KEY_TYPE = 3;
    public static final String NAME = "KeyTimeCycle";
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    private static final String TAG = "KeyTimeCycle";
    public static final String WAVE_OFFSET = "waveOffset";
    public static final String WAVE_PERIOD = "wavePeriod";
    public static final String WAVE_SHAPE = "waveShape";
    private String mTransitionEasing;
    private int mCurveFit = -1;
    private float mAlpha = Float.NaN;
    private float mElevation = Float.NaN;
    private float mRotation = Float.NaN;
    private float mRotationX = Float.NaN;
    private float mRotationY = Float.NaN;
    private float mTransitionPathRotate = Float.NaN;
    private float mScaleX = Float.NaN;
    private float mScaleY = Float.NaN;
    private float mTranslationX = Float.NaN;
    private float mTranslationY = Float.NaN;
    private float mTranslationZ = Float.NaN;
    private float mProgress = Float.NaN;
    private int mWaveShape = 0;
    private String mCustomWaveShape = null;
    private float mWavePeriod = Float.NaN;
    private float mWaveOffset = 0.0f;

    public KeyTimeCycle() {
        this.mType = 3;
        this.mCustomConstraints = new HashMap<>();
    }

    public static /* synthetic */ float access$000(KeyTimeCycle keyTimeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa41e988", new Object[]{keyTimeCycle})).floatValue();
        }
        return keyTimeCycle.mAlpha;
    }

    public static /* synthetic */ float access$002(KeyTimeCycle keyTimeCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa0347d6", new Object[]{keyTimeCycle, new Float(f)})).floatValue();
        }
        keyTimeCycle.mAlpha = f;
        return f;
    }

    public static /* synthetic */ float access$100(KeyTimeCycle keyTimeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b78a09", new Object[]{keyTimeCycle})).floatValue();
        }
        return keyTimeCycle.mElevation;
    }

    public static /* synthetic */ float access$1000(KeyTimeCycle keyTimeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5bebd77", new Object[]{keyTimeCycle})).floatValue();
        }
        return keyTimeCycle.mRotationY;
    }

    public static /* synthetic */ float access$1002(KeyTimeCycle keyTimeCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe20f1c7", new Object[]{keyTimeCycle, new Float(f)})).floatValue();
        }
        keyTimeCycle.mRotationY = f;
        return f;
    }

    public static /* synthetic */ float access$102(KeyTimeCycle keyTimeCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e41b775", new Object[]{keyTimeCycle, new Float(f)})).floatValue();
        }
        keyTimeCycle.mElevation = f;
        return f;
    }

    public static /* synthetic */ String access$1102(KeyTimeCycle keyTimeCycle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ece1644c", new Object[]{keyTimeCycle, str});
        }
        keyTimeCycle.mTransitionEasing = str;
        return str;
    }

    public static /* synthetic */ float access$1200(KeyTimeCycle keyTimeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3aa9fe79", new Object[]{keyTimeCycle})).floatValue();
        }
        return keyTimeCycle.mScaleY;
    }

    public static /* synthetic */ float access$1202(KeyTimeCycle keyTimeCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("269dd105", new Object[]{keyTimeCycle, new Float(f)})).floatValue();
        }
        keyTimeCycle.mScaleY = f;
        return f;
    }

    public static /* synthetic */ float access$1300(KeyTimeCycle keyTimeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f51f9efa", new Object[]{keyTimeCycle})).floatValue();
        }
        return keyTimeCycle.mTransitionPathRotate;
    }

    public static /* synthetic */ float access$1302(KeyTimeCycle keyTimeCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("badc40a4", new Object[]{keyTimeCycle, new Float(f)})).floatValue();
        }
        keyTimeCycle.mTransitionPathRotate = f;
        return f;
    }

    public static /* synthetic */ float access$1400(KeyTimeCycle keyTimeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af953f7b", new Object[]{keyTimeCycle})).floatValue();
        }
        return keyTimeCycle.mTranslationX;
    }

    public static /* synthetic */ float access$1402(KeyTimeCycle keyTimeCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f1ab043", new Object[]{keyTimeCycle, new Float(f)})).floatValue();
        }
        keyTimeCycle.mTranslationX = f;
        return f;
    }

    public static /* synthetic */ float access$1500(KeyTimeCycle keyTimeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a0adffc", new Object[]{keyTimeCycle})).floatValue();
        }
        return keyTimeCycle.mTranslationY;
    }

    public static /* synthetic */ float access$1502(KeyTimeCycle keyTimeCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3591fe2", new Object[]{keyTimeCycle, new Float(f)})).floatValue();
        }
        keyTimeCycle.mTranslationY = f;
        return f;
    }

    public static /* synthetic */ float access$1600(KeyTimeCycle keyTimeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2480807d", new Object[]{keyTimeCycle})).floatValue();
        }
        return keyTimeCycle.mTranslationZ;
    }

    public static /* synthetic */ float access$1602(KeyTimeCycle keyTimeCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77978f81", new Object[]{keyTimeCycle, new Float(f)})).floatValue();
        }
        keyTimeCycle.mTranslationZ = f;
        return f;
    }

    public static /* synthetic */ float access$1700(KeyTimeCycle keyTimeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("def620fe", new Object[]{keyTimeCycle})).floatValue();
        }
        return keyTimeCycle.mProgress;
    }

    public static /* synthetic */ float access$1702(KeyTimeCycle keyTimeCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd5ff20", new Object[]{keyTimeCycle, new Float(f)})).floatValue();
        }
        keyTimeCycle.mProgress = f;
        return f;
    }

    public static /* synthetic */ float access$200(KeyTimeCycle keyTimeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f2d2a8a", new Object[]{keyTimeCycle})).floatValue();
        }
        return keyTimeCycle.mRotation;
    }

    public static /* synthetic */ float access$202(KeyTimeCycle keyTimeCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2802714", new Object[]{keyTimeCycle, new Float(f)})).floatValue();
        }
        keyTimeCycle.mRotation = f;
        return f;
    }

    public static /* synthetic */ int access$300(KeyTimeCycle keyTimeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9a2cb0e", new Object[]{keyTimeCycle})).intValue();
        }
        return keyTimeCycle.mCurveFit;
    }

    public static /* synthetic */ int access$302(KeyTimeCycle keyTimeCycle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66bea1f9", new Object[]{keyTimeCycle, new Integer(i)})).intValue();
        }
        keyTimeCycle.mCurveFit = i;
        return i;
    }

    public static /* synthetic */ String access$402(KeyTimeCycle keyTimeCycle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98e6ce38", new Object[]{keyTimeCycle, str});
        }
        keyTimeCycle.mCustomWaveShape = str;
        return str;
    }

    public static /* synthetic */ int access$500(KeyTimeCycle keyTimeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e8e0c10", new Object[]{keyTimeCycle})).intValue();
        }
        return keyTimeCycle.mWaveShape;
    }

    public static /* synthetic */ int access$502(KeyTimeCycle keyTimeCycle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f3b8137", new Object[]{keyTimeCycle, new Integer(i)})).intValue();
        }
        keyTimeCycle.mWaveShape = i;
        return i;
    }

    public static /* synthetic */ float access$600(KeyTimeCycle keyTimeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("903ac8e", new Object[]{keyTimeCycle})).floatValue();
        }
        return keyTimeCycle.mWavePeriod;
    }

    public static /* synthetic */ float access$602(KeyTimeCycle keyTimeCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2379e590", new Object[]{keyTimeCycle, new Float(f)})).floatValue();
        }
        keyTimeCycle.mWavePeriod = f;
        return f;
    }

    public static /* synthetic */ float access$700(KeyTimeCycle keyTimeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3794d0f", new Object[]{keyTimeCycle})).floatValue();
        }
        return keyTimeCycle.mWaveOffset;
    }

    public static /* synthetic */ float access$702(KeyTimeCycle keyTimeCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7b8552f", new Object[]{keyTimeCycle, new Float(f)})).floatValue();
        }
        keyTimeCycle.mWaveOffset = f;
        return f;
    }

    public static /* synthetic */ float access$800(KeyTimeCycle keyTimeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7deeed90", new Object[]{keyTimeCycle})).floatValue();
        }
        return keyTimeCycle.mScaleX;
    }

    public static /* synthetic */ float access$802(KeyTimeCycle keyTimeCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bf6c4ce", new Object[]{keyTimeCycle, new Float(f)})).floatValue();
        }
        keyTimeCycle.mScaleX = f;
        return f;
    }

    public static /* synthetic */ float access$900(KeyTimeCycle keyTimeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38648e11", new Object[]{keyTimeCycle})).floatValue();
        }
        return keyTimeCycle.mRotationX;
    }

    public static /* synthetic */ float access$902(KeyTimeCycle keyTimeCycle, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e035346d", new Object[]{keyTimeCycle, new Float(f)})).floatValue();
        }
        keyTimeCycle.mRotationX = f;
        return f;
    }

    public static /* synthetic */ Object ipc$super(KeyTimeCycle keyTimeCycle, String str, Object... objArr) {
        if (str.hashCode() == -843737632) {
            return super.copy((Key) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/widget/KeyTimeCycle");
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d03d49", new Object[]{this, hashMap});
            return;
        }
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Key) ipChange.ipc$dispatch("cdb595e0", new Object[]{this, key});
        }
        super.copy(key);
        KeyTimeCycle keyTimeCycle = (KeyTimeCycle) key;
        this.mTransitionEasing = keyTimeCycle.mTransitionEasing;
        this.mCurveFit = keyTimeCycle.mCurveFit;
        this.mWaveShape = keyTimeCycle.mWaveShape;
        this.mWavePeriod = keyTimeCycle.mWavePeriod;
        this.mWaveOffset = keyTimeCycle.mWaveOffset;
        this.mProgress = keyTimeCycle.mProgress;
        this.mAlpha = keyTimeCycle.mAlpha;
        this.mElevation = keyTimeCycle.mElevation;
        this.mRotation = keyTimeCycle.mRotation;
        this.mTransitionPathRotate = keyTimeCycle.mTransitionPathRotate;
        this.mRotationX = keyTimeCycle.mRotationX;
        this.mRotationY = keyTimeCycle.mRotationY;
        this.mScaleX = keyTimeCycle.mScaleX;
        this.mScaleY = keyTimeCycle.mScaleY;
        this.mTranslationX = keyTimeCycle.mTranslationX;
        this.mTranslationY = keyTimeCycle.mTranslationY;
        this.mTranslationZ = keyTimeCycle.mTranslationZ;
        this.mCustomWaveShape = keyTimeCycle.mCustomWaveShape;
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
        if (!Float.isNaN(this.mTranslationX)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.mTranslationY)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.mProgress)) {
            hashSet.add("progress");
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
            Loader.read(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyTimeCycle));
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setInterpolation(HashMap<String, Integer> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4928ef2a", new Object[]{this, hashMap});
        } else if (this.mCurveFit != -1) {
            if (!Float.isNaN(this.mAlpha)) {
                hashMap.put("alpha", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mElevation)) {
                hashMap.put("elevation", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mRotation)) {
                hashMap.put(Key.ROTATION, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mRotationX)) {
                hashMap.put("rotationX", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mRotationY)) {
                hashMap.put("rotationY", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTranslationX)) {
                hashMap.put("translationX", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTranslationY)) {
                hashMap.put("translationY", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTranslationZ)) {
                hashMap.put("translationZ", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTransitionPathRotate)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mScaleX)) {
                hashMap.put("scaleX", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mScaleX)) {
                hashMap.put("scaleY", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mProgress)) {
                hashMap.put("progress", Integer.valueOf(this.mCurveFit));
            }
            if (this.mCustomConstraints.size() > 0) {
                Iterator<String> it = this.mCustomConstraints.keySet().iterator();
                while (it.hasNext()) {
                    hashMap.put("CUSTOM," + it.next(), Integer.valueOf(this.mCurveFit));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Loader {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int ANDROID_ALPHA = 1;
        private static final int ANDROID_ELEVATION = 2;
        private static final int ANDROID_ROTATION = 4;
        private static final int ANDROID_ROTATION_X = 5;
        private static final int ANDROID_ROTATION_Y = 6;
        private static final int ANDROID_SCALE_X = 7;
        private static final int ANDROID_SCALE_Y = 14;
        private static final int ANDROID_TRANSLATION_X = 15;
        private static final int ANDROID_TRANSLATION_Y = 16;
        private static final int ANDROID_TRANSLATION_Z = 17;
        private static final int CURVE_FIT = 13;
        private static final int FRAME_POSITION = 12;
        private static final int PROGRESS = 18;
        private static final int TARGET_ID = 10;
        private static final int TRANSITION_EASING = 9;
        private static final int TRANSITION_PATH_ROTATE = 8;
        private static final int WAVE_OFFSET = 21;
        private static final int WAVE_PERIOD = 20;
        private static final int WAVE_SHAPE = 19;
        private static SparseIntArray sAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sAttrMap = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_alpha, 1);
            sAttrMap.append(R.styleable.KeyTimeCycle_android_elevation, 2);
            sAttrMap.append(R.styleable.KeyTimeCycle_android_rotation, 4);
            sAttrMap.append(R.styleable.KeyTimeCycle_android_rotationX, 5);
            sAttrMap.append(R.styleable.KeyTimeCycle_android_rotationY, 6);
            sAttrMap.append(R.styleable.KeyTimeCycle_android_scaleX, 7);
            sAttrMap.append(R.styleable.KeyTimeCycle_transitionPathRotate, 8);
            sAttrMap.append(R.styleable.KeyTimeCycle_transitionEasing, 9);
            sAttrMap.append(R.styleable.KeyTimeCycle_motionTarget, 10);
            sAttrMap.append(R.styleable.KeyTimeCycle_framePosition, 12);
            sAttrMap.append(R.styleable.KeyTimeCycle_curveFit, 13);
            sAttrMap.append(R.styleable.KeyTimeCycle_android_scaleY, 14);
            sAttrMap.append(R.styleable.KeyTimeCycle_android_translationX, 15);
            sAttrMap.append(R.styleable.KeyTimeCycle_android_translationY, 16);
            sAttrMap.append(R.styleable.KeyTimeCycle_android_translationZ, 17);
            sAttrMap.append(R.styleable.KeyTimeCycle_motionProgress, 18);
            sAttrMap.append(R.styleable.KeyTimeCycle_wavePeriod, 20);
            sAttrMap.append(R.styleable.KeyTimeCycle_waveOffset, 21);
            sAttrMap.append(R.styleable.KeyTimeCycle_waveShape, 19);
        }

        private Loader() {
        }

        public static void read(KeyTimeCycle keyTimeCycle, TypedArray typedArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3fa11f9", new Object[]{keyTimeCycle, typedArray});
                return;
            }
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (sAttrMap.get(index)) {
                    case 1:
                        KeyTimeCycle.access$002(keyTimeCycle, typedArray.getFloat(index, KeyTimeCycle.access$000(keyTimeCycle)));
                        break;
                    case 2:
                        KeyTimeCycle.access$102(keyTimeCycle, typedArray.getDimension(index, KeyTimeCycle.access$100(keyTimeCycle)));
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sAttrMap.get(index));
                        break;
                    case 4:
                        KeyTimeCycle.access$202(keyTimeCycle, typedArray.getFloat(index, KeyTimeCycle.access$200(keyTimeCycle)));
                        break;
                    case 5:
                        KeyTimeCycle.access$902(keyTimeCycle, typedArray.getFloat(index, KeyTimeCycle.access$900(keyTimeCycle)));
                        break;
                    case 6:
                        KeyTimeCycle.access$1002(keyTimeCycle, typedArray.getFloat(index, KeyTimeCycle.access$1000(keyTimeCycle)));
                        break;
                    case 7:
                        KeyTimeCycle.access$802(keyTimeCycle, typedArray.getFloat(index, KeyTimeCycle.access$800(keyTimeCycle)));
                        break;
                    case 8:
                        KeyTimeCycle.access$1302(keyTimeCycle, typedArray.getFloat(index, KeyTimeCycle.access$1300(keyTimeCycle)));
                        break;
                    case 9:
                        KeyTimeCycle.access$1102(keyTimeCycle, typedArray.getString(index));
                        break;
                    case 10:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (typedArray.peekValue(index).type == 3) {
                                keyTimeCycle.mTargetString = typedArray.getString(index);
                                break;
                            } else {
                                keyTimeCycle.mTargetId = typedArray.getResourceId(index, keyTimeCycle.mTargetId);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, keyTimeCycle.mTargetId);
                            keyTimeCycle.mTargetId = resourceId;
                            if (resourceId == -1) {
                                keyTimeCycle.mTargetString = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        }
                    case 12:
                        keyTimeCycle.mFramePosition = typedArray.getInt(index, keyTimeCycle.mFramePosition);
                        break;
                    case 13:
                        KeyTimeCycle.access$302(keyTimeCycle, typedArray.getInteger(index, KeyTimeCycle.access$300(keyTimeCycle)));
                        break;
                    case 14:
                        KeyTimeCycle.access$1202(keyTimeCycle, typedArray.getFloat(index, KeyTimeCycle.access$1200(keyTimeCycle)));
                        break;
                    case 15:
                        KeyTimeCycle.access$1402(keyTimeCycle, typedArray.getDimension(index, KeyTimeCycle.access$1400(keyTimeCycle)));
                        break;
                    case 16:
                        KeyTimeCycle.access$1502(keyTimeCycle, typedArray.getDimension(index, KeyTimeCycle.access$1500(keyTimeCycle)));
                        break;
                    case 17:
                        KeyTimeCycle.access$1602(keyTimeCycle, typedArray.getDimension(index, KeyTimeCycle.access$1600(keyTimeCycle)));
                        break;
                    case 18:
                        KeyTimeCycle.access$1702(keyTimeCycle, typedArray.getFloat(index, KeyTimeCycle.access$1700(keyTimeCycle)));
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            KeyTimeCycle.access$402(keyTimeCycle, typedArray.getString(index));
                            KeyTimeCycle.access$502(keyTimeCycle, 7);
                            break;
                        } else {
                            KeyTimeCycle.access$502(keyTimeCycle, typedArray.getInt(index, KeyTimeCycle.access$500(keyTimeCycle)));
                            break;
                        }
                    case 20:
                        KeyTimeCycle.access$602(keyTimeCycle, typedArray.getFloat(index, KeyTimeCycle.access$600(keyTimeCycle)));
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            KeyTimeCycle.access$702(keyTimeCycle, typedArray.getDimension(index, KeyTimeCycle.access$700(keyTimeCycle)));
                            break;
                        } else {
                            KeyTimeCycle.access$702(keyTimeCycle, typedArray.getFloat(index, KeyTimeCycle.access$700(keyTimeCycle)));
                            break;
                        }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Key) ipChange.ipc$dispatch("94336aea", new Object[]{this}) : new KeyTimeCycle().copy(this);
    }

    public void addTimeValues(HashMap<String, ViewTimeCycle> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ff81fc", new Object[]{this, hashMap});
            return;
        }
        for (String str : hashMap.keySet()) {
            ViewTimeCycle viewTimeCycle = hashMap.get(str);
            if (viewTimeCycle != null) {
                if (str.startsWith("CUSTOM")) {
                    ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((ViewTimeCycle.CustomSet) viewTimeCycle).setPoint(this.mFramePosition, constraintAttribute, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                    }
                } else {
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
                    }
                    switch (c) {
                        case 0:
                            if (!Float.isNaN(this.mRotationX)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mRotationX, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.mRotationY)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mRotationY, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.mTranslationX)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mTranslationX, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.mTranslationY)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mTranslationY, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.mTranslationZ)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mTranslationZ, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.mProgress)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mProgress, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.mScaleX)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mScaleX, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.mScaleY)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mScaleY, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.mRotation)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mRotation, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.mElevation)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mElevation, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.mTransitionPathRotate)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mTransitionPathRotate, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.mAlpha)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mAlpha, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                                break;
                            } else {
                                continue;
                            }
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            continue;
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ec, code lost:
        if (r8.equals("rotationX") == false) goto L_0x0025;
     */
    @Override // androidx.constraintlayout.motion.widget.Key
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setValue(java.lang.String r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyTimeCycle.setValue(java.lang.String, java.lang.Object):void");
    }
}
