package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.Inet64Util;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "networkDiagnostic")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NetworkDiagnosticStat extends StatObject {
    public static final int DIAGNOSTIC_TYPE_AUTO = 2;
    public static final int DIAGNOSTIC_TYPE_USER = 1;
    @Dimension
    public int type;
    @Dimension
    public int code = 1;
    @Dimension
    public String netType = NetworkStatusHelper.getStatus().toString();
    @Dimension
    public boolean isProxy = NetworkStatusHelper.isProxy();
    @Dimension
    public int ipStackType = Inet64Util.getStackType();

    static {
        t2o.a(607125778);
    }

    public NetworkDiagnosticStat(int i) {
        this.type = i;
    }
}
