package com.taobao.accs.ut.monitor;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.taobao.accs.utl.BaseMonitor;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "accs", monitorPoint = "get_body")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class GetBodyMonitor extends BaseMonitor {
    @Measure
    public long cost;
    @Dimension
    public boolean isEncrypted;

    static {
        t2o.a(343933208);
    }

    public GetBodyMonitor(boolean z, long j) {
        this.isEncrypted = z;
        this.cost = j;
    }
}
