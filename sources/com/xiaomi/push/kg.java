package com.xiaomi.push;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kg extends ki {

    /* renamed from: a  reason: collision with root package name */
    private int f14997a;

    /* renamed from: a  reason: collision with other field name */
    private jq f1475a;

    public kg(int i) {
        this.f1475a = new jq(i);
    }

    @Override // com.xiaomi.push.ki
    /* renamed from: a */
    public int mo960a(byte[] bArr, int i, int i2) {
        byte[] a2 = this.f1475a.m934a();
        if (i2 > this.f1475a.a() - this.f14997a) {
            i2 = this.f1475a.a() - this.f14997a;
        }
        if (i2 > 0) {
            System.arraycopy(a2, this.f14997a, bArr, i, i2);
            this.f14997a += i2;
        }
        return i2;
    }

    public int a_() {
        return this.f1475a.size();
    }

    @Override // com.xiaomi.push.ki
    /* renamed from: a  reason: collision with other method in class */
    public void mo960a(byte[] bArr, int i, int i2) {
        this.f1475a.write(bArr, i, i2);
    }
}
