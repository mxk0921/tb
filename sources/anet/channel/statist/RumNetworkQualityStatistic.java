package anet.channel.statist;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "rum_network_quality")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RumNetworkQualityStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public volatile int type = -1;
    @Measure
    public volatile double bandwidth = -1.0d;
    @Measure
    public volatile double frttAvgIDC = -1.0d;
    @Measure
    public volatile double frttMaxIDC = -1.0d;
    @Measure
    public volatile double frttAvgCDN = -1.0d;
    @Measure
    public volatile double frttMaxCDN = -1.0d;
    @Measure
    public volatile double srttMaxIDC = -1.0d;
    @Measure
    public volatile double srttMaxCDN = -1.0d;
    @Measure
    public volatile double lossratioMaxIDC = -1.0d;
    @Measure
    public volatile double lossratioMaxCDN = -1.0d;

    static {
        t2o.a(607125790);
    }

    public RumNetworkQualityStatistic(int i, double d, double d2, double d3, double d4, double d5) {
        initRumIDC(i, d, d2, d3, d4, d5);
    }

    public static /* synthetic */ Object ipc$super(RumNetworkQualityStatistic rumNetworkQualityStatistic, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/statist/RumNetworkQualityStatistic");
    }

    public void initRumCDN(double d, int i, double d2, double d3, double d4, double d5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1540097f", new Object[]{this, new Double(d), new Integer(i), new Double(d2), new Double(d3), new Double(d4), new Double(d5)});
            return;
        }
        this.bandwidth = d;
        this.type = i;
        this.frttAvgCDN = d2;
        this.frttMaxCDN = d3;
        this.srttMaxCDN = d4;
        this.lossratioMaxCDN = d5;
    }

    public void initRumIDC(int i, double d, double d2, double d3, double d4, double d5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45653a50", new Object[]{this, new Integer(i), new Double(d), new Double(d2), new Double(d3), new Double(d4), new Double(d5)});
            return;
        }
        this.bandwidth = d;
        this.type = i;
        this.frttAvgIDC = d2;
        this.frttMaxIDC = d3;
        this.srttMaxIDC = d4;
        this.lossratioMaxIDC = d5;
    }

    public RumNetworkQualityStatistic(double d, int i, double d2, double d3, double d4, double d5) {
        initRumCDN(d, i, d2, d3, d4, d5);
    }

    public RumNetworkQualityStatistic(int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        initRumIDC(i, d, d2, d3, d4, d5);
        initRumCDN(d, i, d6, d7, d8, d9);
    }
}
