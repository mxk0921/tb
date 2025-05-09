package com.xiaomi.push;

import com.xiaomi.push.ju;
import java.io.ByteArrayOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jt {

    /* renamed from: a  reason: collision with root package name */
    private jy f14985a;

    /* renamed from: a  reason: collision with other field name */
    private final kf f1461a;

    /* renamed from: a  reason: collision with other field name */
    private final ByteArrayOutputStream f1462a;

    public jt() {
        this(new ju.a());
    }

    public byte[] a(jn jnVar) {
        this.f1462a.reset();
        jnVar.b(this.f14985a);
        return this.f1462a.toByteArray();
    }

    public jt(ka kaVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f1462a = byteArrayOutputStream;
        kf kfVar = new kf(byteArrayOutputStream);
        this.f1461a = kfVar;
        this.f14985a = kaVar.a(kfVar);
    }
}
