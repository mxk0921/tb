package com.loc;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cc extends ci {

    /* renamed from: a  reason: collision with root package name */
    ByteArrayOutputStream f5624a = new ByteArrayOutputStream();

    public cc() {
    }

    @Override // com.loc.ci
    public final byte[] a(byte[] bArr) {
        byte[] byteArray = this.f5624a.toByteArray();
        try {
            this.f5624a.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.f5624a = new ByteArrayOutputStream();
        return byteArray;
    }

    @Override // com.loc.ci
    public final void b(byte[] bArr) {
        try {
            this.f5624a.write(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public cc(ci ciVar) {
        super(ciVar);
    }
}
