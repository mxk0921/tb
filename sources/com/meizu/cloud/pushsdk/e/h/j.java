package com.meizu.cloud.pushsdk.e.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    final byte[] f5849a;
    int b;
    int c;
    boolean d;
    final boolean e;
    j f;
    j g;

    public j() {
        this.f5849a = new byte[2048];
        this.e = true;
        this.d = false;
    }

    public j a(int i) {
        if (i <= 0 || i > this.c - this.b) {
            throw new IllegalArgumentException();
        }
        j jVar = new j(this);
        jVar.c = jVar.b + i;
        this.b += i;
        this.g.a(jVar);
        return jVar;
    }

    public j b() {
        j jVar;
        j jVar2 = this.f;
        if (jVar2 != this) {
            jVar = jVar2;
        } else {
            jVar = null;
        }
        j jVar3 = this.g;
        jVar3.f = jVar2;
        this.f.g = jVar3;
        this.f = null;
        this.g = null;
        return jVar;
    }

    public j(j jVar) {
        this(jVar.f5849a, jVar.b, jVar.c);
    }

    public j a(j jVar) {
        jVar.g = this;
        jVar.f = this.f;
        this.f.g = jVar;
        this.f = jVar;
        return jVar;
    }

    public j(byte[] bArr, int i, int i2) {
        this.f5849a = bArr;
        this.b = i;
        this.c = i2;
        this.e = false;
        this.d = true;
    }

    public void a() {
        j jVar = this.g;
        if (jVar == this) {
            throw new IllegalStateException();
        } else if (jVar.e) {
            int i = this.c - this.b;
            if (i <= (2048 - jVar.c) + (jVar.d ? 0 : jVar.b)) {
                a(jVar, i);
                b();
                k.a(this);
            }
        }
    }

    public void a(j jVar, int i) {
        if (jVar.e) {
            int i2 = jVar.c;
            int i3 = i2 + i;
            if (i3 > 2048) {
                if (!jVar.d) {
                    int i4 = jVar.b;
                    if (i3 - i4 <= 2048) {
                        byte[] bArr = jVar.f5849a;
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        jVar.c -= jVar.b;
                        jVar.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f5849a, this.b, jVar.f5849a, jVar.c, i);
            jVar.c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
