package com.alipay.mobile.common.amnet.api.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DnsInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<DnsAddressInfo> dnsAddressInfoList;
    public String domain;
    public long ttl;

    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("DnsInfo{domain='");
        sb.append(this.domain);
        sb.append("', dnsAddressInfoList=");
        List<DnsAddressInfo> list = this.dnsAddressInfoList;
        if (list != null) {
            str = list.toString();
        } else {
            str = "is null";
        }
        sb.append(str);
        sb.append(", ttl=");
        sb.append(this.ttl);
        sb.append('}');
        return sb.toString();
    }
}
