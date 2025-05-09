package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Okio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f3650a = Logger.getLogger(Okio.class.getName());

    public static AsyncTimeout a(final Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AsyncTimeout) ipChange.ipc$dispatch("cb8c6999", new Object[]{socket});
        }
        return new AsyncTimeout() { // from class: com.alipay.android.msp.framework.okio.Okio.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/okio/Okio$3");
            }

            @Override // com.alipay.android.msp.framework.okio.AsyncTimeout
            public void timedOut() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c5b2319e", new Object[]{this});
                    return;
                }
                try {
                    socket.close();
                } catch (Exception e) {
                    Logger access$000 = Okio.access$000();
                    Level level = Level.WARNING;
                    access$000.log(level, "Failed to close timed out socket " + socket, (Throwable) e);
                }
            }
        };
    }

    public static /* synthetic */ Logger access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Logger) ipChange.ipc$dispatch("f026a4ce", new Object[0]);
        }
        return f3650a;
    }

    public static Sink appendingSink(File file) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sink) ipChange.ipc$dispatch("576fe859", new Object[]{file});
        }
        if (file != null) {
            return sink(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static Sink b(final OutputStream outputStream, final Timeout timeout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sink) ipChange.ipc$dispatch("a4d9beec", new Object[]{outputStream, timeout});
        }
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (timeout != null) {
            return new Sink() { // from class: com.alipay.android.msp.framework.okio.Okio.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.msp.framework.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e32ba67f", new Object[]{this});
                    } else {
                        outputStream.close();
                    }
                }

                @Override // com.alipay.android.msp.framework.okio.Sink
                public void flush() throws IOException {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dd889d8b", new Object[]{this});
                    } else {
                        outputStream.flush();
                    }
                }

                @Override // com.alipay.android.msp.framework.okio.Sink
                public Timeout timeout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Timeout) ipChange2.ipc$dispatch("21cbd5f8", new Object[]{this});
                    }
                    return Timeout.this;
                }

                public String toString() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("8126d80d", new Object[]{this});
                    }
                    return "sink(" + outputStream + f7l.BRACKET_END_STR;
                }

                @Override // com.alipay.android.msp.framework.okio.Sink
                public void write(Buffer buffer, long j) throws IOException {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("66a312ef", new Object[]{this, buffer, new Long(j)});
                        return;
                    }
                    Util.checkOffsetAndCount(buffer.size, 0L, j);
                    while (j > 0) {
                        Timeout.this.throwIfReached();
                        Segment segment = buffer.head;
                        int min = (int) Math.min(j, segment.limit - segment.pos);
                        outputStream.write(segment.data, segment.pos, min);
                        int i = segment.pos + min;
                        segment.pos = i;
                        long j2 = min;
                        j -= j2;
                        buffer.size -= j2;
                        if (i == segment.limit) {
                            buffer.head = segment.pop();
                            SegmentPool.INSTANCE.recycle(segment);
                        }
                    }
                }
            };
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static BufferedSource buffer(Source source) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSource) ipChange.ipc$dispatch("7463550", new Object[]{source});
        }
        if (source != null) {
            return new RealBufferedSource(source);
        }
        throw new IllegalArgumentException("source == null");
    }

    public static Source c(final InputStream inputStream, final Timeout timeout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Source) ipChange.ipc$dispatch("4fdcc4b5", new Object[]{inputStream, timeout});
        }
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (timeout != null) {
            return new Source() { // from class: com.alipay.android.msp.framework.okio.Okio.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.msp.framework.okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e32ba67f", new Object[]{this});
                    } else {
                        inputStream.close();
                    }
                }

                @Override // com.alipay.android.msp.framework.okio.Source
                public long read(Buffer buffer, long j) throws IOException {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("c4c0cbcc", new Object[]{this, buffer, new Long(j)})).longValue();
                    }
                    if (j >= 0) {
                        Timeout.this.throwIfReached();
                        Segment writableSegment = buffer.writableSegment(1);
                        int read = inputStream.read(writableSegment.data, writableSegment.limit, (int) Math.min(j, 2048 - writableSegment.limit));
                        if (read == -1) {
                            return -1L;
                        }
                        writableSegment.limit += read;
                        long j2 = read;
                        buffer.size += j2;
                        return j2;
                    }
                    throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
                }

                @Override // com.alipay.android.msp.framework.okio.Source
                public Timeout timeout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Timeout) ipChange2.ipc$dispatch("21cbd5f8", new Object[]{this});
                    }
                    return Timeout.this;
                }

                public String toString() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("8126d80d", new Object[]{this});
                    }
                    return "source(" + inputStream + f7l.BRACKET_END_STR;
                }
            };
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static Sink sink(OutputStream outputStream) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Sink) ipChange.ipc$dispatch("c472b8a6", new Object[]{outputStream}) : b(outputStream, new Timeout());
    }

    public static Source source(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Source) ipChange.ipc$dispatch("a1203c19", new Object[]{inputStream}) : c(inputStream, new Timeout());
    }

    public static Sink sink(Socket socket) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sink) ipChange.ipc$dispatch("ec8dd53d", new Object[]{socket});
        }
        if (socket != null) {
            AsyncTimeout a2 = a(socket);
            return a2.sink(b(socket.getOutputStream(), a2));
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static Source source(File file) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Source) ipChange.ipc$dispatch("b05304b1", new Object[]{file});
        }
        if (file != null) {
            return source(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static BufferedSink buffer(Sink sink) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BufferedSink) ipChange.ipc$dispatch("e9c7d2d0", new Object[]{sink});
        }
        if (sink != null) {
            return new RealBufferedSink(sink);
        }
        throw new IllegalArgumentException("sink == null");
    }

    public static Source source(Socket socket) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Source) ipChange.ipc$dispatch("20ef0afd", new Object[]{socket});
        }
        if (socket != null) {
            AsyncTimeout a2 = a(socket);
            return a2.source(c(socket.getInputStream(), a2));
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static Sink sink(File file) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sink) ipChange.ipc$dispatch("50c99201", new Object[]{file});
        }
        if (file != null) {
            return sink(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }
}
