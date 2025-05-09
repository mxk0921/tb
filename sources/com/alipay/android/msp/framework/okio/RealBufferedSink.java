package com.alipay.android.msp.framework.okio;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class RealBufferedSink implements BufferedSink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3651a;
    public final Buffer buffer;
    public final Sink sink;

    public RealBufferedSink(Sink sink, Buffer buffer) {
        if (sink != null) {
            this.buffer = buffer;
            this.sink = sink;
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public static /* synthetic */ boolean access$000(RealBufferedSink realBufferedSink) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ded373a", new Object[]{realBufferedSink})).booleanValue();
        }
        return realBufferedSink.f3651a;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink, com.alipay.android.msp.framework.okio.BufferedSource
    public final Buffer buffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("c823d43e", new Object[]{this});
        }
        return this.buffer;
    }

    @Override // com.alipay.android.msp.framework.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (!this.f3651a) {
            try {
                Buffer buffer = this.buffer;
                long j = buffer.size;
                if (j > 0) {
                    this.sink.write(buffer, j);
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.sink.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f3651a = true;
            if (th != null) {
                Util.sneakyRethrow(th);
            }
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final BufferedSink emitCompleteSegments() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("7e5ac940", new Object[]{this});
        }
        if (!this.f3651a) {
            long completeSegmentByteCount = this.buffer.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                this.sink.write(this.buffer, completeSegmentByteCount);
            }
            return this;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final void flush() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        } else if (!this.f3651a) {
            Buffer buffer = this.buffer;
            long j = buffer.size;
            if (j > 0) {
                this.sink.write(buffer, j);
            }
            this.sink.flush();
        } else {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final OutputStream outputStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OutputStream) ipChange.ipc$dispatch("6de40e60", new Object[]{this});
        }
        return new OutputStream() { // from class: com.alipay.android.msp.framework.okio.RealBufferedSink.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/okio/RealBufferedSink$1");
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e32ba67f", new Object[]{this});
                } else {
                    RealBufferedSink.this.close();
                }
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dd889d8b", new Object[]{this});
                } else if (!RealBufferedSink.access$000(RealBufferedSink.this)) {
                    RealBufferedSink.this.flush();
                }
            }

            public String toString() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return RealBufferedSink.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i) throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
                } else if (!RealBufferedSink.access$000(RealBufferedSink.this)) {
                    RealBufferedSink.this.buffer.writeByte((int) ((byte) i));
                    RealBufferedSink.this.emitCompleteSegments();
                } else {
                    throw new IOException(IDecisionResult.STATE_CLOSED);
                }
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
                } else if (!RealBufferedSink.access$000(RealBufferedSink.this)) {
                    RealBufferedSink.this.buffer.write(bArr, i, i2);
                    RealBufferedSink.this.emitCompleteSegments();
                } else {
                    throw new IOException(IDecisionResult.STATE_CLOSED);
                }
            }
        };
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final Timeout timeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("21cbd5f8", new Object[]{this});
        }
        return this.sink.timeout();
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "buffer(" + this.sink + f7l.BRACKET_END_STR;
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final void write(Buffer buffer, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a312ef", new Object[]{this, buffer, new Long(j)});
        } else if (!this.f3651a) {
            this.buffer.write(buffer, j);
            emitCompleteSegments();
        } else {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final long writeAll(Source source) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1d21f51", new Object[]{this, source})).longValue();
        }
        if (source != null) {
            long j = 0;
            while (true) {
                long read = source.read(this.buffer, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX);
                if (read == -1) {
                    return j;
                }
                j += read;
                emitCompleteSegments();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final BufferedSink writeByte(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("3779003e", new Object[]{this, new Integer(i)});
        }
        if (!this.f3651a) {
            this.buffer.writeByte(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final BufferedSink writeInt(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("402af347", new Object[]{this, new Integer(i)});
        }
        if (!this.f3651a) {
            this.buffer.writeInt(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final BufferedSink writeIntLe(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("b01db9e0", new Object[]{this, new Integer(i)});
        }
        if (!this.f3651a) {
            this.buffer.writeIntLe(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final BufferedSink writeLong(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("e439f851", new Object[]{this, new Long(j)});
        }
        if (!this.f3651a) {
            this.buffer.writeLong(j);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final BufferedSink writeLongLe(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("a564d02a", new Object[]{this, new Long(j)});
        }
        if (!this.f3651a) {
            this.buffer.writeLongLe(j);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final BufferedSink writeShort(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("9ff03094", new Object[]{this, new Integer(i)});
        }
        if (!this.f3651a) {
            this.buffer.writeShort(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final BufferedSink writeShortLe(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("3388d7ed", new Object[]{this, new Integer(i)});
        }
        if (!this.f3651a) {
            this.buffer.writeShortLe(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final BufferedSink writeString(String str, Charset charset) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("5181c9c4", new Object[]{this, str, charset});
        }
        if (!this.f3651a) {
            this.buffer.writeString(str, charset);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final BufferedSink writeUtf8(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("ce7fb072", new Object[]{this, str});
        }
        if (!this.f3651a) {
            this.buffer.writeUtf8(str);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    public RealBufferedSink(Sink sink) {
        this(sink, new Buffer());
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final BufferedSink write(ByteString byteString) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("6a1708b7", new Object[]{this, byteString});
        }
        if (!this.f3651a) {
            this.buffer.write(byteString);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final BufferedSink write(byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("db36fb46", new Object[]{this, bArr});
        }
        if (!this.f3651a) {
            this.buffer.write(bArr);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final BufferedSink write(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("b4d29e26", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        }
        if (!this.f3651a) {
            this.buffer.write(bArr, i, i2);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }
}
