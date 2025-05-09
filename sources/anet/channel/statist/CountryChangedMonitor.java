package anet.channel.statist;

import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = "country_changed")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CountryChangedMonitor extends StatObject {
    @Dimension
    public String newCountryCode;
    @Dimension
    public String preCountryCode;

    static {
        t2o.a(607125755);
    }

    public CountryChangedMonitor(String str, String str2) {
        this.newCountryCode = str2;
        this.preCountryCode = str;
    }
}
