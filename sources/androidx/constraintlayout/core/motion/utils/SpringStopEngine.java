package androidx.constraintlayout.core.motion.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SpringStopEngine implements StopEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final double UNSET = Double.MAX_VALUE;
    private float mLastTime;
    private double mLastVelocity;
    private float mMass;
    private float mPos;
    private double mStiffness;
    private float mStopThreshold;
    private double mTargetPos;
    private float mV;
    public double mDamping = 0.5d;
    private boolean mInitialized = false;
    private int mBoundaryMode = 0;

    private void compute(double d) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b436ec0", new Object[]{this, new Double(d)});
        } else if (d > vu3.b.GEO_NOT_SUPPORT) {
            double d2 = this.mStiffness;
            double d3 = this.mDamping;
            int sqrt = (int) ((9.0d / ((Math.sqrt(d2 / this.mMass) * d) * 4.0d)) + 1.0d);
            double d4 = d / sqrt;
            while (i < sqrt) {
                float f = this.mPos;
                double d5 = this.mTargetPos;
                float f2 = this.mV;
                float f3 = this.mMass;
                double d6 = f2 + ((((((-d2) * (f - d5)) - (f2 * d3)) / f3) * d4) / 2.0d);
                double d7 = ((((-((f + ((d4 * d6) / 2.0d)) - d5)) * d2) - (d6 * d3)) / f3) * d4;
                float f4 = f2 + ((float) d7);
                this.mV = f4;
                float f5 = f + ((float) ((f2 + (d7 / 2.0d)) * d4));
                this.mPos = f5;
                int i2 = this.mBoundaryMode;
                if (i2 > 0) {
                    if (f5 < 0.0f && (i2 & 1) == 1) {
                        this.mPos = -f5;
                        this.mV = -f4;
                    }
                    float f6 = this.mPos;
                    if (f6 > 1.0f) {
                        if ((i2 & 2) == 2) {
                            this.mPos = 2.0f - f6;
                            this.mV = -this.mV;
                        }
                        i++;
                        d2 = d2;
                        d3 = d3;
                    }
                }
                i++;
                d2 = d2;
                d3 = d3;
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d30a484", new Object[]{this, str, new Float(f)});
        }
        return null;
    }

    public float getAcceleration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce41006d", new Object[]{this})).floatValue();
        }
        return ((float) (((-this.mStiffness) * (this.mPos - this.mTargetPos)) - (this.mDamping * this.mV))) / this.mMass;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
        }
        compute(f - this.mLastTime);
        this.mLastTime = f;
        if (isStopped()) {
            this.mPos = (float) this.mTargetPos;
        }
        return this.mPos;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeea9d4a", new Object[]{this})).floatValue();
        }
        return 0.0f;
    }

    public void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        PrintStream printStream = System.out;
        printStream.println((".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ") + str);
    }

    public void springConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acdddf9", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Float(f7), new Integer(i)});
            return;
        }
        this.mTargetPos = f2;
        this.mDamping = f6;
        this.mInitialized = false;
        this.mPos = f;
        this.mLastVelocity = f3;
        this.mStiffness = f5;
        this.mMass = f4;
        this.mStopThreshold = f7;
        this.mBoundaryMode = i;
        this.mLastTime = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2e697596", new Object[]{this, new Float(f)})).floatValue() : this.mV;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2d2044e", new Object[]{this})).booleanValue();
        }
        double d = this.mPos - this.mTargetPos;
        double d2 = this.mStiffness;
        double d3 = this.mV;
        return Math.sqrt((((d3 * d3) * ((double) this.mMass)) + ((d2 * d) * d)) / d2) <= ((double) this.mStopThreshold);
    }
}
