package anet.channel.statist;

import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "cookieMonitor")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CookieMonitorStat extends StatObject {
    @Dimension
    public String cookieName;
    @Dimension
    public String cookieText;
    @Dimension
    public int missType;
    @Dimension
    public String setCookie;
    @Dimension
    public String url;

    static {
        t2o.a(607125753);
    }

    public CookieMonitorStat(String str) {
        this.url = str;
    }
}
