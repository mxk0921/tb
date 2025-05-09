package anet.channel.statist;

import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "okhttp_available")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class OkHttpAvailableStat extends StatObject {
    @Dimension
    public String error;
    @Dimension
    public int ret;

    static {
        t2o.a(607125779);
    }

    public OkHttpAvailableStat(int i) {
        this.ret = i;
    }
}
