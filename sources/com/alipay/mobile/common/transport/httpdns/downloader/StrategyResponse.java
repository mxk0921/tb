package com.alipay.mobile.common.transport.httpdns.downloader;

import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class StrategyResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f4116a;
    public final Map<String, HttpDns.HttpdnsIP> b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public StrategyResponse(long j, Map<String, HttpDns.HttpdnsIP> map, String str, String str2, boolean z, int i) {
        this.f4116a = j;
        this.b = map;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = i;
    }

    public String getClientIp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5fb6831", new Object[]{this});
        }
        return this.d;
    }

    public long getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15e", new Object[]{this})).longValue();
        }
        return this.f4116a;
    }

    public String getConf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66c3bb9f", new Object[]{this});
        }
        return this.c;
    }

    public Map<String, HttpDns.HttpdnsIP> getDns() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("95055daf", new Object[]{this});
        }
        return this.b;
    }

    public int getTtd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a8f028", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public boolean isOversea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b708a7c", new Object[]{this})).booleanValue();
        }
        return this.e;
    }
}
