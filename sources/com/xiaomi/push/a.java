package com.xiaomi.push;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14746a = new a(new byte[0]);

    /* renamed from: a  reason: collision with other field name */
    private volatile int f715a = 0;

    /* renamed from: a  reason: collision with other field name */
    private final byte[] f716a;

    private a(byte[] bArr) {
        this.f716a = bArr;
    }

    public int a() {
        return this.f716a.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        byte[] bArr = this.f716a;
        int length = bArr.length;
        byte[] bArr2 = ((a) obj).f716a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f715a;
        if (i == 0) {
            byte[] bArr = this.f716a;
            int length = bArr.length;
            for (byte b : bArr) {
                length = (length * 31) + b;
            }
            if (length == 0) {
                i = 1;
            } else {
                i = length;
            }
            this.f715a = i;
        }
        return i;
    }

    public static a a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static a a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new a(bArr2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m480a() {
        byte[] bArr = this.f716a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
