package androidx.constraintlayout.core.motion.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.Arrays;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MonotonicCurveFit extends CurveFit {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MonotonicCurveFit";
    private boolean mExtrapolate = true;
    public double[] mSlopeTemp;
    private double[] mT;
    private double[][] mTangent;
    private double[][] mY;

    public MonotonicCurveFit(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.mSlopeTemp = new double[length2];
        int i = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance(cls, i, length2);
        double[][] dArr4 = (double[][]) Array.newInstance(cls, length, length2);
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = 0;
            while (i3 < i) {
                int i4 = i3 + 1;
                double d = dArr[i4] - dArr[i3];
                double[] dArr5 = dArr3[i3];
                double d2 = (dArr2[i4][i2] - dArr2[i3][i2]) / d;
                dArr5[i2] = d2;
                if (i3 == 0) {
                    dArr4[i3][i2] = d2;
                } else {
                    dArr4[i3][i2] = (dArr3[i3 - 1][i2] + d2) * 0.5d;
                }
                i3 = i4;
            }
            dArr4[i][i2] = dArr3[length - 2][i2];
        }
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = 0; i6 < length2; i6++) {
                double d3 = dArr3[i5][i6];
                if (d3 == vu3.b.GEO_NOT_SUPPORT) {
                    dArr4[i5][i6] = 0.0d;
                    dArr4[i5 + 1][i6] = 0.0d;
                } else {
                    double d4 = dArr4[i5][i6] / d3;
                    int i7 = i5 + 1;
                    double d5 = dArr4[i7][i6] / d3;
                    double hypot = Math.hypot(d4, d5);
                    if (hypot > 9.0d) {
                        double d6 = 3.0d / hypot;
                        double[] dArr6 = dArr4[i5];
                        double[] dArr7 = dArr3[i5];
                        dArr6[i6] = d4 * d6 * dArr7[i6];
                        dArr4[i7][i6] = d6 * d5 * dArr7[i6];
                    }
                }
            }
        }
        this.mT = dArr;
        this.mY = dArr2;
        this.mTangent = dArr4;
    }

    public static MonotonicCurveFit buildWave(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonotonicCurveFit) ipChange.ipc$dispatch("b74c93c6", new Object[]{str});
        }
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        while (indexOf2 != -1) {
            i++;
            dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
        }
        dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        return buildWave(Arrays.copyOf(dArr, 1 + i));
    }

    private static double diff(double d, double d2, double d3, double d4, double d5, double d6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f0a943a", new Object[]{new Double(d), new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6)})).doubleValue();
        }
        double d7 = d2 * d2;
        double d8 = d2 * 6.0d;
        double d9 = 3.0d * d;
        return ((((((((((-6.0d) * d7) * d4) + (d4 * d8)) + ((6.0d * d7) * d3)) - (d8 * d3)) + ((d9 * d6) * d7)) + ((d9 * d5) * d7)) - (((2.0d * d) * d6) * d2)) - (((4.0d * d) * d5) * d2)) + (d * d5);
    }

    private static double interpolate(double d, double d2, double d3, double d4, double d5, double d6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13555636", new Object[]{new Double(d), new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6)})).doubleValue();
        }
        double d7 = d2 * d2;
        double d8 = d7 * d2;
        double d9 = 3.0d * d7;
        double d10 = d * d6;
        double d11 = d * d5;
        return (((((((((((-2.0d) * d8) * d4) + (d4 * d9)) + ((d8 * 2.0d) * d3)) - (d9 * d3)) + d3) + (d10 * d8)) + (d8 * d11)) - (d10 * d7)) - (((d * 2.0d) * d5) * d7)) + (d11 * d2);
    }

    public static /* synthetic */ Object ipc$super(MonotonicCurveFit monotonicCurveFit, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/motion/utils/MonotonicCurveFit");
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d, double[] dArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbe9e42", new Object[]{this, new Double(d), dArr});
            return;
        }
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        int length2 = this.mY[0].length;
        if (this.mExtrapolate) {
            double d2 = dArr2[0];
            if (d <= d2) {
                getSlope(d2, this.mSlopeTemp);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = this.mY[0][i2] + ((d - this.mT[0]) * this.mSlopeTemp[i2]);
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr2[i3];
            if (d >= d3) {
                getSlope(d3, this.mSlopeTemp);
                while (i < length2) {
                    dArr[i] = this.mY[i3][i] + ((d - this.mT[i3]) * this.mSlopeTemp[i]);
                    i++;
                }
                return;
            }
        } else if (d <= dArr2[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                dArr[i4] = this.mY[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr2[i5]) {
                while (i < length2) {
                    dArr[i] = this.mY[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.mT[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.mY[i6][i7];
                }
            }
            double[] dArr3 = this.mT;
            int i8 = i6 + 1;
            double d4 = dArr3[i8];
            if (d < d4) {
                double d5 = dArr3[i6];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i < length2) {
                    double[][] dArr4 = this.mY;
                    double d8 = dArr4[i6][i];
                    double d9 = dArr4[i8][i];
                    double[][] dArr5 = this.mTangent;
                    dArr[i] = interpolate(d6, d7, d8, d9, dArr5[i6][i], dArr5[i8][i]);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d, double[] dArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3563b58b", new Object[]{this, new Double(d), dArr});
            return;
        }
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        int length2 = this.mY[0].length;
        double d2 = dArr2[0];
        if (d > d2) {
            d2 = dArr2[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        int i = 0;
        while (i < length - 1) {
            double[] dArr3 = this.mT;
            int i2 = i + 1;
            double d3 = dArr3[i2];
            if (d2 <= d3) {
                double d4 = dArr3[i];
                double d5 = d3 - d4;
                double d6 = (d2 - d4) / d5;
                for (int i3 = 0; i3 < length2; i3++) {
                    double[][] dArr4 = this.mY;
                    double d7 = dArr4[i][i3];
                    double d8 = dArr4[i2][i3];
                    double[][] dArr5 = this.mTangent;
                    dArr[i3] = diff(d5, d6, d7, d8, dArr5[i][i3], dArr5[i2][i3]) / d5;
                }
                return;
            }
            i = i2;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (double[]) ipChange.ipc$dispatch("7bf39af2", new Object[]{this});
        }
        return this.mT;
    }

    private static MonotonicCurveFit buildWave(double[] dArr) {
        int i;
        char c = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonotonicCurveFit) ipChange.ipc$dispatch("abd1de05", new Object[]{dArr});
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
        return new MonotonicCurveFit(dArr3, dArr2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b766096f", new Object[]{this, new Double(d), new Integer(i)})).doubleValue();
        }
        double[] dArr = this.mT;
        int length = dArr.length;
        double d2 = dArr[0];
        if (d >= d2) {
            d2 = dArr[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.mT;
            int i3 = i2 + 1;
            double d3 = dArr2[i3];
            if (d2 <= d3) {
                double d4 = dArr2[i2];
                double d5 = d3 - d4;
                double[][] dArr3 = this.mY;
                double d6 = dArr3[i2][i];
                double d7 = dArr3[i3][i];
                double[][] dArr4 = this.mTangent;
                return diff(d5, (d2 - d4) / d5, d6, d7, dArr4[i2][i], dArr4[i3][i]) / d5;
            }
            i2 = i3;
        }
        return vu3.b.GEO_NOT_SUPPORT;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d, float[] fArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbea5c4", new Object[]{this, new Double(d), fArr});
            return;
        }
        double[] dArr = this.mT;
        int length = dArr.length;
        int length2 = this.mY[0].length;
        if (this.mExtrapolate) {
            double d2 = dArr[0];
            if (d <= d2) {
                getSlope(d2, this.mSlopeTemp);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (this.mY[0][i2] + ((d - this.mT[0]) * this.mSlopeTemp[i2]));
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr[i3];
            if (d >= d3) {
                getSlope(d3, this.mSlopeTemp);
                while (i < length2) {
                    fArr[i] = (float) (this.mY[i3][i] + ((d - this.mT[i3]) * this.mSlopeTemp[i]));
                    i++;
                }
                return;
            }
        } else if (d <= dArr[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                fArr[i4] = (float) this.mY[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr[i5]) {
                while (i < length2) {
                    fArr[i] = (float) this.mY[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.mT[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.mY[i6][i7];
                }
            }
            double[] dArr2 = this.mT;
            int i8 = i6 + 1;
            double d4 = dArr2[i8];
            if (d < d4) {
                double d5 = dArr2[i6];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i < length2) {
                    double[][] dArr3 = this.mY;
                    double d8 = dArr3[i6][i];
                    double d9 = dArr3[i8][i];
                    double[][] dArr4 = this.mTangent;
                    fArr[i] = (float) interpolate(d6, d7, d8, d9, dArr4[i6][i], dArr4[i8][i]);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d, int i) {
        double d2;
        double d3;
        double slope;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc3fadd8", new Object[]{this, new Double(d), new Integer(i)})).doubleValue();
        }
        double[] dArr = this.mT;
        int length = dArr.length;
        if (this.mExtrapolate) {
            double d4 = dArr[0];
            if (d <= d4) {
                d2 = this.mY[0][i];
                d3 = d - d4;
                slope = getSlope(d4, i);
            } else {
                int i3 = length - 1;
                double d5 = dArr[i3];
                if (d >= d5) {
                    d2 = this.mY[i3][i];
                    d3 = d - d5;
                    slope = getSlope(d5, i);
                }
            }
            return d2 + (d3 * slope);
        } else if (d <= dArr[0]) {
            return this.mY[0][i];
        } else {
            int i4 = length - 1;
            if (d >= dArr[i4]) {
                return this.mY[i4][i];
            }
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.mT;
            double d6 = dArr2[i2];
            if (d == d6) {
                return this.mY[i2][i];
            }
            int i5 = i2 + 1;
            double d7 = dArr2[i5];
            if (d < d7) {
                double d8 = d7 - d6;
                double d9 = (d - d6) / d8;
                double[][] dArr3 = this.mY;
                double d10 = dArr3[i2][i];
                double d11 = dArr3[i5][i];
                double[][] dArr4 = this.mTangent;
                return interpolate(d8, d9, d10, d11, dArr4[i2][i], dArr4[i5][i]);
            }
            i2 = i5;
        }
        return vu3.b.GEO_NOT_SUPPORT;
    }
}
