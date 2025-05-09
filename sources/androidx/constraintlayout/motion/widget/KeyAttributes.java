package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
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
public class KeyAttributes extends Key {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    public static final int KEY_TYPE = 1;
    public static final String NAME = "KeyAttribute";
    private static final String TAG = "KeyAttributes";
    private String mTransitionEasing;
    private int mCurveFit = -1;
    private boolean mVisibility = false;
    private float mAlpha = Float.NaN;
    private float mElevation = Float.NaN;
    private float mRotation = Float.NaN;
    private float mRotationX = Float.NaN;
    private float mRotationY = Float.NaN;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float mTransitionPathRotate = Float.NaN;
    private float mScaleX = Float.NaN;
    private float mScaleY = Float.NaN;
    private float mTranslationX = Float.NaN;
    private float mTranslationY = Float.NaN;
    private float mTranslationZ = Float.NaN;
    private float mProgress = Float.NaN;

    public KeyAttributes() {
        this.mType = 1;
        this.mCustomConstraints = new HashMap<>();
    }

    public static /* synthetic */ float access$000(KeyAttributes keyAttributes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2bbd9f98", new Object[]{keyAttributes})).floatValue();
        }
        return keyAttributes.mAlpha;
    }

    public static /* synthetic */ float access$002(KeyAttributes keyAttributes, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0e1fe0a", new Object[]{keyAttributes, new Float(f)})).floatValue();
        }
        keyAttributes.mAlpha = f;
        return f;
    }

    public static /* synthetic */ float access$100(KeyAttributes keyAttributes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bffc0f37", new Object[]{keyAttributes})).floatValue();
        }
        return keyAttributes.mElevation;
    }

    public static /* synthetic */ float access$1000(KeyAttributes keyAttributes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fdb4989", new Object[]{keyAttributes})).floatValue();
        }
        return keyAttributes.mScaleY;
    }

    public static /* synthetic */ float access$1002(KeyAttributes keyAttributes, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0799239", new Object[]{keyAttributes, new Float(f)})).floatValue();
        }
        keyAttributes.mScaleY = f;
        return f;
    }

    public static /* synthetic */ float access$102(KeyAttributes keyAttributes, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b471824b", new Object[]{keyAttributes, new Float(f)})).floatValue();
        }
        keyAttributes.mElevation = f;
        return f;
    }

    public static /* synthetic */ float access$1100(KeyAttributes keyAttributes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1419b928", new Object[]{keyAttributes})).floatValue();
        }
        return keyAttributes.mTransitionPathRotate;
    }

    public static /* synthetic */ float access$1102(KeyAttributes keyAttributes, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e409167a", new Object[]{keyAttributes, new Float(f)})).floatValue();
        }
        keyAttributes.mTransitionPathRotate = f;
        return f;
    }

    public static /* synthetic */ float access$1200(KeyAttributes keyAttributes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a85828c7", new Object[]{keyAttributes})).floatValue();
        }
        return keyAttributes.mTranslationX;
    }

    public static /* synthetic */ float access$1202(KeyAttributes keyAttributes, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7989abb", new Object[]{keyAttributes, new Float(f)})).floatValue();
        }
        keyAttributes.mTranslationX = f;
        return f;
    }

    public static /* synthetic */ float access$1300(KeyAttributes keyAttributes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c969866", new Object[]{keyAttributes})).floatValue();
        }
        return keyAttributes.mTranslationY;
    }

    public static /* synthetic */ float access$1302(KeyAttributes keyAttributes, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb281efc", new Object[]{keyAttributes, new Float(f)})).floatValue();
        }
        keyAttributes.mTranslationY = f;
        return f;
    }

    public static /* synthetic */ float access$1400(KeyAttributes keyAttributes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0d50805", new Object[]{keyAttributes})).floatValue();
        }
        return keyAttributes.mTranslationZ;
    }

    public static /* synthetic */ float access$1402(KeyAttributes keyAttributes, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("beb7a33d", new Object[]{keyAttributes, new Float(f)})).floatValue();
        }
        keyAttributes.mTranslationZ = f;
        return f;
    }

    public static /* synthetic */ float access$1500(KeyAttributes keyAttributes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("651377a4", new Object[]{keyAttributes})).floatValue();
        }
        return keyAttributes.mProgress;
    }

    public static /* synthetic */ float access$1502(KeyAttributes keyAttributes, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b247277e", new Object[]{keyAttributes, new Float(f)})).floatValue();
        }
        keyAttributes.mProgress = f;
        return f;
    }

    public static /* synthetic */ float access$200(KeyAttributes keyAttributes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("543a7ed6", new Object[]{keyAttributes})).floatValue();
        }
        return keyAttributes.mRotation;
    }

    public static /* synthetic */ float access$202(KeyAttributes keyAttributes, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a801068c", new Object[]{keyAttributes, new Float(f)})).floatValue();
        }
        keyAttributes.mRotation = f;
        return f;
    }

    public static /* synthetic */ int access$300(KeyAttributes keyAttributes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e878ee78", new Object[]{keyAttributes})).intValue();
        }
        return keyAttributes.mCurveFit;
    }

    public static /* synthetic */ int access$302(KeyAttributes keyAttributes, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b909613", new Object[]{keyAttributes, new Integer(i)})).intValue();
        }
        keyAttributes.mCurveFit = i;
        return i;
    }

    public static /* synthetic */ float access$400(KeyAttributes keyAttributes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cb75e14", new Object[]{keyAttributes})).floatValue();
        }
        return keyAttributes.mScaleX;
    }

    public static /* synthetic */ float access$402(KeyAttributes keyAttributes, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f200f0e", new Object[]{keyAttributes, new Float(f)})).floatValue();
        }
        keyAttributes.mScaleX = f;
        return f;
    }

    public static /* synthetic */ float access$500(KeyAttributes keyAttributes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10f5cdb3", new Object[]{keyAttributes})).floatValue();
        }
        return keyAttributes.mRotationX;
    }

    public static /* synthetic */ float access$502(KeyAttributes keyAttributes, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82af934f", new Object[]{keyAttributes, new Float(f)})).floatValue();
        }
        keyAttributes.mRotationX = f;
        return f;
    }

    public static /* synthetic */ float access$600(KeyAttributes keyAttributes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5343d52", new Object[]{keyAttributes})).floatValue();
        }
        return keyAttributes.mRotationY;
    }

    public static /* synthetic */ float access$602(KeyAttributes keyAttributes, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("763f1790", new Object[]{keyAttributes, new Float(f)})).floatValue();
        }
        keyAttributes.mRotationY = f;
        return f;
    }

    public static /* synthetic */ float access$700(KeyAttributes keyAttributes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3972acf1", new Object[]{keyAttributes})).floatValue();
        }
        return keyAttributes.mPivotX;
    }

    public static /* synthetic */ float access$702(KeyAttributes keyAttributes, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69ce9bd1", new Object[]{keyAttributes, new Float(f)})).floatValue();
        }
        keyAttributes.mPivotX = f;
        return f;
    }

    public static /* synthetic */ float access$800(KeyAttributes keyAttributes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cdb11c90", new Object[]{keyAttributes})).floatValue();
        }
        return keyAttributes.mPivotY;
    }

    public static /* synthetic */ float access$802(KeyAttributes keyAttributes, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d5e2012", new Object[]{keyAttributes, new Float(f)})).floatValue();
        }
        keyAttributes.mPivotY = f;
        return f;
    }

    public static /* synthetic */ String access$902(KeyAttributes keyAttributes, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a008abf9", new Object[]{keyAttributes, str});
        }
        keyAttributes.mTransitionEasing = str;
        return str;
    }

    public static /* synthetic */ Object ipc$super(KeyAttributes keyAttributes, String str, Object... objArr) {
        if (str.hashCode() == -843737632) {
            return super.copy((Key) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/widget/KeyAttributes");
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Key) ipChange.ipc$dispatch("cdb595e0", new Object[]{this, key});
        }
        super.copy(key);
        KeyAttributes keyAttributes = (KeyAttributes) key;
        this.mCurveFit = keyAttributes.mCurveFit;
        this.mVisibility = keyAttributes.mVisibility;
        this.mAlpha = keyAttributes.mAlpha;
        this.mElevation = keyAttributes.mElevation;
        this.mRotation = keyAttributes.mRotation;
        this.mRotationX = keyAttributes.mRotationX;
        this.mRotationY = keyAttributes.mRotationY;
        this.mPivotX = keyAttributes.mPivotX;
        this.mPivotY = keyAttributes.mPivotY;
        this.mTransitionPathRotate = keyAttributes.mTransitionPathRotate;
        this.mScaleX = keyAttributes.mScaleX;
        this.mScaleY = keyAttributes.mScaleY;
        this.mTranslationX = keyAttributes.mTranslationX;
        this.mTranslationY = keyAttributes.mTranslationY;
        this.mTranslationZ = keyAttributes.mTranslationZ;
        this.mProgress = keyAttributes.mProgress;
        this.mTransitionEasing = keyAttributes.mTransitionEasing;
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
        if (!Float.isNaN(this.mPivotX)) {
            hashSet.add(Key.PIVOT_X);
        }
        if (!Float.isNaN(this.mPivotY)) {
            hashSet.add(Key.PIVOT_Y);
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

    public int getCurveFit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3daae92", new Object[]{this})).intValue();
        }
        return this.mCurveFit;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78192133", new Object[]{this, context, attributeSet});
        } else {
            Loader.read(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyAttribute));
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
            if (!Float.isNaN(this.mPivotX)) {
                hashMap.put(Key.PIVOT_X, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mPivotY)) {
                hashMap.put(Key.PIVOT_Y, Integer.valueOf(this.mCurveFit));
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
            if (!Float.isNaN(this.mScaleY)) {
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
        private static final int ANDROID_PIVOT_X = 19;
        private static final int ANDROID_PIVOT_Y = 20;
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
        private static SparseIntArray sAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sAttrMap = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyAttribute_android_alpha, 1);
            sAttrMap.append(R.styleable.KeyAttribute_android_elevation, 2);
            sAttrMap.append(R.styleable.KeyAttribute_android_rotation, 4);
            sAttrMap.append(R.styleable.KeyAttribute_android_rotationX, 5);
            sAttrMap.append(R.styleable.KeyAttribute_android_rotationY, 6);
            sAttrMap.append(R.styleable.KeyAttribute_android_transformPivotX, 19);
            sAttrMap.append(R.styleable.KeyAttribute_android_transformPivotY, 20);
            sAttrMap.append(R.styleable.KeyAttribute_android_scaleX, 7);
            sAttrMap.append(R.styleable.KeyAttribute_transitionPathRotate, 8);
            sAttrMap.append(R.styleable.KeyAttribute_transitionEasing, 9);
            sAttrMap.append(R.styleable.KeyAttribute_motionTarget, 10);
            sAttrMap.append(R.styleable.KeyAttribute_framePosition, 12);
            sAttrMap.append(R.styleable.KeyAttribute_curveFit, 13);
            sAttrMap.append(R.styleable.KeyAttribute_android_scaleY, 14);
            sAttrMap.append(R.styleable.KeyAttribute_android_translationX, 15);
            sAttrMap.append(R.styleable.KeyAttribute_android_translationY, 16);
            sAttrMap.append(R.styleable.KeyAttribute_android_translationZ, 17);
            sAttrMap.append(R.styleable.KeyAttribute_motionProgress, 18);
        }

        private Loader() {
        }

        public static void read(KeyAttributes keyAttributes, TypedArray typedArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b728d67d", new Object[]{keyAttributes, typedArray});
                return;
            }
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (sAttrMap.get(index)) {
                    case 1:
                        KeyAttributes.access$002(keyAttributes, typedArray.getFloat(index, KeyAttributes.access$000(keyAttributes)));
                        break;
                    case 2:
                        KeyAttributes.access$102(keyAttributes, typedArray.getDimension(index, KeyAttributes.access$100(keyAttributes)));
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sAttrMap.get(index));
                        break;
                    case 4:
                        KeyAttributes.access$202(keyAttributes, typedArray.getFloat(index, KeyAttributes.access$200(keyAttributes)));
                        break;
                    case 5:
                        KeyAttributes.access$502(keyAttributes, typedArray.getFloat(index, KeyAttributes.access$500(keyAttributes)));
                        break;
                    case 6:
                        KeyAttributes.access$602(keyAttributes, typedArray.getFloat(index, KeyAttributes.access$600(keyAttributes)));
                        break;
                    case 7:
                        KeyAttributes.access$402(keyAttributes, typedArray.getFloat(index, KeyAttributes.access$400(keyAttributes)));
                        break;
                    case 8:
                        KeyAttributes.access$1102(keyAttributes, typedArray.getFloat(index, KeyAttributes.access$1100(keyAttributes)));
                        break;
                    case 9:
                        KeyAttributes.access$902(keyAttributes, typedArray.getString(index));
                        break;
                    case 10:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (typedArray.peekValue(index).type == 3) {
                                keyAttributes.mTargetString = typedArray.getString(index);
                                break;
                            } else {
                                keyAttributes.mTargetId = typedArray.getResourceId(index, keyAttributes.mTargetId);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, keyAttributes.mTargetId);
                            keyAttributes.mTargetId = resourceId;
                            if (resourceId == -1) {
                                keyAttributes.mTargetString = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        }
                    case 12:
                        keyAttributes.mFramePosition = typedArray.getInt(index, keyAttributes.mFramePosition);
                        break;
                    case 13:
                        KeyAttributes.access$302(keyAttributes, typedArray.getInteger(index, KeyAttributes.access$300(keyAttributes)));
                        break;
                    case 14:
                        KeyAttributes.access$1002(keyAttributes, typedArray.getFloat(index, KeyAttributes.access$1000(keyAttributes)));
                        break;
                    case 15:
                        KeyAttributes.access$1202(keyAttributes, typedArray.getDimension(index, KeyAttributes.access$1200(keyAttributes)));
                        break;
                    case 16:
                        KeyAttributes.access$1302(keyAttributes, typedArray.getDimension(index, KeyAttributes.access$1300(keyAttributes)));
                        break;
                    case 17:
                        KeyAttributes.access$1402(keyAttributes, typedArray.getDimension(index, KeyAttributes.access$1400(keyAttributes)));
                        break;
                    case 18:
                        KeyAttributes.access$1502(keyAttributes, typedArray.getFloat(index, KeyAttributes.access$1500(keyAttributes)));
                        break;
                    case 19:
                        KeyAttributes.access$702(keyAttributes, typedArray.getDimension(index, KeyAttributes.access$700(keyAttributes)));
                        break;
                    case 20:
                        KeyAttributes.access$802(keyAttributes, typedArray.getDimension(index, KeyAttributes.access$800(keyAttributes)));
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Key) ipChange.ipc$dispatch("94336aea", new Object[]{this}) : new KeyAttributes().copy(this);
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d03d49", new Object[]{this, hashMap});
            return;
        }
        for (String str : hashMap.keySet()) {
            ViewSpline viewSpline = hashMap.get(str);
            if (viewSpline != null) {
                if (str.startsWith("CUSTOM")) {
                    ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((ViewSpline.CustomSet) viewSpline).setPoint(this.mFramePosition, constraintAttribute);
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
                        case -760884510:
                            if (str.equals(Key.PIVOT_X)) {
                                c = '\b';
                                break;
                            }
                            break;
                        case -760884509:
                            if (str.equals(Key.PIVOT_Y)) {
                                c = '\t';
                                break;
                            }
                            break;
                        case -40300674:
                            if (str.equals(Key.ROTATION)) {
                                c = '\n';
                                break;
                            }
                            break;
                        case -4379043:
                            if (str.equals("elevation")) {
                                c = 11;
                                break;
                            }
                            break;
                        case 37232917:
                            if (str.equals("transitionPathRotate")) {
                                c = '\f';
                                break;
                            }
                            break;
                        case 92909918:
                            if (str.equals("alpha")) {
                                c = '\r';
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            if (!Float.isNaN(this.mRotationX)) {
                                viewSpline.setPoint(this.mFramePosition, this.mRotationX);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.mRotationY)) {
                                viewSpline.setPoint(this.mFramePosition, this.mRotationY);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.mTranslationX)) {
                                viewSpline.setPoint(this.mFramePosition, this.mTranslationX);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.mTranslationY)) {
                                viewSpline.setPoint(this.mFramePosition, this.mTranslationY);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.mTranslationZ)) {
                                viewSpline.setPoint(this.mFramePosition, this.mTranslationZ);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.mProgress)) {
                                viewSpline.setPoint(this.mFramePosition, this.mProgress);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.mScaleX)) {
                                viewSpline.setPoint(this.mFramePosition, this.mScaleX);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.mScaleY)) {
                                viewSpline.setPoint(this.mFramePosition, this.mScaleY);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.mRotationX)) {
                                viewSpline.setPoint(this.mFramePosition, this.mPivotX);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.mRotationY)) {
                                viewSpline.setPoint(this.mFramePosition, this.mPivotY);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.mRotation)) {
                                viewSpline.setPoint(this.mFramePosition, this.mRotation);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.mElevation)) {
                                viewSpline.setPoint(this.mFramePosition, this.mElevation);
                                break;
                            } else {
                                continue;
                            }
                        case '\f':
                            if (!Float.isNaN(this.mTransitionPathRotate)) {
                                viewSpline.setPoint(this.mFramePosition, this.mTransitionPathRotate);
                                break;
                            } else {
                                continue;
                            }
                        case '\r':
                            if (!Float.isNaN(this.mAlpha)) {
                                viewSpline.setPoint(this.mFramePosition, this.mAlpha);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00eb, code lost:
        if (r7.equals("rotationX") == false) goto L_0x0024;
     */
    @Override // androidx.constraintlayout.motion.widget.Key
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setValue(java.lang.String r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyAttributes.setValue(java.lang.String, java.lang.Object):void");
    }
}
