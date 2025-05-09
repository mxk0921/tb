package com.huawei.hms.aaid.plugin;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ProxyCenter {
    private PushProxy proxy;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static ProxyCenter f5233a = new ProxyCenter();
    }

    private static ProxyCenter getInstance() {
        return a.f5233a;
    }

    public static PushProxy getProxy() {
        return getInstance().proxy;
    }

    public static void register(PushProxy pushProxy) {
        getInstance().proxy = pushProxy;
    }
}
