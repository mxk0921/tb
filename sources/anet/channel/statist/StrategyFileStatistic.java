package anet.channel.statist;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "strategy_file_statistic")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class StrategyFileStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Measure
    public long costTime = 0;
    @Dimension
    public boolean isAmdcParcelableEnable;
    @Dimension
    public int type;

    static {
        t2o.a(607125796);
    }

    public StrategyFileStatistic(int i, boolean z) {
        this.type = i;
        this.isAmdcParcelableEnable = z;
    }

    public static /* synthetic */ Object ipc$super(StrategyFileStatistic strategyFileStatistic, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/statist/StrategyFileStatistic");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "[StrategyFileStatistic] type= " + this.type + "costTime= " + this.costTime + ", isAmdcParcelableEnable= " + this.isAmdcParcelableEnable;
    }
}
