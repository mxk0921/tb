package androidx.constraintlayout.core.motion.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ArcCurveFit extends CurveFit {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ARC_ABOVE = 5;
    public static final int ARC_BELOW = 4;
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int DOWN_ARC = 4;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    private static final int UP_ARC = 5;
    public Arc[] mArcs;
    private boolean mExtrapolate = true;
    private final double[] mTime;

    public ArcCurveFit(int[] iArr, double[] dArr, double[][] dArr2) {
        this.mTime = dArr;
        this.mArcs = new Arc[dArr.length - 1];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            Arc[] arcArr = this.mArcs;
            if (i < arcArr.length) {
                int i4 = iArr[i];
                if (i4 == 0) {
                    i3 = 3;
                } else if (i4 == 1) {
                    i2 = 1;
                    i3 = 1;
                } else if (i4 == 2) {
                    i2 = 2;
                    i3 = 2;
                } else if (i4 == 3) {
                    if (i2 == 1) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    i3 = i2;
                } else if (i4 == 4) {
                    i3 = 4;
                } else if (i4 == 5) {
                    i3 = 5;
                }
                double d = dArr[i];
                int i5 = i + 1;
                double d2 = dArr[i5];
                double[] dArr3 = dArr2[i];
                double d3 = dArr3[0];
                double d4 = dArr3[1];
                double[] dArr4 = dArr2[i5];
                arcArr[i] = new Arc(i3, d, d2, d3, d4, dArr4[0], dArr4[1]);
                i = i5;
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(ArcCurveFit arcCurveFit, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/motion/utils/ArcCurveFit");
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d, double[] dArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbe9e42", new Object[]{this, new Double(d), dArr});
            return;
        }
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d2 = arc.mTime1;
            if (d < d2) {
                double d3 = d - d2;
                if (arc.mLinear) {
                    dArr[0] = arc.getLinearX(d2) + (this.mArcs[0].getLinearDX(d2) * d3);
                    dArr[1] = this.mArcs[0].getLinearY(d2) + (d3 * this.mArcs[0].getLinearDY(d2));
                    return;
                }
                arc.setPoint(d2);
                dArr[0] = this.mArcs[0].getX() + (this.mArcs[0].getDX() * d3);
                dArr[1] = this.mArcs[0].getY() + (d3 * this.mArcs[0].getDY());
                return;
            } else if (d > arcArr[arcArr.length - 1].mTime2) {
                double d4 = arcArr[arcArr.length - 1].mTime2;
                double d5 = d - d4;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.mLinear) {
                    dArr[0] = arc2.getLinearX(d4) + (this.mArcs[length].getLinearDX(d4) * d5);
                    dArr[1] = this.mArcs[length].getLinearY(d4) + (d5 * this.mArcs[length].getLinearDY(d4));
                    return;
                }
                arc2.setPoint(d);
                dArr[0] = this.mArcs[length].getX() + (this.mArcs[length].getDX() * d5);
                dArr[1] = this.mArcs[length].getY() + (d5 * this.mArcs[length].getDY());
                return;
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d6 = arcArr2[0].mTime1;
            if (d < d6) {
                d = d6;
            }
            if (d > arcArr2[arcArr2.length - 1].mTime2) {
                d = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i < arcArr3.length) {
                Arc arc3 = arcArr3[i];
                if (d > arc3.mTime2) {
                    i++;
                } else if (arc3.mLinear) {
                    dArr[0] = arc3.getLinearX(d);
                    dArr[1] = this.mArcs[i].getLinearY(d);
                    return;
                } else {
                    arc3.setPoint(d);
                    dArr[0] = this.mArcs[i].getX();
                    dArr[1] = this.mArcs[i].getY();
                    return;
                }
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
        Arc[] arcArr = this.mArcs;
        double d2 = arcArr[0].mTime1;
        if (d < d2) {
            d = d2;
        } else if (d > arcArr[arcArr.length - 1].mTime2) {
            d = arcArr[arcArr.length - 1].mTime2;
        }
        int i = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i < arcArr2.length) {
                Arc arc = arcArr2[i];
                if (d > arc.mTime2) {
                    i++;
                } else if (arc.mLinear) {
                    dArr[0] = arc.getLinearDX(d);
                    dArr[1] = this.mArcs[i].getLinearDY(d);
                    return;
                } else {
                    arc.setPoint(d);
                    dArr[0] = this.mArcs[i].getDX();
                    dArr[1] = this.mArcs[i].getDY();
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (double[]) ipChange.ipc$dispatch("7bf39af2", new Object[]{this});
        }
        return this.mTime;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b766096f", new Object[]{this, new Double(d), new Integer(i)})).doubleValue();
        }
        Arc[] arcArr = this.mArcs;
        double d2 = arcArr[0].mTime1;
        if (d < d2) {
            d = d2;
        }
        if (d > arcArr[arcArr.length - 1].mTime2) {
            d = arcArr[arcArr.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i2 >= arcArr2.length) {
                return Double.NaN;
            }
            Arc arc = arcArr2[i2];
            if (d > arc.mTime2) {
                i2++;
            } else if (!arc.mLinear) {
                arc.setPoint(d);
                if (i == 0) {
                    return this.mArcs[i2].getDX();
                }
                return this.mArcs[i2].getDY();
            } else if (i == 0) {
                return arc.getLinearDX(d);
            } else {
                return arc.getLinearDY(d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Arc {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final double EPSILON = 0.001d;
        private static final String TAG = "Arc";
        private static double[] sOurPercent = new double[91];
        public double mArcDistance;
        public double mArcVelocity;
        public double mEllipseA;
        public double mEllipseB;
        public double mEllipseCenterX;
        public double mEllipseCenterY;
        public boolean mLinear;
        public double[] mLut;
        public double mOneOverDeltaTime;
        public double mTime1;
        public double mTime2;
        public double mTmpCosAngle;
        public double mTmpSinAngle;
        public boolean mVertical;
        public double mX1;
        public double mX2;
        public double mY1;
        public double mY2;

        public Arc(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            int i2;
            double d7;
            double d8;
            this.mLinear = false;
            double d9 = d5 - d3;
            double d10 = d6 - d4;
            int i3 = 1;
            if (i == 1) {
                this.mVertical = true;
            } else if (i == 4) {
                this.mVertical = d10 > vu3.b.GEO_NOT_SUPPORT;
            } else if (i != 5) {
                this.mVertical = false;
            } else {
                this.mVertical = d10 < vu3.b.GEO_NOT_SUPPORT;
            }
            this.mTime1 = d;
            this.mTime2 = d2;
            this.mOneOverDeltaTime = 1.0d / (d2 - d);
            if (3 == i) {
                this.mLinear = true;
            }
            if (this.mLinear || Math.abs(d9) < 0.001d || Math.abs(d10) < 0.001d) {
                this.mLinear = true;
                this.mX1 = d3;
                this.mX2 = d5;
                this.mY1 = d4;
                this.mY2 = d6;
                double hypot = Math.hypot(d10, d9);
                this.mArcDistance = hypot;
                this.mArcVelocity = hypot * this.mOneOverDeltaTime;
                double d11 = this.mTime2;
                double d12 = this.mTime1;
                this.mEllipseCenterX = d9 / (d11 - d12);
                this.mEllipseCenterY = d10 / (d11 - d12);
                return;
            }
            this.mLut = new double[101];
            boolean z = this.mVertical;
            if (z) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            this.mEllipseA = d9 * i2;
            this.mEllipseB = d10 * (!z ? -1 : i3);
            if (z) {
                d7 = d5;
            } else {
                d7 = d3;
            }
            this.mEllipseCenterX = d7;
            if (z) {
                d8 = d4;
            } else {
                d8 = d6;
            }
            this.mEllipseCenterY = d8;
            buildTable(d3, d4, d5, d6);
            this.mArcVelocity = this.mArcDistance * this.mOneOverDeltaTime;
        }

        public double getDX() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("14a959df", new Object[]{this})).doubleValue();
            }
            double d = this.mEllipseA * this.mTmpCosAngle;
            double hypot = this.mArcVelocity / Math.hypot(d, (-this.mEllipseB) * this.mTmpSinAngle);
            if (this.mVertical) {
                d = -d;
            }
            return d * hypot;
        }

        public double getDY() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("14b77160", new Object[]{this})).doubleValue();
            }
            double d = this.mEllipseA * this.mTmpCosAngle;
            double d2 = (-this.mEllipseB) * this.mTmpSinAngle;
            double hypot = this.mArcVelocity / Math.hypot(d, d2);
            if (this.mVertical) {
                return (-d2) * hypot;
            }
            return d2 * hypot;
        }

        public double getLinearDX(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f5e369f6", new Object[]{this, new Double(d)})).doubleValue();
            }
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f7984295", new Object[]{this, new Double(d)})).doubleValue();
            }
            return this.mEllipseCenterY;
        }

        public double getLinearX(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("abde5508", new Object[]{this, new Double(d)})).doubleValue();
            }
            double d2 = (d - this.mTime1) * this.mOneOverDeltaTime;
            double d3 = this.mX1;
            return d3 + (d2 * (this.mX2 - d3));
        }

        public double getLinearY(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ad932da7", new Object[]{this, new Double(d)})).doubleValue();
            }
            double d2 = (d - this.mTime1) * this.mOneOverDeltaTime;
            double d3 = this.mY1;
            return d3 + (d2 * (this.mY2 - d3));
        }

        public double getX() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("754e2f37", new Object[]{this})).doubleValue();
            }
            return this.mEllipseCenterX + (this.mEllipseA * this.mTmpSinAngle);
        }

        public double getY() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("755c46b8", new Object[]{this})).doubleValue();
            }
            return this.mEllipseCenterY + (this.mEllipseB * this.mTmpCosAngle);
        }

        public double lookup(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("60109f4b", new Object[]{this, new Double(d)})).doubleValue();
            }
            if (d <= vu3.b.GEO_NOT_SUPPORT) {
                return vu3.b.GEO_NOT_SUPPORT;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = d * (dArr.length - 1);
            int i = (int) length;
            double d2 = length - i;
            double d3 = dArr[i];
            return d3 + (d2 * (dArr[i + 1] - d3));
        }

        public void setPoint(double d) {
            double d2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65091709", new Object[]{this, new Double(d)});
                return;
            }
            if (this.mVertical) {
                d2 = this.mTime2 - d;
            } else {
                d2 = d - this.mTime1;
            }
            double lookup = lookup(d2 * this.mOneOverDeltaTime) * 1.5707963267948966d;
            this.mTmpSinAngle = Math.sin(lookup);
            this.mTmpCosAngle = Math.cos(lookup);
        }

        private void buildTable(double d, double d2, double d3, double d4) {
            double[] dArr;
            double[] dArr2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6af6287", new Object[]{this, new Double(d), new Double(d2), new Double(d3), new Double(d4)});
                return;
            }
            double d5 = d3 - d;
            double d6 = d2 - d4;
            int i = 0;
            double d7 = vu3.b.GEO_NOT_SUPPORT;
            double d8 = vu3.b.GEO_NOT_SUPPORT;
            double d9 = vu3.b.GEO_NOT_SUPPORT;
            while (true) {
                if (i >= sOurPercent.length) {
                    break;
                }
                double radians = Math.toRadians((i * 90.0d) / (dArr.length - 1));
                double sin = Math.sin(radians) * d5;
                double cos = Math.cos(radians) * d6;
                if (i > 0) {
                    d5 = d5;
                    d7 += Math.hypot(sin - d8, cos - d9);
                    sOurPercent[i] = d7;
                } else {
                    d5 = d5;
                }
                i++;
                d9 = cos;
                d8 = sin;
            }
            this.mArcDistance = d7;
            int i2 = 0;
            while (true) {
                double[] dArr3 = sOurPercent;
                if (i2 >= dArr3.length) {
                    break;
                }
                dArr3[i2] = dArr3[i2] / d7;
                i2++;
            }
            int i3 = 0;
            while (true) {
                if (i3 < this.mLut.length) {
                    double length = i3 / (dArr2.length - 1);
                    int binarySearch = Arrays.binarySearch(sOurPercent, length);
                    if (binarySearch >= 0) {
                        this.mLut[i3] = binarySearch / (sOurPercent.length - 1);
                    } else if (binarySearch == -1) {
                        this.mLut[i3] = 0.0d;
                    } else {
                        int i4 = -binarySearch;
                        int i5 = i4 - 2;
                        double[] dArr4 = sOurPercent;
                        double d10 = dArr4[i5];
                        this.mLut[i3] = (i5 + ((length - d10) / (dArr4[i4 - 1] - d10))) / (dArr4.length - 1);
                        i3++;
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbea5c4", new Object[]{this, new Double(d), fArr});
            return;
        }
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d2 = arc.mTime1;
            if (d < d2) {
                double d3 = d - d2;
                if (arc.mLinear) {
                    fArr[0] = (float) (arc.getLinearX(d2) + (this.mArcs[0].getLinearDX(d2) * d3));
                    fArr[1] = (float) (this.mArcs[0].getLinearY(d2) + (d3 * this.mArcs[0].getLinearDY(d2)));
                    return;
                }
                arc.setPoint(d2);
                fArr[0] = (float) (this.mArcs[0].getX() + (this.mArcs[0].getDX() * d3));
                fArr[1] = (float) (this.mArcs[0].getY() + (d3 * this.mArcs[0].getDY()));
                return;
            } else if (d > arcArr[arcArr.length - 1].mTime2) {
                double d4 = arcArr[arcArr.length - 1].mTime2;
                double d5 = d - d4;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.mLinear) {
                    fArr[0] = (float) (arc2.getLinearX(d4) + (this.mArcs[length].getLinearDX(d4) * d5));
                    fArr[1] = (float) (this.mArcs[length].getLinearY(d4) + (d5 * this.mArcs[length].getLinearDY(d4)));
                    return;
                }
                arc2.setPoint(d);
                fArr[0] = (float) this.mArcs[length].getX();
                fArr[1] = (float) this.mArcs[length].getY();
                return;
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d6 = arcArr2[0].mTime1;
            if (d < d6) {
                d = d6;
            } else if (d > arcArr2[arcArr2.length - 1].mTime2) {
                d = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i < arcArr3.length) {
                Arc arc3 = arcArr3[i];
                if (d > arc3.mTime2) {
                    i++;
                } else if (arc3.mLinear) {
                    fArr[0] = (float) arc3.getLinearX(d);
                    fArr[1] = (float) this.mArcs[i].getLinearY(d);
                    return;
                } else {
                    arc3.setPoint(d);
                    fArr[0] = (float) this.mArcs[i].getX();
                    fArr[1] = (float) this.mArcs[i].getY();
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d, int i) {
        double d2;
        double linearY;
        double linearDY;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc3fadd8", new Object[]{this, new Double(d), new Integer(i)})).doubleValue();
        }
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d3 = arc.mTime1;
            if (d < d3) {
                d2 = d - d3;
                if (!arc.mLinear) {
                    arc.setPoint(d3);
                    if (i == 0) {
                        linearY = this.mArcs[0].getX();
                        linearDY = this.mArcs[0].getDX();
                    } else {
                        linearY = this.mArcs[0].getY();
                        linearDY = this.mArcs[0].getDY();
                    }
                } else if (i == 0) {
                    linearY = arc.getLinearX(d3);
                    linearDY = this.mArcs[0].getLinearDX(d3);
                } else {
                    linearY = arc.getLinearY(d3);
                    linearDY = this.mArcs[0].getLinearDY(d3);
                }
            } else if (d > arcArr[arcArr.length - 1].mTime2) {
                double d4 = arcArr[arcArr.length - 1].mTime2;
                d2 = d - d4;
                int length = arcArr.length - 1;
                if (i == 0) {
                    linearY = arcArr[length].getLinearX(d4);
                    linearDY = this.mArcs[length].getLinearDX(d4);
                } else {
                    linearY = arcArr[length].getLinearY(d4);
                    linearDY = this.mArcs[length].getLinearDY(d4);
                }
            }
            return linearY + (d2 * linearDY);
        }
        Arc[] arcArr2 = this.mArcs;
        double d5 = arcArr2[0].mTime1;
        if (d < d5) {
            d = d5;
        } else if (d > arcArr2[arcArr2.length - 1].mTime2) {
            d = arcArr2[arcArr2.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i2 >= arcArr3.length) {
                return Double.NaN;
            }
            Arc arc2 = arcArr3[i2];
            if (d > arc2.mTime2) {
                i2++;
            } else if (!arc2.mLinear) {
                arc2.setPoint(d);
                if (i == 0) {
                    return this.mArcs[i2].getX();
                }
                return this.mArcs[i2].getY();
            } else if (i == 0) {
                return arc2.getLinearX(d);
            } else {
                return arc2.getLinearY(d);
            }
        }
    }
}
