package com.taobao.falco;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10475a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "netType=" + this.f10475a + ", apn=" + this.b + ", wifiSsid=" + this.c + ", carrier=" + this.d + ", isAirplaneMode=" + this.e + ", isWifiEnabled=" + this.f + ", isWifiRestricted=" + this.g + ", isCellularRestricted=" + this.h + ", proxyType=" + this.i + ", ipStack=" + this.j + ", netQualityLevel=" + this.k;
    }

    @Override // com.taobao.falco.f.a
    public int type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 5;
    }
}
