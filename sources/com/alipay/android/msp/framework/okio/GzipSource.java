package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class GzipSource implements Source {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final BufferedSource b;
    public final Inflater c;
    public final InflaterSource d;

    /* renamed from: a  reason: collision with root package name */
    public int f3648a = 0;
    public final CRC32 e = new CRC32();

    public GzipSource(Source source) {
        if (source != null) {
            Inflater inflater = new Inflater(true);
            this.c = inflater;
            BufferedSource buffer = Okio.buffer(source);
            this.b = buffer;
            this.d = new InflaterSource(buffer, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public static void b(String str, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3526812", new Object[]{str, new Integer(i), new Integer(i2)});
        } else if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public final void a(Buffer buffer, long j, long j2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec78d37", new Object[]{this, buffer, new Long(j), new Long(j2)});
            return;
        }
        Segment segment = buffer.head;
        while (true) {
            int i2 = segment.limit;
            int i3 = segment.pos;
            if (j >= i2 - i3) {
                j -= i2 - i3;
                segment = segment.next;
            }
        }
        while (j2 > 0) {
            int min = (int) Math.min(segment.limit - i, j2);
            this.e.update(segment.data, (int) (segment.pos + j), min);
            j2 -= min;
            segment = segment.next;
            j = 0;
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.d.close();
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Source
    public final Timeout timeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("21cbd5f8", new Object[]{this});
        }
        return this.b.timeout();
    }

    @Override // com.alipay.android.msp.framework.okio.Source
    public final long read(Buffer buffer, long j) throws IOException {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4c0cbcc", new Object[]{this, buffer, new Long(j)})).longValue();
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (i == 0) {
            return 0L;
        } else {
            if (this.f3648a == 0) {
                this.b.require(10L);
                byte b = this.b.buffer().getByte(3L);
                boolean z = ((b >> 1) & 1) == 1;
                if (z) {
                    a(this.b.buffer(), 0L, 10L);
                }
                b("ID1ID2", 8075, this.b.readShort());
                this.b.skip(8L);
                if (((b >> 2) & 1) == 1) {
                    this.b.require(2L);
                    if (z) {
                        a(this.b.buffer(), 0L, 2L);
                    }
                    long readShortLe = this.b.buffer().readShortLe();
                    this.b.require(readShortLe);
                    if (z) {
                        j2 = readShortLe;
                        a(this.b.buffer(), 0L, readShortLe);
                    } else {
                        j2 = readShortLe;
                    }
                    this.b.skip(j2);
                }
                if (((b >> 3) & 1) == 1) {
                    long indexOf = this.b.indexOf((byte) 0);
                    if (indexOf != -1) {
                        if (z) {
                            a(this.b.buffer(), 0L, indexOf + 1);
                        }
                        this.b.skip(indexOf + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((b >> 4) & 1) == 1) {
                    long indexOf2 = this.b.indexOf((byte) 0);
                    if (indexOf2 != -1) {
                        if (z) {
                            a(this.b.buffer(), 0L, indexOf2 + 1);
                        }
                        this.b.skip(indexOf2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    b("FHCRC", this.b.readShortLe(), (short) this.e.getValue());
                    this.e.reset();
                }
                this.f3648a = 1;
            }
            if (this.f3648a == 1) {
                long j3 = buffer.size;
                long read = this.d.read(buffer, j);
                if (read != -1) {
                    a(buffer, j3, read);
                    return read;
                }
                this.f3648a = 2;
            }
            if (this.f3648a == 2) {
                b("CRC", this.b.readIntLe(), (int) this.e.getValue());
                b("ISIZE", this.b.readIntLe(), this.c.getTotalOut());
                this.f3648a = 3;
                if (!this.b.exhausted()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
    }
}
