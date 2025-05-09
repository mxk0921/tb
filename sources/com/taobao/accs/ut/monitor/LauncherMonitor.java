package com.taobao.accs.ut.monitor;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.taobao.accs.utl.BaseMonitor;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "accs", monitorPoint = "launcher_task")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class LauncherMonitor extends BaseMonitor {
    @Measure
    public long cost;
    @Dimension
    public boolean optValid;

    static {
        t2o.a(343933210);
    }

    public LauncherMonitor(boolean z, long j) {
        this.optValid = z;
        this.cost = j;
    }
}
