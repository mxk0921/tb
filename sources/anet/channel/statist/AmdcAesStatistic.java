package anet.channel.statist;

import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "amdcAseResult")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AmdcAesStatistic extends StatObject {
    @Dimension
    public String amdcAesResult;
    @Measure
    public volatile long amdcAesTime;
    @Dimension
    public String amdcAesType;

    static {
        t2o.a(607125745);
    }
}
