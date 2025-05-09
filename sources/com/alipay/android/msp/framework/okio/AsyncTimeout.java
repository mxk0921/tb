package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InterruptedIOException;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AsyncTimeout extends Timeout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static AsyncTimeout g;
    public boolean d;
    public AsyncTimeout e;
    public long f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class Watchdog extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        public static /* synthetic */ Object ipc$super(Watchdog watchdog, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/okio/AsyncTimeout$Watchdog");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (true) {
                try {
                    AsyncTimeout access$000 = AsyncTimeout.access$000();
                    if (access$000 != null) {
                        access$000.timedOut();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public static synchronized AsyncTimeout a() throws InterruptedException {
        synchronized (AsyncTimeout.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AsyncTimeout) ipChange.ipc$dispatch("729e20d", new Object[0]);
            }
            AsyncTimeout asyncTimeout = g.e;
            if (asyncTimeout == null) {
                AsyncTimeout.class.wait();
                return null;
            }
            long nanoTime = asyncTimeout.f - System.nanoTime();
            if (nanoTime > 0) {
                long j = nanoTime / 1000000;
                Long.signum(j);
                AsyncTimeout.class.wait(j, (int) (nanoTime - (1000000 * j)));
                return null;
            }
            g.e = asyncTimeout.e;
            asyncTimeout.e = null;
            return asyncTimeout;
        }
    }

    public static /* synthetic */ AsyncTimeout access$000() throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AsyncTimeout) ipChange.ipc$dispatch("2fbe3ee9", new Object[0]);
        }
        return a();
    }

    public static synchronized void b(AsyncTimeout asyncTimeout, long j, boolean z) {
        AsyncTimeout asyncTimeout2;
        synchronized (AsyncTimeout.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f54fa22", new Object[]{asyncTimeout, new Long(j), new Boolean(z)});
                return;
            }
            if (g == null) {
                g = new AsyncTimeout();
                new Watchdog().start();
            }
            long nanoTime = System.nanoTime();
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i != 0 && z) {
                asyncTimeout.f = Math.min(j, asyncTimeout.deadlineNanoTime() - nanoTime) + nanoTime;
            } else if (i != 0) {
                asyncTimeout.f = j + nanoTime;
            } else if (z) {
                asyncTimeout.f = asyncTimeout.deadlineNanoTime();
            } else {
                throw new AssertionError();
            }
            long j2 = asyncTimeout.f - nanoTime;
            AsyncTimeout asyncTimeout3 = g;
            while (true) {
                asyncTimeout2 = asyncTimeout3.e;
                if (asyncTimeout2 == null || j2 < asyncTimeout2.f - nanoTime) {
                    break;
                }
                asyncTimeout3 = asyncTimeout2;
            }
            asyncTimeout.e = asyncTimeout2;
            asyncTimeout3.e = asyncTimeout;
            if (asyncTimeout3 == g) {
                AsyncTimeout.class.notify();
            }
        }
    }

    public static synchronized boolean c(AsyncTimeout asyncTimeout) {
        synchronized (AsyncTimeout.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("68462216", new Object[]{asyncTimeout})).booleanValue();
            }
            AsyncTimeout asyncTimeout2 = g;
            while (asyncTimeout2 != null) {
                AsyncTimeout asyncTimeout3 = asyncTimeout2.e;
                if (asyncTimeout3 == asyncTimeout) {
                    asyncTimeout2.e = asyncTimeout.e;
                    asyncTimeout.e = null;
                    return false;
                }
                asyncTimeout2 = asyncTimeout3;
            }
            return true;
        }
    }

    public static /* synthetic */ Object ipc$super(AsyncTimeout asyncTimeout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/okio/AsyncTimeout");
    }

    public final void enter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc95f5f", new Object[]{this});
        } else if (!this.d) {
            long timeoutNanos = timeoutNanos();
            boolean hasDeadline = hasDeadline();
            if (timeoutNanos != 0 || hasDeadline) {
                this.d = true;
                b(this, timeoutNanos, hasDeadline);
            }
        } else {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
    }

    public final boolean exit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81677ea9", new Object[]{this})).booleanValue();
        }
        if (!this.d) {
            return false;
        }
        this.d = false;
        return c(this);
    }

    public final Sink sink(final Sink sink) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sink) ipChange.ipc$dispatch("5991e93c", new Object[]{this, sink});
        }
        return new Sink() { // from class: com.alipay.android.msp.framework.okio.AsyncTimeout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.alipay.android.msp.framework.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                boolean z = false;
                int i = 1;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    Object[] objArr = new Object[i];
                    objArr[z ? 1 : 0] = this;
                    ipChange2.ipc$dispatch("e32ba67f", objArr);
                    return;
                }
                AsyncTimeout.this.enter();
                try {
                    try {
                        sink.close();
                    } catch (IOException e) {
                        throw AsyncTimeout.this.exit(e);
                    }
                } finally {
                    AsyncTimeout.this.exit(z);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.alipay.android.msp.framework.okio.Sink
            public void flush() throws IOException {
                boolean z = false;
                int i = 1;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    Object[] objArr = new Object[i];
                    objArr[z ? 1 : 0] = this;
                    ipChange2.ipc$dispatch("dd889d8b", objArr);
                    return;
                }
                AsyncTimeout.this.enter();
                try {
                    try {
                        sink.flush();
                    } catch (IOException e) {
                        throw AsyncTimeout.this.exit(e);
                    }
                } finally {
                    AsyncTimeout.this.exit(z);
                }
            }

            @Override // com.alipay.android.msp.framework.okio.Sink
            public Timeout timeout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Timeout) ipChange2.ipc$dispatch("21cbd5f8", new Object[]{this});
                }
                return AsyncTimeout.this;
            }

            public String toString() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return "AsyncTimeout.sink(" + sink + f7l.BRACKET_END_STR;
            }

            @Override // com.alipay.android.msp.framework.okio.Sink
            public void write(Buffer buffer, long j) throws IOException {
                boolean z = true;
                boolean z2 = false;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    Long l = new Long(j);
                    Object[] objArr = new Object[3];
                    objArr[z2 ? 1 : 0] = this;
                    objArr[z ? 1 : 0] = buffer;
                    objArr[2] = l;
                    ipChange2.ipc$dispatch("66a312ef", objArr);
                    return;
                }
                AsyncTimeout.this.enter();
                try {
                    try {
                        sink.write(buffer, j);
                    } catch (IOException e) {
                        throw AsyncTimeout.this.exit(e);
                    }
                } finally {
                    AsyncTimeout.this.exit(z2);
                }
            }
        };
    }

    public final Source source(final Source source) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Source) ipChange.ipc$dispatch("e4d1fef4", new Object[]{this, source});
        }
        return new Source() { // from class: com.alipay.android.msp.framework.okio.AsyncTimeout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.alipay.android.msp.framework.okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                boolean z = false;
                int i = 1;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    Object[] objArr = new Object[i];
                    objArr[z ? 1 : 0] = this;
                    ipChange2.ipc$dispatch("e32ba67f", objArr);
                    return;
                }
                try {
                    try {
                        source.close();
                    } catch (IOException e) {
                        throw AsyncTimeout.this.exit(e);
                    }
                } finally {
                    AsyncTimeout.this.exit(z);
                }
            }

            @Override // com.alipay.android.msp.framework.okio.Source
            public long read(Buffer buffer, long j) throws IOException {
                boolean z = true;
                boolean z2 = false;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    Long l = new Long(j);
                    Object[] objArr = new Object[3];
                    objArr[z2 ? 1 : 0] = this;
                    objArr[z ? 1 : 0] = buffer;
                    objArr[2] = l;
                    return ((Number) ipChange2.ipc$dispatch("c4c0cbcc", objArr)).longValue();
                }
                AsyncTimeout.this.enter();
                try {
                    try {
                        return source.read(buffer, j);
                    } catch (IOException e) {
                        throw AsyncTimeout.this.exit(e);
                    }
                } finally {
                    AsyncTimeout.this.exit(z2);
                }
            }

            @Override // com.alipay.android.msp.framework.okio.Source
            public Timeout timeout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Timeout) ipChange2.ipc$dispatch("21cbd5f8", new Object[]{this});
                }
                return AsyncTimeout.this;
            }

            public String toString() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return "AsyncTimeout.source(" + source + f7l.BRACKET_END_STR;
            }
        };
    }

    public void timedOut() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5b2319e", new Object[]{this});
        }
    }

    public final void exit(boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8908cf", new Object[]{this, new Boolean(z)});
        } else if (exit() && z) {
            throw new InterruptedIOException("timeout");
        }
    }

    public final IOException exit(IOException iOException) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOException) ipChange.ipc$dispatch("3e4c213", new Object[]{this, iOException});
        }
        if (!exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        interruptedIOException.initCause(iOException);
        return interruptedIOException;
    }
}
