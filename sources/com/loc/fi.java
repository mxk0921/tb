package com.loc;

import com.alipay.mobile.common.transport.httpdns.DnsUtil;
import com.amap.api.location.AMapLocation;

/* compiled from: Taobao */
@ba(a = "c")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fi {
    @bb(a = "a2", b = 6)

    /* renamed from: a  reason: collision with root package name */
    private String f5700a;
    @bb(a = "a3", b = 5)
    private long b;
    @bb(a = DnsUtil.DOMAIN_GROUP, b = 6)
    private String c;
    private AMapLocation d;

    public final AMapLocation a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.f5700a;
    }

    public final long d() {
        return this.b;
    }

    public final void a(long j) {
        this.b = j;
    }

    public final void b(String str) {
        this.f5700a = str;
    }

    public final void a(AMapLocation aMapLocation) {
        this.d = aMapLocation;
    }

    public final void a(String str) {
        this.c = str;
    }
}
