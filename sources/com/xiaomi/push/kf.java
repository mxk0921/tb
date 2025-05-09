package com.xiaomi.push;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kf extends ki {

    /* renamed from: a  reason: collision with root package name */
    protected InputStream f14996a;

    /* renamed from: a  reason: collision with other field name */
    protected OutputStream f1474a;

    public kf() {
        this.f14996a = null;
        this.f1474a = null;
    }

    @Override // com.xiaomi.push.ki
    /* renamed from: a */
    public int mo960a(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.f14996a;
        if (inputStream != null) {
            try {
                int read = inputStream.read(bArr, i, i2);
                if (read >= 0) {
                    return read;
                }
                throw new kj(4);
            } catch (IOException e) {
                throw new kj(0, e);
            }
        } else {
            throw new kj(1, "Cannot read from null inputStream");
        }
    }

    public kf(OutputStream outputStream) {
        this.f14996a = null;
        this.f1474a = outputStream;
    }

    @Override // com.xiaomi.push.ki
    /* renamed from: a  reason: collision with other method in class */
    public void mo960a(byte[] bArr, int i, int i2) {
        OutputStream outputStream = this.f1474a;
        if (outputStream != null) {
            try {
                outputStream.write(bArr, i, i2);
            } catch (IOException e) {
                throw new kj(0, e);
            }
        } else {
            throw new kj(1, "Cannot write to null outputStream");
        }
    }
}
