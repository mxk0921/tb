package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.tiv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Buffer implements BufferedSink, BufferedSource, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Segment head;
    public long size;

    @Override // com.alipay.android.msp.framework.okio.BufferedSink, com.alipay.android.msp.framework.okio.BufferedSource
    public final Buffer buffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("c823d43e", new Object[]{this});
        }
        return this;
    }

    public final void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            skip(this.size);
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        }
    }

    public final long completeSegmentByteCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e26c848", new Object[]{this})).longValue();
        }
        long j = this.size;
        if (j == 0) {
            return 0L;
        }
        Segment segment = this.head.prev;
        int i = segment.limit;
        if (i < 2048) {
            return j - (i - segment.pos);
        }
        return j;
    }

    public final Buffer copyTo(OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Buffer) ipChange.ipc$dispatch("d947103c", new Object[]{this, outputStream}) : copyTo(outputStream, 0L, this.size);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final Buffer emitCompleteSegments() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Buffer) ipChange.ipc$dispatch("31404412", new Object[]{this}) : this;
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) obj;
        long j = this.size;
        if (j != buffer.size) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        Segment segment = this.head;
        Segment segment2 = buffer.head;
        int i = segment.pos;
        int i2 = segment2.pos;
        while (j2 < this.size) {
            long min = Math.min(segment.limit - i, segment2.limit - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (segment.data[i] != segment2.data[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == segment.limit) {
                segment = segment.next;
                i = segment.pos;
            }
            if (i2 == segment2.limit) {
                segment2 = segment2.next;
                i2 = segment2.pos;
            }
            j2 += min;
        }
        return true;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final boolean exhausted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9647754", new Object[]{this})).booleanValue();
        }
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final void flush() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        }
    }

    public final byte getByte(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8255f84b", new Object[]{this, new Long(j)})).byteValue();
        }
        Util.checkOffsetAndCount(this.size, j, 1L);
        Segment segment = this.head;
        while (true) {
            int i = segment.limit;
            int i2 = segment.pos;
            long j2 = i - i2;
            if (j < j2) {
                return segment.data[i2 + ((int) j)];
            }
            j -= j2;
            segment = segment.next;
        }
    }

    public final int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.limit;
            for (int i3 = segment.pos; i3 < i2; i3++) {
                i = (i * 31) + segment.data[i3];
            }
            segment = segment.next;
        } while (segment != this.head);
        return i;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final long indexOf(byte b) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c314a460", new Object[]{this, new Byte(b)})).longValue() : indexOf(b, 0L);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final InputStream inputStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("fc12abf4", new Object[]{this});
        }
        return new InputStream() { // from class: com.alipay.android.msp.framework.okio.Buffer.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/okio/Buffer$2");
            }

            @Override // java.io.InputStream
            public int available() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("6f9282c3", new Object[]{this})).intValue();
                }
                return (int) Math.min(Buffer.this.size, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e32ba67f", new Object[]{this});
                }
            }

            @Override // java.io.InputStream
            public int read() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("cc382310", new Object[]{this})).intValue();
                }
                Buffer buffer = Buffer.this;
                if (buffer.size > 0) {
                    return buffer.readByte() & 255;
                }
                return -1;
            }

            public String toString() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return Buffer.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue() : Buffer.this.read(bArr, i, i2);
            }
        };
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final OutputStream outputStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OutputStream) ipChange.ipc$dispatch("6de40e60", new Object[]{this});
        }
        return new OutputStream() { // from class: com.alipay.android.msp.framework.okio.Buffer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/okio/Buffer$1");
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e32ba67f", new Object[]{this});
                }
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dd889d8b", new Object[]{this});
                }
            }

            public String toString() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
                } else {
                    Buffer.this.writeByte((int) ((byte) i));
                }
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
                } else {
                    Buffer.this.write(bArr, i, i2);
                }
            }
        };
    }

    public final int read(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i2, segment.limit - segment.pos);
        System.arraycopy(segment.data, segment.pos, bArr, i, min);
        int i3 = segment.pos + min;
        segment.pos = i3;
        this.size -= min;
        if (i3 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.INSTANCE.recycle(segment);
        }
        return min;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final long readAll(Sink sink) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac2b92c2", new Object[]{this, sink})).longValue();
        }
        long size = size();
        sink.write(this, size);
        return size;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final byte[] readByteArray() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("4b8264db", new Object[]{this}) : readByteArray(this.size);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final ByteString readByteString() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteString) ipChange.ipc$dispatch("626aa116", new Object[]{this}) : new ByteString(readByteArray());
    }

    public final Buffer readFrom(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("174c2719", new Object[]{this, inputStream});
        }
        a(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final void readFully(Buffer buffer, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b6d4da", new Object[]{this, buffer, new Long(j)});
        } else {
            buffer.write(this, j);
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final int readIntLe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80b3f14c", new Object[]{this})).intValue();
        }
        return Util.reverseBytesInt(readInt());
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final long readLongLe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44cc546", new Object[]{this})).longValue();
        }
        return Util.reverseBytesLong(readLong());
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final short readShortLe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10d5e5a3", new Object[]{this})).shortValue();
        }
        return Util.reverseBytesShort(readShort());
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readString(Charset charset) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a1db4104", new Object[]{this, charset}) : readString(this.size, charset);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readUtf8() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a1b4db32", new Object[]{this}) : readString(this.size, Util.UTF_8);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readUtf8Line() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f2f071e", new Object[]{this});
        }
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return readUtf8Line(indexOf);
        }
        long j = this.size;
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
            return readUtf8Line(indexOf);
        }
        throw new EOFException();
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final void require(long j) throws EOFException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bde98d8", new Object[]{this, new Long(j)});
        } else if (this.size < j) {
            throw new EOFException();
        }
    }

    public final List<Integer> segmentSizes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1db0b61", new Object[]{this});
        }
        if (this.head == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Segment segment = this.head;
        arrayList.add(Integer.valueOf(segment.limit - segment.pos));
        Segment segment2 = this.head;
        while (true) {
            segment2 = segment2.next;
            if (segment2 == this.head) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(segment2.limit - segment2.pos));
        }
    }

    public final long size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfc", new Object[]{this})).longValue();
        }
        return this.size;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final void skip(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0434fe", new Object[]{this, new Long(j)});
            return;
        }
        Util.checkOffsetAndCount(this.size, 0L, j);
        this.size -= j;
        while (j > 0) {
            Segment segment = this.head;
            int min = (int) Math.min(j, segment.limit - segment.pos);
            j -= min;
            Segment segment2 = this.head;
            int i = segment2.pos + min;
            segment2.pos = i;
            if (i == segment2.limit) {
                this.head = segment2.pop();
                SegmentPool.INSTANCE.recycle(segment2);
            }
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final Timeout timeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("21cbd5f8", new Object[]{this});
        }
        return Timeout.NONE;
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        long j = this.size;
        if (j == 0) {
            return "Buffer[size=0]";
        }
        if (j <= 16) {
            ByteString readByteString = clone().readByteString(this.size);
            long j2 = this.size;
            String hex = readByteString.hex();
            return "Buffer[size=" + j2 + " data=" + hex + "]";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            Segment segment = this.head;
            byte[] bArr = segment.data;
            int i = segment.pos;
            instance.update(bArr, i, segment.limit - i);
            Segment segment2 = this.head;
            while (true) {
                segment2 = segment2.next;
                if (segment2 != this.head) {
                    byte[] bArr2 = segment2.data;
                    int i2 = segment2.pos;
                    instance.update(bArr2, i2, segment2.limit - i2);
                } else {
                    long j3 = this.size;
                    String hex2 = ByteString.of(instance.digest()).hex();
                    return "Buffer[size=" + j3 + " md5=" + hex2 + "]";
                }
            }
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public final Segment writableSegment(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Segment) ipChange.ipc$dispatch("471d2307", new Object[]{this, new Integer(i)});
        }
        if (i <= 0 || i > 2048) {
            throw new IllegalArgumentException();
        }
        Segment segment = this.head;
        if (segment == null) {
            Segment take = SegmentPool.INSTANCE.take();
            this.head = take;
            take.prev = take;
            take.next = take;
            return take;
        }
        Segment segment2 = segment.prev;
        if (segment2.limit + i > 2048) {
            return segment2.push(SegmentPool.INSTANCE.take());
        }
        return segment2;
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
                long read = source.read(this, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX);
                if (read == -1) {
                    return j;
                }
                j += read;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public final Buffer writeTo(OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Buffer) ipChange.ipc$dispatch("b6578f12", new Object[]{this, outputStream}) : writeTo(outputStream, this.size);
    }

    public final void a(InputStream inputStream, long j, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc8a4fb", new Object[]{this, inputStream, new Long(j), new Boolean(z)});
        } else if (inputStream != null) {
            while (true) {
                if (j > 0 || z) {
                    Segment writableSegment = writableSegment(1);
                    int read = inputStream.read(writableSegment.data, writableSegment.limit, (int) Math.min(j, 2048 - writableSegment.limit));
                    if (read != -1) {
                        writableSegment.limit += read;
                        long j2 = read;
                        this.size += j2;
                        j -= j2;
                    } else if (!z) {
                        throw new EOFException();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("in == null");
        }
    }

    public final Buffer clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("26307cc1", new Object[]{this});
        }
        Buffer buffer = new Buffer();
        if (this.size == 0) {
            return buffer;
        }
        Segment segment = this.head;
        byte[] bArr = segment.data;
        int i = segment.pos;
        buffer.write(bArr, i, segment.limit - i);
        Segment segment2 = this.head;
        while (true) {
            segment2 = segment2.next;
            if (segment2 == this.head) {
                return buffer;
            }
            byte[] bArr2 = segment2.data;
            int i2 = segment2.pos;
            buffer.write(bArr2, i2, segment2.limit - i2);
        }
    }

    public final Buffer copyTo(OutputStream outputStream, long j, long j2) throws IOException {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("691bdfc", new Object[]{this, outputStream, new Long(j), new Long(j2)});
        }
        if (outputStream != null) {
            Util.checkOffsetAndCount(this.size, j, j2);
            if (j2 == 0) {
                return this;
            }
            Segment segment = this.head;
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
                outputStream.write(segment.data, (int) (segment.pos + j), min);
                j2 -= min;
                segment = segment.next;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final long indexOf(byte b, long j) {
        long j2 = j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f805fcc", new Object[]{this, new Byte(b), new Long(j2)})).longValue();
        }
        if (j2 >= 0) {
            Segment segment = this.head;
            if (segment == null) {
                return -1L;
            }
            long j3 = 0;
            while (true) {
                int i = segment.limit;
                int i2 = segment.pos;
                long j4 = i - i2;
                if (j2 >= j4) {
                    j2 -= j4;
                } else {
                    byte[] bArr = segment.data;
                    long j5 = i;
                    for (long j6 = i2 + j2; j6 < j5; j6++) {
                        if (bArr[(int) j6] == b) {
                            return (j3 + j6) - segment.pos;
                        }
                    }
                    j2 = 0;
                }
                j3 += j4;
                segment = segment.next;
                if (segment == this.head) {
                    return -1L;
                }
            }
        } else {
            throw new IllegalArgumentException("fromIndex < 0");
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final byte readByte() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a5be931", new Object[]{this})).byteValue();
        }
        long j = this.size;
        if (j != 0) {
            Segment segment = this.head;
            int i = segment.pos;
            int i2 = segment.limit;
            int i3 = 1 + i;
            byte b = segment.data[i];
            this.size = j - 1;
            if (i3 == i2) {
                this.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final byte[] readByteArray(long j) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("24d87e5b", new Object[]{this, new Long(j)});
        }
        Util.checkOffsetAndCount(this.size, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            while (true) {
                long j2 = i;
                if (j2 < j) {
                    Segment segment = this.head;
                    int min = (int) Math.min(j - j2, segment.limit - segment.pos);
                    Segment segment2 = this.head;
                    System.arraycopy(segment2.data, segment2.pos, bArr, i, min);
                    i += min;
                    Segment segment3 = this.head;
                    int i2 = segment3.pos + min;
                    segment3.pos = i2;
                    if (i2 == segment3.limit) {
                        this.head = segment3.pop();
                        SegmentPool.INSTANCE.recycle(segment3);
                    }
                } else {
                    this.size -= j;
                    return bArr;
                }
            }
        } else {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final ByteString readByteString(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteString) ipChange.ipc$dispatch("70b5b7e", new Object[]{this, new Long(j)}) : new ByteString(readByteArray(j));
    }

    public final Buffer readFrom(InputStream inputStream, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("1d4f2a6d", new Object[]{this, inputStream, new Long(j)});
        }
        if (j >= 0) {
            a(inputStream, j, false);
            return this;
        }
        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final int readInt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4888f673", new Object[]{this})).intValue();
        }
        long j = this.size;
        if (j >= 4) {
            Segment segment = this.head;
            int i = segment.pos;
            int i2 = segment.limit;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = segment.data;
            int i3 = ((bArr[1 + i] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i4 = i + 3;
            int i5 = i + 4;
            int i6 = i3 | ((bArr[i + 2] & 255) << 8) | (bArr[i4] & 255);
            this.size = j - 4;
            if (i5 == i2) {
                this.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i5;
            }
            return i6;
        }
        throw new IllegalStateException("size < 4: " + this.size);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final short readShort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15459a0a", new Object[]{this})).shortValue();
        }
        long j = this.size;
        if (j >= 2) {
            Segment segment = this.head;
            int i = segment.pos;
            int i2 = segment.limit;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = segment.data;
            int i3 = 1 + i;
            int i4 = i + 2;
            int i5 = (bArr[i3] & 255) | ((bArr[i] & 255) << 8);
            this.size = j - 2;
            if (i4 == i2) {
                this.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i4;
            }
            return (short) i5;
        }
        throw new IllegalStateException("size < 2: " + this.size);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readString(long j, Charset charset) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6da9ec1c", new Object[]{this, new Long(j), charset});
        }
        Util.checkOffsetAndCount(this.size, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        } else if (j == 0) {
            return "";
        } else {
            Segment segment = this.head;
            int i = segment.pos;
            if (i + j > segment.limit) {
                return new String(readByteArray(j), charset);
            }
            String str = new String(segment.data, i, (int) j, charset);
            int i2 = (int) (segment.pos + j);
            segment.pos = i2;
            this.size -= j;
            if (i2 == segment.limit) {
                this.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            }
            return str;
        }
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final String readUtf8(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("be074a0a", new Object[]{this, new Long(j)}) : readString(j, Util.UTF_8);
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final Buffer writeByte(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("cf1b1190", new Object[]{this, new Integer(i)});
        }
        Segment writableSegment = writableSegment(1);
        byte[] bArr = writableSegment.data;
        int i2 = writableSegment.limit;
        writableSegment.limit = 1 + i2;
        bArr[i2] = (byte) i;
        this.size++;
        return this;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final Buffer writeInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("74de3f59", new Object[]{this, new Integer(i)});
        }
        Segment writableSegment = writableSegment(4);
        byte[] bArr = writableSegment.data;
        int i2 = writableSegment.limit;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[1 + i2] = (byte) ((i >>> 16) & 255);
        bArr[2 + i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        writableSegment.limit = i2 + 4;
        this.size += 4;
        return this;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final Buffer writeIntLe(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Buffer) ipChange.ipc$dispatch("e9ac2cb2", new Object[]{this, new Integer(i)}) : writeInt(Util.reverseBytesInt(i));
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final Buffer writeLong(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("fdb053e3", new Object[]{this, new Long(j)});
        }
        Segment writableSegment = writableSegment(8);
        byte[] bArr = writableSegment.data;
        int i = writableSegment.limit;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[1 + i] = (byte) ((j >>> 48) & 255);
        bArr[2 + i] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        writableSegment.limit = i + 8;
        this.size += 8;
        return this;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final Buffer writeLongLe(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Buffer) ipChange.ipc$dispatch("ce6c427c", new Object[]{this, new Long(j)}) : writeLong(Util.reverseBytesLong(j));
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final Buffer writeShort(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("eb7aba66", new Object[]{this, new Integer(i)});
        }
        Segment writableSegment = writableSegment(2);
        byte[] bArr = writableSegment.data;
        int i2 = writableSegment.limit;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[1 + i2] = (byte) (i & 255);
        writableSegment.limit = i2 + 2;
        this.size += 2;
        return this;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final Buffer writeShortLe(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Buffer) ipChange.ipc$dispatch("2b16187f", new Object[]{this, new Integer(i)}) : writeShort((int) Util.reverseBytesShort((short) i));
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final Buffer writeString(String str, Charset charset) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("2bc2f796", new Object[]{this, str, charset});
        }
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (charset != null) {
            byte[] bytes = str.getBytes(charset);
            return write(bytes, 0, bytes.length);
        } else {
            throw new IllegalArgumentException("charset == null");
        }
    }

    public final Buffer writeTo(OutputStream outputStream, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("5fb0c194", new Object[]{this, outputStream, new Long(j)});
        }
        if (outputStream != null) {
            Util.checkOffsetAndCount(this.size, 0L, j);
            Segment segment = this.head;
            while (j > 0) {
                int min = (int) Math.min(j, segment.limit - segment.pos);
                outputStream.write(segment.data, segment.pos, min);
                int i = segment.pos + min;
                segment.pos = i;
                long j2 = min;
                this.size -= j2;
                j -= j2;
                if (i == segment.limit) {
                    Segment pop = segment.pop();
                    this.head = pop;
                    SegmentPool.INSTANCE.recycle(segment);
                    segment = pop;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final Buffer writeUtf8(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("1c26f8c4", new Object[]{this, str});
        }
        if (str != null) {
            return writeString(str, Util.UTF_8);
        }
        throw new IllegalArgumentException("string == null");
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSource
    public final long readLong() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e0874ad", new Object[]{this})).longValue();
        }
        long j = this.size;
        if (j >= 8) {
            Segment segment = this.head;
            int i = segment.pos;
            int i2 = segment.limit;
            if (i2 - i < 8) {
                return ((readInt() & tiv.INT_MASK) << 32) | (tiv.INT_MASK & readInt());
            }
            byte[] bArr = segment.data;
            long j2 = ((bArr[1 + i] & 255) << 48) | ((bArr[i] & 255) << 56) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24);
            int i3 = i + 7;
            int i4 = i + 8;
            long j3 = j2 | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8) | (bArr[i3] & 255);
            this.size = j - 8;
            if (i4 == i2) {
                this.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            } else {
                segment.pos = i4;
            }
            return j3;
        }
        throw new IllegalStateException("size < 8: " + this.size);
    }

    public final String readUtf8Line(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfd29b9e", new Object[]{this, new Long(j)});
        }
        if (j > 0) {
            long j2 = j - 1;
            if (getByte(j2) == 13) {
                String readUtf8 = readUtf8(j2);
                skip(2L);
                return readUtf8;
            }
        }
        String readUtf82 = readUtf8(j);
        skip(1L);
        return readUtf82;
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final Buffer write(ByteString byteString) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("312328c9", new Object[]{this, byteString});
        }
        if (byteString != null) {
            byte[] bArr = byteString.data;
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final Buffer write(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("ab93f298", new Object[]{this, bArr});
        }
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.alipay.android.msp.framework.okio.BufferedSink
    public final Buffer write(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("3fdb3d78", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        }
        if (bArr != null) {
            long j = i2;
            Util.checkOffsetAndCount(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                Segment writableSegment = writableSegment(1);
                int min = Math.min(i3 - i, 2048 - writableSegment.limit);
                System.arraycopy(bArr, i, writableSegment.data, writableSegment.limit, min);
                i += min;
                writableSegment.limit += min;
            }
            this.size += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.alipay.android.msp.framework.okio.Source
    public final long read(Buffer buffer, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4c0cbcc", new Object[]{this, buffer, new Long(j)})).longValue();
        }
        if (buffer == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.size;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            buffer.write(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final void write(Buffer buffer, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a312ef", new Object[]{this, buffer, new Long(j)});
        } else if (buffer == null) {
            throw new IllegalArgumentException("source == null");
        } else if (buffer != this) {
            Util.checkOffsetAndCount(buffer.size, 0L, j);
            while (j > 0) {
                Segment segment = buffer.head;
                if (j < segment.limit - segment.pos) {
                    Segment segment2 = this.head;
                    Segment segment3 = segment2 != null ? segment2.prev : null;
                    if (segment3 == null || (segment3.limit - segment3.pos) + j > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) {
                        buffer.head = segment.split((int) j);
                    } else {
                        segment.writeTo(segment3, (int) j);
                        buffer.size -= j;
                        this.size += j;
                        return;
                    }
                }
                Segment segment4 = buffer.head;
                long j2 = segment4.limit - segment4.pos;
                buffer.head = segment4.pop();
                Segment segment5 = this.head;
                if (segment5 == null) {
                    this.head = segment4;
                    segment4.prev = segment4;
                    segment4.next = segment4;
                } else {
                    segment5.prev.push(segment4).compact();
                }
                buffer.size -= j2;
                this.size += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }
}
