package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MotionKeyCycle extends MotionKey {
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

    public MotionKeyCycle() {
        this.mType = 4;
        this.mCustom = new HashMap<>();
    }

    public static /* synthetic */ Object ipc$super(MotionKeyCycle motionKeyCycle, String str, Object... objArr) {
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
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/constraintlayout/core/motion/key/MotionKeyCycle");
    }

    public void addCycleValues(HashMap<String, KeyCycleOscillator> hashMap) {
        KeyCycleOscillator keyCycleOscillator;
        KeyCycleOscillator keyCycleOscillator2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5feba5", new Object[]{this, hashMap});
            return;
        }
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                CustomVariable customVariable = this.mCustom.get(str.substring(7));
                if (!(customVariable == null || customVariable.getType() != 901 || (keyCycleOscillator = hashMap.get(str)) == null)) {
                    keyCycleOscillator.setPoint(this.mFramePosition, this.mWaveShape, this.mCustomWaveShape, -1, this.mWavePeriod, this.mWaveOffset, this.mWavePhase / 360.0f, customVariable.getValueToInterpolate(), customVariable);
                }
            } else {
                float value = getValue(str);
                if (!Float.isNaN(value) && (keyCycleOscillator2 = hashMap.get(str)) != null) {
                    keyCycleOscillator2.setPoint(this.mFramePosition, this.mWaveShape, this.mCustomWaveShape, -1, this.mWavePeriod, this.mWaveOffset, this.mWavePhase / 360.0f, value);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d03d49", new Object[]{this, hashMap});
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionKey) ipChange.ipc$dispatch("dbbed667", new Object[]{this});
        }
        return null;
    }

    public void dump() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816ea47b", new Object[]{this});
            return;
        }
        PrintStream printStream = System.out;
        printStream.println("MotionKeyCycle{mWaveShape=" + this.mWaveShape + ", mWavePeriod=" + this.mWavePeriod + ", mWaveOffset=" + this.mWaveOffset + ", mWavePhase=" + this.mWavePhase + ", mRotation=" + this.mRotation + '}');
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
        if (!Float.isNaN(this.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            hashSet.add("pathRotate");
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
        if (this.mCustom.size() > 0) {
            Iterator<String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public void printAttributes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9e766b", new Object[]{this});
            return;
        }
        HashSet<String> hashSet = new HashSet<>();
        getAttributeNames(hashSet);
        Utils.log(" ------------- " + this.mFramePosition + " -------------");
        Utils.log("MotionKeyCycle{Shape=" + this.mWaveShape + ", Period=" + this.mWavePeriod + ", Offset=" + this.mWaveOffset + ", Phase=" + this.mWavePhase + '}');
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i = 0; i < strArr.length; i++) {
            Utils.log(strArr[i] + ":" + getValue(strArr[i]));
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ec921a", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i == 401) {
            this.mCurveFit = i2;
            return true;
        } else if (i == 421) {
            this.mWaveShape = i2;
            return true;
        } else if (setValue(i, i2)) {
            return true;
        } else {
            return super.setValue(i, i2);
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
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.key.MotionKeyCycle.getValue(java.lang.String):float");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0137, code lost:
        if (r7.equals("easing") == false) goto L_0x0027;
     */
    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getId(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.key.MotionKeyCycle.getId(java.lang.String):int");
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("418eb31b", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (i == 420) {
            this.mTransitionEasing = str;
            return true;
        } else if (i != 422) {
            return super.setValue(i, str);
        } else {
            this.mCustomWaveShape = str;
            return true;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ec86d7", new Object[]{this, new Integer(i), new Float(f)})).booleanValue();
        }
        if (i == 315) {
            this.mProgress = f;
        } else if (i == 403) {
            this.mAlpha = f;
        } else if (i != 416) {
            switch (i) {
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
                default:
                    switch (i) {
                        case 423:
                            this.mWavePeriod = f;
                            break;
                        case TypedValues.CycleType.TYPE_WAVE_OFFSET /* 424 */:
                            this.mWaveOffset = f;
                            break;
                        case TypedValues.CycleType.TYPE_WAVE_PHASE /* 425 */:
                            this.mWavePhase = f;
                            break;
                        default:
                            return super.setValue(i, f);
                    }
            }
        } else {
            this.mTransitionPathRotate = f;
        }
        return true;
    }
}
