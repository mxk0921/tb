package com.meizu.cloud.pushsdk.e.h;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.io.InputStream;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
final class i implements d {

    /* renamed from: a  reason: collision with root package name */
    private final b f5847a;
    private final m b;
    private boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            if (!i.this.c) {
                return (int) Math.min(i.this.f5847a.c, 2147483647L);
            }
            throw new IOException(IDecisionResult.STATE_CLOSED);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            i.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (i.this.c) {
                throw new IOException(IDecisionResult.STATE_CLOSED);
            } else if (i.this.f5847a.c == 0 && i.this.b.b(i.this.f5847a, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) == -1) {
                return -1;
            } else {
                return i.this.f5847a.i() & 255;
            }
        }

        public String toString() {
            return i.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!i.this.c) {
                o.a(bArr.length, i, i2);
                if (i.this.f5847a.c == 0 && i.this.b.b(i.this.f5847a, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) == -1) {
                    return -1;
                }
                return i.this.f5847a.b(bArr, i, i2);
            }
            throw new IOException(IDecisionResult.STATE_CLOSED);
        }
    }

    public i(m mVar) {
        this(mVar, new b());
    }

    @Override // com.meizu.cloud.pushsdk.e.h.d
    public String a() throws IOException {
        this.f5847a.a(this.b);
        return this.f5847a.a();
    }

    @Override // com.meizu.cloud.pushsdk.e.h.m
    public long b(b bVar, long j) throws IOException {
        if (bVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.c) {
            b bVar2 = this.f5847a;
            if (bVar2.c == 0 && this.b.b(bVar2, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) == -1) {
                return -1L;
            }
            return this.f5847a.b(bVar, Math.min(j, this.f5847a.c));
        } else {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
    }

    @Override // com.meizu.cloud.pushsdk.e.h.m, java.io.Closeable, java.lang.AutoCloseable, com.meizu.cloud.pushsdk.e.h.l
    public void close() throws IOException {
        if (!this.c) {
            this.c = true;
            this.b.close();
            this.f5847a.e();
        }
    }

    @Override // com.meizu.cloud.pushsdk.e.h.d
    public InputStream d() {
        return new a();
    }

    public String toString() {
        return "buffer(" + this.b + f7l.BRACKET_END_STR;
    }

    public i(m mVar, b bVar) {
        if (mVar != null) {
            this.f5847a = bVar;
            this.b = mVar;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.meizu.cloud.pushsdk.e.h.d
    public byte[] b() throws IOException {
        this.f5847a.a(this.b);
        return this.f5847a.b();
    }
}
