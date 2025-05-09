package com.loc;

import com.alibaba.ariver.remoterpc.EncodingUtils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class bm implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f5594a = Charset.forName(EncodingUtils.US_ASCII);
    private final InputStream b;
    private final Charset c;
    private byte[] d;
    private int e;
    private int f;

    public bm(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private void b() throws IOException {
        InputStream inputStream = this.b;
        byte[] bArr = this.d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.e = 0;
            this.f = read;
            return;
        }
        throw new EOFException();
    }

    public final String a() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.b) {
            try {
                if (this.d != null) {
                    if (this.e >= this.f) {
                        b();
                    }
                    for (int i3 = this.e; i3 != this.f; i3++) {
                        byte[] bArr2 = this.d;
                        if (bArr2[i3] == 10) {
                            int i4 = this.e;
                            if (i3 != i4) {
                                i2 = i3 - 1;
                                if (bArr2[i2] == 13) {
                                    String str = new String(bArr2, i4, i2 - i4, this.c.name());
                                    this.e = i3 + 1;
                                    return str;
                                }
                            }
                            i2 = i3;
                            String str2 = new String(bArr2, i4, i2 - i4, this.c.name());
                            this.e = i3 + 1;
                            return str2;
                        }
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.f - this.e) + 80) { // from class: com.loc.bm.1
                        @Override // java.io.ByteArrayOutputStream
                        public final String toString() {
                            int i5 = ((ByteArrayOutputStream) this).count;
                            if (i5 > 0 && ((ByteArrayOutputStream) this).buf[i5 - 1] == 13) {
                                i5--;
                            }
                            try {
                                return new String(((ByteArrayOutputStream) this).buf, 0, i5, bm.this.c.name());
                            } catch (UnsupportedEncodingException e) {
                                throw new AssertionError(e);
                            }
                        }
                    };
                    loop1: while (true) {
                        byte[] bArr3 = this.d;
                        int i5 = this.e;
                        byteArrayOutputStream.write(bArr3, i5, this.f - i5);
                        this.f = -1;
                        b();
                        i = this.e;
                        while (i != this.f) {
                            bArr = this.d;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                    int i6 = this.e;
                    if (i != i6) {
                        byteArrayOutputStream.write(bArr, i6, i - i6);
                    }
                    this.e = i + 1;
                    return byteArrayOutputStream.toString();
                }
                throw new IOException("LineReader is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.b) {
            try {
                if (this.d != null) {
                    this.d = null;
                    this.b.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private bm(InputStream inputStream, Charset charset, byte b) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (charset.equals(f5594a)) {
            this.b = inputStream;
            this.c = charset;
            this.d = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
