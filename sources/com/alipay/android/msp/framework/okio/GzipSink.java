package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class GzipSink implements Sink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BufferedSink f3647a;
    public final Deflater b;
    public final DeflaterSink c;
    public boolean d;
    public final CRC32 e = new CRC32();

    public GzipSink(Sink sink) {
        if (sink != null) {
            Deflater deflater = new Deflater(-1, true);
            this.b = deflater;
            BufferedSink buffer = Okio.buffer(sink);
            this.f3647a = buffer;
            this.c = new DeflaterSink(buffer, deflater);
            Buffer buffer2 = buffer.buffer();
            buffer2.writeShort(8075);
            buffer2.writeByte(8);
            buffer2.writeByte(0);
            buffer2.writeInt(0);
            buffer2.writeByte(0);
            buffer2.writeByte(0);
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public final void a(Buffer buffer, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("392cf2d", new Object[]{this, buffer, new Long(j)});
            return;
        }
        Segment segment = buffer.head;
        while (j > 0) {
            int min = (int) Math.min(j, segment.limit - segment.pos);
            this.e.update(segment.data, segment.pos, min);
            j -= min;
            segment = segment.next;
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (!this.d) {
            try {
                this.c.finishDeflate();
                this.f3647a.writeIntLe((int) this.e.getValue());
                this.f3647a.writeIntLe(this.b.getTotalIn());
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
                this.f3647a.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.d = true;
            if (th != null) {
                Util.sneakyRethrow(th);
            }
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final void flush() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        } else {
            this.c.flush();
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final Timeout timeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("21cbd5f8", new Object[]{this});
        }
        return this.f3647a.timeout();
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final void write(Buffer buffer, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a312ef", new Object[]{this, buffer, new Long(j)});
            return;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (i != 0) {
            a(buffer, j);
            this.c.write(buffer, j);
        }
    }
}
