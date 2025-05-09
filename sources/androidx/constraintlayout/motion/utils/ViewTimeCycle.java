package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class ViewTimeCycle extends TimeCycleSplineSet {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ViewTimeCycle";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class AlphaSet extends ViewTimeCycle {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AlphaSet alphaSet, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/utils/ViewTimeCycle$AlphaSet");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4ffb42df", new Object[]{this, view, new Float(f), new Long(j), keyCache})).booleanValue();
            }
            view.setAlpha(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CustomSet extends ViewTimeCycle {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String mAttributeName;
        public SparseArray<ConstraintAttribute> mConstraintAttributeList;
        public float[] mTempValues;
        public SparseArray<float[]> mWaveProperties = new SparseArray<>();

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = sparseArray;
        }

        public static /* synthetic */ Object ipc$super(CustomSet customSet, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/utils/ViewTimeCycle$CustomSet");
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i, float f, float f2, int i2, float f3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3660dfeb", new Object[]{this, new Integer(i), new Float(f), new Float(f2), new Integer(i2), new Float(f3)});
                return;
            }
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4ffb42df", new Object[]{this, view, new Float(f), new Long(j), keyCache})).booleanValue();
            }
            this.mCurveFit.getPos(f, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.mLastTime;
            if (Float.isNaN(this.mLastCycle)) {
                float floatValue = keyCache.getFloatValue(view, this.mAttributeName, 0);
                this.mLastCycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.mLastCycle = 0.0f;
                }
            }
            float f4 = (float) ((this.mLastCycle + ((j2 * 1.0E-9d) * f2)) % 1.0d);
            this.mLastCycle = f4;
            this.mLastTime = j;
            float calcWave = calcWave(f4);
            this.mContinue = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.mCache;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z2 = this.mContinue;
                float f5 = this.mTempValues[i];
                if (f5 != vu3.b.GEO_NOT_SUPPORT) {
                    z = true;
                } else {
                    z = false;
                }
                this.mContinue = z2 | z;
                fArr2[i] = (f5 * calcWave) + f3;
                i++;
            }
            CustomSupport.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), view, this.mCache);
            if (f2 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3cf94aff", new Object[]{this, new Integer(i)});
                return;
            }
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i2 = numberOfInterpolatedValues + 2;
            this.mTempValues = new float[i2];
            this.mCache = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i3);
                float[] valueAt = this.mWaveProperties.valueAt(i3);
                dArr[i3] = keyAt * 0.01d;
                this.mConstraintAttributeList.valueAt(i3).getValuesToInterpolate(this.mTempValues);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.mTempValues;
                    if (i4 < fArr.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[numberOfInterpolatedValues] = valueAt[0];
                dArr3[numberOfInterpolatedValues + 1] = valueAt[1];
            }
            this.mCurveFit = CurveFit.get(i, dArr, dArr2);
        }

        public void setPoint(int i, ConstraintAttribute constraintAttribute, float f, int i2, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("621fdff6", new Object[]{this, new Integer(i), constraintAttribute, new Float(f), new Integer(i2), new Float(f2)});
                return;
            }
            this.mConstraintAttributeList.append(i, constraintAttribute);
            this.mWaveProperties.append(i, new float[]{f, f2});
            this.mWaveShape = Math.max(this.mWaveShape, i2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ElevationSet extends ViewTimeCycle {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ElevationSet elevationSet, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/utils/ViewTimeCycle$ElevationSet");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4ffb42df", new Object[]{this, view, new Float(f), new Long(j), keyCache})).booleanValue();
            }
            view.setElevation(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class PathRotate extends ViewTimeCycle {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(PathRotate pathRotate, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/utils/ViewTimeCycle$PathRotate");
        }

        public boolean setPathRotate(View view, KeyCache keyCache, float f, long j, double d, double d2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("77915f4", new Object[]{this, view, keyCache, new Float(f), new Long(j), new Double(d), new Double(d2)})).booleanValue();
            }
            view.setRotation(get(f, j, view, keyCache) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4ffb42df", new Object[]{this, view, new Float(f), new Long(j), keyCache})).booleanValue();
            }
            return this.mContinue;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class RotationSet extends ViewTimeCycle {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(RotationSet rotationSet, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/utils/ViewTimeCycle$RotationSet");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4ffb42df", new Object[]{this, view, new Float(f), new Long(j), keyCache})).booleanValue();
            }
            view.setRotation(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class RotationXset extends ViewTimeCycle {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(RotationXset rotationXset, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/utils/ViewTimeCycle$RotationXset");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4ffb42df", new Object[]{this, view, new Float(f), new Long(j), keyCache})).booleanValue();
            }
            view.setRotationX(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class RotationYset extends ViewTimeCycle {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(RotationYset rotationYset, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/utils/ViewTimeCycle$RotationYset");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4ffb42df", new Object[]{this, view, new Float(f), new Long(j), keyCache})).booleanValue();
            }
            view.setRotationY(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ScaleXset extends ViewTimeCycle {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ScaleXset scaleXset, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/utils/ViewTimeCycle$ScaleXset");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4ffb42df", new Object[]{this, view, new Float(f), new Long(j), keyCache})).booleanValue();
            }
            view.setScaleX(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ScaleYset extends ViewTimeCycle {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ScaleYset scaleYset, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/utils/ViewTimeCycle$ScaleYset");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4ffb42df", new Object[]{this, view, new Float(f), new Long(j), keyCache})).booleanValue();
            }
            view.setScaleY(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class TranslationXset extends ViewTimeCycle {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TranslationXset translationXset, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/utils/ViewTimeCycle$TranslationXset");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4ffb42df", new Object[]{this, view, new Float(f), new Long(j), keyCache})).booleanValue();
            }
            view.setTranslationX(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class TranslationYset extends ViewTimeCycle {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TranslationYset translationYset, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/utils/ViewTimeCycle$TranslationYset");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4ffb42df", new Object[]{this, view, new Float(f), new Long(j), keyCache})).booleanValue();
            }
            view.setTranslationY(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class TranslationZset extends ViewTimeCycle {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TranslationZset translationZset, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/utils/ViewTimeCycle$TranslationZset");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4ffb42df", new Object[]{this, view, new Float(f), new Long(j), keyCache})).booleanValue();
            }
            view.setTranslationZ(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    public static /* synthetic */ Object ipc$super(ViewTimeCycle viewTimeCycle, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/utils/ViewTimeCycle");
    }

    public static ViewTimeCycle makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewTimeCycle) ipChange.ipc$dispatch("36366b42", new Object[]{str, sparseArray});
        }
        return new CustomSet(str, sparseArray);
    }

    public float get(float f, long j, View view, KeyCache keyCache) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("511697e4", new Object[]{this, new Float(f), new Long(j), view, keyCache})).floatValue();
        }
        this.mCurveFit.getPos(f, this.mCache);
        float[] fArr = this.mCache;
        float f2 = fArr[1];
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i == 0) {
            this.mContinue = false;
            return fArr[2];
        }
        if (Float.isNaN(this.mLastCycle)) {
            float floatValue = keyCache.getFloatValue(view, this.mType, 0);
            this.mLastCycle = floatValue;
            if (Float.isNaN(floatValue)) {
                this.mLastCycle = 0.0f;
            }
        }
        float f3 = (float) ((this.mLastCycle + (((j - this.mLastTime) * 1.0E-9d) * f2)) % 1.0d);
        this.mLastCycle = f3;
        keyCache.setFloatValue(view, this.mType, 0, f3);
        this.mLastTime = j;
        float f4 = this.mCache[0];
        float calcWave = (calcWave(this.mLastCycle) * f4) + this.mCache[2];
        if (f4 == 0.0f && i == 0) {
            z = false;
        }
        this.mContinue = z;
        return calcWave;
    }

    public abstract boolean setProperty(View view, float f, long j, KeyCache keyCache);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ProgressSet extends ViewTimeCycle {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean mNoMethod = false;

        public static /* synthetic */ Object ipc$super(ProgressSet progressSet, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/motion/utils/ViewTimeCycle$ProgressSet");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f, j, view, keyCache));
            } else if (this.mNoMethod) {
                return false;
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.mNoMethod = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(get(f, j, view, keyCache)));
                    } catch (IllegalAccessException e) {
                        Log.e(ViewTimeCycle.TAG, "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e(ViewTimeCycle.TAG, "unable to setProgress", e2);
                    }
                }
            }
            return this.mContinue;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
        if (r5.equals("rotationY") == false) goto L_0x0028;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.constraintlayout.motion.utils.ViewTimeCycle makeSpline(java.lang.String r5, long r6) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.utils.ViewTimeCycle.makeSpline(java.lang.String, long):androidx.constraintlayout.motion.utils.ViewTimeCycle");
    }
}
