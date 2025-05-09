package anet.channel.statist;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "LocalDnsLookupStatistic")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LocalDnsLookupStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public volatile String host;
    @Dimension
    public volatile String useMcc;
    @Measure
    public volatile int isUseHTTP3 = -1;
    @Measure
    public volatile int isUseHTTP2 = -1;
    @Measure
    public volatile long buildStrategyCostTime = 0;
    @Measure
    public volatile long sumCostTime = 0;
    public long startTime = 0;

    static {
        t2o.a(607125771);
    }

    public LocalDnsLookupStatistic(String str) {
        this.host = str;
    }

    public static /* synthetic */ Object ipc$super(LocalDnsLookupStatistic localDnsLookupStatistic, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/statist/LocalDnsLookupStatistic");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append("[LocalDnsLookupStatistic] host=");
        sb.append(this.host);
        sb.append(",sumCostTime=");
        sb.append(this.sumCostTime);
        sb.append(",buildStrategyCostTime=");
        sb.append(this.buildStrategyCostTime);
        sb.append(",useMcc=");
        sb.append(this.useMcc);
        sb.append(",isUseHTTP3=");
        sb.append(this.isUseHTTP3);
        sb.append(",isUseHTTP2=");
        sb.append(this.isUseHTTP2);
        return sb.toString();
    }
}
