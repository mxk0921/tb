package androidx.constraintlayout.core.motion.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StepCurve extends Easing {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final boolean DEBUG = false;
    public MonotonicCurveFit mCurveFit;

    public StepCurve(String str) {
        this.mStr = str;
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i = 0;
        while (indexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        this.mCurveFit = genSpline(Arrays.copyOf(dArr, i + 1));
    }

    private static MonotonicCurveFit genSpline(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonotonicCurveFit) ipChange.ipc$dispatch("ee904380", new Object[]{str});
        }
        String[] split = str.split("\\s+");
        int length = split.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = Double.parseDouble(split[i]);
        }
        return genSpline(dArr);
    }

    public static /* synthetic */ Object ipc$super(StepCurve stepCurve, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/motion/utils/StepCurve");
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72fc02ef", new Object[]{this, new Double(d)})).doubleValue();
        }
        return this.mCurveFit.getPos(d, 0);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49e98cea", new Object[]{this, new Double(d)})).doubleValue();
        }
        return this.mCurveFit.getSlope(d, 0);
    }

    private static MonotonicCurveFit genSpline(double[] dArr) {
        int i;
        char c = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonotonicCurveFit) ipChange.ipc$dispatch("52d041bf", new Object[]{dArr});
        }
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        int i2 = 0;
        while (i2 < dArr.length) {
            double d2 = dArr[i2];
            int i3 = i2 + length2;
            dArr2[i3][c] = d2;
            double d3 = i2 * d;
            dArr3[i3] = d3;
            if (i2 > 0) {
                int i4 = (length2 * 2) + i2;
                dArr2[i4][0] = d2 + 1.0d;
                dArr3[i4] = d3 + 1.0d;
                i = 1;
                int i5 = i2 - 1;
                dArr2[i5][0] = (d2 - 1.0d) - d;
                dArr3[i5] = (d3 - 1.0d) - d;
            } else {
                i = 1;
            }
            i2 += i;
            c = 0;
        }
        MonotonicCurveFit monotonicCurveFit = new MonotonicCurveFit(dArr3, dArr2);
        PrintStream printStream = System.out;
        printStream.println(" 0 " + monotonicCurveFit.getPos(vu3.b.GEO_NOT_SUPPORT, 0));
        printStream.println(" 1 " + monotonicCurveFit.getPos(1.0d, 0));
        return monotonicCurveFit;
    }
}
