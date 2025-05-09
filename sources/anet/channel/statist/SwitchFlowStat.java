package anet.channel.statist;

import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "switch_flow")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SwitchFlowStat extends StatObject {
    @Dimension
    public String host;
    @Dimension
    public String scene;
    @Dimension
    public int smoothReconnect;

    static {
        t2o.a(607125799);
    }

    public SwitchFlowStat(String str, String str2) {
        this.host = str;
        this.scene = str2;
    }
}
