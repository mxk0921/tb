package anet.channel.statist;

import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "orange_config_error_stat")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class OrangeConfigStatistic extends StatObject {
    @Dimension
    public String errorMsg;
    @Dimension
    public String nameSpace;

    static {
        t2o.a(607125780);
    }

    public OrangeConfigStatistic(String str, String str2) {
        this.nameSpace = str;
        this.errorMsg = str2;
    }
}
