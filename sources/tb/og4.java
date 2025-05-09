package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class og4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static og4 p = null;

    /* renamed from: a  reason: collision with root package name */
    public final String f25369a = "false";
    public final String b = ct2.COLOR_TAG_NOT_ZCACHE_RESOURCE;
    public final String c = "60";
    public final String d = "100";
    public final String e = "false";
    public final String f = "true";
    public final String g = "DEFAULT_OFF";
    public final String h = "30";
    public final String i = "60";
    public final String j = "off";
    public final String k = "off";
    public final String l = "off";
    public final String m = "off";
    public final String n = "06:00";
    public final String o = "06:00";

    static {
        t2o.a(789577837);
    }

    public static og4 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (og4) ipChange.ipc$dispatch("e76ac0a4", new Object[0]);
        }
        if (p == null) {
            p = new og4();
        }
        return p;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5987fb2", new Object[]{this});
        }
        return this.g;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f31c65bb", new Object[]{this});
        }
        return this.f;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ConfigParams [gatherSwitch=" + this.f25369a + ", gatherNormalRate=" + this.b + ", gatherDemoteRate=" + this.c + ", accuracy=" + this.d + ", channelSwitch=" + this.e + ", reportSwitch=" + this.f + ", clientSwitchStatus=" + this.g + ", timeTap=null, reportNormalRate=" + this.h + ", reportDemoteRate=" + this.i + ", no_network_navigation_switch=" + this.j + ", geo_fencing_switch=" + this.k + ", gaode_navigation_switch=" + this.l + ", location_report_switch=" + this.m + ", no_network_navigation_pull_data_time=" + this.n + ", geo_fencing_pull_data_time=" + this.o + "]";
    }
}
