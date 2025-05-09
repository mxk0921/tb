package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import tb.uqu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MotionKeyAttributes extends MotionKey {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    public static final int KEY_TYPE = 1;
    public static final String NAME = "KeyAttribute";
    private static final String TAG = "KeyAttributes";
    private String mTransitionEasing;
    private int mCurveFit = -1;
    private int mVisibility = 0;
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

    public MotionKeyAttributes() {
        this.mType = 1;
        this.mCustom = new HashMap<>();
    }

    private float getFloatValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5e6b9c1", new Object[]{this, new Integer(i)})).floatValue();
        }
        if (i == 100) {
            return this.mFramePosition;
        }
        switch (i) {
            case 303:
                return this.mAlpha;
            case 304:
                return this.mTranslationX;
            case 305:
                return this.mTranslationY;
            case 306:
                return this.mTranslationZ;
            case 307:
                return this.mElevation;
            case 308:
                return this.mRotationX;
            case 309:
                return this.mRotationY;
            case 310:
                return this.mRotation;
            case 311:
                return this.mScaleX;
            case 312:
                return this.mScaleY;
            case 313:
                return this.mPivotX;
            case 314:
                return this.mPivotY;
            case 315:
                return this.mProgress;
            case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                return this.mTransitionPathRotate;
            default:
                return Float.NaN;
        }
    }

    public static /* synthetic */ Object ipc$super(MotionKeyAttributes motionKeyAttributes, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -672364841) {
            return new Boolean(super.setValue(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue()));
        }
        if (hashCode == -672361958) {
            return new Boolean(super.setValue(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
        }
        if (hashCode == 1099871003) {
            return new Boolean(super.setValue(((Number) objArr[0]).intValue(), (String) objArr[1]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/constraintlayout/core/motion/key/MotionKeyAttributes");
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionKey) ipChange.ipc$dispatch("dbbed667", new Object[]{this});
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
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
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.mRotationX)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.mRotationY)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.mPivotX)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.mPivotY)) {
            hashSet.add("pivotY");
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
            hashSet.add("pathRotate");
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
        if (this.mCustom.size() > 0) {
            Iterator<String> it = this.mCustom.keySet().iterator();
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

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eeb42d5", new Object[]{this, str})).intValue();
        }
        return uqu.a(str);
    }

    public void printAttributes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9e766b", new Object[]{this});
            return;
        }
        HashSet<String> hashSet = new HashSet<>();
        getAttributeNames(hashSet);
        PrintStream printStream = System.out;
        printStream.println(" ------------- " + this.mFramePosition + " -------------");
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i = 0; i < strArr.length; i++) {
            int a2 = uqu.a(strArr[i]);
            PrintStream printStream2 = System.out;
            printStream2.println(strArr[i] + ":" + getFloatValue(a2));
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void setInterpolation(HashMap<String, Integer> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4928ef2a", new Object[]{this, hashMap});
            return;
        }
        if (!Float.isNaN(this.mAlpha)) {
            hashMap.put("alpha", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mElevation)) {
            hashMap.put("elevation", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mRotation)) {
            hashMap.put("rotationZ", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mRotationX)) {
            hashMap.put("rotationX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mRotationY)) {
            hashMap.put("rotationY", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mPivotX)) {
            hashMap.put("pivotX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mPivotY)) {
            hashMap.put("pivotY", Integer.valueOf(this.mCurveFit));
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
            hashMap.put("pathRotate", Integer.valueOf(this.mCurveFit));
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
        if (this.mCustom.size() > 0) {
            Iterator<String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put("CUSTOM," + it.next(), Integer.valueOf(this.mCurveFit));
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ec921a", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i == 100) {
            this.mFramePosition = i2;
        } else if (i == 301) {
            this.mCurveFit = i2;
        } else if (i == 302) {
            this.mVisibility = i2;
        } else if (!setValue(i, i2)) {
            return super.setValue(i, i2);
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d03d49", new Object[]{this, hashMap});
            return;
        }
        for (String str : hashMap.keySet()) {
            SplineSet splineSet = hashMap.get(str);
            if (splineSet != null) {
                if (str.startsWith("CUSTOM")) {
                    CustomVariable customVariable = this.mCustom.get(str.substring(7));
                    if (customVariable != null) {
                        ((SplineSet.CustomSpline) splineSet).setPoint(this.mFramePosition, customVariable);
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
                        case -1249320804:
                            if (str.equals("rotationZ")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1225497657:
                            if (str.equals("translationX")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -1225497656:
                            if (str.equals("translationY")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -1225497655:
                            if (str.equals("translationZ")) {
                                c = 5;
                                break;
                            }
                            break;
                        case -1001078227:
                            if (str.equals("progress")) {
                                c = 6;
                                break;
                            }
                            break;
                        case -987906986:
                            if (str.equals("pivotX")) {
                                c = 7;
                                break;
                            }
                            break;
                        case -987906985:
                            if (str.equals("pivotY")) {
                                c = '\b';
                                break;
                            }
                            break;
                        case -908189618:
                            if (str.equals("scaleX")) {
                                c = '\t';
                                break;
                            }
                            break;
                        case -908189617:
                            if (str.equals("scaleY")) {
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
                        case 92909918:
                            if (str.equals("alpha")) {
                                c = '\f';
                                break;
                            }
                            break;
                        case 803192288:
                            if (str.equals("pathRotate")) {
                                c = '\r';
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            if (!Float.isNaN(this.mRotationX)) {
                                splineSet.setPoint(this.mFramePosition, this.mRotationX);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.mRotationY)) {
                                splineSet.setPoint(this.mFramePosition, this.mRotationY);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.mRotation)) {
                                splineSet.setPoint(this.mFramePosition, this.mRotation);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.mTranslationX)) {
                                splineSet.setPoint(this.mFramePosition, this.mTranslationX);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.mTranslationY)) {
                                splineSet.setPoint(this.mFramePosition, this.mTranslationY);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.mTranslationZ)) {
                                splineSet.setPoint(this.mFramePosition, this.mTranslationZ);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.mProgress)) {
                                splineSet.setPoint(this.mFramePosition, this.mProgress);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.mRotationX)) {
                                splineSet.setPoint(this.mFramePosition, this.mPivotX);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.mRotationY)) {
                                splineSet.setPoint(this.mFramePosition, this.mPivotY);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.mScaleX)) {
                                splineSet.setPoint(this.mFramePosition, this.mScaleX);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.mScaleY)) {
                                splineSet.setPoint(this.mFramePosition, this.mScaleY);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.mElevation)) {
                                splineSet.setPoint(this.mFramePosition, this.mElevation);
                                break;
                            } else {
                                continue;
                            }
                        case '\f':
                            if (!Float.isNaN(this.mAlpha)) {
                                splineSet.setPoint(this.mFramePosition, this.mAlpha);
                                break;
                            } else {
                                continue;
                            }
                        case '\r':
                            if (!Float.isNaN(this.mTransitionPathRotate)) {
                                splineSet.setPoint(this.mFramePosition, this.mTransitionPathRotate);
                                break;
                            } else {
                                continue;
                            }
                        default:
                            System.err.println("not supported by KeyAttributes ".concat(str));
                            continue;
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ec86d7", new Object[]{this, new Integer(i), new Float(f)})).booleanValue();
        }
        if (i != 100) {
            switch (i) {
                case 303:
                    this.mAlpha = f;
                    break;
                case 304:
                    this.mTranslationX = f;
                    break;
                case 305:
                    this.mTranslationY = f;
                    break;
                case 306:
                    this.mTranslationZ = f;
                    break;
                case 307:
                    this.mElevation = f;
                    break;
                case 308:
                    this.mRotationX = f;
                    break;
                case 309:
                    this.mRotationY = f;
                    break;
                case 310:
                    this.mRotation = f;
                    break;
                case 311:
                    this.mScaleX = f;
                    break;
                case 312:
                    this.mScaleY = f;
                    break;
                case 313:
                    this.mPivotX = f;
                    break;
                case 314:
                    this.mPivotY = f;
                    break;
                case 315:
                    this.mProgress = f;
                    break;
                case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                    this.mTransitionPathRotate = f;
                    break;
                default:
                    return super.setValue(i, f);
            }
        } else {
            this.mTransitionPathRotate = f;
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("418eb31b", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (i == 101) {
            this.mTargetString = str;
        } else if (i != 317) {
            return super.setValue(i, str);
        } else {
            this.mTransitionEasing = str;
        }
        return true;
    }
}
