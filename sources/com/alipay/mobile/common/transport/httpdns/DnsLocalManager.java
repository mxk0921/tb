package com.alipay.mobile.common.transport.httpdns;

import com.alipay.mobile.common.transport.httpdns.HttpDns;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface DnsLocalManager {
    void deleteIpByHost(String str);

    long getLastUpdateTime();

    HttpDns.HttpdnsIP queryLocalIPByHost(String str);

    void reloadDns();

    void saveLastUpdateTime();

    void storeIp2CacheAndDB(Map<String, HttpDns.HttpdnsIP> map);

    void storeIp2DB(Map<String, HttpDns.HttpdnsIP> map);

    void updateIp2CacheAndDB(Map<String, HttpDns.HttpdnsIP> map);
}
