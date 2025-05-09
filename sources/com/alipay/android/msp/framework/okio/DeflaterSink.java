package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.util.zip.Deflater;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class DeflaterSink implements Sink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BufferedSink f3644a;
    public final Deflater b;
    public boolean c;

    public DeflaterSink(Sink sink, Deflater deflater) {
        this(Okio.buffer(sink), deflater);
    }

    public final void a(boolean z) throws IOException {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        Buffer buffer = this.f3644a.buffer();
        while (true) {
            Segment writableSegment = buffer.writableSegment(1);
            if (z) {
                Deflater deflater = this.b;
                byte[] bArr = writableSegment.data;
                int i2 = writableSegment.limit;
                i = deflater.deflate(bArr, i2, 2048 - i2, 2);
            } else {
                Deflater deflater2 = this.b;
                byte[] bArr2 = writableSegment.data;
                int i3 = writableSegment.limit;
                i = deflater2.deflate(bArr2, i3, 2048 - i3);
            }
            if (i > 0) {
                writableSegment.limit += i;
                buffer.size += i;
                this.f3644a.emitCompleteSegments();
            } else if (this.b.needsInput()) {
                return;
            }
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (!this.c) {
            try {
                finishDeflate();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f3644a.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.c = true;
            if (th != null) {
                Util.sneakyRethrow(th);
            }
        }
    }

    public final void finishDeflate() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d898949f", new Object[]{this});
            return;
        }
        this.b.finish();
        a(false);
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final void flush() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
            return;
        }
        a(true);
        this.f3644a.flush();
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final Timeout timeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("21cbd5f8", new Object[]{this});
        }
        return this.f3644a.timeout();
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DeflaterSink(" + this.f3644a + f7l.BRACKET_END_STR;
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final void write(Buffer buffer, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a312ef", new Object[]{this, buffer, new Long(j)});
            return;
        }
        Util.checkOffsetAndCount(buffer.size, 0L, j);
        while (j > 0) {
            Segment segment = buffer.head;
            int min = (int) Math.min(j, segment.limit - segment.pos);
            this.b.setInput(segment.data, segment.pos, min);
            a(false);
            long j2 = min;
            buffer.size -= j2;
            int i = segment.pos + min;
            segment.pos = i;
            if (i == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            }
            j -= j2;
        }
    }

    public DeflaterSink(BufferedSink bufferedSink, Deflater deflater) {
        if (bufferedSink == null) {
            throw new IllegalArgumentException("source == null");
        } else if (deflater != null) {
            this.f3644a = bufferedSink;
            this.b = deflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }
}
