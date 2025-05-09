package anet.channel.statist;

import anet.channel.GlobalAppRuntimeInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "strategy_stat")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StrategyStatObject extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public StringBuilder errorTrace;
    @Dimension
    public int isFileExists;
    @Dimension
    public int isReadObjectSucceed;
    @Dimension
    public int isRenameSucceed;
    @Dimension
    public int isSucceed;
    @Dimension
    public int isTempWriteSucceed;
    @Measure
    public long readCostTime;
    @Dimension
    public String readStrategyFileId;
    @Dimension
    public String readStrategyFilePath;
    @Dimension
    public int strategyType = -1;
    @Dimension
    public int type;
    @Measure
    public long writeCostTime;
    @Dimension
    public String writeStrategyFileId;
    @Dimension
    public String writeStrategyFilePath;
    @Dimension
    public String writeTempFilePath;

    static {
        t2o.a(607125797);
    }

    public StrategyStatObject(int i) {
        this.type = i;
    }

    public static /* synthetic */ Object ipc$super(StrategyStatObject strategyStatObject, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/statist/StrategyStatObject");
    }

    public void appendErrorTrace(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62fc26cd", new Object[]{this, str, th});
            return;
        }
        String message = th.getMessage();
        if (this.errorTrace == null) {
            this.errorTrace = new StringBuilder();
        }
        StringBuilder sb = this.errorTrace;
        sb.append('[');
        sb.append(str);
        sb.append(']');
        sb.append(str);
        sb.append(' ');
        sb.append(message);
        sb.append('\n');
    }

    @Override // anet.channel.statist.StatObject
    public boolean beforeCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("155d4321", new Object[]{this})).booleanValue();
        }
        return GlobalAppRuntimeInfo.isTargetProcess();
    }
}
