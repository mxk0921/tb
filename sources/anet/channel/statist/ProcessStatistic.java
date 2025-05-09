package anet.channel.statist;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "process_statistic")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ProcessStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public boolean isProcessNameUpdateEnable;
    @Dimension
    public int newRet = 0;
    @Dimension
    public int ret = 0;
    @Measure
    public long costTime = -1;

    static {
        t2o.a(607125782);
    }

    public static /* synthetic */ Object ipc$super(ProcessStatistic processStatistic, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/statist/ProcessStatistic");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "[StrategyStatistic] ret='" + this.ret + "'newRet='" + this.newRet + "'costTime='" + this.costTime + "', isProcessNameUpdateEnable='" + this.isProcessNameUpdateEnable;
    }
}
