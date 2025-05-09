package com.taobao.media.connectionclass;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ExponentialGeometricAverage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mCount;
    private final int mCutover;
    private final double mDecayConstant;
    private double mValue = -1.0d;

    static {
        t2o.a(774897696);
    }

    public ExponentialGeometricAverage(double d) {
        int i;
        this.mDecayConstant = d;
        if (d == vu3.b.GEO_NOT_SUPPORT) {
            i = Integer.MAX_VALUE;
        } else {
            i = (int) Math.ceil(1.0d / d);
        }
        this.mCutover = i;
    }

    public void addMeasurement(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b2e11c", new Object[]{this, new Double(d)});
            return;
        }
        double d2 = 1.0d - this.mDecayConstant;
        int i = this.mCount;
        if (i > this.mCutover) {
            this.mValue = Math.exp((d2 * Math.log(this.mValue)) + (this.mDecayConstant * Math.log(d)));
        } else if (i > 0) {
            double d3 = (d2 * i) / (i + 1.0d);
            this.mValue = Math.exp((d3 * Math.log(this.mValue)) + ((1.0d - d3) * Math.log(d)));
        } else {
            this.mValue = d;
        }
        this.mCount++;
    }

    public double getAverage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("604252dc", new Object[]{this})).doubleValue();
        }
        return this.mValue;
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mValue = -1.0d;
        this.mCount = 0;
    }
}
