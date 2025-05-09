package anet.channel.flow;

import java.io.Serializable;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FlowAttribute implements Serializable {
    public HashMap<String, Long> reportUseCellFlow = null;
    public HashMap<String, DayFlowStat> topTraffic;
    public HashMap<String, SingleFlowStat> topTrafficUrl;
    public HashMap<String, Double> useCellFlow;

    static {
        t2o.a(607125641);
    }

    public FlowAttribute() {
        this.topTraffic = null;
        this.topTrafficUrl = null;
        this.useCellFlow = null;
        this.topTraffic = new HashMap<>();
        if (this.topTrafficUrl == null) {
            this.topTrafficUrl = new HashMap<>();
        }
        if (this.useCellFlow == null) {
            this.useCellFlow = new HashMap<>();
        }
    }
}
