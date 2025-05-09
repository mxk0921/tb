package com.alipay.android.msp.framework.okio;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class RealBufferedSource implements BufferedSource {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3652a;
    public final Buffer buffer;
    public final Source source;

    public RealBufferedSource(Source source, Buffer buffer) {
        if (source != null) {
            this.buffer = buffer;
            this.source = source;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public static /* synthetic */ boolean access$000(RealBufferedSource realBufferedSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b74f6c72", new Object[]{realBufferedSource})).booleanValue();
        }
        return realBufferedSource.f3652a;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final Buffer buffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("c823d43e", new Object[]{this});
        }
        return this.buffer;
    }

    @Override // com.alipay.android.msp.framework.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (!this.f3652a) {
            this.f3652a = true;
            this.source.close();
            this.buffer.clear();
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final boolean exhausted() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9647754", new Object[]{this})).booleanValue();
        }
        if (this.f3652a) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        } else if (!this.buffer.exhausted() || this.source.read(this.buffer, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) != -1) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final long indexOf(byte b) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c314a460", new Object[]{this, new Byte(b)})).longValue();
        }
        if (!this.f3652a) {
            long j = 0;
            while (true) {
                long indexOf = this.buffer.indexOf(b, j);
                if (indexOf != -1) {
                    return indexOf;
                }
                Buffer buffer = this.buffer;
                long j2 = buffer.size;
                if (this.source.read(buffer, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) == -1) {
                    return -1L;
                }
                j = j2;
            }
        } else {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final InputStream inputStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("fc12abf4", new Object[]{this});
        }
        return new InputStream() { // from class: com.alipay.android.msp.framework.okio.RealBufferedSource.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/okio/RealBufferedSource$1");
            }

            @Override // java.io.InputStream
            public int available() throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("6f9282c3", new Object[]{this})).intValue();
                }
                if (!RealBufferedSource.access$000(RealBufferedSource.this)) {
                    return (int) Math.min(RealBufferedSource.this.buffer.size, 2147483647L);
                }
                throw new IOException(IDecisionResult.STATE_CLOSED);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e32ba67f", new Object[]{this});
                } else {
                    RealBufferedSource.this.close();
                }
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("cc382310", new Object[]{this})).intValue();
                }
                if (!RealBufferedSource.access$000(RealBufferedSource.this)) {
                    RealBufferedSource realBufferedSource = RealBufferedSource.this;
                    Buffer buffer = realBufferedSource.buffer;
                    if (buffer.size == 0 && realBufferedSource.source.read(buffer, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) == -1) {
                        return -1;
                    }
                    return RealBufferedSource.this.buffer.readByte() & 255;
                }
                throw new IOException(IDecisionResult.STATE_CLOSED);
            }

            public String toString() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return RealBufferedSource.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
                }
                if (!RealBufferedSource.access$000(RealBufferedSource.this)) {
                    Util.checkOffsetAndCount(bArr.length, i, i2);
                    RealBufferedSource realBufferedSource = RealBufferedSource.this;
                    Buffer buffer = realBufferedSource.buffer;
                    if (buffer.size == 0 && realBufferedSource.source.read(buffer, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) == -1) {
                        return -1;
                    }
                    return RealBufferedSource.this.buffer.read(bArr, i, i2);
                }
                throw new IOException(IDecisionResult.STATE_CLOSED);
            }
        };
    }

    @Override // com.alipay.android.msp.framework.okio.Source
    public final long read(Buffer buffer, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4c0cbcc", new Object[]{this, buffer, new Long(j)})).longValue();
        }
        if (buffer == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (!this.f3652a) {
            Buffer buffer2 = this.buffer;
            if (buffer2.size == 0 && this.source.read(buffer2, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) == -1) {
                return -1L;
            }
            return this.buffer.read(buffer, Math.min(j, this.buffer.size));
        } else {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final long readAll(Sink sink) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac2b92c2", new Object[]{this, sink})).longValue();
        }
        if (sink != null) {
            long j = 0;
            while (this.source.read(this.buffer, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) != -1) {
                long completeSegmentByteCount = this.buffer.completeSegmentByteCount();
                if (completeSegmentByteCount > 0) {
                    j += completeSegmentByteCount;
                    sink.write(this.buffer, completeSegmentByteCount);
                }
            }
            if (this.buffer.size() <= 0) {
                return j;
            }
            long size = j + this.buffer.size();
            Buffer buffer = this.buffer;
            sink.write(buffer, buffer.size());
            return size;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final byte readByte() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a5be931", new Object[]{this})).byteValue();
        }
        require(1L);
        return this.buffer.readByte();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final byte[] readByteArray() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4b8264db", new Object[]{this});
        }
        this.buffer.writeAll(this.source);
        return this.buffer.readByteArray();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final ByteString readByteString() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteString) ipChange.ipc$dispatch("626aa116", new Object[]{this});
        }
        this.buffer.writeAll(this.source);
        return this.buffer.readByteString();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final void readFully(Buffer buffer, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b6d4da", new Object[]{this, buffer, new Long(j)});
            return;
        }
        require(j);
        this.buffer.readFully(buffer, j);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final int readInt() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4888f673", new Object[]{this})).intValue();
        }
        require(4L);
        return this.buffer.readInt();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final int readIntLe() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80b3f14c", new Object[]{this})).intValue();
        }
        require(4L);
        return this.buffer.readIntLe();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final long readLong() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e0874ad", new Object[]{this})).longValue();
        }
        require(8L);
        return this.buffer.readLong();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final long readLongLe() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44cc546", new Object[]{this})).longValue();
        }
        require(8L);
        return this.buffer.readLongLe();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final short readShort() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15459a0a", new Object[]{this})).shortValue();
        }
        require(2L);
        return this.buffer.readShort();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final short readShortLe() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10d5e5a3", new Object[]{this})).shortValue();
        }
        require(2L);
        return this.buffer.readShortLe();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readString(Charset charset) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1db4104", new Object[]{this, charset});
        }
        if (charset != null) {
            this.buffer.writeAll(this.source);
            return this.buffer.readString(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readUtf8() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1b4db32", new Object[]{this});
        }
        this.buffer.writeAll(this.source);
        return this.buffer.readUtf8();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readUtf8Line() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f2f071e", new Object[]{this});
        }
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return this.buffer.readUtf8Line(indexOf);
        }
        long j = this.buffer.size;
        if (j != 0) {
            return readUtf8(j);
        }
        return null;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readUtf8LineStrict() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbe26815", new Object[]{this});
        }
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return this.buffer.readUtf8Line(indexOf);
        }
        throw new EOFException();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final void require(long j) throws IOException {
        Buffer buffer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bde98d8", new Object[]{this, new Long(j)});
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (!this.f3652a) {
            do {
                buffer = this.buffer;
                if (buffer.size >= j) {
                    return;
                }
            } while (this.source.read(buffer, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) != -1);
            throw new EOFException();
        } else {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final void skip(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0434fe", new Object[]{this, new Long(j)});
        } else if (!this.f3652a) {
            while (j > 0) {
                Buffer buffer = this.buffer;
                if (buffer.size == 0 && this.source.read(buffer, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.buffer.size());
                this.buffer.skip(min);
                j -= min;
            }
        } else {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Source
    public final Timeout timeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("21cbd5f8", new Object[]{this});
        }
        return this.source.timeout();
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "buffer(" + this.source + f7l.BRACKET_END_STR;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final byte[] readByteArray(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("24d87e5b", new Object[]{this, new Long(j)});
        }
        require(j);
        return this.buffer.readByteArray(j);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final ByteString readByteString(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteString) ipChange.ipc$dispatch("70b5b7e", new Object[]{this, new Long(j)});
        }
        require(j);
        return this.buffer.readByteString(j);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readUtf8(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be074a0a", new Object[]{this, new Long(j)});
        }
        require(j);
        return this.buffer.readUtf8(j);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readString(long j, Charset charset) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6da9ec1c", new Object[]{this, new Long(j), charset});
        }
        require(j);
        if (charset != null) {
            return this.buffer.readString(j, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public RealBufferedSource(Source source) {
        this(source, new Buffer());
    }
}
