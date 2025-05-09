package com.alipay.android.msp.framework.okio;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class InflaterSource implements Source {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BufferedSource f3649a;
    public final Inflater b;
    public int c;
    public boolean d;

    public InflaterSource(Source source, Inflater inflater) {
        this(Okio.buffer(source), inflater);
    }

    @Override // com.alipay.android.msp.framework.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (!this.d) {
            this.b.end();
            this.d = true;
            this.f3649a.close();
        }
    }

    public final void e() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
            return;
        }
        int i = this.c;
        if (i != 0) {
            int remaining = i - this.b.getRemaining();
            this.c -= remaining;
            this.f3649a.skip(remaining);
        }
    }

    public final boolean refill() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c2d2bc1", new Object[]{this})).booleanValue();
        }
        if (!this.b.needsInput()) {
            return false;
        }
        e();
        if (this.b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f3649a.exhausted()) {
            return true;
        } else {
            Segment segment = this.f3649a.buffer().head;
            int i = segment.limit;
            int i2 = segment.pos;
            int i3 = i - i2;
            this.c = i3;
            this.b.setInput(segment.data, i2, i3);
            return false;
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Source
    public final Timeout timeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("21cbd5f8", new Object[]{this});
        }
        return this.f3649a.timeout();
    }

    public InflaterSource(BufferedSource bufferedSource, Inflater inflater) {
        if (bufferedSource == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f3649a = bufferedSource;
            this.b = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Source
    public final long read(Buffer buffer, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4c0cbcc", new Object[]{this, buffer, new Long(j)})).longValue();
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (this.d) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        } else if (i == 0) {
            return 0L;
        } else {
            while (true) {
                boolean refill = refill();
                try {
                    Segment writableSegment = buffer.writableSegment(1);
                    Inflater inflater = this.b;
                    byte[] bArr = writableSegment.data;
                    int i2 = writableSegment.limit;
                    int inflate = inflater.inflate(bArr, i2, 2048 - i2);
                    if (inflate <= 0) {
                        if (this.b.finished() || this.b.needsDictionary()) {
                            break;
                        } else if (refill) {
                            throw new EOFException("source exhausted prematurely");
                        }
                    } else {
                        writableSegment.limit += inflate;
                        long j2 = inflate;
                        buffer.size += j2;
                        return j2;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            e();
            return -1L;
        }
    }
}
