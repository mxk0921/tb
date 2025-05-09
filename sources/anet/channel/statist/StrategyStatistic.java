package anet.channel.statist;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "strategy_statistic")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class StrategyStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public String nameType;
    @Dimension
    public String netType;
    @Dimension
    public String process;
    @Dimension
    public double hour = -1.0d;
    @Measure
    public int hostStrategyMapSize = 0;
    @Measure
    public int ipStrategyListSize = 0;
    @Measure
    public int historyItemMapSize = 0;
    @Measure
    public int connHistoryItemSize = 0;

    static {
        t2o.a(607125798);
    }

    public static /* synthetic */ Object ipc$super(StrategyStatistic strategyStatistic, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/statist/StrategyStatistic");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "[StrategyStatistic] process='" + this.process + "', netType='" + this.netType + "', nameType='" + this.nameType + "', hour='" + this.hour + "', hostStrategyMapSize=" + this.hostStrategyMapSize + ", ipStrategyListSize=" + this.ipStrategyListSize + ", historyItemMapSize=" + this.historyItemMapSize + ", connHistoryItemSize=" + this.connHistoryItemSize;
    }
}
