package com.alipay.mobile.common.transport.httpdns;

import com.alipay.mobile.common.transport.httpdns.HttpDns;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface DnsService {
    void feedback(String str, String str2, boolean z, int i);

    HttpDns.HttpdnsIP getIpInfoByHost(String str);

    void refreshAll();

    void refreshIPListOnly();

    void setErrorByHost(String str);
}
