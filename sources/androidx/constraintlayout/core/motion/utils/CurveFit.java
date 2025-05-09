package androidx.constraintlayout.core.motion.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class CurveFit {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CONSTANT = 2;
    public static final int LINEAR = 1;
    public static final int SPLINE = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Constant extends CurveFit {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public double mTime;
        public double[] mValue;

        public Constant(double d, double[] dArr) {
            this.mTime = d;
            this.mValue = dArr;
        }

        public static /* synthetic */ Object ipc$super(Constant constant, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/motion/utils/CurveFit$Constant");
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public void getPos(double d, double[] dArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bbe9e42", new Object[]{this, new Double(d), dArr});
                return;
            }
            double[] dArr2 = this.mValue;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public double getSlope(double d, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b766096f", new Object[]{this, new Double(d), new Integer(i)})).doubleValue() : vu3.b.GEO_NOT_SUPPORT;
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public double[] getTimePoints() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (double[]) ipChange.ipc$dispatch("7bf39af2", new Object[]{this}) : new double[]{this.mTime};
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public void getPos(double d, float[] fArr) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bbea5c4", new Object[]{this, new Double(d), fArr});
                return;
            }
            while (true) {
                double[] dArr = this.mValue;
                if (i < dArr.length) {
                    fArr[i] = (float) dArr[i];
                    i++;
                } else {
                    return;
                }
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public void getSlope(double d, double[] dArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3563b58b", new Object[]{this, new Double(d), dArr});
                return;
            }
            for (int i = 0; i < this.mValue.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public double getPos(double d, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc3fadd8", new Object[]{this, new Double(d), new Integer(i)})).doubleValue() : this.mValue[i];
        }
    }

    public static CurveFit get(int i, double[] dArr, double[][] dArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CurveFit) ipChange.ipc$dispatch("451ad00b", new Object[]{new Integer(i), dArr, dArr2});
        }
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new MonotonicCurveFit(dArr, dArr2);
        }
        if (i != 2) {
            return new LinearCurveFit(dArr, dArr2);
        }
        return new Constant(dArr[0], dArr2[0]);
    }

    public static CurveFit getArc(int[] iArr, double[] dArr, double[][] dArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CurveFit) ipChange.ipc$dispatch("439e1276", new Object[]{iArr, dArr, dArr2});
        }
        return new ArcCurveFit(iArr, dArr, dArr2);
    }

    public abstract double getPos(double d, int i);

    public abstract void getPos(double d, double[] dArr);

    public abstract void getPos(double d, float[] fArr);

    public abstract double getSlope(double d, int i);

    public abstract void getSlope(double d, double[] dArr);

    public abstract double[] getTimePoints();
}
