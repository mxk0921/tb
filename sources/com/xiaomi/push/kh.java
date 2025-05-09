package com.xiaomi.push;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class kh extends ki {

    /* renamed from: a  reason: collision with root package name */
    private int f14998a;

    /* renamed from: a  reason: collision with other field name */
    private byte[] f1476a;
    private int b;

    @Override // com.xiaomi.push.ki
    /* renamed from: a */
    public int mo961a() {
        return this.f14998a;
    }

    @Override // com.xiaomi.push.ki
    public int b() {
        return this.b - this.f14998a;
    }

    @Override // com.xiaomi.push.ki
    /* renamed from: a */
    public int mo960a(byte[] bArr, int i, int i2) {
        int b = b();
        if (i2 > b) {
            i2 = b;
        }
        if (i2 > 0) {
            System.arraycopy(this.f1476a, this.f14998a, bArr, i, i2);
            a(i2);
        }
        return i2;
    }

    @Override // com.xiaomi.push.ki
    public void b(byte[] bArr, int i, int i2) {
        this.f1476a = bArr;
        this.f14998a = i;
        this.b = i + i2;
    }

    @Override // com.xiaomi.push.ki
    public void a(int i) {
        this.f14998a += i;
    }

    public void a(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    @Override // com.xiaomi.push.ki
    /* renamed from: a  reason: collision with other method in class */
    public void mo960a(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.xiaomi.push.ki
    /* renamed from: a  reason: collision with other method in class */
    public byte[] mo961a() {
        return this.f1476a;
    }
}
