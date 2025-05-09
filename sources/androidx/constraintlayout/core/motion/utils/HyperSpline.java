package androidx.constraintlayout.core.motion.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HyperSpline {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public double[][] mCtl;
    public Cubic[][] mCurve;
    public double[] mCurveLength;
    public int mDimensionality;
    public int mPoints;
    public double mTotalLength;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Cubic {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public double mA;
        public double mB;
        public double mC;
        public double mD;

        public Cubic(double d, double d2, double d3, double d4) {
            this.mA = d;
            this.mB = d2;
            this.mC = d3;
            this.mD = d4;
        }

        public double eval(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("26edbd69", new Object[]{this, new Double(d)})).doubleValue();
            }
            return (((((this.mD * d) + this.mC) * d) + this.mB) * d) + this.mA;
        }

        public double vel(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7b86df08", new Object[]{this, new Double(d)})).doubleValue();
            }
            return (((this.mD * 3.0d * d) + (this.mC * 2.0d)) * d) + this.mB;
        }
    }

    public HyperSpline(double[][] dArr) {
        setup(dArr);
    }

    public double approxLength(Cubic[] cubicArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2cf8ec7", new Object[]{this, cubicArr})).doubleValue();
        }
        int length = cubicArr.length;
        double[] dArr = new double[length];
        double d = vu3.b.GEO_NOT_SUPPORT;
        double d2 = 0.0d;
        for (double d3 = 0.0d; d3 < 1.0d; d3 += 0.1d) {
            double d4 = 0.0d;
            for (int i = 0; i < length; i++) {
                double d5 = dArr[i];
                double eval = cubicArr[i].eval(d3);
                dArr[i] = eval;
                double d6 = d5 - eval;
                d4 += d6 * d6;
            }
            if (d3 > vu3.b.GEO_NOT_SUPPORT) {
                d2 += Math.sqrt(d4);
            }
        }
        for (int i2 = 0; i2 < length; i2++) {
            double d7 = dArr[i2];
            double eval2 = cubicArr[i2].eval(1.0d);
            dArr[i2] = eval2;
            double d8 = d7 - eval2;
            d += d8 * d8;
        }
        return d2 + Math.sqrt(d);
    }

    public void getPos(double d, double[] dArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbe9e42", new Object[]{this, new Double(d), dArr});
            return;
        }
        double d2 = d * this.mTotalLength;
        int i = 0;
        while (true) {
            double[] dArr2 = this.mCurveLength;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d3 = dArr2[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = this.mCurve[i2][i].eval(d2 / this.mCurveLength[i]);
        }
    }

    public void getVelocity(double d, double[] dArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39dcf16d", new Object[]{this, new Double(d), dArr});
            return;
        }
        double d2 = d * this.mTotalLength;
        int i = 0;
        while (true) {
            double[] dArr2 = this.mCurveLength;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d3 = dArr2[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = this.mCurve[i2][i].vel(d2 / this.mCurveLength[i]);
        }
    }

    public HyperSpline() {
    }

    public void setup(double[][] dArr) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e6aa9a", new Object[]{this, dArr});
            return;
        }
        int length = dArr[0].length;
        this.mDimensionality = length;
        int length2 = dArr.length;
        this.mPoints = length2;
        this.mCtl = (double[][]) Array.newInstance(Double.TYPE, length, length2);
        this.mCurve = new Cubic[this.mDimensionality];
        for (int i2 = 0; i2 < this.mDimensionality; i2++) {
            for (int i3 = 0; i3 < this.mPoints; i3++) {
                this.mCtl[i2][i3] = dArr[i3][i2];
            }
        }
        int i4 = 0;
        while (true) {
            i = this.mDimensionality;
            if (i4 >= i) {
                break;
            }
            Cubic[][] cubicArr = this.mCurve;
            double[] dArr2 = this.mCtl[i4];
            cubicArr[i4] = calcNaturalCubic(dArr2.length, dArr2);
            i4++;
        }
        this.mCurveLength = new double[this.mPoints - 1];
        this.mTotalLength = vu3.b.GEO_NOT_SUPPORT;
        Cubic[] cubicArr2 = new Cubic[i];
        for (int i5 = 0; i5 < this.mCurveLength.length; i5++) {
            for (int i6 = 0; i6 < this.mDimensionality; i6++) {
                cubicArr2[i6] = this.mCurve[i6][i5];
            }
            double d = this.mTotalLength;
            double[] dArr3 = this.mCurveLength;
            double approxLength = approxLength(cubicArr2);
            dArr3[i5] = approxLength;
            this.mTotalLength = d + approxLength;
        }
    }

    public static Cubic[] calcNaturalCubic(int i, double[] dArr) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cubic[]) ipChange.ipc$dispatch("ed54cc19", new Object[]{new Integer(i), dArr});
        }
        double[] dArr2 = new double[i];
        double[] dArr3 = new double[i];
        double[] dArr4 = new double[i];
        int i3 = i - 1;
        dArr2[0] = 0.5d;
        for (int i4 = 1; i4 < i3; i4++) {
            dArr2[i4] = 1.0d / (4.0d - dArr2[i4 - 1]);
        }
        int i5 = i - 2;
        dArr2[i3] = 1.0d / (2.0d - dArr2[i5]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        int i6 = 1;
        while (i6 < i3) {
            int i7 = i6 + 1;
            int i8 = i6 - 1;
            dArr3[i6] = (((dArr[i7] - dArr[i8]) * 3.0d) - dArr3[i8]) * dArr2[i6];
            i6 = i7;
        }
        double d = (((dArr[i3] - dArr[i5]) * 3.0d) - dArr3[i5]) * dArr2[i3];
        dArr3[i3] = d;
        dArr4[i3] = d;
        while (i5 >= 0) {
            dArr4[i5] = dArr3[i5] - (dArr2[i5] * dArr4[i5 + 1]);
            i5--;
        }
        Cubic[] cubicArr = new Cubic[i3];
        while (i2 < i3) {
            double d2 = dArr[i2];
            double d3 = dArr4[i2];
            int i9 = i2 + 1;
            double d4 = dArr[i9];
            double d5 = dArr4[i9];
            cubicArr[i2] = new Cubic((float) d2, d3, (((d4 - d2) * 3.0d) - (d3 * 2.0d)) - d5, ((d2 - d4) * 2.0d) + d3 + d5);
            i2 = i9;
        }
        return cubicArr;
    }

    public void getPos(double d, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbea5c4", new Object[]{this, new Double(d), fArr});
            return;
        }
        double d2 = d * this.mTotalLength;
        int i = 0;
        while (true) {
            double[] dArr = this.mCurveLength;
            if (i >= dArr.length - 1) {
                break;
            }
            double d3 = dArr[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = (float) this.mCurve[i2][i].eval(d2 / this.mCurveLength[i]);
        }
    }

    public double getPos(double d, int i) {
        double[] dArr;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc3fadd8", new Object[]{this, new Double(d), new Integer(i)})).doubleValue();
        }
        double d2 = d * this.mTotalLength;
        while (true) {
            dArr = this.mCurveLength;
            if (i2 >= dArr.length - 1) {
                break;
            }
            double d3 = dArr[i2];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i2++;
        }
        return this.mCurve[i][i2].eval(d2 / dArr[i2]);
    }
}
