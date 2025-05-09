package com.huawei.hms.push.utils.ha;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PushAnalyticsCenter {

    /* renamed from: a  reason: collision with root package name */
    private PushBaseAnalytics f5463a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static PushAnalyticsCenter f5464a = new PushAnalyticsCenter();
    }

    public static PushAnalyticsCenter getInstance() {
        return a.f5464a;
    }

    public PushBaseAnalytics getPushAnalytics() {
        return this.f5463a;
    }

    public void register(PushBaseAnalytics pushBaseAnalytics) {
        this.f5463a = pushBaseAnalytics;
    }
}
