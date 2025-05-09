package com.meizu.cloud.pushsdk.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class h<T> {

    /* renamed from: a  reason: collision with root package name */
    private T f5786a;
    private T b;

    public h(T t) {
        if (t != null) {
            this.b = t;
            return;
        }
        throw new RuntimeException("proxy must be has a default implementation");
    }

    public T b() {
        T t = this.f5786a;
        if (t != null) {
            return t;
        }
        return this.b;
    }
}
