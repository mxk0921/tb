package androidx.constraintlayout.core.motion.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Oscillator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int CUSTOM = 7;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;
    public double[] mArea;
    public MonotonicCurveFit mCustomCurve;
    public String mCustomType;
    public int mType;
    public float[] mPeriod = new float[0];
    public double[] mPosition = new double[0];
    public double mPI2 = 6.283185307179586d;
    private boolean mNormalized = false;

    public double getDP(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72db7f63", new Object[]{this, new Double(d)})).doubleValue();
        }
        if (d <= vu3.b.GEO_NOT_SUPPORT) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.mPosition, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        float[] fArr = this.mPeriod;
        float f = fArr[binarySearch];
        int i = binarySearch - 1;
        float f2 = fArr[i];
        double[] dArr = this.mPosition;
        double d2 = dArr[binarySearch];
        double d3 = dArr[i];
        double d4 = (f - f2) / (d2 - d3);
        return (d * d4) + (f2 - (d4 * d3));
    }

    public double getP(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26d1550b", new Object[]{this, new Double(d)})).doubleValue();
        }
        if (d <= vu3.b.GEO_NOT_SUPPORT) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.mPosition, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        float[] fArr = this.mPeriod;
        float f = fArr[binarySearch];
        int i = binarySearch - 1;
        float f2 = fArr[i];
        double[] dArr = this.mPosition;
        double d2 = dArr[binarySearch];
        double d3 = dArr[i];
        double d4 = (f - f2) / (d2 - d3);
        return this.mArea[i] + ((f2 - (d4 * d3)) * (d - d3)) + ((d4 * ((d * d) - (d3 * d3))) / 2.0d);
    }

    public double getSlope(double d, double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("355940f0", new Object[]{this, new Double(d), new Double(d2), new Double(d3)})).doubleValue();
        }
        double p = d2 + getP(d);
        double dp = getDP(d) + d3;
        switch (this.mType) {
            case 1:
                return vu3.b.GEO_NOT_SUPPORT;
            case 2:
                return dp * 4.0d * Math.signum((((p * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return dp * 2.0d;
            case 4:
                return (-dp) * 2.0d;
            case 5:
                double d4 = this.mPI2;
                return (-d4) * dp * Math.sin(d4 * p);
            case 6:
                return dp * 4.0d * ((((p * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.mCustomCurve.getSlope(p % 1.0d, 0);
            default:
                double d5 = this.mPI2;
                return dp * d5 * Math.cos(d5 * p);
        }
    }

    public double getValue(double d, double d2) {
        double abs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4184c5f0", new Object[]{this, new Double(d), new Double(d2)})).doubleValue();
        }
        double p = getP(d) + d2;
        switch (this.mType) {
            case 1:
                return Math.signum(0.5d - (p % 1.0d));
            case 2:
                abs = Math.abs((((p * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((p * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((p * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.mPI2 * (d2 + p));
            case 6:
                double abs2 = 1.0d - Math.abs(((p * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.mCustomCurve.getPos(p % 1.0d, 0);
            default:
                return Math.sin(this.mPI2 * p);
        }
        return 1.0d - abs;
    }

    public void normalize() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9f9514", new Object[]{this});
            return;
        }
        double d = 0.0d;
        int i2 = 0;
        while (true) {
            if (i2 >= this.mPeriod.length) {
                break;
            }
            d += fArr[i2];
            i2++;
        }
        double d2 = 0.0d;
        int i3 = 1;
        while (true) {
            if (i3 >= this.mPeriod.length) {
                break;
            }
            double[] dArr = this.mPosition;
            d2 += (dArr[i3] - dArr[i3 - 1]) * ((fArr2[i] + fArr2[i3]) / 2.0f);
            i3++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr4 = this.mPeriod;
            if (i4 >= fArr4.length) {
                break;
            }
            fArr4[i4] = fArr4[i4] * ((float) (d / d2));
            i4++;
        }
        this.mArea[0] = 0.0d;
        int i5 = 1;
        while (true) {
            if (i5 < this.mPeriod.length) {
                int i6 = i5 - 1;
                double[] dArr2 = this.mPosition;
                double d3 = dArr2[i5] - dArr2[i6];
                double[] dArr3 = this.mArea;
                dArr3[i5] = dArr3[i6] + (d3 * ((fArr3[i6] + fArr3[i5]) / 2.0f));
                i5++;
            } else {
                this.mNormalized = true;
                return;
            }
        }
    }

    public void setType(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3877ea", new Object[]{this, new Integer(i), str});
            return;
        }
        this.mType = i;
        this.mCustomType = str;
        if (str != null) {
            this.mCustomCurve = MonotonicCurveFit.buildWave(str);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "pos =" + Arrays.toString(this.mPosition) + " period=" + Arrays.toString(this.mPeriod);
    }

    public void addPoint(double d, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0e4a838", new Object[]{this, new Double(d), new Float(f)});
            return;
        }
        int length = this.mPeriod.length + 1;
        int binarySearch = Arrays.binarySearch(this.mPosition, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.mPosition = Arrays.copyOf(this.mPosition, length);
        this.mPeriod = Arrays.copyOf(this.mPeriod, length);
        this.mArea = new double[length];
        double[] dArr = this.mPosition;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.mPosition[binarySearch] = d;
        this.mPeriod[binarySearch] = f;
        this.mNormalized = false;
    }
}
