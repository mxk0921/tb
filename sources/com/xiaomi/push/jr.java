package com.xiaomi.push;

import com.xiaomi.push.ju;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jr {

    /* renamed from: a  reason: collision with root package name */
    private final jy f14984a;

    /* renamed from: a  reason: collision with other field name */
    private final kh f1460a;

    public jr() {
        this(new ju.a());
    }

    public void a(jn jnVar, byte[] bArr) {
        try {
            this.f1460a.a(bArr);
            jnVar.a(this.f14984a);
        } finally {
            this.f14984a.k();
        }
    }

    public jr(ka kaVar) {
        kh khVar = new kh();
        this.f1460a = khVar;
        this.f14984a = kaVar.a(khVar);
    }
}
