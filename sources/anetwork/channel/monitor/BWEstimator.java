package anetwork.channel.monitor;

import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.util.ALog;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BWEstimator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long sum_ = 0;
    private long initial_window_ms_ = 2000;
    private long noninitial_window_ms_ = 1000;
    private long prev_time_ms_ = -1;
    private double uncertainty_scale_ = 10.0d;
    private double uncertainty_symmetry_cap_ = vu3.b.GEO_NOT_SUPPORT;
    private double estimate_floor_ = 20.0d;
    private long current_window_ms_ = 0;
    private double bitrate_actual_kpbs_ = -1.0d;
    private double bitrate_estimate_kbps_ = -1.0d;
    private double bitrate_estimate_var_ = 50.0d;
    private int quality_level_ = 2;
    private int updateCount = 0;
    private final int ONE_WINDOW_MIN_BYTES = 20480;
    private final int ONE_WINDOW_MIN_COUNT = 4;

    static {
        t2o.a(607126069);
    }

    private void updateQualityLevel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce8d5d3f", new Object[]{this, str});
            return;
        }
        int max = Math.max(calculateQualityLevel(this.bitrate_actual_kpbs_, str), calculateQualityLevel(this.bitrate_estimate_kbps_, str));
        this.quality_level_ = max;
        GlobalAppRuntimeInfo.setGlobalNetworkQuality(max);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[Catch: all -> 0x003b, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0011, B:10:0x003d, B:15:0x004a, B:17:0x0053, B:18:0x0064, B:20:0x0068, B:24:0x0074, B:25:0x0079, B:27:0x0087, B:29:0x008c, B:32:0x0090), top: B:37:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized double updateWindow(long r19, long r21, long r23) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r4 = r21
            r6 = r23
            r0 = 1
            r8 = 4
            monitor-enter(r18)
            com.android.alibaba.ip.runtime.IpChange r9 = anetwork.channel.monitor.BWEstimator.$ipChange     // Catch: all -> 0x003b
            boolean r10 = r9 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: all -> 0x003b
            if (r10 == 0) goto L_0x003d
            java.lang.String r10 = "c7c52412"
            java.lang.Long r11 = new java.lang.Long     // Catch: all -> 0x003b
            r11.<init>(r2)     // Catch: all -> 0x003b
            java.lang.Long r2 = new java.lang.Long     // Catch: all -> 0x003b
            r2.<init>(r4)     // Catch: all -> 0x003b
            java.lang.Long r3 = new java.lang.Long     // Catch: all -> 0x003b
            r3.<init>(r6)     // Catch: all -> 0x003b
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch: all -> 0x003b
            r5 = 0
            r4[r5] = r1     // Catch: all -> 0x003b
            r4[r0] = r11     // Catch: all -> 0x003b
            r0 = 2
            r4[r0] = r2     // Catch: all -> 0x003b
            r0 = 3
            r4[r0] = r3     // Catch: all -> 0x003b
            java.lang.Object r0 = r9.ipc$dispatch(r10, r4)     // Catch: all -> 0x003b
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: all -> 0x003b
            double r2 = r0.doubleValue()     // Catch: all -> 0x003b
            monitor-exit(r18)
            return r2
        L_0x003b:
            r0 = move-exception
            goto L_0x009e
        L_0x003d:
            long r9 = r1.prev_time_ms_     // Catch: all -> 0x003b
            r11 = 0
            int r15 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r15 < 0) goto L_0x0090
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x004a
            goto L_0x0090
        L_0x004a:
            long r9 = r2 - r9
            long r13 = r1.current_window_ms_     // Catch: all -> 0x003b
            long r9 = r9 + r13
            int r13 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r13 >= 0) goto L_0x0064
            long r6 = r1.sum_     // Catch: all -> 0x003b
            long r6 = r6 + r4
            r1.sum_ = r6     // Catch: all -> 0x003b
            r1.prev_time_ms_ = r2     // Catch: all -> 0x003b
            r1.current_window_ms_ = r9     // Catch: all -> 0x003b
            int r2 = r1.updateCount     // Catch: all -> 0x003b
            int r2 = r2 + r0
            r1.updateCount = r2     // Catch: all -> 0x003b
            r13 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L_0x008e
        L_0x0064:
            int r13 = r1.updateCount     // Catch: all -> 0x003b
            if (r13 >= r8) goto L_0x0074
            long r13 = r1.sum_     // Catch: all -> 0x003b
            r16 = 20480(0x5000, double:1.01185E-319)
            int r8 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r8 < 0) goto L_0x0071
            goto L_0x0074
        L_0x0071:
            r13 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L_0x0079
        L_0x0074:
            long r13 = r1.sum_     // Catch: all -> 0x003b
            double r13 = (double) r13     // Catch: all -> 0x003b
            double r11 = (double) r6     // Catch: all -> 0x003b
            double r13 = r13 / r11
        L_0x0079:
            r1.sum_ = r4     // Catch: all -> 0x003b
            r1.prev_time_ms_ = r2     // Catch: all -> 0x003b
            r1.updateCount = r0     // Catch: all -> 0x003b
            r2 = 2
            long r2 = r2 * r6
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x008a
            long r11 = r9 - r6
            goto L_0x008c
        L_0x008a:
            r11 = 0
        L_0x008c:
            r1.current_window_ms_ = r11     // Catch: all -> 0x003b
        L_0x008e:
            monitor-exit(r18)
            return r13
        L_0x0090:
            r1.prev_time_ms_ = r2     // Catch: all -> 0x003b
            r1.sum_ = r4     // Catch: all -> 0x003b
            r2 = 0
            r1.current_window_ms_ = r2     // Catch: all -> 0x003b
            r1.updateCount = r0     // Catch: all -> 0x003b
            monitor-exit(r18)
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            return r2
        L_0x009e:
            monitor-exit(r18)     // Catch: all -> 0x003b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.monitor.BWEstimator.updateWindow(long, long, long):double");
    }

    public double actual() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d119b703", new Object[]{this})).doubleValue();
        }
        return this.bitrate_actual_kpbs_;
    }

    public int getQualityLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9af3335", new Object[]{this})).intValue();
        }
        return this.quality_level_;
    }

    public double prediction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a67ad84", new Object[]{this})).doubleValue();
        }
        return this.bitrate_estimate_kbps_;
    }

    public void update(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5ca609a", new Object[]{this, str, new Long(j), new Long(j2)});
            return;
        }
        long j3 = this.noninitial_window_ms_;
        if (this.bitrate_estimate_kbps_ < vu3.b.GEO_NOT_SUPPORT) {
            j3 = this.initial_window_ms_;
        }
        double updateWindow = updateWindow(j, j2, j3);
        if (updateWindow >= vu3.b.GEO_NOT_SUPPORT) {
            this.bitrate_actual_kpbs_ = updateWindow;
            double d = this.bitrate_estimate_kbps_;
            if (d < vu3.b.GEO_NOT_SUPPORT) {
                this.bitrate_estimate_kbps_ = updateWindow;
                return;
            }
            double abs = (this.uncertainty_scale_ * Math.abs(d - updateWindow)) / (this.bitrate_estimate_kbps_ + Math.min(updateWindow, this.uncertainty_symmetry_cap_));
            double d2 = abs * abs;
            double d3 = this.bitrate_estimate_var_ + 5.0d;
            double d4 = (this.bitrate_estimate_kbps_ * d2) + (updateWindow * d3);
            double d5 = d2 + d3;
            double d6 = d4 / d5;
            this.bitrate_estimate_kbps_ = d6;
            this.bitrate_estimate_kbps_ = Math.max(d6, this.estimate_floor_);
            this.bitrate_estimate_var_ = (d2 * d3) / d5;
            updateQualityLevel(str);
        }
    }

    private int calculateQualityLevel(double d, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da33f9e9", new Object[]{this, new Double(d), str})).intValue();
        }
        if (!"global".equalsIgnoreCase(str) || !"domain".equalsIgnoreCase(str)) {
            ALog.e("anetwork.BWEstimator", "[calculateQualityLevel] speed=" + d, null, StWindow.UPDATE_TYPE, str);
            return d >= AwcnConfig.getSceneSpeedThreshold(str) ? 2 : 1;
        } else if (d >= AwcnConfig.getRobustSpeedThreshold()) {
            return 3;
        } else {
            return d < AwcnConfig.getPoorSpeedThreshold() ? 1 : 2;
        }
    }
}
