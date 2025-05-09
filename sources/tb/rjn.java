package tb;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class rjn implements BufferedSource {

    /* renamed from: a  reason: collision with root package name */
    public final okio.a f27424a = new okio.a();
    public final y9q b;
    public boolean c;

    public rjn(y9q y9qVar) {
        if (y9qVar != null) {
            this.b = y9qVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // okio.BufferedSource
    public long S(c0q c0qVar) throws IOException {
        okio.a aVar;
        if (c0qVar != null) {
            long j = 0;
            while (true) {
                y9q y9qVar = this.b;
                aVar = this.f27424a;
                if (y9qVar.X(aVar, 8192L) == -1) {
                    break;
                }
                long w = aVar.w();
                if (w > 0) {
                    j += w;
                    c0qVar.y0(aVar, w);
                }
            }
            if (aVar.f0() <= 0) {
                return j;
            }
            long f0 = j + aVar.f0();
            c0qVar.y0(aVar, aVar.f0());
            return f0;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // tb.y9q
    public long X(okio.a aVar, long j) throws IOException {
        if (aVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.c) {
            okio.a aVar2 = this.f27424a;
            if (aVar2.b == 0 && this.b.X(aVar2, 8192L) == -1) {
                return -1L;
            }
            return aVar2.X(aVar, Math.min(j, aVar2.b));
        } else {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
    }

    public long a(ByteString byteString, long j) throws IOException {
        if (!this.c) {
            while (true) {
                okio.a aVar = this.f27424a;
                long F = aVar.F(byteString, j);
                if (F != -1) {
                    return F;
                }
                long j2 = aVar.b;
                if (this.b.X(aVar, 8192L) == -1) {
                    return -1L;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
    }

    @Override // okio.BufferedSource
    public okio.a buffer() {
        return this.f27424a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        if (!this.c) {
            this.c = true;
            this.b.close();
            this.f27424a.e();
        }
    }

    @Override // okio.BufferedSource
    public boolean exhausted() throws IOException {
        if (!this.c) {
            okio.a aVar = this.f27424a;
            if (!aVar.exhausted() || this.b.X(aVar, 8192L) != -1) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // okio.BufferedSource
    public long i(ByteString byteString) throws IOException {
        return a(byteString, 0L);
    }

    public InputStream inputStream() {
        return new a();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    @Override // okio.BufferedSource
    public BufferedSource peek() {
        return kok.a(new cwl(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        okio.a aVar = this.f27424a;
        if (aVar.b == 0 && this.b.X(aVar, 8192L) == -1) {
            return -1;
        }
        return aVar.read(byteBuffer);
    }

    @Override // okio.BufferedSource
    public byte readByte() throws IOException {
        require(1L);
        return this.f27424a.readByte();
    }

    @Override // okio.BufferedSource
    public ByteString readByteString(long j) throws IOException {
        require(j);
        return this.f27424a.readByteString(j);
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws IOException {
        require(4L);
        return this.f27424a.readIntLe();
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws IOException {
        require(8L);
        return this.f27424a.readLongLe();
    }

    @Override // okio.BufferedSource
    public String readString(long j, Charset charset) throws IOException {
        require(j);
        if (charset != null) {
            return this.f27424a.readString(j, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // okio.BufferedSource
    public boolean request(long j) throws IOException {
        okio.a aVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.c) {
            do {
                aVar = this.f27424a;
                if (aVar.b >= j) {
                    return true;
                }
            } while (this.b.X(aVar, 8192L) != -1);
            return false;
        } else {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
    }

    @Override // okio.BufferedSource
    public void require(long j) throws IOException {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int s0(a8l a8lVar) throws IOException {
        okio.a aVar;
        if (!this.c) {
            do {
                aVar = this.f27424a;
                int c0 = aVar.c0(a8lVar, true);
                if (c0 == -1) {
                    return -1;
                }
                if (c0 != -2) {
                    aVar.skip(a8lVar.f15597a[c0].size());
                    return c0;
                }
            } while (this.b.X(aVar, 8192L) != -1);
            return -1;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // okio.BufferedSource
    public void skip(long j) throws IOException {
        if (!this.c) {
            while (j > 0) {
                okio.a aVar = this.f27424a;
                if (aVar.b == 0 && this.b.X(aVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, aVar.f0());
                aVar.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    public String toString() {
        return "buffer(" + this.b + f7l.BRACKET_END_STR;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            rjn rjnVar = rjn.this;
            if (!rjnVar.c) {
                return (int) Math.min(rjnVar.f27424a.b, 2147483647L);
            }
            throw new IOException(IDecisionResult.STATE_CLOSED);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            rjn.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            rjn rjnVar = rjn.this;
            if (!rjnVar.c) {
                okio.a aVar = rjnVar.f27424a;
                if (aVar.b == 0 && rjnVar.b.X(aVar, 8192L) == -1) {
                    return -1;
                }
                return rjnVar.f27424a.readByte() & 255;
            }
            throw new IOException(IDecisionResult.STATE_CLOSED);
        }

        public String toString() {
            return rjn.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            rjn rjnVar = rjn.this;
            if (!rjnVar.c) {
                fwv.b(bArr.length, i, i2);
                okio.a aVar = rjnVar.f27424a;
                if (aVar.b == 0 && rjnVar.b.X(aVar, 8192L) == -1) {
                    return -1;
                }
                return rjnVar.f27424a.read(bArr, i, i2);
            }
            throw new IOException(IDecisionResult.STATE_CLOSED);
        }
    }
}
