package anet.channel.statist;

import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "launch_load_zstd")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LaunchLoadZstdObject extends StatObject {
    @Dimension
    public String dictFile;
    @Dimension
    public String indexList;
    @Dimension
    public String type;
    @Dimension
    public int ret = 0;
    public int flag = -2;

    static {
        t2o.a(607125770);
    }

    public LaunchLoadZstdObject(String str) {
        this.type = str;
    }
}
