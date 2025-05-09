package anet.channel.flow;

import anet.channel.statist.RequestStatistic;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FlowStat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long downstream;
    public String protocoltype;
    public String refer;
    public String req_identifier;
    public long upstream;

    static {
        t2o.a(607125644);
    }

    public FlowStat() {
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FlowStat{refer='" + this.refer + "', protocoltype='" + this.protocoltype + "', req_identifier='" + this.req_identifier + "', upstream=" + this.upstream + ", downstream=" + this.downstream + '}';
    }

    public FlowStat(String str, RequestStatistic requestStatistic) {
        this.refer = str;
        this.protocoltype = requestStatistic.protocolType;
        this.req_identifier = requestStatistic.url;
        this.upstream = requestStatistic.sendDataSize;
        this.downstream = requestStatistic.recDataSize;
    }
}
