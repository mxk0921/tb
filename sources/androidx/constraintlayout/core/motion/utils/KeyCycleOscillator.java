package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import tb.vu3;
import tb.wqu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class KeyCycleOscillator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "KeyCycleOscillator";
    private CurveFit mCurveFit;
    private CycleOscillator mCycleOscillator;
    private String mType;
    private int mWaveShape = 0;
    private String mWaveString = null;
    public int mVariesBy = 0;
    public ArrayList<WavePoint> mWavePoints = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CoreSpline extends KeyCycleOscillator {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String mType;
        public int mTypeId;

        public CoreSpline(String str) {
            this.mType = str;
            this.mTypeId = wqu.a(str);
        }

        public static /* synthetic */ Object ipc$super(CoreSpline coreSpline, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/motion/utils/KeyCycleOscillator$CoreSpline");
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(MotionWidget motionWidget, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc906b78", new Object[]{this, motionWidget, new Float(f)});
            } else {
                motionWidget.setValue(this.mTypeId, get(f));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CycleOscillator {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String TAG = "CycleOscillator";
        public static final int UNSET = -1;
        public CurveFit mCurveFit;
        public float[] mOffsetArr;
        public Oscillator mOscillator;
        public float mPathLength;
        public float[] mPeriod;
        public float[] mPhaseArr;
        public double[] mPosition;
        public float[] mScale;
        public double[] mSplineSlopeCache;
        public double[] mSplineValueCache;
        public float[] mValues;
        private final int mVariesBy;
        public int mWaveShape;
        private final int mOffst = 0;
        private final int mPhase = 1;
        private final int mValue = 2;

        public CycleOscillator(int i, String str, int i2, int i3) {
            Oscillator oscillator = new Oscillator();
            this.mOscillator = oscillator;
            this.mWaveShape = i;
            this.mVariesBy = i2;
            oscillator.setType(i, str);
            this.mValues = new float[i3];
            this.mPosition = new double[i3];
            this.mPeriod = new float[i3];
            this.mOffsetArr = new float[i3];
            this.mPhaseArr = new float[i3];
            this.mScale = new float[i3];
        }

        public double getLastPhase() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("38f52ac4", new Object[]{this})).doubleValue();
            }
            return this.mSplineValueCache[1];
        }

        public double getSlope(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("166ea932", new Object[]{this, new Float(f)})).doubleValue();
            }
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                double d = f;
                curveFit.getSlope(d, this.mSplineSlopeCache);
                this.mCurveFit.getPos(d, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineSlopeCache;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d2 = f;
            double value = this.mOscillator.getValue(d2, this.mSplineValueCache[1]);
            double slope = this.mOscillator.getSlope(d2, this.mSplineValueCache[1], this.mSplineSlopeCache[1]);
            double[] dArr2 = this.mSplineSlopeCache;
            return dArr2[0] + (value * dArr2[2]) + (slope * this.mSplineValueCache[2]);
        }

        public double getValues(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b78b02ef", new Object[]{this, new Float(f)})).doubleValue();
            }
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                curveFit.getPos(f, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineValueCache;
                dArr[0] = this.mOffsetArr[0];
                dArr[1] = this.mPhaseArr[0];
                dArr[2] = this.mValues[0];
            }
            double[] dArr2 = this.mSplineValueCache;
            return dArr2[0] + (this.mOscillator.getValue(f, dArr2[1]) * this.mSplineValueCache[2]);
        }

        public void setPoint(int i, int i2, float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3443f075", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Float(f2), new Float(f3), new Float(f4)});
                return;
            }
            this.mPosition[i] = i2 / 100.0d;
            this.mPeriod[i] = f;
            this.mOffsetArr[i] = f2;
            this.mPhaseArr[i] = f3;
            this.mValues[i] = f4;
        }

        public void setup(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3cf93fbc", new Object[]{this, new Float(f)});
                return;
            }
            this.mPathLength = f;
            double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, this.mPosition.length, 3);
            float[] fArr = this.mValues;
            this.mSplineValueCache = new double[fArr.length + 2];
            this.mSplineSlopeCache = new double[fArr.length + 2];
            if (this.mPosition[0] > vu3.b.GEO_NOT_SUPPORT) {
                this.mOscillator.addPoint(vu3.b.GEO_NOT_SUPPORT, this.mPeriod[0]);
            }
            double[] dArr2 = this.mPosition;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.mOscillator.addPoint(1.0d, this.mPeriod[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                double[] dArr3 = dArr[i];
                dArr3[0] = this.mOffsetArr[i];
                dArr3[1] = this.mPhaseArr[i];
                dArr3[2] = this.mValues[i];
                this.mOscillator.addPoint(this.mPosition[i], this.mPeriod[i]);
            }
            this.mOscillator.normalize();
            double[] dArr4 = this.mPosition;
            if (dArr4.length > 1) {
                this.mCurveFit = CurveFit.get(0, dArr4, dArr);
            } else {
                this.mCurveFit = null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class PathRotateSet extends KeyCycleOscillator {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String mType;
        public int mTypeId;

        public PathRotateSet(String str) {
            this.mType = str;
            this.mTypeId = wqu.a(str);
        }

        public static /* synthetic */ Object ipc$super(PathRotateSet pathRotateSet, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/motion/utils/KeyCycleOscillator$PathRotateSet");
        }

        public void setPathRotate(MotionWidget motionWidget, float f, double d, double d2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c423acd", new Object[]{this, motionWidget, new Float(f), new Double(d), new Double(d2)});
            } else {
                motionWidget.setRotationZ(get(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(MotionWidget motionWidget, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc906b78", new Object[]{this, motionWidget, new Float(f)});
            } else {
                motionWidget.setValue(this.mTypeId, get(f));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class WavePoint {
        public float mOffset;
        public float mPeriod;
        public float mPhase;
        public int mPosition;
        public float mValue;

        public WavePoint(int i, float f, float f2, float f3, float f4) {
            this.mPosition = i;
            this.mValue = f4;
            this.mOffset = f2;
            this.mPeriod = f;
            this.mPhase = f3;
        }
    }

    public static KeyCycleOscillator makeWidgetCycle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KeyCycleOscillator) ipChange.ipc$dispatch("71ed0b30", new Object[]{str});
        }
        if (str.equals("pathRotate")) {
            return new PathRotateSet(str);
        }
        return new CoreSpline(str);
    }

    public float get(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72fc0a73", new Object[]{this, new Float(f)})).floatValue();
        }
        return (float) this.mCycleOscillator.getValues(f);
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
        return (float) this.mCycleOscillator.getSlope(f);
    }

    public void setCustom(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b94f3ad6", new Object[]{this, obj});
        }
    }

    public void setPoint(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8441e640", new Object[]{this, new Integer(i), new Integer(i2), str, new Integer(i3), new Float(f), new Float(f2), new Float(f3), new Float(f4), obj});
            return;
        }
        this.mWavePoints.add(new WavePoint(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.mVariesBy = i3;
        }
        this.mWaveShape = i2;
        setCustom(obj);
        this.mWaveString = str;
    }

    public void setProperty(MotionWidget motionWidget, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc906b78", new Object[]{this, motionWidget, new Float(f)});
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

    public void setup(float f) {
        char c = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cf93fbc", new Object[]{this, new Float(f)});
            return;
        }
        int size = this.mWavePoints.size();
        if (size != 0) {
            Collections.sort(this.mWavePoints, new Comparator<WavePoint>() { // from class: androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public int compare(WavePoint wavePoint, WavePoint wavePoint2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("257c9f77", new Object[]{this, wavePoint, wavePoint2})).intValue() : Integer.compare(wavePoint.mPosition, wavePoint2.mPosition);
                }
            });
            double[] dArr = new double[size];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, 3);
            this.mCycleOscillator = new CycleOscillator(this.mWaveShape, this.mWaveString, this.mVariesBy, size);
            Iterator<WavePoint> it = this.mWavePoints.iterator();
            int i = 0;
            while (it.hasNext()) {
                WavePoint next = it.next();
                float f2 = next.mPeriod;
                dArr[i] = f2 * 0.01d;
                double[] dArr3 = dArr2[i];
                float f3 = next.mValue;
                dArr3[c] = f3;
                float f4 = next.mOffset;
                dArr3[1] = f4;
                float f5 = next.mPhase;
                dArr3[2] = f5;
                this.mCycleOscillator.setPoint(i, next.mPosition, f2, f4, f5, f3);
                i++;
                c = 0;
            }
            this.mCycleOscillator.setup(f);
            this.mCurveFit = CurveFit.get(0, dArr, dArr2);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<WavePoint> it = this.mWavePoints.iterator();
        while (it.hasNext()) {
            WavePoint next = it.next();
            str = str + "[" + next.mPosition + " , " + decimalFormat.format(next.mValue) + "] ";
        }
        return str;
    }

    public boolean variesByPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b656da17", new Object[]{this})).booleanValue();
        }
        if (this.mVariesBy == 1) {
            return true;
        }
        return false;
    }

    public void setPoint(int i, int i2, String str, int i3, float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21a38764", new Object[]{this, new Integer(i), new Integer(i2), str, new Integer(i3), new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        this.mWavePoints.add(new WavePoint(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.mVariesBy = i3;
        }
        this.mWaveShape = i2;
        this.mWaveString = str;
    }
}
