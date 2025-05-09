package com.taobao.accs.ut.monitor;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.taobao.accs.utl.BaseMonitor;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "accs", monitorPoint = "assemble")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AssembleMonitor extends BaseMonitor {
    @Measure
    public long assembleLength;
    @Measure
    public long assembleTimes;
    @Dimension
    public String dataId;
    @Dimension
    public String errorCode;

    static {
        t2o.a(343933206);
    }

    public AssembleMonitor(String str, String str2) {
        this.dataId = str;
        this.errorCode = str2;
    }
}
