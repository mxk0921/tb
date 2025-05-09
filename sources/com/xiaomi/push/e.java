package com.xiaomi.push;

import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class e {
    /* renamed from: a */
    public abstract int mo666a();

    public abstract e a(b bVar);

    public e a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public abstract void a(c cVar);

    /* renamed from: b */
    public abstract int mo668b();

    public e a(byte[] bArr, int i, int i2) {
        try {
            b a2 = b.a(bArr, i, i2);
            a(a2);
            a2.m496a(0);
            return this;
        } catch (d e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m600a(byte[] bArr, int i, int i2) {
        try {
            c a2 = c.a(bArr, i, i2);
            a(a2);
            a2.b();
        } catch (IOException unused) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
    }

    public boolean a(b bVar, int i) {
        return bVar.m498a(i);
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m601a() {
        int b = mo668b();
        byte[] bArr = new byte[b];
        m600a(bArr, 0, b);
        return bArr;
    }
}
