package anet.channel.flow;

import anet.channel.statist.RequestStatistic;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetworkAnalysis {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile INetworkAnalysis networkAnalysis = new AnalysisProxy(null);

    static {
        t2o.a(607125651);
    }

    public static INetworkAnalysis getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INetworkAnalysis) ipChange.ipc$dispatch("7b8b3570", new Object[0]);
        }
        return networkAnalysis;
    }

    public static void setInstance(INetworkAnalysis iNetworkAnalysis) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("401fec4a", new Object[]{iNetworkAnalysis});
        } else {
            networkAnalysis = new AnalysisProxy(iNetworkAnalysis);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class AnalysisProxy implements INetworkAnalysis {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private INetworkAnalysis networkAnalysis;

        static {
            t2o.a(607125652);
            t2o.a(607125650);
        }

        public AnalysisProxy(INetworkAnalysis iNetworkAnalysis) {
            this.networkAnalysis = iNetworkAnalysis;
        }

        @Override // anet.channel.flow.INetworkAnalysis
        public void commitFlow(FlowStat flowStat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb30c677", new Object[]{this, flowStat});
                return;
            }
            INetworkAnalysis iNetworkAnalysis = this.networkAnalysis;
            if (iNetworkAnalysis != null) {
                iNetworkAnalysis.commitFlow(flowStat);
            }
        }

        @Override // anet.channel.flow.INetworkAnalysis
        public void createConnectCount(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d0ed546", new Object[]{this, str, str2, str3});
                return;
            }
            INetworkAnalysis iNetworkAnalysis = this.networkAnalysis;
            if (iNetworkAnalysis != null) {
                iNetworkAnalysis.createConnectCount(str, str2, str3);
            }
        }

        @Override // anet.channel.flow.INetworkAnalysis
        public void commitFlow(RequestStatistic requestStatistic) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efc2bb5c", new Object[]{this, requestStatistic});
                return;
            }
            INetworkAnalysis iNetworkAnalysis = this.networkAnalysis;
            if (iNetworkAnalysis != null) {
                iNetworkAnalysis.commitFlow(requestStatistic);
            }
        }
    }
}
