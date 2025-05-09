package com.loc;

import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cy extends cv {
    private static cy b = new cy();

    private cy() {
        super(5120);
    }

    private static String a(String str) {
        return str == null ? "" : str;
    }

    public static cy b() {
        return b;
    }

    public final byte[] c() {
        a();
        try {
            this.f5640a.c(ei.a(this.f5640a, eh.a(), this.f5640a.a(eh.f()), this.f5640a.a(eh.c()), (byte) eh.m(), this.f5640a.a(eh.i()), this.f5640a.a(eh.h()), this.f5640a.a(a(eh.g())), this.f5640a.a(a(eh.j())), eg.a(eh.n()), this.f5640a.a(eh.l()), this.f5640a.a(eh.k()), this.f5640a.a(eh.d()), this.f5640a.a(eh.e())));
            return this.f5640a.c();
        } catch (Exception e) {
            ej.a(e);
            return null;
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, List<? extends dc> list) {
        if (list == null) {
            return null;
        }
        try {
            int size = list.size();
            if (size <= 0 || bArr == null) {
                return null;
            }
            a();
            int a2 = df.a((ga) this.f5640a, bArr);
            int[] iArr = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                dc dcVar = (dc) list.get(i2);
                iArr[i2] = dk.a(this.f5640a, (byte) dcVar.a(), dk.a(this.f5640a, dcVar.b()));
            }
            int a3 = df.a(this.f5640a, iArr);
            if (bArr2 != null) {
                i = df.b(this.f5640a, bArr2);
            }
            this.f5640a.c(df.a(this.f5640a, a2, i, a3));
            return this.f5640a.c();
        } catch (Throwable th) {
            ej.a(th);
            return null;
        }
    }
}
