package anet.channel.statist;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "HandoverSignalStatistic")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class HandoverSignalStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public volatile String brand;
    @Dimension
    public volatile String errorMsg;
    @Dimension
    public volatile String scene;
    @Measure
    public volatile int handoverSignalState = -1;
    @Measure
    public volatile int isServiceState = -1;
    @Measure
    public volatile int isSignalChanged = -1;
    @Measure
    public volatile int oriSignalLevel = -1;
    @Measure
    public volatile int signalLevel = -1;
    @Measure
    public volatile int oriGsmSignalLevel = -1;
    @Measure
    public volatile int gsmSignalLevel = -1;

    static {
        t2o.a(607125765);
    }

    public HandoverSignalStatistic(String str) {
        this.scene = str;
    }

    public static /* synthetic */ Object ipc$super(HandoverSignalStatistic handoverSignalStatistic, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/statist/HandoverSignalStatistic");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append("[HandoverSignalStatistic] scene=");
        sb.append(this.scene);
        sb.append(",brand=");
        sb.append(this.brand);
        sb.append(",errorMsg=");
        sb.append(this.errorMsg);
        sb.append(",handoverSignalState=");
        sb.append(this.handoverSignalState);
        sb.append(",isServiceState=");
        sb.append(this.isServiceState);
        sb.append(",isSignalChanged=");
        sb.append(this.isSignalChanged);
        sb.append(",oriSignalLevel=");
        sb.append(this.oriSignalLevel);
        sb.append(",signalLevel=");
        sb.append(this.signalLevel);
        sb.append(",oriGsmSignalLevel=");
        sb.append(this.oriGsmSignalLevel);
        sb.append(",gsmSignalLevel=");
        sb.append(this.gsmSignalLevel);
        return sb.toString();
    }
}
