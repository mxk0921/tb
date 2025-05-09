package androidx.constraintlayout.core.motion.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LinearCurveFit extends CurveFit {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LinearCurveFit";
    private boolean mExtrapolate = true;
    public double[] mSlopeTemp;
    private double[] mT;
    private double mTotalLength;
    private double[][] mY;

    public LinearCurveFit(double[] dArr, double[][] dArr2) {
        this.mTotalLength = Double.NaN;
        int length = dArr2[0].length;
        this.mSlopeTemp = new double[length];
        this.mT = dArr;
        this.mY = dArr2;
        if (length > 2) {
            double d = 0.0d;
            double d2 = 0.0d;
            int i = 0;
            while (i < dArr.length) {
                double d3 = dArr2[i][0];
                if (i > 0) {
                    Math.hypot(d3 - d, d3 - d2);
                }
                i++;
                d = d3;
                d2 = d;
            }
            this.mTotalLength = vu3.b.GEO_NOT_SUPPORT;
        }
    }

    public static /* synthetic */ Object ipc$super(LinearCurveFit linearCurveFit, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/motion/utils/LinearCurveFit");
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
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    double[][] dArr4 = this.mY;
                    dArr[i] = (dArr4[i6][i] * (1.0d - d6)) + (dArr4[i8][i] * d6);
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
                double d4 = d3 - dArr3[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    double[][] dArr4 = this.mY;
                    dArr[i3] = (dArr4[i2][i3] - dArr4[i][i3]) / d4;
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

    private double getLength2D(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7a71c17", new Object[]{this, new Double(d)})).doubleValue();
        }
        if (Double.isNaN(this.mTotalLength)) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        double[] dArr = this.mT;
        int length = dArr.length;
        if (d <= dArr[0]) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        int i = length - 1;
        if (d >= dArr[i]) {
            return this.mTotalLength;
        }
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        int i2 = 0;
        while (i2 < i) {
            double[] dArr2 = this.mY[i2];
            double d5 = dArr2[0];
            double d6 = dArr2[1];
            if (i2 > 0) {
                d2 += Math.hypot(d5 - d3, d6 - d4);
            }
            double[] dArr3 = this.mT;
            double d7 = dArr3[i2];
            if (d == d7) {
                return d2;
            }
            int i3 = i2 + 1;
            double d8 = dArr3[i3];
            if (d < d8) {
                double d9 = (d - d7) / (d8 - d7);
                double[][] dArr4 = this.mY;
                double[] dArr5 = dArr4[i2];
                double d10 = dArr5[0];
                double[] dArr6 = dArr4[i3];
                double d11 = dArr6[0];
                double d12 = dArr5[1];
                double d13 = 1.0d - d9;
                return d2 + Math.hypot(d6 - ((d12 * d13) + (dArr6[1] * d9)), d5 - ((d10 * d13) + (d11 * d9)));
            }
            i2 = i3;
            d3 = d5;
            d4 = d6;
        }
        return vu3.b.GEO_NOT_SUPPORT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r9 >= r4) goto L_0x0032;
     */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double getSlope(double r9, int r11) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.constraintlayout.core.motion.utils.LinearCurveFit.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0029
            java.lang.Double r3 = new java.lang.Double
            r3.<init>(r9)
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r11)
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r0] = r8
            r10[r1] = r3
            r11 = 2
            r10[r11] = r9
            java.lang.String r9 = "b766096f"
            java.lang.Object r9 = r2.ipc$dispatch(r9, r10)
            java.lang.Number r9 = (java.lang.Number) r9
            double r9 = r9.doubleValue()
            return r9
        L_0x0029:
            double[] r2 = r8.mT
            int r3 = r2.length
            r4 = r2[r0]
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0034
        L_0x0032:
            r9 = r4
            goto L_0x003d
        L_0x0034:
            int r4 = r3 + (-1)
            r4 = r2[r4]
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x003d
            goto L_0x0032
        L_0x003d:
            int r2 = r3 + (-1)
            if (r0 >= r2) goto L_0x005d
            double[] r2 = r8.mT
            int r4 = r0 + 1
            r5 = r2[r4]
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x005b
            r9 = r2[r0]
            double r5 = r5 - r9
            double[][] r9 = r8.mY
            r10 = r9[r0]
            r0 = r10[r11]
            r9 = r9[r4]
            r10 = r9[r11]
            double r10 = r10 - r0
            double r10 = r10 / r5
            return r10
        L_0x005b:
            r0 = r4
            goto L_0x003d
        L_0x005d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.LinearCurveFit.getSlope(double, int):double");
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
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    double[][] dArr3 = this.mY;
                    fArr[i] = (float) ((dArr3[i6][i] * (1.0d - d6)) + (dArr3[i8][i] * d6));
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
                double d8 = (d - d6) / (d7 - d6);
                double[][] dArr3 = this.mY;
                return (dArr3[i2][i] * (1.0d - d8)) + (dArr3[i5][i] * d8);
            }
            i2 = i5;
        }
        return vu3.b.GEO_NOT_SUPPORT;
    }
}
