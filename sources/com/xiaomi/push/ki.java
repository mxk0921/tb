package com.xiaomi.push;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class ki {
    /* renamed from: a */
    public int mo961a() {
        return 0;
    }

    /* renamed from: a */
    public abstract int mo960a(byte[] bArr, int i, int i2);

    public abstract void a(byte[] bArr, int i, int i2);

    public int b() {
        return -1;
    }

    public void a(int i) {
    }

    public int b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int a2 = mo960a(bArr, i + i3, i2 - i3);
            if (a2 > 0) {
                i3 += a2;
            } else {
                throw new kj("Cannot read. Remote side has closed. Tried to read " + i2 + " bytes, but only got " + i3 + " bytes.");
            }
        }
        return i3;
    }

    public byte[] a() {
        return null;
    }
}
