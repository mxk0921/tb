package anet.channel.monitor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetWorkKalmanFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "speed.NetWorkKalmanFilter";
    private double Kalman_ek;
    private double Kalman_z;
    private double kalman_Kk;
    private double kalman_Pk;
    private double kalman_Q;
    private double kalman_R;
    private double kalman_Xk;
    private long Kalman_Count = 0;
    private double Kalman_C1 = vu3.b.GEO_NOT_SUPPORT;
    private double Kalman_C2 = vu3.b.GEO_NOT_SUPPORT;
    private double mcurrentNetWorkSpeed = vu3.b.GEO_NOT_SUPPORT;

    static {
        t2o.a(607125676);
    }

    public void ResetKalmanParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a85a540", new Object[]{this});
            return;
        }
        this.Kalman_Count = 0L;
        this.mcurrentNetWorkSpeed = vu3.b.GEO_NOT_SUPPORT;
    }

    public double addMeasurement(double d, double d2) {
        char c = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43a9a290", new Object[]{this, new Double(d), new Double(d2)})).doubleValue();
        }
        double d3 = d / d2;
        if (d3 >= 8.0d) {
            long j = this.Kalman_Count;
            if (j == 0) {
                this.Kalman_C1 = d3;
                this.kalman_Xk = d3;
                this.kalman_R = d3 * 0.1d;
                this.kalman_Q = 0.02d * d3;
                this.kalman_Pk = 0.1d * d3 * d3;
            } else if (j == 1) {
                this.Kalman_C2 = d3;
                this.kalman_Xk = d3;
            } else {
                double d4 = this.Kalman_C2;
                double d5 = d3 - d4;
                this.Kalman_C1 = d4;
                this.Kalman_C2 = d3;
                double d6 = d3 / 0.95d;
                this.Kalman_z = d6;
                this.Kalman_ek = d6 - (this.kalman_Xk * 0.95d);
                double sqrt = Math.sqrt(this.kalman_R);
                double d7 = this.Kalman_ek;
                if (d7 >= 4.0d * sqrt) {
                    this.Kalman_ek = (d7 * 0.75d) + (sqrt * 2.0d);
                    c = 1;
                } else if (d7 <= (-4.0d) * sqrt) {
                    this.Kalman_ek = (sqrt * (-1.0d)) + (d7 * 0.75d);
                    c = 2;
                }
                double d8 = this.Kalman_ek;
                double min = Math.min(Math.max(Math.abs((this.kalman_R * 1.05d) - ((0.0025d * d8) * d8)), this.kalman_R * 0.8d), this.kalman_R * 1.25d);
                this.kalman_R = min;
                double d9 = this.kalman_Pk;
                double d10 = d9 / ((0.9025d * d9) + min);
                this.kalman_Kk = d10;
                double d11 = this.kalman_Xk + (1.0526315789473684d * d5) + (d10 * this.Kalman_ek);
                this.kalman_Xk = d11;
                if (c == 1) {
                    this.kalman_Xk = Math.min(d11, this.Kalman_z);
                } else if (c == 2) {
                    this.kalman_Xk = Math.max(d11, this.Kalman_z);
                }
                this.kalman_Pk = (1.0d - (0.95d * this.kalman_Kk)) * (this.kalman_Pk + this.kalman_Q);
            }
            double d12 = this.kalman_Xk;
            if (d12 < vu3.b.GEO_NOT_SUPPORT) {
                double d13 = this.Kalman_C2 * 0.7d;
                this.mcurrentNetWorkSpeed = d13;
                this.kalman_Xk = d13;
            } else {
                this.mcurrentNetWorkSpeed = d12;
            }
            return this.mcurrentNetWorkSpeed;
        } else if (this.Kalman_Count != 0) {
            return this.mcurrentNetWorkSpeed;
        } else {
            this.mcurrentNetWorkSpeed = d3;
            return d3;
        }
    }
}
