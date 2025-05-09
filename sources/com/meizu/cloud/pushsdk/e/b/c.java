package com.meizu.cloud.pushsdk.e.b;

import com.meizu.cloud.pushsdk.e.c.a;
import com.meizu.cloud.pushsdk.e.d.k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f5811a;
    private final a b;
    private k c;

    public c(a aVar) {
        this.f5811a = null;
        this.b = aVar;
    }

    public static <T> c<T> a(a aVar) {
        return new c<>(aVar);
    }

    public T b() {
        return this.f5811a;
    }

    public boolean c() {
        if (this.b == null) {
            return true;
        }
        return false;
    }

    public c(T t) {
        this.f5811a = t;
        this.b = null;
    }

    public static <T> c<T> a(T t) {
        return new c<>(t);
    }

    public a a() {
        return this.b;
    }

    public void a(k kVar) {
        this.c = kVar;
    }
}
