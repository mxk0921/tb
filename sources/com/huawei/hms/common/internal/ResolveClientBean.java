package com.huawei.hms.common.internal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ResolveClientBean {

    /* renamed from: a  reason: collision with root package name */
    private final int f5322a;
    private final AnyClient b;
    private int c;

    public ResolveClientBean(AnyClient anyClient, int i) {
        this.b = anyClient;
        this.f5322a = Objects.hashCode(anyClient);
        this.c = i;
    }

    public void clientReconnect() {
        this.b.connect(this.c, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ResolveClientBean)) {
            return false;
        }
        return this.b.equals(((ResolveClientBean) obj).b);
    }

    public AnyClient getClient() {
        return this.b;
    }

    public int hashCode() {
        return this.f5322a;
    }
}
