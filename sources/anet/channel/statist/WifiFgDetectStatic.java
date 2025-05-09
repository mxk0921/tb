package anet.channel.statist;

import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "wifi_fg_detect_monitor")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WifiFgDetectStatic extends StatObject {
    @Dimension
    public String url;
    @Dimension
    public int ret = 0;
    @Dimension
    public String uniqueId = "";
    @Measure
    public volatile long detectTime = 0;

    static {
        t2o.a(607125801);
    }

    public WifiFgDetectStatic(String str) {
        this.url = "";
        this.url = str;
    }
}
