package mtopsdk.mtop.cache.domain;

import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AppConfigDo implements Serializable {
    public String appConf;
    public long appConfigVersion;

    static {
        t2o.a(589299865);
    }

    public AppConfigDo(String str, long j) {
        this.appConf = str;
        this.appConfigVersion = j;
    }
}
