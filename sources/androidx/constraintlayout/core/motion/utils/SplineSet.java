package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.state.WidgetFrame;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import tb.uqu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class SplineSet {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SplineSet";
    private int mCount;
    public CurveFit mCurveFit;
    private String mType;
    public int[] mTimePoints = new int[10];
    public float[] mValues = new float[10];

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CoreSpline extends SplineSet {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long mStart;
        public String mType;

        public CoreSpline(String str, long j) {
            this.mType = str;
            this.mStart = j;
        }

        public static /* synthetic */ Object ipc$super(CoreSpline coreSpline, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/motion/utils/SplineSet$CoreSpline");
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(TypedValues typedValues, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1781fa0", new Object[]{this, typedValues, new Float(f)});
            } else {
                typedValues.setValue(typedValues.getId(this.mType), get(f));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CustomSet extends SplineSet {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String mAttributeName;
        public KeyFrameArray.CustomArray mConstraintAttributeList;
        public float[] mTempValues;

        public CustomSet(String str, KeyFrameArray.CustomArray customArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customArray;
        }

        public static /* synthetic */ Object ipc$super(CustomSet customSet, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/motion/utils/SplineSet$CustomSet");
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c1c77b2", new Object[]{this, new Integer(i), new Float(f)});
                return;
            }
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3cf94aff", new Object[]{this, new Integer(i)});
                return;
            }
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, numberOfInterpolatedValues);
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i2);
                CustomAttribute valueAt = this.mConstraintAttributeList.valueAt(i2);
                dArr[i2] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.mTempValues;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i, dArr, dArr2);
        }

        public void setPoint(int i, CustomAttribute customAttribute) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e8819b3", new Object[]{this, new Integer(i), customAttribute});
            } else {
                this.mConstraintAttributeList.append(i, customAttribute);
            }
        }

        public void setProperty(WidgetFrame widgetFrame, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8d8ac30", new Object[]{this, widgetFrame, new Float(f)});
                return;
            }
            this.mCurveFit.getPos(f, this.mTempValues);
            widgetFrame.setCustomValue(this.mConstraintAttributeList.valueAt(0), this.mTempValues);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CustomSpline extends SplineSet {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String mAttributeName;
        public KeyFrameArray.CustomVar mConstraintAttributeList;
        public float[] mTempValues;

        public CustomSpline(String str, KeyFrameArray.CustomVar customVar) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customVar;
        }

        public static /* synthetic */ Object ipc$super(CustomSpline customSpline, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/motion/utils/SplineSet$CustomSpline");
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c1c77b2", new Object[]{this, new Integer(i), new Float(f)});
                return;
            }
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(TypedValues typedValues, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1781fa0", new Object[]{this, typedValues, new Float(f)});
            } else {
                setProperty((MotionWidget) typedValues, f);
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3cf94aff", new Object[]{this, new Integer(i)});
                return;
            }
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, numberOfInterpolatedValues);
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i2);
                CustomVariable valueAt = this.mConstraintAttributeList.valueAt(i2);
                dArr[i2] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.mTempValues;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i, dArr, dArr2);
        }

        public void setPoint(int i, CustomVariable customVariable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1b47ae5", new Object[]{this, new Integer(i), customVariable});
            } else {
                this.mConstraintAttributeList.append(i, customVariable);
            }
        }

        public void setProperty(MotionWidget motionWidget, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc906b78", new Object[]{this, motionWidget, new Float(f)});
                return;
            }
            this.mCurveFit.getPos(f, this.mTempValues);
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(motionWidget, this.mTempValues);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Sort {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Sort() {
        }

        public static void doubleQuickSort(int[] iArr, float[] fArr, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("878409a", new Object[]{iArr, fArr, new Integer(i), new Integer(i2)});
                return;
            }
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = iArr2[i3 - 1];
                int i5 = i3 - 2;
                int i6 = iArr2[i5];
                if (i4 < i6) {
                    int partition = partition(iArr, fArr, i4, i6);
                    iArr2[i5] = partition - 1;
                    iArr2[i3 - 1] = i4;
                    int i7 = i3 + 1;
                    iArr2[i3] = i6;
                    i3 += 2;
                    iArr2[i7] = partition + 1;
                } else {
                    i3 = i5;
                }
            }
        }

        private static int partition(int[] iArr, float[] fArr, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a0f12f1d", new Object[]{iArr, fArr, new Integer(i), new Integer(i2)})).intValue();
            }
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    swap(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            swap(iArr, fArr, i4, i2);
            return i4;
        }

        private static void swap(int[] iArr, float[] fArr, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c2ae93", new Object[]{iArr, fArr, new Integer(i), new Integer(i2)});
                return;
            }
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    public static SplineSet makeCustomSpline(String str, KeyFrameArray.CustomArray customArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SplineSet) ipChange.ipc$dispatch("bafa9003", new Object[]{str, customArray});
        }
        return new CustomSet(str, customArray);
    }

    public static SplineSet makeCustomSplineSet(String str, KeyFrameArray.CustomVar customVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SplineSet) ipChange.ipc$dispatch("7c54df13", new Object[]{str, customVar});
        }
        return new CustomSpline(str, customVar);
    }

    public static SplineSet makeSpline(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SplineSet) ipChange.ipc$dispatch("14b3a93d", new Object[]{str, new Long(j)});
        }
        return new CoreSpline(str, j);
    }

    public float get(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72fc0a73", new Object[]{this, new Float(f)})).floatValue();
        }
        return (float) this.mCurveFit.getPos(f, 0);
    }

    public CurveFit getCurveFit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CurveFit) ipChange.ipc$dispatch("ac38621b", new Object[]{this});
        }
        return this.mCurveFit;
    }

    public float getSlope(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("166ea934", new Object[]{this, new Float(f)})).floatValue();
        }
        return (float) this.mCurveFit.getSlope(f, 0);
    }

    public void setPoint(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c1c77b2", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        int[] iArr = this.mTimePoints;
        if (iArr.length < this.mCount + 1) {
            this.mTimePoints = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.mValues;
            this.mValues = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.mTimePoints;
        int i2 = this.mCount;
        iArr2[i2] = i;
        this.mValues[i2] = f;
        this.mCount = i2 + 1;
    }

    public void setProperty(TypedValues typedValues, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1781fa0", new Object[]{this, typedValues, new Float(f)});
        } else {
            typedValues.setValue(uqu.a(this.mType), get(f));
        }
    }

    public void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.mType = str;
        }
    }

    public void setup(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cf94aff", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.mCount;
        if (i2 != 0) {
            Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i2 - 1);
            int i3 = 1;
            for (int i4 = 1; i4 < this.mCount; i4++) {
                int[] iArr = this.mTimePoints;
                if (iArr[i4 - 1] != iArr[i4]) {
                    i3++;
                }
            }
            double[] dArr = new double[i3];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i3, 1);
            int i5 = 0;
            for (int i6 = 0; i6 < this.mCount; i6++) {
                if (i6 > 0) {
                    int[] iArr2 = this.mTimePoints;
                    if (iArr2[i6] == iArr2[i6 - 1]) {
                    }
                }
                dArr[i5] = this.mTimePoints[i6] * 0.01d;
                dArr2[i5][0] = this.mValues[i6];
                i5++;
            }
            this.mCurveFit = CurveFit.get(i, dArr, dArr2);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.mCount; i++) {
            str = str + "[" + this.mTimePoints[i] + " , " + decimalFormat.format(this.mValues[i]) + "] ";
        }
        return str;
    }
}
